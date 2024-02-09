package defpackage;

import android.content.Context;
import defpackage.n80;
import defpackage.s80;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import myunmn.C0059ao;
import okio.Okio;

/* compiled from: AxisPay */
/* renamed from: a80  reason: default package */
/* loaded from: classes.dex */
public class a80 extends s80 {
    public final Context a;

    public a80(Context context) {
        this.a = context;
    }

    @Override // defpackage.s80
    public boolean c(q80 q80Var) {
        return C0059ao.a(12406).equals(q80Var.d.getScheme());
    }

    @Override // defpackage.s80
    public s80.a f(q80 q80Var, int i) throws IOException {
        return new s80.a(Okio.source(j(q80Var)), n80.e.DISK);
    }

    public InputStream j(q80 q80Var) throws FileNotFoundException {
        return this.a.getContentResolver().openInputStream(q80Var.d);
    }
}
