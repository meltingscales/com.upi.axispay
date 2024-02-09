package defpackage;

import android.view.View;
import defpackage.nh0;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: rh0  reason: default package */
/* loaded from: classes.dex */
public final class rh0 implements nh0 {
    @Override // defpackage.nh0
    public mh0 intercept(nh0.a aVar) {
        String d;
        Class<?> cls;
        yl0.f(aVar, C0059ao.a(6908));
        lh0 request = aVar.request();
        View onCreateView = request.c().onCreateView(request.e(), request.d(), request.b(), request.a());
        if (onCreateView == null || (cls = onCreateView.getClass()) == null || (d = cls.getName()) == null) {
            d = request.d();
        }
        return new mh0(onCreateView, d, request.b(), request.a());
    }
}
