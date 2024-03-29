package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.z.b {
    public int A;
    public int B;
    public boolean C;
    public SavedState D;
    public final a E;
    public final b F;
    public int G;
    public int[] H;
    public int s;
    public c t;
    public dj u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* compiled from: AxisPay */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;
        public int c;
        public boolean d;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public boolean a() {
            return this.b >= 0;
        }

        public void c() {
            this.b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.b = savedState.b;
            this.c = savedState.c;
            this.d = savedState.d;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class a {
        public dj a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            e();
        }

        public void a() {
            int m;
            if (this.d) {
                m = this.a.i();
            } else {
                m = this.a.m();
            }
            this.c = m;
        }

        public void b(View view, int i) {
            if (this.d) {
                this.c = this.a.d(view) + this.a.o();
            } else {
                this.c = this.a.g(view);
            }
            this.b = i;
        }

        public void c(View view, int i) {
            int o = this.a.o();
            if (o >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int i2 = (this.a.i() - o) - this.a.d(view);
                this.c = this.a.i() - i2;
                if (i2 > 0) {
                    int e = this.c - this.a.e(view);
                    int m = this.a.m();
                    int min = e - (m + Math.min(this.a.g(view) - m, 0));
                    if (min < 0) {
                        this.c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.a.g(view);
            int m2 = g - this.a.m();
            this.c = g;
            if (m2 > 0) {
                int i3 = (this.a.i() - Math.min(0, (this.a.i() - o) - this.a.d(view))) - (g + this.a.e(view));
                if (i3 < 0) {
                    this.c -= Math.min(m2, -i3);
                }
            }
        }

        public boolean d(View view, RecyclerView.a0 a0Var) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < a0Var.b();
        }

        public void e() {
            this.b = -1;
            this.c = RecyclerView.UNDEFINED_DURATION;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        public void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class c {
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean j;
        public int k;
        public boolean m;
        public boolean a = true;
        public int h = 0;
        public int i = 0;
        public List<RecyclerView.d0> l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f = f(view);
            if (f == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.q) f.getLayoutParams()).a();
            }
        }

        public boolean c(RecyclerView.a0 a0Var) {
            int i = this.d;
            return i >= 0 && i < a0Var.b();
        }

        public View d(RecyclerView.w wVar) {
            if (this.l != null) {
                return e();
            }
            View o = wVar.o(this.d);
            this.d += this.e;
            return o;
        }

        public final View e() {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                View view = this.l.get(i).b;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int a;
            int size = this.l.size();
            View view2 = null;
            int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.l.get(i2).b;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (a = (qVar.a() - this.d) * this.e) >= 0 && a < i) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i = a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public void A2(boolean z) {
        g(null);
        if (z == this.w) {
            return;
        }
        this.w = z;
        t1();
    }

    public void B2(boolean z) {
        g(null);
        if (this.y == z) {
            return;
        }
        this.y = z;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View C(int i) {
        int J = J();
        if (J == 0) {
            return null;
        }
        int h0 = i - h0(I(0));
        if (h0 >= 0 && h0 < J) {
            View I = I(h0);
            if (h0(I) == i) {
                return I;
            }
        }
        return super.C(i);
    }

    public final boolean C2(RecyclerView.w wVar, RecyclerView.a0 a0Var, a aVar) {
        View g2;
        boolean z = false;
        if (J() == 0) {
            return false;
        }
        View V = V();
        if (V != null && aVar.d(V, a0Var)) {
            aVar.c(V, h0(V));
            return true;
        }
        boolean z2 = this.v;
        boolean z3 = this.y;
        if (z2 == z3 && (g2 = g2(wVar, a0Var, aVar.d, z3)) != null) {
            aVar.b(g2, h0(g2));
            if (!a0Var.e() && M1()) {
                int g = this.u.g(g2);
                int d = this.u.d(g2);
                int m = this.u.m();
                int i = this.u.i();
                boolean z4 = d <= m && g < m;
                if (g >= i && d > i) {
                    z = true;
                }
                if (z4 || z) {
                    if (aVar.d) {
                        m = i;
                    }
                    aVar.c = m;
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q D() {
        return new RecyclerView.q(-2, -2);
    }

    public final boolean D2(RecyclerView.a0 a0Var, a aVar) {
        int i;
        int g;
        if (!a0Var.e() && (i = this.A) != -1) {
            if (i >= 0 && i < a0Var.b()) {
                aVar.b = this.A;
                SavedState savedState = this.D;
                if (savedState != null && savedState.a()) {
                    boolean z = this.D.d;
                    aVar.d = z;
                    if (z) {
                        aVar.c = this.u.i() - this.D.c;
                    } else {
                        aVar.c = this.u.m() + this.D.c;
                    }
                    return true;
                } else if (this.B == Integer.MIN_VALUE) {
                    View C = C(this.A);
                    if (C != null) {
                        if (this.u.e(C) > this.u.n()) {
                            aVar.a();
                            return true;
                        } else if (this.u.g(C) - this.u.m() < 0) {
                            aVar.c = this.u.m();
                            aVar.d = false;
                            return true;
                        } else if (this.u.i() - this.u.d(C) < 0) {
                            aVar.c = this.u.i();
                            aVar.d = true;
                            return true;
                        } else {
                            if (aVar.d) {
                                g = this.u.d(C) + this.u.o();
                            } else {
                                g = this.u.g(C);
                            }
                            aVar.c = g;
                        }
                    } else {
                        if (J() > 0) {
                            aVar.d = (this.A < h0(I(0))) == this.x;
                        }
                        aVar.a();
                    }
                    return true;
                } else {
                    boolean z2 = this.x;
                    aVar.d = z2;
                    if (z2) {
                        aVar.c = this.u.i() - this.B;
                    } else {
                        aVar.c = this.u.m() + this.B;
                    }
                    return true;
                }
            }
            this.A = -1;
            this.B = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    public final void E2(RecyclerView.w wVar, RecyclerView.a0 a0Var, a aVar) {
        if (D2(a0Var, aVar) || C2(wVar, a0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.b = this.y ? a0Var.b() - 1 : 0;
    }

    public final void F2(int i, int i2, boolean z, RecyclerView.a0 a0Var) {
        int m;
        this.t.m = w2();
        this.t.f = i;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        N1(a0Var, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        boolean z2 = i == 1;
        c cVar = this.t;
        int i3 = z2 ? max2 : max;
        cVar.h = i3;
        if (!z2) {
            max = max2;
        }
        cVar.i = max;
        if (z2) {
            cVar.h = i3 + this.u.j();
            View j2 = j2();
            c cVar2 = this.t;
            cVar2.e = this.x ? -1 : 1;
            int h0 = h0(j2);
            c cVar3 = this.t;
            cVar2.d = h0 + cVar3.e;
            cVar3.b = this.u.d(j2);
            m = this.u.d(j2) - this.u.i();
        } else {
            View k2 = k2();
            this.t.h += this.u.m();
            c cVar4 = this.t;
            cVar4.e = this.x ? 1 : -1;
            int h02 = h0(k2);
            c cVar5 = this.t;
            cVar4.d = h02 + cVar5.e;
            cVar5.b = this.u.g(k2);
            m = (-this.u.g(k2)) + this.u.m();
        }
        c cVar6 = this.t;
        cVar6.c = i2;
        if (z) {
            cVar6.c = i2 - m;
        }
        cVar6.g = m;
    }

    public final void G2(int i, int i2) {
        this.t.c = this.u.i() - i2;
        c cVar = this.t;
        cVar.e = this.x ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = RecyclerView.UNDEFINED_DURATION;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean H1() {
        return (X() == 1073741824 || p0() == 1073741824 || !q0()) ? false : true;
    }

    public final void H2(a aVar) {
        G2(aVar.b, aVar.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.I0(recyclerView, wVar);
        if (this.C) {
            k1(wVar);
            wVar.c();
        }
    }

    public final void I2(int i, int i2) {
        this.t.c = i2 - this.u.m();
        c cVar = this.t;
        cVar.d = i;
        cVar.e = this.x ? 1 : -1;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = RecyclerView.UNDEFINED_DURATION;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View J0(View view, int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        int S1;
        View e2;
        View j2;
        x2();
        if (J() == 0 || (S1 = S1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        U1();
        F2(S1, (int) (this.u.n() * 0.33333334f), false, a0Var);
        c cVar = this.t;
        cVar.g = RecyclerView.UNDEFINED_DURATION;
        cVar.a = false;
        V1(wVar, cVar, a0Var, true);
        if (S1 == -1) {
            e2 = f2();
        } else {
            e2 = e2();
        }
        if (S1 == -1) {
            j2 = k2();
        } else {
            j2 = j2();
        }
        if (j2.hasFocusable()) {
            if (e2 == null) {
                return null;
            }
            return j2;
        }
        return e2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void J1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        bj bjVar = new bj(recyclerView.getContext());
        bjVar.p(i);
        K1(bjVar);
    }

    public final void J2(a aVar) {
        I2(aVar.b, aVar.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            accessibilityEvent.setFromIndex(Z1());
            accessibilityEvent.setToIndex(b2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean M1() {
        return this.D == null && this.v == this.y;
    }

    public void N1(RecyclerView.a0 a0Var, int[] iArr) {
        int i;
        int l2 = l2(a0Var);
        if (this.t.f == -1) {
            i = 0;
        } else {
            i = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i;
    }

    public void O1(RecyclerView.a0 a0Var, c cVar, RecyclerView.p.c cVar2) {
        int i = cVar.d;
        if (i < 0 || i >= a0Var.b()) {
            return;
        }
        cVar2.a(i, Math.max(0, cVar.g));
    }

    public final int P1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        U1();
        return gj.a(a0Var, this.u, Y1(!this.z, true), X1(!this.z, true), this, this.z);
    }

    public final int Q1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        U1();
        return gj.b(a0Var, this.u, Y1(!this.z, true), X1(!this.z, true), this, this.z, this.x);
    }

    public final int R1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        U1();
        return gj.c(a0Var, this.u, Y1(!this.z, true), X1(!this.z, true), this, this.z);
    }

    public int S1(int i) {
        if (i == 1) {
            return (this.s != 1 && n2()) ? 1 : -1;
        } else if (i == 2) {
            return (this.s != 1 && n2()) ? -1 : 1;
        } else if (i == 17) {
            if (this.s == 0) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i == 33) {
            if (this.s == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i != 66) {
            if (i == 130 && this.s == 1) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (this.s == 0) {
            return 1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    public c T1() {
        return new c();
    }

    public void U1() {
        if (this.t == null) {
            this.t = T1();
        }
    }

    public int V1(RecyclerView.w wVar, c cVar, RecyclerView.a0 a0Var, boolean z) {
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            s2(wVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.m && i3 <= 0) || !cVar.c(a0Var)) {
                break;
            }
            bVar.a();
            p2(wVar, a0Var, cVar, bVar);
            if (!bVar.b) {
                cVar.b += bVar.a * cVar.f;
                if (!bVar.c || cVar.l != null || !a0Var.e()) {
                    int i4 = cVar.c;
                    int i5 = bVar.a;
                    cVar.c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.a;
                    cVar.g = i7;
                    int i8 = cVar.c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    s2(wVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    public final View W1() {
        return c2(0, J());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int h2;
        int i5;
        View C;
        int g;
        int i6;
        int i7 = -1;
        if ((this.D != null || this.A != -1) && a0Var.b() == 0) {
            k1(wVar);
            return;
        }
        SavedState savedState = this.D;
        if (savedState != null && savedState.a()) {
            this.A = this.D.b;
        }
        U1();
        this.t.a = false;
        x2();
        View V = V();
        a aVar = this.E;
        if (aVar.e && this.A == -1 && this.D == null) {
            if (V != null && (this.u.g(V) >= this.u.i() || this.u.d(V) <= this.u.m())) {
                this.E.c(V, h0(V));
            }
        } else {
            aVar.e();
            a aVar2 = this.E;
            aVar2.d = this.x ^ this.y;
            E2(wVar, a0Var, aVar2);
            this.E.e = true;
        }
        c cVar = this.t;
        cVar.f = cVar.k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        N1(a0Var, iArr);
        int max = Math.max(0, this.H[0]) + this.u.m();
        int max2 = Math.max(0, this.H[1]) + this.u.j();
        if (a0Var.e() && (i5 = this.A) != -1 && this.B != Integer.MIN_VALUE && (C = C(i5)) != null) {
            if (this.x) {
                i6 = this.u.i() - this.u.d(C);
                g = this.B;
            } else {
                g = this.u.g(C) - this.u.m();
                i6 = this.B;
            }
            int i8 = i6 - g;
            if (i8 > 0) {
                max += i8;
            } else {
                max2 -= i8;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.d ? !this.x : this.x) {
            i7 = 1;
        }
        r2(wVar, a0Var, aVar3, i7);
        w(wVar);
        this.t.m = w2();
        this.t.j = a0Var.e();
        this.t.i = 0;
        a aVar4 = this.E;
        if (aVar4.d) {
            J2(aVar4);
            c cVar2 = this.t;
            cVar2.h = max;
            V1(wVar, cVar2, a0Var, false);
            c cVar3 = this.t;
            i2 = cVar3.b;
            int i9 = cVar3.d;
            int i10 = cVar3.c;
            if (i10 > 0) {
                max2 += i10;
            }
            H2(this.E);
            c cVar4 = this.t;
            cVar4.h = max2;
            cVar4.d += cVar4.e;
            V1(wVar, cVar4, a0Var, false);
            c cVar5 = this.t;
            i = cVar5.b;
            int i11 = cVar5.c;
            if (i11 > 0) {
                I2(i9, i2);
                c cVar6 = this.t;
                cVar6.h = i11;
                V1(wVar, cVar6, a0Var, false);
                i2 = this.t.b;
            }
        } else {
            H2(aVar4);
            c cVar7 = this.t;
            cVar7.h = max2;
            V1(wVar, cVar7, a0Var, false);
            c cVar8 = this.t;
            i = cVar8.b;
            int i12 = cVar8.d;
            int i13 = cVar8.c;
            if (i13 > 0) {
                max += i13;
            }
            J2(this.E);
            c cVar9 = this.t;
            cVar9.h = max;
            cVar9.d += cVar9.e;
            V1(wVar, cVar9, a0Var, false);
            c cVar10 = this.t;
            i2 = cVar10.b;
            int i14 = cVar10.c;
            if (i14 > 0) {
                G2(i12, i);
                c cVar11 = this.t;
                cVar11.h = i14;
                V1(wVar, cVar11, a0Var, false);
                i = this.t.b;
            }
        }
        if (J() > 0) {
            if (this.x ^ this.y) {
                int h22 = h2(i, wVar, a0Var, true);
                i3 = i2 + h22;
                i4 = i + h22;
                h2 = i2(i3, wVar, a0Var, false);
            } else {
                int i22 = i2(i2, wVar, a0Var, true);
                i3 = i2 + i22;
                i4 = i + i22;
                h2 = h2(i4, wVar, a0Var, false);
            }
            i2 = i3 + h2;
            i = i4 + h2;
        }
        q2(wVar, a0Var, i2, i);
        if (!a0Var.e()) {
            this.u.s();
        } else {
            this.E.e();
        }
        this.v = this.y;
    }

    public View X1(boolean z, boolean z2) {
        if (this.x) {
            return d2(0, J(), z, z2);
        }
        return d2(J() - 1, -1, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView.a0 a0Var) {
        super.Y0(a0Var);
        this.D = null;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.E.e();
    }

    public View Y1(boolean z, boolean z2) {
        if (this.x) {
            return d2(J() - 1, -1, z, z2);
        }
        return d2(0, J(), z, z2);
    }

    public int Z1() {
        View d2 = d2(0, J(), false, true);
        if (d2 == null) {
            return -1;
        }
        return h0(d2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i) {
        if (J() == 0) {
            return null;
        }
        int i2 = (i < h0(I(0))) != this.x ? -1 : 1;
        if (this.s == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    public final View a2() {
        return c2(J() - 1, -1);
    }

    public int b2() {
        View d2 = d2(J() - 1, -1, false, true);
        if (d2 == null) {
            return -1;
        }
        return h0(d2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.D = savedState;
            if (this.A != -1) {
                savedState.c();
            }
            t1();
        }
    }

    public View c2(int i, int i2) {
        int i3;
        int i4;
        U1();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return I(i);
        }
        if (this.u.g(I(i)) < this.u.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.s == 0) {
            return this.e.a(i, i2, i3, i4);
        }
        return this.f.a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable d1() {
        if (this.D != null) {
            return new SavedState(this.D);
        }
        SavedState savedState = new SavedState();
        if (J() > 0) {
            U1();
            boolean z = this.v ^ this.x;
            savedState.d = z;
            if (z) {
                View j2 = j2();
                savedState.c = this.u.i() - this.u.d(j2);
                savedState.b = h0(j2);
            } else {
                View k2 = k2();
                savedState.b = h0(k2);
                savedState.c = this.u.g(k2) - this.u.m();
            }
        } else {
            savedState.c();
        }
        return savedState;
    }

    public View d2(int i, int i2, boolean z, boolean z2) {
        U1();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        if (this.s == 0) {
            return this.e.a(i, i2, i3, i4);
        }
        return this.f.a(i, i2, i3, i4);
    }

    public final View e2() {
        return this.x ? W1() : a2();
    }

    public final View f2() {
        return this.x ? a2() : W1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g(String str) {
        if (this.D == null) {
            super.g(str);
        }
    }

    public View g2(RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z, boolean z2) {
        int i;
        int i2;
        U1();
        int J = J();
        int i3 = -1;
        if (z2) {
            i = J() - 1;
            i2 = -1;
        } else {
            i3 = J;
            i = 0;
            i2 = 1;
        }
        int b2 = a0Var.b();
        int m = this.u.m();
        int i4 = this.u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i != i3) {
            View I = I(i);
            int h0 = h0(I);
            int g = this.u.g(I);
            int d = this.u.d(I);
            if (h0 >= 0 && h0 < b2) {
                if (!((RecyclerView.q) I.getLayoutParams()).c()) {
                    boolean z3 = d <= m && g < m;
                    boolean z4 = g >= i4 && d > i4;
                    if (!z3 && !z4) {
                        return I;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = I;
                        }
                        view2 = I;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = I;
                        }
                        view2 = I;
                    }
                } else if (view3 == null) {
                    view3 = I;
                }
            }
            i += i2;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int h2(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z) {
        int i2;
        int i3 = this.u.i() - i;
        if (i3 > 0) {
            int i4 = -y2(-i3, wVar, a0Var);
            int i5 = i + i4;
            if (!z || (i2 = this.u.i() - i5) <= 0) {
                return i4;
            }
            this.u.r(i2);
            return i2 + i4;
        }
        return 0;
    }

    public final int i2(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z) {
        int m;
        int m2 = i - this.u.m();
        if (m2 > 0) {
            int i2 = -y2(m2, wVar, a0Var);
            int i3 = i + i2;
            if (!z || (m = i3 - this.u.m()) <= 0) {
                return i2;
            }
            this.u.r(-m);
            return i2 - m;
        }
        return 0;
    }

    public final View j2() {
        return I(this.x ? 0 : J() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean k() {
        return this.s == 0;
    }

    public final View k2() {
        return I(this.x ? J() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.s == 1;
    }

    @Deprecated
    public int l2(RecyclerView.a0 a0Var) {
        if (a0Var.d()) {
            return this.u.n();
        }
        return 0;
    }

    public int m2() {
        return this.s;
    }

    public boolean n2() {
        return Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.p.c cVar) {
        if (this.s != 0) {
            i = i2;
        }
        if (J() == 0 || i == 0) {
            return;
        }
        U1();
        F2(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
        O1(a0Var, this.t, cVar);
    }

    public boolean o2() {
        return this.z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p(int i, RecyclerView.p.c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.D;
        if (savedState != null && savedState.a()) {
            SavedState savedState2 = this.D;
            z = savedState2.d;
            i2 = savedState2.b;
        } else {
            x2();
            z = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.G && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    public void p2(RecyclerView.w wVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int f;
        View d = cVar.d(wVar);
        if (d == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) d.getLayoutParams();
        if (cVar.l == null) {
            if (this.x == (cVar.f == -1)) {
                d(d);
            } else {
                e(d, 0);
            }
        } else {
            if (this.x == (cVar.f == -1)) {
                b(d);
            } else {
                c(d, 0);
            }
        }
        A0(d, 0, 0);
        bVar.a = this.u.e(d);
        if (this.s == 1) {
            if (n2()) {
                f = o0() - f0();
                i4 = f - this.u.f(d);
            } else {
                i4 = e0();
                f = this.u.f(d) + i4;
            }
            if (cVar.f == -1) {
                int i5 = cVar.b;
                i3 = i5;
                i2 = f;
                i = i5 - bVar.a;
            } else {
                int i6 = cVar.b;
                i = i6;
                i2 = f;
                i3 = bVar.a + i6;
            }
        } else {
            int g0 = g0();
            int f2 = this.u.f(d) + g0;
            if (cVar.f == -1) {
                int i7 = cVar.b;
                i2 = i7;
                i = g0;
                i3 = f2;
                i4 = i7 - bVar.a;
            } else {
                int i8 = cVar.b;
                i = g0;
                i2 = bVar.a + i8;
                i3 = f2;
                i4 = i8;
            }
        }
        z0(d, i4, i, i2, i3);
        if (qVar.c() || qVar.b()) {
            bVar.c = true;
        }
        bVar.d = d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int q(RecyclerView.a0 a0Var) {
        return P1(a0Var);
    }

    public final void q2(RecyclerView.w wVar, RecyclerView.a0 a0Var, int i, int i2) {
        if (!a0Var.g() || J() == 0 || a0Var.e() || !M1()) {
            return;
        }
        List<RecyclerView.d0> k = wVar.k();
        int size = k.size();
        int h0 = h0(I(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.d0 d0Var = k.get(i5);
            if (!d0Var.x()) {
                if ((d0Var.o() < h0) != this.x ? true : true) {
                    i3 += this.u.e(d0Var.b);
                } else {
                    i4 += this.u.e(d0Var.b);
                }
            }
        }
        this.t.l = k;
        if (i3 > 0) {
            I2(h0(k2()), i);
            c cVar = this.t;
            cVar.h = i3;
            cVar.c = 0;
            cVar.a();
            V1(wVar, this.t, a0Var, false);
        }
        if (i4 > 0) {
            G2(h0(j2()), i2);
            c cVar2 = this.t;
            cVar2.h = i4;
            cVar2.c = 0;
            cVar2.a();
            V1(wVar, this.t, a0Var, false);
        }
        this.t.l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.a0 a0Var) {
        return Q1(a0Var);
    }

    public void r2(RecyclerView.w wVar, RecyclerView.a0 a0Var, a aVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.a0 a0Var) {
        return R1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean s0() {
        return true;
    }

    public final void s2(RecyclerView.w wVar, c cVar) {
        if (!cVar.a || cVar.m) {
            return;
        }
        int i = cVar.g;
        int i2 = cVar.i;
        if (cVar.f == -1) {
            u2(wVar, i, i2);
        } else {
            v2(wVar, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.a0 a0Var) {
        return P1(a0Var);
    }

    public final void t2(RecyclerView.w wVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                n1(i, wVar);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            n1(i3, wVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.a0 a0Var) {
        return Q1(a0Var);
    }

    public final void u2(RecyclerView.w wVar, int i, int i2) {
        int J = J();
        if (i < 0) {
            return;
        }
        int h = (this.u.h() - i) + i2;
        if (this.x) {
            for (int i3 = 0; i3 < J; i3++) {
                View I = I(i3);
                if (this.u.g(I) < h || this.u.q(I) < h) {
                    t2(wVar, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = J - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View I2 = I(i5);
            if (this.u.g(I2) < h || this.u.q(I2) < h) {
                t2(wVar, i4, i5);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.a0 a0Var) {
        return R1(a0Var);
    }

    public final void v2(RecyclerView.w wVar, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int J = J();
        if (!this.x) {
            for (int i4 = 0; i4 < J; i4++) {
                View I = I(i4);
                if (this.u.d(I) > i3 || this.u.p(I) > i3) {
                    t2(wVar, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = J - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View I2 = I(i6);
            if (this.u.d(I2) > i3 || this.u.p(I2) > i3) {
                t2(wVar, i5, i6);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w1(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (this.s == 1) {
            return 0;
        }
        return y2(i, wVar, a0Var);
    }

    public boolean w2() {
        return this.u.k() == 0 && this.u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void x1(int i) {
        this.A = i;
        this.B = RecyclerView.UNDEFINED_DURATION;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.c();
        }
        t1();
    }

    public final void x2() {
        if (this.s != 1 && n2()) {
            this.x = !this.w;
        } else {
            this.x = this.w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y1(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (this.s == 0) {
            return 0;
        }
        return y2(i, wVar, a0Var);
    }

    public int y2(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (J() == 0 || i == 0) {
            return 0;
        }
        U1();
        this.t.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        F2(i2, abs, true, a0Var);
        c cVar = this.t;
        int V1 = cVar.g + V1(wVar, cVar, a0Var, false);
        if (V1 < 0) {
            return 0;
        }
        if (abs > V1) {
            i = i2 * V1;
        }
        this.u.r(-i);
        this.t.k = i;
        return i;
    }

    public void z2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        g(null);
        if (i != this.s || this.u == null) {
            dj b2 = dj.b(this, i);
            this.u = b2;
            this.E.a = b2;
            this.s = i;
            t1();
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        z2(i);
        A2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.p.d i0 = RecyclerView.p.i0(context, attributeSet, i, i2);
        z2(i0.a);
        A2(i0.c);
        B2(i0.d);
    }
}
