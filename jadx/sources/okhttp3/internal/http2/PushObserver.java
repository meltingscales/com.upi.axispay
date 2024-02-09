package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import myunmn.C0059ao;
import okio.BufferedSource;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface PushObserver {
    public static final Companion Companion = new Companion(null);
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = null;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
                yl0.e(bufferedSource, C0059ao.a(4437));
                bufferedSource.skip(i2);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i, List<Header> list, boolean z) {
                yl0.e(list, C0059ao.a(4438));
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i, List<Header> list) {
                yl0.e(list, C0059ao.a(4439));
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int i, ErrorCode errorCode) {
                yl0.e(errorCode, C0059ao.a(4440));
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    boolean onData(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException;

    boolean onHeaders(int i, List<Header> list, boolean z);

    boolean onRequest(int i, List<Header> list);

    void onReset(int i, ErrorCode errorCode);
}
