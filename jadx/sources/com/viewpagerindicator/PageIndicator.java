package com.viewpagerindicator;

import androidx.viewpager.widget.ViewPager;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface PageIndicator extends ViewPager.j {
    void notifyDataSetChanged();

    @Override // androidx.viewpager.widget.ViewPager.j
    /* synthetic */ void onPageScrollStateChanged(int i);

    @Override // androidx.viewpager.widget.ViewPager.j
    /* synthetic */ void onPageScrolled(int i, float f, int i2);

    @Override // androidx.viewpager.widget.ViewPager.j
    /* synthetic */ void onPageSelected(int i);

    void setCurrentItem(int i);

    void setOnPageChangeListener(ViewPager.j jVar);

    void setViewPager(ViewPager viewPager);

    void setViewPager(ViewPager viewPager, int i);
}
