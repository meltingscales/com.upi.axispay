package com.upi.axispay.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.lang.reflect.Field;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CustomViewPager extends ViewPager {
    private CustomViewPagerScroller mScroller;

    public CustomViewPager(Context context) {
        super(context);
        this.mScroller = null;
        postInitViewPager();
        initPageChangeListener();
    }

    private void initPageChangeListener() {
        addOnPageChangeListener(new ViewPager.m() { // from class: com.upi.axispay.custom.CustomViewPager.1
            @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
            public void onPageSelected(int i) {
                CustomViewPager.this.requestLayout();
            }
        });
    }

    private void postInitViewPager() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField(C0059ao.a(14896));
            declaredField.setAccessible(true);
            Field declaredField2 = ViewPager.class.getDeclaredField(C0059ao.a(14897));
            declaredField2.setAccessible(true);
            CustomViewPagerScroller customViewPagerScroller = new CustomViewPagerScroller(getContext(), (Interpolator) declaredField2.get(null));
            this.mScroller = customViewPagerScroller;
            declaredField.set(this, customViewPagerScroller);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        View childAt = getChildAt(getCurrentItem());
        if (childAt != null) {
            childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            i2 = View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), CommonUtils.BYTES_IN_A_GIGABYTE);
        }
        super.onMeasure(i, i2);
    }

    public void setScrollDurationFactor(double d) {
        this.mScroller.setScrollDurationFactor(d);
    }

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mScroller = null;
        postInitViewPager();
        initPageChangeListener();
    }
}
