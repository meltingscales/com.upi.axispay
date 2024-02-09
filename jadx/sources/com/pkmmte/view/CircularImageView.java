package com.pkmmte.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CircularImageView extends ImageView {
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public BitmapShader h;
    public Bitmap i;
    public Paint j;
    public Paint k;
    public Paint l;
    public ColorFilter m;

    public CircularImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s70.circularImageViewStyle);
    }

    public void a() {
        setLayerType(1, this.k);
        this.k.setShadowLayer(4.0f, 0.0f, 2.0f, -16777216);
    }

    public Bitmap b(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public final void c(Context context, AttributeSet attributeSet, int i) {
        Paint paint = new Paint();
        this.j = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.k = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.l = paint3;
        paint3.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t70.CircularImageView, i, 0);
        this.b = obtainStyledAttributes.getBoolean(0, false);
        this.c = obtainStyledAttributes.getBoolean(3, false);
        if (this.b) {
            setBorderWidth(obtainStyledAttributes.getDimensionPixelOffset(2, (int) ((context.getResources().getDisplayMetrics().density * 2.0f) + 0.5f)));
            setBorderColor(obtainStyledAttributes.getColor(1, -1));
        }
        if (this.c) {
            setSelectorColor(obtainStyledAttributes.getColor(4, 0));
            setSelectorStrokeWidth(obtainStyledAttributes.getDimensionPixelOffset(6, (int) ((context.getResources().getDisplayMetrics().density * 2.0f) + 0.5f)));
            setSelectorStrokeColor(obtainStyledAttributes.getColor(5, -16776961));
        }
        if (obtainStyledAttributes.getBoolean(7, false)) {
            a();
        }
        obtainStyledAttributes.recycle();
    }

    public final int d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824 && mode != Integer.MIN_VALUE) {
            size = this.f;
        }
        return size + 2;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            this.d = false;
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.d = true;
        } else if (action == 1 || action == 3 || action == 4 || action == 8) {
            this.d = false;
        }
        invalidate();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int e(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return (mode == 1073741824 || mode == Integer.MIN_VALUE) ? size : this.f;
    }

    public void f() {
        Bitmap bitmap = this.i;
        int i = this.f;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i, false);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h = new BitmapShader(createScaledBitmap, tileMode, tileMode);
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        super.invalidate(rect);
        this.i = b(getDrawable());
        if (this.h != null || this.f > 0) {
            f();
        }
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        Bitmap bitmap = this.i;
        if (bitmap == null || bitmap.getHeight() == 0 || this.i.getWidth() == 0) {
            return;
        }
        int i4 = this.f;
        this.f = canvas.getWidth();
        if (canvas.getHeight() < this.f) {
            this.f = canvas.getHeight();
        }
        if (i4 != this.f) {
            f();
        }
        this.j.setShader(this.h);
        int i5 = 0;
        int i6 = this.f;
        int i7 = i6 / 2;
        if (this.c && this.d) {
            i5 = this.g;
            i2 = (i6 - (i5 * 2)) / 2;
            this.j.setColorFilter(this.m);
            float f = i2 + i5;
            canvas.drawCircle(f, f, (((this.f - i3) / 2) + i5) - 4.0f, this.l);
        } else if (this.b) {
            i5 = this.e;
            i2 = (i6 - (i5 * 2)) / 2;
            this.j.setColorFilter(null);
            float f2 = i2 + i5;
            canvas.drawCircle(f2, f2, (((this.f - i) / 2) + i5) - 4.0f, this.k);
        } else {
            this.j.setColorFilter(null);
            float f3 = i7 + i5;
            canvas.drawCircle(f3, f3, ((this.f - (i5 * 2)) / 2) - 4.0f, this.j);
        }
        i7 = i2;
        float f32 = i7 + i5;
        canvas.drawCircle(f32, f32, ((this.f - (i5 * 2)) / 2) - 4.0f, this.j);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(e(i), d(i2));
    }

    public void setBorderColor(int i) {
        Paint paint = this.k;
        if (paint != null) {
            paint.setColor(i);
        }
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.e = i;
        requestLayout();
        invalidate();
    }

    public void setSelectorColor(int i) {
        this.m = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        invalidate();
    }

    public void setSelectorStrokeColor(int i) {
        Paint paint = this.l;
        if (paint != null) {
            paint.setColor(i);
        }
        invalidate();
    }

    public void setSelectorStrokeWidth(int i) {
        this.g = i;
        requestLayout();
        invalidate();
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context, attributeSet, i);
    }

    @Override // android.view.View
    public void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        this.i = b(getDrawable());
        if (this.h != null || this.f > 0) {
            f();
        }
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.i = b(getDrawable());
        if (this.h != null || this.f > 0) {
            f();
        }
    }
}
