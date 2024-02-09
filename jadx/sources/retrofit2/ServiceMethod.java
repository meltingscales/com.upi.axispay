package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class ServiceMethod<T> {
    public static <T> ServiceMethod<T> parseAnnotations(Retrofit retrofit, Method method) {
        RequestFactory parseAnnotations = RequestFactory.parseAnnotations(retrofit, method);
        Type genericReturnType = method.getGenericReturnType();
        if (!Utils.hasUnresolvableType(genericReturnType)) {
            if (genericReturnType != Void.TYPE) {
                return HttpServiceMethod.parseAnnotations(retrofit, method, parseAnnotations);
            }
            throw Utils.methodError(method, C0059ao.a(8382), new Object[0]);
        }
        throw Utils.methodError(method, C0059ao.a(8383), genericReturnType);
    }

    @Nullable
    public abstract T invoke(Object[] objArr);
}
