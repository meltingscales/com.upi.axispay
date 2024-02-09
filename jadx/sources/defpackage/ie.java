package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentState;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ie  reason: default package */
/* loaded from: classes.dex */
public class ie {
    public final ArrayList<Fragment> a = new ArrayList<>();
    public final HashMap<String, ge> b = new HashMap<>();
    public ce c;

    public void a(Fragment fragment) {
        if (!this.a.contains(fragment)) {
            synchronized (this.a) {
                this.a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException(C0059ao.a(8968) + fragment);
    }

    public void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.b.get(str) != null;
    }

    public void d(int i) {
        for (ge geVar : this.b.values()) {
            if (geVar != null) {
                geVar.u(i);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + C0059ao.a(8969);
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println(C0059ao.a(8970));
            for (ge geVar : this.b.values()) {
                printWriter.print(str);
                if (geVar != null) {
                    Fragment k = geVar.k();
                    printWriter.println(k);
                    k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(C0059ao.a(8971));
                }
            }
        }
        int size = this.a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println(C0059ao.a(8972));
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print(C0059ao.a(8973));
                printWriter.print(i);
                printWriter.print(C0059ao.a(8974));
                printWriter.println(this.a.get(i).toString());
            }
        }
    }

    public Fragment f(String str) {
        ge geVar = this.b.get(str);
        if (geVar != null) {
            return geVar.k();
        }
        return null;
    }

    public Fragment g(int i) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (ge geVar : this.b.values()) {
            if (geVar != null) {
                Fragment k = geVar.k();
                if (k.mFragmentId == i) {
                    return k;
                }
            }
        }
        return null;
    }

    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (ge geVar : this.b.values()) {
                if (geVar != null) {
                    Fragment k = geVar.k();
                    if (str.equals(k.mTag)) {
                        return k;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public Fragment i(String str) {
        Fragment findFragmentByWho;
        for (ge geVar : this.b.values()) {
            if (geVar != null && (findFragmentByWho = geVar.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.a.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.a.size()) {
                return -1;
            }
            Fragment fragment3 = this.a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List<ge> k() {
        ArrayList arrayList = new ArrayList();
        for (ge geVar : this.b.values()) {
            if (geVar != null) {
                arrayList.add(geVar);
            }
        }
        return arrayList;
    }

    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        for (ge geVar : this.b.values()) {
            if (geVar != null) {
                arrayList.add(geVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public ge m(String str) {
        return this.b.get(str);
    }

    public List<Fragment> n() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public ce o() {
        return this.c;
    }

    public void p(ge geVar) {
        Fragment k = geVar.k();
        if (c(k.mWho)) {
            return;
        }
        this.b.put(k.mWho, geVar);
        if (k.mRetainInstanceChangedWhileDetached) {
            if (k.mRetainInstance) {
                this.c.f(k);
            } else {
                this.c.n(k);
            }
            k.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.I0(2)) {
            String str = C0059ao.a(8975) + k;
        }
    }

    public void q(ge geVar) {
        Fragment k = geVar.k();
        if (k.mRetainInstance) {
            this.c.n(k);
        }
        if (this.b.put(k.mWho, null) != null && FragmentManager.I0(2)) {
            String str = C0059ao.a(8976) + k;
        }
    }

    public void r() {
        Iterator<Fragment> it = this.a.iterator();
        while (it.hasNext()) {
            ge geVar = this.b.get(it.next().mWho);
            if (geVar != null) {
                geVar.m();
            }
        }
        for (ge geVar2 : this.b.values()) {
            if (geVar2 != null) {
                geVar2.m();
                Fragment k = geVar2.k();
                if (k.mRemoving && !k.isInBackStack()) {
                    q(geVar2);
                }
            }
        }
    }

    public void s(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    public void t() {
        this.b.clear();
    }

    public void u(List<String> list) {
        this.a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f = f(str);
                if (f != null) {
                    if (FragmentManager.I0(2)) {
                        String str2 = C0059ao.a(8977) + str + C0059ao.a(8978) + f;
                    }
                    a(f);
                } else {
                    throw new IllegalStateException(C0059ao.a(8979) + str + C0059ao.a(8980));
                }
            }
        }
    }

    public ArrayList<FragmentState> v() {
        FragmentState s;
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.b.size());
        for (ge geVar : this.b.values()) {
            if (geVar != null) {
                Fragment k = geVar.k();
                arrayList.add(geVar.s());
                if (FragmentManager.I0(2)) {
                    String str = C0059ao.a(8981) + k + C0059ao.a(8982) + s.n;
                }
            }
        }
        return arrayList;
    }

    public ArrayList<String> w() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.a.size());
            Iterator<Fragment> it = this.a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (FragmentManager.I0(2)) {
                    String str = C0059ao.a(8983) + next.mWho + C0059ao.a(8984) + next;
                }
            }
            return arrayList;
        }
    }

    public void x(ce ceVar) {
        this.c = ceVar;
    }
}
