package defpackage;

import android.content.Context;
import android.view.SubMenu;

/* compiled from: AxisPay */
/* renamed from: dy  reason: default package */
/* loaded from: classes.dex */
public class dy extends i1 {
    public dy(Context context) {
        super(context);
    }

    @Override // defpackage.i1, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        k1 k1Var = (k1) a(i, i2, i3, charSequence);
        fy fyVar = new fy(w(), this, k1Var);
        k1Var.x(fyVar);
        return fyVar;
    }
}
