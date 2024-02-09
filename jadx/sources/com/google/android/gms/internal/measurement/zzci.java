package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class zzci {
    private static HashMap<String, String> zzyy;
    private static Object zzzd;
    private static boolean zzze;
    public static final Uri CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri zzyu = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzyv = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzyw = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean zzyx = new AtomicBoolean();
    private static final HashMap<String, Boolean> zzyz = new HashMap<>();
    private static final HashMap<String, Integer> zzza = new HashMap<>();
    private static final HashMap<String, Long> zzzb = new HashMap<>();
    private static final HashMap<String, Float> zzzc = new HashMap<>();
    private static String[] zzzf = new String[0];

    private static void zza(ContentResolver contentResolver) {
        if (zzyy == null) {
            zzyx.set(false);
            zzyy = new HashMap<>();
            zzzd = new Object();
            zzze = false;
            contentResolver.registerContentObserver(CONTENT_URI, true, new zzcj(null));
        } else if (zzyx.getAndSet(false)) {
            zzyy.clear();
            zzyz.clear();
            zzza.clear();
            zzzb.clear();
            zzzc.clear();
            zzzd = new Object();
            zzze = false;
        }
    }

    public static String zza(ContentResolver contentResolver, String str, String str2) {
        synchronized (zzci.class) {
            zza(contentResolver);
            Object obj = zzzd;
            if (zzyy.containsKey(str)) {
                String str3 = zzyy.get(str);
                return str3 != null ? str3 : null;
            }
            for (String str4 : zzzf) {
                if (str.startsWith(str4)) {
                    if (!zzze || zzyy.isEmpty()) {
                        zzyy.putAll(zza(contentResolver, zzzf));
                        zzze = true;
                        if (zzyy.containsKey(str)) {
                            String str5 = zzyy.get(str);
                            return str5 != null ? str5 : null;
                        }
                    }
                    return null;
                }
            }
            Cursor query = contentResolver.query(CONTENT_URI, null, null, new String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    zza(obj, str, (String) null);
                    if (query != null) {
                        query.close();
                    }
                    return null;
                }
                String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                zza(obj, str, string);
                String str6 = string != null ? string : null;
                if (query != null) {
                    query.close();
                }
                return str6;
            } finally {
                if (query != null) {
                    query.close();
                }
            }
        }
    }

    private static void zza(Object obj, String str, String str2) {
        synchronized (zzci.class) {
            if (obj == zzzd) {
                zzyy.put(str, str2);
            }
        }
    }

    private static Map<String, String> zza(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(zzyu, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }
}
