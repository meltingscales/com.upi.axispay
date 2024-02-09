package com.kofigyan.stateprogressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class StateProgressBar extends View {
    private static final String ANIMATE_TO_CURRENT_PROGRESS_STATE_KEY = null;
    private static final String ANIM_END_X_POS_KEY = null;
    private static final String ANIM_START_X_POS_KEY = null;
    private static final float DEFAULT_STATE_SIZE = 0.0f;
    private static final float DEFAULT_TEXT_SIZE = 0.0f;
    private static final String END_CENTER_X_KEY = null;
    private static final String IS_CURRENT_ANIM_STARTED_KEY = null;
    private static final int MAX_STATE_NUMBER = 0;
    private static final int MIN_STATE_NUMBER = 0;
    private static final String START_CENTER_X_KEY = null;
    private static final String SUPER_STATE_KEY = null;
    private int mAnimDuration;
    private float mAnimEndXPos;
    private int mAnimStartDelay;
    private float mAnimStartXPos;
    private boolean mAnimateToCurrentProgressState;
    private Animator mAnimator;
    private int mBackgroundColor;
    private Paint mBackgroundPaint;
    private float mCellHeight;
    private float mCellWidth;
    private Typeface mCheckFont;
    private boolean mCheckStateCompleted;
    private int mCurrentStateDescriptionColor;
    private Paint mCurrentStateDescriptionPaint;
    private int mCurrentStateNumber;
    private float mDescTopSpaceDecrementer;
    private float mDescTopSpaceIncrementer;
    private boolean mEnableAllStatesCompleted;
    private float mEndCenterX;
    private int mForegroundColor;
    private Paint mForegroundPaint;
    private boolean mIsCurrentAnimStarted;
    private int mMaxStateNumber;
    private float mNextCellWidth;
    private float mSpacing;
    private float mStartCenterX;
    private Paint mStateCheckedForegroundPaint;
    private int mStateDescriptionColor;
    private ArrayList<String> mStateDescriptionData;
    private Paint mStateDescriptionPaint;
    private float mStateDescriptionSize;
    private float mStateLineThickness;
    private int mStateNumberBackgroundColor;
    private Paint mStateNumberBackgroundPaint;
    private int mStateNumberForegroundColor;
    private Paint mStateNumberForegroundPaint;
    private float mStateNumberTextSize;
    private float mStateRadius;
    private float mStateSize;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class Animator implements Runnable {
        private boolean mRestartAnimation = false;
        private Scroller mScroller;

        public Animator() {
            this.mScroller = new Scroller(StateProgressBar.this.getContext(), new AccelerateDecelerateInterpolator());
        }

        @Override // java.lang.Runnable
        public void run() {
            if (StateProgressBar.this.mAnimator != this) {
                return;
            }
            if (this.mRestartAnimation) {
                this.mScroller.startScroll(0, (int) StateProgressBar.this.mStartCenterX, 0, (int) StateProgressBar.this.mEndCenterX, StateProgressBar.this.mAnimDuration);
                this.mRestartAnimation = false;
            }
            boolean computeScrollOffset = this.mScroller.computeScrollOffset();
            StateProgressBar stateProgressBar = StateProgressBar.this;
            stateProgressBar.mAnimStartXPos = stateProgressBar.mAnimEndXPos;
            StateProgressBar.this.mAnimEndXPos = this.mScroller.getCurrY();
            if (computeScrollOffset) {
                StateProgressBar.this.invalidate();
                StateProgressBar.this.post(this);
                return;
            }
            stop();
            StateProgressBar.this.enableAnimationToCurrentState(false);
        }

        public void start() {
            this.mRestartAnimation = true;
            StateProgressBar stateProgressBar = StateProgressBar.this;
            stateProgressBar.postDelayed(this, stateProgressBar.mAnimStartDelay);
        }

        public void stop() {
            StateProgressBar.this.removeCallbacks(this);
            StateProgressBar.this.mAnimator = null;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum StateNumber {
        ONE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5);
        
        private int value;

        StateNumber(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    static {
        C0059ao.a(StateProgressBar.class, 239);
    }

    public StateProgressBar(Context context) {
        this(context, null, 0);
    }

    private void animateToCurrentState(Canvas canvas) {
        if (!this.mIsCurrentAnimStarted) {
            float f = this.mStartCenterX;
            this.mAnimStartXPos = f;
            this.mAnimEndXPos = f;
            this.mIsCurrentAnimStarted = true;
        }
        float f2 = this.mAnimEndXPos;
        float f3 = this.mStartCenterX;
        if (f2 >= f3) {
            float f4 = this.mEndCenterX;
            if (f3 <= f4) {
                if (f2 <= f4) {
                    float f5 = this.mCellHeight;
                    canvas.drawLine(f3, f5 / 2.0f, f2, f5 / 2.0f, this.mForegroundPaint);
                    float f6 = this.mAnimEndXPos;
                    float f7 = this.mCellHeight;
                    canvas.drawLine(f6, f7 / 2.0f, this.mEndCenterX, f7 / 2.0f, this.mBackgroundPaint);
                    this.mAnimStartXPos = this.mAnimEndXPos;
                } else {
                    float f8 = this.mCellHeight;
                    canvas.drawLine(f3, f8 / 2.0f, f4, f8 / 2.0f, this.mForegroundPaint);
                }
                this.mNextCellWidth = this.mCellWidth;
            }
        }
        stopAnimation();
        enableAnimationToCurrentState(false);
        invalidate();
        this.mNextCellWidth = this.mCellWidth;
    }

    private float convertDpToPixel(float f) {
        return f * getResources().getDisplayMetrics().density;
    }

    private float convertSpToPixel(float f) {
        return f * getResources().getDisplayMetrics().scaledDensity;
    }

    private void drawCircles(Canvas canvas, Paint paint, int i, int i2) {
        while (i < i2) {
            i++;
            if (i == getCurrentStateNumber()) {
                float f = this.mCellWidth;
                canvas.drawCircle((i * f) - (f / 2.0f), this.mCellHeight / 2.0f, this.mStateRadius, paint);
            } else {
                float f2 = this.mCellWidth;
                canvas.drawCircle((i * f2) - (f2 / 2.0f), this.mCellHeight / 2.0f, this.mStateRadius - 6.0f, paint);
            }
        }
    }

    private void drawCurrentStateJoiningLine(Canvas canvas) {
        if (this.mAnimateToCurrentProgressState) {
            animateToCurrentState(canvas);
        } else {
            drawLineToCurrentState(canvas);
        }
    }

    private void drawLineToCurrentState(Canvas canvas) {
        float f = this.mStartCenterX;
        float f2 = this.mCellHeight;
        canvas.drawLine(f, f2 / 2.0f, this.mEndCenterX, f2 / 2.0f, this.mForegroundPaint);
        this.mNextCellWidth = this.mCellWidth;
        stopAnimation();
    }

    private void drawLines(Canvas canvas, Paint paint, int i, int i2) {
        if (i2 > i) {
            float f = this.mCellWidth;
            float f2 = (f / 2.0f) + (i * f);
            float f3 = this.mStateRadius;
            float f4 = this.mCellHeight;
            canvas.drawLine(f2 + (f3 * 0.75f), f4 / 2.0f, ((i2 * f) - (f / 2.0f)) - (f3 * 0.75f), f4 / 2.0f, paint);
        }
    }

    private void drawState(Canvas canvas) {
        setAnimatorStartEndCenterX();
        drawCurrentStateJoiningLine(canvas);
        drawLines(canvas, this.mBackgroundPaint, this.mCurrentStateNumber - 1, this.mMaxStateNumber);
        drawCircles(canvas, this.mBackgroundPaint, this.mCurrentStateNumber, this.mMaxStateNumber);
        drawCircles(canvas, this.mForegroundPaint, 0, this.mCurrentStateNumber);
        drawLines(canvas, this.mForegroundPaint, 0, this.mCurrentStateNumber - 1);
        drawStateNumberText(canvas, this.mMaxStateNumber);
        drawStateDescriptionText(canvas);
    }

    private void drawStateDescriptionText(Canvas canvas) {
        if (!this.mStateDescriptionData.isEmpty()) {
            for (int i = 0; i < this.mStateDescriptionData.size(); i++) {
                if (i < this.mMaxStateNumber) {
                    Paint selectDescriptionPaint = selectDescriptionPaint(this.mCurrentStateNumber, i);
                    int i2 = (int) (this.mNextCellWidth - (this.mCellWidth / 2.0f));
                    int i3 = (int) ((((this.mCellHeight + this.mStateDescriptionSize) - this.mSpacing) - this.mDescTopSpaceDecrementer) + this.mDescTopSpaceIncrementer);
                    if (i < getCurrentStateNumber()) {
                        selectDescriptionPaint.setColor(this.mCurrentStateDescriptionColor);
                        canvas.drawText(this.mStateDescriptionData.get(i), i2, i3, selectDescriptionPaint);
                    } else {
                        selectDescriptionPaint.setColor(this.mStateDescriptionColor);
                        canvas.drawText(this.mStateDescriptionData.get(i), i2, i3, selectDescriptionPaint);
                    }
                    this.mNextCellWidth += this.mCellWidth;
                }
            }
        }
        this.mNextCellWidth = this.mCellWidth;
    }

    private void drawStateNumberText(Canvas canvas, int i) {
        Typeface create = Typeface.create(Typeface.DEFAULT, 1);
        int i2 = 0;
        while (i2 < i) {
            Paint selectPaintType = selectPaintType(this.mCurrentStateNumber, i2, this.mCheckStateCompleted);
            float f = this.mCellWidth;
            int i3 = i2 + 1;
            int i4 = (int) ((i3 * f) - (f / 2.0f));
            int descent = (int) ((this.mCellHeight / 2.0f) - ((selectPaintType.descent() + selectPaintType.ascent()) / 2.0f));
            boolean isCheckIconUsed = isCheckIconUsed(this.mCurrentStateNumber, i2);
            if (this.mCheckStateCompleted && isCheckIconUsed) {
                canvas.drawText(getContext().getString(R.string.check_icon), i4, descent, selectPaintType);
            } else if (i3 == getCurrentStateNumber()) {
                selectPaintType.setTextSize(this.mStateNumberTextSize);
                selectPaintType.setTypeface(create);
                canvas.drawText(String.valueOf(i3), i4, descent, selectPaintType);
            } else {
                selectPaintType.setTextSize(this.mStateNumberTextSize - 2.0f);
                selectPaintType.setTypeface(this.mCheckFont);
                canvas.drawText(String.valueOf(i3), i4, descent, selectPaintType);
            }
            i2 = i3;
        }
    }

    private int getCellHeight() {
        return ((int) (this.mStateRadius * 2.0f)) + ((int) this.mSpacing);
    }

    private int getDesiredHeight() {
        int i;
        float f;
        if (this.mStateDescriptionData.isEmpty()) {
            i = (int) (this.mStateRadius * 2.0f);
            f = this.mSpacing;
        } else {
            i = ((((int) (this.mStateRadius * 2.0f)) + ((int) (this.mStateDescriptionSize * 1.3d))) + ((int) this.mSpacing)) - ((int) this.mDescTopSpaceDecrementer);
            f = this.mDescTopSpaceIncrementer;
        }
        return i + ((int) f);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        initStateProgressBar(context);
        this.mStateDescriptionSize = convertSpToPixel(this.mStateDescriptionSize);
        this.mStateLineThickness = convertDpToPixel(this.mStateLineThickness);
        this.mSpacing = convertDpToPixel(this.mSpacing);
        this.mCheckFont = s50.a(context);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.StateProgressBar, i, 0);
            this.mBackgroundColor = obtainStyledAttributes.getColor(R.styleable.StateProgressBar_spb_stateBackgroundColor, this.mBackgroundColor);
            this.mForegroundColor = obtainStyledAttributes.getColor(R.styleable.StateProgressBar_spb_stateForegroundColor, this.mForegroundColor);
            this.mStateNumberBackgroundColor = obtainStyledAttributes.getColor(R.styleable.StateProgressBar_spb_stateNumberBackgroundColor, this.mStateNumberBackgroundColor);
            this.mStateNumberForegroundColor = obtainStyledAttributes.getColor(R.styleable.StateProgressBar_spb_stateNumberForegroundColor, this.mStateNumberForegroundColor);
            this.mCurrentStateDescriptionColor = obtainStyledAttributes.getColor(R.styleable.StateProgressBar_spb_currentStateDescriptionColor, this.mCurrentStateDescriptionColor);
            this.mStateDescriptionColor = obtainStyledAttributes.getColor(R.styleable.StateProgressBar_spb_stateDescriptionColor, this.mStateDescriptionColor);
            this.mCurrentStateNumber = obtainStyledAttributes.getInteger(R.styleable.StateProgressBar_spb_currentStateNumber, this.mCurrentStateNumber);
            this.mMaxStateNumber = obtainStyledAttributes.getInteger(R.styleable.StateProgressBar_spb_maxStateNumber, this.mMaxStateNumber);
            this.mStateSize = obtainStyledAttributes.getDimension(R.styleable.StateProgressBar_spb_stateSize, this.mStateSize);
            this.mStateNumberTextSize = obtainStyledAttributes.getDimension(R.styleable.StateProgressBar_spb_stateTextSize, this.mStateNumberTextSize);
            this.mStateDescriptionSize = obtainStyledAttributes.getDimension(R.styleable.StateProgressBar_spb_stateDescriptionSize, this.mStateDescriptionSize);
            this.mStateLineThickness = obtainStyledAttributes.getDimension(R.styleable.StateProgressBar_spb_stateLineThickness, this.mStateLineThickness);
            this.mCheckStateCompleted = obtainStyledAttributes.getBoolean(R.styleable.StateProgressBar_spb_checkStateCompleted, this.mCheckStateCompleted);
            this.mAnimateToCurrentProgressState = obtainStyledAttributes.getBoolean(R.styleable.StateProgressBar_spb_animateToCurrentProgressState, this.mAnimateToCurrentProgressState);
            this.mEnableAllStatesCompleted = obtainStyledAttributes.getBoolean(R.styleable.StateProgressBar_spb_enableAllStatesCompleted, this.mEnableAllStatesCompleted);
            this.mDescTopSpaceDecrementer = obtainStyledAttributes.getDimension(R.styleable.StateProgressBar_spb_descriptionTopSpaceDecrementer, this.mDescTopSpaceDecrementer);
            this.mDescTopSpaceIncrementer = obtainStyledAttributes.getDimension(R.styleable.StateProgressBar_spb_descriptionTopSpaceIncrementer, this.mDescTopSpaceIncrementer);
            this.mAnimDuration = obtainStyledAttributes.getInteger(R.styleable.StateProgressBar_spb_animationDuration, this.mAnimDuration);
            this.mAnimStartDelay = obtainStyledAttributes.getInteger(R.styleable.StateProgressBar_spb_animationStartDelay, this.mAnimStartDelay);
            if (!this.mAnimateToCurrentProgressState) {
                stopAnimation();
            }
            resolveStateSize();
            validateLineThickness(this.mStateLineThickness);
            validateStateNumber(this.mCurrentStateNumber);
            this.mStateRadius = this.mStateSize / 2.0f;
            obtainStyledAttributes.recycle();
        }
    }

    private void initStateProgressBar(Context context) {
        this.mBackgroundColor = t8.d(context, R.color.background_color);
        int i = R.color.foreground_color;
        this.mForegroundColor = t8.d(context, i);
        int i2 = R.color.background_text_color;
        this.mStateNumberBackgroundColor = t8.d(context, i2);
        this.mStateNumberForegroundColor = t8.d(context, R.color.foreground_text_color);
        this.mCurrentStateDescriptionColor = t8.d(context, i);
        this.mStateDescriptionColor = t8.d(context, i2);
        this.mStateSize = 0.0f;
        this.mStateLineThickness = 1.0f;
        this.mStateNumberTextSize = 0.0f;
        this.mStateDescriptionSize = 15.0f;
        this.mMaxStateNumber = StateNumber.FIVE.getValue();
        this.mCurrentStateNumber = StateNumber.ONE.getValue();
        this.mSpacing = 1.0f;
        this.mDescTopSpaceDecrementer = 0.0f;
        this.mDescTopSpaceIncrementer = 0.0f;
        this.mCheckStateCompleted = false;
        this.mAnimateToCurrentProgressState = false;
        this.mEnableAllStatesCompleted = false;
        this.mAnimStartDelay = 100;
        this.mAnimDuration = 4000;
    }

    private void initializePainters() {
        Typeface create = Typeface.create(Typeface.DEFAULT, 1);
        this.mBackgroundPaint = setPaintAttributes(this.mStateLineThickness, this.mBackgroundColor);
        this.mForegroundPaint = setPaintAttributes(this.mStateLineThickness, this.mForegroundColor);
        this.mStateNumberForegroundPaint = setPaintAttributes(this.mStateNumberTextSize, this.mStateNumberForegroundColor, create);
        this.mStateCheckedForegroundPaint = setPaintAttributes(this.mStateNumberTextSize, this.mStateNumberForegroundColor, this.mCheckFont);
        this.mStateNumberBackgroundPaint = setPaintAttributes(this.mStateNumberTextSize, this.mStateNumberBackgroundColor, create);
        this.mCurrentStateDescriptionPaint = setPaintAttributes(this.mStateDescriptionSize, this.mCurrentStateDescriptionColor, create);
        this.mStateDescriptionPaint = setPaintAttributes(this.mStateDescriptionSize - 2.0f, this.mStateDescriptionColor, this.mCheckFont);
    }

    private boolean isCheckIconUsed(int i, int i2) {
        return this.mEnableAllStatesCompleted || i2 + 1 < i;
    }

    private void resetStateAnimationData() {
        float f = this.mStartCenterX;
        if (f > 0.0f || f < 0.0f) {
            this.mStartCenterX = 0.0f;
        }
        float f2 = this.mEndCenterX;
        if (f2 > 0.0f || f2 < 0.0f) {
            this.mEndCenterX = 0.0f;
        }
        float f3 = this.mAnimEndXPos;
        if (f3 > 0.0f || f3 < 0.0f) {
            this.mAnimEndXPos = 0.0f;
        }
        if (this.mIsCurrentAnimStarted) {
            this.mIsCurrentAnimStarted = false;
        }
    }

    private void resetStateSizeValues() {
        resolveStateSize();
        this.mStateNumberForegroundPaint.setTextSize(this.mStateNumberTextSize);
        this.mStateNumberBackgroundPaint.setTextSize(this.mStateNumberTextSize);
        this.mStateCheckedForegroundPaint.setTextSize(this.mStateNumberTextSize);
        this.mStateRadius = this.mStateSize / 2.0f;
        validateLineThickness(this.mStateLineThickness);
        this.mBackgroundPaint.setStrokeWidth(this.mStateLineThickness);
        this.mForegroundPaint.setStrokeWidth(this.mStateLineThickness);
        requestLayout();
    }

    private void resolveStateSize() {
        resolveStateSize(this.mStateSize != 0.0f, this.mStateNumberTextSize != 0.0f);
    }

    private Paint selectDescriptionPaint(int i, int i2) {
        if (i2 + 1 == i) {
            return this.mCurrentStateDescriptionPaint;
        }
        return this.mStateDescriptionPaint;
    }

    private Paint selectPaintType(int i, int i2, boolean z) {
        int i3;
        if (!(this.mEnableAllStatesCompleted && z) && ((i3 = i2 + 1) >= i || !z)) {
            if (i3 != i && (i3 >= i || z)) {
                return this.mStateNumberBackgroundPaint;
            }
            return this.mStateNumberForegroundPaint;
        }
        return this.mStateCheckedForegroundPaint;
    }

    private void setAnimatorStartEndCenterX() {
        int i = this.mCurrentStateNumber;
        if (i > 1 && i < 6) {
            for (int i2 = 0; i2 < this.mCurrentStateNumber - 1; i2++) {
                if (i2 == 0) {
                    this.mStartCenterX = this.mNextCellWidth - (this.mCellWidth / 2.0f);
                } else {
                    this.mStartCenterX = this.mEndCenterX;
                }
                float f = this.mNextCellWidth;
                float f2 = this.mCellWidth;
                float f3 = f + f2;
                this.mNextCellWidth = f3;
                this.mEndCenterX = f3 - (f2 / 2.0f);
            }
            return;
        }
        resetStateAnimationData();
    }

    private Paint setPaintAttributes(float f, int i) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(f);
        paint.setColor(i);
        return paint;
    }

    private void startAnimator() {
        Animator animator = new Animator();
        this.mAnimator = animator;
        animator.start();
    }

    private void stopAnimation() {
        Animator animator = this.mAnimator;
        if (animator != null) {
            animator.stop();
        }
    }

    private void updateCheckAllStatesValues(boolean z) {
        if (z) {
            this.mCheckStateCompleted = true;
            this.mCurrentStateNumber = this.mMaxStateNumber;
            this.mStateDescriptionPaint.setColor(this.mCurrentStateDescriptionPaint.getColor());
            return;
        }
        Paint paint = this.mStateDescriptionPaint;
        paint.setColor(paint.getColor());
    }

    private void validateLineThickness(float f) {
        float f2 = this.mStateSize / 2.0f;
        if (f > f2) {
            this.mStateLineThickness = f2;
        }
    }

    private void validateStateNumber(int i) {
        if (i <= this.mMaxStateNumber) {
            return;
        }
        throw new IllegalStateException(C0059ao.a(3762) + i + C0059ao.a(3763) + this.mMaxStateNumber);
    }

    private void validateStateSize() {
        float f = this.mStateSize;
        float f2 = this.mStateNumberTextSize;
        if (f <= f2) {
            this.mStateSize = f2 + (f2 / 2.0f);
        }
    }

    public void checkStateCompleted(boolean z) {
        this.mCheckStateCompleted = z;
        invalidate();
    }

    public void enableAnimationToCurrentState(boolean z) {
        this.mAnimateToCurrentProgressState = z;
        if (z && this.mAnimator == null) {
            startAnimator();
        }
        invalidate();
    }

    public int getAnimationDuration() {
        return this.mAnimDuration;
    }

    public int getAnimationStartDelay() {
        return this.mAnimStartDelay;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public int getCurrentStateDescriptionColor() {
        return this.mCurrentStateDescriptionColor;
    }

    public int getCurrentStateNumber() {
        return this.mCurrentStateNumber;
    }

    public float getDescriptionTopSpaceDecrementer() {
        return this.mDescTopSpaceDecrementer;
    }

    public float getDescriptionTopSpaceIncrementer() {
        return this.mDescTopSpaceIncrementer;
    }

    public int getForegroundColor() {
        return this.mForegroundColor;
    }

    public int getMaxStateNumber() {
        return this.mMaxStateNumber;
    }

    public int getStateDescriptionColor() {
        return this.mStateDescriptionColor;
    }

    public List<String> getStateDescriptionData() {
        return this.mStateDescriptionData;
    }

    public float getStateLineThickness() {
        return this.mStateLineThickness;
    }

    public int getStateNumberBackgroundColor() {
        return this.mStateNumberBackgroundColor;
    }

    public int getStateNumberForegroundColor() {
        return this.mStateNumberForegroundColor;
    }

    public float getStateNumberTextSize() {
        return this.mStateNumberTextSize;
    }

    public float getStateSize() {
        return this.mStateSize;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAnimator();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        stopAnimation();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawState(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), getDesiredHeight());
        this.mCellHeight = getCellHeight();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.mEndCenterX = bundle.getFloat(C0059ao.a(3764));
            this.mStartCenterX = bundle.getFloat(C0059ao.a(3765));
            this.mAnimStartXPos = bundle.getFloat(C0059ao.a(3766));
            this.mAnimEndXPos = bundle.getFloat(C0059ao.a(3767));
            this.mIsCurrentAnimStarted = bundle.getBoolean(C0059ao.a(3768));
            this.mAnimateToCurrentProgressState = bundle.getBoolean(C0059ao.a(3769));
            parcelable = bundle.getParcelable(C0059ao.a(3770));
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(C0059ao.a(3771), super.onSaveInstanceState());
        bundle.putFloat(C0059ao.a(3772), this.mEndCenterX);
        bundle.putFloat(C0059ao.a(3773), this.mStartCenterX);
        bundle.putFloat(C0059ao.a(3774), this.mAnimStartXPos);
        bundle.putFloat(C0059ao.a(3775), this.mAnimEndXPos);
        bundle.putBoolean(C0059ao.a(3776), this.mIsCurrentAnimStarted);
        bundle.putBoolean(C0059ao.a(3777), this.mAnimateToCurrentProgressState);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float width = getWidth() / this.mMaxStateNumber;
        this.mCellWidth = width;
        this.mNextCellWidth = width;
    }

    public void setAllStatesCompleted(boolean z) {
        this.mEnableAllStatesCompleted = z;
        updateCheckAllStatesValues(z);
        invalidate();
    }

    public void setAnimationDuration(int i) {
        this.mAnimDuration = i;
        invalidate();
    }

    public void setAnimationStartDelay(int i) {
        this.mAnimStartDelay = i;
        invalidate();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.mBackgroundColor = i;
        this.mBackgroundPaint.setColor(i);
        invalidate();
    }

    public void setCurrentStateDescriptionColor(int i) {
        this.mCurrentStateDescriptionColor = i;
        this.mCurrentStateDescriptionPaint.setColor(i);
        invalidate();
    }

    public void setCurrentStateNumber(StateNumber stateNumber) {
        validateStateNumber(stateNumber.getValue());
        this.mCurrentStateNumber = stateNumber.getValue();
        updateCheckAllStatesValues(this.mEnableAllStatesCompleted);
        invalidate();
    }

    public void setDescriptionTopSpaceDecrementer(float f) {
        this.mDescTopSpaceDecrementer = f;
        requestLayout();
    }

    public void setDescriptionTopSpaceIncrementer(float f) {
        this.mDescTopSpaceIncrementer = f;
        requestLayout();
    }

    public void setForegroundColor(int i) {
        this.mForegroundColor = i;
        this.mForegroundPaint.setColor(i);
        invalidate();
    }

    public void setMaxStateNumber(StateNumber stateNumber) {
        this.mMaxStateNumber = stateNumber.getValue();
        validateStateNumber(this.mCurrentStateNumber);
        updateCheckAllStatesValues(this.mEnableAllStatesCompleted);
        invalidate();
    }

    public void setStateDescriptionColor(int i) {
        this.mStateDescriptionColor = i;
        this.mStateDescriptionPaint.setColor(i);
        invalidate();
    }

    public void setStateDescriptionData(String[] strArr) {
        this.mStateDescriptionData = new ArrayList<>(Arrays.asList(strArr));
        requestLayout();
    }

    public void setStateDescriptionSize(float f) {
        float convertSpToPixel = convertSpToPixel(f);
        this.mStateDescriptionSize = convertSpToPixel;
        this.mCurrentStateDescriptionPaint.setTextSize(convertSpToPixel);
        this.mStateDescriptionPaint.setTextSize(this.mStateDescriptionSize);
        requestLayout();
    }

    public void setStateLineThickness(float f) {
        float convertDpToPixel = convertDpToPixel(f);
        this.mStateLineThickness = convertDpToPixel;
        validateLineThickness(convertDpToPixel);
        this.mBackgroundPaint.setStrokeWidth(this.mStateLineThickness);
        this.mForegroundPaint.setStrokeWidth(this.mStateLineThickness);
        invalidate();
    }

    public void setStateNumberBackgroundColor(int i) {
        this.mStateNumberBackgroundColor = i;
        this.mStateNumberBackgroundPaint.setColor(i);
        invalidate();
    }

    public void setStateNumberForegroundColor(int i) {
        this.mStateNumberForegroundColor = i;
        this.mStateNumberForegroundPaint.setColor(i);
        this.mStateCheckedForegroundPaint.setColor(this.mStateNumberForegroundColor);
        invalidate();
    }

    public void setStateNumberTextSize(float f) {
        this.mStateNumberTextSize = convertSpToPixel(f);
        resetStateSizeValues();
    }

    public void setStateSize(float f) {
        this.mStateSize = convertDpToPixel(f);
        resetStateSizeValues();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        startAnimator();
    }

    public StateProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void resolveStateSize(boolean z, boolean z2) {
        if (!z && !z2) {
            this.mStateSize = convertDpToPixel(25.0f);
            this.mStateNumberTextSize = convertSpToPixel(15.0f);
        } else if (z && z2) {
            validateStateSize();
        } else if (!z) {
            float f = this.mStateNumberTextSize;
            this.mStateSize = f + (f / 2.0f);
        } else {
            float f2 = this.mStateSize;
            this.mStateNumberTextSize = f2 - (0.375f * f2);
        }
    }

    public StateProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mStateDescriptionData = new ArrayList<>();
        init(context, attributeSet, i);
        initializePainters();
        updateCheckAllStatesValues(this.mEnableAllStatesCompleted);
    }

    public void setStateDescriptionData(ArrayList<String> arrayList) {
        this.mStateDescriptionData = arrayList;
        requestLayout();
    }

    private Paint setPaintAttributes(float f, int i, Typeface typeface) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(f);
        paint.setColor(i);
        paint.setTypeface(typeface);
        return paint;
    }
}
