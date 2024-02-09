package com.crashlytics.android.answers;

import java.math.BigDecimal;
import java.util.Currency;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PurchaseEvent extends PredefinedEvent<PurchaseEvent> {
    public static final String CURRENCY_ATTRIBUTE = null;
    public static final String ITEM_ID_ATTRIBUTE = null;
    public static final String ITEM_NAME_ATTRIBUTE = null;
    public static final String ITEM_PRICE_ATTRIBUTE = null;
    public static final String ITEM_TYPE_ATTRIBUTE = null;
    public static final BigDecimal MICRO_CONSTANT;
    public static final String SUCCESS_ATTRIBUTE = null;
    public static final String TYPE = null;

    static {
        C0059ao.a(PurchaseEvent.class, 267);
        MICRO_CONSTANT = BigDecimal.valueOf(1000000L);
    }

    @Override // com.crashlytics.android.answers.PredefinedEvent
    public String getPredefinedType() {
        return C0059ao.a(11397);
    }

    public long priceToMicros(BigDecimal bigDecimal) {
        return MICRO_CONSTANT.multiply(bigDecimal).longValue();
    }

    public PurchaseEvent putCurrency(Currency currency) {
        AnswersEventValidator answersEventValidator = this.validator;
        String a = C0059ao.a(11398);
        if (!answersEventValidator.isNull(currency, a)) {
            this.predefinedAttributes.put(a, currency.getCurrencyCode());
        }
        return this;
    }

    public PurchaseEvent putItemId(String str) {
        this.predefinedAttributes.put(C0059ao.a(11399), str);
        return this;
    }

    public PurchaseEvent putItemName(String str) {
        this.predefinedAttributes.put(C0059ao.a(11400), str);
        return this;
    }

    public PurchaseEvent putItemPrice(BigDecimal bigDecimal) {
        AnswersEventValidator answersEventValidator = this.validator;
        String a = C0059ao.a(11401);
        if (!answersEventValidator.isNull(bigDecimal, a)) {
            this.predefinedAttributes.put(a, Long.valueOf(priceToMicros(bigDecimal)));
        }
        return this;
    }

    public PurchaseEvent putItemType(String str) {
        this.predefinedAttributes.put(C0059ao.a(11402), str);
        return this;
    }

    public PurchaseEvent putSuccess(boolean z) {
        this.predefinedAttributes.put(C0059ao.a(11403), Boolean.toString(z));
        return this;
    }
}
