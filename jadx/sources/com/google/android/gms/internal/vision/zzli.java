package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzli extends zzlo {
    private final /* synthetic */ zzlh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzli(zzlh zzlhVar) {
        super(zzlhVar, null);
        this.zza = zzlhVar;
    }

    @Override // com.google.android.gms.internal.vision.zzlo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzlj(this.zza, null);
    }

    public /* synthetic */ zzli(zzlh zzlhVar, zzlg zzlgVar) {
        this(zzlhVar);
    }
}
