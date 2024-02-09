package com.google.firebase.iid;

import com.google.android.gms.vision.barcode.Barcode;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zza {
    public static KeyPair zzc() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(Barcode.PDF417);
            return keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
