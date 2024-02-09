package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: hn  reason: default package */
/* loaded from: classes.dex */
public class hn {
    public View b;
    public final Map<String, Object> a = new HashMap();
    public final ArrayList<bn> c = new ArrayList<>();

    @Deprecated
    public hn() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof hn) {
            hn hnVar = (hn) obj;
            return this.b == hnVar.b && this.a.equals(hnVar.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(8049) + Integer.toHexString(hashCode()) + C0059ao.a(8050));
        sb.append(C0059ao.a(8051));
        sb.append(this.b);
        String a = C0059ao.a(8052);
        sb.append(a);
        String str = sb.toString() + C0059ao.a(8053);
        for (String str2 : this.a.keySet()) {
            str = str + C0059ao.a(8054) + str2 + C0059ao.a(8055) + this.a.get(str2) + a;
        }
        return str;
    }

    public hn(View view) {
        this.b = view;
    }
}
