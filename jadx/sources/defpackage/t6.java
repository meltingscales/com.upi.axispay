package defpackage;

import android.view.View;

/* compiled from: AxisPay */
/* renamed from: t6  reason: default package */
/* loaded from: classes.dex */
public abstract class t6 extends l5 {

    /* compiled from: AxisPay */
    /* renamed from: t6$a */
    /* loaded from: classes.dex */
    public static class a extends t6 {
        @Override // defpackage.t6
        public boolean b(View view, float f, long j, i5 i5Var) {
            return this.h;
        }

        public boolean c(View view, i5 i5Var, float f, long j, double d, double d2) {
            view.setRotation(a(f, j, view, i5Var) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.h;
        }
    }

    public float a(float f, long j, View view, i5 i5Var) {
        this.a.c(f, this.g);
        float[] fArr = this.g;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.h = false;
            return fArr[2];
        } else if (Float.isNaN(this.j)) {
            i5Var.a(view, this.f, 0);
            throw null;
        } else {
            float f3 = (float) ((this.j + (((j - this.i) * 1.0E-9d) * f2)) % 1.0d);
            this.j = f3;
            i5Var.b(view, this.f, 0, f3);
            throw null;
        }
    }

    public abstract boolean b(View view, float f, long j, i5 i5Var);
}
