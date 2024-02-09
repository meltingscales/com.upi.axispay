package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.vision.barcode.Barcode;
import defpackage.ic;
import defpackage.o1;

/* compiled from: AxisPay */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements t2, sb, qb, rb {
    public static final int[] G = {l.actionBarSize, 16842841};
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final AnimatorListenerAdapter C;
    public final Runnable D;
    public final Runnable E;
    public final tb F;
    public int b;
    public int c;
    public ContentFrameLayout d;
    public ActionBarContainer e;
    public u2 f;
    public Drawable g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public final Rect o;
    public final Rect p;
    public final Rect q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public ic v;
    public ic w;
    public ic x;
    public ic y;
    public d z;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.l = false;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.e.animate().translationY(-ActionBarOverlayLayout.this.e.getHeight()).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();

        void c(int i);

        void d();

        void e(boolean z);

        void f();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i, int i2) {
            super(i, i2);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        ic icVar = ic.b;
        this.v = icVar;
        this.w = icVar;
        this.x = icVar;
        this.y = icVar;
        this.C = new a();
        this.D = new b();
        this.E = new c();
        v(context);
        this.F = new tb(this);
    }

    public final void A() {
        u();
        this.D.run();
    }

    public final boolean B(float f) {
        this.A.fling(0, 0, 0, (int) f, 0, 0, RecyclerView.UNDEFINED_DURATION, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return this.A.getFinalY() > this.e.getHeight();
    }

    @Override // defpackage.t2
    public void a(Menu menu, o1.a aVar) {
        z();
        this.f.a(menu, aVar);
    }

    @Override // defpackage.t2
    public boolean b() {
        z();
        return this.f.b();
    }

    @Override // defpackage.t2
    public void c() {
        z();
        this.f.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // defpackage.t2
    public boolean d() {
        z();
        return this.f.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.g == null || this.h) {
            return;
        }
        int bottom = this.e.getVisibility() == 0 ? (int) (this.e.getBottom() + this.e.getTranslationY() + 0.5f) : 0;
        this.g.setBounds(0, bottom, getWidth(), this.g.getIntrinsicHeight() + bottom);
        this.g.draw(canvas);
    }

    @Override // defpackage.t2
    public boolean e() {
        z();
        return this.f.e();
    }

    @Override // defpackage.t2
    public boolean f() {
        z();
        return this.f.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        z();
        boolean q = q(this.e, rect, true, true, false, true);
        this.r.set(rect);
        u3.a(this, this.r, this.o);
        if (!this.s.equals(this.r)) {
            this.s.set(this.r);
            q = true;
        }
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
            q = true;
        }
        if (q) {
            requestLayout();
        }
        return true;
    }

    @Override // defpackage.t2
    public boolean g() {
        z();
        return this.f.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.F.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f.getTitle();
    }

    @Override // defpackage.qb
    public void h(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.qb
    public void i(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.qb
    public void j(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // defpackage.t2
    public void k(int i) {
        z();
        if (i == 2) {
            this.f.v();
        } else if (i == 5) {
            this.f.w();
        } else if (i != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // defpackage.t2
    public void l() {
        z();
        this.f.h();
    }

    @Override // defpackage.rb
    public void m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        n(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.qb
    public void n(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.qb
    public boolean o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        ic x = ic.x(windowInsets, this);
        boolean q = q(this.e, new Rect(x.j(), x.l(), x.k(), x.i()), true, true, false, true);
        ac.g(this, x, this.o);
        Rect rect = this.o;
        ic n = x.n(rect.left, rect.top, rect.right, rect.bottom);
        this.v = n;
        boolean z = true;
        if (!this.w.equals(n)) {
            this.w = this.v;
            q = true;
        }
        if (this.p.equals(this.o)) {
            z = q;
        } else {
            this.p.set(this.o);
        }
        if (z) {
            requestLayout();
        }
        return x.a().c().b().v();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        ac.n0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        z();
        measureChildWithMargins(this.e, i, 0, i2, 0);
        e eVar = (e) this.e.getLayoutParams();
        int max = Math.max(0, this.e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.e.getMeasuredState());
        boolean z = (ac.N(this) & Barcode.QR_CODE) != 0;
        if (z) {
            measuredHeight = this.b;
            if (this.j && this.e.getTabContainer() != null) {
                measuredHeight += this.b;
            }
        } else {
            measuredHeight = this.e.getVisibility() != 8 ? this.e.getMeasuredHeight() : 0;
        }
        this.q.set(this.o);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            this.x = this.v;
        } else {
            this.t.set(this.r);
        }
        if (!this.i && !z) {
            Rect rect = this.q;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (i3 >= 21) {
                this.x = this.x.n(0, measuredHeight, 0, 0);
            }
        } else if (i3 >= 21) {
            e9 b2 = e9.b(this.x.j(), this.x.l() + measuredHeight, this.x.k(), this.x.i() + 0);
            ic.b bVar = new ic.b(this.x);
            bVar.c(b2);
            this.x = bVar.a();
        } else {
            Rect rect2 = this.t;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        q(this.d, this.q, true, true, true, true);
        if (i3 >= 21 && !this.y.equals(this.x)) {
            ic icVar = this.x;
            this.y = icVar;
            ac.h(this.d, icVar);
        } else if (i3 < 21 && !this.u.equals(this.t)) {
            this.u.set(this.t);
            this.d.a(this.t);
        }
        measureChildWithMargins(this.d, i, 0, i2, 0);
        e eVar2 = (e) this.d.getLayoutParams();
        int max3 = Math.max(max, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.sb
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.k && z) {
            if (B(f2)) {
                p();
            } else {
                A();
            }
            this.l = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.sb
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.sb
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.sb
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.m + i2;
        this.m = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.sb
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.F.b(view, view2, i);
        this.m = getActionBarHideOffset();
        u();
        d dVar = this.z;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.sb
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.e.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.sb
    public void onStopNestedScroll(View view) {
        if (this.k && !this.l) {
            if (this.m <= this.e.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.z;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        z();
        int i2 = this.n ^ i;
        this.n = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & Barcode.QR_CODE) != 0;
        d dVar = this.z;
        if (dVar != null) {
            dVar.e(!z2);
            if (!z && z2) {
                this.z.f();
            } else {
                this.z.a();
            }
        }
        if ((i2 & Barcode.QR_CODE) == 0 || this.z == null) {
            return;
        }
        ac.n0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.c = i;
        d dVar = this.z;
        if (dVar != null) {
            dVar.c(i);
        }
    }

    public final void p() {
        u();
        this.E.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // android.view.ViewGroup
    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i) {
        u();
        this.e.setTranslationY(-Math.max(0, Math.min(i, this.e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.z = dVar;
        if (getWindowToken() != null) {
            this.z.c(this.c);
            int i = this.n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                ac.n0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.k) {
            this.k = z;
            if (z) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        z();
        this.f.setIcon(i);
    }

    public void setLogo(int i) {
        z();
        this.f.r(i);
    }

    public void setOverlayMode(boolean z) {
        this.i = z;
        this.h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // defpackage.t2
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f.setWindowCallback(callback);
    }

    @Override // defpackage.t2
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final u2 t(View view) {
        if (view instanceof u2) {
            return (u2) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void u() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(G);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.h = context.getApplicationInfo().targetSdkVersion < 19;
        this.A = new OverScroller(context);
    }

    public boolean w() {
        return this.i;
    }

    public final void x() {
        u();
        postDelayed(this.E, 600L);
    }

    public final void y() {
        u();
        postDelayed(this.D, 600L);
    }

    public void z() {
        if (this.d == null) {
            this.d = (ContentFrameLayout) findViewById(q.action_bar_activity_content);
            this.e = (ActionBarContainer) findViewById(q.action_bar_container);
            this.f = t(findViewById(q.action_bar));
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f.setIcon(drawable);
    }
}
