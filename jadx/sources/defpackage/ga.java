package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: AxisPay */
/* renamed from: ga  reason: default package */
/* loaded from: classes.dex */
public final class ga implements fa {
    public final LocaleList a;

    public ga(LocaleList localeList) {
        this.a = localeList;
    }

    @Override // defpackage.fa
    public Object a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this.a.equals(((fa) obj).a());
    }

    @Override // defpackage.fa
    public Locale get(int i) {
        return this.a.get(i);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
