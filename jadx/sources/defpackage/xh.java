package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: xh  reason: default package */
/* loaded from: classes.dex */
public final class xh {
    public static final xh c = new xh(new Bundle(), null);
    public final Bundle a;
    public List<String> b;

    /* compiled from: AxisPay */
    /* renamed from: xh$a */
    /* loaded from: classes.dex */
    public static final class a {
        public ArrayList<String> a;

        public a() {
        }

        public a a(Collection<String> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (String str : collection) {
                        b(str);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(9525));
        }

        public a b(String str) {
            if (str != null) {
                if (this.a == null) {
                    this.a = new ArrayList<>();
                }
                if (!this.a.contains(str)) {
                    this.a.add(str);
                }
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(9526));
        }

        public a c(xh xhVar) {
            if (xhVar != null) {
                a(xhVar.e());
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(9527));
        }

        public xh d() {
            if (this.a == null) {
                return xh.c;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(C0059ao.a(9528), this.a);
            return new xh(bundle, this.a);
        }

        public a(xh xhVar) {
            if (xhVar != null) {
                xhVar.c();
                if (xhVar.b.isEmpty()) {
                    return;
                }
                this.a = new ArrayList<>(xhVar.b);
                return;
            }
            throw new IllegalArgumentException(C0059ao.a(9524));
        }
    }

    public xh(Bundle bundle, List<String> list) {
        this.a = bundle;
        this.b = list;
    }

    public static xh d(Bundle bundle) {
        if (bundle != null) {
            return new xh(bundle, null);
        }
        return null;
    }

    public Bundle a() {
        return this.a;
    }

    public boolean b(xh xhVar) {
        if (xhVar != null) {
            c();
            xhVar.c();
            return this.b.containsAll(xhVar.b);
        }
        return false;
    }

    public void c() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList(C0059ao.a(6505));
            this.b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.b = Collections.emptyList();
            }
        }
    }

    public List<String> e() {
        c();
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof xh) {
            xh xhVar = (xh) obj;
            c();
            xhVar.c();
            return this.b.equals(xhVar.b);
        }
        return false;
    }

    public boolean f() {
        c();
        return this.b.isEmpty();
    }

    public boolean g() {
        c();
        return !this.b.contains(null);
    }

    public boolean h(List<IntentFilter> list) {
        if (list != null) {
            c();
            int size = this.b.size();
            if (size != 0) {
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    IntentFilter intentFilter = list.get(i);
                    if (intentFilter != null) {
                        for (int i2 = 0; i2 < size; i2++) {
                            if (intentFilter.hasCategory(this.b.get(i2))) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        c();
        return this.b.hashCode();
    }

    public String toString() {
        return C0059ao.a(6506) + C0059ao.a(6507) + Arrays.toString(e().toArray()) + C0059ao.a(6508);
    }
}
