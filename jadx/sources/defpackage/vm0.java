package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: AxisPay */
/* renamed from: vm0  reason: default package */
/* loaded from: classes.dex */
public interface vm0<R> extends um0 {
    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    List<Object> getParameters();

    dn0 getReturnType();

    List<Object> getTypeParameters();

    en0 getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
