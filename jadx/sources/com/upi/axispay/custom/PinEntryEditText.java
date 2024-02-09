package com.upi.axispay.custom;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.vision.barcode.Barcode;
import com.upi.axispay.R;
import java.util.Locale;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PinEntryEditText extends d2 {
    private static final String XML_NAMESPACE_ANDROID = null;
    public boolean mAnimate;
    public int mAnimatedType;
    public float[] mCharBottom;
    public Paint mCharPaint;
    public float mCharSize;
    public View.OnClickListener mClickListener;
    public ColorStateList mColorStates;
    public int[] mColors;
    public boolean mHasError;
    public boolean mIsDigitSquare;
    public Paint mLastCharPaint;
    public RectF[] mLineCoords;
    public float mLineStroke;
    public float mLineStrokeSelected;
    public Paint mLinesPaint;
    public String mMask;
    public StringBuilder mMaskChars;
    public int mMaxLength;
    public float mNumChars;
    public OnPinEnteredListener mOnPinEnteredListener;
    public ColorStateList mOriginalTextColors;
    public Drawable mPinBackground;
    public String mSingleCharHint;
    public Paint mSingleCharPaint;
    public float mSpace;
    public int[][] mStates;
    public float mTextBottomPadding;
    public Rect mTextHeight;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface OnPinEnteredListener {
        void onPinEntered(CharSequence charSequence);
    }

    static {
        C0059ao.a(PinEntryEditText.class, 390);
    }

    public PinEntryEditText(Context context) {
        super(context);
        this.mMask = null;
        this.mMaskChars = null;
        this.mSingleCharHint = null;
        this.mAnimatedType = 0;
        this.mSpace = 24.0f;
        this.mNumChars = 4.0f;
        this.mTextBottomPadding = 8.0f;
        this.mMaxLength = 4;
        this.mTextHeight = new Rect();
        this.mIsDigitSquare = false;
        this.mOnPinEnteredListener = null;
        this.mLineStroke = 1.0f;
        this.mLineStrokeSelected = 2.0f;
        this.mAnimate = false;
        this.mHasError = false;
        this.mStates = new int[][]{new int[]{16842913}, new int[]{16842914}, new int[]{16842908}, new int[]{-16842908}};
        this.mColors = new int[]{-16711936, -65536, -16777216, -7829368};
        this.mColorStates = new ColorStateList(this.mStates, this.mColors);
    }

    private void animateBottomUp(CharSequence charSequence, final int i) {
        float[] fArr = this.mCharBottom;
        fArr[i] = this.mLineCoords[i].bottom - this.mTextBottomPadding;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[i] + getPaint().getTextSize(), this.mCharBottom[i]);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new OvershootInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.upi.axispay.custom.PinEntryEditText.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinEntryEditText.this.mCharBottom[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PinEntryEditText.this.invalidate();
            }
        });
        this.mLastCharPaint.setAlpha(255);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.upi.axispay.custom.PinEntryEditText.7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinEntryEditText.this.mLastCharPaint.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        if (charSequence.length() == this.mMaxLength && this.mOnPinEnteredListener != null) {
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.upi.axispay.custom.PinEntryEditText.8
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    PinEntryEditText pinEntryEditText = PinEntryEditText.this;
                    pinEntryEditText.mOnPinEnteredListener.onPinEntered(pinEntryEditText.getText());
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
        }
        animatorSet.playTogether(ofFloat, ofInt);
        animatorSet.start();
    }

    private void animatePopIn() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, getPaint().getTextSize());
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new OvershootInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.upi.axispay.custom.PinEntryEditText.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinEntryEditText.this.mLastCharPaint.setTextSize(((Float) valueAnimator.getAnimatedValue()).floatValue());
                PinEntryEditText.this.invalidate();
            }
        });
        if (getText().length() == this.mMaxLength && this.mOnPinEnteredListener != null) {
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.upi.axispay.custom.PinEntryEditText.5
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    PinEntryEditText pinEntryEditText = PinEntryEditText.this;
                    pinEntryEditText.mOnPinEnteredListener.onPinEntered(pinEntryEditText.getText());
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
        }
        ofFloat.start();
    }

    private int getColorForState(int... iArr) {
        return this.mColorStates.getColorForState(iArr, -7829368);
    }

    private CharSequence getFullText() {
        if (this.mMask == null) {
            return getText();
        }
        return getMaskChars();
    }

    private StringBuilder getMaskChars() {
        if (this.mMaskChars == null) {
            this.mMaskChars = new StringBuilder();
        }
        int length = getText().length();
        while (this.mMaskChars.length() != length) {
            if (this.mMaskChars.length() < length) {
                this.mMaskChars.append(this.mMask);
            } else {
                StringBuilder sb = this.mMaskChars;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return this.mMaskChars;
    }

    private void init(Context context, AttributeSet attributeSet) {
        float f = context.getResources().getDisplayMetrics().density;
        this.mLineStroke *= f;
        this.mLineStrokeSelected *= f;
        this.mSpace *= f;
        this.mTextBottomPadding = f * this.mTextBottomPadding;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z80.PinEntryEditText, 0, 0);
        try {
            TypedValue typedValue = new TypedValue();
            obtainStyledAttributes.getValue(4, typedValue);
            this.mAnimatedType = typedValue.data;
            this.mMask = obtainStyledAttributes.getString(2);
            this.mSingleCharHint = obtainStyledAttributes.getString(8);
            this.mLineStroke = obtainStyledAttributes.getDimension(6, this.mLineStroke);
            this.mLineStrokeSelected = obtainStyledAttributes.getDimension(7, this.mLineStrokeSelected);
            this.mSpace = obtainStyledAttributes.getDimension(3, this.mSpace);
            this.mTextBottomPadding = obtainStyledAttributes.getDimension(9, this.mTextBottomPadding);
            this.mIsDigitSquare = obtainStyledAttributes.getBoolean(1, this.mIsDigitSquare);
            this.mPinBackground = obtainStyledAttributes.getDrawable(0);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(5);
            if (colorStateList != null) {
                this.mColorStates = colorStateList;
            }
            obtainStyledAttributes.recycle();
            this.mCharPaint = new Paint(getPaint());
            this.mLastCharPaint = new Paint(getPaint());
            this.mSingleCharPaint = new Paint(getPaint());
            Paint paint = new Paint(getPaint());
            this.mLinesPaint = paint;
            paint.setStrokeWidth(this.mLineStroke);
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorControlActivated, typedValue2, true);
            this.mColors[0] = typedValue2.data;
            this.mColors[1] = isInEditMode() ? -7829368 : t8.d(context, R.color.colorAccent);
            this.mColors[2] = isInEditMode() ? -7829368 : t8.d(context, R.color.colorAccent);
            setBackgroundResource(0);
            int attributeIntValue = attributeSet.getAttributeIntValue(C0059ao.a(12162), C0059ao.a(12163), 6);
            this.mMaxLength = attributeIntValue;
            this.mNumChars = attributeIntValue;
            super.setCustomSelectionActionModeCallback(new ActionMode.Callback() { // from class: com.upi.axispay.custom.PinEntryEditText.1
                @Override // android.view.ActionMode.Callback
                public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                    return false;
                }

                @Override // android.view.ActionMode.Callback
                public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }

                @Override // android.view.ActionMode.Callback
                public void onDestroyActionMode(ActionMode actionMode) {
                }

                @Override // android.view.ActionMode.Callback
                public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }
            });
            super.setOnClickListener(new View.OnClickListener() { // from class: com.upi.axispay.custom.PinEntryEditText.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    PinEntryEditText pinEntryEditText = PinEntryEditText.this;
                    pinEntryEditText.setSelection(pinEntryEditText.getText().length());
                    View.OnClickListener onClickListener = PinEntryEditText.this.mClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }
            });
            super.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.upi.axispay.custom.PinEntryEditText.3
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    PinEntryEditText pinEntryEditText = PinEntryEditText.this;
                    pinEntryEditText.setSelection(pinEntryEditText.getText().length());
                    return true;
                }
            });
            int inputType = getInputType() & Barcode.ITF;
            String a = C0059ao.a(12164);
            if (inputType == 128 && TextUtils.isEmpty(this.mMask)) {
                this.mMask = a;
            } else if ((getInputType() & 16) == 16 && TextUtils.isEmpty(this.mMask)) {
                this.mMask = a;
            }
            if (!TextUtils.isEmpty(this.mMask)) {
                this.mMaskChars = getMaskChars();
            }
            getPaint().getTextBounds(C0059ao.a(12165), 0, 1, this.mTextHeight);
            this.mAnimate = this.mAnimatedType > -1;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void focus() {
        requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService(C0059ao.a(12166));
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    public boolean isError() {
        return this.mHasError;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        CharSequence fullText = getFullText();
        int length = fullText.length();
        float[] fArr = new float[length];
        getPaint().getTextWidths(fullText, 0, length, fArr);
        String str = this.mSingleCharHint;
        float f = 0.0f;
        if (str != null) {
            int length2 = str.length();
            float[] fArr2 = new float[length2];
            getPaint().getTextWidths(this.mSingleCharHint, fArr2);
            for (int i = 0; i < length2; i++) {
                f += fArr2[i];
            }
        }
        float f2 = f;
        int i2 = 0;
        while (i2 < this.mNumChars) {
            if (this.mPinBackground != null) {
                updateDrawableState(i2 < length, i2 == length);
                Drawable drawable = this.mPinBackground;
                RectF[] rectFArr = this.mLineCoords;
                drawable.setBounds((int) rectFArr[i2].left, (int) rectFArr[i2].top, (int) rectFArr[i2].right, (int) rectFArr[i2].bottom);
                this.mPinBackground.draw(canvas);
            }
            float f3 = this.mLineCoords[i2].left + (this.mCharSize / 2.0f);
            if (length > i2) {
                if (this.mAnimate && i2 == length - 1) {
                    canvas.drawText(fullText, i2, i2 + 1, f3 - (fArr[i2] / 2.0f), this.mCharBottom[i2], this.mLastCharPaint);
                } else {
                    canvas.drawText(fullText, i2, i2 + 1, f3 - (fArr[i2] / 2.0f), this.mCharBottom[i2], this.mCharPaint);
                }
            } else {
                String str2 = this.mSingleCharHint;
                if (str2 != null) {
                    canvas.drawText(str2, f3 - (f2 / 2.0f), this.mCharBottom[i2], this.mSingleCharPaint);
                }
            }
            if (this.mPinBackground == null) {
                updateColorForLines(i2 <= length);
                RectF[] rectFArr2 = this.mLineCoords;
                canvas.drawLine(rectFArr2[i2].left, rectFArr2[i2].top, rectFArr2[i2].right, rectFArr2[i2].bottom, this.mLinesPaint);
            }
            i2++;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int I;
        float f;
        super.onSizeChanged(i, i2, i3, i4);
        ColorStateList textColors = getTextColors();
        this.mOriginalTextColors = textColors;
        if (textColors != null) {
            this.mLastCharPaint.setColor(textColors.getDefaultColor());
            this.mCharPaint.setColor(this.mOriginalTextColors.getDefaultColor());
            this.mSingleCharPaint.setColor(getCurrentHintTextColor());
        }
        int width = (getWidth() - ac.H(this)) - ac.I(this);
        float f2 = this.mSpace;
        if (f2 < 0.0f) {
            this.mCharSize = width / ((this.mNumChars * 2.0f) - 1.0f);
        } else {
            float f3 = this.mNumChars;
            this.mCharSize = (width - (f2 * (f3 - 1.0f))) / f3;
        }
        float f4 = this.mNumChars;
        this.mLineCoords = new RectF[(int) f4];
        this.mCharBottom = new float[(int) f4];
        int height = getHeight() - getPaddingBottom();
        int i5 = 1;
        if (va.b(Locale.getDefault()) == 1) {
            i5 = -1;
            I = (int) ((getWidth() - ac.I(this)) - this.mCharSize);
        } else {
            I = ac.I(this);
        }
        for (int i6 = 0; i6 < this.mNumChars; i6++) {
            float f5 = I;
            float f6 = height;
            this.mLineCoords[i6] = new RectF(f5, f6, this.mCharSize + f5, f6);
            if (this.mPinBackground != null) {
                if (this.mIsDigitSquare) {
                    this.mLineCoords[i6].top = getPaddingTop();
                    RectF[] rectFArr = this.mLineCoords;
                    rectFArr[i6].right = rectFArr[i6].height() + f5;
                } else {
                    this.mLineCoords[i6].top -= this.mTextHeight.height() + (this.mTextBottomPadding * 2.0f);
                }
            }
            float f7 = this.mSpace;
            if (f7 < 0.0f) {
                f = f5 + (i5 * this.mCharSize * 2.0f);
            } else {
                f = f5 + (i5 * (this.mCharSize + f7));
            }
            I = (int) f;
            this.mCharBottom[i6] = this.mLineCoords[i6].bottom - this.mTextBottomPadding;
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        setError(false);
        if (this.mLineCoords != null && this.mAnimate) {
            int i4 = this.mAnimatedType;
            if (i4 == -1) {
                invalidate();
            } else if (i3 > i2) {
                if (i4 == 0) {
                    animatePopIn();
                } else {
                    animateBottomUp(charSequence, i);
                }
            }
        } else if (this.mOnPinEnteredListener == null || charSequence.length() != this.mMaxLength) {
        } else {
            this.mOnPinEnteredListener.onPinEntered(charSequence);
        }
    }

    public void setAnimateText(boolean z) {
        this.mAnimate = z;
    }

    @Override // defpackage.d2, android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw new RuntimeException(C0059ao.a(12167));
    }

    public void setError(boolean z) {
        this.mHasError = z;
    }

    public void setMaxLength(int i) {
        this.mMaxLength = i;
        this.mNumChars = i;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        setText((CharSequence) null);
        invalidate();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
    }

    public void setOnPinEnteredListener(OnPinEnteredListener onPinEnteredListener) {
        this.mOnPinEnteredListener = onPinEnteredListener;
    }

    public void updateColorForLines(boolean z) {
        if (this.mHasError) {
            this.mLinesPaint.setColor(getColorForState(16842914));
        } else if (isFocused()) {
            this.mLinesPaint.setStrokeWidth(this.mLineStrokeSelected);
            this.mLinesPaint.setColor(getColorForState(16842908));
            if (z) {
                this.mLinesPaint.setColor(getColorForState(16842913));
            }
        } else {
            this.mLinesPaint.setStrokeWidth(this.mLineStroke);
            this.mLinesPaint.setColor(getColorForState(-16842908));
        }
    }

    public void updateDrawableState(boolean z, boolean z2) {
        if (this.mHasError) {
            this.mPinBackground.setState(new int[]{16842914});
        } else if (isFocused()) {
            this.mPinBackground.setState(new int[]{16842908});
            if (z2) {
                this.mPinBackground.setState(new int[]{16842908, 16842913});
            } else if (z) {
                this.mPinBackground.setState(new int[]{16842908, 16842912});
            }
        } else {
            this.mPinBackground.setState(new int[]{-16842908});
        }
    }

    public PinEntryEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMask = null;
        this.mMaskChars = null;
        this.mSingleCharHint = null;
        this.mAnimatedType = 0;
        this.mSpace = 24.0f;
        this.mNumChars = 4.0f;
        this.mTextBottomPadding = 8.0f;
        this.mMaxLength = 4;
        this.mTextHeight = new Rect();
        this.mIsDigitSquare = false;
        this.mOnPinEnteredListener = null;
        this.mLineStroke = 1.0f;
        this.mLineStrokeSelected = 2.0f;
        this.mAnimate = false;
        this.mHasError = false;
        this.mStates = new int[][]{new int[]{16842913}, new int[]{16842914}, new int[]{16842908}, new int[]{-16842908}};
        this.mColors = new int[]{-16711936, -65536, -16777216, -7829368};
        this.mColorStates = new ColorStateList(this.mStates, this.mColors);
        init(context, attributeSet);
    }

    public PinEntryEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMask = null;
        this.mMaskChars = null;
        this.mSingleCharHint = null;
        this.mAnimatedType = 0;
        this.mSpace = 24.0f;
        this.mNumChars = 4.0f;
        this.mTextBottomPadding = 8.0f;
        this.mMaxLength = 4;
        this.mTextHeight = new Rect();
        this.mIsDigitSquare = false;
        this.mOnPinEnteredListener = null;
        this.mLineStroke = 1.0f;
        this.mLineStrokeSelected = 2.0f;
        this.mAnimate = false;
        this.mHasError = false;
        this.mStates = new int[][]{new int[]{16842913}, new int[]{16842914}, new int[]{16842908}, new int[]{-16842908}};
        this.mColors = new int[]{-16711936, -65536, -16777216, -7829368};
        this.mColorStates = new ColorStateList(this.mStates, this.mColors);
        init(context, attributeSet);
    }

    @TargetApi(21)
    public PinEntryEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.mMask = null;
        this.mMaskChars = null;
        this.mSingleCharHint = null;
        this.mAnimatedType = 0;
        this.mSpace = 24.0f;
        this.mNumChars = 4.0f;
        this.mTextBottomPadding = 8.0f;
        this.mMaxLength = 4;
        this.mTextHeight = new Rect();
        this.mIsDigitSquare = false;
        this.mOnPinEnteredListener = null;
        this.mLineStroke = 1.0f;
        this.mLineStrokeSelected = 2.0f;
        this.mAnimate = false;
        this.mHasError = false;
        this.mStates = new int[][]{new int[]{16842913}, new int[]{16842914}, new int[]{16842908}, new int[]{-16842908}};
        this.mColors = new int[]{-16711936, -65536, -16777216, -7829368};
        this.mColorStates = new ColorStateList(this.mStates, this.mColors);
        init(context, attributeSet);
    }
}
