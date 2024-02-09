package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import defpackage.uw;

/* compiled from: AxisPay */
/* renamed from: sw  reason: default package */
/* loaded from: classes.dex */
public class sw extends FrameLayout implements uw {
    public final tw b;

    @Override // defpackage.uw
    public void a() {
        this.b.b();
    }

    @Override // defpackage.uw
    public void b() {
        this.b.a();
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        tw twVar = this.b;
        if (twVar != null) {
            twVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.b.d();
    }

    @Override // defpackage.uw
    public int getCircularRevealScrimColor() {
        return this.b.e();
    }

    @Override // defpackage.uw
    public uw.e getRevealInfo() {
        return this.b.f();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        tw twVar = this.b;
        if (twVar != null) {
            return twVar.g();
        }
        return super.isOpaque();
    }

    @Override // defpackage.uw
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.b.h(drawable);
    }

    @Override // defpackage.uw
    public void setCircularRevealScrimColor(int i) {
        this.b.i(i);
    }

    @Override // defpackage.uw
    public void setRevealInfo(uw.e eVar) {
        this.b.j(eVar);
    }
}
