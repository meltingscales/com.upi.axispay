package defpackage;

import android.view.View;

/* compiled from: AxisPay */
/* renamed from: r6  reason: default package */
/* loaded from: classes.dex */
public abstract class r6 extends j5 {

    /* compiled from: AxisPay */
    /* renamed from: r6$a */
    /* loaded from: classes.dex */
    public static class a extends r6 {
        @Override // defpackage.r6
        public void b(View view, float f) {
        }

        public void c(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    public abstract void b(View view, float f);
}
