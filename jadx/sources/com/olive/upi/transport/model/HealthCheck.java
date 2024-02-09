package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class HealthCheck {
    public String aggregators;
    public String keyword_msg;
    public String service_provider_num;
    public String upgradetype;
    public String version;

    public String getAggregators() {
        return this.aggregators;
    }

    public String getKeyword_msg() {
        return this.keyword_msg;
    }

    public String getService_provider_num() {
        return this.service_provider_num;
    }

    public String getUpgradetype() {
        return this.upgradetype;
    }

    public String getVersion() {
        return this.version;
    }

    public void setAggregators(String str) {
        this.aggregators = str;
    }

    public void setKeyword_msg(String str) {
        this.keyword_msg = str;
    }

    public void setService_provider_num(String str) {
        this.service_provider_num = str;
    }

    public void setUpgradetype(String str) {
        this.upgradetype = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
