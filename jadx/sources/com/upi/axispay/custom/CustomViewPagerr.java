package com.upi.axispay.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CustomViewPagerr extends ViewPager {
    private CustomViewPagerScroller mScroller;

    public CustomViewPagerr(Context context) {
        super(context);
        this.mScroller = null;
        postInitViewPager();
    }

    private void postInitViewPager() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField(C0059ao.a(9464));
            declaredField.setAccessible(true);
            Field declaredField2 = ViewPager.class.getDeclaredField(C0059ao.a(9465));
            declaredField2.setAccessible(true);
            CustomViewPagerScroller customViewPagerScroller = new CustomViewPagerScroller(getContext(), (Interpolator) declaredField2.get(null));
            this.mScroller = customViewPagerScroller;
            declaredField.set(this, customViewPagerScroller);
        } catch (Exception unused) {
        }
    }

    public void setScrollDurationFactor(double d) {
        this.mScroller.setScrollDurationFactor(d);
    }

    public CustomViewPagerr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mScroller = null;
        postInitViewPager();
    }
}
