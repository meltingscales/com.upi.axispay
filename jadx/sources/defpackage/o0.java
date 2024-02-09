package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: AxisPay */
/* renamed from: o0  reason: default package */
/* loaded from: classes.dex */
public class o0 extends Drawable {
    public static final float m = (float) Math.toRadians(45.0d);
    public final Paint a;
    public float b;
    public float c;
    public float d;
    public float e;
    public boolean f;
    public final Path g;
    public final int h;
    public boolean i;
    public float j;
    public float k;
    public int l;

    public o0(Context context) {
        Paint paint = new Paint();
        this.a = paint;
        this.g = new Path();
        this.i = false;
        this.l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, u.DrawerArrowToggle, l.drawerArrowStyle, t.Base_Widget_AppCompat_DrawerArrowToggle);
        c(obtainStyledAttributes.getColor(u.DrawerArrowToggle_color, 0));
        b(obtainStyledAttributes.getDimension(u.DrawerArrowToggle_thickness, 0.0f));
        f(obtainStyledAttributes.getBoolean(u.DrawerArrowToggle_spinBars, true));
        d(Math.round(obtainStyledAttributes.getDimension(u.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.h = obtainStyledAttributes.getDimensionPixelSize(u.DrawerArrowToggle_drawableSize, 0);
        this.c = Math.round(obtainStyledAttributes.getDimension(u.DrawerArrowToggle_barLength, 0.0f));
        this.b = Math.round(obtainStyledAttributes.getDimension(u.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.d = obtainStyledAttributes.getDimension(u.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public static float a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public void b(float f) {
        if (this.a.getStrokeWidth() != f) {
            this.a.setStrokeWidth(f);
            this.k = (float) ((f / 2.0f) * Math.cos(m));
            invalidateSelf();
        }
    }

    public void c(int i) {
        if (i != this.a.getColor()) {
            this.a.setColor(i);
            invalidateSelf();
        }
    }

    public void d(float f) {
        if (f != this.e) {
            this.e = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        Rect bounds = getBounds();
        int i = this.l;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? o9.f(this) == 0 : o9.f(this) == 1))) {
            z = true;
        }
        float f2 = this.b;
        float a = a(this.c, (float) Math.sqrt(f2 * f2 * 2.0f), this.j);
        float a2 = a(this.c, this.d, this.j);
        float round = Math.round(a(0.0f, this.k, this.j));
        float a3 = a(0.0f, m, this.j);
        float a4 = a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.j);
        double d = a;
        double d2 = a3;
        boolean z2 = z;
        float round2 = (float) Math.round(Math.cos(d2) * d);
        float round3 = (float) Math.round(d * Math.sin(d2));
        this.g.rewind();
        float a5 = a(this.e + this.a.getStrokeWidth(), -this.k, this.j);
        float f3 = (-a2) / 2.0f;
        this.g.moveTo(f3 + round, 0.0f);
        this.g.rLineTo(a2 - (round * 2.0f), 0.0f);
        this.g.moveTo(f3, a5);
        this.g.rLineTo(round2, round3);
        this.g.moveTo(f3, -a5);
        this.g.rLineTo(round2, -round3);
        this.g.close();
        canvas.save();
        float strokeWidth = this.a.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (height - (2.0f * f))) / 4) * 2) + (strokeWidth * 1.5f) + this.e);
        if (this.f) {
            canvas.rotate(a4 * (this.i ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.g, this.a);
        canvas.restore();
    }

    public void e(float f) {
        if (this.j != f) {
            this.j = f;
            invalidateSelf();
        }
    }

    public void f(boolean z) {
        if (this.f != z) {
            this.f = z;
            invalidateSelf();
        }
    }

    public void g(boolean z) {
        if (this.i != z) {
            this.i = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.a.getAlpha()) {
            this.a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
