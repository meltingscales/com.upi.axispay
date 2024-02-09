package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: tn  reason: default package */
/* loaded from: classes.dex */
public class tn extends sn {
    public static boolean f;
    public static boolean g;

    static {
        C0059ao.a(tn.class, 320);
    }

    @Override // defpackage.xn
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    @Override // defpackage.xn
    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }
}
