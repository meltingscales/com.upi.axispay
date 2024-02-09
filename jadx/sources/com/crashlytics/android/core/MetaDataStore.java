package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import myunmn.C0059ao;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MetaDataStore {
    private static final String KEYDATA_SUFFIX = null;
    private static final String KEY_USER_EMAIL = null;
    private static final String KEY_USER_ID = null;
    private static final String KEY_USER_NAME = null;
    private static final String METADATA_EXT = null;
    private static final String USERDATA_SUFFIX = null;
    private static final Charset UTF_8;
    private final File filesDir;

    static {
        C0059ao.a(MetaDataStore.class, 153);
        UTF_8 = Charset.forName(C0059ao.a(13133));
    }

    public MetaDataStore(File file) {
        this.filesDir = file;
    }

    private static Map<String, String> jsonToKeysData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, valueOrNull(jSONObject, next));
        }
        return hashMap;
    }

    private static UserMetaData jsonToUserData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return new UserMetaData(valueOrNull(jSONObject, C0059ao.a(13134)), valueOrNull(jSONObject, C0059ao.a(13135)), valueOrNull(jSONObject, C0059ao.a(13136)));
    }

    private static String keysDataToJson(Map<String, String> map) throws JSONException {
        return new JSONObject(map).toString();
    }

    private static String userDataToJson(UserMetaData userMetaData) throws JSONException {
        return new JSONObject() { // from class: com.crashlytics.android.core.MetaDataStore.1
            {
                put(C0059ao.a(3057), UserMetaData.this.id);
                put(C0059ao.a(3058), UserMetaData.this.name);
                put(C0059ao.a(3059), UserMetaData.this.email);
            }
        }.toString();
    }

    private static String valueOrNull(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File getKeysFileForSession(String str) {
        File file = this.filesDir;
        return new File(file, str + C0059ao.a(13137) + C0059ao.a(13138));
    }

    public File getUserDataFileForSession(String str) {
        File file = this.filesDir;
        return new File(file, str + C0059ao.a(13139) + C0059ao.a(13140));
    }

    public Map<String, String> readKeyData(String str) {
        String a = C0059ao.a(13141);
        File keysFileForSession = getKeysFileForSession(str);
        if (!keysFileForSession.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(keysFileForSession);
                try {
                    Map<String, String> jsonToKeysData = jsonToKeysData(CommonUtils.streamToString(fileInputStream2));
                    CommonUtils.closeOrLog(fileInputStream2, a);
                    return jsonToKeysData;
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    Fabric.getLogger().e(C0059ao.a(13142), C0059ao.a(13143), e);
                    CommonUtils.closeOrLog(fileInputStream, a);
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    CommonUtils.closeOrLog(fileInputStream, a);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public UserMetaData readUserData(String str) {
        String a = C0059ao.a(13144);
        File userDataFileForSession = getUserDataFileForSession(str);
        if (!userDataFileForSession.exists()) {
            return UserMetaData.EMPTY;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(userDataFileForSession);
                try {
                    UserMetaData jsonToUserData = jsonToUserData(CommonUtils.streamToString(fileInputStream2));
                    CommonUtils.closeOrLog(fileInputStream2, a);
                    return jsonToUserData;
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    Fabric.getLogger().e(C0059ao.a(13145), C0059ao.a(13146), e);
                    CommonUtils.closeOrLog(fileInputStream, a);
                    return UserMetaData.EMPTY;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    CommonUtils.closeOrLog(fileInputStream, a);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void writeKeyData(String str, Map<String, String> map) {
        String a = C0059ao.a(13147);
        File keysFileForSession = getKeysFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String keysDataToJson = keysDataToJson(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(keysFileForSession), UTF_8));
                try {
                    bufferedWriter2.write(keysDataToJson);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, a);
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Fabric.getLogger().e(C0059ao.a(13148), C0059ao.a(13149), e);
                    CommonUtils.closeOrLog(bufferedWriter, a);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.closeOrLog(bufferedWriter, a);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void writeUserData(String str, UserMetaData userMetaData) {
        String a = C0059ao.a(13150);
        File userDataFileForSession = getUserDataFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String userDataToJson = userDataToJson(userMetaData);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(userDataFileForSession), UTF_8));
                try {
                    bufferedWriter2.write(userDataToJson);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, a);
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Fabric.getLogger().e(C0059ao.a(13151), C0059ao.a(13152), e);
                    CommonUtils.closeOrLog(bufferedWriter, a);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.closeOrLog(bufferedWriter, a);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
