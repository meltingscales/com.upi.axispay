package org.npci.upi.security.pinactivitycomponent;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.Locale;
import myunmn.C0059ao;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class i {
    public static ResultReceiver i;
    public String a;
    public String b;
    public JSONObject c;
    public JSONObject d;
    public Locale e;
    public in.org.npci.commonlibrary.b f;
    public String g;
    public e h;

    public static void d(CLServerResultReceiver cLServerResultReceiver) {
        i = cLServerResultReceiver;
    }

    public String a() {
        return this.a;
    }

    public final void b(Context context) {
        String optString = this.d.optString(C0059ao.a(2162));
        String optString2 = this.d.optString(C0059ao.a(2163));
        String optString3 = this.d.optString(C0059ao.a(2164));
        String optString4 = this.d.optString(C0059ao.a(2165));
        String optString5 = this.d.optString(C0059ao.a(2166));
        String optString6 = this.d.optString(C0059ao.a(2167));
        String optString7 = this.d.optString(C0059ao.a(2168));
        try {
            StringBuilder sb = new StringBuilder(100);
            String a = C0059ao.a(2169);
            if (optString2 != null && !optString2.isEmpty()) {
                sb.append(optString2);
                sb.append(a);
            }
            if (optString != null && !optString.isEmpty()) {
                sb.append(optString);
                sb.append(a);
            }
            if (optString6 != null && !optString6.isEmpty()) {
                sb.append(optString6);
                sb.append(a);
            }
            if (optString7 != null && !optString7.isEmpty()) {
                sb.append(optString7);
                sb.append(a);
            }
            if (optString3 != null && !optString3.isEmpty()) {
                sb.append(optString3);
                sb.append(a);
            }
            if (optString5 != null && !optString5.isEmpty()) {
                sb.append(optString5);
                sb.append(a);
            }
            if (optString4 != null && !optString4.isEmpty()) {
                sb.append(optString4);
            }
            int lastIndexOf = sb.lastIndexOf(a);
            if (lastIndexOf != -1 && lastIndexOf == sb.length() - 1) {
                sb.deleteCharAt(lastIndexOf);
            }
            String r = this.h.r();
            l.c(C0059ao.a(2170), r);
            l.c(C0059ao.a(2171), sb.toString());
            this.f.c(this.g, sb.toString(), r);
        } catch (Exception unused) {
            throw new b(context, C0059ao.a(2172), C0059ao.a(2173));
        }
    }

    public void c(Bundle bundle, Context context) {
        String a = C0059ao.a(2174);
        String a2 = C0059ao.a(2175);
        String a3 = C0059ao.a(2176);
        String a4 = C0059ao.a(2177);
        this.h = new e(context);
        try {
            String string = bundle.getString(C0059ao.a(2178));
            this.a = string;
            if (string == null || string.isEmpty()) {
                throw new b(context, C0059ao.a(2222), C0059ao.a(2223));
            }
            l.c(a4, this.a);
            try {
                String string2 = bundle.getString(C0059ao.a(2179));
                this.b = string2;
                if (string2 == null || string2.isEmpty()) {
                    throw new b(context, C0059ao.a(2217), C0059ao.a(2218));
                }
                l.c(a4, this.b);
                this.f = new in.org.npci.commonlibrary.b(this.b);
                try {
                    String string3 = bundle.getString(C0059ao.a(2180));
                    if (string3 == null || string3.isEmpty()) {
                        l.c(a4, C0059ao.a(2182));
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(C0059ao.a(2183), C0059ao.a(2184));
                        jSONObject.put(C0059ao.a(2185), C0059ao.a(2186));
                        jSONObject.put(C0059ao.a(2187), C0059ao.a(2188));
                        jSONObject.put(C0059ao.a(2189), 6);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(jSONObject);
                        JSONObject jSONObject2 = new JSONObject();
                        this.c = jSONObject2;
                        jSONObject2.put(C0059ao.a(2190), jSONArray);
                    } else {
                        l.c(a4, C0059ao.a(2181) + string3);
                        this.c = new JSONObject(string3);
                    }
                    try {
                        String string4 = bundle.getString(C0059ao.a(2191));
                        if (string4 == null || string4.isEmpty()) {
                            l.c(a4, C0059ao.a(2193));
                        } else {
                            l.c(a4, C0059ao.a(2192) + string4);
                            new JSONObject(string4);
                        }
                        try {
                            String string5 = bundle.getString(C0059ao.a(2194));
                            JSONObject jSONObject3 = new JSONObject(string5);
                            if (string5 == null || string5.isEmpty()) {
                                throw new b(context, C0059ao.a(2209), C0059ao.a(2210));
                            }
                            if (!jSONObject3.has(a)) {
                                throw new b(context, C0059ao.a(2207), C0059ao.a(2208));
                            }
                            jSONObject3.getString(a);
                            l.c(a4, string5);
                            this.d = new JSONObject(string5);
                            try {
                                String string6 = bundle.getString(C0059ao.a(2195));
                                this.g = string6;
                                if (string6 == null || string6.isEmpty()) {
                                    throw new b(context, C0059ao.a(2205), C0059ao.a(2206));
                                }
                                l.c(a4, this.g);
                                b(context);
                                try {
                                    String string7 = bundle.getString(C0059ao.a(2196));
                                    if (string7 == null || string7.isEmpty()) {
                                        l.c(a4, C0059ao.a(2198));
                                    } else {
                                        l.c(a4, C0059ao.a(2197) + string7);
                                        new JSONArray(string7);
                                    }
                                    try {
                                        String string8 = bundle.getString(C0059ao.a(2199));
                                        this.e = new Locale((string8 == null || string8.isEmpty()) ? C0059ao.a(2200) : string8);
                                        l.c(a4, string8);
                                    } catch (Exception unused) {
                                        throw new b(context, C0059ao.a(2201), C0059ao.a(2202));
                                    }
                                } catch (Exception unused2) {
                                    throw new b(context, C0059ao.a(2203), C0059ao.a(2204));
                                }
                            } catch (b e) {
                                throw e;
                            } catch (Exception e2) {
                                throw new b(context, a3, a2, e2);
                            }
                        } catch (b e3) {
                            throw e3;
                        } catch (Exception e4) {
                            throw new b(context, C0059ao.a(2211), C0059ao.a(2212), e4);
                        }
                    } catch (Exception e5) {
                        throw new b(context, C0059ao.a(2213), C0059ao.a(2214), e5);
                    }
                } catch (Exception e6) {
                    throw new b(context, C0059ao.a(2215), C0059ao.a(2216), e6);
                }
            } catch (in.org.npci.commonlibrary.c e7) {
                l.b(C0059ao.a(2219), e7.getMessage());
                throw new b(context, C0059ao.a(2220), C0059ao.a(2221), e7);
            } catch (b e8) {
                throw e8;
            } catch (Exception e9) {
                throw new b(context, a3, a2, e9);
            }
        } catch (b e10) {
            throw e10;
        } catch (Exception e11) {
            throw new b(context, C0059ao.a(2224), C0059ao.a(2225), e11);
        }
    }

    public Locale e() {
        return this.e;
    }

    public in.org.npci.commonlibrary.b f() {
        return this.f;
    }

    public e g() {
        return this.h;
    }

    public ResultReceiver h() {
        return i;
    }
}
