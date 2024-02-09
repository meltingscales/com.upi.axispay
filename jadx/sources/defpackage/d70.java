package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.olive.upi.transport.TransportConstants;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: d70  reason: default package */
/* loaded from: classes.dex */
public class d70 {
    public static d70 e;
    public SharedPreferences a;
    public SharedPreferences.Editor b;
    public Context c;
    public int d = 0;

    public d70(Context context) {
        this.c = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences(C0059ao.a(1671), 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.edit();
    }

    public static d70 e(Context context) {
        if (e == null) {
            e = new d70(context);
        }
        return e;
    }

    public void a() {
        String d = d();
        this.b.clear();
        this.b.putString(C0059ao.a(1672), d);
        this.b.commit();
    }

    public Map<String, ?> b() {
        return this.a.getAll();
    }

    public String c() {
        return this.a.getString(C0059ao.a(1673), TransportConstants.API_BASE_URL);
    }

    public String d() {
        return this.a.getString(C0059ao.a(1674), C0059ao.a(1675));
    }

    public String f() {
        return this.a.getString(C0059ao.a(1676), C0059ao.a(1677));
    }

    public void g(String str) {
        this.b.remove(str);
        this.b.commit();
    }

    public void h(String str) {
        this.b.putString(C0059ao.a(1678), str);
        this.b.commit();
    }

    public void i(String str) {
        this.b.putString(C0059ao.a(1679), str);
        this.b.commit();
    }
}
