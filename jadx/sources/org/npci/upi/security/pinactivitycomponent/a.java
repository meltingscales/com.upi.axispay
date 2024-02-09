package org.npci.upi.security.pinactivitycomponent;

import android.app.Activity;
import android.content.Context;
import android.os.ResultReceiver;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class a {
    public Map<String, Properties> a = new HashMap();
    public Context b;
    public Properties c;
    public q d;
    public f e;
    public Locale f;
    public in.org.npci.commonlibrary.b g;
    public Activity h;
    public i i;
    public e j;

    public a(Context context, i iVar, Activity activity) {
        this.i = iVar;
        this.f = iVar.e();
        this.b = context;
        this.g = iVar.f();
        this.h = activity;
        a(C0059ao.a(1764));
        a(C0059ao.a(1765));
        this.c = a(C0059ao.a(1766));
        Locale locale = this.f;
        String a = C0059ao.a(1767);
        String a2 = C0059ao.a(1768);
        if (locale != null) {
            Map<String, Properties> map = this.a;
            String language = locale.getLanguage();
            map.put(language, a(a2 + this.f.getLanguage() + a));
        } else {
            Locale locale2 = new Locale(C0059ao.a(1769));
            Map<String, Properties> map2 = this.a;
            String language2 = locale2.getLanguage();
            map2.put(language2, a(a2 + locale2.getLanguage() + a));
        }
        this.j = iVar.g();
        this.d = new q(this);
        if (iVar == null || iVar.f() == null || iVar.a() == null) {
            return;
        }
        this.e = new f(this.g, this.j, iVar.a());
    }

    public Properties a(String str) {
        Properties properties = new Properties();
        try {
            properties.load(this.b.getAssets().open(str));
        } catch (IOException e) {
            l.b(C0059ao.a(1770), e.toString());
        }
        return properties;
    }

    public q b() {
        return this.d;
    }

    public String c(String str) {
        Properties properties = this.c;
        if (properties != null) {
            return properties.getProperty(str);
        }
        return null;
    }

    public f d() {
        i iVar;
        if (this.e == null && (iVar = this.i) != null) {
            this.g = iVar.f();
            this.e = new f(this.i.f(), this.i.g(), this.i.a());
        }
        String a = C0059ao.a(1771);
        l.c(a, C0059ao.a(1772));
        l.c(a, C0059ao.a(1773) + this.i);
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(1774));
        sb.append(this.i);
        l.c(a, sb.toString() == null ? null : this.i.a());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C0059ao.a(1775));
        sb2.append(this.i);
        l.c(a, sb2.toString() != null ? this.i.f().toString() : null);
        return this.e;
    }

    public Activity e() {
        return this.h;
    }

    public ResultReceiver f() {
        i iVar = this.i;
        if (iVar == null) {
            return null;
        }
        return iVar.h();
    }
}
