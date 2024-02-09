package okhttp3;

import com.google.android.gms.common.api.Api;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Dispatcher {
    private ExecutorService executorServiceOrNull;
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;
    private final ArrayDeque<RealCall> runningSyncCalls;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    private final RealCall.AsyncCall findExistingCallWithHost(String str) {
        Iterator<RealCall.AsyncCall> it = this.runningAsyncCalls.iterator();
        while (it.hasNext()) {
            RealCall.AsyncCall next = it.next();
            if (yl0.a(next.getHost(), str)) {
                return next;
            }
        }
        Iterator<RealCall.AsyncCall> it2 = this.readyAsyncCalls.iterator();
        while (it2.hasNext()) {
            RealCall.AsyncCall next2 = it2.next();
            if (yl0.a(next2.getHost(), str)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void finished(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.idleCallback;
                pi0 pi0Var = pi0.a;
            } else {
                throw new AssertionError(C0059ao.a(1380));
            }
        }
        if (promoteAndExecute() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean promoteAndExecute() {
        int i;
        boolean z;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(1381));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(1382));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(1383));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            yl0.d(it, C0059ao.a(1384));
            while (it.hasNext()) {
                RealCall.AsyncCall next = it.next();
                if (this.runningAsyncCalls.size() >= this.maxRequests) {
                    break;
                } else if (next.getCallsPerHost().get() < this.maxRequestsPerHost) {
                    it.remove();
                    next.getCallsPerHost().incrementAndGet();
                    yl0.d(next, C0059ao.a(1385));
                    arrayList.add(next);
                    this.runningAsyncCalls.add(next);
                }
            }
            z = runningCallsCount() > 0;
            pi0 pi0Var = pi0.a;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((RealCall.AsyncCall) arrayList.get(i)).executeOn(executorService());
        }
        return z;
    }

    /* renamed from: -deprecated_executorService  reason: not valid java name */
    public final ExecutorService m280deprecated_executorService() {
        return executorService();
    }

    public final synchronized void cancelAll() {
        Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
        while (it.hasNext()) {
            it.next().getCall().cancel();
        }
        Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
        while (it2.hasNext()) {
            it2.next().getCall().cancel();
        }
        Iterator<RealCall> it3 = this.runningSyncCalls.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public final void enqueue$okhttp(RealCall.AsyncCall asyncCall) {
        RealCall.AsyncCall findExistingCallWithHost;
        yl0.e(asyncCall, C0059ao.a(1386));
        synchronized (this) {
            this.readyAsyncCalls.add(asyncCall);
            if (!asyncCall.getCall().getForWebSocket() && (findExistingCallWithHost = findExistingCallWithHost(asyncCall.getHost())) != null) {
                asyncCall.reuseCallsPerHostFrom(findExistingCallWithHost);
            }
            pi0 pi0Var = pi0.a;
        }
        promoteAndExecute();
    }

    public final synchronized void executed$okhttp(RealCall realCall) {
        yl0.e(realCall, C0059ao.a(1387));
        this.runningSyncCalls.add(realCall);
    }

    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        if (this.executorServiceOrNull == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            this.executorServiceOrNull = new ThreadPoolExecutor(0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, timeUnit, synchronousQueue, Util.threadFactory(Util.okHttpName + C0059ao.a(1388), false));
        }
        executorService = this.executorServiceOrNull;
        yl0.c(executorService);
        return executorService;
    }

    public final void finished$okhttp(RealCall.AsyncCall asyncCall) {
        yl0.e(asyncCall, C0059ao.a(1389));
        asyncCall.getCallsPerHost().decrementAndGet();
        finished(this.runningAsyncCalls, asyncCall);
    }

    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final synchronized List<Call> queuedCalls() {
        List<Call> unmodifiableList;
        ArrayDeque<RealCall.AsyncCall> arrayDeque = this.readyAsyncCalls;
        ArrayList arrayList = new ArrayList(bj0.o(arrayDeque, 10));
        for (RealCall.AsyncCall asyncCall : arrayDeque) {
            arrayList.add(asyncCall.getCall());
        }
        unmodifiableList = Collections.unmodifiableList(arrayList);
        yl0.d(unmodifiableList, C0059ao.a(1391));
        return unmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public final synchronized List<Call> runningCalls() {
        List<Call> unmodifiableList;
        ArrayDeque<RealCall> arrayDeque = this.runningSyncCalls;
        ArrayDeque<RealCall.AsyncCall> arrayDeque2 = this.runningAsyncCalls;
        ArrayList arrayList = new ArrayList(bj0.o(arrayDeque2, 10));
        for (RealCall.AsyncCall asyncCall : arrayDeque2) {
            arrayList.add(asyncCall.getCall());
        }
        unmodifiableList = Collections.unmodifiableList(ij0.C(arrayDeque, arrayList));
        yl0.d(unmodifiableList, C0059ao.a(1392));
        return unmodifiableList;
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void setMaxRequests(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.maxRequests = i;
                pi0 pi0Var = pi0.a;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException((C0059ao.a(1393) + i).toString());
    }

    public final void setMaxRequestsPerHost(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.maxRequestsPerHost = i;
                pi0 pi0Var = pi0.a;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException((C0059ao.a(1394) + i).toString());
    }

    public final void finished$okhttp(RealCall realCall) {
        yl0.e(realCall, C0059ao.a(1390));
        finished(this.runningSyncCalls, realCall);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dispatcher(ExecutorService executorService) {
        this();
        yl0.e(executorService, C0059ao.a(1379));
        this.executorServiceOrNull = executorService;
    }
}
