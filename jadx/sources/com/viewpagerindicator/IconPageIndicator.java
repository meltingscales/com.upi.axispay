package com.viewpagerindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class IconPageIndicator extends HorizontalScrollView implements PageIndicator {
    private Runnable mIconSelector;
    private final IcsLinearLayout mIconsLayout;
    private ViewPager.j mListener;
    private int mSelectedIndex;
    private ViewPager mViewPager;

    public IconPageIndicator(Context context) {
        this(context, null);
    }

    private void animateToIcon(int i) {
        final View childAt = this.mIconsLayout.getChildAt(i);
        Runnable runnable = this.mIconSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: com.viewpagerindicator.IconPageIndicator.1
            @Override // java.lang.Runnable
            public void run() {
                IconPageIndicator.this.smoothScrollTo(childAt.getLeft() - ((IconPageIndicator.this.getWidth() - childAt.getWidth()) / 2), 0);
                IconPageIndicator.this.mIconSelector = null;
            }
        };
        this.mIconSelector = runnable2;
        post(runnable2);
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void notifyDataSetChanged() {
        this.mIconsLayout.removeAllViews();
        IconPagerAdapter iconPagerAdapter = (IconPagerAdapter) this.mViewPager.getAdapter();
        int count = iconPagerAdapter.getCount();
        for (int i = 0; i < count; i++) {
            ImageView imageView = new ImageView(getContext(), null, R.attr.vpiIconPageIndicatorStyle);
            imageView.setImageResource(iconPagerAdapter.getIconResId(i));
            this.mIconsLayout.addView(imageView);
        }
        if (this.mSelectedIndex > count) {
            this.mSelectedIndex = count - 1;
        }
        setCurrentItem(this.mSelectedIndex);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.mIconSelector;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.mIconSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.j
    public void onPageScrollStateChanged(int i) {
        ViewPager.j jVar = this.mListener;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i);
        }
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.j
    public void onPageScrolled(int i, float f, int i2) {
        ViewPager.j jVar = this.mListener;
        if (jVar != null) {
            jVar.onPageScrolled(i, f, i2);
        }
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.j
    public void onPageSelected(int i) {
        setCurrentItem(i);
        ViewPager.j jVar = this.mListener;
        if (jVar != null) {
            jVar.onPageSelected(i);
        }
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setCurrentItem(int i) {
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            this.mSelectedIndex = i;
            viewPager.setCurrentItem(i);
            int childCount = this.mIconsLayout.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.mIconsLayout.getChildAt(i2);
                boolean z = i2 == i;
                childAt.setSelected(z);
                if (z) {
                    animateToIcon(i);
                }
                i2++;
            }
            return;
        }
        throw new IllegalStateException(C0059ao.a(12486));
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setOnPageChangeListener(ViewPager.j jVar) {
        this.mListener = jVar;
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() != null) {
            this.mViewPager = viewPager;
            viewPager.setOnPageChangeListener(this);
            notifyDataSetChanged();
            return;
        }
        throw new IllegalStateException(C0059ao.a(12487));
    }

    public IconPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHorizontalScrollBarEnabled(false);
        IcsLinearLayout icsLinearLayout = new IcsLinearLayout(context, R.attr.vpiIconPageIndicatorStyle);
        this.mIconsLayout = icsLinearLayout;
        addView(icsLinearLayout, new FrameLayout.LayoutParams(-2, -1, 17));
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }
}
