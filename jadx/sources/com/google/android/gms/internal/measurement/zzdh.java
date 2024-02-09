package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdg;
import com.google.android.gms.internal.measurement.zzdh;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzdh<MessageType extends zzdg<MessageType, BuilderType>, BuilderType extends zzdh<MessageType, BuilderType>> implements zzgi {
    public abstract BuilderType zza(MessageType messagetype);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzgi
    public final /* synthetic */ zzgi zza(zzgh zzghVar) {
        if (zzmm().getClass().isInstance(zzghVar)) {
            return zza((zzdh<MessageType, BuilderType>) ((zzdg) zzghVar));
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // 
    /* renamed from: zzjx */
    public abstract BuilderType clone();
}
