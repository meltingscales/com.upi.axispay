package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zah extends Drawable.ConstantState {
    public int zaa;
    public int zab;

    public zah(zah zahVar) {
        if (zahVar != null) {
            this.zaa = zahVar.zaa;
            this.zab = zahVar.zab;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.zaa;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new zai(this);
    }
}
