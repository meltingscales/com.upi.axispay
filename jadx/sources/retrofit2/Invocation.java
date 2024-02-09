package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class Invocation {
    private final List<?> arguments;
    private final Method method;

    public Invocation(Method method, List<?> list) {
        this.method = method;
        this.arguments = Collections.unmodifiableList(list);
    }

    public static Invocation of(Method method, List<?> list) {
        Objects.requireNonNull(method, C0059ao.a(11854));
        Objects.requireNonNull(list, C0059ao.a(11855));
        return new Invocation(method, new ArrayList(list));
    }

    public List<?> arguments() {
        return this.arguments;
    }

    public Method method() {
        return this.method;
    }

    public String toString() {
        return String.format(C0059ao.a(11856), this.method.getDeclaringClass().getName(), this.method.getName(), this.arguments);
    }
}
