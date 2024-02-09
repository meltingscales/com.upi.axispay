package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: il  reason: default package */
/* loaded from: classes.dex */
public class il implements Executor {
    public final Executor a;
    public final ArrayDeque<Runnable> b = new ArrayDeque<>();
    public Runnable c;

    /* compiled from: AxisPay */
    /* renamed from: il$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Runnable b;

        public a(Runnable runnable) {
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.run();
            } finally {
                il.this.a();
            }
        }
    }

    static {
        C0095z.a();
    }

    public il(Executor executor) {
        this.a = executor;
    }

    public synchronized void a() {
        Runnable poll = this.b.poll();
        this.c = poll;
        if (poll != null) {
            this.a.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.b.offer(new a(runnable));
        if (this.c == null) {
            a();
        }
    }
}
