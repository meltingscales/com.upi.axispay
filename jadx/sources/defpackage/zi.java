package defpackage;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: zi  reason: default package */
/* loaded from: classes.dex */
public final class zi implements Runnable {
    public static final ThreadLocal<zi> f = new ThreadLocal<>();
    public static Comparator<c> g = new a();
    public long c;
    public long d;
    public ArrayList<RecyclerView> b = new ArrayList<>();
    public ArrayList<c> e = new ArrayList<>();

    /* compiled from: AxisPay */
    /* renamed from: zi$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.d;
            if ((recyclerView == null) != (cVar2.d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.a;
            if (z != cVar2.a) {
                return z ? -1 : 1;
            }
            int i = cVar2.b - cVar.b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.c - cVar2.c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    /* compiled from: AxisPay */
    @SuppressLint({"VisibleForTests"})
    /* renamed from: zi$b */
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.p.c {
        public int a;
        public int b;
        public int[] c;
        public int d;

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException(C0059ao.a(5949));
            }
            if (i2 >= 0) {
                int i3 = this.d * 2;
                int[] iArr = this.c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[i3 * 2];
                    this.c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.d++;
                return;
            }
            throw new IllegalArgumentException(C0059ao.a(5948));
        }

        public void b() {
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || pVar == null || !pVar.u0()) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.p()) {
                    pVar.p(recyclerView.mAdapter.e(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                pVar.o(this.a, this.b, recyclerView.mState, this);
            }
            int i = this.d;
            if (i > pVar.m) {
                pVar.m = i;
                pVar.n = z;
                recyclerView.mRecycler.K();
            }
        }

        public boolean d(int i) {
            if (this.c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: zi$c */
    /* loaded from: classes.dex */
    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        public void a() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = null;
            this.e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i) {
        int j = recyclerView.mChildHelper.j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.i(i2));
            if (childViewHolderInt.d == i && !childViewHolderInt.v()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        this.b.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.b.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.c(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.d;
            }
        }
        this.e.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.b.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.a) + Math.abs(bVar.b);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= this.e.size()) {
                        cVar = new c();
                        this.e.add(cVar);
                    } else {
                        cVar = this.e.get(i3);
                    }
                    int[] iArr = bVar.c;
                    int i6 = iArr[i5 + 1];
                    cVar.a = i6 <= abs;
                    cVar.b = abs;
                    cVar.c = i6;
                    cVar.d = recyclerView2;
                    cVar.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.e, g);
    }

    public final void c(c cVar, long j) {
        RecyclerView.d0 i = i(cVar.d, cVar.e, cVar.a ? RecyclerView.FOREVER_NS : j);
        if (i == null || i.c == null || !i.u() || i.v()) {
            return;
        }
        h(i.c.get(), j);
    }

    public final void d(long j) {
        for (int i = 0; i < this.e.size(); i++) {
            c cVar = this.e.get(i);
            if (cVar.d == null) {
                return;
            }
            c(cVar, j);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.c == 0) {
            this.c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.e(i, i2);
    }

    public void g(long j) {
        b();
        d(j);
    }

    public final void h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.c(recyclerView, true);
        if (bVar.d != 0) {
            try {
                ha.a(C0059ao.a(8995));
                recyclerView.mState.f(recyclerView.mAdapter);
                for (int i = 0; i < bVar.d * 2; i += 2) {
                    i(recyclerView, bVar.c[i], j);
                }
            } finally {
                ha.b();
            }
        }
    }

    public final RecyclerView.d0 i(RecyclerView recyclerView, int i, long j) {
        if (e(recyclerView, i)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.d0 I = wVar.I(i, false, j);
            if (I != null) {
                if (I.u() && !I.v()) {
                    wVar.B(I.b);
                } else {
                    wVar.a(I, false);
                }
            }
            return I;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public void j(RecyclerView recyclerView) {
        this.b.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ha.a(C0059ao.a(8996));
            if (!this.b.isEmpty()) {
                int size = this.b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j) + this.d);
                }
            }
        } finally {
            this.c = 0L;
            ha.b();
        }
    }
}
