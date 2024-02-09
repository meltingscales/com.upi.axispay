package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: AxisPay */
/* renamed from: gq  reason: default package */
/* loaded from: classes.dex */
public abstract class gq {
    public static Executor a() {
        return new jq(Executors.newSingleThreadExecutor());
    }
}
