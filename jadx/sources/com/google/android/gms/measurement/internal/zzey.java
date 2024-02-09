package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: AxisPay */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzey implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzeg zzqq;
    private volatile boolean zzqw;
    private volatile zzat zzqx;

    public zzey(zzeg zzegVar) {
        this.zzqq = zzegVar;
    }

    public static /* synthetic */ boolean zza(zzey zzeyVar, boolean z) {
        zzeyVar.zzqw = false;
        return false;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.zzqq.zzac().zza(new zzfb(this, this.zzqx.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzqx = null;
                this.zzqw = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzau zzei = this.zzqq.zzl.zzei();
        if (zzei != null) {
            zzei.zzdd().zza("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzqw = false;
            this.zzqx = null;
        }
        this.zzqq.zzac().zza(new zzfd(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.zzqq.zzad().zzdh().zzaq("Service connection suspended");
        this.zzqq.zzac().zza(new zzfc(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzey zzeyVar;
        zzam zzaoVar;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.zzqw = false;
                this.zzqq.zzad().zzda().zzaq("Service connected with null binder");
                return;
            }
            zzam zzamVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        if (queryLocalInterface instanceof zzam) {
                            zzaoVar = (zzam) queryLocalInterface;
                        } else {
                            zzaoVar = new zzao(iBinder);
                        }
                        zzamVar = zzaoVar;
                    }
                    this.zzqq.zzad().zzdi().zzaq("Bound to IMeasurementService interface");
                } else {
                    this.zzqq.zzad().zzda().zza("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.zzqq.zzad().zzda().zzaq("Service connect failed to get IMeasurementService");
            }
            if (zzamVar == null) {
                this.zzqw = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    Context context = this.zzqq.getContext();
                    zzeyVar = this.zzqq.zzqj;
                    connectionTracker.unbindService(context, zzeyVar);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.zzqq.zzac().zza(new zzez(this, zzamVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.zzqq.zzad().zzdh().zzaq("Service disconnected");
        this.zzqq.zzac().zza(new zzfa(this, componentName));
    }

    public final void zzb(Intent intent) {
        zzey zzeyVar;
        this.zzqq.zzq();
        Context context = this.zzqq.getContext();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.zzqw) {
                this.zzqq.zzad().zzdi().zzaq("Connection attempt already in progress");
                return;
            }
            this.zzqq.zzad().zzdi().zzaq("Using local app measurement service");
            this.zzqw = true;
            zzeyVar = this.zzqq.zzqj;
            connectionTracker.bindService(context, intent, zzeyVar, 129);
        }
    }

    public final void zzfl() {
        if (this.zzqx != null && (this.zzqx.isConnected() || this.zzqx.isConnecting())) {
            this.zzqx.disconnect();
        }
        this.zzqx = null;
    }

    public final void zzfm() {
        this.zzqq.zzq();
        Context context = this.zzqq.getContext();
        synchronized (this) {
            if (this.zzqw) {
                this.zzqq.zzad().zzdi().zzaq("Connection attempt already in progress");
            } else if (this.zzqx != null && (this.zzqx.isConnecting() || this.zzqx.isConnected())) {
                this.zzqq.zzad().zzdi().zzaq("Already awaiting connection attempt");
            } else {
                this.zzqx = new zzat(context, Looper.getMainLooper(), this, this);
                this.zzqq.zzad().zzdi().zzaq("Connecting to remote service");
                this.zzqw = true;
                this.zzqx.checkAvailabilityAndConnect();
            }
        }
    }
}
