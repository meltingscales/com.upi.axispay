package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.view.Display;
import defpackage.bi;
import defpackage.ci;
import defpackage.di;
import defpackage.sh;
import defpackage.uh;
import defpackage.vh;
import defpackage.yh;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ji  reason: default package */
/* loaded from: classes.dex */
public abstract class ji extends uh {

    /* compiled from: AxisPay */
    /* renamed from: ji$a */
    /* loaded from: classes.dex */
    public static class a extends d {
        public a(Context context, f fVar) {
            super(context, fVar);
        }

        @Override // defpackage.ji.d, defpackage.ji.c, defpackage.ji.b
        public void P(b.C0028b c0028b, sh.a aVar) {
            super.P(c0028b, aVar);
            aVar.i(ai.a(c0028b.a));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ji$b */
    /* loaded from: classes.dex */
    public static class b extends ji implements bi.a, bi.g {
        public static final ArrayList<IntentFilter> u;
        public static final ArrayList<IntentFilter> v;
        public final f i;
        public final Object j;
        public final Object k;
        public final Object l;
        public final Object m;
        public int n;
        public boolean o;
        public boolean p;
        public final ArrayList<C0028b> q;
        public final ArrayList<c> r;
        public bi.e s;
        public bi.c t;

        /* compiled from: AxisPay */
        /* renamed from: ji$b$a */
        /* loaded from: classes.dex */
        public static final class a extends uh.e {
            public final Object a;

            public a(Object obj) {
                this.a = obj;
            }

            @Override // defpackage.uh.e
            public void f(int i) {
                bi.d.i(this.a, i);
            }

            @Override // defpackage.uh.e
            public void i(int i) {
                bi.d.j(this.a, i);
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: ji$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0028b {
            public final Object a;
            public final String b;
            public sh c;

            public C0028b(Object obj, String str) {
                this.a = obj;
                this.b = str;
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: ji$b$c */
        /* loaded from: classes.dex */
        public static final class c {
            public final yh.i a;
            public final Object b;

            public c(yh.i iVar, Object obj) {
                this.a = iVar;
                this.b = obj;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory(C0059ao.a(7876));
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            u = arrayList;
            arrayList.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory(C0059ao.a(7877));
            ArrayList<IntentFilter> arrayList2 = new ArrayList<>();
            v = arrayList2;
            arrayList2.add(intentFilter2);
        }

        public b(Context context, f fVar) {
            super(context);
            this.q = new ArrayList<>();
            this.r = new ArrayList<>();
            this.i = fVar;
            Object g = bi.g(context);
            this.j = g;
            this.k = H();
            this.l = I();
            this.m = bi.d(g, context.getResources().getString(rg.mr_user_route_category_name), false);
            U();
        }

        @Override // defpackage.ji
        public void B(yh.i iVar) {
            if (iVar.q() != this) {
                Object e = bi.e(this.j, this.m);
                c cVar = new c(iVar, e);
                bi.d.k(e, cVar);
                bi.f.e(e, this.l);
                V(cVar);
                this.r.add(cVar);
                bi.b(this.j, e);
                return;
            }
            int J = J(bi.i(this.j, 8388611));
            if (J < 0 || !this.q.get(J).b.equals(iVar.e())) {
                return;
            }
            iVar.H();
        }

        @Override // defpackage.ji
        public void C(yh.i iVar) {
            int L;
            if (iVar.q() == this || (L = L(iVar)) < 0) {
                return;
            }
            V(this.r.get(L));
        }

        @Override // defpackage.ji
        public void D(yh.i iVar) {
            int L;
            if (iVar.q() == this || (L = L(iVar)) < 0) {
                return;
            }
            c remove = this.r.remove(L);
            bi.d.k(remove.b, null);
            bi.f.e(remove.b, null);
            bi.k(this.j, remove.b);
        }

        @Override // defpackage.ji
        public void E(yh.i iVar) {
            if (iVar.B()) {
                if (iVar.q() != this) {
                    int L = L(iVar);
                    if (L >= 0) {
                        R(this.r.get(L).b);
                        return;
                    }
                    return;
                }
                int K = K(iVar.e());
                if (K >= 0) {
                    R(this.q.get(K).a);
                }
            }
        }

        public final boolean F(Object obj) {
            if (O(obj) != null || J(obj) >= 0) {
                return false;
            }
            C0028b c0028b = new C0028b(obj, G(obj));
            T(c0028b);
            this.q.add(c0028b);
            return true;
        }

        public final String G(Object obj) {
            String a2 = M() == obj ? C0059ao.a(7878) : String.format(Locale.US, C0059ao.a(7879), Integer.valueOf(N(obj).hashCode()));
            if (K(a2) < 0) {
                return a2;
            }
            int i = 2;
            while (true) {
                String format = String.format(Locale.US, C0059ao.a(7880), a2, Integer.valueOf(i));
                if (K(format) < 0) {
                    return format;
                }
                i++;
            }
        }

        public Object H() {
            return bi.c(this);
        }

        public Object I() {
            return bi.f(this);
        }

        public int J(Object obj) {
            int size = this.q.size();
            for (int i = 0; i < size; i++) {
                if (this.q.get(i).a == obj) {
                    return i;
                }
            }
            return -1;
        }

        public int K(String str) {
            int size = this.q.size();
            for (int i = 0; i < size; i++) {
                if (this.q.get(i).b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        public int L(yh.i iVar) {
            int size = this.r.size();
            for (int i = 0; i < size; i++) {
                if (this.r.get(i).a == iVar) {
                    return i;
                }
            }
            return -1;
        }

        public Object M() {
            if (this.t == null) {
                this.t = new bi.c();
            }
            return this.t.a(this.j);
        }

        public String N(Object obj) {
            CharSequence a2 = bi.d.a(obj, n());
            return a2 != null ? a2.toString() : C0059ao.a(7881);
        }

        public c O(Object obj) {
            Object e = bi.d.e(obj);
            if (e instanceof c) {
                return (c) e;
            }
            return null;
        }

        public void P(C0028b c0028b, sh.a aVar) {
            int d = bi.d.d(c0028b.a);
            if ((d & 1) != 0) {
                aVar.b(u);
            }
            if ((d & 2) != 0) {
                aVar.b(v);
            }
            aVar.p(bi.d.c(c0028b.a));
            aVar.o(bi.d.b(c0028b.a));
            aVar.r(bi.d.f(c0028b.a));
            aVar.t(bi.d.h(c0028b.a));
            aVar.s(bi.d.g(c0028b.a));
        }

        public void Q() {
            vh.a aVar = new vh.a();
            int size = this.q.size();
            for (int i = 0; i < size; i++) {
                aVar.a(this.q.get(i).c);
            }
            x(aVar.c());
        }

        public void R(Object obj) {
            if (this.s == null) {
                this.s = new bi.e();
            }
            this.s.a(this.j, 8388611, obj);
        }

        public void S() {
            if (this.p) {
                this.p = false;
                bi.j(this.j, this.k);
            }
            int i = this.n;
            if (i != 0) {
                this.p = true;
                bi.a(this.j, i, this.k);
            }
        }

        public void T(C0028b c0028b) {
            sh.a aVar = new sh.a(c0028b.b, N(c0028b.a));
            P(c0028b, aVar);
            c0028b.c = aVar.e();
        }

        public final void U() {
            S();
            boolean z = false;
            for (Object obj : bi.h(this.j)) {
                z |= F(obj);
            }
            if (z) {
                Q();
            }
        }

        public void V(c cVar) {
            bi.f.a(cVar.b, cVar.a.l());
            bi.f.c(cVar.b, cVar.a.n());
            bi.f.b(cVar.b, cVar.a.m());
            bi.f.d(cVar.b, cVar.a.r());
            bi.f.g(cVar.b, cVar.a.t());
            bi.f.f(cVar.b, cVar.a.s());
        }

        @Override // defpackage.bi.a
        public void b(Object obj, Object obj2) {
        }

        @Override // defpackage.bi.a
        public void c(Object obj) {
            int J;
            if (O(obj) != null || (J = J(obj)) < 0) {
                return;
            }
            T(this.q.get(J));
            Q();
        }

        @Override // defpackage.bi.a
        public void d(int i, Object obj) {
        }

        @Override // defpackage.bi.g
        public void e(Object obj, int i) {
            c O = O(obj);
            if (O != null) {
                O.a.G(i);
            }
        }

        @Override // defpackage.bi.a
        public void f(Object obj, Object obj2, int i) {
        }

        @Override // defpackage.bi.a
        public void g(Object obj) {
            int J;
            if (O(obj) != null || (J = J(obj)) < 0) {
                return;
            }
            this.q.remove(J);
            Q();
        }

        @Override // defpackage.bi.a
        public void h(Object obj) {
            if (F(obj)) {
                Q();
            }
        }

        @Override // defpackage.bi.g
        public void i(Object obj, int i) {
            c O = O(obj);
            if (O != null) {
                O.a.F(i);
            }
        }

        @Override // defpackage.bi.a
        public void j(Object obj) {
            int J;
            if (O(obj) != null || (J = J(obj)) < 0) {
                return;
            }
            C0028b c0028b = this.q.get(J);
            int f = bi.d.f(obj);
            if (f != c0028b.c.t()) {
                sh.a aVar = new sh.a(c0028b.c);
                aVar.r(f);
                c0028b.c = aVar.e();
                Q();
            }
        }

        @Override // defpackage.bi.a
        public void k(int i, Object obj) {
            if (obj != bi.i(this.j, 8388611)) {
                return;
            }
            c O = O(obj);
            if (O != null) {
                O.a.H();
                return;
            }
            int J = J(obj);
            if (J >= 0) {
                this.i.b(this.q.get(J).b);
            }
        }

        @Override // defpackage.uh
        public uh.e t(String str) {
            int K = K(str);
            if (K >= 0) {
                return new a(this.q.get(K).a);
            }
            return null;
        }

        @Override // defpackage.uh
        public void v(th thVar) {
            boolean z;
            int i = 0;
            if (thVar != null) {
                List<String> e = thVar.c().e();
                int size = e.size();
                int i2 = 0;
                while (i < size) {
                    String str = e.get(i);
                    if (str.equals(C0059ao.a(7882))) {
                        i2 |= 1;
                    } else {
                        i2 = str.equals(C0059ao.a(7883)) ? i2 | 2 : i2 | 8388608;
                    }
                    i++;
                }
                z = thVar.d();
                i = i2;
            } else {
                z = false;
            }
            if (this.n == i && this.o == z) {
                return;
            }
            this.n = i;
            this.o = z;
            U();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ji$c */
    /* loaded from: classes.dex */
    public static class c extends b implements ci.b {
        public ci.a w;
        public ci.d x;

        public c(Context context, f fVar) {
            super(context, fVar);
        }

        @Override // defpackage.ji.b
        public Object H() {
            return ci.a(this);
        }

        @Override // defpackage.ji.b
        public void P(b.C0028b c0028b, sh.a aVar) {
            super.P(c0028b, aVar);
            if (!ci.e.b(c0028b.a)) {
                aVar.j(false);
            }
            if (W(c0028b)) {
                aVar.g(1);
            }
            Display a = ci.e.a(c0028b.a);
            if (a != null) {
                aVar.q(a.getDisplayId());
            }
        }

        @Override // defpackage.ji.b
        public void S() {
            super.S();
            if (this.w == null) {
                this.w = new ci.a(n(), q());
            }
            this.w.a(this.o ? this.n : 0);
        }

        public boolean W(b.C0028b c0028b) {
            if (this.x == null) {
                this.x = new ci.d();
            }
            return this.x.a(c0028b.a);
        }

        @Override // defpackage.ci.b
        public void a(Object obj) {
            int J = J(obj);
            if (J >= 0) {
                b.C0028b c0028b = this.q.get(J);
                Display a = ci.e.a(obj);
                int displayId = a != null ? a.getDisplayId() : -1;
                if (displayId != c0028b.c.r()) {
                    sh.a aVar = new sh.a(c0028b.c);
                    aVar.q(displayId);
                    c0028b.c = aVar.e();
                    Q();
                }
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ji$d */
    /* loaded from: classes.dex */
    public static class d extends c {
        public d(Context context, f fVar) {
            super(context, fVar);
        }

        @Override // defpackage.ji.b
        public Object M() {
            return di.b(this.j);
        }

        @Override // defpackage.ji.c, defpackage.ji.b
        public void P(b.C0028b c0028b, sh.a aVar) {
            super.P(c0028b, aVar);
            CharSequence a = di.a.a(c0028b.a);
            if (a != null) {
                aVar.h(a.toString());
            }
        }

        @Override // defpackage.ji.b
        public void R(Object obj) {
            bi.l(this.j, 8388611, obj);
        }

        @Override // defpackage.ji.c, defpackage.ji.b
        public void S() {
            if (this.p) {
                bi.j(this.j, this.k);
            }
            this.p = true;
            di.a(this.j, this.n, this.k, (this.o ? 1 : 0) | 2);
        }

        @Override // defpackage.ji.b
        public void V(b.c cVar) {
            super.V(cVar);
            di.b.a(cVar.b, cVar.a.d());
        }

        @Override // defpackage.ji.c
        public boolean W(b.C0028b c0028b) {
            return di.a.b(c0028b.a);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ji$e */
    /* loaded from: classes.dex */
    public static class e extends ji {
        public static final ArrayList<IntentFilter> l;
        public final AudioManager i;
        public final b j;
        public int k;

        /* compiled from: AxisPay */
        /* renamed from: ji$e$a */
        /* loaded from: classes.dex */
        public final class a extends uh.e {
            public a() {
            }

            @Override // defpackage.uh.e
            public void f(int i) {
                e.this.i.setStreamVolume(3, i, 0);
                e.this.F();
            }

            @Override // defpackage.uh.e
            public void i(int i) {
                int streamVolume = e.this.i.getStreamVolume(3);
                if (Math.min(e.this.i.getStreamMaxVolume(3), Math.max(0, i + streamVolume)) != streamVolume) {
                    e.this.i.setStreamVolume(3, streamVolume, 0);
                }
                e.this.F();
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: ji$e$b */
        /* loaded from: classes.dex */
        public final class b extends BroadcastReceiver {
            public b() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra;
                if (intent.getAction().equals(C0059ao.a(3060)) && intent.getIntExtra(C0059ao.a(3061), -1) == 3 && (intExtra = intent.getIntExtra(C0059ao.a(3062), -1)) >= 0) {
                    e eVar = e.this;
                    if (intExtra != eVar.k) {
                        eVar.F();
                    }
                }
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory(C0059ao.a(7682));
            intentFilter.addCategory(C0059ao.a(7683));
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            l = arrayList;
            arrayList.add(intentFilter);
        }

        public e(Context context) {
            super(context);
            this.k = -1;
            this.i = (AudioManager) context.getSystemService(C0059ao.a(7684));
            b bVar = new b();
            this.j = bVar;
            context.registerReceiver(bVar, new IntentFilter(C0059ao.a(7685)));
            F();
        }

        public void F() {
            Resources resources = n().getResources();
            int streamMaxVolume = this.i.getStreamMaxVolume(3);
            this.k = this.i.getStreamVolume(3);
            sh.a aVar = new sh.a(C0059ao.a(7686), resources.getString(rg.mr_system_route_name));
            aVar.b(l);
            aVar.o(3);
            aVar.p(0);
            aVar.s(1);
            aVar.t(streamMaxVolume);
            aVar.r(this.k);
            sh e = aVar.e();
            vh.a aVar2 = new vh.a();
            aVar2.a(e);
            x(aVar2.c());
        }

        @Override // defpackage.uh
        public uh.e t(String str) {
            if (str.equals(C0059ao.a(7687))) {
                return new a();
            }
            return null;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ji$f */
    /* loaded from: classes.dex */
    public interface f {
        void b(String str);
    }

    public ji(Context context) {
        super(context, new uh.d(new ComponentName(C0059ao.a(9892), ji.class.getName())));
    }

    public static ji A(Context context, f fVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return new a(context, fVar);
        }
        if (i >= 18) {
            return new d(context, fVar);
        }
        if (i >= 17) {
            return new c(context, fVar);
        }
        if (i >= 16) {
            return new b(context, fVar);
        }
        return new e(context);
    }

    public void B(yh.i iVar) {
    }

    public void C(yh.i iVar) {
    }

    public void D(yh.i iVar) {
    }

    public void E(yh.i iVar) {
    }
}
