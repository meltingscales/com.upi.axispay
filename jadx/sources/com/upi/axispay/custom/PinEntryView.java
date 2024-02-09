package com.upi.axispay.custom;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.upi.axispay.R;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PinEntryView extends ViewGroup {
    public static final int ACCENT_ALL = 0;
    public static final int ACCENT_CHARACTER = 0;
    public static final int ACCENT_NONE = 0;
    private int accentColor;
    private int accentType;
    private int accentWidth;
    public int counter;
    private int digitBackground;
    private int digitElevation;
    private int digitHeight;
    private int digitSpacing;
    private int digitTextColor;
    private int digitTextSize;
    private int digitWidth;
    private int digits;
    private EditText editText;
    private int inputType;
    private String mask;
    private View.OnFocusChangeListener onFocusChangeListener;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class DigitView extends AppCompatTextView {
        private Paint paint;

        public DigitView(PinEntryView pinEntryView, Context context) {
            this(pinEntryView, context, null);
        }

        @Override // android.widget.TextView, android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (isSelected()) {
                canvas.drawRect(0.0f, getHeight() - PinEntryView.this.accentWidth, getWidth(), getHeight(), this.paint);
            }
        }

        public DigitView(PinEntryView pinEntryView, Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public DigitView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            Paint paint = new Paint();
            this.paint = paint;
            paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(PinEntryView.this.accentColor);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.upi.axispay.custom.PinEntryView.SavedState.1
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
        public String editTextValue;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.editTextValue);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.editTextValue = parcel.readString();
        }
    }

    static {
        C0059ao.a(PinEntryView.class, 285);
    }

    public PinEntryView(Context context) {
        this(context, null);
    }

    private void addViews() {
        for (int i = 0; i < this.digits; i++) {
            DigitView digitView = new DigitView(this, getContext());
            digitView.setWidth(this.digitWidth);
            digitView.setHeight(this.digitHeight);
            digitView.setBackgroundResource(this.digitBackground);
            digitView.setTextColor(this.digitTextColor);
            digitView.setTextSize(0, this.digitTextSize);
            digitView.setTypeface(Typeface.createFromAsset(getResources().getAssets(), getResources().getString(R.string.font_roboto_bold)), 1);
            digitView.setGravity(17);
            if (Build.VERSION.SDK_INT >= 21) {
                digitView.setElevation(this.digitElevation);
            }
            addView(digitView);
        }
        this.editText = new EditText(getContext());
        this.editText.setTypeface(Typeface.createFromAsset(getResources().getAssets(), getResources().getString(R.string.font_roboto_bold)), 1);
        this.editText.setTextSize(0, this.digitTextSize);
        this.editText.setBackgroundColor(t8.d(getContext(), 17170445));
        this.editText.setTextColor(t8.d(getContext(), 17170445));
        this.editText.setCursorVisible(false);
        this.editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.digits)});
        this.editText.setInputType(this.inputType);
        this.editText.setImeOptions(268435456);
        this.editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.upi.axispay.custom.PinEntryView.1
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                int length = PinEntryView.this.editText.getText().length();
                for (int i2 = 0; i2 < PinEntryView.this.digits; i2++) {
                    View childAt = PinEntryView.this.getChildAt(i2);
                    boolean z2 = true;
                    if (!z || (PinEntryView.this.accentType != 1 && (PinEntryView.this.accentType != 2 || (i2 != length && (i2 != PinEntryView.this.digits - 1 || length != PinEntryView.this.digits))))) {
                        z2 = false;
                    }
                    childAt.setSelected(z2);
                }
                PinEntryView.this.editText.setSelection(length);
                if (PinEntryView.this.onFocusChangeListener != null) {
                    PinEntryView.this.onFocusChangeListener.onFocusChange(PinEntryView.this, z);
                }
            }
        });
        this.editText.addTextChangedListener(new TextWatcher() { // from class: com.upi.axispay.custom.PinEntryView.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                int length = editable.length();
                for (int i2 = 0; i2 < PinEntryView.this.digits; i2++) {
                    if (editable.length() > i2) {
                        ((TextView) PinEntryView.this.getChildAt(i2)).setText((PinEntryView.this.mask == null || PinEntryView.this.mask.length() == 0) ? String.valueOf(editable.charAt(i2)) : PinEntryView.this.mask);
                    } else {
                        ((TextView) PinEntryView.this.getChildAt(i2)).setText(C0059ao.a(2957));
                    }
                    if (PinEntryView.this.editText.hasFocus()) {
                        View childAt = PinEntryView.this.getChildAt(i2);
                        boolean z = true;
                        if (PinEntryView.this.accentType != 1 && (PinEntryView.this.accentType != 2 || (i2 != length && (i2 != PinEntryView.this.digits - 1 || length != PinEntryView.this.digits)))) {
                            z = false;
                        }
                        childAt.setSelected(z);
                    }
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        addView(this.editText);
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        this.editText.addTextChangedListener(textWatcher);
    }

    public void clearText() {
        this.editText.setText(C0059ao.a(1053));
    }

    public EditText getEditText() {
        return this.editText;
    }

    @Override // android.view.View
    public View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.onFocusChangeListener;
    }

    public Editable getText() {
        return this.editText.getText();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 0;
        while (true) {
            int i6 = this.digits;
            if (i5 < i6) {
                View childAt = getChildAt(i5);
                int i7 = (this.digitWidth * i5) + (i5 > 0 ? this.digitSpacing * i5 : 0);
                childAt.layout(getPaddingLeft() + i7 + this.digitElevation, getPaddingTop() + (this.digitElevation / 2), i7 + getPaddingLeft() + this.digitElevation + this.digitWidth, getPaddingTop() + (this.digitElevation / 2) + this.digitHeight);
                i5++;
            } else {
                getChildAt(i6).layout(0, 0, 1, getMeasuredHeight());
                return;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.digitWidth;
        int i4 = this.digits;
        int i5 = (i3 * i4) + (this.digitSpacing * (i4 - 1));
        setMeasuredDimension(getPaddingLeft() + i5 + getPaddingRight() + (this.digitElevation * 2), this.digitHeight + getPaddingTop() + getPaddingBottom() + (this.digitElevation * 2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), CommonUtils.BYTES_IN_A_GIGABYTE);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            getChildAt(i6).measure(i5, makeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.editText.setText(savedState.editTextValue);
        this.editText.setSelection(savedState.editTextValue.length());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.editTextValue = this.editText.getText().toString();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.editText.requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService(C0059ao.a(1054));
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.editText, 0);
                return true;
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        this.editText.removeTextChangedListener(textWatcher);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.onFocusChangeListener = onFocusChangeListener;
    }

    public void setText(CharSequence charSequence) {
        int length = charSequence.length();
        int i = this.digits;
        if (length > i) {
            charSequence = charSequence.subSequence(0, i);
        }
        this.editText.setText(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public PinEntryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PinEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.counter = 0;
        this.mask = C0059ao.a(1052);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z80.PinEntryView);
        this.digits = obtainStyledAttributes.getInt(11, 4);
        this.inputType = obtainStyledAttributes.getInt(13, 2);
        this.accentType = obtainStyledAttributes.getInt(1, 0);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.digitWidth = obtainStyledAttributes.getDimensionPixelSize(9, (int) TypedValue.applyDimension(1, 50.0f, displayMetrics));
        this.digitHeight = obtainStyledAttributes.getDimensionPixelSize(5, (int) TypedValue.applyDimension(1, 50.0f, displayMetrics));
        this.digitSpacing = obtainStyledAttributes.getDimensionPixelSize(6, (int) TypedValue.applyDimension(1, 20.0f, displayMetrics));
        this.digitTextSize = obtainStyledAttributes.getDimensionPixelSize(8, (int) TypedValue.applyDimension(0, 15.0f, displayMetrics));
        this.accentWidth = obtainStyledAttributes.getDimensionPixelSize(2, (int) TypedValue.applyDimension(1, 3.0f, displayMetrics));
        if (Build.VERSION.SDK_INT >= 21) {
            this.digitElevation = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        }
        Resources.Theme theme = getContext().getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(16842836, typedValue, true);
        this.digitBackground = obtainStyledAttributes.getResourceId(3, typedValue.resourceId);
        TypedValue typedValue2 = new TypedValue();
        theme.resolveAttribute(16842806, typedValue2, true);
        this.digitTextColor = obtainStyledAttributes.getColor(7, typedValue2.resourceId > 0 ? t8.d(getContext(), typedValue2.resourceId) : typedValue2.data);
        TypedValue typedValue3 = new TypedValue();
        theme.resolveAttribute(R.attr.colorAccent, typedValue3, true);
        this.accentColor = obtainStyledAttributes.getColor(12, typedValue3.resourceId > 0 ? t8.d(getContext(), typedValue3.resourceId) : typedValue3.data);
        String string = obtainStyledAttributes.getString(10);
        if (string != null) {
            this.mask = string;
        }
        obtainStyledAttributes.recycle();
        addViews();
    }
}
