package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.BannerOffersVo;
import com.upi.axispay.R;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: aa0  reason: default package */
/* loaded from: classes.dex */
public class aa0 extends RecyclerView.h<b> {
    public Context d;
    public ArrayList<BannerOffersVo> e;
    public ng0 f;

    /* compiled from: AxisPay */
    /* renamed from: aa0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ BannerOffersVo b;

        public a(BannerOffersVo bannerOffersVo) {
            this.b = bannerOffersVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            aa0.this.f.s(R.id.image_banner, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: aa0$b */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.d0 {
        public ImageView v;
        public TextView w;

        public b(aa0 aa0Var, View view) {
            super(view);
            this.v = (ImageView) view.findViewById(R.id.image_banner);
            this.w = (TextView) view.findViewById(R.id.banner_text);
        }
    }

    public aa0(Activity activity, ArrayList<BannerOffersVo> arrayList) {
        this.e = arrayList;
        this.d = activity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<BannerOffersVo> arrayList = this.e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(b bVar, int i) {
        BannerOffersVo bannerOffersVo = this.e.get(i);
        if (TextUtils.isEmpty(bannerOffersVo.getImageUrl())) {
            bVar.v.setImageDrawable(t8.f(this.d, R.drawable.banner1));
        } else {
            jg0.K(bVar.v, bannerOffersVo.getImageUrl(), R.drawable.banner1);
        }
        bVar.v.setOnClickListener(new a(bannerOffersVo));
        bVar.w.setText(bannerOffersVo.getOffertext());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public b n(ViewGroup viewGroup, int i) {
        return new b(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.banner_list_item, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.f = ng0Var;
    }

    public void z(ArrayList<BannerOffersVo> arrayList) {
        this.e = arrayList;
        j();
    }
}
