package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import defpackage.bf;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements cf {
    public final String a;
    public boolean b = false;
    public final nf c;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class a implements SavedStateRegistry.a {
        @Override // androidx.savedstate.SavedStateRegistry.a
        public void a(tl tlVar) {
            if (tlVar instanceof sf) {
                rf viewModelStore = ((sf) tlVar).getViewModelStore();
                SavedStateRegistry savedStateRegistry = tlVar.getSavedStateRegistry();
                for (String str : viewModelStore.c()) {
                    SavedStateHandleController.h(viewModelStore.b(str), savedStateRegistry, tlVar.getLifecycle());
                }
                if (viewModelStore.c().isEmpty()) {
                    return;
                }
                savedStateRegistry.e(a.class);
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    public SavedStateHandleController(String str, nf nfVar) {
        this.a = str;
        this.c = nfVar;
    }

    public static void h(pf pfVar, SavedStateRegistry savedStateRegistry, bf bfVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) pfVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.l()) {
            return;
        }
        savedStateHandleController.i(savedStateRegistry, bfVar);
        m(savedStateRegistry, bfVar);
    }

    public static SavedStateHandleController j(SavedStateRegistry savedStateRegistry, bf bfVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, nf.a(savedStateRegistry.a(str), bundle));
        savedStateHandleController.i(savedStateRegistry, bfVar);
        m(savedStateRegistry, bfVar);
        return savedStateHandleController;
    }

    public static void m(final SavedStateRegistry savedStateRegistry, final bf bfVar) {
        bf.c b = bfVar.b();
        if (b != bf.c.INITIALIZED && !b.a(bf.c.STARTED)) {
            bfVar.a(new cf() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // defpackage.cf
                public void d(ef efVar, bf.b bVar) {
                    if (bVar == bf.b.ON_START) {
                        bf.this.c(this);
                        savedStateRegistry.e(a.class);
                    }
                }
            });
        } else {
            savedStateRegistry.e(a.class);
        }
    }

    @Override // defpackage.cf
    public void d(ef efVar, bf.b bVar) {
        if (bVar == bf.b.ON_DESTROY) {
            this.b = false;
            efVar.getLifecycle().c(this);
        }
    }

    public void i(SavedStateRegistry savedStateRegistry, bf bfVar) {
        if (!this.b) {
            this.b = true;
            bfVar.a(this);
            savedStateRegistry.d(this.a, this.c.b());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public nf k() {
        return this.c;
    }

    public boolean l() {
        return this.b;
    }
}
