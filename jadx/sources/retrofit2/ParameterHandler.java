package retrofit2;

import com.google.android.gms.vision.barcode.Barcode;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import myunmn.C0059ao;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class ParameterHandler<T> {

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class Body<T> extends ParameterHandler<T> {
        private final Converter<T, RequestBody> converter;
        private final Method method;
        private final int p;

        public Body(Method method, int i, Converter<T, RequestBody> converter) {
            this.method = method;
            this.p = i;
            this.converter = converter;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) {
            if (t != null) {
                try {
                    requestBuilder.setBody(this.converter.convert(t));
                    return;
                } catch (IOException e) {
                    Method method = this.method;
                    int i = this.p;
                    throw Utils.parameterError(method, e, i, C0059ao.a(4094) + t + C0059ao.a(4095), new Object[0]);
                }
            }
            throw Utils.parameterError(this.method, this.p, C0059ao.a(Barcode.AZTEC), new Object[0]);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class Field<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        public Field(String str, Converter<T, String> converter, boolean z) {
            Objects.requireNonNull(str, C0059ao.a(4032));
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            String convert;
            if (t == null || (convert = this.valueConverter.convert(t)) == null) {
                return;
            }
            requestBuilder.addFormField(this.name, convert, this.encoded);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        public FieldMap(Method method, int i, Converter<T, String> converter, boolean z) {
            this.method = method;
            this.p = i;
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
            apply(requestBuilder, (Map) ((Map) obj));
        }

        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        String a = C0059ao.a(13374);
                        if (value != null) {
                            String convert = this.valueConverter.convert(value);
                            if (convert != null) {
                                requestBuilder.addFormField(key, convert, this.encoded);
                            } else {
                                Method method = this.method;
                                int i = this.p;
                                throw Utils.parameterError(method, i, C0059ao.a(13375) + value + C0059ao.a(13376) + this.valueConverter.getClass().getName() + C0059ao.a(13377) + key + a, new Object[0]);
                            }
                        } else {
                            Method method2 = this.method;
                            int i2 = this.p;
                            throw Utils.parameterError(method2, i2, C0059ao.a(13378) + key + a, new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.p, C0059ao.a(13379), new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.p, C0059ao.a(13380), new Object[0]);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class Header<T> extends ParameterHandler<T> {
        private final String name;
        private final Converter<T, String> valueConverter;

        public Header(String str, Converter<T, String> converter) {
            Objects.requireNonNull(str, C0059ao.a(14069));
            this.name = str;
            this.valueConverter = converter;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            String convert;
            if (t == null || (convert = this.valueConverter.convert(t)) == null) {
                return;
            }
            requestBuilder.addHeader(this.name, convert);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        public HeaderMap(Method method, int i, Converter<T, String> converter) {
            this.method = method;
            this.p = i;
            this.valueConverter = converter;
        }

        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
            apply(requestBuilder, (Map) ((Map) obj));
        }

        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            requestBuilder.addHeader(key, this.valueConverter.convert(value));
                        } else {
                            Method method = this.method;
                            int i = this.p;
                            throw Utils.parameterError(method, i, C0059ao.a(12428) + key + C0059ao.a(12429), new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.p, C0059ao.a(12430), new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.p, C0059ao.a(12431), new Object[0]);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class Headers extends ParameterHandler<okhttp3.Headers> {
        private final Method method;
        private final int p;

        public Headers(Method method, int i) {
            this.method = method;
            this.p = i;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable okhttp3.Headers headers) {
            if (headers != null) {
                requestBuilder.addHeaders(headers);
            } else {
                throw Utils.parameterError(this.method, this.p, C0059ao.a(1046), new Object[0]);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class Part<T> extends ParameterHandler<T> {
        private final Converter<T, RequestBody> converter;
        private final okhttp3.Headers headers;
        private final Method method;
        private final int p;

        public Part(Method method, int i, okhttp3.Headers headers, Converter<T, RequestBody> converter) {
            this.method = method;
            this.p = i;
            this.headers = headers;
            this.converter = converter;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                requestBuilder.addPart(this.headers, this.converter.convert(t));
            } catch (IOException e) {
                Method method = this.method;
                int i = this.p;
                throw Utils.parameterError(method, i, C0059ao.a(12910) + t + C0059ao.a(12911), e);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class PartMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;
        private final int p;
        private final String transferEncoding;
        private final Converter<T, RequestBody> valueConverter;

        public PartMap(Method method, int i, Converter<T, RequestBody> converter, String str) {
            this.method = method;
            this.p = i;
            this.valueConverter = converter;
            this.transferEncoding = str;
        }

        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
            apply(requestBuilder, (Map) ((Map) obj));
        }

        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            requestBuilder.addPart(okhttp3.Headers.of(C0059ao.a(8544), C0059ao.a(8545) + key + C0059ao.a(8546), C0059ao.a(8547), this.transferEncoding), this.valueConverter.convert(value));
                        } else {
                            Method method = this.method;
                            int i = this.p;
                            throw Utils.parameterError(method, i, C0059ao.a(8548) + key + C0059ao.a(8549), new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.p, C0059ao.a(8550), new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.p, C0059ao.a(8551), new Object[0]);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class Path<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Method method;
        private final String name;
        private final int p;
        private final Converter<T, String> valueConverter;

        public Path(Method method, int i, String str, Converter<T, String> converter, boolean z) {
            this.method = method;
            this.p = i;
            Objects.requireNonNull(str, C0059ao.a(11321));
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            if (t != null) {
                requestBuilder.addPathParam(this.name, this.valueConverter.convert(t), this.encoded);
                return;
            }
            Method method = this.method;
            int i = this.p;
            throw Utils.parameterError(method, i, C0059ao.a(11322) + this.name + C0059ao.a(11323), new Object[0]);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class Query<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        public Query(String str, Converter<T, String> converter, boolean z) {
            Objects.requireNonNull(str, C0059ao.a(491));
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            String convert;
            if (t == null || (convert = this.valueConverter.convert(t)) == null) {
                return;
            }
            requestBuilder.addQueryParam(this.name, convert, this.encoded);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        public QueryMap(Method method, int i, Converter<T, String> converter, boolean z) {
            this.method = method;
            this.p = i;
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
            apply(requestBuilder, (Map) ((Map) obj));
        }

        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        String a = C0059ao.a(2970);
                        if (value != null) {
                            String convert = this.valueConverter.convert(value);
                            if (convert != null) {
                                requestBuilder.addQueryParam(key, convert, this.encoded);
                            } else {
                                Method method = this.method;
                                int i = this.p;
                                throw Utils.parameterError(method, i, C0059ao.a(2971) + value + C0059ao.a(2972) + this.valueConverter.getClass().getName() + C0059ao.a(2973) + key + a, new Object[0]);
                            }
                        } else {
                            Method method2 = this.method;
                            int i2 = this.p;
                            throw Utils.parameterError(method2, i2, C0059ao.a(2974) + key + a, new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.p, C0059ao.a(2975), new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.p, C0059ao.a(2976), new Object[0]);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class QueryName<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Converter<T, String> nameConverter;

        public QueryName(Converter<T, String> converter, boolean z) {
            this.nameConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            if (t == null) {
                return;
            }
            requestBuilder.addQueryParam(this.nameConverter.convert(t), null, this.encoded);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class RawPart extends ParameterHandler<MultipartBody.Part> {
        public static final RawPart INSTANCE = new RawPart();

        private RawPart() {
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable MultipartBody.Part part) {
            if (part != null) {
                requestBuilder.addPart(part);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class RelativeUrl extends ParameterHandler<Object> {
        private final Method method;
        private final int p;

        public RelativeUrl(Method method, int i) {
            this.method = method;
            this.p = i;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable Object obj) {
            if (obj != null) {
                requestBuilder.setRelativeUrl(obj);
            } else {
                throw Utils.parameterError(this.method, this.p, C0059ao.a(2335), new Object[0]);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class Tag<T> extends ParameterHandler<T> {
        public final Class<T> cls;

        public Tag(Class<T> cls) {
            this.cls = cls;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) {
            requestBuilder.addTag(this.cls, t);
        }
    }

    public abstract void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException;

    public final ParameterHandler<Object> array() {
        return new ParameterHandler<Object>() { // from class: retrofit2.ParameterHandler.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // retrofit2.ParameterHandler
            public void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
                if (obj == null) {
                    return;
                }
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    ParameterHandler.this.apply(requestBuilder, Array.get(obj, i));
                }
            }
        };
    }

    public final ParameterHandler<Iterable<T>> iterable() {
        return new ParameterHandler<Iterable<T>>() { // from class: retrofit2.ParameterHandler.1
            @Override // retrofit2.ParameterHandler
            public /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
                apply(requestBuilder, (Iterable) ((Iterable) obj));
            }

            public void apply(RequestBuilder requestBuilder, @Nullable Iterable<T> iterable) throws IOException {
                if (iterable == null) {
                    return;
                }
                for (T t : iterable) {
                    ParameterHandler.this.apply(requestBuilder, t);
                }
            }
        };
    }
}
