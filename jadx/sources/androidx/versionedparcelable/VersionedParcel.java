package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class VersionedParcel {
    public final o4<String, Method> a;
    public final o4<String, Method> b;
    public final o4<String, Class> c;

    public VersionedParcel(o4<String, Method> o4Var, o4<String, Method> o4Var2, o4<String, Class> o4Var3) {
        this.a = o4Var;
        this.b = o4Var2;
        this.c = o4Var3;
    }

    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i) {
        w(i);
        A(bArr);
    }

    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i) {
        w(i);
        C(charSequence);
    }

    public abstract void E(int i);

    public void F(int i, int i2) {
        w(i2);
        E(i);
    }

    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i) {
        w(i);
        G(parcelable);
    }

    public abstract void I(String str);

    public void J(String str, int i) {
        w(i);
        I(str);
    }

    public <T extends mo> void K(T t, VersionedParcel versionedParcel) {
        try {
            e(t.getClass()).invoke(null, t, versionedParcel);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public void L(mo moVar) {
        if (moVar == null) {
            I(null);
            return;
        }
        N(moVar);
        VersionedParcel b = b();
        K(moVar, b);
        b.a();
    }

    public void M(mo moVar, int i) {
        w(i);
        L(moVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(mo moVar) {
        try {
            I(c(moVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(moVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    public abstract void a();

    public abstract VersionedParcel b();

    public final Class c(Class<? extends mo> cls) throws ClassNotFoundException {
        Class cls2 = this.c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.a.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
            this.a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.b.get(cls.getName());
        if (method == null) {
            Class c = c(cls);
            System.currentTimeMillis();
            Method declaredMethod = c.getDeclaredMethod("write", cls, VersionedParcel.class);
            this.b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean z, int i) {
        return !m(i) ? z : g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i) {
        return !m(i) ? bArr : i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i) {
        return !m(i) ? charSequence : k();
    }

    public abstract boolean m(int i);

    public <T extends mo> T n(String str, VersionedParcel versionedParcel) {
        try {
            return (T) d(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract int o();

    public int p(int i, int i2) {
        return !m(i2) ? i : o();
    }

    public abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t, int i) {
        return !m(i) ? t : (T) q();
    }

    public abstract String s();

    public String t(String str, int i) {
        return !m(i) ? str : s();
    }

    public <T extends mo> T u() {
        String s = s();
        if (s == null) {
            return null;
        }
        return (T) n(s, b());
    }

    public <T extends mo> T v(T t, int i) {
        return !m(i) ? t : (T) u();
    }

    public abstract void w(int i);

    public void x(boolean z, boolean z2) {
    }

    public abstract void y(boolean z);

    public void z(boolean z, int i) {
        w(i);
        y(z);
    }
}
