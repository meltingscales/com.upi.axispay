package defpackage;

import java.util.concurrent.Executor;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: w3  reason: default package */
/* loaded from: classes.dex */
public class w3 extends y3 {
    public static volatile w3 c;
    public static final Executor d;
    public y3 a;
    public y3 b;

    /* compiled from: AxisPay */
    /* renamed from: w3$a */
    /* loaded from: classes.dex */
    public static class a implements Executor {
        static {
            C0095z.a();
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            w3.d().a(runnable);
        }
    }

    static {
        C0095z.a();
        d = new a();
    }

    public w3() {
        x3 x3Var = new x3();
        this.b = x3Var;
        this.a = x3Var;
    }

    public static Executor c() {
        return d;
    }

    public static w3 d() {
        if (c != null) {
            return c;
        }
        synchronized (w3.class) {
            if (c == null) {
                c = new w3();
            }
        }
        return c;
    }

    @Override // defpackage.y3
    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    @Override // defpackage.y3
    public boolean b() {
        return this.a.b();
    }
}
