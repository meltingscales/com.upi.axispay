package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import myunmn.C0059ao;
import okhttp3.Request;
import okio.Timeout;
import retrofit2.CallAdapter;
import retrofit2.DefaultCallAdapterFactory;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class DefaultCallAdapterFactory extends CallAdapter.Factory {
    @Nullable
    private final Executor callbackExecutor;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class ExecutorCallbackCall<T> implements Call<T> {
        public final Executor callbackExecutor;
        public final Call<T> delegate;

        /* compiled from: AxisPay */
        /* renamed from: retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        public class AnonymousClass1 implements Callback<T> {
            public final /* synthetic */ Callback val$callback;

            public AnonymousClass1(Callback callback) {
                this.val$callback = callback;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void b(Callback callback, Throwable th) {
                callback.onFailure(ExecutorCallbackCall.this, th);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void d(Callback callback, Response response) {
                if (ExecutorCallbackCall.this.delegate.isCanceled()) {
                    callback.onFailure(ExecutorCallbackCall.this, new IOException(C0059ao.a(10905)));
                } else {
                    callback.onResponse(ExecutorCallbackCall.this, response);
                }
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<T> call, final Throwable th) {
                Executor executor = ExecutorCallbackCall.this.callbackExecutor;
                final Callback callback = this.val$callback;
                executor.execute(new Runnable() { // from class: fo0
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1.this.b(callback, th);
                    }
                });
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call, final Response<T> response) {
                Executor executor = ExecutorCallbackCall.this.callbackExecutor;
                final Callback callback = this.val$callback;
                executor.execute(new Runnable() { // from class: go0
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1.this.d(callback, response);
                    }
                });
            }
        }

        public ExecutorCallbackCall(Executor executor, Call<T> call) {
            this.callbackExecutor = executor;
            this.delegate = call;
        }

        @Override // retrofit2.Call
        public void cancel() {
            this.delegate.cancel();
        }

        @Override // retrofit2.Call
        public void enqueue(Callback<T> callback) {
            Objects.requireNonNull(callback, C0059ao.a(6615));
            this.delegate.enqueue(new AnonymousClass1(callback));
        }

        @Override // retrofit2.Call
        public Response<T> execute() throws IOException {
            return this.delegate.execute();
        }

        @Override // retrofit2.Call
        public boolean isCanceled() {
            return this.delegate.isCanceled();
        }

        @Override // retrofit2.Call
        public boolean isExecuted() {
            return this.delegate.isExecuted();
        }

        @Override // retrofit2.Call
        public Request request() {
            return this.delegate.request();
        }

        @Override // retrofit2.Call
        public Timeout timeout() {
            return this.delegate.timeout();
        }

        @Override // retrofit2.Call
        public Call<T> clone() {
            return new ExecutorCallbackCall(this.callbackExecutor, this.delegate.mo397clone());
        }
    }

    public DefaultCallAdapterFactory(@Nullable Executor executor) {
        this.callbackExecutor = executor;
    }

    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(type) != Call.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            final Type parameterUpperBound = Utils.getParameterUpperBound(0, (ParameterizedType) type);
            final Executor executor = Utils.isAnnotationPresent(annotationArr, SkipCallbackExecutor.class) ? null : this.callbackExecutor;
            return new CallAdapter<Object, Call<?>>() { // from class: retrofit2.DefaultCallAdapterFactory.1
                @Override // retrofit2.CallAdapter
                public Type responseType() {
                    return parameterUpperBound;
                }

                @Override // retrofit2.CallAdapter
                public Call<?> adapt(Call<Object> call) {
                    Executor executor2 = executor;
                    return executor2 == null ? call : new ExecutorCallbackCall(executor2, call);
                }
            };
        }
        throw new IllegalArgumentException(C0059ao.a(13674));
    }
}
