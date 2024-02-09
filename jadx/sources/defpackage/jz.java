package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AxisPay */
/* renamed from: jz  reason: default package */
/* loaded from: classes.dex */
public final class jz implements dz {
    public final float a;

    public jz(float f) {
        this.a = f;
    }

    @Override // defpackage.dz
    public float a(RectF rectF) {
        return this.a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jz) && this.a == ((jz) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
