package defpackage;

import android.net.NetworkInfo;
import defpackage.n80;
import defpackage.x80;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: AxisPay */
/* renamed from: p80  reason: default package */
/* loaded from: classes.dex */
public class p80 extends ThreadPoolExecutor {

    /* compiled from: AxisPay */
    /* renamed from: p80$a */
    /* loaded from: classes.dex */
    public static final class a extends FutureTask<w70> implements Comparable<a> {
        public final w70 b;

        public a(w70 w70Var) {
            super(w70Var, null);
            this.b = w70Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(a aVar) {
            n80.f r = this.b.r();
            n80.f r2 = aVar.b.r();
            return r == r2 ? this.b.b - aVar.b.b : r2.ordinal() - r.ordinal();
        }
    }

    public p80() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new x80.c());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            int type = networkInfo.getType();
            if (type != 0) {
                if (type != 1 && type != 6 && type != 9) {
                    b(3);
                    return;
                } else {
                    b(4);
                    return;
                }
            }
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                    b(1);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    switch (subtype) {
                        case 12:
                            break;
                        case 13:
                        case 14:
                        case 15:
                            b(3);
                            return;
                        default:
                            b(3);
                            return;
                    }
            }
            b(2);
            return;
        }
        b(3);
    }

    public final void b(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        a aVar = new a((w70) runnable);
        execute(aVar);
        return aVar;
    }
}
