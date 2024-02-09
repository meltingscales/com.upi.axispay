package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ic  reason: default package */
/* loaded from: classes.dex */
public class ic {
    public static final ic b;
    public final l a;

    /* compiled from: AxisPay */
    /* renamed from: ic$a */
    /* loaded from: classes.dex */
    public static class a {
        public static Field a;
        public static Field b;
        public static Field c;
        public static boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField(C0059ao.a(236));
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName(C0059ao.a(237));
                Field declaredField2 = cls.getDeclaredField(C0059ao.a(238));
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField(C0059ao.a(239));
                c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                Log.w(C0059ao.a(241), C0059ao.a(240) + e.getMessage(), e);
            }
        }

        public static ic a(View view) {
            if (d && view.isAttachedToWindow()) {
                try {
                    Object obj = a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) b.get(obj);
                        Rect rect2 = (Rect) c.get(obj);
                        if (rect != null && rect2 != null) {
                            b bVar = new b();
                            bVar.b(e9.c(rect));
                            bVar.c(e9.c(rect2));
                            ic a2 = bVar.a();
                            a2.t(a2);
                            a2.d(view.getRootView());
                            return a2;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w(C0059ao.a(243), C0059ao.a(242) + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ic$e */
    /* loaded from: classes.dex */
    public static class e extends d {
        public e() {
        }

        public e(ic icVar) {
            super(icVar);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ic$f */
    /* loaded from: classes.dex */
    public static class f {
        public final ic a;
        public e9[] b;

        public f() {
            this(new ic((ic) null));
        }

        public final void a() {
            e9[] e9VarArr = this.b;
            if (e9VarArr != null) {
                e9 e9Var = e9VarArr[m.a(1)];
                e9 e9Var2 = this.b[m.a(2)];
                if (e9Var2 == null) {
                    e9Var2 = this.a.f(2);
                }
                if (e9Var == null) {
                    e9Var = this.a.f(1);
                }
                f(e9.a(e9Var, e9Var2));
                e9 e9Var3 = this.b[m.a(16)];
                if (e9Var3 != null) {
                    e(e9Var3);
                }
                e9 e9Var4 = this.b[m.a(32)];
                if (e9Var4 != null) {
                    c(e9Var4);
                }
                e9 e9Var5 = this.b[m.a(64)];
                if (e9Var5 != null) {
                    g(e9Var5);
                }
            }
        }

        public ic b() {
            a();
            return this.a;
        }

        public void c(e9 e9Var) {
        }

        public void d(e9 e9Var) {
        }

        public void e(e9 e9Var) {
        }

        public void f(e9 e9Var) {
        }

        public void g(e9 e9Var) {
        }

        public f(ic icVar) {
            this.a = icVar;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ic$i */
    /* loaded from: classes.dex */
    public static class i extends h {
        public i(ic icVar, WindowInsets windowInsets) {
            super(icVar, windowInsets);
        }

        @Override // defpackage.ic.l
        public ic a() {
            return ic.w(this.c.consumeDisplayCutout());
        }

        @Override // defpackage.ic.g, defpackage.ic.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return Objects.equals(this.c, iVar.c) && Objects.equals(this.g, iVar.g);
            }
            return false;
        }

        @Override // defpackage.ic.l
        public hb f() {
            return hb.e(this.c.getDisplayCutout());
        }

        @Override // defpackage.ic.l
        public int hashCode() {
            return this.c.hashCode();
        }

        public i(ic icVar, i iVar) {
            super(icVar, iVar);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ic$k */
    /* loaded from: classes.dex */
    public static class k extends j {
        public static final ic r = ic.w(WindowInsets.CONSUMED);

        public k(ic icVar, WindowInsets windowInsets) {
            super(icVar, windowInsets);
        }

        @Override // defpackage.ic.g, defpackage.ic.l
        public final void d(View view) {
        }

        @Override // defpackage.ic.g, defpackage.ic.l
        public e9 g(int i) {
            return e9.d(this.c.getInsets(n.a(i)));
        }

        public k(ic icVar, k kVar) {
            super(icVar, kVar);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ic$l */
    /* loaded from: classes.dex */
    public static class l {
        public static final ic b = new b().a().a().b().c();
        public final ic a;

        public l(ic icVar) {
            this.a = icVar;
        }

        public ic a() {
            return this.a;
        }

        public ic b() {
            return this.a;
        }

        public ic c() {
            return this.a;
        }

        public void d(View view) {
        }

        public void e(ic icVar) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return o() == lVar.o() && n() == lVar.n() && ya.a(k(), lVar.k()) && ya.a(i(), lVar.i()) && ya.a(f(), lVar.f());
            }
            return false;
        }

        public hb f() {
            return null;
        }

        public e9 g(int i) {
            return e9.e;
        }

        public e9 h() {
            return k();
        }

        public int hashCode() {
            return ya.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        public e9 i() {
            return e9.e;
        }

        public e9 j() {
            return k();
        }

        public e9 k() {
            return e9.e;
        }

        public e9 l() {
            return k();
        }

        public ic m(int i, int i2, int i3, int i4) {
            return b;
        }

        public boolean n() {
            return false;
        }

        public boolean o() {
            return false;
        }

        public void p(e9[] e9VarArr) {
        }

        public void q(e9 e9Var) {
        }

        public void r(ic icVar) {
        }

        public void s(e9 e9Var) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ic$m */
    /* loaded from: classes.dex */
    public static final class m {
        public static int a(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            if (i != 16) {
                                if (i != 32) {
                                    if (i != 64) {
                                        if (i != 128) {
                                            if (i == 256) {
                                                return 8;
                                            }
                                            throw new IllegalArgumentException(C0059ao.a(3815) + i);
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ic$n */
    /* loaded from: classes.dex */
    public static final class n {
        public static int a(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = k.r;
        } else {
            b = l.b;
        }
    }

    public ic(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.a = new k(this, windowInsets);
        } else if (i2 >= 29) {
            this.a = new j(this, windowInsets);
        } else if (i2 >= 28) {
            this.a = new i(this, windowInsets);
        } else if (i2 >= 21) {
            this.a = new h(this, windowInsets);
        } else if (i2 >= 20) {
            this.a = new g(this, windowInsets);
        } else {
            this.a = new l(this);
        }
    }

    public static e9 o(e9 e9Var, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, e9Var.a - i2);
        int max2 = Math.max(0, e9Var.b - i3);
        int max3 = Math.max(0, e9Var.c - i4);
        int max4 = Math.max(0, e9Var.d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? e9Var : e9.b(max, max2, max3, max4);
    }

    public static ic w(WindowInsets windowInsets) {
        return x(windowInsets, null);
    }

    public static ic x(WindowInsets windowInsets, View view) {
        db.e(windowInsets);
        ic icVar = new ic(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            icVar.t(ac.K(view));
            icVar.d(view.getRootView());
        }
        return icVar;
    }

    @Deprecated
    public ic a() {
        return this.a.a();
    }

    @Deprecated
    public ic b() {
        return this.a.b();
    }

    @Deprecated
    public ic c() {
        return this.a.c();
    }

    public void d(View view) {
        this.a.d(view);
    }

    public hb e() {
        return this.a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ic) {
            return ya.a(this.a, ((ic) obj).a);
        }
        return false;
    }

    public e9 f(int i2) {
        return this.a.g(i2);
    }

    @Deprecated
    public e9 g() {
        return this.a.h();
    }

    @Deprecated
    public e9 h() {
        return this.a.i();
    }

    public int hashCode() {
        l lVar = this.a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.a.k().d;
    }

    @Deprecated
    public int j() {
        return this.a.k().a;
    }

    @Deprecated
    public int k() {
        return this.a.k().c;
    }

    @Deprecated
    public int l() {
        return this.a.k().b;
    }

    @Deprecated
    public boolean m() {
        return !this.a.k().equals(e9.e);
    }

    public ic n(int i2, int i3, int i4, int i5) {
        return this.a.m(i2, i3, i4, i5);
    }

    public boolean p() {
        return this.a.n();
    }

    @Deprecated
    public ic q(int i2, int i3, int i4, int i5) {
        b bVar = new b(this);
        bVar.c(e9.b(i2, i3, i4, i5));
        return bVar.a();
    }

    public void r(e9[] e9VarArr) {
        this.a.p(e9VarArr);
    }

    public void s(e9 e9Var) {
        this.a.q(e9Var);
    }

    public void t(ic icVar) {
        this.a.r(icVar);
    }

    public void u(e9 e9Var) {
        this.a.s(e9Var);
    }

    public WindowInsets v() {
        l lVar = this.a;
        if (lVar instanceof g) {
            return ((g) lVar).c;
        }
        return null;
    }

    /* compiled from: AxisPay */
    /* renamed from: ic$c */
    /* loaded from: classes.dex */
    public static class c extends f {
        public static Field e;
        public static boolean f;
        public static Constructor<WindowInsets> g;
        public static boolean h;
        public WindowInsets c;
        public e9 d;

        static {
            C0059ao.a(c.class, 198);
        }

        public c() {
            this.c = h();
        }

        public static WindowInsets h() {
            boolean z = f;
            String a = C0059ao.a(134);
            if (!z) {
                try {
                    e = WindowInsets.class.getDeclaredField(C0059ao.a(135));
                } catch (ReflectiveOperationException e2) {
                    Log.i(a, C0059ao.a(136), e2);
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i(a, C0059ao.a(137), e3);
                }
            }
            if (!h) {
                try {
                    g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i(a, C0059ao.a(138), e4);
                }
                h = true;
            }
            Constructor<WindowInsets> constructor = g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i(a, C0059ao.a(139), e5);
                }
            }
            return null;
        }

        @Override // defpackage.ic.f
        public ic b() {
            a();
            ic w = ic.w(this.c);
            w.r(this.b);
            w.u(this.d);
            return w;
        }

        @Override // defpackage.ic.f
        public void d(e9 e9Var) {
            this.d = e9Var;
        }

        @Override // defpackage.ic.f
        public void f(e9 e9Var) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(e9Var.a, e9Var.b, e9Var.c, e9Var.d);
            }
        }

        public c(ic icVar) {
            super(icVar);
            this.c = icVar.v();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ic$d */
    /* loaded from: classes.dex */
    public static class d extends f {
        public final WindowInsets.Builder c;

        public d() {
            this.c = new WindowInsets.Builder();
        }

        @Override // defpackage.ic.f
        public ic b() {
            a();
            ic w = ic.w(this.c.build());
            w.r(this.b);
            return w;
        }

        @Override // defpackage.ic.f
        public void c(e9 e9Var) {
            this.c.setMandatorySystemGestureInsets(e9Var.e());
        }

        @Override // defpackage.ic.f
        public void d(e9 e9Var) {
            this.c.setStableInsets(e9Var.e());
        }

        @Override // defpackage.ic.f
        public void e(e9 e9Var) {
            this.c.setSystemGestureInsets(e9Var.e());
        }

        @Override // defpackage.ic.f
        public void f(e9 e9Var) {
            this.c.setSystemWindowInsets(e9Var.e());
        }

        @Override // defpackage.ic.f
        public void g(e9 e9Var) {
            this.c.setTappableElementInsets(e9Var.e());
        }

        public d(ic icVar) {
            super(icVar);
            WindowInsets.Builder builder;
            WindowInsets v = icVar.v();
            if (v != null) {
                builder = new WindowInsets.Builder(v);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.c = builder;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ic$h */
    /* loaded from: classes.dex */
    public static class h extends g {
        public e9 n;

        public h(ic icVar, WindowInsets windowInsets) {
            super(icVar, windowInsets);
            this.n = null;
        }

        @Override // defpackage.ic.l
        public ic b() {
            return ic.w(this.c.consumeStableInsets());
        }

        @Override // defpackage.ic.l
        public ic c() {
            return ic.w(this.c.consumeSystemWindowInsets());
        }

        @Override // defpackage.ic.l
        public final e9 i() {
            if (this.n == null) {
                this.n = e9.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.n;
        }

        @Override // defpackage.ic.l
        public boolean n() {
            return this.c.isConsumed();
        }

        @Override // defpackage.ic.l
        public void s(e9 e9Var) {
            this.n = e9Var;
        }

        public h(ic icVar, h hVar) {
            super(icVar, hVar);
            this.n = null;
            this.n = hVar.n;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ic$g */
    /* loaded from: classes.dex */
    public static class g extends l {
        public static boolean h;
        public static Method i;
        public static Class<?> j;
        public static Class<?> k;
        public static Field l;
        public static Field m;
        public final WindowInsets c;
        public e9[] d;
        public e9 e;
        public ic f;
        public e9 g;

        static {
            C0059ao.a(g.class, 200);
        }

        public g(ic icVar, WindowInsets windowInsets) {
            super(icVar);
            this.e = null;
            this.c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        public static void x() {
            try {
                i = View.class.getDeclaredMethod(C0059ao.a(11), new Class[0]);
                j = Class.forName(C0059ao.a(12));
                Class<?> cls = Class.forName(C0059ao.a(13));
                k = cls;
                l = cls.getDeclaredField(C0059ao.a(14));
                m = j.getDeclaredField(C0059ao.a(15));
                l.setAccessible(true);
                m.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e(C0059ao.a(17), C0059ao.a(16) + e.getMessage(), e);
            }
            h = true;
        }

        @Override // defpackage.ic.l
        public void d(View view) {
            e9 w = w(view);
            if (w == null) {
                w = e9.e;
            }
            q(w);
        }

        @Override // defpackage.ic.l
        public void e(ic icVar) {
            icVar.t(this.f);
            icVar.s(this.g);
        }

        @Override // defpackage.ic.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.g, ((g) obj).g);
            }
            return false;
        }

        @Override // defpackage.ic.l
        public e9 g(int i2) {
            return t(i2, false);
        }

        @Override // defpackage.ic.l
        public final e9 k() {
            if (this.e == null) {
                this.e = e9.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // defpackage.ic.l
        public ic m(int i2, int i3, int i4, int i5) {
            b bVar = new b(ic.w(this.c));
            bVar.c(ic.o(k(), i2, i3, i4, i5));
            bVar.b(ic.o(i(), i2, i3, i4, i5));
            return bVar.a();
        }

        @Override // defpackage.ic.l
        public boolean o() {
            return this.c.isRound();
        }

        @Override // defpackage.ic.l
        public void p(e9[] e9VarArr) {
            this.d = e9VarArr;
        }

        @Override // defpackage.ic.l
        public void q(e9 e9Var) {
            this.g = e9Var;
        }

        @Override // defpackage.ic.l
        public void r(ic icVar) {
            this.f = icVar;
        }

        @SuppressLint({"WrongConstant"})
        public final e9 t(int i2, boolean z) {
            e9 e9Var = e9.e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    e9Var = e9.a(e9Var, u(i3, z));
                }
            }
            return e9Var;
        }

        public e9 u(int i2, boolean z) {
            e9 h2;
            int i3;
            hb f;
            if (i2 == 1) {
                if (z) {
                    return e9.b(0, Math.max(v().b, k().b), 0, 0);
                }
                return e9.b(0, k().b, 0, 0);
            }
            if (i2 == 2) {
                if (z) {
                    e9 v = v();
                    e9 i4 = i();
                    return e9.b(Math.max(v.a, i4.a), 0, Math.max(v.c, i4.c), Math.max(v.d, i4.d));
                }
                e9 k2 = k();
                ic icVar = this.f;
                h2 = icVar != null ? icVar.h() : null;
                int i5 = k2.d;
                if (h2 != null) {
                    i5 = Math.min(i5, h2.d);
                }
                return e9.b(k2.a, 0, k2.c, i5);
            } else if (i2 != 8) {
                if (i2 != 16) {
                    if (i2 != 32) {
                        if (i2 != 64) {
                            if (i2 != 128) {
                                return e9.e;
                            }
                            ic icVar2 = this.f;
                            if (icVar2 != null) {
                                f = icVar2.e();
                            } else {
                                f = f();
                            }
                            if (f != null) {
                                return e9.b(f.b(), f.d(), f.c(), f.a());
                            }
                            return e9.e;
                        }
                        return l();
                    }
                    return h();
                }
                return j();
            } else {
                e9[] e9VarArr = this.d;
                h2 = e9VarArr != null ? e9VarArr[m.a(8)] : null;
                if (h2 != null) {
                    return h2;
                }
                e9 k3 = k();
                e9 v2 = v();
                int i6 = k3.d;
                if (i6 > v2.d) {
                    return e9.b(0, 0, 0, i6);
                }
                e9 e9Var = this.g;
                if (e9Var != null && !e9Var.equals(e9.e) && (i3 = this.g.d) > v2.d) {
                    return e9.b(0, 0, 0, i3);
                }
                return e9.e;
            }
        }

        public final e9 v() {
            ic icVar = this.f;
            if (icVar != null) {
                return icVar.h();
            }
            return e9.e;
        }

        public final e9 w(View view) {
            String a = C0059ao.a(18);
            if (Build.VERSION.SDK_INT < 30) {
                if (!h) {
                    x();
                }
                Method method = i;
                if (method != null && k != null && l != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w(a, C0059ao.a(19), new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) l.get(m.get(invoke));
                        if (rect != null) {
                            return e9.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        Log.e(a, C0059ao.a(20) + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException(C0059ao.a(21));
        }

        public g(ic icVar, g gVar) {
            this(icVar, new WindowInsets(gVar.c));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ic$j */
    /* loaded from: classes.dex */
    public static class j extends i {
        public e9 o;
        public e9 p;
        public e9 q;

        public j(ic icVar, WindowInsets windowInsets) {
            super(icVar, windowInsets);
            this.o = null;
            this.p = null;
            this.q = null;
        }

        @Override // defpackage.ic.l
        public e9 h() {
            if (this.p == null) {
                this.p = e9.d(this.c.getMandatorySystemGestureInsets());
            }
            return this.p;
        }

        @Override // defpackage.ic.l
        public e9 j() {
            if (this.o == null) {
                this.o = e9.d(this.c.getSystemGestureInsets());
            }
            return this.o;
        }

        @Override // defpackage.ic.l
        public e9 l() {
            if (this.q == null) {
                this.q = e9.d(this.c.getTappableElementInsets());
            }
            return this.q;
        }

        @Override // defpackage.ic.g, defpackage.ic.l
        public ic m(int i, int i2, int i3, int i4) {
            return ic.w(this.c.inset(i, i2, i3, i4));
        }

        @Override // defpackage.ic.h, defpackage.ic.l
        public void s(e9 e9Var) {
        }

        public j(ic icVar, j jVar) {
            super(icVar, jVar);
            this.o = null;
            this.p = null;
            this.q = null;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ic$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final f a;

        public b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.a = new e();
            } else if (i >= 29) {
                this.a = new d();
            } else if (i >= 20) {
                this.a = new c();
            } else {
                this.a = new f();
            }
        }

        public ic a() {
            return this.a.b();
        }

        @Deprecated
        public b b(e9 e9Var) {
            this.a.d(e9Var);
            return this;
        }

        @Deprecated
        public b c(e9 e9Var) {
            this.a.f(e9Var);
            return this;
        }

        public b(ic icVar) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.a = new e(icVar);
            } else if (i >= 29) {
                this.a = new d(icVar);
            } else if (i >= 20) {
                this.a = new c(icVar);
            } else {
                this.a = new f(icVar);
            }
        }
    }

    public ic(ic icVar) {
        if (icVar != null) {
            l lVar = icVar.a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && (lVar instanceof k)) {
                this.a = new k(this, (k) lVar);
            } else if (i2 >= 29 && (lVar instanceof j)) {
                this.a = new j(this, (j) lVar);
            } else if (i2 >= 28 && (lVar instanceof i)) {
                this.a = new i(this, (i) lVar);
            } else if (i2 >= 21 && (lVar instanceof h)) {
                this.a = new h(this, (h) lVar);
            } else if (i2 >= 20 && (lVar instanceof g)) {
                this.a = new g(this, (g) lVar);
            } else {
                this.a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.a = new l(this);
    }
}
