package com.upi.axispay.custom;

import android.content.Context;
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
public class VpaFieldLayout extends FrameLayout {
    public TextView errorView;
    public ImageView indicator;
    public LinearLayout linearLayout;
    public CustomAutoComplete pinField;

    public VpaFieldLayout(Context context) {
        super(context);
    }

    public String getPinText() {
        return this.pinField.getText().toString();
    }

    public EditText getTextField() {
        return this.pinField;
    }

    public void initView(Context context, AttributeSet attributeSet) {
        View inflate = FrameLayout.inflate(getContext(), R.layout.vpa_layout, null);
        addView(inflate);
        this.linearLayout = (LinearLayout) inflate.findViewById(R.id.linearlayout);
        this.pinField = (CustomAutoComplete) inflate.findViewById(R.id.edit_vpa);
        this.indicator = (ImageView) inflate.findViewById(R.id.indicator_view);
        this.errorView = (TextView) inflate.findViewById(R.id.err_view);
    }

    public void setEditTextImeOptions(String str) {
        if (str.equalsIgnoreCase(C0059ao.a(4693))) {
            this.pinField.setImeOptions(5);
        }
        if (str.equalsIgnoreCase(C0059ao.a(4694))) {
            this.pinField.setImeOptions(6);
        }
        if (str.equalsIgnoreCase(C0059ao.a(4695))) {
            this.pinField.setImeOptions(2);
        }
        if (str.equalsIgnoreCase(C0059ao.a(4696))) {
            this.pinField.setImeOptions(3);
        }
        if (str.equalsIgnoreCase(C0059ao.a(4697))) {
            this.pinField.setImeOptions(4);
        }
    }

    public void setPinText(String str) {
        this.pinField.setText(str);
    }

    public void setPinTextHint(String str) {
        this.pinField.setHint(str);
    }

    public void seterrorText() {
        this.errorView.setText(getResources().getString(R.string.passcode_doesnt_match));
        TextView textView = this.errorView;
        textView.setTextColor(t8.d(textView.getContext(), R.color.accent_red));
    }

    public VpaFieldLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context, attributeSet);
    }

    public VpaFieldLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context, attributeSet);
    }
}
