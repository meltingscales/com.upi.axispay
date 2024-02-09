package defpackage;

import java.util.TreeMap;

/* compiled from: AxisPay */
/* renamed from: ih0  reason: default package */
/* loaded from: classes.dex */
public class ih0 {
    public TreeMap<String, String> a = new TreeMap<>();

    public String a(String str) {
        return this.a.get(str);
    }

    public boolean b(String str) {
        return this.a.containsKey(str);
    }

    public void c(String str) {
        this.a.clear();
        jh0 jh0Var = new jh0(str);
        while (jh0Var.b(4)) {
            try {
                this.a.put(jh0Var.a(2), jh0Var.a(Integer.parseInt(jh0Var.a(2))));
            } catch (Exception unused) {
                return;
            }
        }
    }
}
