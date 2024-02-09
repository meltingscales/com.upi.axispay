package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import myunmn.C0059ao;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AxisPay */
/* renamed from: e3  reason: default package */
/* loaded from: classes.dex */
public final class e3 {
    public static e3 i;
    public WeakHashMap<Context, v4<ColorStateList>> a;
    public u4<String, e> b;
    public v4<String> c;
    public final WeakHashMap<Context, r4<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    public TypedValue e;
    public boolean f;
    public f g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final c j = new c(6);

    /* compiled from: AxisPay */
    /* renamed from: e3$a */
    /* loaded from: classes.dex */
    public static class a implements e {
        @Override // defpackage.e3.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return l0.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e(C0059ao.a(3925), C0059ao.a(3926), e);
                return null;
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: e3$b */
    /* loaded from: classes.dex */
    public static class b implements e {
        @Override // defpackage.e3.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return Cdo.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e(C0059ao.a(3861), C0059ao.a(3862), e);
                return null;
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: e3$c */
    /* loaded from: classes.dex */
    public static class c extends s4<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }

        public static int a(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
            return get(Integer.valueOf(a(i, mode)));
        }

        public PorterDuffColorFilter c(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(a(i, mode)), porterDuffColorFilter);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: e3$d */
    /* loaded from: classes.dex */
    public static class d implements e {
        @Override // defpackage.e3.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e) {
                    Log.e(C0059ao.a(4028), C0059ao.a(4029), e);
                }
            }
            return null;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: e3$e */
    /* loaded from: classes.dex */
    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: AxisPay */
    /* renamed from: e3$f */
    /* loaded from: classes.dex */
    public interface f {
        boolean a(Context context, int i, Drawable drawable);

        PorterDuff.Mode b(int i);

        Drawable c(e3 e3Var, Context context, int i);

        ColorStateList d(Context context, int i);

        boolean e(Context context, int i, Drawable drawable);
    }

    /* compiled from: AxisPay */
    /* renamed from: e3$g */
    /* loaded from: classes.dex */
    public static class g implements e {
        @Override // defpackage.e3.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return jo.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e(C0059ao.a(3929), C0059ao.a(3930), e);
                return null;
            }
        }
    }

    public static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    public static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized e3 h() {
        e3 e3Var;
        synchronized (e3.class) {
            if (i == null) {
                e3 e3Var2 = new e3();
                i = e3Var2;
                p(e3Var2);
            }
            e3Var = i;
        }
        return e3Var;
    }

    public static synchronized PorterDuffColorFilter l(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter b2;
        synchronized (e3.class) {
            c cVar = j;
            b2 = cVar.b(i2, mode);
            if (b2 == null) {
                b2 = new PorterDuffColorFilter(i2, mode);
                cVar.c(i2, mode, b2);
            }
        }
        return b2;
    }

    public static void p(e3 e3Var) {
        if (Build.VERSION.SDK_INT < 24) {
            e3Var.a(C0059ao.a(3321), new g());
            e3Var.a(C0059ao.a(3322), new b());
            e3Var.a(C0059ao.a(3323), new a());
            e3Var.a(C0059ao.a(3324), new d());
        }
    }

    public static boolean q(Drawable drawable) {
        return (drawable instanceof jo) || C0059ao.a(3325).equals(drawable.getClass().getName());
    }

    public static void w(Drawable drawable, m3 m3Var, int[] iArr) {
        if (!v2.a(drawable) || drawable.mutate() == drawable) {
            boolean z = m3Var.d;
            if (!z && !m3Var.c) {
                drawable.clearColorFilter();
            } else {
                drawable.setColorFilter(g(z ? m3Var.a : null, m3Var.c ? m3Var.b : h, iArr));
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public final void a(String str, e eVar) {
        if (this.b == null) {
            this.b = new u4<>();
        }
        this.b.put(str, eVar);
    }

    public final synchronized boolean b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            r4<WeakReference<Drawable.ConstantState>> r4Var = this.d.get(context);
            if (r4Var == null) {
                r4Var = new r4<>();
                this.d.put(context, r4Var);
            }
            r4Var.i(j2, new WeakReference<>(constantState));
            return true;
        }
        return false;
    }

    public final void c(Context context, int i2, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap<>();
        }
        v4<ColorStateList> v4Var = this.a.get(context);
        if (v4Var == null) {
            v4Var = new v4<>();
            this.a.put(context, v4Var);
        }
        v4Var.a(i2, colorStateList);
    }

    public final void d(Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        Drawable j2 = j(context, q0.abc_vector_test);
        if (j2 == null || !q(j2)) {
            this.f = false;
            throw new IllegalStateException(C0059ao.a(3326));
        }
    }

    public final Drawable f(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long e2 = e(typedValue);
        Drawable i3 = i(context, e2);
        if (i3 != null) {
            return i3;
        }
        f fVar = this.g;
        Drawable c2 = fVar == null ? null : fVar.c(this, context, i2);
        if (c2 != null) {
            c2.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e2, c2);
        }
        return c2;
    }

    public final synchronized Drawable i(Context context, long j2) {
        r4<WeakReference<Drawable.ConstantState>> r4Var = this.d.get(context);
        if (r4Var == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> e2 = r4Var.e(j2);
        if (e2 != null) {
            Drawable.ConstantState constantState = e2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            r4Var.j(j2);
        }
        return null;
    }

    public synchronized Drawable j(Context context, int i2) {
        return k(context, i2, false);
    }

    public synchronized Drawable k(Context context, int i2, boolean z) {
        Drawable r;
        d(context);
        r = r(context, i2);
        if (r == null) {
            r = f(context, i2);
        }
        if (r == null) {
            r = t8.f(context, i2);
        }
        if (r != null) {
            r = v(context, i2, z, r);
        }
        if (r != null) {
            v2.b(r);
        }
        return r;
    }

    public synchronized ColorStateList m(Context context, int i2) {
        ColorStateList n;
        n = n(context, i2);
        if (n == null) {
            f fVar = this.g;
            n = fVar == null ? null : fVar.d(context, i2);
            if (n != null) {
                c(context, i2, n);
            }
        }
        return n;
    }

    public final ColorStateList n(Context context, int i2) {
        v4<ColorStateList> v4Var;
        WeakHashMap<Context, v4<ColorStateList>> weakHashMap = this.a;
        if (weakHashMap == null || (v4Var = weakHashMap.get(context)) == null) {
            return null;
        }
        return v4Var.e(i2);
    }

    public PorterDuff.Mode o(int i2) {
        f fVar = this.g;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i2);
    }

    public final Drawable r(Context context, int i2) {
        int next;
        u4<String, e> u4Var = this.b;
        if (u4Var == null || u4Var.isEmpty()) {
            return null;
        }
        v4<String> v4Var = this.c;
        String a2 = C0059ao.a(3327);
        if (v4Var != null) {
            String e2 = v4Var.e(i2);
            if (a2.equals(e2) || (e2 != null && this.b.get(e2) == null)) {
                return null;
            }
        } else {
            this.c = new v4<>();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long e3 = e(typedValue);
        Drawable i3 = i(context, e3);
        if (i3 != null) {
            return i3;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(C0059ao.a(3328))) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.c.a(i2, name);
                    e eVar = this.b.get(name);
                    if (eVar != null) {
                        i3 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (i3 != null) {
                        i3.setChangingConfigurations(typedValue.changingConfigurations);
                        b(context, e3, i3);
                    }
                } else {
                    throw new XmlPullParserException(C0059ao.a(3329));
                }
            } catch (Exception e4) {
                Log.e(C0059ao.a(3330), C0059ao.a(3331), e4);
            }
        }
        if (i3 == null) {
            this.c.a(i2, a2);
        }
        return i3;
    }

    public synchronized void s(Context context) {
        r4<WeakReference<Drawable.ConstantState>> r4Var = this.d.get(context);
        if (r4Var != null) {
            r4Var.b();
        }
    }

    public synchronized Drawable t(Context context, t3 t3Var, int i2) {
        Drawable r = r(context, i2);
        if (r == null) {
            r = t3Var.c(i2);
        }
        if (r != null) {
            return v(context, i2, false, r);
        }
        return null;
    }

    public synchronized void u(f fVar) {
        this.g = fVar;
    }

    public final Drawable v(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList m = m(context, i2);
        if (m != null) {
            if (v2.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = o9.r(drawable);
            o9.o(r, m);
            PorterDuff.Mode o = o(i2);
            if (o != null) {
                o9.p(r, o);
                return r;
            }
            return r;
        }
        f fVar = this.g;
        if ((fVar == null || !fVar.e(context, i2, drawable)) && !x(context, i2, drawable) && z) {
            return null;
        }
        return drawable;
    }

    public boolean x(Context context, int i2, Drawable drawable) {
        f fVar = this.g;
        return fVar != null && fVar.a(context, i2, drawable);
    }
}
