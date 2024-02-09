package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.ByteString;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class HttpHeaders {
    private static final ByteString QUOTED_STRING_DELIMITERS;
    private static final ByteString TOKEN_DELIMITERS;

    static {
        ByteString.Companion companion = ByteString.Companion;
        QUOTED_STRING_DELIMITERS = companion.encodeUtf8(C0059ao.a(15334));
        TOKEN_DELIMITERS = companion.encodeUtf8(C0059ao.a(15335));
    }

    public static final boolean hasBody(Response response) {
        yl0.e(response, C0059ao.a(15336));
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        yl0.e(headers, C0059ao.a(15337));
        yl0.e(str, C0059ao.a(15338));
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (bo0.j(str, headers.name(i), true)) {
                try {
                    readChallengeHeader(new Buffer().writeUtf8(headers.value(i)), arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log(C0059ao.a(15339), 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        yl0.e(response, C0059ao.a(15340));
        if (yl0.a(response.request().method(), C0059ao.a(15341))) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1) {
            if (!bo0.j(C0059ao.a(15343), Response.header$default(response, C0059ao.a(15342), null, 2, null), true)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x008f, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008f, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void readChallengeHeader(okio.Buffer r7, java.util.List<okhttp3.Challenge> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.exhausted()
            if (r7 != 0) goto L1f
            return
        L1f:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            java.util.Map r0 = defpackage.qj0.d()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            byte r4 = (byte) r4
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L72
            if (r6 != 0) goto L41
            boolean r2 = r7.exhausted()
            if (r2 == 0) goto L72
        L41:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r3 = 15344(0x3bf0, float:2.1502E-41)
            java.lang.String r3 = myunmn.C0059ao.a(r3)
            java.lang.String r3 = defpackage.bo0.o(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r4 = 15345(0x3bf1, float:2.1503E-41)
            java.lang.String r4 = myunmn.C0059ao.a(r4)
            defpackage.yl0.d(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L72:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.skipAll(r7, r4)
            int r5 = r5 + r6
        L7c:
            if (r3 != 0) goto L8d
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 == 0) goto L89
            goto L8f
        L89:
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
        L8d:
            if (r5 != 0) goto L9a
        L8f:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L9a:
            r6 = 1
            if (r5 <= r6) goto L9e
            return
        L9e:
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r6 == 0) goto La5
            return
        La5:
            r6 = 34
            byte r6 = (byte) r6
            boolean r6 = startsWith(r7, r6)
            if (r6 == 0) goto Lb3
            java.lang.String r6 = readQuotedString(r7)
            goto Lb7
        Lb3:
            java.lang.String r6 = readToken(r7)
        Lb7:
            if (r6 == 0) goto Ld1
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lc2
            return
        Lc2:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lcf
            boolean r3 = r7.exhausted()
            if (r3 != 0) goto Lcf
            return
        Lcf:
            r3 = r0
            goto L7c
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(okio.Buffer, java.util.List):void");
    }

    private static final String readQuotedString(Buffer buffer) throws EOFException {
        byte b = (byte) 34;
        if (buffer.readByte() == b) {
            Buffer buffer2 = new Buffer();
            while (true) {
                long indexOfElement = buffer.indexOfElement(QUOTED_STRING_DELIMITERS);
                if (indexOfElement == -1) {
                    return null;
                }
                if (buffer.getByte(indexOfElement) == b) {
                    buffer2.write(buffer, indexOfElement);
                    buffer.readByte();
                    return buffer2.readUtf8();
                } else if (buffer.size() == indexOfElement + 1) {
                    return null;
                } else {
                    buffer2.write(buffer, indexOfElement);
                    buffer.readByte();
                    buffer2.write(buffer, 1L);
                }
            }
        } else {
            throw new IllegalArgumentException(C0059ao.a(15346).toString());
        }
    }

    private static final String readToken(Buffer buffer) {
        long indexOfElement = buffer.indexOfElement(TOKEN_DELIMITERS);
        if (indexOfElement == -1) {
            indexOfElement = buffer.size();
        }
        if (indexOfElement != 0) {
            return buffer.readUtf8(indexOfElement);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        yl0.e(cookieJar, C0059ao.a(15347));
        yl0.e(httpUrl, C0059ao.a(15348));
        yl0.e(headers, C0059ao.a(15349));
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.Companion.parseAll(httpUrl, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, parseAll);
    }

    private static final boolean skipCommasAndWhitespace(Buffer buffer) {
        boolean z = false;
        while (!buffer.exhausted()) {
            byte b = buffer.getByte(0L);
            if (b == 9 || b == 32) {
                buffer.readByte();
            } else if (b != 44) {
                break;
            } else {
                buffer.readByte();
                z = true;
            }
        }
        return z;
    }

    private static final boolean startsWith(Buffer buffer, byte b) {
        return !buffer.exhausted() && buffer.getByte(0L) == b;
    }
}
