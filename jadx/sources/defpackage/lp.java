package defpackage;

import defpackage.rp;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: lp  reason: default package */
/* loaded from: classes.dex */
public final class lp extends rp {
    public final rp.b a;
    public final hp b;

    /* compiled from: AxisPay */
    /* renamed from: lp$b */
    /* loaded from: classes.dex */
    public static final class b extends rp.a {
        public rp.b a;
        public hp b;

        @Override // defpackage.rp.a
        public rp a() {
            return new lp(this.a, this.b);
        }

        @Override // defpackage.rp.a
        public rp.a b(hp hpVar) {
            this.b = hpVar;
            return this;
        }

        @Override // defpackage.rp.a
        public rp.a c(rp.b bVar) {
            this.a = bVar;
            return this;
        }
    }

    @Override // defpackage.rp
    public hp b() {
        return this.b;
    }

    @Override // defpackage.rp
    public rp.b c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rp) {
            rp rpVar = (rp) obj;
            rp.b bVar = this.a;
            if (bVar != null ? bVar.equals(rpVar.c()) : rpVar.c() == null) {
                hp hpVar = this.b;
                if (hpVar == null) {
                    if (rpVar.b() == null) {
                        return true;
                    }
                } else if (hpVar.equals(rpVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        rp.b bVar = this.a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        hp hpVar = this.b;
        return hashCode ^ (hpVar != null ? hpVar.hashCode() : 0);
    }

    public String toString() {
        return C0059ao.a(12439) + this.a + C0059ao.a(12440) + this.b + C0059ao.a(12441);
    }

    public lp(rp.b bVar, hp hpVar) {
        this.a = bVar;
        this.b = hpVar;
    }
}
