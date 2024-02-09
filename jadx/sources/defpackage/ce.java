package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import defpackage.qf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ce  reason: default package */
/* loaded from: classes.dex */
public final class ce extends pf {
    public static final qf.b j = new a();
    public final boolean f;
    public final HashMap<String, Fragment> c = new HashMap<>();
    public final HashMap<String, ce> d = new HashMap<>();
    public final HashMap<String, rf> e = new HashMap<>();
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;

    /* compiled from: AxisPay */
    /* renamed from: ce$a */
    /* loaded from: classes.dex */
    public class a implements qf.b {
        @Override // defpackage.qf.b
        public <T extends pf> T a(Class<T> cls) {
            return new ce(true);
        }
    }

    public ce(boolean z) {
        this.f = z;
    }

    public static ce j(rf rfVar) {
        return (ce) new qf(rfVar, j).a(ce.class);
    }

    @Override // defpackage.pf
    public void d() {
        if (FragmentManager.I0(3)) {
            String str = C0059ao.a(3018) + this;
        }
        this.g = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ce.class != obj.getClass()) {
            return false;
        }
        ce ceVar = (ce) obj;
        return this.c.equals(ceVar.c) && this.d.equals(ceVar.d) && this.e.equals(ceVar.e);
    }

    public void f(Fragment fragment) {
        if (this.i) {
            FragmentManager.I0(2);
        } else if (this.c.containsKey(fragment.mWho)) {
        } else {
            this.c.put(fragment.mWho, fragment);
            if (FragmentManager.I0(2)) {
                String str = C0059ao.a(3019) + fragment;
            }
        }
    }

    public void g(Fragment fragment) {
        if (FragmentManager.I0(3)) {
            String str = C0059ao.a(3020) + fragment;
        }
        ce ceVar = this.d.get(fragment.mWho);
        if (ceVar != null) {
            ceVar.d();
            this.d.remove(fragment.mWho);
        }
        rf rfVar = this.e.get(fragment.mWho);
        if (rfVar != null) {
            rfVar.a();
            this.e.remove(fragment.mWho);
        }
    }

    public Fragment h(String str) {
        return this.c.get(str);
    }

    public int hashCode() {
        return (((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public ce i(Fragment fragment) {
        ce ceVar = this.d.get(fragment.mWho);
        if (ceVar == null) {
            ce ceVar2 = new ce(this.f);
            this.d.put(fragment.mWho, ceVar2);
            return ceVar2;
        }
        return ceVar;
    }

    public Collection<Fragment> k() {
        return new ArrayList(this.c.values());
    }

    public rf l(Fragment fragment) {
        rf rfVar = this.e.get(fragment.mWho);
        if (rfVar == null) {
            rf rfVar2 = new rf();
            this.e.put(fragment.mWho, rfVar2);
            return rfVar2;
        }
        return rfVar;
    }

    public boolean m() {
        return this.g;
    }

    public void n(Fragment fragment) {
        if (this.i) {
            FragmentManager.I0(2);
            return;
        }
        if ((this.c.remove(fragment.mWho) != null) && FragmentManager.I0(2)) {
            String str = C0059ao.a(3021) + fragment;
        }
    }

    public void o(boolean z) {
        this.i = z;
    }

    public boolean p(Fragment fragment) {
        if (this.c.containsKey(fragment.mWho)) {
            if (this.f) {
                return this.g;
            }
            return !this.h;
        }
        return true;
    }

    public String toString() {
        String a2;
        StringBuilder sb = new StringBuilder(C0059ao.a(3022));
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(C0059ao.a(3023));
        Iterator<Fragment> it = this.c.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            a2 = C0059ao.a(3024);
            if (!hasNext) {
                break;
            }
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(a2);
            }
        }
        sb.append(C0059ao.a(3025));
        Iterator<String> it2 = this.d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(a2);
            }
        }
        sb.append(C0059ao.a(3026));
        Iterator<String> it3 = this.e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(a2);
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
