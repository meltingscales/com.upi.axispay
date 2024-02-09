package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class RegisterBiller {
    public String BILLER_CODE;
    public String CHNL_ID;
    public String CIF;
    public String CLIENT_CODE;
    public String CONSUMER_NO;
    public String CORP_CODE;
    public String CUST_CIF;
    public String EMAIL;
    public String INITIATING_CHANNEL;
    public String IP;
    public String LEVEL1;
    public String LEVEL10;
    public String LEVEL11;
    public String LEVEL12;
    public String LEVEL2;
    public String LEVEL3;
    public String LEVEL4;
    public String LEVEL5;
    public String LEVEL6;
    public String LEVEL7;
    public String LEVEL8;
    public String LEVEL9;
    public String LVL_CODE_ACTL;
    public String MASTR_TYPE;
    public String STATUS;
    public String MOB_NUM = C0059ao.a(8471);
    public String IMEI = C0059ao.a(8472);

    public String getCHNL_ID() {
        return this.CHNL_ID;
    }

    public String getCONSUMER_NO() {
        return this.CONSUMER_NO;
    }

    public String getCUST_CIF() {
        return this.CUST_CIF;
    }

    public String getINITIATING_CHANNEL() {
        return this.INITIATING_CHANNEL;
    }

    public String getSTATUS() {
        return this.STATUS;
    }

    public void setBILLER_CODE(String str) {
        this.BILLER_CODE = str;
    }

    public void setCHNL_ID(String str) {
        this.CHNL_ID = str;
    }

    public void setCIF_ID(String str) {
        this.CIF = str;
    }

    public void setCLIENT_CODE(String str) {
        this.CLIENT_CODE = str;
    }

    public void setCONSUMER_NO(String str) {
        this.CONSUMER_NO = str;
    }

    public void setCUST_CIF(String str) {
        this.CUST_CIF = str;
    }

    public void setEMAIL(String str) {
        this.EMAIL = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void setField(String str, String str2) {
        char c;
        String lowerCase = str.toLowerCase();
        int hashCode = lowerCase.hashCode();
        if (hashCode == -1272450718) {
            if (lowerCase.equals(C0059ao.a(8486))) {
                c = '\b';
            }
            c = 65535;
        } else if (hashCode != -174188063) {
            switch (hashCode) {
                case -1106127571:
                    if (lowerCase.equals(C0059ao.a(8484))) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1106127570:
                    if (lowerCase.equals(C0059ao.a(8483))) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1106127569:
                    if (lowerCase.equals(C0059ao.a(8482))) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1106127568:
                    if (lowerCase.equals(C0059ao.a(8481))) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1106127567:
                    if (lowerCase.equals(C0059ao.a(8480))) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1106127566:
                    if (lowerCase.equals(C0059ao.a(8479))) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1106127565:
                    if (lowerCase.equals(C0059ao.a(8478))) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1106127564:
                    if (lowerCase.equals(C0059ao.a(8477))) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1106127563:
                    if (lowerCase.equals(C0059ao.a(8476))) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    switch (hashCode) {
                        case 69783715:
                            if (lowerCase.equals(C0059ao.a(8475))) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 69783716:
                            if (lowerCase.equals(C0059ao.a(8474))) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 69783717:
                            if (lowerCase.equals(C0059ao.a(8473))) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
            }
        } else {
            if (lowerCase.equals(C0059ao.a(8485))) {
                c = 3;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                this.LEVEL1 = str2;
                return;
            case 1:
                this.LEVEL2 = str2;
                break;
            case 2:
                break;
            case 3:
                this.CLIENT_CODE = str2;
                return;
            case 4:
                this.LEVEL4 = str2;
                return;
            case 5:
                this.LEVEL5 = str2;
                return;
            case 6:
                this.LEVEL6 = str2;
                return;
            case 7:
                this.LEVEL7 = str2;
                return;
            default:
                return;
        }
        this.LEVEL3 = str2;
    }

    public void setIMEI(String str) {
        this.IMEI = str;
    }

    public void setINITIATING_CHANNEL(String str) {
        this.INITIATING_CHANNEL = str;
    }

    public void setIP(String str) {
        this.IP = str;
    }

    public void setLVL_CODE_ACTL(String str) {
        this.LVL_CODE_ACTL = str;
    }

    public void setMASTR_TYPE(String str) {
        this.MASTR_TYPE = str;
    }

    public void setMOB_NUM(String str) {
        this.MOB_NUM = str;
    }

    public void setSTATUS(String str) {
        this.STATUS = str;
    }
}
