package io.fabric.sdk.android.services.network;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.TreeMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class UrlUtils {
    public static final String UTF8 = null;

    static {
        C0059ao.a(UrlUtils.class, 266);
    }

    private UrlUtils() {
    }

    public static TreeMap<String, String> getQueryParams(URI uri, boolean z) {
        return getQueryParams(uri.getRawQuery(), z);
    }

    public static String percentEncode(String str) {
        int i;
        if (str == null) {
            return C0059ao.a(12383);
        }
        StringBuilder sb = new StringBuilder();
        String urlEncode = urlEncode(str);
        int length = urlEncode.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = urlEncode.charAt(i2);
            if (charAt == '*') {
                sb.append(C0059ao.a(12384));
            } else if (charAt == '+') {
                sb.append(C0059ao.a(12385));
            } else if (charAt == '%' && (i = i2 + 2) < length && urlEncode.charAt(i2 + 1) == '7' && urlEncode.charAt(i) == 'E') {
                sb.append('~');
                i2 = i;
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        return sb.toString();
    }

    public static String urlDecode(String str) {
        if (str == null) {
            return C0059ao.a(12386);
        }
        try {
            return URLDecoder.decode(str, C0059ao.a(12387));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static String urlEncode(String str) {
        if (str == null) {
            return C0059ao.a(12388);
        }
        try {
            return URLEncoder.encode(str, C0059ao.a(12389));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static TreeMap<String, String> getQueryParams(String str, boolean z) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        if (str == null) {
            return treeMap;
        }
        for (String str2 : str.split(C0059ao.a(12380))) {
            String[] split = str2.split(C0059ao.a(12381));
            if (split.length == 2) {
                if (z) {
                    treeMap.put(urlDecode(split[0]), urlDecode(split[1]));
                } else {
                    treeMap.put(split[0], split[1]);
                }
            } else if (!TextUtils.isEmpty(split[0])) {
                String a = C0059ao.a(12382);
                if (z) {
                    treeMap.put(urlDecode(split[0]), a);
                } else {
                    treeMap.put(split[0], a);
                }
            }
        }
        return treeMap;
    }
}
