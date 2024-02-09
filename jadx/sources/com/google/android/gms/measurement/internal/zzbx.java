package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbx extends Thread {
    private final /* synthetic */ zzbt zzni;
    private final Object zznl;
    private final BlockingQueue<zzbw<?>> zznm;

    public zzbx(zzbt zzbtVar, String str, BlockingQueue<zzbw<?>> blockingQueue) {
        this.zzni = zzbtVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zznl = new Object();
        this.zznm = blockingQueue;
        setName(str);
    }

    private final void zza(InterruptedException interruptedException) {
        this.zzni.zzad().zzdd().zza(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzbx zzbxVar;
        zzbx zzbxVar2;
        Object obj3;
        Object obj4;
        Semaphore semaphore2;
        Object obj5;
        zzbx zzbxVar3;
        zzbx zzbxVar4;
        boolean z;
        Semaphore semaphore3;
        boolean z2 = false;
        while (!z2) {
            try {
                semaphore3 = this.zzni.zzne;
                semaphore3.acquire();
                z2 = true;
            } catch (InterruptedException e) {
                zza(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzbw<?> poll = this.zznm.poll();
                if (poll != null) {
                    Process.setThreadPriority(poll.zznk ? threadPriority : 10);
                    poll.run();
                } else {
                    synchronized (this.zznl) {
                        if (this.zznm.peek() == null) {
                            z = this.zzni.zznf;
                            if (!z) {
                                try {
                                    this.zznl.wait(30000L);
                                } catch (InterruptedException e2) {
                                    zza(e2);
                                }
                            }
                        }
                    }
                    obj3 = this.zzni.zznd;
                    synchronized (obj3) {
                        if (this.zznm.peek() == null) {
                            break;
                        }
                    }
                }
            }
            obj4 = this.zzni.zznd;
            synchronized (obj4) {
                semaphore2 = this.zzni.zzne;
                semaphore2.release();
                obj5 = this.zzni.zznd;
                obj5.notifyAll();
                zzbxVar3 = this.zzni.zzmx;
                if (this != zzbxVar3) {
                    zzbxVar4 = this.zzni.zzmy;
                    if (this == zzbxVar4) {
                        zzbt.zzb(this.zzni, null);
                    } else {
                        this.zzni.zzad().zzda().zzaq("Current scheduler thread is neither worker nor network");
                    }
                } else {
                    zzbt.zza(this.zzni, null);
                }
            }
        } catch (Throwable th) {
            obj = this.zzni.zznd;
            synchronized (obj) {
                semaphore = this.zzni.zzne;
                semaphore.release();
                obj2 = this.zzni.zznd;
                obj2.notifyAll();
                zzbxVar = this.zzni.zzmx;
                if (this != zzbxVar) {
                    zzbxVar2 = this.zzni.zzmy;
                    if (this == zzbxVar2) {
                        zzbt.zzb(this.zzni, null);
                    } else {
                        this.zzni.zzad().zzda().zzaq("Current scheduler thread is neither worker nor network");
                    }
                } else {
                    zzbt.zza(this.zzni, null);
                }
                throw th;
            }
        }
    }

    public final void zzeh() {
        synchronized (this.zznl) {
            this.zznl.notifyAll();
        }
    }
}
