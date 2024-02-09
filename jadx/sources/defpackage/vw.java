package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import defpackage.uw;

/* compiled from: AxisPay */
/* renamed from: vw  reason: default package */
/* loaded from: classes.dex */
public class vw extends nw implements uw {
    public final tw s;

    @Override // defpackage.uw
    public void a() {
        this.s.b();
    }

    @Override // defpackage.uw
    public void b() {
        this.s.a();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        tw twVar = this.s;
        if (twVar != null) {
            twVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.s.d();
    }

    @Override // defpackage.uw
    public int getCircularRevealScrimColor() {
        return this.s.e();
    }

    @Override // defpackage.uw
    public uw.e getRevealInfo() {
        return this.s.f();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        tw twVar = this.s;
        if (twVar != null) {
            return twVar.g();
        }
        return super.isOpaque();
    }

    @Override // defpackage.uw
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.s.h(drawable);
    }

    @Override // defpackage.uw
    public void setCircularRevealScrimColor(int i) {
        this.s.i(i);
    }

    @Override // defpackage.uw
    public void setRevealInfo(uw.e eVar) {
        this.s.j(eVar);
    }
}
