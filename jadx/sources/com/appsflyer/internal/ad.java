package com.appsflyer.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFDeepLinkManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.ServerConfigHandler;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import myunmn.C0059ao;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class ad extends OneLinkHttpTask {

    /* renamed from: ı  reason: contains not printable characters */
    private static List<String> f176 = Arrays.asList(C0059ao.a(13191), C0059ao.a(13192), C0059ao.a(13193));

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean f177;

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f178;

    /* renamed from: Ι  reason: contains not printable characters */
    private String f179;

    /* renamed from: ι  reason: contains not printable characters */
    public b f180;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: ɩ */
        void mo126(String str);

        /* renamed from: Ι */
        void mo127(Map<String, String> map);
    }

    public ad(Uri uri, AppsFlyerLibCore appsFlyerLibCore) {
        super(appsFlyerLibCore);
        String[] strArr;
        this.f177 = false;
        if (TextUtils.isEmpty(uri.getHost()) || TextUtils.isEmpty(uri.getPath())) {
            return;
        }
        boolean z = false;
        for (String str : f176) {
            if (uri.getHost().contains(str)) {
                z = true;
            }
        }
        if (AFDeepLinkManager.f0 != null) {
            StringBuilder sb = new StringBuilder(C0059ao.a(13194));
            sb.append(Arrays.asList(AFDeepLinkManager.f0));
            AFLogger.afRDLog(sb.toString());
            for (String str2 : AFDeepLinkManager.f0) {
                if (uri.getHost().contains(str2) && !TextUtils.isEmpty(str2)) {
                    StringBuilder sb2 = new StringBuilder(C0059ao.a(13195));
                    sb2.append(uri.toString());
                    AFLogger.afDebugLog(sb2.toString());
                    this.f177 = true;
                    z = true;
                }
            }
        }
        String[] split = uri.getPath().split(C0059ao.a(13196));
        if (z && split.length == 3) {
            this.oneLinkId = split[1];
            this.f179 = split[2];
            this.f178 = uri.toString();
        }
    }

    @Override // com.appsflyer.OneLinkHttpTask
    public final String getOneLinkUrl() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServerConfigHandler.getUrl(OneLinkHttpTask.BASE_URL));
        sb.append(C0059ao.a(13197));
        sb.append(this.oneLinkId);
        sb.append(C0059ao.a(13198));
        sb.append(this.f179);
        return sb.toString();
    }

    @Override // com.appsflyer.OneLinkHttpTask
    public final void handleResponse(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.f180.mo127(hashMap);
        } catch (JSONException e) {
            this.f180.mo126(C0059ao.a(13199));
            AFLogger.afErrorLog(C0059ao.a(13200).concat(String.valueOf(str)), e);
        }
    }

    @Override // com.appsflyer.OneLinkHttpTask
    public final void initRequest(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        httpsURLConnection.setRequestMethod(C0059ao.a(13201));
    }

    @Override // com.appsflyer.OneLinkHttpTask
    public final void onErrorResponse() {
        String str = this.f178;
        if (str == null) {
            str = C0059ao.a(13202);
        }
        this.f180.mo126(str);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m147() {
        return (TextUtils.isEmpty(this.oneLinkId) || TextUtils.isEmpty(this.f179) || this.oneLinkId.equals(C0059ao.a(13203))) ? false : true;
    }
}
