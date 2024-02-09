package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import defpackage.b9;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: uy  reason: default package */
/* loaded from: classes.dex */
public class uy {
    public final ColorStateList a;
    public final ColorStateList b;
    public final String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public float k;
    public final int l;
    public boolean m = false;
    public Typeface n;

    /* compiled from: AxisPay */
    /* renamed from: uy$a */
    /* loaded from: classes.dex */
    public class a extends b9.c {
        public final /* synthetic */ wy a;

        public a(wy wyVar) {
            this.a = wyVar;
        }

        @Override // defpackage.b9.c
        public void d(int i) {
            uy.this.m = true;
            this.a.a(i);
        }

        @Override // defpackage.b9.c
        public void e(Typeface typeface) {
            uy uyVar = uy.this;
            uyVar.n = Typeface.create(typeface, uyVar.d);
            uy.this.m = true;
            this.a.b(uy.this.n, false);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: uy$b */
    /* loaded from: classes.dex */
    public class b extends wy {
        public final /* synthetic */ TextPaint a;
        public final /* synthetic */ wy b;

        public b(TextPaint textPaint, wy wyVar) {
            this.a = textPaint;
            this.b = wyVar;
        }

        @Override // defpackage.wy
        public void a(int i) {
            this.b.a(i);
        }

        @Override // defpackage.wy
        public void b(Typeface typeface, boolean z) {
            uy.this.l(this.a, typeface);
            this.b.b(typeface, z);
        }
    }

    public uy(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, sv.TextAppearance);
        this.k = obtainStyledAttributes.getDimension(sv.TextAppearance_android_textSize, 0.0f);
        this.a = ty.a(context, obtainStyledAttributes, sv.TextAppearance_android_textColor);
        ty.a(context, obtainStyledAttributes, sv.TextAppearance_android_textColorHint);
        ty.a(context, obtainStyledAttributes, sv.TextAppearance_android_textColorLink);
        this.d = obtainStyledAttributes.getInt(sv.TextAppearance_android_textStyle, 0);
        this.e = obtainStyledAttributes.getInt(sv.TextAppearance_android_typeface, 1);
        int e = ty.e(obtainStyledAttributes, sv.TextAppearance_fontFamily, sv.TextAppearance_android_fontFamily);
        this.l = obtainStyledAttributes.getResourceId(e, 0);
        this.c = obtainStyledAttributes.getString(e);
        obtainStyledAttributes.getBoolean(sv.TextAppearance_textAllCaps, false);
        this.b = ty.a(context, obtainStyledAttributes, sv.TextAppearance_android_shadowColor);
        this.f = obtainStyledAttributes.getFloat(sv.TextAppearance_android_shadowDx, 0.0f);
        this.g = obtainStyledAttributes.getFloat(sv.TextAppearance_android_shadowDy, 0.0f);
        this.h = obtainStyledAttributes.getFloat(sv.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, sv.MaterialTextAppearance);
            int i2 = sv.MaterialTextAppearance_android_letterSpacing;
            this.i = obtainStyledAttributes2.hasValue(i2);
            this.j = obtainStyledAttributes2.getFloat(i2, 0.0f);
            obtainStyledAttributes2.recycle();
            return;
        }
        this.i = false;
        this.j = 0.0f;
    }

    public final void d() {
        String str;
        if (this.n == null && (str = this.c) != null) {
            this.n = Typeface.create(str, this.d);
        }
        if (this.n == null) {
            int i = this.e;
            if (i == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.n = Typeface.SERIF;
            } else if (i != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            this.n = Typeface.create(this.n, this.d);
        }
    }

    public Typeface e() {
        d();
        return this.n;
    }

    public Typeface f(Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface f = b9.f(context, this.l);
                this.n = f;
                if (f != null) {
                    this.n = Typeface.create(f, this.d);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                String str = C0059ao.a(4346) + this.c;
            }
        }
        d();
        this.m = true;
        return this.n;
    }

    public void g(Context context, TextPaint textPaint, wy wyVar) {
        l(textPaint, e());
        h(context, new b(textPaint, wyVar));
    }

    public void h(Context context, wy wyVar) {
        if (i(context)) {
            f(context);
        } else {
            d();
        }
        int i = this.l;
        if (i == 0) {
            this.m = true;
        }
        if (this.m) {
            wyVar.b(this.n, true);
            return;
        }
        try {
            b9.h(context, i, new a(wyVar), null);
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            wyVar.a(1);
        } catch (Exception unused2) {
            String str = C0059ao.a(4347) + this.c;
            this.m = true;
            wyVar.a(-3);
        }
    }

    public final boolean i(Context context) {
        if (vy.a()) {
            return true;
        }
        int i = this.l;
        return (i != 0 ? b9.c(context, i) : null) != null;
    }

    public void j(Context context, TextPaint textPaint, wy wyVar) {
        k(context, textPaint, wyVar);
        ColorStateList colorStateList = this.a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.h;
        float f2 = this.f;
        float f3 = this.g;
        ColorStateList colorStateList2 = this.b;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void k(Context context, TextPaint textPaint, wy wyVar) {
        if (i(context)) {
            l(textPaint, f(context));
        } else {
            g(context, textPaint, wyVar);
        }
    }

    public void l(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.k);
        if (Build.VERSION.SDK_INT < 21 || !this.i) {
            return;
        }
        textPaint.setLetterSpacing(this.j);
    }
}
