package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ea  reason: default package */
/* loaded from: classes.dex */
public final class ea implements fa {
    public static final Locale[] b = new Locale[0];
    public final Locale[] a;

    static {
        new Locale(C0059ao.a(4678), C0059ao.a(4679));
        new Locale(C0059ao.a(4680), C0059ao.a(4681));
        da.b(C0059ao.a(4682));
    }

    public ea(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.a = b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    b(sb, locale2);
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(C0059ao.a(4683) + i + C0059ao.a(4684));
            }
        }
        this.a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
        sb.toString();
    }

    public static void b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // defpackage.fa
    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ea)) {
            return false;
        }
        Locale[] localeArr = ((ea) obj).a;
        if (this.a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    @Override // defpackage.fa
    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.a;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(4685));
        int i = 0;
        while (true) {
            Locale[] localeArr = this.a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.a.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append(C0059ao.a(4686));
                return sb.toString();
            }
        }
    }
}
