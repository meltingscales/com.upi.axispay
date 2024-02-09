package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzo extends zzb implements zzn {
    public zzo() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzn asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof zzn) {
            return (zzn) queryLocalInterface;
        }
        return new zzp(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzq zzsVar;
        zzq zzqVar;
        zzq zzqVar2 = null;
        zzq zzqVar3 = null;
        zzq zzqVar4 = null;
        zzt zztVar = null;
        zzt zztVar2 = null;
        zzt zztVar3 = null;
        zzq zzqVar5 = null;
        zzq zzqVar6 = null;
        zzq zzqVar7 = null;
        zzq zzqVar8 = null;
        zzq zzqVar9 = null;
        zzq zzqVar10 = null;
        zzw zzwVar = null;
        zzq zzqVar11 = null;
        zzq zzqVar12 = null;
        zzq zzqVar13 = null;
        zzq zzqVar14 = null;
        switch (i) {
            case 1:
                initialize(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzy) zzc.zza(parcel, zzy.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) zzc.zza(parcel, Bundle.CREATOR), zzc.zza(parcel), zzc.zza(parcel), parcel.readLong());
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzq) {
                        zzsVar = (zzq) queryLocalInterface;
                    } else {
                        zzsVar = new zzs(readStrongBinder);
                    }
                    zzqVar = zzsVar;
                }
                logEventAndBundle(readString, readString2, bundle, zzqVar, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzc.zza(parcel), parcel.readLong());
                break;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean zza = zzc.zza(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof zzq) {
                        zzqVar2 = (zzq) queryLocalInterface2;
                    } else {
                        zzqVar2 = new zzs(readStrongBinder2);
                    }
                }
                getUserProperties(readString3, readString4, zza, zzqVar2);
                break;
            case 6:
                String readString5 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof zzq) {
                        zzqVar14 = (zzq) queryLocalInterface3;
                    } else {
                        zzqVar14 = new zzs(readStrongBinder3);
                    }
                }
                getMaxUserProperties(readString5, zzqVar14);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) zzc.zza(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof zzq) {
                        zzqVar13 = (zzq) queryLocalInterface4;
                    } else {
                        zzqVar13 = new zzs(readStrongBinder4);
                    }
                }
                getConditionalUserProperties(readString6, readString7, zzqVar13);
                break;
            case 11:
                setMeasurementEnabled(zzc.zza(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof zzq) {
                        zzqVar12 = (zzq) queryLocalInterface5;
                    } else {
                        zzqVar12 = new zzs(readStrongBinder5);
                    }
                }
                getCurrentScreenName(zzqVar12);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof zzq) {
                        zzqVar11 = (zzq) queryLocalInterface6;
                    } else {
                        zzqVar11 = new zzs(readStrongBinder6);
                    }
                }
                getCurrentScreenClass(zzqVar11);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof zzw) {
                        zzwVar = (zzw) queryLocalInterface7;
                    } else {
                        zzwVar = new zzx(readStrongBinder7);
                    }
                }
                setInstanceIdProvider(zzwVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof zzq) {
                        zzqVar10 = (zzq) queryLocalInterface8;
                    } else {
                        zzqVar10 = new zzs(readStrongBinder8);
                    }
                }
                getCachedAppInstanceId(zzqVar10);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof zzq) {
                        zzqVar9 = (zzq) queryLocalInterface9;
                    } else {
                        zzqVar9 = new zzs(readStrongBinder9);
                    }
                }
                getAppInstanceId(zzqVar9);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof zzq) {
                        zzqVar8 = (zzq) queryLocalInterface10;
                    } else {
                        zzqVar8 = new zzs(readStrongBinder10);
                    }
                }
                getGmpAppId(zzqVar8);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof zzq) {
                        zzqVar7 = (zzq) queryLocalInterface11;
                    } else {
                        zzqVar7 = new zzs(readStrongBinder11);
                    }
                }
                generateEventId(zzqVar7);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                onActivityStarted(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                onActivityStopped(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                onActivityCreated(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (Bundle) zzc.zza(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                onActivityDestroyed(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                onActivityPaused(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                onActivityResumed(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof zzq) {
                        zzqVar6 = (zzq) queryLocalInterface12;
                    } else {
                        zzqVar6 = new zzs(readStrongBinder12);
                    }
                }
                onActivitySaveInstanceState(asInterface, zzqVar6, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof zzq) {
                        zzqVar5 = (zzq) queryLocalInterface13;
                    } else {
                        zzqVar5 = new zzs(readStrongBinder13);
                    }
                }
                performAction(bundle2, zzqVar5, parcel.readLong());
                break;
            case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                logHealthData(parcel.readInt(), parcel.readString(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof zzt) {
                        zztVar3 = (zzt) queryLocalInterface14;
                    } else {
                        zztVar3 = new zzv(readStrongBinder14);
                    }
                }
                setEventInterceptor(zztVar3);
                break;
            case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof zzt) {
                        zztVar2 = (zzt) queryLocalInterface15;
                    } else {
                        zztVar2 = new zzv(readStrongBinder15);
                    }
                }
                registerOnMeasurementEventListener(zztVar2);
                break;
            case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof zzt) {
                        zztVar = (zzt) queryLocalInterface16;
                    } else {
                        zztVar = new zzv(readStrongBinder16);
                    }
                }
                unregisterOnMeasurementEventListener(zztVar);
                break;
            case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                initForTests(zzc.zzb(parcel));
                break;
            case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof zzq) {
                        zzqVar4 = (zzq) queryLocalInterface17;
                    } else {
                        zzqVar4 = new zzs(readStrongBinder17);
                    }
                }
                getTestFlag(zzqVar4, parcel.readInt());
                break;
            case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                setDataCollectionEnabled(zzc.zza(parcel));
                break;
            case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof zzq) {
                        zzqVar3 = (zzq) queryLocalInterface18;
                    } else {
                        zzqVar3 = new zzs(readStrongBinder18);
                    }
                }
                isDataCollectionEnabled(zzqVar3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
