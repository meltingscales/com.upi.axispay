package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Recharge implements Comparable<Recharge> {
    private String denomination;
    private String processingfees;
    private String remarks;
    private String servicetax;
    private String talktime;
    private String validfrom;
    private String validity;
    private String validto;

    public String getDenomination() {
        return this.denomination;
    }

    public String getProcessingfees() {
        return this.processingfees;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getServicetax() {
        return this.servicetax;
    }

    public String getTalktime() {
        return this.talktime;
    }

    public String getValidfrom() {
        return this.validfrom;
    }

    public String getValidity() {
        return this.validity;
    }

    public String getValidto() {
        return this.validto;
    }

    public void setDenomination(String str) {
        this.denomination = str;
    }

    public void setProcessingfees(String str) {
        this.processingfees = str;
    }

    public void setRemarks(String str) {
        this.remarks = str;
    }

    public void setServicetax(String str) {
        this.servicetax = str;
    }

    public void setTalktime(String str) {
        this.talktime = str;
    }

    public void setValidfrom(String str) {
        this.validfrom = str;
    }

    public void setValidity(String str) {
        this.validity = str;
    }

    public void setValidto(String str) {
        this.validto = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(Recharge recharge) {
        try {
            return Double.compare(Double.valueOf(Double.parseDouble(this.denomination)).doubleValue(), Double.valueOf(Double.parseDouble(recharge.denomination)).doubleValue());
        } catch (Exception unused) {
            return 0;
        }
    }
}
