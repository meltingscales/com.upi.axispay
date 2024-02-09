package com.google.gson;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface ToNumberStrategy {
    Number readNumber(JsonReader jsonReader) throws IOException;
}
