package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzix {
    public final int tag;
    public final byte[] zzacg;

    public zzix(int i, byte[] bArr) {
        this.tag = i;
        this.zzacg = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzix) {
            zzix zzixVar = (zzix) obj;
            return this.tag == zzixVar.tag && Arrays.equals(this.zzacg, zzixVar.zzacg);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.tag + 527) * 31) + Arrays.hashCode(this.zzacg);
    }
}
