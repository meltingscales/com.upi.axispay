package defpackage;

import android.text.TextUtils;

/* compiled from: AxisPay */
/* renamed from: eg  reason: default package */
/* loaded from: classes.dex */
public class eg implements cg {
    public String a;
    public int b;
    public int c;

    public eg(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eg) {
            eg egVar = (eg) obj;
            return (this.b < 0 || egVar.b < 0) ? TextUtils.equals(this.a, egVar.a) && this.c == egVar.c : TextUtils.equals(this.a, egVar.a) && this.b == egVar.b && this.c == egVar.c;
        }
        return false;
    }

    public int hashCode() {
        return ya.b(this.a, Integer.valueOf(this.c));
    }
}
