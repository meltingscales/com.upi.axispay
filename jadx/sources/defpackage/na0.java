package defpackage;

import java.util.Hashtable;

/* compiled from: AxisPay */
/* renamed from: na0  reason: default package */
/* loaded from: classes.dex */
public class na0 {
    public String a;
    public Hashtable<String, String> b;

    public void a(String str, String str2) {
        if (this.b == null) {
            this.b = new Hashtable<>();
        }
        this.b.put(str, str2);
    }

    public String b(String str) {
        if (this.b == null) {
            this.b = new Hashtable<>();
        }
        return this.b.get(str);
    }

    public Hashtable<String, String> c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public void e(String str) {
        this.a = str;
    }
}
