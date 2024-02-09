package myunmn;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.support.v4.media.session.IMediaSession;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Thread;

/* renamed from: myunmn.am  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0057am {
    private static Thread.UncaughtExceptionHandler a = null;
    private static final String b = "Report";
    private static int c = -1;

    static {
        C0095z.a();
    }

    public static void a(String str) {
        aD b2 = b(str);
        if (Build.VERSION.SDK_INT >= 26) {
            char[] cArr = {(char) (cArr[4] ^ ' '), (char) (cArr[0] ^ '7'), (char) (cArr[5] ^ 4), (char) (cArr[4] ^ 29), (char) (cArr[5] ^ 6), (char) ((-26399) ^ (-26475))};
            String intern = new String(cArr).intern();
            char[] cArr2 = {(char) (11061 ^ 11120), (char) (cArr2[5] ^ 22), (char) (cArr2[3] ^ 29), (char) (cArr2[0] ^ '1'), (char) (cArr2[3] ^ 29), (char) (cArr2[0] ^ '+'), (char) (cArr2[5] ^ '\t'), (char) (cArr2[8] ^ 26), (char) (cArr2[6] ^ 'G')};
            Log.e(intern, new String(cArr2).intern(), b2);
        }
        a.uncaughtException(Thread.currentThread(), b2);
    }

    private static aD b(String str) {
        if (str == null || str.isEmpty() || str.length() < 2) {
            return new C0052ah(new String(new char[]{(char) (17303 ^ 17334)}).intern() + str);
        }
        switch (Integer.parseInt(str.substring(0, 2), 16)) {
            case 0:
                return new C0087r(str);
            case 1:
                return new C0069ay(str);
            case 2:
                return new C0058an(str);
            case 3:
                return new E(str);
            case 4:
                return new C0092w(str);
            case 5:
                return new C0060ap(str);
            case 6:
                return new C0061aq(str);
            case 7:
                return new C0051ag(str);
            case 8:
                return new aB(str);
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return new aP(str);
            case 18:
            case 19:
                return new C0055ak(str);
            case 20:
                return new C0079j(str);
            case 21:
                return new C0088s(str);
            case 22:
                return new aO(str);
            case 23:
                return new E(str);
            case 24:
            case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
            case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
            default:
                return new C0052ah(str);
            case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                return new aL(str);
            case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                return new G(str);
            case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                return new C0066av(str);
            case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                return new aI(str);
            case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                return new C0056al(str);
        }
    }

    public static void c() {
        new X().start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e() {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new ParcelFileDescriptor.AutoCloseInputStream(ParcelFileDescriptor.adoptFd(c))));
        } catch (Exception unused) {
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            char[] cArr = new char[1024];
            try {
                do {
                    int read = bufferedReader.read(cArr, 0, 1024);
                    if (read > 0) {
                        sb.append(cArr, 0, read);
                    }
                    break;
                } while (!sb.toString().endsWith(new String(new char[]{(char) (23140 ^ 23109)}).intern()));
                break;
                bufferedReader.close();
            } catch (Exception unused2) {
            }
            sb.setLength(sb.length() - 1);
            if (sb.length() <= 0) {
                return null;
            }
            return sb.toString();
        } catch (Exception unused3) {
            try {
                bufferedReader.close();
            } catch (Exception unused4) {
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            try {
                bufferedReader2.close();
            } catch (Exception unused5) {
            }
            throw th;
        }
    }
}
