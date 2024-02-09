package okhttp3;

import myunmn.C0059ao;
import okio.ByteString;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i, String str) {
        yl0.e(webSocket, C0059ao.a(9430));
        yl0.e(str, C0059ao.a(9431));
    }

    public void onClosing(WebSocket webSocket, int i, String str) {
        yl0.e(webSocket, C0059ao.a(9432));
        yl0.e(str, C0059ao.a(9433));
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        yl0.e(webSocket, C0059ao.a(9434));
        yl0.e(th, C0059ao.a(9435));
    }

    public void onMessage(WebSocket webSocket, String str) {
        yl0.e(webSocket, C0059ao.a(9436));
        yl0.e(str, C0059ao.a(9437));
    }

    public void onMessage(WebSocket webSocket, ByteString byteString) {
        yl0.e(webSocket, C0059ao.a(9438));
        yl0.e(byteString, C0059ao.a(9439));
    }

    public void onOpen(WebSocket webSocket, Response response) {
        yl0.e(webSocket, C0059ao.a(9440));
        yl0.e(response, C0059ao.a(9441));
    }
}
