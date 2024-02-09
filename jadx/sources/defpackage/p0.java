package defpackage;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import defpackage.m0;

/* compiled from: AxisPay */
@SuppressLint({"RestrictedAPI"})
/* renamed from: p0  reason: default package */
/* loaded from: classes.dex */
public class p0 extends m0 {
    public a n;
    public boolean o;

    /* compiled from: AxisPay */
    /* renamed from: p0$a */
    /* loaded from: classes.dex */
    public static class a extends m0.d {
        public int[][] J;

        public a(a aVar, p0 p0Var, Resources resources) {
            super(aVar, p0Var, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[f()];
            }
        }

        public int A(int[] iArr) {
            int[][] iArr2 = this.J;
            int h = h();
            for (int i = 0; i < h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new p0(this, null);
        }

        @Override // defpackage.m0.d
        public void o(int i, int i2) {
            super.o(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.J, 0, iArr, 0, i);
            this.J = iArr;
        }

        @Override // defpackage.m0.d
        public void r() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.J = iArr2;
        }

        public int z(int[] iArr, Drawable drawable) {
            int a = a(drawable);
            this.J[a] = iArr;
            return a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new p0(this, resources);
        }
    }

    public p0(a aVar, Resources resources) {
        h(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // defpackage.m0, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // defpackage.m0
    public void h(m0.d dVar) {
        super.h(dVar);
        if (dVar instanceof a) {
            this.n = (a) dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // defpackage.m0
    /* renamed from: j */
    public a b() {
        return new a(this.n, this, null);
    }

    public int[] k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override // defpackage.m0, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.o) {
            super.mutate();
            if (this == this) {
                this.n.r();
                this.o = true;
            }
        }
        return this;
    }

    @Override // defpackage.m0, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.n.A(iArr);
        if (A < 0) {
            A = this.n.A(StateSet.WILD_CARD);
        }
        return g(A) || onStateChange;
    }

    public p0(a aVar) {
        if (aVar != null) {
            h(aVar);
        }
    }
}
