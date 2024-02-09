package defpackage;

import java.util.Comparator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: z60  reason: default package */
/* loaded from: classes.dex */
public final class z60 {

    /* compiled from: AxisPay */
    /* renamed from: z60$a */
    /* loaded from: classes.dex */
    public static class a implements Comparator<String> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            String a = C0059ao.a(10982);
            return str.substring(0, str.lastIndexOf(a)).compareTo(str2.substring(0, str2.lastIndexOf(a)));
        }
    }

    public static Comparator<String> a() {
        return new a();
    }
}
