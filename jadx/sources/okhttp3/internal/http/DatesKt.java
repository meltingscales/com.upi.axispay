package okhttp3.internal.http;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import myunmn.C0059ao;
import okhttp3.internal.Util;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class DatesKt {
    private static final DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS;
    private static final String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
    public static final long MAX_DATE = 0;
    private static final DatesKt$STANDARD_DATE_FORMAT$1 STANDARD_DATE_FORMAT;

    /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1] */
    static {
        C0059ao.a(DatesKt.class, 357);
        STANDARD_DATE_FORMAT = new ThreadLocal<DateFormat>() { // from class: okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1
            @Override // java.lang.ThreadLocal
            public DateFormat initialValue() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0059ao.a(6322), Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(Util.UTC);
                return simpleDateFormat;
            }
        };
        String[] strArr = {C0059ao.a(15438), C0059ao.a(15439), C0059ao.a(15440), C0059ao.a(15441), C0059ao.a(15442), C0059ao.a(15443), C0059ao.a(15444), C0059ao.a(15445), C0059ao.a(15446), C0059ao.a(15447), C0059ao.a(15448), C0059ao.a(15449), C0059ao.a(15450), C0059ao.a(15451), C0059ao.a(15452)};
        BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = strArr;
        BROWSER_COMPATIBLE_DATE_FORMATS = new DateFormat[strArr.length];
    }

    public static final Date toHttpDateOrNull(String str) {
        yl0.e(str, C0059ao.a(15453));
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = STANDARD_DATE_FORMAT.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                DateFormat[] dateFormatArr = BROWSER_COMPATIBLE_DATE_FORMATS;
                DateFormat dateFormat = dateFormatArr[i];
                SimpleDateFormat simpleDateFormat = dateFormat;
                if (dateFormat == null) {
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[i], Locale.US);
                    simpleDateFormat2.setTimeZone(Util.UTC);
                    dateFormatArr[i] = simpleDateFormat2;
                    simpleDateFormat = simpleDateFormat2;
                }
                parsePosition.setIndex(0);
                Date parse2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            pi0 pi0Var = pi0.a;
            return null;
        }
    }

    public static final String toHttpDateString(Date date) {
        yl0.e(date, C0059ao.a(15454));
        String format = STANDARD_DATE_FORMAT.get().format(date);
        yl0.d(format, C0059ao.a(15455));
        return format;
    }
}
