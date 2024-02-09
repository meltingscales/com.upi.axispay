package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.annotations.ExtraProperty;

/* compiled from: AxisPay */
@ExtraProperty
/* loaded from: classes.dex */
public @interface Protobuf {

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum IntEncoding {
        DEFAULT,
        SIGNED,
        FIXED
    }

    IntEncoding intEncoding() default IntEncoding.DEFAULT;

    int tag();
}
