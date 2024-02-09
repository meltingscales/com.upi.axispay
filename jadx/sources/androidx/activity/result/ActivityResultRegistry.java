package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import defpackage.bf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {
    public Random a = new Random();
    public final Map<Integer, String> b = new HashMap();
    public final Map<String, Integer> c = new HashMap();
    public final Map<String, d> d = new HashMap();
    public ArrayList<String> e = new ArrayList<>();
    public final transient Map<String, c<?>> f = new HashMap();
    public final Map<String, Object> g = new HashMap();
    public final Bundle h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a<I> extends g<I> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ i c;

        public a(String str, int i, i iVar) {
            this.a = str;
            this.b = i;
            this.c = iVar;
        }

        @Override // defpackage.g
        public void b(I i, f8 f8Var) {
            ActivityResultRegistry.this.e.add(this.a);
            Integer num = ActivityResultRegistry.this.c.get(this.a);
            ActivityResultRegistry.this.f(num != null ? num.intValue() : this.b, this.c, i, f8Var);
        }

        @Override // defpackage.g
        public void c() {
            ActivityResultRegistry.this.l(this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b<I> extends g<I> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ i c;

        public b(String str, int i, i iVar) {
            this.a = str;
            this.b = i;
            this.c = iVar;
        }

        @Override // defpackage.g
        public void b(I i, f8 f8Var) {
            ActivityResultRegistry.this.e.add(this.a);
            Integer num = ActivityResultRegistry.this.c.get(this.a);
            ActivityResultRegistry.this.f(num != null ? num.intValue() : this.b, this.c, i, f8Var);
        }

        @Override // defpackage.g
        public void c() {
            ActivityResultRegistry.this.l(this.a);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class c<O> {
        public final f<O> a;
        public final i<?, O> b;

        public c(f<O> fVar, i<?, O> iVar) {
            this.a = fVar;
            this.b = iVar;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class d {
        public final bf a;
        public final ArrayList<cf> b = new ArrayList<>();

        public d(bf bfVar) {
            this.a = bfVar;
        }

        public void a(cf cfVar) {
            this.a.a(cfVar);
            this.b.add(cfVar);
        }

        public void b() {
            Iterator<cf> it = this.b.iterator();
            while (it.hasNext()) {
                this.a.c(it.next());
            }
            this.b.clear();
        }
    }

    public final void a(int i, String str) {
        this.b.put(Integer.valueOf(i), str);
        this.c.put(str, Integer.valueOf(i));
    }

    public final boolean b(int i, int i2, Intent intent) {
        String str = this.b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.e.remove(str);
        d(str, i2, intent, this.f.get(str));
        return true;
    }

    public final <O> boolean c(int i, @SuppressLint({"UnknownNullness"}) O o) {
        f<?> fVar;
        String str = this.b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.e.remove(str);
        c<?> cVar = this.f.get(str);
        if (cVar != null && (fVar = cVar.a) != null) {
            fVar.a(o);
            return true;
        }
        this.h.remove(str);
        this.g.put(str, o);
        return true;
    }

    public final <O> void d(String str, int i, Intent intent, c<O> cVar) {
        f<O> fVar;
        if (cVar != null && (fVar = cVar.a) != null) {
            fVar.a(cVar.b.c(i, intent));
            return;
        }
        this.g.remove(str);
        this.h.putParcelable(str, new ActivityResult(i, intent));
    }

    public final int e() {
        int nextInt = this.a.nextInt(2147418112);
        while (true) {
            int i = nextInt + LogFileManager.MAX_LOG_SIZE;
            if (!this.b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.a.nextInt(2147418112);
        }
    }

    public abstract <I, O> void f(int i, i<I, O> iVar, @SuppressLint({"UnknownNullness"}) I i2, f8 f8Var);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            if (this.c.containsKey(str)) {
                Integer remove = this.c.remove(str);
                if (!this.h.containsKey(str)) {
                    this.b.remove(remove);
                }
            }
            a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> g<I> i(String str, i<I, O> iVar, f<O> fVar) {
        int k = k(str);
        this.f.put(str, new c<>(fVar, iVar));
        if (this.g.containsKey(str)) {
            Object obj = this.g.get(str);
            this.g.remove(str);
            fVar.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.h.getParcelable(str);
        if (activityResult != null) {
            this.h.remove(str);
            fVar.a(iVar.c(activityResult.c(), activityResult.a()));
        }
        return new b(str, k, iVar);
    }

    public final <I, O> g<I> j(final String str, ef efVar, final i<I, O> iVar, final f<O> fVar) {
        bf lifecycle = efVar.getLifecycle();
        if (!lifecycle.b().a(bf.c.STARTED)) {
            int k = k(str);
            d dVar = this.d.get(str);
            if (dVar == null) {
                dVar = new d(lifecycle);
            }
            dVar.a(new cf() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // defpackage.cf
                public void d(ef efVar2, bf.b bVar) {
                    if (bf.b.ON_START.equals(bVar)) {
                        ActivityResultRegistry.this.f.put(str, new c<>(fVar, iVar));
                        if (ActivityResultRegistry.this.g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.g.get(str);
                            ActivityResultRegistry.this.g.remove(str);
                            fVar.a(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.h.remove(str);
                            fVar.a(iVar.c(activityResult.c(), activityResult.a()));
                        }
                    } else if (bf.b.ON_STOP.equals(bVar)) {
                        ActivityResultRegistry.this.f.remove(str);
                    } else if (bf.b.ON_DESTROY.equals(bVar)) {
                        ActivityResultRegistry.this.l(str);
                    }
                }
            });
            this.d.put(str, dVar);
            return new a(str, k, iVar);
        }
        throw new IllegalStateException("LifecycleOwner " + efVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final int k(String str) {
        Integer num = this.c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int e = e();
        a(e, str);
        return e;
    }

    public final void l(String str) {
        Integer remove;
        if (!this.e.contains(str) && (remove = this.c.remove(str)) != null) {
            this.b.remove(remove);
        }
        this.f.remove(str);
        if (this.g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.g.get(str));
            this.g.remove(str);
        }
        if (this.h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.h.getParcelable(str));
            this.h.remove(str);
        }
        d dVar = this.d.get(str);
        if (dVar != null) {
            dVar.b();
            this.d.remove(str);
        }
    }
}
