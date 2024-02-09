package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: AxisPay */
@SuppressLint({"UnknownNullness"})
/* renamed from: me  reason: default package */
/* loaded from: classes.dex */
public abstract class me {

    /* compiled from: AxisPay */
    /* renamed from: me$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ int b;
        public final /* synthetic */ ArrayList c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ ArrayList e;
        public final /* synthetic */ ArrayList f;

        public a(me meVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.b = i;
            this.c = arrayList;
            this.d = arrayList2;
            this.e = arrayList3;
            this.f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.b; i++) {
                ac.I0((View) this.c.get(i), (String) this.d.get(i));
                ac.I0((View) this.e.get(i), (String) this.f.get(i));
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: me$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ Map c;

        public b(me meVar, ArrayList arrayList, Map map) {
            this.b = arrayList;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.b.get(i);
                String M = ac.M(view);
                if (M != null) {
                    ac.I0(view, me.i(this.c, M));
                }
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: me$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ Map c;

        public c(me meVar, ArrayList arrayList, Map map) {
            this.b = arrayList;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.b.get(i);
                ac.I0(view, (String) this.c.get(ac.M(view)));
            }
        }
    }

    public static void d(List<View> list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        if (ac.M(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!h(list, childAt, size) && ac.M(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static boolean h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static String i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (cc.a(viewGroup)) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    f(arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    public abstract Object g(Object obj);

    public void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String M = ac.M(view);
            if (M != null) {
                map.put(M, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public void k(View view, Rect rect) {
        if (ac.U(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    public ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(ac.M(view));
            ac.I0(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    public void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        xb.a(viewGroup, new c(this, arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public void w(Fragment fragment, Object obj, aa aaVar, Runnable runnable) {
        runnable.run();
    }

    public void x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        xb.a(view, new b(this, arrayList, map));
    }

    public void y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String M = ac.M(view2);
            arrayList4.add(M);
            if (M != null) {
                ac.I0(view2, null);
                String str = map.get(M);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        ac.I0(arrayList2.get(i2), M);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        xb.a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList<View> arrayList);
}
