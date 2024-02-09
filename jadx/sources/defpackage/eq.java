package defpackage;

import java.util.Arrays;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: eq  reason: default package */
/* loaded from: classes.dex */
public final class eq {
    public final vo a;
    public final byte[] b;

    public eq(vo voVar, byte[] bArr) {
        Objects.requireNonNull(voVar, C0059ao.a(5147));
        Objects.requireNonNull(bArr, C0059ao.a(5148));
        this.a = voVar;
        this.b = bArr;
    }

    public byte[] a() {
        return this.b;
    }

    public vo b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eq) {
            eq eqVar = (eq) obj;
            if (this.a.equals(eqVar.a)) {
                return Arrays.equals(this.b, eqVar.b);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return C0059ao.a(5149) + this.a + C0059ao.a(5150);
    }
}
