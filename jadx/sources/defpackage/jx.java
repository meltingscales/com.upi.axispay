package defpackage;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* compiled from: AxisPay */
/* renamed from: jx  reason: default package */
/* loaded from: classes.dex */
public abstract class jx<S> extends Fragment {
    public final LinkedHashSet<ix<S>> b = new LinkedHashSet<>();

    public boolean j(ix<S> ixVar) {
        return this.b.add(ixVar);
    }

    public void k() {
        this.b.clear();
    }
}
