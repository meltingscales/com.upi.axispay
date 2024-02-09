package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentState;
import defpackage.bf;
import defpackage.pe;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ge  reason: default package */
/* loaded from: classes.dex */
public class ge {
    public final ae a;
    public final ie b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    /* compiled from: AxisPay */
    /* renamed from: ge$a */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;

        public a(ge geVar, View view) {
            this.b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            ac.n0(this.b);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ge$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[bf.c.values().length];
            a = iArr;
            try {
                iArr[bf.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[bf.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[bf.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[bf.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ge(ae aeVar, ie ieVar, Fragment fragment) {
        this.a = aeVar;
        this.b = ieVar;
        this.c = fragment;
    }

    public void a() {
        if (FragmentManager.I0(3)) {
            String str = C0059ao.a(6542) + this.c;
        }
        Fragment fragment = this.c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        ae aeVar = this.a;
        Fragment fragment2 = this.c;
        aeVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    public void b() {
        int j = this.b.j(this.c);
        Fragment fragment = this.c;
        fragment.mContainer.addView(fragment.mView, j);
    }

    public void c() {
        if (FragmentManager.I0(3)) {
            String str = C0059ao.a(6543) + this.c;
        }
        Fragment fragment = this.c;
        Fragment fragment2 = fragment.mTarget;
        String a2 = C0059ao.a(6544);
        String a3 = C0059ao.a(6545);
        String a4 = C0059ao.a(6546);
        ge geVar = null;
        if (fragment2 != null) {
            ge m = this.b.m(fragment2.mWho);
            if (m != null) {
                Fragment fragment3 = this.c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                geVar = m;
            } else {
                throw new IllegalStateException(a4 + this.c + a3 + this.c.mTarget + a2);
            }
        } else {
            String str2 = fragment.mTargetWho;
            if (str2 != null && (geVar = this.b.m(str2)) == null) {
                throw new IllegalStateException(a4 + this.c + a3 + this.c.mTargetWho + a2);
            }
        }
        if (geVar != null && (FragmentManager.P || geVar.k().mState < 1)) {
            geVar.m();
        }
        Fragment fragment4 = this.c;
        fragment4.mHost = fragment4.mFragmentManager.w0();
        Fragment fragment5 = this.c;
        fragment5.mParentFragment = fragment5.mFragmentManager.z0();
        this.a.g(this.c, false);
        this.c.performAttach();
        this.a.b(this.c, false);
    }

    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.c;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int i = this.e;
        int i2 = b.a[fragment2.mMaxState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = Math.min(i, 5);
            } else if (i2 == 3) {
                i = Math.min(i, 1);
            } else if (i2 != 4) {
                i = Math.min(i, -1);
            } else {
                i = Math.min(i, 0);
            }
        }
        Fragment fragment3 = this.c;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                i = Math.max(this.e, 2);
                View view = this.c.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.e < 4 ? Math.min(i, fragment3.mState) : Math.min(i, 1);
            }
        }
        if (!this.c.mAdded) {
            i = Math.min(i, 1);
        }
        pe.e.b bVar = null;
        if (FragmentManager.P && (viewGroup = (fragment = this.c).mContainer) != null) {
            bVar = pe.n(viewGroup, fragment.getParentFragmentManager()).l(this);
        }
        if (bVar == pe.e.b.ADDING) {
            i = Math.min(i, 6);
        } else if (bVar == pe.e.b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.c;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, -1);
                }
            }
        }
        Fragment fragment5 = this.c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.I0(2)) {
            String str = C0059ao.a(6547) + i + C0059ao.a(6548) + this.c;
        }
        return i;
    }

    public void e() {
        if (FragmentManager.I0(3)) {
            String str = C0059ao.a(6549) + this.c;
        }
        Fragment fragment = this.c;
        if (!fragment.mIsCreated) {
            this.a.h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            ae aeVar = this.a;
            Fragment fragment3 = this.c;
            aeVar.c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.c.mState = 1;
    }

    public void f() {
        String a2;
        if (this.c.mFromLayout) {
            return;
        }
        if (FragmentManager.I0(3)) {
            String str = C0059ao.a(6550) + this.c;
        }
        Fragment fragment = this.c;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.c;
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment2.mContainerId;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) fragment2.mFragmentManager.q0().d(this.c.mContainerId);
                    if (viewGroup == null) {
                        Fragment fragment3 = this.c;
                        if (!fragment3.mRestored) {
                            try {
                                a2 = fragment3.getResources().getResourceName(this.c.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                a2 = C0059ao.a(6551);
                            }
                            throw new IllegalArgumentException(C0059ao.a(6552) + Integer.toHexString(this.c.mContainerId) + C0059ao.a(6553) + a2 + C0059ao.a(6554) + this.c);
                        }
                    }
                } else {
                    throw new IllegalArgumentException(C0059ao.a(6555) + this.c + C0059ao.a(6556));
                }
            }
        }
        Fragment fragment4 = this.c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.c.mView;
        if (view != null) {
            boolean z = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.c;
            fragment5.mView.setTag(nd.fragment_container_view_tag, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (ac.U(this.c.mView)) {
                ac.n0(this.c.mView);
            } else {
                View view2 = this.c.mView;
                view2.addOnAttachStateChangeListener(new a(this, view2));
            }
            this.c.performViewCreated();
            ae aeVar = this.a;
            Fragment fragment7 = this.c;
            aeVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.c.mView.getVisibility();
            float alpha = this.c.mView.getAlpha();
            if (FragmentManager.P) {
                this.c.setPostOnViewCreatedAlpha(alpha);
                Fragment fragment8 = this.c;
                if (fragment8.mContainer != null && visibility == 0) {
                    View findFocus = fragment8.mView.findFocus();
                    if (findFocus != null) {
                        this.c.setFocusedView(findFocus);
                        if (FragmentManager.I0(2)) {
                            String str2 = C0059ao.a(6557) + findFocus + C0059ao.a(6558) + this.c;
                        }
                    }
                    this.c.mView.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.c;
                if (visibility == 0 && fragment9.mContainer != null) {
                    z = true;
                }
                fragment9.mIsNewlyAdded = z;
            }
        }
        this.c.mState = 2;
    }

    public void g() {
        Fragment f;
        if (FragmentManager.I0(3)) {
            String str = C0059ao.a(6559) + this.c;
        }
        Fragment fragment = this.c;
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (z2 || this.b.o().p(this.c)) {
            yd<?> ydVar = this.c.mHost;
            if (ydVar instanceof sf) {
                z = this.b.o().m();
            } else if (ydVar.g() instanceof Activity) {
                z = true ^ ((Activity) ydVar.g()).isChangingConfigurations();
            }
            if (z2 || z) {
                this.b.o().g(this.c);
            }
            this.c.performDestroy();
            this.a.d(this.c, false);
            for (ge geVar : this.b.k()) {
                if (geVar != null) {
                    Fragment k = geVar.k();
                    if (this.c.mWho.equals(k.mTargetWho)) {
                        k.mTarget = this.c;
                        k.mTargetWho = null;
                    }
                }
            }
            Fragment fragment2 = this.c;
            String str2 = fragment2.mTargetWho;
            if (str2 != null) {
                fragment2.mTarget = this.b.f(str2);
            }
            this.b.q(this);
            return;
        }
        String str3 = this.c.mTargetWho;
        if (str3 != null && (f = this.b.f(str3)) != null && f.mRetainInstance) {
            this.c.mTarget = f;
        }
        this.c.mState = 0;
    }

    public void h() {
        View view;
        if (FragmentManager.I0(3)) {
            String str = C0059ao.a(6560) + this.c;
        }
        Fragment fragment = this.c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.c.performDestroyView();
        this.a.n(this.c, false);
        Fragment fragment2 = this.c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.j(null);
        this.c.mInLayout = false;
    }

    public void i() {
        if (FragmentManager.I0(3)) {
            String str = C0059ao.a(6561) + this.c;
        }
        this.c.performDetach();
        boolean z = false;
        this.a.e(this.c, false);
        Fragment fragment = this.c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.b.o().p(this.c)) {
            if (FragmentManager.I0(3)) {
                String str2 = C0059ao.a(6562) + this.c;
            }
            this.c.initState();
        }
    }

    public void j() {
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.I0(3)) {
                String str = C0059ao.a(6563) + this.c;
            }
            Fragment fragment2 = this.c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.c.mSavedFragmentState);
            View view = this.c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.c;
                fragment3.mView.setTag(nd.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.c.performViewCreated();
                ae aeVar = this.a;
                Fragment fragment5 = this.c;
                aeVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.c.mState = 2;
            }
        }
    }

    public Fragment k() {
        return this.c;
    }

    public final boolean l(View view) {
        if (view == this.c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.c.mView) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.d) {
            if (FragmentManager.I0(2)) {
                String str = C0059ao.a(6564) + k();
                return;
            }
            return;
        }
        try {
            this.d = true;
            while (true) {
                int d = d();
                Fragment fragment = this.c;
                int i = fragment.mState;
                if (d == i) {
                    if (FragmentManager.P && fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            pe n = pe.n(viewGroup, fragment.getParentFragmentManager());
                            if (this.c.mHidden) {
                                n.c(this);
                            } else {
                                n.e(this);
                            }
                        }
                        Fragment fragment2 = this.c;
                        FragmentManager fragmentManager = fragment2.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.G0(fragment2);
                        }
                        Fragment fragment3 = this.c;
                        fragment3.mHiddenChanged = false;
                        fragment3.onHiddenChanged(fragment3.mHidden);
                    }
                    return;
                } else if (d > i) {
                    switch (i + 1) {
                        case 0:
                            c();
                            continue;
                        case 1:
                            e();
                            continue;
                        case 2:
                            j();
                            f();
                            continue;
                        case 3:
                            a();
                            continue;
                        case 4:
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                pe.n(viewGroup2, fragment.getParentFragmentManager()).b(pe.e.c.b(this.c.mView.getVisibility()), this);
                            }
                            this.c.mState = 4;
                            continue;
                        case 5:
                            v();
                            continue;
                        case 6:
                            fragment.mState = 6;
                            continue;
                        case 7:
                            p();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i - 1) {
                        case -1:
                            i();
                            continue;
                        case 0:
                            g();
                            continue;
                        case 1:
                            h();
                            this.c.mState = 1;
                            continue;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            continue;
                        case 3:
                            if (FragmentManager.I0(3)) {
                                String str2 = C0059ao.a(6565) + this.c;
                            }
                            Fragment fragment4 = this.c;
                            if (fragment4.mView != null && fragment4.mSavedViewState == null) {
                                t();
                            }
                            Fragment fragment5 = this.c;
                            if (fragment5.mView != null && (viewGroup3 = fragment5.mContainer) != null) {
                                pe.n(viewGroup3, fragment5.getParentFragmentManager()).d(this);
                            }
                            this.c.mState = 3;
                            continue;
                        case 4:
                            w();
                            continue;
                        case 5:
                            fragment.mState = 5;
                            continue;
                        case 6:
                            n();
                            continue;
                        default:
                            continue;
                    }
                }
            }
        } finally {
            this.d = false;
        }
    }

    public void n() {
        if (FragmentManager.I0(3)) {
            String str = C0059ao.a(6566) + this.c;
        }
        this.c.performPause();
        this.a.f(this.c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray(C0059ao.a(6567));
        Fragment fragment2 = this.c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle(C0059ao.a(6568));
        Fragment fragment3 = this.c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString(C0059ao.a(6569));
        Fragment fragment4 = this.c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt(C0059ao.a(6570), 0);
        }
        Fragment fragment5 = this.c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean(C0059ao.a(6571), true);
        }
        Fragment fragment6 = this.c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    public void p() {
        if (FragmentManager.I0(3)) {
            String str = C0059ao.a(6572) + this.c;
        }
        View focusedView = this.c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.I0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0059ao.a(6573));
                sb.append(focusedView);
                sb.append(C0059ao.a(6574));
                sb.append(requestFocus ? C0059ao.a(6575) : C0059ao.a(6576));
                sb.append(C0059ao.a(6577));
                sb.append(this.c);
                sb.append(C0059ao.a(6578));
                sb.append(this.c.mView.findFocus());
                sb.toString();
            }
        }
        this.c.setFocusedView(null);
        this.c.performResume();
        this.a.i(this.c, false);
        Fragment fragment = this.c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle q() {
        Bundle bundle = new Bundle();
        this.c.performSaveInstanceState(bundle);
        this.a.j(this.c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.c.mView != null) {
            t();
        }
        if (this.c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(C0059ao.a(6579), this.c.mSavedViewState);
        }
        if (this.c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle(C0059ao.a(6580), this.c.mSavedViewRegistryState);
        }
        if (!this.c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(C0059ao.a(6581), this.c.mUserVisibleHint);
        }
        return bundle;
    }

    public Fragment.SavedState r() {
        Bundle q;
        if (this.c.mState <= -1 || (q = q()) == null) {
            return null;
        }
        return new Fragment.SavedState(q);
    }

    public FragmentState s() {
        FragmentState fragmentState = new FragmentState(this.c);
        Fragment fragment = this.c;
        if (fragment.mState > -1 && fragmentState.n == null) {
            Bundle q = q();
            fragmentState.n = q;
            if (this.c.mTargetWho != null) {
                if (q == null) {
                    fragmentState.n = new Bundle();
                }
                fragmentState.n.putString(C0059ao.a(6582), this.c.mTargetWho);
                int i = this.c.mTargetRequestCode;
                if (i != 0) {
                    fragmentState.n.putInt(C0059ao.a(6583), i);
                }
            }
        } else {
            fragmentState.n = fragment.mSavedFragmentState;
        }
        return fragmentState;
    }

    public void t() {
        if (this.c.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.c.mViewLifecycleOwner.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.c.mSavedViewRegistryState = bundle;
    }

    public void u(int i) {
        this.e = i;
    }

    public void v() {
        if (FragmentManager.I0(3)) {
            String str = C0059ao.a(6584) + this.c;
        }
        this.c.performStart();
        this.a.k(this.c, false);
    }

    public void w() {
        if (FragmentManager.I0(3)) {
            String str = C0059ao.a(6585) + this.c;
        }
        this.c.performStop();
        this.a.l(this.c, false);
    }

    public ge(ae aeVar, ie ieVar, ClassLoader classLoader, xd xdVar, FragmentState fragmentState) {
        this.a = aeVar;
        this.b = ieVar;
        Fragment a2 = xdVar.a(classLoader, fragmentState.b);
        this.c = a2;
        Bundle bundle = fragmentState.k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.setArguments(fragmentState.k);
        a2.mWho = fragmentState.c;
        a2.mFromLayout = fragmentState.d;
        a2.mRestored = true;
        a2.mFragmentId = fragmentState.e;
        a2.mContainerId = fragmentState.f;
        a2.mTag = fragmentState.g;
        a2.mRetainInstance = fragmentState.h;
        a2.mRemoving = fragmentState.i;
        a2.mDetached = fragmentState.j;
        a2.mHidden = fragmentState.l;
        a2.mMaxState = bf.c.values()[fragmentState.m];
        Bundle bundle2 = fragmentState.n;
        if (bundle2 != null) {
            a2.mSavedFragmentState = bundle2;
        } else {
            a2.mSavedFragmentState = new Bundle();
        }
        if (FragmentManager.I0(2)) {
            String str = C0059ao.a(6541) + a2;
        }
    }

    public ge(ae aeVar, ie ieVar, Fragment fragment, FragmentState fragmentState) {
        this.a = aeVar;
        this.b = ieVar;
        this.c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.n;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
