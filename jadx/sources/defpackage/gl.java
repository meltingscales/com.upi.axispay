package defpackage;

import defpackage.cm;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: gl  reason: default package */
/* loaded from: classes.dex */
public class gl implements cm.c {
    public final String a;
    public final File b;
    public final Callable<InputStream> c;
    public final cm.c d;

    static {
        C0095z.a();
    }

    public gl(String str, File file, Callable<InputStream> callable, cm.c cVar) {
        this.a = str;
        this.b = file;
        this.c = callable;
        this.d = cVar;
    }

    @Override // defpackage.cm.c
    public cm a(cm.b bVar) {
        return new fl(bVar.a, this.a, this.b, this.c, bVar.c.a, this.d.a(bVar));
    }
}
