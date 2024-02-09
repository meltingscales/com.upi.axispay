package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.IMediaSession;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public static final int N0 = rv.Widget_Design_TextInputLayout;
    public final TextView A;
    public ColorStateList A0;
    public boolean B;
    public int B0;
    public CharSequence C;
    public int C0;
    public boolean D;
    public int D0;
    public hz E;
    public int E0;
    public hz F;
    public int F0;
    public lz G;
    public boolean G0;
    public final int H;
    public final xx H0;
    public int I;
    public boolean I0;
    public int J;
    public boolean J0;
    public int K;
    public ValueAnimator K0;
    public int L;
    public boolean L0;
    public int M;
    public boolean M0;
    public int N;
    public int O;
    public int P;
    public final Rect Q;
    public final Rect R;
    public final RectF S;
    public Typeface T;
    public final CheckableImageButton U;
    public ColorStateList V;
    public boolean W;
    public PorterDuff.Mode a0;
    public final FrameLayout b;
    public boolean b0;
    public final LinearLayout c;
    public Drawable c0;
    public final LinearLayout d;
    public int d0;
    public final FrameLayout e;
    public View.OnLongClickListener e0;
    public EditText f;
    public final LinkedHashSet<f> f0;
    public CharSequence g;
    public int g0;
    public int h;
    public final SparseArray<a00> h0;
    public int i;
    public final CheckableImageButton i0;
    public final b00 j;
    public final LinkedHashSet<g> j0;
    public boolean k;
    public ColorStateList k0;
    public int l;
    public boolean l0;
    public boolean m;
    public PorterDuff.Mode m0;
    public TextView n;
    public boolean n0;
    public int o;
    public Drawable o0;
    public int p;
    public int p0;
    public CharSequence q;
    public Drawable q0;
    public boolean r;
    public View.OnLongClickListener r0;
    public TextView s;
    public View.OnLongClickListener s0;
    public ColorStateList t;
    public final CheckableImageButton t0;
    public int u;
    public ColorStateList u0;
    public ColorStateList v;
    public ColorStateList v0;
    public ColorStateList w;
    public ColorStateList w0;
    public CharSequence x;
    public int x0;
    public final TextView y;
    public int y0;
    public CharSequence z;
    public int z0;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public CharSequence d;
        public boolean e;
        public CharSequence f;
        public CharSequence g;
        public CharSequence h;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.d) + " hint=" + ((Object) this.f) + " helperText=" + ((Object) this.g) + " placeholderText=" + ((Object) this.h) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.d, parcel, i);
            parcel.writeInt(this.e ? 1 : 0);
            TextUtils.writeToParcel(this.f, parcel, i);
            TextUtils.writeToParcel(this.g, parcel, i);
            TextUtils.writeToParcel(this.h, parcel, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.e = parcel.readInt() == 1;
            this.f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.v0(!textInputLayout.M0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.k) {
                textInputLayout2.n0(editable.length());
            }
            if (TextInputLayout.this.r) {
                TextInputLayout.this.z0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.i0.performClick();
            TextInputLayout.this.i0.jumpDrawablesToCurrentState();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f.requestLayout();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.H0.a0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class e extends eb {
        public final TextInputLayout d;

        public e(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // defpackage.eb
        public void g(View view, lc lcVar) {
            super.g(view, lcVar);
            EditText editText = this.d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.d.getHint();
            CharSequence error = this.d.getError();
            CharSequence placeholderText = this.d.getPlaceholderText();
            int counterMaxLength = this.d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.d.N();
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            if (z) {
                lcVar.A0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                lcVar.A0(charSequence);
                if (z3 && placeholderText != null) {
                    lcVar.A0(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                lcVar.A0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    lcVar.l0(charSequence);
                } else {
                    if (z) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    lcVar.A0(charSequence);
                }
                lcVar.w0(!z);
            }
            lcVar.n0((text == null || text.length() != counterMaxLength) ? -1 : -1);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                lcVar.h0(error);
            }
            if (Build.VERSION.SDK_INT < 17 || editText == null) {
                return;
            }
            editText.setLabelFor(mv.textinput_helper_text);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface g {
        void a(TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iv.textInputStyle);
    }

    public static void U(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt, z);
            }
        }
    }

    public static void b0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean Q = ac.Q(checkableImageButton);
        boolean z = false;
        boolean z2 = onLongClickListener != null;
        if (Q || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(Q);
        checkableImageButton.setPressable(Q);
        checkableImageButton.setLongClickable(z2);
        ac.B0(checkableImageButton, z ? 1 : 2);
    }

    public static void c0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        b0(checkableImageButton, onLongClickListener);
    }

    public static void d0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        b0(checkableImageButton, onLongClickListener);
    }

    private a00 getEndIconDelegate() {
        a00 a00Var = this.h0.get(this.g0);
        return a00Var != null ? a00Var : this.h0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.t0.getVisibility() == 0) {
            return this.t0;
        }
        if (I() && K()) {
            return this.i0;
        }
        return null;
    }

    public static void o0(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? qv.character_counter_overflowed_content_description : qv.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void setEditText(EditText editText) {
        if (this.f == null) {
            if (this.g0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f = editText;
            setMinWidth(this.h);
            setMaxWidth(this.i);
            S();
            setTextInputAccessibilityDelegate(new e(this));
            this.H0.g0(this.f.getTypeface());
            this.H0.Y(this.f.getTextSize());
            int gravity = this.f.getGravity();
            this.H0.Q((gravity & (-113)) | 48);
            this.H0.X(gravity);
            this.f.addTextChangedListener(new a());
            if (this.v0 == null) {
                this.v0 = this.f.getHintTextColors();
            }
            if (this.B) {
                if (TextUtils.isEmpty(this.C)) {
                    CharSequence hint = this.f.getHint();
                    this.g = hint;
                    setHint(hint);
                    this.f.setHint((CharSequence) null);
                }
                this.D = true;
            }
            if (this.n != null) {
                n0(this.f.getText().length());
            }
            s0();
            this.j.e();
            this.c.bringToFront();
            this.d.bringToFront();
            this.e.bringToFront();
            this.t0.bringToFront();
            B();
            A0();
            D0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            w0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        this.t0.setVisibility(z ? 0 : 8);
        this.e.setVisibility(z ? 8 : 0);
        D0();
        if (I()) {
            return;
        }
        r0();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.C)) {
            return;
        }
        this.C = charSequence;
        this.H0.e0(charSequence);
        if (this.G0) {
            return;
        }
        T();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.r == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.s = appCompatTextView;
            appCompatTextView.setId(mv.textinput_placeholder);
            ac.s0(this.s, 1);
            setPlaceholderTextAppearance(this.u);
            setPlaceholderTextColor(this.t);
            g();
        } else {
            Z();
            this.s = null;
        }
        this.r = z;
    }

    public final boolean A() {
        return this.B && !TextUtils.isEmpty(this.C) && (this.E instanceof yz);
    }

    public final void A0() {
        if (this.f == null) {
            return;
        }
        ac.E0(this.y, Q() ? 0 : ac.I(this.f), this.f.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(kv.material_input_text_to_prefix_suffix_padding), this.f.getCompoundPaddingBottom());
    }

    public final void B() {
        Iterator<f> it = this.f0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public final void B0() {
        this.y.setVisibility((this.x == null || N()) ? 8 : 0);
        r0();
    }

    public final void C(int i) {
        Iterator<g> it = this.j0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i);
        }
    }

    public final void C0(boolean z, boolean z2) {
        int defaultColor = this.A0.getDefaultColor();
        int colorForState = this.A0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.A0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.O = colorForState2;
        } else if (z2) {
            this.O = colorForState;
        } else {
            this.O = defaultColor;
        }
    }

    public final void D(Canvas canvas) {
        hz hzVar = this.F;
        if (hzVar != null) {
            Rect bounds = hzVar.getBounds();
            bounds.top = bounds.bottom - this.L;
            this.F.draw(canvas);
        }
    }

    public final void D0() {
        if (this.f == null) {
            return;
        }
        ac.E0(this.A, getContext().getResources().getDimensionPixelSize(kv.material_input_text_to_prefix_suffix_padding), this.f.getPaddingTop(), (K() || L()) ? 0 : ac.H(this.f), this.f.getPaddingBottom());
    }

    public final void E(Canvas canvas) {
        if (this.B) {
            this.H0.m(canvas);
        }
    }

    public final void E0() {
        int visibility = this.A.getVisibility();
        boolean z = (this.z == null || N()) ? false : true;
        this.A.setVisibility(z ? 0 : 8);
        if (visibility != this.A.getVisibility()) {
            getEndIconDelegate().c(z);
        }
        r0();
    }

    public final void F(boolean z) {
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.K0.cancel();
        }
        if (z && this.J0) {
            i(0.0f);
        } else {
            this.H0.a0(0.0f);
        }
        if (A() && ((yz) this.E).k0()) {
            y();
        }
        this.G0 = true;
        J();
        B0();
        E0();
    }

    public void F0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.E == null || this.J == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.f) != null && editText.isHovered());
        if (!isEnabled()) {
            this.O = this.F0;
        } else if (this.j.k()) {
            if (this.A0 != null) {
                C0(z2, z3);
            } else {
                this.O = this.j.o();
            }
        } else if (!this.m || (textView = this.n) == null) {
            if (z2) {
                this.O = this.z0;
            } else if (z3) {
                this.O = this.y0;
            } else {
                this.O = this.x0;
            }
        } else if (this.A0 != null) {
            C0(z2, z3);
        } else {
            this.O = textView.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && this.j.x() && this.j.k()) {
            z = true;
        }
        setErrorIconVisible(z);
        W();
        Y();
        V();
        if (getEndIconDelegate().d()) {
            j0(this.j.k());
        }
        if (z2 && isEnabled()) {
            this.L = this.N;
        } else {
            this.L = this.M;
        }
        if (this.J == 2) {
            q0();
        }
        if (this.J == 1) {
            if (!isEnabled()) {
                this.P = this.C0;
            } else if (z3 && !z2) {
                this.P = this.E0;
            } else if (z2) {
                this.P = this.D0;
            } else {
                this.P = this.B0;
            }
        }
        j();
    }

    public final int G(int i, boolean z) {
        int compoundPaddingLeft = i + this.f.getCompoundPaddingLeft();
        return (this.x == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.y.getMeasuredWidth()) + this.y.getPaddingLeft();
    }

    public final int H(int i, boolean z) {
        int compoundPaddingRight = i - this.f.getCompoundPaddingRight();
        return (this.x == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.y.getMeasuredWidth() - this.y.getPaddingRight());
    }

    public final boolean I() {
        return this.g0 != 0;
    }

    public final void J() {
        TextView textView = this.s;
        if (textView == null || !this.r) {
            return;
        }
        textView.setText((CharSequence) null);
        this.s.setVisibility(4);
    }

    public boolean K() {
        return this.e.getVisibility() == 0 && this.i0.getVisibility() == 0;
    }

    public final boolean L() {
        return this.t0.getVisibility() == 0;
    }

    public boolean M() {
        return this.j.y();
    }

    public final boolean N() {
        return this.G0;
    }

    public boolean O() {
        return this.D;
    }

    public final boolean P() {
        return this.J == 1 && (Build.VERSION.SDK_INT < 16 || this.f.getMinLines() <= 1);
    }

    public boolean Q() {
        return this.U.getVisibility() == 0;
    }

    public final int[] R(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    public final void S() {
        p();
        a0();
        F0();
        k0();
        h();
        if (this.J != 0) {
            u0();
        }
    }

    public final void T() {
        if (A()) {
            RectF rectF = this.S;
            this.H0.p(rectF, this.f.getWidth(), this.f.getGravity());
            l(rectF);
            int i = this.L;
            this.I = i;
            rectF.top = 0.0f;
            rectF.bottom = i;
            rectF.offset(-getPaddingLeft(), 0.0f);
            ((yz) this.E).q0(rectF);
        }
    }

    public void V() {
        X(this.i0, this.k0);
    }

    public void W() {
        X(this.t0, this.u0);
    }

    public final void X(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(R(checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = o9.r(drawable).mutate();
        o9.o(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public void Y() {
        X(this.U, this.V);
    }

    public final void Z() {
        TextView textView = this.s;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void a0() {
        if (h0()) {
            ac.u0(this.f, this.E);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.b.addView(view, layoutParams2);
            this.b.setLayoutParams(layoutParams);
            u0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(IMediaSession.Stub.TRANSACTION_sendCustomAction)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.g != null) {
            boolean z = this.D;
            this.D = false;
            CharSequence hint = editText.getHint();
            this.f.setHint(this.g);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f.setHint(hint);
                this.D = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.b.getChildCount());
        for (int i2 = 0; i2 < this.b.getChildCount(); i2++) {
            View childAt = this.b.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.M0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.M0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.L0) {
            return;
        }
        boolean z = true;
        this.L0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        xx xxVar = this.H0;
        boolean d0 = xxVar != null ? xxVar.d0(drawableState) | false : false;
        if (this.f != null) {
            if (!ac.V(this) || !isEnabled()) {
                z = false;
            }
            v0(z);
        }
        s0();
        F0();
        if (d0) {
            invalidate();
        }
        this.L0 = false;
    }

    public void e(f fVar) {
        this.f0.add(fVar);
        if (this.f != null) {
            fVar.a(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e0(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            defpackage.ad.q(r3, r4)     // Catch: java.lang.Exception -> L1a
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1a
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1a
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1a
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1a
        L18:
            r4 = 0
            r0 = r4
        L1a:
            if (r0 == 0) goto L2e
            int r4 = defpackage.rv.TextAppearance_AppCompat_Caption
            defpackage.ad.q(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = defpackage.jv.design_error
            int r4 = defpackage.t8.d(r4, r0)
            r3.setTextColor(r4)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e0(android.widget.TextView, int):void");
    }

    public void f(g gVar) {
        this.j0.add(gVar);
    }

    public final boolean f0() {
        return (this.t0.getVisibility() == 0 || ((I() && K()) || this.z != null)) && this.d.getMeasuredWidth() > 0;
    }

    public final void g() {
        TextView textView = this.s;
        if (textView != null) {
            this.b.addView(textView);
            this.s.setVisibility(0);
        }
    }

    public final boolean g0() {
        return !(getStartIconDrawable() == null && this.x == null) && this.c.getMeasuredWidth() > 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + v();
        }
        return super.getBaseline();
    }

    public hz getBoxBackground() {
        int i = this.J;
        if (i != 1 && i != 2) {
            throw new IllegalStateException();
        }
        return this.E;
    }

    public int getBoxBackgroundColor() {
        return this.P;
    }

    public int getBoxBackgroundMode() {
        return this.J;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.E.s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.E.t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.E.G();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.E.F();
    }

    public int getBoxStrokeColor() {
        return this.z0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.A0;
    }

    public int getBoxStrokeWidth() {
        return this.M;
    }

    public int getBoxStrokeWidthFocused() {
        return this.N;
    }

    public int getCounterMaxLength() {
        return this.l;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.k && this.m && (textView = this.n) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.v;
    }

    public ColorStateList getCounterTextColor() {
        return this.v;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.v0;
    }

    public EditText getEditText() {
        return this.f;
    }

    public CharSequence getEndIconContentDescription() {
        return this.i0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.i0.getDrawable();
    }

    public int getEndIconMode() {
        return this.g0;
    }

    public CheckableImageButton getEndIconView() {
        return this.i0;
    }

    public CharSequence getError() {
        if (this.j.x()) {
            return this.j.n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.j.m();
    }

    public int getErrorCurrentTextColors() {
        return this.j.o();
    }

    public Drawable getErrorIconDrawable() {
        return this.t0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.j.o();
    }

    public CharSequence getHelperText() {
        if (this.j.y()) {
            return this.j.q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.j.r();
    }

    public CharSequence getHint() {
        if (this.B) {
            return this.C;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.H0.r();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.H0.u();
    }

    public ColorStateList getHintTextColor() {
        return this.w0;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.i0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.i0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.r) {
            return this.q;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.u;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.t;
    }

    public CharSequence getPrefixText() {
        return this.x;
    }

    public ColorStateList getPrefixTextColor() {
        return this.y.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.y;
    }

    public CharSequence getStartIconContentDescription() {
        return this.U.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.U.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.z;
    }

    public ColorStateList getSuffixTextColor() {
        return this.A.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.A;
    }

    public Typeface getTypeface() {
        return this.T;
    }

    public final void h() {
        if (this.f == null || this.J != 1) {
            return;
        }
        if (ty.h(getContext())) {
            EditText editText = this.f;
            ac.E0(editText, ac.I(editText), getResources().getDimensionPixelSize(kv.material_filled_edittext_font_2_0_padding_top), ac.H(this.f), getResources().getDimensionPixelSize(kv.material_filled_edittext_font_2_0_padding_bottom));
        } else if (ty.g(getContext())) {
            EditText editText2 = this.f;
            ac.E0(editText2, ac.I(editText2), getResources().getDimensionPixelSize(kv.material_filled_edittext_font_1_3_padding_top), ac.H(this.f), getResources().getDimensionPixelSize(kv.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    public final boolean h0() {
        EditText editText = this.f;
        return (editText == null || this.E == null || editText.getBackground() != null || this.J == 0) ? false : true;
    }

    public void i(float f2) {
        if (this.H0.y() == f2) {
            return;
        }
        if (this.K0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.K0 = valueAnimator;
            valueAnimator.setInterpolator(tv.b);
            this.K0.setDuration(167L);
            this.K0.addUpdateListener(new d());
        }
        this.K0.setFloatValues(this.H0.y(), f2);
        this.K0.start();
    }

    public final void i0() {
        TextView textView = this.s;
        if (textView == null || !this.r) {
            return;
        }
        textView.setText(this.q);
        this.s.setVisibility(0);
        this.s.bringToFront();
    }

    public final void j() {
        hz hzVar = this.E;
        if (hzVar == null) {
            return;
        }
        hzVar.setShapeAppearanceModel(this.G);
        if (w()) {
            this.E.d0(this.L, this.O);
        }
        int q = q();
        this.P = q;
        this.E.X(ColorStateList.valueOf(q));
        if (this.g0 == 3) {
            this.f.getBackground().invalidateSelf();
        }
        k();
        invalidate();
    }

    public final void j0(boolean z) {
        if (z && getEndIconDrawable() != null) {
            Drawable mutate = o9.r(getEndIconDrawable()).mutate();
            o9.n(mutate, this.j.o());
            this.i0.setImageDrawable(mutate);
            return;
        }
        m();
    }

    public final void k() {
        if (this.F == null) {
            return;
        }
        if (x()) {
            this.F.X(ColorStateList.valueOf(this.O));
        }
        invalidate();
    }

    public final void k0() {
        if (this.J == 1) {
            if (ty.h(getContext())) {
                this.K = getResources().getDimensionPixelSize(kv.material_font_2_0_box_collapsed_padding_top);
            } else if (ty.g(getContext())) {
                this.K = getResources().getDimensionPixelSize(kv.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    public final void l(RectF rectF) {
        float f2 = rectF.left;
        int i = this.H;
        rectF.left = f2 - i;
        rectF.right += i;
    }

    public final void l0(Rect rect) {
        hz hzVar = this.F;
        if (hzVar != null) {
            int i = rect.bottom;
            hzVar.setBounds(rect.left, i - this.N, rect.right, i);
        }
    }

    public final void m() {
        n(this.i0, this.l0, this.k0, this.n0, this.m0);
    }

    public final void m0() {
        if (this.n != null) {
            EditText editText = this.f;
            n0(editText == null ? 0 : editText.getText().length());
        }
    }

    public final void n(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = o9.r(drawable).mutate();
            if (z) {
                o9.o(drawable, colorStateList);
            }
            if (z2) {
                o9.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void n0(int i) {
        boolean z = this.m;
        int i2 = this.l;
        if (i2 == -1) {
            this.n.setText(String.valueOf(i));
            this.n.setContentDescription(null);
            this.m = false;
        } else {
            this.m = i > i2;
            o0(getContext(), this.n, i, this.l, this.m);
            if (z != this.m) {
                p0();
            }
            this.n.setText(qa.c().j(getContext().getString(qv.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.l))));
        }
        if (this.f == null || z == this.m) {
            return;
        }
        v0(false);
        F0();
        s0();
    }

    public final void o() {
        n(this.U, this.W, this.V, this.b0, this.a0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f;
        if (editText != null) {
            Rect rect = this.Q;
            zx.a(this, editText, rect);
            l0(rect);
            if (this.B) {
                this.H0.Y(this.f.getTextSize());
                int gravity = this.f.getGravity();
                this.H0.Q((gravity & (-113)) | 48);
                this.H0.X(gravity);
                this.H0.M(r(rect));
                this.H0.U(u(rect));
                this.H0.I();
                if (!A() || this.G0) {
                    return;
                }
                T();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean t0 = t0();
        boolean r0 = r0();
        if (t0 || r0) {
            this.f.post(new c());
        }
        x0();
        A0();
        D0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setError(savedState.d);
        if (savedState.e) {
            this.i0.post(new b());
        }
        setHint(savedState.f);
        setHelperText(savedState.g);
        setPlaceholderText(savedState.h);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.j.k()) {
            savedState.d = getError();
        }
        savedState.e = I() && this.i0.isChecked();
        savedState.f = getHint();
        savedState.g = getHelperText();
        savedState.h = getPlaceholderText();
        return savedState;
    }

    public final void p() {
        int i = this.J;
        if (i == 0) {
            this.E = null;
            this.F = null;
        } else if (i == 1) {
            this.E = new hz(this.G);
            this.F = new hz();
        } else if (i == 2) {
            if (this.B && !(this.E instanceof yz)) {
                this.E = new yz(this.G);
            } else {
                this.E = new hz(this.G);
            }
            this.F = null;
        } else {
            throw new IllegalArgumentException(this.J + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    public final void p0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.n;
        if (textView != null) {
            e0(textView, this.m ? this.o : this.p);
            if (!this.m && (colorStateList2 = this.v) != null) {
                this.n.setTextColor(colorStateList2);
            }
            if (!this.m || (colorStateList = this.w) == null) {
                return;
            }
            this.n.setTextColor(colorStateList);
        }
    }

    public final int q() {
        return this.J == 1 ? ww.e(ww.d(this, iv.colorSurface, 0), this.P) : this.P;
    }

    public final void q0() {
        if (!A() || this.G0 || this.I == this.L) {
            return;
        }
        y();
        T();
    }

    public final Rect r(Rect rect) {
        if (this.f != null) {
            Rect rect2 = this.R;
            boolean z = ac.C(this) == 1;
            rect2.bottom = rect.bottom;
            int i = this.J;
            if (i == 1) {
                rect2.left = G(rect.left, z);
                rect2.top = rect.top + this.K;
                rect2.right = H(rect.right, z);
                return rect2;
            } else if (i != 2) {
                rect2.left = G(rect.left, z);
                rect2.top = getPaddingTop();
                rect2.right = H(rect.right, z);
                return rect2;
            } else {
                rect2.left = rect.left + this.f.getPaddingLeft();
                rect2.top = rect.top - v();
                rect2.right = rect.right - this.f.getPaddingRight();
                return rect2;
            }
        }
        throw new IllegalStateException();
    }

    public final boolean r0() {
        boolean z;
        if (this.f == null) {
            return false;
        }
        boolean z2 = true;
        if (g0()) {
            int measuredWidth = this.c.getMeasuredWidth() - this.f.getPaddingLeft();
            if (this.c0 == null || this.d0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.c0 = colorDrawable;
                this.d0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a2 = ad.a(this.f);
            Drawable drawable = a2[0];
            Drawable drawable2 = this.c0;
            if (drawable != drawable2) {
                ad.l(this.f, drawable2, a2[1], a2[2], a2[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.c0 != null) {
                Drawable[] a3 = ad.a(this.f);
                ad.l(this.f, null, a3[1], a3[2], a3[3]);
                this.c0 = null;
                z = true;
            }
            z = false;
        }
        if (f0()) {
            int measuredWidth2 = this.A.getMeasuredWidth() - this.f.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + lb.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] a4 = ad.a(this.f);
            Drawable drawable3 = this.o0;
            if (drawable3 != null && this.p0 != measuredWidth2) {
                this.p0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                ad.l(this.f, a4[0], a4[1], this.o0, a4[3]);
            } else {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.o0 = colorDrawable2;
                    this.p0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = a4[2];
                Drawable drawable5 = this.o0;
                if (drawable4 != drawable5) {
                    this.q0 = a4[2];
                    ad.l(this.f, a4[0], a4[1], drawable5, a4[3]);
                } else {
                    z2 = z;
                }
            }
        } else if (this.o0 == null) {
            return z;
        } else {
            Drawable[] a5 = ad.a(this.f);
            if (a5[2] == this.o0) {
                ad.l(this.f, a5[0], a5[1], this.q0, a5[3]);
            } else {
                z2 = z;
            }
            this.o0 = null;
        }
        return z2;
    }

    public final int s(Rect rect, Rect rect2, float f2) {
        if (P()) {
            return (int) (rect2.top + f2);
        }
        return rect.bottom - this.f.getCompoundPaddingBottom();
    }

    public void s0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f;
        if (editText == null || this.J != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (v2.a(background)) {
            background = background.mutate();
        }
        if (this.j.k()) {
            background.setColorFilter(c2.e(this.j.o(), PorterDuff.Mode.SRC_IN));
        } else if (this.m && (textView = this.n) != null) {
            background.setColorFilter(c2.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            o9.c(background);
            this.f.refreshDrawableState();
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.P != i) {
            this.P = i;
            this.B0 = i;
            this.D0 = i;
            this.E0 = i;
            j();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(t8.d(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.B0 = defaultColor;
        this.P = defaultColor;
        this.C0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.D0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.E0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        j();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.J) {
            return;
        }
        this.J = i;
        if (this.f != null) {
            S();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.z0 != i) {
            this.z0 = i;
            F0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.x0 = colorStateList.getDefaultColor();
            this.F0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.y0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.z0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.z0 != colorStateList.getDefaultColor()) {
            this.z0 = colorStateList.getDefaultColor();
        }
        F0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            F0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.M = i;
        F0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.N = i;
        F0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.k != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.n = appCompatTextView;
                appCompatTextView.setId(mv.textinput_counter);
                Typeface typeface = this.T;
                if (typeface != null) {
                    this.n.setTypeface(typeface);
                }
                this.n.setMaxLines(1);
                this.j.d(this.n, 2);
                lb.e((ViewGroup.MarginLayoutParams) this.n.getLayoutParams(), getResources().getDimensionPixelOffset(kv.mtrl_textinput_counter_margin_start));
                p0();
                m0();
            } else {
                this.j.z(this.n, 2);
                this.n = null;
            }
            this.k = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.l != i) {
            if (i > 0) {
                this.l = i;
            } else {
                this.l = -1;
            }
            if (this.k) {
                m0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.o != i) {
            this.o = i;
            p0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            p0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.p != i) {
            this.p = i;
            p0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.v != colorStateList) {
            this.v = colorStateList;
            p0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.v0 = colorStateList;
        this.w0 = colorStateList;
        if (this.f != null) {
            v0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        U(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.i0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.i0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? k0.d(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.g0;
        this.g0 = i;
        C(i2);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().b(this.J)) {
            getEndIconDelegate().a();
            m();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.J + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.i0, onClickListener, this.r0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.r0 = onLongClickListener;
        d0(this.i0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.k0 != colorStateList) {
            this.k0 = colorStateList;
            this.l0 = true;
            m();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.m0 != mode) {
            this.m0 = mode;
            this.n0 = true;
            m();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (K() != z) {
            this.i0.setVisibility(z ? 0 : 8);
            D0();
            r0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.j.x()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.j.M(charSequence);
        } else {
            this.j.t();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.j.B(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.j.C(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? k0.d(getContext(), i) : null);
        W();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.t0, onClickListener, this.s0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.s0 = onLongClickListener;
        d0(this.t0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.u0 = colorStateList;
        Drawable drawable = this.t0.getDrawable();
        if (drawable != null) {
            drawable = o9.r(drawable).mutate();
            o9.o(drawable, colorStateList);
        }
        if (this.t0.getDrawable() != drawable) {
            this.t0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.t0.getDrawable();
        if (drawable != null) {
            drawable = o9.r(drawable).mutate();
            o9.p(drawable, mode);
        }
        if (this.t0.getDrawable() != drawable) {
            this.t0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.j.D(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.j.E(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.I0 != z) {
            this.I0 = z;
            v0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (M()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!M()) {
            setHelperTextEnabled(true);
        }
        this.j.N(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.j.H(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.j.G(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.j.F(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.B) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(Barcode.PDF417);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.J0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.B) {
            this.B = z;
            if (!z) {
                this.D = false;
                if (!TextUtils.isEmpty(this.C) && TextUtils.isEmpty(this.f.getHint())) {
                    this.f.setHint(this.C);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.C)) {
                        setHint(hint);
                    }
                    this.f.setHint((CharSequence) null);
                }
                this.D = true;
            }
            if (this.f != null) {
                u0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.H0.N(i);
        this.w0 = this.H0.q();
        if (this.f != null) {
            v0(false);
            u0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.w0 != colorStateList) {
            if (this.v0 == null) {
                this.H0.P(colorStateList);
            }
            this.w0 = colorStateList;
            if (this.f != null) {
                v0(false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.i = i;
        EditText editText = this.f;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidth(int i) {
        this.h = i;
        EditText editText = this.f;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? k0.d(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.g0 != 1) {
            setEndIconMode(1);
        } else if (z) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.k0 = colorStateList;
        this.l0 = true;
        m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.m0 = mode;
        this.n0 = true;
        m();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.r && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.r) {
                setPlaceholderTextEnabled(true);
            }
            this.q = charSequence;
        }
        y0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.u = i;
        TextView textView = this.s;
        if (textView != null) {
            ad.q(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.t != colorStateList) {
            this.t = colorStateList;
            TextView textView = this.s;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.x = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.y.setText(charSequence);
        B0();
    }

    public void setPrefixTextAppearance(int i) {
        ad.q(this.y, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.y.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.U.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? k0.d(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.U, onClickListener, this.e0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.e0 = onLongClickListener;
        d0(this.U, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            this.W = true;
            o();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.a0 != mode) {
            this.a0 = mode;
            this.b0 = true;
            o();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (Q() != z) {
            this.U.setVisibility(z ? 0 : 8);
            A0();
            r0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.z = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.A.setText(charSequence);
        E0();
    }

    public void setSuffixTextAppearance(int i) {
        ad.q(this.A, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.A.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f;
        if (editText != null) {
            ac.q0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.T) {
            this.T = typeface;
            this.H0.g0(typeface);
            this.j.J(typeface);
            TextView textView = this.n;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final int t(Rect rect, float f2) {
        if (P()) {
            return (int) (rect.centerY() - (f2 / 2.0f));
        }
        return rect.top + this.f.getCompoundPaddingTop();
    }

    public final boolean t0() {
        int max;
        if (this.f != null && this.f.getMeasuredHeight() < (max = Math.max(this.d.getMeasuredHeight(), this.c.getMeasuredHeight()))) {
            this.f.setMinimumHeight(max);
            return true;
        }
        return false;
    }

    public final Rect u(Rect rect) {
        if (this.f != null) {
            Rect rect2 = this.R;
            float x = this.H0.x();
            rect2.left = rect.left + this.f.getCompoundPaddingLeft();
            rect2.top = t(rect, x);
            rect2.right = rect.right - this.f.getCompoundPaddingRight();
            rect2.bottom = s(rect, rect2, x);
            return rect2;
        }
        throw new IllegalStateException();
    }

    public final void u0() {
        if (this.J != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int v = v();
            if (v != layoutParams.topMargin) {
                layoutParams.topMargin = v;
                this.b.requestLayout();
            }
        }
    }

    public final int v() {
        float r;
        if (this.B) {
            int i = this.J;
            if (i == 0 || i == 1) {
                r = this.H0.r();
            } else if (i != 2) {
                return 0;
            } else {
                r = this.H0.r() / 2.0f;
            }
            return (int) r;
        }
        return 0;
    }

    public void v0(boolean z) {
        w0(z, false);
    }

    public final boolean w() {
        return this.J == 2 && x();
    }

    public final void w0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean k = this.j.k();
        ColorStateList colorStateList2 = this.v0;
        if (colorStateList2 != null) {
            this.H0.P(colorStateList2);
            this.H0.W(this.v0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.v0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.F0) : this.F0;
            this.H0.P(ColorStateList.valueOf(colorForState));
            this.H0.W(ColorStateList.valueOf(colorForState));
        } else if (k) {
            this.H0.P(this.j.p());
        } else if (this.m && (textView = this.n) != null) {
            this.H0.P(textView.getTextColors());
        } else if (z4 && (colorStateList = this.w0) != null) {
            this.H0.P(colorStateList);
        }
        if (!z3 && this.I0 && (!isEnabled() || !z4)) {
            if (z2 || !this.G0) {
                F(z);
            }
        } else if (z2 || this.G0) {
            z(z);
        }
    }

    public final boolean x() {
        return this.L > -1 && this.O != 0;
    }

    public final void x0() {
        EditText editText;
        if (this.s == null || (editText = this.f) == null) {
            return;
        }
        this.s.setGravity(editText.getGravity());
        this.s.setPadding(this.f.getCompoundPaddingLeft(), this.f.getCompoundPaddingTop(), this.f.getCompoundPaddingRight(), this.f.getCompoundPaddingBottom());
    }

    public final void y() {
        if (A()) {
            ((yz) this.E).n0();
        }
    }

    public final void y0() {
        EditText editText = this.f;
        z0(editText == null ? 0 : editText.getText().length());
    }

    public final void z(boolean z) {
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.K0.cancel();
        }
        if (z && this.J0) {
            i(1.0f);
        } else {
            this.H0.a0(1.0f);
        }
        this.G0 = false;
        if (A()) {
            T();
        }
        y0();
        B0();
        E0();
    }

    public final void z0(int i) {
        if (i == 0 && !this.G0) {
            i0();
        } else {
            J();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v158 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(android.content.Context r24, android.util.AttributeSet r25, int r26) {
        /*
            Method dump skipped, instructions count: 1578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.i0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.i0.setImageDrawable(drawable);
        V();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.U.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.U.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            Y();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.t0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.j.x());
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.i0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.i0.setImageDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
