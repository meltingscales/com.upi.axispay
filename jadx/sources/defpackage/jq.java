package defpackage;

import java.util.concurrent.Executor;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: jq  reason: default package */
/* loaded from: classes.dex */
public class jq implements Executor {
    public final Executor a;

    /* compiled from: AxisPay */
    /* renamed from: jq$a */
    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public final Runnable b;

        public a(Runnable runnable) {
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.run();
            } catch (Exception e) {
                qr.c(C0059ao.a(14967), C0059ao.a(14968), e);
            }
        }
    }

    public jq(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.a.execute(new a(runnable));
    }
}
