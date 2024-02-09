package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zzd;
import com.google.firebase.analytics.connector.internal.zzf;
import com.google.firebase.events.Event;
import com.google.firebase.events.Subscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AnalyticsConnectorImpl implements AnalyticsConnector {
    private static volatile AnalyticsConnector zzaat;
    @VisibleForTesting
    private final AppMeasurement zzaau;
    @VisibleForTesting
    public final Map<String, com.google.firebase.analytics.connector.internal.zza> zzaav;

    private AnalyticsConnectorImpl(AppMeasurement appMeasurement) {
        Preconditions.checkNotNull(appMeasurement);
        this.zzaau = appMeasurement;
        this.zzaav = new ConcurrentHashMap();
    }

    @KeepForSdk
    public static AnalyticsConnector getInstance(FirebaseApp firebaseApp, Context context, Subscriber subscriber) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(subscriber);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzaat == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                if (zzaat == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp.isDefaultApp()) {
                        subscriber.subscribe(DataCollectionDefaultChange.class, zza.zzaaw, zzb.zzaax);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                    }
                    zzaat = new AnalyticsConnectorImpl(AppMeasurement.zza(context, bundle));
                }
            }
        }
        return zzaat;
    }

    public static final /* synthetic */ void zza(Event event) {
        boolean z = ((DataCollectionDefaultChange) event.getPayload()).enabled;
        synchronized (AnalyticsConnectorImpl.class) {
            ((AnalyticsConnectorImpl) zzaat).zzaau.zza(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzcf(String str) {
        return (str.isEmpty() || !this.zzaav.containsKey(str) || this.zzaav.get(str) == null) ? false : true;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || zzc.zza(str2, bundle)) {
            this.zzaau.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public List<AnalyticsConnector.ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (AppMeasurement.ConditionalUserProperty conditionalUserProperty : this.zzaau.getConditionalUserProperties(str, str2)) {
            arrayList.add(zzc.zzb(conditionalUserProperty));
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public int getMaxUserProperties(String str) {
        return this.zzaau.getMaxUserProperties(str);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public Map<String, Object> getUserProperties(boolean z) {
        return this.zzaau.getUserProperties(z);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void logEvent(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (zzc.zzcg(str) && zzc.zza(str2, bundle) && zzc.zzb(str, str2, bundle)) {
            this.zzaau.logEventInternal(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(final String str, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        com.google.firebase.analytics.connector.internal.zza zzfVar;
        Preconditions.checkNotNull(analyticsConnectorListener);
        if (zzc.zzcg(str) && !zzcf(str)) {
            AppMeasurement appMeasurement = this.zzaau;
            if ("fiam".equals(str)) {
                zzfVar = new zzd(appMeasurement, analyticsConnectorListener);
            } else {
                zzfVar = "crash".equals(str) ? new zzf(appMeasurement, analyticsConnectorListener) : null;
            }
            if (zzfVar != null) {
                this.zzaav.put(str, zzfVar);
                return new AnalyticsConnector.AnalyticsConnectorHandle() { // from class: com.google.firebase.analytics.connector.AnalyticsConnectorImpl.1
                    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                    @KeepForSdk
                    public void registerEventNames(Set<String> set) {
                        if (!AnalyticsConnectorImpl.this.zzcf(str) || !str.equals("fiam") || set == null || set.isEmpty()) {
                            return;
                        }
                        AnalyticsConnectorImpl.this.zzaav.get(str).registerEventNames(set);
                    }

                    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                    public void unregister() {
                        if (AnalyticsConnectorImpl.this.zzcf(str)) {
                            AnalyticsConnector.AnalyticsConnectorListener zzju = AnalyticsConnectorImpl.this.zzaav.get(str).zzju();
                            if (zzju != null) {
                                zzju.onMessageTriggered(0, null);
                            }
                            AnalyticsConnectorImpl.this.zzaav.remove(str);
                        }
                    }

                    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                    @KeepForSdk
                    public void unregisterEventNames() {
                        if (AnalyticsConnectorImpl.this.zzcf(str) && str.equals("fiam")) {
                            AnalyticsConnectorImpl.this.zzaav.get(str).unregisterEventNames();
                        }
                    }
                };
            }
            return null;
        }
        return null;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void setConditionalUserProperty(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        if (zzc.zza(conditionalUserProperty)) {
            this.zzaau.setConditionalUserProperty(zzc.zzb(conditionalUserProperty));
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void setUserProperty(String str, String str2, Object obj) {
        if (zzc.zzcg(str) && zzc.zzu(str, str2)) {
            this.zzaau.setUserPropertyInternal(str, str2, obj);
        }
    }

    @KeepForSdk
    public static AnalyticsConnector getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    @KeepForSdk
    public static AnalyticsConnector getInstance(FirebaseApp firebaseApp) {
        return (AnalyticsConnector) firebaseApp.get(AnalyticsConnector.class);
    }
}
