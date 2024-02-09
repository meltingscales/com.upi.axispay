package com.google.gson.internal;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class JsonReaderInternalAccess {
    public static JsonReaderInternalAccess INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader) throws IOException;
}
