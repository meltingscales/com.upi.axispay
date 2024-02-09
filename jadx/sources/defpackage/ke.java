package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ke  reason: default package */
/* loaded from: classes.dex */
public class ke {
    public static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    public static final me b;
    public static final me c;

    /* compiled from: AxisPay */
    /* renamed from: ke$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ g b;
        public final /* synthetic */ Fragment c;
        public final /* synthetic */ aa d;

        public a(g gVar, Fragment fragment, aa aaVar) {
            this.b = gVar;
            this.c = fragment;
            this.d = aaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.a(this.c, this.d);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ke$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ ArrayList b;

        public b(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ke.B(this.b, 4);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ke$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ g b;
        public final /* synthetic */ Fragment c;
        public final /* synthetic */ aa d;

        public c(g gVar, Fragment fragment, aa aaVar) {
            this.b = gVar;
            this.c = fragment;
            this.d = aaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.a(this.c, this.d);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ke$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        public final /* synthetic */ Object b;
        public final /* synthetic */ me c;
        public final /* synthetic */ View d;
        public final /* synthetic */ Fragment e;
        public final /* synthetic */ ArrayList f;
        public final /* synthetic */ ArrayList g;
        public final /* synthetic */ ArrayList h;
        public final /* synthetic */ Object i;

        public d(Object obj, me meVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.b = obj;
            this.c = meVar;
            this.d = view;
            this.e = fragment;
            this.f = arrayList;
            this.g = arrayList2;
            this.h = arrayList3;
            this.i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.b;
            if (obj != null) {
                this.c.p(obj, this.d);
                this.g.addAll(ke.k(this.c, this.b, this.e, this.f, this.d));
            }
            if (this.h != null) {
                if (this.i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.d);
                    this.c.q(this.i, this.h, arrayList);
                }
                this.h.clear();
                this.h.add(this.d);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ke$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        public final /* synthetic */ Fragment b;
        public final /* synthetic */ Fragment c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ o4 e;
        public final /* synthetic */ View f;
        public final /* synthetic */ me g;
        public final /* synthetic */ Rect h;

        public e(Fragment fragment, Fragment fragment2, boolean z, o4 o4Var, View view, me meVar, Rect rect) {
            this.b = fragment;
            this.c = fragment2;
            this.d = z;
            this.e = o4Var;
            this.f = view;
            this.g = meVar;
            this.h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            ke.f(this.b, this.c, this.d, this.e, false);
            View view = this.f;
            if (view != null) {
                this.g.k(view, this.h);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ke$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        public final /* synthetic */ me b;
        public final /* synthetic */ o4 c;
        public final /* synthetic */ Object d;
        public final /* synthetic */ h e;
        public final /* synthetic */ ArrayList f;
        public final /* synthetic */ View g;
        public final /* synthetic */ Fragment h;
        public final /* synthetic */ Fragment i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ ArrayList k;
        public final /* synthetic */ Object l;
        public final /* synthetic */ Rect m;

        public f(me meVar, o4 o4Var, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.b = meVar;
            this.c = o4Var;
            this.d = obj;
            this.e = hVar;
            this.f = arrayList;
            this.g = view;
            this.h = fragment;
            this.i = fragment2;
            this.j = z;
            this.k = arrayList2;
            this.l = obj2;
            this.m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            o4<String, View> h = ke.h(this.b, this.c, this.d, this.e);
            if (h != null) {
                this.f.addAll(h.values());
                this.f.add(this.g);
            }
            ke.f(this.h, this.i, this.j, h, false);
            Object obj = this.d;
            if (obj != null) {
                this.b.A(obj, this.k, this.f);
                View t = ke.t(h, this.e, this.l, this.j);
                if (t != null) {
                    this.b.k(t, this.m);
                }
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ke$g */
    /* loaded from: classes.dex */
    public interface g {
        void a(Fragment fragment, aa aaVar);

        void b(Fragment fragment, aa aaVar);
    }

    /* compiled from: AxisPay */
    /* renamed from: ke$h */
    /* loaded from: classes.dex */
    public static class h {
        public Fragment a;
        public boolean b;
        public pd c;
        public Fragment d;
        public boolean e;
        public pd f;
    }

    static {
        b = Build.VERSION.SDK_INT >= 21 ? new le() : null;
        c = x();
    }

    public static void A(me meVar, Object obj, Object obj2, o4<String, View> o4Var, boolean z, pd pdVar) {
        String str;
        ArrayList<String> arrayList = pdVar.n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (z) {
            str = pdVar.o.get(0);
        } else {
            str = pdVar.n.get(0);
        }
        View view = o4Var.get(str);
        meVar.v(obj, view);
        if (obj2 != null) {
            meVar.v(obj2, view);
        }
    }

    public static void B(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    public static void C(Context context, ud udVar, ArrayList<pd> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            pd pdVar = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                e(pdVar, sparseArray, z);
            } else {
                c(pdVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                o4<String, String> d2 = d(keyAt, arrayList, arrayList2, i, i2);
                h hVar = (h) sparseArray.valueAt(i4);
                if (udVar.e() && (viewGroup = (ViewGroup) udVar.d(keyAt)) != null) {
                    if (z) {
                        o(viewGroup, hVar, view, d2, gVar);
                    } else {
                        n(viewGroup, hVar, view, d2, gVar);
                    }
                }
            }
        }
    }

    public static void a(ArrayList<View> arrayList, o4<String, View> o4Var, Collection<String> collection) {
        for (int size = o4Var.size() - 1; size >= 0; size--) {
            View m = o4Var.m(size);
            if (collection.contains(ac.M(m))) {
                arrayList.add(m);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0039, code lost:
        if (r0.mAdded != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x006f, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x008b, code lost:
        if (r0.mHidden == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008d, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(defpackage.pd r8, defpackage.je.a r9, android.util.SparseArray<defpackage.ke.h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke.b(pd, je$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(pd pdVar, SparseArray<h> sparseArray, boolean z) {
        int size = pdVar.a.size();
        for (int i = 0; i < size; i++) {
            b(pdVar, pdVar.a.get(i), sparseArray, false, z);
        }
    }

    public static o4<String, String> d(int i, ArrayList<pd> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        o4<String, String> o4Var = new o4<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            pd pdVar = arrayList.get(i4);
            if (pdVar.C(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = pdVar.n;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = pdVar.n;
                        arrayList4 = pdVar.o;
                    } else {
                        ArrayList<String> arrayList6 = pdVar.n;
                        arrayList3 = pdVar.o;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = o4Var.remove(str2);
                        if (remove != null) {
                            o4Var.put(str, remove);
                        } else {
                            o4Var.put(str, str2);
                        }
                    }
                }
            }
        }
        return o4Var;
    }

    public static void e(pd pdVar, SparseArray<h> sparseArray, boolean z) {
        if (pdVar.r.q0().e()) {
            for (int size = pdVar.a.size() - 1; size >= 0; size--) {
                b(pdVar, pdVar.a.get(size), sparseArray, true, z);
            }
        }
    }

    public static void f(Fragment fragment, Fragment fragment2, boolean z, o4<String, View> o4Var, boolean z2) {
        r8 enterTransitionCallback;
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = o4Var == null ? 0 : o4Var.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(o4Var.i(i));
                arrayList.add(o4Var.m(i));
            }
            if (z2) {
                enterTransitionCallback.c(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.b(arrayList2, arrayList, null);
            }
        }
    }

    public static boolean g(me meVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!meVar.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static o4<String, View> h(me meVar, o4<String, String> o4Var, Object obj, h hVar) {
        r8 enterTransitionCallback;
        ArrayList<String> arrayList;
        String q;
        Fragment fragment = hVar.a;
        View view = fragment.getView();
        if (!o4Var.isEmpty() && obj != null && view != null) {
            o4<String, View> o4Var2 = new o4<>();
            meVar.j(o4Var2, view);
            pd pdVar = hVar.c;
            if (hVar.b) {
                enterTransitionCallback = fragment.getExitTransitionCallback();
                arrayList = pdVar.n;
            } else {
                enterTransitionCallback = fragment.getEnterTransitionCallback();
                arrayList = pdVar.o;
            }
            if (arrayList != null) {
                o4Var2.o(arrayList);
                o4Var2.o(o4Var.values());
            }
            if (enterTransitionCallback != null) {
                enterTransitionCallback.a(arrayList, o4Var2);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    String str = arrayList.get(size);
                    View view2 = o4Var2.get(str);
                    if (view2 == null) {
                        String q2 = q(o4Var, str);
                        if (q2 != null) {
                            o4Var.remove(q2);
                        }
                    } else if (!str.equals(ac.M(view2)) && (q = q(o4Var, str)) != null) {
                        o4Var.put(q, ac.M(view2));
                    }
                }
            } else {
                y(o4Var, o4Var2);
            }
            return o4Var2;
        }
        o4Var.clear();
        return null;
    }

    public static o4<String, View> i(me meVar, o4<String, String> o4Var, Object obj, h hVar) {
        r8 exitTransitionCallback;
        ArrayList<String> arrayList;
        if (!o4Var.isEmpty() && obj != null) {
            Fragment fragment = hVar.d;
            o4<String, View> o4Var2 = new o4<>();
            meVar.j(o4Var2, fragment.requireView());
            pd pdVar = hVar.f;
            if (hVar.e) {
                exitTransitionCallback = fragment.getEnterTransitionCallback();
                arrayList = pdVar.o;
            } else {
                exitTransitionCallback = fragment.getExitTransitionCallback();
                arrayList = pdVar.n;
            }
            if (arrayList != null) {
                o4Var2.o(arrayList);
            }
            if (exitTransitionCallback != null) {
                exitTransitionCallback.a(arrayList, o4Var2);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    String str = arrayList.get(size);
                    View view = o4Var2.get(str);
                    if (view == null) {
                        o4Var.remove(str);
                    } else if (!str.equals(ac.M(view))) {
                        o4Var.put(ac.M(view), o4Var.remove(str));
                    }
                }
            } else {
                o4Var.o(o4Var2.keySet());
            }
            return o4Var2;
        }
        o4Var.clear();
        return null;
    }

    public static me j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        me meVar = b;
        if (meVar == null || !g(meVar, arrayList)) {
            me meVar2 = c;
            if (meVar2 == null || !g(meVar2, arrayList)) {
                if (meVar == null && meVar2 == null) {
                    return null;
                }
                throw new IllegalArgumentException(C0059ao.a(10916));
            }
            return meVar2;
        }
        return meVar;
    }

    public static ArrayList<View> k(me meVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View view2 = fragment.getView();
            if (view2 != null) {
                meVar.f(arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            meVar.b(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    public static Object l(me meVar, ViewGroup viewGroup, View view, o4<String, String> o4Var, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object u;
        o4<String, String> o4Var2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.b;
        if (o4Var.isEmpty()) {
            o4Var2 = o4Var;
            u = null;
        } else {
            u = u(meVar, fragment, fragment2, z);
            o4Var2 = o4Var;
        }
        o4<String, View> i = i(meVar, o4Var2, u, hVar);
        if (o4Var.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(i.values());
            obj3 = u;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, i, true);
        if (obj3 != null) {
            rect = new Rect();
            meVar.z(obj3, view, arrayList);
            A(meVar, obj3, obj2, i, hVar.e, hVar.f);
            if (obj != null) {
                meVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        xb.a(viewGroup, new f(meVar, o4Var, obj3, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    public static Object m(me meVar, ViewGroup viewGroup, View view, o4<String, String> o4Var, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.b;
        Object u = o4Var.isEmpty() ? null : u(meVar, fragment, fragment2, z);
        o4<String, View> i = i(meVar, o4Var, u, hVar);
        o4<String, View> h2 = h(meVar, o4Var, u, hVar);
        if (o4Var.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h2 != null) {
                h2.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, i, o4Var.keySet());
            a(arrayList2, h2, o4Var.values());
            obj3 = u;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, i, true);
        if (obj3 != null) {
            arrayList2.add(view);
            meVar.z(obj3, view, arrayList);
            A(meVar, obj3, obj2, i, hVar.e, hVar.f);
            Rect rect2 = new Rect();
            View t = t(h2, hVar, obj, z);
            if (t != null) {
                meVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = t;
        } else {
            view2 = null;
            rect = null;
        }
        xb.a(viewGroup, new e(fragment, fragment2, z, h2, view2, meVar, rect));
        return obj3;
    }

    public static void n(ViewGroup viewGroup, h hVar, View view, o4<String, String> o4Var, g gVar) {
        Object obj;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.d;
        me j = j(fragment2, fragment);
        if (j == null) {
            return;
        }
        boolean z = hVar.b;
        boolean z2 = hVar.e;
        Object r = r(j, fragment, z);
        Object s = s(j, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object l = l(j, viewGroup, view, o4Var, hVar, arrayList, arrayList2, r, s);
        if (r == null && l == null) {
            obj = s;
            if (obj == null) {
                return;
            }
        } else {
            obj = s;
        }
        ArrayList<View> k = k(j, obj, fragment2, arrayList, view);
        Object obj2 = (k == null || k.isEmpty()) ? null : null;
        j.a(r, view);
        Object v = v(j, r, obj2, l, fragment, hVar.b);
        if (fragment2 != null && k != null && (k.size() > 0 || arrayList.size() > 0)) {
            aa aaVar = new aa();
            gVar.b(fragment2, aaVar);
            j.w(fragment2, v, aaVar, new c(gVar, fragment2, aaVar));
        }
        if (v != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            j.t(v, r, arrayList3, obj2, k, l, arrayList2);
            z(j, viewGroup, fragment, view, arrayList2, r, arrayList3, obj2, k);
            j.x(viewGroup, arrayList2, o4Var);
            j.c(viewGroup, v);
            j.s(viewGroup, arrayList2, o4Var);
        }
    }

    public static void o(ViewGroup viewGroup, h hVar, View view, o4<String, String> o4Var, g gVar) {
        Object obj;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.d;
        me j = j(fragment2, fragment);
        if (j == null) {
            return;
        }
        boolean z = hVar.b;
        boolean z2 = hVar.e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object r = r(j, fragment, z);
        Object s = s(j, fragment2, z2);
        Object m = m(j, viewGroup, view, o4Var, hVar, arrayList2, arrayList, r, s);
        if (r == null && m == null) {
            obj = s;
            if (obj == null) {
                return;
            }
        } else {
            obj = s;
        }
        ArrayList<View> k = k(j, obj, fragment2, arrayList2, view);
        ArrayList<View> k2 = k(j, r, fragment, arrayList, view);
        B(k2, 4);
        Object v = v(j, r, obj, m, fragment, z);
        if (fragment2 != null && k != null && (k.size() > 0 || arrayList2.size() > 0)) {
            aa aaVar = new aa();
            gVar.b(fragment2, aaVar);
            j.w(fragment2, v, aaVar, new a(gVar, fragment2, aaVar));
        }
        if (v != null) {
            w(j, obj, fragment2, k);
            ArrayList<String> o = j.o(arrayList);
            j.t(v, r, k2, obj, k, m, arrayList);
            j.c(viewGroup, v);
            j.y(viewGroup, arrayList2, arrayList, o, o4Var);
            B(k2, 0);
            j.A(m, arrayList2, arrayList);
        }
    }

    public static h p(h hVar, SparseArray<h> sparseArray, int i) {
        if (hVar == null) {
            h hVar2 = new h();
            sparseArray.put(i, hVar2);
            return hVar2;
        }
        return hVar;
    }

    public static String q(o4<String, String> o4Var, String str) {
        int size = o4Var.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(o4Var.m(i))) {
                return o4Var.i(i);
            }
        }
        return null;
    }

    public static Object r(me meVar, Fragment fragment, boolean z) {
        Object enterTransition;
        if (fragment == null) {
            return null;
        }
        if (z) {
            enterTransition = fragment.getReenterTransition();
        } else {
            enterTransition = fragment.getEnterTransition();
        }
        return meVar.g(enterTransition);
    }

    public static Object s(me meVar, Fragment fragment, boolean z) {
        Object exitTransition;
        if (fragment == null) {
            return null;
        }
        if (z) {
            exitTransition = fragment.getReturnTransition();
        } else {
            exitTransition = fragment.getExitTransition();
        }
        return meVar.g(exitTransition);
    }

    public static View t(o4<String, View> o4Var, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        pd pdVar = hVar.c;
        if (obj == null || o4Var == null || (arrayList = pdVar.n) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = pdVar.n.get(0);
        } else {
            str = pdVar.o.get(0);
        }
        return o4Var.get(str);
    }

    public static Object u(me meVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object sharedElementEnterTransition;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            sharedElementEnterTransition = fragment2.getSharedElementReturnTransition();
        } else {
            sharedElementEnterTransition = fragment.getSharedElementEnterTransition();
        }
        return meVar.B(meVar.g(sharedElementEnterTransition));
    }

    public static Object v(me meVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else if (z) {
            z2 = fragment.getAllowReturnTransitionOverlap();
        } else {
            z2 = fragment.getAllowEnterTransitionOverlap();
        }
        if (z2) {
            return meVar.n(obj2, obj, obj3);
        }
        return meVar.m(obj2, obj, obj3);
    }

    public static void w(me meVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            meVar.r(obj, fragment.getView(), arrayList);
            xb.a(fragment.mContainer, new b(arrayList));
        }
    }

    public static me x() {
        try {
            return (me) Class.forName(C0059ao.a(10917)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void y(o4<String, String> o4Var, o4<String, View> o4Var2) {
        for (int size = o4Var.size() - 1; size >= 0; size--) {
            if (!o4Var2.containsKey(o4Var.m(size))) {
                o4Var.k(size);
            }
        }
    }

    public static void z(me meVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        xb.a(viewGroup, new d(obj, meVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
