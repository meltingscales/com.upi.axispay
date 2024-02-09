package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.savedstate.SavedStateRegistry;
import defpackage.bf;

/* compiled from: AxisPay */
/* renamed from: ne  reason: default package */
/* loaded from: classes.dex */
public class ne implements tl, sf {
    public final rf b;
    public ff c = null;
    public sl d = null;

    public ne(Fragment fragment, rf rfVar) {
        this.b = rfVar;
    }

    public void a(bf.b bVar) {
        this.c.h(bVar);
    }

    public void b() {
        if (this.c == null) {
            this.c = new ff(this);
            this.d = sl.a(this);
        }
    }

    public boolean d() {
        return this.c != null;
    }

    public void e(Bundle bundle) {
        this.d.c(bundle);
    }

    public void f(Bundle bundle) {
        this.d.d(bundle);
    }

    public void g(bf.c cVar) {
        this.c.o(cVar);
    }

    @Override // defpackage.ef
    public bf getLifecycle() {
        b();
        return this.c;
    }

    @Override // defpackage.tl
    public SavedStateRegistry getSavedStateRegistry() {
        b();
        return this.d.b();
    }

    @Override // defpackage.sf
    public rf getViewModelStore() {
        b();
        return this.b;
    }
}
