package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class TitlePageIndicator extends View implements PageIndicator {
    private static final float BOLD_FADE_PERCENTAGE = 0.0f;
    private static final String EMPTY_TITLE = null;
    private static final int INVALID_POINTER = 0;
    private static final float SELECTION_FADE_PERCENTAGE = 0.0f;
    private int mActivePointerId;
    private boolean mBoldText;
    private final Rect mBounds;
    private OnCenterItemClickListener mCenterItemClickListener;
    private float mClipPadding;
    private int mColorSelected;
    private int mColorText;
    private int mCurrentPage;
    private float mFooterIndicatorHeight;
    private IndicatorStyle mFooterIndicatorStyle;
    private float mFooterIndicatorUnderlinePadding;
    private float mFooterLineHeight;
    private float mFooterPadding;
    private boolean mIsDragging;
    private float mLastMotionX;
    private LinePosition mLinePosition;
    private ViewPager.j mListener;
    private float mPageOffset;
    private final Paint mPaintFooterIndicator;
    private final Paint mPaintFooterLine;
    private final Paint mPaintText;
    private Path mPath;
    private int mScrollState;
    private float mTitlePadding;
    private float mTopPadding;
    private int mTouchSlop;
    private ViewPager mViewPager;

    /* compiled from: AxisPay */
    /* renamed from: com.viewpagerindicator.TitlePageIndicator$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$viewpagerindicator$TitlePageIndicator$IndicatorStyle;

        static {
            int[] iArr = new int[IndicatorStyle.values().length];
            $SwitchMap$com$viewpagerindicator$TitlePageIndicator$IndicatorStyle = iArr;
            try {
                iArr[IndicatorStyle.Triangle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$viewpagerindicator$TitlePageIndicator$IndicatorStyle[IndicatorStyle.Underline.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum IndicatorStyle {
        None(0),
        Triangle(1),
        Underline(2);
        
        public final int value;

        IndicatorStyle(int i) {
            this.value = i;
        }

        public static IndicatorStyle fromValue(int i) {
            IndicatorStyle[] values;
            for (IndicatorStyle indicatorStyle : values()) {
                if (indicatorStyle.value == i) {
                    return indicatorStyle;
                }
            }
            return null;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum LinePosition {
        Bottom(0),
        Top(1);
        
        public final int value;

        LinePosition(int i) {
            this.value = i;
        }

        public static LinePosition fromValue(int i) {
            LinePosition[] values;
            for (LinePosition linePosition : values()) {
                if (linePosition.value == i) {
                    return linePosition;
                }
            }
            return null;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface OnCenterItemClickListener {
        void onCenterItemClick(int i);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.viewpagerindicator.TitlePageIndicator.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public int currentPage;

        public /* synthetic */ SavedState(Parcel parcel, AnonymousClass1 anonymousClass1) {
            this(parcel);
        }

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
        C0059ao.a(TitlePageIndicator.class, 168);
    }

    public TitlePageIndicator(Context context) {
        this(context, null);
    }

    private Rect calcBounds(int i, Paint paint) {
        Rect rect = new Rect();
        CharSequence title = getTitle(i);
        rect.right = (int) paint.measureText(title, 0, title.length());
        rect.bottom = (int) (paint.descent() - paint.ascent());
        return rect;
    }

    private ArrayList<Rect> calculateAllBounds(Paint paint) {
        ArrayList<Rect> arrayList = new ArrayList<>();
        int d = this.mViewPager.getAdapter().d();
        int width = getWidth();
        int i = width / 2;
        for (int i2 = 0; i2 < d; i2++) {
            Rect calcBounds = calcBounds(i2, paint);
            int i3 = calcBounds.right - calcBounds.left;
            int i4 = calcBounds.bottom - calcBounds.top;
            int i5 = (int) ((i - (i3 / 2.0f)) + (((i2 - this.mCurrentPage) - this.mPageOffset) * width));
            calcBounds.left = i5;
            calcBounds.right = i5 + i3;
            calcBounds.top = 0;
            calcBounds.bottom = i4;
            arrayList.add(calcBounds);
        }
        return arrayList;
    }

    private void clipViewOnTheLeft(Rect rect, float f, int i) {
        float f2 = this.mClipPadding;
        rect.left = (int) (i + f2);
        rect.right = (int) (f2 + f);
    }

    private void clipViewOnTheRight(Rect rect, float f, int i) {
        int i2 = (int) (i - this.mClipPadding);
        rect.right = i2;
        rect.left = (int) (i2 - f);
    }

    private CharSequence getTitle(int i) {
        CharSequence f = this.mViewPager.getAdapter().f(i);
        return f == null ? C0059ao.a(12753) : f;
    }

    public float getClipPadding() {
        return this.mClipPadding;
    }

    public int getFooterColor() {
        return this.mPaintFooterLine.getColor();
    }

    public float getFooterIndicatorHeight() {
        return this.mFooterIndicatorHeight;
    }

    public float getFooterIndicatorPadding() {
        return this.mFooterPadding;
    }

    public IndicatorStyle getFooterIndicatorStyle() {
        return this.mFooterIndicatorStyle;
    }

    public float getFooterLineHeight() {
        return this.mFooterLineHeight;
    }

    public LinePosition getLinePosition() {
        return this.mLinePosition;
    }

    public int getSelectedColor() {
        return this.mColorSelected;
    }

    public int getTextColor() {
        return this.mColorText;
    }

    public float getTextSize() {
        return this.mPaintText.getTextSize();
    }

    public float getTitlePadding() {
        return this.mTitlePadding;
    }

    public float getTopPadding() {
        return this.mTopPadding;
    }

    public Typeface getTypeface() {
        return this.mPaintText.getTypeface();
    }

    public boolean isSelectedBold() {
        return this.mBoldText;
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void notifyDataSetChanged() {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int d;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        int i8;
        int i9;
        ViewPager viewPager;
        super.onDraw(canvas);
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 == null || (d = viewPager2.getAdapter().d()) == 0) {
            return;
        }
        if (this.mCurrentPage == -1 && (viewPager = this.mViewPager) != null) {
            this.mCurrentPage = viewPager.getCurrentItem();
        }
        ArrayList<Rect> calculateAllBounds = calculateAllBounds(this.mPaintText);
        int size = calculateAllBounds.size();
        if (this.mCurrentPage >= size) {
            setCurrentItem(size - 1);
            return;
        }
        int i10 = d - 1;
        float width = getWidth() / 2.0f;
        int left = getLeft();
        float f2 = left + this.mClipPadding;
        int width2 = getWidth();
        int height = getHeight();
        int i11 = left + width2;
        float f3 = i11 - this.mClipPadding;
        int i12 = this.mCurrentPage;
        float f4 = this.mPageOffset;
        if (f4 <= 0.5d) {
            i = i12;
        } else {
            i = i12 + 1;
            f4 = 1.0f - f4;
        }
        boolean z = f4 <= 0.25f;
        boolean z2 = f4 <= 0.05f;
        float f5 = (0.25f - f4) / 0.25f;
        Rect rect = calculateAllBounds.get(i12);
        int i13 = rect.right;
        int i14 = rect.left;
        float f6 = i13 - i14;
        if (i14 < f2) {
            clipViewOnTheLeft(rect, f6, left);
        }
        if (rect.right > f3) {
            clipViewOnTheRight(rect, f6, i11);
        }
        int i15 = this.mCurrentPage;
        if (i15 > 0) {
            int i16 = i15 - 1;
            while (i16 >= 0) {
                Rect rect2 = calculateAllBounds.get(i16);
                int i17 = rect2.left;
                int i18 = width2;
                if (i17 < f2) {
                    int i19 = rect2.right - i17;
                    clipViewOnTheLeft(rect2, i19, left);
                    f = f2;
                    float f7 = this.mTitlePadding;
                    i8 = size;
                    if (rect2.right + f7 > calculateAllBounds.get(i16 + 1).left) {
                        int i20 = (int) ((i9 - i19) - f7);
                        rect2.left = i20;
                        rect2.right = i20 + i19;
                    }
                } else {
                    f = f2;
                    i8 = size;
                }
                i16--;
                width2 = i18;
                f2 = f;
                size = i8;
            }
        }
        int i21 = width2;
        int i22 = size;
        int i23 = this.mCurrentPage;
        if (i23 < i10) {
            for (int i24 = i23 + 1; i24 < d; i24++) {
                Rect rect3 = calculateAllBounds.get(i24);
                int i25 = rect3.right;
                if (i25 > f3) {
                    int i26 = i25 - rect3.left;
                    clipViewOnTheRight(rect3, i26, i11);
                    float f8 = this.mTitlePadding;
                    int i27 = calculateAllBounds.get(i24 - 1).right;
                    if (rect3.left - f8 < i27) {
                        int i28 = (int) (i27 + f8);
                        rect3.left = i28;
                        rect3.right = i28 + i26;
                    }
                }
            }
        }
        int i29 = this.mColorText >>> 24;
        int i30 = 0;
        while (i30 < d) {
            Rect rect4 = calculateAllBounds.get(i30);
            int i31 = rect4.left;
            if ((i31 <= left || i31 >= i11) && ((i3 = rect4.right) <= left || i3 >= i11)) {
                i4 = i11;
                i5 = i29;
                i6 = i21;
            } else {
                boolean z3 = i30 == i;
                CharSequence title = getTitle(i30);
                this.mPaintText.setFakeBoldText(z3 && z2 && this.mBoldText);
                this.mPaintText.setColor(this.mColorText);
                if (z3 && z) {
                    this.mPaintText.setAlpha(i29 - ((int) (i29 * f5)));
                }
                if (i30 < i22 - 1) {
                    int i32 = rect4.right;
                    float f9 = this.mTitlePadding;
                    if (i32 + f9 > calculateAllBounds.get(i30 + 1).left) {
                        int i33 = i32 - rect4.left;
                        int i34 = (int) ((i7 - i33) - f9);
                        rect4.left = i34;
                        rect4.right = i34 + i33;
                    }
                }
                i4 = i11;
                i5 = i29;
                i6 = i21;
                canvas.drawText(title, 0, title.length(), rect4.left, rect4.bottom + this.mTopPadding, this.mPaintText);
                if (z3 && z) {
                    this.mPaintText.setColor(this.mColorSelected);
                    this.mPaintText.setAlpha((int) ((this.mColorSelected >>> 24) * f5));
                    canvas.drawText(title, 0, title.length(), rect4.left, rect4.bottom + this.mTopPadding, this.mPaintText);
                }
            }
            i30++;
            i21 = i6;
            i11 = i4;
            i29 = i5;
        }
        int i35 = i21;
        float f10 = this.mFooterLineHeight;
        float f11 = this.mFooterIndicatorHeight;
        if (this.mLinePosition == LinePosition.Top) {
            f10 = -f10;
            f11 = -f11;
            i2 = 0;
        } else {
            i2 = height;
        }
        this.mPath.reset();
        float f12 = i2;
        float f13 = f12 - (f10 / 2.0f);
        this.mPath.moveTo(0.0f, f13);
        this.mPath.lineTo(i35, f13);
        this.mPath.close();
        canvas.drawPath(this.mPath, this.mPaintFooterLine);
        float f14 = f12 - f10;
        int i36 = AnonymousClass1.$SwitchMap$com$viewpagerindicator$TitlePageIndicator$IndicatorStyle[this.mFooterIndicatorStyle.ordinal()];
        if (i36 == 1) {
            this.mPath.reset();
            this.mPath.moveTo(width, f14 - f11);
            this.mPath.lineTo(width + f11, f14);
            this.mPath.lineTo(width - f11, f14);
            this.mPath.close();
            canvas.drawPath(this.mPath, this.mPaintFooterIndicator);
        } else if (i36 == 2 && z && i < i22) {
            Rect rect5 = calculateAllBounds.get(i);
            float f15 = this.mFooterIndicatorUnderlinePadding;
            float f16 = rect5.right + f15;
            float f17 = rect5.left - f15;
            float f18 = f14 - f11;
            this.mPath.reset();
            this.mPath.moveTo(f17, f14);
            this.mPath.lineTo(f16, f14);
            this.mPath.lineTo(f16, f18);
            this.mPath.lineTo(f17, f18);
            this.mPath.close();
            this.mPaintFooterIndicator.setAlpha((int) (f5 * 255.0f));
            canvas.drawPath(this.mPath, this.mPaintFooterIndicator);
            this.mPaintFooterIndicator.setAlpha(255);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            f = View.MeasureSpec.getSize(i2);
        } else {
            this.mBounds.setEmpty();
            this.mBounds.bottom = (int) (this.mPaintText.descent() - this.mPaintText.ascent());
            Rect rect = this.mBounds;
            f = (rect.bottom - rect.top) + this.mFooterLineHeight + this.mFooterPadding + this.mTopPadding;
            if (this.mFooterIndicatorStyle != IndicatorStyle.None) {
                f += this.mFooterIndicatorHeight;
            }
        }
        setMeasuredDimension(size, (int) f);
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
        this.mPageOffset = f;
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
                float f4 = f2 - f3;
                float f5 = f2 + f3;
                float x = motionEvent.getX();
                if (x < f4) {
                    int i = this.mCurrentPage;
                    if (i > 0) {
                        if (action != 3) {
                            this.mViewPager.setCurrentItem(i - 1);
                        }
                        return true;
                    }
                } else if (x > f5) {
                    int i2 = this.mCurrentPage;
                    if (i2 < d2 - 1) {
                        if (action != 3) {
                            this.mViewPager.setCurrentItem(i2 + 1);
                        }
                        return true;
                    }
                } else {
                    OnCenterItemClickListener onCenterItemClickListener = this.mCenterItemClickListener;
                    if (onCenterItemClickListener != null && action != 3) {
                        onCenterItemClickListener.onCenterItemClick(this.mCurrentPage);
                    }
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

    public void setClipPadding(float f) {
        this.mClipPadding = f;
        invalidate();
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
        throw new IllegalStateException(C0059ao.a(12754));
    }

    public void setFooterColor(int i) {
        this.mPaintFooterLine.setColor(i);
        this.mPaintFooterIndicator.setColor(i);
        invalidate();
    }

    public void setFooterIndicatorHeight(float f) {
        this.mFooterIndicatorHeight = f;
        invalidate();
    }

    public void setFooterIndicatorPadding(float f) {
        this.mFooterPadding = f;
        invalidate();
    }

    public void setFooterIndicatorStyle(IndicatorStyle indicatorStyle) {
        this.mFooterIndicatorStyle = indicatorStyle;
        invalidate();
    }

    public void setFooterLineHeight(float f) {
        this.mFooterLineHeight = f;
        this.mPaintFooterLine.setStrokeWidth(f);
        invalidate();
    }

    public void setLinePosition(LinePosition linePosition) {
        this.mLinePosition = linePosition;
        invalidate();
    }

    public void setOnCenterItemClickListener(OnCenterItemClickListener onCenterItemClickListener) {
        this.mCenterItemClickListener = onCenterItemClickListener;
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setOnPageChangeListener(ViewPager.j jVar) {
        this.mListener = jVar;
    }

    public void setSelectedBold(boolean z) {
        this.mBoldText = z;
        invalidate();
    }

    public void setSelectedColor(int i) {
        this.mColorSelected = i;
        invalidate();
    }

    public void setTextColor(int i) {
        this.mPaintText.setColor(i);
        this.mColorText = i;
        invalidate();
    }

    public void setTextSize(float f) {
        this.mPaintText.setTextSize(f);
        invalidate();
    }

    public void setTitlePadding(float f) {
        this.mTitlePadding = f;
        invalidate();
    }

    public void setTopPadding(float f) {
        this.mTopPadding = f;
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.mPaintText.setTypeface(typeface);
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
        throw new IllegalStateException(C0059ao.a(12755));
    }

    public TitlePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.vpiTitlePageIndicatorStyle);
    }

    public TitlePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCurrentPage = -1;
        Paint paint = new Paint();
        this.mPaintText = paint;
        this.mPath = new Path();
        this.mBounds = new Rect();
        Paint paint2 = new Paint();
        this.mPaintFooterLine = paint2;
        Paint paint3 = new Paint();
        this.mPaintFooterIndicator = paint3;
        this.mLastMotionX = -1.0f;
        this.mActivePointerId = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(R.color.default_title_indicator_footer_color);
        float dimension = resources.getDimension(R.dimen.default_title_indicator_footer_line_height);
        int integer = resources.getInteger(R.integer.default_title_indicator_footer_indicator_style);
        float dimension2 = resources.getDimension(R.dimen.default_title_indicator_footer_indicator_height);
        float dimension3 = resources.getDimension(R.dimen.default_title_indicator_footer_indicator_underline_padding);
        float dimension4 = resources.getDimension(R.dimen.default_title_indicator_footer_padding);
        int integer2 = resources.getInteger(R.integer.default_title_indicator_line_position);
        int color2 = resources.getColor(R.color.default_title_indicator_selected_color);
        boolean z = resources.getBoolean(R.bool.default_title_indicator_selected_bold);
        int color3 = resources.getColor(R.color.default_title_indicator_text_color);
        float dimension5 = resources.getDimension(R.dimen.default_title_indicator_text_size);
        float dimension6 = resources.getDimension(R.dimen.default_title_indicator_title_padding);
        float dimension7 = resources.getDimension(R.dimen.default_title_indicator_clip_padding);
        float dimension8 = resources.getDimension(R.dimen.default_title_indicator_top_padding);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TitlePageIndicator, i, 0);
        this.mFooterLineHeight = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_footerLineHeight, dimension);
        this.mFooterIndicatorStyle = IndicatorStyle.fromValue(obtainStyledAttributes.getInteger(R.styleable.TitlePageIndicator_footerIndicatorStyle, integer));
        this.mFooterIndicatorHeight = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_footerIndicatorHeight, dimension2);
        this.mFooterIndicatorUnderlinePadding = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_footerIndicatorUnderlinePadding, dimension3);
        this.mFooterPadding = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_footerPadding, dimension4);
        this.mLinePosition = LinePosition.fromValue(obtainStyledAttributes.getInteger(R.styleable.TitlePageIndicator_linePosition, integer2));
        this.mTopPadding = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_topPadding, dimension8);
        this.mTitlePadding = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_titlePadding, dimension6);
        this.mClipPadding = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_clipPadding, dimension7);
        this.mColorSelected = obtainStyledAttributes.getColor(R.styleable.TitlePageIndicator_selectedColor, color2);
        this.mColorText = obtainStyledAttributes.getColor(R.styleable.TitlePageIndicator_android_textColor, color3);
        this.mBoldText = obtainStyledAttributes.getBoolean(R.styleable.TitlePageIndicator_selectedBold, z);
        float dimension9 = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_android_textSize, dimension5);
        int color4 = obtainStyledAttributes.getColor(R.styleable.TitlePageIndicator_footerColor, color);
        paint.setTextSize(dimension9);
        paint.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setStrokeWidth(this.mFooterLineHeight);
        paint2.setColor(color4);
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        paint3.setColor(color4);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.TitlePageIndicator_android_background);
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
