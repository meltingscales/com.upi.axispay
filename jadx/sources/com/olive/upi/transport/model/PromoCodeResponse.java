package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PromoCodeResponse {
    public String active;
    public String expiryDate;
    public String promoCode;
    public String promoDescription;

    public String getActive() {
        return this.active;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public String getPromoCode() {
        return this.promoCode;
    }

    public String getPromoDescription() {
        return this.promoDescription;
    }

    public void setActive(String str) {
        this.active = str;
    }

    public void setExpiryDate(String str) {
        this.expiryDate = str;
    }

    public void setPromoCode(String str) {
        this.promoCode = str;
    }

    public void setPromoDescription(String str) {
        this.promoDescription = str;
    }
}
