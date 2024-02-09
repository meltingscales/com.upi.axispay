package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.lz;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: zz  reason: default package */
/* loaded from: classes.dex */
public class zz extends a00 {
    public static final boolean q;
    public final TextWatcher d;
    public final View.OnFocusChangeListener e;
    public final TextInputLayout.e f;
    public final TextInputLayout.f g;
    @SuppressLint({"ClickableViewAccessibility"})
    public final TextInputLayout.g h;
    public boolean i;
    public boolean j;
    public long k;
    public StateListDrawable l;
    public hz m;
    public AccessibilityManager n;
    public ValueAnimator o;
    public ValueAnimator p;

    /* compiled from: AxisPay */
    /* renamed from: zz$a */
    /* loaded from: classes.dex */
    public class a extends ky {

        /* compiled from: AxisPay */
        /* renamed from: zz$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0043a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView b;

            public RunnableC0043a(AutoCompleteTextView autoCompleteTextView) {
                this.b = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.b.isPopupShowing();
                zz.this.E(isPopupShowing);
                zz.this.i = isPopupShowing;
            }
        }

        public a() {
        }

        @Override // defpackage.ky, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView y = zz.y(zz.this.a.getEditText());
            if (zz.this.n.isTouchExplorationEnabled() && zz.D(y) && !zz.this.c.hasFocus()) {
                y.dismissDropDown();
            }
            y.post(new RunnableC0043a(y));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: zz$b */
    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            zz.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: zz$c */
    /* loaded from: classes.dex */
    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            zz.this.a.setEndIconActivated(z);
            if (z) {
                return;
            }
            zz.this.E(false);
            zz.this.i = false;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: zz$d */
    /* loaded from: classes.dex */
    public class d extends TextInputLayout.e {
        public d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, defpackage.eb
        public void g(View view, lc lcVar) {
            super.g(view, lcVar);
            if (!zz.D(zz.this.a.getEditText())) {
                lcVar.a0(Spinner.class.getName());
            }
            if (lcVar.L()) {
                lcVar.l0(null);
            }
        }

        @Override // defpackage.eb
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView y = zz.y(zz.this.a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && zz.this.n.isTouchExplorationEnabled() && !zz.D(zz.this.a.getEditText())) {
                zz.this.H(y);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: zz$e */
    /* loaded from: classes.dex */
    public class e implements TextInputLayout.f {
        public e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView y = zz.y(textInputLayout.getEditText());
            zz.this.F(y);
            zz.this.v(y);
            zz.this.G(y);
            y.setThreshold(0);
            y.removeTextChangedListener(zz.this.d);
            y.addTextChangedListener(zz.this.d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!zz.D(y)) {
                ac.B0(zz.this.c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(zz.this.f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: zz$f */
    /* loaded from: classes.dex */
    public class f implements TextInputLayout.g {

        /* compiled from: AxisPay */
        /* renamed from: zz$f$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView b;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.b = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.b.removeTextChangedListener(zz.this.d);
            }
        }

        public f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i != 3) {
                return;
            }
            autoCompleteTextView.post(new a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == zz.this.e) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (zz.q) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: zz$g */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zz.this.H((AutoCompleteTextView) zz.this.a.getEditText());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: zz$h */
    /* loaded from: classes.dex */
    public class h implements View.OnTouchListener {
        public final /* synthetic */ AutoCompleteTextView b;

        public h(AutoCompleteTextView autoCompleteTextView) {
            this.b = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (zz.this.C()) {
                    zz.this.i = false;
                }
                zz.this.H(this.b);
            }
            return false;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: zz$i */
    /* loaded from: classes.dex */
    public class i implements AutoCompleteTextView.OnDismissListener {
        public i() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            zz.this.i = true;
            zz.this.k = System.currentTimeMillis();
            zz.this.E(false);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: zz$j */
    /* loaded from: classes.dex */
    public class j extends AnimatorListenerAdapter {
        public j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            zz zzVar = zz.this;
            zzVar.c.setChecked(zzVar.j);
            zz.this.p.start();
        }
    }

    static {
        q = Build.VERSION.SDK_INT >= 21;
    }

    public zz(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new a();
        this.e = new c();
        this.f = new d(this.a);
        this.g = new e();
        this.h = new f();
        this.i = false;
        this.j = false;
        this.k = RecyclerView.FOREVER_NS;
    }

    public static boolean D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public static AutoCompleteTextView y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException(C0059ao.a(9519));
    }

    public final hz A(float f2, float f3, float f4, int i2) {
        lz.b a2 = lz.a();
        a2.A(f2);
        a2.E(f2);
        a2.s(f3);
        a2.w(f3);
        lz m = a2.m();
        hz m2 = hz.m(this.b, f4);
        m2.setShapeAppearanceModel(m);
        m2.Z(0, i2, 0, i2);
        return m2;
    }

    public final void B() {
        this.p = z(67, 0.0f, 1.0f);
        ValueAnimator z = z(50, 1.0f, 0.0f);
        this.o = z;
        z.addListener(new j());
    }

    public final boolean C() {
        long currentTimeMillis = System.currentTimeMillis() - this.k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    public final void E(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.p.cancel();
            this.o.start();
        }
    }

    public final void F(AutoCompleteTextView autoCompleteTextView) {
        if (q) {
            int boxBackgroundMode = this.a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.m);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.l);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.e);
        if (q) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    public final void H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (C()) {
            this.i = false;
        }
        if (!this.i) {
            if (q) {
                E(!this.j);
            } else {
                this.j = !this.j;
                this.c.toggle();
            }
            if (this.j) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        this.i = false;
    }

    @Override // defpackage.a00
    public void a() {
        float dimensionPixelOffset = this.b.getResources().getDimensionPixelOffset(kv.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.b.getResources().getDimensionPixelOffset(kv.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.b.getResources().getDimensionPixelOffset(kv.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        hz A = A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        hz A2 = A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.m = A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, A);
        this.l.addState(new int[0], A2);
        this.a.setEndIconDrawable(k0.d(this.b, q ? lv.mtrl_dropdown_arrow : lv.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(qv.exposed_dropdown_menu_content_description));
        this.a.setEndIconOnClickListener(new g());
        this.a.e(this.g);
        this.a.f(this.h);
        B();
        this.n = (AccessibilityManager) this.b.getSystemService(C0059ao.a(9520));
    }

    @Override // defpackage.a00
    public boolean b(int i2) {
        return i2 != 0;
    }

    @Override // defpackage.a00
    public boolean d() {
        return true;
    }

    public final void v(AutoCompleteTextView autoCompleteTextView) {
        if (D(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.a.getBoxBackgroundMode();
        hz boxBackground = this.a.getBoxBackground();
        int c2 = ww.c(autoCompleteTextView, iv.colorControlHighlight);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            x(autoCompleteTextView, c2, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            w(autoCompleteTextView, c2, iArr, boxBackground);
        }
    }

    public final void w(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, hz hzVar) {
        int boxBackgroundColor = this.a.getBoxBackgroundColor();
        int[] iArr2 = {ww.f(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (q) {
            ac.u0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), hzVar, hzVar));
            return;
        }
        hz hzVar2 = new hz(hzVar.C());
        hzVar2.X(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{hzVar, hzVar2});
        int I = ac.I(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int H = ac.H(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        ac.u0(autoCompleteTextView, layerDrawable);
        ac.E0(autoCompleteTextView, I, paddingTop, H, paddingBottom);
    }

    public final void x(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, hz hzVar) {
        LayerDrawable layerDrawable;
        int c2 = ww.c(autoCompleteTextView, iv.colorSurface);
        hz hzVar2 = new hz(hzVar.C());
        int f2 = ww.f(i2, c2, 0.1f);
        hzVar2.X(new ColorStateList(iArr, new int[]{f2, 0}));
        if (q) {
            hzVar2.setTint(c2);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f2, c2});
            hz hzVar3 = new hz(hzVar.C());
            hzVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hzVar2, hzVar3), hzVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{hzVar2, hzVar});
        }
        ac.u0(autoCompleteTextView, layerDrawable);
    }

    public final ValueAnimator z(int i2, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(tv.a);
        ofFloat.setDuration(i2);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }
}
