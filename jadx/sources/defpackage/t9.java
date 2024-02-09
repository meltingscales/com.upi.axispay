package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: AxisPay */
/* renamed from: t9  reason: default package */
/* loaded from: classes.dex */
public final class t9 extends Drawable.ConstantState {
    public int a;
    public Drawable.ConstantState b;
    public ColorStateList c;
    public PorterDuff.Mode d;

    public t9(t9 t9Var) {
        this.c = null;
        this.d = r9.h;
        if (t9Var != null) {
            this.a = t9Var.a;
            this.b = t9Var.b;
            this.c = t9Var.c;
            this.d = t9Var.d;
        }
    }

    public boolean a() {
        return this.b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.a;
        Drawable.ConstantState constantState = this.b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new s9(this, resources);
        }
        return new r9(this, resources);
    }
}
