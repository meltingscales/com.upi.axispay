package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ActionBarContextView extends v1 {
    public CharSequence j;
    public CharSequence k;
    public View l;
    public View m;
    public View n;
    public LinearLayout o;
    public TextView p;
    public TextView q;
    public int r;
    public int s;
    public boolean t;
    public int u;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ u0 b;

        public a(ActionBarContextView actionBarContextView, u0 u0Var) {
            this.b = u0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public void g() {
        if (this.l == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // defpackage.v1
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // defpackage.v1
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.k;
    }

    public CharSequence getTitle() {
        return this.j;
    }

    public void h(u0 u0Var) {
        View view = this.l;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.u, (ViewGroup) this, false);
            this.l = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.l);
        }
        View findViewById = this.l.findViewById(q.action_mode_close_button);
        this.m = findViewById;
        findViewById.setOnClickListener(new a(this, u0Var));
        i1 i1Var = (i1) u0Var.e();
        ActionMenuPresenter actionMenuPresenter = this.e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.A();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.e = actionMenuPresenter2;
        actionMenuPresenter2.L(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        i1Var.c(this.e, this.c);
        ActionMenuView actionMenuView = (ActionMenuView) this.e.q(this);
        this.d = actionMenuView;
        ac.u0(actionMenuView, null);
        addView(this.d, layoutParams);
    }

    public final void i() {
        if (this.o == null) {
            LayoutInflater.from(getContext()).inflate(r.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.o = linearLayout;
            this.p = (TextView) linearLayout.findViewById(q.action_bar_title);
            this.q = (TextView) this.o.findViewById(q.action_bar_subtitle);
            if (this.r != 0) {
                this.p.setTextAppearance(getContext(), this.r);
            }
            if (this.s != 0) {
                this.q.setTextAppearance(getContext(), this.s);
            }
        }
        this.p.setText(this.j);
        this.q.setText(this.k);
        boolean z = !TextUtils.isEmpty(this.j);
        boolean z2 = !TextUtils.isEmpty(this.k);
        int i = 0;
        this.q.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.o;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.o.getParent() == null) {
            addView(this.o);
        }
    }

    public boolean j() {
        return this.t;
    }

    public void k() {
        removeAllViews();
        this.n = null;
        this.d = null;
        this.e = null;
        View view = this.m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        ActionMenuPresenter actionMenuPresenter = this.e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.M();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.D();
            this.e.E();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.j);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean b = u3.b(this);
        int paddingRight = b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
            int i5 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d = v1.d(paddingRight, i5, b);
            paddingRight = v1.d(d + e(this.l, d, paddingTop, paddingTop2, b), i6, b);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.o;
        if (linearLayout != null && this.n == null && linearLayout.getVisibility() != 8) {
            i7 += e(this.o, i7, paddingTop, paddingTop2, b);
        }
        int i8 = i7;
        View view2 = this.n;
        if (view2 != null) {
            e(view2, i8, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.d;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int i3 = CommonUtils.BYTES_IN_A_GIGABYTE;
        if (mode == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 0) {
                int size = View.MeasureSpec.getSize(i);
                int i4 = this.f;
                if (i4 <= 0) {
                    i4 = View.MeasureSpec.getSize(i2);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i5 = i4 - paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, RecyclerView.UNDEFINED_DURATION);
                View view = this.l;
                if (view != null) {
                    int c = c(view, paddingLeft, makeMeasureSpec, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
                    paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.d;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = c(this.d, paddingLeft, makeMeasureSpec, 0);
                }
                LinearLayout linearLayout = this.o;
                if (linearLayout != null && this.n == null) {
                    if (this.t) {
                        this.o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.o.getMeasuredWidth();
                        boolean z = measuredWidth <= paddingLeft;
                        if (z) {
                            paddingLeft -= measuredWidth;
                        }
                        this.o.setVisibility(z ? 0 : 8);
                    } else {
                        paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                    }
                }
                View view2 = this.n;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i6 = layoutParams.width;
                    int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                    if (i6 >= 0) {
                        paddingLeft = Math.min(i6, paddingLeft);
                    }
                    int i8 = layoutParams.height;
                    if (i8 == -2) {
                        i3 = Integer.MIN_VALUE;
                    }
                    if (i8 >= 0) {
                        i5 = Math.min(i8, i5);
                    }
                    this.n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
                }
                if (this.f <= 0) {
                    int childCount = getChildCount();
                    int i9 = 0;
                    for (int i10 = 0; i10 < childCount; i10++) {
                        int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                        if (measuredHeight > i9) {
                            i9 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i9);
                    return;
                }
                setMeasuredDimension(size, i4);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // defpackage.v1
    public void setContentHeight(int i) {
        this.f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.n;
        if (view2 != null) {
            removeView(view2);
        }
        this.n = view;
        if (view != null && (linearLayout = this.o) != null) {
            removeView(linearLayout);
            this.o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.k = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.j = charSequence;
        i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.t) {
            requestLayout();
        }
        this.t = z;
    }

    @Override // defpackage.v1, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o3 v = o3.v(context, attributeSet, u.ActionMode, i, 0);
        ac.u0(this, v.g(u.ActionMode_background));
        this.r = v.n(u.ActionMode_titleTextStyle, 0);
        this.s = v.n(u.ActionMode_subtitleTextStyle, 0);
        this.f = v.m(u.ActionMode_height, 0);
        this.u = v.n(u.ActionMode_closeItemLayout, r.abc_action_mode_close_item_material);
        v.w();
    }
}
