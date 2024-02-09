package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import defpackage.bf;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
@Deprecated
/* renamed from: he  reason: default package */
/* loaded from: classes.dex */
public abstract class he extends no {
    public final FragmentManager c;
    public final int d;
    public je e;
    public ArrayList<Fragment.SavedState> f;
    public ArrayList<Fragment> g;
    public Fragment h;
    public boolean i;

    @Deprecated
    public he(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // defpackage.no
    public void a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.e == null) {
            this.e = this.c.n();
        }
        while (this.f.size() <= i) {
            this.f.add(null);
        }
        this.f.set(i, fragment.isAdded() ? this.c.p1(fragment) : null);
        this.g.set(i, null);
        this.e.q(fragment);
        if (fragment.equals(this.h)) {
            this.h = null;
        }
    }

    @Override // defpackage.no
    public void c(ViewGroup viewGroup) {
        je jeVar = this.e;
        if (jeVar != null) {
            if (!this.i) {
                try {
                    this.i = true;
                    jeVar.m();
                } finally {
                    this.i = false;
                }
            }
            this.e = null;
        }
    }

    @Override // defpackage.no
    public Object h(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.g.size() <= i || (fragment = this.g.get(i)) == null) {
            if (this.e == null) {
                this.e = this.c.n();
            }
            Fragment t = t(i);
            if (this.f.size() > i && (savedState = this.f.get(i)) != null) {
                t.setInitialSavedState(savedState);
            }
            while (this.g.size() <= i) {
                this.g.add(null);
            }
            t.setMenuVisibility(false);
            if (this.d == 0) {
                t.setUserVisibleHint(false);
            }
            this.g.set(i, t);
            this.e.c(viewGroup.getId(), t);
            if (this.d == 1) {
                this.e.t(t, bf.c.STARTED);
            }
            return t;
        }
        return fragment;
    }

    @Override // defpackage.no
    public boolean i(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // defpackage.no
    public void l(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray(C0059ao.a(7862));
            this.f.clear();
            this.g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith(C0059ao.a(7863))) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment r0 = this.c.r0(bundle, str);
                    if (r0 != null) {
                        while (this.g.size() <= parseInt) {
                            this.g.add(null);
                        }
                        r0.setMenuVisibility(false);
                        this.g.set(parseInt, r0);
                    } else {
                        Log.w(C0059ao.a(7865), C0059ao.a(7864) + str);
                    }
                }
            }
        }
    }

    @Override // defpackage.no
    public Parcelable m() {
        Bundle bundle;
        if (this.f.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f.size()];
            this.f.toArray(savedStateArr);
            bundle.putParcelableArray(C0059ao.a(7866), savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = this.g.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.c.g1(bundle, C0059ao.a(7867) + i, fragment);
            }
        }
        return bundle;
    }

    @Override // defpackage.no
    public void o(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.d == 1) {
                    if (this.e == null) {
                        this.e = this.c.n();
                    }
                    this.e.t(this.h, bf.c.STARTED);
                } else {
                    this.h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.d == 1) {
                if (this.e == null) {
                    this.e = this.c.n();
                }
                this.e.t(fragment, bf.c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.h = fragment;
        }
    }

    @Override // defpackage.no
    public void r(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException(C0059ao.a(7868) + this + C0059ao.a(7869));
    }

    public abstract Fragment t(int i);

    public he(FragmentManager fragmentManager, int i) {
        this.e = null;
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.h = null;
        this.c = fragmentManager;
        this.d = i;
    }
}
