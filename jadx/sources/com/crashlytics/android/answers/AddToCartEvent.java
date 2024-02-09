package com.crashlytics.android.answers;

import java.math.BigDecimal;
import java.util.Currency;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AddToCartEvent extends PredefinedEvent<AddToCartEvent> {
    public static final String CURRENCY_ATTRIBUTE = null;
    public static final String ITEM_ID_ATTRIBUTE = null;
    public static final String ITEM_NAME_ATTRIBUTE = null;
    public static final String ITEM_PRICE_ATTRIBUTE = null;
    public static final String ITEM_TYPE_ATTRIBUTE = null;
    public static final BigDecimal MICRO_CONSTANT;
    public static final String TYPE = null;

    static {
        C0059ao.a(AddToCartEvent.class, 276);
        MICRO_CONSTANT = BigDecimal.valueOf(1000000L);
    }

    @Override // com.crashlytics.android.answers.PredefinedEvent
    public String getPredefinedType() {
        return C0059ao.a(9839);
    }

    public long priceToMicros(BigDecimal bigDecimal) {
        return MICRO_CONSTANT.multiply(bigDecimal).longValue();
    }

    public AddToCartEvent putCurrency(Currency currency) {
        AnswersEventValidator answersEventValidator = this.validator;
        String a = C0059ao.a(9840);
        if (!answersEventValidator.isNull(currency, a)) {
            this.predefinedAttributes.put(a, currency.getCurrencyCode());
        }
        return this;
    }

    public AddToCartEvent putItemId(String str) {
        this.predefinedAttributes.put(C0059ao.a(9841), str);
        return this;
    }

    public AddToCartEvent putItemName(String str) {
        this.predefinedAttributes.put(C0059ao.a(9842), str);
        return this;
    }

    public AddToCartEvent putItemPrice(BigDecimal bigDecimal) {
        AnswersEventValidator answersEventValidator = this.validator;
        String a = C0059ao.a(9843);
        if (!answersEventValidator.isNull(bigDecimal, a)) {
            this.predefinedAttributes.put(a, Long.valueOf(priceToMicros(bigDecimal)));
        }
        return this;
    }

    public AddToCartEvent putItemType(String str) {
        this.predefinedAttributes.put(C0059ao.a(9844), str);
        return this;
    }
}
