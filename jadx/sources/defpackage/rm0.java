package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: rm0  reason: default package */
/* loaded from: classes.dex */
public final class rm0 extends pm0 {
    public static final a f = new a(null);
    public static final rm0 g = new rm0(1, 0);

    /* compiled from: AxisPay */
    /* renamed from: rm0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(vl0 vl0Var) {
            this();
        }

        public final rm0 a() {
            return rm0.g;
        }
    }

    public rm0(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // defpackage.pm0
    public boolean equals(Object obj) {
        if (obj instanceof rm0) {
            if (!isEmpty() || !((rm0) obj).isEmpty()) {
                rm0 rm0Var = (rm0) obj;
                if (a() != rm0Var.a() || b() != rm0Var.b()) {
                }
            }
            return true;
        }
        return false;
    }

    public Integer f() {
        return Integer.valueOf(b());
    }

    public Integer g() {
        return Integer.valueOf(a());
    }

    @Override // defpackage.pm0
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    @Override // defpackage.pm0
    public boolean isEmpty() {
        return a() > b();
    }

    @Override // defpackage.pm0
    public String toString() {
        return a() + C0059ao.a(12512) + b();
    }
}
