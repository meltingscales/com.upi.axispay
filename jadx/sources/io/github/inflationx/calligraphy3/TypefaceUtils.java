package io.github.inflationx.calligraphy3;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class TypefaceUtils {
    private static final Map<String, Typeface> sCachedFonts = new HashMap();
    private static final Map<Typeface, CalligraphyTypefaceSpan> sCachedSpans = new HashMap();

    private TypefaceUtils() {
    }

    public static CalligraphyTypefaceSpan getSpan(Typeface typeface) {
        if (typeface == null) {
            return null;
        }
        Map<Typeface, CalligraphyTypefaceSpan> map = sCachedSpans;
        synchronized (map) {
            if (!map.containsKey(typeface)) {
                CalligraphyTypefaceSpan calligraphyTypefaceSpan = new CalligraphyTypefaceSpan(typeface);
                map.put(typeface, calligraphyTypefaceSpan);
                return calligraphyTypefaceSpan;
            }
            return map.get(typeface);
        }
    }

    public static boolean isLoaded(Typeface typeface) {
        return typeface != null && sCachedFonts.containsValue(typeface);
    }

    public static Typeface load(AssetManager assetManager, String str) {
        Typeface createFromAsset;
        Map<String, Typeface> map = sCachedFonts;
        synchronized (map) {
            try {
                try {
                    if (!map.containsKey(str)) {
                        if (str.startsWith(C0059ao.a(6923))) {
                            createFromAsset = Typeface.createFromFile(str);
                        } else {
                            createFromAsset = Typeface.createFromAsset(assetManager, str);
                        }
                        map.put(str, createFromAsset);
                        return createFromAsset;
                    }
                    return map.get(str);
                } catch (Exception e) {
                    String a = C0059ao.a(6924);
                    Log.w(a, C0059ao.a(6925) + str + C0059ao.a(6926), e);
                    sCachedFonts.put(str, null);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
