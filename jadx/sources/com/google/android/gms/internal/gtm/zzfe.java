package com.google.android.gms.internal.gtm;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfe extends zzbs {
    private static final byte[] zza = "\n".getBytes();
    private final String zzb;
    private final zzfo zzc;

    public zzfe(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzb = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", zzbt.zza, Build.VERSION.RELEASE, zzfs.zzd(Locale.getDefault()), Build.MODEL, Build.ID);
        this.zzc = new zzfo(zzbvVar.zzr());
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzg(java.net.URL r6, byte[] r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Error closing http post connection output stream"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            int r1 = r7.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "POST bytes, url"
            r5.zzH(r3, r2, r6)
            boolean r2 = com.google.android.gms.internal.gtm.zzbr.zzV()
            if (r2 == 0) goto L22
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7)
            java.lang.String r3 = "Post payload\n"
            r5.zzP(r3, r2)
        L22:
            r2 = 0
            android.content.Context r3 = r5.zzo()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L76
            r3.getPackageName()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L76
            java.net.HttpURLConnection r6 = r5.zzb(r6)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L76
            r3 = 1
            r6.setDoOutput(r3)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r6.setFixedLengthStreamingMode(r1)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r6.connect()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.io.OutputStream r2 = r6.getOutputStream()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r2.write(r7)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r5.zzk(r6)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            int r7 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r1 = 200(0xc8, float:2.8E-43)
            if (r7 != r1) goto L52
            com.google.android.gms.internal.gtm.zzbq r7 = r5.zzs()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r7.zzi()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r7 = r1
        L52:
            java.lang.String r1 = "POST status"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r5.zzG(r1, r3)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            if (r2 == 0) goto L65
            r2.close()     // Catch: java.io.IOException -> L61
            goto L65
        L61:
            r1 = move-exception
            r5.zzK(r0, r1)
        L65:
            if (r6 == 0) goto L6a
            r6.disconnect()
        L6a:
            return r7
        L6b:
            r7 = move-exception
            goto L93
        L6d:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
            goto L79
        L72:
            r6 = move-exception
            r7 = r6
            r6 = r2
            goto L93
        L76:
            r6 = move-exception
            r7 = r6
            r6 = r2
        L79:
            java.lang.String r1 = "Network POST connection error"
            r5.zzS(r1, r7)     // Catch: java.lang.Throwable -> L8f
            if (r6 == 0) goto L88
            r6.close()     // Catch: java.io.IOException -> L84
            goto L88
        L84:
            r6 = move-exception
            r5.zzK(r0, r6)
        L88:
            if (r2 == 0) goto L8d
            r2.disconnect()
        L8d:
            r6 = 0
            return r6
        L8f:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
        L93:
            if (r2 == 0) goto L9d
            r2.close()     // Catch: java.io.IOException -> L99
            goto L9d
        L99:
            r1 = move-exception
            r5.zzK(r0, r1)
        L9d:
            if (r6 == 0) goto La2
            r6.disconnect()
        La2:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfe.zzg(java.net.URL, byte[]):int");
    }

    private final URL zzh() {
        zzw();
        String zzi = zzct.zzi();
        zzw();
        String zzb = zzeu.zzt.zzb();
        try {
            return new URL(zzb.length() != 0 ? zzi.concat(zzb) : new String(zzi));
        } catch (MalformedURLException e) {
            zzK("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzi(zzex zzexVar) {
        String str;
        String concat;
        if (zzexVar.zzh()) {
            zzw();
            String zzi = zzct.zzi();
            zzw();
            String zzj = zzct.zzj();
            if (zzj.length() != 0) {
                concat = zzi.concat(zzj);
            } else {
                str = new String(zzi);
                concat = str;
            }
        } else {
            zzw();
            String zzk = zzct.zzk();
            zzw();
            String zzj2 = zzct.zzj();
            if (zzj2.length() != 0) {
                concat = zzk.concat(zzj2);
            } else {
                str = new String(zzk);
                concat = str;
            }
        }
        try {
            return new URL(concat);
        } catch (MalformedURLException e) {
            zzK("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzj(zzex zzexVar, String str) {
        String sb;
        if (zzexVar.zzh()) {
            zzw();
            String zzi = zzct.zzi();
            zzw();
            String zzj = zzct.zzj();
            int length = zzi.length();
            StringBuilder sb2 = new StringBuilder(length + 1 + zzj.length() + str.length());
            sb2.append(zzi);
            sb2.append(zzj);
            sb2.append("?");
            sb2.append(str);
            sb = sb2.toString();
        } else {
            zzw();
            String zzk = zzct.zzk();
            zzw();
            String zzj2 = zzct.zzj();
            int length2 = zzk.length();
            StringBuilder sb3 = new StringBuilder(length2 + 1 + zzj2.length() + str.length());
            sb3.append(zzk);
            sb3.append(zzj2);
            sb3.append("?");
            sb3.append(str);
            sb = sb3.toString();
        }
        try {
            return new URL(sb);
        } catch (MalformedURLException e) {
            zzK("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final void zzk(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            do {
            } while (inputStream.read(new byte[1024]) > 0);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzK("Error closing http connection input stream", e);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    zzK("Error closing http connection input stream", e2);
                }
            }
            throw th;
        }
    }

    private static final void zzl(StringBuilder sb, String str, String str2) throws UnsupportedEncodingException {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    @VisibleForTesting
    public final String zza(zzex zzexVar, boolean z) {
        String valueOf;
        Preconditions.checkNotNull(zzexVar);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : zzexVar.zzg().entrySet()) {
                String key = entry.getKey();
                if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key) && !"z".equals(key) && !"_gmsv".equals(key)) {
                    zzl(sb, key, entry.getValue());
                }
            }
            zzl(sb, "ht", String.valueOf(zzexVar.zzd()));
            zzl(sb, "qt", String.valueOf(zzC().currentTimeMillis() - zzexVar.zzd()));
            zzw();
            if (z) {
                long zzc = zzexVar.zzc();
                if (zzc != 0) {
                    valueOf = String.valueOf(zzc);
                } else {
                    valueOf = String.valueOf(zzexVar.zzb());
                }
                zzl(sb, "z", valueOf);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            zzK("Failed to encode name or value", e);
            return null;
        }
    }

    @VisibleForTesting
    public final HttpURLConnection zzb(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzw();
            httpURLConnection.setConnectTimeout(zzeu.zzE.zzb().intValue());
            zzw();
            httpURLConnection.setReadTimeout(zzeu.zzF.zzb().intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty(DefaultSettingsSpiCall.HEADER_USER_AGENT, this.zzb);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0326 A[EDGE_INSN: B:181:0x0326->B:158:0x0326 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.Long> zzc(java.util.List<com.google.android.gms.internal.gtm.zzex> r20) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfe.zzc(java.util.List):java.util.List");
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        zzP("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        NetworkInfo networkInfo;
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        try {
            networkInfo = ((ConnectivityManager) zzo().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            zzO("No network connectivity");
            return false;
        }
        return true;
    }
}
