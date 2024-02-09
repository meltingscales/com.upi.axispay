package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import defpackage.aa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: pe  reason: default package */
/* loaded from: classes.dex */
public abstract class pe {
    public final ViewGroup a;
    public final ArrayList<e> b = new ArrayList<>();
    public final ArrayList<e> c = new ArrayList<>();
    public boolean d = false;
    public boolean e = false;

    /* compiled from: AxisPay */
    /* renamed from: pe$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ d b;

        public a(d dVar) {
            this.b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (pe.this.b.contains(this.b)) {
                this.b.e().a(this.b.f().mView);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: pe$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ d b;

        public b(d dVar) {
            this.b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            pe.this.b.remove(this.b);
            pe.this.c.remove(this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: pe$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[e.b.values().length];
            b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: pe$d */
    /* loaded from: classes.dex */
    public static class d extends e {
        public final ge h;

        public d(e.c cVar, e.b bVar, ge geVar, aa aaVar) {
            super(cVar, bVar, geVar.k(), aaVar);
            this.h = geVar;
        }

        @Override // defpackage.pe.e
        public void c() {
            super.c();
            this.h.m();
        }

        @Override // defpackage.pe.e
        public void l() {
            if (g() == e.b.ADDING) {
                Fragment k = this.h.k();
                View findFocus = k.mView.findFocus();
                if (findFocus != null) {
                    k.setFocusedView(findFocus);
                    if (FragmentManager.I0(2)) {
                        String str = C0059ao.a(6749) + findFocus + C0059ao.a(6750) + k;
                    }
                }
                View requireView = f().requireView();
                if (requireView.getParent() == null) {
                    this.h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k.getPostOnViewCreatedAlpha());
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: pe$e */
    /* loaded from: classes.dex */
    public static class e {
        public c a;
        public b b;
        public final Fragment c;
        public final List<Runnable> d = new ArrayList();
        public final HashSet<aa> e = new HashSet<>();
        public boolean f = false;
        public boolean g = false;

        /* compiled from: AxisPay */
        /* renamed from: pe$e$a */
        /* loaded from: classes.dex */
        public class a implements aa.a {
            public a() {
            }

            @Override // defpackage.aa.a
            public void a() {
                e.this.b();
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: pe$e$b */
        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* compiled from: AxisPay */
        /* renamed from: pe$e$c */
        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c b(int i) {
                if (i != 0) {
                    if (i != 4) {
                        if (i == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException("Unknown visibility " + i);
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            public static c c(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return b(view.getVisibility());
            }

            public void a(View view) {
                int i = c.a[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.I0(2)) {
                            String str = "SpecialEffectsController: Removing view " + view + " from container " + viewGroup;
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i == 2) {
                    if (FragmentManager.I0(2)) {
                        String str2 = "SpecialEffectsController: Setting view " + view + " to VISIBLE";
                    }
                    view.setVisibility(0);
                } else if (i == 3) {
                    if (FragmentManager.I0(2)) {
                        String str3 = "SpecialEffectsController: Setting view " + view + " to GONE";
                    }
                    view.setVisibility(8);
                } else if (i != 4) {
                } else {
                    if (FragmentManager.I0(2)) {
                        String str4 = "SpecialEffectsController: Setting view " + view + " to INVISIBLE";
                    }
                    view.setVisibility(4);
                }
            }
        }

        public e(c cVar, b bVar, Fragment fragment, aa aaVar) {
            this.a = cVar;
            this.b = bVar;
            this.c = fragment;
            aaVar.c(new a());
        }

        public final void a(Runnable runnable) {
            this.d.add(runnable);
        }

        public final void b() {
            if (h()) {
                return;
            }
            this.f = true;
            if (this.e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.e).iterator();
            while (it.hasNext()) {
                ((aa) it.next()).a();
            }
        }

        public void c() {
            if (this.g) {
                return;
            }
            if (FragmentManager.I0(2)) {
                String str = C0059ao.a(6767) + this + C0059ao.a(6768);
            }
            this.g = true;
            for (Runnable runnable : this.d) {
                runnable.run();
            }
        }

        public final void d(aa aaVar) {
            if (this.e.remove(aaVar) && this.e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.a;
        }

        public final Fragment f() {
            return this.c;
        }

        public b g() {
            return this.b;
        }

        public final boolean h() {
            return this.f;
        }

        public final boolean i() {
            return this.g;
        }

        public final void j(aa aaVar) {
            l();
            this.e.add(aaVar);
        }

        public final void k(c cVar, b bVar) {
            int i = c.b[bVar.ordinal()];
            String a2 = C0059ao.a(6769);
            if (i == 1) {
                if (this.a == c.REMOVED) {
                    if (FragmentManager.I0(2)) {
                        String str = a2 + this.c + C0059ao.a(6775) + this.b + C0059ao.a(6776);
                    }
                    this.a = c.VISIBLE;
                    this.b = b.ADDING;
                    return;
                }
                return;
            }
            String a3 = C0059ao.a(6770);
            if (i != 2) {
                if (i == 3 && this.a != c.REMOVED) {
                    if (FragmentManager.I0(2)) {
                        String str2 = a2 + this.c + a3 + this.a + C0059ao.a(6771) + cVar + C0059ao.a(6772);
                    }
                    this.a = cVar;
                    return;
                }
                return;
            }
            if (FragmentManager.I0(2)) {
                String str3 = a2 + this.c + a3 + this.a + C0059ao.a(6773) + this.b + C0059ao.a(6774);
            }
            this.a = c.REMOVED;
            this.b = b.REMOVING;
        }

        public void l() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(6777));
            String a2 = C0059ao.a(6778);
            sb.append(a2);
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            String a3 = C0059ao.a(6779);
            sb.append(a3);
            sb.append(a2);
            sb.append(C0059ao.a(6780));
            sb.append(this.a);
            sb.append(a3);
            sb.append(a2);
            sb.append(C0059ao.a(6781));
            sb.append(this.b);
            sb.append(a3);
            sb.append(a2);
            sb.append(C0059ao.a(6782));
            sb.append(this.c);
            sb.append(C0059ao.a(6783));
            return sb.toString();
        }
    }

    public pe(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static pe n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.B0());
    }

    public static pe o(ViewGroup viewGroup, qe qeVar) {
        int i = nd.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof pe) {
            return (pe) tag;
        }
        pe a2 = qeVar.a(viewGroup);
        viewGroup.setTag(i, a2);
        return a2;
    }

    public final void a(e.c cVar, e.b bVar, ge geVar) {
        synchronized (this.b) {
            aa aaVar = new aa();
            e h = h(geVar.k());
            if (h != null) {
                h.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, geVar, aaVar);
            this.b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    public void b(e.c cVar, ge geVar) {
        if (FragmentManager.I0(2)) {
            String str = C0059ao.a(15266) + geVar.k();
        }
        a(cVar, e.b.ADDING, geVar);
    }

    public void c(ge geVar) {
        if (FragmentManager.I0(2)) {
            String str = C0059ao.a(15267) + geVar.k();
        }
        a(e.c.GONE, e.b.NONE, geVar);
    }

    public void d(ge geVar) {
        if (FragmentManager.I0(2)) {
            String str = C0059ao.a(15268) + geVar.k();
        }
        a(e.c.REMOVED, e.b.REMOVING, geVar);
    }

    public void e(ge geVar) {
        if (FragmentManager.I0(2)) {
            String str = C0059ao.a(15269) + geVar.k();
        }
        a(e.c.VISIBLE, e.b.NONE, geVar);
    }

    public abstract void f(List<e> list, boolean z);

    public void g() {
        if (this.e) {
            return;
        }
        if (!ac.U(this.a)) {
            j();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.c);
                this.c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (FragmentManager.I0(2)) {
                        String str = C0059ao.a(15270) + eVar;
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.b);
                this.b.clear();
                this.c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).l();
                }
                f(arrayList2, this.d);
                this.d = false;
            }
        }
    }

    public final e h(Fragment fragment) {
        Iterator<e> it = this.b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    public final e i(Fragment fragment) {
        Iterator<e> it = this.c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    public void j() {
        String str;
        String str2;
        boolean U = ac.U(this.a);
        synchronized (this.b) {
            q();
            Iterator<e> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            Iterator it2 = new ArrayList(this.c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (FragmentManager.I0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C0059ao.a(15271));
                    if (U) {
                        str2 = C0059ao.a(15272);
                    } else {
                        str2 = C0059ao.a(15273) + this.a + C0059ao.a(15274);
                    }
                    sb.append(str2);
                    sb.append(C0059ao.a(15275));
                    sb.append(eVar);
                    sb.toString();
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (FragmentManager.I0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C0059ao.a(15276));
                    if (U) {
                        str = C0059ao.a(15277);
                    } else {
                        str = C0059ao.a(15278) + this.a + C0059ao.a(15279);
                    }
                    sb2.append(str);
                    sb2.append(C0059ao.a(15280));
                    sb2.append(eVar2);
                    sb2.toString();
                }
                eVar2.b();
            }
        }
    }

    public void k() {
        if (this.e) {
            this.e = false;
            g();
        }
    }

    public e.b l(ge geVar) {
        e h = h(geVar.k());
        e.b g = h != null ? h.g() : null;
        e i = i(geVar.k());
        return (i == null || !(g == null || g == e.b.NONE)) ? g : i.g();
    }

    public ViewGroup m() {
        return this.a;
    }

    public void p() {
        synchronized (this.b) {
            q();
            this.e = false;
            int size = this.b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.b.get(size);
                e.c c2 = e.c.c(eVar.f().mView);
                e.c e2 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e2 == cVar && c2 != cVar) {
                    this.e = eVar.f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    public final void q() {
        Iterator<e> it = this.b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.b(next.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    public void r(boolean z) {
        this.d = z;
    }
}
