package org.npci.upi.security.pinactivitycomponent.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import com.google.android.gms.vision.barcode.Barcode;
import myunmn.C0059ao;
import org.npci.upi.security.pinactivitycomponent.R;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class FormItemEditText extends EditText {
    public ColorStateList A;
    public int[][] B;
    public int[] C;
    public ColorStateList D;
    public String b;
    public StringBuilder c;
    public String d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public RectF[] k;
    public float[] l;
    public Paint m;
    public Paint n;
    public Paint o;
    public Drawable p;
    public Rect q;
    public boolean r;
    public View.OnClickListener s;
    public a t;
    public boolean u;
    public float v;
    public float w;
    public Paint x;
    public boolean y;
    public boolean z;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public interface a {
        void a(CharSequence charSequence);
    }

    public FormItemEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 24.0f;
        this.h = 4.0f;
        this.i = 8.0f;
        this.j = 4;
        this.q = new Rect();
        this.r = false;
        this.t = null;
        this.v = 1.0f;
        this.w = 2.0f;
        this.y = false;
        this.z = false;
        this.B = new int[][]{new int[]{16842913}, new int[]{16842914}, new int[]{16842908}, new int[]{-16842908}};
        this.C = new int[]{-16711936, -65536, -16777216, -7829368};
        this.D = new ColorStateList(this.B, this.C);
        d(context, attributeSet);
    }

    private CharSequence getFullText() {
        return this.b == null ? getText() : getMaskChars();
    }

    private StringBuilder getMaskChars() {
        if (this.c == null) {
            this.c = new StringBuilder();
        }
        int length = getText().length();
        while (this.c.length() != length) {
            if (this.c.length() < length) {
                this.c.append(this.b);
            } else {
                StringBuilder sb = this.c;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return this.c;
    }

    public int a(float f) {
        return (int) (f * (getResources().getDisplayMetrics().densityDpi / 160));
    }

    public final int b(int... iArr) {
        return this.D.getColorForState(iArr, -7829368);
    }

    public final void d(Context context, AttributeSet attributeSet) {
        this.v = a(this.v);
        this.w = a(this.w);
        this.f = a(this.f);
        this.i = a(this.i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FormItemEditText, 0, 0);
        try {
            TypedValue typedValue = new TypedValue();
            obtainStyledAttributes.getValue(R.styleable.FormItemEditText_pinAnimationType, typedValue);
            this.e = typedValue.data;
            this.b = obtainStyledAttributes.getString(R.styleable.FormItemEditText_pinCharacterMask);
            this.d = obtainStyledAttributes.getString(R.styleable.FormItemEditText_pinRepeatedHint);
            this.v = obtainStyledAttributes.getDimension(R.styleable.FormItemEditText_pinLineStroke, this.v);
            this.w = obtainStyledAttributes.getDimension(R.styleable.FormItemEditText_pinLineStrokeSelected, this.w);
            this.u = obtainStyledAttributes.getBoolean(R.styleable.FormItemEditText_pinLineStrokeCentered, false);
            this.g = obtainStyledAttributes.getDimension(R.styleable.FormItemEditText_pinCharacterSize, 0.0f);
            this.f = obtainStyledAttributes.getDimension(R.styleable.FormItemEditText_pinCharacterSpacing, this.f);
            this.i = obtainStyledAttributes.getDimension(R.styleable.FormItemEditText_pinTextBottomPadding, this.i);
            this.r = obtainStyledAttributes.getBoolean(R.styleable.FormItemEditText_pinBackgroundIsSquare, this.r);
            this.p = obtainStyledAttributes.getDrawable(R.styleable.FormItemEditText_pinBackgroundDrawable);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.FormItemEditText_pinLineColors);
            if (colorStateList != null) {
                this.D = colorStateList;
            }
            obtainStyledAttributes.recycle();
            this.m = new Paint(getPaint());
            this.n = new Paint(getPaint());
            this.o = new Paint(getPaint());
            Paint paint = new Paint(getPaint());
            this.x = paint;
            paint.setStrokeWidth(this.v);
            setFontSize(this.g);
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorControlActivated, typedValue2, true);
            int i = typedValue2.data;
            int[] iArr = this.C;
            iArr[0] = i;
            iArr[1] = -7829368;
            iArr[2] = -7829368;
            setBackgroundResource(0);
            int attributeIntValue = attributeSet.getAttributeIntValue(C0059ao.a(4817), C0059ao.a(4818), 4);
            this.j = attributeIntValue;
            this.h = attributeIntValue;
            super.setOnClickListener(new View.OnClickListener() { // from class: org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    FormItemEditText formItemEditText = FormItemEditText.this;
                    formItemEditText.setSelection(formItemEditText.getText().length());
                    if (FormItemEditText.this.s != null) {
                        FormItemEditText.this.s.onClick(view);
                    }
                }
            });
            super.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText.2
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    FormItemEditText formItemEditText = FormItemEditText.this;
                    formItemEditText.setSelection(formItemEditText.getText().length());
                    return true;
                }
            });
            int inputType = getInputType() & Barcode.ITF;
            String a2 = C0059ao.a(4819);
            if ((inputType == 128 && TextUtils.isEmpty(this.b)) || ((getInputType() & 16) == 16 && TextUtils.isEmpty(this.b))) {
                this.b = a2;
            }
            if (!TextUtils.isEmpty(this.b)) {
                this.c = getMaskChars();
            }
            getPaint().getTextBounds(C0059ao.a(4820), 0, 1, this.q);
            this.y = this.e > -1;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @TargetApi(11)
    public final void e(CharSequence charSequence) {
        this.n.setAlpha(125);
        ValueAnimator ofInt = ValueAnimator.ofInt(125, 255);
        ofInt.setDuration(150L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FormItemEditText.this.n.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                FormItemEditText.this.invalidate();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        if (charSequence.length() == this.j && this.t != null) {
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText.4
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    FormItemEditText.this.t.a(FormItemEditText.this.getText());
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
        }
        animatorSet.playTogether(ofInt);
        animatorSet.start();
    }

    @TargetApi(11)
    public final void f(CharSequence charSequence, final int i) {
        float[] fArr = this.l;
        fArr[i] = this.k[i].bottom - this.i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[i] + getPaint().getTextSize(), this.l[i]);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new OvershootInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FormItemEditText.this.l[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FormItemEditText.this.invalidate();
            }
        });
        this.n.setAlpha(255);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FormItemEditText.this.n.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        if (charSequence.length() == this.j && this.t != null) {
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText.7
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    FormItemEditText.this.t.a(FormItemEditText.this.getText());
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
        }
        animatorSet.playTogether(ofFloat, ofInt);
        animatorSet.start();
    }

    public final void g(boolean z, boolean z2) {
        Paint paint;
        int b;
        if (this.z) {
            paint = this.x;
            b = b(16842914);
        } else {
            this.x.setStrokeWidth(isFocused() ? this.w : this.v);
            if (!z) {
                boolean isFocused = isFocused();
                this.x.setColor(z2 ? isFocused ? b(16842918) : b(-16842918) : isFocused ? b(16842908) : b(-16842908));
                return;
            }
            paint = this.x;
            b = b(16842913);
        }
        paint.setColor(b);
    }

    public final void i(boolean z, boolean z2) {
        if (this.z) {
            this.p.setState(new int[]{16842914});
        } else if (!isFocused()) {
            this.p.setState(new int[]{-16842908});
        } else {
            this.p.setState(new int[]{16842908});
            if (z2) {
                this.p.setState(new int[]{16842908, 16842913});
            } else if (z) {
                this.p.setState(new int[]{16842908, 16842912});
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        Paint paint;
        CharSequence fullText = getFullText();
        int length = fullText.length();
        float[] fArr = new float[length];
        getPaint().getTextWidths(fullText, 0, length, fArr);
        String str = this.d;
        float f3 = 0.0f;
        if (str != null) {
            int length2 = str.length();
            float[] fArr2 = new float[length2];
            getPaint().getTextWidths(this.d, fArr2);
            for (int i2 = 0; i2 < length2; i2++) {
                f3 += fArr2[i2];
            }
        }
        float f4 = f3;
        int i3 = 0;
        while (i3 < this.h) {
            if (this.p != null) {
                i(i3 < length, i3 == length);
                Drawable drawable = this.p;
                RectF[] rectFArr = this.k;
                drawable.setBounds((int) rectFArr[i3].left, (int) rectFArr[i3].top, (int) rectFArr[i3].right, (int) rectFArr[i3].bottom);
                this.p.draw(canvas);
            }
            float f5 = this.k[i3].left + (this.g / 2.0f);
            if (length > i3) {
                if (this.y && i3 == length - 1) {
                    i = i3 + 1;
                    f = f5 - (fArr[i3] / 2.0f);
                    f2 = this.l[i3];
                    paint = this.n;
                } else {
                    i = i3 + 1;
                    f = f5 - (fArr[i3] / 2.0f);
                    f2 = this.l[i3];
                    paint = this.m;
                }
                canvas.drawText(fullText, i3, i, f, f2, paint);
            } else {
                String str2 = this.d;
                if (str2 != null) {
                    canvas.drawText(str2, f5 - (f4 / 2.0f), this.l[i3], this.o);
                }
            }
            if (this.p == null) {
                g(i3 < length, i3 == length);
                RectF[] rectFArr2 = this.k;
                canvas.drawLine(rectFArr2[i3].left, rectFArr2[i3].top + 20.0f, rectFArr2[i3].right, rectFArr2[i3].bottom + 20.0f, this.x);
            }
            i3++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSizeChanged(int r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText.onSizeChanged(int, int, int, int):void");
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        setError(false);
        if (this.k == null || !this.y) {
            if (this.t == null || charSequence.length() != this.j) {
                return;
            }
            this.t.a(charSequence);
            return;
        }
        int i4 = this.e;
        if (i4 == -1) {
            invalidate();
        } else if (i3 > i2) {
            if (i4 == 0) {
                e(charSequence);
            } else {
                f(charSequence, i);
            }
        }
    }

    public void setAnimateText(boolean z) {
        this.y = z;
    }

    public void setCharSize(float f) {
        this.g = f;
        invalidate();
    }

    public void setColorStates(ColorStateList colorStateList) {
        this.D = colorStateList;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw new RuntimeException(C0059ao.a(4821));
    }

    public void setError(boolean z) {
        this.z = z;
    }

    public void setFontSize(float f) {
        this.m.setTextSize(f);
        this.n.setTextSize(f);
        this.o.setTextSize(f);
    }

    public void setLineStroke(float f) {
        this.v = f;
        invalidate();
    }

    public void setLineStrokeCentered(boolean z) {
        this.u = z;
        invalidate();
    }

    public void setLineStrokeSelected(float f) {
        this.w = f;
        invalidate();
    }

    public void setMargin(int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
        setLayoutParams(marginLayoutParams);
    }

    public void setMaxLength(int i) {
        this.j = i;
        this.h = i;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.s = onClickListener;
    }

    public void setOnPinEnteredListener(a aVar) {
        this.t = aVar;
    }

    public void setSpace(float f) {
        this.f = f;
        invalidate();
    }
}
