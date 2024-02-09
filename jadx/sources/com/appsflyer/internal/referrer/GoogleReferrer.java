package com.appsflyer.internal.referrer;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.AndroidUtils;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.internal.referrer.Referrer;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class GoogleReferrer extends Referrer {
    public final Map<String, Object> oldMap = new HashMap();

    public static boolean allow(AppsFlyerLibCore appsFlyerLibCore, Context context) {
        if (appsFlyerLibCore.getLaunchCounter(AppsFlyerLibCore.getSharedPreferences(context), false) > 2) {
            AFLogger.afRDLog(C0059ao.a(11059));
            return false;
        }
        String a = C0059ao.a(11060);
        try {
            Class.forName(C0059ao.a(11061));
            if (AndroidUtils.isPermissionAvailable(context, C0059ao.a(11062))) {
                AFLogger.afDebugLog(C0059ao.a(11063));
                return true;
            }
            AFLogger.afDebugLog(C0059ao.a(11064));
            return false;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb = new StringBuilder(C0059ao.a(11066));
            sb.append(a);
            sb.append(C0059ao.a(11067));
            AFLogger.afRDLog(sb.toString());
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(C0059ao.a(11065).concat(a), th);
            return false;
        }
    }

    public void start(final Context context, final Runnable runnable) {
        m218(context);
        try {
            final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
            AFLogger.afDebugLog(C0059ao.a(11068));
            build.startConnection(new InstallReferrerStateListener() { // from class: com.appsflyer.internal.referrer.GoogleReferrer.2
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public final void onInstallReferrerServiceDisconnected() {
                    AFLogger.afDebugLog(C0059ao.a(10943));
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public final void onInstallReferrerSetupFinished(int i) {
                    String a = C0059ao.a(10944);
                    String a2 = C0059ao.a(10945);
                    String a3 = C0059ao.a(10946);
                    GoogleReferrer.this.oldMap.put(C0059ao.a(10947), String.valueOf(i));
                    GoogleReferrer.this.map.put(C0059ao.a(10948), C0059ao.a(10949));
                    Map<String, Object> map = GoogleReferrer.this.map;
                    Context context2 = context;
                    String a4 = C0059ao.a(10950);
                    map.put(C0059ao.a(10951), Long.valueOf(AndroidUtils.getVersionCode(context2, a4)));
                    GoogleReferrer.this.map.put(C0059ao.a(10952), AndroidUtils.getVersionName(context, a4));
                    GoogleReferrer.this.map.putAll(new MandatoryFields());
                    String a5 = C0059ao.a(10953);
                    if (i == -1) {
                        AFLogger.afWarnLog(C0059ao.a(10974));
                        GoogleReferrer.this.map.put(a5, C0059ao.a(10975));
                    } else if (i == 0) {
                        GoogleReferrer.this.map.put(a5, C0059ao.a(10961));
                        try {
                            AFLogger.afDebugLog(C0059ao.a(10962));
                            if (build.isReady()) {
                                ReferrerDetails installReferrer = build.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    GoogleReferrer.this.oldMap.put(C0059ao.a(10963), installReferrer2);
                                    GoogleReferrer.this.map.put(C0059ao.a(10964), installReferrer2);
                                }
                                long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                                GoogleReferrer.this.oldMap.put(C0059ao.a(10965), Long.toString(referrerClickTimestampSeconds));
                                GoogleReferrer.this.map.put(C0059ao.a(10966), Long.valueOf(referrerClickTimestampSeconds));
                                long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                                GoogleReferrer.this.oldMap.put(C0059ao.a(10967), Long.toString(installBeginTimestampSeconds));
                                GoogleReferrer.this.map.put(C0059ao.a(10968), Long.valueOf(installBeginTimestampSeconds));
                                HashMap hashMap = new HashMap();
                                try {
                                    boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                                    GoogleReferrer.this.oldMap.put(a, Boolean.valueOf(googlePlayInstantParam));
                                    hashMap.put(a, Boolean.valueOf(googlePlayInstantParam));
                                } catch (NoSuchMethodError unused) {
                                }
                                try {
                                    hashMap.put(C0059ao.a(10969), Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                    hashMap.put(C0059ao.a(10970), Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                    hashMap.put(C0059ao.a(10971), installReferrer.getInstallVersion());
                                } catch (NoSuchMethodError unused2) {
                                }
                                if (!hashMap.isEmpty()) {
                                    GoogleReferrer.this.map.put(C0059ao.a(10972), hashMap);
                                }
                            } else {
                                AFLogger.afWarnLog(a2);
                                GoogleReferrer.this.oldMap.put(a3, a2);
                            }
                        } catch (Throwable th) {
                            StringBuilder sb = new StringBuilder(C0059ao.a(10973));
                            sb.append(th.getMessage());
                            AFLogger.afWarnLog(sb.toString());
                            GoogleReferrer.this.oldMap.put(a3, th.getMessage());
                        }
                    } else if (i == 1) {
                        GoogleReferrer.this.map.put(a5, C0059ao.a(10959));
                        AFLogger.afWarnLog(C0059ao.a(10960));
                    } else if (i == 2) {
                        AFLogger.afWarnLog(C0059ao.a(10957));
                        GoogleReferrer.this.map.put(a5, C0059ao.a(10958));
                    } else if (i != 3) {
                        AFLogger.afWarnLog(C0059ao.a(10954));
                    } else {
                        AFLogger.afWarnLog(C0059ao.a(10955));
                        GoogleReferrer.this.map.put(a5, C0059ao.a(10956));
                    }
                    AFLogger.afDebugLog(C0059ao.a(10976));
                    GoogleReferrer googleReferrer = GoogleReferrer.this;
                    googleReferrer.map.put(C0059ao.a(10977), Long.valueOf(System.currentTimeMillis() - googleReferrer.f323));
                    googleReferrer.f322 = Referrer.State.FINISHED;
                    runnable.run();
                    build.endConnection();
                }
            });
        } catch (Throwable th) {
            AFLogger.afErrorLog(C0059ao.a(11069), th);
        }
    }
}
