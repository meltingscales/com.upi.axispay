package defpackage;

import android.app.Application;
import android.util.Log;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: eh0  reason: default package */
/* loaded from: classes.dex */
public class eh0 {
    public final List<String> a = new ArrayList();
    public dh0 b;
    public long c;

    public eh0(Application application) {
    }

    public final void a(String str) {
        Log.i(C0059ao.a(13398), str);
        String str2 = DateFormat.getDateTimeInstance().format(new Date()) + C0059ao.a(13399) + str;
        this.a.add(str2);
        dh0 dh0Var = this.b;
        if (dh0Var == null) {
            return;
        }
        dh0Var.a(str2);
    }

    public void b() {
        String format;
        String a = C0059ao.a(13400);
        try {
            try {
                this.c = System.currentTimeMillis();
                format = String.format(Locale.ENGLISH, a, Long.valueOf(System.currentTimeMillis() - this.c));
            } catch (Exception e) {
                e.printStackTrace();
                format = String.format(Locale.ENGLISH, a, Long.valueOf(System.currentTimeMillis() - this.c));
            }
            a(format);
        } catch (Throwable th) {
            a(String.format(Locale.ENGLISH, a, Long.valueOf(System.currentTimeMillis() - this.c)));
            throw th;
        }
    }
}
