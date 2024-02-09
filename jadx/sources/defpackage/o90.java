package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.BillerCategory;
import com.upi.axispay.R;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: o90  reason: default package */
/* loaded from: classes.dex */
public class o90 extends RecyclerView.h<b> {
    public Context d;
    public ArrayList<BillerCategory> e = new ArrayList<>();
    public ng0 f;

    /* compiled from: AxisPay */
    /* renamed from: o90$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ BillerCategory b;
        public final /* synthetic */ int c;

        public a(BillerCategory billerCategory, int i) {
            this.b = billerCategory;
            this.c = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.b.getFixedCategory() == 0) {
                oa0.f().s(this.c - 2);
            } else {
                oa0.f().s(this.c);
            }
            o90.this.f.s(R.id.billpay_grid, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: o90$b */
    /* loaded from: classes.dex */
    public static class b extends RecyclerView.d0 {
        public TextView v;
        public ImageView w;
        public View x;

        public b(View view) {
            super(view);
            this.x = view;
            this.w = (ImageView) view.findViewById(R.id.grid_icon);
            this.v = (TextView) view.findViewById(R.id.grid_name);
        }
    }

    public o90(Context context, ng0 ng0Var) {
        this.f = ng0Var;
        this.d = context;
        BillerCategory billerCategory = new BillerCategory();
        billerCategory.setDSCRPTN(this.d.getResources().getString(R.string.mobile_prepaid));
        billerCategory.setIconId(2131231228);
        billerCategory.setFixedCategory(81);
        this.e.add(billerCategory);
        BillerCategory billerCategory2 = new BillerCategory();
        billerCategory2.setDSCRPTN(this.d.getResources().getString(R.string.dth_prepaid));
        billerCategory2.setIconId(2131230933);
        billerCategory2.setFixedCategory(85);
        this.e.add(billerCategory2);
    }

    public void A() {
        this.e = new ArrayList<>();
        BillerCategory billerCategory = new BillerCategory();
        billerCategory.setDSCRPTN(this.d.getResources().getString(R.string.mobile_prepaid));
        billerCategory.setIconId(2131231228);
        billerCategory.setFixedCategory(81);
        this.e.add(billerCategory);
        BillerCategory billerCategory2 = new BillerCategory();
        billerCategory2.setDSCRPTN(this.d.getResources().getString(R.string.dth_prepaid));
        billerCategory2.setIconId(2131230933);
        billerCategory2.setFixedCategory(85);
        this.e.add(billerCategory2);
        BillerCategory billerCategory3 = new BillerCategory();
        billerCategory3.setDSCRPTN(this.d.getResources().getString(R.string.more_coming_soon));
        billerCategory3.setIconId(2131231230);
        billerCategory3.setFixedCategory(86);
        this.e.add(billerCategory3);
        j();
    }

    public void B(ArrayList<BillerCategory> arrayList) {
        if (arrayList == null) {
            A();
            return;
        }
        if (this.e.size() == 2) {
            this.e.addAll(arrayList);
        } else if (this.e.size() > 2) {
            this.e.clear();
            this.e.add(this.e.get(0));
            this.e.add(this.e.get(1));
            this.e.addAll(arrayList);
        }
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<BillerCategory> arrayList = this.e;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long f(int i) {
        return 0L;
    }

    public int w() {
        Display defaultDisplay = ((WindowManager) this.d.getSystemService(C0059ao.a(3816))).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public void l(b bVar, int i) {
        BillerCategory billerCategory = this.e.get(i);
        bVar.v.setText(billerCategory.getDSCRPTN());
        if (billerCategory.getIconId() != -1) {
            bVar.w.setImageResource(billerCategory.getIconId());
        } else if (!TextUtils.isEmpty(billerCategory.getIconUrl())) {
            jg0.K(bVar.w, billerCategory.getIconUrl(), 2131230945);
        }
        bVar.x.setOnClickListener(new a(billerCategory, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: y */
    public b n(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bill_pay_grid_row_item, viewGroup, false);
        b bVar = new b(inflate);
        inflate.getLayoutParams().width = w() / 3;
        return bVar;
    }

    public void z(ng0 ng0Var) {
        this.f = ng0Var;
    }
}
