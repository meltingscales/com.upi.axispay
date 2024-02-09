package io.fabric.sdk.android.services.concurrency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PriorityTask implements Dependency<Task>, PriorityProvider, Task {
    private final List<Task> dependencies = new ArrayList();
    private final AtomicBoolean hasRun = new AtomicBoolean(false);
    private final AtomicReference<Throwable> throwable = new AtomicReference<>(null);

    public static boolean isProperDelegate(Object obj) {
        try {
            return (((Dependency) obj) == null || ((Task) obj) == null || ((PriorityProvider) obj) == null) ? false : true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // io.fabric.sdk.android.services.concurrency.Dependency
    public boolean areDependenciesMet() {
        for (Task task : getDependencies()) {
            if (!task.isFinished()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return Priority.compareTo(this, obj);
    }

    @Override // io.fabric.sdk.android.services.concurrency.Dependency
    public synchronized Collection<Task> getDependencies() {
        return Collections.unmodifiableCollection(this.dependencies);
    }

    @Override // io.fabric.sdk.android.services.concurrency.Task
    public Throwable getError() {
        return this.throwable.get();
    }

    public Priority getPriority() {
        return Priority.NORMAL;
    }

    @Override // io.fabric.sdk.android.services.concurrency.Task
    public boolean isFinished() {
        return this.hasRun.get();
    }

    @Override // io.fabric.sdk.android.services.concurrency.Task
    public void setError(Throwable th) {
        this.throwable.set(th);
    }

    @Override // io.fabric.sdk.android.services.concurrency.Task
    public synchronized void setFinished(boolean z) {
        this.hasRun.set(z);
    }

    @Override // io.fabric.sdk.android.services.concurrency.Dependency
    public synchronized void addDependency(Task task) {
        this.dependencies.add(task);
    }
}
