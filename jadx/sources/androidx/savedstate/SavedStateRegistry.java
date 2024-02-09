package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import defpackage.bf;
import java.util.Map;

/* compiled from: AxisPay */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {
    public Bundle b;
    public boolean c;
    public Recreator.a d;
    public a4<String, b> a = new a4<>();
    public boolean e = true;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface a {
        void a(tl tlVar);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (this.c) {
            Bundle bundle = this.b;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle(str);
                this.b.remove(str);
                if (this.b.isEmpty()) {
                    this.b = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void b(bf bfVar, Bundle bundle) {
        if (!this.c) {
            if (bundle != null) {
                this.b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            bfVar.a(new cf() { // from class: androidx.savedstate.SavedStateRegistry.1
                @Override // defpackage.cf
                public void d(ef efVar, bf.b bVar) {
                    if (bVar == bf.b.ON_START) {
                        SavedStateRegistry.this.e = true;
                    } else if (bVar == bf.b.ON_STOP) {
                        SavedStateRegistry.this.e = false;
                    }
                }
            });
            this.c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    public void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        a4<String, b>.d d = this.a.d();
        while (d.hasNext()) {
            Map.Entry next = d.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void d(String str, b bVar) {
        if (this.a.g(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void e(Class<? extends a> cls) {
        if (this.e) {
            if (this.d == null) {
                this.d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.d.b(cls.getName());
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
}
