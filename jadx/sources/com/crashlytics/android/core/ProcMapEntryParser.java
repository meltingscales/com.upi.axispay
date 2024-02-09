package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class ProcMapEntryParser {
    private static final Pattern MAP_REGEX = Pattern.compile(C0059ao.a(13406));

    private ProcMapEntryParser() {
    }

    public static ProcMapEntry parse(String str) {
        Matcher matcher = MAP_REGEX.matcher(str);
        if (matcher.matches()) {
            try {
                long longValue = Long.valueOf(matcher.group(1), 16).longValue();
                return new ProcMapEntry(longValue, Long.valueOf(matcher.group(2), 16).longValue() - longValue, matcher.group(3), matcher.group(4));
            } catch (Exception unused) {
                Logger logger = Fabric.getLogger();
                logger.d(C0059ao.a(13408), C0059ao.a(13407) + str);
                return null;
            }
        }
        return null;
    }
}
