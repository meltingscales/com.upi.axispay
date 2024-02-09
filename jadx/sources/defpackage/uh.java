package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: uh  reason: default package */
/* loaded from: classes.dex */
public abstract class uh {
    public final Context a;
    public final d b;
    public final c c;
    public a d;
    public th e;
    public boolean f;
    public vh g;
    public boolean h;

    /* compiled from: AxisPay */
    /* renamed from: uh$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract void a(uh uhVar, vh vhVar);
    }

    /* compiled from: AxisPay */
    /* renamed from: uh$b */
    /* loaded from: classes.dex */
    public static abstract class b extends e {
        public final Object a = new Object();
        public Executor b;
        public d c;
        public sh d;
        public Collection<c> e;

        /* compiled from: AxisPay */
        /* renamed from: uh$b$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ d b;
            public final /* synthetic */ sh c;
            public final /* synthetic */ Collection d;

            public a(d dVar, sh shVar, Collection collection) {
                this.b = dVar;
                this.c = shVar;
                this.d = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.b.a(b.this, this.c, this.d);
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: uh$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0040b implements Runnable {
            public final /* synthetic */ d b;
            public final /* synthetic */ sh c;
            public final /* synthetic */ Collection d;

            public RunnableC0040b(d dVar, sh shVar, Collection collection) {
                this.b = dVar;
                this.c = shVar;
                this.d = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.b.a(b.this, this.c, this.d);
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: uh$b$c */
        /* loaded from: classes.dex */
        public static final class c {
            public final sh a;
            public final int b;
            public final boolean c;
            public final boolean d;
            public final boolean e;

            /* compiled from: AxisPay */
            /* renamed from: uh$b$c$a */
            /* loaded from: classes.dex */
            public static final class a {
                public final sh a;
                public int b = 1;
                public boolean c = false;
                public boolean d = false;
                public boolean e = false;

                public a(sh shVar) {
                    this.a = shVar;
                }

                public c a() {
                    return new c(this.a, this.b, this.c, this.d, this.e);
                }

                public a b(boolean z) {
                    this.d = z;
                    return this;
                }

                public a c(boolean z) {
                    this.e = z;
                    return this;
                }

                public a d(boolean z) {
                    this.c = z;
                    return this;
                }

                public a e(int i) {
                    this.b = i;
                    return this;
                }
            }

            public c(sh shVar, int i, boolean z, boolean z2, boolean z3) {
                this.a = shVar;
                this.b = i;
                this.c = z;
                this.d = z2;
                this.e = z3;
            }

            public static c a(Bundle bundle) {
                if (bundle == null) {
                    return null;
                }
                return new c(sh.d(bundle.getBundle(C0059ao.a(8962))), bundle.getInt(C0059ao.a(8963), 1), bundle.getBoolean(C0059ao.a(8964), false), bundle.getBoolean(C0059ao.a(8965), false), bundle.getBoolean(C0059ao.a(8966), false));
            }

            public sh b() {
                return this.a;
            }

            public int c() {
                return this.b;
            }

            public boolean d() {
                return this.d;
            }

            public boolean e() {
                return this.e;
            }

            public boolean f() {
                return this.c;
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: uh$b$d */
        /* loaded from: classes.dex */
        public interface d {
            void a(b bVar, sh shVar, Collection<c> collection);
        }

        public String j() {
            return null;
        }

        public String k() {
            return null;
        }

        public final void l(sh shVar, Collection<c> collection) {
            Objects.requireNonNull(shVar, C0059ao.a(12364));
            Objects.requireNonNull(collection, C0059ao.a(12365));
            synchronized (this.a) {
                Executor executor = this.b;
                if (executor != null) {
                    executor.execute(new RunnableC0040b(this.c, shVar, collection));
                } else {
                    this.d = shVar;
                    this.e = new ArrayList(collection);
                }
            }
        }

        public abstract void m(String str);

        public abstract void n(String str);

        public abstract void o(List<String> list);

        public void p(Executor executor, d dVar) {
            synchronized (this.a) {
                if (executor == null) {
                    throw new NullPointerException(C0059ao.a(12367));
                }
                if (dVar != null) {
                    this.b = executor;
                    this.c = dVar;
                    Collection<c> collection = this.e;
                    if (collection != null && !collection.isEmpty()) {
                        sh shVar = this.d;
                        Collection<c> collection2 = this.e;
                        this.d = null;
                        this.e = null;
                        this.b.execute(new a(dVar, shVar, collection2));
                    }
                } else {
                    throw new NullPointerException(C0059ao.a(12366));
                }
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: uh$c */
    /* loaded from: classes.dex */
    public final class c extends Handler {
        public c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                uh.this.l();
            } else if (i != 2) {
            } else {
                uh.this.m();
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: uh$d */
    /* loaded from: classes.dex */
    public static final class d {
        public final ComponentName a;

        public d(ComponentName componentName) {
            if (componentName != null) {
                this.a = componentName;
                return;
            }
            throw new IllegalArgumentException(C0059ao.a(12447));
        }

        public ComponentName a() {
            return this.a;
        }

        public String b() {
            return this.a.getPackageName();
        }

        public String toString() {
            return C0059ao.a(12448) + this.a.flattenToShortString() + C0059ao.a(12449);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: uh$e */
    /* loaded from: classes.dex */
    public static abstract class e {
        public void d() {
        }

        public void e() {
        }

        public void f(int i) {
        }

        @Deprecated
        public void g() {
        }

        public void h(int i) {
            g();
        }

        public void i(int i) {
        }
    }

    public uh(Context context) {
        this(context, null);
    }

    public void l() {
        this.h = false;
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(this, this.g);
        }
    }

    public void m() {
        this.f = false;
        v(this.e);
    }

    public final Context n() {
        return this.a;
    }

    public final vh o() {
        return this.g;
    }

    public final th p() {
        return this.e;
    }

    public final Handler q() {
        return this.c;
    }

    public final d r() {
        return this.b;
    }

    public b s(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException(C0059ao.a(3864));
    }

    public e t(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException(C0059ao.a(3865));
    }

    public e u(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return t(str);
            }
            throw new IllegalArgumentException(C0059ao.a(3866));
        }
        throw new IllegalArgumentException(C0059ao.a(3867));
    }

    public void v(th thVar) {
    }

    public final void w(a aVar) {
        yh.d();
        this.d = aVar;
    }

    public final void x(vh vhVar) {
        yh.d();
        if (this.g != vhVar) {
            this.g = vhVar;
            if (this.h) {
                return;
            }
            this.h = true;
            this.c.sendEmptyMessage(1);
        }
    }

    public final void y(th thVar) {
        yh.d();
        if (ya.a(this.e, thVar)) {
            return;
        }
        z(thVar);
    }

    public final void z(th thVar) {
        this.e = thVar;
        if (this.f) {
            return;
        }
        this.f = true;
        this.c.sendEmptyMessage(2);
    }

    public uh(Context context, d dVar) {
        this.c = new c();
        if (context != null) {
            this.a = context;
            if (dVar == null) {
                this.b = new d(new ComponentName(context, getClass()));
                return;
            } else {
                this.b = dVar;
                return;
            }
        }
        throw new IllegalArgumentException(C0059ao.a(3863));
    }
}
