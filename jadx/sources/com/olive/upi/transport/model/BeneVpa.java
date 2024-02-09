package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BeneVpa implements CheckSum {
    public static String FAVORITE;
    public static String UNFAVORITE;
    public String createdate;
    public String favorite;
    public boolean isBlocked;
    public String name;
    public String nickname;
    public String vpa;

    static {
        C0059ao.a(BeneVpa.class, 354);
    }

    public String filterString() {
        String str = this.vpa;
        int indexOf = str.indexOf(C0059ao.a(5739));
        if (indexOf != -1) {
            str = this.vpa.substring(0, indexOf);
        }
        return (str + this.name + this.nickname).toLowerCase();
    }

    public String getCreatedate() {
        return this.createdate;
    }

    public String getFavorite() {
        return this.favorite;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.vpa + this.name + this.nickname + this.favorite + this.createdate;
    }

    public String getName() {
        return this.name;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getVpa() {
        return this.vpa;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public void setBlocked(boolean z) {
        this.isBlocked = z;
    }

    public void setFavorite(String str) {
        this.favorite = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setVpa(String str) {
        this.vpa = str;
    }

    public String toString() {
        return this.vpa + this.name + this.nickname + this.favorite + this.createdate;
    }
}
