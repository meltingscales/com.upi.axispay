package defpackage;

import android.util.Base64;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ma  reason: default package */
/* loaded from: classes.dex */
public final class ma {
    public final String a;
    public final String b;
    public final String c;
    public final List<List<byte[]>> d;
    public final int e;
    public final String f;

    public ma(String str, String str2, String str3, List<List<byte[]>> list) {
        db.e(str);
        this.a = str;
        db.e(str2);
        this.b = str2;
        db.e(str3);
        this.c = str3;
        db.e(list);
        this.d = list;
        this.e = 0;
        this.f = a(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        String a = C0059ao.a(12866);
        sb.append(a);
        sb.append(str2);
        sb.append(a);
        sb.append(str3);
        return sb.toString();
    }

    public List<List<byte[]>> b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public String d() {
        return this.f;
    }

    public String e() {
        return this.a;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(12867) + this.a + C0059ao.a(12868) + this.b + C0059ao.a(12869) + this.c + C0059ao.a(12870));
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(C0059ao.a(12871));
            List<byte[]> list = this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(C0059ao.a(12872));
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append(C0059ao.a(12873));
            }
            sb.append(C0059ao.a(12874));
        }
        sb.append(C0059ao.a(12875));
        sb.append(C0059ao.a(12876) + this.e);
        return sb.toString();
    }
}
