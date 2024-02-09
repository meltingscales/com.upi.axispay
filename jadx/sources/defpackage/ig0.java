package defpackage;

import android.text.TextUtils;
import com.olive.upi.transport.model.MandateTransactionData;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.custom.CustomURLDecoder;
import java.util.Hashtable;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ig0  reason: default package */
/* loaded from: classes.dex */
public class ig0 {
    public static String a(MandateTransactionData mandateTransactionData) {
        if (mandateTransactionData == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C0059ao.a(14570));
        boolean isEmpty = TextUtils.isEmpty(mandateTransactionData.getUmnID());
        String a = C0059ao.a(14571);
        if (!isEmpty) {
            stringBuffer.append(C0059ao.a(14572));
            stringBuffer.append(a);
            stringBuffer.append(mandateTransactionData.getUmnID());
        }
        int i = (mandateTransactionData.getAmount().doubleValue() > 0.0d ? 1 : (mandateTransactionData.getAmount().doubleValue() == 0.0d ? 0 : -1));
        String a2 = C0059ao.a(14573);
        if (i != 0) {
            stringBuffer.append(a2);
            stringBuffer.append(C0059ao.a(14574));
            stringBuffer.append(a);
            stringBuffer.append(mandateTransactionData.getAmount());
        }
        if (!TextUtils.isEmpty(mandateTransactionData.getRemarks())) {
            stringBuffer.append(a2);
            stringBuffer.append(C0059ao.a(14575));
            stringBuffer.append(a);
            stringBuffer.append(mandateTransactionData.getRemarks());
        }
        stringBuffer.append(a2);
        stringBuffer.append(C0059ao.a(14576));
        stringBuffer.append(a);
        stringBuffer.append(mandateTransactionData.getStartMandate());
        stringBuffer.append(a2);
        stringBuffer.append(C0059ao.a(14577));
        stringBuffer.append(a);
        stringBuffer.append(mandateTransactionData.getEndmandate());
        stringBuffer.append(a2);
        stringBuffer.append(C0059ao.a(14578));
        stringBuffer.append(a);
        stringBuffer.append(mandateTransactionData.getPayeeName());
        stringBuffer.append(a2);
        stringBuffer.append(C0059ao.a(14579));
        stringBuffer.append(a);
        stringBuffer.append(C0059ao.a(14580));
        stringBuffer.append(a2);
        stringBuffer.append(C0059ao.a(14581));
        stringBuffer.append(a);
        stringBuffer.append(C0059ao.a(14582));
        stringBuffer.append(a2);
        stringBuffer.append(C0059ao.a(14583));
        stringBuffer.append(a);
        stringBuffer.append(mandateTransactionData.getOccurence());
        stringBuffer.append(a2);
        stringBuffer.append(C0059ao.a(14584));
        stringBuffer.append(a);
        stringBuffer.append(mandateTransactionData.getAmountRule());
        stringBuffer.append(a2);
        stringBuffer.append(C0059ao.a(14585));
        stringBuffer.append(a);
        stringBuffer.append(C0059ao.a(14586));
        stringBuffer.append(a2);
        stringBuffer.append(C0059ao.a(14587));
        stringBuffer.append(a);
        stringBuffer.append(mandateTransactionData.getTransactionId());
        return stringBuffer.toString();
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return CustomURLDecoder.decode(str, C0059ao.a(14588));
        } catch (Exception unused) {
            String a = C0059ao.a(14589);
            String a2 = C0059ao.a(14590);
            return str.replace(a, a2).replace(C0059ao.a(14591), C0059ao.a(14592)).replace(C0059ao.a(14593), a2);
        }
    }

    public Hashtable<String, String> b(String str) {
        ih0 ih0Var = new ih0();
        ih0Var.c(str);
        Hashtable<String, String> hashtable = new Hashtable<>();
        String a = C0059ao.a(14594);
        boolean b = ih0Var.b(a);
        String a2 = C0059ao.a(14595);
        String a3 = C0059ao.a(14596);
        String a4 = C0059ao.a(14597);
        if (b) {
            ih0 ih0Var2 = new ih0();
            ih0Var2.c(ih0Var.a(a));
            if (ih0Var2.b(a4)) {
                hashtable.put(a3, ih0Var2.a(a4));
            }
            if (ih0Var2.b(a2)) {
                hashtable.put(C0059ao.a(14598), ih0Var2.a(a2));
            }
        }
        String a5 = C0059ao.a(14599);
        boolean b2 = ih0Var.b(a5);
        String a6 = C0059ao.a(14600);
        if (b2) {
            ih0 ih0Var3 = new ih0();
            ih0Var3.c(ih0Var.a(a5));
            if (ih0Var3.b(a4)) {
                hashtable.put(a6, ih0Var3.a(a4));
            }
            if (ih0Var3.b(a2)) {
                hashtable.put(C0059ao.a(14601), ih0Var3.a(a2));
            }
        }
        String a7 = C0059ao.a(14602);
        if (ih0Var.b(a7)) {
            hashtable.put(C0059ao.a(14603), ih0Var.a(a7));
        }
        String a8 = C0059ao.a(14604);
        if (ih0Var.b(a8)) {
            hashtable.put(C0059ao.a(14605), ih0Var.a(a8));
        }
        String a9 = C0059ao.a(14606);
        if (ih0Var.b(a9)) {
            hashtable.put(C0059ao.a(14607), ih0Var.a(a9));
        }
        String a10 = C0059ao.a(14608);
        if (ih0Var.b(a10)) {
            hashtable.put(C0059ao.a(14609), ih0Var.a(a10));
        }
        String a11 = C0059ao.a(14610);
        boolean b3 = ih0Var.b(a11);
        String a12 = C0059ao.a(14611);
        if (b3) {
            ih0 ih0Var4 = new ih0();
            ih0Var4.c(ih0Var.a(a11));
            boolean b4 = ih0Var4.b(a12);
            String a13 = C0059ao.a(14612);
            String a14 = C0059ao.a(14613);
            if (b4) {
                String a15 = ih0Var4.a(a12);
                if (!TextUtils.isEmpty(a15)) {
                    if (!a15.equals(C0059ao.a(14614))) {
                        a13 = a15;
                    }
                    hashtable.put(a14, a13);
                }
            } else {
                hashtable.put(a14, a13);
            }
        }
        if (TextUtils.isEmpty(hashtable.get(a3)) && TextUtils.isEmpty(hashtable.get(a6))) {
            return hashtable;
        }
        boolean b5 = ih0Var.b(a12);
        String a16 = C0059ao.a(14615);
        if (b5) {
            String a17 = ih0Var.a(a12);
            if (TextUtils.isEmpty(hashtable.get(a3))) {
                String substring = a17.substring(0, 11);
                String substring2 = a17.substring(11);
                hashtable.put(a3, substring2 + a16 + substring + C0059ao.a(14616));
            }
        }
        String a18 = C0059ao.a(14617);
        if (ih0Var.b(a18)) {
            String a19 = ih0Var.a(a18);
            ih0 ih0Var5 = new ih0();
            ih0Var5.c(a19);
            if (ih0Var5.b(a4)) {
                String a20 = ih0Var5.a(a4);
                if (TextUtils.isEmpty(hashtable.get(a3))) {
                    hashtable.put(a3, a20 + a16 + C0059ao.a(14618));
                }
            }
        }
        return hashtable;
    }

    public final Hashtable<String, String> c(String str) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        String[] split = str.split(C0059ao.a(14619));
        hashtable.clear();
        for (String str2 : split) {
            String[] split2 = str2.split(C0059ao.a(14620));
            if (split2.length > 1) {
                hashtable.put(split2[0], split2[1]);
            }
        }
        return hashtable;
    }

    public qg0 d(String str, int i) {
        String substring;
        String a = C0059ao.a(14621);
        String a2 = C0059ao.a(14622);
        String a3 = C0059ao.a(14623);
        TransactionData transactionData = new TransactionData();
        transactionData.setIntentData(str);
        qa0.v().u0(transactionData);
        String e = e(str);
        if (e == null) {
            return new qg0(false, R.string.invalid_upi_id);
        }
        try {
            Hashtable<String, String> hashtable = new Hashtable<>();
            if (e.startsWith(a2)) {
                return f(b(e), e, a2, i);
            }
            if (e.startsWith(a)) {
                String substring2 = e.substring(10);
                return f(c(substring2), substring2, a, i);
            }
            boolean startsWith = e.startsWith(a3);
            String a4 = C0059ao.a(14624);
            String a5 = C0059ao.a(14625);
            if (!startsWith && !e.startsWith(a5) && !e.startsWith(a4)) {
                return new qg0(false, R.string.invalid_upi_id);
            }
            if (e.startsWith(a3)) {
                substring = e.substring(14);
            } else if (e.startsWith(a5)) {
                substring = e.substring(14);
                a3 = a5;
            } else {
                substring = e.substring(16);
                a3 = a4;
            }
            String[] split = substring.split(C0059ao.a(14626));
            hashtable.clear();
            for (String str2 : split) {
                String[] split2 = str2.split(C0059ao.a(14627));
                if (split2.length > 1) {
                    hashtable.put(split2[0], split2[1]);
                }
            }
            return g(hashtable, substring, a3);
        } catch (Exception unused) {
            return new qg0(false, R.string.qr_code_not_compatible);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qg0 f(java.util.Hashtable<java.lang.String, java.lang.String> r18, java.lang.String r19, java.lang.String r20, int r21) {
        /*
            Method dump skipped, instructions count: 981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig0.f(java.util.Hashtable, java.lang.String, java.lang.String, int):qg0");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qg0 g(java.util.Hashtable<java.lang.String, java.lang.String> r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig0.g(java.util.Hashtable, java.lang.String, java.lang.String):qg0");
    }
}
