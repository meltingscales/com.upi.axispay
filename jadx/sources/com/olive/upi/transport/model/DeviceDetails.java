package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class DeviceDetails implements CheckSum {
    public String app;
    public String capability;
    public String gcmid;
    public String geocode;
    public String id;
    public String ip;
    public String location;
    public String mobile;
    public String os;
    public String type;
    public String version;

    public String getApp() {
        return this.app;
    }

    public String getCapability() {
        return this.capability;
    }

    public String getGcmId() {
        return this.gcmid;
    }

    public String getGeocode() {
        return this.geocode;
    }

    public String getId() {
        return this.id;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.app + this.capability + this.geocode + this.id + this.ip + this.location + this.mobile + this.os + this.type;
    }

    public String getIp() {
        return this.ip;
    }

    public String getLocation() {
        return this.location;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getOs() {
        return this.os;
    }

    public String getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public void setApp(String str) {
        this.app = str;
    }

    public void setCapability(String str) {
        this.capability = str;
    }

    public void setGcmId(String str) {
        this.gcmid = str;
    }

    public void setGeocode(String str) {
        this.geocode = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIp(String str) {
        this.ip = str;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setOs(String str) {
        this.os = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
