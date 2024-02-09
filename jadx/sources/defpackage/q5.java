package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.e5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: q5  reason: default package */
/* loaded from: classes.dex */
public class q5 {
    public int b;
    public boolean c;
    public final r5 d;
    public final b e;
    public q5 f;
    public e5 i;
    public HashSet<q5> a = null;
    public int g = 0;
    public int h = RecyclerView.UNDEFINED_DURATION;

    /* compiled from: AxisPay */
    /* renamed from: q5$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: q5$b */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public q5(r5 r5Var, b bVar) {
        this.d = r5Var;
        this.e = bVar;
    }

    public boolean a(q5 q5Var, int i, int i2, boolean z) {
        if (q5Var == null) {
            p();
            return true;
        } else if (z || o(q5Var)) {
            this.f = q5Var;
            if (q5Var.a == null) {
                q5Var.a = new HashSet<>();
            }
            HashSet<q5> hashSet = this.f.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.g = i;
            this.h = i2;
            return true;
        } else {
            return false;
        }
    }

    public void b(int i, ArrayList<n6> arrayList, n6 n6Var) {
        HashSet<q5> hashSet = this.a;
        if (hashSet != null) {
            Iterator<q5> it = hashSet.iterator();
            while (it.hasNext()) {
                h6.a(it.next().d, i, arrayList, n6Var);
            }
        }
    }

    public HashSet<q5> c() {
        return this.a;
    }

    public int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public int e() {
        q5 q5Var;
        if (this.d.T() == 8) {
            return 0;
        }
        if (this.h != Integer.MIN_VALUE && (q5Var = this.f) != null && q5Var.d.T() == 8) {
            return this.h;
        }
        return this.g;
    }

    public final q5 f() {
        switch (a.a[this.e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.d.N;
            case 3:
                return this.d.L;
            case 4:
                return this.d.O;
            case 5:
                return this.d.M;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public r5 g() {
        return this.d;
    }

    public e5 h() {
        return this.i;
    }

    public q5 i() {
        return this.f;
    }

    public b j() {
        return this.e;
    }

    public boolean k() {
        HashSet<q5> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator<q5> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet<q5> hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.c;
    }

    public boolean n() {
        return this.f != null;
    }

    public boolean o(q5 q5Var) {
        boolean z = false;
        if (q5Var == null) {
            return false;
        }
        b j = q5Var.j();
        b bVar = this.e;
        if (j == bVar) {
            return bVar != b.BASELINE || (q5Var.g().X() && g().X());
        }
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return (j == b.BASELINE || j == b.CENTER_X || j == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = j == b.LEFT || j == b.RIGHT;
                if (q5Var.g() instanceof t5) {
                    if (z2 || j == b.CENTER_X) {
                        z = true;
                    }
                    return z;
                }
                return z2;
            case 4:
            case 5:
                boolean z3 = j == b.TOP || j == b.BOTTOM;
                if (q5Var.g() instanceof t5) {
                    if (z3 || j == b.CENTER_Y) {
                        z = true;
                    }
                    return z;
                }
                return z3;
            case 6:
                return (j == b.LEFT || j == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public void p() {
        HashSet<q5> hashSet;
        q5 q5Var = this.f;
        if (q5Var != null && (hashSet = q5Var.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = RecyclerView.UNDEFINED_DURATION;
        this.c = false;
        this.b = 0;
    }

    public void q() {
        this.c = false;
        this.b = 0;
    }

    public void r(y4 y4Var) {
        e5 e5Var = this.i;
        if (e5Var == null) {
            this.i = new e5(e5.a.UNRESTRICTED, null);
        } else {
            e5Var.e();
        }
    }

    public void s(int i) {
        this.b = i;
        this.c = true;
    }

    public String toString() {
        return this.d.r() + C0059ao.a(14873) + this.e.toString();
    }
}
