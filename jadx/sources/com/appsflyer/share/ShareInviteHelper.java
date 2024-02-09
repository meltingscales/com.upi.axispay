package com.appsflyer.share;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AFExecutor;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.OneLinkHttpTask;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ShareInviteHelper {
    public static LinkGenerator generateInviteUrl(Context context) {
        String appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(context);
        String string = AppsFlyerProperties.getInstance().getString(C0059ao.a(11466));
        String string2 = AppsFlyerProperties.getInstance().getString(C0059ao.a(11467));
        LinkGenerator addParameter = new LinkGenerator(C0059ao.a(11469)).setBaseURL(string, string2, context.getPackageName()).setReferrerUID(appsFlyerUID).setReferrerCustomerId(AppsFlyerProperties.getInstance().getString(C0059ao.a(11468))).addParameter(C0059ao.a(11470), context.getPackageName());
        String string3 = AppsFlyerProperties.getInstance().getString(C0059ao.a(11471));
        if (string3 != null && string3.length() > 3) {
            addParameter.setBaseDeeplink(string3);
        }
        return addParameter;
    }

    @Deprecated
    public static void generateUserInviteLink(Context context, String str, Map<String, String> map, CreateOneLinkHttpTask.ResponseListener responseListener) {
        if (AppsFlyerProperties.getInstance().getBoolean(C0059ao.a(11472), false)) {
            AFLogger.afInfoLog(C0059ao.a(11473), true);
            return;
        }
        CreateOneLinkHttpTask createOneLinkHttpTask = new CreateOneLinkHttpTask(str, map, AppsFlyerLibCore.getInstance(), context, AppsFlyerLib.getInstance().isTrackingStopped());
        createOneLinkHttpTask.setConnProvider(new OneLinkHttpTask.HttpsUrlConnectionProvider());
        createOneLinkHttpTask.setListener(responseListener);
        AFExecutor.getInstance().getThreadPoolExecutor().execute(createOneLinkHttpTask);
    }

    public static void trackInvite(Context context, String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            AFLogger.afWarnLog(C0059ao.a(11474));
        } else if (AppsFlyerProperties.getInstance().getBoolean(C0059ao.a(11475), false)) {
            AFLogger.afInfoLog(C0059ao.a(11476), true);
        } else {
            LinkGenerator generateInviteUrl = generateInviteUrl(context);
            generateInviteUrl.addParameters(map);
            AFLogger.afDebugLog(C0059ao.a(11477).concat(String.valueOf(str)));
            StringBuilder sb = new StringBuilder(C0059ao.a(11478));
            sb.append(generateInviteUrl.generateLink());
            AFLogger.afDebugLog(sb.toString());
            String mediaSource = generateInviteUrl.getMediaSource();
            if (C0059ao.a(11479).equals(mediaSource)) {
                mediaSource = C0059ao.a(11480);
            } else if (C0059ao.a(11481).equals(mediaSource)) {
                mediaSource = C0059ao.a(11482);
            }
            HashMap hashMap = new HashMap();
            if (generateInviteUrl.getParameters() != null) {
                hashMap.putAll(generateInviteUrl.getParameters());
            }
            hashMap.put(C0059ao.a(11483), str);
            AppsFlyerLib.getInstance().trackEvent(context, mediaSource, hashMap);
        }
    }
}
