package in.org.npci.commonlibrary;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class c extends Exception {
    public int b;
    public String c;

    public c() {
    }

    public c(d dVar) {
        super(dVar.a());
        this.b = dVar.b();
        this.c = dVar.a();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return C0059ao.a(5866) + this.b + C0059ao.a(5867) + this.c;
    }
}
