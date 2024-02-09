package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AFKeystoreWrapper {

    /* renamed from: ǃ  reason: contains not printable characters */
    public KeyStore f33;

    /* renamed from: Ι  reason: contains not printable characters */
    private Context f35;

    /* renamed from: ι  reason: contains not printable characters */
    public final Object f36 = new Object();

    /* renamed from: ɩ  reason: contains not printable characters */
    public String f34 = C0059ao.a(14375);

    /* renamed from: ı  reason: contains not printable characters */
    public int f32 = 0;

    public AFKeystoreWrapper(Context context) {
        this.f35 = context;
        AFLogger.afInfoLog(C0059ao.a(14376));
        try {
            KeyStore keyStore = KeyStore.getInstance(C0059ao.a(14377));
            this.f33 = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog(C0059ao.a(14378), e);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean m13(String str) {
        return str.startsWith(C0059ao.a(14379));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m15() {
        String str;
        synchronized (this.f36) {
            str = this.f34;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
        r2 = r5.split(myunmn.C0059ao.a(14392));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r2.length != 3) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        com.appsflyer.AFLogger.afInfoLog(myunmn.C0059ao.a(14393).concat(java.lang.String.valueOf(r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        r4 = r2[1].trim().split(myunmn.C0059ao.a(14394));
        r2 = r2[2].trim().split(myunmn.C0059ao.a(14395));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r4.length != 2) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r2.length != 2) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        r8.f34 = r4[1].trim();
        r8.f32 = java.lang.Integer.parseInt(r2[1].trim());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
        r4 = new java.lang.StringBuilder(myunmn.C0059ao.a(14396));
        r4.append(r2.getClass().getName());
        com.appsflyer.AFLogger.afErrorLog(r4.toString(), r2);
     */
    /* renamed from: Ι  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m17() {
        /*
            r8 = this;
            java.lang.Object r1 = r8.f36
            monitor-enter(r1)
            java.security.KeyStore r2 = r8.f33     // Catch: java.lang.Throwable -> La6
            r3 = 1
            r4 = 0
            if (r2 == 0) goto La3
            java.util.Enumeration r2 = r2.aliases()     // Catch: java.lang.Throwable -> L82
        Ld:
            boolean r5 = r2.hasMoreElements()     // Catch: java.lang.Throwable -> L82
            if (r5 == 0) goto La3
            java.lang.Object r5 = r2.nextElement()     // Catch: java.lang.Throwable -> L82
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L82
            if (r5 == 0) goto Ld
            boolean r6 = m13(r5)     // Catch: java.lang.Throwable -> L82
            if (r6 == 0) goto Ld
            r0 = 14392(0x3838, float:2.0167E-41)
            java.lang.String r2 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L82
            java.lang.String[] r2 = r5.split(r2)     // Catch: java.lang.Throwable -> L82
            int r6 = r2.length     // Catch: java.lang.Throwable -> L82
            r7 = 3
            if (r6 != r7) goto La3
            r0 = 14393(0x3839, float:2.0169E-41)
            java.lang.String r6 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L82
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L82
            java.lang.String r5 = r6.concat(r5)     // Catch: java.lang.Throwable -> L82
            com.appsflyer.AFLogger.afInfoLog(r5)     // Catch: java.lang.Throwable -> L82
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L80
            r0 = 14394(0x383a, float:2.017E-41)
            java.lang.String r5 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L80
            java.lang.String[] r4 = r4.split(r5)     // Catch: java.lang.Throwable -> L80
            r5 = 2
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L80
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L80
            r0 = 14395(0x383b, float:2.0172E-41)
            java.lang.String r6 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L80
            java.lang.String[] r2 = r2.split(r6)     // Catch: java.lang.Throwable -> L80
            int r6 = r4.length     // Catch: java.lang.Throwable -> L80
            if (r6 != r5) goto La4
            int r6 = r2.length     // Catch: java.lang.Throwable -> L80
            if (r6 != r5) goto La4
            r4 = r4[r3]     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L80
            r8.f34 = r4     // Catch: java.lang.Throwable -> L80
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L80
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L80
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L80
            r8.f32 = r2     // Catch: java.lang.Throwable -> L80
            goto La4
        L80:
            r2 = move-exception
            goto L84
        L82:
            r2 = move-exception
            r3 = r4
        L84:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r0 = 14396(0x383c, float:2.0173E-41)
            java.lang.String r5 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> La6
            r4.<init>(r5)     // Catch: java.lang.Throwable -> La6
            java.lang.Class r5 = r2.getClass()     // Catch: java.lang.Throwable -> La6
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> La6
            r4.append(r5)     // Catch: java.lang.Throwable -> La6
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> La6
            com.appsflyer.AFLogger.afErrorLog(r4, r2)     // Catch: java.lang.Throwable -> La6
            goto La4
        La3:
            r3 = r4
        La4:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La6
            return r3
        La6:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFKeystoreWrapper.m17():boolean");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m18() {
        int i;
        synchronized (this.f36) {
            i = this.f32;
        }
        return i;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m14() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(14380));
        synchronized (this.f36) {
            sb.append(C0059ao.a(14381));
            sb.append(this.f34);
            sb.append(C0059ao.a(14382));
            sb.append(C0059ao.a(14383));
            sb.append(this.f32);
        }
        return sb.toString();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m16(String str) {
        AFLogger.afInfoLog(C0059ao.a(14384).concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            AlgorithmParameterSpec algorithmParameterSpec = null;
            synchronized (this.f36) {
                if (!this.f33.containsAlias(str)) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23) {
                        algorithmParameterSpec = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal(C0059ao.a(14385))).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                    } else if (i >= 18 && !AndroidUtils.m44()) {
                        algorithmParameterSpec = new KeyPairGeneratorSpec.Builder(this.f35).setAlias(str).setSubject(new X500Principal(C0059ao.a(14386))).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
                    }
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(C0059ao.a(14387), C0059ao.a(14388));
                    keyPairGenerator.initialize(algorithmParameterSpec);
                    keyPairGenerator.generateKeyPair();
                } else {
                    AFLogger.afInfoLog(C0059ao.a(14389).concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(C0059ao.a(14390));
            sb.append(th.getMessage());
            sb.append(C0059ao.a(14391));
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }
}
