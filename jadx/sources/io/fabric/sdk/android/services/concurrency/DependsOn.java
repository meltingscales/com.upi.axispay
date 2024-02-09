package io.fabric.sdk.android.services.concurrency;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: AxisPay */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface DependsOn {
    Class<?>[] value();
}
