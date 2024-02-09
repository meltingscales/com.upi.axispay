package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import myunmn.C0059ao;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import retrofit2.ParameterHandler;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Tag;
import retrofit2.http.Url;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class RequestFactory {
    private final HttpUrl baseUrl;
    @Nullable
    private final MediaType contentType;
    private final boolean hasBody;
    @Nullable
    private final Headers headers;
    public final String httpMethod;
    private final boolean isFormEncoded;
    public final boolean isKotlinSuspendFunction;
    private final boolean isMultipart;
    private final Method method;
    private final ParameterHandler<?>[] parameterHandlers;
    @Nullable
    private final String relativeUrl;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class Builder {
        private static final String PARAM = null;
        private static final Pattern PARAM_NAME_REGEX;
        private static final Pattern PARAM_URL_REGEX;
        @Nullable
        public MediaType contentType;
        public boolean gotBody;
        public boolean gotField;
        public boolean gotPart;
        public boolean gotPath;
        public boolean gotQuery;
        public boolean gotQueryMap;
        public boolean gotQueryName;
        public boolean gotUrl;
        public boolean hasBody;
        @Nullable
        public Headers headers;
        @Nullable
        public String httpMethod;
        public boolean isFormEncoded;
        public boolean isKotlinSuspendFunction;
        public boolean isMultipart;
        public final Method method;
        public final Annotation[] methodAnnotations;
        public final Annotation[][] parameterAnnotationsArray;
        @Nullable
        public ParameterHandler<?>[] parameterHandlers;
        public final Type[] parameterTypes;
        @Nullable
        public String relativeUrl;
        @Nullable
        public Set<String> relativeUrlParamNames;
        public final Retrofit retrofit;

        static {
            C0059ao.a(Builder.class, 238);
            PARAM_URL_REGEX = Pattern.compile(C0059ao.a(5593));
            PARAM_NAME_REGEX = Pattern.compile(C0059ao.a(5594));
        }

        public Builder(Retrofit retrofit, Method method) {
            this.retrofit = retrofit;
            this.method = method;
            this.methodAnnotations = method.getAnnotations();
            this.parameterTypes = method.getGenericParameterTypes();
            this.parameterAnnotationsArray = method.getParameterAnnotations();
        }

        private static Class<?> boxIfPrimitive(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private Headers parseHeaders(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw Utils.methodError(this.method, C0059ao.a(5597), str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if (C0059ao.a(5595).equalsIgnoreCase(substring)) {
                    try {
                        this.contentType = MediaType.get(trim);
                    } catch (IllegalArgumentException e) {
                        throw Utils.methodError(this.method, e, C0059ao.a(5596), trim);
                    }
                } else {
                    builder.add(substring, trim);
                }
            }
            return builder.build();
        }

        private void parseHttpMethodAndPath(String str, String str2, boolean z) {
            String str3 = this.httpMethod;
            if (str3 != null) {
                throw Utils.methodError(this.method, C0059ao.a(5599), str3, str);
            }
            this.httpMethod = str;
            this.hasBody = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (PARAM_URL_REGEX.matcher(substring).find()) {
                    throw Utils.methodError(this.method, C0059ao.a(5598), substring);
                }
            }
            this.relativeUrl = str2;
            this.relativeUrlParamNames = parsePathParameters(str2);
        }

        private void parseMethodAnnotation(Annotation annotation) {
            if (annotation instanceof DELETE) {
                parseHttpMethodAndPath(C0059ao.a(5600), ((DELETE) annotation).value(), false);
            } else if (annotation instanceof GET) {
                parseHttpMethodAndPath(C0059ao.a(5601), ((GET) annotation).value(), false);
            } else if (annotation instanceof HEAD) {
                parseHttpMethodAndPath(C0059ao.a(5602), ((HEAD) annotation).value(), false);
            } else if (annotation instanceof PATCH) {
                parseHttpMethodAndPath(C0059ao.a(5603), ((PATCH) annotation).value(), true);
            } else if (annotation instanceof POST) {
                parseHttpMethodAndPath(C0059ao.a(5604), ((POST) annotation).value(), true);
            } else if (annotation instanceof PUT) {
                parseHttpMethodAndPath(C0059ao.a(5605), ((PUT) annotation).value(), true);
            } else if (annotation instanceof OPTIONS) {
                parseHttpMethodAndPath(C0059ao.a(5606), ((OPTIONS) annotation).value(), false);
            } else if (annotation instanceof HTTP) {
                HTTP http = (HTTP) annotation;
                parseHttpMethodAndPath(http.method(), http.path(), http.hasBody());
            } else if (annotation instanceof retrofit2.http.Headers) {
                String[] value = ((retrofit2.http.Headers) annotation).value();
                if (value.length != 0) {
                    this.headers = parseHeaders(value);
                } else {
                    throw Utils.methodError(this.method, C0059ao.a(5607), new Object[0]);
                }
            } else {
                boolean z = annotation instanceof Multipart;
                String a = C0059ao.a(5608);
                if (z) {
                    if (!this.isFormEncoded) {
                        this.isMultipart = true;
                        return;
                    }
                    throw Utils.methodError(this.method, a, new Object[0]);
                } else if (annotation instanceof FormUrlEncoded) {
                    if (!this.isMultipart) {
                        this.isFormEncoded = true;
                        return;
                    }
                    throw Utils.methodError(this.method, a, new Object[0]);
                }
            }
        }

        @Nullable
        private ParameterHandler<?> parseParameter(int i, Type type, @Nullable Annotation[] annotationArr, boolean z) {
            ParameterHandler<?> parameterHandler;
            if (annotationArr != null) {
                parameterHandler = null;
                for (Annotation annotation : annotationArr) {
                    ParameterHandler<?> parseParameterAnnotation = parseParameterAnnotation(i, type, annotationArr, annotation);
                    if (parseParameterAnnotation != null) {
                        if (parameterHandler != null) {
                            throw Utils.parameterError(this.method, i, C0059ao.a(5609), new Object[0]);
                        }
                        parameterHandler = parseParameterAnnotation;
                    }
                }
            } else {
                parameterHandler = null;
            }
            if (parameterHandler == null) {
                if (z) {
                    try {
                        if (Utils.getRawType(type) == wj0.class) {
                            this.isKotlinSuspendFunction = true;
                            return null;
                        }
                    } catch (NoClassDefFoundError unused) {
                    }
                }
                throw Utils.parameterError(this.method, i, C0059ao.a(5610), new Object[0]);
            }
            return parameterHandler;
        }

        @Nullable
        private ParameterHandler<?> parseParameterAnnotation(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            boolean z = annotation instanceof Url;
            String a = C0059ao.a(5611);
            if (z) {
                validateResolvableType(i, type);
                if (!this.gotUrl) {
                    if (!this.gotPath) {
                        if (!this.gotQuery) {
                            if (!this.gotQueryName) {
                                if (!this.gotQueryMap) {
                                    if (this.relativeUrl == null) {
                                        this.gotUrl = true;
                                        if (type != HttpUrl.class && type != String.class && type != URI.class && (!(type instanceof Class) || !C0059ao.a(5612).equals(((Class) type).getName()))) {
                                            throw Utils.parameterError(this.method, i, C0059ao.a(5613), new Object[0]);
                                        }
                                        return new ParameterHandler.RelativeUrl(this.method, i);
                                    }
                                    throw Utils.parameterError(this.method, i, C0059ao.a(5614), this.httpMethod);
                                }
                                throw Utils.parameterError(this.method, i, C0059ao.a(5615), new Object[0]);
                            }
                            throw Utils.parameterError(this.method, i, C0059ao.a(5616), new Object[0]);
                        }
                        throw Utils.parameterError(this.method, i, C0059ao.a(5617), new Object[0]);
                    }
                    throw Utils.parameterError(this.method, i, a, new Object[0]);
                }
                throw Utils.parameterError(this.method, i, C0059ao.a(5618), new Object[0]);
            } else if (annotation instanceof Path) {
                validateResolvableType(i, type);
                if (!this.gotQuery) {
                    if (!this.gotQueryName) {
                        if (!this.gotQueryMap) {
                            if (!this.gotUrl) {
                                if (this.relativeUrl != null) {
                                    this.gotPath = true;
                                    Path path = (Path) annotation;
                                    String value = path.value();
                                    validatePathName(i, value);
                                    return new ParameterHandler.Path(this.method, i, value, this.retrofit.stringConverter(type, annotationArr), path.encoded());
                                }
                                throw Utils.parameterError(this.method, i, C0059ao.a(5619), this.httpMethod);
                            }
                            throw Utils.parameterError(this.method, i, a, new Object[0]);
                        }
                        throw Utils.parameterError(this.method, i, C0059ao.a(5620), new Object[0]);
                    }
                    throw Utils.parameterError(this.method, i, C0059ao.a(5621), new Object[0]);
                }
                throw Utils.parameterError(this.method, i, C0059ao.a(5622), new Object[0]);
            } else {
                boolean z2 = annotation instanceof Query;
                String a2 = C0059ao.a(5623);
                String a3 = C0059ao.a(5624);
                if (z2) {
                    validateResolvableType(i, type);
                    Query query = (Query) annotation;
                    String value2 = query.value();
                    boolean encoded = query.encoded();
                    Class<?> rawType = Utils.getRawType(type);
                    this.gotQuery = true;
                    if (Iterable.class.isAssignableFrom(rawType)) {
                        if (type instanceof ParameterizedType) {
                            return new ParameterHandler.Query(value2, this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), encoded).iterable();
                        }
                        throw Utils.parameterError(this.method, i, rawType.getSimpleName() + a3 + rawType.getSimpleName() + a2, new Object[0]);
                    } else if (rawType.isArray()) {
                        return new ParameterHandler.Query(value2, this.retrofit.stringConverter(boxIfPrimitive(rawType.getComponentType()), annotationArr), encoded).array();
                    } else {
                        return new ParameterHandler.Query(value2, this.retrofit.stringConverter(type, annotationArr), encoded);
                    }
                } else if (annotation instanceof QueryName) {
                    validateResolvableType(i, type);
                    boolean encoded2 = ((QueryName) annotation).encoded();
                    Class<?> rawType2 = Utils.getRawType(type);
                    this.gotQueryName = true;
                    if (Iterable.class.isAssignableFrom(rawType2)) {
                        if (type instanceof ParameterizedType) {
                            return new ParameterHandler.QueryName(this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), encoded2).iterable();
                        }
                        throw Utils.parameterError(this.method, i, rawType2.getSimpleName() + a3 + rawType2.getSimpleName() + a2, new Object[0]);
                    } else if (rawType2.isArray()) {
                        return new ParameterHandler.QueryName(this.retrofit.stringConverter(boxIfPrimitive(rawType2.getComponentType()), annotationArr), encoded2).array();
                    } else {
                        return new ParameterHandler.QueryName(this.retrofit.stringConverter(type, annotationArr), encoded2);
                    }
                } else {
                    boolean z3 = annotation instanceof QueryMap;
                    String a4 = C0059ao.a(5625);
                    if (z3) {
                        validateResolvableType(i, type);
                        Class<?> rawType3 = Utils.getRawType(type);
                        this.gotQueryMap = true;
                        if (Map.class.isAssignableFrom(rawType3)) {
                            Type supertype = Utils.getSupertype(type, rawType3, Map.class);
                            if (supertype instanceof ParameterizedType) {
                                ParameterizedType parameterizedType = (ParameterizedType) supertype;
                                Type parameterUpperBound = Utils.getParameterUpperBound(0, parameterizedType);
                                if (String.class == parameterUpperBound) {
                                    return new ParameterHandler.QueryMap(this.method, i, this.retrofit.stringConverter(Utils.getParameterUpperBound(1, parameterizedType), annotationArr), ((QueryMap) annotation).encoded());
                                }
                                throw Utils.parameterError(this.method, i, C0059ao.a(5626) + parameterUpperBound, new Object[0]);
                            }
                            throw Utils.parameterError(this.method, i, a4, new Object[0]);
                        }
                        throw Utils.parameterError(this.method, i, C0059ao.a(5627), new Object[0]);
                    } else if (annotation instanceof Header) {
                        validateResolvableType(i, type);
                        String value3 = ((Header) annotation).value();
                        Class<?> rawType4 = Utils.getRawType(type);
                        if (Iterable.class.isAssignableFrom(rawType4)) {
                            if (type instanceof ParameterizedType) {
                                return new ParameterHandler.Header(value3, this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr)).iterable();
                            }
                            throw Utils.parameterError(this.method, i, rawType4.getSimpleName() + a3 + rawType4.getSimpleName() + a2, new Object[0]);
                        } else if (rawType4.isArray()) {
                            return new ParameterHandler.Header(value3, this.retrofit.stringConverter(boxIfPrimitive(rawType4.getComponentType()), annotationArr)).array();
                        } else {
                            return new ParameterHandler.Header(value3, this.retrofit.stringConverter(type, annotationArr));
                        }
                    } else if (annotation instanceof HeaderMap) {
                        if (type == Headers.class) {
                            return new ParameterHandler.Headers(this.method, i);
                        }
                        validateResolvableType(i, type);
                        Class<?> rawType5 = Utils.getRawType(type);
                        if (Map.class.isAssignableFrom(rawType5)) {
                            Type supertype2 = Utils.getSupertype(type, rawType5, Map.class);
                            if (supertype2 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType2 = (ParameterizedType) supertype2;
                                Type parameterUpperBound2 = Utils.getParameterUpperBound(0, parameterizedType2);
                                if (String.class == parameterUpperBound2) {
                                    return new ParameterHandler.HeaderMap(this.method, i, this.retrofit.stringConverter(Utils.getParameterUpperBound(1, parameterizedType2), annotationArr));
                                }
                                throw Utils.parameterError(this.method, i, C0059ao.a(5628) + parameterUpperBound2, new Object[0]);
                            }
                            throw Utils.parameterError(this.method, i, a4, new Object[0]);
                        }
                        throw Utils.parameterError(this.method, i, C0059ao.a(5629), new Object[0]);
                    } else if (annotation instanceof Field) {
                        validateResolvableType(i, type);
                        if (this.isFormEncoded) {
                            Field field = (Field) annotation;
                            String value4 = field.value();
                            boolean encoded3 = field.encoded();
                            this.gotField = true;
                            Class<?> rawType6 = Utils.getRawType(type);
                            if (Iterable.class.isAssignableFrom(rawType6)) {
                                if (type instanceof ParameterizedType) {
                                    return new ParameterHandler.Field(value4, this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), encoded3).iterable();
                                }
                                throw Utils.parameterError(this.method, i, rawType6.getSimpleName() + a3 + rawType6.getSimpleName() + a2, new Object[0]);
                            } else if (rawType6.isArray()) {
                                return new ParameterHandler.Field(value4, this.retrofit.stringConverter(boxIfPrimitive(rawType6.getComponentType()), annotationArr), encoded3).array();
                            } else {
                                return new ParameterHandler.Field(value4, this.retrofit.stringConverter(type, annotationArr), encoded3);
                            }
                        }
                        throw Utils.parameterError(this.method, i, C0059ao.a(5630), new Object[0]);
                    } else if (annotation instanceof FieldMap) {
                        validateResolvableType(i, type);
                        if (this.isFormEncoded) {
                            Class<?> rawType7 = Utils.getRawType(type);
                            if (Map.class.isAssignableFrom(rawType7)) {
                                Type supertype3 = Utils.getSupertype(type, rawType7, Map.class);
                                if (supertype3 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType3 = (ParameterizedType) supertype3;
                                    Type parameterUpperBound3 = Utils.getParameterUpperBound(0, parameterizedType3);
                                    if (String.class == parameterUpperBound3) {
                                        Converter stringConverter = this.retrofit.stringConverter(Utils.getParameterUpperBound(1, parameterizedType3), annotationArr);
                                        this.gotField = true;
                                        return new ParameterHandler.FieldMap(this.method, i, stringConverter, ((FieldMap) annotation).encoded());
                                    }
                                    throw Utils.parameterError(this.method, i, C0059ao.a(5631) + parameterUpperBound3, new Object[0]);
                                }
                                throw Utils.parameterError(this.method, i, a4, new Object[0]);
                            }
                            throw Utils.parameterError(this.method, i, C0059ao.a(5632), new Object[0]);
                        }
                        throw Utils.parameterError(this.method, i, C0059ao.a(5633), new Object[0]);
                    } else if (annotation instanceof Part) {
                        validateResolvableType(i, type);
                        if (this.isMultipart) {
                            Part part = (Part) annotation;
                            this.gotPart = true;
                            String value5 = part.value();
                            Class<?> rawType8 = Utils.getRawType(type);
                            if (value5.isEmpty()) {
                                boolean isAssignableFrom = Iterable.class.isAssignableFrom(rawType8);
                                String a5 = C0059ao.a(5634);
                                if (isAssignableFrom) {
                                    if (type instanceof ParameterizedType) {
                                        if (MultipartBody.Part.class.isAssignableFrom(Utils.getRawType(Utils.getParameterUpperBound(0, (ParameterizedType) type)))) {
                                            return ParameterHandler.RawPart.INSTANCE.iterable();
                                        }
                                        throw Utils.parameterError(this.method, i, a5, new Object[0]);
                                    }
                                    throw Utils.parameterError(this.method, i, rawType8.getSimpleName() + a3 + rawType8.getSimpleName() + a2, new Object[0]);
                                } else if (rawType8.isArray()) {
                                    if (MultipartBody.Part.class.isAssignableFrom(rawType8.getComponentType())) {
                                        return ParameterHandler.RawPart.INSTANCE.array();
                                    }
                                    throw Utils.parameterError(this.method, i, a5, new Object[0]);
                                } else if (MultipartBody.Part.class.isAssignableFrom(rawType8)) {
                                    return ParameterHandler.RawPart.INSTANCE;
                                } else {
                                    throw Utils.parameterError(this.method, i, a5, new Object[0]);
                                }
                            }
                            Headers of = Headers.of(C0059ao.a(5635), C0059ao.a(5636) + value5 + C0059ao.a(5637), C0059ao.a(5638), part.encoding());
                            boolean isAssignableFrom2 = Iterable.class.isAssignableFrom(rawType8);
                            String a6 = C0059ao.a(5639);
                            if (isAssignableFrom2) {
                                if (type instanceof ParameterizedType) {
                                    Type parameterUpperBound4 = Utils.getParameterUpperBound(0, (ParameterizedType) type);
                                    if (!MultipartBody.Part.class.isAssignableFrom(Utils.getRawType(parameterUpperBound4))) {
                                        return new ParameterHandler.Part(this.method, i, of, this.retrofit.requestBodyConverter(parameterUpperBound4, annotationArr, this.methodAnnotations)).iterable();
                                    }
                                    throw Utils.parameterError(this.method, i, a6, new Object[0]);
                                }
                                throw Utils.parameterError(this.method, i, rawType8.getSimpleName() + a3 + rawType8.getSimpleName() + a2, new Object[0]);
                            } else if (rawType8.isArray()) {
                                Class<?> boxIfPrimitive = boxIfPrimitive(rawType8.getComponentType());
                                if (!MultipartBody.Part.class.isAssignableFrom(boxIfPrimitive)) {
                                    return new ParameterHandler.Part(this.method, i, of, this.retrofit.requestBodyConverter(boxIfPrimitive, annotationArr, this.methodAnnotations)).array();
                                }
                                throw Utils.parameterError(this.method, i, a6, new Object[0]);
                            } else if (!MultipartBody.Part.class.isAssignableFrom(rawType8)) {
                                return new ParameterHandler.Part(this.method, i, of, this.retrofit.requestBodyConverter(type, annotationArr, this.methodAnnotations));
                            } else {
                                throw Utils.parameterError(this.method, i, a6, new Object[0]);
                            }
                        }
                        throw Utils.parameterError(this.method, i, C0059ao.a(5640), new Object[0]);
                    } else if (annotation instanceof PartMap) {
                        validateResolvableType(i, type);
                        if (this.isMultipart) {
                            this.gotPart = true;
                            Class<?> rawType9 = Utils.getRawType(type);
                            if (Map.class.isAssignableFrom(rawType9)) {
                                Type supertype4 = Utils.getSupertype(type, rawType9, Map.class);
                                if (supertype4 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType4 = (ParameterizedType) supertype4;
                                    Type parameterUpperBound5 = Utils.getParameterUpperBound(0, parameterizedType4);
                                    if (String.class == parameterUpperBound5) {
                                        Type parameterUpperBound6 = Utils.getParameterUpperBound(1, parameterizedType4);
                                        if (!MultipartBody.Part.class.isAssignableFrom(Utils.getRawType(parameterUpperBound6))) {
                                            return new ParameterHandler.PartMap(this.method, i, this.retrofit.requestBodyConverter(parameterUpperBound6, annotationArr, this.methodAnnotations), ((PartMap) annotation).encoding());
                                        }
                                        throw Utils.parameterError(this.method, i, C0059ao.a(5641), new Object[0]);
                                    }
                                    throw Utils.parameterError(this.method, i, C0059ao.a(5642) + parameterUpperBound5, new Object[0]);
                                }
                                throw Utils.parameterError(this.method, i, a4, new Object[0]);
                            }
                            throw Utils.parameterError(this.method, i, C0059ao.a(5643), new Object[0]);
                        }
                        throw Utils.parameterError(this.method, i, C0059ao.a(5644), new Object[0]);
                    } else if (annotation instanceof Body) {
                        validateResolvableType(i, type);
                        if (!this.isFormEncoded && !this.isMultipart) {
                            if (!this.gotBody) {
                                try {
                                    Converter requestBodyConverter = this.retrofit.requestBodyConverter(type, annotationArr, this.methodAnnotations);
                                    this.gotBody = true;
                                    return new ParameterHandler.Body(this.method, i, requestBodyConverter);
                                } catch (RuntimeException e) {
                                    throw Utils.parameterError(this.method, e, i, C0059ao.a(5645), type);
                                }
                            }
                            throw Utils.parameterError(this.method, i, C0059ao.a(5646), new Object[0]);
                        }
                        throw Utils.parameterError(this.method, i, C0059ao.a(5647), new Object[0]);
                    } else if (annotation instanceof Tag) {
                        validateResolvableType(i, type);
                        Class<?> rawType10 = Utils.getRawType(type);
                        for (int i2 = i - 1; i2 >= 0; i2--) {
                            ParameterHandler<?> parameterHandler = this.parameterHandlers[i2];
                            if ((parameterHandler instanceof ParameterHandler.Tag) && ((ParameterHandler.Tag) parameterHandler).cls.equals(rawType10)) {
                                throw Utils.parameterError(this.method, i, C0059ao.a(5648) + rawType10.getName() + C0059ao.a(5649) + (i2 + 1) + C0059ao.a(5650), new Object[0]);
                            }
                        }
                        return new ParameterHandler.Tag(rawType10);
                    } else {
                        return null;
                    }
                }
            }
        }

        public static Set<String> parsePathParameters(String str) {
            Matcher matcher = PARAM_URL_REGEX.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void validatePathName(int i, String str) {
            if (PARAM_NAME_REGEX.matcher(str).matches()) {
                if (!this.relativeUrlParamNames.contains(str)) {
                    throw Utils.parameterError(this.method, i, C0059ao.a(5651), this.relativeUrl, str);
                }
                return;
            }
            throw Utils.parameterError(this.method, i, C0059ao.a(5652), PARAM_URL_REGEX.pattern(), str);
        }

        private void validateResolvableType(int i, Type type) {
            if (Utils.hasUnresolvableType(type)) {
                throw Utils.parameterError(this.method, i, C0059ao.a(5653), type);
            }
        }

        public RequestFactory build() {
            for (Annotation annotation : this.methodAnnotations) {
                parseMethodAnnotation(annotation);
            }
            if (this.httpMethod != null) {
                if (!this.hasBody) {
                    if (!this.isMultipart) {
                        if (this.isFormEncoded) {
                            throw Utils.methodError(this.method, C0059ao.a(5654), new Object[0]);
                        }
                    } else {
                        throw Utils.methodError(this.method, C0059ao.a(5655), new Object[0]);
                    }
                }
                int length = this.parameterAnnotationsArray.length;
                this.parameterHandlers = new ParameterHandler[length];
                int i = length - 1;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= length) {
                        break;
                    }
                    ParameterHandler<?>[] parameterHandlerArr = this.parameterHandlers;
                    Type type = this.parameterTypes[i2];
                    Annotation[] annotationArr = this.parameterAnnotationsArray[i2];
                    if (i2 != i) {
                        z = false;
                    }
                    parameterHandlerArr[i2] = parseParameter(i2, type, annotationArr, z);
                    i2++;
                }
                if (this.relativeUrl != null || this.gotUrl) {
                    boolean z2 = this.isFormEncoded;
                    if (!z2 && !this.isMultipart && !this.hasBody && this.gotBody) {
                        throw Utils.methodError(this.method, C0059ao.a(5657), new Object[0]);
                    }
                    if (z2 && !this.gotField) {
                        throw Utils.methodError(this.method, C0059ao.a(5658), new Object[0]);
                    }
                    if (this.isMultipart && !this.gotPart) {
                        throw Utils.methodError(this.method, C0059ao.a(5659), new Object[0]);
                    }
                    return new RequestFactory(this);
                }
                throw Utils.methodError(this.method, C0059ao.a(5656), this.httpMethod);
            }
            throw Utils.methodError(this.method, C0059ao.a(5660), new Object[0]);
        }
    }

    public RequestFactory(Builder builder) {
        this.method = builder.method;
        this.baseUrl = builder.retrofit.baseUrl;
        this.httpMethod = builder.httpMethod;
        this.relativeUrl = builder.relativeUrl;
        this.headers = builder.headers;
        this.contentType = builder.contentType;
        this.hasBody = builder.hasBody;
        this.isFormEncoded = builder.isFormEncoded;
        this.isMultipart = builder.isMultipart;
        this.parameterHandlers = builder.parameterHandlers;
        this.isKotlinSuspendFunction = builder.isKotlinSuspendFunction;
    }

    public static RequestFactory parseAnnotations(Retrofit retrofit, Method method) {
        return new Builder(retrofit, method).build();
    }

    public Request create(Object[] objArr) throws IOException {
        ParameterHandler<?>[] parameterHandlerArr = this.parameterHandlers;
        int length = objArr.length;
        if (length == parameterHandlerArr.length) {
            RequestBuilder requestBuilder = new RequestBuilder(this.httpMethod, this.baseUrl, this.relativeUrl, this.headers, this.contentType, this.hasBody, this.isFormEncoded, this.isMultipart);
            if (this.isKotlinSuspendFunction) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                parameterHandlerArr[i].apply(requestBuilder, objArr[i]);
            }
            return requestBuilder.get().tag(Invocation.class, new Invocation(this.method, arrayList)).build();
        }
        throw new IllegalArgumentException(C0059ao.a(5823) + length + C0059ao.a(5824) + parameterHandlerArr.length + C0059ao.a(5825));
    }
}
