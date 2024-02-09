package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BannerOffersVo extends Banner {
    public String customerName;
    public String customerType;
    public String customerid;
    public int offerAmount;
    public String partnerName;
    public String product;
    public String productType;

    @Override // com.olive.upi.transport.model.Banner
    public String getClickUrl() {
        return this.clickUrl;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCustomerType() {
        return this.customerType;
    }

    public String getCustomerid() {
        return this.customerid;
    }

    @Override // com.olive.upi.transport.model.Banner
    public String getImageUrl() {
        return this.imageUrl;
    }

    public int getOfferAmount() {
        return this.offerAmount;
    }

    @Override // com.olive.upi.transport.model.Banner
    public String getOffertext() {
        return this.offertext;
    }

    public String getPartnerName() {
        return this.partnerName;
    }

    public String getProduct() {
        return this.product;
    }

    public String getProductType() {
        return this.productType;
    }

    public void setClickUrl(String str) {
        this.clickUrl = str;
    }

    public void setCustomerName(String str) {
        this.customerName = str;
    }

    public void setCustomerType(String str) {
        this.customerType = str;
    }

    public void setCustomerid(String str) {
        this.customerid = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setOfferAmount(int i) {
        this.offerAmount = i;
    }

    public void setOffertext(String str) {
        this.offertext = str;
    }

    public void setPartnerName(String str) {
        this.partnerName = str;
    }

    public void setProduct(String str) {
        this.product = str;
    }

    public void setProductType(String str) {
        this.productType = str;
    }
}
