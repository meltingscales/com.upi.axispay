package defpackage;

import android.content.Context;
import android.net.Uri;
import defpackage.n80;
import defpackage.s80;
import java.io.IOException;
import myunmn.C0059ao;
import okio.Okio;

/* compiled from: AxisPay */
/* renamed from: e80  reason: default package */
/* loaded from: classes.dex */
public class e80 extends a80 {
    public e80(Context context) {
        super(context);
    }

    public static int k(Uri uri) throws IOException {
        return new ld(uri.getPath()).e(C0059ao.a(14356), 1);
    }

    @Override // defpackage.a80, defpackage.s80
    public boolean c(q80 q80Var) {
        return C0059ao.a(14357).equals(q80Var.d.getScheme());
    }

    @Override // defpackage.a80, defpackage.s80
    public s80.a f(q80 q80Var, int i) throws IOException {
        return new s80.a(null, Okio.source(j(q80Var)), n80.e.DISK, k(q80Var.d));
    }
}
