package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import defpackage.fp;
import defpackage.fq;
import defpackage.hp;
import defpackage.rp;
import defpackage.sp;
import defpackage.tp;
import defpackage.vp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: fp  reason: default package */
/* loaded from: classes.dex */
public final class fp implements er {
    public final DataEncoder a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final zu e;
    public final zu f;
    public final int g;

    /* compiled from: AxisPay */
    /* renamed from: fp$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final URL a;
        public final qp b;
        public final String c;

        public a(URL url, qp qpVar, String str) {
            this.a = url;
            this.b = qpVar;
            this.c = str;
        }

        public a a(URL url) {
            return new a(url, this.b, this.c);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: fp$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final URL b;
        public final long c;

        public b(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    public fp(Context context, zu zuVar, zu zuVar2, int i) {
        this.a = qp.b();
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService(C0059ao.a(6014));
        this.d = m(ep.c);
        this.e = zuVar2;
        this.f = zuVar;
        this.g = i;
    }

    public static int d(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return vp.b.UNKNOWN_MOBILE_SUBTYPE.b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return vp.b.COMBINED.b();
        }
        if (vp.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int e(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return vp.c.NONE.b();
        }
        return networkInfo.getType();
    }

    public static int f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            qr.c(C0059ao.a(6015), C0059ao.a(6016), e);
            return -1;
        }
    }

    public static TelephonyManager h(Context context) {
        return (TelephonyManager) context.getSystemService(C0059ao.a(6017));
    }

    public static long i() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static /* synthetic */ a k(a aVar, b bVar) {
        URL url = bVar.b;
        if (url != null) {
            qr.a(C0059ao.a(6018), C0059ao.a(6019), url);
            return aVar.a(bVar.b);
        }
        return null;
    }

    public static InputStream l(InputStream inputStream, String str) throws IOException {
        return C0059ao.a(6020).equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(C0059ao.a(6021) + str, e);
        }
    }

    @Override // defpackage.er
    public fq a(fq fqVar) {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        fq.a l = fqVar.l();
        l.a(C0059ao.a(6022), Build.VERSION.SDK_INT);
        l.c(C0059ao.a(6023), Build.MODEL);
        l.c(C0059ao.a(6024), Build.HARDWARE);
        l.c(C0059ao.a(6025), Build.DEVICE);
        l.c(C0059ao.a(6026), Build.PRODUCT);
        l.c(C0059ao.a(6027), Build.ID);
        l.c(C0059ao.a(6028), Build.MANUFACTURER);
        l.c(C0059ao.a(6029), Build.FINGERPRINT);
        l.b(C0059ao.a(6030), i());
        l.a(C0059ao.a(6031), e(activeNetworkInfo));
        l.a(C0059ao.a(6032), d(activeNetworkInfo));
        l.c(C0059ao.a(6033), Locale.getDefault().getCountry());
        l.c(C0059ao.a(6034), Locale.getDefault().getLanguage());
        l.c(C0059ao.a(6035), h(this.c).getSimOperator());
        l.c(C0059ao.a(6036), Integer.toString(f(this.c)));
        return l.d();
    }

    @Override // defpackage.er
    public yq b(xq xqVar) {
        qp g = g(xqVar);
        URL url = this.d;
        if (xqVar.c() != null) {
            try {
                ep d = ep.d(xqVar.c());
                r4 = d.e() != null ? d.e() : null;
                if (d.f() != null) {
                    url = m(d.f());
                }
            } catch (IllegalArgumentException unused) {
                return yq.a();
            }
        }
        try {
            b bVar = (b) sr.a(5, new a(url, g, r4), new rr() { // from class: dp
                @Override // defpackage.rr
                public final Object apply(Object obj) {
                    fp.b c;
                    c = fp.this.c((fp.a) obj);
                    return c;
                }
            }, new tr() { // from class: cp
                @Override // defpackage.tr
                public final Object a(Object obj, Object obj2) {
                    return fp.k((fp.a) obj, (fp.b) obj2);
                }
            });
            int i = bVar.a;
            if (i == 200) {
                return yq.e(bVar.c);
            }
            if (i < 500 && i != 404) {
                if (i == 400) {
                    return yq.d();
                }
                return yq.a();
            }
            return yq.f();
        } catch (IOException e) {
            qr.c(C0059ao.a(6037), C0059ao.a(6038), e);
            return yq.f();
        }
    }

    public final b c(a aVar) throws IOException {
        URL url = aVar.a;
        String a2 = C0059ao.a(6039);
        qr.a(a2, C0059ao.a(6040), url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(C0059ao.a(6041));
        httpURLConnection.setRequestProperty(C0059ao.a(6044), String.format(C0059ao.a(6043), C0059ao.a(6042)));
        String a3 = C0059ao.a(6045);
        String a4 = C0059ao.a(6046);
        httpURLConnection.setRequestProperty(a3, a4);
        String a5 = C0059ao.a(6047);
        httpURLConnection.setRequestProperty(a5, C0059ao.a(6048));
        httpURLConnection.setRequestProperty(C0059ao.a(6049), a4);
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty(C0059ao.a(6050), str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.a.encode(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                qr.e(a2, C0059ao.a(6051) + responseCode);
                qr.e(a2, C0059ao.a(6052) + httpURLConnection.getHeaderField(a5));
                qr.e(a2, C0059ao.a(6053) + httpURLConnection.getHeaderField(a3));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField(C0059ao.a(6054))), 0L);
                }
                if (responseCode != 200) {
                    return new b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream l = l(inputStream, httpURLConnection.getHeaderField(a3));
                    b bVar = new b(responseCode, null, up.b(new BufferedReader(new InputStreamReader(l))).c());
                    if (l != null) {
                        l.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException e) {
            e = e;
            qr.c(a2, C0059ao.a(6055), e);
            return new b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            qr.c(a2, C0059ao.a(6056), e);
            return new b(FirebaseCrashlytics.APP_EXCEPTION_CALLBACK_TIMEOUT_MS, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            qr.c(a2, C0059ao.a(6056), e);
            return new b(FirebaseCrashlytics.APP_EXCEPTION_CALLBACK_TIMEOUT_MS, null, 0L);
        } catch (IOException e4) {
            e = e4;
            qr.c(a2, C0059ao.a(6055), e);
            return new b(400, null, 0L);
        }
    }

    public final qp g(xq xqVar) {
        sp.a j;
        HashMap hashMap = new HashMap();
        for (fq fqVar : xqVar.b()) {
            String j2 = fqVar.j();
            if (!hashMap.containsKey(j2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(fqVar);
                hashMap.put(j2, arrayList);
            } else {
                ((List) hashMap.get(j2)).add(fqVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            fq fqVar2 = (fq) ((List) entry.getValue()).get(0);
            tp.a a2 = tp.a();
            a2.f(wp.DEFAULT);
            a2.g(this.f.a());
            a2.h(this.e.a());
            rp.a a3 = rp.a();
            a3.c(rp.b.ANDROID_FIREBASE);
            hp.a a4 = hp.a();
            a4.m(Integer.valueOf(fqVar2.g(C0059ao.a(6057))));
            a4.j(fqVar2.b(C0059ao.a(6058)));
            a4.f(fqVar2.b(C0059ao.a(6059)));
            a4.d(fqVar2.b(C0059ao.a(6060)));
            a4.l(fqVar2.b(C0059ao.a(6061)));
            a4.k(fqVar2.b(C0059ao.a(6062)));
            a4.h(fqVar2.b(C0059ao.a(6063)));
            a4.e(fqVar2.b(C0059ao.a(6064)));
            a4.c(fqVar2.b(C0059ao.a(6065)));
            a4.g(fqVar2.b(C0059ao.a(6066)));
            a4.i(fqVar2.b(C0059ao.a(6067)));
            a4.b(fqVar2.b(C0059ao.a(6068)));
            a3.b(a4.a());
            a2.b(a3.a());
            try {
                a2.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                a2.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (fq fqVar3 : (List) entry.getValue()) {
                eq e = fqVar3.e();
                vo b2 = e.b();
                if (b2.equals(vo.b(C0059ao.a(6069)))) {
                    j = sp.j(e.a());
                } else if (b2.equals(vo.b(C0059ao.a(6070)))) {
                    j = sp.i(new String(e.a(), Charset.forName(C0059ao.a(6071))));
                } else {
                    qr.f(C0059ao.a(6075), C0059ao.a(6076), b2);
                }
                j.c(fqVar3.f());
                j.d(fqVar3.k());
                j.h(fqVar3.h(C0059ao.a(6072)));
                vp.a a5 = vp.a();
                a5.c(vp.c.a(fqVar3.g(C0059ao.a(6073))));
                a5.b(vp.b.a(fqVar3.g(C0059ao.a(6074))));
                j.e(a5.a());
                if (fqVar3.d() != null) {
                    j.b(fqVar3.d());
                }
                arrayList3.add(j.a());
            }
            a2.c(arrayList3);
            arrayList2.add(a2.a());
        }
        return qp.a(arrayList2);
    }

    public fp(Context context, zu zuVar, zu zuVar2) {
        this(context, zuVar, zuVar2, 40000);
    }
}
