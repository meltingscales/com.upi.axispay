package okhttp3.internal.cache;

import java.io.IOException;
import myunmn.C0059ao;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 extends zl0 implements dl0<IOException, pi0> {
    public final /* synthetic */ int $index$inlined;
    public final /* synthetic */ DiskLruCache.Editor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1(DiskLruCache.Editor editor, int i) {
        super(1);
        this.this$0 = editor;
        this.$index$inlined = i;
    }

    @Override // defpackage.dl0
    public /* bridge */ /* synthetic */ pi0 invoke(IOException iOException) {
        invoke2(iOException);
        return pi0.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(IOException iOException) {
        yl0.e(iOException, C0059ao.a(10031));
        synchronized (this.this$0.this$0) {
            this.this$0.detach$okhttp();
            pi0 pi0Var = pi0.a;
        }
    }
}
