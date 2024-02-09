package defpackage;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import defpackage.l80;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: c80  reason: default package */
/* loaded from: classes.dex */
public class c80 {
    public final b a;
    public final Context b;
    public final ExecutorService c;
    public final d80 d;
    public final Map<String, w70> e;
    public final Map<Object, u70> f;
    public final Map<Object, u70> g;
    public final Set<Object> h;
    public final Handler i;
    public final Handler j;
    public final x70 k;
    public final u80 l;
    public final List<w70> m;
    public final c n;
    public final boolean o;
    public boolean p;

    /* compiled from: AxisPay */
    /* renamed from: c80$a */
    /* loaded from: classes.dex */
    public static class a extends Handler {
        public final c80 a;

        /* compiled from: AxisPay */
        /* renamed from: c80$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0002a implements Runnable {
            public final /* synthetic */ Message b;

            public RunnableC0002a(a aVar, Message message) {
                this.b = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError(C0059ao.a(3111) + this.b.what);
            }
        }

        public a(Looper looper, c80 c80Var) {
            super(looper);
            this.a = c80Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.a.v((u70) message.obj);
                    return;
                case 2:
                    this.a.o((u70) message.obj);
                    return;
                case 3:
                case 8:
                default:
                    n80.p.post(new RunnableC0002a(this, message));
                    return;
                case 4:
                    this.a.p((w70) message.obj);
                    return;
                case 5:
                    this.a.u((w70) message.obj);
                    return;
                case 6:
                    this.a.q((w70) message.obj, false);
                    return;
                case 7:
                    this.a.n();
                    return;
                case 9:
                    this.a.r((NetworkInfo) message.obj);
                    return;
                case 10:
                    this.a.m(message.arg1 == 1);
                    return;
                case 11:
                    this.a.s(message.obj);
                    return;
                case 12:
                    this.a.t(message.obj);
                    return;
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: c80$b */
    /* loaded from: classes.dex */
    public static class b extends HandlerThread {
        public b() {
            super(C0059ao.a(1295), 10);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: c80$c */
    /* loaded from: classes.dex */
    public static class c extends BroadcastReceiver {
        public final c80 a;

        public c(c80 c80Var) {
            this.a = c80Var;
        }

        public void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(C0059ao.a(1271));
            if (this.a.o) {
                intentFilter.addAction(C0059ao.a(1272));
            }
            this.a.b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if (C0059ao.a(1273).equals(action)) {
                String a = C0059ao.a(1274);
                if (intent.hasExtra(a)) {
                    this.a.b(intent.getBooleanExtra(a, false));
                }
            } else if (C0059ao.a(1275).equals(action)) {
                this.a.f(((ConnectivityManager) x80.n(context, C0059ao.a(1276))).getActiveNetworkInfo());
            }
        }
    }

    public c80(Context context, ExecutorService executorService, Handler handler, d80 d80Var, x70 x70Var, u80 u80Var) {
        b bVar = new b();
        this.a = bVar;
        bVar.start();
        x80.h(bVar.getLooper());
        this.b = context;
        this.c = executorService;
        this.e = new LinkedHashMap();
        this.f = new WeakHashMap();
        this.g = new WeakHashMap();
        this.h = new LinkedHashSet();
        this.i = new a(bVar.getLooper(), this);
        this.d = d80Var;
        this.j = handler;
        this.k = x70Var;
        this.l = u80Var;
        this.m = new ArrayList(4);
        this.p = x80.p(context);
        this.o = x80.o(context, C0059ao.a(5533));
        c cVar = new c(this);
        this.n = cVar;
        cVar.a();
    }

    public final void a(w70 w70Var) {
        if (w70Var.u()) {
            return;
        }
        Bitmap bitmap = w70Var.n;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.m.add(w70Var);
        if (this.i.hasMessages(7)) {
            return;
        }
        this.i.sendEmptyMessageDelayed(7, 200L);
    }

    public void b(boolean z) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    public void c(u70 u70Var) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(2, u70Var));
    }

    public void d(w70 w70Var) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(4, w70Var));
    }

    public void e(w70 w70Var) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(6, w70Var));
    }

    public void f(NetworkInfo networkInfo) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    public void g(w70 w70Var) {
        Handler handler = this.i;
        handler.sendMessageDelayed(handler.obtainMessage(5, w70Var), 500L);
    }

    public void h(u70 u70Var) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(1, u70Var));
    }

    public final void i() {
        if (this.f.isEmpty()) {
            return;
        }
        Iterator<u70> it = this.f.values().iterator();
        while (it.hasNext()) {
            u70 next = it.next();
            it.remove();
            if (next.g().n) {
                x80.s(C0059ao.a(5534), C0059ao.a(5535), next.i().d());
            }
            w(next, false);
        }
    }

    public final void j(List<w70> list) {
        if (list == null || list.isEmpty() || !list.get(0).q().n) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (w70 w70Var : list) {
            if (sb.length() > 0) {
                sb.append(C0059ao.a(5536));
            }
            sb.append(x80.j(w70Var));
        }
        x80.s(C0059ao.a(5537), C0059ao.a(5538), sb.toString());
    }

    public final void k(u70 u70Var) {
        Object k = u70Var.k();
        if (k != null) {
            u70Var.k = true;
            this.f.put(k, u70Var);
        }
    }

    public final void l(w70 w70Var) {
        u70 h = w70Var.h();
        if (h != null) {
            k(h);
        }
        List<u70> i = w70Var.i();
        if (i != null) {
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                k(i.get(i2));
            }
        }
    }

    public void m(boolean z) {
        this.p = z;
    }

    public void n() {
        ArrayList arrayList = new ArrayList(this.m);
        this.m.clear();
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        j(arrayList);
    }

    public void o(u70 u70Var) {
        String d = u70Var.d();
        w70 w70Var = this.e.get(d);
        String a2 = C0059ao.a(5539);
        String a3 = C0059ao.a(5540);
        if (w70Var != null) {
            w70Var.f(u70Var);
            if (w70Var.c()) {
                this.e.remove(d);
                if (u70Var.g().n) {
                    x80.s(a3, a2, u70Var.i().d());
                }
            }
        }
        if (this.h.contains(u70Var.j())) {
            this.g.remove(u70Var.k());
            if (u70Var.g().n) {
                x80.t(a3, a2, u70Var.i().d(), C0059ao.a(5541));
            }
        }
        u70 remove = this.f.remove(u70Var.k());
        if (remove == null || !remove.g().n) {
            return;
        }
        x80.t(a3, a2, remove.i().d(), C0059ao.a(5542));
    }

    public void p(w70 w70Var) {
        if (j80.b(w70Var.p())) {
            this.k.c(w70Var.n(), w70Var.s());
        }
        this.e.remove(w70Var.n());
        a(w70Var);
        if (w70Var.q().n) {
            x80.t(C0059ao.a(5543), C0059ao.a(5544), x80.j(w70Var), C0059ao.a(5545));
        }
    }

    public void q(w70 w70Var, boolean z) {
        if (w70Var.q().n) {
            String j = x80.j(w70Var);
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(5546));
            sb.append(z ? C0059ao.a(5547) : C0059ao.a(5548));
            x80.t(C0059ao.a(5549), C0059ao.a(5550), j, sb.toString());
        }
        this.e.remove(w70Var.n());
        a(w70Var);
    }

    public void r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.c;
        if (executorService instanceof p80) {
            ((p80) executorService).a(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        i();
    }

    public void s(Object obj) {
        if (this.h.add(obj)) {
            Iterator<w70> it = this.e.values().iterator();
            while (it.hasNext()) {
                w70 next = it.next();
                boolean z = next.q().n;
                u70 h = next.h();
                List<u70> i = next.i();
                boolean z2 = (i == null || i.isEmpty()) ? false : true;
                if (h != null || z2) {
                    String a2 = C0059ao.a(5551);
                    String a3 = C0059ao.a(5552);
                    String a4 = C0059ao.a(5553);
                    String a5 = C0059ao.a(5554);
                    if (h != null && h.j().equals(obj)) {
                        next.f(h);
                        this.g.put(h.k(), h);
                        if (z) {
                            x80.t(a5, a4, h.b.d(), a3 + obj + a2);
                        }
                    }
                    if (z2) {
                        for (int size = i.size() - 1; size >= 0; size--) {
                            u70 u70Var = i.get(size);
                            if (u70Var.j().equals(obj)) {
                                next.f(u70Var);
                                this.g.put(u70Var.k(), u70Var);
                                if (z) {
                                    x80.t(a5, a4, u70Var.b.d(), a3 + obj + a2);
                                }
                            }
                        }
                    }
                    if (next.c()) {
                        it.remove();
                        if (z) {
                            x80.t(a5, C0059ao.a(5555), x80.j(next), C0059ao.a(5556));
                        }
                    }
                }
            }
        }
    }

    public void t(Object obj) {
        if (this.h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<u70> it = this.g.values().iterator();
            while (it.hasNext()) {
                u70 next = it.next();
                if (next.j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public void u(w70 w70Var) {
        if (w70Var.u()) {
            return;
        }
        boolean z = false;
        if (this.c.isShutdown()) {
            q(w70Var, false);
            return;
        }
        if (w70Var.w(this.p, this.o ? ((ConnectivityManager) x80.n(this.b, C0059ao.a(5557))).getActiveNetworkInfo() : null)) {
            if (w70Var.q().n) {
                x80.s(C0059ao.a(5558), C0059ao.a(5559), x80.j(w70Var));
            }
            if (w70Var.k() instanceof l80.a) {
                w70Var.j |= k80.NO_CACHE.b;
            }
            w70Var.o = this.c.submit(w70Var);
            return;
        }
        if (this.o && w70Var.x()) {
            z = true;
        }
        q(w70Var, z);
        if (z) {
            l(w70Var);
        }
    }

    public void v(u70 u70Var) {
        w(u70Var, true);
    }

    public void w(u70 u70Var, boolean z) {
        boolean contains = this.h.contains(u70Var.j());
        String a2 = C0059ao.a(5560);
        if (contains) {
            this.g.put(u70Var.k(), u70Var);
            if (u70Var.g().n) {
                String d = u70Var.b.d();
                x80.t(a2, C0059ao.a(5563), d, C0059ao.a(5561) + u70Var.j() + C0059ao.a(5562));
                return;
            }
            return;
        }
        w70 w70Var = this.e.get(u70Var.d());
        if (w70Var != null) {
            w70Var.b(u70Var);
        } else if (this.c.isShutdown()) {
            if (u70Var.g().n) {
                x80.t(a2, C0059ao.a(5564), u70Var.b.d(), C0059ao.a(5565));
            }
        } else {
            w70 g = w70.g(u70Var.g(), this, this.k, this.l, u70Var);
            g.o = this.c.submit(g);
            this.e.put(u70Var.d(), g);
            if (z) {
                this.f.remove(u70Var.k());
            }
            if (u70Var.g().n) {
                x80.s(a2, C0059ao.a(5566), u70Var.b.d());
            }
        }
    }
}
