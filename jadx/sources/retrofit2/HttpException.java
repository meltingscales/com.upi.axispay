package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient Response<?> response;

    public HttpException(Response<?> response) {
        super(getMessage(response));
        this.code = response.code();
        this.message = response.message();
        this.response = response;
    }

    private static String getMessage(Response<?> response) {
        Objects.requireNonNull(response, C0059ao.a(150));
        return C0059ao.a(151) + response.code() + C0059ao.a(152) + response.message();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @Nullable
    public Response<?> response() {
        return this.response;
    }
}
