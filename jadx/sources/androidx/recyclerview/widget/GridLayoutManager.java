package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.lc;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public c O;
    public final Rect P;
    public boolean Q;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i) {
            return 1;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();
        public boolean c = false;
        public boolean d = false;

        public static int a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        public int b(int i, int i2) {
            if (!this.d) {
                return d(i, i2);
            }
            int i3 = this.b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = d(i, i2);
            this.b.put(i, d);
            return d;
        }

        public int c(int i, int i2) {
            if (!this.c) {
                return e(i, i2);
            }
            int i3 = this.a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = e(i, i2);
            this.a.put(i, e);
            return e;
        }

        public int d(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int a;
            if (!this.d || (a = a(this.b, i)) == -1) {
                i3 = 0;
                i4 = 0;
                i5 = 0;
            } else {
                i3 = this.b.get(a);
                i4 = a + 1;
                i5 = c(a, i2) + f(a);
                if (i5 == i2) {
                    i3++;
                    i5 = 0;
                }
            }
            int f = f(i);
            while (i4 < i) {
                int f2 = f(i4);
                i5 += f2;
                if (i5 == i2) {
                    i3++;
                    i5 = 0;
                } else if (i5 > i2) {
                    i3++;
                    i5 = f2;
                }
                i4++;
            }
            return i5 + f > i2 ? i3 + 1 : i3;
        }

        public abstract int e(int i, int i2);

        public abstract int f(int i);

        public void g() {
            this.b.clear();
        }

        public void h() {
            this.a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        b3(RecyclerView.p.i0(context, attributeSet, i, i2).b);
    }

    public static int[] N2(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void B2(boolean z) {
        if (!z) {
            super.B2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q D() {
        if (this.s == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void D1(Rect rect, int i, int i2) {
        int n;
        int n2;
        if (this.K == null) {
            super.D1(rect, i, i2);
        }
        int e0 = e0() + f0();
        int g0 = g0() + d0();
        if (this.s == 1) {
            n2 = RecyclerView.p.n(i2, rect.height() + g0, b0());
            int[] iArr = this.K;
            n = RecyclerView.p.n(i, iArr[iArr.length - 1] + e0, c0());
        } else {
            n = RecyclerView.p.n(i, rect.width() + e0, c0());
            int[] iArr2 = this.K;
            n2 = RecyclerView.p.n(i2, iArr2[iArr2.length - 1] + g0, b0());
        }
        C1(n, n2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
        if (r13 == (r2 > r7)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View J0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.a0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.J0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    public final void K2(RecyclerView.w wVar, RecyclerView.a0 a0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i3 = 1;
            i5 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
        }
        while (i2 != i5) {
            View view = this.L[i2];
            b bVar = (b) view.getLayoutParams();
            int X2 = X2(wVar, a0Var, h0(view));
            bVar.f = X2;
            bVar.e = i4;
            i4 += X2;
            i2 += i3;
        }
    }

    public final void L2() {
        int J = J();
        for (int i = 0; i < J; i++) {
            b bVar = (b) I(i).getLayoutParams();
            int a2 = bVar.a();
            this.M.put(a2, bVar.f());
            this.N.put(a2, bVar.e());
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean M1() {
        return this.D == null && !this.I;
    }

    public final void M2(int i) {
        this.K = N2(this.K, this.J, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int N(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (this.s == 1) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return V2(wVar, a0Var, a0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void O1(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i = this.J;
        for (int i2 = 0; i2 < this.J && cVar.c(a0Var) && i > 0; i2++) {
            int i3 = cVar.d;
            cVar2.a(i3, Math.max(0, cVar.g));
            i -= this.O.f(i3);
            cVar.d += cVar.e;
        }
    }

    public final void O2() {
        this.M.clear();
        this.N.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void P0(RecyclerView.w wVar, RecyclerView.a0 a0Var, View view, lc lcVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.O0(view, lcVar);
            return;
        }
        b bVar = (b) layoutParams;
        int V2 = V2(wVar, a0Var, bVar.a());
        if (this.s == 0) {
            lcVar.d0(lc.c.a(bVar.e(), bVar.f(), V2, 1, false, false));
        } else {
            lcVar.d0(lc.c.a(V2, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    public final int P2(RecyclerView.a0 a0Var) {
        int max;
        if (J() != 0 && a0Var.b() != 0) {
            U1();
            boolean o2 = o2();
            View Y1 = Y1(!o2, true);
            View X1 = X1(!o2, true);
            if (Y1 != null && X1 != null) {
                int b2 = this.O.b(h0(Y1), this.J);
                int b3 = this.O.b(h0(X1), this.J);
                int min = Math.min(b2, b3);
                int max2 = Math.max(b2, b3);
                int b4 = this.O.b(a0Var.b() - 1, this.J) + 1;
                if (this.x) {
                    max = Math.max(0, (b4 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (o2) {
                    return Math.round((max * (Math.abs(this.u.d(X1) - this.u.g(Y1)) / ((this.O.b(h0(X1), this.J) - this.O.b(h0(Y1), this.J)) + 1))) + (this.u.m() - this.u.g(Y1)));
                }
                return max;
            }
        }
        return 0;
    }

    public final int Q2(RecyclerView.a0 a0Var) {
        if (J() != 0 && a0Var.b() != 0) {
            U1();
            View Y1 = Y1(!o2(), true);
            View X1 = X1(!o2(), true);
            if (Y1 != null && X1 != null) {
                if (!o2()) {
                    return this.O.b(a0Var.b() - 1, this.J) + 1;
                }
                int d = this.u.d(X1) - this.u.g(Y1);
                int b2 = this.O.b(h0(Y1), this.J);
                return (int) ((d / ((this.O.b(h0(X1), this.J) - b2) + 1)) * (this.O.b(a0Var.b() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(RecyclerView recyclerView, int i, int i2) {
        this.O.h();
        this.O.g();
    }

    public final void R2(RecyclerView.w wVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i) {
        boolean z = i == 1;
        int W2 = W2(wVar, a0Var, aVar.b);
        if (z) {
            while (W2 > 0) {
                int i2 = aVar.b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                aVar.b = i3;
                W2 = W2(wVar, a0Var, i3);
            }
            return;
        }
        int b2 = a0Var.b() - 1;
        int i4 = aVar.b;
        while (i4 < b2) {
            int i5 = i4 + 1;
            int W22 = W2(wVar, a0Var, i5);
            if (W22 <= W2) {
                break;
            }
            i4 = i5;
            W2 = W22;
        }
        aVar.b = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    public final void S2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.O.h();
        this.O.g();
    }

    public int T2(int i, int i2) {
        if (this.s == 1 && n2()) {
            int[] iArr = this.K;
            int i3 = this.J;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.K;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView recyclerView, int i, int i2) {
        this.O.h();
        this.O.g();
    }

    public int U2() {
        return this.J;
    }

    public final int V2(RecyclerView.w wVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.e()) {
            return this.O.b(i, this.J);
        }
        int f = wVar.f(i);
        if (f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return this.O.b(f, this.J);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.O.h();
        this.O.g();
    }

    public final int W2(RecyclerView.w wVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.e()) {
            return this.O.c(i, this.J);
        }
        int i2 = this.N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = wVar.f(i);
        if (f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        return this.O.c(f, this.J);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (a0Var.e()) {
            L2();
        }
        super.X0(wVar, a0Var);
        O2();
    }

    public final int X2(RecyclerView.w wVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.e()) {
            return this.O.f(i);
        }
        int i2 = this.M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = wVar.f(i);
        if (f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        return this.O.f(f);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView.a0 a0Var) {
        super.Y0(a0Var);
        this.I = false;
    }

    public final void Y2(float f, int i) {
        M2(Math.max(Math.round(f * this.J), i));
    }

    public final void Z2(View view, int i, boolean z) {
        int i2;
        int i3;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int T2 = T2(bVar.e, bVar.f);
        if (this.s == 1) {
            i3 = RecyclerView.p.K(T2, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i2 = RecyclerView.p.K(this.u.n(), X(), i4, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int K = RecyclerView.p.K(T2, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int K2 = RecyclerView.p.K(this.u.n(), p0(), i5, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i2 = K;
            i3 = K2;
        }
        a3(view, i3, i2, z);
    }

    public final void a3(View view, int i, int i2, boolean z) {
        boolean G1;
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z) {
            G1 = I1(view, i, i2, qVar);
        } else {
            G1 = G1(view, i, i2, qVar);
        }
        if (G1) {
            view.measure(i, i2);
        }
    }

    public void b3(int i) {
        if (i == this.J) {
            return;
        }
        this.I = true;
        if (i >= 1) {
            this.J = i;
            this.O.h();
            t1();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
    }

    public final void c3() {
        int W;
        int g0;
        if (m2() == 1) {
            W = o0() - f0();
            g0 = e0();
        } else {
            W = W() - d0();
            g0 = g0();
        }
        M2(W - g0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View g2(RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z, boolean z2) {
        int i;
        int J = J();
        int i2 = -1;
        int i3 = 1;
        if (z2) {
            i = J() - 1;
            i3 = -1;
        } else {
            i2 = J;
            i = 0;
        }
        int b2 = a0Var.b();
        U1();
        int m = this.u.m();
        int i4 = this.u.i();
        View view = null;
        View view2 = null;
        while (i != i2) {
            View I = I(i);
            int h0 = h0(I);
            if (h0 >= 0 && h0 < b2 && W2(wVar, a0Var, h0) == 0) {
                if (((RecyclerView.q) I.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = I;
                    }
                } else if (this.u.g(I) < i4 && this.u.d(I) >= m) {
                    return I;
                } else {
                    if (view == null) {
                        view = I;
                    }
                }
            }
            i += i3;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int k0(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (this.s == 0) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return V2(wVar, a0Var, a0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p2(androidx.recyclerview.widget.RecyclerView.w r18, androidx.recyclerview.widget.RecyclerView.a0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.p2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return P2(a0Var);
        }
        return super.r(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void r2(RecyclerView.w wVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i) {
        super.r2(wVar, a0Var, aVar, i);
        c3();
        if (a0Var.b() > 0 && !a0Var.e()) {
            R2(wVar, a0Var, aVar, i);
        }
        S2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return Q2(a0Var);
        }
        return super.s(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return P2(a0Var);
        }
        return super.u(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return Q2(a0Var);
        }
        return super.v(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int w1(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        c3();
        S2();
        return super.w1(i, wVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int y1(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        c3();
        S2();
        return super.y1(i, wVar, a0Var);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class b extends RecyclerView.q {
        public int e;
        public int f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = -1;
            this.f = 0;
        }

        public int e() {
            return this.e;
        }

        public int f() {
            return this.f;
        }

        public b(int i, int i2) {
            super(i, i2);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.e = -1;
            this.f = 0;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        b3(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        b3(i);
    }
}
