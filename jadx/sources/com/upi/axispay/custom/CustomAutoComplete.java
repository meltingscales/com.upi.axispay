package com.upi.axispay.custom;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CustomAutoComplete extends AutoCompleteTextView {
    public CustomAutoComplete(Context context) {
        super(context);
    }

    @Override // android.widget.AutoCompleteTextView
    public boolean enoughToFilter() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z || TextUtils.isEmpty(getText())) {
            return;
        }
        performFiltering(getText(), 0);
        showDropDown();
    }

    public void updateList(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        performFiltering(str, 0);
        showDropDown();
    }

    public CustomAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomAutoComplete(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
