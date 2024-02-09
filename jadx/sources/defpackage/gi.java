package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import defpackage.uh;
import defpackage.yh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: gi  reason: default package */
/* loaded from: classes.dex */
public final class gi extends uh implements ServiceConnection {
    public static final boolean q = Log.isLoggable(C0059ao.a(6667), 3);
    public final ComponentName i;
    public final d j;
    public final ArrayList<c> k;
    public boolean l;
    public boolean m;
    public a n;
    public boolean o;
    public b p;

    /* compiled from: AxisPay */
    /* renamed from: gi$a */
    /* loaded from: classes.dex */
    public final class a implements IBinder.DeathRecipient {
        public final Messenger a;
        public final e b;
        public final Messenger c;
        public int f;
        public int g;
        public int d = 1;
        public int e = 1;
        public final SparseArray<yh.d> h = new SparseArray<>();

        /* compiled from: AxisPay */
        /* renamed from: gi$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0023a implements Runnable {
            public RunnableC0023a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.e();
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: gi$a$b */
        /* loaded from: classes.dex */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                gi.this.K(aVar);
            }
        }

        public a(Messenger messenger) {
            this.a = messenger;
            e eVar = new e(this);
            this.b = eVar;
            this.c = new Messenger(eVar);
        }

        public void a(int i, String str) {
            Bundle bundle = new Bundle();
            bundle.putString(C0059ao.a(5273), str);
            int i2 = this.d;
            this.d = i2 + 1;
            s(12, i2, i, null, bundle);
        }

        public int b(String str, yh.d dVar) {
            int i = this.e;
            this.e = i + 1;
            int i2 = this.d;
            this.d = i2 + 1;
            Bundle bundle = new Bundle();
            bundle.putString(C0059ao.a(5274), str);
            s(11, i2, i, null, bundle);
            this.h.put(i2, dVar);
            return i;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            gi.this.j.post(new b());
        }

        public int c(String str, String str2) {
            int i = this.e;
            this.e = i + 1;
            Bundle bundle = new Bundle();
            bundle.putString(C0059ao.a(5275), str);
            bundle.putString(C0059ao.a(5276), str2);
            int i2 = this.d;
            this.d = i2 + 1;
            s(3, i2, i, null, bundle);
            return i;
        }

        public void d() {
            s(2, 0, 0, null, null);
            this.b.a();
            this.a.getBinder().unlinkToDeath(this, 0);
            gi.this.j.post(new RunnableC0023a());
        }

        public void e() {
            int size = this.h.size();
            for (int i = 0; i < size; i++) {
                this.h.valueAt(i).a(null, null);
            }
            this.h.clear();
        }

        public boolean f(int i, String str, Bundle bundle) {
            yh.d dVar = this.h.get(i);
            if (dVar != null) {
                this.h.remove(i);
                dVar.a(str, bundle);
                return true;
            }
            return false;
        }

        public boolean g(int i, Bundle bundle) {
            yh.d dVar = this.h.get(i);
            if (dVar != null) {
                this.h.remove(i);
                dVar.b(bundle);
                return true;
            }
            return false;
        }

        public void h(int i) {
            gi.this.I(this, i);
        }

        public boolean i(Bundle bundle) {
            if (this.f != 0) {
                gi.this.J(this, vh.a(bundle));
                return true;
            }
            return false;
        }

        public void j(int i, Bundle bundle) {
            yh.d dVar = this.h.get(i);
            if (bundle != null && bundle.containsKey(C0059ao.a(5277))) {
                this.h.remove(i);
                dVar.b(bundle);
                return;
            }
            dVar.a(C0059ao.a(5278), bundle);
        }

        public boolean k(int i, Bundle bundle) {
            if (this.f != 0) {
                Bundle bundle2 = (Bundle) bundle.getParcelable(C0059ao.a(5279));
                sh d = bundle2 != null ? sh.d(bundle2) : null;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C0059ao.a(5280));
                ArrayList arrayList = new ArrayList();
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(uh.b.c.a((Bundle) it.next()));
                }
                gi.this.O(this, i, d, arrayList);
                return true;
            }
            return false;
        }

        public boolean l(int i) {
            if (i == this.g) {
                this.g = 0;
                gi.this.L(this, C0059ao.a(5281));
            }
            yh.d dVar = this.h.get(i);
            if (dVar != null) {
                this.h.remove(i);
                dVar.a(null, null);
                return true;
            }
            return true;
        }

        public boolean m(int i) {
            return true;
        }

        public boolean n(int i, int i2, Bundle bundle) {
            if (this.f == 0 && i == this.g && i2 >= 1) {
                this.g = 0;
                this.f = i2;
                gi.this.J(this, vh.a(bundle));
                gi.this.M(this);
                return true;
            }
            return false;
        }

        public boolean o() {
            int i = this.d;
            this.d = i + 1;
            this.g = i;
            if (s(1, i, 4, null, null)) {
                try {
                    this.a.getBinder().linkToDeath(this, 0);
                    return true;
                } catch (RemoteException unused) {
                    binderDied();
                    return false;
                }
            }
            return false;
        }

        public void p(int i) {
            int i2 = this.d;
            this.d = i2 + 1;
            s(4, i2, i, null, null);
        }

        public void q(int i, String str) {
            Bundle bundle = new Bundle();
            bundle.putString(C0059ao.a(5282), str);
            int i2 = this.d;
            this.d = i2 + 1;
            s(13, i2, i, null, bundle);
        }

        public void r(int i) {
            int i2 = this.d;
            this.d = i2 + 1;
            s(5, i2, i, null, null);
        }

        public final boolean s(int i, int i2, int i3, Object obj, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = i2;
            obtain.arg2 = i3;
            obtain.obj = obj;
            obtain.setData(bundle);
            obtain.replyTo = this.c;
            try {
                this.a.send(obtain);
                return true;
            } catch (DeadObjectException unused) {
                return false;
            } catch (RemoteException e) {
                if (i != 2) {
                    Log.e(C0059ao.a(5283), C0059ao.a(5284), e);
                    return false;
                }
                return false;
            }
        }

        public void t(th thVar) {
            int i = this.d;
            this.d = i + 1;
            s(10, i, 0, thVar != null ? thVar.a() : null, null);
        }

        public void u(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt(C0059ao.a(5285), i2);
            int i3 = this.d;
            this.d = i3 + 1;
            s(7, i3, i, null, bundle);
        }

        public void v(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt(C0059ao.a(5286), i2);
            int i3 = this.d;
            this.d = i3 + 1;
            s(6, i3, i, null, bundle);
        }

        public void w(int i, List<String> list) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(C0059ao.a(5287), new ArrayList<>(list));
            int i2 = this.d;
            this.d = i2 + 1;
            s(14, i2, i, null, bundle);
        }

        public void x(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt(C0059ao.a(5288), i2);
            int i3 = this.d;
            this.d = i3 + 1;
            s(8, i3, i, null, bundle);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: gi$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(uh.e eVar);
    }

    /* compiled from: AxisPay */
    /* renamed from: gi$c */
    /* loaded from: classes.dex */
    public interface c {
        int a();

        void b();

        void c(a aVar);
    }

    /* compiled from: AxisPay */
    /* renamed from: gi$d */
    /* loaded from: classes.dex */
    public static final class d extends Handler {
    }

    /* compiled from: AxisPay */
    /* renamed from: gi$e */
    /* loaded from: classes.dex */
    public static final class e extends Handler {
        public final WeakReference<a> a;

        public e(a aVar) {
            this.a = new WeakReference<>(aVar);
        }

        public void a() {
            this.a.clear();
        }

        public final boolean b(a aVar, int i, int i2, int i3, Object obj, Bundle bundle) {
            switch (i) {
                case 0:
                    aVar.l(i2);
                    return true;
                case 1:
                    aVar.m(i2);
                    return true;
                case 2:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.n(i2, i3, (Bundle) obj);
                    }
                    return false;
                case 3:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.g(i2, (Bundle) obj);
                    }
                    return false;
                case 4:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.f(i2, bundle == null ? null : bundle.getString(C0059ao.a(5123)), (Bundle) obj);
                    }
                    return false;
                case 5:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.i((Bundle) obj);
                    }
                    return false;
                case 6:
                    if (obj instanceof Bundle) {
                        aVar.j(i2, (Bundle) obj);
                        return false;
                    }
                    Log.w(C0059ao.a(5121), C0059ao.a(5122));
                    return false;
                case 7:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.k(i3, (Bundle) obj);
                    }
                    return false;
                case 8:
                    aVar.h(i3);
                    return false;
                default:
                    return false;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = this.a.get();
            if (aVar == null || b(aVar, message.what, message.arg1, message.arg2, message.obj, message.peekData()) || !gi.q) {
                return;
            }
            String str = C0059ao.a(5124) + message;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: gi$f */
    /* loaded from: classes.dex */
    public final class f extends uh.b implements c {
        public final String f;
        public String g;
        public String h;
        public boolean i;
        public int k;
        public a l;
        public int j = -1;
        public int m = -1;

        /* compiled from: AxisPay */
        /* renamed from: gi$f$a */
        /* loaded from: classes.dex */
        public class a extends yh.d {
            public a() {
            }

            @Override // defpackage.yh.d
            public void a(String str, Bundle bundle) {
                String str2 = C0059ao.a(5161) + str + C0059ao.a(5162) + bundle;
            }

            @Override // defpackage.yh.d
            public void b(Bundle bundle) {
                f.this.g = bundle.getString(C0059ao.a(5163));
                f.this.h = bundle.getString(C0059ao.a(5164));
            }
        }

        public f(String str) {
            this.f = str;
        }

        @Override // defpackage.gi.c
        public int a() {
            return this.m;
        }

        @Override // defpackage.gi.c
        public void b() {
            a aVar = this.l;
            if (aVar != null) {
                aVar.p(this.m);
                this.l = null;
                this.m = 0;
            }
        }

        @Override // defpackage.gi.c
        public void c(a aVar) {
            a aVar2 = new a();
            this.l = aVar;
            int b = aVar.b(this.f, aVar2);
            this.m = b;
            if (this.i) {
                aVar.r(b);
                int i = this.j;
                if (i >= 0) {
                    aVar.u(this.m, i);
                    this.j = -1;
                }
                int i2 = this.k;
                if (i2 != 0) {
                    aVar.x(this.m, i2);
                    this.k = 0;
                }
            }
        }

        @Override // defpackage.uh.e
        public void d() {
            gi.this.N(this);
        }

        @Override // defpackage.uh.e
        public void e() {
            this.i = true;
            a aVar = this.l;
            if (aVar != null) {
                aVar.r(this.m);
            }
        }

        @Override // defpackage.uh.e
        public void f(int i) {
            a aVar = this.l;
            if (aVar != null) {
                aVar.u(this.m, i);
                return;
            }
            this.j = i;
            this.k = 0;
        }

        @Override // defpackage.uh.e
        public void g() {
            h(0);
        }

        @Override // defpackage.uh.e
        public void h(int i) {
            this.i = false;
            a aVar = this.l;
            if (aVar != null) {
                aVar.v(this.m, i);
            }
        }

        @Override // defpackage.uh.e
        public void i(int i) {
            a aVar = this.l;
            if (aVar != null) {
                aVar.x(this.m, i);
            } else {
                this.k += i;
            }
        }

        @Override // defpackage.uh.b
        public String j() {
            return this.g;
        }

        @Override // defpackage.uh.b
        public String k() {
            return this.h;
        }

        @Override // defpackage.uh.b
        public void m(String str) {
            a aVar = this.l;
            if (aVar != null) {
                aVar.a(this.m, str);
            }
        }

        @Override // defpackage.uh.b
        public void n(String str) {
            a aVar = this.l;
            if (aVar != null) {
                aVar.q(this.m, str);
            }
        }

        @Override // defpackage.uh.b
        public void o(List<String> list) {
            a aVar = this.l;
            if (aVar != null) {
                aVar.w(this.m, list);
            }
        }

        public void q(sh shVar, List<uh.b.c> list) {
            l(shVar, list);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: gi$g */
    /* loaded from: classes.dex */
    public final class g extends uh.e implements c {
        public final String a;
        public final String b;
        public boolean c;
        public int d = -1;
        public int e;
        public a f;
        public int g;

        public g(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // defpackage.gi.c
        public int a() {
            return this.g;
        }

        @Override // defpackage.gi.c
        public void b() {
            a aVar = this.f;
            if (aVar != null) {
                aVar.p(this.g);
                this.f = null;
                this.g = 0;
            }
        }

        @Override // defpackage.gi.c
        public void c(a aVar) {
            this.f = aVar;
            int c = aVar.c(this.a, this.b);
            this.g = c;
            if (this.c) {
                aVar.r(c);
                int i = this.d;
                if (i >= 0) {
                    aVar.u(this.g, i);
                    this.d = -1;
                }
                int i2 = this.e;
                if (i2 != 0) {
                    aVar.x(this.g, i2);
                    this.e = 0;
                }
            }
        }

        @Override // defpackage.uh.e
        public void d() {
            gi.this.N(this);
        }

        @Override // defpackage.uh.e
        public void e() {
            this.c = true;
            a aVar = this.f;
            if (aVar != null) {
                aVar.r(this.g);
            }
        }

        @Override // defpackage.uh.e
        public void f(int i) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.u(this.g, i);
                return;
            }
            this.d = i;
            this.e = 0;
        }

        @Override // defpackage.uh.e
        public void g() {
            h(0);
        }

        @Override // defpackage.uh.e
        public void h(int i) {
            this.c = false;
            a aVar = this.f;
            if (aVar != null) {
                aVar.v(this.g, i);
            }
        }

        @Override // defpackage.uh.e
        public void i(int i) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.x(this.g, i);
            } else {
                this.e += i;
            }
        }
    }

    public gi(Context context, ComponentName componentName) {
        super(context, new uh.d(componentName));
        this.k = new ArrayList<>();
        this.i = componentName;
        this.j = new d();
    }

    public final void A() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            this.k.get(i).c(this.n);
        }
    }

    public final void B() {
        String a2 = C0059ao.a(6668);
        if (this.m) {
            return;
        }
        boolean z = q;
        if (z) {
            String str = this + C0059ao.a(6669);
        }
        Intent intent = new Intent(C0059ao.a(6670));
        intent.setComponent(this.i);
        try {
            boolean bindService = n().bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
            this.m = bindService;
            if (bindService || !z) {
                return;
            }
            String str2 = this + a2;
        } catch (SecurityException unused) {
            if (q) {
                String str3 = this + a2;
            }
        }
    }

    public final uh.b C(String str) {
        vh o = o();
        if (o != null) {
            List<sh> b2 = o.b();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                if (b2.get(i).l().equals(str)) {
                    f fVar = new f(str);
                    this.k.add(fVar);
                    if (this.o) {
                        fVar.c(this.n);
                    }
                    V();
                    return fVar;
                }
            }
            return null;
        }
        return null;
    }

    public final uh.e D(String str, String str2) {
        vh o = o();
        if (o != null) {
            List<sh> b2 = o.b();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                if (b2.get(i).l().equals(str)) {
                    g gVar = new g(str, str2);
                    this.k.add(gVar);
                    if (this.o) {
                        gVar.c(this.n);
                    }
                    V();
                    return gVar;
                }
            }
            return null;
        }
        return null;
    }

    public final void E() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            this.k.get(i).b();
        }
    }

    public final void F() {
        if (this.n != null) {
            x(null);
            this.o = false;
            E();
            this.n.d();
            this.n = null;
        }
    }

    public final c G(int i) {
        Iterator<c> it = this.k.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.a() == i) {
                return next;
            }
        }
        return null;
    }

    public boolean H(String str, String str2) {
        return this.i.getPackageName().equals(str) && this.i.getClassName().equals(str2);
    }

    public void I(a aVar, int i) {
        if (this.n == aVar) {
            c G = G(i);
            b bVar = this.p;
            if (bVar != null && (G instanceof uh.e)) {
                bVar.a((uh.e) G);
            }
            N(G);
        }
    }

    public void J(a aVar, vh vhVar) {
        if (this.n == aVar) {
            if (q) {
                String str = this + C0059ao.a(6671) + vhVar;
            }
            x(vhVar);
        }
    }

    public void K(a aVar) {
        if (this.n == aVar) {
            if (q) {
                String str = this + C0059ao.a(6672);
            }
            F();
        }
    }

    public void L(a aVar, String str) {
        if (this.n == aVar) {
            if (q) {
                String str2 = this + C0059ao.a(6673) + str;
            }
            U();
        }
    }

    public void M(a aVar) {
        if (this.n == aVar) {
            this.o = true;
            A();
            th p = p();
            if (p != null) {
                this.n.t(p);
            }
        }
    }

    public void N(c cVar) {
        this.k.remove(cVar);
        cVar.b();
        V();
    }

    public void O(a aVar, int i, sh shVar, List<uh.b.c> list) {
        if (this.n == aVar) {
            if (q) {
                String str = this + C0059ao.a(6674) + list;
            }
            c G = G(i);
            if (G instanceof f) {
                ((f) G).q(shVar, list);
            }
        }
    }

    public void P() {
        if (this.n == null && R()) {
            U();
            B();
        }
    }

    public void Q(b bVar) {
        this.p = bVar;
    }

    public final boolean R() {
        if (this.l) {
            return (p() == null && this.k.isEmpty()) ? false : true;
        }
        return false;
    }

    public void S() {
        if (this.l) {
            return;
        }
        if (q) {
            String str = this + C0059ao.a(6675);
        }
        this.l = true;
        V();
    }

    public void T() {
        if (this.l) {
            if (q) {
                String str = this + C0059ao.a(6676);
            }
            this.l = false;
            V();
        }
    }

    public final void U() {
        if (this.m) {
            if (q) {
                String str = this + C0059ao.a(6677);
            }
            this.m = false;
            F();
            try {
                n().unbindService(this);
            } catch (IllegalArgumentException e2) {
                Log.e(C0059ao.a(6679), this + C0059ao.a(6678), e2);
            }
        }
    }

    public final void V() {
        if (R()) {
            B();
        } else {
            U();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z = q;
        if (z) {
            String str = this + C0059ao.a(6680);
        }
        if (this.m) {
            F();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (wh.a(messenger)) {
                a aVar = new a(messenger);
                if (aVar.o()) {
                    this.n = aVar;
                    return;
                } else if (z) {
                    String str2 = this + C0059ao.a(6681);
                    return;
                } else {
                    return;
                }
            }
            Log.e(C0059ao.a(6683), this + C0059ao.a(6682));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (q) {
            String str = this + C0059ao.a(6684);
        }
        F();
    }

    @Override // defpackage.uh
    public uh.b s(String str) {
        if (str != null) {
            return C(str);
        }
        throw new IllegalArgumentException(C0059ao.a(6685));
    }

    @Override // defpackage.uh
    public uh.e t(String str) {
        if (str != null) {
            return D(str, null);
        }
        throw new IllegalArgumentException(C0059ao.a(6686));
    }

    public String toString() {
        return C0059ao.a(6687) + this.i.flattenToShortString();
    }

    @Override // defpackage.uh
    public uh.e u(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return D(str, str2);
            }
            throw new IllegalArgumentException(C0059ao.a(6688));
        }
        throw new IllegalArgumentException(C0059ao.a(6689));
    }

    @Override // defpackage.uh
    public void v(th thVar) {
        if (this.o) {
            this.n.t(thVar);
        }
        V();
    }
}
