package defpackage;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: AxisPay */
/* renamed from: e00  reason: default package */
/* loaded from: classes.dex */
public class e00 extends a00 {
    public final TextWatcher d;
    public final TextInputLayout.f e;
    public final TextInputLayout.g f;

    /* compiled from: AxisPay */
    /* renamed from: e00$a */
    /* loaded from: classes.dex */
    public class a extends ky {
        public a() {
        }

        @Override // defpackage.ky, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            e00 e00Var = e00.this;
            e00Var.c.setChecked(!e00Var.g());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: e00$b */
    /* loaded from: classes.dex */
    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            e00 e00Var = e00.this;
            e00Var.c.setChecked(!e00Var.g());
            editText.removeTextChangedListener(e00.this.d);
            editText.addTextChangedListener(e00.this.d);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: e00$c */
    /* loaded from: classes.dex */
    public class c implements TextInputLayout.g {

        /* compiled from: AxisPay */
        /* renamed from: e00$c$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ EditText b;

            public a(EditText editText) {
                this.b = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.b.removeTextChangedListener(e00.this.d);
            }
        }

        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: e00$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = e00.this.a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (e00.this.g()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            e00.this.a.V();
        }
    }

    public e00(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new a();
        this.e = new b();
        this.f = new c();
    }

    public static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // defpackage.a00
    public void a() {
        this.a.setEndIconDrawable(k0.d(this.b, lv.design_password_eye));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(qv.password_toggle_content_description));
        this.a.setEndIconOnClickListener(new d());
        this.a.e(this.e);
        this.a.f(this.f);
        EditText editText = this.a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean g() {
        EditText editText = this.a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
