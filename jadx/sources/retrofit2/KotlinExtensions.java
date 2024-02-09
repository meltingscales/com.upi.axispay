package retrofit2;

import defpackage.hi0;
import java.lang.reflect.Method;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class KotlinExtensions {
    public static final <T> Object await(Call<T> call, wj0<? super T> wj0Var) {
        CancellableContinuation cancellableContinuationImpl = new CancellableContinuationImpl(ak0.a(wj0Var), 1);
        final CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
        cancellableContinuation.invokeOnCancellation(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th) {
                yl0.f(call2, C0059ao.a(4542));
                yl0.f(th, C0059ao.a(4543));
                hi0.a aVar = hi0.b;
                Object a = ii0.a(th);
                hi0.a(a);
                cancellableContinuation.resumeWith(a);
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                yl0.f(call2, C0059ao.a(4544));
                yl0.f(response, C0059ao.a(4545));
                if (response.isSuccessful()) {
                    T body = response.body();
                    if (body == null) {
                        Object tag = call2.request().tag(Invocation.class);
                        if (tag != null) {
                            yl0.b(tag, C0059ao.a(4546));
                            Method method = ((Invocation) tag).method();
                            StringBuilder sb = new StringBuilder();
                            sb.append(C0059ao.a(4547));
                            yl0.b(method, C0059ao.a(4548));
                            Class<?> declaringClass = method.getDeclaringClass();
                            yl0.b(declaringClass, C0059ao.a(4549));
                            sb.append(declaringClass.getName());
                            sb.append('.');
                            sb.append(method.getName());
                            sb.append(C0059ao.a(4550));
                            zh0 zh0Var = new zh0(sb.toString());
                            hi0.a aVar = hi0.b;
                            Object a = ii0.a(zh0Var);
                            hi0.a(a);
                            cancellableContinuation.resumeWith(a);
                            return;
                        }
                        yl0.n();
                        throw null;
                    }
                    hi0.a aVar2 = hi0.b;
                    hi0.a(body);
                    cancellableContinuation.resumeWith(body);
                    return;
                }
                HttpException httpException = new HttpException(response);
                hi0.a aVar3 = hi0.b;
                Object a2 = ii0.a(httpException);
                hi0.a(a2);
                cancellableContinuation.resumeWith(a2);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == bk0.b()) {
            ik0.b(wj0Var);
        }
        return result;
    }

    public static final <T> Object awaitNullable(Call<T> call, wj0<? super T> wj0Var) {
        CancellableContinuation cancellableContinuationImpl = new CancellableContinuationImpl(ak0.a(wj0Var), 1);
        final CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
        cancellableContinuation.invokeOnCancellation(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th) {
                yl0.f(call2, C0059ao.a(2419));
                yl0.f(th, C0059ao.a(2420));
                hi0.a aVar = hi0.b;
                Object a = ii0.a(th);
                hi0.a(a);
                cancellableContinuation.resumeWith(a);
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                yl0.f(call2, C0059ao.a(2421));
                yl0.f(response, C0059ao.a(2422));
                if (response.isSuccessful()) {
                    T body = response.body();
                    hi0.a aVar = hi0.b;
                    hi0.a(body);
                    cancellableContinuation.resumeWith(body);
                    return;
                }
                HttpException httpException = new HttpException(response);
                hi0.a aVar2 = hi0.b;
                Object a = ii0.a(httpException);
                hi0.a(a);
                cancellableContinuation.resumeWith(a);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == bk0.b()) {
            ik0.b(wj0Var);
        }
        return result;
    }

    public static final <T> Object awaitResponse(Call<T> call, wj0<? super Response<T>> wj0Var) {
        CancellableContinuation cancellableContinuationImpl = new CancellableContinuationImpl(ak0.a(wj0Var), 1);
        final CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
        cancellableContinuation.invokeOnCancellation(new KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th) {
                yl0.f(call2, C0059ao.a(14939));
                yl0.f(th, C0059ao.a(14940));
                hi0.a aVar = hi0.b;
                Object a = ii0.a(th);
                hi0.a(a);
                cancellableContinuation.resumeWith(a);
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                yl0.f(call2, C0059ao.a(14941));
                yl0.f(response, C0059ao.a(14942));
                hi0.a aVar = hi0.b;
                hi0.a(response);
                cancellableContinuation.resumeWith(response);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == bk0.b()) {
            ik0.b(wj0Var);
        }
        return result;
    }

    public static final /* synthetic */ <T> T create(Retrofit retrofit) {
        yl0.f(retrofit, C0059ao.a(13648));
        yl0.i(4, C0059ao.a(13649));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object suspendAndThrow(final java.lang.Exception r4, defpackage.wj0<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = defpackage.bk0.b()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            defpackage.ii0.b(r5)
            goto L61
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r5 = 13650(0x3552, float:1.9128E-41)
            java.lang.String r5 = myunmn.C0059ao.a(r5)
            r4.<init>(r5)
            throw r4
        L3a:
            defpackage.ii0.b(r5)
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getDefault()
            yj0 r2 = r0.getContext()
            retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
            r3.<init>()
            r5.dispatch(r2, r3)
            java.lang.Object r4 = defpackage.bk0.b()
            java.lang.Object r5 = defpackage.bk0.b()
            if (r4 != r5) goto L5e
            defpackage.ik0.b(r0)
        L5e:
            if (r4 != r1) goto L61
            return r1
        L61:
            pi0 r4 = defpackage.pi0.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.suspendAndThrow(java.lang.Exception, wj0):java.lang.Object");
    }
}
