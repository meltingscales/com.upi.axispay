package defpackage;

import android.net.NetworkInfo;
import defpackage.n80;
import defpackage.s80;
import java.io.IOException;
import myunmn.C0059ao;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: AxisPay */
/* renamed from: l80  reason: default package */
/* loaded from: classes.dex */
public class l80 extends s80 {
    public final d80 a;
    public final u80 b;

    /* compiled from: AxisPay */
    /* renamed from: l80$a */
    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l80$b */
    /* loaded from: classes.dex */
    public static final class b extends IOException {
        public final int b;
        public final int c;

        public b(int i, int i2) {
            super(C0059ao.a(11390) + i);
            this.b = i;
            this.c = i2;
        }
    }

    public l80(d80 d80Var, u80 u80Var) {
        this.a = d80Var;
        this.b = u80Var;
    }

    public static Request j(q80 q80Var, int i) {
        CacheControl cacheControl;
        if (i == 0) {
            cacheControl = null;
        } else if (k80.a(i)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!k80.b(i)) {
                builder.noCache();
            }
            if (!k80.c(i)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(q80Var.d.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        return url.build();
    }

    @Override // defpackage.s80
    public boolean c(q80 q80Var) {
        String scheme = q80Var.d.getScheme();
        return C0059ao.a(12398).equals(scheme) || C0059ao.a(12399).equals(scheme);
    }

    @Override // defpackage.s80
    public int e() {
        return 2;
    }

    @Override // defpackage.s80
    public s80.a f(q80 q80Var, int i) throws IOException {
        Response a2 = this.a.a(j(q80Var, i));
        ResponseBody body = a2.body();
        if (a2.isSuccessful()) {
            n80.e eVar = a2.cacheResponse() == null ? n80.e.NETWORK : n80.e.DISK;
            if (eVar == n80.e.DISK && body.contentLength() == 0) {
                body.close();
                throw new a(C0059ao.a(12400));
            }
            if (eVar == n80.e.NETWORK && body.contentLength() > 0) {
                this.b.f(body.contentLength());
            }
            return new s80.a(body.source(), eVar);
        }
        body.close();
        throw new b(a2.code(), q80Var.c);
    }

    @Override // defpackage.s80
    public boolean h(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // defpackage.s80
    public boolean i() {
        return true;
    }
}
