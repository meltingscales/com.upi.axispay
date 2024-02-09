package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final int T = rv.Widget_MaterialComponents_Toolbar;
    public Integer Q;
    public boolean R;
    public boolean S;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iv.toolbarStyle);
    }

    public final Pair<Integer, Integer> P(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    public final void Q(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            hz hzVar = new hz();
            hzVar.X(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            hzVar.M(context);
            hzVar.W(ac.w(this));
            ac.u0(this, hzVar);
        }
    }

    public final void R(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, CommonUtils.BYTES_IN_A_GIGABYTE), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    public final void S() {
        if (this.R || this.S) {
            TextView c = my.c(this);
            TextView a = my.a(this);
            if (c == null && a == null) {
                return;
            }
            Pair<Integer, Integer> P = P(c, a);
            if (this.R && c != null) {
                R(c, P);
            }
            if (!this.S || a == null) {
                return;
            }
            R(a, P);
        }
    }

    public final Drawable T(Drawable drawable) {
        if (drawable == null || this.Q == null) {
            return drawable;
        }
        Drawable r = o9.r(drawable);
        o9.n(r, this.Q.intValue());
        return r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        iz.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        iz.d(this, f);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(T(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.Q = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.S != z) {
            this.S = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.R != z) {
            this.R = z;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.T
            android.content.Context r8 = defpackage.f00.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = defpackage.sv.MaterialToolbar
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = defpackage.ly.h(r0, r1, r2, r3, r4, r5)
            int r10 = defpackage.sv.MaterialToolbar_navigationIconTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L29
            r0 = -1
            int r10 = r9.getColor(r10, r0)
            r7.setNavigationIconTint(r10)
        L29:
            int r10 = defpackage.sv.MaterialToolbar_titleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.R = r10
            int r10 = defpackage.sv.MaterialToolbar_subtitleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.S = r10
            r9.recycle()
            r7.Q(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
