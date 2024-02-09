package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.z.b {
    public BitSet B;
    public boolean G;
    public boolean H;
    public SavedState I;
    public int J;
    public int[] O;
    public d[] t;
    public dj u;
    public dj v;
    public int w;
    public int x;
    public final aj y;
    public int s = -1;
    public boolean z = false;
    public boolean A = false;
    public int C = -1;
    public int D = RecyclerView.UNDEFINED_DURATION;
    public LazySpanLookup E = new LazySpanLookup();
    public int F = 2;
    public final Rect K = new Rect();
    public final b L = new b();
    public boolean M = false;
    public boolean N = true;
    public final Runnable P = new a();

    /* compiled from: AxisPay */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;
        public int c;
        public int d;
        public int[] e;
        public int f;
        public int[] g;
        public List<LazySpanLookup.FullSpanItem> h;
        public boolean i;
        public boolean j;
        public boolean k;

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

        public void a() {
            this.e = null;
            this.d = 0;
            this.b = -1;
            this.c = -1;
        }

        public void c() {
            this.e = null;
            this.d = 0;
            this.f = 0;
            this.g = null;
            this.h = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            if (this.d > 0) {
                parcel.writeIntArray(this.e);
            }
            parcel.writeInt(this.f);
            if (this.f > 0) {
                parcel.writeIntArray(this.g);
            }
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
            parcel.writeList(this.h);
        }

        public SavedState(Parcel parcel) {
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            int readInt = parcel.readInt();
            this.d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.g = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.k = parcel.readInt() == 1;
            this.h = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.d = savedState.d;
            this.b = savedState.b;
            this.c = savedState.c;
            this.e = savedState.e;
            this.f = savedState.f;
            this.g = savedState.g;
            this.i = savedState.i;
            this.j = savedState.j;
            this.k = savedState.k;
            this.h = savedState.h;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.T1();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            c();
        }

        public void a() {
            this.b = this.c ? StaggeredGridLayoutManager.this.u.i() : StaggeredGridLayoutManager.this.u.m();
        }

        public void b(int i) {
            if (this.c) {
                this.b = StaggeredGridLayoutManager.this.u.i() - i;
            } else {
                this.b = StaggeredGridLayoutManager.this.u.m() + i;
            }
        }

        public void c() {
            this.a = -1;
            this.b = RecyclerView.UNDEFINED_DURATION;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f;
            if (iArr == null || iArr.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f[i] = dVarArr[i].p(RecyclerView.UNDEFINED_DURATION);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class c extends RecyclerView.q {
        public d e;
        public boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f;
        }

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class d {
        public ArrayList<View> a = new ArrayList<>();
        public int b = RecyclerView.UNDEFINED_DURATION;
        public int c = RecyclerView.UNDEFINED_DURATION;
        public int d = 0;
        public final int e;

        public d(int i) {
            this.e = i;
        }

        public void a(View view) {
            c n = n(view);
            n.e = this;
            this.a.add(view);
            this.c = RecyclerView.UNDEFINED_DURATION;
            if (this.a.size() == 1) {
                this.b = RecyclerView.UNDEFINED_DURATION;
            }
            if (n.c() || n.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        public void b(boolean z, int i) {
            int p;
            if (z) {
                p = l(RecyclerView.UNDEFINED_DURATION);
            } else {
                p = p(RecyclerView.UNDEFINED_DURATION);
            }
            e();
            if (p == Integer.MIN_VALUE) {
                return;
            }
            if (!z || p >= StaggeredGridLayoutManager.this.u.i()) {
                if (z || p <= StaggeredGridLayoutManager.this.u.m()) {
                    if (i != Integer.MIN_VALUE) {
                        p += i;
                    }
                    this.c = p;
                    this.b = p;
                }
            }
        }

        public void c() {
            LazySpanLookup.FullSpanItem f;
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            c n = n(view);
            this.c = StaggeredGridLayoutManager.this.u.d(view);
            if (n.f && (f = StaggeredGridLayoutManager.this.E.f(n.a())) != null && f.c == 1) {
                this.c += f.a(this.e);
            }
        }

        public void d() {
            LazySpanLookup.FullSpanItem f;
            View view = this.a.get(0);
            c n = n(view);
            this.b = StaggeredGridLayoutManager.this.u.g(view);
            if (n.f && (f = StaggeredGridLayoutManager.this.E.f(n.a())) != null && f.c == -1) {
                this.b -= f.a(this.e);
            }
        }

        public void e() {
            this.a.clear();
            q();
            this.d = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.z) {
                return i(this.a.size() - 1, -1, true);
            }
            return i(0, this.a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.z) {
                return i(0, this.a.size(), true);
            }
            return i(this.a.size() - 1, -1, true);
        }

        public int h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.u.m();
            int i3 = StaggeredGridLayoutManager.this.u.i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.a.get(i);
                int g = StaggeredGridLayoutManager.this.u.g(view);
                int d = StaggeredGridLayoutManager.this.u.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g >= i3 : g > i3;
                if (!z3 ? d > m : d >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (g >= m && d <= i3) {
                            return StaggeredGridLayoutManager.this.h0(view);
                        }
                    } else if (z2) {
                        return StaggeredGridLayoutManager.this.h0(view);
                    } else {
                        if (g < m || d > i3) {
                            return StaggeredGridLayoutManager.this.h0(view);
                        }
                    }
                }
                i += i4;
            }
            return -1;
        }

        public int i(int i, int i2, boolean z) {
            return h(i, i2, false, false, z);
        }

        public int j() {
            return this.d;
        }

        public int k() {
            int i = this.c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            c();
            return this.c;
        }

        public int l(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            c();
            return this.c;
        }

        public View m(int i, int i2) {
            View view = null;
            if (i2 == -1) {
                int size = this.a.size();
                int i3 = 0;
                while (i3 < size) {
                    View view2 = this.a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.h0(view2) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.h0(view2) >= i) || !view2.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view2;
                }
            } else {
                int size2 = this.a.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.h0(view3) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.h0(view3) <= i) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        public int o() {
            int i = this.b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            d();
            return this.b;
        }

        public int p(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            d();
            return this.b;
        }

        public void q() {
            this.b = RecyclerView.UNDEFINED_DURATION;
            this.c = RecyclerView.UNDEFINED_DURATION;
        }

        public void r(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2 + i;
            }
            int i3 = this.c;
            if (i3 != Integer.MIN_VALUE) {
                this.c = i3 + i;
            }
        }

        public void s() {
            int size = this.a.size();
            View remove = this.a.remove(size - 1);
            c n = n(remove);
            n.e = null;
            if (n.c() || n.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            if (size == 1) {
                this.b = RecyclerView.UNDEFINED_DURATION;
            }
            this.c = RecyclerView.UNDEFINED_DURATION;
        }

        public void t() {
            View remove = this.a.remove(0);
            c n = n(remove);
            n.e = null;
            if (this.a.size() == 0) {
                this.c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n.c() || n.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            this.b = RecyclerView.UNDEFINED_DURATION;
        }

        public void u(View view) {
            c n = n(view);
            n.e = this;
            this.a.add(0, view);
            this.b = RecyclerView.UNDEFINED_DURATION;
            if (this.a.size() == 1) {
                this.c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n.c() || n.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        public void v(int i) {
            this.b = i;
            this.c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.p.d i0 = RecyclerView.p.i0(context, attributeSet, i, i2);
        I2(i0.a);
        K2(i0.b);
        J2(i0.c);
        this.y = new aj();
        b2();
    }

    public final void A2(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].u(view);
        }
    }

    public final void B2(RecyclerView.w wVar, aj ajVar) {
        int min;
        int min2;
        if (!ajVar.a || ajVar.i) {
            return;
        }
        if (ajVar.b == 0) {
            if (ajVar.e == -1) {
                C2(wVar, ajVar.g);
            } else {
                D2(wVar, ajVar.f);
            }
        } else if (ajVar.e == -1) {
            int i = ajVar.f;
            int n2 = i - n2(i);
            if (n2 < 0) {
                min2 = ajVar.g;
            } else {
                min2 = ajVar.g - Math.min(n2, ajVar.b);
            }
            C2(wVar, min2);
        } else {
            int o2 = o2(ajVar.g) - ajVar.g;
            if (o2 < 0) {
                min = ajVar.f;
            } else {
                min = Math.min(o2, ajVar.b) + ajVar.f;
            }
            D2(wVar, min);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void C0(int i) {
        super.C0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    public final void C2(RecyclerView.w wVar, int i) {
        for (int J = J() - 1; J >= 0; J--) {
            View I = I(J);
            if (this.u.g(I) < i || this.u.q(I) < i) {
                return;
            }
            c cVar = (c) I.getLayoutParams();
            if (cVar.f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].s();
                }
            } else if (cVar.e.a.size() == 1) {
                return;
            } else {
                cVar.e.s();
            }
            m1(I, wVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q D() {
        if (this.w == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void D0(int i) {
        super.D0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void D1(Rect rect, int i, int i2) {
        int n;
        int n2;
        int e0 = e0() + f0();
        int g0 = g0() + d0();
        if (this.w == 1) {
            n2 = RecyclerView.p.n(i2, rect.height() + g0, b0());
            n = RecyclerView.p.n(i, (this.x * this.s) + e0, c0());
        } else {
            n = RecyclerView.p.n(i, rect.width() + e0, c0());
            n2 = RecyclerView.p.n(i2, (this.x * this.s) + g0, b0());
        }
        C1(n, n2);
    }

    public final void D2(RecyclerView.w wVar, int i) {
        while (J() > 0) {
            View I = I(0);
            if (this.u.d(I) > i || this.u.p(I) > i) {
                return;
            }
            c cVar = (c) I.getLayoutParams();
            if (cVar.f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].t();
                }
            } else if (cVar.e.a.size() == 1) {
                return;
            } else {
                cVar.e.t();
            }
            m1(I, wVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void E0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.E.b();
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
    }

    public final void E2() {
        if (this.v.k() == 1073741824) {
            return;
        }
        float f = 0.0f;
        int J = J();
        for (int i = 0; i < J; i++) {
            View I = I(i);
            float e = this.v.e(I);
            if (e >= f) {
                if (((c) I.getLayoutParams()).e()) {
                    e = (e * 1.0f) / this.s;
                }
                f = Math.max(f, e);
            }
        }
        int i2 = this.x;
        int round = Math.round(f * this.s);
        if (this.v.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.v.n());
        }
        Q2(round);
        if (this.x == i2) {
            return;
        }
        for (int i3 = 0; i3 < J; i3++) {
            View I2 = I(i3);
            c cVar = (c) I2.getLayoutParams();
            if (!cVar.f) {
                if (u2() && this.w == 1) {
                    int i4 = this.s;
                    int i5 = cVar.e.e;
                    I2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.x) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = cVar.e.e;
                    int i7 = this.x * i6;
                    int i8 = i6 * i2;
                    if (this.w == 1) {
                        I2.offsetLeftAndRight(i7 - i8);
                    } else {
                        I2.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public final void F2() {
        if (this.w != 1 && u2()) {
            this.A = !this.z;
        } else {
            this.A = this.z;
        }
    }

    public int G2(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (J() == 0 || i == 0) {
            return 0;
        }
        z2(i, a0Var);
        int c2 = c2(wVar, this.y, a0Var);
        if (this.y.b >= c2) {
            i = i < 0 ? -c2 : c2;
        }
        this.u.r(-i);
        this.G = this.A;
        aj ajVar = this.y;
        ajVar.b = 0;
        B2(wVar, ajVar);
        return i;
    }

    public final void H2(int i) {
        aj ajVar = this.y;
        ajVar.e = i;
        ajVar.d = this.A != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.I0(recyclerView, wVar);
        o1(this.P);
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
        recyclerView.requestLayout();
    }

    public void I2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        g(null);
        if (i == this.w) {
            return;
        }
        this.w = i;
        dj djVar = this.u;
        this.u = this.v;
        this.v = djVar;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View J0(View view, int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        View B;
        int k2;
        int g;
        int g2;
        int g3;
        View m;
        if (J() == 0 || (B = B(view)) == null) {
            return null;
        }
        F2();
        int Y1 = Y1(i);
        if (Y1 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) B.getLayoutParams();
        boolean z = cVar.f;
        d dVar = cVar.e;
        if (Y1 == 1) {
            k2 = l2();
        } else {
            k2 = k2();
        }
        P2(k2, a0Var);
        H2(Y1);
        aj ajVar = this.y;
        ajVar.c = ajVar.d + k2;
        ajVar.b = (int) (this.u.n() * 0.33333334f);
        aj ajVar2 = this.y;
        ajVar2.h = true;
        ajVar2.a = false;
        c2(wVar, ajVar2, a0Var);
        this.G = this.A;
        if (z || (m = dVar.m(k2, Y1)) == null || m == B) {
            if (y2(Y1)) {
                for (int i2 = this.s - 1; i2 >= 0; i2--) {
                    View m2 = this.t[i2].m(k2, Y1);
                    if (m2 != null && m2 != B) {
                        return m2;
                    }
                }
            } else {
                for (int i3 = 0; i3 < this.s; i3++) {
                    View m3 = this.t[i3].m(k2, Y1);
                    if (m3 != null && m3 != B) {
                        return m3;
                    }
                }
            }
            boolean z2 = (this.z ^ true) == (Y1 == -1);
            if (!z) {
                if (z2) {
                    g3 = dVar.f();
                } else {
                    g3 = dVar.g();
                }
                View C = C(g3);
                if (C != null && C != B) {
                    return C;
                }
            }
            if (y2(Y1)) {
                for (int i4 = this.s - 1; i4 >= 0; i4--) {
                    if (i4 != dVar.e) {
                        if (z2) {
                            g2 = this.t[i4].f();
                        } else {
                            g2 = this.t[i4].g();
                        }
                        View C2 = C(g2);
                        if (C2 != null && C2 != B) {
                            return C2;
                        }
                    }
                }
            } else {
                for (int i5 = 0; i5 < this.s; i5++) {
                    if (z2) {
                        g = this.t[i5].f();
                    } else {
                        g = this.t[i5].g();
                    }
                    View C3 = C(g);
                    if (C3 != null && C3 != B) {
                        return C3;
                    }
                }
            }
            return null;
        }
        return m;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void J1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        bj bjVar = new bj(recyclerView.getContext());
        bjVar.p(i);
        K1(bjVar);
    }

    public void J2(boolean z) {
        g(null);
        SavedState savedState = this.I;
        if (savedState != null && savedState.i != z) {
            savedState.i = z;
        }
        this.z = z;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            View f2 = f2(false);
            View e2 = e2(false);
            if (f2 == null || e2 == null) {
                return;
            }
            int h0 = h0(f2);
            int h02 = h0(e2);
            if (h0 < h02) {
                accessibilityEvent.setFromIndex(h0);
                accessibilityEvent.setToIndex(h02);
                return;
            }
            accessibilityEvent.setFromIndex(h02);
            accessibilityEvent.setToIndex(h0);
        }
    }

    public void K2(int i) {
        g(null);
        if (i != this.s) {
            t2();
            this.s = i;
            this.B = new BitSet(this.s);
            this.t = new d[this.s];
            for (int i2 = 0; i2 < this.s; i2++) {
                this.t[i2] = new d(i2);
            }
            t1();
        }
    }

    public final void L2(int i, int i2) {
        for (int i3 = 0; i3 < this.s; i3++) {
            if (!this.t[i3].a.isEmpty()) {
                R2(this.t[i3], i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean M1() {
        return this.I == null;
    }

    public final boolean M2(RecyclerView.a0 a0Var, b bVar) {
        int d2;
        if (this.G) {
            d2 = h2(a0Var.b());
        } else {
            d2 = d2(a0Var.b());
        }
        bVar.a = d2;
        bVar.b = RecyclerView.UNDEFINED_DURATION;
        return true;
    }

    public final void N1(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].a(view);
        }
    }

    public boolean N2(RecyclerView.a0 a0Var, b bVar) {
        int i;
        int m;
        if (!a0Var.e() && (i = this.C) != -1) {
            if (i >= 0 && i < a0Var.b()) {
                SavedState savedState = this.I;
                if (savedState != null && savedState.b != -1 && savedState.d >= 1) {
                    bVar.b = RecyclerView.UNDEFINED_DURATION;
                    bVar.a = this.C;
                } else {
                    View C = C(this.C);
                    if (C != null) {
                        bVar.a = this.A ? l2() : k2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.c) {
                                bVar.b = (this.u.i() - this.D) - this.u.d(C);
                            } else {
                                bVar.b = (this.u.m() + this.D) - this.u.g(C);
                            }
                            return true;
                        } else if (this.u.e(C) > this.u.n()) {
                            if (bVar.c) {
                                m = this.u.i();
                            } else {
                                m = this.u.m();
                            }
                            bVar.b = m;
                            return true;
                        } else {
                            int g = this.u.g(C) - this.u.m();
                            if (g < 0) {
                                bVar.b = -g;
                                return true;
                            }
                            int i2 = this.u.i() - this.u.d(C);
                            if (i2 < 0) {
                                bVar.b = i2;
                                return true;
                            }
                            bVar.b = RecyclerView.UNDEFINED_DURATION;
                        }
                    } else {
                        int i3 = this.C;
                        bVar.a = i3;
                        int i4 = this.D;
                        if (i4 == Integer.MIN_VALUE) {
                            bVar.c = S1(i3) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i4);
                        }
                        bVar.d = true;
                    }
                }
                return true;
            }
            this.C = -1;
            this.D = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    public final void O1(b bVar) {
        int m;
        SavedState savedState = this.I;
        int i = savedState.d;
        if (i > 0) {
            if (i == this.s) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    this.t[i2].e();
                    SavedState savedState2 = this.I;
                    int i3 = savedState2.e[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        if (savedState2.j) {
                            m = this.u.i();
                        } else {
                            m = this.u.m();
                        }
                        i3 += m;
                    }
                    this.t[i2].v(i3);
                }
            } else {
                savedState.c();
                SavedState savedState3 = this.I;
                savedState3.b = savedState3.c;
            }
        }
        SavedState savedState4 = this.I;
        this.H = savedState4.k;
        J2(savedState4.i);
        F2();
        SavedState savedState5 = this.I;
        int i4 = savedState5.b;
        if (i4 != -1) {
            this.C = i4;
            bVar.c = savedState5.j;
        } else {
            bVar.c = this.A;
        }
        if (savedState5.f > 1) {
            LazySpanLookup lazySpanLookup = this.E;
            lazySpanLookup.a = savedState5.g;
            lazySpanLookup.b = savedState5.h;
        }
    }

    public void O2(RecyclerView.a0 a0Var, b bVar) {
        if (N2(a0Var, bVar) || M2(a0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.a = 0;
    }

    public boolean P1() {
        int l = this.t[0].l(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].l(RecyclerView.UNDEFINED_DURATION) != l) {
                return false;
            }
        }
        return true;
    }

    public final void P2(int i, RecyclerView.a0 a0Var) {
        int i2;
        int i3;
        int c2;
        aj ajVar = this.y;
        boolean z = false;
        ajVar.b = 0;
        ajVar.c = i;
        if (!x0() || (c2 = a0Var.c()) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.A == (c2 < i)) {
                i2 = this.u.n();
                i3 = 0;
            } else {
                i3 = this.u.n();
                i2 = 0;
            }
        }
        if (M()) {
            this.y.f = this.u.m() - i3;
            this.y.g = this.u.i() + i2;
        } else {
            this.y.g = this.u.h() + i2;
            this.y.f = -i3;
        }
        aj ajVar2 = this.y;
        ajVar2.h = false;
        ajVar2.a = true;
        if (this.u.k() == 0 && this.u.h() == 0) {
            z = true;
        }
        ajVar2.i = z;
    }

    public boolean Q1() {
        int p = this.t[0].p(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].p(RecyclerView.UNDEFINED_DURATION) != p) {
                return false;
            }
        }
        return true;
    }

    public void Q2(int i) {
        this.x = i / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(i, this.v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(RecyclerView recyclerView, int i, int i2) {
        r2(i, i2, 1);
    }

    public final void R1(View view, c cVar, aj ajVar) {
        if (ajVar.e == 1) {
            if (cVar.f) {
                N1(view);
            } else {
                cVar.e.a(view);
            }
        } else if (cVar.f) {
            A2(view);
        } else {
            cVar.e.u(view);
        }
    }

    public final void R2(d dVar, int i, int i2) {
        int j = dVar.j();
        if (i == -1) {
            if (dVar.o() + j <= i2) {
                this.B.set(dVar.e, false);
            }
        } else if (dVar.k() - j >= i2) {
            this.B.set(dVar.e, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView recyclerView) {
        this.E.b();
        t1();
    }

    public final int S1(int i) {
        if (J() == 0) {
            return this.A ? 1 : -1;
        }
        return (i < k2()) != this.A ? -1 : 1;
    }

    public final int S2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(RecyclerView recyclerView, int i, int i2, int i3) {
        r2(i, i2, 8);
    }

    public boolean T1() {
        int k2;
        int l2;
        if (J() == 0 || this.F == 0 || !r0()) {
            return false;
        }
        if (this.A) {
            k2 = l2();
            l2 = k2();
        } else {
            k2 = k2();
            l2 = l2();
        }
        if (k2 == 0 && s2() != null) {
            this.E.b();
            u1();
            t1();
            return true;
        } else if (this.M) {
            int i = this.A ? -1 : 1;
            int i2 = l2 + 1;
            LazySpanLookup.FullSpanItem e = this.E.e(k2, i2, i, true);
            if (e == null) {
                this.M = false;
                this.E.d(i2);
                return false;
            }
            LazySpanLookup.FullSpanItem e2 = this.E.e(k2, e.b, i * (-1), true);
            if (e2 == null) {
                this.E.d(e.b);
            } else {
                this.E.d(e2.b + 1);
            }
            u1();
            t1();
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView recyclerView, int i, int i2) {
        r2(i, i2, 2);
    }

    public final boolean U1(d dVar) {
        if (this.A) {
            if (dVar.k() < this.u.i()) {
                ArrayList<View> arrayList = dVar.a;
                return !dVar.n(arrayList.get(arrayList.size() - 1)).f;
            }
        } else if (dVar.o() > this.u.m()) {
            return !dVar.n(dVar.a.get(0)).f;
        }
        return false;
    }

    public final int V1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        return gj.a(a0Var, this.u, f2(!this.N), e2(!this.N), this, this.N);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        r2(i, i2, 4);
    }

    public final int W1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        return gj.b(a0Var, this.u, f2(!this.N), e2(!this.N), this, this.N, this.A);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        x2(wVar, a0Var, true);
    }

    public final int X1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        return gj.c(a0Var, this.u, f2(!this.N), e2(!this.N), this, this.N);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView.a0 a0Var) {
        super.Y0(a0Var);
        this.C = -1;
        this.D = RecyclerView.UNDEFINED_DURATION;
        this.I = null;
        this.L.c();
    }

    public final int Y1(int i) {
        if (i == 1) {
            return (this.w != 1 && u2()) ? 1 : -1;
        } else if (i == 2) {
            return (this.w != 1 && u2()) ? -1 : 1;
        } else if (i == 17) {
            if (this.w == 0) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i == 33) {
            if (this.w == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i != 66) {
            if (i == 130 && this.w == 1) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (this.w == 0) {
            return 1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    public final LazySpanLookup.FullSpanItem Z1(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.d = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            fullSpanItem.d[i2] = i - this.t[i2].l(i);
        }
        return fullSpanItem;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i) {
        int S1 = S1(i);
        PointF pointF = new PointF();
        if (S1 == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = S1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = S1;
        }
        return pointF;
    }

    public final LazySpanLookup.FullSpanItem a2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.d = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            fullSpanItem.d[i2] = this.t[i2].p(i) - i;
        }
        return fullSpanItem;
    }

    public final void b2() {
        this.u = dj.b(this, this.w);
        this.v = dj.b(this, 1 - this.w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.I = savedState;
            if (this.C != -1) {
                savedState.a();
                this.I.c();
            }
            t1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final int c2(RecyclerView.w wVar, aj ajVar, RecyclerView.a0 a0Var) {
        int i;
        int m;
        int m2;
        d dVar;
        int e;
        int i2;
        int i3;
        int e2;
        boolean z;
        boolean Q1;
        ?? r9 = 0;
        this.B.set(0, this.s, true);
        if (this.y.i) {
            i = ajVar.e == 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : RecyclerView.UNDEFINED_DURATION;
        } else if (ajVar.e == 1) {
            i = ajVar.g + ajVar.b;
        } else {
            i = ajVar.f - ajVar.b;
        }
        int i4 = i;
        L2(ajVar.e, i4);
        if (this.A) {
            m = this.u.i();
        } else {
            m = this.u.m();
        }
        int i5 = m;
        boolean z2 = false;
        while (ajVar.a(a0Var) && (this.y.i || !this.B.isEmpty())) {
            View b2 = ajVar.b(wVar);
            c cVar = (c) b2.getLayoutParams();
            int a2 = cVar.a();
            int g = this.E.g(a2);
            boolean z3 = g == -1 ? true : r9;
            if (z3) {
                dVar = cVar.f ? this.t[r9] : q2(ajVar);
                this.E.n(a2, dVar);
            } else {
                dVar = this.t[g];
            }
            d dVar2 = dVar;
            cVar.e = dVar2;
            if (ajVar.e == 1) {
                d(b2);
            } else {
                e(b2, r9);
            }
            w2(b2, cVar, r9);
            if (ajVar.e == 1) {
                int m22 = cVar.f ? m2(i5) : dVar2.l(i5);
                int e3 = this.u.e(b2) + m22;
                if (z3 && cVar.f) {
                    LazySpanLookup.FullSpanItem Z1 = Z1(m22);
                    Z1.c = -1;
                    Z1.b = a2;
                    this.E.a(Z1);
                }
                i2 = e3;
                e = m22;
            } else {
                int p2 = cVar.f ? p2(i5) : dVar2.p(i5);
                e = p2 - this.u.e(b2);
                if (z3 && cVar.f) {
                    LazySpanLookup.FullSpanItem a22 = a2(p2);
                    a22.c = 1;
                    a22.b = a2;
                    this.E.a(a22);
                }
                i2 = p2;
            }
            if (cVar.f && ajVar.d == -1) {
                if (z3) {
                    this.M = true;
                } else {
                    if (ajVar.e == 1) {
                        Q1 = P1();
                    } else {
                        Q1 = Q1();
                    }
                    if (!Q1) {
                        LazySpanLookup.FullSpanItem f = this.E.f(a2);
                        if (f != null) {
                            f.e = true;
                        }
                        this.M = true;
                    }
                }
            }
            R1(b2, cVar, ajVar);
            if (u2() && this.w == 1) {
                int i6 = cVar.f ? this.v.i() : this.v.i() - (((this.s - 1) - dVar2.e) * this.x);
                e2 = i6;
                i3 = i6 - this.v.e(b2);
            } else {
                int m3 = cVar.f ? this.v.m() : (dVar2.e * this.x) + this.v.m();
                i3 = m3;
                e2 = this.v.e(b2) + m3;
            }
            if (this.w == 1) {
                z0(b2, i3, e, e2, i2);
            } else {
                z0(b2, e, i3, i2, e2);
            }
            if (cVar.f) {
                L2(this.y.e, i4);
            } else {
                R2(dVar2, this.y.e, i4);
            }
            B2(wVar, this.y);
            if (this.y.h && b2.hasFocusable()) {
                if (cVar.f) {
                    this.B.clear();
                } else {
                    z = false;
                    this.B.set(dVar2.e, false);
                    r9 = z;
                    z2 = true;
                }
            }
            z = false;
            r9 = z;
            z2 = true;
        }
        int i7 = r9;
        if (!z2) {
            B2(wVar, this.y);
        }
        if (this.y.e == -1) {
            m2 = this.u.m() - p2(this.u.m());
        } else {
            m2 = m2(this.u.i()) - this.u.i();
        }
        return m2 > 0 ? Math.min(ajVar.b, m2) : i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable d1() {
        int p;
        int m;
        int[] iArr;
        if (this.I != null) {
            return new SavedState(this.I);
        }
        SavedState savedState = new SavedState();
        savedState.i = this.z;
        savedState.j = this.G;
        savedState.k = this.H;
        LazySpanLookup lazySpanLookup = this.E;
        if (lazySpanLookup != null && (iArr = lazySpanLookup.a) != null) {
            savedState.g = iArr;
            savedState.f = iArr.length;
            savedState.h = lazySpanLookup.b;
        } else {
            savedState.f = 0;
        }
        if (J() > 0) {
            savedState.b = this.G ? l2() : k2();
            savedState.c = g2();
            int i = this.s;
            savedState.d = i;
            savedState.e = new int[i];
            for (int i2 = 0; i2 < this.s; i2++) {
                if (this.G) {
                    p = this.t[i2].l(RecyclerView.UNDEFINED_DURATION);
                    if (p != Integer.MIN_VALUE) {
                        m = this.u.i();
                        p -= m;
                        savedState.e[i2] = p;
                    } else {
                        savedState.e[i2] = p;
                    }
                } else {
                    p = this.t[i2].p(RecyclerView.UNDEFINED_DURATION);
                    if (p != Integer.MIN_VALUE) {
                        m = this.u.m();
                        p -= m;
                        savedState.e[i2] = p;
                    } else {
                        savedState.e[i2] = p;
                    }
                }
            }
        } else {
            savedState.b = -1;
            savedState.c = -1;
            savedState.d = 0;
        }
        return savedState;
    }

    public final int d2(int i) {
        int J = J();
        for (int i2 = 0; i2 < J; i2++) {
            int h0 = h0(I(i2));
            if (h0 >= 0 && h0 < i) {
                return h0;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(int i) {
        if (i == 0) {
            T1();
        }
    }

    public View e2(boolean z) {
        int m = this.u.m();
        int i = this.u.i();
        View view = null;
        for (int J = J() - 1; J >= 0; J--) {
            View I = I(J);
            int g = this.u.g(I);
            int d2 = this.u.d(I);
            if (d2 > m && g < i) {
                if (d2 <= i || !z) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    public View f2(boolean z) {
        int m = this.u.m();
        int i = this.u.i();
        int J = J();
        View view = null;
        for (int i2 = 0; i2 < J; i2++) {
            View I = I(i2);
            int g = this.u.g(I);
            if (this.u.d(I) > m && g < i) {
                if (g >= m || !z) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g(String str) {
        if (this.I == null) {
            super.g(str);
        }
    }

    public int g2() {
        View e2 = this.A ? e2(true) : f2(true);
        if (e2 == null) {
            return -1;
        }
        return h0(e2);
    }

    public final int h2(int i) {
        for (int J = J() - 1; J >= 0; J--) {
            int h0 = h0(I(J));
            if (h0 >= 0 && h0 < i) {
                return h0;
            }
        }
        return 0;
    }

    public final void i2(RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z) {
        int i;
        int m2 = m2(RecyclerView.UNDEFINED_DURATION);
        if (m2 != Integer.MIN_VALUE && (i = this.u.i() - m2) > 0) {
            int i2 = i - (-G2(-i, wVar, a0Var));
            if (!z || i2 <= 0) {
                return;
            }
            this.u.r(i2);
        }
    }

    public final void j2(RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z) {
        int m;
        int p2 = p2(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (p2 != Integer.MAX_VALUE && (m = p2 - this.u.m()) > 0) {
            int G2 = m - G2(m, wVar, a0Var);
            if (!z || G2 <= 0) {
                return;
            }
            this.u.r(-G2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean k() {
        return this.w == 0;
    }

    public int k2() {
        if (J() == 0) {
            return 0;
        }
        return h0(I(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.w == 1;
    }

    public int l2() {
        int J = J();
        if (J == 0) {
            return 0;
        }
        return h0(I(J - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    public final int m2(int i) {
        int l = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int l2 = this.t[i2].l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    public final int n2(int i) {
        int p = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int p2 = this.t[i2].p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.p.c cVar) {
        int l;
        int i3;
        if (this.w != 0) {
            i = i2;
        }
        if (J() == 0 || i == 0) {
            return;
        }
        z2(i, a0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.s) {
            this.O = new int[this.s];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.s; i5++) {
            aj ajVar = this.y;
            if (ajVar.d == -1) {
                l = ajVar.f;
                i3 = this.t[i5].p(l);
            } else {
                l = this.t[i5].l(ajVar.g);
                i3 = this.y.g;
            }
            int i6 = l - i3;
            if (i6 >= 0) {
                this.O[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.O, 0, i4);
        for (int i7 = 0; i7 < i4 && this.y.a(a0Var); i7++) {
            cVar.a(this.y.c, this.O[i7]);
            aj ajVar2 = this.y;
            ajVar2.c += ajVar2.d;
        }
    }

    public final int o2(int i) {
        int l = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int l2 = this.t[i2].l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    public final int p2(int i) {
        int p = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int p2 = this.t[i2].p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int q(RecyclerView.a0 a0Var) {
        return V1(a0Var);
    }

    public final d q2(aj ajVar) {
        int i;
        int i2;
        int i3 = -1;
        if (y2(ajVar.e)) {
            i = this.s - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.s;
            i2 = 1;
        }
        d dVar = null;
        if (ajVar.e == 1) {
            int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int m = this.u.m();
            while (i != i3) {
                d dVar2 = this.t[i];
                int l = dVar2.l(m);
                if (l < i4) {
                    dVar = dVar2;
                    i4 = l;
                }
                i += i2;
            }
            return dVar;
        }
        int i5 = RecyclerView.UNDEFINED_DURATION;
        int i6 = this.u.i();
        while (i != i3) {
            d dVar3 = this.t[i];
            int p = dVar3.p(i6);
            if (p > i5) {
                dVar = dVar3;
                i5 = p;
            }
            i += i2;
        }
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.l2()
            goto Ld
        L9:
            int r0 = r6.k2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.E
            r7.j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.A
            if (r7 == 0) goto L4d
            int r7 = r6.k2()
            goto L51
        L4d:
            int r7 = r6.l2()
        L51:
            if (r3 > r7) goto L56
            r6.t1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r2(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.a0 a0Var) {
        return X1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean s0() {
        return this.F != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View s2() {
        /*
            r12 = this;
            int r0 = r12.J()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.s
            r2.<init>(r3)
            int r3 = r12.s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.w
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.u2()
            if (r3 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r5
        L21:
            boolean r6 = r12.A
            if (r6 == 0) goto L27
            r6 = r5
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L2b:
            if (r0 >= r6) goto L2e
            r5 = r1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.I(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            int r9 = r9.e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            boolean r9 = r12.U1(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            int r9 = r9.e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.I(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L77
            dj r10 = r12.u
            int r10 = r10.d(r7)
            dj r11 = r12.u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            dj r10 = r12.u
            int r10 = r10.g(r7)
            dj r11 = r12.u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = r1
            goto L8b
        L8a:
            r10 = r4
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.e
            int r8 = r8.e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.e
            int r9 = r9.e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = r1
            goto La1
        La0:
            r8 = r4
        La1:
            if (r3 >= 0) goto La5
            r9 = r1
            goto La6
        La5:
            r9 = r4
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.s2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.a0 a0Var) {
        return V1(a0Var);
    }

    public void t2() {
        this.E.b();
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    public boolean u2() {
        return Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.a0 a0Var) {
        return X1(a0Var);
    }

    public final void v2(View view, int i, int i2, boolean z) {
        boolean G1;
        j(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int S2 = S2(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int S22 = S2(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z) {
            G1 = I1(view, S2, S22, cVar);
        } else {
            G1 = G1(view, S2, S22, cVar);
        }
        if (G1) {
            view.measure(S2, S22);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w1(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        return G2(i, wVar, a0Var);
    }

    public final void w2(View view, c cVar, boolean z) {
        if (cVar.f) {
            if (this.w == 1) {
                v2(view, this.J, RecyclerView.p.K(W(), X(), g0() + d0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
            } else {
                v2(view, RecyclerView.p.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z);
            }
        } else if (this.w == 1) {
            v2(view, RecyclerView.p.K(this.x, p0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.K(W(), X(), g0() + d0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
        } else {
            v2(view, RecyclerView.p.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.K(this.x, X(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void x1(int i) {
        SavedState savedState = this.I;
        if (savedState != null && savedState.b != i) {
            savedState.a();
        }
        this.C = i;
        this.D = RecyclerView.UNDEFINED_DURATION;
        t1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0157, code lost:
        if (T1() != false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x2(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.a0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.x2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y1(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        return G2(i, wVar, a0Var);
    }

    public final boolean y2(int i) {
        if (this.w == 0) {
            return (i == -1) != this.A;
        }
        return ((i == -1) == this.A) == u2();
    }

    public void z2(int i, RecyclerView.a0 a0Var) {
        int i2;
        int k2;
        if (i > 0) {
            k2 = l2();
            i2 = 1;
        } else {
            i2 = -1;
            k2 = k2();
        }
        this.y.a = true;
        P2(k2, a0Var);
        H2(i2);
        aj ajVar = this.y;
        ajVar.c = k2 + ajVar.d;
        ajVar.b = Math.abs(i);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class LazySpanLookup {
        public int[] a;
        public List<FullSpanItem> b;

        public void a(FullSpanItem fullSpanItem) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.b.get(i);
                if (fullSpanItem2.b == fullSpanItem.b) {
                    this.b.remove(i);
                }
                if (fullSpanItem2.b >= fullSpanItem.b) {
                    this.b.add(i, fullSpanItem);
                    return;
                }
            }
            this.b.add(fullSpanItem);
        }

        public void b() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public void c(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[o(i)];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i) {
            List<FullSpanItem> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.b.get(size).b >= i) {
                        this.b.remove(size);
                    }
                }
            }
            return h(i);
        }

        public FullSpanItem e(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.b.get(i4);
                int i5 = fullSpanItem.b;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.c == i3 || (z && fullSpanItem.e))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                if (fullSpanItem.b == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public int g(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        public int h(int i) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i2 = i(i);
                if (i2 == -1) {
                    int[] iArr2 = this.a;
                    Arrays.fill(iArr2, i, iArr2.length, -1);
                    return this.a.length;
                }
                int min = Math.min(i2 + 1, this.a.length);
                Arrays.fill(this.a, i, min, -1);
                return min;
            }
            return -1;
        }

        public final int i(int i) {
            if (this.b == null) {
                return -1;
            }
            FullSpanItem f = f(i);
            if (f != null) {
                this.b.remove(f);
            }
            int size = this.b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.b.get(i2).b >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                this.b.remove(i2);
                return this.b.get(i2).b;
            }
            return -1;
        }

        public void j(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.a, i, i3, -1);
            l(i, i2);
        }

        public void k(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m(i, i2);
        }

        public final void l(int i, int i2) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                int i3 = fullSpanItem.b;
                if (i3 >= i) {
                    fullSpanItem.b = i3 + i2;
                }
            }
        }

        public final void m(int i, int i2) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                int i4 = fullSpanItem.b;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        fullSpanItem.b = i4 - i2;
                    }
                }
            }
        }

        public void n(int i, d dVar) {
            c(i);
            this.a[i] = dVar.e;
        }

        public int o(int i) {
            int length = this.a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* compiled from: AxisPay */
        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();
            public int b;
            public int c;
            public int[] d;
            public boolean e;

            /* compiled from: AxisPay */
            /* loaded from: classes.dex */
            public class a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.b = parcel.readInt();
                this.c = parcel.readInt();
                this.e = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i) {
                int[] iArr = this.d;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.b + ", mGapDir=" + this.c + ", mHasUnwantedGapAfter=" + this.e + ", mGapPerSpan=" + Arrays.toString(this.d) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b);
                parcel.writeInt(this.c);
                parcel.writeInt(this.e ? 1 : 0);
                int[] iArr = this.d;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.d);
                    return;
                }
                parcel.writeInt(0);
            }

            public FullSpanItem() {
            }
        }
    }
}
