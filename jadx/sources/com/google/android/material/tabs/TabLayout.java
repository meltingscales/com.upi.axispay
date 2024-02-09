package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.BadgeDrawable;
import defpackage.lc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: AxisPay */
@ViewPager.e
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    public static final int R = rv.Widget_Design_TabLayout;
    public static final ab<g> S = new cb(16);
    public int A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public uz F;
    public c G;
    public final ArrayList<c> H;
    public c I;
    public ValueAnimator J;
    public ViewPager K;
    public no L;
    public DataSetObserver M;
    public h N;
    public b O;
    public boolean P;
    public final ab<i> Q;
    public final ArrayList<g> b;
    public g c;
    public final f d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public int n;
    public PorterDuff.Mode o;
    public float p;
    public float q;
    public final int r;
    public int s;
    public final int t;
    public final int u;
    public final int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b implements ViewPager.i {
        public boolean a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, no noVar, no noVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.K == viewPager) {
                tabLayout.H(noVar2, this.a);
            }
        }

        public void b(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: AxisPay */
    @Deprecated
    /* loaded from: classes.dex */
    public interface c<T extends g> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface d extends c<g> {
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.A();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.A();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class f extends LinearLayout {
        public ValueAnimator b;
        public int c;
        public float d;
        public int e;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ View a;
            public final /* synthetic */ View b;

            public a(View view, View view2) {
                this.a = view;
                this.b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.g(this.a, this.b, valueAnimator.getAnimatedFraction());
            }
        }

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class b extends AnimatorListenerAdapter {
            public final /* synthetic */ int a;

            public b(int i) {
                this.a = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                f.this.c = this.a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                f.this.c = this.a;
            }
        }

        public f(Context context) {
            super(context);
            this.c = -1;
            this.e = -1;
            setWillNotDraw(false);
        }

        public void b(int i, int i2) {
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.b.cancel();
            }
            h(true, i, i2);
        }

        public boolean c() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public final void d() {
            View childAt = getChildAt(this.c);
            uz uzVar = TabLayout.this.F;
            TabLayout tabLayout = TabLayout.this;
            uzVar.d(tabLayout, childAt, tabLayout.m);
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height = TabLayout.this.m.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.m.getIntrinsicHeight();
            }
            int i = TabLayout.this.z;
            int i2 = 0;
            if (i == 0) {
                i2 = getHeight() - height;
                height = getHeight();
            } else if (i == 1) {
                i2 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i != 2) {
                height = i != 3 ? 0 : getHeight();
            }
            if (TabLayout.this.m.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.m.getBounds();
                TabLayout.this.m.setBounds(bounds.left, i2, bounds.right, height);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.m;
                if (tabLayout.n != 0) {
                    drawable = o9.r(drawable);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawable.setColorFilter(TabLayout.this.n, PorterDuff.Mode.SRC_IN);
                    } else {
                        o9.n(drawable, TabLayout.this.n);
                    }
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        public void e(int i, float f) {
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.b.cancel();
            }
            this.c = i;
            this.d = f;
            g(getChildAt(i), getChildAt(this.c + 1), this.d);
        }

        public void f(int i) {
            Rect bounds = TabLayout.this.m.getBounds();
            TabLayout.this.m.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        public final void g(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                uz uzVar = TabLayout.this.F;
                TabLayout tabLayout = TabLayout.this;
                uzVar.c(tabLayout, view, view2, f, tabLayout.m);
            } else {
                Drawable drawable = TabLayout.this.m;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.m.getBounds().bottom);
            }
            ac.h0(this);
        }

        public final void h(boolean z, int i, int i2) {
            View childAt = getChildAt(this.c);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                d();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.b = valueAnimator;
                valueAnimator.setInterpolator(tv.b);
                valueAnimator.setDuration(i2);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.addListener(new b(i));
                valueAnimator.start();
                return;
            }
            this.b.removeAllUpdateListeners();
            this.b.addUpdateListener(aVar);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                h(false, this.c, -1);
            } else {
                d();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.x == 1 || tabLayout.A == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (((int) ny.b(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i3;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.x = 0;
                    tabLayout2.O(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT >= 23 || this.e == i) {
                return;
            }
            requestLayout();
            this.e = i;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class g {
        public Drawable a;
        public CharSequence b;
        public CharSequence c;
        public View e;
        public TabLayout g;
        public i h;
        public int d = -1;
        public int f = 1;
        public int i = -1;

        public View e() {
            return this.e;
        }

        public Drawable f() {
            return this.a;
        }

        public int g() {
            return this.d;
        }

        public int h() {
            return this.f;
        }

        public CharSequence i() {
            return this.b;
        }

        public boolean j() {
            TabLayout tabLayout = this.g;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.d;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void k() {
            this.g = null;
            this.h = null;
            this.a = null;
            this.i = -1;
            this.b = null;
            this.c = null;
            this.d = -1;
            this.e = null;
        }

        public void l() {
            TabLayout tabLayout = this.g;
            if (tabLayout != null) {
                tabLayout.F(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public g m(CharSequence charSequence) {
            this.c = charSequence;
            t();
            return this;
        }

        public g n(int i) {
            o(LayoutInflater.from(this.h.getContext()).inflate(i, (ViewGroup) this.h, false));
            return this;
        }

        public g o(View view) {
            this.e = view;
            t();
            return this;
        }

        public g p(int i) {
            TabLayout tabLayout = this.g;
            if (tabLayout != null) {
                q(k0.d(tabLayout.getContext(), i));
                return this;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public g q(Drawable drawable) {
            this.a = drawable;
            TabLayout tabLayout = this.g;
            if (tabLayout.x == 1 || tabLayout.A == 2) {
                tabLayout.O(true);
            }
            t();
            if (jw.a && this.h.l() && this.h.f.isVisible()) {
                this.h.invalidate();
            }
            return this;
        }

        public void r(int i) {
            this.d = i;
        }

        public g s(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(charSequence)) {
                this.h.setContentDescription(charSequence);
            }
            this.b = charSequence;
            t();
            return this;
        }

        public void t() {
            i iVar = this.h;
            if (iVar != null) {
                iVar.t();
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class h implements ViewPager.j {
        public final WeakReference<TabLayout> b;
        public int c;
        public int d;

        public h(TabLayout tabLayout) {
            this.b = new WeakReference<>(tabLayout);
        }

        public void a() {
            this.d = 0;
            this.c = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i) {
            this.c = this.d;
            this.d = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.b.get();
            if (tabLayout != null) {
                int i3 = this.d;
                boolean z = false;
                boolean z2 = i3 != 2 || this.c == 1;
                if (i3 != 2 || this.c != 0) {
                    z = true;
                }
                tabLayout.J(i, f, z2, z);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i) {
            TabLayout tabLayout = this.b.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.d;
            tabLayout.G(tabLayout.x(i), i2 == 0 || (i2 == 2 && this.c == 0));
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class i extends LinearLayout {
        public g b;
        public TextView c;
        public ImageView d;
        public View e;
        public BadgeDrawable f;
        public View g;
        public TextView h;
        public ImageView i;
        public Drawable j;
        public int k;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class a implements View.OnLayoutChangeListener {
            public final /* synthetic */ View a;

            public a(View view) {
                this.a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.a.getVisibility() == 0) {
                    i.this.s(this.a);
                }
            }
        }

        public i(Context context) {
            super(context);
            this.k = 2;
            u(context);
            ac.E0(this, TabLayout.this.e, TabLayout.this.f, TabLayout.this.g, TabLayout.this.h);
            setGravity(17);
            setOrientation(!TabLayout.this.B ? 1 : 0);
            setClickable(true);
            ac.F0(this, yb.b(getContext(), 1002));
        }

        private BadgeDrawable getBadge() {
            return this.f;
        }

        private BadgeDrawable getOrCreateBadge() {
            if (this.f == null) {
                this.f = BadgeDrawable.c(getContext());
            }
            r();
            BadgeDrawable badgeDrawable = this.f;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.j;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.j.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void f(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        public final float g(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        public int getContentHeight() {
            View[] viewArr = {this.c, this.d, this.g};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                    i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i - i2;
        }

        public int getContentWidth() {
            View[] viewArr = {this.c, this.d, this.g};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        public g getTab() {
            return this.b;
        }

        public final void h(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        public final FrameLayout i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        public final void j(Canvas canvas) {
            Drawable drawable = this.j;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.j.draw(canvas);
            }
        }

        public final FrameLayout k(View view) {
            if ((view == this.d || view == this.c) && jw.a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        public final boolean l() {
            return this.f != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void m() {
            FrameLayout frameLayout;
            if (jw.a) {
                frameLayout = i();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(ov.design_layout_tab_icon, (ViewGroup) frameLayout, false);
            this.d = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void n() {
            FrameLayout frameLayout;
            if (jw.a) {
                frameLayout = i();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(ov.design_layout_tab_text, (ViewGroup) frameLayout, false);
            this.c = textView;
            frameLayout.addView(textView);
        }

        public void o() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.f.g()));
            }
            lc E0 = lc.E0(accessibilityNodeInfo);
            E0.d0(lc.c.a(0, 1, this.b.g(), 1, false, isSelected()));
            if (isSelected()) {
                E0.b0(false);
                E0.S(lc.a.g);
            }
            E0.s0(getResources().getString(qv.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.s, RecyclerView.UNDEFINED_DURATION);
            }
            super.onMeasure(i, i2);
            if (this.c != null) {
                float f = TabLayout.this.p;
                int i3 = this.k;
                ImageView imageView = this.d;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.q;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.c.getTextSize();
                int lineCount = this.c.getLineCount();
                int d = ad.d(this.c);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (d >= 0 && i3 != d)) {
                    if (TabLayout.this.A == 1 && i4 > 0 && lineCount == 1 && ((layout = this.c.getLayout()) == null || g(layout, 0, f) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z = false;
                    }
                    if (z) {
                        this.c.setTextSize(0, f);
                        this.c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public final void p(View view) {
            if (l() && view != null) {
                h(false);
                jw.a(this.f, view, k(view));
                this.e = view;
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.b != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.b.l();
                return true;
            }
            return performClick;
        }

        public final void q() {
            if (l()) {
                h(true);
                View view = this.e;
                if (view != null) {
                    jw.b(this.f, view);
                    this.e = null;
                }
            }
        }

        public final void r() {
            g gVar;
            g gVar2;
            if (l()) {
                if (this.g != null) {
                    q();
                } else if (this.d != null && (gVar2 = this.b) != null && gVar2.f() != null) {
                    View view = this.e;
                    ImageView imageView = this.d;
                    if (view != imageView) {
                        q();
                        p(this.d);
                        return;
                    }
                    s(imageView);
                } else if (this.c != null && (gVar = this.b) != null && gVar.h() == 1) {
                    View view2 = this.e;
                    TextView textView = this.c;
                    if (view2 != textView) {
                        q();
                        p(this.c);
                        return;
                    }
                    s(textView);
                } else {
                    q();
                }
            }
        }

        public final void s(View view) {
            if (l() && view == this.e) {
                jw.c(this.f, view, k(view));
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.g;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.b) {
                this.b = gVar;
                t();
            }
        }

        public final void t() {
            g gVar = this.b;
            Drawable drawable = null;
            View e = gVar != null ? gVar.e() : null;
            if (e != null) {
                ViewParent parent = e.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(e);
                    }
                    addView(e);
                }
                this.g = e;
                TextView textView = this.c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) e.findViewById(16908308);
                this.h = textView2;
                if (textView2 != null) {
                    this.k = ad.d(textView2);
                }
                this.i = (ImageView) e.findViewById(16908294);
            } else {
                View view = this.g;
                if (view != null) {
                    removeView(view);
                    this.g = null;
                }
                this.h = null;
                this.i = null;
            }
            if (this.g == null) {
                if (this.d == null) {
                    m();
                }
                if (gVar != null && gVar.f() != null) {
                    drawable = o9.r(gVar.f()).mutate();
                }
                if (drawable != null) {
                    o9.o(drawable, TabLayout.this.k);
                    PorterDuff.Mode mode = TabLayout.this.o;
                    if (mode != null) {
                        o9.p(drawable, mode);
                    }
                }
                if (this.c == null) {
                    n();
                    this.k = ad.d(this.c);
                }
                ad.q(this.c, TabLayout.this.i);
                ColorStateList colorStateList = TabLayout.this.j;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
                w(this.c, this.d);
                r();
                f(this.d);
                f(this.c);
            } else {
                TextView textView3 = this.h;
                if (textView3 != null || this.i != null) {
                    w(textView3, this.i);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.c)) {
                setContentDescription(gVar.c);
            }
            setSelected(gVar != null && gVar.j());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        public final void u(Context context) {
            int i = TabLayout.this.r;
            if (i != 0) {
                Drawable d = k0.d(context, i);
                this.j = d;
                if (d != null && d.isStateful()) {
                    this.j.setState(getDrawableState());
                }
            } else {
                this.j = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.l != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList a2 = yy.a(TabLayout.this.l);
                if (Build.VERSION.SDK_INT >= 21) {
                    boolean z = TabLayout.this.E;
                    if (z) {
                        gradientDrawable = null;
                    }
                    gradientDrawable = new RippleDrawable(a2, gradientDrawable, z ? null : gradientDrawable2);
                } else {
                    Drawable r = o9.r(gradientDrawable2);
                    o9.o(r, a2);
                    gradientDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, r});
                }
            }
            ac.u0(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        public final void v() {
            setOrientation(!TabLayout.this.B ? 1 : 0);
            TextView textView = this.h;
            if (textView == null && this.i == null) {
                w(this.c, this.d);
            } else {
                w(textView, this.i);
            }
        }

        public final void w(TextView textView, ImageView imageView) {
            g gVar = this.b;
            Drawable mutate = (gVar == null || gVar.f() == null) ? null : o9.r(this.b.f()).mutate();
            g gVar2 = this.b;
            CharSequence i = gVar2 != null ? gVar2.i() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(i);
            if (textView != null) {
                if (z) {
                    textView.setText(i);
                    if (this.b.f == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int b = (z && imageView.getVisibility() == 0) ? (int) ny.b(getContext(), 8) : 0;
                if (TabLayout.this.B) {
                    if (b != lb.a(marginLayoutParams)) {
                        lb.d(marginLayoutParams, b);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (b != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = b;
                    lb.d(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.b;
            CharSequence charSequence = gVar3 != null ? gVar3.c : null;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 21 || i2 > 23) {
                if (!z) {
                    i = charSequence;
                }
                q3.a(this, i);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class j implements d {
        public final ViewPager a;

        public j(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(g gVar) {
            this.a.setCurrentItem(gVar.g());
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iv.tabStyle);
    }

    private int getDefaultHeight() {
        int size = this.b.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                g gVar = this.b.get(i2);
                if (gVar != null && gVar.f() != null && !TextUtils.isEmpty(gVar.i())) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return (!z || this.B) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i2 = this.t;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A;
        if (i3 == 0 || i3 == 2) {
            return this.v;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public static ColorStateList p(int i2, int i3) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.d.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.d.getChildAt(i3);
                boolean z = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z = false;
                }
                childAt.setActivated(z);
                i3++;
            }
        }
    }

    public void A() {
        int currentItem;
        C();
        no noVar = this.L;
        if (noVar != null) {
            int d2 = noVar.d();
            for (int i2 = 0; i2 < d2; i2++) {
                g z = z();
                z.s(this.L.f(i2));
                g(z, false);
            }
            ViewPager viewPager = this.K;
            if (viewPager == null || d2 <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            F(x(currentItem));
        }
    }

    public boolean B(g gVar) {
        return S.a(gVar);
    }

    public void C() {
        for (int childCount = this.d.getChildCount() - 1; childCount >= 0; childCount--) {
            E(childCount);
        }
        Iterator<g> it = this.b.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.k();
            B(next);
        }
        this.c = null;
    }

    @Deprecated
    public void D(c cVar) {
        this.H.remove(cVar);
    }

    public final void E(int i2) {
        i iVar = (i) this.d.getChildAt(i2);
        this.d.removeViewAt(i2);
        if (iVar != null) {
            iVar.o();
            this.Q.a(iVar);
        }
        requestLayout();
    }

    public void F(g gVar) {
        G(gVar, true);
    }

    public void G(g gVar, boolean z) {
        g gVar2 = this.c;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                t(gVar);
                k(gVar.g());
                return;
            }
            return;
        }
        int g2 = gVar != null ? gVar.g() : -1;
        if (z) {
            if ((gVar2 == null || gVar2.g() == -1) && g2 != -1) {
                I(g2, 0.0f, true);
            } else {
                k(g2);
            }
            if (g2 != -1) {
                setSelectedTabView(g2);
            }
        }
        this.c = gVar;
        if (gVar2 != null) {
            v(gVar2);
        }
        if (gVar != null) {
            u(gVar);
        }
    }

    public void H(no noVar, boolean z) {
        DataSetObserver dataSetObserver;
        no noVar2 = this.L;
        if (noVar2 != null && (dataSetObserver = this.M) != null) {
            noVar2.s(dataSetObserver);
        }
        this.L = noVar;
        if (z && noVar != null) {
            if (this.M == null) {
                this.M = new e();
            }
            noVar.k(this.M);
        }
        A();
    }

    public void I(int i2, float f2, boolean z) {
        J(i2, f2, z, true);
    }

    public void J(int i2, float f2, boolean z, boolean z2) {
        int round = Math.round(i2 + f2);
        if (round < 0 || round >= this.d.getChildCount()) {
            return;
        }
        if (z2) {
            this.d.e(i2, f2);
        }
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.J.cancel();
        }
        scrollTo(n(i2, f2), 0);
        if (z) {
            setSelectedTabView(round);
        }
    }

    public void K(ViewPager viewPager, boolean z) {
        L(viewPager, z, false);
    }

    public final void L(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.K;
        if (viewPager2 != null) {
            h hVar = this.N;
            if (hVar != null) {
                viewPager2.removeOnPageChangeListener(hVar);
            }
            b bVar = this.O;
            if (bVar != null) {
                this.K.removeOnAdapterChangeListener(bVar);
            }
        }
        c cVar = this.I;
        if (cVar != null) {
            D(cVar);
            this.I = null;
        }
        if (viewPager != null) {
            this.K = viewPager;
            if (this.N == null) {
                this.N = new h(this);
            }
            this.N.a();
            viewPager.addOnPageChangeListener(this.N);
            j jVar = new j(viewPager);
            this.I = jVar;
            c(jVar);
            no adapter = viewPager.getAdapter();
            if (adapter != null) {
                H(adapter, z);
            }
            if (this.O == null) {
                this.O = new b();
            }
            this.O.b(z);
            viewPager.addOnAdapterChangeListener(this.O);
            I(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.K = null;
            H(null, false);
        }
        this.P = z2;
    }

    public final void M() {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.b.get(i2).t();
        }
    }

    public final void N(LinearLayout.LayoutParams layoutParams) {
        if (this.A == 1 && this.x == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    public void O(boolean z) {
        for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
            View childAt = this.d.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            N((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        j(view);
    }

    @Deprecated
    public void c(c cVar) {
        if (this.H.contains(cVar)) {
            return;
        }
        this.H.add(cVar);
    }

    public void d(d dVar) {
        c(dVar);
    }

    public void e(g gVar) {
        g(gVar, this.b.isEmpty());
    }

    public void f(g gVar, int i2, boolean z) {
        if (gVar.g == this) {
            o(gVar, i2);
            i(gVar);
            if (z) {
                gVar.l();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void g(g gVar, boolean z) {
        f(gVar, this.b.size(), z);
    }

    public int getSelectedTabPosition() {
        g gVar = this.c;
        if (gVar != null) {
            return gVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.x;
    }

    public ColorStateList getTabIconTint() {
        return this.k;
    }

    public int getTabIndicatorAnimationMode() {
        return this.D;
    }

    public int getTabIndicatorGravity() {
        return this.z;
    }

    public int getTabMaxWidth() {
        return this.s;
    }

    public int getTabMode() {
        return this.A;
    }

    public ColorStateList getTabRippleColor() {
        return this.l;
    }

    public Drawable getTabSelectedIndicator() {
        return this.m;
    }

    public ColorStateList getTabTextColors() {
        return this.j;
    }

    public final void h(vz vzVar) {
        g z = z();
        CharSequence charSequence = vzVar.b;
        if (charSequence != null) {
            z.s(charSequence);
        }
        Drawable drawable = vzVar.c;
        if (drawable != null) {
            z.q(drawable);
        }
        int i2 = vzVar.d;
        if (i2 != 0) {
            z.n(i2);
        }
        if (!TextUtils.isEmpty(vzVar.getContentDescription())) {
            z.m(vzVar.getContentDescription());
        }
        e(z);
    }

    public final void i(g gVar) {
        i iVar = gVar.h;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.d.addView(iVar, gVar.g(), q());
    }

    public final void j(View view) {
        if (view instanceof vz) {
            h((vz) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void k(int i2) {
        if (i2 == -1) {
            return;
        }
        if (getWindowToken() != null && ac.V(this) && !this.d.c()) {
            int scrollX = getScrollX();
            int n = n(i2, 0.0f);
            if (scrollX != n) {
                w();
                this.J.setIntValues(scrollX, n);
                this.J.start();
            }
            this.d.b(i2, this.y);
            return;
        }
        I(i2, 0.0f, true);
    }

    public final void l(int i2) {
        if (i2 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i2 == 1) {
            this.d.setGravity(1);
            return;
        } else if (i2 != 2) {
            return;
        }
        this.d.setGravity(8388611);
    }

    public final void m() {
        int i2 = this.A;
        ac.E0(this.d, (i2 == 0 || i2 == 2) ? Math.max(0, this.w - this.e) : 0, 0, 0, 0);
        int i3 = this.A;
        if (i3 == 0) {
            l(this.x);
        } else if (i3 == 1 || i3 == 2) {
            if (this.x == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.d.setGravity(1);
        }
        O(true);
    }

    public final int n(int i2, float f2) {
        int i3 = this.A;
        if (i3 == 0 || i3 == 2) {
            View childAt = this.d.getChildAt(i2);
            int i4 = i2 + 1;
            View childAt2 = i4 < this.d.getChildCount() ? this.d.getChildAt(i4) : null;
            int width = childAt != null ? childAt.getWidth() : 0;
            int width2 = childAt2 != null ? childAt2.getWidth() : 0;
            int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
            int i5 = (int) ((width + width2) * 0.5f * f2);
            return ac.C(this) == 0 ? left + i5 : left - i5;
        }
        return 0;
    }

    public final void o(g gVar, int i2) {
        gVar.r(i2);
        this.b.add(i2, gVar);
        int size = this.b.size();
        while (true) {
            i2++;
            if (i2 >= size) {
                return;
            }
            this.b.get(i2).r(i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        iz.e(this);
        if (this.K == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                L((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.P) {
            setupWithViewPager(null);
            this.P = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
            View childAt = this.d.getChildAt(i2);
            if (childAt instanceof i) {
                ((i) childAt).j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        lc.E0(accessibilityNodeInfo).c0(lc.b.b(1, getTabCount(), false, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r0 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L25;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = defpackage.ny.b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.u
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = defpackage.ny.b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.s = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.A
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = r5
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public final LinearLayout.LayoutParams q() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        N(layoutParams);
        return layoutParams;
    }

    public g r() {
        g b2 = S.b();
        return b2 == null ? new g() : b2;
    }

    public final i s(g gVar) {
        ab<i> abVar = this.Q;
        i b2 = abVar != null ? abVar.b() : null;
        if (b2 == null) {
            b2 = new i(getContext());
        }
        b2.setTab(gVar);
        b2.setFocusable(true);
        b2.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.c)) {
            b2.setContentDescription(gVar.b);
        } else {
            b2.setContentDescription(gVar.c);
        }
        return b2;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        iz.d(this, f2);
    }

    public void setInlineLabel(boolean z) {
        if (this.B != z) {
            this.B = z;
            for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                View childAt = this.d.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).v();
                }
            }
            m();
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        w();
        this.J.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.m != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.m = drawable;
        }
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.n = i2;
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.z != i2) {
            this.z = i2;
            ac.h0(this.d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.d.f(i2);
    }

    public void setTabGravity(int i2) {
        if (this.x != i2) {
            this.x = i2;
            m();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            M();
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(k0.c(getContext(), i2));
    }

    public void setTabIndicatorAnimationMode(int i2) {
        this.D = i2;
        if (i2 == 0) {
            this.F = new uz();
        } else if (i2 == 1) {
            this.F = new tz();
        } else {
            throw new IllegalArgumentException(i2 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.C = z;
        ac.h0(this.d);
    }

    public void setTabMode(int i2) {
        if (i2 != this.A) {
            this.A = i2;
            m();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                View childAt = this.d.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(k0.c(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            M();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(no noVar) {
        H(noVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.E != z) {
            this.E = z;
            for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                View childAt = this.d.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        K(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void t(g gVar) {
        for (int size = this.H.size() - 1; size >= 0; size--) {
            this.H.get(size).a(gVar);
        }
    }

    public final void u(g gVar) {
        for (int size = this.H.size() - 1; size >= 0; size--) {
            this.H.get(size).c(gVar);
        }
    }

    public final void v(g gVar) {
        for (int size = this.H.size() - 1; size >= 0; size--) {
            this.H.get(size).b(gVar);
        }
    }

    public final void w() {
        if (this.J == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.J = valueAnimator;
            valueAnimator.setInterpolator(tv.b);
            this.J.setDuration(this.y);
            this.J.addUpdateListener(new a());
        }
    }

    public g x(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.b.get(i2);
    }

    public boolean y() {
        return this.C;
    }

    public g z() {
        g r = r();
        r.g = this;
        r.h = s(r);
        if (r.i != -1) {
            r.h.setId(r.i);
        }
        return r;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TabLayout(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        j(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.G;
        if (cVar2 != null) {
            D(cVar2);
        }
        this.G = cVar;
        if (cVar != null) {
            c(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        j(view);
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(k0.d(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        j(view);
    }
}
