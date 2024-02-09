package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static String f343;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* renamed from: ǃ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m230(java.io.File r7) {
        /*
            r0 = 12541(0x30fd, float:1.7574E-41)
            java.lang.String r1 = myunmn.C0059ao.a(r0)
            r2 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r0 = 12542(0x30fe, float:1.7575E-41)
            java.lang.String r4 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            long r4 = r3.length()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2d
            int r7 = (int) r4     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2d
            byte[] r2 = new byte[r7]     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2d
            r3.readFully(r2)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2d
            r3.close()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2d
            r3.close()     // Catch: java.io.IOException -> L25
            goto L4b
        L25:
            r7 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r1, r7)
            goto L4b
        L2a:
            r7 = move-exception
            r2 = r3
            goto L57
        L2d:
            r7 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
            goto L36
        L32:
            r7 = move-exception
            goto L57
        L34:
            r7 = move-exception
            r3 = r2
        L36:
            r0 = 12543(0x30ff, float:1.7576E-41)
            java.lang.String r4 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L32
            com.appsflyer.AFLogger.afErrorLog(r4, r7)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L4a
            r2.close()     // Catch: java.io.IOException -> L46
            goto L4a
        L46:
            r7 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r1, r7)
        L4a:
            r2 = r3
        L4b:
            java.lang.String r7 = new java.lang.String
            if (r2 == 0) goto L50
            goto L53
        L50:
            r1 = 0
            byte[] r2 = new byte[r1]
        L53:
            r7.<init>(r2)
            return r7
        L57:
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.io.IOException -> L5d
            goto L61
        L5d:
            r2 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r1, r2)
        L61:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.z.m230(java.io.File):java.lang.String");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static synchronized String m231(WeakReference<Context> weakReference) {
        synchronized (z.class) {
            if (weakReference.get() == null) {
                return f343;
            }
            if (f343 == null) {
                String str = null;
                if (weakReference.get() != null) {
                    str = AppsFlyerLibCore.getSharedPreferences(weakReference.get()).getString(C0059ao.a(12544), null);
                }
                if (str != null) {
                    f343 = str;
                } else {
                    try {
                        File file = new File(weakReference.get().getFilesDir(), C0059ao.a(12545));
                        if (!file.exists()) {
                            long currentTimeMillis = System.currentTimeMillis();
                            StringBuilder sb = new StringBuilder();
                            sb.append(currentTimeMillis);
                            sb.append(C0059ao.a(12546));
                            sb.append(Math.abs(new SecureRandom().nextLong()));
                            f343 = sb.toString();
                        } else {
                            f343 = m230(file);
                            file.delete();
                        }
                        String str2 = f343;
                        SharedPreferences.Editor edit = AppsFlyerLibCore.getSharedPreferences(weakReference.get()).edit();
                        edit.putString(C0059ao.a(12547), str2);
                        edit.apply();
                    } catch (Exception e) {
                        AFLogger.afErrorLog(C0059ao.a(12548), e);
                    }
                }
                if (f343 != null) {
                    AppsFlyerProperties.getInstance().set(C0059ao.a(12549), f343);
                }
            }
            return f343;
        }
    }
}
