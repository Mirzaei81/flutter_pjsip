package com.jvtd.flutter_pjsip.utils;

import android.os.Handler;
import android.os.Looper;

import io.flutter.plugin.common.MethodChannel;

public class MethodResultWrapper implements MethodChannel.Result {
    private MethodChannel.Result mResult;
    private Handler handler;

    public MethodResultWrapper(MethodChannel.Result result) {
        mResult = result;
        handler = new Handler(Looper.getMainLooper());
    }

    @Override
    public void success(final Object result) {
        handler.post(
                new Runnable() {
                    @Override
                    public void run() {
                        mResult.success(result);
                    }
                });
    }

    @Override
    public void error(
            final String errorCode, final String errorMessage, final Object errorDetails) {
        handler.post(
                () -> mResult.error(errorCode, errorMessage, errorDetails));
    }

    @Override
    public void notImplemented() {
        handler.post(
                () -> mResult.notImplemented());
    }
}
