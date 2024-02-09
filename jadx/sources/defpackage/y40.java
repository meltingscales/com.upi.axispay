package defpackage;

import android.support.v4.media.session.IMediaSession;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: y40  reason: default package */
/* loaded from: classes.dex */
public final class y40 extends w40 {
    public static final int[][] f = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    public static String c(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        String a = C0059ao.a(9);
        String a2 = C0059ao.a(10);
        switch (c) {
            case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
            case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
            case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append(a2);
                sb.append(cArr, 2, 3);
                break;
            case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                sb.append(cArr, 0, 3);
                sb.append(a);
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append(a);
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append(a2);
                sb.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }
}
