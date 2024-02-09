package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: qo  reason: default package */
/* loaded from: classes.dex */
public class qo extends ShapeDrawable {
    public final Paint a;
    public final Paint b;
    public final String c;
    public final int d;
    public final RectShape e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    public final int j;

    /* compiled from: AxisPay */
    /* renamed from: qo$b */
    /* loaded from: classes.dex */
    public static class b implements d, e, c {
        public String a;
        public int b;
        public int c;
        public int d;
        public int e;
        public Typeface f;
        public RectShape g;
        public int h;
        public int i;
        public boolean j;
        public boolean k;
        public float l;

        @Override // defpackage.qo.d
        public e a() {
            return this;
        }

        @Override // defpackage.qo.e
        public qo b(String str, int i) {
            u();
            return t(str, i);
        }

        @Override // defpackage.qo.d
        public d c(int i) {
            this.d = i;
            return this;
        }

        @Override // defpackage.qo.d
        public d d() {
            this.k = true;
            return this;
        }

        @Override // defpackage.qo.e
        public d e() {
            return this;
        }

        @Override // defpackage.qo.d
        public d f(int i) {
            this.i = i;
            return this;
        }

        @Override // defpackage.qo.d
        public d g(int i) {
            this.e = i;
            return this;
        }

        @Override // defpackage.qo.d
        public d h(int i) {
            this.h = i;
            return this;
        }

        @Override // defpackage.qo.d
        public d i(Typeface typeface) {
            this.f = typeface;
            return this;
        }

        public qo t(String str, int i) {
            this.b = i;
            this.a = str;
            return new qo(this);
        }

        public c u() {
            this.g = new OvalShape();
            return this;
        }

        public b() {
            this.a = C0059ao.a(15770);
            this.b = -7829368;
            this.h = -1;
            this.c = 0;
            this.d = -1;
            this.e = -1;
            this.g = new RectShape();
            this.f = Typeface.create(C0059ao.a(15771), 0);
            this.i = -1;
            this.j = false;
            this.k = false;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qo$c */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* compiled from: AxisPay */
    /* renamed from: qo$d */
    /* loaded from: classes.dex */
    public interface d {
        e a();

        d c(int i);

        d d();

        d f(int i);

        d g(int i);

        d h(int i);

        d i(Typeface typeface);
    }

    /* compiled from: AxisPay */
    /* renamed from: qo$e */
    /* loaded from: classes.dex */
    public interface e {
        qo b(String str, int i);

        d e();
    }

    public static e a() {
        return new b();
    }

    public final void b(Canvas canvas) {
        RectF rectF = new RectF(getBounds());
        int i = this.j;
        rectF.inset(i / 2, i / 2);
        RectShape rectShape = this.e;
        if (rectShape instanceof OvalShape) {
            canvas.drawOval(rectF, this.b);
        } else if (rectShape instanceof RoundRectShape) {
            float f = this.i;
            canvas.drawRoundRect(rectF, f, f, this.b);
        } else {
            canvas.drawRect(rectF, this.b);
        }
    }

    public final int c(int i) {
        return Color.rgb((int) (Color.red(i) * 0.9f), (int) (Color.green(i) * 0.9f), (int) (Color.blue(i) * 0.9f));
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Rect bounds = getBounds();
        if (this.j > 0) {
            b(canvas);
        }
        int save = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        int i = this.g;
        if (i < 0) {
            i = bounds.width();
        }
        int i2 = this.f;
        if (i2 < 0) {
            i2 = bounds.height();
        }
        int i3 = this.h;
        if (i3 < 0) {
            i3 = Math.min(i, i2) / 2;
        }
        this.a.setTextSize(i3);
        canvas.drawText(this.c, i / 2, (i2 / 2) - ((this.a.descent() + this.a.ascent()) / 2.0f), this.a);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.g;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public qo(b bVar) {
        super(bVar.g);
        this.e = bVar.g;
        this.f = bVar.e;
        this.g = bVar.d;
        this.i = bVar.l;
        this.c = bVar.k ? bVar.a.toUpperCase() : bVar.a;
        int i = bVar.b;
        this.d = i;
        this.h = bVar.i;
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(bVar.h);
        paint.setAntiAlias(true);
        paint.setFakeBoldText(bVar.j);
        paint.setStyle(Paint.Style.FILL);
        paint.setTypeface(bVar.f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStrokeWidth(bVar.c);
        int i2 = bVar.c;
        this.j = i2;
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(c(i));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(i2);
        getPaint().setColor(i);
    }
}
