package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: bn  reason: default package */
/* loaded from: classes.dex */
public abstract class bn implements Cloneable {
    public static final int[] H = {2, 1, 3, 4};
    public static final vm I = new a();
    public static ThreadLocal<o4<Animator, d>> J = new ThreadLocal<>();
    public en D;
    public e E;
    public o4<String, String> F;
    public ArrayList<hn> u;
    public ArrayList<hn> v;
    public String b = getClass().getName();
    public long c = -1;
    public long d = -1;
    public TimeInterpolator e = null;
    public ArrayList<Integer> f = new ArrayList<>();
    public ArrayList<View> g = new ArrayList<>();
    public ArrayList<String> h = null;
    public ArrayList<Class<?>> i = null;
    public ArrayList<Integer> j = null;
    public ArrayList<View> k = null;
    public ArrayList<Class<?>> l = null;
    public ArrayList<String> m = null;
    public ArrayList<Integer> n = null;
    public ArrayList<View> o = null;
    public ArrayList<Class<?>> p = null;
    public in q = new in();
    public in r = new in();
    public fn s = null;
    public int[] t = H;
    public boolean w = false;
    public ArrayList<Animator> x = new ArrayList<>();
    public int y = 0;
    public boolean z = false;
    public boolean A = false;
    public ArrayList<f> B = null;
    public ArrayList<Animator> C = new ArrayList<>();
    public vm G = I;

    /* compiled from: AxisPay */
    /* renamed from: bn$a */
    /* loaded from: classes.dex */
    public static class a extends vm {
        @Override // defpackage.vm
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bn$b */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ o4 a;

        public b(o4 o4Var) {
            this.a = o4Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            bn.this.x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            bn.this.x.add(animator);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bn$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            bn.this.o();
            animator.removeListener(this);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bn$d */
    /* loaded from: classes.dex */
    public static class d {
        public View a;
        public String b;
        public hn c;
        public bo d;
        public bn e;

        public d(View view, String str, bn bnVar, bo boVar, hn hnVar) {
            this.a = view;
            this.b = str;
            this.c = hnVar;
            this.d = boVar;
            this.e = bnVar;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bn$e */
    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* compiled from: AxisPay */
    /* renamed from: bn$f */
    /* loaded from: classes.dex */
    public interface f {
        void a(bn bnVar);

        void b(bn bnVar);

        void c(bn bnVar);

        void d(bn bnVar);

        void e(bn bnVar);
    }

    public static boolean G(hn hnVar, hn hnVar2, String str) {
        Object obj = hnVar.a.get(str);
        Object obj2 = hnVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public static void d(in inVar, View view, hn hnVar) {
        inVar.a.put(view, hnVar);
        int id = view.getId();
        if (id >= 0) {
            if (inVar.b.indexOfKey(id) >= 0) {
                inVar.b.put(id, null);
            } else {
                inVar.b.put(id, view);
            }
        }
        String M = ac.M(view);
        if (M != null) {
            if (inVar.d.containsKey(M)) {
                inVar.d.put(M, null);
            } else {
                inVar.d.put(M, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (inVar.c.g(itemIdAtPosition) >= 0) {
                    View e2 = inVar.c.e(itemIdAtPosition);
                    if (e2 != null) {
                        ac.A0(e2, false);
                        inVar.c.i(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                ac.A0(view, true);
                inVar.c.i(itemIdAtPosition, view);
            }
        }
    }

    public static o4<Animator, d> w() {
        o4<Animator, d> o4Var = J.get();
        if (o4Var == null) {
            o4<Animator, d> o4Var2 = new o4<>();
            J.set(o4Var2);
            return o4Var2;
        }
        return o4Var;
    }

    public List<Class<?>> A() {
        return this.i;
    }

    public List<View> B() {
        return this.g;
    }

    public String[] C() {
        return null;
    }

    public hn D(View view, boolean z) {
        fn fnVar = this.s;
        if (fnVar != null) {
            return fnVar.D(view, z);
        }
        return (z ? this.q : this.r).a.get(view);
    }

    public boolean E(hn hnVar, hn hnVar2) {
        if (hnVar == null || hnVar2 == null) {
            return false;
        }
        String[] C = C();
        if (C != null) {
            for (String str : C) {
                if (!G(hnVar, hnVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : hnVar.a.keySet()) {
            if (G(hnVar, hnVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public boolean F(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.j;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList4 = this.k;
            if (arrayList4 == null || !arrayList4.contains(view)) {
                ArrayList<Class<?>> arrayList5 = this.l;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    for (int i = 0; i < size; i++) {
                        if (this.l.get(i).isInstance(view)) {
                            return false;
                        }
                    }
                }
                if (this.m == null || ac.M(view) == null || !this.m.contains(ac.M(view))) {
                    if ((this.f.size() == 0 && this.g.size() == 0 && (((arrayList = this.i) == null || arrayList.isEmpty()) && ((arrayList2 = this.h) == null || arrayList2.isEmpty()))) || this.f.contains(Integer.valueOf(id)) || this.g.contains(view)) {
                        return true;
                    }
                    ArrayList<String> arrayList6 = this.h;
                    if (arrayList6 == null || !arrayList6.contains(ac.M(view))) {
                        if (this.i != null) {
                            for (int i2 = 0; i2 < this.i.size(); i2++) {
                                if (this.i.get(i2).isInstance(view)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void H(o4<View, hn> o4Var, o4<View, hn> o4Var2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && F(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && F(view)) {
                hn hnVar = o4Var.get(valueAt);
                hn hnVar2 = o4Var2.get(view);
                if (hnVar != null && hnVar2 != null) {
                    this.u.add(hnVar);
                    this.v.add(hnVar2);
                    o4Var.remove(valueAt);
                    o4Var2.remove(view);
                }
            }
        }
    }

    public final void I(o4<View, hn> o4Var, o4<View, hn> o4Var2) {
        hn remove;
        for (int size = o4Var.size() - 1; size >= 0; size--) {
            View i = o4Var.i(size);
            if (i != null && F(i) && (remove = o4Var2.remove(i)) != null && F(remove.b)) {
                this.u.add(o4Var.k(size));
                this.v.add(remove);
            }
        }
    }

    public final void J(o4<View, hn> o4Var, o4<View, hn> o4Var2, r4<View> r4Var, r4<View> r4Var2) {
        View e2;
        int l = r4Var.l();
        for (int i = 0; i < l; i++) {
            View m = r4Var.m(i);
            if (m != null && F(m) && (e2 = r4Var2.e(r4Var.h(i))) != null && F(e2)) {
                hn hnVar = o4Var.get(m);
                hn hnVar2 = o4Var2.get(e2);
                if (hnVar != null && hnVar2 != null) {
                    this.u.add(hnVar);
                    this.v.add(hnVar2);
                    o4Var.remove(m);
                    o4Var2.remove(e2);
                }
            }
        }
    }

    public final void K(o4<View, hn> o4Var, o4<View, hn> o4Var2, o4<String, View> o4Var3, o4<String, View> o4Var4) {
        View view;
        int size = o4Var3.size();
        for (int i = 0; i < size; i++) {
            View m = o4Var3.m(i);
            if (m != null && F(m) && (view = o4Var4.get(o4Var3.i(i))) != null && F(view)) {
                hn hnVar = o4Var.get(m);
                hn hnVar2 = o4Var2.get(view);
                if (hnVar != null && hnVar2 != null) {
                    this.u.add(hnVar);
                    this.v.add(hnVar2);
                    o4Var.remove(m);
                    o4Var2.remove(view);
                }
            }
        }
    }

    public final void L(in inVar, in inVar2) {
        o4<View, hn> o4Var = new o4<>(inVar.a);
        o4<View, hn> o4Var2 = new o4<>(inVar2.a);
        int i = 0;
        while (true) {
            int[] iArr = this.t;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    I(o4Var, o4Var2);
                } else if (i2 == 2) {
                    K(o4Var, o4Var2, inVar.d, inVar2.d);
                } else if (i2 == 3) {
                    H(o4Var, o4Var2, inVar.b, inVar2.b);
                } else if (i2 == 4) {
                    J(o4Var, o4Var2, inVar.c, inVar2.c);
                }
                i++;
            } else {
                c(o4Var, o4Var2);
                return;
            }
        }
    }

    public void M(View view) {
        if (this.A) {
            return;
        }
        o4<Animator, d> w = w();
        int size = w.size();
        bo d2 = rn.d(view);
        for (int i = size - 1; i >= 0; i--) {
            d m = w.m(i);
            if (m.a != null && d2.equals(m.d)) {
                pm.b(w.i(i));
            }
        }
        ArrayList<f> arrayList = this.B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.B.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((f) arrayList2.get(i2)).c(this);
            }
        }
        this.z = true;
    }

    public void N(ViewGroup viewGroup) {
        d dVar;
        this.u = new ArrayList<>();
        this.v = new ArrayList<>();
        L(this.q, this.r);
        o4<Animator, d> w = w();
        int size = w.size();
        bo d2 = rn.d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator i2 = w.i(i);
            if (i2 != null && (dVar = w.get(i2)) != null && dVar.a != null && d2.equals(dVar.d)) {
                hn hnVar = dVar.c;
                View view = dVar.a;
                hn D = D(view, true);
                hn s = s(view, true);
                if (D == null && s == null) {
                    s = this.r.a.get(view);
                }
                if (!(D == null && s == null) && dVar.e.E(hnVar, s)) {
                    if (!i2.isRunning() && !i2.isStarted()) {
                        w.remove(i2);
                    } else {
                        i2.cancel();
                    }
                }
            }
        }
        n(viewGroup, this.q, this.r, this.u, this.v);
        S();
    }

    public bn O(f fVar) {
        ArrayList<f> arrayList = this.B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.B.size() == 0) {
            this.B = null;
        }
        return this;
    }

    public bn P(View view) {
        this.g.remove(view);
        return this;
    }

    public void Q(View view) {
        if (this.z) {
            if (!this.A) {
                o4<Animator, d> w = w();
                int size = w.size();
                bo d2 = rn.d(view);
                for (int i = size - 1; i >= 0; i--) {
                    d m = w.m(i);
                    if (m.a != null && d2.equals(m.d)) {
                        pm.c(w.i(i));
                    }
                }
                ArrayList<f> arrayList = this.B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.B.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((f) arrayList2.get(i2)).d(this);
                    }
                }
            }
            this.z = false;
        }
    }

    public final void R(Animator animator, o4<Animator, d> o4Var) {
        if (animator != null) {
            animator.addListener(new b(o4Var));
            e(animator);
        }
    }

    public void S() {
        Z();
        o4<Animator, d> w = w();
        Iterator<Animator> it = this.C.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (w.containsKey(next)) {
                Z();
                R(next, w);
            }
        }
        this.C.clear();
        o();
    }

    public bn T(long j) {
        this.d = j;
        return this;
    }

    public void U(e eVar) {
        this.E = eVar;
    }

    public bn V(TimeInterpolator timeInterpolator) {
        this.e = timeInterpolator;
        return this;
    }

    public void W(vm vmVar) {
        if (vmVar == null) {
            this.G = I;
        } else {
            this.G = vmVar;
        }
    }

    public void X(en enVar) {
    }

    public bn Y(long j) {
        this.c = j;
        return this;
    }

    public void Z() {
        if (this.y == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((f) arrayList2.get(i)).a(this);
                }
            }
            this.A = false;
        }
        this.y++;
    }

    public bn a(f fVar) {
        if (this.B == null) {
            this.B = new ArrayList<>();
        }
        this.B.add(fVar);
        return this;
    }

    public String a0(String str) {
        String str2 = str + getClass().getSimpleName() + C0059ao.a(2289) + Integer.toHexString(hashCode()) + C0059ao.a(2290);
        int i = (this.d > (-1L) ? 1 : (this.d == (-1L) ? 0 : -1));
        String a2 = C0059ao.a(2291);
        if (i != 0) {
            str2 = str2 + C0059ao.a(2292) + this.d + a2;
        }
        if (this.c != -1) {
            str2 = str2 + C0059ao.a(2293) + this.c + a2;
        }
        if (this.e != null) {
            str2 = str2 + C0059ao.a(2294) + this.e + a2;
        }
        if (this.f.size() > 0 || this.g.size() > 0) {
            String str3 = str2 + C0059ao.a(2295);
            int size = this.f.size();
            String a3 = C0059ao.a(2296);
            if (size > 0) {
                for (int i2 = 0; i2 < this.f.size(); i2++) {
                    if (i2 > 0) {
                        str3 = str3 + a3;
                    }
                    str3 = str3 + this.f.get(i2);
                }
            }
            if (this.g.size() > 0) {
                for (int i3 = 0; i3 < this.g.size(); i3++) {
                    if (i3 > 0) {
                        str3 = str3 + a3;
                    }
                    str3 = str3 + this.g.get(i3);
                }
            }
            return str3 + C0059ao.a(2297);
        }
        return str2;
    }

    public bn b(View view) {
        this.g.add(view);
        return this;
    }

    public final void c(o4<View, hn> o4Var, o4<View, hn> o4Var2) {
        for (int i = 0; i < o4Var.size(); i++) {
            hn m = o4Var.m(i);
            if (F(m.b)) {
                this.u.add(m);
                this.v.add(null);
            }
        }
        for (int i2 = 0; i2 < o4Var2.size(); i2++) {
            hn m2 = o4Var2.m(i2);
            if (F(m2.b)) {
                this.v.add(m2);
                this.u.add(null);
            }
        }
    }

    public void cancel() {
        for (int size = this.x.size() - 1; size >= 0; size--) {
            this.x.get(size).cancel();
        }
        ArrayList<f> arrayList = this.B;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.B.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((f) arrayList2.get(i)).b(this);
        }
    }

    public void e(Animator animator) {
        if (animator == null) {
            o();
            return;
        }
        if (p() >= 0) {
            animator.setDuration(p());
        }
        if (x() >= 0) {
            animator.setStartDelay(x() + animator.getStartDelay());
        }
        if (r() != null) {
            animator.setInterpolator(r());
        }
        animator.addListener(new c());
        animator.start();
    }

    public abstract void f(hn hnVar);

    public final void g(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.j;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.k;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.l;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.l.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    hn hnVar = new hn(view);
                    if (z) {
                        i(hnVar);
                    } else {
                        f(hnVar);
                    }
                    hnVar.c.add(this);
                    h(hnVar);
                    if (z) {
                        d(this.q, view, hnVar);
                    } else {
                        d(this.r, view, hnVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.n;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.o;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.p;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.p.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                g(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public void h(hn hnVar) {
        String[] b2;
        if (this.D == null || hnVar.a.isEmpty() || (b2 = this.D.b()) == null) {
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= b2.length) {
                z = true;
                break;
            } else if (!hnVar.a.containsKey(b2[i])) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        this.D.a(hnVar);
    }

    public abstract void i(hn hnVar);

    public void j(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        o4<String, String> o4Var;
        k(z);
        if ((this.f.size() <= 0 && this.g.size() <= 0) || (((arrayList = this.h) != null && !arrayList.isEmpty()) || ((arrayList2 = this.i) != null && !arrayList2.isEmpty()))) {
            g(viewGroup, z);
        } else {
            for (int i = 0; i < this.f.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f.get(i).intValue());
                if (findViewById != null) {
                    hn hnVar = new hn(findViewById);
                    if (z) {
                        i(hnVar);
                    } else {
                        f(hnVar);
                    }
                    hnVar.c.add(this);
                    h(hnVar);
                    if (z) {
                        d(this.q, findViewById, hnVar);
                    } else {
                        d(this.r, findViewById, hnVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                View view = this.g.get(i2);
                hn hnVar2 = new hn(view);
                if (z) {
                    i(hnVar2);
                } else {
                    f(hnVar2);
                }
                hnVar2.c.add(this);
                h(hnVar2);
                if (z) {
                    d(this.q, view, hnVar2);
                } else {
                    d(this.r, view, hnVar2);
                }
            }
        }
        if (z || (o4Var = this.F) == null) {
            return;
        }
        int size = o4Var.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.q.d.remove(this.F.i(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.q.d.put(this.F.m(i4), view2);
            }
        }
    }

    public void k(boolean z) {
        if (z) {
            this.q.a.clear();
            this.q.b.clear();
            this.q.c.b();
            return;
        }
        this.r.a.clear();
        this.r.b.clear();
        this.r.c.b();
    }

    @Override // 
    /* renamed from: l */
    public bn clone() {
        try {
            bn bnVar = (bn) super.clone();
            bnVar.C = new ArrayList<>();
            bnVar.q = new in();
            bnVar.r = new in();
            bnVar.u = null;
            bnVar.v = null;
            return bnVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator m(ViewGroup viewGroup, hn hnVar, hn hnVar2) {
        return null;
    }

    public void n(ViewGroup viewGroup, in inVar, in inVar2, ArrayList<hn> arrayList, ArrayList<hn> arrayList2) {
        Animator m;
        int i;
        int i2;
        View view;
        Animator animator;
        hn hnVar;
        Animator animator2;
        hn hnVar2;
        o4<Animator, d> w = w();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = RecyclerView.FOREVER_NS;
        int i3 = 0;
        while (i3 < size) {
            hn hnVar3 = arrayList.get(i3);
            hn hnVar4 = arrayList2.get(i3);
            if (hnVar3 != null && !hnVar3.c.contains(this)) {
                hnVar3 = null;
            }
            if (hnVar4 != null && !hnVar4.c.contains(this)) {
                hnVar4 = null;
            }
            if (hnVar3 != null || hnVar4 != null) {
                if ((hnVar3 == null || hnVar4 == null || E(hnVar3, hnVar4)) && (m = m(viewGroup, hnVar3, hnVar4)) != null) {
                    if (hnVar4 != null) {
                        view = hnVar4.b;
                        String[] C = C();
                        if (C != null && C.length > 0) {
                            hnVar2 = new hn(view);
                            i = size;
                            hn hnVar5 = inVar2.a.get(view);
                            if (hnVar5 != null) {
                                int i4 = 0;
                                while (i4 < C.length) {
                                    hnVar2.a.put(C[i4], hnVar5.a.get(C[i4]));
                                    i4++;
                                    i3 = i3;
                                    hnVar5 = hnVar5;
                                }
                            }
                            i2 = i3;
                            int size2 = w.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = m;
                                    break;
                                }
                                d dVar = w.get(w.i(i5));
                                if (dVar.c != null && dVar.a == view && dVar.b.equals(t()) && dVar.c.equals(hnVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator2 = m;
                            hnVar2 = null;
                        }
                        animator = animator2;
                        hnVar = hnVar2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = hnVar3.b;
                        animator = m;
                        hnVar = null;
                    }
                    if (animator != null) {
                        en enVar = this.D;
                        if (enVar != null) {
                            long c2 = enVar.c(viewGroup, this, hnVar3, hnVar4);
                            sparseIntArray.put(this.C.size(), (int) c2);
                            j = Math.min(c2, j);
                        }
                        w.put(animator, new d(view, t(), this, rn.d(viewGroup), hnVar));
                        this.C.add(animator);
                        j = j;
                    }
                    i3 = i2 + 1;
                    size = i;
                }
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator3 = this.C.get(sparseIntArray.keyAt(i6));
                animator3.setStartDelay((sparseIntArray.valueAt(i6) - j) + animator3.getStartDelay());
            }
        }
    }

    public void o() {
        int i = this.y - 1;
        this.y = i;
        if (i == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).e(this);
                }
            }
            for (int i3 = 0; i3 < this.q.c.l(); i3++) {
                View m = this.q.c.m(i3);
                if (m != null) {
                    ac.A0(m, false);
                }
            }
            for (int i4 = 0; i4 < this.r.c.l(); i4++) {
                View m2 = this.r.c.m(i4);
                if (m2 != null) {
                    ac.A0(m2, false);
                }
            }
            this.A = true;
        }
    }

    public long p() {
        return this.d;
    }

    public e q() {
        return this.E;
    }

    public TimeInterpolator r() {
        return this.e;
    }

    public hn s(View view, boolean z) {
        fn fnVar = this.s;
        if (fnVar != null) {
            return fnVar.s(view, z);
        }
        ArrayList<hn> arrayList = z ? this.u : this.v;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            hn hnVar = arrayList.get(i2);
            if (hnVar == null) {
                return null;
            }
            if (hnVar.b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            return (z ? this.v : this.u).get(i);
        }
        return null;
    }

    public String t() {
        return this.b;
    }

    public String toString() {
        return a0(C0059ao.a(2298));
    }

    public vm u() {
        return this.G;
    }

    public en v() {
        return this.D;
    }

    public long x() {
        return this.c;
    }

    public List<Integer> y() {
        return this.f;
    }

    public List<String> z() {
        return this.h;
    }
}
