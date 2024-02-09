package com.crashlytics.android.answers;

import java.math.BigDecimal;
import java.util.Currency;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class StartCheckoutEvent extends PredefinedEvent<StartCheckoutEvent> {
    public static final String CURRENCY_ATTRIBUTE = null;
    public static final String ITEM_COUNT_ATTRIBUTE = null;
    public static final BigDecimal MICRO_CONSTANT;
    public static final String TOTAL_PRICE_ATTRIBUTE = null;
    public static final String TYPE = null;

    static {
        C0059ao.a(StartCheckoutEvent.class, 283);
        MICRO_CONSTANT = BigDecimal.valueOf(1000000L);
    }

    @Override // com.crashlytics.android.answers.PredefinedEvent
    public String getPredefinedType() {
        return C0059ao.a(6261);
    }

    public long priceToMicros(BigDecimal bigDecimal) {
        return MICRO_CONSTANT.multiply(bigDecimal).longValue();
    }

    public StartCheckoutEvent putCurrency(Currency currency) {
        AnswersEventValidator answersEventValidator = this.validator;
        String a = C0059ao.a(6262);
        if (!answersEventValidator.isNull(currency, a)) {
            this.predefinedAttributes.put(a, currency.getCurrencyCode());
        }
        return this;
    }

    public StartCheckoutEvent putItemCount(int i) {
        this.predefinedAttributes.put(C0059ao.a(6263), Integer.valueOf(i));
        return this;
    }

    public StartCheckoutEvent putTotalPrice(BigDecimal bigDecimal) {
        AnswersEventValidator answersEventValidator = this.validator;
        String a = C0059ao.a(6264);
        if (!answersEventValidator.isNull(bigDecimal, a)) {
            this.predefinedAttributes.put(a, Long.valueOf(priceToMicros(bigDecimal)));
        }
        return this;
    }
}
