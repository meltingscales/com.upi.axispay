package com.olive.upi.transport.service;

import android.util.Base64;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class RegHelper {
    public final String modulus = C0059ao.a(12990);
    public String pexp = C0059ao.a(12991);

    public String encryptData(String str) {
        byte[] bArr;
        byte[] bytes = str.getBytes();
        try {
            PublicKey pubKey = pubKey();
            Cipher cipher = Cipher.getInstance(C0059ao.a(12992));
            cipher.init(1, pubKey);
            bArr = cipher.doFinal(bytes);
        } catch (Exception e) {
            e.getMessage();
            bArr = null;
        }
        return Base64.encodeToString(bArr, 2);
    }

    public PublicKey pubKey() throws NoSuchAlgorithmException, InvalidKeySpecException {
        return KeyFactory.getInstance(C0059ao.a(12994)).generatePublic(new RSAPublicKeySpec(new BigInteger(C0059ao.a(12993)), new BigInteger(this.pexp)));
    }
}