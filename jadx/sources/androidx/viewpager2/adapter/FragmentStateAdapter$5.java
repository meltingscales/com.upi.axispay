package androidx.viewpager2.adapter;

import android.os.Handler;
import defpackage.bf;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class FragmentStateAdapter$5 implements cf {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ Runnable b;

    @Override // defpackage.cf
    public void d(ef efVar, bf.b bVar) {
        if (bVar == bf.b.ON_DESTROY) {
            this.a.removeCallbacks(this.b);
            efVar.getLifecycle().c(this);
        }
    }
}
