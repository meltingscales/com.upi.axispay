package com.google.android.gms.measurement.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbw<V> extends FutureTask<V> implements Comparable<zzbw> {
    private final String zznh;
    private final /* synthetic */ zzbt zzni;
    private final long zznj;
    public final boolean zznk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbw(zzbt zzbtVar, Callable<V> callable, boolean z, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.zzni = zzbtVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzbt.zzng;
        long andIncrement = atomicLong.getAndIncrement();
        this.zznj = andIncrement;
        this.zznh = str;
        this.zznk = z;
        if (andIncrement == RecyclerView.FOREVER_NS) {
            zzbtVar.zzad().zzda().zzaq("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzbw zzbwVar) {
        zzbw zzbwVar2 = zzbwVar;
        boolean z = this.zznk;
        if (z != zzbwVar2.zznk) {
            return z ? -1 : 1;
        }
        long j = this.zznj;
        long j2 = zzbwVar2.zznj;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.zzni.zzad().zzdb().zza("Two tasks share the same index. index", Long.valueOf(this.zznj));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.zzni.zzad().zzda().zza(this.zznh, th);
        if (th instanceof zzbu) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbw(zzbt zzbtVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.zzni = zzbtVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzbt.zzng;
        long andIncrement = atomicLong.getAndIncrement();
        this.zznj = andIncrement;
        this.zznh = str;
        this.zznk = false;
        if (andIncrement == RecyclerView.FOREVER_NS) {
            zzbtVar.zzad().zzda().zzaq("Tasks index overflow");
        }
    }
}
