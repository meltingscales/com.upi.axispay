package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: AxisPay */
/* renamed from: wn  reason: default package */
/* loaded from: classes.dex */
public class wn extends vn {
    @Override // defpackage.sn, defpackage.xn
    public float c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.un, defpackage.xn
    public void e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.sn, defpackage.xn
    public void f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.vn, defpackage.xn
    public void g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.tn, defpackage.xn
    public void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.tn, defpackage.xn
    public void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
