package defpackage;

import defpackage.ws;
import java.util.Map;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ts  reason: default package */
/* loaded from: classes.dex */
public final class ts extends ws {
    public final zu a;
    public final Map<xo, ws.b> b;

    public ts(zu zuVar, Map<xo, ws.b> map) {
        Objects.requireNonNull(zuVar, C0059ao.a(3334));
        this.a = zuVar;
        Objects.requireNonNull(map, C0059ao.a(3335));
        this.b = map;
    }

    @Override // defpackage.ws
    public zu e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ws) {
            ws wsVar = (ws) obj;
            return this.a.equals(wsVar.e()) && this.b.equals(wsVar.h());
        }
        return false;
    }

    @Override // defpackage.ws
    public Map<xo, ws.b> h() {
        return this.b;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return C0059ao.a(3336) + this.a + C0059ao.a(3337) + this.b + C0059ao.a(3338);
    }
}
