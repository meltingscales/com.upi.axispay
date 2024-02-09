package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import defpackage.bf;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: AxisPay */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements cf {
    public final tl a;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class a implements SavedStateRegistry.b {
        public final Set<String> a = new HashSet();

        public a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.d("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
            return bundle;
        }

        public void b(String str) {
            this.a.add(str);
        }
    }

    public Recreator(tl tlVar) {
        this.a = tlVar;
    }

    @Override // defpackage.cf
    public void d(ef efVar, bf.b bVar) {
        if (bVar == bf.b.ON_CREATE) {
            efVar.getLifecycle().c(this);
            Bundle a2 = this.a.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (a2 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a2.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    h(it.next());
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }

    public final void h(String str) {
        Class cls;
        try {
            try {
                Constructor declaredConstructor = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.a.class).getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.a) declaredConstructor.newInstance(new Object[0])).a(this.a);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }
}
