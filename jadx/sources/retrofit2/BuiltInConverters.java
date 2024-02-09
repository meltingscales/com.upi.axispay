package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.http.Streaming;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class BuiltInConverters extends Converter.Factory {
    private boolean checkForKotlinUnit = true;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class BufferingResponseBodyConverter implements Converter<ResponseBody, ResponseBody> {
        public static final BufferingResponseBodyConverter INSTANCE = new BufferingResponseBodyConverter();

        @Override // retrofit2.Converter
        public ResponseBody convert(ResponseBody responseBody) throws IOException {
            try {
                return Utils.buffer(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class RequestBodyConverter implements Converter<RequestBody, RequestBody> {
        public static final RequestBodyConverter INSTANCE = new RequestBodyConverter();

        @Override // retrofit2.Converter
        public RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class StreamingResponseBodyConverter implements Converter<ResponseBody, ResponseBody> {
        public static final StreamingResponseBodyConverter INSTANCE = new StreamingResponseBodyConverter();

        @Override // retrofit2.Converter
        public ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class ToStringConverter implements Converter<Object, String> {
        public static final ToStringConverter INSTANCE = new ToStringConverter();

        @Override // retrofit2.Converter
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class UnitResponseBodyConverter implements Converter<ResponseBody, pi0> {
        public static final UnitResponseBodyConverter INSTANCE = new UnitResponseBodyConverter();

        @Override // retrofit2.Converter
        public pi0 convert(ResponseBody responseBody) {
            responseBody.close();
            return pi0.a;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class VoidResponseBodyConverter implements Converter<ResponseBody, Void> {
        public static final VoidResponseBodyConverter INSTANCE = new VoidResponseBodyConverter();

        @Override // retrofit2.Converter
        public Void convert(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (RequestBody.class.isAssignableFrom(Utils.getRawType(type))) {
            return RequestBodyConverter.INSTANCE;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == ResponseBody.class) {
            if (Utils.isAnnotationPresent(annotationArr, Streaming.class)) {
                return StreamingResponseBodyConverter.INSTANCE;
            }
            return BufferingResponseBodyConverter.INSTANCE;
        } else if (type == Void.class) {
            return VoidResponseBodyConverter.INSTANCE;
        } else {
            if (this.checkForKotlinUnit && type == pi0.class) {
                try {
                    return UnitResponseBodyConverter.INSTANCE;
                } catch (NoClassDefFoundError unused) {
                    this.checkForKotlinUnit = false;
                    return null;
                }
            }
            return null;
        }
    }
}
