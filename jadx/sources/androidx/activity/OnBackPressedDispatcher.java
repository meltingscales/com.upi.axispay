package androidx.activity;

import android.annotation.SuppressLint;
import defpackage.bf;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    public final Runnable a;
    public final ArrayDeque<b> b = new ArrayDeque<>();

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements cf, defpackage.a {
        public final bf a;
        public final b b;
        public defpackage.a c;

        public LifecycleOnBackPressedCancellable(bf bfVar, b bVar) {
            this.a = bfVar;
            this.b = bVar;
            bfVar.a(this);
        }

        @Override // defpackage.a
        public void cancel() {
            this.a.c(this);
            this.b.e(this);
            defpackage.a aVar = this.c;
            if (aVar != null) {
                aVar.cancel();
                this.c = null;
            }
        }

        @Override // defpackage.cf
        public void d(ef efVar, bf.b bVar) {
            if (bVar == bf.b.ON_START) {
                this.c = OnBackPressedDispatcher.this.b(this.b);
            } else if (bVar == bf.b.ON_STOP) {
                defpackage.a aVar = this.c;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (bVar == bf.b.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements defpackage.a {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.a
        public void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.a);
            this.a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(ef efVar, b bVar) {
        bf lifecycle = efVar.getLifecycle();
        if (lifecycle.b() == bf.c.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(lifecycle, bVar));
    }

    public defpackage.a b(b bVar) {
        this.b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
