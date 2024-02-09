package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.PicassoProvider;
import defpackage.u70;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: n80  reason: default package */
/* loaded from: classes.dex */
public class n80 {
    public static final Handler p = new a(Looper.getMainLooper());
    @SuppressLint({"StaticFieldLeak"})
    public static volatile n80 q = null;
    public final d a;
    public final g b;
    public final c c;
    public final List<s80> d;
    public final Context e;
    public final c80 f;
    public final x70 g;
    public final u80 h;
    public final Map<Object, u70> i;
    public final Map<ImageView, b80> j;
    public final ReferenceQueue<Object> k;
    public final Bitmap.Config l;
    public boolean m;
    public volatile boolean n;
    public boolean o;

    /* compiled from: AxisPay */
    /* renamed from: n80$a */
    /* loaded from: classes.dex */
    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 3) {
                u70 u70Var = (u70) message.obj;
                if (u70Var.g().n) {
                    x80.t(C0059ao.a(1712), C0059ao.a(1713), u70Var.b.d(), C0059ao.a(1714));
                }
                u70Var.a.a(u70Var.k());
                return;
            }
            int i2 = 0;
            if (i == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i2 < size) {
                    w70 w70Var = (w70) list.get(i2);
                    w70Var.c.c(w70Var);
                    i2++;
                }
            } else if (i == 13) {
                List list2 = (List) message.obj;
                int size2 = list2.size();
                while (i2 < size2) {
                    u70 u70Var2 = (u70) list2.get(i2);
                    u70Var2.a.l(u70Var2);
                    i2++;
                }
            } else {
                throw new AssertionError(C0059ao.a(1711) + message.what);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: n80$b */
    /* loaded from: classes.dex */
    public static class b {
        public final Context a;
        public d80 b;
        public ExecutorService c;
        public x70 d;
        public d e;
        public g f;
        public List<s80> g;
        public Bitmap.Config h;
        public boolean i;
        public boolean j;

        public b(Context context) {
            if (context != null) {
                this.a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException(C0059ao.a(1700));
        }

        public n80 a() {
            Context context = this.a;
            if (this.b == null) {
                this.b = new m80(context);
            }
            if (this.d == null) {
                this.d = new g80(context);
            }
            if (this.c == null) {
                this.c = new p80();
            }
            if (this.f == null) {
                this.f = g.a;
            }
            u80 u80Var = new u80(this.d);
            return new n80(context, new c80(context, this.c, n80.p, this.b, this.d, u80Var), this.d, this.e, this.f, this.g, u80Var, this.h, this.i, this.j);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: n80$c */
    /* loaded from: classes.dex */
    public static class c extends Thread {
        public final ReferenceQueue<Object> b;
        public final Handler c;

        /* compiled from: AxisPay */
        /* renamed from: n80$c$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ Exception b;

            public a(c cVar, Exception exc) {
                this.b = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.b);
            }
        }

        public c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.b = referenceQueue;
            this.c = handler;
            setDaemon(true);
            setName(C0059ao.a(1234));
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    u70.a aVar = (u70.a) this.b.remove(1000L);
                    Message obtainMessage = this.c.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.a;
                        this.c.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.c.post(new a(this, e));
                    return;
                }
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: n80$d */
    /* loaded from: classes.dex */
    public interface d {
        void a(n80 n80Var, Uri uri, Exception exc);
    }

    /* compiled from: AxisPay */
    /* renamed from: n80$e */
    /* loaded from: classes.dex */
    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        
        public final int b;

        e(int i) {
            this.b = i;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: n80$f */
    /* loaded from: classes.dex */
    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    /* compiled from: AxisPay */
    /* renamed from: n80$g */
    /* loaded from: classes.dex */
    public interface g {
        public static final g a = new a();

        /* compiled from: AxisPay */
        /* renamed from: n80$g$a */
        /* loaded from: classes.dex */
        public static class a implements g {
            @Override // defpackage.n80.g
            public q80 a(q80 q80Var) {
                return q80Var;
            }
        }

        q80 a(q80 q80Var);
    }

    public n80(Context context, c80 c80Var, x70 x70Var, d dVar, g gVar, List<s80> list, u80 u80Var, Bitmap.Config config, boolean z, boolean z2) {
        this.e = context;
        this.f = c80Var;
        this.g = x70Var;
        this.a = dVar;
        this.b = gVar;
        this.l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new t80(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new z70(context));
        arrayList.add(new i80(context));
        arrayList.add(new a80(context));
        arrayList.add(new v70(context));
        arrayList.add(new e80(context));
        arrayList.add(new l80(c80Var.d, u80Var));
        this.d = Collections.unmodifiableList(arrayList);
        this.h = u80Var;
        this.i = new WeakHashMap();
        this.j = new WeakHashMap();
        this.m = z;
        this.n = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.k = referenceQueue;
        c cVar = new c(referenceQueue, p);
        this.c = cVar;
        cVar.start();
    }

    public static n80 g() {
        if (q == null) {
            synchronized (n80.class) {
                if (q == null) {
                    Context context = PicassoProvider.b;
                    if (context != null) {
                        q = new b(context).a();
                    } else {
                        throw new IllegalStateException(C0059ao.a(5484));
                    }
                }
            }
        }
        return q;
    }

    public void a(Object obj) {
        x80.c();
        u70 remove = this.i.remove(obj);
        if (remove != null) {
            remove.a();
            this.f.c(remove);
        }
        if (obj instanceof ImageView) {
            b80 remove2 = this.j.remove((ImageView) obj);
            if (remove2 != null) {
                remove2.a();
            }
        }
    }

    public void b(ImageView imageView) {
        if (imageView != null) {
            a(imageView);
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(5485));
    }

    public void c(w70 w70Var) {
        u70 h = w70Var.h();
        List<u70> i = w70Var.i();
        boolean z = true;
        boolean z2 = (i == null || i.isEmpty()) ? false : true;
        if (h == null && !z2) {
            z = false;
        }
        if (z) {
            Uri uri = w70Var.j().d;
            Exception k = w70Var.k();
            Bitmap s = w70Var.s();
            e o = w70Var.o();
            if (h != null) {
                e(s, o, h, k);
            }
            if (z2) {
                int size = i.size();
                for (int i2 = 0; i2 < size; i2++) {
                    e(s, o, i.get(i2), k);
                }
            }
            d dVar = this.a;
            if (dVar == null || k == null) {
                return;
            }
            dVar.a(this, uri, k);
        }
    }

    public void d(ImageView imageView, b80 b80Var) {
        if (this.j.containsKey(imageView)) {
            a(imageView);
        }
        this.j.put(imageView, b80Var);
    }

    public final void e(Bitmap bitmap, e eVar, u70 u70Var, Exception exc) {
        if (u70Var.l()) {
            return;
        }
        if (!u70Var.m()) {
            this.i.remove(u70Var.k());
        }
        String a2 = C0059ao.a(5486);
        if (bitmap == null) {
            u70Var.c(exc);
            if (this.n) {
                x80.t(a2, C0059ao.a(5490), u70Var.b.d(), exc.getMessage());
            }
        } else if (eVar != null) {
            u70Var.b(bitmap, eVar);
            if (this.n) {
                String d2 = u70Var.b.d();
                x80.t(a2, C0059ao.a(5488), d2, C0059ao.a(5487) + eVar);
            }
        } else {
            throw new AssertionError(C0059ao.a(5489));
        }
    }

    public void f(u70 u70Var) {
        Object k = u70Var.k();
        if (k != null && this.i.get(k) != u70Var) {
            a(k);
            this.i.put(k, u70Var);
        }
        m(u70Var);
    }

    public List<s80> h() {
        return this.d;
    }

    public r80 i(Uri uri) {
        return new r80(this, uri, 0);
    }

    public r80 j(String str) {
        if (str == null) {
            return new r80(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return i(Uri.parse(str));
        }
        throw new IllegalArgumentException(C0059ao.a(5491));
    }

    public Bitmap k(String str) {
        Bitmap a2 = this.g.a(str);
        if (a2 != null) {
            this.h.d();
        } else {
            this.h.e();
        }
        return a2;
    }

    public void l(u70 u70Var) {
        Bitmap k = j80.a(u70Var.e) ? k(u70Var.d()) : null;
        String a2 = C0059ao.a(5492);
        if (k != null) {
            e eVar = e.MEMORY;
            e(k, eVar, u70Var, null);
            if (this.n) {
                String d2 = u70Var.b.d();
                x80.t(a2, C0059ao.a(5494), d2, C0059ao.a(5493) + eVar);
                return;
            }
            return;
        }
        f(u70Var);
        if (this.n) {
            x80.s(a2, C0059ao.a(5495), u70Var.b.d());
        }
    }

    public void m(u70 u70Var) {
        this.f.h(u70Var);
    }

    public q80 n(q80 q80Var) {
        this.b.a(q80Var);
        if (q80Var != null) {
            return q80Var;
        }
        throw new IllegalStateException(C0059ao.a(5496) + this.b.getClass().getCanonicalName() + C0059ao.a(5497) + q80Var);
    }
}
