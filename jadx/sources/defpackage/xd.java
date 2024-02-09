package defpackage;

import androidx.fragment.app.Fragment;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: xd  reason: default package */
/* loaded from: classes.dex */
public class xd {
    public static final u4<ClassLoader, u4<String, Class<?>>> a = new u4<>();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class<?> c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        u4<ClassLoader, u4<String, Class<?>>> u4Var = a;
        u4<String, Class<?>> u4Var2 = u4Var.get(classLoader);
        if (u4Var2 == null) {
            u4Var2 = new u4<>();
            u4Var.put(classLoader, u4Var2);
        }
        Class<?> cls = u4Var2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            u4Var2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        String a2 = C0059ao.a(6488);
        try {
            return c(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.j(a2 + str + C0059ao.a(6489), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.j(a2 + str + C0059ao.a(6490), e2);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        throw null;
    }
}
