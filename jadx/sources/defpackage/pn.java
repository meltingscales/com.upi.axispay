package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* compiled from: AxisPay */
/* renamed from: pn  reason: default package */
/* loaded from: classes.dex */
public class pn implements qn {
    public final ViewOverlay a;

    public pn(View view) {
        this.a = view.getOverlay();
    }

    @Override // defpackage.qn
    public void b(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // defpackage.qn
    public void d(Drawable drawable) {
        this.a.remove(drawable);
    }
}
