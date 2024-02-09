package defpackage;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: da  reason: default package */
/* loaded from: classes.dex */
public final class da {
    public fa a;

    static {
        a(new Locale[0]);
    }

    public da(fa faVar) {
        this.a = faVar;
    }

    public static da a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d(new LocaleList(localeArr));
        }
        return new da(new ea(localeArr));
    }

    public static Locale b(String str) {
        String a = C0059ao.a(3808);
        if (str.contains(a)) {
            String[] split = str.split(a, -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else {
            String a2 = C0059ao.a(3809);
            if (str.contains(a2)) {
                String[] split2 = str.split(a2, -1);
                if (split2.length > 2) {
                    return new Locale(split2[0], split2[1], split2[2]);
                }
                if (split2.length > 1) {
                    return new Locale(split2[0], split2[1]);
                }
                if (split2.length == 1) {
                    return new Locale(split2[0]);
                }
            } else {
                return new Locale(str);
            }
        }
        throw new IllegalArgumentException(C0059ao.a(3810) + str + C0059ao.a(3811));
    }

    public static da d(LocaleList localeList) {
        return new da(new ga(localeList));
    }

    public Locale c(int i) {
        return this.a.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof da) && this.a.equals(((da) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
