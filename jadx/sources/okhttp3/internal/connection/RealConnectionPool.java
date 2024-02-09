package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;
import okhttp3.Address;
import okhttp3.ConnectionPool;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class RealConnectionPool {
    public static final Companion Companion = new Companion(null);
    private final TaskQueue cleanupQueue;
    private final RealConnectionPool$cleanupTask$1 cleanupTask;
    private final ConcurrentLinkedQueue<RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final RealConnectionPool get(ConnectionPool connectionPool) {
            yl0.e(connectionPool, C0059ao.a(12151));
            return connectionPool.getDelegate$okhttp();
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner, int i, long j, TimeUnit timeUnit) {
        yl0.e(taskRunner, C0059ao.a(2927));
        yl0.e(timeUnit, C0059ao.a(2928));
        this.maxIdleConnections = i;
        this.keepAliveDurationNs = timeUnit.toNanos(j);
        this.cleanupQueue = taskRunner.newQueue();
        final String str = Util.okHttpName + C0059ao.a(2929);
        this.cleanupTask = new Task(str) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                return RealConnectionPool.this.cleanup(System.nanoTime());
            }
        };
        this.connections = new ConcurrentLinkedQueue<>();
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException((C0059ao.a(2930) + j).toString());
    }

    private final int pruneAndGetAllocationCount(RealConnection realConnection, long j) {
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(2931));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(2932));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(2933));
            sb.append(realConnection);
            throw new AssertionError(sb.toString());
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        int i = 0;
        while (i < calls.size()) {
            Reference<RealCall> reference = calls.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                Objects.requireNonNull(reference, C0059ao.a(2934));
                Platform.Companion.get().logCloseableLeak(C0059ao.a(2935) + realConnection.route().address().url() + C0059ao.a(2936) + C0059ao.a(2937), ((RealCall.CallReference) reference).getCallStackTrace());
                calls.remove(i);
                realConnection.setNoNewExchanges(true);
                if (calls.isEmpty()) {
                    realConnection.setIdleAtNs(j - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return calls.size();
    }

    public final boolean callAcquirePooledConnection(Address address, RealCall realCall, List<Route> list, boolean z) {
        yl0.e(address, C0059ao.a(2938));
        yl0.e(realCall, C0059ao.a(2939));
        Iterator<RealConnection> it = this.connections.iterator();
        while (it.hasNext()) {
            RealConnection next = it.next();
            yl0.d(next, C0059ao.a(2940));
            synchronized (next) {
                if (z) {
                    if (!next.isMultiplexed$okhttp()) {
                        pi0 pi0Var = pi0.a;
                    }
                }
                if (next.isEligible$okhttp(address, list)) {
                    realCall.acquireConnectionNoEvents(next);
                    return true;
                }
                pi0 pi0Var2 = pi0.a;
            }
        }
        return false;
    }

    public final long cleanup(long j) {
        Iterator<RealConnection> it = this.connections.iterator();
        int i = 0;
        long j2 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i2 = 0;
        while (it.hasNext()) {
            RealConnection next = it.next();
            yl0.d(next, C0059ao.a(2941));
            synchronized (next) {
                if (pruneAndGetAllocationCount(next, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long idleAtNs = j - next.getIdleAtNs();
                    if (idleAtNs > j2) {
                        pi0 pi0Var = pi0.a;
                        realConnection = next;
                        j2 = idleAtNs;
                    } else {
                        pi0 pi0Var2 = pi0.a;
                    }
                }
            }
        }
        long j3 = this.keepAliveDurationNs;
        if (j2 < j3 && i <= this.maxIdleConnections) {
            if (i > 0) {
                return j3 - j2;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        yl0.c(realConnection);
        synchronized (realConnection) {
            if (!realConnection.getCalls().isEmpty()) {
                return 0L;
            }
            if (realConnection.getIdleAtNs() + j2 != j) {
                return 0L;
            }
            realConnection.setNoNewExchanges(true);
            this.connections.remove(realConnection);
            Util.closeQuietly(realConnection.socket());
            if (this.connections.isEmpty()) {
                this.cleanupQueue.cancelAll();
            }
            return 0L;
        }
    }

    public final boolean connectionBecameIdle(RealConnection realConnection) {
        yl0.e(realConnection, C0059ao.a(2942));
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(2943));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(2944));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(2945));
            sb.append(realConnection);
            throw new AssertionError(sb.toString());
        } else if (!realConnection.getNoNewExchanges() && this.maxIdleConnections != 0) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return false;
        } else {
            realConnection.setNoNewExchanges(true);
            this.connections.remove(realConnection);
            if (this.connections.isEmpty()) {
                this.cleanupQueue.cancelAll();
                return true;
            }
            return true;
        }
    }

    public final int connectionCount() {
        return this.connections.size();
    }

    public final void evictAll() {
        Socket socket;
        Iterator<RealConnection> it = this.connections.iterator();
        yl0.d(it, C0059ao.a(2946));
        while (it.hasNext()) {
            RealConnection next = it.next();
            yl0.d(next, C0059ao.a(2947));
            synchronized (next) {
                if (next.getCalls().isEmpty()) {
                    it.remove();
                    next.setNoNewExchanges(true);
                    socket = next.socket();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                Util.closeQuietly(socket);
            }
        }
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
    }

    public final int idleConnectionCount() {
        boolean isEmpty;
        ConcurrentLinkedQueue<RealConnection> concurrentLinkedQueue = this.connections;
        int i = 0;
        if (!(concurrentLinkedQueue instanceof Collection) || !concurrentLinkedQueue.isEmpty()) {
            for (RealConnection realConnection : concurrentLinkedQueue) {
                yl0.d(realConnection, C0059ao.a(2948));
                synchronized (realConnection) {
                    isEmpty = realConnection.getCalls().isEmpty();
                }
                if (isEmpty && (i = i + 1) < 0) {
                    aj0.m();
                    throw null;
                }
            }
        }
        return i;
    }

    public final void put(RealConnection realConnection) {
        yl0.e(realConnection, C0059ao.a(2949));
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(2950));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(2951));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(2952));
            sb.append(realConnection);
            throw new AssertionError(sb.toString());
        }
        this.connections.add(realConnection);
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
    }
}
