package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zaf implements zai<String> {
    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ String zaa(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        String zao;
        zao = fastParser.zao(bufferedReader);
        return zao;
    }
}
