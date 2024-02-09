package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import defpackage.n80;

/* compiled from: AxisPay */
/* renamed from: o80  reason: default package */
/* loaded from: classes.dex */
public final class o80 extends BitmapDrawable {
    public static final Paint h = new Paint();
    public final boolean a;
    public final float b;
    public final n80.e c;
    public Drawable d;
    public long e;
    public boolean f;
    public int g;

    public o80(Context context, Bitmap bitmap, Drawable drawable, n80.e eVar, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.g = 255;
        this.a = z2;
        this.b = context.getResources().getDisplayMetrics().density;
        this.c = eVar;
        if ((eVar == n80.e.MEMORY || z) ? false : true) {
            this.d = drawable;
            this.f = true;
            this.e = SystemClock.uptimeMillis();
        }
    }

    public static Path b(int i, int i2, int i3) {
        Path path = new Path();
        float f = i;
        float f2 = i2;
        path.moveTo(f, f2);
        path.lineTo(i + i3, f2);
        path.lineTo(f, i2 + i3);
        return path;
    }

    public static void c(ImageView imageView, Context context, Bitmap bitmap, n80.e eVar, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new o80(context, bitmap, drawable, eVar, z, z2));
    }

    public static void d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    public final void a(Canvas canvas) {
        Paint paint = h;
        paint.setColor(-1);
        canvas.drawPath(b(0, 0, (int) (this.b * 16.0f)), paint);
        paint.setColor(this.c.b);
        canvas.drawPath(b(0, 0, (int) (this.b * 15.0f)), paint);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!this.f) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.e)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f = false;
                this.d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.g * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.g);
            }
        }
        if (this.a) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.g = i;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
