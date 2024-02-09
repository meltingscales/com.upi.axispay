package io.fabric.sdk.android;

import android.content.Context;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import io.fabric.sdk.android.services.concurrency.Task;
import java.io.File;
import java.util.Collection;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class Kit<Result> implements Comparable<Kit> {
    public Context context;
    public Fabric fabric;
    public IdManager idManager;
    public InitializationCallback<Result> initializationCallback;
    public InitializationTask<Result> initializationTask = new InitializationTask<>(this);
    public final DependsOn dependsOnAnnotation = (DependsOn) getClass().getAnnotation(DependsOn.class);

    public boolean containsAnnotatedDependency(Kit kit) {
        if (hasAnnotatedDependency()) {
            for (Class<?> cls : this.dependsOnAnnotation.value()) {
                if (cls.isAssignableFrom(kit.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract Result doInBackground();

    public Context getContext() {
        return this.context;
    }

    public Collection<Task> getDependencies() {
        return this.initializationTask.getDependencies();
    }

    public Fabric getFabric() {
        return this.fabric;
    }

    public IdManager getIdManager() {
        return this.idManager;
    }

    public abstract String getIdentifier();

    public String getPath() {
        return C0059ao.a(8593) + File.separator + getIdentifier();
    }

    public abstract String getVersion();

    public boolean hasAnnotatedDependency() {
        return this.dependsOnAnnotation != null;
    }

    public final void initialize() {
        this.initializationTask.executeOnExecutor(this.fabric.getExecutorService(), (Object[]) new Void[]{null});
    }

    public void injectParameters(Context context, Fabric fabric, InitializationCallback<Result> initializationCallback, IdManager idManager) {
        this.fabric = fabric;
        this.context = new FabricContext(context, getIdentifier(), getPath());
        this.initializationCallback = initializationCallback;
        this.idManager = idManager;
    }

    public void onCancelled(Result result) {
    }

    public void onPostExecute(Result result) {
    }

    public boolean onPreExecute() {
        return true;
    }

    @Override // java.lang.Comparable
    public int compareTo(Kit kit) {
        if (containsAnnotatedDependency(kit)) {
            return 1;
        }
        if (kit.containsAnnotatedDependency(this)) {
            return -1;
        }
        if (!hasAnnotatedDependency() || kit.hasAnnotatedDependency()) {
            return (hasAnnotatedDependency() || !kit.hasAnnotatedDependency()) ? 0 : -1;
        }
        return 1;
    }
}
