package defpackage;

import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: un0  reason: default package */
/* loaded from: classes.dex */
public class un0 extends tn0 {

    /* compiled from: AxisPay */
    /* renamed from: un0$a */
    /* loaded from: classes.dex */
    public static final class a extends zl0 implements dl0<String, String> {
        public static final a b = new a();

        public a() {
            super(1);
        }

        public final String b(String str) {
            yl0.e(str, C0059ao.a(4816));
            return str;
        }

        @Override // defpackage.dl0
        public /* bridge */ /* synthetic */ String invoke(String str) {
            String str2 = str;
            b(str2);
            return str2;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: un0$b */
    /* loaded from: classes.dex */
    public static final class b extends zl0 implements dl0<String, String> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.b = str;
        }

        @Override // defpackage.dl0
        /* renamed from: b */
        public final String invoke(String str) {
            yl0.e(str, C0059ao.a(4809));
            return yl0.l(this.b, str);
        }
    }

    public static final dl0<String, String> b(String str) {
        return str.length() == 0 ? a.b : new b(str);
    }

    public static final String c(String str, String str2, String str3) {
        int i;
        yl0.e(str, C0059ao.a(2011));
        yl0.e(str2, C0059ao.a(2012));
        yl0.e(str3, C0059ao.a(2013));
        if (!bo0.l(str3)) {
            List<String> U = co0.U(str);
            int length = str.length() + (str2.length() * U.size());
            dl0<String, String> b2 = b(str2);
            int g = aj0.g(U);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : U) {
                int i3 = i2 + 1;
                String str4 = null;
                if (i2 >= 0) {
                    String str5 = (String) obj;
                    if ((i2 != 0 && i2 != g) || !bo0.l(str5)) {
                        int length2 = str5.length();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length2) {
                                i = -1;
                                break;
                            }
                            int i5 = i4 + 1;
                            if (!on0.c(str5.charAt(i4))) {
                                i = i4;
                                break;
                            }
                            i4 = i5;
                        }
                        if (i != -1) {
                            int i6 = i;
                            if (bo0.v(str5, str3, i, false, 4, null)) {
                                str4 = str5.substring(i6 + str3.length());
                                yl0.d(str4, C0059ao.a(2014));
                            }
                        }
                        str4 = str4 == null ? str5 : b2.invoke(str4);
                    }
                    if (str4 != null) {
                        arrayList.add(str4);
                    }
                    i2 = i3;
                } else {
                    aj0.n();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(length);
            ij0.y(arrayList, sb, C0059ao.a(2015), null, null, 0, null, null, 124, null);
            String sb2 = sb.toString();
            yl0.d(sb2, C0059ao.a(2016));
            return sb2;
        }
        throw new IllegalArgumentException(C0059ao.a(2017).toString());
    }

    public static final String d(String str, String str2) {
        yl0.e(str, C0059ao.a(2018));
        yl0.e(str2, C0059ao.a(2019));
        return c(str, C0059ao.a(2020), str2);
    }

    public static /* synthetic */ String e(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = C0059ao.a(2021);
        }
        return d(str, str2);
    }
}
