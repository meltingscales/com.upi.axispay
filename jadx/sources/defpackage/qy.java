package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;

/* compiled from: AxisPay */
/* renamed from: qy  reason: default package */
/* loaded from: classes.dex */
public class qy extends k2 {
    public static final int g = rv.Widget_MaterialComponents_CompoundButton_RadioButton;
    public static final int[][] h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    public qy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iv.radioButtonStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int c = ww.c(this, iv.colorControlActivated);
            int c2 = ww.c(this, iv.colorOnSurface);
            int c3 = ww.c(this, iv.colorSurface);
            int[][] iArr = h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = ww.f(c3, c, 1.0f);
            iArr2[1] = ww.f(c3, c2, 0.54f);
            iArr2[2] = ww.f(c3, c2, 0.38f);
            iArr2[3] = ww.f(c3, c2, 0.38f);
            this.e = new ColorStateList(iArr, iArr2);
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && uc.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            uc.c(this, getMaterialThemeColorsTintList());
        } else {
            uc.c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public qy(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = defpackage.qy.g
            android.content.Context r8 = defpackage.f00.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = defpackage.sv.MaterialRadioButton
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = defpackage.ly.h(r0, r1, r2, r3, r4, r5)
            int r10 = defpackage.sv.MaterialRadioButton_buttonTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = defpackage.ty.a(r8, r9, r10)
            defpackage.uc.c(r7, r8)
        L28:
            int r8 = defpackage.sv.MaterialRadioButton_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
