package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* compiled from: AxisPay */
/* renamed from: kn  reason: default package */
/* loaded from: classes.dex */
public class kn implements ln {
    public final ViewGroupOverlay a;

    public kn(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    @Override // defpackage.ln
    public void a(View view) {
        this.a.add(view);
    }

    @Override // defpackage.qn
    public void b(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // defpackage.ln
    public void c(View view) {
        this.a.remove(view);
    }

    @Override // defpackage.qn
    public void d(Drawable drawable) {
        this.a.remove(drawable);
    }
}
