package com.upi.axispay.custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CustomViewPagerScroller extends Scroller {
    private int mScrollDuration;
    private double mScrollFactor;

    public CustomViewPagerScroller(Context context) {
        super(context);
        this.mScrollFactor = 1.0d;
        this.mScrollDuration = 1000;
    }

    public void setScrollDurationFactor(double d) {
        this.mScrollFactor = d;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.mScrollDuration);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.mScrollDuration);
    }

    public CustomViewPagerScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.mScrollFactor = 1.0d;
        this.mScrollDuration = 1000;
    }

    @SuppressLint({"NewApi"})
    public CustomViewPagerScroller(Context context, Interpolator interpolator, boolean z) {
        super(context, interpolator, z);
        this.mScrollFactor = 1.0d;
        this.mScrollDuration = 1000;
    }
}
