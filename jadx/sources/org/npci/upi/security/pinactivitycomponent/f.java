package org.npci.upi.security.pinactivitycomponent;

import in.org.npci.commonlibrary.Data;
import in.org.npci.commonlibrary.Message;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import myunmn.C0059ao;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class f {
    public in.org.npci.commonlibrary.b a;
    public String b;
    public e c;

    public f(in.org.npci.commonlibrary.b bVar, e eVar, String str) {
        this.a = bVar;
        this.b = str;
        this.c = eVar;
    }

    public final Message a(String str, String str2, String str3, String str4, String str5, String str6) {
        Message message = null;
        try {
            message = this.a.a(this.b, str4, str5, str, str6);
            message.c(str2);
            message.b(str3);
            Data a = message.a();
            a.b(C0059ao.a(2427) + message.a().a());
            return message;
        } catch (in.org.npci.commonlibrary.c unused) {
            l.b(C0059ao.a(2428), C0059ao.a(2429));
            return message;
        }
    }

    public Message b(String str, String str2, String str3, JSONObject jSONObject) {
        String a = C0059ao.a(2430);
        Message message = null;
        try {
            String string = jSONObject.getString(C0059ao.a(2431));
            String string2 = jSONObject.getString(C0059ao.a(2432));
            String string3 = jSONObject.getString(C0059ao.a(2433));
            String string4 = jSONObject.getString(C0059ao.a(2434));
            String string5 = jSONObject.getString(C0059ao.a(2435));
            e eVar = this.c;
            l.c(C0059ao.a(2437), eVar == null ? C0059ao.a(2436) : eVar.toString());
            String b = this.c.b(string3, string4, string5);
            l.c(C0059ao.a(2438), b);
            Matcher matcher = Pattern.compile(C0059ao.a(2439)).matcher(str);
            StringBuffer stringBuffer = new StringBuffer();
            if (matcher.find()) {
                String group = matcher.group();
                message = a(group.substring(1, group.length() - 1), str2, str3, string, string2, b);
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(message.a().a().replaceAll(C0059ao.a(2440), C0059ao.a(2441))));
            }
            if (stringBuffer.length() > 0) {
                matcher.appendTail(stringBuffer);
            }
            if (message != null) {
                String stringBuffer2 = stringBuffer.toString();
                l.c(a, C0059ao.a(2442) + stringBuffer2);
                message.a().b(stringBuffer2);
            }
            return message;
        } catch (JSONException unused) {
            l.b(a, C0059ao.a(2443));
            return null;
        }
    }
}
