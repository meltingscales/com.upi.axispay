package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* compiled from: AxisPay */
/* renamed from: sz  reason: default package */
/* loaded from: classes.dex */
public class sz {
    public static sz e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new a());
    public c c;
    public c d;

    /* compiled from: AxisPay */
    /* renamed from: sz$a */
    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            sz.this.d((c) message.obj);
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: sz$b */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(int i);
    }

    /* compiled from: AxisPay */
    /* renamed from: sz$c */
    /* loaded from: classes.dex */
    public static class c {
        public final WeakReference<b> a;
        public int b;
        public boolean c;

        public c(int i, b bVar) {
            this.a = new WeakReference<>(bVar);
            this.b = i;
        }

        public boolean a(b bVar) {
            return bVar != null && this.a.get() == bVar;
        }
    }

    public static sz c() {
        if (e == null) {
            e = new sz();
        }
        return e;
    }

    public final boolean a(c cVar, int i) {
        b bVar = cVar.a.get();
        if (bVar != null) {
            this.b.removeCallbacksAndMessages(cVar);
            bVar.b(i);
            return true;
        }
        return false;
    }

    public void b(b bVar, int i) {
        synchronized (this.a) {
            if (f(bVar)) {
                a(this.c, i);
            } else if (g(bVar)) {
                a(this.d, i);
            }
        }
    }

    public void d(c cVar) {
        synchronized (this.a) {
            if (this.c == cVar || this.d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public boolean e(b bVar) {
        boolean z;
        synchronized (this.a) {
            z = f(bVar) || g(bVar);
        }
        return z;
    }

    public final boolean f(b bVar) {
        c cVar = this.c;
        return cVar != null && cVar.a(bVar);
    }

    public final boolean g(b bVar) {
        c cVar = this.d;
        return cVar != null && cVar.a(bVar);
    }

    public void h(b bVar) {
        synchronized (this.a) {
            if (f(bVar)) {
                this.c = null;
                if (this.d != null) {
                    n();
                }
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.a) {
            if (f(bVar)) {
                l(this.c);
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.a) {
            if (f(bVar)) {
                c cVar = this.c;
                if (!cVar.c) {
                    cVar.c = true;
                    this.b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.a) {
            if (f(bVar)) {
                c cVar = this.c;
                if (cVar.c) {
                    cVar.c = false;
                    l(cVar);
                }
            }
        }
    }

    public final void l(c cVar) {
        int i = cVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        this.b.removeCallbacksAndMessages(cVar);
        Handler handler = this.b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }

    public void m(int i, b bVar) {
        synchronized (this.a) {
            if (f(bVar)) {
                c cVar = this.c;
                cVar.b = i;
                this.b.removeCallbacksAndMessages(cVar);
                l(this.c);
                return;
            }
            if (g(bVar)) {
                this.d.b = i;
            } else {
                this.d = new c(i, bVar);
            }
            c cVar2 = this.c;
            if (cVar2 == null || !a(cVar2, 4)) {
                this.c = null;
                n();
            }
        }
    }

    public final void n() {
        c cVar = this.d;
        if (cVar != null) {
            this.c = cVar;
            this.d = null;
            b bVar = cVar.a.get();
            if (bVar != null) {
                bVar.a();
            } else {
                this.c = null;
            }
        }
    }
}
