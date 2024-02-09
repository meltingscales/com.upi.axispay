package okhttp3.internal.http;

import com.google.android.gms.vision.barcode.Barcode;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String str) {
        yl0.e(str, C0059ao.a(497));
        return (yl0.a(str, C0059ao.a(498)) || yl0.a(str, C0059ao.a(499))) ? false : true;
    }

    public static final boolean requiresRequestBody(String str) {
        yl0.e(str, C0059ao.a(FirebaseCrashlytics.APP_EXCEPTION_CALLBACK_TIMEOUT_MS));
        return yl0.a(str, C0059ao.a(501)) || yl0.a(str, C0059ao.a(502)) || yl0.a(str, C0059ao.a(503)) || yl0.a(str, C0059ao.a(504)) || yl0.a(str, C0059ao.a(505));
    }

    public final boolean invalidatesCache(String str) {
        yl0.e(str, C0059ao.a(506));
        return yl0.a(str, C0059ao.a(507)) || yl0.a(str, C0059ao.a(508)) || yl0.a(str, C0059ao.a(509)) || yl0.a(str, C0059ao.a(510)) || yl0.a(str, C0059ao.a(511));
    }

    public final boolean redirectsToGet(String str) {
        yl0.e(str, C0059ao.a(Barcode.UPC_A));
        return !yl0.a(str, C0059ao.a(513));
    }

    public final boolean redirectsWithBody(String str) {
        yl0.e(str, C0059ao.a(514));
        return yl0.a(str, C0059ao.a(515));
    }
}
