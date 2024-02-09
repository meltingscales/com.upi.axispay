package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import defpackage.n80;
import defpackage.s80;
import java.io.IOException;
import myunmn.C0059ao;
import okio.Okio;

/* compiled from: AxisPay */
/* renamed from: v70  reason: default package */
/* loaded from: classes.dex */
public class v70 extends s80 {
    public static final int d = 0;
    public final Context a;
    public final Object b = new Object();
    public AssetManager c;

    static {
        C0059ao.a(v70.class, 53);
    }

    public v70(Context context) {
        this.a = context;
    }

    public static String j(q80 q80Var) {
        return q80Var.d.toString().substring(d);
    }

    @Override // defpackage.s80
    public boolean c(q80 q80Var) {
        Uri uri = q80Var.d;
        if (!C0059ao.a(14095).equals(uri.getScheme()) || uri.getPathSegments().isEmpty()) {
            return false;
        }
        return C0059ao.a(14096).equals(uri.getPathSegments().get(0));
    }

    @Override // defpackage.s80
    public s80.a f(q80 q80Var, int i) throws IOException {
        if (this.c == null) {
            synchronized (this.b) {
                if (this.c == null) {
                    this.c = this.a.getAssets();
                }
            }
        }
        return new s80.a(Okio.source(this.c.open(j(q80Var))), n80.e.DISK);
    }
}
