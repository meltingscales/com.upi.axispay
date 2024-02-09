package defpackage;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import defpackage.hi;
import defpackage.ii;
import defpackage.ji;
import defpackage.rh;
import defpackage.uh;
import defpackage.xh;
import defpackage.yh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: yh  reason: default package */
/* loaded from: classes.dex */
public final class yh {
    public static final boolean c = Log.isLoggable(C0059ao.a(7884), 3);
    public static e d;
    public final Context a;
    public final ArrayList<c> b = new ArrayList<>();

    /* compiled from: AxisPay */
    /* renamed from: yh$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(yh yhVar, h hVar) {
        }

        public void b(yh yhVar, h hVar) {
        }

        public void c(yh yhVar, h hVar) {
        }

        public void d(yh yhVar, i iVar) {
        }

        public abstract void e(yh yhVar, i iVar);

        public void f(yh yhVar, i iVar) {
        }

        public void g(yh yhVar, i iVar) {
        }

        @Deprecated
        public void h(yh yhVar, i iVar) {
        }

        public void i(yh yhVar, i iVar, int i) {
            h(yhVar, iVar);
        }

        public void j(yh yhVar, i iVar, int i, i iVar2) {
            i(yhVar, iVar, i);
        }

        @Deprecated
        public void k(yh yhVar, i iVar) {
        }

        public void l(yh yhVar, i iVar, int i) {
            k(yhVar, iVar);
        }

        public void m(yh yhVar, i iVar) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yh$c */
    /* loaded from: classes.dex */
    public static final class c {
        public final yh a;
        public final b b;
        public xh c = xh.c;
        public int d;

        public c(yh yhVar, b bVar) {
            this.a = yhVar;
            this.b = bVar;
        }

        public boolean a(i iVar, int i, i iVar2, int i2) {
            if ((this.d & 2) != 0 || iVar.D(this.c)) {
                return true;
            }
            if (yh.n() && iVar.v() && i == 262 && i2 == 3 && iVar2 != null) {
                return !iVar2.v();
            }
            return false;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yh$d */
    /* loaded from: classes.dex */
    public static abstract class d {
        @SuppressLint({"UnknownNullness"})
        public void a(String str, Bundle bundle) {
        }

        public void b(Bundle bundle) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yh$e */
    /* loaded from: classes.dex */
    public static final class e implements ji.f, hi.c {
        public g A;
        public c B;
        public MediaSessionCompat C;
        public final Context a;
        public final boolean b;
        public final rh c;
        public final ji l;
        public final boolean m;
        public ei n;
        public hi o;
        public i p;
        public i q;
        public i r;
        public uh.e s;
        public i t;
        public uh.e u;
        public th w;
        public th x;
        public int y;
        public f z;
        public final ArrayList<WeakReference<yh>> d = new ArrayList<>();
        public final ArrayList<i> e = new ArrayList<>();
        public final Map<za<String, String>, String> f = new HashMap();
        public final ArrayList<h> g = new ArrayList<>();
        public final ArrayList<f> h = new ArrayList<>();
        public final ii.a i = new ii.a();
        public final C0042e j = new C0042e();
        public final b k = new b();
        public final Map<String, uh.e> v = new HashMap();
        public uh.b.d D = new a();

        /* compiled from: AxisPay */
        /* renamed from: yh$e$a */
        /* loaded from: classes.dex */
        public class a implements uh.b.d {
            public a() {
            }

            @Override // defpackage.uh.b.d
            public void a(uh.b bVar, sh shVar, Collection<uh.b.c> collection) {
                e eVar = e.this;
                if (bVar == eVar.u && shVar != null) {
                    h p = eVar.t.p();
                    String l = shVar.l();
                    i iVar = new i(p, l, e.this.g(p, l));
                    iVar.E(shVar);
                    e eVar2 = e.this;
                    if (eVar2.r == iVar) {
                        return;
                    }
                    eVar2.B(eVar2, iVar, eVar2.u, 3, eVar2.t, collection);
                    e eVar3 = e.this;
                    eVar3.t = null;
                    eVar3.u = null;
                } else if (bVar == eVar.s) {
                    if (shVar != null) {
                        eVar.O(eVar.r, shVar);
                    }
                    e.this.r.K(collection);
                }
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: yh$e$b */
        /* loaded from: classes.dex */
        public final class b extends Handler {
            public final ArrayList<c> a = new ArrayList<>();
            public final List<i> b = new ArrayList();

            public b() {
            }

            public final void a(c cVar, int i, Object obj, int i2) {
                yh yhVar = cVar.a;
                b bVar = cVar.b;
                int i3 = 65280 & i;
                if (i3 != 256) {
                    if (i3 != 512) {
                        return;
                    }
                    h hVar = (h) obj;
                    switch (i) {
                        case 513:
                            bVar.a(yhVar, hVar);
                            return;
                        case 514:
                            bVar.c(yhVar, hVar);
                            return;
                        case 515:
                            bVar.b(yhVar, hVar);
                            return;
                        default:
                            return;
                    }
                }
                i iVar = (i == 264 || i == 262) ? (i) ((za) obj).b : (i) obj;
                i iVar2 = (i == 264 || i == 262) ? (i) ((za) obj).a : null;
                if (iVar == null || !cVar.a(iVar, i, iVar2, i2)) {
                    return;
                }
                switch (i) {
                    case 257:
                        bVar.d(yhVar, iVar);
                        return;
                    case 258:
                        bVar.g(yhVar, iVar);
                        return;
                    case 259:
                        bVar.e(yhVar, iVar);
                        return;
                    case 260:
                        bVar.m(yhVar, iVar);
                        return;
                    case 261:
                        bVar.f(yhVar, iVar);
                        return;
                    case 262:
                        bVar.j(yhVar, iVar, i2, iVar);
                        return;
                    case 263:
                        bVar.l(yhVar, iVar, i2);
                        return;
                    case 264:
                        bVar.j(yhVar, iVar, i2, iVar2);
                        return;
                    default:
                        return;
                }
            }

            public void b(int i, Object obj) {
                obtainMessage(i, obj).sendToTarget();
            }

            public void c(int i, Object obj, int i2) {
                Message obtainMessage = obtainMessage(i, obj);
                obtainMessage.arg1 = i2;
                obtainMessage.sendToTarget();
            }

            public final void d(int i, Object obj) {
                if (i == 262) {
                    i iVar = (i) ((za) obj).b;
                    e.this.l.E(iVar);
                    if (e.this.p == null || !iVar.v()) {
                        return;
                    }
                    for (i iVar2 : this.b) {
                        e.this.l.D(iVar2);
                    }
                    this.b.clear();
                } else if (i != 264) {
                    switch (i) {
                        case 257:
                            e.this.l.B((i) obj);
                            return;
                        case 258:
                            e.this.l.D((i) obj);
                            return;
                        case 259:
                            e.this.l.C((i) obj);
                            return;
                        default:
                            return;
                    }
                } else {
                    i iVar3 = (i) ((za) obj).b;
                    this.b.add(iVar3);
                    e.this.l.B(iVar3);
                    e.this.l.E(iVar3);
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                Object obj = message.obj;
                int i2 = message.arg1;
                if (i == 259 && e.this.t().j().equals(((i) obj).j())) {
                    e.this.P(true);
                }
                d(i, obj);
                try {
                    int size = e.this.d.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        yh yhVar = e.this.d.get(size).get();
                        if (yhVar == null) {
                            e.this.d.remove(size);
                        } else {
                            this.a.addAll(yhVar.b);
                        }
                    }
                    int size2 = this.a.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        a(this.a.get(i3), i, obj, i2);
                    }
                } finally {
                    this.a.clear();
                }
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: yh$e$c */
        /* loaded from: classes.dex */
        public final class c {
            public void a() {
                throw null;
            }

            public void b(int i, int i2, int i3, String str) {
                throw null;
            }

            public MediaSessionCompat.Token c() {
                throw null;
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: yh$e$d */
        /* loaded from: classes.dex */
        public final class d extends rh.a {
            public d() {
            }

            @Override // defpackage.rh.a
            public void a(uh.e eVar) {
                if (eVar == e.this.s) {
                    d(2);
                } else if (yh.c) {
                    String str = C0059ao.a(4956) + eVar;
                }
            }

            @Override // defpackage.rh.a
            public void b(int i) {
                d(i);
            }

            @Override // defpackage.rh.a
            public void c(String str, int i) {
                i iVar;
                Iterator<i> it = e.this.s().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        iVar = null;
                        break;
                    }
                    iVar = it.next();
                    if (iVar.q() == e.this.c && TextUtils.equals(str, iVar.e())) {
                        break;
                    }
                }
                if (iVar == null) {
                    Log.w(C0059ao.a(4958), C0059ao.a(4957) + str);
                    return;
                }
                e.this.G(iVar, i);
            }

            public void d(int i) {
                i h = e.this.h();
                if (e.this.t() != h) {
                    e.this.G(h, i);
                }
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: yh$e$e  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C0042e extends uh.a {
            public C0042e() {
            }

            @Override // defpackage.uh.a
            public void a(uh uhVar, vh vhVar) {
                e.this.N(uhVar, vhVar);
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: yh$e$f */
        /* loaded from: classes.dex */
        public final class f {
            public final ii a;
            public final /* synthetic */ e b;

            public void a() {
                this.a.a(this.b.i);
            }
        }

        @SuppressLint({"SyntheticAccessor", "NewApi"})
        public e(Context context) {
            this.a = context;
            u9.a(context);
            this.m = e8.a((ActivityManager) context.getSystemService(C0059ao.a(3263)));
            if (Build.VERSION.SDK_INT >= 30) {
                this.b = fi.a(context);
            } else {
                this.b = false;
            }
            if (this.b) {
                this.c = new rh(context, new d());
            } else {
                this.c = null;
            }
            this.l = ji.A(context, this);
        }

        public void A() {
            if (this.r.x()) {
                List<i> k = this.r.k();
                HashSet hashSet = new HashSet();
                for (i iVar : k) {
                    hashSet.add(iVar.c);
                }
                Iterator<Map.Entry<String, uh.e>> it = this.v.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, uh.e> next = it.next();
                    if (!hashSet.contains(next.getKey())) {
                        uh.e value = next.getValue();
                        value.h(0);
                        value.d();
                        it.remove();
                    }
                }
                for (i iVar2 : k) {
                    if (!this.v.containsKey(iVar2.c)) {
                        uh.e u = iVar2.q().u(iVar2.b, this.r.b);
                        u.e();
                        this.v.put(iVar2.c, u);
                    }
                }
            }
        }

        public void B(e eVar, i iVar, uh.e eVar2, int i, i iVar2, Collection<uh.b.c> collection) {
            f fVar;
            g gVar = this.A;
            if (gVar != null) {
                gVar.a();
                this.A = null;
            }
            g gVar2 = new g(eVar, iVar, eVar2, i, iVar2, collection);
            this.A = gVar2;
            if (gVar2.b == 3 && (fVar = this.z) != null) {
                j00<Void> a2 = fVar.a(this.r, gVar2.d);
                if (a2 == null) {
                    this.A.c();
                    return;
                } else {
                    this.A.f(a2);
                    return;
                }
            }
            gVar2.c();
        }

        public void C(i iVar) {
            if (this.s instanceof uh.b) {
                i.a n = n(iVar);
                boolean contains = this.r.k().contains(iVar);
                String a2 = C0059ao.a(3264);
                if (contains && n != null && n.d()) {
                    if (this.r.k().size() <= 1) {
                        Log.w(a2, C0059ao.a(3265));
                        return;
                    } else {
                        ((uh.b) this.s).n(iVar.e());
                        return;
                    }
                }
                Log.w(a2, C0059ao.a(3266) + iVar);
                return;
            }
            throw new IllegalStateException(C0059ao.a(3267));
        }

        public void D(i iVar, int i) {
            uh.e eVar;
            uh.e eVar2;
            if (iVar == this.r && (eVar2 = this.s) != null) {
                eVar2.f(i);
            } else if (this.v.isEmpty() || (eVar = this.v.get(iVar.c)) == null) {
            } else {
                eVar.f(i);
            }
        }

        public void E(i iVar, int i) {
            uh.e eVar;
            uh.e eVar2;
            if (iVar == this.r && (eVar2 = this.s) != null) {
                eVar2.i(i);
            } else if (this.v.isEmpty() || (eVar = this.v.get(iVar.c)) == null) {
            } else {
                eVar.i(i);
            }
        }

        public void F(i iVar, int i) {
            boolean contains = this.e.contains(iVar);
            String a2 = C0059ao.a(3268);
            if (!contains) {
                Log.w(a2, C0059ao.a(3269) + iVar);
            } else if (!iVar.g) {
                Log.w(a2, C0059ao.a(3270) + iVar);
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    uh q = iVar.q();
                    rh rhVar = this.c;
                    if (q == rhVar && this.r != iVar) {
                        rhVar.G(iVar.e());
                        return;
                    }
                }
                G(iVar, i);
            }
        }

        public void G(i iVar, int i) {
            e eVar = yh.d;
            String a2 = C0059ao.a(3271);
            if (eVar == null || (this.q != null && iVar.u())) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuilder sb = new StringBuilder();
                for (int i2 = 3; i2 < stackTrace.length; i2++) {
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    sb.append(stackTraceElement.getClassName());
                    sb.append(C0059ao.a(3272));
                    sb.append(stackTraceElement.getMethodName());
                    sb.append(C0059ao.a(3273));
                    sb.append(stackTraceElement.getLineNumber());
                    sb.append(C0059ao.a(3274));
                }
                e eVar2 = yh.d;
                String a3 = C0059ao.a(3275);
                if (eVar2 == null) {
                    Log.w(a2, C0059ao.a(3276) + this.a.getPackageName() + a3 + sb.toString());
                } else {
                    Log.w(a2, C0059ao.a(3277) + this.a.getPackageName() + a3 + sb.toString());
                }
            }
            if (this.r == iVar) {
                return;
            }
            if (this.t != null) {
                this.t = null;
                uh.e eVar3 = this.u;
                if (eVar3 != null) {
                    eVar3.h(3);
                    this.u.d();
                    this.u = null;
                }
            }
            if (v() && iVar.p().g()) {
                uh.b s = iVar.q().s(iVar.b);
                if (s != null) {
                    s.p(t8.i(this.a), this.D);
                    this.t = iVar;
                    this.u = s;
                    s.e();
                    return;
                }
                Log.w(a2, C0059ao.a(3278) + iVar);
            }
            uh.e t = iVar.q().t(iVar.b);
            if (t != null) {
                t.e();
            }
            if (yh.c) {
                String str = C0059ao.a(3279) + iVar;
            }
            if (this.r == null) {
                this.r = iVar;
                this.s = t;
                this.k.c(262, new za(null, iVar), i);
                return;
            }
            B(this, iVar, t, i, null, null);
        }

        public void H() {
            a(this.l);
            rh rhVar = this.c;
            if (rhVar != null) {
                a(rhVar);
            }
            hi hiVar = new hi(this.a, this);
            this.o = hiVar;
            hiVar.h();
        }

        public void I(i iVar) {
            if (this.s instanceof uh.b) {
                i.a n = n(iVar);
                if (n != null && n.c()) {
                    ((uh.b) this.s).o(Collections.singletonList(iVar.e()));
                    return;
                } else {
                    Log.w(C0059ao.a(3280), C0059ao.a(3281));
                    return;
                }
            }
            throw new IllegalStateException(C0059ao.a(3282));
        }

        public void J() {
            xh.a aVar = new xh.a();
            int size = this.d.size();
            int i = 0;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                yh yhVar = this.d.get(size).get();
                if (yhVar == null) {
                    this.d.remove(size);
                } else {
                    int size2 = yhVar.b.size();
                    i += size2;
                    for (int i2 = 0; i2 < size2; i2++) {
                        c cVar = yhVar.b.get(i2);
                        aVar.c(cVar.c);
                        int i3 = cVar.d;
                        if ((i3 & 1) != 0) {
                            z = true;
                            z2 = true;
                        }
                        if ((i3 & 4) != 0 && !this.m) {
                            z = true;
                        }
                        if ((i3 & 8) != 0) {
                            z = true;
                        }
                    }
                }
            }
            this.y = i;
            xh d2 = z ? aVar.d() : xh.c;
            K(aVar.d(), z2);
            th thVar = this.w;
            if (thVar != null && thVar.c().equals(d2) && this.w.d() == z2) {
                return;
            }
            if (d2.f() && !z2) {
                if (this.w == null) {
                    return;
                }
                this.w = null;
            } else {
                this.w = new th(d2, z2);
            }
            if (yh.c) {
                String str = C0059ao.a(3283) + this.w;
            }
            if (z && !z2 && this.m) {
                Log.i(C0059ao.a(3284), C0059ao.a(3285));
            }
            int size3 = this.g.size();
            for (int i4 = 0; i4 < size3; i4++) {
                uh uhVar = this.g.get(i4).a;
                if (uhVar != this.c) {
                    uhVar.y(this.w);
                }
            }
        }

        public final void K(xh xhVar, boolean z) {
            if (v()) {
                th thVar = this.x;
                if (thVar != null && thVar.c().equals(xhVar) && this.x.d() == z) {
                    return;
                }
                if (xhVar.f() && !z) {
                    if (this.x == null) {
                        return;
                    }
                    this.x = null;
                } else {
                    this.x = new th(xhVar, z);
                }
                if (yh.c) {
                    String str = C0059ao.a(3286) + this.x;
                }
                this.c.y(this.x);
            }
        }

        @SuppressLint({"NewApi"})
        public void L() {
            i iVar = this.r;
            if (iVar != null) {
                this.i.a = iVar.r();
                this.i.b = this.r.t();
                this.i.c = this.r.s();
                this.i.d = this.r.m();
                this.i.e = this.r.n();
                if (this.b && this.r.q() == this.c) {
                    this.i.f = rh.C(this.s);
                } else {
                    this.i.f = null;
                }
                int size = this.h.size();
                for (int i = 0; i < size; i++) {
                    this.h.get(i).a();
                }
                if (this.B != null) {
                    if (this.r != m() && this.r != k()) {
                        ii.a aVar = this.i;
                        this.B.b(aVar.c == 1 ? 2 : 0, aVar.b, aVar.a, aVar.f);
                        throw null;
                    }
                    this.B.a();
                    throw null;
                }
                return;
            }
            c cVar = this.B;
            if (cVar == null) {
                return;
            }
            cVar.a();
            throw null;
        }

        public final void M(h hVar, vh vhVar) {
            boolean z;
            String a2;
            if (hVar.h(vhVar)) {
                int i = 0;
                String a3 = C0059ao.a(3287);
                if (vhVar != null && (vhVar.c() || vhVar == this.l.o())) {
                    List<sh> b2 = vhVar.b();
                    ArrayList<za> arrayList = new ArrayList();
                    ArrayList<za> arrayList2 = new ArrayList();
                    Iterator<sh> it = b2.iterator();
                    z = false;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        a2 = C0059ao.a(3288);
                        if (!hasNext) {
                            break;
                        }
                        sh next = it.next();
                        if (next != null && next.x()) {
                            String l = next.l();
                            int b3 = hVar.b(l);
                            if (b3 < 0) {
                                i iVar = new i(hVar, l, g(hVar, l));
                                int i2 = i + 1;
                                hVar.b.add(i, iVar);
                                this.e.add(iVar);
                                if (next.j().size() > 0) {
                                    arrayList.add(new za(iVar, next));
                                } else {
                                    iVar.E(next);
                                    if (yh.c) {
                                        String str = a2 + iVar;
                                    }
                                    this.k.b(257, iVar);
                                }
                                i = i2;
                            } else if (b3 < i) {
                                Log.w(a3, C0059ao.a(3289) + next);
                            } else {
                                i iVar2 = hVar.b.get(b3);
                                int i3 = i + 1;
                                Collections.swap(hVar.b, b3, i);
                                if (next.j().size() > 0) {
                                    arrayList2.add(new za(iVar2, next));
                                } else if (O(iVar2, next) != 0 && iVar2 == this.r) {
                                    z = true;
                                }
                                i = i3;
                            }
                        } else {
                            Log.w(a3, C0059ao.a(3290) + next);
                        }
                    }
                    for (za zaVar : arrayList) {
                        i iVar3 = (i) zaVar.a;
                        iVar3.E((sh) zaVar.b);
                        if (yh.c) {
                            String str2 = a2 + iVar3;
                        }
                        this.k.b(257, iVar3);
                    }
                    for (za zaVar2 : arrayList2) {
                        i iVar4 = (i) zaVar2.a;
                        if (O(iVar4, (sh) zaVar2.b) != 0 && iVar4 == this.r) {
                            z = true;
                        }
                    }
                } else {
                    Log.w(a3, C0059ao.a(3291) + vhVar);
                    z = false;
                }
                for (int size = hVar.b.size() - 1; size >= i; size--) {
                    i iVar5 = hVar.b.get(size);
                    iVar5.E(null);
                    this.e.remove(iVar5);
                }
                P(z);
                for (int size2 = hVar.b.size() - 1; size2 >= i; size2--) {
                    i remove = hVar.b.remove(size2);
                    if (yh.c) {
                        String str3 = C0059ao.a(3292) + remove;
                    }
                    this.k.b(258, remove);
                }
                if (yh.c) {
                    String str4 = C0059ao.a(3293) + hVar;
                }
                this.k.b(515, hVar);
            }
        }

        public void N(uh uhVar, vh vhVar) {
            h i = i(uhVar);
            if (i != null) {
                M(i, vhVar);
            }
        }

        public int O(i iVar, sh shVar) {
            int E = iVar.E(shVar);
            if (E != 0) {
                if ((E & 1) != 0) {
                    if (yh.c) {
                        String str = C0059ao.a(3294) + iVar;
                    }
                    this.k.b(259, iVar);
                }
                if ((E & 2) != 0) {
                    if (yh.c) {
                        String str2 = C0059ao.a(3295) + iVar;
                    }
                    this.k.b(260, iVar);
                }
                if ((E & 4) != 0) {
                    if (yh.c) {
                        String str3 = C0059ao.a(3296) + iVar;
                    }
                    this.k.b(261, iVar);
                }
            }
            return E;
        }

        public void P(boolean z) {
            i iVar = this.p;
            String a2 = C0059ao.a(3297);
            if (iVar != null && !iVar.A()) {
                Log.i(a2, C0059ao.a(3298) + this.p);
                this.p = null;
            }
            if (this.p == null && !this.e.isEmpty()) {
                Iterator<i> it = this.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i next = it.next();
                    if (x(next) && next.A()) {
                        this.p = next;
                        Log.i(a2, C0059ao.a(3299) + this.p);
                        break;
                    }
                }
            }
            i iVar2 = this.q;
            if (iVar2 != null && !iVar2.A()) {
                Log.i(a2, C0059ao.a(3300) + this.q);
                this.q = null;
            }
            if (this.q == null && !this.e.isEmpty()) {
                Iterator<i> it2 = this.e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    i next2 = it2.next();
                    if (y(next2) && next2.A()) {
                        this.q = next2;
                        Log.i(a2, C0059ao.a(3301) + this.q);
                        break;
                    }
                }
            }
            i iVar3 = this.r;
            if (iVar3 != null && iVar3.w()) {
                if (z) {
                    A();
                    L();
                    return;
                }
                return;
            }
            Log.i(a2, C0059ao.a(3302) + this.r);
            G(h(), 0);
        }

        @Override // defpackage.hi.c
        public void a(uh uhVar) {
            if (i(uhVar) == null) {
                h hVar = new h(uhVar);
                this.g.add(hVar);
                if (yh.c) {
                    String str = C0059ao.a(3303) + hVar;
                }
                this.k.b(513, hVar);
                M(hVar, uhVar.o());
                uhVar.w(this.j);
                uhVar.y(this.w);
            }
        }

        @Override // defpackage.ji.f
        public void b(String str) {
            i a2;
            this.k.removeMessages(262);
            h i = i(this.l);
            if (i == null || (a2 = i.a(str)) == null) {
                return;
            }
            a2.H();
        }

        @Override // defpackage.hi.c
        public void c(gi giVar, uh.e eVar) {
            if (this.s == eVar) {
                F(h(), 2);
            }
        }

        @Override // defpackage.hi.c
        public void d(uh uhVar) {
            h i = i(uhVar);
            if (i != null) {
                uhVar.w(null);
                uhVar.y(null);
                M(i, null);
                if (yh.c) {
                    String str = C0059ao.a(3304) + i;
                }
                this.k.b(514, i);
                this.g.remove(i);
            }
        }

        public void f(i iVar) {
            if (this.s instanceof uh.b) {
                i.a n = n(iVar);
                if (!this.r.k().contains(iVar) && n != null && n.b()) {
                    ((uh.b) this.s).m(iVar.e());
                    return;
                }
                Log.w(C0059ao.a(3306), C0059ao.a(3305) + iVar);
                return;
            }
            throw new IllegalStateException(C0059ao.a(3307));
        }

        public String g(h hVar, String str) {
            String flattenToShortString = hVar.c().flattenToShortString();
            String str2 = flattenToShortString + C0059ao.a(3308) + str;
            if (j(str2) < 0) {
                this.f.put(new za<>(flattenToShortString, str), str2);
                return str2;
            }
            Log.w(C0059ao.a(3312), C0059ao.a(3309) + str + C0059ao.a(3310) + flattenToShortString + C0059ao.a(3311));
            int i = 2;
            while (true) {
                String format = String.format(Locale.US, C0059ao.a(3313), str2, Integer.valueOf(i));
                if (j(format) < 0) {
                    this.f.put(new za<>(flattenToShortString, str), format);
                    return format;
                }
                i++;
            }
        }

        public i h() {
            Iterator<i> it = this.e.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next != this.p && y(next) && next.A()) {
                    return next;
                }
            }
            return this.p;
        }

        public final h i(uh uhVar) {
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                if (this.g.get(i).a == uhVar) {
                    return this.g.get(i);
                }
            }
            return null;
        }

        public final int j(String str) {
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                if (this.e.get(i).c.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        public i k() {
            return this.q;
        }

        public int l() {
            return this.y;
        }

        public i m() {
            i iVar = this.p;
            if (iVar != null) {
                return iVar;
            }
            throw new IllegalStateException(C0059ao.a(3314));
        }

        public i.a n(i iVar) {
            return this.r.h(iVar);
        }

        public MediaSessionCompat.Token o() {
            c cVar = this.B;
            if (cVar != null) {
                return cVar.c();
            }
            MediaSessionCompat mediaSessionCompat = this.C;
            if (mediaSessionCompat != null) {
                return mediaSessionCompat.getSessionToken();
            }
            return null;
        }

        public i p(String str) {
            Iterator<i> it = this.e.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.c.equals(str)) {
                    return next;
                }
            }
            return null;
        }

        public yh q(Context context) {
            int size = this.d.size();
            while (true) {
                size--;
                if (size >= 0) {
                    yh yhVar = this.d.get(size).get();
                    if (yhVar == null) {
                        this.d.remove(size);
                    } else if (yhVar.a == context) {
                        return yhVar;
                    }
                } else {
                    yh yhVar2 = new yh(context);
                    this.d.add(new WeakReference<>(yhVar2));
                    return yhVar2;
                }
            }
        }

        public ei r() {
            return this.n;
        }

        public List<i> s() {
            return this.e;
        }

        public i t() {
            i iVar = this.r;
            if (iVar != null) {
                return iVar;
            }
            throw new IllegalStateException(C0059ao.a(3315));
        }

        public String u(h hVar, String str) {
            return this.f.get(new za(hVar.c().flattenToShortString(), str));
        }

        public boolean v() {
            return this.b;
        }

        public boolean w(xh xhVar, int i) {
            if (xhVar.f()) {
                return false;
            }
            if ((i & 2) == 0 && this.m) {
                return true;
            }
            ei eiVar = this.n;
            if (eiVar == null) {
                int size = this.e.size();
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = this.e.get(i2);
                    if (((i & 1) == 0 || !iVar.v()) && iVar.D(xhVar)) {
                        return true;
                    }
                }
                return false;
            }
            eiVar.b();
            throw null;
        }

        public final boolean x(i iVar) {
            return iVar.q() == this.l && iVar.b.equals(C0059ao.a(3316));
        }

        public final boolean y(i iVar) {
            return iVar.q() == this.l && iVar.I(C0059ao.a(3317)) && !iVar.I(C0059ao.a(3318));
        }

        public boolean z() {
            ei eiVar = this.n;
            if (eiVar == null) {
                return false;
            }
            return eiVar.c();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yh$f */
    /* loaded from: classes.dex */
    public interface f {
        j00<Void> a(i iVar, i iVar2);
    }

    /* compiled from: AxisPay */
    /* renamed from: yh$g */
    /* loaded from: classes.dex */
    public static final class g {
        public final uh.e a;
        public final int b;
        public final i c;
        public final i d;
        public final i e;
        public final List<uh.b.c> f;
        public final WeakReference<e> g;
        public j00<Void> h = null;
        public boolean i = false;
        public boolean j = false;

        public g(e eVar, i iVar, uh.e eVar2, int i, i iVar2, Collection<uh.b.c> collection) {
            this.g = new WeakReference<>(eVar);
            this.d = iVar;
            this.a = eVar2;
            this.b = i;
            this.c = eVar.r;
            this.e = iVar2;
            this.f = collection != null ? new ArrayList(collection) : null;
            eVar.k.postDelayed(new Runnable() { // from class: hh
                @Override // java.lang.Runnable
                public final void run() {
                    yh.g.this.d();
                }
            }, 15000L);
        }

        public void a() {
            if (this.i || this.j) {
                return;
            }
            this.j = true;
            uh.e eVar = this.a;
            if (eVar != null) {
                eVar.h(0);
                this.a.d();
            }
        }

        /* renamed from: b */
        public void d() {
            j00<Void> j00Var;
            yh.d();
            if (this.i || this.j) {
                return;
            }
            e eVar = this.g.get();
            if (eVar != null && eVar.A == this && ((j00Var = this.h) == null || !j00Var.isCancelled())) {
                this.i = true;
                eVar.A = null;
                g();
                e();
                return;
            }
            a();
        }

        public final void e() {
            e eVar = this.g.get();
            if (eVar == null) {
                return;
            }
            i iVar = this.d;
            eVar.r = iVar;
            eVar.s = this.a;
            i iVar2 = this.e;
            if (iVar2 == null) {
                eVar.k.c(262, new za(this.c, iVar), this.b);
            } else {
                eVar.k.c(264, new za(iVar2, iVar), this.b);
            }
            eVar.v.clear();
            eVar.A();
            eVar.L();
            List<uh.b.c> list = this.f;
            if (list != null) {
                eVar.r.K(list);
            }
        }

        public void f(j00<Void> j00Var) {
            e eVar = this.g.get();
            if (eVar != null && eVar.A == this) {
                if (this.h == null) {
                    this.h = j00Var;
                    Runnable runnable = new Runnable() { // from class: eh
                        @Override // java.lang.Runnable
                        public final void run() {
                            yh.g.this.c();
                        }
                    };
                    final e.b bVar = eVar.k;
                    Objects.requireNonNull(bVar);
                    j00Var.a(runnable, new Executor() { // from class: ih
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable2) {
                            yh.e.b.this.post(runnable2);
                        }
                    });
                    return;
                }
                throw new IllegalStateException(C0059ao.a(3114));
            }
            Log.w(C0059ao.a(3115), C0059ao.a(3116));
            a();
        }

        public final void g() {
            e eVar = this.g.get();
            if (eVar != null) {
                i iVar = eVar.r;
                i iVar2 = this.c;
                if (iVar != iVar2) {
                    return;
                }
                eVar.k.c(263, iVar2, this.b);
                uh.e eVar2 = eVar.s;
                if (eVar2 != null) {
                    eVar2.h(this.b);
                    eVar.s.d();
                }
                if (!eVar.v.isEmpty()) {
                    for (uh.e eVar3 : eVar.v.values()) {
                        eVar3.h(this.b);
                        eVar3.d();
                    }
                    eVar.v.clear();
                }
                eVar.s = null;
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yh$h */
    /* loaded from: classes.dex */
    public static final class h {
        public final uh a;
        public final List<i> b = new ArrayList();
        public final uh.d c;
        public vh d;

        public h(uh uhVar) {
            this.a = uhVar;
            this.c = uhVar.r();
        }

        public i a(String str) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                if (this.b.get(i).b.equals(str)) {
                    return this.b.get(i);
                }
            }
            return null;
        }

        public int b(String str) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                if (this.b.get(i).b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        public ComponentName c() {
            return this.c.a();
        }

        public String d() {
            return this.c.b();
        }

        public uh e() {
            yh.d();
            return this.a;
        }

        public List<i> f() {
            yh.d();
            return Collections.unmodifiableList(this.b);
        }

        public boolean g() {
            vh vhVar = this.d;
            return vhVar != null && vhVar.d();
        }

        public boolean h(vh vhVar) {
            if (this.d != vhVar) {
                this.d = vhVar;
                return true;
            }
            return false;
        }

        public String toString() {
            return C0059ao.a(3126) + d() + C0059ao.a(3127);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yh$i */
    /* loaded from: classes.dex */
    public static class i {
        public final h a;
        public final String b;
        public final String c;
        public String d;
        public String e;
        public Uri f;
        public boolean g;
        public int h;
        public boolean i;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public Bundle r;
        public IntentSender s;
        public sh t;
        public Map<String, uh.b.c> v;
        public final ArrayList<IntentFilter> j = new ArrayList<>();
        public int q = -1;
        public List<i> u = new ArrayList();

        /* compiled from: AxisPay */
        /* renamed from: yh$i$a */
        /* loaded from: classes.dex */
        public static final class a {
            public final uh.b.c a;

            public a(uh.b.c cVar) {
                this.a = cVar;
            }

            public int a() {
                uh.b.c cVar = this.a;
                if (cVar != null) {
                    return cVar.c();
                }
                return 1;
            }

            public boolean b() {
                uh.b.c cVar = this.a;
                return cVar != null && cVar.d();
            }

            public boolean c() {
                uh.b.c cVar = this.a;
                return cVar != null && cVar.e();
            }

            public boolean d() {
                uh.b.c cVar = this.a;
                return cVar == null || cVar.f();
            }
        }

        public i(h hVar, String str, String str2) {
            this.a = hVar;
            this.b = str;
            this.c = str2;
        }

        public static boolean C(i iVar) {
            return TextUtils.equals(iVar.q().r().b(), C0059ao.a(3130));
        }

        public boolean A() {
            return this.t != null && this.g;
        }

        public boolean B() {
            yh.d();
            return yh.d.t() == this;
        }

        public boolean D(xh xhVar) {
            if (xhVar != null) {
                yh.d();
                return xhVar.h(this.j);
            }
            throw new IllegalArgumentException(C0059ao.a(3131));
        }

        public int E(sh shVar) {
            if (this.t != shVar) {
                return J(shVar);
            }
            return 0;
        }

        public void F(int i) {
            yh.d();
            yh.d.D(this, Math.min(this.p, Math.max(0, i)));
        }

        public void G(int i) {
            yh.d();
            if (i != 0) {
                yh.d.E(this, i);
            }
        }

        public void H() {
            yh.d();
            yh.d.F(this, 3);
        }

        public boolean I(String str) {
            if (str != null) {
                yh.d();
                int size = this.j.size();
                for (int i = 0; i < size; i++) {
                    if (this.j.get(i).hasCategory(str)) {
                        return true;
                    }
                }
                return false;
            }
            throw new IllegalArgumentException(C0059ao.a(3132));
        }

        public int J(sh shVar) {
            int i;
            this.t = shVar;
            if (shVar != null) {
                if (ya.a(this.d, shVar.o())) {
                    i = 0;
                } else {
                    this.d = shVar.o();
                    i = 1;
                }
                if (!ya.a(this.e, shVar.g())) {
                    this.e = shVar.g();
                    i |= 1;
                }
                if (!ya.a(this.f, shVar.k())) {
                    this.f = shVar.k();
                    i |= 1;
                }
                if (this.g != shVar.w()) {
                    this.g = shVar.w();
                    i |= 1;
                }
                if (this.h != shVar.e()) {
                    this.h = shVar.e();
                    i |= 1;
                }
                if (!z(this.j, shVar.f())) {
                    this.j.clear();
                    this.j.addAll(shVar.f());
                    i |= 1;
                }
                if (this.k != shVar.q()) {
                    this.k = shVar.q();
                    i |= 1;
                }
                if (this.l != shVar.p()) {
                    this.l = shVar.p();
                    i |= 1;
                }
                if (this.m != shVar.h()) {
                    this.m = shVar.h();
                    i |= 1;
                }
                if (this.n != shVar.u()) {
                    this.n = shVar.u();
                    i |= 3;
                }
                if (this.o != shVar.t()) {
                    this.o = shVar.t();
                    i |= 3;
                }
                if (this.p != shVar.v()) {
                    this.p = shVar.v();
                    i |= 3;
                }
                if (this.q != shVar.r()) {
                    this.q = shVar.r();
                    i |= 5;
                }
                if (!ya.a(this.r, shVar.i())) {
                    this.r = shVar.i();
                    i |= 1;
                }
                if (!ya.a(this.s, shVar.s())) {
                    this.s = shVar.s();
                    i |= 1;
                }
                if (this.i != shVar.a()) {
                    this.i = shVar.a();
                    i |= 5;
                }
                List<String> j = shVar.j();
                ArrayList arrayList = new ArrayList();
                boolean z = j.size() != this.u.size();
                for (String str : j) {
                    i p = yh.d.p(yh.d.u(p(), str));
                    if (p != null) {
                        arrayList.add(p);
                        if (!z && !this.u.contains(p)) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    this.u = arrayList;
                    return i | 1;
                }
                return i;
            }
            return 0;
        }

        public void K(Collection<uh.b.c> collection) {
            this.u.clear();
            if (this.v == null) {
                this.v = new o4();
            }
            this.v.clear();
            for (uh.b.c cVar : collection) {
                i b = b(cVar);
                if (b != null) {
                    this.v.put(b.c, cVar);
                    if (cVar.c() == 2 || cVar.c() == 3) {
                        this.u.add(b);
                    }
                }
            }
            yh.d.k.b(259, this);
        }

        public boolean a() {
            return this.i;
        }

        public i b(uh.b.c cVar) {
            return p().a(cVar.b().l());
        }

        public int c() {
            return this.h;
        }

        public String d() {
            return this.e;
        }

        public String e() {
            return this.b;
        }

        public int f() {
            return this.m;
        }

        public uh.b g() {
            uh.e eVar = yh.d.s;
            if (eVar instanceof uh.b) {
                return (uh.b) eVar;
            }
            return null;
        }

        public a h(i iVar) {
            Map<String, uh.b.c> map = this.v;
            if (map == null || !map.containsKey(iVar.c)) {
                return null;
            }
            return new a(this.v.get(iVar.c));
        }

        public Uri i() {
            return this.f;
        }

        public String j() {
            return this.c;
        }

        public List<i> k() {
            return Collections.unmodifiableList(this.u);
        }

        public String l() {
            return this.d;
        }

        public int m() {
            return this.l;
        }

        public int n() {
            return this.k;
        }

        public int o() {
            return this.q;
        }

        public h p() {
            return this.a;
        }

        public uh q() {
            return this.a.e();
        }

        public int r() {
            return this.o;
        }

        public int s() {
            return this.n;
        }

        public int t() {
            return this.p;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(3133) + this.c + C0059ao.a(3134) + this.d + C0059ao.a(3135) + this.e + C0059ao.a(3136) + this.f + C0059ao.a(3137) + this.g + C0059ao.a(3138) + this.h + C0059ao.a(3139) + this.i + C0059ao.a(3140) + this.k + C0059ao.a(3141) + this.l + C0059ao.a(3142) + this.m + C0059ao.a(3143) + this.n + C0059ao.a(3144) + this.o + C0059ao.a(3145) + this.p + C0059ao.a(3146) + this.q + C0059ao.a(3147) + this.r + C0059ao.a(3148) + this.s + C0059ao.a(3149) + this.a.d());
            if (x()) {
                sb.append(C0059ao.a(3150));
                int size = this.u.size();
                for (int i = 0; i < size; i++) {
                    if (i > 0) {
                        sb.append(C0059ao.a(3151));
                    }
                    if (this.u.get(i) != this) {
                        sb.append(this.u.get(i).j());
                    }
                }
                sb.append(']');
            }
            sb.append(C0059ao.a(3152));
            return sb.toString();
        }

        public boolean u() {
            yh.d();
            return yh.d.m() == this;
        }

        public boolean v() {
            if (u() || this.m == 3) {
                return true;
            }
            return C(this) && I(C0059ao.a(3153)) && !I(C0059ao.a(3154));
        }

        public boolean w() {
            return this.g;
        }

        public boolean x() {
            return k().size() >= 1;
        }

        public final boolean y(IntentFilter intentFilter, IntentFilter intentFilter2) {
            int countActions;
            if (intentFilter == intentFilter2) {
                return true;
            }
            if (intentFilter == null || intentFilter2 == null || (countActions = intentFilter.countActions()) != intentFilter2.countActions()) {
                return false;
            }
            for (int i = 0; i < countActions; i++) {
                if (!intentFilter.getAction(i).equals(intentFilter2.getAction(i))) {
                    return false;
                }
            }
            int countCategories = intentFilter.countCategories();
            if (countCategories != intentFilter2.countCategories()) {
                return false;
            }
            for (int i2 = 0; i2 < countCategories; i2++) {
                if (!intentFilter.getCategory(i2).equals(intentFilter2.getCategory(i2))) {
                    return false;
                }
            }
            return true;
        }

        public final boolean z(List<IntentFilter> list, List<IntentFilter> list2) {
            if (list == list2) {
                return true;
            }
            if (list == null || list2 == null) {
                return false;
            }
            ListIterator<IntentFilter> listIterator = list.listIterator();
            ListIterator<IntentFilter> listIterator2 = list2.listIterator();
            while (listIterator.hasNext() && listIterator2.hasNext()) {
                if (!y(listIterator.next(), listIterator2.next())) {
                    return false;
                }
            }
            return (listIterator.hasNext() || listIterator2.hasNext()) ? false : true;
        }
    }

    public yh(Context context) {
        this.a = context;
    }

    public static void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(C0059ao.a(7885));
        }
    }

    public static int f() {
        e eVar = d;
        if (eVar == null) {
            return 0;
        }
        return eVar.l();
    }

    public static yh g(Context context) {
        if (context != null) {
            d();
            if (d == null) {
                e eVar = new e(context.getApplicationContext());
                d = eVar;
                eVar.H();
            }
            return d.q(context);
        }
        throw new IllegalArgumentException(C0059ao.a(7886));
    }

    public static boolean l() {
        e eVar = d;
        if (eVar == null) {
            return false;
        }
        return eVar.v();
    }

    public static boolean n() {
        e eVar = d;
        if (eVar == null) {
            return false;
        }
        return eVar.z();
    }

    public void a(xh xhVar, b bVar) {
        b(xhVar, bVar, 0);
    }

    public void b(xh xhVar, b bVar, int i2) {
        c cVar;
        if (xhVar == null) {
            throw new IllegalArgumentException(C0059ao.a(7891));
        }
        if (bVar != null) {
            d();
            if (c) {
                String str = C0059ao.a(7887) + xhVar + C0059ao.a(7888) + bVar + C0059ao.a(7889) + Integer.toHexString(i2);
            }
            int e2 = e(bVar);
            if (e2 < 0) {
                cVar = new c(this, bVar);
                this.b.add(cVar);
            } else {
                cVar = this.b.get(e2);
            }
            boolean z = false;
            boolean z2 = true;
            if (i2 != cVar.d) {
                cVar.d = i2;
                z = true;
            }
            if (cVar.c.b(xhVar)) {
                z2 = z;
            } else {
                xh.a aVar = new xh.a(cVar.c);
                aVar.c(xhVar);
                cVar.c = aVar.d();
            }
            if (z2) {
                d.J();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(7890));
    }

    public void c(i iVar) {
        d();
        d.f(iVar);
    }

    public final int e(b bVar) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.b.get(i2).b == bVar) {
                return i2;
            }
        }
        return -1;
    }

    public MediaSessionCompat.Token h() {
        return d.o();
    }

    public ei i() {
        d();
        return d.r();
    }

    public List<i> j() {
        d();
        return d.s();
    }

    public i k() {
        d();
        return d.t();
    }

    public boolean m(xh xhVar, int i2) {
        if (xhVar != null) {
            d();
            return d.w(xhVar, i2);
        }
        throw new IllegalArgumentException(C0059ao.a(7892));
    }

    public void o(b bVar) {
        if (bVar != null) {
            d();
            if (c) {
                String str = C0059ao.a(7893) + bVar;
            }
            int e2 = e(bVar);
            if (e2 >= 0) {
                this.b.remove(e2);
                d.J();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(7894));
    }

    public void p(i iVar) {
        d();
        d.C(iVar);
    }

    public void q(i iVar) {
        d();
        d.I(iVar);
    }

    public void r(int i2) {
        if (i2 >= 0 && i2 <= 3) {
            d();
            i h2 = d.h();
            if (d.t() != h2) {
                d.F(h2, i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(7895));
    }
}
