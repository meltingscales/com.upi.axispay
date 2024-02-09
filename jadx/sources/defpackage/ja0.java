package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.upi.axispay.R;

/* compiled from: AxisPay */
/* renamed from: ja0  reason: default package */
/* loaded from: classes.dex */
public class ja0 extends RecyclerView.h<b> {

    /* compiled from: AxisPay */
    /* renamed from: ja0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ b b;

        public a(ja0 ja0Var, b bVar) {
            this.b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.w.setVisibility(0);
            this.b.x.setBackgroundResource(R.drawable.image_background);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ja0$b */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.d0 {
        public TextView v;
        public LinearLayout w;
        public ImageView x;

        public b(ja0 ja0Var, View view) {
            super(view);
            this.v = (TextView) view.findViewById(R.id.operator_name);
            TextView textView = (TextView) view.findViewById(R.id.operator_bill);
            TextView textView2 = (TextView) view.findViewById(R.id.date_time);
            TextView textView3 = (TextView) view.findViewById(R.id.verify_merchant);
            this.w = (LinearLayout) view.findViewById(R.id.detailes_view);
            this.x = (ImageView) view.findViewById(R.id.img);
        }
    }

    public ja0(Context context) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(b bVar, int i) {
        bVar.v.setOnClickListener(new a(this, bVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public b n(ViewGroup viewGroup, int i) {
        return new b(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_mandate_request_recived_row, viewGroup, false));
    }
}
