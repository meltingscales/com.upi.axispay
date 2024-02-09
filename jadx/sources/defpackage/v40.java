package defpackage;

import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: v40  reason: default package */
/* loaded from: classes.dex */
public final class v40 implements c30 {
    public final q40 a = new q40();

    @Override // defpackage.c30
    public n30 a(String str, w20 w20Var, int i, int i2, Map<y20, ?> map) {
        if (w20Var == w20.UPC_A) {
            return this.a.a(C0059ao.a(9012).concat(String.valueOf(str)), w20.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException(C0059ao.a(9013).concat(String.valueOf(w20Var)));
    }
}
