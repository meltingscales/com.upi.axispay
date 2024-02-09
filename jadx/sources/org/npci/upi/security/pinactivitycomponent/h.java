package org.npci.upi.security.pinactivitycomponent;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.android.gms.vision.barcode.Barcode;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class h {
    public static ByteArrayOutputStream a(ByteArrayOutputStream byteArrayOutputStream, InputStream inputStream) {
        byte[] bArr = new byte[Barcode.AZTEC];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                byteArrayOutputStream.close();
                inputStream.close();
                return byteArrayOutputStream;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static byte[] b(String str, Context context) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            AssetManager assets = context.getAssets();
            a(byteArrayOutputStream, assets.open(C0059ao.a(2112) + str));
            return byteArrayOutputStream.toByteArray();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }
}
