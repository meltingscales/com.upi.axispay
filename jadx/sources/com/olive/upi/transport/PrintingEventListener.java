package com.olive.upi.transport;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import myunmn.C0059ao;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class PrintingEventListener extends EventListener {
    public long callStartNanos;

    private void printEvent(String str) {
        long nanoTime = System.nanoTime();
        if (str.equals(C0059ao.a(9103))) {
            this.callStartNanos = nanoTime;
        }
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        printEvent(C0059ao.a(9104));
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
        printEvent(C0059ao.a(9105));
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        super.callStart(call);
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        printEvent(C0059ao.a(9106));
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        printEvent(C0059ao.a(9107));
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        printEvent(C0059ao.a(9108));
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        printEvent(C0059ao.a(9109));
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        printEvent(C0059ao.a(9110));
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        printEvent(C0059ao.a(9111) + call.toString() + C0059ao.a(9112) + str + C0059ao.a(9113) + list);
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
        printEvent(C0059ao.a(9114) + str + C0059ao.a(9115) + call.toString());
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j) {
        printEvent(C0059ao.a(9116));
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        printEvent(C0059ao.a(9117));
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        printEvent(C0059ao.a(9118));
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        printEvent(C0059ao.a(9119));
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j) {
        printEvent(C0059ao.a(9120));
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        printEvent(C0059ao.a(9121));
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        printEvent(C0059ao.a(9122));
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        printEvent(C0059ao.a(9123));
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        printEvent(C0059ao.a(9124));
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        printEvent(C0059ao.a(9125));
    }
}
