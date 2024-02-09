package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.upi.axispay.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AxisPay */
/* renamed from: md0  reason: default package */
/* loaded from: classes.dex */
public class md0 extends xc0 {

    /* compiled from: AxisPay */
    /* renamed from: md0$a */
    /* loaded from: classes.dex */
    public class a extends he {
        public final List<Fragment> j;
        public final List<String> k;

        public a(md0 md0Var, FragmentManager fragmentManager) {
            super(fragmentManager);
            this.j = new ArrayList();
            this.k = new ArrayList();
        }

        @Override // defpackage.no
        public int d() {
            return this.j.size();
        }

        @Override // defpackage.no
        public CharSequence f(int i) {
            return this.k.get(i);
        }

        @Override // defpackage.he
        public Fragment t(int i) {
            return this.j.get(i);
        }

        public void u(Fragment fragment, String str) {
            this.j.add(fragment);
            this.k.add(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_helps, viewGroup, false);
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.viewpager);
        x(viewPager);
        ((TabLayout) inflate.findViewById(R.id.tabs)).setupWithViewPager(viewPager);
        return inflate;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(48, getString(R.string.menu_help));
        super.onResume();
    }

    public final void x(ViewPager viewPager) {
        a aVar = new a(this, getChildFragmentManager());
        aVar.u(new id0(), getString(R.string.faqs));
        aVar.u(new hd0(), getString(R.string.contact_us));
        viewPager.setAdapter(aVar);
    }
}
