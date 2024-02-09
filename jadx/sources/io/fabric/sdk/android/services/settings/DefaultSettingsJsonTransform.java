package io.fabric.sdk.android.services.settings;

import com.google.android.gms.common.ConnectionResult;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import myunmn.C0059ao;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class DefaultSettingsJsonTransform implements SettingsJsonTransform {
    private AnalyticsSettingsData buildAnalyticsSessionDataFrom(JSONObject jSONObject) {
        return new AnalyticsSettingsData(jSONObject.optString(C0059ao.a(1451), C0059ao.a(1452)), jSONObject.optInt(C0059ao.a(1453), 600), jSONObject.optInt(C0059ao.a(1454), 8000), jSONObject.optInt(C0059ao.a(1455), 1), jSONObject.optInt(C0059ao.a(1456), 100), jSONObject.optBoolean(C0059ao.a(1457), false), jSONObject.optBoolean(C0059ao.a(1458), false), jSONObject.optBoolean(C0059ao.a(1459), true), jSONObject.optBoolean(C0059ao.a(1460), true), jSONObject.optInt(C0059ao.a(1461), 1), jSONObject.optBoolean(C0059ao.a(1462), true));
    }

    private AppSettingsData buildAppDataFrom(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString(C0059ao.a(1463));
        String string2 = jSONObject.getString(C0059ao.a(1464));
        String string3 = jSONObject.getString(C0059ao.a(1465));
        String string4 = jSONObject.getString(C0059ao.a(1466));
        String string5 = jSONObject.getString(C0059ao.a(1467));
        boolean optBoolean = jSONObject.optBoolean(C0059ao.a(1468), false);
        String a = C0059ao.a(1469);
        return new AppSettingsData(string, string2, string3, string4, string5, optBoolean, (jSONObject.has(a) && jSONObject.getJSONObject(a).has(C0059ao.a(1470))) ? buildIconDataFrom(jSONObject.getJSONObject(a)) : null);
    }

    private BetaSettingsData buildBetaSettingsDataFrom(JSONObject jSONObject) throws JSONException {
        return new BetaSettingsData(jSONObject.optString(C0059ao.a(1471), SettingsJsonConstants.BETA_UPDATE_ENDPOINT_DEFAULT), jSONObject.optInt(C0059ao.a(1472), com.google.firebase.crashlytics.internal.settings.SettingsJsonConstants.SETTINGS_CACHE_DURATION_DEFAULT));
    }

    private FeaturesSettingsData buildFeaturesSessionDataFrom(JSONObject jSONObject) {
        return new FeaturesSettingsData(jSONObject.optBoolean(C0059ao.a(1473), false), jSONObject.optBoolean(C0059ao.a(1474), true), jSONObject.optBoolean(C0059ao.a(1475), true), jSONObject.optBoolean(C0059ao.a(1476), false), jSONObject.optBoolean(C0059ao.a(1477), false));
    }

    private AppIconSettingsData buildIconDataFrom(JSONObject jSONObject) throws JSONException {
        return new AppIconSettingsData(jSONObject.getString(C0059ao.a(1478)), jSONObject.getInt(C0059ao.a(1479)), jSONObject.getInt(C0059ao.a(1480)));
    }

    private PromptSettingsData buildPromptDataFrom(JSONObject jSONObject) throws JSONException {
        return new PromptSettingsData(jSONObject.optString(C0059ao.a(1481), C0059ao.a(1482)), jSONObject.optString(C0059ao.a(1483), C0059ao.a(1484)), jSONObject.optString(C0059ao.a(1485), C0059ao.a(1486)), jSONObject.optBoolean(C0059ao.a(1487), true), jSONObject.optString(C0059ao.a(1488), C0059ao.a(1489)), jSONObject.optBoolean(C0059ao.a(1490), true), jSONObject.optString(C0059ao.a(1491), C0059ao.a(1492)));
    }

    private SessionSettingsData buildSessionDataFrom(JSONObject jSONObject) throws JSONException {
        return new SessionSettingsData(jSONObject.optInt(C0059ao.a(1493), 64000), jSONObject.optInt(C0059ao.a(1494), 8), jSONObject.optInt(C0059ao.a(1495), 64), jSONObject.optInt(C0059ao.a(1496), 64), jSONObject.optInt(C0059ao.a(1497), 255), jSONObject.optBoolean(C0059ao.a(1498), false), jSONObject.optInt(C0059ao.a(1499), 4));
    }

    private long getExpiresAtFrom(CurrentTimeProvider currentTimeProvider, long j, JSONObject jSONObject) throws JSONException {
        String a = C0059ao.a(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        if (jSONObject.has(a)) {
            return jSONObject.getLong(a);
        }
        return currentTimeProvider.getCurrentTimeMillis() + (j * 1000);
    }

    private JSONObject toAnalyticsJson(AnalyticsSettingsData analyticsSettingsData) throws JSONException {
        return new JSONObject().put(C0059ao.a(1501), analyticsSettingsData.analyticsURL).put(C0059ao.a(1502), analyticsSettingsData.flushIntervalSeconds).put(C0059ao.a(1503), analyticsSettingsData.maxByteSizePerFile).put(C0059ao.a(1504), analyticsSettingsData.maxFileCountPerSend).put(C0059ao.a(1505), analyticsSettingsData.maxPendingSendFileCount);
    }

    private JSONObject toAppJson(AppSettingsData appSettingsData) throws JSONException {
        JSONObject put = new JSONObject().put(C0059ao.a(1506), appSettingsData.identifier).put(C0059ao.a(1507), appSettingsData.status).put(C0059ao.a(1508), appSettingsData.url).put(C0059ao.a(1509), appSettingsData.reportsUrl).put(C0059ao.a(1510), appSettingsData.ndkReportsUrl).put(C0059ao.a(1511), appSettingsData.updateRequired);
        AppIconSettingsData appIconSettingsData = appSettingsData.icon;
        if (appIconSettingsData != null) {
            put.put(C0059ao.a(1512), toIconJson(appIconSettingsData));
        }
        return put;
    }

    private JSONObject toBetaJson(BetaSettingsData betaSettingsData) throws JSONException {
        return new JSONObject().put(C0059ao.a(1513), betaSettingsData.updateUrl).put(C0059ao.a(1514), betaSettingsData.updateSuspendDurationSeconds);
    }

    private JSONObject toFeaturesJson(FeaturesSettingsData featuresSettingsData) throws JSONException {
        return new JSONObject().put(C0059ao.a(1515), featuresSettingsData.collectLoggedException).put(C0059ao.a(1516), featuresSettingsData.collectReports).put(C0059ao.a(1517), featuresSettingsData.collectAnalytics);
    }

    private JSONObject toIconJson(AppIconSettingsData appIconSettingsData) throws JSONException {
        return new JSONObject().put(C0059ao.a(1518), appIconSettingsData.hash).put(C0059ao.a(1519), appIconSettingsData.width).put(C0059ao.a(1520), appIconSettingsData.height);
    }

    private JSONObject toPromptJson(PromptSettingsData promptSettingsData) throws JSONException {
        return new JSONObject().put(C0059ao.a(1521), promptSettingsData.title).put(C0059ao.a(1522), promptSettingsData.message).put(C0059ao.a(1523), promptSettingsData.sendButtonTitle).put(C0059ao.a(1524), promptSettingsData.showCancelButton).put(C0059ao.a(1525), promptSettingsData.cancelButtonTitle).put(C0059ao.a(1526), promptSettingsData.showAlwaysSendButton).put(C0059ao.a(1527), promptSettingsData.alwaysSendButtonTitle);
    }

    private JSONObject toSessionJson(SessionSettingsData sessionSettingsData) throws JSONException {
        return new JSONObject().put(C0059ao.a(1528), sessionSettingsData.logBufferSize).put(C0059ao.a(1529), sessionSettingsData.maxChainedExceptionDepth).put(C0059ao.a(1530), sessionSettingsData.maxCustomExceptionEvents).put(C0059ao.a(1531), sessionSettingsData.maxCustomKeyValuePairs).put(C0059ao.a(1532), sessionSettingsData.identifierMask).put(C0059ao.a(1533), sessionSettingsData.sendSessionWithoutCrash);
    }

    @Override // io.fabric.sdk.android.services.settings.SettingsJsonTransform
    public SettingsData buildFromJson(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt(C0059ao.a(1534), 0);
        int optInt2 = jSONObject.optInt(C0059ao.a(1535), com.google.firebase.crashlytics.internal.settings.SettingsJsonConstants.SETTINGS_CACHE_DURATION_DEFAULT);
        return new SettingsData(getExpiresAtFrom(currentTimeProvider, optInt2, jSONObject), buildAppDataFrom(jSONObject.getJSONObject(C0059ao.a(1536))), buildSessionDataFrom(jSONObject.getJSONObject(C0059ao.a(1537))), buildPromptDataFrom(jSONObject.getJSONObject(C0059ao.a(1538))), buildFeaturesSessionDataFrom(jSONObject.getJSONObject(C0059ao.a(1539))), buildAnalyticsSessionDataFrom(jSONObject.getJSONObject(C0059ao.a(1540))), buildBetaSettingsDataFrom(jSONObject.getJSONObject(C0059ao.a(1541))), optInt, optInt2);
    }

    @Override // io.fabric.sdk.android.services.settings.SettingsJsonTransform
    public JSONObject toJson(SettingsData settingsData) throws JSONException {
        return new JSONObject().put(C0059ao.a(1542), settingsData.expiresAtMillis).put(C0059ao.a(1543), settingsData.cacheDuration).put(C0059ao.a(1544), settingsData.settingsVersion).put(C0059ao.a(1545), toFeaturesJson(settingsData.featuresData)).put(C0059ao.a(1546), toAnalyticsJson(settingsData.analyticsSettingsData)).put(C0059ao.a(1547), toBetaJson(settingsData.betaSettingsData)).put(C0059ao.a(1548), toAppJson(settingsData.appData)).put(C0059ao.a(1549), toSessionJson(settingsData.sessionData)).put(C0059ao.a(1550), toPromptJson(settingsData.promptData));
    }
}
