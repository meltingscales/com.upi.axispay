package myunmn;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class aQ {
    public Map a = new HashMap();
    public EnumC0050af b;

    public aQ(EnumC0050af enumC0050af) {
        this.b = enumC0050af;
    }

    public EnumC0050af b() {
        return this.b;
    }

    public boolean c(int i) {
        Object obj = this.a.get(Integer.valueOf(i));
        if (obj != null) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public int g(int i) {
        Object obj = this.a.get(Integer.valueOf(i));
        if (obj != null) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public String h(int i) {
        Object obj = this.a.get(Integer.valueOf(i));
        return obj != null ? (String) obj : new String(new char[0]).intern();
    }
}
