package io.github.inflationx.calligraphy3;

import android.view.View;
import defpackage.mh0;
import defpackage.nh0;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CalligraphyInterceptor implements nh0 {
    private final Calligraphy calligraphy;

    public CalligraphyInterceptor(CalligraphyConfig calligraphyConfig) {
        this.calligraphy = new Calligraphy(calligraphyConfig);
    }

    @Override // defpackage.nh0
    public mh0 intercept(nh0.a aVar) {
        mh0 a = aVar.a(aVar.request());
        View onViewCreated = this.calligraphy.onViewCreated(a.e(), a.b(), a.a());
        mh0.a d = a.d();
        d.b(onViewCreated);
        return d.a();
    }
}
