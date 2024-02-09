package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AxisPay */
@SuppressLint({"RestrictedApi"})
/* renamed from: tm  reason: default package */
/* loaded from: classes.dex */
public class tm extends me {

    /* compiled from: AxisPay */
    /* renamed from: tm$a */
    /* loaded from: classes.dex */
    public class a extends bn.e {
        public a(tm tmVar, Rect rect) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: tm$b */
    /* loaded from: classes.dex */
    public class b implements bn.f {
        public final /* synthetic */ View a;
        public final /* synthetic */ ArrayList b;

        public b(tm tmVar, View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // defpackage.bn.f
        public void a(bn bnVar) {
        }

        @Override // defpackage.bn.f
        public void b(bn bnVar) {
        }

        @Override // defpackage.bn.f
        public void c(bn bnVar) {
        }

        @Override // defpackage.bn.f
        public void d(bn bnVar) {
        }

        @Override // defpackage.bn.f
        public void e(bn bnVar) {
            bnVar.O(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.b.get(i)).setVisibility(0);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: tm$c */
    /* loaded from: classes.dex */
    public class c extends cn {
        public final /* synthetic */ Object a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ ArrayList f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // defpackage.cn, defpackage.bn.f
        public void a(bn bnVar) {
            Object obj = this.a;
            if (obj != null) {
                tm.this.q(obj, this.b, null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                tm.this.q(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                tm.this.q(obj3, this.f, null);
            }
        }

        @Override // defpackage.bn.f
        public void e(bn bnVar) {
            bnVar.O(this);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: tm$d */
    /* loaded from: classes.dex */
    public class d extends bn.e {
        public d(tm tmVar, Rect rect) {
        }
    }

    public static boolean C(bn bnVar) {
        return (me.l(bnVar.y()) && me.l(bnVar.z()) && me.l(bnVar.A())) ? false : true;
    }

    @Override // defpackage.me
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        fn fnVar = (fn) obj;
        if (fnVar != null) {
            fnVar.B().clear();
            fnVar.B().addAll(arrayList2);
            q(fnVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.me
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        fn fnVar = new fn();
        fnVar.d0((bn) obj);
        return fnVar;
    }

    @Override // defpackage.me
    public void a(Object obj, View view) {
        if (obj != null) {
            ((bn) obj).b(view);
        }
    }

    @Override // defpackage.me
    public void b(Object obj, ArrayList<View> arrayList) {
        bn bnVar = (bn) obj;
        if (bnVar == null) {
            return;
        }
        int i = 0;
        if (bnVar instanceof fn) {
            fn fnVar = (fn) bnVar;
            int g0 = fnVar.g0();
            while (i < g0) {
                b(fnVar.f0(i), arrayList);
                i++;
            }
        } else if (C(bnVar) || !me.l(bnVar.B())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                bnVar.b(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.me
    public void c(ViewGroup viewGroup, Object obj) {
        dn.a(viewGroup, (bn) obj);
    }

    @Override // defpackage.me
    public boolean e(Object obj) {
        return obj instanceof bn;
    }

    @Override // defpackage.me
    public Object g(Object obj) {
        if (obj != null) {
            return ((bn) obj).clone();
        }
        return null;
    }

    @Override // defpackage.me
    public Object m(Object obj, Object obj2, Object obj3) {
        bn bnVar = (bn) obj;
        bn bnVar2 = (bn) obj2;
        bn bnVar3 = (bn) obj3;
        if (bnVar != null && bnVar2 != null) {
            fn fnVar = new fn();
            fnVar.d0(bnVar);
            fnVar.d0(bnVar2);
            fnVar.l0(1);
            bnVar = fnVar;
        } else if (bnVar == null) {
            bnVar = bnVar2 != null ? bnVar2 : null;
        }
        if (bnVar3 != null) {
            fn fnVar2 = new fn();
            if (bnVar != null) {
                fnVar2.d0(bnVar);
            }
            fnVar2.d0(bnVar3);
            return fnVar2;
        }
        return bnVar;
    }

    @Override // defpackage.me
    public Object n(Object obj, Object obj2, Object obj3) {
        fn fnVar = new fn();
        if (obj != null) {
            fnVar.d0((bn) obj);
        }
        if (obj2 != null) {
            fnVar.d0((bn) obj2);
        }
        if (obj3 != null) {
            fnVar.d0((bn) obj3);
        }
        return fnVar;
    }

    @Override // defpackage.me
    public void p(Object obj, View view) {
        if (obj != null) {
            ((bn) obj).P(view);
        }
    }

    @Override // defpackage.me
    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        bn bnVar = (bn) obj;
        int i = 0;
        if (bnVar instanceof fn) {
            fn fnVar = (fn) bnVar;
            int g0 = fnVar.g0();
            while (i < g0) {
                q(fnVar.f0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!C(bnVar)) {
            List<View> B = bnVar.B();
            if (B.size() == arrayList.size() && B.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    bnVar.b(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    bnVar.P(arrayList.get(size2));
                }
            }
        }
    }

    @Override // defpackage.me
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((bn) obj).a(new b(this, view, arrayList));
    }

    @Override // defpackage.me
    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((bn) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // defpackage.me
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((bn) obj).U(new d(this, rect));
        }
    }

    @Override // defpackage.me
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((bn) obj).U(new a(this, rect));
        }
    }

    @Override // defpackage.me
    public void z(Object obj, View view, ArrayList<View> arrayList) {
        fn fnVar = (fn) obj;
        List<View> B = fnVar.B();
        B.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            me.d(B, arrayList.get(i));
        }
        B.add(view);
        arrayList.add(view);
        b(fnVar, arrayList);
    }
}
