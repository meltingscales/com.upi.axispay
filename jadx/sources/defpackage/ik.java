package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: ik  reason: default package */
/* loaded from: classes.dex */
public final class ik {
    public final long e;
    public final Executor f;
    public bm i;
    public cm a = null;
    public final Handler b = new Handler(Looper.getMainLooper());
    public Runnable c = null;
    public final Object d = new Object();
    public int g = 0;
    public long h = SystemClock.uptimeMillis();
    public boolean j = false;
    public final Runnable k = new a();
    public final Runnable l = new b();

    /* compiled from: AxisPay */
    /* renamed from: ik$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        static {
            C0095z.a();
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ik ikVar = ik.this;
            ikVar.f.execute(ikVar.l);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ik$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        static {
            C0095z.a();
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ik.this.d) {
                long uptimeMillis = SystemClock.uptimeMillis();
                ik ikVar = ik.this;
                if (uptimeMillis - ikVar.h < ikVar.e) {
                    return;
                }
                if (ikVar.g != 0) {
                    return;
                }
                Runnable runnable = ikVar.c;
                if (runnable != null) {
                    runnable.run();
                    bm bmVar = ik.this.i;
                    if (bmVar != null && bmVar.isOpen()) {
                        try {
                            ik.this.i.close();
                            ik.this.i = null;
                        } catch (IOException e) {
                            pl.a(e);
                            throw null;
                        }
                    }
                    return;
                }
                throw new IllegalStateException(C0059ao.a(11465));
            }
        }
    }

    static {
        C0095z.a();
    }

    public ik(long j, TimeUnit timeUnit, Executor executor) {
        this.e = timeUnit.toMillis(j);
        this.f = executor;
    }

    public void a() throws IOException {
        synchronized (this.d) {
            this.j = true;
            bm bmVar = this.i;
            if (bmVar != null) {
                bmVar.close();
            }
            this.i = null;
        }
    }

    public void b() {
        synchronized (this.d) {
            int i = this.g;
            if (i > 0) {
                int i2 = i - 1;
                this.g = i2;
                if (i2 == 0) {
                    if (this.i == null) {
                        return;
                    }
                    this.b.postDelayed(this.k, this.e);
                }
                return;
            }
            throw new IllegalStateException(C0059ao.a(9071));
        }
    }

    public <V> V c(b4<bm, V> b4Var) {
        try {
            return b4Var.apply(e());
        } finally {
            b();
        }
    }

    public bm d() {
        bm bmVar;
        synchronized (this.d) {
            bmVar = this.i;
        }
        return bmVar;
    }

    public bm e() {
        synchronized (this.d) {
            this.b.removeCallbacks(this.k);
            this.g++;
            if (!this.j) {
                bm bmVar = this.i;
                if (bmVar != null && bmVar.isOpen()) {
                    return this.i;
                }
                cm cmVar = this.a;
                if (cmVar != null) {
                    bm K = cmVar.K();
                    this.i = K;
                    return K;
                }
                throw new IllegalStateException(C0059ao.a(9072));
            }
            throw new IllegalStateException(C0059ao.a(9073));
        }
    }

    public void f(cm cmVar) {
        if (this.a != null) {
            Log.e(C0059ao.a(9074), C0059ao.a(9075));
        } else {
            this.a = cmVar;
        }
    }

    public boolean g() {
        return !this.j;
    }

    public void h(Runnable runnable) {
        this.c = runnable;
    }
}
