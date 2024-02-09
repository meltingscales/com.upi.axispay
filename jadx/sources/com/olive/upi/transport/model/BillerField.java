package com.olive.upi.transport.model;

import java.util.Hashtable;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BillerField {
    public static final int AUTO_PAY_NOT_SET = 0;
    public static final int AUTO_PAY_SET = 0;
    public static final int FIELD_CONSTANT = 0;
    public static final int FIELD_FORMART_ALPHA = 0;
    public static final int FIELD_FORMART_ALPHA_NUMERIC = 0;
    public static final int FIELD_FORMART_NUMERIC = 0;
    public static final int FIELD_LEN_FIXED = 0;
    public static final int FIELD_LEN_VARIABLE = 0;
    public static final int FIELD_MANDATORY = 0;
    public static final int FIELD_NOT_CONSTANT = 0;
    public static final int FIELD_NOT_MANDATORY = 0;
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_OPERATOR = 0;
    public static final int TYPE_PROMOCODE = 0;
    public String CORP_CODE;
    public String FIELD_DESC;
    public String FIELD_IDNTFR;
    public int FLD_FORMAT;
    public int IS_CONSTNT;
    public int LEN;
    public int LEN_VLDTN_TYP;
    public int OPT_MAND;
    public int fieldType;

    static {
        C0059ao.a(BillerField.class, 258);
    }

    public static Hashtable<String, String> getFieldMapping() {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put(C0059ao.a(8384), C0059ao.a(8385));
        hashtable.put(C0059ao.a(8386), C0059ao.a(8387));
        hashtable.put(C0059ao.a(8388), C0059ao.a(8389));
        hashtable.put(C0059ao.a(8390), C0059ao.a(8391));
        hashtable.put(C0059ao.a(8392), C0059ao.a(8393));
        hashtable.put(C0059ao.a(8394), C0059ao.a(8395));
        hashtable.put(C0059ao.a(8396), C0059ao.a(8397));
        hashtable.put(C0059ao.a(8398), C0059ao.a(8399));
        hashtable.put(C0059ao.a(8400), C0059ao.a(8401));
        hashtable.put(C0059ao.a(8402), C0059ao.a(8403));
        hashtable.put(C0059ao.a(8404), C0059ao.a(8405));
        hashtable.put(C0059ao.a(8406), C0059ao.a(8407));
        hashtable.put(C0059ao.a(8408), C0059ao.a(8409));
        hashtable.put(C0059ao.a(8410), C0059ao.a(8411));
        return hashtable;
    }

    public String getFIELD_DESC() {
        return this.FIELD_DESC;
    }

    public int getFieldFormat() {
        return this.FLD_FORMAT;
    }

    public String getFieldIdentifier() {
        return this.FIELD_IDNTFR;
    }

    public int getFieldType() {
        return this.fieldType;
    }

    public int getLEN() {
        return this.LEN;
    }

    public boolean isConstant() {
        return this.IS_CONSTNT == 1;
    }

    public boolean isFieldLengthFixed() {
        return this.LEN_VLDTN_TYP == 1;
    }

    public boolean isMandatory() {
        return this.OPT_MAND == 1;
    }

    public void setFieldType(int i) {
        this.fieldType = i;
    }
}
