package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AxisPay */
/* renamed from: mc  reason: default package */
/* loaded from: classes.dex */
public class mc {
    public final Object a;

    /* compiled from: AxisPay */
    /* renamed from: mc$a */
    /* loaded from: classes.dex */
    public static class a extends AccessibilityNodeProvider {
        public final mc a;

        public a(mc mcVar) {
            this.a = mcVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            lc b = this.a.b(i);
            if (b == null) {
                return null;
            }
            return b.D0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<lc> c = this.a.c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(c.get(i2).D0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.f(i, i2, bundle);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: mc$b */
    /* loaded from: classes.dex */
    public static class b extends a {
        public b(mc mcVar) {
            super(mcVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            lc d = this.a.d(i);
            if (d == null) {
                return null;
            }
            return d.D0();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: mc$c */
    /* loaded from: classes.dex */
    public static class c extends b {
        public c(mc mcVar) {
            super(mcVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.a(i, lc.E0(accessibilityNodeInfo), str, bundle);
        }
    }

    public mc() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.a = new c(this);
        } else if (i >= 19) {
            this.a = new b(this);
        } else if (i >= 16) {
            this.a = new a(this);
        } else {
            this.a = null;
        }
    }

    public void a(int i, lc lcVar, String str, Bundle bundle) {
    }

    public lc b(int i) {
        return null;
    }

    public List<lc> c(String str, int i) {
        return null;
    }

    public lc d(int i) {
        return null;
    }

    public Object e() {
        return this.a;
    }

    public boolean f(int i, int i2, Bundle bundle) {
        return false;
    }

    public mc(Object obj) {
        this.a = obj;
    }
}
