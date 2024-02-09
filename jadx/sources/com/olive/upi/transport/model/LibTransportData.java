package com.olive.upi.transport.model;

import com.olive.upi.transport.model.lib.Configuration;
import com.olive.upi.transport.model.lib.NameValuePair;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class LibTransportData {
    public String commonLibToken;
    public Configuration configuration;
    public CredAllowedWrapper credAllowedWrapper;
    public DeviceDetails deviceDetails;
    public String language;
    public String maskedAccNo;
    public String mobileNumber;
    public int mode;
    public List<NameValuePair> payInfo;
    public String trustStr;
    public String txnId;
    public String xmlPayLoadString;

    public String getCommonLibToken() {
        return this.commonLibToken;
    }

    public Configuration getConfiguration() {
        return this.configuration;
    }

    public CredAllowedWrapper getCredAllowedWrapper() {
        return this.credAllowedWrapper;
    }

    public DeviceDetails getDeviceDetails() {
        return this.deviceDetails;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getMaskedAccNo() {
        return this.maskedAccNo;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public int getMode() {
        return this.mode;
    }

    public List<NameValuePair> getPayInfo() {
        return this.payInfo;
    }

    public String getTrustStr() {
        return this.trustStr;
    }

    public String getTxnId() {
        return this.txnId;
    }

    public String getXmlPayLoadString() {
        return this.xmlPayLoadString;
    }

    public void setCommonLibToken(String str) {
        this.commonLibToken = str;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public void setCredAllowed(CredAllowedWrapper credAllowedWrapper) {
        this.credAllowedWrapper = credAllowedWrapper;
    }

    public void setDeviceDetails(DeviceDetails deviceDetails) {
        this.deviceDetails = deviceDetails;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setMaskedAccNo(String str) {
        this.maskedAccNo = str;
    }

    public void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setPayInfo(List<NameValuePair> list) {
        this.payInfo = list;
    }

    public void setTrustStr(String str) {
        this.trustStr = str;
    }

    public void setTxnId(String str) {
        this.txnId = str;
    }

    public void setXmlPayLoadString(String str) {
        this.xmlPayLoadString = str;
    }
}
