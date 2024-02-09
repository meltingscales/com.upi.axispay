package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PriorityFutureTask<V> extends FutureTask<V> implements Dependency<Task>, PriorityProvider, Task, DelegateProvider {
    public final Object delegate;

    public PriorityFutureTask(Callable<V> callable) {
        super(callable);
        this.delegate = checkAndInitDelegate(callable);
    }

    @Override // io.fabric.sdk.android.services.concurrency.Dependency
    public boolean areDependenciesMet() {
        return ((Dependency) ((PriorityProvider) getDelegate())).areDependenciesMet();
    }

    /* JADX WARN: Incorrect return type in method signature: <T::Lio/fabric/sdk/android/services/concurrency/Dependency<Lio/fabric/sdk/android/services/concurrency/Task;>;:Lio/fabric/sdk/android/services/concurrency/PriorityProvider;:Lio/fabric/sdk/android/services/concurrency/Task;>(Ljava/lang/Object;)TT; */
    public Dependency checkAndInitDelegate(Object obj) {
        if (PriorityTask.isProperDelegate(obj)) {
            return (Dependency) obj;
        }
        return new PriorityTask();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return ((PriorityProvider) getDelegate()).compareTo(obj);
    }

    /* JADX WARN: Incorrect return type in method signature: <T::Lio/fabric/sdk/android/services/concurrency/Dependency<Lio/fabric/sdk/android/services/concurrency/Task;>;:Lio/fabric/sdk/android/services/concurrency/PriorityProvider;:Lio/fabric/sdk/android/services/concurrency/Task;>()TT; */
    public Dependency getDelegate() {
        return (Dependency) this.delegate;
    }

    @Override // io.fabric.sdk.android.services.concurrency.Dependency
    public Collection<Task> getDependencies() {
        return ((Dependency) ((PriorityProvider) getDelegate())).getDependencies();
    }

    @Override // io.fabric.sdk.android.services.concurrency.Task
    public Throwable getError() {
        return ((Task) ((PriorityProvider) getDelegate())).getError();
    }

    @Override // io.fabric.sdk.android.services.concurrency.PriorityProvider
    public Priority getPriority() {
        return ((PriorityProvider) getDelegate()).getPriority();
    }

    @Override // io.fabric.sdk.android.services.concurrency.Task
    public boolean isFinished() {
        return ((Task) ((PriorityProvider) getDelegate())).isFinished();
    }

    @Override // io.fabric.sdk.android.services.concurrency.Task
    public void setError(Throwable th) {
        ((Task) ((PriorityProvider) getDelegate())).setError(th);
    }

    @Override // io.fabric.sdk.android.services.concurrency.Task
    public void setFinished(boolean z) {
        ((Task) ((PriorityProvider) getDelegate())).setFinished(z);
    }

    @Override // io.fabric.sdk.android.services.concurrency.Dependency
    public void addDependency(Task task) {
        ((Dependency) ((PriorityProvider) getDelegate())).addDependency(task);
    }

    public PriorityFutureTask(Runnable runnable, V v) {
        super(runnable, v);
        this.delegate = checkAndInitDelegate(runnable);
    }
}
