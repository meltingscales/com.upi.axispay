package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class LoopingCirclePageIndicator extends View implements PageIndicator {
    private static final int INVALID_POINTER = 0;
    private int mActivePointerId;
    private boolean mCentered;
    private int mCurrentPage;
    private float mExtraSpacing;
    private boolean mIsDragging;
    private float mLastMotionX;
    private ViewPager.j mListener;
    private int mOrientation;
    private float mPageOffset;
    private final Paint mPaintFill;
    private final Paint mPaintPageFill;
    private final Paint mPaintStroke;
    private float mRadius;
    private int mScrollState;
    private boolean mSnap;
    private int mSnapPage;
    private int mTouchSlop;
    private ViewPager mViewPager;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.viewpagerindicator.LoopingCirclePageIndicator.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public int currentPage;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.currentPage);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.currentPage = parcel.readInt();
        }
    }

    static {
        C0059ao.a(LoopingCirclePageIndicator.class, 273);
    }

    public LoopingCirclePageIndicator(Context context) {
        this(context, null);
    }

    private int measureLong(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || this.mViewPager == null) {
            return size;
        }
        int realCount = getRealCount();
        float f = this.mRadius;
        int paddingLeft = (int) (getPaddingLeft() + getPaddingRight() + (realCount * 2 * f) + ((realCount - 1) * (f + this.mExtraSpacing)) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    private int measureShort(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.mRadius * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    public int getFillColor() {
        return this.mPaintFill.getColor();
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getPageColor() {
        return this.mPaintPageFill.getColor();
    }

    public float getRadius() {
        return this.mRadius;
    }

    public int getRealCount() {
        if (this.mViewPager.getAdapter() instanceof LoopingPagerAdapter) {
            return ((LoopingPagerAdapter) this.mViewPager.getAdapter()).getRealCount();
        }
        return this.mViewPager.getAdapter().d();
    }

    public int getRealPage(int i) {
        return i % getRealCount();
    }

    public int getStrokeColor() {
        return this.mPaintStroke.getColor();
    }

    public float getStrokeWidth() {
        return this.mPaintStroke.getStrokeWidth();
    }

    public boolean isCentered() {
        return this.mCentered;
    }

    public boolean isSnap() {
        return this.mSnap;
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void notifyDataSetChanged() {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int realCount;
        int height;
        int paddingTop;
        int paddingBottom;
        int paddingLeft;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.mViewPager == null || (realCount = getRealCount()) == 0) {
            return;
        }
        if (this.mCurrentPage >= realCount) {
            setCurrentItem(realCount - 1);
            return;
        }
        if (this.mOrientation == 0) {
            height = getWidth();
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
            paddingLeft = getPaddingTop();
        } else {
            height = getHeight();
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            paddingLeft = getPaddingLeft();
        }
        float f3 = this.mRadius;
        float f4 = this.mExtraSpacing;
        float f5 = (3.0f * f3) + f4;
        float f6 = paddingLeft + f3;
        float f7 = paddingTop + f3;
        if (this.mCentered) {
            f7 += (((height - paddingTop) - paddingBottom) / 2.0f) - (((realCount * (f3 * 2.0f)) + ((realCount - 1) * f4)) / 2.0f);
        }
        if (this.mPaintStroke.getStrokeWidth() > 0.0f) {
            f3 -= this.mPaintStroke.getStrokeWidth() / 2.0f;
        }
        for (int i = 0; i < realCount; i++) {
            float f8 = (i * f5) + f7;
            if (this.mOrientation == 0) {
                f2 = f6;
            } else {
                f2 = f8;
                f8 = f6;
            }
            if (this.mPaintPageFill.getAlpha() > 0) {
                canvas.drawCircle(f8, f2, f3, this.mPaintPageFill);
            }
            float f9 = this.mRadius;
            if (f3 != f9) {
                canvas.drawCircle(f8, f2, f9, this.mPaintStroke);
            }
        }
        boolean z = this.mSnap;
        float f10 = (z ? this.mSnapPage : this.mCurrentPage) * f5;
        if (!z) {
            f10 += this.mPageOffset * f5;
        }
        if (this.mOrientation == 0) {
            float f11 = f7 + f10;
            f = f6;
            f6 = f11;
        } else {
            f = f7 + f10;
        }
        canvas.drawCircle(f6, f, this.mRadius, this.mPaintFill);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 0) {
            setMeasuredDimension(measureLong(i), measureShort(i2));
        } else {
            setMeasuredDimension(measureShort(i), measureLong(i2));
        }
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.j
    public void onPageScrollStateChanged(int i) {
        this.mScrollState = i;
        ViewPager.j jVar = this.mListener;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i);
        }
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.j
    public void onPageScrolled(int i, float f, int i2) {
        this.mCurrentPage = getRealPage(i);
        this.mPageOffset = f;
        invalidate();
        ViewPager.j jVar = this.mListener;
        if (jVar != null) {
            jVar.onPageScrolled(i, f, i2);
        }
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.j
    public void onPageSelected(int i) {
        if (this.mSnap || this.mScrollState == 0) {
            this.mCurrentPage = getRealPage(i);
            this.mSnapPage = getRealPage(i);
            invalidate();
        }
        ViewPager.j jVar = this.mListener;
        if (jVar != null) {
            jVar.onPageSelected(i);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mCurrentPage = getRealPage(savedState.currentPage);
        this.mSnapPage = getRealPage(savedState.currentPage);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPage = this.mCurrentPage;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (this.mViewPager == null || getRealCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float d = nb.d(motionEvent, nb.a(motionEvent, this.mActivePointerId));
                    float f = d - this.mLastMotionX;
                    if (!this.mIsDragging && Math.abs(f) > this.mTouchSlop) {
                        this.mIsDragging = true;
                    }
                    if (this.mIsDragging) {
                        this.mLastMotionX = d;
                        if (this.mViewPager.isFakeDragging() || this.mViewPager.beginFakeDrag()) {
                            this.mViewPager.fakeDragBy(f);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int b = nb.b(motionEvent);
                        this.mLastMotionX = nb.d(motionEvent, b);
                        this.mActivePointerId = nb.c(motionEvent, b);
                    } else if (action == 6) {
                        int b2 = nb.b(motionEvent);
                        if (nb.c(motionEvent, b2) == this.mActivePointerId) {
                            this.mActivePointerId = nb.c(motionEvent, b2 == 0 ? 1 : 0);
                        }
                        this.mLastMotionX = nb.d(motionEvent, nb.a(motionEvent, this.mActivePointerId));
                    }
                }
            }
            if (!this.mIsDragging) {
                int realCount = getRealCount();
                float width = getWidth();
                float f2 = width / 2.0f;
                float f3 = width / 6.0f;
                if (this.mCurrentPage > 0 && motionEvent.getX() < f2 - f3) {
                    if (action != 3) {
                        this.mViewPager.setCurrentItem(this.mCurrentPage - 1);
                    }
                    return true;
                } else if (this.mCurrentPage < realCount - 1 && motionEvent.getX() > f2 + f3) {
                    if (action != 3) {
                        this.mViewPager.setCurrentItem(this.mCurrentPage + 1);
                    }
                    return true;
                }
            }
            this.mIsDragging = false;
            this.mActivePointerId = -1;
            if (this.mViewPager.isFakeDragging()) {
                this.mViewPager.endFakeDrag();
            }
        } else {
            this.mActivePointerId = nb.c(motionEvent, 0);
            this.mLastMotionX = motionEvent.getX();
        }
        return true;
    }

    public void setCentered(boolean z) {
        this.mCentered = z;
        invalidate();
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setCurrentItem(int i) {
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            viewPager.setCurrentItem(i);
            this.mCurrentPage = getRealPage(i);
            invalidate();
            return;
        }
        throw new IllegalStateException(C0059ao.a(4259));
    }

    public void setExtraSpacing(float f) {
        this.mExtraSpacing = f;
    }

    public void setFillColor(int i) {
        this.mPaintFill.setColor(i);
        invalidate();
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setOnPageChangeListener(ViewPager.j jVar) {
        this.mListener = jVar;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C0059ao.a(4260));
        }
        this.mOrientation = i;
        requestLayout();
    }

    public void setPageColor(int i) {
        this.mPaintPageFill.setColor(i);
        invalidate();
    }

    public void setRadius(float f) {
        this.mRadius = f;
        invalidate();
    }

    public void setSnap(boolean z) {
        this.mSnap = z;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.mPaintStroke.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.mPaintStroke.setStrokeWidth(f);
        invalidate();
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
            invalidate();
            return;
        }
        throw new IllegalStateException(C0059ao.a(4261));
    }

    public LoopingCirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.vpiCirclePageIndicatorStyle);
    }

    public LoopingCirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.mPaintPageFill = paint;
        Paint paint2 = new Paint(1);
        this.mPaintStroke = paint2;
        Paint paint3 = new Paint(1);
        this.mPaintFill = paint3;
        this.mLastMotionX = -1.0f;
        this.mActivePointerId = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(R.color.default_circle_indicator_page_color);
        int color2 = resources.getColor(R.color.default_circle_indicator_fill_color);
        int integer = resources.getInteger(R.integer.default_circle_indicator_orientation);
        int color3 = resources.getColor(R.color.default_circle_indicator_stroke_color);
        float dimension = resources.getDimension(R.dimen.default_circle_indicator_stroke_width);
        float dimension2 = resources.getDimension(R.dimen.default_circle_indicator_radius);
        boolean z = resources.getBoolean(R.bool.default_circle_indicator_centered);
        boolean z2 = resources.getBoolean(R.bool.default_circle_indicator_snap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CirclePageIndicator, i, 0);
        this.mCentered = obtainStyledAttributes.getBoolean(R.styleable.CirclePageIndicator_centered, z);
        this.mOrientation = obtainStyledAttributes.getInt(R.styleable.CirclePageIndicator_android_orientation, integer);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(obtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_pageColor, color));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(obtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_strokeColor, color3));
        paint2.setStrokeWidth(obtainStyledAttributes.getDimension(R.styleable.CirclePageIndicator_strokeWidth, dimension));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(obtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_fillColor, color2));
        this.mRadius = obtainStyledAttributes.getDimension(R.styleable.CirclePageIndicator_radius, dimension2);
        this.mSnap = obtainStyledAttributes.getBoolean(R.styleable.CirclePageIndicator_snap, z2);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.CirclePageIndicator_android_background);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.mTouchSlop = bc.d(ViewConfiguration.get(context));
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }
}
