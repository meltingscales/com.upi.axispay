package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.vision.barcode.Barcode;
import defpackage.bf;
import defpackage.je;
import java.io.PrintWriter;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: pd  reason: default package */
/* loaded from: classes.dex */
public final class pd extends je implements FragmentManager.k, FragmentManager.o {
    public final FragmentManager r;
    public boolean s;
    public int t;

    public pd(FragmentManager fragmentManager) {
        super(fragmentManager.t0(), fragmentManager.w0() != null ? fragmentManager.w0().g().getClassLoader() : null);
        this.t = -1;
        this.r = fragmentManager;
    }

    public static boolean E(je.a aVar) {
        Fragment fragment = aVar.b;
        return (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) ? false : true;
    }

    public void A(boolean z) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            je.a aVar = this.a.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.n1(this.f));
                fragment.setSharedElementNames(this.o, this.n);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.r.r1(fragment, true);
                    this.r.i1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException(C0059ao.a(15112) + aVar.a);
                case 3:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.r.g(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.r.v1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.r.r1(fragment, true);
                    this.r.F0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.r.m(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.r.r1(fragment, true);
                    this.r.z(fragment);
                    break;
                case 8:
                    this.r.t1(null);
                    break;
                case 9:
                    this.r.t1(fragment);
                    break;
                case 10:
                    this.r.s1(fragment, aVar.g);
                    break;
            }
            if (!this.p && aVar.a != 3 && fragment != null && !FragmentManager.P) {
                this.r.S0(fragment);
            }
        }
        if (this.p || !z || FragmentManager.P) {
            return;
        }
        FragmentManager fragmentManager = this.r;
        fragmentManager.T0(fragmentManager.q, true);
    }

    public Fragment B(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.a.size()) {
            je.a aVar = this.a.get(i);
            int i2 = aVar.a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.b;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.a.add(i, new je.a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                je.a aVar2 = new je.a(3, fragment4);
                                aVar2.c = aVar.c;
                                aVar2.e = aVar.e;
                                aVar2.d = aVar.d;
                                aVar2.f = aVar.f;
                                this.a.add(i, aVar2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.a.remove(i);
                        i--;
                    } else {
                        aVar.a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.b);
                    Fragment fragment5 = aVar.b;
                    if (fragment5 == fragment2) {
                        this.a.add(i, new je.a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.a.add(i, new je.a(9, fragment2));
                        i++;
                        fragment2 = aVar.b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.b);
            i++;
        }
        return fragment2;
    }

    public boolean C(int i) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.a.get(i2).b;
            int i3 = fragment != null ? fragment.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public boolean D(ArrayList<pd> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.a.get(i4).b;
            int i5 = fragment != null ? fragment.mContainerId : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    pd pdVar = arrayList.get(i6);
                    int size2 = pdVar.a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = pdVar.a.get(i7).b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public boolean F() {
        for (int i = 0; i < this.a.size(); i++) {
            if (E(this.a.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void G() {
        if (this.q != null) {
            for (int i = 0; i < this.q.size(); i++) {
                this.q.get(i).run();
            }
            this.q = null;
        }
    }

    public void H(Fragment.l lVar) {
        for (int i = 0; i < this.a.size(); i++) {
            je.a aVar = this.a.get(i);
            if (E(aVar)) {
                aVar.b.setOnStartEnterTransitionListener(lVar);
            }
        }
    }

    public Fragment I(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            je.a aVar = this.a.get(size);
            int i = aVar.a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.b;
                            break;
                        case 10:
                            aVar.h = aVar.g;
                            break;
                    }
                }
                arrayList.add(aVar.b);
            }
            arrayList.remove(aVar.b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public String a() {
        return this.i;
    }

    @Override // androidx.fragment.app.FragmentManager.o
    public boolean b(ArrayList<pd> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.I0(2)) {
            String str = C0059ao.a(15113) + this;
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.g) {
            this.r.e(this);
            return true;
        }
        return true;
    }

    @Override // defpackage.je
    public int j() {
        return w(false);
    }

    @Override // defpackage.je
    public int k() {
        return w(true);
    }

    @Override // defpackage.je
    public void l() {
        o();
        this.r.d0(this, false);
    }

    @Override // defpackage.je
    public void m() {
        o();
        this.r.d0(this, true);
    }

    @Override // defpackage.je
    public je n(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.r) {
            throw new IllegalStateException(C0059ao.a(15114) + fragment.toString() + C0059ao.a(15115));
        }
        super.n(fragment);
        return this;
    }

    @Override // defpackage.je
    public void p(int i, Fragment fragment, String str, int i2) {
        super.p(i, fragment, str, i2);
        fragment.mFragmentManager = this.r;
    }

    @Override // defpackage.je
    public je q(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.r) {
            throw new IllegalStateException(C0059ao.a(15116) + fragment.toString() + C0059ao.a(15117));
        }
        super.q(fragment);
        return this;
    }

    @Override // defpackage.je
    public je t(Fragment fragment, bf.c cVar) {
        if (fragment.mFragmentManager == this.r) {
            bf.c cVar2 = bf.c.INITIALIZED;
            String a = C0059ao.a(15118);
            if (cVar == cVar2 && fragment.mState > -1) {
                throw new IllegalArgumentException(a + cVar + C0059ao.a(15119));
            } else if (cVar != bf.c.DESTROYED) {
                super.t(fragment, cVar);
                return this;
            } else {
                throw new IllegalArgumentException(a + cVar + C0059ao.a(15120));
            }
        }
        throw new IllegalArgumentException(C0059ao.a(15121) + this.r);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) Barcode.ITF);
        sb.append(C0059ao.a(15122));
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(C0059ao.a(15123));
            sb.append(this.t);
        }
        if (this.i != null) {
            sb.append(C0059ao.a(15124));
            sb.append(this.i);
        }
        sb.append(C0059ao.a(15125));
        return sb.toString();
    }

    public void v(int i) {
        je.a aVar;
        if (this.g) {
            if (FragmentManager.I0(2)) {
                String str = C0059ao.a(15126) + this + C0059ao.a(15127) + i;
            }
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.a.get(i2).b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.I0(2)) {
                        String str2 = C0059ao.a(15128) + aVar.b + C0059ao.a(15129) + aVar.b.mBackStackNesting;
                    }
                }
            }
        }
    }

    public int w(boolean z) {
        if (!this.s) {
            if (FragmentManager.I0(2)) {
                String str = C0059ao.a(15130) + this;
                PrintWriter printWriter = new PrintWriter(new oe(C0059ao.a(15131)));
                x(C0059ao.a(15132), printWriter);
                printWriter.close();
            }
            this.s = true;
            if (this.g) {
                this.t = this.r.k();
            } else {
                this.t = -1;
            }
            this.r.a0(this, z);
            return this.t;
        }
        throw new IllegalStateException(C0059ao.a(15133));
    }

    public void x(String str, PrintWriter printWriter) {
        y(str, printWriter, true);
    }

    public void y(String str, PrintWriter printWriter, boolean z) {
        String a;
        if (z) {
            printWriter.print(str);
            printWriter.print(C0059ao.a(15134));
            printWriter.print(this.i);
            printWriter.print(C0059ao.a(15135));
            printWriter.print(this.t);
            printWriter.print(C0059ao.a(15136));
            printWriter.println(this.s);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print(C0059ao.a(15137));
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print(C0059ao.a(15138));
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(C0059ao.a(15139));
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print(C0059ao.a(15140));
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(C0059ao.a(15141));
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print(C0059ao.a(15142));
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(C0059ao.a(15143));
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print(C0059ao.a(15144));
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(C0059ao.a(15145));
                printWriter.println(this.m);
            }
        }
        if (this.a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println(C0059ao.a(15146));
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            je.a aVar = this.a.get(i);
            switch (aVar.a) {
                case 0:
                    a = C0059ao.a(15158);
                    break;
                case 1:
                    a = C0059ao.a(15157);
                    break;
                case 2:
                    a = C0059ao.a(15156);
                    break;
                case 3:
                    a = C0059ao.a(15155);
                    break;
                case 4:
                    a = C0059ao.a(15154);
                    break;
                case 5:
                    a = C0059ao.a(15153);
                    break;
                case 6:
                    a = C0059ao.a(15152);
                    break;
                case 7:
                    a = C0059ao.a(15151);
                    break;
                case 8:
                    a = C0059ao.a(15150);
                    break;
                case 9:
                    a = C0059ao.a(15149);
                    break;
                case 10:
                    a = C0059ao.a(15148);
                    break;
                default:
                    a = C0059ao.a(15147) + aVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print(C0059ao.a(15159));
            printWriter.print(i);
            printWriter.print(C0059ao.a(15160));
            printWriter.print(a);
            printWriter.print(C0059ao.a(15161));
            printWriter.println(aVar.b);
            if (z) {
                if (aVar.c != 0 || aVar.d != 0) {
                    printWriter.print(str);
                    printWriter.print(C0059ao.a(15162));
                    printWriter.print(Integer.toHexString(aVar.c));
                    printWriter.print(C0059ao.a(15163));
                    printWriter.println(Integer.toHexString(aVar.d));
                }
                if (aVar.e != 0 || aVar.f != 0) {
                    printWriter.print(str);
                    printWriter.print(C0059ao.a(15164));
                    printWriter.print(Integer.toHexString(aVar.e));
                    printWriter.print(C0059ao.a(15165));
                    printWriter.println(Integer.toHexString(aVar.f));
                }
            }
        }
    }

    public void z() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            je.a aVar = this.a.get(i);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f);
                fragment.setSharedElementNames(this.n, this.o);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.r.r1(fragment, false);
                    this.r.g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException(C0059ao.a(15166) + aVar.a);
                case 3:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.r.i1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.r.F0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.r.r1(fragment, false);
                    this.r.v1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.r.z(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.r.r1(fragment, false);
                    this.r.m(fragment);
                    break;
                case 8:
                    this.r.t1(fragment);
                    break;
                case 9:
                    this.r.t1(null);
                    break;
                case 10:
                    this.r.s1(fragment, aVar.h);
                    break;
            }
            if (!this.p && aVar.a != 1 && fragment != null && !FragmentManager.P) {
                this.r.S0(fragment);
            }
        }
        if (this.p || FragmentManager.P) {
            return;
        }
        FragmentManager fragmentManager = this.r;
        fragmentManager.T0(fragmentManager.q, true);
    }
}
