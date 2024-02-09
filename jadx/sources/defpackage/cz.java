package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AxisPay */
/* renamed from: cz  reason: default package */
/* loaded from: classes.dex */
public final class cz implements dz {
    public final dz a;
    public final float b;

    public cz(float f, dz dzVar) {
        while (dzVar instanceof cz) {
            dzVar = ((cz) dzVar).a;
            f += ((cz) dzVar).b;
        }
        this.a = dzVar;
        this.b = f;
    }

    @Override // defpackage.dz
    public float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cz) {
            cz czVar = (cz) obj;
            return this.a.equals(czVar.a) && this.b == czVar.b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
