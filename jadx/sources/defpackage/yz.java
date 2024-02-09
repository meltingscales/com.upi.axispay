package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* compiled from: AxisPay */
/* renamed from: yz  reason: default package */
/* loaded from: classes.dex */
public class yz extends hz {
    public final RectF A;
    public int B;
    public final Paint z;

    public yz() {
        this(null);
    }

    @Override // defpackage.hz, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.A, this.z);
        l0(canvas);
    }

    public boolean k0() {
        return !this.A.isEmpty();
    }

    public final void l0(Canvas canvas) {
        if (s0(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.B);
    }

    public final void m0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (s0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
                return;
            }
            return;
        }
        o0(canvas);
    }

    public void n0() {
        p0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void o0(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.B = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        } else {
            this.B = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        }
    }

    public void p0(float f, float f2, float f3, float f4) {
        RectF rectF = this.A;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public void q0(RectF rectF) {
        p0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void r0() {
        this.z.setStyle(Paint.Style.FILL_AND_STROKE);
        this.z.setColor(-1);
        this.z.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final boolean s0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    public yz(lz lzVar) {
        super(lzVar == null ? new lz() : lzVar);
        this.z = new Paint(1);
        r0();
        this.A = new RectF();
    }
}
