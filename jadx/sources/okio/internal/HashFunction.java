package okio.internal;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public interface HashFunction {
    byte[] digest();

    void update(byte[] bArr, int i, int i2);
}
