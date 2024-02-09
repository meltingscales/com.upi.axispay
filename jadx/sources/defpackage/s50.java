package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: s50  reason: default package */
/* loaded from: classes.dex */
public class s50 {
    public static final Map<String, Typeface> a = new HashMap();

    public static Typeface a(Context context) {
        Map<String, Typeface> map = a;
        String a2 = C0059ao.a(2338);
        Typeface typeface = map.get(a2);
        if (typeface == null) {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), a2);
            map.put(a2, createFromAsset);
            return createFromAsset;
        }
        return typeface;
    }
}
