package org.npci.upi.security.pinactivitycomponent;

import android.content.Context;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import myunmn.C0059ao;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class o {
    public static final String e = null;
    public Context a;
    public k b;
    public List<String> c;
    public JSONArray d;

    static {
        C0059ao.a(o.class, 363);
    }

    public o(Context context) {
        this.d = null;
        this.a = context;
        this.b = new k(context);
        this.d = new JSONArray();
        byte[] b = h.b(C0059ao.a(2674), context);
        if (b != null) {
            try {
                this.d = new JSONArray(new String(b));
            } catch (Exception e2) {
                l.a(e, e2);
            }
        }
    }

    public static String a(String str) {
        String lowerCase = str.toLowerCase();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C0059ao.a(2675));
            messageDigest.update(lowerCase.getBytes(), 0, lowerCase.length());
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = C0059ao.a(2676) + bigInteger;
            }
            return bigInteger;
        } catch (Exception e2) {
            l.a(e, e2);
            return null;
        }
    }

    public final String b(ArrayList<String> arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        String str = C0059ao.a(2677) + arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            str = str + C0059ao.a(2678) + arrayList.get(i);
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a2, code lost:
        if (r14 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
        if (r14 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
        if (r14 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
        r14.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c1, code lost:
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.npci.upi.security.pinactivitycomponent.n c(int r14, long r15) {
        /*
            r13 = this;
            r12 = r13
            r13 = r14
            r14 = r15
            r16 = 2679(0xa77, float:3.754E-42)
            java.lang.String r0 = myunmn.C0059ao.a(r16)
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r16 = 2680(0xa78, float:3.755E-42)
            java.lang.String r0 = myunmn.C0059ao.a(r16)
            r16 = 2681(0xa79, float:3.757E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r16)
            r16 = 2682(0xa7a, float:3.758E-42)
            java.lang.String r3 = myunmn.C0059ao.a(r16)
            r16 = 2683(0xa7b, float:3.76E-42)
            java.lang.String r4 = myunmn.C0059ao.a(r16)
            java.lang.String[] r3 = new java.lang.String[]{r0, r1, r3, r4}
            r1 = 0
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r16 = 2684(0xa7c, float:3.761E-42)
            java.lang.String r5 = myunmn.C0059ao.a(r16)
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r16 = 2685(0xa7d, float:3.762E-42)
            java.lang.String r6 = myunmn.C0059ao.a(r16)
            r7 = 0
            android.content.Context r5 = r12.a     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9 java.lang.SecurityException -> Lbb
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9 java.lang.SecurityException -> Lbb
            r8 = 1
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9 java.lang.SecurityException -> Lbb
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9 java.lang.SecurityException -> Lbb
            r10.<init>()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9 java.lang.SecurityException -> Lbb
            r16 = 2686(0xa7e, float:3.764E-42)
            java.lang.String r11 = myunmn.C0059ao.a(r16)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9 java.lang.SecurityException -> Lbb
            r10.append(r11)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9 java.lang.SecurityException -> Lbb
            r10.append(r14)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9 java.lang.SecurityException -> Lbb
            java.lang.String r14 = r10.toString()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9 java.lang.SecurityException -> Lbb
            r9[r1] = r14     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9 java.lang.SecurityException -> Lbb
            r1 = r5
            r5 = r9
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9 java.lang.SecurityException -> Lbb
        L6b:
            boolean r15 = r14.moveToNext()     // Catch: java.lang.Exception -> La5 java.lang.Throwable -> Lb3 java.lang.SecurityException -> Lbc
            if (r15 == 0) goto La2
            java.lang.String r15 = r14.getString(r8)     // Catch: java.lang.Exception -> La5 java.lang.Throwable -> Lb3 java.lang.SecurityException -> Lbc
            r1 = 2
            java.lang.String r1 = r14.getString(r1)     // Catch: java.lang.Exception -> La5 java.lang.Throwable -> Lb3 java.lang.SecurityException -> Lbc
            org.npci.upi.security.pinactivitycomponent.n r15 = r12.d(r13, r15, r1)     // Catch: java.lang.Exception -> La5 java.lang.Throwable -> Lb3 java.lang.SecurityException -> Lbc
            if (r15 == 0) goto L6b
            int r1 = r14.getColumnIndex(r0)     // Catch: java.lang.Exception -> La5 java.lang.Throwable -> Lb3 java.lang.SecurityException -> Lbc
            long r1 = r14.getLong(r1)     // Catch: java.lang.Exception -> La5 java.lang.Throwable -> Lb3 java.lang.SecurityException -> Lbc
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> La5 java.lang.Throwable -> Lb3 java.lang.SecurityException -> Lbc
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> La5 java.lang.Throwable -> Lb3 java.lang.SecurityException -> Lbc
            r15.f(r1)     // Catch: java.lang.Exception -> La5 java.lang.Throwable -> Lb3 java.lang.SecurityException -> Lbc
            boolean r1 = r12.j(r15)     // Catch: java.lang.Exception -> La5 java.lang.Throwable -> Lb3 java.lang.SecurityException -> Lbc
            if (r1 == 0) goto L6b
            r12.f(r15)     // Catch: java.lang.Exception -> La5 java.lang.Throwable -> Lb3 java.lang.SecurityException -> Lbc
            if (r14 == 0) goto La1
            r14.close()
        La1:
            return r15
        La2:
            if (r14 == 0) goto Lc1
            goto Lbe
        La5:
            r13 = move-exception
            goto Lab
        La7:
            r13 = move-exception
            goto Lb5
        La9:
            r13 = move-exception
            r14 = r7
        Lab:
            java.lang.String r15 = org.npci.upi.security.pinactivitycomponent.o.e     // Catch: java.lang.Throwable -> Lb3
            org.npci.upi.security.pinactivitycomponent.l.a(r15, r13)     // Catch: java.lang.Throwable -> Lb3
            if (r14 == 0) goto Lc1
            goto Lbe
        Lb3:
            r13 = move-exception
            r7 = r14
        Lb5:
            if (r7 == 0) goto Lba
            r7.close()
        Lba:
            throw r13
        Lbb:
            r14 = r7
        Lbc:
            if (r14 == 0) goto Lc1
        Lbe:
            r14.close()
        Lc1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.o.c(int, long):org.npci.upi.security.pinactivitycomponent.n");
    }

    public n d(int i, String str, String str2) {
        for (int i2 = 0; i2 < this.d.length(); i2++) {
            try {
                n e2 = e(i, str2, str, this.d.getJSONObject(i2));
                if (e2 != null) {
                    return e2;
                }
            } catch (Exception e3) {
                l.a(e, e3);
                return null;
            }
        }
        return null;
    }

    public final n e(int i, String str, String str2, JSONObject jSONObject) {
        String str3;
        if (h(str2, jSONObject.getJSONArray(C0059ao.a(2687))) && g(str, jSONObject.getString(C0059ao.a(2688)))) {
            if (i != 0) {
                str3 = C0059ao.a(2689) + i + C0059ao.a(2690);
            } else {
                str3 = (String) jSONObject.get(C0059ao.a(2691));
            }
            Matcher matcher = Pattern.compile(str3).matcher(str);
            n nVar = new n();
            nVar.b(str);
            if (matcher.find() && matcher.groupCount() >= 0) {
                nVar.d(matcher.group(0));
                return nVar;
            }
            return null;
        }
        return null;
    }

    public void f(n nVar) {
        l(nVar.e() != null ? nVar.e() : k(nVar));
    }

    public final boolean g(String str, String str2) {
        return Pattern.compile(str2, 2).matcher(str).find();
    }

    public final boolean h(String str, JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            if (Pattern.compile(jSONArray.getString(i), 2).matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(String str) {
        if (this.c == null) {
            this.c = Arrays.asList(this.b.b(C0059ao.a(2692), C0059ao.a(2693)).split(C0059ao.a(2694)));
        }
        return this.c.contains(str);
    }

    public final boolean j(n nVar) {
        return (i(nVar.e()) || i(k(nVar))) ? false : true;
    }

    public final String k(n nVar) {
        return a(nVar.a());
    }

    public final void l(String str) {
        if (str == null) {
            return;
        }
        k kVar = this.b;
        String a = C0059ao.a(2695);
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(kVar.b(a, C0059ao.a(2696)).split(C0059ao.a(2697))));
        if (arrayList.contains(str)) {
            return;
        }
        if (arrayList.size() >= 10) {
            arrayList.remove(0);
        }
        arrayList.add(str);
        this.b.a(a, b(arrayList));
    }
}
