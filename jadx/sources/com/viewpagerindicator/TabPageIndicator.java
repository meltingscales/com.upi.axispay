package com.viewpagerindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class TabPageIndicator extends HorizontalScrollView implements PageIndicator {
    private static final CharSequence EMPTY_TITLE = C0059ao.a(427);
    private ViewPager.j mListener;
    private int mMaxTabWidth;
    private int mSelectedTabIndex;
    private final View.OnClickListener mTabClickListener;
    private final IcsLinearLayout mTabLayout;
    private OnTabReselectedListener mTabReselectedListener;
    private Runnable mTabSelector;
    private ViewPager mViewPager;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface OnTabReselectedListener {
        void onTabReselected(int i);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class TabView extends TextView {
        private int mIndex;

        public TabView(Context context) {
            super(context, null, R.attr.vpiTabPageIndicatorStyle);
        }

        public int getIndex() {
            return this.mIndex;
        }

        @Override // android.widget.TextView, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (TabPageIndicator.this.mMaxTabWidth <= 0 || getMeasuredWidth() <= TabPageIndicator.this.mMaxTabWidth) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(TabPageIndicator.this.mMaxTabWidth, CommonUtils.BYTES_IN_A_GIGABYTE), i2);
        }
    }

    public TabPageIndicator(Context context) {
        this(context, null);
    }

    private void addTab(int i, CharSequence charSequence, int i2) {
        TabView tabView = new TabView(getContext());
        tabView.mIndex = i;
        tabView.setFocusable(true);
        tabView.setOnClickListener(this.mTabClickListener);
        tabView.setText(charSequence);
        if (i2 != 0) {
            tabView.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
        }
        this.mTabLayout.addView(tabView, new LinearLayout.LayoutParams(0, -1, 1.0f));
    }

    private void animateToTab(int i) {
        final View childAt = this.mTabLayout.getChildAt(i);
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: com.viewpagerindicator.TabPageIndicator.2
            @Override // java.lang.Runnable
            public void run() {
                TabPageIndicator.this.smoothScrollTo(childAt.getLeft() - ((TabPageIndicator.this.getWidth() - childAt.getWidth()) / 2), 0);
                TabPageIndicator.this.mTabSelector = null;
            }
        };
        this.mTabSelector = runnable2;
        post(runnable2);
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void notifyDataSetChanged() {
        this.mTabLayout.removeAllViews();
        no adapter = this.mViewPager.getAdapter();
        IconPagerAdapter iconPagerAdapter = adapter instanceof IconPagerAdapter ? (IconPagerAdapter) adapter : null;
        int d = adapter.d();
        for (int i = 0; i < d; i++) {
            CharSequence f = adapter.f(i);
            if (f == null) {
                f = EMPTY_TITLE;
            }
            addTab(i, f, iconPagerAdapter != null ? iconPagerAdapter.getIconResId(i) : 0);
        }
        if (this.mSelectedTabIndex > d) {
            this.mSelectedTabIndex = d - 1;
        }
        setCurrentItem(this.mSelectedTabIndex);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.mTabLayout.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.mMaxTabWidth = -1;
        } else if (childCount > 2) {
            this.mMaxTabWidth = (int) (View.MeasureSpec.getSize(i) * 0.4f);
        } else {
            this.mMaxTabWidth = View.MeasureSpec.getSize(i) / 2;
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setCurrentItem(this.mSelectedTabIndex);
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
            this.mSelectedTabIndex = i;
            viewPager.setCurrentItem(i);
            int childCount = this.mTabLayout.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.mTabLayout.getChildAt(i2);
                boolean z = i2 == i;
                childAt.setSelected(z);
                if (z) {
                    animateToTab(i);
                }
                i2++;
            }
            return;
        }
        throw new IllegalStateException(C0059ao.a(428));
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setOnPageChangeListener(ViewPager.j jVar) {
        this.mListener = jVar;
    }

    public void setOnTabReselectedListener(OnTabReselectedListener onTabReselectedListener) {
        this.mTabReselectedListener = onTabReselectedListener;
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
        throw new IllegalStateException(C0059ao.a(429));
    }

    public TabPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTabClickListener = new View.OnClickListener() { // from class: com.viewpagerindicator.TabPageIndicator.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int currentItem = TabPageIndicator.this.mViewPager.getCurrentItem();
                int index = ((TabView) view).getIndex();
                TabPageIndicator.this.mViewPager.setCurrentItem(index);
                if (currentItem != index || TabPageIndicator.this.mTabReselectedListener == null) {
                    return;
                }
                TabPageIndicator.this.mTabReselectedListener.onTabReselected(index);
            }
        };
        setHorizontalScrollBarEnabled(false);
        IcsLinearLayout icsLinearLayout = new IcsLinearLayout(context, R.attr.vpiTabPageIndicatorStyle);
        this.mTabLayout = icsLinearLayout;
        addView(icsLinearLayout, new ViewGroup.LayoutParams(-2, -1));
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }
}
