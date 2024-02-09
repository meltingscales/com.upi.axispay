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
public class UnderlinePageIndicator extends View implements PageIndicator {
    private static final int FADE_FRAME_MS = 0;
    private static final int INVALID_POINTER = 0;
    private int mActivePointerId;
    private int mCurrentPage;
    private int mFadeBy;
    private int mFadeDelay;
    private int mFadeLength;
    private final Runnable mFadeRunnable;
    private boolean mFades;
    private boolean mIsDragging;
    private float mLastMotionX;
    private ViewPager.j mListener;
    private final Paint mPaint;
    private float mPositionOffset;
    private int mScrollState;
    private int mTouchSlop;
    private ViewPager mViewPager;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.viewpagerindicator.UnderlinePageIndicator.SavedState.1
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
        C0059ao.a(UnderlinePageIndicator.class, 143);
    }

    public UnderlinePageIndicator(Context context) {
        this(context, null);
    }

    public int getFadeDelay() {
        return this.mFadeDelay;
    }

    public int getFadeLength() {
        return this.mFadeLength;
    }

    public boolean getFades() {
        return this.mFades;
    }

    public int getSelectedColor() {
        return this.mPaint.getColor();
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void notifyDataSetChanged() {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int d;
        super.onDraw(canvas);
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null || (d = viewPager.getAdapter().d()) == 0) {
            return;
        }
        if (this.mCurrentPage >= d) {
            setCurrentItem(d - 1);
            return;
        }
        int paddingLeft = getPaddingLeft();
        float width = ((getWidth() - paddingLeft) - getPaddingRight()) / (d * 1.0f);
        float f = paddingLeft + ((this.mCurrentPage + this.mPositionOffset) * width);
        canvas.drawRect(f, getPaddingTop(), f + width, getHeight() - getPaddingBottom(), this.mPaint);
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
        this.mCurrentPage = i;
        this.mPositionOffset = f;
        if (this.mFades) {
            if (i2 > 0) {
                removeCallbacks(this.mFadeRunnable);
                this.mPaint.setAlpha(255);
            } else if (this.mScrollState != 1) {
                postDelayed(this.mFadeRunnable, this.mFadeDelay);
            }
        }
        invalidate();
        ViewPager.j jVar = this.mListener;
        if (jVar != null) {
            jVar.onPageScrolled(i, f, i2);
        }
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.j
    public void onPageSelected(int i) {
        if (this.mScrollState == 0) {
            this.mCurrentPage = i;
            this.mPositionOffset = 0.0f;
            invalidate();
            this.mFadeRunnable.run();
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
        this.mCurrentPage = savedState.currentPage;
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
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null || viewPager.getAdapter().d() == 0) {
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
                int d2 = this.mViewPager.getAdapter().d();
                float width = getWidth();
                float f2 = width / 2.0f;
                float f3 = width / 6.0f;
                if (this.mCurrentPage > 0 && motionEvent.getX() < f2 - f3) {
                    if (action != 3) {
                        this.mViewPager.setCurrentItem(this.mCurrentPage - 1);
                    }
                    return true;
                } else if (this.mCurrentPage < d2 - 1 && motionEvent.getX() > f2 + f3) {
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

    @Override // com.viewpagerindicator.PageIndicator
    public void setCurrentItem(int i) {
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            viewPager.setCurrentItem(i);
            this.mCurrentPage = i;
            invalidate();
            return;
        }
        throw new IllegalStateException(C0059ao.a(631));
    }

    public void setFadeDelay(int i) {
        this.mFadeDelay = i;
    }

    public void setFadeLength(int i) {
        this.mFadeLength = i;
        this.mFadeBy = 255 / (i / 30);
    }

    public void setFades(boolean z) {
        if (z != this.mFades) {
            this.mFades = z;
            if (z) {
                post(this.mFadeRunnable);
                return;
            }
            removeCallbacks(this.mFadeRunnable);
            this.mPaint.setAlpha(255);
            invalidate();
        }
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setOnPageChangeListener(ViewPager.j jVar) {
        this.mListener = jVar;
    }

    public void setSelectedColor(int i) {
        this.mPaint.setColor(i);
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
            post(new Runnable() { // from class: com.viewpagerindicator.UnderlinePageIndicator.2
                @Override // java.lang.Runnable
                public void run() {
                    if (UnderlinePageIndicator.this.mFades) {
                        UnderlinePageIndicator underlinePageIndicator = UnderlinePageIndicator.this;
                        underlinePageIndicator.post(underlinePageIndicator.mFadeRunnable);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException(C0059ao.a(632));
    }

    public UnderlinePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.vpiUnderlinePageIndicatorStyle);
    }

    public UnderlinePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPaint = new Paint(1);
        this.mLastMotionX = -1.0f;
        this.mActivePointerId = -1;
        this.mFadeRunnable = new Runnable() { // from class: com.viewpagerindicator.UnderlinePageIndicator.1
            @Override // java.lang.Runnable
            public void run() {
                if (UnderlinePageIndicator.this.mFades) {
                    int max = Math.max(UnderlinePageIndicator.this.mPaint.getAlpha() - UnderlinePageIndicator.this.mFadeBy, 0);
                    UnderlinePageIndicator.this.mPaint.setAlpha(max);
                    UnderlinePageIndicator.this.invalidate();
                    if (max > 0) {
                        UnderlinePageIndicator.this.postDelayed(this, 30L);
                    }
                }
            }
        };
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        boolean z = resources.getBoolean(R.bool.default_underline_indicator_fades);
        int integer = resources.getInteger(R.integer.default_underline_indicator_fade_delay);
        int integer2 = resources.getInteger(R.integer.default_underline_indicator_fade_length);
        int color = resources.getColor(R.color.default_underline_indicator_selected_color);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.UnderlinePageIndicator, i, 0);
        setFades(obtainStyledAttributes.getBoolean(R.styleable.UnderlinePageIndicator_fades, z));
        setSelectedColor(obtainStyledAttributes.getColor(R.styleable.UnderlinePageIndicator_selectedColor, color));
        setFadeDelay(obtainStyledAttributes.getInteger(R.styleable.UnderlinePageIndicator_fadeDelay, integer));
        setFadeLength(obtainStyledAttributes.getInteger(R.styleable.UnderlinePageIndicator_fadeLength, integer2));
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.UnderlinePageIndicator_android_background);
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
