package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: u80  reason: default package */
/* loaded from: classes.dex */
public class u80 {
    public final HandlerThread a;
    public final x70 b;
    public final Handler c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public int l;
    public int m;
    public int n;

    /* compiled from: AxisPay */
    /* renamed from: u80$a */
    /* loaded from: classes.dex */
    public static class a extends Handler {
        public final u80 a;

        /* compiled from: AxisPay */
        /* renamed from: u80$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0039a implements Runnable {
            public final /* synthetic */ Message b;

            public RunnableC0039a(a aVar, Message message) {
                this.b = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError(C0059ao.a(9877) + this.b.what);
            }
        }

        public a(Looper looper, u80 u80Var) {
            super(looper);
            this.a = u80Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.a.j();
            } else if (i == 1) {
                this.a.k();
            } else if (i == 2) {
                this.a.h(message.arg1);
            } else if (i == 3) {
                this.a.i(message.arg1);
            } else if (i != 4) {
                n80.p.post(new RunnableC0039a(this, message));
            } else {
                this.a.l((Long) message.obj);
            }
        }
    }

    public u80(x70 x70Var) {
        this.b = x70Var;
        HandlerThread handlerThread = new HandlerThread(C0059ao.a(1099), 10);
        this.a = handlerThread;
        handlerThread.start();
        x80.h(handlerThread.getLooper());
        this.c = new a(handlerThread.getLooper(), this);
    }

    public static long g(int i, long j) {
        return j / i;
    }

    public v80 a() {
        return new v80(this.b.b(), this.b.size(), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, System.currentTimeMillis());
    }

    public void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    public void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    public void d() {
        this.c.sendEmptyMessage(0);
    }

    public void e() {
        this.c.sendEmptyMessage(1);
    }

    public void f(long j) {
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j)));
    }

    public void h(long j) {
        int i = this.m + 1;
        this.m = i;
        long j2 = this.g + j;
        this.g = j2;
        this.j = g(i, j2);
    }

    public void i(long j) {
        this.n++;
        long j2 = this.h + j;
        this.h = j2;
        this.k = g(this.m, j2);
    }

    public void j() {
        this.d++;
    }

    public void k() {
        this.e++;
    }

    public void l(Long l) {
        this.l++;
        long longValue = this.f + l.longValue();
        this.f = longValue;
        this.i = g(this.l, longValue);
    }

    public final void m(Bitmap bitmap, int i) {
        int i2 = x80.i(bitmap);
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(i, i2, 0));
    }
}
