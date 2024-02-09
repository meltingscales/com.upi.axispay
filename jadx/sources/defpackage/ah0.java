package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.upi.axispay.R;
import defpackage.n70;
import defpackage.y80;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ah0  reason: default package */
/* loaded from: classes.dex */
public class ah0 {
    public static Drawable a(Context context, String str) {
        Drawable drawable = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 6) {
            trim = C0059ao.a(6423) + trim;
        }
        try {
            drawable = t8.f(context, R.drawable.background_button_blank);
            drawable.setColorFilter(Color.parseColor(trim), PorterDuff.Mode.SCREEN);
            return drawable;
        } catch (Exception unused) {
            return drawable;
        }
    }

    public static String b(Activity activity) {
        int i = activity.getResources().getDisplayMetrics().densityDpi;
        int i2 = activity.getResources().getConfiguration().screenLayout;
        return C0059ao.a(6424);
    }

    public static void c(Context context, String str, Map<String, Object> map) {
        d(context, str, map, false);
    }

    public static void d(Context context, String str, Map<String, Object> map, boolean z) {
        n70.a aVar = n70.f;
        n70 a = aVar.a();
        String a2 = C0059ao.a(6425);
        map.put(C0059ao.a(6426), jg0.o(a.m(a2)));
        AppsFlyerLib.getInstance().setCustomerUserId(jg0.o(aVar.a().m(a2)));
        AppsFlyerLib.getInstance().trackEvent(context, str, map);
        if (z) {
            return;
        }
        g(context, str, map);
    }

    public static void e(Context context, String str, Product product, Map<String, Object> map) {
        Tracker a = y80.b().a(y80.b.APP);
        HitBuilders.ScreenViewBuilder screenViewBuilder = new HitBuilders.ScreenViewBuilder();
        if (map != null) {
            for (String str2 : map.keySet()) {
                a.set(str2, (String) map.get(str2));
            }
        }
        ProductAction productAction = new ProductAction(str);
        n70.a aVar = n70.f;
        n70 a2 = aVar.a();
        String a3 = C0059ao.a(6427);
        product.setCustomDimension(1, jg0.o(a2.m(a3)));
        screenViewBuilder.addProduct(product);
        screenViewBuilder.setCustomDimension(1, jg0.o(aVar.a().m(a3)));
        screenViewBuilder.setProductAction(productAction);
        a.send(screenViewBuilder.build());
        a.setScreenName(str);
    }

    public static void f(Context context, String str, String str2) {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        Bundle bundle = new Bundle();
        bundle.putString(C0059ao.a(6428), str);
        bundle.putString(C0059ao.a(6429), String.valueOf(str2));
        firebaseAnalytics.logEvent(C0059ao.a(6430), bundle);
    }

    public static void g(Context context, String str, Map<String, Object> map) {
        Tracker a = y80.b().a(y80.b.APP);
        a.setScreenName(str);
        HitBuilders.EventBuilder eventBuilder = new HitBuilders.EventBuilder();
        if (map != null) {
            for (String str2 : map.keySet()) {
                a.set(str2, (String) map.get(str2));
            }
            String str3 = (String) map.get(C0059ao.a(6431));
            if (!TextUtils.isEmpty(str3)) {
                a.setScreenName(str3);
            }
        }
        eventBuilder.setAction(str);
        eventBuilder.setCategory(str);
        eventBuilder.setCustomDimension(1, jg0.o(n70.f.a().m(C0059ao.a(6432))));
        a.send(eventBuilder.build());
    }
}
