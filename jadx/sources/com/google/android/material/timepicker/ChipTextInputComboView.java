package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip b;
    public final TextInputLayout c;
    public final EditText d;
    public TextWatcher e;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b extends ky {
        public b() {
        }

        @Override // defpackage.ky, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.b.setText(ChipTextInputComboView.this.c("00"));
            } else {
                ChipTextInputComboView.this.b.setText(ChipTextInputComboView.this.c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final String c(CharSequence charSequence) {
        return TimeModel.a(getResources(), charSequence);
    }

    public final void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.d.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.b.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.b.setChecked(z);
        this.d.setVisibility(z ? 0 : 4);
        this.b.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            this.d.requestFocus();
            if (TextUtils.isEmpty(this.d.getText())) {
                return;
            }
            EditText editText = this.d;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.b.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.b.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(ov.material_time_chip, (ViewGroup) this, false);
        this.b = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(ov.material_time_input, (ViewGroup) this, false);
        this.c = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.d = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.e = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(mv.material_label);
        editText.setSaveEnabled(false);
    }
}
