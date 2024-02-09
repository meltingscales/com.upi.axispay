package com.upi.axispay.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.upi.axispay.R;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class FloatingInputLayout extends FrameLayout {
    public static final int INPUT_TYPE_AMOUNT = 0;
    public static final int INPUT_TYPE_NAME = 0;
    public static final int INPUT_TYPE_NEMERIC = 0;
    public static final int INPUT_TYPE_PASSWORD = 0;
    public static final int INPUT_TYPE_REMARKS = 0;
    public static final int INPUT_TYPE_VPA_WITHOUT_HANDLER = 0;
    public static final int INPUT_TYPE_VPA_WITH_HANDLER = 0;
    private TextView errText;
    private EditText inputField;
    private TextInputLayout inputLayout;
    private ImageView leftIcon;
    private ImageView rightIcon;
    private TextView rightText;

    static {
        C0059ao.a(FloatingInputLayout.class, 231);
    }

    public FloatingInputLayout(Context context) {
        super(context);
    }

    public void addFilter(InputFilter inputFilter) {
        InputFilter[] inputFilterArr;
        InputFilter[] filters = this.inputField.getFilters();
        if (filters != null) {
            inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = inputFilter;
        } else {
            inputFilterArr = new InputFilter[]{inputFilter};
        }
        this.inputField.setFilters(inputFilterArr);
    }

    public void boldEditText(int i) {
        this.inputField.setTypeface(null, i);
    }

    public EditText getEditText() {
        return this.inputField;
    }

    public TextView getErrorView() {
        return this.errText;
    }

    public EditText getInputField() {
        return this.inputField;
    }

    public ImageView getRightIcon() {
        return this.rightIcon;
    }

    public TextView getRightText() {
        return this.rightText;
    }

    public String getText() {
        return this.inputField.getText().toString();
    }

    public TextInputLayout getTextInputLayout() {
        return this.inputLayout;
    }

    public void hideError() {
        this.errText.setVisibility(4);
    }

    public void hideRightText() {
        this.rightText.setVisibility(8);
    }

    public void initView(Context context, AttributeSet attributeSet) {
        View inflate = FrameLayout.inflate(getContext(), R.layout.input_layout_with_text, null);
        addView(inflate);
        this.inputLayout = (TextInputLayout) inflate.findViewById(R.id.input_layout);
        this.inputField = (EditText) inflate.findViewById(R.id.input_view);
        this.rightText = (TextView) inflate.findViewById(R.id.right_text);
        this.rightIcon = (ImageView) inflate.findViewById(R.id.right_icon);
        this.leftIcon = (ImageView) inflate.findViewById(R.id.left_icon);
        this.errText = (TextView) inflate.findViewById(R.id.err_text);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z80.FloatingInputLayout);
        String string = obtainStyledAttributes.getString(6);
        if (string != null) {
            this.rightText.setText(string);
        }
        String string2 = obtainStyledAttributes.getString(2);
        if (string2 != null) {
            this.inputLayout.setHint(string2);
        }
        int resourceId = obtainStyledAttributes.getResourceId(3, -1);
        if (resourceId != -1) {
            this.leftIcon.setImageResource(resourceId);
            this.leftIcon.setVisibility(0);
        } else {
            this.leftIcon.setVisibility(8);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(5, -1);
        if (resourceId2 != -1) {
            this.rightIcon.setId(resourceId2);
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(7, -1);
        if (resourceId3 != -1) {
            this.rightText.setId(resourceId3);
            this.rightText.setVisibility(0);
        } else {
            this.rightText.setVisibility(8);
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId4 != -1) {
            this.inputField.setId(resourceId4);
        } else {
            this.inputField.setId(View.generateViewId());
        }
        int resourceId5 = obtainStyledAttributes.getResourceId(4, -1);
        if (resourceId5 != -1) {
            this.rightIcon.setImageResource(resourceId5);
            this.rightIcon.setVisibility(0);
            hideRightText();
        } else {
            this.rightIcon.setVisibility(8);
        }
        obtainStyledAttributes.recycle();
    }

    public void setActive(boolean z) {
        if (z) {
            return;
        }
        this.inputField.setFocusable(false);
        this.inputField.setClickable(false);
    }

    public void setEditTextImeOptions(String str) {
        if (str.equalsIgnoreCase(C0059ao.a(13539))) {
            this.inputField.setImeOptions(5);
        }
        if (str.equalsIgnoreCase(C0059ao.a(13540))) {
            this.inputField.setImeOptions(6);
        }
        if (str.equalsIgnoreCase(C0059ao.a(13541))) {
            this.inputField.setImeOptions(2);
        }
        if (str.equalsIgnoreCase(C0059ao.a(13542))) {
            this.inputField.setImeOptions(3);
        }
        if (str.equalsIgnoreCase(C0059ao.a(13543))) {
            this.inputField.setImeOptions(4);
        }
    }

    public void setEditableText(boolean z) {
        if (z) {
            return;
        }
        this.inputField.setEnabled(false);
    }

    public void setInputTextHint(String str) {
        this.inputField.setHint(str);
    }

    public void setInputType(int i) {
        String a = C0059ao.a(13544);
        switch (i) {
            case 1:
                this.inputField.setInputType(3);
                this.inputField.setKeyListener(DigitsKeyListener.getInstance(a));
                this.inputField.setRawInputType(3);
                return;
            case 2:
            case 7:
                this.inputField.setInputType(1);
                addFilter(fg0.b(i));
                return;
            case 3:
                this.inputField.setInputType(1);
                addFilter(fg0.b(i));
                return;
            case 4:
                this.inputField.setInputType(18);
                this.inputField.setKeyListener(DigitsKeyListener.getInstance(a));
                this.inputField.setRawInputType(18);
                return;
            case 5:
                this.inputField.setInputType(1);
                addFilter(fg0.b(i));
                return;
            case 6:
                this.inputField.setInputType(2);
                this.inputField.setKeyListener(DigitsKeyListener.getInstance(C0059ao.a(13545)));
                this.inputField.setRawInputType(2);
                this.inputField.setTypeface(null, 1);
                return;
            default:
                return;
        }
    }

    public void setInputTypeData() {
        this.inputField.setFilters(new InputFilter[]{new NumberKeyListener() { // from class: com.upi.axispay.custom.FloatingInputLayout.1
            @Override // android.text.method.NumberKeyListener
            public char[] getAcceptedChars() {
                return new char[0];
            }

            @Override // android.text.method.KeyListener
            public int getInputType() {
                return 0;
            }
        }, new InputFilter.LengthFilter(20)});
    }

    public void setLeftIcon(int i) {
        this.leftIcon.setImageResource(i);
        this.leftIcon.setVisibility(0);
    }

    public void setLeftImageSize(int i, int i2) {
        this.leftIcon.getLayoutParams().height = i;
        this.leftIcon.getLayoutParams().width = i2;
        this.leftIcon.requestLayout();
    }

    public void setMaxLength(int i) {
        addFilter(new InputFilter.LengthFilter(i));
    }

    public void setMultiLine() {
        this.inputField.setMaxLines(5);
        this.inputField.setSingleLine(false);
    }

    public void setRightText(String str) {
        this.rightText.setText(str);
    }

    public void setSingleLine() {
        this.inputField.setMaxLines(1);
        this.inputField.setSingleLine(true);
    }

    public void setText(String str) {
        this.inputField.setText(str);
    }

    public void showError(int i) {
        this.errText.setText(i);
        this.errText.setVisibility(0);
    }

    public void showRightText() {
        this.rightText.setVisibility(0);
    }

    public FloatingInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context, attributeSet);
    }

    public void setRightText(int i) {
        this.rightText.setText(i);
    }

    public void showError(String str) {
        this.errText.setText(str);
        this.errText.setTextColor(t8.d(getContext(), R.color.red));
        this.errText.setVisibility(0);
    }

    public FloatingInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context, attributeSet);
    }

    public void showError(String str, int i) {
        this.errText.setText(str);
        this.errText.setTextColor(t8.d(getContext(), i));
        this.errText.setVisibility(0);
    }
}
