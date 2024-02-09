package com.upi.axispay.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.upi.axispay.R;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PinFieldLayout extends FrameLayout {
    public TextView errorView;
    public ImageView indicator;
    public LinearLayout linearLayout;
    public EditText pinField;

    public PinFieldLayout(Context context) {
        super(context);
    }

    public String getPinText() {
        return this.pinField.getText().toString();
    }

    public EditText getTextField() {
        return this.pinField;
    }

    public void hideEditTextHint() {
        this.pinField.setHint(C0059ao.a(4733));
    }

    public void hideIndicator() {
        this.indicator.setVisibility(8);
        this.errorView.setVisibility(0);
    }

    public void hideIndicatorErrorText() {
        this.errorView.setVisibility(8);
        this.indicator.setVisibility(8);
    }

    public void initView(Context context, AttributeSet attributeSet) {
        View inflate = FrameLayout.inflate(getContext(), R.layout.pin_layout, null);
        addView(inflate);
        this.linearLayout = (LinearLayout) inflate.findViewById(R.id.linearlayout);
        this.pinField = (EditText) inflate.findViewById(R.id.pin_view);
        this.errorView = (TextView) inflate.findViewById(R.id.err_view);
        this.indicator = (ImageView) inflate.findViewById(R.id.indicator_view);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z80.PinLayout);
        this.errorView.setText(obtainStyledAttributes.getString(0));
        int resourceId = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId != 0) {
            this.pinField.setCompoundDrawablesWithIntrinsicBounds(resourceId, 0, 0, 0);
        }
        obtainStyledAttributes.recycle();
    }

    public void setEditTextImeOptions(String str) {
        if (str.equalsIgnoreCase(C0059ao.a(4734))) {
            this.pinField.setImeOptions(5);
        }
        if (str.equalsIgnoreCase(C0059ao.a(4735))) {
            this.pinField.setImeOptions(6);
        }
        if (str.equalsIgnoreCase(C0059ao.a(4736))) {
            this.pinField.setImeOptions(2);
        }
        if (str.equalsIgnoreCase(C0059ao.a(4737))) {
            this.pinField.setImeOptions(3);
        }
        if (str.equalsIgnoreCase(C0059ao.a(4738))) {
            this.pinField.setImeOptions(4);
        }
    }

    public void setLayoutbg() {
        this.linearLayout.setBackground(t8.f(getContext(), R.drawable.edittext_style));
    }

    public void setLayoutbgCorrect() {
        this.linearLayout.setBackground(t8.f(getContext(), R.drawable.edittext_style_pink));
    }

    public void setLayoutbgError() {
        this.linearLayout.setBackground(t8.f(getContext(), R.drawable.edittext_style_red));
    }

    public void setPinText(String str) {
        this.pinField.setText(str);
    }

    public void setPinTextHint(String str) {
        this.pinField.setHint(str);
    }

    public void seterrorText() {
        this.errorView.setText(getResources().getString(R.string.password_mismatch));
        this.errorView.setTextColor(t8.d(getContext(), R.color.accent_red));
        this.errorView.setVisibility(0);
    }

    public void showIndicator() {
        this.errorView.setVisibility(8);
        this.indicator.setVisibility(0);
    }

    public PinFieldLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context, attributeSet);
    }

    public PinFieldLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context, attributeSet);
    }

    public void seterrorText(int i) {
        this.errorView.setText(getResources().getString(i));
        this.errorView.setTextColor(t8.d(getContext(), R.color.accent_red));
        this.errorView.setVisibility(0);
    }
}
