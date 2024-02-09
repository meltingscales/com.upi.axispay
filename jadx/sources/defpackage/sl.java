package defpackage;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry;
import defpackage.bf;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: sl  reason: default package */
/* loaded from: classes.dex */
public final class sl {
    public final tl a;
    public final SavedStateRegistry b = new SavedStateRegistry();

    public sl(tl tlVar) {
        this.a = tlVar;
    }

    public static sl a(tl tlVar) {
        return new sl(tlVar);
    }

    public SavedStateRegistry b() {
        return this.b;
    }

    public void c(Bundle bundle) {
        bf lifecycle = this.a.getLifecycle();
        if (lifecycle.b() == bf.c.INITIALIZED) {
            lifecycle.a(new Recreator(this.a));
            this.b.b(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException(C0059ao.a(2109));
    }

    public void d(Bundle bundle) {
        this.b.c(bundle);
    }
}
