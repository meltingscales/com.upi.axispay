package com.google.gson;

import com.google.gson.reflect.TypeToken;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface TypeAdapterFactory {
    <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken);
}
