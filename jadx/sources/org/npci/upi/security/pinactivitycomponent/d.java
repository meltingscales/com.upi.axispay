package org.npci.upi.security.pinactivitycomponent;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class d {
    public d() {
        Cipher.getInstance(C0059ao.a(2322));
    }

    public String a(String str, PublicKey publicKey) {
        byte[] bArr;
        byte[] bytes = str.getBytes();
        try {
            Cipher cipher = Cipher.getInstance(C0059ao.a(2323));
            cipher.init(1, publicKey, new OAEPParameterSpec(C0059ao.a(2324), C0059ao.a(2325), MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            bArr = cipher.doFinal(bytes);
        } catch (Exception unused) {
            l.b(C0059ao.a(2326), C0059ao.a(2327));
            bArr = null;
        }
        return Base64.encodeToString(bArr, 2);
    }

    public String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format(C0059ao.a(2328), Integer.valueOf(bArr[i] & 255)));
        }
        return sb.toString();
    }

    public byte[] c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(C0059ao.a(2329));
        messageDigest.update(str.getBytes(C0059ao.a(2330)));
        return messageDigest.digest();
    }

    public byte[] d(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, C0059ao.a(2331));
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
        Cipher cipher = Cipher.getInstance(C0059ao.a(2332));
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr);
    }

    public byte[] e(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    public byte[] f(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, C0059ao.a(2333));
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
        Cipher cipher = Cipher.getInstance(C0059ao.a(2334));
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr);
    }
}
