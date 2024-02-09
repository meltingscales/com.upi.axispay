package androidx.lifecycle;

import defpackage.bf;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements cf {
    public final af[] a;

    public CompositeGeneratedAdaptersObserver(af[] afVarArr) {
        this.a = afVarArr;
    }

    @Override // defpackage.cf
    public void d(ef efVar, bf.b bVar) {
        Cif cif = new Cif();
        for (af afVar : this.a) {
            afVar.a(efVar, bVar, false, cif);
        }
        for (af afVar2 : this.a) {
            afVar2.a(efVar, bVar, true, cif);
        }
    }
}
