package com.upi.axispay.barcode;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.upi.axispay.R;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ScannerOverlay extends SurfaceView {
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public int j;

    public ScannerOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int a(int i) {
        return Math.round(i * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        float f = 0;
        canvas.drawRoundRect(new RectF(this.b, this.c, a(this.e) + this.b, a(this.f) + this.c), f, f, paint);
        Paint paint2 = new Paint();
        paint2.setColor(this.i);
        paint2.setStrokeWidth(Float.valueOf(this.j).floatValue());
        float f2 = this.d;
        float a = this.c + a(this.f);
        int i = this.g;
        if (f2 >= a + i) {
            this.h = true;
        } else if (this.d == this.c + i) {
            this.h = false;
        }
        if (this.h) {
            this.d -= i;
        } else {
            this.d += i;
        }
        float f3 = this.b;
        canvas.drawLine(f3, this.d, f3 + a(this.e), this.d, paint2);
        invalidate();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.b = (i - a(this.e)) / 2;
        float a = (i2 - a(this.f)) / 2;
        this.c = a;
        this.d = a;
        super.onSizeChanged(i, i2, i3, i4);
    }

    public ScannerOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, z80.ScannerOverlay, 0, 0);
        this.e = obtainStyledAttributes.getInteger(4, getResources().getInteger(R.integer.scanner_rect_width));
        this.f = obtainStyledAttributes.getInteger(3, getResources().getInteger(R.integer.scanner_rect_height));
        this.i = obtainStyledAttributes.getColor(0, t8.d(context, R.color.scanner_line));
        this.j = obtainStyledAttributes.getInteger(2, getResources().getInteger(R.integer.line_width));
        this.g = obtainStyledAttributes.getInteger(1, getResources().getInteger(R.integer.line_width));
    }
}
