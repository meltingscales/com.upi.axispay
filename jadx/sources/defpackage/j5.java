package defpackage;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: j5  reason: default package */
/* loaded from: classes.dex */
public abstract class j5 {
    public a a;
    public String b;
    public int c = 0;
    public String d = null;
    public int e = 0;
    public ArrayList<b> f = new ArrayList<>();

    /* compiled from: AxisPay */
    /* renamed from: j5$a */
    /* loaded from: classes.dex */
    public static class a {
        public double a(float f) {
            throw null;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: j5$b */
    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public float b;
    }

    public float a(float f) {
        return (float) this.a.a(f);
    }

    public String toString() {
        String str = this.b;
        DecimalFormat decimalFormat = new DecimalFormat(C0059ao.a(8200));
        Iterator<b> it = this.f.iterator();
        while (it.hasNext()) {
            b next = it.next();
            str = str + C0059ao.a(8201) + next.a + C0059ao.a(8202) + decimalFormat.format(next.b) + C0059ao.a(8203);
        }
        return str;
    }
}
