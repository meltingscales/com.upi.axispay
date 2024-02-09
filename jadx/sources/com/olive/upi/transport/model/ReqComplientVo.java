package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ReqComplientVo {
    public String initiationMode;
    public String orgTxnId;
    public String reqAdjCode;
    public String reqAdjFlag;
    public String subType;
    public String type;

    public String getInitiationMode() {
        return this.initiationMode;
    }

    public String getOrgTxnId() {
        return this.orgTxnId;
    }

    public String getReqAdjCode() {
        return this.reqAdjCode;
    }

    public String getReqAdjFlag() {
        return this.reqAdjFlag;
    }

    public String getSubType() {
        return this.subType;
    }

    public String getType() {
        return this.type;
    }

    public void setInitiationMode(String str) {
        this.initiationMode = str;
    }

    public void setOrgTxnId(String str) {
        this.orgTxnId = str;
    }

    public void setReqAdjCode(String str) {
        this.reqAdjCode = str;
    }

    public void setReqAdjFlag(String str) {
        this.reqAdjFlag = str;
    }

    public void setSubType(String str) {
        this.subType = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
