package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import io.fabric.sdk.android.Fabric;
import java.io.File;
import java.io.IOException;
import myunmn.C0059ao;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BinaryImagesConverter {
    private static final String DATA_DIR = null;
    private final Context context;
    private final FileIdStrategy fileIdStrategy;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface FileIdStrategy {
        String createId(File file) throws IOException;
    }

    static {
        C0059ao.a(BinaryImagesConverter.class, 250);
    }

    public BinaryImagesConverter(Context context, FileIdStrategy fileIdStrategy) {
        this.context = context;
        this.fileIdStrategy = fileIdStrategy;
    }

    private File correctDataPath(File file) {
        if (Build.VERSION.SDK_INT >= 9 && file.getAbsolutePath().startsWith(C0059ao.a(14441))) {
            try {
                return new File(this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 0).nativeLibraryDir, file.getName());
            } catch (PackageManager.NameNotFoundException e) {
                Fabric.getLogger().e(C0059ao.a(14442), C0059ao.a(14443), e);
                return file;
            }
        }
        return file;
    }

    private static JSONObject createBinaryImageJson(String str, ProcMapEntry procMapEntry) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0059ao.a(14444), procMapEntry.address);
        jSONObject.put(C0059ao.a(14445), procMapEntry.size);
        jSONObject.put(C0059ao.a(14446), procMapEntry.path);
        jSONObject.put(C0059ao.a(14447), str);
        return jSONObject;
    }

    private static byte[] generateBinaryImagesJsonString(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C0059ao.a(14448), jSONArray);
            return jSONObject.toString().getBytes();
        } catch (JSONException e) {
            Fabric.getLogger().w(C0059ao.a(14449), C0059ao.a(14450), e);
            return new byte[0];
        }
    }

    private File getLibraryFile(String str) {
        File file = new File(str);
        return !file.exists() ? correctDataPath(file) : file;
    }

    private static boolean isRelevant(ProcMapEntry procMapEntry) {
        return (procMapEntry.perms.indexOf(120) == -1 || procMapEntry.path.indexOf(47) == -1) ? false : true;
    }

    private static String joinMapsEntries(JSONArray jSONArray) throws JSONException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            sb.append(jSONArray.getString(i));
        }
        return sb.toString();
    }

    private JSONArray parseProcMapsJson(String str) {
        String a = C0059ao.a(14451);
        JSONArray jSONArray = new JSONArray();
        try {
            for (String str2 : joinMapsEntries(new JSONObject(str).getJSONArray(C0059ao.a(14452))).split(C0059ao.a(14453))) {
                ProcMapEntry parse = ProcMapEntryParser.parse(str2);
                if (parse != null && isRelevant(parse)) {
                    try {
                        try {
                            jSONArray.put(createBinaryImageJson(this.fileIdStrategy.createId(getLibraryFile(parse.path)), parse));
                        } catch (JSONException e) {
                            Fabric.getLogger().d(a, C0059ao.a(14454), e);
                        }
                    } catch (IOException e2) {
                        Fabric.getLogger().d(a, C0059ao.a(14455) + parse.path, e2);
                    }
                }
            }
            return jSONArray;
        } catch (JSONException e3) {
            Fabric.getLogger().w(a, C0059ao.a(14456), e3);
            return jSONArray;
        }
    }

    public byte[] convert(String str) throws IOException {
        return generateBinaryImagesJsonString(parseProcMapsJson(str));
    }
}
