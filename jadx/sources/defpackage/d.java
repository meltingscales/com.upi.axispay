package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: AxisPay */
/* renamed from: d  reason: default package */
/* loaded from: classes.dex */
public final class d {
    public final Set<e> a = new CopyOnWriteArraySet();
    public volatile Context b;

    public void a(e eVar) {
        if (this.b != null) {
            eVar.a(this.b);
        }
        this.a.add(eVar);
    }

    public void b() {
        this.b = null;
    }

    public void c(Context context) {
        this.b = context;
        for (e eVar : this.a) {
            eVar.a(context);
        }
    }
}
