package myunmn;

import android.content.ComponentName;

/* renamed from: myunmn.aj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0054aj extends aQ {
    public C0054aj(ComponentName componentName, String str, String str2) {
        super(EnumC0050af.n);
        this.a.put(12289, componentName);
        this.a.put(12290, str);
        this.a.put(12291, str2);
    }

    public String a() {
        return h(12290);
    }

    public String c() {
        return h(12291);
    }

    public ComponentName d() {
        return (ComponentName) this.a.get(12289);
    }
}
