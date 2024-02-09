package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AxisPay */
/* renamed from: kx  reason: default package */
/* loaded from: classes.dex */
public class kx extends LinearLayoutManager {

    /* compiled from: AxisPay */
    /* renamed from: kx$a */
    /* loaded from: classes.dex */
    public class a extends bj {
        public a(kx kxVar, Context context) {
            super(context);
        }

        @Override // defpackage.bj
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public kx(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void J1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.p(i);
        K1(aVar);
    }
}
