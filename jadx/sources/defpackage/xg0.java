package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: xg0  reason: default package */
/* loaded from: classes.dex */
public class xg0 {
    static {
        C0095z.a();
    }

    public static String a(Context context) {
        n70 a = n70.f.a();
        char[] cArr = {(char) (cArr[9] ^ '2'), (char) (cArr[6] ^ '-'), (char) (cArr[5] ^ 'V'), (char) (cArr[5] ^ 'E'), (char) (cArr[5] ^ 'D'), (char) (19404 ^ 19436), (char) (cArr[2] ^ ':'), (char) (cArr[5] ^ 'O'), (char) (cArr[7] ^ '\f'), (char) (cArr[5] ^ 'A'), (char) (cArr[2] ^ 26), (char) (cArr[3] ^ 0)};
        String m = a.m(new String(cArr).intern());
        if (TextUtils.isEmpty(m)) {
            char[] cArr2 = {(char) ((-13490) ^ (-13525)), (char) (cArr2[0] ^ 11)};
            return new String(cArr2).intern();
        }
        return m;
    }

    public static Context b(Context context) {
        return d(context, a(context));
    }

    public static Context c(Context context, String str) {
        d70.e(context).i(str);
        return d(context, str);
    }

    public static Context d(Context context, String str) {
        Locale locale = new Locale(str);
        Locale.setDefault(locale);
        Resources resources = context.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        if (Build.VERSION.SDK_INT >= 17) {
            configuration.setLocale(locale);
            Context createConfigurationContext = context.createConfigurationContext(configuration);
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            return createConfigurationContext;
        }
        configuration.locale = locale;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return context;
    }
}
