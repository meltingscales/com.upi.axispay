package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import java.util.Locale;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AnswersEventValidator {
    public boolean failFast;
    public final int maxNumAttributes;
    public final int maxStringLength;

    public AnswersEventValidator(int i, int i2, boolean z) {
        this.maxNumAttributes = i;
        this.maxStringLength = i2;
        this.failFast = z;
    }

    private void logOrThrowException(RuntimeException runtimeException) {
        if (!this.failFast) {
            Fabric.getLogger().e(C0059ao.a(312), C0059ao.a(313), runtimeException);
            return;
        }
        throw runtimeException;
    }

    public boolean isFullMap(Map<String, Object> map, String str) {
        if (map.size() < this.maxNumAttributes || map.containsKey(str)) {
            return false;
        }
        logOrThrowException(new IllegalArgumentException(String.format(Locale.US, C0059ao.a(314), Integer.valueOf(this.maxNumAttributes))));
        return true;
    }

    public boolean isNull(Object obj, String str) {
        if (obj == null) {
            logOrThrowException(new NullPointerException(str + C0059ao.a(315)));
            return true;
        }
        return false;
    }

    public String limitStringLength(String str) {
        int length = str.length();
        int i = this.maxStringLength;
        if (length > i) {
            logOrThrowException(new IllegalArgumentException(String.format(Locale.US, C0059ao.a(316), Integer.valueOf(i))));
            return str.substring(0, this.maxStringLength);
        }
        return str;
    }
}
