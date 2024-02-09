package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzao extends com.google.android.gms.internal.measurement.zza implements zzam {
    public zzao(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zza(zzaj zzajVar, zzm zzmVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzc.zza(obtainAndWriteInterfaceToken, zzajVar);
        com.google.android.gms.internal.measurement.zzc.zza(obtainAndWriteInterfaceToken, zzmVar);
        zza(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zzb(zzm zzmVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzc.zza(obtainAndWriteInterfaceToken, zzmVar);
        zza(6, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final String zzc(zzm zzmVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzc.zza(obtainAndWriteInterfaceToken, zzmVar);
        Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final List<zzr> zzd(String str, String str2, String str3) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        obtainAndWriteInterfaceToken.writeString(str3);
        Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken);
        ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(zzr.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zzb(zzr zzrVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzc.zza(obtainAndWriteInterfaceToken, zzrVar);
        zza(13, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zza(zzga zzgaVar, zzm zzmVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzc.zza(obtainAndWriteInterfaceToken, zzgaVar);
        com.google.android.gms.internal.measurement.zzc.zza(obtainAndWriteInterfaceToken, zzmVar);
        zza(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zzd(zzm zzmVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzc.zza(obtainAndWriteInterfaceToken, zzmVar);
        zza(18, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zza(zzm zzmVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzc.zza(obtainAndWriteInterfaceToken, zzmVar);
        zza(4, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zza(zzaj zzajVar, String str, String str2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzc.zza(obtainAndWriteInterfaceToken, zzajVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zza(5, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final List<zzga> zza(zzm zzmVar, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzc.zza(obtainAndWriteInterfaceToken, zzmVar);
        com.google.android.gms.internal.measurement.zzc.writeBoolean(obtainAndWriteInterfaceToken, z);
        Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
        ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(zzga.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final byte[] zza(zzaj zzajVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzc.zza(obtainAndWriteInterfaceToken, zzajVar);
        obtainAndWriteInterfaceToken.writeString(str);
        Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
        byte[] createByteArray = transactAndReadException.createByteArray();
        transactAndReadException.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zza(long j, String str, String str2, String str3) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeLong(j);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        obtainAndWriteInterfaceToken.writeString(str3);
        zza(10, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zza(zzr zzrVar, zzm zzmVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzc.zza(obtainAndWriteInterfaceToken, zzrVar);
        com.google.android.gms.internal.measurement.zzc.zza(obtainAndWriteInterfaceToken, zzmVar);
        zza(12, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final List<zzga> zza(String str, String str2, boolean z, zzm zzmVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        com.google.android.gms.internal.measurement.zzc.writeBoolean(obtainAndWriteInterfaceToken, z);
        com.google.android.gms.internal.measurement.zzc.zza(obtainAndWriteInterfaceToken, zzmVar);
        Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken);
        ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(zzga.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final List<zzga> zza(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        obtainAndWriteInterfaceToken.writeString(str3);
        com.google.android.gms.internal.measurement.zzc.writeBoolean(obtainAndWriteInterfaceToken, z);
        Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken);
        ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(zzga.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final List<zzr> zza(String str, String str2, zzm zzmVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        com.google.android.gms.internal.measurement.zzc.zza(obtainAndWriteInterfaceToken, zzmVar);
        Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken);
        ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(zzr.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }
}
