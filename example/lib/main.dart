import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter_pjsip/flutter_pjsip.dart';
import 'package:fluttertoast/fluttertoast.dart';

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  String _calltateText = '';
  late FlutterPjsip _pjsip;

  @override
  void initState() {
    super.initState();
    initSipPlugin();
  }

  void initSipPlugin() {
    _pjsip = FlutterPjsip.instance;
    _pjsip.onSipStateChanged.listen((map) {
      final state = map['call_state'];
      // final remoteUri = map['remote_uri'];
      print('State: $map');
      switch (state) {
        case "CALLING":
          print('****** Calling ******');
          break;

        case "INCOMING":
          break;

        case "EARLY":
          break;

        case "CONNECTING":
          break;

        case "CONFIRMED":
          break;

        case "DISCONNECTED":
          break;

        default:
          break;
      }

      setState(() {
        this._calltateText = state;
      });
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Plugin example app'),
        ),
        body: Column(
          children: <Widget>[
            ElevatedButton(
              child: Text('sipInit'),
              onPressed: () => _sipInit(),
            ),
            ElevatedButton(
              child: Text('_sipLogin'),
              onPressed: () => _sipLogin(),
            ),
            ElevatedButton(
              child: Text('_sipCall'),
              onPressed: () => _sipCall(),
            ),
            ElevatedButton(
              child: Text('_sipLogout'),
              onPressed: () => _sipLogout(),
            ),
            ElevatedButton(
              child: Text('_sipDeinit'),
              onPressed: () => _sipDeinit(),
            ),
            ElevatedButton(
              child: Text('_sipReceive'),
              onPressed: () => _sipReceive(),
            ),
            ElevatedButton(
              child: Text('_sipRefuse'),
              onPressed: () => _sipRefuse(),
            ),
            ElevatedButton(
              child: Text('_sipHandsFree'),
              onPressed: () => _sipHandsFree(),
            ),
            ElevatedButton(
              child: Text('_sipMute'),
              onPressed: () => _sipMute(),
            ),
            ElevatedButton(
              child: Text('_sipDispose'),
              onPressed: () => _sipDispose(),
            ),
            Text('CallState：$_calltateText'),
          ],
        ),
      ),
    );
  }

  Future<void> _sipInit() async {
    bool initSuccess = await _pjsip.pjsipInit();
    showToast('init', initSuccess);
  }

  Future<void> _sipLogin() async {
    bool loginSuccess = await _pjsip.pjsipLogin(
        username: '601', password: '6016o1', ip: '192.168.5.150', port: '5060');
    print(loginSuccess);
    showToast('login was success?', loginSuccess);
  }

  Future<void> _sipCall() async {
    bool callSuccess = await _pjsip.pjsipCall(
        username: '9127865164', ip: '192.168.5.150', port: '5060');
    showToast('calling', callSuccess);
  }

  Future<void> _sipLogout() async {
    bool logoutSuccess = await _pjsip.pjsipLogout();
    showToast('loggingout', logoutSuccess);
  }

  Future<void> _sipDeinit() async {
    bool initSuccess = await _pjsip.pjsipDeinit();
    showToast('deiniting', initSuccess);
  }

  Future<void> _sipReceive() async {
    bool receiveSuccess = await _pjsip.pjsipReceive();
    showToast('Receive', receiveSuccess);
  }

  Future<void> _sipRefuse() async {
    bool refuseSuccess = await _pjsip.pjsipRefuse();
    showToast('拒接/挂断', refuseSuccess);
  }

  Future<void> _sipHandsFree() async {
    bool handsFreeSuccess = await _pjsip.pjsipHandsFree();
    showToast('免提状态更改', handsFreeSuccess);
  }

  Future<void> _sipMute() async {
    bool muteSuccess = await _pjsip.pjsipMute();
    showToast('静音状态更改', muteSuccess);
  }

  Future<void> _sipDispose() async {
    await _pjsip.dispose();
    showToast('通道销毁', true);
  }

  void showToast(String method, bool success) {
    String successText = success ? 'Succesfull' : 'failed';
    Fluttertoast.showToast(msg: '$method $successText');
  }
}
