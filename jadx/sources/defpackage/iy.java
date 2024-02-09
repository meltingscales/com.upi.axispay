package defpackage;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Constructor;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: iy  reason: default package */
/* loaded from: classes.dex */
public final class iy {
    public static final int n;
    public static boolean o;
    public static Constructor<StaticLayout> p;
    public static Object q;
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int e;
    public boolean l;
    public int d = 0;
    public Layout.Alignment f = Layout.Alignment.ALIGN_NORMAL;
    public int g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public float h = 0.0f;
    public float i = 1.0f;
    public int j = n;
    public boolean k = true;
    public TextUtils.TruncateAt m = null;

    /* compiled from: AxisPay */
    /* renamed from: iy$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(Throwable th) {
            super(C0059ao.a(133) + th.getMessage(), th);
        }
    }

    static {
        n = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public iy(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.e = charSequence.length();
    }

    public static iy c(CharSequence charSequence, TextPaint textPaint, int i) {
        return new iy(charSequence, textPaint, i);
    }

    public StaticLayout a() throws a {
        if (this.a == null) {
            this.a = C0059ao.a(9529);
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        if (this.g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.b, max, this.m);
        }
        int min = Math.min(charSequence.length(), this.e);
        this.e = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.l && this.g == 1) {
                this.f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.d, min, this.b, max);
            obtain.setAlignment(this.f);
            obtain.setIncludePad(this.k);
            obtain.setTextDirection(this.l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.g);
            float f = this.h;
            if (f != 0.0f || this.i != 1.0f) {
                obtain.setLineSpacing(f, this.i);
            }
            if (this.g > 1) {
                obtain.setHyphenationFrequency(this.j);
            }
            return obtain.build();
        }
        b();
        try {
            Constructor<StaticLayout> constructor = p;
            db.e(constructor);
            Object obj = q;
            db.e(obj);
            return constructor.newInstance(charSequence, Integer.valueOf(this.d), Integer.valueOf(this.e), this.b, Integer.valueOf(max), this.f, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.k), null, Integer.valueOf(max), Integer.valueOf(this.g));
        } catch (Exception e) {
            throw new a(e);
        }
    }

    public final void b() throws a {
        Class<?> cls;
        if (o) {
            return;
        }
        try {
            boolean z = this.l && Build.VERSION.SDK_INT >= 23;
            if (Build.VERSION.SDK_INT >= 18) {
                cls = TextDirectionHeuristic.class;
                q = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                ClassLoader classLoader = iy.class.getClassLoader();
                String a2 = this.l ? C0059ao.a(9530) : C0059ao.a(9531);
                Class<?> loadClass = classLoader.loadClass(C0059ao.a(9532));
                Class<?> loadClass2 = classLoader.loadClass(C0059ao.a(9533));
                q = loadClass2.getField(a2).get(loadClass2);
                cls = loadClass;
            }
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2);
            p = declaredConstructor;
            declaredConstructor.setAccessible(true);
            o = true;
        } catch (Exception e) {
            throw new a(e);
        }
    }

    public iy d(Layout.Alignment alignment) {
        this.f = alignment;
        return this;
    }

    public iy e(TextUtils.TruncateAt truncateAt) {
        this.m = truncateAt;
        return this;
    }

    public iy f(int i) {
        this.j = i;
        return this;
    }

    public iy g(boolean z) {
        this.k = z;
        return this;
    }

    public iy h(boolean z) {
        this.l = z;
        return this;
    }

    public iy i(float f, float f2) {
        this.h = f;
        this.i = f2;
        return this;
    }

    public iy j(int i) {
        this.g = i;
        return this;
    }
}
