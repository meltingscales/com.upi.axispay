package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Data implements CheckSum {
    public String code;
    public String encryptedBase64String;
    public String hmac;
    public String ki;
    public String pid;
    public String skey;
    public String type;

    public String getCode() {
        return this.code;
    }

    public String getEncryptedBase64String() {
        return this.encryptedBase64String;
    }

    public String getHmac() {
        return this.hmac;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.code + this.encryptedBase64String + this.hmac + this.ki + this.pid + this.skey + this.type;
    }

    public String getKi() {
        return this.ki;
    }

    public String getPid() {
        return this.pid;
    }

    public String getSkey() {
        return this.skey;
    }

    public String getType() {
        return this.type;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setEncryptedBase64String(String str) {
        this.encryptedBase64String = str;
    }

    public void setHmac(String str) {
        this.hmac = str;
    }

    public void setKi(String str) {
        this.ki = str;
    }

    public void setPid(String str) {
        this.pid = str;
    }

    public void setSkey(String str) {
        this.skey = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return this.code + this.encryptedBase64String + this.hmac + this.ki + this.pid + this.skey + this.type;
    }
}
