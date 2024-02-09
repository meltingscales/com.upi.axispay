package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    public static final int[] z = {iv.snackbarButtonStyle, iv.snackbarTextViewStyle};
    public final AccessibilityManager x;
    public boolean y;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class SnackbarLayout extends BaseTransientBottomBar.v {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, CommonUtils.BYTES_IN_A_GIGABYTE), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), CommonUtils.BYTES_IN_A_GIGABYTE));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.v, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.v, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.v, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.v, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.v, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    public Snackbar(Context context, ViewGroup viewGroup, View view, rz rzVar) {
        super(context, viewGroup, view, rzVar);
        this.x = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static ViewGroup V(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    public static boolean W(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(z);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    public static Snackbar X(View view, int i, int i2) {
        return Y(view, view.getResources().getText(i), i2);
    }

    public static Snackbar Y(View view, CharSequence charSequence, int i) {
        return Z(null, view, charSequence, i);
    }

    public static Snackbar Z(Context context, View view, CharSequence charSequence, int i) {
        ViewGroup V = V(view);
        if (V != null) {
            if (context == null) {
                context = V.getContext();
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(W(context) ? ov.mtrl_layout_snackbar_include : ov.design_layout_snackbar_include, V, false);
            Snackbar snackbar = new Snackbar(context, V, snackbarContentLayout, snackbarContentLayout);
            snackbar.a0(charSequence);
            snackbar.J(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void N() {
        super.N();
    }

    public Snackbar a0(CharSequence charSequence) {
        ((SnackbarContentLayout) this.c.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void s() {
        super.s();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int v() {
        int v = super.v();
        if (v == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.x.getRecommendedTimeoutMillis(v, (this.y ? 4 : 0) | 1 | 2);
        } else if (this.y && this.x.isTouchExplorationEnabled()) {
            return -2;
        } else {
            return v;
        }
    }
}
