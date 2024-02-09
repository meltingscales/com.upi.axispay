package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: AxisPay */
/* renamed from: rf  reason: default package */
/* loaded from: classes.dex */
public class rf {
    public final HashMap<String, pf> a = new HashMap<>();

    public final void a() {
        for (pf pfVar : this.a.values()) {
            pfVar.a();
        }
        this.a.clear();
    }

    public final pf b(String str) {
        return this.a.get(str);
    }

    public Set<String> c() {
        return new HashSet(this.a.keySet());
    }

    public final void d(String str, pf pfVar) {
        pf put = this.a.put(str, pfVar);
        if (put != null) {
            put.d();
        }
    }
}
