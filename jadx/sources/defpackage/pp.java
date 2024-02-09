package defpackage;

import defpackage.vp;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: pp  reason: default package */
/* loaded from: classes.dex */
public final class pp extends vp {
    public final vp.c a;
    public final vp.b b;

    /* compiled from: AxisPay */
    /* renamed from: pp$b */
    /* loaded from: classes.dex */
    public static final class b extends vp.a {
        public vp.c a;
        public vp.b b;

        @Override // defpackage.vp.a
        public vp a() {
            return new pp(this.a, this.b);
        }

        @Override // defpackage.vp.a
        public vp.a b(vp.b bVar) {
            this.b = bVar;
            return this;
        }

        @Override // defpackage.vp.a
        public vp.a c(vp.c cVar) {
            this.a = cVar;
            return this;
        }
    }

    @Override // defpackage.vp
    public vp.b b() {
        return this.b;
    }

    @Override // defpackage.vp
    public vp.c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vp) {
            vp vpVar = (vp) obj;
            vp.c cVar = this.a;
            if (cVar != null ? cVar.equals(vpVar.c()) : vpVar.c() == null) {
                vp.b bVar = this.b;
                if (bVar == null) {
                    if (vpVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(vpVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        vp.c cVar = this.a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        vp.b bVar = this.b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return C0059ao.a(15434) + this.a + C0059ao.a(15435) + this.b + C0059ao.a(15436);
    }

    public pp(vp.c cVar, vp.b bVar) {
        this.a = cVar;
        this.b = bVar;
    }
}
