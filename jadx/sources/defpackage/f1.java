package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import defpackage.o1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AxisPay */
/* renamed from: f1  reason: default package */
/* loaded from: classes.dex */
public final class f1 extends m1 implements o1, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int C = r.abc_cascading_menu_item_layout;
    public PopupWindow.OnDismissListener A;
    public boolean B;
    public final Context c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Handler h;
    public View p;
    public View q;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public boolean x;
    public o1.a y;
    public ViewTreeObserver z;
    public final List<i1> i = new ArrayList();
    public final List<d> j = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    public final View.OnAttachStateChangeListener l = new b();
    public final b3 m = new c();
    public int n = 0;
    public int o = 0;
    public boolean w = false;
    public int r = F();

    /* compiled from: AxisPay */
    /* renamed from: f1$a */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!f1.this.c() || f1.this.j.size() <= 0 || f1.this.j.get(0).a.B()) {
                return;
            }
            View view = f1.this.q;
            if (view != null && view.isShown()) {
                for (d dVar : f1.this.j) {
                    dVar.a.a();
                }
                return;
            }
            f1.this.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: f1$b */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = f1.this.z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    f1.this.z = view.getViewTreeObserver();
                }
                f1 f1Var = f1.this;
                f1Var.z.removeGlobalOnLayoutListener(f1Var.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: f1$c */
    /* loaded from: classes.dex */
    public class c implements b3 {

        /* compiled from: AxisPay */
        /* renamed from: f1$c$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ d b;
            public final /* synthetic */ MenuItem c;
            public final /* synthetic */ i1 d;

            public a(d dVar, MenuItem menuItem, i1 i1Var) {
                this.b = dVar;
                this.c = menuItem;
                this.d = i1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.b;
                if (dVar != null) {
                    f1.this.B = true;
                    dVar.b.e(false);
                    f1.this.B = false;
                }
                if (this.c.isEnabled() && this.c.hasSubMenu()) {
                    this.d.N(this.c, 4);
                }
            }
        }

        public c() {
        }

        @Override // defpackage.b3
        public void e(i1 i1Var, MenuItem menuItem) {
            f1.this.h.removeCallbacksAndMessages(null);
            int size = f1.this.j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (i1Var == f1.this.j.get(i).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            f1.this.h.postAtTime(new a(i2 < f1.this.j.size() ? f1.this.j.get(i2) : null, menuItem, i1Var), i1Var, SystemClock.uptimeMillis() + 200);
        }

        @Override // defpackage.b3
        public void f(i1 i1Var, MenuItem menuItem) {
            f1.this.h.removeCallbacksAndMessages(i1Var);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: f1$d */
    /* loaded from: classes.dex */
    public static class d {
        public final c3 a;
        public final i1 b;
        public final int c;

        public d(c3 c3Var, i1 i1Var, int i) {
            this.a = c3Var;
            this.b = i1Var;
            this.c = i;
        }

        public ListView a() {
            return this.a.h();
        }
    }

    public f1(Context context, View view, int i, int i2, boolean z) {
        this.c = context;
        this.p = view;
        this.e = i;
        this.f = i2;
        this.g = z;
        Resources resources = context.getResources();
        this.d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(o.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    public final c3 B() {
        c3 c3Var = new c3(this.c, null, this.e, this.f);
        c3Var.T(this.m);
        c3Var.L(this);
        c3Var.K(this);
        c3Var.D(this.p);
        c3Var.G(this.o);
        c3Var.J(true);
        c3Var.I(2);
        return c3Var;
    }

    public final int C(i1 i1Var) {
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            if (i1Var == this.j.get(i).b) {
                return i;
            }
        }
        return -1;
    }

    public final MenuItem D(i1 i1Var, i1 i1Var2) {
        int size = i1Var.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = i1Var.getItem(i);
            if (item.hasSubMenu() && i1Var2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View E(d dVar, i1 i1Var) {
        h1 h1Var;
        int i;
        int firstVisiblePosition;
        MenuItem D = D(dVar.b, i1Var);
        if (D == null) {
            return null;
        }
        ListView a2 = dVar.a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            h1Var = (h1) headerViewListAdapter.getWrappedAdapter();
        } else {
            h1Var = (h1) adapter;
            i = 0;
        }
        int count = h1Var.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (D == h1Var.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int F() {
        return ac.C(this.p) == 1 ? 0 : 1;
    }

    public final int G(int i) {
        List<d> list = this.j;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.q.getWindowVisibleDisplayFrame(rect);
        return this.r == 1 ? (iArr[0] + a2.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    public final void H(i1 i1Var) {
        d dVar;
        View view;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.c);
        h1 h1Var = new h1(i1Var, from, this.g, C);
        if (!c() && this.w) {
            h1Var.d(true);
        } else if (c()) {
            h1Var.d(m1.z(i1Var));
        }
        int q = m1.q(h1Var, null, this.c, this.d);
        c3 B = B();
        B.p(h1Var);
        B.F(q);
        B.G(this.o);
        if (this.j.size() > 0) {
            List<d> list = this.j;
            dVar = list.get(list.size() - 1);
            view = E(dVar, i1Var);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            B.U(false);
            B.R(null);
            int G = G(q);
            boolean z = G == 1;
            this.r = G;
            if (Build.VERSION.SDK_INT >= 26) {
                B.D(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.o & 7) == 5) {
                    iArr[0] = iArr[0] + this.p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.o & 5) == 5) {
                if (!z) {
                    q = view.getWidth();
                    i3 = i - q;
                }
                i3 = i + q;
            } else {
                if (z) {
                    q = view.getWidth();
                    i3 = i + q;
                }
                i3 = i - q;
            }
            B.l(i3);
            B.M(true);
            B.j(i2);
        } else {
            if (this.s) {
                B.l(this.u);
            }
            if (this.t) {
                B.j(this.v);
            }
            B.H(p());
        }
        this.j.add(new d(B, i1Var, this.r));
        B.a();
        ListView h = B.h();
        h.setOnKeyListener(this);
        if (dVar == null && this.x && i1Var.z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(r.abc_popup_menu_header_item_layout, (ViewGroup) h, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(i1Var.z());
            h.addHeaderView(frameLayout, null, false);
            B.a();
        }
    }

    @Override // defpackage.r1
    public void a() {
        if (c()) {
            return;
        }
        for (i1 i1Var : this.i) {
            H(i1Var);
        }
        this.i.clear();
        View view = this.p;
        this.q = view;
        if (view != null) {
            boolean z = this.z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.k);
            }
            this.q.addOnAttachStateChangeListener(this.l);
        }
    }

    @Override // defpackage.o1
    public void b(i1 i1Var, boolean z) {
        int C2 = C(i1Var);
        if (C2 < 0) {
            return;
        }
        int i = C2 + 1;
        if (i < this.j.size()) {
            this.j.get(i).b.e(false);
        }
        d remove = this.j.remove(C2);
        remove.b.Q(this);
        if (this.B) {
            remove.a.S(null);
            remove.a.E(0);
        }
        remove.a.dismiss();
        int size = this.j.size();
        if (size > 0) {
            this.r = this.j.get(size - 1).c;
        } else {
            this.r = F();
        }
        if (size != 0) {
            if (z) {
                this.j.get(0).b.e(false);
                return;
            }
            return;
        }
        dismiss();
        o1.a aVar = this.y;
        if (aVar != null) {
            aVar.b(i1Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.z.removeGlobalOnLayoutListener(this.k);
            }
            this.z = null;
        }
        this.q.removeOnAttachStateChangeListener(this.l);
        this.A.onDismiss();
    }

    @Override // defpackage.r1
    public boolean c() {
        return this.j.size() > 0 && this.j.get(0).a.c();
    }

    @Override // defpackage.r1
    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.j.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.a.c()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.o1
    public void e(Parcelable parcelable) {
    }

    @Override // defpackage.o1
    public boolean f(t1 t1Var) {
        for (d dVar : this.j) {
            if (t1Var == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (t1Var.hasVisibleItems()) {
            n(t1Var);
            o1.a aVar = this.y;
            if (aVar != null) {
                aVar.c(t1Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.o1
    public void g(boolean z) {
        for (d dVar : this.j) {
            m1.A(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.r1
    public ListView h() {
        if (this.j.isEmpty()) {
            return null;
        }
        List<d> list = this.j;
        return list.get(list.size() - 1).a();
    }

    @Override // defpackage.o1
    public boolean i() {
        return false;
    }

    @Override // defpackage.o1
    public Parcelable j() {
        return null;
    }

    @Override // defpackage.o1
    public void m(o1.a aVar) {
        this.y = aVar;
    }

    @Override // defpackage.m1
    public void n(i1 i1Var) {
        i1Var.c(this, this.c);
        if (c()) {
            H(i1Var);
        } else {
            this.i.add(i1Var);
        }
    }

    @Override // defpackage.m1
    public boolean o() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.j.get(i);
            if (!dVar.a.c()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // defpackage.m1
    public void r(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = ib.b(this.n, ac.C(view));
        }
    }

    @Override // defpackage.m1
    public void t(boolean z) {
        this.w = z;
    }

    @Override // defpackage.m1
    public void u(int i) {
        if (this.n != i) {
            this.n = i;
            this.o = ib.b(i, ac.C(this.p));
        }
    }

    @Override // defpackage.m1
    public void v(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // defpackage.m1
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // defpackage.m1
    public void x(boolean z) {
        this.x = z;
    }

    @Override // defpackage.m1
    public void y(int i) {
        this.t = true;
        this.v = i;
    }
}
