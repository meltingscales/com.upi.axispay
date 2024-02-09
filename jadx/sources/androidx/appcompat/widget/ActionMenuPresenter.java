package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import defpackage.fb;
import defpackage.o1;
import defpackage.p1;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ActionMenuPresenter extends d1 implements fb.a {
    public c A;
    public b B;
    public final f C;
    public int D;
    public d k;
    public Drawable l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public final SparseBooleanArray x;
    public e y;
    public a z;

    /* compiled from: AxisPay */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;

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

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }

        public SavedState(Parcel parcel) {
            this.b = parcel.readInt();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a extends n1 {
        public a(Context context, t1 t1Var, View view) {
            super(context, t1Var, view, false, l.actionOverflowMenuStyle);
            if (!((k1) t1Var.getItem()).l()) {
                View view2 = ActionMenuPresenter.this.k;
                f(view2 == null ? (View) ActionMenuPresenter.this.i : view2);
            }
            j(ActionMenuPresenter.this.C);
        }

        @Override // defpackage.n1
        public void e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.z = null;
            actionMenuPresenter.D = 0;
            super.e();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public r1 a() {
            a aVar = ActionMenuPresenter.this.z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public e b;

        public c(e eVar) {
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionMenuPresenter.this.d != null) {
                ActionMenuPresenter.this.d.d();
            }
            View view = (View) ActionMenuPresenter.this.i;
            if (view != null && view.getWindowToken() != null && this.b.m()) {
                ActionMenuPresenter.this.y = this.b;
            }
            ActionMenuPresenter.this.A = null;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class a extends y2 {
            public a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
            }

            @Override // defpackage.y2
            public r1 b() {
                e eVar = ActionMenuPresenter.this.y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // defpackage.y2
            public boolean c() {
                ActionMenuPresenter.this.M();
                return true;
            }

            @Override // defpackage.y2
            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.A != null) {
                    return false;
                }
                actionMenuPresenter.D();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, l.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            q3.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.M();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                o9.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class e extends n1 {
        public e(Context context, i1 i1Var, View view, boolean z) {
            super(context, i1Var, view, z, l.actionOverflowMenuStyle);
            h(8388613);
            j(ActionMenuPresenter.this.C);
        }

        @Override // defpackage.n1
        public void e() {
            if (ActionMenuPresenter.this.d != null) {
                ActionMenuPresenter.this.d.close();
            }
            ActionMenuPresenter.this.y = null;
            super.e();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class f implements o1.a {
        public f() {
        }

        @Override // defpackage.o1.a
        public void b(i1 i1Var, boolean z) {
            if (i1Var instanceof t1) {
                i1Var.F().e(false);
            }
            o1.a o = ActionMenuPresenter.this.o();
            if (o != null) {
                o.b(i1Var, z);
            }
        }

        @Override // defpackage.o1.a
        public boolean c(i1 i1Var) {
            if (i1Var == ActionMenuPresenter.this.d) {
                return false;
            }
            ActionMenuPresenter.this.D = ((t1) i1Var).getItem().getItemId();
            o1.a o = ActionMenuPresenter.this.o();
            if (o != null) {
                return o.c(i1Var);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, r.abc_action_menu_layout, r.abc_action_menu_item_layout);
        this.x = new SparseBooleanArray();
        this.C = new f();
    }

    public boolean A() {
        return D() | E();
    }

    public final View B(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof p1.a) && ((p1.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable C() {
        d dVar = this.k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.m) {
            return this.l;
        }
        return null;
    }

    public boolean D() {
        p1 p1Var;
        c cVar = this.A;
        if (cVar != null && (p1Var = this.i) != null) {
            ((View) p1Var).removeCallbacks(cVar);
            this.A = null;
            return true;
        }
        e eVar = this.y;
        if (eVar != null) {
            eVar.b();
            return true;
        }
        return false;
    }

    public boolean E() {
        a aVar = this.z;
        if (aVar != null) {
            aVar.b();
            return true;
        }
        return false;
    }

    public boolean F() {
        return this.A != null || G();
    }

    public boolean G() {
        e eVar = this.y;
        return eVar != null && eVar.d();
    }

    public void H(Configuration configuration) {
        if (!this.s) {
            this.r = t0.b(this.c).d();
        }
        i1 i1Var = this.d;
        if (i1Var != null) {
            i1Var.M(true);
        }
    }

    public void I(boolean z) {
        this.v = z;
    }

    public void J(ActionMenuView actionMenuView) {
        this.i = actionMenuView;
        actionMenuView.b(this.d);
    }

    public void K(Drawable drawable) {
        d dVar = this.k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.m = true;
        this.l = drawable;
    }

    public void L(boolean z) {
        this.n = z;
        this.o = true;
    }

    public boolean M() {
        i1 i1Var;
        if (!this.n || G() || (i1Var = this.d) == null || this.i == null || this.A != null || i1Var.B().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.c, this.d, this.k, true));
        this.A = cVar;
        ((View) this.i).post(cVar);
        return true;
    }

    @Override // defpackage.d1, defpackage.o1
    public void b(i1 i1Var, boolean z) {
        A();
        super.b(i1Var, z);
    }

    @Override // defpackage.d1
    public void c(k1 k1Var, p1.a aVar) {
        aVar.e(k1Var, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    @Override // defpackage.d1, defpackage.o1
    public void d(Context context, i1 i1Var) {
        super.d(context, i1Var);
        Resources resources = context.getResources();
        t0 b2 = t0.b(context);
        if (!this.o) {
            this.n = b2.h();
        }
        if (!this.u) {
            this.p = b2.c();
        }
        if (!this.s) {
            this.r = b2.d();
        }
        int i = this.p;
        if (this.n) {
            if (this.k == null) {
                d dVar = new d(this.b);
                this.k = dVar;
                if (this.m) {
                    dVar.setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.k.getMeasuredWidth();
        } else {
            this.k = null;
        }
        this.q = i;
        this.w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // defpackage.o1
    public void e(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).b) > 0 && (findItem = this.d.findItem(i)) != null) {
            f((t1) findItem.getSubMenu());
        }
    }

    @Override // defpackage.d1, defpackage.o1
    public boolean f(t1 t1Var) {
        boolean z = false;
        if (t1Var.hasVisibleItems()) {
            t1 t1Var2 = t1Var;
            while (t1Var2.i0() != this.d) {
                t1Var2 = (t1) t1Var2.i0();
            }
            View B = B(t1Var2.getItem());
            if (B == null) {
                return false;
            }
            this.D = t1Var.getItem().getItemId();
            int size = t1Var.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MenuItem item = t1Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            a aVar = new a(this.c, t1Var, B);
            this.z = aVar;
            aVar.g(z);
            this.z.k();
            super.f(t1Var);
            return true;
        }
        return false;
    }

    @Override // defpackage.d1, defpackage.o1
    public void g(boolean z) {
        super.g(z);
        ((View) this.i).requestLayout();
        i1 i1Var = this.d;
        boolean z2 = false;
        if (i1Var != null) {
            ArrayList<k1> u = i1Var.u();
            int size = u.size();
            for (int i = 0; i < size; i++) {
                fb b2 = u.get(i).b();
                if (b2 != null) {
                    b2.k(this);
                }
            }
        }
        i1 i1Var2 = this.d;
        ArrayList<k1> B = i1Var2 != null ? i1Var2.B() : null;
        if (this.n && B != null) {
            int size2 = B.size();
            if (size2 == 1) {
                z2 = !B.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.k == null) {
                this.k = new d(this.b);
            }
            ViewGroup viewGroup = (ViewGroup) this.k.getParent();
            if (viewGroup != this.i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                actionMenuView.addView(this.k, actionMenuView.F());
            }
        } else {
            d dVar = this.k;
            if (dVar != null) {
                ViewParent parent = dVar.getParent();
                p1 p1Var = this.i;
                if (parent == p1Var) {
                    ((ViewGroup) p1Var).removeView(this.k);
                }
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // defpackage.o1
    public boolean i() {
        ArrayList<k1> arrayList;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        ActionMenuPresenter actionMenuPresenter = this;
        i1 i1Var = actionMenuPresenter.d;
        View view = null;
        ?? r3 = 0;
        if (i1Var != null) {
            arrayList = i1Var.G();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = actionMenuPresenter.r;
        int i6 = actionMenuPresenter.q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.i;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            k1 k1Var = arrayList.get(i9);
            if (k1Var.o()) {
                i7++;
            } else if (k1Var.n()) {
                i8++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.v && k1Var.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (actionMenuPresenter.n && (z2 || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.x;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.t) {
            int i11 = actionMenuPresenter.w;
            i3 = i6 / i11;
            i2 = i11 + ((i6 % i11) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            k1 k1Var2 = arrayList.get(i12);
            if (k1Var2.o()) {
                View p = actionMenuPresenter.p(k1Var2, view, viewGroup);
                if (actionMenuPresenter.t) {
                    i3 -= ActionMenuView.L(p, i2, i3, makeMeasureSpec, r3);
                } else {
                    p.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = p.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = k1Var2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                k1Var2.u(true);
                z = r3;
                i4 = i;
            } else if (k1Var2.n()) {
                int groupId2 = k1Var2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i10 > 0 || z3) && i6 > 0 && (!actionMenuPresenter.t || i3 > 0);
                boolean z5 = z4;
                i4 = i;
                if (z4) {
                    View p2 = actionMenuPresenter.p(k1Var2, null, viewGroup);
                    if (actionMenuPresenter.t) {
                        int L = ActionMenuView.L(p2, i2, i3, makeMeasureSpec, 0);
                        i3 -= L;
                        if (L == 0) {
                            z5 = false;
                        }
                    } else {
                        p2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z6 = z5;
                    int measuredWidth2 = p2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z4 = z6 & (!actionMenuPresenter.t ? i6 + i13 <= 0 : i6 < 0);
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i14 = 0; i14 < i12; i14++) {
                        k1 k1Var3 = arrayList.get(i14);
                        if (k1Var3.getGroupId() == groupId2) {
                            if (k1Var3.l()) {
                                i10++;
                            }
                            k1Var3.u(false);
                        }
                    }
                }
                if (z4) {
                    i10--;
                }
                k1Var2.u(z4);
                z = false;
            } else {
                z = r3;
                i4 = i;
                k1Var2.u(z);
            }
            i12++;
            r3 = z;
            i = i4;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    @Override // defpackage.o1
    public Parcelable j() {
        SavedState savedState = new SavedState();
        savedState.b = this.D;
        return savedState;
    }

    @Override // defpackage.d1
    public boolean n(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.k) {
            return false;
        }
        return super.n(viewGroup, i);
    }

    @Override // defpackage.d1
    public View p(k1 k1Var, View view, ViewGroup viewGroup) {
        View actionView = k1Var.getActionView();
        if (actionView == null || k1Var.j()) {
            actionView = super.p(k1Var, view, viewGroup);
        }
        actionView.setVisibility(k1Var.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.d1
    public p1 q(ViewGroup viewGroup) {
        p1 p1Var = this.i;
        p1 q = super.q(viewGroup);
        if (p1Var != q) {
            ((ActionMenuView) q).setPresenter(this);
        }
        return q;
    }

    @Override // defpackage.d1
    public boolean s(int i, k1 k1Var) {
        return k1Var.l();
    }
}
