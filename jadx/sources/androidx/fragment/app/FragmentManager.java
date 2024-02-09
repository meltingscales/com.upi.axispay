package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import com.google.android.gms.vision.barcode.Barcode;
import defpackage.bf;
import defpackage.je;
import defpackage.ke;
import defpackage.td;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class FragmentManager {
    public static boolean O = false;
    public static boolean P = true;
    public defpackage.g<IntentSenderRequest> A;
    public defpackage.g<String[]> B;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList<pd> I;
    public ArrayList<Boolean> J;
    public ArrayList<Fragment> K;
    public ArrayList<q> L;
    public ce M;
    public boolean b;
    public ArrayList<pd> d;
    public ArrayList<Fragment> e;
    public OnBackPressedDispatcher g;
    public ArrayList<n> l;
    public yd<?> r;
    public ud s;
    public Fragment t;
    public Fragment u;
    public defpackage.g<Intent> z;
    public final ArrayList<o> a = new ArrayList<>();
    public final ie c = new ie();
    public final zd f = new zd(this);
    public final defpackage.b h = new c(false);
    public final AtomicInteger i = new AtomicInteger();
    public final Map<String, Bundle> j = Collections.synchronizedMap(new HashMap());
    public final Map<String, Object> k = Collections.synchronizedMap(new HashMap());
    public Map<Fragment, HashSet<aa>> m = Collections.synchronizedMap(new HashMap());
    public final ke.g n = new d();
    public final ae o = new ae(this);
    public final CopyOnWriteArrayList<de> p = new CopyOnWriteArrayList<>();
    public int q = -1;
    public xd v = null;
    public xd w = new e();
    public qe x = null;
    public qe y = new f(this);
    public ArrayDeque<LaunchedFragmentInfo> C = new ArrayDeque<>();
    public Runnable N = new g();

    /* compiled from: AxisPay */
    /* renamed from: androidx.fragment.app.FragmentManager$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements cf {
        public final /* synthetic */ String a;
        public final /* synthetic */ fe b;
        public final /* synthetic */ bf c;
        public final /* synthetic */ FragmentManager d;

        @Override // defpackage.cf
        public void d(ef efVar, bf.b bVar) {
            Bundle bundle;
            if (bVar == bf.b.ON_START && (bundle = (Bundle) this.d.j.get(this.a)) != null) {
                this.b.a(this.a, bundle);
                this.d.s(this.a);
            }
            if (bVar == bf.b.ON_DESTROY) {
                this.c.c(this);
                this.d.k.remove(this.a);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements defpackage.f<ActivityResult> {
        public a() {
        }

        @Override // defpackage.f
        /* renamed from: b */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.b;
            int i = pollFirst.c;
            Fragment i2 = FragmentManager.this.c.i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i2.onActivityResult(i, activityResult.c(), activityResult.a());
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b implements defpackage.f<Map<String, Boolean>> {
        public b() {
        }

        @Override // defpackage.f
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.b;
            int i2 = pollFirst.c;
            Fragment i3 = FragmentManager.this.c.i(str);
            if (i3 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i3.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c extends defpackage.b {
        public c(boolean z) {
            super(z);
        }

        @Override // defpackage.b
        public void b() {
            FragmentManager.this.E0();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class d implements ke.g {
        public d() {
        }

        @Override // defpackage.ke.g
        public void a(Fragment fragment, aa aaVar) {
            if (aaVar.b()) {
                return;
            }
            FragmentManager.this.h1(fragment, aaVar);
        }

        @Override // defpackage.ke.g
        public void b(Fragment fragment, aa aaVar) {
            FragmentManager.this.f(fragment, aaVar);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class e extends xd {
        public e() {
        }

        @Override // defpackage.xd
        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.w0().b(FragmentManager.this.w0().g(), str, null);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class f implements qe {
        public f(FragmentManager fragmentManager) {
        }

        @Override // defpackage.qe
        public pe a(ViewGroup viewGroup) {
            return new qd(viewGroup);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.c0(true);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Fragment c;

        public h(FragmentManager fragmentManager, ViewGroup viewGroup, View view, Fragment fragment) {
            this.a = viewGroup;
            this.b = view;
            this.c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            animator.removeListener(this);
            Fragment fragment = this.c;
            View view = fragment.mView;
            if (view == null || !fragment.mHidden) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class i implements de {
        public final /* synthetic */ Fragment b;

        public i(FragmentManager fragmentManager, Fragment fragment) {
            this.b = fragment;
        }

        @Override // defpackage.de
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.b.onAttachFragment(fragment);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class j implements defpackage.f<ActivityResult> {
        public j() {
        }

        @Override // defpackage.f
        /* renamed from: b */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.b;
            int i = pollFirst.c;
            Fragment i2 = FragmentManager.this.c.i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i2.onActivityResult(i, activityResult.c(), activityResult.a());
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface k {
        String a();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class l extends defpackage.i<IntentSenderRequest, ActivityResult> {
        @Override // defpackage.i
        /* renamed from: d */
        public Intent a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a = intentSenderRequest.a();
            if (a != null && (bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSenderRequest.b bVar = new IntentSenderRequest.b(intentSenderRequest.e());
                    bVar.b(null);
                    bVar.c(intentSenderRequest.d(), intentSenderRequest.c());
                    intentSenderRequest = bVar.a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.I0(2)) {
                String str = "CreateIntent created the following intent: " + intent;
            }
            return intent;
        }

        @Override // defpackage.i
        /* renamed from: e */
        public ActivityResult c(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class m {
        @Deprecated
        public abstract void a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle);

        public abstract void b(FragmentManager fragmentManager, Fragment fragment, Context context);

        public abstract void c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle);

        public abstract void d(FragmentManager fragmentManager, Fragment fragment);

        public abstract void e(FragmentManager fragmentManager, Fragment fragment);

        public abstract void f(FragmentManager fragmentManager, Fragment fragment);

        public abstract void g(FragmentManager fragmentManager, Fragment fragment, Context context);

        public abstract void h(FragmentManager fragmentManager, Fragment fragment, Bundle bundle);

        public abstract void i(FragmentManager fragmentManager, Fragment fragment);

        public abstract void j(FragmentManager fragmentManager, Fragment fragment, Bundle bundle);

        public abstract void k(FragmentManager fragmentManager, Fragment fragment);

        public abstract void l(FragmentManager fragmentManager, Fragment fragment);

        public abstract void m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle);

        public abstract void n(FragmentManager fragmentManager, Fragment fragment);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface n {
        void a();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface o {
        boolean b(ArrayList<pd> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class p implements o {
        public final String a;
        public final int b;
        public final int c;

        public p(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public boolean b(ArrayList<pd> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.u;
            if (fragment == null || this.b >= 0 || this.a != null || !fragment.getChildFragmentManager().c1()) {
                return FragmentManager.this.e1(arrayList, arrayList2, this.a, this.b, this.c);
            }
            return false;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class q implements Fragment.l {
        public final boolean a;
        public final pd b;
        public int c;

        public q(pd pdVar, boolean z) {
            this.a = z;
            this.b = pdVar;
        }

        @Override // androidx.fragment.app.Fragment.l
        public void a() {
            int i = this.c - 1;
            this.c = i;
            if (i != 0) {
                return;
            }
            this.b.r.q1();
        }

        @Override // androidx.fragment.app.Fragment.l
        public void b() {
            this.c++;
        }

        public void c() {
            pd pdVar = this.b;
            pdVar.r.v(pdVar, this.a, false, false);
        }

        public void d() {
            boolean z = this.c > 0;
            for (Fragment fragment : this.b.r.v0()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            pd pdVar = this.b;
            pdVar.r.v(pdVar, this.a, !z, true);
        }

        public boolean e() {
            return this.c == 0;
        }
    }

    public static Fragment C0(View view) {
        Object tag = view.getTag(nd.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean I0(int i2) {
        return O || Log.isLoggable("FragmentManager", i2);
    }

    public static void e0(ArrayList<pd> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            pd pdVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                pdVar.v(-1);
                pdVar.A(i2 == i3 + (-1));
            } else {
                pdVar.v(1);
                pdVar.z();
            }
            i2++;
        }
    }

    public static int n1(int i2) {
        if (i2 != 4097) {
            if (i2 != 4099) {
                return i2 != 8194 ? 0 : 4097;
            }
            return 4099;
        }
        return 8194;
    }

    public void A() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        U(4);
    }

    public Fragment A0() {
        return this.u;
    }

    public void B() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        U(0);
    }

    public qe B0() {
        qe qeVar = this.x;
        if (qeVar != null) {
            return qeVar;
        }
        Fragment fragment = this.t;
        if (fragment != null) {
            return fragment.mFragmentManager.B0();
        }
        return this.y;
    }

    public void C(Configuration configuration) {
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public boolean D(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public rf D0(Fragment fragment) {
        return this.M.l(fragment);
    }

    public void E() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        U(1);
    }

    public void E0() {
        c0(true);
        if (this.h.c()) {
            c1();
        } else {
            this.g.c();
        }
    }

    public boolean F(Menu menu, MenuInflater menuInflater) {
        if (this.q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.n()) {
            if (fragment != null && K0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment2 = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public void F0(Fragment fragment) {
        if (I0(2)) {
            String str = "hide: " + fragment;
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        u1(fragment);
    }

    public void G() {
        this.G = true;
        c0(true);
        Z();
        U(-1);
        this.r = null;
        this.s = null;
        this.t = null;
        if (this.g != null) {
            this.h.d();
            this.g = null;
        }
        defpackage.g<Intent> gVar = this.z;
        if (gVar != null) {
            gVar.c();
            this.A.c();
            this.B.c();
        }
    }

    public void G0(Fragment fragment) {
        if (fragment.mAdded && J0(fragment)) {
            this.D = true;
        }
    }

    public void H() {
        U(1);
    }

    public boolean H0() {
        return this.G;
    }

    public void I() {
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public void J(boolean z) {
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    public final boolean J0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.p();
    }

    public void K(Fragment fragment) {
        Iterator<de> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    public boolean K0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public boolean L(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean L0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.A0()) && L0(fragmentManager.t);
    }

    public void M(Menu menu) {
        if (this.q < 1) {
            return;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public boolean M0(int i2) {
        return this.q >= i2;
    }

    public final void N(Fragment fragment) {
        if (fragment == null || !fragment.equals(h0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public boolean N0() {
        return this.E || this.F;
    }

    public void O() {
        U(5);
    }

    public void O0(Fragment fragment, String[] strArr, int i2) {
        if (this.B != null) {
            this.C.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
            this.B.a(strArr);
            return;
        }
        this.r.l(fragment, strArr, i2);
    }

    public void P(boolean z) {
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    public void P0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (this.z != null) {
            this.C.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.z.a(intent);
            return;
        }
        this.r.o(fragment, intent, i2, bundle);
    }

    public boolean Q(Menu menu) {
        boolean z = false;
        if (this.q < 1) {
            return false;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment != null && K0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public void Q0(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.A != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (I0(2)) {
                    String str = "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment;
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            } else {
                intent2 = intent;
            }
            IntentSenderRequest.b bVar = new IntentSenderRequest.b(intentSender);
            bVar.b(intent2);
            bVar.c(i4, i3);
            IntentSenderRequest a2 = bVar.a();
            this.C.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
            if (I0(2)) {
                String str2 = "Fragment " + fragment + "is launching an IntentSender for result ";
            }
            this.A.a(a2);
            return;
        }
        this.r.q(fragment, intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public void R() {
        y1();
        N(this.u);
    }

    public final void R0(p4<Fragment> p4Var) {
        int size = p4Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment h2 = p4Var.h(i2);
            if (!h2.mAdded) {
                View requireView = h2.requireView();
                h2.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    public void S() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        U(7);
    }

    public void S0(Fragment fragment) {
        if (!this.c.c(fragment.mWho)) {
            if (I0(3)) {
                String str = "Ignoring moving " + fragment + " to state " + this.q + "since it is not added to " + this;
                return;
            }
            return;
        }
        U0(fragment);
        View view = fragment.mView;
        if (view != null && fragment.mIsNewlyAdded && fragment.mContainer != null) {
            float f2 = fragment.mPostponedAlpha;
            if (f2 > 0.0f) {
                view.setAlpha(f2);
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            td.d c2 = td.c(this.r.g(), fragment, true, fragment.getPopDirection());
            if (c2 != null) {
                Animation animation = c2.a;
                if (animation != null) {
                    fragment.mView.startAnimation(animation);
                } else {
                    c2.b.setTarget(fragment.mView);
                    c2.b.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            w(fragment);
        }
    }

    public void T() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        U(5);
    }

    public void T0(int i2, boolean z) {
        yd<?> ydVar;
        if (this.r == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.q) {
            this.q = i2;
            if (P) {
                this.c.r();
            } else {
                for (Fragment fragment : this.c.n()) {
                    S0(fragment);
                }
                for (ge geVar : this.c.k()) {
                    Fragment k2 = geVar.k();
                    if (!k2.mIsNewlyAdded) {
                        S0(k2);
                    }
                    if (k2.mRemoving && !k2.isInBackStack()) {
                        this.c.q(geVar);
                    }
                }
            }
            w1();
            if (this.D && (ydVar = this.r) != null && this.q == 7) {
                ydVar.r();
                this.D = false;
            }
        }
    }

    public final void U(int i2) {
        try {
            this.b = true;
            this.c.d(i2);
            T0(i2, false);
            if (P) {
                for (pe peVar : t()) {
                    peVar.j();
                }
            }
            this.b = false;
            c0(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public void U0(Fragment fragment) {
        V0(fragment, this.q);
    }

    public void V() {
        this.F = true;
        this.M.o(true);
        U(4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r2 != 5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void V0(androidx.fragment.app.Fragment r10, int r11) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.V0(androidx.fragment.app.Fragment, int):void");
    }

    public void W() {
        U(2);
    }

    public void W0() {
        if (this.r == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.M.o(false);
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void X() {
        if (this.H) {
            this.H = false;
            w1();
        }
    }

    public void X0(vd vdVar) {
        View view;
        for (ge geVar : this.c.k()) {
            Fragment k2 = geVar.k();
            if (k2.mContainerId == vdVar.getId() && (view = k2.mView) != null && view.getParent() == null) {
                k2.mContainer = vdVar;
                geVar.b();
            }
        }
    }

    public void Y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.e.get(i2).toString());
            }
        }
        ArrayList<pd> arrayList2 = this.d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                pd pdVar = this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(pdVar.toString());
                pdVar.x(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            int size3 = this.a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.a.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.s);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public void Y0(ge geVar) {
        Fragment k2 = geVar.k();
        if (k2.mDeferStart) {
            if (this.b) {
                this.H = true;
                return;
            }
            k2.mDeferStart = false;
            if (P) {
                geVar.m();
            } else {
                U0(k2);
            }
        }
    }

    public final void Z() {
        if (P) {
            for (pe peVar : t()) {
                peVar.j();
            }
        } else if (!this.m.isEmpty()) {
            for (Fragment fragment : this.m.keySet()) {
                o(fragment);
                U0(fragment);
            }
        }
    }

    public void Z0() {
        a0(new p(null, -1, 0), false);
    }

    public void a0(o oVar, boolean z) {
        if (!z) {
            if (this.r == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            q();
        }
        synchronized (this.a) {
            if (this.r == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.a.add(oVar);
            q1();
        }
    }

    public void a1(int i2, int i3) {
        if (i2 >= 0) {
            a0(new p(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public final void b0(boolean z) {
        if (!this.b) {
            if (this.r == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.r.h().getLooper()) {
                if (!z) {
                    q();
                }
                if (this.I == null) {
                    this.I = new ArrayList<>();
                    this.J = new ArrayList<>();
                }
                this.b = true;
                try {
                    g0(null, null);
                    return;
                } finally {
                    this.b = false;
                }
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public void b1(String str, int i2) {
        a0(new p(str, -1, i2), false);
    }

    public boolean c0(boolean z) {
        b0(z);
        boolean z2 = false;
        while (m0(this.I, this.J)) {
            this.b = true;
            try {
                j1(this.I, this.J);
                r();
                z2 = true;
            } catch (Throwable th) {
                r();
                throw th;
            }
        }
        y1();
        X();
        this.c.b();
        return z2;
    }

    public boolean c1() {
        return d1(null, -1, 0);
    }

    public final void d(p4<Fragment> p4Var) {
        int i2 = this.q;
        if (i2 < 1) {
            return;
        }
        int min = Math.min(i2, 5);
        for (Fragment fragment : this.c.n()) {
            if (fragment.mState < min) {
                V0(fragment, min);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    p4Var.add(fragment);
                }
            }
        }
    }

    public void d0(o oVar, boolean z) {
        if (z && (this.r == null || this.G)) {
            return;
        }
        b0(z);
        if (oVar.b(this.I, this.J)) {
            this.b = true;
            try {
                j1(this.I, this.J);
            } finally {
                r();
            }
        }
        y1();
        X();
        this.c.b();
    }

    public final boolean d1(String str, int i2, int i3) {
        c0(false);
        b0(true);
        Fragment fragment = this.u;
        if (fragment == null || i2 >= 0 || str != null || !fragment.getChildFragmentManager().c1()) {
            boolean e1 = e1(this.I, this.J, str, i2, i3);
            if (e1) {
                this.b = true;
                try {
                    j1(this.I, this.J);
                } finally {
                    r();
                }
            }
            y1();
            X();
            this.c.b();
            return e1;
        }
        return true;
    }

    public void e(pd pdVar) {
        if (this.d == null) {
            this.d = new ArrayList<>();
        }
        this.d.add(pdVar);
    }

    public boolean e1(ArrayList<pd> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<pd> arrayList3 = this.d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    pd pdVar = this.d.get(size2);
                    if ((str != null && str.equals(pdVar.a())) || (i2 >= 0 && i2 == pdVar.t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        pd pdVar2 = this.d.get(size2);
                        if (str == null || !str.equals(pdVar2.a())) {
                            if (i2 < 0 || i2 != pdVar2.t) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.d.size() - 1) {
                return false;
            }
            for (int size3 = this.d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void f(Fragment fragment, aa aaVar) {
        if (this.m.get(fragment) == null) {
            this.m.put(fragment, new HashSet<>());
        }
        this.m.get(fragment).add(aaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01be  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0(java.util.ArrayList<defpackage.pd> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.f0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final int f1(ArrayList<pd> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, p4<Fragment> p4Var) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            pd pdVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (pdVar.F() && !pdVar.D(arrayList, i5 + 1, i3)) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                q qVar = new q(pdVar, booleanValue);
                this.L.add(qVar);
                pdVar.H(qVar);
                if (booleanValue) {
                    pdVar.z();
                } else {
                    pdVar.A(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, pdVar);
                }
                d(p4Var);
            }
        }
        return i4;
    }

    public ge g(Fragment fragment) {
        if (I0(2)) {
            String str = "add: " + fragment;
        }
        ge x = x(fragment);
        fragment.mFragmentManager = this;
        this.c.p(x);
        if (!fragment.mDetached) {
            this.c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (J0(fragment)) {
                this.D = true;
            }
        }
        return x;
    }

    public final void g0(ArrayList<pd> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<q> arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            q qVar = this.L.get(i2);
            if (arrayList != null && !qVar.a && (indexOf2 = arrayList.indexOf(qVar.b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.L.remove(i2);
                i2--;
                size--;
                qVar.c();
            } else if (qVar.e() || (arrayList != null && qVar.b.D(arrayList, 0, arrayList.size()))) {
                this.L.remove(i2);
                i2--;
                size--;
                if (arrayList != null && !qVar.a && (indexOf = arrayList.indexOf(qVar.b)) != -1 && arrayList2 != null && arrayList2.get(indexOf).booleanValue()) {
                    qVar.c();
                } else {
                    qVar.d();
                }
            }
            i2++;
        }
    }

    public void g1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
            return;
        }
        x1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    public void h(de deVar) {
        this.p.add(deVar);
    }

    public Fragment h0(String str) {
        return this.c.f(str);
    }

    public void h1(Fragment fragment, aa aaVar) {
        HashSet<aa> hashSet = this.m.get(fragment);
        if (hashSet != null && hashSet.remove(aaVar) && hashSet.isEmpty()) {
            this.m.remove(fragment);
            if (fragment.mState < 5) {
                y(fragment);
                U0(fragment);
            }
        }
    }

    public void i(n nVar) {
        if (this.l == null) {
            this.l = new ArrayList<>();
        }
        this.l.add(nVar);
    }

    public Fragment i0(int i2) {
        return this.c.g(i2);
    }

    public void i1(Fragment fragment) {
        if (I0(2)) {
            String str = "remove: " + fragment + " nesting=" + fragment.mBackStackNesting;
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.c.s(fragment);
            if (J0(fragment)) {
                this.D = true;
            }
            fragment.mRemoving = true;
            u1(fragment);
        }
    }

    public void j(Fragment fragment) {
        this.M.f(fragment);
    }

    public Fragment j0(String str) {
        return this.c.h(str);
    }

    public final void j1(ArrayList<pd> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            g0(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!arrayList.get(i2).p) {
                    if (i3 != i2) {
                        f0(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (arrayList2.get(i2).booleanValue()) {
                        while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                            i3++;
                        }
                    }
                    f0(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                f0(arrayList, arrayList2, i3, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public int k() {
        return this.i.getAndIncrement();
    }

    public Fragment k0(String str) {
        return this.c.i(str);
    }

    public void k1(Fragment fragment) {
        this.M.n(fragment);
    }

    @SuppressLint({"SyntheticAccessor"})
    public void l(yd<?> ydVar, ud udVar, Fragment fragment) {
        String str;
        if (this.r == null) {
            this.r = ydVar;
            this.s = udVar;
            this.t = fragment;
            if (fragment != null) {
                h(new i(this, fragment));
            } else if (ydVar instanceof de) {
                h((de) ydVar);
            }
            if (this.t != null) {
                y1();
            }
            if (ydVar instanceof defpackage.c) {
                defpackage.c cVar = (defpackage.c) ydVar;
                OnBackPressedDispatcher c2 = cVar.c();
                this.g = c2;
                ef efVar = cVar;
                if (fragment != null) {
                    efVar = fragment;
                }
                c2.a(efVar, this.h);
            }
            if (fragment != null) {
                this.M = fragment.mFragmentManager.p0(fragment);
            } else if (ydVar instanceof sf) {
                this.M = ce.j(((sf) ydVar).getViewModelStore());
            } else {
                this.M = new ce(false);
            }
            this.M.o(N0());
            this.c.x(this.M);
            yd<?> ydVar2 = this.r;
            if (ydVar2 instanceof defpackage.h) {
                ActivityResultRegistry p2 = ((defpackage.h) ydVar2).p();
                if (fragment != null) {
                    str = fragment.mWho + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.z = p2.i(str2 + "StartActivityForResult", new defpackage.k(), new j());
                this.A = p2.i(str2 + "StartIntentSenderForResult", new l(), new a());
                this.B = p2.i(str2 + "RequestPermissions", new defpackage.j(), new b());
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void l0() {
        if (P) {
            for (pe peVar : t()) {
                peVar.k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }

    public final void l1() {
        if (this.l != null) {
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                this.l.get(i2).a();
            }
        }
    }

    public void m(Fragment fragment) {
        if (I0(2)) {
            String str = "attach: " + fragment;
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.c.a(fragment);
            if (I0(2)) {
                String str2 = "add from attach: " + fragment;
            }
            if (J0(fragment)) {
                this.D = true;
            }
        }
    }

    public final boolean m0(ArrayList<pd> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return false;
            }
            int size = this.a.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                z |= this.a.get(i2).b(arrayList, arrayList2);
            }
            this.a.clear();
            this.r.h().removeCallbacks(this.N);
            return z;
        }
    }

    public void m1(Parcelable parcelable) {
        ge geVar;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.b == null) {
            return;
        }
        this.c.t();
        Iterator<FragmentState> it = fragmentManagerState.b.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            if (next != null) {
                Fragment h2 = this.M.h(next.c);
                if (h2 != null) {
                    if (I0(2)) {
                        String str = "restoreSaveState: re-attaching retained " + h2;
                    }
                    geVar = new ge(this.o, this.c, h2, next);
                } else {
                    geVar = new ge(this.o, this.c, this.r.g().getClassLoader(), t0(), next);
                }
                Fragment k2 = geVar.k();
                k2.mFragmentManager = this;
                if (I0(2)) {
                    String str2 = "restoreSaveState: active (" + k2.mWho + "): " + k2;
                }
                geVar.o(this.r.g().getClassLoader());
                this.c.p(geVar);
                geVar.u(this.q);
            }
        }
        for (Fragment fragment : this.M.k()) {
            if (!this.c.c(fragment.mWho)) {
                if (I0(2)) {
                    String str3 = "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.b;
                }
                this.M.n(fragment);
                fragment.mFragmentManager = this;
                ge geVar2 = new ge(this.o, this.c, fragment);
                geVar2.u(1);
                geVar2.m();
                fragment.mRemoving = true;
                geVar2.m();
            }
        }
        this.c.u(fragmentManagerState.c);
        if (fragmentManagerState.d != null) {
            this.d = new ArrayList<>(fragmentManagerState.d.length);
            int i2 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.d;
                if (i2 >= backStackStateArr.length) {
                    break;
                }
                pd a2 = backStackStateArr[i2].a(this);
                if (I0(2)) {
                    String str4 = "restoreAllState: back stack #" + i2 + " (index " + a2.t + "): " + a2;
                    PrintWriter printWriter = new PrintWriter(new oe("FragmentManager"));
                    a2.y("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(a2);
                i2++;
            }
        } else {
            this.d = null;
        }
        this.i.set(fragmentManagerState.e);
        String str5 = fragmentManagerState.f;
        if (str5 != null) {
            Fragment h0 = h0(str5);
            this.u = h0;
            N(h0);
        }
        ArrayList<String> arrayList = fragmentManagerState.g;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Bundle bundle = fragmentManagerState.h.get(i3);
                bundle.setClassLoader(this.r.g().getClassLoader());
                this.j.put(arrayList.get(i3), bundle);
            }
        }
        this.C = new ArrayDeque<>(fragmentManagerState.i);
    }

    public je n() {
        return new pd(this);
    }

    public k n0(int i2) {
        return this.d.get(i2);
    }

    public final void o(Fragment fragment) {
        HashSet<aa> hashSet = this.m.get(fragment);
        if (hashSet != null) {
            Iterator<aa> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            y(fragment);
            this.m.remove(fragment);
        }
    }

    public int o0() {
        ArrayList<pd> arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public Parcelable o1() {
        int size;
        l0();
        Z();
        c0(true);
        this.E = true;
        this.M.o(true);
        ArrayList<FragmentState> v = this.c.v();
        BackStackState[] backStackStateArr = null;
        if (v.isEmpty()) {
            I0(2);
            return null;
        }
        ArrayList<String> w = this.c.w();
        ArrayList<pd> arrayList = this.d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i2 = 0; i2 < size; i2++) {
                backStackStateArr[i2] = new BackStackState(this.d.get(i2));
                if (I0(2)) {
                    String str = "saveAllState: adding back stack #" + i2 + ": " + this.d.get(i2);
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.b = v;
        fragmentManagerState.c = w;
        fragmentManagerState.d = backStackStateArr;
        fragmentManagerState.e = this.i.get();
        Fragment fragment = this.u;
        if (fragment != null) {
            fragmentManagerState.f = fragment.mWho;
        }
        fragmentManagerState.g.addAll(this.j.keySet());
        fragmentManagerState.h.addAll(this.j.values());
        fragmentManagerState.i = new ArrayList<>(this.C);
        return fragmentManagerState;
    }

    public boolean p() {
        boolean z = false;
        for (Fragment fragment : this.c.l()) {
            if (fragment != null) {
                z = J0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final ce p0(Fragment fragment) {
        return this.M.i(fragment);
    }

    public Fragment.SavedState p1(Fragment fragment) {
        ge m2 = this.c.m(fragment.mWho);
        if (m2 != null && m2.k().equals(fragment)) {
            return m2.r();
        }
        x1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    public final void q() {
        if (N0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public ud q0() {
        return this.s;
    }

    public void q1() {
        synchronized (this.a) {
            ArrayList<q> arrayList = this.L;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.a.size() == 1;
            if (z || z2) {
                this.r.h().removeCallbacks(this.N);
                this.r.h().post(this.N);
                y1();
            }
        }
    }

    public final void r() {
        this.b = false;
        this.J.clear();
        this.I.clear();
    }

    public Fragment r0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment h0 = h0(string);
        if (h0 != null) {
            return h0;
        }
        x1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    public void r1(Fragment fragment, boolean z) {
        ViewGroup s0 = s0(fragment);
        if (s0 == null || !(s0 instanceof vd)) {
            return;
        }
        ((vd) s0).setDrawDisappearingViewsLast(!z);
    }

    public final void s(String str) {
        this.j.remove(str);
    }

    public final ViewGroup s0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.s.e()) {
            View d2 = this.s.d(fragment.mContainerId);
            if (d2 instanceof ViewGroup) {
                return (ViewGroup) d2;
            }
        }
        return null;
    }

    public void s1(Fragment fragment, bf.c cVar) {
        if (fragment.equals(h0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final Set<pe> t() {
        HashSet hashSet = new HashSet();
        for (ge geVar : this.c.k()) {
            ViewGroup viewGroup = geVar.k().mContainer;
            if (viewGroup != null) {
                hashSet.add(pe.o(viewGroup, B0()));
            }
        }
        return hashSet;
    }

    public xd t0() {
        xd xdVar = this.v;
        if (xdVar != null) {
            return xdVar;
        }
        Fragment fragment = this.t;
        if (fragment != null) {
            return fragment.mFragmentManager.t0();
        }
        return this.w;
    }

    public void t1(Fragment fragment) {
        if (fragment != null && (!fragment.equals(h0(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.u;
        this.u = fragment;
        N(fragment2);
        N(this.u);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) Barcode.ITF);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.t)));
            sb.append("}");
        } else {
            yd<?> ydVar = this.r;
            if (ydVar != null) {
                sb.append(ydVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.r)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final Set<pe> u(ArrayList<pd> arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator<je.a> it = arrayList.get(i2).a.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(pe.n(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    public ie u0() {
        return this.c;
    }

    public final void u1(Fragment fragment) {
        ViewGroup s0 = s0(fragment);
        if (s0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        int i2 = nd.visible_removing_fragment_view_tag;
        if (s0.getTag(i2) == null) {
            s0.setTag(i2, fragment);
        }
        ((Fragment) s0.getTag(i2)).setPopDirection(fragment.getPopDirection());
    }

    public void v(pd pdVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            pdVar.A(z3);
        } else {
            pdVar.z();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(pdVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.q >= 1) {
            ke.C(this.r.g(), this.s, arrayList, arrayList2, 0, 1, true, this.n);
        }
        if (z3) {
            T0(this.q, true);
        }
        for (Fragment fragment : this.c.l()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && pdVar.C(fragment.mContainerId)) {
                float f2 = fragment.mPostponedAlpha;
                if (f2 > 0.0f) {
                    fragment.mView.setAlpha(f2);
                }
                if (z3) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    public List<Fragment> v0() {
        return this.c.n();
    }

    public void v1(Fragment fragment) {
        if (I0(2)) {
            String str = "show: " + fragment;
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final void w(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            td.d c2 = td.c(this.r.g(), fragment, !fragment.mHidden, fragment.getPopDirection());
            if (c2 != null && (animator = c2.b) != null) {
                animator.setTarget(fragment.mView);
                if (fragment.mHidden) {
                    if (fragment.isHideReplaced()) {
                        fragment.setHideReplaced(false);
                    } else {
                        ViewGroup viewGroup = fragment.mContainer;
                        View view = fragment.mView;
                        viewGroup.startViewTransition(view);
                        c2.b.addListener(new h(this, viewGroup, view, fragment));
                    }
                } else {
                    fragment.mView.setVisibility(0);
                }
                c2.b.start();
            } else {
                if (c2 != null) {
                    fragment.mView.startAnimation(c2.a);
                    c2.a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            }
        }
        G0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    public yd<?> w0() {
        return this.r;
    }

    public final void w1() {
        for (ge geVar : this.c.k()) {
            Y0(geVar);
        }
    }

    public ge x(Fragment fragment) {
        ge m2 = this.c.m(fragment.mWho);
        if (m2 != null) {
            return m2;
        }
        ge geVar = new ge(this.o, this.c, fragment);
        geVar.o(this.r.g().getClassLoader());
        geVar.u(this.q);
        return geVar;
    }

    public LayoutInflater.Factory2 x0() {
        return this.f;
    }

    public final void x1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new oe("FragmentManager"));
        yd<?> ydVar = this.r;
        if (ydVar != null) {
            try {
                ydVar.i("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            try {
                Y("  ", null, printWriter, new String[0]);
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
            }
        }
        throw runtimeException;
    }

    public final void y(Fragment fragment) {
        fragment.performDestroyView();
        this.o.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.j(null);
        fragment.mInLayout = false;
    }

    public ae y0() {
        return this.o;
    }

    public final void y1() {
        synchronized (this.a) {
            boolean z = true;
            if (!this.a.isEmpty()) {
                this.h.f(true);
            } else {
                this.h.f((o0() <= 0 || !L0(this.t)) ? false : false);
            }
        }
    }

    public void z(Fragment fragment) {
        if (I0(2)) {
            String str = "detach: " + fragment;
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (I0(2)) {
                String str2 = "remove from detach: " + fragment;
            }
            this.c.s(fragment);
            if (J0(fragment)) {
                this.D = true;
            }
            u1(fragment);
        }
    }

    public Fragment z0() {
        return this.t;
    }

    /* compiled from: AxisPay */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();
        public String b;
        public int c;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.b = str;
            this.c = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeInt(this.c);
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.b = parcel.readString();
            this.c = parcel.readInt();
        }
    }
}
