package retrofit2;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1 extends zl0 implements dl0<Throwable, pi0> {
    public final /* synthetic */ Call $this_awaitResponse$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1(Call call) {
        super(1);
        this.$this_awaitResponse$inlined = call;
    }

    @Override // defpackage.dl0
    public /* bridge */ /* synthetic */ pi0 invoke(Throwable th) {
        invoke2(th);
        return pi0.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$this_awaitResponse$inlined.cancel();
    }
}
