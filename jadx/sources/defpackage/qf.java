package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: qf  reason: default package */
/* loaded from: classes.dex */
public class qf {
    public final b a;
    public final rf b;

    /* compiled from: AxisPay */
    /* renamed from: qf$a */
    /* loaded from: classes.dex */
    public static class a extends d {
        public static a c;
        public Application b;

        public a(Application application) {
            this.b = application;
        }

        public static a c(Application application) {
            if (c == null) {
                c = new a(application);
            }
            return c;
        }

        @Override // defpackage.qf.d, defpackage.qf.b
        public <T extends pf> T a(Class<T> cls) {
            String a = C0059ao.a(10033);
            if (xe.class.isAssignableFrom(cls)) {
                try {
                    return cls.getConstructor(Application.class).newInstance(this.b);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(a + cls, e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException(a + cls, e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(a + cls, e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(a + cls, e4);
                }
            }
            return (T) super.a(cls);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qf$b */
    /* loaded from: classes.dex */
    public interface b {
        <T extends pf> T a(Class<T> cls);
    }

    /* compiled from: AxisPay */
    /* renamed from: qf$c */
    /* loaded from: classes.dex */
    public static abstract class c extends e implements b {
        public <T extends pf> T a(Class<T> cls) {
            throw new UnsupportedOperationException(C0059ao.a(10139));
        }

        public abstract <T extends pf> T c(String str, Class<T> cls);
    }

    /* compiled from: AxisPay */
    /* renamed from: qf$d */
    /* loaded from: classes.dex */
    public static class d implements b {
        public static d a;

        public static d b() {
            if (a == null) {
                a = new d();
            }
            return a;
        }

        @Override // defpackage.qf.b
        public <T extends pf> T a(Class<T> cls) {
            String a2 = C0059ao.a(10284);
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(a2 + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(a2 + cls, e2);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qf$e */
    /* loaded from: classes.dex */
    public static class e {
        public void b(pf pfVar) {
        }
    }

    public qf(rf rfVar, b bVar) {
        this.a = bVar;
        this.b = rfVar;
    }

    public <T extends pf> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(C0059ao.a(170) + canonicalName, cls);
        }
        throw new IllegalArgumentException(C0059ao.a(171));
    }

    public <T extends pf> T b(String str, Class<T> cls) {
        T t;
        T t2 = (T) this.b.b(str);
        if (cls.isInstance(t2)) {
            b bVar = this.a;
            if (bVar instanceof e) {
                ((e) bVar).b(t2);
            }
            return t2;
        }
        b bVar2 = this.a;
        if (bVar2 instanceof c) {
            t = (T) ((c) bVar2).c(str, cls);
        } else {
            t = (T) bVar2.a(cls);
        }
        this.b.d(str, t);
        return t;
    }
}
