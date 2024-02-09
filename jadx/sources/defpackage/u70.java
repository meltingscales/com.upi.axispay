package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import defpackage.n80;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: AxisPay */
/* renamed from: u70  reason: default package */
/* loaded from: classes.dex */
public abstract class u70<T> {
    public final n80 a;
    public final q80 b;
    public final WeakReference<T> c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final Drawable h;
    public final String i;
    public final Object j;
    public boolean k;
    public boolean l;

    /* compiled from: AxisPay */
    /* renamed from: u70$a */
    /* loaded from: classes.dex */
    public static class a<M> extends WeakReference<M> {
        public final u70 a;

        public a(u70 u70Var, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.a = u70Var;
        }
    }

    public u70(n80 n80Var, T t, q80 q80Var, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        this.a = n80Var;
        this.b = q80Var;
        this.c = t == null ? null : new a(this, t, n80Var.k);
        this.e = i;
        this.f = i2;
        this.d = z;
        this.g = i3;
        this.h = drawable;
        this.i = str;
        this.j = obj == null ? this : obj;
    }

    public void a() {
        this.l = true;
    }

    public abstract void b(Bitmap bitmap, n80.e eVar);

    public abstract void c(Exception exc);

    public String d() {
        return this.i;
    }

    public int e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public n80 g() {
        return this.a;
    }

    public n80.f h() {
        return this.b.t;
    }

    public q80 i() {
        return this.b;
    }

    public Object j() {
        return this.j;
    }

    public T k() {
        WeakReference<T> weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.k;
    }
}
