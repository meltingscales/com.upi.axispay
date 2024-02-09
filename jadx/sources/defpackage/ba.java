package defpackage;

import android.content.res.Configuration;
import android.os.Build;

/* compiled from: AxisPay */
/* renamed from: ba  reason: default package */
/* loaded from: classes.dex */
public final class ba {
    public static da a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? da.d(configuration.getLocales()) : da.a(configuration.locale);
    }
}
