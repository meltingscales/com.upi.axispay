package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: AxisPay */
/* renamed from: wz  reason: default package */
/* loaded from: classes.dex */
public class wz extends a00 {
    public final TextWatcher d;
    public final View.OnFocusChangeListener e;
    public final TextInputLayout.f f;
    public final TextInputLayout.g g;
    public AnimatorSet h;
    public ValueAnimator i;

    /* compiled from: AxisPay */
    /* renamed from: wz$a */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (wz.this.a.getSuffixText() != null) {
                return;
            }
            wz wzVar = wz.this;
            wzVar.i(wzVar.a.hasFocus() && wz.l(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: wz$b */
    /* loaded from: classes.dex */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            wz.this.i(((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z) ? false : false);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: wz$c */
    /* loaded from: classes.dex */
    public class c implements TextInputLayout.f {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && wz.l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(wz.this.e);
            editText.removeTextChangedListener(wz.this.d);
            editText.addTextChangedListener(wz.this.d);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: wz$d */
    /* loaded from: classes.dex */
    public class d implements TextInputLayout.g {

        /* compiled from: AxisPay */
        /* renamed from: wz$d$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ EditText b;

            public a(EditText editText) {
                this.b = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.b.removeTextChangedListener(wz.this.d);
            }
        }

        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 2) {
                return;
            }
            editText.post(new a(editText));
            if (editText.getOnFocusChangeListener() == wz.this.e) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: wz$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = wz.this.a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            wz.this.a.V();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: wz$f */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            wz.this.a.setEndIconVisible(true);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: wz$g */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            wz.this.a.setEndIconVisible(false);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: wz$h */
    /* loaded from: classes.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {
        public h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            wz.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: wz$i */
    /* loaded from: classes.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            wz.this.c.setScaleX(floatValue);
            wz.this.c.setScaleY(floatValue);
        }
    }

    public wz(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new a();
        this.e = new b();
        this.f = new c();
        this.g = new d();
    }

    public static boolean l(Editable editable) {
        return editable.length() > 0;
    }

    @Override // defpackage.a00
    public void a() {
        this.a.setEndIconDrawable(k0.d(this.b, lv.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(qv.clear_text_end_icon_content_description));
        this.a.setEndIconOnClickListener(new e());
        this.a.e(this.f);
        this.a.f(this.g);
        m();
    }

    @Override // defpackage.a00
    public void c(boolean z) {
        if (this.a.getSuffixText() == null) {
            return;
        }
        i(z);
    }

    public final void i(boolean z) {
        boolean z2 = this.a.K() == z;
        if (z && !this.h.isRunning()) {
            this.i.cancel();
            this.h.start();
            if (z2) {
                this.h.end();
            }
        } else if (z) {
        } else {
            this.h.cancel();
            this.i.start();
            if (z2) {
                this.i.end();
            }
        }
    }

    public final ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(tv.a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    public final ValueAnimator k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(tv.d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    public final void m() {
        ValueAnimator k = k();
        ValueAnimator j = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.h = animatorSet;
        animatorSet.playTogether(k, j);
        this.h.addListener(new f());
        ValueAnimator j2 = j(1.0f, 0.0f);
        this.i = j2;
        j2.addListener(new g());
    }
}
