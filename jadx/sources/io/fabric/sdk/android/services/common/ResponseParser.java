package io.fabric.sdk.android.services.common;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ResponseParser {
    public static final int ResponseActionDiscard = 0;
    public static final int ResponseActionRetry = 0;

    static {
        C0059ao.a(ResponseParser.class, 178);
    }

    public static int parse(int i) {
        if (i < 200 || i > 299) {
            if (i < 300 || i > 399) {
                if (i < 400 || i > 499) {
                    if (i >= 500) {
                    }
                    return 1;
                }
                return 0;
            }
            return 1;
        }
        return 0;
    }
}
