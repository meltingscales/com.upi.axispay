package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ia0  reason: default package */
/* loaded from: classes.dex */
public class ia0 extends he {
    public final List<Fragment> j;
    public String[] k;

    public ia0(FragmentManager fragmentManager) {
        super(fragmentManager);
        this.j = new ArrayList();
        this.k = new String[]{C0059ao.a(8997), C0059ao.a(8998)};
    }

    @Override // defpackage.no
    public int d() {
        return this.j.size();
    }

    @Override // defpackage.no
    public CharSequence f(int i) {
        return this.k[i];
    }

    @Override // defpackage.he
    public Fragment t(int i) {
        return this.j.get(i);
    }
}
