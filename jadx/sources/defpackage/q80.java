package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import defpackage.n80;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: q80  reason: default package */
/* loaded from: classes.dex */
public final class q80 {
    public static final long u = TimeUnit.SECONDS.toNanos(5);
    public int a;
    public long b;
    public int c;
    public final Uri d;
    public final int e;
    public final String f;
    public final List<w80> g;
    public final int h;
    public final int i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final float n;
    public final float o;
    public final float p;
    public final boolean q;
    public final boolean r;
    public final Bitmap.Config s;
    public final n80.f t;

    /* compiled from: AxisPay */
    /* renamed from: q80$b */
    /* loaded from: classes.dex */
    public static final class b {
        public Uri a;
        public int b;
        public String c;
        public int d;
        public int e;
        public boolean f;
        public int g;
        public boolean h;
        public boolean i;
        public float j;
        public float k;
        public float l;
        public boolean m;
        public boolean n;
        public List<w80> o;
        public Bitmap.Config p;
        public n80.f q;

        public b(Uri uri, int i, Bitmap.Config config) {
            this.a = uri;
            this.b = i;
            this.p = config;
        }

        public q80 a() {
            boolean z = this.h;
            if (z && this.f) {
                throw new IllegalStateException(C0059ao.a(1305));
            }
            if (this.f && this.d == 0 && this.e == 0) {
                throw new IllegalStateException(C0059ao.a(1306));
            }
            if (z && this.d == 0 && this.e == 0) {
                throw new IllegalStateException(C0059ao.a(1307));
            }
            if (this.q == null) {
                this.q = n80.f.NORMAL;
            }
            return new q80(this.a, this.b, this.c, this.o, this.d, this.e, this.f, this.h, this.g, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q);
        }

        public boolean b() {
            return (this.a == null && this.b == 0) ? false : true;
        }

        public boolean c() {
            return (this.d == 0 && this.e == 0) ? false : true;
        }

        public b d(int i, int i2) {
            if (i >= 0) {
                if (i2 >= 0) {
                    if (i2 == 0 && i == 0) {
                        throw new IllegalArgumentException(C0059ao.a(1308));
                    }
                    this.d = i;
                    this.e = i2;
                    return this;
                }
                throw new IllegalArgumentException(C0059ao.a(1309));
            }
            throw new IllegalArgumentException(C0059ao.a(1310));
        }
    }

    public String a() {
        Uri uri = this.d;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.e);
    }

    public boolean b() {
        return this.g != null;
    }

    public boolean c() {
        return (this.h == 0 && this.i == 0) ? false : true;
    }

    public String d() {
        long nanoTime = System.nanoTime() - this.b;
        if (nanoTime > u) {
            return g() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return g() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + C0059ao.a(13216);
    }

    public boolean e() {
        return c() || this.n != 0.0f;
    }

    public boolean f() {
        return e() || b();
    }

    public String g() {
        return C0059ao.a(13217) + this.a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(C0059ao.a(13218));
        int i = this.e;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.d);
        }
        List<w80> list = this.g;
        if (list != null && !list.isEmpty()) {
            for (w80 w80Var : this.g) {
                sb.append(' ');
                sb.append(w80Var.b());
            }
        }
        if (this.f != null) {
            sb.append(C0059ao.a(13219));
            sb.append(this.f);
            sb.append(')');
        }
        if (this.h > 0) {
            sb.append(C0059ao.a(13220));
            sb.append(this.h);
            sb.append(',');
            sb.append(this.i);
            sb.append(')');
        }
        if (this.j) {
            sb.append(C0059ao.a(13221));
        }
        if (this.l) {
            sb.append(C0059ao.a(13222));
        }
        if (this.n != 0.0f) {
            sb.append(C0059ao.a(13223));
            sb.append(this.n);
            if (this.q) {
                sb.append(C0059ao.a(13224));
                sb.append(this.o);
                sb.append(',');
                sb.append(this.p);
            }
            sb.append(')');
        }
        if (this.r) {
            sb.append(C0059ao.a(13225));
        }
        if (this.s != null) {
            sb.append(' ');
            sb.append(this.s);
        }
        sb.append('}');
        return sb.toString();
    }

    public q80(Uri uri, int i, String str, List<w80> list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, n80.f fVar) {
        this.d = uri;
        this.e = i;
        this.f = str;
        if (list == null) {
            this.g = null;
        } else {
            this.g = Collections.unmodifiableList(list);
        }
        this.h = i2;
        this.i = i3;
        this.j = z;
        this.l = z2;
        this.k = i4;
        this.m = z3;
        this.n = f;
        this.o = f2;
        this.p = f3;
        this.q = z4;
        this.r = z5;
        this.s = config;
        this.t = fVar;
    }
}
