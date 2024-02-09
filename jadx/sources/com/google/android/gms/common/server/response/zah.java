package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zah implements zai<BigDecimal> {
    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ BigDecimal zaa(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        BigDecimal zas;
        zas = fastParser.zas(bufferedReader);
        return zas;
    }
}
