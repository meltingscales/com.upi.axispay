package okio;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class HashingSink extends ForwardingSink {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public final HashingSink hmacSha1(Sink sink, ByteString byteString) {
            yl0.e(sink, C0059ao.a(15753));
            yl0.e(byteString, C0059ao.a(15754));
            return new HashingSink(sink, byteString, C0059ao.a(15755));
        }

        public final HashingSink hmacSha256(Sink sink, ByteString byteString) {
            yl0.e(sink, C0059ao.a(15756));
            yl0.e(byteString, C0059ao.a(15757));
            return new HashingSink(sink, byteString, C0059ao.a(15758));
        }

        public final HashingSink hmacSha512(Sink sink, ByteString byteString) {
            yl0.e(sink, C0059ao.a(15759));
            yl0.e(byteString, C0059ao.a(15760));
            return new HashingSink(sink, byteString, C0059ao.a(15761));
        }

        public final HashingSink md5(Sink sink) {
            yl0.e(sink, C0059ao.a(15762));
            return new HashingSink(sink, C0059ao.a(15763));
        }

        public final HashingSink sha1(Sink sink) {
            yl0.e(sink, C0059ao.a(15764));
            return new HashingSink(sink, C0059ao.a(15765));
        }

        public final HashingSink sha256(Sink sink) {
            yl0.e(sink, C0059ao.a(15766));
            return new HashingSink(sink, C0059ao.a(15767));
        }

        public final HashingSink sha512(Sink sink) {
            yl0.e(sink, C0059ao.a(15768));
            return new HashingSink(sink, C0059ao.a(15769));
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(Sink sink, String str) {
        super(sink);
        yl0.e(sink, C0059ao.a(2851));
        yl0.e(str, C0059ao.a(2852));
        this.messageDigest = MessageDigest.getInstance(str);
        this.mac = null;
    }

    public static final HashingSink hmacSha1(Sink sink, ByteString byteString) {
        return Companion.hmacSha1(sink, byteString);
    }

    public static final HashingSink hmacSha256(Sink sink, ByteString byteString) {
        return Companion.hmacSha256(sink, byteString);
    }

    public static final HashingSink hmacSha512(Sink sink, ByteString byteString) {
        return Companion.hmacSha512(sink, byteString);
    }

    public static final HashingSink md5(Sink sink) {
        return Companion.md5(sink);
    }

    public static final HashingSink sha1(Sink sink) {
        return Companion.sha1(sink);
    }

    public static final HashingSink sha256(Sink sink) {
        return Companion.sha256(sink);
    }

    public static final HashingSink sha512(Sink sink) {
        return Companion.sha512(sink);
    }

    /* renamed from: -deprecated_hash  reason: not valid java name */
    public final ByteString m393deprecated_hash() {
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
        yl0.d(doFinal, C0059ao.a(2856));
        return new ByteString(doFinal);
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(Buffer buffer, long j) throws IOException {
        yl0.e(buffer, C0059ao.a(2857));
        Util.checkOffsetAndCount(buffer.size(), 0L, j);
        Segment segment = buffer.head;
        yl0.c(segment);
        long j2 = 0;
        while (j2 < j) {
            int min = (int) Math.min(j - j2, segment.limit - segment.pos);
            MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(segment.data, segment.pos, min);
            } else {
                Mac mac = this.mac;
                yl0.c(mac);
                mac.update(segment.data, segment.pos, min);
            }
            j2 += min;
            segment = segment.next;
            yl0.c(segment);
        }
        super.write(buffer, j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(Sink sink, ByteString byteString, String str) {
        super(sink);
        yl0.e(sink, C0059ao.a(2853));
        yl0.e(byteString, C0059ao.a(2854));
        yl0.e(str, C0059ao.a(2855));
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
