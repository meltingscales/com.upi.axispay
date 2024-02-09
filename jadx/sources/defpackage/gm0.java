package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: gm0  reason: default package */
/* loaded from: classes.dex */
public abstract class gm0 extends rl0 implements an0 {
    public gm0() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gm0) {
            gm0 gm0Var = (gm0) obj;
            return getOwner().equals(gm0Var.getOwner()) && getName().equals(gm0Var.getName()) && getSignature().equals(gm0Var.getSignature()) && yl0.a(getBoundReceiver(), gm0Var.getBoundReceiver());
        } else if (obj instanceof an0) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // defpackage.an0
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // defpackage.an0
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        vm0 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return C0059ao.a(12536) + getName() + C0059ao.a(12537);
    }

    public gm0(Object obj) {
        super(obj);
    }

    @Override // defpackage.rl0
    public an0 getReflected() {
        return (an0) super.getReflected();
    }

    public gm0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }
}
