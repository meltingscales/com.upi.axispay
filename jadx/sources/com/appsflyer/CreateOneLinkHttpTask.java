package com.appsflyer;

import android.content.Context;
import com.appsflyer.share.LinkGenerator;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import myunmn.C0059ao;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CreateOneLinkHttpTask extends OneLinkHttpTask {
    private static final String BRAND_DOMAIN = null;
    private static final String TRACKING_LINK_DATA_KEY = null;
    private static final String TRACKING_LINK_LIVE_TIME_KEY = null;
    private String brandDomain;
    private Context context;
    private Map<String, String> data;
    private boolean mTrackingStopped;
    private String packageName;
    private ResponseListener responseListener;
    private String ttl;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    static {
        C0059ao.a(CreateOneLinkHttpTask.class, 172);
    }

    public CreateOneLinkHttpTask(String str, Map<String, String> map, AppsFlyerLibCore appsFlyerLibCore, Context context, boolean z) {
        super(appsFlyerLibCore);
        this.packageName = C0059ao.a(2651);
        this.mTrackingStopped = false;
        this.mTrackingStopped = z;
        this.context = context;
        if (context != null) {
            this.packageName = context.getPackageName();
        } else {
            AFLogger.afWarnLog(C0059ao.a(2652));
        }
        this.oneLinkId = str;
        this.ttl = C0059ao.a(2653);
        this.data = map;
    }

    @Override // com.appsflyer.OneLinkHttpTask
    public String getOneLinkUrl() {
        return ServerConfigHandler.getUrl(OneLinkHttpTask.BASE_URL) + C0059ao.a(2654) + this.oneLinkId;
    }

    @Override // com.appsflyer.OneLinkHttpTask
    public void handleResponse(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                this.responseListener.onResponse(jSONObject.optString(keys.next()));
            }
        } catch (JSONException e) {
            this.responseListener.onResponseError(C0059ao.a(2655));
            AFLogger.afErrorLog(C0059ao.a(2656) + str, e);
        }
    }

    @Override // com.appsflyer.OneLinkHttpTask
    public void initRequest(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        if (this.mTrackingStopped) {
            return;
        }
        httpsURLConnection.setRequestMethod(C0059ao.a(2657));
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setUseCaches(false);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject(this.data);
        jSONObject.put(C0059ao.a(2658), this.ttl);
        jSONObject.put(C0059ao.a(2659), jSONObject2);
        String str = this.brandDomain;
        if (str != null) {
            jSONObject.put(C0059ao.a(2660), str);
        }
        httpsURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(jSONObject.toString());
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    @Override // com.appsflyer.OneLinkHttpTask
    public void onErrorResponse() {
        LinkGenerator addParameters = new LinkGenerator(C0059ao.a(2662)).setBaseURL(this.oneLinkId, AppsFlyerProperties.getInstance().getString(C0059ao.a(2661)), this.packageName).addParameter(C0059ao.a(2663), this.packageName).addParameters(this.data);
        String string = AppsFlyerProperties.getInstance().getString(C0059ao.a(2664));
        if (string != null) {
            addParameters.setReferrerCustomerId(string);
        }
        this.responseListener.onResponse(addParameters.generateLink());
    }

    public void setBrandDomain(String str) {
        this.brandDomain = str;
    }

    public void setListener(ResponseListener responseListener) {
        this.responseListener = responseListener;
    }
}
