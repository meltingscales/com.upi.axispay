package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import com.google.android.gms.vision.barcode.Barcode;
import defpackage.f9;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import myunmn.C0059ao;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AxisPay */
/* renamed from: jo  reason: default package */
/* loaded from: classes.dex */
public class jo extends io {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public h c;
    public PorterDuffColorFilter d;
    public ColorFilter e;
    public boolean f;
    public boolean g;
    public final float[] h;
    public final Matrix i;
    public final Rect j;

    /* compiled from: AxisPay */
    /* renamed from: jo$b */
    /* loaded from: classes.dex */
    public static class b extends f {
        public b() {
        }

        @Override // defpackage.jo.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (c9.j(xmlPullParser, C0059ao.a(4950))) {
                TypedArray k = c9.k(resources, theme, attributeSet, co.d);
                f(k, xmlPullParser);
                k.recycle();
            }
        }

        public final void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.a = f9.d(string2);
            }
            this.c = c9.g(typedArray, xmlPullParser, C0059ao.a(4951), 2, 0);
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: jo$e */
    /* loaded from: classes.dex */
    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: jo$h */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {
        public int a;
        public g b;
        public ColorStateList c;
        public PorterDuff.Mode d;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public int i;
        public boolean j;
        public boolean k;
        public Paint l;

        public h(h hVar) {
            this.c = null;
            this.d = jo.k;
            if (hVar != null) {
                this.a = hVar.a;
                g gVar = new g(hVar.b);
                this.b = gVar;
                if (hVar.b.e != null) {
                    gVar.e = new Paint(hVar.b.e);
                }
                if (hVar.b.d != null) {
                    this.b.d = new Paint(hVar.b.d);
                }
                this.c = hVar.c;
                this.d = hVar.d;
                this.e = hVar.e;
            }
        }

        public boolean a(int i, int i2) {
            return i == this.f.getWidth() && i2 == this.f.getHeight();
        }

        public boolean b() {
            return !this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.getRootAlpha();
        }

        public void c(int i, int i2) {
            if (this.f == null || !a(i, i2)) {
                this.f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (f() || colorFilter != null) {
                if (this.l == null) {
                    Paint paint = new Paint();
                    this.l = paint;
                    paint.setFilterBitmap(true);
                }
                this.l.setAlpha(this.b.getRootAlpha());
                this.l.setColorFilter(colorFilter);
                return this.l;
            }
            return null;
        }

        public boolean f() {
            return this.b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        public boolean h(int[] iArr) {
            boolean g = this.b.g(iArr);
            this.k |= g;
            return g;
        }

        public void i() {
            this.g = this.c;
            this.h = this.d;
            this.i = this.b.getRootAlpha();
            this.j = this.e;
            this.k = false;
        }

        public void j(int i, int i2) {
            this.f.eraseColor(0);
            this.b.b(new Canvas(this.f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new jo(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new jo(this);
        }

        public h() {
            this.c = null;
            this.d = jo.k;
            this.b = new g();
        }
    }

    public jo() {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = new h();
    }

    public static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    public static jo b(Resources resources, int i2, Resources.Theme theme) {
        int next;
        String a2 = C0059ao.a(10012);
        String a3 = C0059ao.a(10013);
        if (Build.VERSION.SDK_INT >= 24) {
            jo joVar = new jo();
            joVar.b = b9.e(resources, i2, theme);
            new i(joVar.b.getConstantState());
            return joVar;
        }
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
                return c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException(C0059ao.a(10014));
        } catch (IOException e2) {
            Log.e(a3, a2, e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e(a3, a2, e3);
            return null;
        }
    }

    public static jo c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        jo joVar = new jo();
        joVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return joVar;
    }

    public static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 9) {
                    switch (i2) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.b;
        if (drawable != null) {
            o9.b(drawable);
            return false;
        }
        return false;
    }

    public Object d(String str) {
        return this.c.b.p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() <= 0 || this.j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.e;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        canvas.getMatrix(this.i);
        this.i.getValues(this.h);
        float abs = Math.abs(this.h[0]);
        float abs2 = Math.abs(this.h[4]);
        float abs3 = Math.abs(this.h[1]);
        float abs4 = Math.abs(this.h[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min((int) Barcode.PDF417, (int) (this.j.width() * abs));
        int min2 = Math.min((int) Barcode.PDF417, (int) (this.j.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.j;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.j.offsetTo(0, 0);
        this.c.c(min, min2);
        if (!this.g) {
            this.c.j(min, min2);
        } else if (!this.c.b()) {
            this.c.j(min, min2);
            this.c.i();
        }
        this.c.d(canvas, colorFilter, this.j);
        canvas.restoreToCount(save);
    }

    public final void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.c;
        g gVar = hVar.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            String a2 = C0059ao.a(10015);
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if (C0059ao.a(10016).equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    hVar.a = cVar.d | hVar.a;
                } else if (C0059ao.a(10017).equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.p.put(bVar.getPathName(), bVar);
                    }
                    hVar.a = bVar.d | hVar.a;
                } else if (a2.equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.a = dVar2.k | hVar.a;
                }
            } else if (eventType == 3 && a2.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException(C0059ao.a(10018));
        }
    }

    public final boolean f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && o9.f(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return o9.d(drawable);
        }
        return this.c.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return o9.e(drawable);
        }
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.b != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.b.getConstantState());
        }
        this.c.a = getChangingConfigurations();
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.c.b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.c.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void h(boolean z) {
        this.g = z;
    }

    public final void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.c;
        g gVar = hVar.b;
        hVar.d = g(c9.g(typedArray, xmlPullParser, C0059ao.a(10019), 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c2 = c9.c(typedArray, xmlPullParser, theme, C0059ao.a(10020), 1);
        if (c2 != null) {
            hVar.c = c2;
        }
        hVar.e = c9.a(typedArray, xmlPullParser, C0059ao.a(10021), 5, hVar.e);
        gVar.k = c9.f(typedArray, xmlPullParser, C0059ao.a(10022), 7, gVar.k);
        float f2 = c9.f(typedArray, xmlPullParser, C0059ao.a(10023), 8, gVar.l);
        gVar.l = f2;
        if (gVar.k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + C0059ao.a(10028));
        } else if (f2 > 0.0f) {
            gVar.i = typedArray.getDimension(3, gVar.i);
            float dimension = typedArray.getDimension(2, gVar.j);
            gVar.j = dimension;
            if (gVar.i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + C0059ao.a(10026));
            } else if (dimension > 0.0f) {
                gVar.setAlpha(c9.f(typedArray, xmlPullParser, C0059ao.a(10024), 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.n = string;
                    gVar.p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + C0059ao.a(10025));
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + C0059ao.a(10027));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return o9.h(drawable);
        }
        return this.c.e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.c) != null && (hVar.g() || ((colorStateList = this.c.c) != null && colorStateList.isStateful())));
    }

    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            this.c = new h(this.c);
            this.f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.c;
        ColorStateList colorStateList = hVar.c;
        if (colorStateList != null && (mode = hVar.d) != null) {
            this.d = j(this.d, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (hVar.g() && hVar.h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.c.b.getRootAlpha() != i2) {
            this.c.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.b;
        if (drawable != null) {
            o9.j(drawable, z);
        } else {
            this.c.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, defpackage.p9
    public void setTint(int i2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            o9.n(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, defpackage.p9
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.b;
        if (drawable != null) {
            o9.o(drawable, colorStateList);
            return;
        }
        h hVar = this.c;
        if (hVar.c != colorStateList) {
            hVar.c = colorStateList;
            this.d = j(this.d, colorStateList, hVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, defpackage.p9
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.b;
        if (drawable != null) {
            o9.p(drawable, mode);
            return;
        }
        h hVar = this.c;
        if (hVar.d != mode) {
            hVar.d = mode;
            this.d = j(this.d, hVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: jo$i */
    /* loaded from: classes.dex */
    public static class i extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            jo joVar = new jo();
            joVar.b = (VectorDrawable) this.a.newDrawable();
            return joVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            jo joVar = new jo();
            joVar.b = (VectorDrawable) this.a.newDrawable(resources);
            return joVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            jo joVar = new jo();
            joVar.b = (VectorDrawable) this.a.newDrawable(resources, theme);
            return joVar;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: jo$f */
    /* loaded from: classes.dex */
    public static abstract class f extends e {
        public f9.b[] a;
        public String b;
        public int c;
        public int d;

        public f() {
            super();
            this.a = null;
            this.c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            f9.b[] bVarArr = this.a;
            if (bVarArr != null) {
                f9.b.e(bVarArr, path);
            }
        }

        public f9.b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(f9.b[] bVarArr) {
            if (!f9.b(this.a, bVarArr)) {
                this.a = f9.f(bVarArr);
            } else {
                f9.j(this.a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.a = null;
            this.c = 0;
            this.b = fVar.b;
            this.d = fVar.d;
            this.a = f9.f(fVar.a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.b;
        if (drawable != null) {
            o9.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.c;
        hVar.b = new g();
        TypedArray k2 = c9.k(resources, theme, attributeSet, co.a);
        i(k2, xmlPullParser, theme);
        k2.recycle();
        hVar.a = getChangingConfigurations();
        hVar.k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.d = j(this.d, hVar.c, hVar.d);
    }

    public jo(h hVar) {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = hVar;
        this.d = j(this.d, hVar.c, hVar.d);
    }

    /* compiled from: AxisPay */
    /* renamed from: jo$c */
    /* loaded from: classes.dex */
    public static class c extends f {
        public int[] e;
        public x8 f;
        public float g;
        public x8 h;
        public float i;
        public float j;
        public float k;
        public float l;
        public float m;
        public Paint.Cap n;
        public Paint.Join o;
        public float p;

        public c() {
            this.g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        @Override // defpackage.jo.e
        public boolean a() {
            return this.h.i() || this.f.i();
        }

        @Override // defpackage.jo.e
        public boolean b(int[] iArr) {
            return this.f.j(iArr) | this.h.j(iArr);
        }

        public final Paint.Cap e(int i, Paint.Cap cap) {
            if (i != 0) {
                if (i != 1) {
                    return i != 2 ? cap : Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        public final Paint.Join f(int i, Paint.Join join) {
            if (i != 0) {
                if (i != 1) {
                    return i != 2 ? join : Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = c9.k(resources, theme, attributeSet, co.c);
            h(k, xmlPullParser, theme);
            k.recycle();
        }

        public float getFillAlpha() {
            return this.j;
        }

        public int getFillColor() {
            return this.h.e();
        }

        public float getStrokeAlpha() {
            return this.i;
        }

        public int getStrokeColor() {
            return this.f.e();
        }

        public float getStrokeWidth() {
            return this.g;
        }

        public float getTrimPathEnd() {
            return this.l;
        }

        public float getTrimPathOffset() {
            return this.m;
        }

        public float getTrimPathStart() {
            return this.k;
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.e = null;
            if (c9.j(xmlPullParser, C0059ao.a(4848))) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.a = f9.d(string2);
                }
                this.h = c9.e(typedArray, xmlPullParser, theme, C0059ao.a(4849), 1, 0);
                this.j = c9.f(typedArray, xmlPullParser, C0059ao.a(4850), 12, this.j);
                this.n = e(c9.g(typedArray, xmlPullParser, C0059ao.a(4851), 8, -1), this.n);
                this.o = f(c9.g(typedArray, xmlPullParser, C0059ao.a(4852), 9, -1), this.o);
                this.p = c9.f(typedArray, xmlPullParser, C0059ao.a(4853), 10, this.p);
                this.f = c9.e(typedArray, xmlPullParser, theme, C0059ao.a(4854), 3, 0);
                this.i = c9.f(typedArray, xmlPullParser, C0059ao.a(4855), 11, this.i);
                this.g = c9.f(typedArray, xmlPullParser, C0059ao.a(4856), 4, this.g);
                this.l = c9.f(typedArray, xmlPullParser, C0059ao.a(4857), 6, this.l);
                this.m = c9.f(typedArray, xmlPullParser, C0059ao.a(4858), 7, this.m);
                this.k = c9.f(typedArray, xmlPullParser, C0059ao.a(4859), 5, this.k);
                this.c = c9.g(typedArray, xmlPullParser, C0059ao.a(4860), 13, this.c);
            }
        }

        public void setFillAlpha(float f) {
            this.j = f;
        }

        public void setFillColor(int i) {
            this.h.k(i);
        }

        public void setStrokeAlpha(float f) {
            this.i = f;
        }

        public void setStrokeColor(int i) {
            this.f.k(i);
        }

        public void setStrokeWidth(float f) {
            this.g = f;
        }

        public void setTrimPathEnd(float f) {
            this.l = f;
        }

        public void setTrimPathOffset(float f) {
            this.m = f;
        }

        public void setTrimPathStart(float f) {
            this.k = f;
        }

        public c(c cVar) {
            super(cVar);
            this.g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.i = cVar.i;
            this.h = cVar.h;
            this.c = cVar.c;
            this.j = cVar.j;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: jo$g */
    /* loaded from: classes.dex */
    public static class g {
        public static final Matrix q = new Matrix();
        public final Path a;
        public final Path b;
        public final Matrix c;
        public Paint d;
        public Paint e;
        public PathMeasure f;
        public int g;
        public final d h;
        public float i;
        public float j;
        public float k;
        public float l;
        public int m;
        public String n;
        public Boolean o;
        public final o4<String, Object> p;

        public g() {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new o4<>();
            this.h = new d();
            this.a = new Path();
            this.b = new Path();
        }

        public static float a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public void b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c(this.h, q, canvas, i, i2, colorFilter);
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.a.set(matrix);
            dVar.a.preConcat(dVar.j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.b.size(); i3++) {
                e eVar = dVar.b.get(i3);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public final void d(d dVar, f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.k;
            float f2 = i2 / this.l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.a;
            this.c.set(matrix);
            this.c.postScale(f, f2);
            float e = e(matrix);
            if (e == 0.0f) {
                return;
            }
            fVar.d(this.a);
            Path path = this.a;
            this.b.reset();
            if (fVar.c()) {
                this.b.setFillType(fVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.b.addPath(path, this.c);
                canvas.clipPath(this.b);
                return;
            }
            c cVar = (c) fVar;
            float f3 = cVar.k;
            if (f3 != 0.0f || cVar.l != 1.0f) {
                float f4 = cVar.m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (cVar.l + f4) % 1.0f;
                if (this.f == null) {
                    this.f = new PathMeasure();
                }
                this.f.setPath(this.a, false);
                float length = this.f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f.getSegment(f7, length, path, true);
                    this.f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.b.addPath(path, this.c);
            if (cVar.h.l()) {
                x8 x8Var = cVar.h;
                if (this.e == null) {
                    Paint paint = new Paint(1);
                    this.e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.e;
                if (x8Var.h()) {
                    Shader f9 = x8Var.f();
                    f9.setLocalMatrix(this.c);
                    paint2.setShader(f9);
                    paint2.setAlpha(Math.round(cVar.j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(jo.a(x8Var.e(), cVar.j));
                }
                paint2.setColorFilter(colorFilter);
                this.b.setFillType(cVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.b, paint2);
            }
            if (cVar.f.l()) {
                x8 x8Var2 = cVar.f;
                if (this.d == null) {
                    Paint paint3 = new Paint(1);
                    this.d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.d;
                Paint.Join join = cVar.o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.p);
                if (x8Var2.h()) {
                    Shader f10 = x8Var2.f();
                    f10.setLocalMatrix(this.c);
                    paint4.setShader(f10);
                    paint4.setAlpha(Math.round(cVar.i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(jo.a(x8Var2.e(), cVar.i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.g * min * e);
                canvas.drawPath(this.b, paint4);
            }
        }

        public final float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        public boolean f() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.h.a());
            }
            return this.o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.m = i;
        }

        public g(g gVar) {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            o4<String, Object> o4Var = new o4<>();
            this.p = o4Var;
            this.h = new d(gVar.h, o4Var);
            this.a = new Path(gVar.a);
            this.b = new Path(gVar.b);
            this.i = gVar.i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.g = gVar.g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                o4Var.put(str, this);
            }
            this.o = gVar.o;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: jo$d */
    /* loaded from: classes.dex */
    public static class d extends e {
        public final Matrix a;
        public final ArrayList<e> b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final Matrix j;
        public int k;
        public int[] l;
        public String m;

        public d(d dVar, o4<String, Object> o4Var) {
            super();
            f bVar;
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            Matrix matrix = new Matrix();
            this.j = matrix;
            this.m = null;
            this.c = dVar.c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f = dVar.f;
            this.g = dVar.g;
            this.h = dVar.h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.k = dVar.k;
            if (str != null) {
                o4Var.put(str, this);
            }
            matrix.set(dVar.j);
            ArrayList<e> arrayList = dVar.b;
            for (int i = 0; i < arrayList.size(); i++) {
                e eVar = arrayList.get(i);
                if (eVar instanceof d) {
                    this.b.add(new d((d) eVar, o4Var));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        bVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException(C0059ao.a(4971));
                    }
                    this.b.add(bVar);
                    String str2 = bVar.b;
                    if (str2 != null) {
                        o4Var.put(str2, bVar);
                    }
                }
            }
        }

        @Override // defpackage.jo.e
        public boolean a() {
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.jo.e
        public boolean b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.b.size(); i++) {
                z |= this.b.get(i).b(iArr);
            }
            return z;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = c9.k(resources, theme, attributeSet, co.b);
            e(k, xmlPullParser);
            k.recycle();
        }

        public final void d() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.c = c9.f(typedArray, xmlPullParser, C0059ao.a(4972), 5, this.c);
            this.d = typedArray.getFloat(1, this.d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = c9.f(typedArray, xmlPullParser, C0059ao.a(4973), 3, this.f);
            this.g = c9.f(typedArray, xmlPullParser, C0059ao.a(4974), 4, this.g);
            this.h = c9.f(typedArray, xmlPullParser, C0059ao.a(4975), 6, this.h);
            this.i = c9.f(typedArray, xmlPullParser, C0059ao.a(4976), 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            d();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                d();
            }
        }

        public void setRotation(float f) {
            if (f != this.c) {
                this.c = f;
                d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.h) {
                this.h = f;
                d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.i) {
                this.i = f;
                d();
            }
        }

        public d() {
            super();
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }
    }
}
