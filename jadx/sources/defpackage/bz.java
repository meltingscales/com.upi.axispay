package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AxisPay */
/* renamed from: bz  reason: default package */
/* loaded from: classes.dex */
public final class bz implements dz {
    public final float a;

    public bz(float f) {
        this.a = f;
    }

    @Override // defpackage.dz
    public float a(RectF rectF) {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bz) && this.a == ((bz) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
