package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import defpackage.bf;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: je  reason: default package */
/* loaded from: classes.dex */
public abstract class je {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList<String> n;
    public ArrayList<String> o;
    public ArrayList<Runnable> q;
    public ArrayList<a> a = new ArrayList<>();
    public boolean h = true;
    public boolean p = false;

    /* compiled from: AxisPay */
    /* renamed from: je$a */
    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public Fragment b;
        public int c;
        public int d;
        public int e;
        public int f;
        public bf.c g;
        public bf.c h;

        public a() {
        }

        public a(int i, Fragment fragment) {
            this.a = i;
            this.b = fragment;
            bf.c cVar = bf.c.RESUMED;
            this.g = cVar;
            this.h = cVar;
        }

        public a(int i, Fragment fragment, bf.c cVar) {
            this.a = i;
            this.b = fragment;
            this.g = fragment.mMaxState;
            this.h = cVar;
        }
    }

    public je(xd xdVar, ClassLoader classLoader) {
    }

    public je c(int i, Fragment fragment) {
        p(i, fragment, null, 1);
        return this;
    }

    public je d(int i, Fragment fragment, String str) {
        p(i, fragment, str, 1);
        return this;
    }

    public je e(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        d(viewGroup.getId(), fragment, str);
        return this;
    }

    public je f(Fragment fragment, String str) {
        p(0, fragment, str, 1);
        return this;
    }

    public void g(a aVar) {
        this.a.add(aVar);
        aVar.c = this.b;
        aVar.d = this.c;
        aVar.e = this.d;
        aVar.f = this.e;
    }

    public je h(String str) {
        if (this.h) {
            this.g = true;
            this.i = str;
            return this;
        }
        throw new IllegalStateException(C0059ao.a(9766));
    }

    public je i(Fragment fragment) {
        g(new a(7, fragment));
        return this;
    }

    public abstract int j();

    public abstract int k();

    public abstract void l();

    public abstract void m();

    public je n(Fragment fragment) {
        g(new a(6, fragment));
        return this;
    }

    public je o() {
        if (!this.g) {
            this.h = false;
            return this;
        }
        throw new IllegalStateException(C0059ao.a(9767));
    }

    public void p(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            String a2 = C0059ao.a(9768);
            String a3 = C0059ao.a(9769);
            if (str != null) {
                String str2 = fragment.mTag;
                if (str2 != null && !str.equals(str2)) {
                    throw new IllegalStateException(C0059ao.a(9770) + fragment + a3 + fragment.mTag + a2 + str);
                }
                fragment.mTag = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = fragment.mFragmentId;
                    if (i3 != 0 && i3 != i) {
                        throw new IllegalStateException(C0059ao.a(9771) + fragment + a3 + fragment.mFragmentId + a2 + i);
                    }
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalArgumentException(C0059ao.a(9772) + fragment + C0059ao.a(9773) + str + C0059ao.a(9774));
                }
            }
            g(new a(i2, fragment));
            return;
        }
        throw new IllegalStateException(C0059ao.a(9775) + cls.getCanonicalName() + C0059ao.a(9776));
    }

    public je q(Fragment fragment) {
        g(new a(3, fragment));
        return this;
    }

    public je r(int i, Fragment fragment) {
        s(i, fragment, null);
        return this;
    }

    public je s(int i, Fragment fragment, String str) {
        if (i != 0) {
            p(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException(C0059ao.a(9777));
    }

    public je t(Fragment fragment, bf.c cVar) {
        g(new a(10, fragment, cVar));
        return this;
    }

    public je u(boolean z) {
        this.p = z;
        return this;
    }
}
