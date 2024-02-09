package okhttp3;

import okio.ByteString;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface WebSocket {

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i, String str);

    long queueSize();

    Request request();

    boolean send(String str);

    boolean send(ByteString byteString);
}
