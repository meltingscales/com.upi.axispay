package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.i1;
import defpackage.o1;
import defpackage.v;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public final ArrayList<View> E;
    public final ArrayList<View> F;
    public final int[] G;
    public f H;
    public final ActionMenuView.e I;
    public p3 J;
    public ActionMenuPresenter K;
    public d L;
    public o1.a M;
    public i1.a N;
    public boolean O;
    public final Runnable P;
    public ActionMenuView b;
    public TextView c;
    public TextView d;
    public ImageButton e;
    public ImageView f;
    public Drawable g;
    public CharSequence h;
    public ImageButton i;
    public View j;
    public Context k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public g3 u;
    public int v;
    public int w;
    public int x;
    public CharSequence y;
    public CharSequence z;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.H;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.O();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class d implements o1 {
        public i1 b;
        public k1 c;

        public d() {
        }

        @Override // defpackage.o1
        public void b(i1 i1Var, boolean z) {
        }

        @Override // defpackage.o1
        public void d(Context context, i1 i1Var) {
            k1 k1Var;
            i1 i1Var2 = this.b;
            if (i1Var2 != null && (k1Var = this.c) != null) {
                i1Var2.f(k1Var);
            }
            this.b = i1Var;
        }

        @Override // defpackage.o1
        public void e(Parcelable parcelable) {
        }

        @Override // defpackage.o1
        public boolean f(t1 t1Var) {
            return false;
        }

        @Override // defpackage.o1
        public void g(boolean z) {
            if (this.c != null) {
                i1 i1Var = this.b;
                boolean z2 = false;
                if (i1Var != null) {
                    int size = i1Var.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.b.getItem(i) == this.c) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                k(this.b, this.c);
            }
        }

        @Override // defpackage.o1
        public int getId() {
            return 0;
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
        public boolean k(i1 i1Var, k1 k1Var) {
            View view = Toolbar.this.j;
            if (view instanceof v0) {
                ((v0) view).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.j = null;
            toolbar3.a();
            this.c = null;
            Toolbar.this.requestLayout();
            k1Var.r(false);
            return true;
        }

        @Override // defpackage.o1
        public boolean l(i1 i1Var, k1 k1Var) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.i);
            }
            Toolbar.this.j = k1Var.getActionView();
            this.c = k1Var;
            ViewParent parent2 = Toolbar.this.j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.j);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.a = 8388611 | (toolbar4.o & 112);
                generateDefaultLayoutParams.b = 2;
                toolbar4.j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.j);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            k1Var.r(true);
            View view = Toolbar.this.j;
            if (view instanceof v0) {
                ((v0) view).c();
            }
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.toolbarStyle);
    }

    private MenuInflater getMenuInflater() {
        return new z0(getContext());
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.b;
        return actionMenuView != null && actionMenuView.J();
    }

    public final int B(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int q = q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    public final int C(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int q = q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    public final int D(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void E(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, CommonUtils.BYTES_IN_A_GIGABYTE);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void F() {
        removeCallbacks(this.P);
        post(this.P);
    }

    public void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).b != 2 && childAt != this.b) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    public void H(int i, int i2) {
        h();
        this.u.g(i, i2);
    }

    public void I(i1 i1Var, ActionMenuPresenter actionMenuPresenter) {
        if (i1Var == null && this.b == null) {
            return;
        }
        k();
        i1 N = this.b.N();
        if (N == i1Var) {
            return;
        }
        if (N != null) {
            N.Q(this.K);
            N.Q(this.L);
        }
        if (this.L == null) {
            this.L = new d();
        }
        actionMenuPresenter.I(true);
        if (i1Var != null) {
            i1Var.c(actionMenuPresenter, this.k);
            i1Var.c(this.L, this.k);
        } else {
            actionMenuPresenter.d(this.k, null);
            this.L.d(this.k, null);
            actionMenuPresenter.g(true);
            this.L.g(true);
        }
        this.b.setPopupTheme(this.l);
        this.b.setPresenter(actionMenuPresenter);
        this.K = actionMenuPresenter;
    }

    public void J(o1.a aVar, i1.a aVar2) {
        this.M = aVar;
        this.N = aVar2;
        ActionMenuView actionMenuView = this.b;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void K(Context context, int i) {
        this.n = i;
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void L(Context context, int i) {
        this.m = i;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public final boolean M() {
        if (this.O) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (N(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean N(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean O() {
        ActionMenuView actionMenuView = this.b;
        return actionMenuView != null && actionMenuView.P();
    }

    public void a() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView(this.F.get(size));
        }
        this.F.clear();
    }

    public final void b(List<View> list, int i) {
        boolean z = ac.C(this) == 1;
        int childCount = getChildCount();
        int b2 = ib.b(i, ac.C(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.b == 0 && N(childAt) && p(eVar.a) == b2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.b == 0 && N(childAt2) && p(eVar2.a) == b2) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.b = 1;
        if (z && this.j != null) {
            view.setLayoutParams(eVar);
            this.F.add(view);
            return;
        }
        addView(view, eVar);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.b) != null && actionMenuView.K();
    }

    public void e() {
        d dVar = this.L;
        k1 k1Var = dVar == null ? null : dVar.c;
        if (k1Var != null) {
            k1Var.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.b;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    public void g() {
        if (this.i == null) {
            f2 f2Var = new f2(getContext(), null, l.toolbarNavigationButtonStyle);
            this.i = f2Var;
            f2Var.setImageDrawable(this.g);
            this.i.setContentDescription(this.h);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.o & 112);
            generateDefaultLayoutParams.b = 2;
            this.i.setLayoutParams(generateDefaultLayoutParams);
            this.i.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        g3 g3Var = this.u;
        if (g3Var != null) {
            return g3Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        g3 g3Var = this.u;
        if (g3Var != null) {
            return g3Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        g3 g3Var = this.u;
        if (g3Var != null) {
            return g3Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        g3 g3Var = this.u;
        if (g3Var != null) {
            return g3Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        i1 N;
        ActionMenuView actionMenuView = this.b;
        if ((actionMenuView == null || (N = actionMenuView.N()) == null || !N.hasVisibleItems()) ? false : true) {
            return Math.max(getContentInsetEnd(), Math.max(this.w, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (ac.C(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (ac.C(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.v, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.k;
    }

    public int getPopupTheme() {
        return this.l;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    public final TextView getSubtitleTextView() {
        return this.d;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    public final TextView getTitleTextView() {
        return this.c;
    }

    public u2 getWrapper() {
        if (this.J == null) {
            this.J = new p3(this, true);
        }
        return this.J;
    }

    public final void h() {
        if (this.u == null) {
            this.u = new g3();
        }
    }

    public final void i() {
        if (this.f == null) {
            this.f = new AppCompatImageView(getContext());
        }
    }

    public final void j() {
        k();
        if (this.b.N() == null) {
            i1 i1Var = (i1) this.b.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.b.setExpandedActionViewsExclusive(true);
            i1Var.c(this.L, this.k);
        }
    }

    public final void k() {
        if (this.b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.b = actionMenuView;
            actionMenuView.setPopupTheme(this.l);
            this.b.setOnMenuItemClickListener(this.I);
            this.b.O(this.M, this.N);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388613 | (this.o & 112);
            this.b.setLayoutParams(generateDefaultLayoutParams);
            c(this.b, false);
        }
    }

    public final void l() {
        if (this.e == null) {
            this.e = new f2(getContext(), null, l.toolbarNavigationButtonStyle);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.o & 112);
            this.e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof v.a) {
            return new e((v.a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02a3 A[LOOP:0: B:104:0x02a1->B:105:0x02a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c5 A[LOOP:1: B:107:0x02c3->B:108:0x02c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fe A[LOOP:2: B:116:0x02fc->B:117:0x02fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0229  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c2;
        char c3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.G;
        if (u3.b(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (N(this.e)) {
            E(this.e, i, 0, i2, 0, this.p);
            i3 = this.e.getMeasuredWidth() + s(this.e);
            i4 = Math.max(0, this.e.getMeasuredHeight() + t(this.e));
            i5 = View.combineMeasuredStates(0, this.e.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (N(this.i)) {
            E(this.i, i, 0, i2, 0, this.p);
            i3 = this.i.getMeasuredWidth() + s(this.i);
            i4 = Math.max(i4, this.i.getMeasuredHeight() + t(this.i));
            i5 = View.combineMeasuredStates(i5, this.i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i3);
        iArr[c3] = Math.max(0, currentContentInsetStart - i3);
        if (N(this.b)) {
            E(this.b, i, max, i2, 0, this.p);
            i6 = this.b.getMeasuredWidth() + s(this.b);
            i4 = Math.max(i4, this.b.getMeasuredHeight() + t(this.b));
            i5 = View.combineMeasuredStates(i5, this.b.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (N(this.j)) {
            max2 += D(this.j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.j.getMeasuredHeight() + t(this.j));
            i5 = View.combineMeasuredStates(i5, this.j.getMeasuredState());
        }
        if (N(this.f)) {
            max2 += D(this.f, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f.getMeasuredHeight() + t(this.f));
            i5 = View.combineMeasuredStates(i5, this.f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (((e) childAt.getLayoutParams()).b == 0 && N(childAt)) {
                max2 += D(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + t(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i11 = this.s + this.t;
        int i12 = this.q + this.r;
        if (N(this.c)) {
            D(this.c, i, max2 + i12, i2, i11, iArr);
            int measuredWidth = this.c.getMeasuredWidth() + s(this.c);
            i7 = this.c.getMeasuredHeight() + t(this.c);
            i8 = View.combineMeasuredStates(i5, this.c.getMeasuredState());
            i9 = measuredWidth;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (N(this.d)) {
            i9 = Math.max(i9, D(this.d, i, max2 + i12, i2, i7 + i11, iArr));
            i7 += this.d.getMeasuredHeight() + t(this.d);
            i8 = View.combineMeasuredStates(i8, this.d.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i9 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & i8), M() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i4, i7) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i8 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.b;
        i1 N = actionMenuView != null ? actionMenuView.N() : null;
        int i = savedState.d;
        if (i != 0 && this.L != null && N != null && (findItem = N.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.e) {
            F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        h();
        this.u.f(i == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        k1 k1Var;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d dVar = this.L;
        if (dVar != null && (k1Var = dVar.c) != null) {
            savedState.d = k1Var.getItemId();
        }
        savedState.e = A();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public final int p(int i) {
        int C = ac.C(this);
        int b2 = ib.b(i, C) & 7;
        return (b2 == 1 || b2 == 3 || b2 == 5) ? b2 : C == 1 ? 5 : 3;
    }

    public final int q(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int r = r(eVar.a);
        if (r != 48) {
            if (r != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                if (i3 < i4) {
                    i3 = i4;
                } else {
                    int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                    int i6 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    if (i5 < i6) {
                        i3 = Math.max(0, i3 - (i6 - i5));
                    }
                }
                return paddingTop + i3;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    public final int r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.x & 112;
    }

    public final int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return lb.b(marginLayoutParams) + lb.a(marginLayoutParams);
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(k0.d(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.w) {
            this.w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(k0.d(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(k0.d(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.l != i) {
            this.l = i;
            if (i == 0) {
                this.k = getContext();
            } else {
                this.k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            e eVar = (e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    public boolean v() {
        d dVar = this.L;
        return (dVar == null || dVar.c == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.b;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final boolean y(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.b;
        return actionMenuView != null && actionMenuView.I();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class e extends v.a {
        public int b;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(int i, int i2) {
            super(i, i2);
            this.b = 0;
            this.a = 8388627;
        }

        public e(e eVar) {
            super((v.a) eVar);
            this.b = 0;
            this.b = eVar.b;
        }

        public e(v.a aVar) {
            super(aVar);
            this.b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
            a(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.P = new b();
        Context context2 = getContext();
        int[] iArr = u.Toolbar;
        o3 v = o3.v(context2, attributeSet, iArr, i, 0);
        ac.o0(this, context, iArr, attributeSet, v.r(), i, 0);
        this.m = v.n(u.Toolbar_titleTextAppearance, 0);
        this.n = v.n(u.Toolbar_subtitleTextAppearance, 0);
        this.x = v.l(u.Toolbar_android_gravity, this.x);
        this.o = v.l(u.Toolbar_buttonGravity, 48);
        int e2 = v.e(u.Toolbar_titleMargin, 0);
        int i2 = u.Toolbar_titleMargins;
        e2 = v.s(i2) ? v.e(i2, e2) : e2;
        this.t = e2;
        this.s = e2;
        this.r = e2;
        this.q = e2;
        int e3 = v.e(u.Toolbar_titleMarginStart, -1);
        if (e3 >= 0) {
            this.q = e3;
        }
        int e4 = v.e(u.Toolbar_titleMarginEnd, -1);
        if (e4 >= 0) {
            this.r = e4;
        }
        int e5 = v.e(u.Toolbar_titleMarginTop, -1);
        if (e5 >= 0) {
            this.s = e5;
        }
        int e6 = v.e(u.Toolbar_titleMarginBottom, -1);
        if (e6 >= 0) {
            this.t = e6;
        }
        this.p = v.f(u.Toolbar_maxButtonHeight, -1);
        int e7 = v.e(u.Toolbar_contentInsetStart, RecyclerView.UNDEFINED_DURATION);
        int e8 = v.e(u.Toolbar_contentInsetEnd, RecyclerView.UNDEFINED_DURATION);
        int f2 = v.f(u.Toolbar_contentInsetLeft, 0);
        int f3 = v.f(u.Toolbar_contentInsetRight, 0);
        h();
        this.u.e(f2, f3);
        if (e7 != Integer.MIN_VALUE || e8 != Integer.MIN_VALUE) {
            this.u.g(e7, e8);
        }
        this.v = v.e(u.Toolbar_contentInsetStartWithNavigation, RecyclerView.UNDEFINED_DURATION);
        this.w = v.e(u.Toolbar_contentInsetEndWithActions, RecyclerView.UNDEFINED_DURATION);
        this.g = v.g(u.Toolbar_collapseIcon);
        this.h = v.p(u.Toolbar_collapseContentDescription);
        CharSequence p = v.p(u.Toolbar_title);
        if (!TextUtils.isEmpty(p)) {
            setTitle(p);
        }
        CharSequence p2 = v.p(u.Toolbar_subtitle);
        if (!TextUtils.isEmpty(p2)) {
            setSubtitle(p2);
        }
        this.k = getContext();
        setPopupTheme(v.n(u.Toolbar_popupTheme, 0));
        Drawable g = v.g(u.Toolbar_navigationIcon);
        if (g != null) {
            setNavigationIcon(g);
        }
        CharSequence p3 = v.p(u.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(p3)) {
            setNavigationContentDescription(p3);
        }
        Drawable g2 = v.g(u.Toolbar_logo);
        if (g2 != null) {
            setLogo(g2);
        }
        CharSequence p4 = v.p(u.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(p4)) {
            setLogoDescription(p4);
        }
        int i3 = u.Toolbar_titleTextColor;
        if (v.s(i3)) {
            setTitleTextColor(v.c(i3));
        }
        int i4 = u.Toolbar_subtitleTextColor;
        if (v.s(i4)) {
            setSubtitleTextColor(v.c(i4));
        }
        int i5 = u.Toolbar_menu;
        if (v.s(i5)) {
            x(v.n(i5, 0));
        }
        v.w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.i.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.g);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f)) {
                c(this.f, true);
            }
        } else {
            ImageView imageView = this.f;
            if (imageView != null && y(imageView)) {
                removeView(this.f);
                this.F.remove(this.f);
            }
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.e)) {
                c(this.e, true);
            }
        } else {
            ImageButton imageButton = this.e;
            if (imageButton != null && y(imageButton)) {
                removeView(this.e);
                this.F.remove(this.e);
            }
        }
        ImageButton imageButton2 = this.e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.d = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.n;
                if (i != 0) {
                    this.d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.d.setTextColor(colorStateList);
                }
            }
            if (!y(this.d)) {
                c(this.d, true);
            }
        } else {
            TextView textView = this.d;
            if (textView != null && y(textView)) {
                removeView(this.d);
                this.F.remove(this.d);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!y(this.c)) {
                c(this.c, true);
            }
        } else {
            TextView textView = this.c;
            if (textView != null && y(textView)) {
                removeView(this.c);
                this.F.remove(this.c);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int d;
        public boolean e;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
            this.e = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
