package defpackage;

import android.view.View;

/* compiled from: AxisPay */
/* renamed from: s6  reason: default package */
/* loaded from: classes.dex */
public abstract class s6 extends k5 {

    /* compiled from: AxisPay */
    /* renamed from: s6$a */
    /* loaded from: classes.dex */
    public static class a extends s6 {
        @Override // defpackage.s6
        public void b(View view, float f) {
        }

        public void c(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    public abstract void b(View view, float f);
}
