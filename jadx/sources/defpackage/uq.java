package defpackage;

import android.content.Context;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: uq  reason: default package */
/* loaded from: classes.dex */
public final class uq extends zq {
    public final Context a;
    public final zu b;
    public final zu c;
    public final String d;

    public uq(Context context, zu zuVar, zu zuVar2, String str) {
        Objects.requireNonNull(context, C0059ao.a(4110));
        this.a = context;
        Objects.requireNonNull(zuVar, C0059ao.a(4111));
        this.b = zuVar;
        Objects.requireNonNull(zuVar2, C0059ao.a(4112));
        this.c = zuVar2;
        Objects.requireNonNull(str, C0059ao.a(4113));
        this.d = str;
    }

    @Override // defpackage.zq
    public Context b() {
        return this.a;
    }

    @Override // defpackage.zq
    public String c() {
        return this.d;
    }

    @Override // defpackage.zq
    public zu d() {
        return this.c;
    }

    @Override // defpackage.zq
    public zu e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zq) {
            zq zqVar = (zq) obj;
            return this.a.equals(zqVar.b()) && this.b.equals(zqVar.e()) && this.c.equals(zqVar.d()) && this.d.equals(zqVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        return C0059ao.a(4114) + this.a + C0059ao.a(4115) + this.b + C0059ao.a(4116) + this.c + C0059ao.a(4117) + this.d + C0059ao.a(4118);
    }
}
