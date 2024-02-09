package okhttp3.internal.http2;

import myunmn.C0059ao;
import okio.ByteString;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Header {
    public static final Companion Companion;
    public static final ByteString PSEUDO_PREFIX;
    public static final ByteString RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = null;
    public static final ByteString TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = null;
    public static final ByteString TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = null;
    public static final ByteString TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = null;
    public static final ByteString TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = null;
    public final int hpackSize;
    public final ByteString name;
    public final ByteString value;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    static {
        C0059ao.a(Header.class, 213);
        Companion = new Companion(null);
        ByteString.Companion companion = ByteString.Companion;
        PSEUDO_PREFIX = companion.encodeUtf8(C0059ao.a(14137));
        RESPONSE_STATUS = companion.encodeUtf8(C0059ao.a(14138));
        TARGET_METHOD = companion.encodeUtf8(C0059ao.a(14139));
        TARGET_PATH = companion.encodeUtf8(C0059ao.a(14140));
        TARGET_SCHEME = companion.encodeUtf8(C0059ao.a(14141));
        TARGET_AUTHORITY = companion.encodeUtf8(C0059ao.a(14142));
    }

    public Header(ByteString byteString, ByteString byteString2) {
        yl0.e(byteString, C0059ao.a(14147));
        yl0.e(byteString2, C0059ao.a(14148));
        this.name = byteString;
        this.value = byteString2;
        this.hpackSize = byteString.size() + 32 + byteString2.size();
    }

    public static /* synthetic */ Header copy$default(Header header, ByteString byteString, ByteString byteString2, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = header.name;
        }
        if ((i & 2) != 0) {
            byteString2 = header.value;
        }
        return header.copy(byteString, byteString2);
    }

    public final ByteString component1() {
        return this.name;
    }

    public final ByteString component2() {
        return this.value;
    }

    public final Header copy(ByteString byteString, ByteString byteString2) {
        yl0.e(byteString, C0059ao.a(14149));
        yl0.e(byteString2, C0059ao.a(14150));
        return new Header(byteString, byteString2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Header) {
                Header header = (Header) obj;
                return yl0.a(this.name, header.name) && yl0.a(this.value, header.value);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ByteString byteString = this.name;
        int hashCode = (byteString != null ? byteString.hashCode() : 0) * 31;
        ByteString byteString2 = this.value;
        return hashCode + (byteString2 != null ? byteString2.hashCode() : 0);
    }

    public String toString() {
        return this.name.utf8() + C0059ao.a(14151) + this.value.utf8();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Header(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            r0 = 14143(0x373f, float:1.9819E-41)
            java.lang.String r0 = myunmn.C0059ao.a(r0)
            defpackage.yl0.e(r2, r0)
            r0 = 14144(0x3740, float:1.982E-41)
            java.lang.String r0 = myunmn.C0059ao.a(r0)
            defpackage.yl0.e(r3, r0)
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r2 = r0.encodeUtf8(r2)
            okio.ByteString r3 = r0.encodeUtf8(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Header.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(ByteString byteString, String str) {
        this(byteString, ByteString.Companion.encodeUtf8(str));
        yl0.e(byteString, C0059ao.a(14145));
        yl0.e(str, C0059ao.a(14146));
    }
}
