package io.fabric.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.vision.barcode.Barcode;
import io.fabric.sdk.android.ActivityLifecycleManager;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Fabric {
    public static final boolean DEFAULT_DEBUGGABLE = false;
    public static final Logger DEFAULT_LOGGER;
    public static final String ROOT_DIR = null;
    public static final String TAG = null;
    public static volatile Fabric singleton;
    private WeakReference<Activity> activity;
    private ActivityLifecycleManager activityLifecycleManager;
    private final Context context;
    public final boolean debuggable;
    private final ExecutorService executorService;
    private final IdManager idManager;
    private final InitializationCallback<Fabric> initializationCallback;
    private AtomicBoolean initialized = new AtomicBoolean(false);
    private final InitializationCallback<?> kitInitializationCallback;
    private final Map<Class<? extends Kit>, Kit> kits;
    public final Logger logger;
    private final Handler mainHandler;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class Builder {
        private String appIdentifier;
        private String appInstallIdentifier;
        private final Context context;
        private boolean debuggable;
        private Handler handler;
        private InitializationCallback<Fabric> initializationCallback;
        private Kit[] kits;
        private Logger logger;
        private PriorityThreadPoolExecutor threadPoolExecutor;

        public Builder(Context context) {
            if (context != null) {
                this.context = context;
                return;
            }
            throw new IllegalArgumentException(C0059ao.a(7640));
        }

        public Builder appIdentifier(String str) {
            if (str != null) {
                if (this.appIdentifier == null) {
                    this.appIdentifier = str;
                    return this;
                }
                throw new IllegalStateException(C0059ao.a(7641));
            }
            throw new IllegalArgumentException(C0059ao.a(7642));
        }

        public Builder appInstallIdentifier(String str) {
            if (str != null) {
                if (this.appInstallIdentifier == null) {
                    this.appInstallIdentifier = str;
                    return this;
                }
                throw new IllegalStateException(C0059ao.a(7643));
            }
            throw new IllegalArgumentException(C0059ao.a(7644));
        }

        public Fabric build() {
            Map kitMap;
            if (this.threadPoolExecutor == null) {
                this.threadPoolExecutor = PriorityThreadPoolExecutor.create();
            }
            if (this.handler == null) {
                this.handler = new Handler(Looper.getMainLooper());
            }
            if (this.logger == null) {
                if (this.debuggable) {
                    this.logger = new DefaultLogger(3);
                } else {
                    this.logger = new DefaultLogger();
                }
            }
            if (this.appIdentifier == null) {
                this.appIdentifier = this.context.getPackageName();
            }
            if (this.initializationCallback == null) {
                this.initializationCallback = InitializationCallback.EMPTY;
            }
            Kit[] kitArr = this.kits;
            if (kitArr != null) {
                kitMap = Fabric.getKitMap(Arrays.asList(kitArr));
            } else {
                kitMap = new HashMap();
            }
            Map map = kitMap;
            Context applicationContext = this.context.getApplicationContext();
            return new Fabric(applicationContext, map, this.threadPoolExecutor, this.handler, this.logger, this.debuggable, this.initializationCallback, new IdManager(applicationContext, this.appIdentifier, this.appInstallIdentifier, map.values()), Fabric.extractActivity(this.context));
        }

        public Builder debuggable(boolean z) {
            this.debuggable = z;
            return this;
        }

        @Deprecated
        public Builder executorService(ExecutorService executorService) {
            return this;
        }

        @Deprecated
        public Builder handler(Handler handler) {
            return this;
        }

        public Builder initializationCallback(InitializationCallback<Fabric> initializationCallback) {
            if (initializationCallback != null) {
                if (this.initializationCallback == null) {
                    this.initializationCallback = initializationCallback;
                    return this;
                }
                throw new IllegalStateException(C0059ao.a(7645));
            }
            throw new IllegalArgumentException(C0059ao.a(7646));
        }

        public Builder kits(Kit... kitArr) {
            if (this.kits == null) {
                this.kits = kitArr;
                return this;
            }
            throw new IllegalStateException(C0059ao.a(7647));
        }

        public Builder logger(Logger logger) {
            if (logger != null) {
                if (this.logger == null) {
                    this.logger = logger;
                    return this;
                }
                throw new IllegalStateException(C0059ao.a(7648));
            }
            throw new IllegalArgumentException(C0059ao.a(7649));
        }

        public Builder threadPoolExecutor(PriorityThreadPoolExecutor priorityThreadPoolExecutor) {
            if (priorityThreadPoolExecutor != null) {
                if (this.threadPoolExecutor == null) {
                    this.threadPoolExecutor = priorityThreadPoolExecutor;
                    return this;
                }
                throw new IllegalStateException(C0059ao.a(7650));
            }
            throw new IllegalArgumentException(C0059ao.a(7651));
        }
    }

    static {
        C0059ao.a(Fabric.class, Barcode.QR_CODE);
        DEFAULT_LOGGER = new DefaultLogger();
    }

    public Fabric(Context context, Map<Class<? extends Kit>, Kit> map, PriorityThreadPoolExecutor priorityThreadPoolExecutor, Handler handler, Logger logger, boolean z, InitializationCallback initializationCallback, IdManager idManager, Activity activity) {
        this.context = context;
        this.kits = map;
        this.executorService = priorityThreadPoolExecutor;
        this.mainHandler = handler;
        this.logger = logger;
        this.debuggable = z;
        this.initializationCallback = initializationCallback;
        this.kitInitializationCallback = createKitInitializationCallback(map.size());
        this.idManager = idManager;
        setCurrentActivity(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void addToKitMap(Map<Class<? extends Kit>, Kit> map, Collection<? extends Kit> collection) {
        for (Kit kit : collection) {
            map.put(kit.getClass(), kit);
            if (kit instanceof KitGroup) {
                addToKitMap(map, ((KitGroup) kit).getKits());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Activity extractActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public static <T extends Kit> T getKit(Class<T> cls) {
        return (T) singleton().kits.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<Class<? extends Kit>, Kit> getKitMap(Collection<? extends Kit> collection) {
        HashMap hashMap = new HashMap(collection.size());
        addToKitMap(hashMap, collection);
        return hashMap;
    }

    public static Logger getLogger() {
        if (singleton == null) {
            return DEFAULT_LOGGER;
        }
        return singleton.logger;
    }

    private void init() {
        ActivityLifecycleManager activityLifecycleManager = new ActivityLifecycleManager(this.context);
        this.activityLifecycleManager = activityLifecycleManager;
        activityLifecycleManager.registerCallbacks(new ActivityLifecycleManager.Callbacks() { // from class: io.fabric.sdk.android.Fabric.1
            @Override // io.fabric.sdk.android.ActivityLifecycleManager.Callbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                Fabric.this.setCurrentActivity(activity);
            }

            @Override // io.fabric.sdk.android.ActivityLifecycleManager.Callbacks
            public void onActivityResumed(Activity activity) {
                Fabric.this.setCurrentActivity(activity);
            }

            @Override // io.fabric.sdk.android.ActivityLifecycleManager.Callbacks
            public void onActivityStarted(Activity activity) {
                Fabric.this.setCurrentActivity(activity);
            }
        });
        initializeKits(this.context);
    }

    public static boolean isDebuggable() {
        if (singleton == null) {
            return false;
        }
        return singleton.debuggable;
    }

    public static boolean isInitialized() {
        return singleton != null && singleton.initialized.get();
    }

    private static void setFabric(Fabric fabric) {
        singleton = fabric;
        fabric.init();
    }

    public static Fabric singleton() {
        if (singleton != null) {
            return singleton;
        }
        throw new IllegalStateException(C0059ao.a(4004));
    }

    public static Fabric with(Context context, Kit... kitArr) {
        if (singleton == null) {
            synchronized (Fabric.class) {
                if (singleton == null) {
                    setFabric(new Builder(context).kits(kitArr).build());
                }
            }
        }
        return singleton;
    }

    public void addAnnotatedDependencies(Map<Class<? extends Kit>, Kit> map, Kit kit) {
        Class<?>[] value;
        DependsOn dependsOn = kit.dependsOnAnnotation;
        if (dependsOn != null) {
            for (Class<?> cls : dependsOn.value()) {
                if (cls.isInterface()) {
                    for (Kit kit2 : map.values()) {
                        if (cls.isAssignableFrom(kit2.getClass())) {
                            kit.initializationTask.addDependency(kit2.initializationTask);
                        }
                    }
                } else if (map.get(cls) != null) {
                    kit.initializationTask.addDependency(map.get(cls).initializationTask);
                } else {
                    throw new UnmetDependencyException(C0059ao.a(4005));
                }
            }
        }
    }

    public InitializationCallback<?> createKitInitializationCallback(int i) {
        return new InitializationCallback(i) { // from class: io.fabric.sdk.android.Fabric.2
            public final CountDownLatch kitInitializedLatch;
            public final /* synthetic */ int val$size;

            {
                this.val$size = i;
                this.kitInitializedLatch = new CountDownLatch(i);
            }

            @Override // io.fabric.sdk.android.InitializationCallback
            public void failure(Exception exc) {
                Fabric.this.initializationCallback.failure(exc);
            }

            @Override // io.fabric.sdk.android.InitializationCallback
            public void success(Object obj) {
                this.kitInitializedLatch.countDown();
                if (this.kitInitializedLatch.getCount() == 0) {
                    Fabric.this.initialized.set(true);
                    Fabric.this.initializationCallback.success(Fabric.this);
                }
            }
        };
    }

    public ActivityLifecycleManager getActivityLifecycleManager() {
        return this.activityLifecycleManager;
    }

    public String getAppIdentifier() {
        return this.idManager.getAppIdentifier();
    }

    public String getAppInstallIdentifier() {
        return this.idManager.getAppInstallIdentifier();
    }

    public Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.activity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public String getIdentifier() {
        return C0059ao.a(4006);
    }

    public Collection<Kit> getKits() {
        return this.kits.values();
    }

    public Future<Map<String, KitInfo>> getKitsFinderFuture(Context context) {
        return getExecutorService().submit(new FabricKitsFinder(context.getPackageCodePath()));
    }

    public Handler getMainHandler() {
        return this.mainHandler;
    }

    public String getVersion() {
        return C0059ao.a(4007);
    }

    public void initializeKits(Context context) {
        StringBuilder sb;
        Future<Map<String, KitInfo>> kitsFinderFuture = getKitsFinderFuture(context);
        Collection<Kit> kits = getKits();
        Onboarding onboarding = new Onboarding(kitsFinderFuture, kits);
        ArrayList<Kit> arrayList = new ArrayList(kits);
        Collections.sort(arrayList);
        onboarding.injectParameters(context, this, InitializationCallback.EMPTY, this.idManager);
        for (Kit kit : arrayList) {
            kit.injectParameters(context, this, this.kitInitializationCallback, this.idManager);
        }
        onboarding.initialize();
        Logger logger = getLogger();
        String a = C0059ao.a(4008);
        boolean isLoggable = logger.isLoggable(a, 3);
        String a2 = C0059ao.a(4009);
        if (isLoggable) {
            sb = new StringBuilder(C0059ao.a(4010));
            sb.append(getIdentifier());
            sb.append(a2);
            sb.append(getVersion());
            sb.append(C0059ao.a(4011));
        } else {
            sb = null;
        }
        for (Kit kit2 : arrayList) {
            kit2.initializationTask.addDependency(onboarding.initializationTask);
            addAnnotatedDependencies(this.kits, kit2);
            kit2.initialize();
            if (sb != null) {
                sb.append(kit2.getIdentifier());
                sb.append(a2);
                sb.append(kit2.getVersion());
                sb.append(C0059ao.a(4012));
            }
        }
        if (sb != null) {
            getLogger().d(a, sb.toString());
        }
    }

    public Fabric setCurrentActivity(Activity activity) {
        this.activity = new WeakReference<>(activity);
        return this;
    }

    public static Fabric with(Fabric fabric) {
        if (singleton == null) {
            synchronized (Fabric.class) {
                if (singleton == null) {
                    setFabric(fabric);
                }
            }
        }
        return singleton;
    }
}
