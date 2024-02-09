package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: x7  reason: default package */
/* loaded from: classes.dex */
public final class x7<T> {
    public final ab<ArrayList<T>> a = new bb(10);
    public final u4<T, ArrayList<T>> b = new u4<>();
    public final ArrayList<T> c = new ArrayList<>();
    public final HashSet<T> d = new HashSet<>();

    public void a(T t, T t2) {
        if (this.b.containsKey(t) && this.b.containsKey(t2)) {
            ArrayList<T> arrayList = this.b.get(t);
            if (arrayList == null) {
                arrayList = f();
                this.b.put(t, arrayList);
            }
            arrayList.add(t2);
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(5271));
    }

    public void b(T t) {
        if (this.b.containsKey(t)) {
            return;
        }
        this.b.put(t, null);
    }

    public void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m = this.b.m(i);
            if (m != null) {
                k(m);
            }
        }
        this.b.clear();
    }

    public boolean d(T t) {
        return this.b.containsKey(t);
    }

    public final void e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (!hashSet.contains(t)) {
            hashSet.add(t);
            ArrayList<T> arrayList2 = this.b.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    e(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
            return;
        }
        throw new RuntimeException(C0059ao.a(5272));
    }

    public final ArrayList<T> f() {
        ArrayList<T> b = this.a.b();
        return b == null ? new ArrayList<>() : b;
    }

    public List g(T t) {
        return this.b.get(t);
    }

    public List<T> h(T t) {
        int size = this.b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> m = this.b.m(i);
            if (m != null && m.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.b.i(i));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.c.clear();
        this.d.clear();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            e(this.b.i(i), this.c, this.d);
        }
        return this.c;
    }

    public boolean j(T t) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m = this.b.m(i);
            if (m != null && m.contains(t)) {
                return true;
            }
        }
        return false;
    }

    public final void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.a.a(arrayList);
    }
}
