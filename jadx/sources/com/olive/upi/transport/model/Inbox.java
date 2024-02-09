package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Inbox {
    public String createdDate;
    public String expiryDate;
    public long id;
    public String isDelete;
    public String isRead;
    public String jdata;
    public String longdiscription;
    public String mobile;
    public int selectPosition;
    public String shortdiscription;
    public String title;

    public Inbox() {
        String a = C0059ao.a(13048);
        this.isRead = a;
        this.isDelete = a;
        this.selectPosition = 0;
    }

    public String getCreatedDate() {
        return this.createdDate;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public long getId() {
        return this.id;
    }

    public String getIsDelete() {
        return this.isDelete;
    }

    public String getIsRead() {
        return this.isRead;
    }

    public String getJdata() {
        return this.jdata;
    }

    public String getLongdiscription() {
        return this.longdiscription;
    }

    public String getMobile() {
        return this.mobile;
    }

    public int getSelectPosition() {
        return this.selectPosition;
    }

    public String getShortdiscription() {
        return this.shortdiscription;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCreatedDate(String str) {
        this.createdDate = str;
    }

    public void setExpiryDate(String str) {
        this.expiryDate = str;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIsDelete(String str) {
        this.isDelete = str;
    }

    public void setIsRead(String str) {
        this.isRead = str;
    }

    public void setJdata(String str) {
        this.jdata = str;
    }

    public void setLongdiscription(String str) {
        this.longdiscription = str;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setSelectPosition(int i) {
        this.selectPosition = i;
    }

    public void setShortdiscription(String str) {
        this.shortdiscription = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
