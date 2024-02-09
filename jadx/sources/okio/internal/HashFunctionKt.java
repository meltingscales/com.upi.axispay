package okio.internal;

import java.security.MessageDigest;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class HashFunctionKt {
    public static final HashFunction newHashFunction(final String str) {
        yl0.e(str, C0059ao.a(9442));
        return new HashFunction(str) { // from class: okio.internal.HashFunctionKt$newHashFunction$1
            public final /* synthetic */ String $algorithm;
            private final MessageDigest digest;

            {
                this.$algorithm = str;
                this.digest = MessageDigest.getInstance(str);
            }

            @Override // okio.internal.HashFunction
            public byte[] digest() {
                return this.digest.digest();
            }

            @Override // okio.internal.HashFunction
            public void update(byte[] bArr, int i, int i2) {
                yl0.e(bArr, C0059ao.a(1172));
                this.digest.update(bArr, i, i2);
            }
        };
    }
}
