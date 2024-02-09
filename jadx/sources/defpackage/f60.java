package defpackage;

import java.util.LinkedHashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: f60  reason: default package */
/* loaded from: classes.dex */
public class f60 implements d60 {
    public final int a;

    public f60(int i) {
        if (i > 0) {
            this.a = i;
            new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(11395));
    }

    public final synchronized String toString() {
        return String.format(C0059ao.a(11396), Integer.valueOf(this.a));
    }
}
