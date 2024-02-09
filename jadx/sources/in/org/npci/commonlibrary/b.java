package in.org.npci.commonlibrary;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import myunmn.C0059ao;
import org.apache.xml.security.Init;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class b {
    public static List<g> e;
    public f a;
    public h b;
    public in.org.npci.commonlibrary.a.b c;
    public String d = C0059ao.a(5832);

    public b(String str) {
        Init.b();
        try {
            in.org.npci.commonlibrary.a.b bVar = new in.org.npci.commonlibrary.a.b();
            this.c = bVar;
            if (!bVar.a(str)) {
                System.out.println(C0059ao.a(5834));
                throw new c(d.KEYS_NOT_VALID);
            }
            System.out.println(C0059ao.a(5833));
            h hVar = new h(str);
            this.b = hVar;
            e = hVar.a();
            try {
                this.a = new f();
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
                e2.printStackTrace();
                throw new c(d.UNKNOWN_ERROR);
            }
        } catch (c e3) {
            e3.printStackTrace();
            throw e3;
        } catch (Exception e4) {
            e4.printStackTrace();
            throw new c(d.UNKNOWN_ERROR);
        }
    }

    public Message a(String str, String str2, String str3, String str4, String str5) {
        if (str == null || !str.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (g gVar : e) {
                if (gVar.c().equals(str)) {
                    arrayList.add(gVar);
                }
            }
            if (arrayList.size() != 0) {
                g gVar2 = (g) arrayList.get(new Random().nextInt(arrayList.size()));
                this.d = gVar2.e();
                Data data = new Data(gVar2.a(), gVar2.c(), a.d(d(b(str2, str3, str4, str5)), 2));
                String a = C0059ao.a(5835);
                return new Message(a, a, data);
            }
            throw new c(d.KEY_CODE_INVALID);
        }
        throw new c(d.KEY_CODE_EMPTY);
    }

    public final String b(String str, String str2, String str3, String str4) {
        String a = C0059ao.a(5836);
        StringBuilder sb = new StringBuilder((int) FirebaseCrashlytics.APP_EXCEPTION_CALLBACK_TIMEOUT_MS);
        try {
            f fVar = this.a;
            String d = a.d(fVar.b(fVar.a(str3), this.a.c(str4)), 2);
            sb.append(str2);
            sb.append(a);
            sb.append(str);
            sb.append(a);
            sb.append(d);
            return sb.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            throw new c(d.UNKNOWN_ERROR);
        }
    }

    public void c(String str, String str2, String str3) {
        try {
            f fVar = new f();
            String d = a.d(fVar.a(str2), 2);
            String d2 = a.d(fVar.d(a.a(str, 2), fVar.c(str3)), 2);
            if (d2 != null && !d2.equalsIgnoreCase(d)) {
                throw new c(d.TRUST_NOT_VALID);
            }
        } catch (UnsupportedEncodingException e2) {
            e = e2;
            e.printStackTrace();
            throw new c(d.UNKNOWN_ERROR);
        } catch (InvalidAlgorithmParameterException e3) {
            e = e3;
            e.printStackTrace();
            throw new c(d.UNKNOWN_ERROR);
        } catch (InvalidKeyException e4) {
            e = e4;
            e.printStackTrace();
            throw new c(d.UNKNOWN_ERROR);
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            e.printStackTrace();
            throw new c(d.UNKNOWN_ERROR);
        } catch (BadPaddingException e6) {
            e = e6;
            e.printStackTrace();
            throw new c(d.UNKNOWN_ERROR);
        } catch (IllegalBlockSizeException e7) {
            e = e7;
            e.printStackTrace();
            throw new c(d.UNKNOWN_ERROR);
        } catch (NoSuchPaddingException e8) {
            e = e8;
            e.printStackTrace();
            throw new c(d.UNKNOWN_ERROR);
        } catch (Exception e9) {
            e9.printStackTrace();
            throw new c(d.UNKNOWN_ERROR);
        }
    }

    public final byte[] d(String str) {
        byte[] bytes = str.getBytes();
        try {
            PublicKey e2 = e(this.d);
            Cipher cipher = Cipher.getInstance(C0059ao.a(5837));
            cipher.init(1, e2, new OAEPParameterSpec(C0059ao.a(5838), C0059ao.a(5839), MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            return cipher.doFinal(bytes);
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public final PublicKey e(String str) {
        return KeyFactory.getInstance(C0059ao.a(5841)).generatePublic(new X509EncodedKeySpec(a.b(str.getBytes(C0059ao.a(5840)), 2)));
    }
}
