package defpackage;

import java.text.DecimalFormat;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: k5  reason: default package */
/* loaded from: classes.dex */
public abstract class k5 {
    public g5 a;
    public int[] b = new int[10];
    public float[] c = new float[10];
    public int d;
    public String e;

    public float a(float f) {
        return (float) this.a.a(f, 0);
    }

    public String toString() {
        String str = this.e;
        DecimalFormat decimalFormat = new DecimalFormat(C0059ao.a(9443));
        for (int i = 0; i < this.d; i++) {
            str = str + C0059ao.a(9444) + this.b[i] + C0059ao.a(9445) + decimalFormat.format(this.c[i]) + C0059ao.a(9446);
        }
        return str;
    }
}
