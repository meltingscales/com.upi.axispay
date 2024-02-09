package org.apache.commons.codec.binary;

import java.io.OutputStream;
import org.apache.commons.codec.CodecPolicy;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Base64OutputStream extends BaseNCodecOutputStream {
    public Base64OutputStream(OutputStream outputStream) {
        this(outputStream, true);
    }

    public Base64OutputStream(OutputStream outputStream, boolean z) {
        super(outputStream, new Base64(false), z);
    }

    public Base64OutputStream(OutputStream outputStream, boolean z, int i, byte[] bArr) {
        super(outputStream, new Base64(i, bArr), z);
    }

    public Base64OutputStream(OutputStream outputStream, boolean z, int i, byte[] bArr, CodecPolicy codecPolicy) {
        super(outputStream, new Base64(i, bArr, false, codecPolicy), z);
    }
}
