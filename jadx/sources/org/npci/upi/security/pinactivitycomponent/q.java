package org.npci.upi.security.pinactivitycomponent;

import android.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import myunmn.C0059ao;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class q {
    public String a = a(C0059ao.a(2552));
    public a b;

    public q(a aVar) {
        this.b = aVar;
    }

    public final String a(String str) {
        String[] split = new String(Base64.decode(str, -1)).split(C0059ao.a(2553));
        String a = C0059ao.a(2554);
        for (String str2 : split) {
            a = a + this.b.c(str2);
        }
        return new String(Base64.decode(a, -1));
    }

    public String b(JSONObject jSONObject) {
        String a = C0059ao.a(2555);
        try {
            c(jSONObject);
            l.c(a, C0059ao.a(2556) + this.a);
            String str = this.a;
            l.c(a, C0059ao.a(2557) + str);
            if (str == null || str.isEmpty()) {
                return null;
            }
            Matcher matcher = Pattern.compile(C0059ao.a(2558)).matcher(str);
            StringBuffer stringBuffer = new StringBuffer(1000);
            while (matcher.find()) {
                String group = matcher.group();
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(jSONObject.optString(group.substring(1, group.length() - 1))));
            }
            matcher.appendTail(stringBuffer);
            String stringBuffer2 = stringBuffer.toString();
            l.c(a, C0059ao.a(2559) + stringBuffer2);
            return stringBuffer2;
        } catch (JSONException unused) {
            l.b(C0059ao.a(2560), C0059ao.a(2561));
            return null;
        }
    }

    public final void c(JSONObject jSONObject) {
    }
}
