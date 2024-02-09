package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import defpackage.n80;
import defpackage.s80;
import java.io.IOException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: t80  reason: default package */
/* loaded from: classes.dex */
public class t80 extends s80 {
    public final Context a;

    public t80(Context context) {
        this.a = context;
    }

    public static Bitmap j(Resources resources, int i, q80 q80Var) {
        BitmapFactory.Options d = s80.d(q80Var);
        if (s80.g(d)) {
            BitmapFactory.decodeResource(resources, i, d);
            s80.b(q80Var.h, q80Var.i, d, q80Var);
        }
        return BitmapFactory.decodeResource(resources, i, d);
    }

    @Override // defpackage.s80
    public boolean c(q80 q80Var) {
        if (q80Var.e != 0) {
            return true;
        }
        return C0059ao.a(2472).equals(q80Var.d.getScheme());
    }

    @Override // defpackage.s80
    public s80.a f(q80 q80Var, int i) throws IOException {
        Resources m = x80.m(this.a, q80Var);
        return new s80.a(j(m, x80.l(m, q80Var), q80Var), n80.e.DISK);
    }
}
