package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.SparseArray;
import defpackage.rh;
import defpackage.sh;
import defpackage.uh;
import defpackage.vh;
import defpackage.xh;
import defpackage.yh;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: rh  reason: default package */
/* loaded from: classes.dex */
public class rh extends uh {
    public final MediaRouter2 i;
    public final a j;
    public final Map<MediaRouter2.RoutingController, c> k;
    public final MediaRouter2.RouteCallback l;
    public final MediaRouter2.TransferCallback m;
    public final MediaRouter2.ControllerCallback n;
    public final Handler o;
    public final Executor p;
    public List<MediaRoute2Info> q;
    public Map<String, String> r;

    /* compiled from: AxisPay */
    /* renamed from: rh$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract void a(uh.e eVar);

        public abstract void b(int i);

        public abstract void c(String str, int i);
    }

    /* compiled from: AxisPay */
    /* renamed from: rh$b */
    /* loaded from: classes.dex */
    public class b extends MediaRouter2.ControllerCallback {
        public b() {
        }

        @Override // android.media.MediaRouter2.ControllerCallback
        public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
            rh.this.F(routingController);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rh$c */
    /* loaded from: classes.dex */
    public class c extends uh.b {
        public final String f;
        public final MediaRouter2.RoutingController g;
        public final Messenger h;
        public final Messenger i;
        public final Handler k;
        public sh o;
        public final SparseArray<yh.d> j = new SparseArray<>();
        public AtomicInteger l = new AtomicInteger(1);
        public final Runnable m = new Runnable() { // from class: fh
            @Override // java.lang.Runnable
            public final void run() {
                rh.c.this.s();
            }
        };
        public int n = -1;

        /* compiled from: AxisPay */
        /* renamed from: rh$c$a */
        /* loaded from: classes.dex */
        public class a extends Handler {
            public a() {
                super(Looper.getMainLooper());
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                int i2 = message.arg1;
                int i3 = message.arg2;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                yh.d dVar = c.this.j.get(i2);
                if (dVar == null) {
                    Log.w(C0059ao.a(3579), C0059ao.a(3580));
                    return;
                }
                c.this.j.remove(i2);
                if (i == 3) {
                    dVar.b((Bundle) obj);
                } else if (i != 4) {
                } else {
                    dVar.a(peekData == null ? null : peekData.getString(C0059ao.a(3581)), (Bundle) obj);
                }
            }
        }

        public c(MediaRouter2.RoutingController routingController, String str) {
            this.g = routingController;
            this.f = str;
            Messenger A = rh.A(routingController);
            this.h = A;
            this.i = A == null ? null : new Messenger(new a());
            this.k = new Handler(Looper.getMainLooper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void s() {
            this.n = -1;
        }

        @Override // defpackage.uh.e
        public void d() {
            this.g.release();
        }

        @Override // defpackage.uh.e
        public void f(int i) {
            MediaRouter2.RoutingController routingController = this.g;
            if (routingController == null) {
                return;
            }
            routingController.setVolume(i);
            this.n = i;
            t();
        }

        @Override // defpackage.uh.e
        public void i(int i) {
            MediaRouter2.RoutingController routingController = this.g;
            if (routingController == null) {
                return;
            }
            int i2 = this.n;
            if (i2 < 0) {
                i2 = routingController.getVolume();
            }
            int max = Math.max(0, Math.min(i2 + i, this.g.getVolumeMax()));
            this.n = max;
            this.g.setVolume(max);
            t();
        }

        @Override // defpackage.uh.b
        public void m(String str) {
            String a2 = C0059ao.a(10631);
            if (str != null && !str.isEmpty()) {
                MediaRoute2Info B = rh.this.B(str);
                if (B == null) {
                    Log.w(a2, C0059ao.a(10632) + str);
                    return;
                }
                this.g.selectRoute(B);
                return;
            }
            Log.w(a2, C0059ao.a(10633));
        }

        @Override // defpackage.uh.b
        public void n(String str) {
            String a2 = C0059ao.a(10634);
            if (str != null && !str.isEmpty()) {
                MediaRoute2Info B = rh.this.B(str);
                if (B == null) {
                    Log.w(a2, C0059ao.a(10635) + str);
                    return;
                }
                this.g.deselectRoute(B);
                return;
            }
            Log.w(a2, C0059ao.a(10636));
        }

        @Override // defpackage.uh.b
        public void o(List<String> list) {
            String a2 = C0059ao.a(10637);
            if (list != null && !list.isEmpty()) {
                String str = list.get(0);
                MediaRoute2Info B = rh.this.B(str);
                if (B == null) {
                    Log.w(a2, C0059ao.a(10638) + str);
                    return;
                }
                rh.this.i.transferTo(B);
                return;
            }
            Log.w(a2, C0059ao.a(10639));
        }

        public String q() {
            sh shVar = this.o;
            return shVar != null ? shVar.l() : this.g.getId();
        }

        public final void t() {
            this.k.removeCallbacks(this.m);
            this.k.postDelayed(this.m, 1000L);
        }

        public void u(sh shVar) {
            this.o = shVar;
        }

        public void v(String str, int i) {
            MediaRouter2.RoutingController routingController = this.g;
            if (routingController == null || routingController.isReleased() || this.h == null) {
                return;
            }
            int andIncrement = this.l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt(C0059ao.a(10640), i);
            bundle.putString(C0059ao.a(10641), str);
            obtain.setData(bundle);
            obtain.replyTo = this.i;
            try {
                this.h.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e) {
                Log.e(C0059ao.a(10642), C0059ao.a(10643), e);
            }
        }

        public void w(String str, int i) {
            MediaRouter2.RoutingController routingController = this.g;
            if (routingController == null || routingController.isReleased() || this.h == null) {
                return;
            }
            int andIncrement = this.l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt(C0059ao.a(10644), i);
            bundle.putString(C0059ao.a(10645), str);
            obtain.setData(bundle);
            obtain.replyTo = this.i;
            try {
                this.h.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e) {
                Log.e(C0059ao.a(10646), C0059ao.a(10647), e);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rh$d */
    /* loaded from: classes.dex */
    public class d extends uh.e {
        public final String a;
        public final c b;

        public d(rh rhVar, String str, c cVar) {
            this.a = str;
            this.b = cVar;
        }

        @Override // defpackage.uh.e
        public void f(int i) {
            c cVar;
            String str = this.a;
            if (str == null || (cVar = this.b) == null) {
                return;
            }
            cVar.v(str, i);
        }

        @Override // defpackage.uh.e
        public void i(int i) {
            c cVar;
            String str = this.a;
            if (str == null || (cVar = this.b) == null) {
                return;
            }
            cVar.w(str, i);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rh$e */
    /* loaded from: classes.dex */
    public class e extends MediaRouter2.RouteCallback {
        public e() {
        }

        @Override // android.media.MediaRouter2.RouteCallback
        public void onRoutesAdded(List<MediaRoute2Info> list) {
            rh.this.E();
        }

        @Override // android.media.MediaRouter2.RouteCallback
        public void onRoutesChanged(List<MediaRoute2Info> list) {
            rh.this.E();
        }

        @Override // android.media.MediaRouter2.RouteCallback
        public void onRoutesRemoved(List<MediaRoute2Info> list) {
            rh.this.E();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rh$f */
    /* loaded from: classes.dex */
    public class f extends MediaRouter2.TransferCallback {
        public f() {
        }

        @Override // android.media.MediaRouter2.TransferCallback
        public void onStop(MediaRouter2.RoutingController routingController) {
            c remove = rh.this.k.remove(routingController);
            if (remove != null) {
                rh.this.j.a(remove);
                return;
            }
            Log.w(C0059ao.a(10718), C0059ao.a(10717) + routingController);
        }

        @Override // android.media.MediaRouter2.TransferCallback
        public void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
            rh.this.k.remove(routingController);
            if (routingController2 == rh.this.i.getSystemController()) {
                rh.this.j.b(3);
                return;
            }
            List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
            if (selectedRoutes.isEmpty()) {
                Log.w(C0059ao.a(10719), C0059ao.a(10720));
                return;
            }
            String id = selectedRoutes.get(0).getId();
            rh.this.k.put(routingController2, new c(routingController2, id));
            rh.this.j.c(id, 3);
            rh.this.F(routingController2);
        }

        @Override // android.media.MediaRouter2.TransferCallback
        public void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
            Log.w(C0059ao.a(10722), C0059ao.a(10721) + mediaRoute2Info);
        }
    }

    static {
        Log.isLoggable(C0059ao.a(990), 3);
    }

    public rh(Context context, a aVar) {
        super(context);
        this.k = new ArrayMap();
        this.l = new e();
        this.m = new f();
        this.n = new b();
        this.q = new ArrayList();
        this.r = new ArrayMap();
        this.i = MediaRouter2.getInstance(context);
        this.j = aVar;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.o = handler;
        Objects.requireNonNull(handler);
        this.p = new Executor() { // from class: qh
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    public static Messenger A(MediaRouter2.RoutingController routingController) {
        Bundle controlHints;
        if (routingController == null || (controlHints = routingController.getControlHints()) == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable(C0059ao.a(991));
    }

    public static String C(uh.e eVar) {
        MediaRouter2.RoutingController routingController;
        if ((eVar instanceof c) && (routingController = ((c) eVar).g) != null) {
            return routingController.getId();
        }
        return null;
    }

    public static /* synthetic */ boolean D(MediaRoute2Info mediaRoute2Info) {
        return !mediaRoute2Info.isSystemRoute();
    }

    public MediaRoute2Info B(String str) {
        if (str == null) {
            return null;
        }
        for (MediaRoute2Info mediaRoute2Info : this.q) {
            if (TextUtils.equals(mediaRoute2Info.getId(), str)) {
                return mediaRoute2Info;
            }
        }
        return null;
    }

    public void E() {
        List<MediaRoute2Info> list = (List) this.i.getRoutes().stream().distinct().filter(new Predicate() { // from class: gh
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return rh.D((MediaRoute2Info) obj);
            }
        }).collect(Collectors.toList());
        if (list.equals(this.q)) {
            return;
        }
        this.q = list;
        this.r.clear();
        for (MediaRoute2Info mediaRoute2Info : this.q) {
            Bundle extras = mediaRoute2Info.getExtras();
            if (extras != null) {
                String a2 = C0059ao.a(992);
                if (extras.getString(a2) != null) {
                    this.r.put(mediaRoute2Info.getId(), extras.getString(a2));
                }
            }
            Log.w(C0059ao.a(994), C0059ao.a(993) + mediaRoute2Info);
        }
        vh.a aVar = new vh.a();
        aVar.d(true);
        aVar.b((List) this.q.stream().map(new Function() { // from class: nh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return zh.c((MediaRoute2Info) obj);
            }
        }).filter(new Predicate() { // from class: oh
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((sh) obj);
            }
        }).collect(Collectors.toList()));
        x(aVar.c());
    }

    public void F(MediaRouter2.RoutingController routingController) {
        c cVar = this.k.get(routingController);
        String a2 = C0059ao.a(995);
        if (cVar == null) {
            Log.w(a2, C0059ao.a(996) + routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w(a2, C0059ao.a(997) + routingController);
            return;
        }
        List<String> a3 = zh.a(selectedRoutes);
        sh c2 = zh.c(selectedRoutes.get(0));
        sh shVar = null;
        Bundle controlHints = routingController.getControlHints();
        String string = n().getString(rg.mr_dialog_default_group_name);
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString(C0059ao.a(998));
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle(C0059ao.a(999));
                if (bundle != null) {
                    shVar = sh.d(bundle);
                }
            } catch (Exception e2) {
                Log.w(a2, C0059ao.a(1000), e2);
            }
        }
        if (shVar == null) {
            sh.a aVar = new sh.a(routingController.getId(), string);
            aVar.g(2);
            aVar.p(1);
            aVar.r(routingController.getVolume());
            aVar.t(routingController.getVolumeMax());
            aVar.s(routingController.getVolumeHandling());
            aVar.b(c2.f());
            aVar.d(a3);
            shVar = aVar.e();
        }
        List<String> a4 = zh.a(routingController.getSelectableRoutes());
        List<String> a5 = zh.a(routingController.getDeselectableRoutes());
        vh o = o();
        if (o == null) {
            Log.w(a2, C0059ao.a(1001));
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<sh> b2 = o.b();
        if (!b2.isEmpty()) {
            for (sh shVar2 : b2) {
                String l = shVar2.l();
                uh.b.c.a aVar2 = new uh.b.c.a(shVar2);
                aVar2.e(a3.contains(l) ? 3 : 1);
                aVar2.b(a4.contains(l));
                aVar2.d(a5.contains(l));
                aVar2.c(true);
                arrayList.add(aVar2.a());
            }
        }
        cVar.u(shVar);
        cVar.l(shVar, arrayList);
    }

    public void G(String str) {
        MediaRoute2Info B = B(str);
        if (B == null) {
            Log.w(C0059ao.a(1003), C0059ao.a(1002) + str);
            return;
        }
        this.i.transferTo(B);
    }

    public final th H(th thVar, boolean z) {
        if (thVar == null) {
            thVar = new th(xh.c, false);
        }
        List<String> e2 = thVar.c().e();
        String a2 = C0059ao.a(1004);
        if (z) {
            if (!e2.contains(a2)) {
                e2.add(a2);
            }
        } else {
            e2.remove(a2);
        }
        xh.a aVar = new xh.a();
        aVar.a(e2);
        return new th(aVar.d(), thVar.d());
    }

    @Override // defpackage.uh
    public uh.b s(String str) {
        for (Map.Entry<MediaRouter2.RoutingController, c> entry : this.k.entrySet()) {
            c value = entry.getValue();
            if (TextUtils.equals(str, value.f)) {
                return value;
            }
        }
        return null;
    }

    @Override // defpackage.uh
    public uh.e t(String str) {
        return new d(this, this.r.get(str), null);
    }

    @Override // defpackage.uh
    public uh.e u(String str, String str2) {
        String str3 = this.r.get(str);
        for (c cVar : this.k.values()) {
            if (TextUtils.equals(str2, cVar.q())) {
                return new d(this, str3, cVar);
            }
        }
        Log.w(C0059ao.a(1007), C0059ao.a(1005) + str + C0059ao.a(1006) + str2);
        return new d(this, str3, null);
    }

    @Override // defpackage.uh
    public void v(th thVar) {
        if (yh.f() > 0) {
            this.i.registerRouteCallback(this.p, this.l, zh.b(H(thVar, yh.n())));
            this.i.registerTransferCallback(this.p, this.m);
            this.i.registerControllerCallback(this.p, this.n);
            return;
        }
        this.i.unregisterRouteCallback(this.l);
        this.i.unregisterTransferCallback(this.m);
        this.i.unregisterControllerCallback(this.n);
    }
}
