package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: AxisPay */
/* renamed from: dn  reason: default package */
/* loaded from: classes.dex */
public class dn {
    public static bn a = new qm();
    public static ThreadLocal<WeakReference<o4<ViewGroup, ArrayList<bn>>>> b = new ThreadLocal<>();
    public static ArrayList<ViewGroup> c = new ArrayList<>();

    /* compiled from: AxisPay */
    /* renamed from: dn$a */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public bn b;
        public ViewGroup c;

        /* compiled from: AxisPay */
        /* renamed from: dn$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0022a extends cn {
            public final /* synthetic */ o4 a;

            public C0022a(o4 o4Var) {
                this.a = o4Var;
            }

            @Override // defpackage.bn.f
            public void e(bn bnVar) {
                ((ArrayList) this.a.get(a.this.c)).remove(bnVar);
                bnVar.O(this);
            }
        }

        public a(bn bnVar, ViewGroup viewGroup) {
            this.b = bnVar;
            this.c = viewGroup;
        }

        public final void a() {
            this.c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (dn.c.remove(this.c)) {
                o4<ViewGroup, ArrayList<bn>> b = dn.b();
                ArrayList<bn> arrayList = b.get(this.c);
                ArrayList arrayList2 = null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    b.put(this.c, arrayList);
                } else if (arrayList.size() > 0) {
                    arrayList2 = new ArrayList(arrayList);
                }
                arrayList.add(this.b);
                this.b.a(new C0022a(b));
                this.b.j(this.c, false);
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((bn) it.next()).Q(this.c);
                    }
                }
                this.b.N(this.c);
                return true;
            }
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            dn.c.remove(this.c);
            ArrayList<bn> arrayList = dn.b().get(this.c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<bn> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().Q(this.c);
                }
            }
            this.b.k(true);
        }
    }

    public static void a(ViewGroup viewGroup, bn bnVar) {
        if (c.contains(viewGroup) || !ac.V(viewGroup)) {
            return;
        }
        c.add(viewGroup);
        if (bnVar == null) {
            bnVar = a;
        }
        bn clone = bnVar.clone();
        d(viewGroup, clone);
        an.c(viewGroup, null);
        c(viewGroup, clone);
    }

    public static o4<ViewGroup, ArrayList<bn>> b() {
        o4<ViewGroup, ArrayList<bn>> o4Var;
        WeakReference<o4<ViewGroup, ArrayList<bn>>> weakReference = b.get();
        if (weakReference == null || (o4Var = weakReference.get()) == null) {
            o4<ViewGroup, ArrayList<bn>> o4Var2 = new o4<>();
            b.set(new WeakReference<>(o4Var2));
            return o4Var2;
        }
        return o4Var;
    }

    public static void c(ViewGroup viewGroup, bn bnVar) {
        if (bnVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(bnVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void d(ViewGroup viewGroup, bn bnVar) {
        ArrayList<bn> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<bn> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().M(viewGroup);
            }
        }
        if (bnVar != null) {
            bnVar.j(viewGroup, true);
        }
        an b2 = an.b(viewGroup);
        if (b2 != null) {
            b2.a();
        }
    }
}
