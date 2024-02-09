package com.olive.upi.transport;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class OliveUpiException extends Exception {
    public String errorCode;

    public OliveUpiException(String str) {
        super(getExceptionMessage(str));
        this.errorCode = str;
    }

    public static String getExceptionMessage(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 66534:
                if (str.equals(C0059ao.a(10824))) {
                    c = 0;
                    break;
                }
                break;
            case 82871:
                if (str.equals(C0059ao.a(10823))) {
                    c = 1;
                    break;
                }
                break;
            case 83218:
                if (str.equals(C0059ao.a(10822))) {
                    c = 2;
                    break;
                }
                break;
            case 2071674:
                if (str.equals(C0059ao.a(10821))) {
                    c = 3;
                    break;
                }
                break;
            case 2093624:
                if (str.equals(C0059ao.a(10820))) {
                    c = 4;
                    break;
                }
                break;
            case 2321387:
                if (str.equals(C0059ao.a(10819))) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return C0059ao.a(10831);
            case 1:
                return C0059ao.a(10830);
            case 2:
                return C0059ao.a(10829);
            case 3:
                return C0059ao.a(10828);
            case 4:
                return C0059ao.a(10827);
            case 5:
                return C0059ao.a(10826);
            default:
                return C0059ao.a(10825);
        }
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }
}
