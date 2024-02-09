package defpackage;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import defpackage.bf;
import myunmn.C0059ao;

/* compiled from: AxisPay */
@Deprecated
/* renamed from: ee  reason: default package */
/* loaded from: classes.dex */
public abstract class ee extends no {
    public final FragmentManager c;
    public final int d;
    public je e;
    public Fragment f;
    public boolean g;

    @Deprecated
    public ee(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public static String v(int i, long j) {
        return C0059ao.a(4766) + i + C0059ao.a(4767) + j;
    }

    @Override // defpackage.no
    public void a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.e == null) {
            this.e = this.c.n();
        }
        this.e.n(fragment);
        if (fragment.equals(this.f)) {
            this.f = null;
        }
    }

    @Override // defpackage.no
    public void c(ViewGroup viewGroup) {
        je jeVar = this.e;
        if (jeVar != null) {
            if (!this.g) {
                try {
                    this.g = true;
                    jeVar.m();
                } finally {
                    this.g = false;
                }
            }
            this.e = null;
        }
    }

    @Override // defpackage.no
    public Object h(ViewGroup viewGroup, int i) {
        if (this.e == null) {
            this.e = this.c.n();
        }
        long u = u(i);
        Fragment j0 = this.c.j0(v(viewGroup.getId(), u));
        if (j0 != null) {
            this.e.i(j0);
        } else {
            j0 = t(i);
            this.e.d(viewGroup.getId(), j0, v(viewGroup.getId(), u));
        }
        if (j0 != this.f) {
            j0.setMenuVisibility(false);
            if (this.d == 1) {
                this.e.t(j0, bf.c.STARTED);
            } else {
                j0.setUserVisibleHint(false);
            }
        }
        return j0;
    }

    @Override // defpackage.no
    public boolean i(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // defpackage.no
    public void l(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // defpackage.no
    public Parcelable m() {
        return null;
    }

    @Override // defpackage.no
    public void o(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.d == 1) {
                    if (this.e == null) {
                        this.e = this.c.n();
                    }
                    this.e.t(this.f, bf.c.STARTED);
                } else {
                    this.f.setUserVisibleHint(false);
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
            this.f = fragment;
        }
    }

    @Override // defpackage.no
    public void r(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException(C0059ao.a(4768) + this + C0059ao.a(4769));
    }

    public abstract Fragment t(int i);

    public long u(int i) {
        return i;
    }

    public ee(FragmentManager fragmentManager, int i) {
        this.e = null;
        this.f = null;
        this.c = fragmentManager;
        this.d = i;
    }
}
