package com.viewpagerindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class IcsLinearLayout extends LinearLayout {
    private static final int[] LL;
    private static final int LL_DIVIDER = 0;
    private static final int LL_DIVIDER_PADDING = 0;
    private static final int LL_SHOW_DIVIDER = 0;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mShowDividers;

    static {
        C0059ao.a(IcsLinearLayout.class, 321);
        LL = new int[]{16843049, 16843561, 16843562};
    }

    public IcsLinearLayout(Context context, int i) {
        super(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, LL, i, 0);
        setDividerDrawable(obtainStyledAttributes.getDrawable(0));
        this.mDividerPadding = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.mShowDividers = obtainStyledAttributes.getInteger(1, 0);
        obtainStyledAttributes.recycle();
    }

    private void drawDividersHorizontal(Canvas canvas) {
        int right;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && childAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawVerticalDivider(canvas, childAt.getLeft() - ((LinearLayout.LayoutParams) childAt.getLayoutParams()).leftMargin);
            }
        }
        if (hasDividerBeforeChildAt(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 == null) {
                right = (getWidth() - getPaddingRight()) - this.mDividerWidth;
            } else {
                right = childAt2.getRight();
            }
            drawVerticalDivider(canvas, right);
        }
    }

    private void drawDividersVertical(Canvas canvas) {
        int bottom;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && childAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, childAt.getTop() - ((LinearLayout.LayoutParams) childAt.getLayoutParams()).topMargin);
            }
        }
        if (hasDividerBeforeChildAt(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                bottom = childAt2.getBottom();
            }
            drawHorizontalDivider(canvas, bottom);
        }
    }

    private void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    private void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    private boolean hasDividerBeforeChildAt(int i) {
        if (i == 0 || i == getChildCount() || (this.mShowDividers & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int indexOfChild = indexOfChild(view);
        int orientation = getOrientation();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (hasDividerBeforeChildAt(indexOfChild)) {
            if (orientation == 1) {
                layoutParams.topMargin = this.mDividerHeight;
            } else {
                layoutParams.leftMargin = this.mDividerWidth;
            }
        }
        int childCount = getChildCount();
        if (indexOfChild == childCount - 1 && hasDividerBeforeChildAt(childCount)) {
            if (orientation == 1) {
                layoutParams.bottomMargin = this.mDividerHeight;
            } else {
                layoutParams.rightMargin = this.mDividerWidth;
            }
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDivider != null) {
            if (getOrientation() == 1) {
                drawDividersVertical(canvas);
            } else {
                drawDividersHorizontal(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.LinearLayout
    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }
}
