package defpackage;

import defpackage.bf;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: AxisPay */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: lf  reason: default package */
/* loaded from: classes.dex */
public @interface lf {
    bf.b value();
}
