package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;
import myunmn.C0059ao;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.OkHttpCall;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class Response<T> {
    @Nullable
    private final T body;
    @Nullable
    private final ResponseBody errorBody;
    private final okhttp3.Response rawResponse;

    private Response(okhttp3.Response response, @Nullable T t, @Nullable ResponseBody responseBody) {
        this.rawResponse = response;
        this.body = t;
        this.errorBody = responseBody;
    }

    public static <T> Response<T> error(int i, ResponseBody responseBody) {
        Objects.requireNonNull(responseBody, C0059ao.a(5576));
        if (i >= 400) {
            return error(responseBody, new Response.Builder().body(new OkHttpCall.NoContentResponseBody(responseBody.contentType(), responseBody.contentLength())).code(i).message(C0059ao.a(5577)).protocol(Protocol.HTTP_1_1).request(new Request.Builder().url(C0059ao.a(5578)).build()).build());
        }
        throw new IllegalArgumentException(C0059ao.a(5579) + i);
    }

    public static <T> Response<T> success(@Nullable T t) {
        return success(t, new Response.Builder().code(200).message(C0059ao.a(5586)).protocol(Protocol.HTTP_1_1).request(new Request.Builder().url(C0059ao.a(5587)).build()).build());
    }

    @Nullable
    public T body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.code();
    }

    @Nullable
    public ResponseBody errorBody() {
        return this.errorBody;
    }

    public Headers headers() {
        return this.rawResponse.headers();
    }

    public boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    public String message() {
        return this.rawResponse.message();
    }

    public okhttp3.Response raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    public static <T> Response<T> success(int i, @Nullable T t) {
        if (i >= 200 && i < 300) {
            return success(t, new Response.Builder().code(i).message(C0059ao.a(5583)).protocol(Protocol.HTTP_1_1).request(new Request.Builder().url(C0059ao.a(5584)).build()).build());
        }
        throw new IllegalArgumentException(C0059ao.a(5585) + i);
    }

    public static <T> Response<T> error(ResponseBody responseBody, okhttp3.Response response) {
        Objects.requireNonNull(responseBody, C0059ao.a(5580));
        Objects.requireNonNull(response, C0059ao.a(5581));
        if (!response.isSuccessful()) {
            return new Response<>(response, null, responseBody);
        }
        throw new IllegalArgumentException(C0059ao.a(5582));
    }

    public static <T> Response<T> success(@Nullable T t, Headers headers) {
        Objects.requireNonNull(headers, C0059ao.a(5588));
        return success(t, new Response.Builder().code(200).message(C0059ao.a(5589)).protocol(Protocol.HTTP_1_1).headers(headers).request(new Request.Builder().url(C0059ao.a(5590)).build()).build());
    }

    public static <T> Response<T> success(@Nullable T t, okhttp3.Response response) {
        Objects.requireNonNull(response, C0059ao.a(5591));
        if (response.isSuccessful()) {
            return new Response<>(response, t, null);
        }
        throw new IllegalArgumentException(C0059ao.a(5592));
    }
}
