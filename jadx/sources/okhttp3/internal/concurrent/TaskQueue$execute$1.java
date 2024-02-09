package okhttp3.internal.concurrent;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class TaskQueue$execute$1 extends Task {
    public final /* synthetic */ sk0 $block;
    public final /* synthetic */ boolean $cancelable;
    public final /* synthetic */ String $name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(sk0 sk0Var, String str, boolean z, String str2, boolean z2) {
        super(str2, z2);
        this.$block = sk0Var;
        this.$name = str;
        this.$cancelable = z;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        this.$block.invoke();
        return -1L;
    }
}
