package com.olive.upi.transport.service;

import android.util.Base64;
import com.google.android.gms.vision.barcode.Barcode;
import java.security.MessageDigest;
import java.security.PrivateKey;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import myunmn.C0059ao;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CryptLibOne {
    public static final char[] hexArray;

    static {
        C0095z.a();
        char[] cArr = {(char) (cArr[5] ^ 5), (char) ((-46) ^ (-29)), (char) (cArr[8] ^ '\n'), (char) (cArr[4] ^ 7), (char) (cArr[0] ^ 4), (char) (cArr[1] ^ 4), (char) (cArr[1] ^ 7), (char) (cArr[5] ^ 2), (char) (cArr[7] ^ 15), (char) (cArr[15] ^ 127), (char) (cArr[7] ^ 'v'), (char) (cArr[8] ^ 'z'), (char) (cArr[5] ^ 'v'), (char) (cArr[0] ^ 't'), (char) (cArr[13] ^ 1), (char) (cArr[7] ^ 'q')};
        hexArray = new String(cArr).intern().toCharArray();
    }

    public static String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = hexArray;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static String createAesKey() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(C0059ao.a(2029));
            keyGenerator.init(Barcode.QR_CODE);
            return bytesToHex(keyGenerator.generateKey().getEncoded());
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public byte[] SHA256(String str) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance(C0059ao.a(2030));
        messageDigest.update(str.getBytes(C0059ao.a(2031)));
        return messageDigest.digest();
    }

    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws Exception {
        char[] cArr = {(char) (cArr[1] ^ 4), (char) (cArr[2] ^ 22), (char) ((-27217) ^ (-27140))};
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, new String(cArr).intern());
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
        char[] cArr2 = {(char) (cArr2[3] ^ 'n'), (char) (cArr2[15] ^ '!'), (char) (cArr2[17] ^ ':'), (char) (cArr2[19] ^ 'H'), (char) (cArr2[9] ^ '\b'), (char) (cArr2[18] ^ ','), (char) (cArr2[5] ^ 1), (char) (cArr2[19] ^ 'H'), (char) (cArr2[17] ^ '9'), (char) (cArr2[17] ^ '\"'), (char) (cArr2[17] ^ '*'), (char) ((-24528) ^ (-24477)), (char) (cArr2[17] ^ '\\'), (char) (cArr2[17] ^ '9'), (char) (cArr2[17] ^ '\b'), (char) (cArr2[12] ^ 'Q'), (char) (cArr2[17] ^ '\r'), (char) (cArr2[11] ^ ':'), (char) (cArr2[11] ^ '='), (char) (cArr2[18] ^ '\t')};
        Cipher cipher = Cipher.getInstance(new String(cArr2).intern());
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr);
    }

    public String decryptData(String str, PrivateKey privateKey) {
        try {
            byte[] decode = Base64.decode(str, 0);
            Cipher cipher = Cipher.getInstance(C0059ao.a(2032));
            cipher.init(2, privateKey);
            return new String(cipher.doFinal(decode));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, C0059ao.a(2033));
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
        Cipher cipher = Cipher.getInstance(C0059ao.a(2034));
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr);
    }

    public byte[] hexStringToByteArray(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }
}
