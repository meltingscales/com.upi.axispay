package defpackage;

import android.os.Bundle;
import com.google.android.gms.vision.barcode.Barcode;
import defpackage.qf;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: yf  reason: default package */
/* loaded from: classes.dex */
public class yf extends xf {
    public static boolean c;
    public final ef a;
    public final c b;

    /* compiled from: AxisPay */
    /* renamed from: yf$a */
    /* loaded from: classes.dex */
    public static class a<D> extends jf<D> {
        public final int k;
        public final Bundle l;
        public final zf<D> m;
        public ef n;
        public b<D> o;
        public zf<D> p;

        @Override // androidx.lifecycle.LiveData
        public void g() {
            if (yf.c) {
                String str = C0059ao.a(4933) + this;
            }
            this.m.d();
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public void h() {
            if (yf.c) {
                String str = C0059ao.a(4934) + this;
            }
            this.m.e();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void i(kf<? super D> kfVar) {
            super.i(kfVar);
            this.n = null;
        }

        @Override // defpackage.jf, androidx.lifecycle.LiveData
        public void j(D d) {
            super.j(d);
            zf<D> zfVar = this.p;
            if (zfVar == null) {
                return;
            }
            zfVar.c();
            throw null;
        }

        public zf<D> k(boolean z) {
            if (yf.c) {
                String str = C0059ao.a(4935) + this;
            }
            this.m.a();
            throw null;
        }

        public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print(C0059ao.a(4936));
            printWriter.print(this.k);
            printWriter.print(C0059ao.a(4937));
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print(C0059ao.a(4938));
            printWriter.println(this.m);
            zf<D> zfVar = this.m;
            zfVar.b(str + C0059ao.a(4939), fileDescriptor, printWriter, strArr);
            throw null;
        }

        public void m() {
            ef efVar = this.n;
            b<D> bVar = this.o;
            if (efVar == null || bVar == null) {
                return;
            }
            super.i(bVar);
            e(efVar, bVar);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append(C0059ao.a(4940));
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(C0059ao.a(4941));
            sb.append(this.k);
            sb.append(C0059ao.a(4942));
            xa.a(this.m, sb);
            sb.append(C0059ao.a(4943));
            return sb.toString();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yf$b */
    /* loaded from: classes.dex */
    public static class b<D> implements kf<D> {
    }

    /* compiled from: AxisPay */
    /* renamed from: yf$c */
    /* loaded from: classes.dex */
    public static class c extends pf {
        public static final qf.b d = new a();
        public v4<a> c = new v4<>();

        /* compiled from: AxisPay */
        /* renamed from: yf$c$a */
        /* loaded from: classes.dex */
        public static class a implements qf.b {
            @Override // defpackage.qf.b
            public <T extends pf> T a(Class<T> cls) {
                return new c();
            }
        }

        public static c g(rf rfVar) {
            return (c) new qf(rfVar, d).a(c.class);
        }

        @Override // defpackage.pf
        public void d() {
            super.d();
            if (this.c.j() <= 0) {
                this.c.b();
            } else {
                this.c.k(0).k(true);
                throw null;
            }
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.c.j() > 0) {
                printWriter.print(str);
                printWriter.println(C0059ao.a(4959));
                String str2 = str + C0059ao.a(4960);
                if (this.c.j() <= 0) {
                    return;
                }
                a k = this.c.k(0);
                printWriter.print(str);
                printWriter.print(C0059ao.a(4961));
                printWriter.print(this.c.h(0));
                printWriter.print(C0059ao.a(4962));
                printWriter.println(k.toString());
                k.l(str2, fileDescriptor, printWriter, strArr);
                throw null;
            }
        }

        public void h() {
            int j = this.c.j();
            for (int i = 0; i < j; i++) {
                this.c.k(i).m();
            }
        }
    }

    static {
        C0059ao.a(yf.class, 185);
    }

    public yf(ef efVar, rf rfVar) {
        this.a = efVar;
        this.b = c.g(rfVar);
    }

    @Override // defpackage.xf
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // defpackage.xf
    public void c() {
        this.b.h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) Barcode.ITF);
        sb.append(C0059ao.a(7851));
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(C0059ao.a(7852));
        xa.a(this.a, sb);
        sb.append(C0059ao.a(7853));
        return sb.toString();
    }
}
