import 'dart:async';

import 'package:flutter/services.dart';

class FlutterPjsip {
  static const MethodChannel _channel = const MethodChannel('flutter_pjsip');
  static bool inited = false;
  static bool registerd = false;
  static bool holding = false;

  final StreamController<Map<dynamic, dynamic>> _sipStateController =
      StreamController<Map<dynamic, dynamic>>.broadcast();

  Stream<Map<dynamic, dynamic>> get onSipStateChanged =>
      _sipStateController.stream;

  static final pjsip = FlutterPjsip();

  factory FlutterPjsip() => _getInstance();

  static FlutterPjsip get instance => _getInstance();
  static final FlutterPjsip _instance = FlutterPjsip._internal();

  static FlutterPjsip _getInstance() {
    return _instance;
  }

  FlutterPjsip._internal() {
    _channel.setMethodCallHandler((MethodCall call) async {
      try {
        _doHandlePlatformCall(call);
      } catch (exception) {
        print('Unexpected error: $exception');
      }
    });
  }

  static Future<void> _doHandlePlatformCall(MethodCall call) async {
    final Map<dynamic, dynamic> callArgs = call.arguments as Map;
    //    final remoteUri = callArgs['remote_uri'];
    switch (call.method) {
      case 'method_call_state_changed':
        pjsip._sipStateController.add(callArgs);
        break;

      default:
        print('Unknown method ${call.method} ');
    }
  }

  Future<bool> pjsipInit() async {
    if (!inited) {
      inited = true;
      return await _channel.invokeMethod('method_pjsip_init');
    }
    return inited;
  }

  ///pjsip登录
  Future<bool> pjsipLogin({
    required String username,
    required String password,
    required String ip,
    required String port,
  }) async {
    ip = ip.replaceAll(" ", "");
    Map<String, String> map = {
      "username": username,
      "password": password,
      "ip": ip,
      "port": port,
    };
    if (registerd)
      return registerd;
    else {
      return registerd = await _channel.invokeMethod("method_pjsip_login", map);
    }
  }

  ///pjsip拨打电话
  Future<bool> pjsipCall({
    required String username,
    required String ip,
    required String port,
  }) async {
    Map<String, String> map = {"username": username, "ip": ip, "port": port};
    return await _channel.invokeMethod("method_pjsip_call", map);
  }

  Future<bool> pjsipHold() async {
    holding = true;
    return await _channel.invokeMethod("method_pjsip_hold_call");
  }

  Future<bool> pjsipReinvite() async {
    return await _channel.invokeMethod("method_pjsip_reinvite_call");
  }

  ///pjsip登出
  Future<bool> pjsipLogout() async {
    return await _channel.invokeMethod('method_pjsip_logout');
  }

  ///pjsip销毁
  Future<bool> pjsipDeinit() async {
    return await _channel.invokeMethod('method_pjsip_deinit');
  }

  ///pjsip接听
  Future<bool> pjsipReceive() async {
    return await _channel.invokeMethod('method_pjsip_receive');
  }

  ///pjsip挂断&&拒接
  Future<bool> pjsipRefuse() async {
    return await _channel.invokeMethod('method_pjsip_refuse');
  }

  ///pjsip免提
  Future<bool> pjsipHandsFree() async {
    return await _channel.invokeMethod('method_pjsip_hands_free');
  }

  ///pjsip静音
  Future<bool> pjsipMute() async {
    return await _channel.invokeMethod('method_pjsip_mute');
  }

  ///关闭全部StreamController
  Future<void> dispose() async {
    List<Future> futures = [];
    if (!_sipStateController.isClosed) futures.add(_sipStateController.close());
    await Future.wait(futures);
  }
}
