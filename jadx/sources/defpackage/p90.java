package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.olive.upi.transport.model.Banner;
import com.upi.axispay.R;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: p90  reason: default package */
/* loaded from: classes.dex */
public class p90 extends no {
    public ng0 c;
    public ArrayList<Banner> d;
    public LayoutInflater e;

    /* compiled from: AxisPay */
    /* renamed from: p90$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ Banner b;

        public a(Banner banner) {
            this.b = banner;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p90.this.c.s(R.id.image, this.b);
        }
    }

    public p90(Context context, ArrayList<Banner> arrayList) {
        this.d = arrayList;
        this.e = LayoutInflater.from(context);
    }

    @Override // defpackage.no
    public void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // defpackage.no
    public int d() {
        return this.d.size();
    }

    @Override // defpackage.no
    public Object h(ViewGroup viewGroup, int i) {
        View inflate = this.e.inflate(R.layout.home_pager_item, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.image);
        Banner banner = this.d.get(i);
        if (!TextUtils.isEmpty(banner.getImageUrl())) {
            jg0.K(imageView, banner.getImageUrl(), banner.getDefaultImg());
        } else {
            imageView.setImageResource(banner.getDefaultImg());
        }
        imageView.setOnClickListener(new a(banner));
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    @Override // defpackage.no
    public boolean i(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // defpackage.no
    public void l(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // defpackage.no
    public Parcelable m() {
        return null;
    }

    public void t(ng0 ng0Var) {
        this.c = ng0Var;
    }
}
