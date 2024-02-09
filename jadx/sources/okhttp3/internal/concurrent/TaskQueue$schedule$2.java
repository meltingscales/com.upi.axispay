package okhttp3.internal.concurrent;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class TaskQueue$schedule$2 extends Task {
    public final /* synthetic */ sk0 $block;
    public final /* synthetic */ String $name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$schedule$2(sk0 sk0Var, String str, String str2) {
        super(str2, false, 2, null);
        this.$block = sk0Var;
        this.$name = str;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        return ((Number) this.$block.invoke()).longValue();
    }
}
