package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import android.os.Build;
import defpackage.l80;
import defpackage.n80;
import defpackage.s80;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import myunmn.C0059ao;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

/* compiled from: AxisPay */
/* renamed from: w70  reason: default package */
/* loaded from: classes.dex */
public class w70 implements Runnable {
    public static final Object u = new Object();
    public static final ThreadLocal<StringBuilder> v = new a();
    public static final AtomicInteger w = new AtomicInteger();
    public static final s80 x = new b();
    public final int b = w.incrementAndGet();
    public final n80 c;
    public final c80 d;
    public final x70 e;
    public final u80 f;
    public final String g;
    public final q80 h;
    public final int i;
    public int j;
    public final s80 k;
    public u70 l;
    public List<u70> m;
    public Bitmap n;
    public Future<?> o;
    public n80.e p;
    public Exception q;
    public int r;
    public int s;
    public n80.f t;

    /* compiled from: AxisPay */
    /* renamed from: w70$a */
    /* loaded from: classes.dex */
    public static class a extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder(C0059ao.a(14358));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: w70$b */
    /* loaded from: classes.dex */
    public static class b extends s80 {
        @Override // defpackage.s80
        public boolean c(q80 q80Var) {
            return true;
        }

        @Override // defpackage.s80
        public s80.a f(q80 q80Var, int i) throws IOException {
            throw new IllegalStateException(C0059ao.a(14439) + q80Var);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: w70$c */
    /* loaded from: classes.dex */
    public static class c implements Runnable {
        public final /* synthetic */ w80 b;
        public final /* synthetic */ RuntimeException c;

        public c(w80 w80Var, RuntimeException runtimeException) {
            this.b = w80Var;
            this.c = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException(C0059ao.a(14710) + this.b.b() + C0059ao.a(14711), this.c);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: w70$d */
    /* loaded from: classes.dex */
    public static class d implements Runnable {
        public final /* synthetic */ StringBuilder b;

        public d(StringBuilder sb) {
            this.b = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.b.toString());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: w70$e */
    /* loaded from: classes.dex */
    public static class e implements Runnable {
        public final /* synthetic */ w80 b;

        public e(w80 w80Var) {
            this.b = w80Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException(C0059ao.a(14724) + this.b.b() + C0059ao.a(14725));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: w70$f */
    /* loaded from: classes.dex */
    public static class f implements Runnable {
        public final /* synthetic */ w80 b;

        public f(w80 w80Var) {
            this.b = w80Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException(C0059ao.a(14728) + this.b.b() + C0059ao.a(14729));
        }
    }

    public w70(n80 n80Var, c80 c80Var, x70 x70Var, u80 u80Var, u70 u70Var, s80 s80Var) {
        this.c = n80Var;
        this.d = c80Var;
        this.e = x70Var;
        this.f = u80Var;
        this.l = u70Var;
        this.g = u70Var.d();
        this.h = u70Var.i();
        this.t = u70Var.h();
        this.i = u70Var.e();
        this.j = u70Var.f();
        this.k = s80Var;
        this.s = s80Var.e();
    }

    public static Bitmap a(List<w80> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            w80 w80Var = list.get(i);
            try {
                Bitmap a2 = w80Var.a(bitmap);
                if (a2 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C0059ao.a(8883));
                    sb.append(w80Var.b());
                    sb.append(C0059ao.a(8884));
                    sb.append(i);
                    sb.append(C0059ao.a(8885));
                    for (w80 w80Var2 : list) {
                        sb.append(w80Var2.b());
                        sb.append('\n');
                    }
                    n80.p.post(new d(sb));
                    return null;
                } else if (a2 == bitmap && bitmap.isRecycled()) {
                    n80.p.post(new e(w80Var));
                    return null;
                } else if (a2 != bitmap && !bitmap.isRecycled()) {
                    n80.p.post(new f(w80Var));
                    return null;
                } else {
                    i++;
                    bitmap = a2;
                }
            } catch (RuntimeException e2) {
                n80.p.post(new c(w80Var, e2));
                return null;
            }
        }
        return bitmap;
    }

    public static Bitmap e(Source source, q80 q80Var) throws IOException {
        BufferedSource buffer = Okio.buffer(source);
        boolean r = x80.r(buffer);
        boolean z = q80Var.r && Build.VERSION.SDK_INT < 21;
        BitmapFactory.Options d2 = s80.d(q80Var);
        boolean g = s80.g(d2);
        if (!r && !z) {
            InputStream inputStream = buffer.inputStream();
            if (g) {
                h80 h80Var = new h80(inputStream);
                h80Var.b(false);
                long k = h80Var.k(1024);
                BitmapFactory.decodeStream(h80Var, null, d2);
                s80.b(q80Var.h, q80Var.i, d2, q80Var);
                h80Var.j(k);
                h80Var.b(true);
                inputStream = h80Var;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, d2);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException(C0059ao.a(8886));
        }
        byte[] readByteArray = buffer.readByteArray();
        if (g) {
            BitmapFactory.decodeByteArray(readByteArray, 0, readByteArray.length, d2);
            s80.b(q80Var.h, q80Var.i, d2, q80Var);
        }
        return BitmapFactory.decodeByteArray(readByteArray, 0, readByteArray.length, d2);
    }

    public static w70 g(n80 n80Var, c80 c80Var, x70 x70Var, u80 u80Var, u70 u70Var) {
        q80 i = u70Var.i();
        List<s80> h = n80Var.h();
        int size = h.size();
        for (int i2 = 0; i2 < size; i2++) {
            s80 s80Var = h.get(i2);
            if (s80Var.c(i)) {
                return new w70(n80Var, c80Var, x70Var, u80Var, u70Var, s80Var);
            }
        }
        return new w70(n80Var, c80Var, x70Var, u80Var, u70Var, x);
    }

    public static int l(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int m(int i) {
        return (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    public static boolean v(boolean z, int i, int i2, int i3, int i4) {
        return !z || (i3 != 0 && i > i3) || (i4 != 0 && i2 > i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap y(defpackage.q80 r26, android.graphics.Bitmap r27, int r28) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w70.y(q80, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static void z(q80 q80Var) {
        String a2 = q80Var.a();
        StringBuilder sb = v.get();
        sb.ensureCapacity(a2.length() + 8);
        sb.replace(8, sb.length(), a2);
        Thread.currentThread().setName(sb.toString());
    }

    public void b(u70 u70Var) {
        boolean z = this.c.n;
        q80 q80Var = u70Var.b;
        u70 u70Var2 = this.l;
        String a2 = C0059ao.a(8887);
        String a3 = C0059ao.a(8888);
        String a4 = C0059ao.a(8889);
        if (u70Var2 == null) {
            this.l = u70Var;
            if (z) {
                List<u70> list = this.m;
                if (list != null && !list.isEmpty()) {
                    x80.t(a4, a3, q80Var.d(), x80.k(this, a2));
                    return;
                } else {
                    x80.t(a4, a3, q80Var.d(), C0059ao.a(8890));
                    return;
                }
            }
            return;
        }
        if (this.m == null) {
            this.m = new ArrayList(3);
        }
        this.m.add(u70Var);
        if (z) {
            x80.t(a4, a3, q80Var.d(), x80.k(this, a2));
        }
        n80.f h = u70Var.h();
        if (h.ordinal() > this.t.ordinal()) {
            this.t = h;
        }
    }

    public boolean c() {
        Future<?> future;
        if (this.l == null) {
            List<u70> list = this.m;
            return (list == null || list.isEmpty()) && (future = this.o) != null && future.cancel(false);
        }
        return false;
    }

    public final n80.f d() {
        n80.f fVar = n80.f.LOW;
        List<u70> list = this.m;
        boolean z = true;
        boolean z2 = (list == null || list.isEmpty()) ? false : true;
        u70 u70Var = this.l;
        if (u70Var == null && !z2) {
            z = false;
        }
        if (z) {
            if (u70Var != null) {
                fVar = u70Var.h();
            }
            if (z2) {
                int size = this.m.size();
                for (int i = 0; i < size; i++) {
                    n80.f h = this.m.get(i).h();
                    if (h.ordinal() > fVar.ordinal()) {
                        fVar = h;
                    }
                }
            }
            return fVar;
        }
        return fVar;
    }

    public void f(u70 u70Var) {
        boolean remove;
        if (this.l == u70Var) {
            this.l = null;
            remove = true;
        } else {
            List<u70> list = this.m;
            remove = list != null ? list.remove(u70Var) : false;
        }
        if (remove && u70Var.h() == this.t) {
            this.t = d();
        }
        if (this.c.n) {
            x80.t(C0059ao.a(8892), C0059ao.a(8893), u70Var.b.d(), x80.k(this, C0059ao.a(8891)));
        }
    }

    public u70 h() {
        return this.l;
    }

    public List<u70> i() {
        return this.m;
    }

    public q80 j() {
        return this.h;
    }

    public Exception k() {
        return this.q;
    }

    public String n() {
        return this.g;
    }

    public n80.e o() {
        return this.p;
    }

    public int p() {
        return this.i;
    }

    public n80 q() {
        return this.c;
    }

    public n80.f r() {
        return this.t;
    }

    @Override // java.lang.Runnable
    public void run() {
        String a2 = C0059ao.a(8894);
        try {
            try {
                try {
                    try {
                        z(this.h);
                        if (this.c.n) {
                            x80.s(C0059ao.a(8895), C0059ao.a(8896), x80.j(this));
                        }
                        Bitmap t = t();
                        this.n = t;
                        if (t == null) {
                            this.d.e(this);
                        } else {
                            this.d.d(this);
                        }
                    } catch (Exception e2) {
                        this.q = e2;
                        this.d.e(this);
                    } catch (OutOfMemoryError e3) {
                        StringWriter stringWriter = new StringWriter();
                        this.f.a().a(new PrintWriter(stringWriter));
                        this.q = new RuntimeException(stringWriter.toString(), e3);
                        this.d.e(this);
                    }
                } catch (IOException e4) {
                    this.q = e4;
                    this.d.g(this);
                }
            } catch (l80.b e5) {
                if (!k80.a(e5.c) || e5.b != 504) {
                    this.q = e5;
                }
                this.d.e(this);
            }
        } finally {
            Thread.currentThread().setName(a2);
        }
    }

    public Bitmap s() {
        return this.n;
    }

    public Bitmap t() throws IOException {
        Bitmap bitmap;
        if (j80.a(this.i)) {
            bitmap = this.e.a(this.g);
            if (bitmap != null) {
                this.f.d();
                this.p = n80.e.MEMORY;
                if (this.c.n) {
                    x80.t(C0059ao.a(8897), C0059ao.a(8898), this.h.d(), C0059ao.a(8899));
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        int i = this.s == 0 ? k80.OFFLINE.b : this.j;
        this.j = i;
        s80.a f2 = this.k.f(this.h, i);
        if (f2 != null) {
            this.p = f2.c();
            this.r = f2.b();
            bitmap = f2.a();
            if (bitmap == null) {
                Source d2 = f2.d();
                try {
                    bitmap = e(d2, this.h);
                } finally {
                    try {
                        d2.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.c.n) {
                x80.s(C0059ao.a(8900), C0059ao.a(8901), this.h.d());
            }
            this.f.b(bitmap);
            if (this.h.f() || this.r != 0) {
                synchronized (u) {
                    if (this.h.e() || this.r != 0) {
                        bitmap = y(this.h, bitmap, this.r);
                        if (this.c.n) {
                            x80.s(C0059ao.a(8902), C0059ao.a(8903), this.h.d());
                        }
                    }
                    if (this.h.b()) {
                        bitmap = a(this.h.g, bitmap);
                        if (this.c.n) {
                            x80.t(C0059ao.a(8904), C0059ao.a(8905), this.h.d(), C0059ao.a(8906));
                        }
                    }
                }
                if (bitmap != null) {
                    this.f.c(bitmap);
                }
            }
        }
        return bitmap;
    }

    public boolean u() {
        Future<?> future = this.o;
        return future != null && future.isCancelled();
    }

    public boolean w(boolean z, NetworkInfo networkInfo) {
        int i = this.s;
        if (i > 0) {
            this.s = i - 1;
            return this.k.h(z, networkInfo);
        }
        return false;
    }

    public boolean x() {
        return this.k.i();
    }
}
