package com.appsflyer.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class s {
    /* renamed from: ǃ  reason: contains not printable characters */
    public static Map<String, String> m219(Context context) {
        HashMap hashMap = new HashMap();
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService(C0059ao.a(12390))).getDefaultDisplay().getMetrics(displayMetrics);
            hashMap.put(C0059ao.a(12391), String.valueOf(displayMetrics.widthPixels));
            hashMap.put(C0059ao.a(12392), String.valueOf(displayMetrics.heightPixels));
            hashMap.put(C0059ao.a(12393), String.valueOf(displayMetrics.densityDpi));
            hashMap.put(C0059ao.a(12394), String.valueOf(context.getResources().getConfiguration().screenLayout & 15));
            hashMap.put(C0059ao.a(12395), String.valueOf(displayMetrics.xdpi));
            hashMap.put(C0059ao.a(12396), String.valueOf(displayMetrics.ydpi));
        } catch (Throwable th) {
            AFLogger.afErrorLog(C0059ao.a(12397), th);
        }
        return hashMap;
    }
}
