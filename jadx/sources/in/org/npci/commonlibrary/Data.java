package in.org.npci.commonlibrary;

import java.io.Serializable;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Data implements Serializable {
    private static final long serialVersionUID = 0;
    private String code;
    private String encryptedBase64String;
    private String hmac;
    private String ki;
    private String pid;
    private String skey;
    private String type;

    static {
        C0059ao.a(Data.class, 291);
    }

    public Data(String str, String str2, String str3) {
        this.ki = str;
        this.code = str2;
        this.encryptedBase64String = str3;
    }

    public String a() {
        return this.encryptedBase64String;
    }

    public void b(String str) {
        this.encryptedBase64String = str;
    }
}
