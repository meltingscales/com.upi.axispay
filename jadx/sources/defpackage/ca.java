package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ca  reason: default package */
/* loaded from: classes.dex */
public final class ca {

    /* compiled from: AxisPay */
    /* renamed from: ca$a */
    /* loaded from: classes.dex */
    public static class a implements Executor {
        public final Handler a;

        public a(Handler handler) {
            db.e(handler);
            this.a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Handler handler = this.a;
            db.e(runnable);
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.a + C0059ao.a(5360));
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
