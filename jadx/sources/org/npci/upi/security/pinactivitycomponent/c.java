package org.npci.upi.security.pinactivitycomponent;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.vision.barcode.Barcode;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class c {
    public String a = C0059ao.a(1888);
    public e b;
    public d c;

    public c(Context context) {
        this.b = null;
        try {
            this.b = new e(context);
            this.c = new d();
        } catch (Exception e) {
            throw e;
        }
    }

    public String a() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(C0059ao.a(1889));
            keyGenerator.init(Barcode.QR_CODE);
            return this.c.b(keyGenerator.generateKey().getEncoded());
        } catch (Exception unused) {
            l.b(C0059ao.a(1890), C0059ao.a(1891));
            return null;
        }
    }

    public String b(String str, String str2) {
        String str3;
        String a = C0059ao.a(1892);
        String a2 = C0059ao.a(1893);
        String format = new SimpleDateFormat(C0059ao.a(1894)).format((Date) new java.sql.Date(System.currentTimeMillis()));
        try {
            this.a = d();
            str3 = a();
        } catch (Exception unused) {
            l.b(a, C0059ao.a(1895));
            str3 = a2;
        }
        try {
            d dVar = new d();
            boolean equalsIgnoreCase = str.equalsIgnoreCase(C0059ao.a(1896));
            String a3 = C0059ao.a(1897);
            String a4 = C0059ao.a(1898);
            String a5 = C0059ao.a(1899);
            if (equalsIgnoreCase) {
                this.b.w();
                if (this.b.j().size() > 0) {
                    this.b.m(new s(str3, this.a, format));
                } else {
                    this.b.k(new s(str3, this.a, format));
                }
                a2 = dVar.a(this.a + a5 + str3 + a5 + str2, in.org.npci.commonlibrary.i.a());
                l.c(a4, str3);
                l.c(a3, this.a);
            } else {
                String a6 = this.b.j().get(0).a();
                l.c(a4, str3);
                l.c(a3, this.a);
                a2 = Base64.encodeToString(dVar.d((this.a + a5 + str3 + a5 + str2).getBytes(), dVar.e(a6)), 2);
                this.b.w();
                this.b.k(new s(str3, this.a, format));
            }
        } catch (Exception unused2) {
            l.b(a, C0059ao.a(1900));
        }
        return C0059ao.a(1901) + a2;
    }

    public boolean c(String str, String str2, String str3, String str4) {
        l.c(C0059ao.a(1902), str4);
        return e(str4, str, str2, str3);
    }

    public String d() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(C0059ao.a(1903));
            keyGenerator.init(Barcode.QR_CODE);
            return this.c.b(keyGenerator.generateKey().getEncoded());
        } catch (Exception unused) {
            l.b(C0059ao.a(1904), C0059ao.a(1905));
            return null;
        }
    }

    public final boolean e(String str, String str2, String str3, String str4) {
        StringBuilder sb;
        String localizedMessage;
        String a = C0059ao.a(1906);
        String a2 = C0059ao.a(1907);
        String a3 = C0059ao.a(1908);
        try {
            String r = this.b.r();
            l.c(C0059ao.a(1909), r);
            String encodeToString = Base64.encodeToString(this.c.f(Base64.decode(str, 0), this.c.e(r)), 0);
            String str5 = str2 + a + str3 + a + str4;
            l.c(C0059ao.a(1910), str5);
            String encodeToString2 = Base64.encodeToString(this.c.c(str5), 0);
            l.c(C0059ao.a(1911), encodeToString2);
            return encodeToString2.equalsIgnoreCase(encodeToString);
        } catch (UnsupportedEncodingException e) {
            sb = new StringBuilder();
            sb.append(a2);
            localizedMessage = e.getLocalizedMessage();
            sb.append(localizedMessage);
            l.b(a3, sb.toString());
            return false;
        } catch (InvalidAlgorithmParameterException e2) {
            sb = new StringBuilder();
            sb.append(a2);
            localizedMessage = e2.getLocalizedMessage();
            sb.append(localizedMessage);
            l.b(a3, sb.toString());
            return false;
        } catch (InvalidKeyException e3) {
            sb = new StringBuilder();
            sb.append(a2);
            localizedMessage = e3.getLocalizedMessage();
            sb.append(localizedMessage);
            l.b(a3, sb.toString());
            return false;
        } catch (NoSuchAlgorithmException e4) {
            sb = new StringBuilder();
            sb.append(a2);
            localizedMessage = e4.getLocalizedMessage();
            sb.append(localizedMessage);
            l.b(a3, sb.toString());
            return false;
        } catch (BadPaddingException e5) {
            sb = new StringBuilder();
            sb.append(a2);
            localizedMessage = e5.getLocalizedMessage();
            sb.append(localizedMessage);
            l.b(a3, sb.toString());
            return false;
        } catch (IllegalBlockSizeException e6) {
            sb = new StringBuilder();
            sb.append(a2);
            localizedMessage = e6.getLocalizedMessage();
            sb.append(localizedMessage);
            l.b(a3, sb.toString());
            return false;
        } catch (Exception e7) {
            sb = new StringBuilder();
            sb.append(a2);
            localizedMessage = e7.getLocalizedMessage();
            sb.append(localizedMessage);
            l.b(a3, sb.toString());
            return false;
        }
    }
}
