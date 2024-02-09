package okio;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class HashingSource extends ForwardingSource {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public final HashingSource hmacSha1(Source source, ByteString byteString) {
            yl0.e(source, C0059ao.a(1008));
            yl0.e(byteString, C0059ao.a(1009));
            return new HashingSource(source, byteString, C0059ao.a(1010));
        }

        public final HashingSource hmacSha256(Source source, ByteString byteString) {
            yl0.e(source, C0059ao.a(1011));
            yl0.e(byteString, C0059ao.a(1012));
            return new HashingSource(source, byteString, C0059ao.a(1013));
        }

        public final HashingSource hmacSha512(Source source, ByteString byteString) {
            yl0.e(source, C0059ao.a(1014));
            yl0.e(byteString, C0059ao.a(1015));
            return new HashingSource(source, byteString, C0059ao.a(1016));
        }

        public final HashingSource md5(Source source) {
            yl0.e(source, C0059ao.a(1017));
            return new HashingSource(source, C0059ao.a(1018));
        }

        public final HashingSource sha1(Source source) {
            yl0.e(source, C0059ao.a(1019));
            return new HashingSource(source, C0059ao.a(1020));
        }

        public final HashingSource sha256(Source source) {
            yl0.e(source, C0059ao.a(1021));
            return new HashingSource(source, C0059ao.a(1022));
        }

        public final HashingSource sha512(Source source) {
            yl0.e(source, C0059ao.a(1023));
            return new HashingSource(source, C0059ao.a(1024));
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(Source source, String str) {
        super(source);
        yl0.e(source, C0059ao.a(1873));
        yl0.e(str, C0059ao.a(1874));
        this.messageDigest = MessageDigest.getInstance(str);
        this.mac = null;
    }

    public static final HashingSource hmacSha1(Source source, ByteString byteString) {
        return Companion.hmacSha1(source, byteString);
    }

    public static final HashingSource hmacSha256(Source source, ByteString byteString) {
        return Companion.hmacSha256(source, byteString);
    }

    public static final HashingSource hmacSha512(Source source, ByteString byteString) {
        return Companion.hmacSha512(source, byteString);
    }

    public static final HashingSource md5(Source source) {
        return Companion.md5(source);
    }

    public static final HashingSource sha1(Source source) {
        return Companion.sha1(source);
    }

    public static final HashingSource sha256(Source source) {
        return Companion.sha256(source);
    }

    public static final HashingSource sha512(Source source) {
        return Companion.sha512(source);
    }

    /* renamed from: -deprecated_hash  reason: not valid java name */
    public final ByteString m394deprecated_hash() {
        return hash();
    }

    public final ByteString hash() {
        byte[] doFinal;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            yl0.c(mac);
            doFinal = mac.doFinal();
        }
        yl0.d(doFinal, C0059ao.a(1878));
        return new ByteString(doFinal);
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(Buffer buffer, long j) throws IOException {
        yl0.e(buffer, C0059ao.a(1879));
        long read = super.read(buffer, j);
        if (read != -1) {
            long size = buffer.size() - read;
            long size2 = buffer.size();
            Segment segment = buffer.head;
            yl0.c(segment);
            while (size2 > size) {
                segment = segment.prev;
                yl0.c(segment);
                size2 -= segment.limit - segment.pos;
            }
            while (size2 < buffer.size()) {
                int i = (int) ((segment.pos + size) - size2);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(segment.data, i, segment.limit - i);
                } else {
                    Mac mac = this.mac;
                    yl0.c(mac);
                    mac.update(segment.data, i, segment.limit - i);
                }
                size2 += segment.limit - segment.pos;
                segment = segment.next;
                yl0.c(segment);
                size = size2;
            }
        }
        return read;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(Source source, ByteString byteString, String str) {
        super(source);
        yl0.e(source, C0059ao.a(1875));
        yl0.e(byteString, C0059ao.a(1876));
        yl0.e(str, C0059ao.a(1877));
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            pi0 pi0Var = pi0.a;
            this.mac = mac;
            this.messageDigest = null;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
