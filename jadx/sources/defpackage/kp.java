package defpackage;

import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: kp  reason: default package */
/* loaded from: classes.dex */
public final class kp extends qp {
    public final List<tp> a;

    public kp(List<tp> list) {
        Objects.requireNonNull(list, C0059ao.a(11299));
        this.a = list;
    }

    @Override // defpackage.qp
    @Encodable.Field(name = "logRequest")
    public List<tp> c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qp) {
            return this.a.equals(((qp) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return C0059ao.a(11300) + this.a + C0059ao.a(11301);
    }
}
