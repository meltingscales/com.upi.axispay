package in.org.npci.commonlibrary;

import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class f {
    public f() {
        Cipher.getInstance(C0059ao.a(6223));
    }

    public byte[] a(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(C0059ao.a(6224));
        messageDigest.update(str.getBytes(C0059ao.a(6225)));
        return messageDigest.digest();
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, C0059ao.a(6226));
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
        Cipher cipher = Cipher.getInstance(C0059ao.a(6227));
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr);
    }

    public byte[] c(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    public byte[] d(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, C0059ao.a(6228));
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
        Cipher cipher = Cipher.getInstance(C0059ao.a(6229));
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr);
    }
}
