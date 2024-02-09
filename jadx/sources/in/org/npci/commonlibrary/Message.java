package in.org.npci.commonlibrary;

import java.io.Serializable;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Message implements Serializable {
    private static final long serialVersionUID = 0;
    private Data data;
    private String subType;
    private String type;

    static {
        C0059ao.a(Message.class, 364);
    }

    public Message(String str, String str2, Data data) {
        this.type = str;
        this.subType = str2;
        this.data = data;
    }

    public Data a() {
        return this.data;
    }

    public void b(String str) {
        this.subType = str;
    }

    public void c(String str) {
        this.type = str;
    }
}
