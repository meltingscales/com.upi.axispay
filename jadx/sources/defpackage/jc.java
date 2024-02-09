package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: jc  reason: default package */
/* loaded from: classes.dex */
public final class jc extends ClickableSpan {
    public final int b;
    public final lc c;
    public final int d;

    public jc(int i, lc lcVar, int i2) {
        this.b = i;
        this.c = lcVar;
        this.d = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(C0059ao.a(9753), this.b);
        this.c.Q(this.d, bundle);
    }
}
