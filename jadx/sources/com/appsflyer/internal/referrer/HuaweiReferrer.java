package com.appsflyer.internal.referrer;

import android.content.Context;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.internal.ContentFetcher;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class HuaweiReferrer extends Referrer {
    public void start(Context context, final Runnable runnable) {
        ContentFetcher<Map<String, Object>> contentFetcher = new ContentFetcher<Map<String, Object>>(context, C0059ao.a(5572), new String[]{C0059ao.a(5570), C0059ao.a(5571)}) { // from class: com.appsflyer.internal.referrer.HuaweiReferrer.3
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0162, code lost:
                if (r3 != null) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0172, code lost:
                if (0 == 0) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0174, code lost:
                r3.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0177, code lost:
                r1 = r12.f320;
                r1.map.put(myunmn.C0059ao.a(2542), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r1.f323));
                r1.f322 = com.appsflyer.internal.referrer.Referrer.State.FINISHED;
                r11.run();
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x019d, code lost:
                return r12.f320.map;
             */
            @Override // com.appsflyer.internal.ContentFetcher
            /* renamed from: ǃ  reason: contains not printable characters */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.util.Map<java.lang.String, java.lang.Object> query() {
                /*
                    Method dump skipped, instructions count: 420
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.referrer.HuaweiReferrer.AnonymousClass3.query():java.util.Map");
            }
        };
        if (AppsFlyerLibCore.getInstance().getLaunchCounter(AppsFlyerLibCore.getSharedPreferences(context), false) >= 2 || !contentFetcher.valid()) {
            return;
        }
        contentFetcher.start();
        m218(context);
    }
}
