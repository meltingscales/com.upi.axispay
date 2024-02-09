package org.npci.upi.security.pinactivitycomponent.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import myunmn.C0059ao;
import org.npci.upi.security.pinactivitycomponent.R;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class FormItemView extends LinearLayout implements org.npci.upi.security.pinactivitycomponent.widget.a {
    public boolean b;
    public String c;
    public int d;
    public TextView e;
    public FormItemEditText f;
    public a g;
    public int h;
    public Object i;
    public LinearLayout j;
    public Button k;
    public ProgressBar l;
    public ImageView m;
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public TextView t;
    public int u;
    public boolean v;
    public String w;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public interface a {
        void b(int i);

        void d(int i, String str);

        void f(View view, String str);
    }

    public FormItemView(Context context, Context context2) {
        super(context);
        this.b = false;
        this.n = C0059ao.a(9778);
        this.o = false;
        this.p = false;
        this.q = false;
        this.u = 0;
        this.v = true;
        i(context, null);
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.a
    public void a(String str, Drawable drawable, View.OnClickListener onClickListener, int i, boolean z, boolean z2) {
        if (!TextUtils.isEmpty(str)) {
            this.k.setText(str);
        }
        Button button = this.k;
        Drawable drawable2 = i == 0 ? drawable : null;
        Drawable drawable3 = i == 1 ? drawable : null;
        Drawable drawable4 = i == 2 ? drawable : null;
        if (i != 3) {
            drawable = null;
        }
        button.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable);
        this.k.setOnClickListener(onClickListener);
        this.k.setEnabled(z2);
        g(this.k, z);
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.a
    public boolean b() {
        this.f.requestFocus();
        return true;
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.a
    public int c() {
        return this.u;
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.a
    public boolean d() {
        if (this.o) {
            this.o = false;
            this.f.setText(this.n.replaceAll(C0059ao.a(9779), C0059ao.a(9780)));
        } else {
            this.o = true;
            setText(this.n);
        }
        return this.o;
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.a
    public boolean e() {
        return false;
    }

    public ec g(View view, final boolean z) {
        ec d = ac.d(view);
        d.e(z ? 1.0f : 0.0f);
        d.d(z ? 1.0f : 0.0f);
        d.g(new AccelerateInterpolator());
        d.h(new gc(this) { // from class: org.npci.upi.security.pinactivitycomponent.widget.FormItemView.3
            @Override // defpackage.gc, defpackage.fc
            public void b(View view2) {
                super.b(view2);
                view2.setVisibility(z ? 0 : 8);
            }
        });
        d.a(z ? 1.0f : 0.5f);
        return d;
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.a
    public Object getFormDataTag() {
        return this.i;
    }

    public FormItemEditText getFormInputView() {
        return this.f;
    }

    public a getFormItemListener() {
        return this.g;
    }

    public int getInputLength() {
        return this.d;
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.a
    public String getInputValue() {
        return (this.b || this.o) ? this.f.getText().toString() : this.n;
    }

    public String getSubtype() {
        return this.w;
    }

    public boolean getTextEntered() {
        return this.q;
    }

    public boolean getToggleCheckBox() {
        return this.p;
    }

    public boolean getToggleCheckbox() {
        return this.p;
    }

    public void i(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FormItemView);
        if (obtainStyledAttributes != null) {
            this.c = obtainStyledAttributes.getString(R.styleable.FormItemView_formTitle);
            obtainStyledAttributes.getString(R.styleable.FormItemView_formValidationError);
            this.d = obtainStyledAttributes.getInteger(R.styleable.FormItemView_formInputLength, 6);
            this.r = obtainStyledAttributes.getBoolean(R.styleable.FormItemView_formActionOnTop, false);
            obtainStyledAttributes.recycle();
        }
        LinearLayout.inflate(context, R.layout.layout_form_item, this);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.form_item_root);
        this.j = (LinearLayout) findViewById(R.id.form_item_action_bar);
        this.e = (TextView) findViewById(R.id.form_item_title);
        this.f = (FormItemEditText) findViewById(R.id.form_item_input);
        this.k = (Button) findViewById(R.id.form_item_button);
        this.l = (ProgressBar) findViewById(R.id.form_item_progress);
        this.m = (ImageView) findViewById(R.id.form_item_image);
        this.f.setInputType(0);
        this.t = (TextView) findViewById(R.id.educational_info);
        this.k.setTextColor(getResources().getColor(R.color.npci_key_digit_color_alpha));
        setTitle(this.c);
        setInputLength(this.d);
        this.f.addTextChangedListener(new TextWatcher() { // from class: org.npci.upi.security.pinactivitycomponent.widget.FormItemView.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                FormItemView.this.u = editable.length();
                if (FormItemView.this.b) {
                    if (editable.length() != 0) {
                        FormItemView.this.k.setEnabled(true);
                        FormItemView.this.k.setTextColor(FormItemView.this.getResources().getColor(R.color.npci_key_digit_color));
                    }
                    FormItemView.this.n = editable.toString();
                } else if (FormItemView.this.o) {
                    if (editable.length() == 0) {
                        if (FormItemView.this.v) {
                            FormItemView.this.k.setCompoundDrawablesWithIntrinsicBounds(FormItemView.this.getResources().getDrawable(R.drawable.ic_visibility_off_blue_24px), (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        FormItemView.this.k.setEnabled(false);
                        FormItemView.this.k.setTextColor(FormItemView.this.getResources().getColor(R.color.npci_key_digit_color_alpha));
                    } else {
                        if (FormItemView.this.v) {
                            FormItemView.this.k.setCompoundDrawablesWithIntrinsicBounds(FormItemView.this.getResources().getDrawable(R.drawable.ic_visibility_off), (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        FormItemView.this.k.setTextColor(FormItemView.this.getResources().getColor(R.color.npci_key_digit_color));
                        FormItemView.this.k.setEnabled(true);
                    }
                    FormItemView.this.n = editable.toString();
                } else {
                    int length = editable.length();
                    String a2 = C0059ao.a(3783);
                    if (length == 0) {
                        if (FormItemView.this.v) {
                            FormItemView.this.k.setCompoundDrawablesWithIntrinsicBounds(FormItemView.this.getResources().getDrawable(R.drawable.ic_visibility_blue_24px), (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        FormItemView.this.k.setEnabled(false);
                        FormItemView.this.k.setTextColor(FormItemView.this.getResources().getColor(R.color.npci_key_digit_color_alpha));
                        FormItemView.this.n = a2;
                        return;
                    }
                    if (FormItemView.this.v) {
                        FormItemView.this.k.setCompoundDrawablesWithIntrinsicBounds(FormItemView.this.getResources().getDrawable(R.drawable.ic_visibility_on), (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    FormItemView.this.k.setTextColor(FormItemView.this.getResources().getColor(R.color.npci_key_digit_color));
                    FormItemView.this.k.setEnabled(true);
                    if (FormItemView.this.n.length() > editable.length()) {
                        FormItemView formItemView = FormItemView.this;
                        formItemView.n = formItemView.n.substring(0, FormItemView.this.n.length() - 1);
                        return;
                    }
                    char charAt = editable.toString().charAt(editable.length() - 1);
                    if (charAt == 9679) {
                        FormItemView.this.f.setSelection(editable.length());
                        return;
                    }
                    FormItemView formItemView2 = FormItemView.this;
                    String str = formItemView2.n;
                    formItemView2.n = str.concat(a2 + charAt);
                    FormItemView.this.f.setText(FormItemView.this.n.replaceAll(C0059ao.a(3784), C0059ao.a(3785)));
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.length() > 0) {
                    FormItemView.this.k.setVisibility(0);
                }
                if (FormItemView.this.g == null || FormItemView.this.f.getText() == null || FormItemView.this.f.getText().length() < FormItemView.this.d) {
                    return;
                }
                FormItemView.this.g.d(FormItemView.this.h, FormItemView.this.f.getText().toString());
            }
        });
        this.f.setOnTouchListener(new View.OnTouchListener() { // from class: org.npci.upi.security.pinactivitycomponent.widget.FormItemView.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (FormItemView.this.g == null || motionEvent.getAction() != 1) {
                    return false;
                }
                FormItemView.this.g.b(FormItemView.this.h);
                return false;
            }
        });
        setActionBarPositionTop(this.r);
    }

    public void j(Drawable drawable, boolean z) {
        if (drawable != null) {
            this.m.setImageDrawable(drawable);
        }
        g(this.m, z);
    }

    public void k(String str, View.OnClickListener onClickListener, boolean z, boolean z2) {
        this.k.setTextColor(getResources().getColor(R.color.npci_key_digit_color));
        if (!TextUtils.isEmpty(str)) {
            this.k.setText(str);
        }
        g(this.k, z);
        this.k.setEnabled(z2);
        this.k.setOnClickListener(onClickListener);
    }

    public void l(boolean z) {
        ec g = g(this.l, z);
        g.g(new AccelerateDecelerateInterpolator());
        g.l();
    }

    public void setActionBarPositionTop(boolean z) {
        this.s = z;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
        if (this.s) {
            layoutParams.addRule(10);
            layoutParams.addRule(8, 0);
        } else {
            layoutParams.addRule(10, 0);
            layoutParams.addRule(8, R.id.form_item_input);
        }
        this.j.setLayoutParams(layoutParams);
    }

    public void setEducationalText(String str) {
        if (!str.contains(getResources().getString(R.string.educational_info_upi_debitnew, C0059ao.a(9781)))) {
            this.t.setText(str);
            return;
        }
        this.t.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info, 0, 0, 0);
        this.t.setText(str);
        this.t.setTextColor(getResources().getColor(R.color.npci_text_secondary_dark));
        this.t.setBackgroundResource(R.drawable.rounded_corner);
    }

    public void setFormDataTag(Object obj) {
        this.i = obj;
    }

    public void setFormItemListener(a aVar) {
        this.g = aVar;
    }

    public void setFormItemTag(int i) {
        this.h = i;
    }

    public void setInputLength(int i) {
        this.f.setMaxLength(i);
        this.d = i;
    }

    public void setIsStateUnmasked(boolean z) {
        this.o = z;
    }

    public void setSubtype(String str) {
        this.w = str;
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.a
    public void setText(String str) {
        this.f.setText(str);
        this.f.setSelection(str.length());
    }

    public void setTextEntered(boolean z) {
        this.q = z;
    }

    public void setTitle(String str) {
        this.e.setText(str);
        this.c = str;
    }

    public void setToggleCheckBox(boolean z) {
        this.p = z;
    }

    public void u() {
        this.b = true;
    }
}
