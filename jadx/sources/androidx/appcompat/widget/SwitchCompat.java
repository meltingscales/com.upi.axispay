package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final Property<SwitchCompat, Float> O = new a(Float.class, "thumbPos");
    public static final int[] P = {16842912};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public final TextPaint G;
    public ColorStateList H;
    public Layout I;
    public Layout J;
    public TransformationMethod K;
    public ObjectAnimator L;
    public final q2 M;
    public final Rect N;
    public Drawable b;
    public ColorStateList c;
    public PorterDuff.Mode d;
    public boolean e;
    public boolean f;
    public Drawable g;
    public ColorStateList h;
    public PorterDuff.Mode i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public CharSequence p;
    public CharSequence q;
    public boolean r;
    public int s;
    public int t;
    public float u;
    public float v;
    public VelocityTracker w;
    public int x;
    public float y;
    public int z;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a extends Property<SwitchCompat, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.y);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.switchStyle);
    }

    public static float f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    private boolean getTargetCheckedState() {
        return this.y > 0.5f;
    }

    private int getThumbOffset() {
        float f;
        if (u3.b(this)) {
            f = 1.0f - this.y;
        } else {
            f = this.y;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.g;
        if (drawable != null) {
            Rect rect2 = this.N;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.b;
            if (drawable2 != null) {
                rect = v2.d(drawable2);
            } else {
                rect = v2.c;
            }
            return ((((this.z - this.B) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    public final void a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, O, z ? 1.0f : 0.0f);
        this.L = ofFloat;
        ofFloat.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.L.setAutoCancel(true);
        }
        this.L.start();
    }

    public final void b() {
        Drawable drawable = this.b;
        if (drawable != null) {
            if (this.e || this.f) {
                Drawable mutate = o9.r(drawable).mutate();
                this.b = mutate;
                if (this.e) {
                    o9.o(mutate, this.c);
                }
                if (this.f) {
                    o9.p(this.b, this.d);
                }
                if (this.b.isStateful()) {
                    this.b.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.g;
        if (drawable != null) {
            if (this.j || this.k) {
                Drawable mutate = o9.r(drawable).mutate();
                this.g = mutate;
                if (this.j) {
                    o9.o(mutate, this.h);
                }
                if (this.k) {
                    o9.p(this.g, this.i);
                }
                if (this.g.isStateful()) {
                    this.g.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.L;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.N;
        int i3 = this.C;
        int i4 = this.D;
        int i5 = this.E;
        int i6 = this.F;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.b;
        if (drawable != null) {
            rect = v2.d(drawable);
        } else {
            rect = v2.c;
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.g.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.g.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.b;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.B + rect2.right;
            this.b.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                o9.l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            o9.k(drawable, f, f2);
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            o9.k(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.b;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final boolean g(float f, float f2) {
        if (this.b == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.b.getPadding(this.N);
        int i = this.D;
        int i2 = this.t;
        int i3 = i - i2;
        int i4 = (this.C + thumbOffset) - i2;
        Rect rect = this.N;
        return f > ((float) i4) && f < ((float) ((((this.B + i4) + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.F + i2));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!u3.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.n : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (u3.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.n : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.r;
    }

    public boolean getSplitTrack() {
        return this.o;
    }

    public int getSwitchMinWidth() {
        return this.m;
    }

    public int getSwitchPadding() {
        return this.n;
    }

    public CharSequence getTextOff() {
        return this.q;
    }

    public CharSequence getTextOn() {
        return this.p;
    }

    public Drawable getThumbDrawable() {
        return this.b;
    }

    public int getThumbTextPadding() {
        return this.l;
    }

    public ColorStateList getThumbTintList() {
        return this.c;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.d;
    }

    public Drawable getTrackDrawable() {
        return this.g;
    }

    public ColorStateList getTrackTintList() {
        return this.h;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.i;
    }

    public final Layout h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.K;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.G;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void i() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.q;
            if (charSequence == null) {
                charSequence = getResources().getString(s.abc_capital_off);
            }
            ac.H0(this, charSequence);
        }
    }

    public final void j() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.p;
            if (charSequence == null) {
                charSequence = getResources().getString(s.abc_capital_on);
            }
            ac.H0(this, charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.L;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.L.end();
        this.L = null;
    }

    public void k(Context context, int i) {
        o3 t = o3.t(context, i, u.TextAppearance);
        ColorStateList c = t.c(u.TextAppearance_android_textColor);
        if (c != null) {
            this.H = c;
        } else {
            this.H = getTextColors();
        }
        int f = t.f(u.TextAppearance_android_textSize, 0);
        if (f != 0) {
            float f2 = f;
            if (f2 != this.G.getTextSize()) {
                this.G.setTextSize(f2);
                requestLayout();
            }
        }
        m(t.k(u.TextAppearance_android_typeface, -1), t.k(u.TextAppearance_android_textStyle, -1));
        if (t.a(u.TextAppearance_textAllCaps, false)) {
            this.K = new s0(getContext());
        } else {
            this.K = null;
        }
        t.w();
    }

    public void l(Typeface typeface, int i) {
        Typeface create;
        if (i > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i);
            } else {
                create = Typeface.create(typeface, i);
            }
            setSwitchTypeface(create);
            int i2 = (~(create != null ? create.getStyle() : 0)) & i;
            this.G.setFakeBoldText((i2 & 1) != 0);
            this.G.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
            return;
        }
        this.G.setFakeBoldText(false);
        this.G.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public final void m(int i, int i2) {
        Typeface typeface;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i != 2) {
            typeface = i != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        l(typeface, i2);
    }

    public final void n(MotionEvent motionEvent) {
        this.s = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.w.computeCurrentVelocity(1000);
            float xVelocity = this.w.getXVelocity();
            if (Math.abs(xVelocity) > this.x) {
                if (!u3.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z = false;
                }
            } else {
                z = getTargetCheckedState();
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        e(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, P);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.N;
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.D;
        int i2 = this.F;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.b;
        if (drawable != null) {
            if (this.o && drawable2 != null) {
                Rect d = v2.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.I : this.J;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.H;
            if (colorStateList != null) {
                this.G.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.G.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.p : this.q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.b != null) {
            Rect rect = this.N;
            Drawable drawable = this.g;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = v2.d(this.b);
            i5 = Math.max(0, d.left - rect.left);
            i9 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (u3.b(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.z + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.z) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i7 = this.A;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i7 / 2);
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            i7 = this.A;
        } else {
            i8 = getHeight() - getPaddingBottom();
            paddingTop = i8 - this.A;
            this.C = i6;
            this.D = paddingTop;
            this.F = i8;
            this.E = width;
        }
        i8 = i7 + paddingTop;
        this.C = i6;
        this.D = paddingTop;
        this.F = i8;
        this.E = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.r) {
            if (this.I == null) {
                this.I = h(this.p);
            }
            if (this.J == null) {
                this.J = h(this.q);
            }
        }
        Rect rect = this.N;
        Drawable drawable = this.b;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.b.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.b.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.B = Math.max(this.r ? Math.max(this.I.getWidth(), this.J.getWidth()) + (this.l * 2) : 0, i3);
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.b;
        if (drawable3 != null) {
            Rect d = v2.d(drawable3);
            i6 = Math.max(i6, d.left);
            i7 = Math.max(i7, d.right);
        }
        int max = Math.max(this.m, (this.B * 2) + i6 + i7);
        int max2 = Math.max(i5, i4);
        this.z = max;
        this.A = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.p : this.q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 3) goto L8;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.w
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.s
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.u
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = defpackage.u3.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.y
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.y
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.u = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.u
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.t
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.v
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.t
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.s = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.u = r0
            r6.v = r3
            return r1
        L89:
            int r0 = r6.s
            if (r0 != r2) goto L94
            r6.n(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.s = r0
            android.view.VelocityTracker r0 = r6.w
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.g(r0, r2)
            if (r3 == 0) goto Lb7
            r6.s = r1
            r6.u = r0
            r6.v = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            j();
        } else {
            i();
        }
        if (getWindowToken() != null && ac.V(this)) {
            a(isChecked);
            return;
        }
        d();
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ad.s(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.r != z) {
            this.r = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.o = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.m = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.n = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.G.getTypeface() == null || this.G.getTypeface().equals(typeface)) && (this.G.getTypeface() != null || typeface == null)) {
            return;
        }
        this.G.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.q = charSequence;
        requestLayout();
        if (isChecked()) {
            return;
        }
        i();
    }

    public void setTextOn(CharSequence charSequence) {
        this.p = charSequence;
        requestLayout();
        if (isChecked()) {
            j();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.y = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(k0.d(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.l = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.c = colorStateList;
        this.e = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.d = mode;
        this.f = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(k0.d(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.h = colorStateList;
        this.j = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.i = mode;
        this.k = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b || drawable == this.g;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = false;
        this.h = null;
        this.i = null;
        this.j = false;
        this.k = false;
        this.w = VelocityTracker.obtain();
        this.N = new Rect();
        j3.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.G = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = u.SwitchCompat;
        o3 v = o3.v(context, attributeSet, iArr, i, 0);
        ac.o0(this, context, iArr, attributeSet, v.r(), i, 0);
        Drawable g = v.g(u.SwitchCompat_android_thumb);
        this.b = g;
        if (g != null) {
            g.setCallback(this);
        }
        Drawable g2 = v.g(u.SwitchCompat_track);
        this.g = g2;
        if (g2 != null) {
            g2.setCallback(this);
        }
        this.p = v.p(u.SwitchCompat_android_textOn);
        this.q = v.p(u.SwitchCompat_android_textOff);
        this.r = v.a(u.SwitchCompat_showText, true);
        this.l = v.f(u.SwitchCompat_thumbTextPadding, 0);
        this.m = v.f(u.SwitchCompat_switchMinWidth, 0);
        this.n = v.f(u.SwitchCompat_switchPadding, 0);
        this.o = v.a(u.SwitchCompat_splitTrack, false);
        ColorStateList c = v.c(u.SwitchCompat_thumbTint);
        if (c != null) {
            this.c = c;
            this.e = true;
        }
        PorterDuff.Mode e = v2.e(v.k(u.SwitchCompat_thumbTintMode, -1), null);
        if (this.d != e) {
            this.d = e;
            this.f = true;
        }
        if (this.e || this.f) {
            b();
        }
        ColorStateList c2 = v.c(u.SwitchCompat_trackTint);
        if (c2 != null) {
            this.h = c2;
            this.j = true;
        }
        PorterDuff.Mode e2 = v2.e(v.k(u.SwitchCompat_trackTintMode, -1), null);
        if (this.i != e2) {
            this.i = e2;
            this.k = true;
        }
        if (this.j || this.k) {
            c();
        }
        int n = v.n(u.SwitchCompat_switchTextAppearance, 0);
        if (n != 0) {
            k(context, n);
        }
        q2 q2Var = new q2(this);
        this.M = q2Var;
        q2Var.m(attributeSet, i);
        v.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.t = viewConfiguration.getScaledTouchSlop();
        this.x = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
