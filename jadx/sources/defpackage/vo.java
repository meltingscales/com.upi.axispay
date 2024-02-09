package defpackage;

import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: vo  reason: default package */
/* loaded from: classes.dex */
public final class vo {
    public final String a;

    public vo(String str) {
        Objects.requireNonNull(str, C0059ao.a(4968));
        this.a = str;
    }

    public static vo b(String str) {
        return new vo(str);
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vo) {
            return this.a.equals(((vo) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return C0059ao.a(4969) + this.a + C0059ao.a(4970);
    }
}
