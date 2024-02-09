package okhttp3.internal.cache;

import java.io.IOException;
import myunmn.C0059ao;
import okhttp3.internal.Util;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends zl0 implements dl0<IOException, pi0> {
    public final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    @Override // defpackage.dl0
    public /* bridge */ /* synthetic */ pi0 invoke(IOException iOException) {
        invoke2(iOException);
        return pi0.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(IOException iOException) {
        yl0.e(iOException, C0059ao.a(7621));
        DiskLruCache diskLruCache = this.this$0;
        if (!Util.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
            this.this$0.hasJournalErrors = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(7622));
        Thread currentThread = Thread.currentThread();
        yl0.d(currentThread, C0059ao.a(7623));
        sb.append(currentThread.getName());
        sb.append(C0059ao.a(7624));
        sb.append(diskLruCache);
        throw new AssertionError(sb.toString());
    }
}
