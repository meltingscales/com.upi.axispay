package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import defpackage.aa;
import defpackage.pe;
import defpackage.td;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: qd  reason: default package */
/* loaded from: classes.dex */
public class qd extends pe {

    /* compiled from: AxisPay */
    /* renamed from: qd$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[pe.e.c.values().length];
            a = iArr;
            try {
                iArr[pe.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[pe.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[pe.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[pe.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qd$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ List b;
        public final /* synthetic */ pe.e c;

        public b(List list, pe.e eVar) {
            this.b = list;
            this.c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.contains(this.c)) {
                this.b.remove(this.c);
                qd.this.s(this.c);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qd$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ pe.e d;
        public final /* synthetic */ k e;

        public c(qd qdVar, ViewGroup viewGroup, View view, boolean z, pe.e eVar, k kVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = z;
            this.d = eVar;
            this.e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            if (this.c) {
                this.d.e().a(this.b);
            }
            this.e.a();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qd$d */
    /* loaded from: classes.dex */
    public class d implements aa.a {
        public final /* synthetic */ Animator a;

        public d(qd qdVar, Animator animator) {
            this.a = animator;
        }

        @Override // defpackage.aa.a
        public void a() {
            this.a.end();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qd$e */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ k c;

        /* compiled from: AxisPay */
        /* renamed from: qd$e$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.a.endViewTransition(eVar.b);
                e.this.c.a();
            }
        }

        public e(qd qdVar, ViewGroup viewGroup, View view, k kVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qd$f */
    /* loaded from: classes.dex */
    public class f implements aa.a {
        public final /* synthetic */ View a;
        public final /* synthetic */ ViewGroup b;
        public final /* synthetic */ k c;

        public f(qd qdVar, View view, ViewGroup viewGroup, k kVar) {
            this.a = view;
            this.b = viewGroup;
            this.c = kVar;
        }

        @Override // defpackage.aa.a
        public void a() {
            this.a.clearAnimation();
            this.b.endViewTransition(this.a);
            this.c.a();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qd$g */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        public final /* synthetic */ pe.e b;
        public final /* synthetic */ pe.e c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ o4 e;

        public g(qd qdVar, pe.e eVar, pe.e eVar2, boolean z, o4 o4Var) {
            this.b = eVar;
            this.c = eVar2;
            this.d = z;
            this.e = o4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            ke.f(this.b.f(), this.c.f(), this.d, this.e, false);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qd$h */
    /* loaded from: classes.dex */
    public class h implements Runnable {
        public final /* synthetic */ me b;
        public final /* synthetic */ View c;
        public final /* synthetic */ Rect d;

        public h(qd qdVar, me meVar, View view, Rect rect) {
            this.b = meVar;
            this.c = view;
            this.d = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.k(this.c, this.d);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qd$i */
    /* loaded from: classes.dex */
    public class i implements Runnable {
        public final /* synthetic */ ArrayList b;

        public i(qd qdVar, ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ke.B(this.b, 4);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qd$j */
    /* loaded from: classes.dex */
    public class j implements Runnable {
        public final /* synthetic */ m b;

        public j(qd qdVar, m mVar) {
            this.b = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.a();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qd$k */
    /* loaded from: classes.dex */
    public static class k extends l {
        public boolean c;
        public boolean d;
        public td.d e;

        public k(pe.e eVar, aa aaVar, boolean z) {
            super(eVar, aaVar);
            this.d = false;
            this.c = z;
        }

        public td.d e(Context context) {
            if (this.d) {
                return this.e;
            }
            td.d c = td.c(context, b().f(), b().e() == pe.e.c.VISIBLE, this.c);
            this.e = c;
            this.d = true;
            return c;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qd$l */
    /* loaded from: classes.dex */
    public static class l {
        public final pe.e a;
        public final aa b;

        public l(pe.e eVar, aa aaVar) {
            this.a = eVar;
            this.b = aaVar;
        }

        public void a() {
            this.a.d(this.b);
        }

        public pe.e b() {
            return this.a;
        }

        public aa c() {
            return this.b;
        }

        public boolean d() {
            pe.e.c cVar;
            pe.e.c c = pe.e.c.c(this.a.f().mView);
            pe.e.c e = this.a.e();
            return c == e || !(c == (cVar = pe.e.c.VISIBLE) || e == cVar);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qd$m */
    /* loaded from: classes.dex */
    public static class m extends l {
        public final Object c;
        public final boolean d;
        public final Object e;

        public m(pe.e eVar, aa aaVar, boolean z, boolean z2) {
            super(eVar, aaVar);
            Object exitTransition;
            Object enterTransition;
            boolean allowEnterTransitionOverlap;
            if (eVar.e() == pe.e.c.VISIBLE) {
                if (z) {
                    enterTransition = eVar.f().getReenterTransition();
                } else {
                    enterTransition = eVar.f().getEnterTransition();
                }
                this.c = enterTransition;
                if (z) {
                    allowEnterTransitionOverlap = eVar.f().getAllowReturnTransitionOverlap();
                } else {
                    allowEnterTransitionOverlap = eVar.f().getAllowEnterTransitionOverlap();
                }
                this.d = allowEnterTransitionOverlap;
            } else {
                if (z) {
                    exitTransition = eVar.f().getReturnTransition();
                } else {
                    exitTransition = eVar.f().getExitTransition();
                }
                this.c = exitTransition;
                this.d = true;
            }
            if (!z2) {
                this.e = null;
            } else if (z) {
                this.e = eVar.f().getSharedElementReturnTransition();
            } else {
                this.e = eVar.f().getSharedElementEnterTransition();
            }
        }

        public me e() {
            me f = f(this.c);
            me f2 = f(this.e);
            if (f == null || f2 == null || f == f2) {
                return f != null ? f : f2;
            }
            throw new IllegalArgumentException(C0059ao.a(12781) + b().f() + C0059ao.a(12782) + this.c + C0059ao.a(12783) + this.e);
        }

        public final me f(Object obj) {
            if (obj == null) {
                return null;
            }
            me meVar = ke.b;
            if (meVar == null || !meVar.e(obj)) {
                me meVar2 = ke.c;
                if (meVar2 == null || !meVar2.e(obj)) {
                    throw new IllegalArgumentException(C0059ao.a(12784) + obj + C0059ao.a(12785) + b().f() + C0059ao.a(12786));
                }
                return meVar2;
            }
            return meVar;
        }

        public Object g() {
            return this.e;
        }

        public Object h() {
            return this.c;
        }

        public boolean i() {
            return this.e != null;
        }

        public boolean j() {
            return this.d;
        }
    }

    public qd(ViewGroup viewGroup) {
        super(viewGroup);
    }

    @Override // defpackage.pe
    public void f(List<pe.e> list, boolean z) {
        pe.e eVar = null;
        pe.e eVar2 = null;
        for (pe.e eVar3 : list) {
            pe.e.c c2 = pe.e.c.c(eVar3.f().mView);
            int i2 = a.a[eVar3.e().ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                if (i2 == 4 && c2 != pe.e.c.VISIBLE) {
                    eVar2 = eVar3;
                }
            } else if (c2 == pe.e.c.VISIBLE && eVar == null) {
                eVar = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<pe.e> arrayList3 = new ArrayList(list);
        for (pe.e eVar4 : list) {
            aa aaVar = new aa();
            eVar4.j(aaVar);
            arrayList.add(new k(eVar4, aaVar, z));
            aa aaVar2 = new aa();
            eVar4.j(aaVar2);
            boolean z2 = false;
            if (z) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, aaVar2, z, z2));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z2 = true;
                arrayList2.add(new m(eVar4, aaVar2, z, z2));
                eVar4.a(new b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, aaVar2, z, z2));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z2 = true;
                arrayList2.add(new m(eVar4, aaVar2, z, z2));
                eVar4.a(new b(arrayList3, eVar4));
            }
        }
        Map<pe.e, Boolean> x = x(arrayList2, arrayList3, z, eVar, eVar2);
        w(arrayList, arrayList3, x.containsValue(Boolean.TRUE), x);
        for (pe.e eVar5 : arrayList3) {
            s(eVar5);
        }
        arrayList3.clear();
    }

    public void s(pe.e eVar) {
        eVar.e().a(eVar.f().mView);
    }

    public void t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (cc.a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    t(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void u(Map<String, View> map, View view) {
        String M = ac.M(view);
        if (M != null) {
            map.put(M, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    public void v(o4<String, View> o4Var, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = o4Var.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(ac.M(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    public final void w(List<k> list, List<pe.e> list2, boolean z, Map<pe.e, Boolean> map) {
        ViewGroup m2 = m();
        Context context = m2.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (k kVar : list) {
            if (kVar.d()) {
                kVar.a();
            } else {
                td.d e2 = kVar.e(context);
                if (e2 == null) {
                    kVar.a();
                } else {
                    Animator animator = e2.b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        pe.e b2 = kVar.b();
                        Fragment f2 = b2.f();
                        if (Boolean.TRUE.equals(map.get(b2))) {
                            if (FragmentManager.I0(2)) {
                                String str = C0059ao.a(140) + f2 + C0059ao.a(141);
                            }
                            kVar.a();
                        } else {
                            boolean z3 = b2.e() == pe.e.c.GONE;
                            if (z3) {
                                list2.remove(b2);
                            }
                            View view = f2.mView;
                            m2.startViewTransition(view);
                            animator.addListener(new c(this, m2, view, z3, b2, kVar));
                            animator.setTarget(view);
                            animator.start();
                            kVar.c().c(new d(this, animator));
                            z2 = true;
                        }
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            pe.e b3 = kVar2.b();
            Fragment f3 = b3.f();
            String a2 = C0059ao.a(142);
            if (z) {
                if (FragmentManager.I0(2)) {
                    String str2 = a2 + f3 + C0059ao.a(143);
                }
                kVar2.a();
            } else if (z2) {
                if (FragmentManager.I0(2)) {
                    String str3 = a2 + f3 + C0059ao.a(144);
                }
                kVar2.a();
            } else {
                View view2 = f3.mView;
                td.d e3 = kVar2.e(context);
                db.e(e3);
                Animation animation = e3.a;
                db.e(animation);
                Animation animation2 = animation;
                if (b3.e() != pe.e.c.REMOVED) {
                    view2.startAnimation(animation2);
                    kVar2.a();
                } else {
                    m2.startViewTransition(view2);
                    td.e eVar = new td.e(animation2, m2, view2);
                    eVar.setAnimationListener(new e(this, m2, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.c().c(new f(this, view2, m2, kVar2));
            }
        }
    }

    public final Map<pe.e, Boolean> x(List<m> list, List<pe.e> list2, boolean z, pe.e eVar, pe.e eVar2) {
        Iterator<m> it;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        pe.e eVar3;
        pe.e eVar4;
        View view2;
        Object n;
        o4 o4Var;
        ArrayList<View> arrayList3;
        qd qdVar;
        pe.e eVar5;
        ArrayList<View> arrayList4;
        Rect rect;
        me meVar;
        pe.e eVar6;
        View view3;
        r8 enterTransitionCallback;
        r8 exitTransitionCallback;
        ArrayList<String> arrayList5;
        View view4;
        View view5;
        String q;
        ArrayList<String> arrayList6;
        qd qdVar2 = this;
        boolean z2 = z;
        pe.e eVar7 = eVar;
        pe.e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        me meVar2 = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                me e2 = mVar.e();
                if (meVar2 == null) {
                    meVar2 = e2;
                } else if (e2 != null && meVar2 != e2) {
                    throw new IllegalArgumentException(C0059ao.a(145) + mVar.b().f() + C0059ao.a(146) + mVar.h() + C0059ao.a(147));
                }
            }
        }
        if (meVar2 == null) {
            for (m mVar2 : list) {
                hashMap.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return hashMap;
        }
        View view6 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList7 = new ArrayList<>();
        ArrayList<View> arrayList8 = new ArrayList<>();
        o4 o4Var2 = new o4();
        Object obj3 = null;
        View view7 = null;
        boolean z3 = false;
        for (m mVar3 : list) {
            if (!mVar3.i() || eVar7 == null || eVar8 == null) {
                o4Var = o4Var2;
                arrayList3 = arrayList8;
                qdVar = qdVar2;
                eVar5 = eVar7;
                arrayList4 = arrayList7;
                rect = rect2;
                meVar = meVar2;
                eVar6 = eVar8;
                view3 = view6;
                view7 = view7;
            } else {
                Object B = meVar2.B(meVar2.g(mVar3.g()));
                ArrayList<String> sharedElementSourceNames = eVar2.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.f().getSharedElementTargetNames();
                View view8 = view7;
                int i2 = 0;
                while (i2 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i2));
                    ArrayList<String> arrayList9 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i2));
                    }
                    i2++;
                    sharedElementTargetNames = arrayList9;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.f().getSharedElementTargetNames();
                if (!z2) {
                    enterTransitionCallback = eVar.f().getExitTransitionCallback();
                    exitTransitionCallback = eVar2.f().getEnterTransitionCallback();
                } else {
                    enterTransitionCallback = eVar.f().getEnterTransitionCallback();
                    exitTransitionCallback = eVar2.f().getExitTransitionCallback();
                }
                int i3 = 0;
                for (int size = sharedElementSourceNames.size(); i3 < size; size = size) {
                    o4Var2.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                    i3++;
                }
                o4 o4Var3 = new o4();
                qdVar2.u(o4Var3, eVar.f().mView);
                o4Var3.o(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    enterTransitionCallback.a(sharedElementSourceNames, o4Var3);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        String str = sharedElementSourceNames.get(size2);
                        View view9 = (View) o4Var3.get(str);
                        if (view9 == null) {
                            o4Var2.remove(str);
                            arrayList6 = sharedElementSourceNames;
                        } else {
                            arrayList6 = sharedElementSourceNames;
                            if (!str.equals(ac.M(view9))) {
                                o4Var2.put(ac.M(view9), (String) o4Var2.remove(str));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList6;
                    }
                    arrayList5 = sharedElementSourceNames;
                } else {
                    arrayList5 = sharedElementSourceNames;
                    o4Var2.o(o4Var3.keySet());
                }
                o4 o4Var4 = new o4();
                qdVar2.u(o4Var4, eVar2.f().mView);
                o4Var4.o(sharedElementTargetNames2);
                o4Var4.o(o4Var2.values());
                if (exitTransitionCallback != null) {
                    exitTransitionCallback.a(sharedElementTargetNames2, o4Var4);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str2 = sharedElementTargetNames2.get(size3);
                        View view10 = (View) o4Var4.get(str2);
                        if (view10 == null) {
                            String q2 = ke.q(o4Var2, str2);
                            if (q2 != null) {
                                o4Var2.remove(q2);
                            }
                        } else if (!str2.equals(ac.M(view10)) && (q = ke.q(o4Var2, str2)) != null) {
                            o4Var2.put(q, ac.M(view10));
                        }
                    }
                } else {
                    ke.y(o4Var2, o4Var4);
                }
                qdVar2.v(o4Var3, o4Var2.keySet());
                qdVar2.v(o4Var4, o4Var2.values());
                if (o4Var2.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    eVar5 = eVar;
                    o4Var = o4Var2;
                    arrayList3 = arrayList8;
                    qdVar = qdVar2;
                    arrayList4 = arrayList7;
                    rect = rect2;
                    view3 = view6;
                    meVar = meVar2;
                    view7 = view8;
                    obj3 = null;
                    eVar6 = eVar2;
                } else {
                    ke.f(eVar2.f(), eVar.f(), z2, o4Var3, true);
                    ArrayList<String> arrayList10 = arrayList5;
                    HashMap hashMap2 = hashMap;
                    View view11 = view6;
                    o4Var = o4Var2;
                    ArrayList<View> arrayList11 = arrayList8;
                    xb.a(m(), new g(this, eVar2, eVar, z, o4Var4));
                    arrayList7.addAll(o4Var3.values());
                    if (arrayList10.isEmpty()) {
                        view7 = view8;
                    } else {
                        View view12 = (View) o4Var3.get(arrayList10.get(0));
                        meVar2.v(B, view12);
                        view7 = view12;
                    }
                    arrayList3 = arrayList11;
                    arrayList3.addAll(o4Var4.values());
                    if (sharedElementTargetNames2.isEmpty() || (view5 = (View) o4Var4.get(sharedElementTargetNames2.get(0))) == null) {
                        qdVar = this;
                        view4 = view11;
                    } else {
                        qdVar = this;
                        xb.a(m(), new h(qdVar, meVar2, view5, rect2));
                        view4 = view11;
                        z3 = true;
                    }
                    meVar2.z(B, view4, arrayList7);
                    arrayList4 = arrayList7;
                    rect = rect2;
                    view3 = view4;
                    meVar = meVar2;
                    meVar2.t(B, null, null, null, null, B, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    hashMap = hashMap2;
                    hashMap.put(eVar5, bool);
                    eVar6 = eVar2;
                    hashMap.put(eVar6, bool);
                    obj3 = B;
                }
            }
            z2 = z;
            arrayList7 = arrayList4;
            qdVar2 = qdVar;
            rect2 = rect;
            view6 = view3;
            eVar8 = eVar6;
            o4Var2 = o4Var;
            arrayList8 = arrayList3;
            eVar7 = eVar5;
            meVar2 = meVar;
        }
        View view13 = view7;
        o4 o4Var5 = o4Var2;
        ArrayList<View> arrayList12 = arrayList8;
        qd qdVar3 = qdVar2;
        pe.e eVar9 = eVar7;
        ArrayList<View> arrayList13 = arrayList7;
        Rect rect3 = rect2;
        me meVar3 = meVar2;
        pe.e eVar10 = eVar8;
        View view14 = view6;
        ArrayList arrayList14 = new ArrayList();
        Iterator<m> it2 = list.iterator();
        Object obj4 = null;
        Object obj5 = null;
        while (it2.hasNext()) {
            m next = it2.next();
            if (next.d()) {
                hashMap.put(next.b(), Boolean.FALSE);
                next.a();
            } else {
                Object g2 = meVar3.g(next.h());
                pe.e b2 = next.b();
                boolean z4 = obj3 != null && (b2 == eVar9 || b2 == eVar10);
                if (g2 == null) {
                    if (!z4) {
                        hashMap.put(b2, Boolean.FALSE);
                        next.a();
                    }
                    arrayList2 = arrayList12;
                    arrayList = arrayList13;
                    it = it2;
                    view = view14;
                    n = obj4;
                    eVar3 = eVar10;
                    view2 = view13;
                } else {
                    it = it2;
                    ArrayList<View> arrayList15 = new ArrayList<>();
                    Object obj6 = obj4;
                    qdVar3.t(arrayList15, b2.f().mView);
                    if (z4) {
                        if (b2 == eVar9) {
                            arrayList15.removeAll(arrayList13);
                        } else {
                            arrayList15.removeAll(arrayList12);
                        }
                    }
                    if (arrayList15.isEmpty()) {
                        meVar3.a(g2, view14);
                        arrayList2 = arrayList12;
                        arrayList = arrayList13;
                        view = view14;
                        eVar4 = b2;
                        obj2 = obj5;
                        eVar3 = eVar10;
                        obj = obj6;
                    } else {
                        meVar3.b(g2, arrayList15);
                        view = view14;
                        obj = obj6;
                        arrayList = arrayList13;
                        obj2 = obj5;
                        arrayList2 = arrayList12;
                        eVar3 = eVar10;
                        meVar3.t(g2, g2, arrayList15, null, null, null, null);
                        if (b2.e() == pe.e.c.GONE) {
                            eVar4 = b2;
                            list2.remove(eVar4);
                            ArrayList<View> arrayList16 = new ArrayList<>(arrayList15);
                            arrayList16.remove(eVar4.f().mView);
                            meVar3.r(g2, eVar4.f().mView, arrayList16);
                            xb.a(m(), new i(qdVar3, arrayList15));
                        } else {
                            eVar4 = b2;
                        }
                    }
                    if (eVar4.e() == pe.e.c.VISIBLE) {
                        arrayList14.addAll(arrayList15);
                        if (z3) {
                            meVar3.u(g2, rect3);
                        }
                        view2 = view13;
                    } else {
                        view2 = view13;
                        meVar3.v(g2, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (next.j()) {
                        obj5 = meVar3.n(obj2, g2, null);
                        n = obj;
                    } else {
                        n = meVar3.n(obj, g2, null);
                        obj5 = obj2;
                    }
                }
                eVar10 = eVar3;
                obj4 = n;
                view13 = view2;
                view14 = view;
                arrayList13 = arrayList;
                arrayList12 = arrayList2;
                it2 = it;
            }
        }
        ArrayList<View> arrayList17 = arrayList12;
        ArrayList<View> arrayList18 = arrayList13;
        pe.e eVar11 = eVar10;
        Object m2 = meVar3.m(obj5, obj4, obj3);
        for (m mVar4 : list) {
            if (!mVar4.d()) {
                Object h2 = mVar4.h();
                pe.e b3 = mVar4.b();
                boolean z5 = obj3 != null && (b3 == eVar9 || b3 == eVar11);
                if (h2 != null || z5) {
                    if (!ac.V(m())) {
                        if (FragmentManager.I0(2)) {
                            String str3 = C0059ao.a(148) + m() + C0059ao.a(149) + b3;
                        }
                        mVar4.a();
                    } else {
                        meVar3.w(mVar4.b().f(), m2, mVar4.c(), new j(qdVar3, mVar4));
                    }
                }
            }
        }
        if (ac.V(m())) {
            ke.B(arrayList14, 4);
            ArrayList<String> o = meVar3.o(arrayList17);
            meVar3.c(m(), m2);
            meVar3.y(m(), arrayList18, arrayList17, o, o4Var5);
            ke.B(arrayList14, 0);
            meVar3.A(obj3, arrayList18, arrayList17);
            return hashMap;
        }
        return hashMap;
    }
}
