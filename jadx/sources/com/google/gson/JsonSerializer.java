package com.google.gson;

import java.lang.reflect.Type;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface JsonSerializer<T> {
    JsonElement serialize(T t, Type type, JsonSerializationContext jsonSerializationContext);
}
