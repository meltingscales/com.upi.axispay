package defpackage;

/* compiled from: AxisPay */
/* renamed from: sr  reason: default package */
/* loaded from: classes.dex */
public final class sr {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i, TInput tinput, rr<TInput, TResult, TException> rrVar, tr<TInput, TResult> trVar) throws Throwable {
        TResult apply;
        if (i < 1) {
            return rrVar.apply(tinput);
        }
        do {
            apply = rrVar.apply(tinput);
            tinput = trVar.a(tinput, apply);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return apply;
    }
}
