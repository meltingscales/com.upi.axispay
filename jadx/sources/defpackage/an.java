package defpackage;

import android.view.ViewGroup;

/* compiled from: AxisPay */
/* renamed from: an  reason: default package */
/* loaded from: classes.dex */
public class an {
    public ViewGroup a;
    public Runnable b;

    public static an b(ViewGroup viewGroup) {
        return (an) viewGroup.getTag(ym.transition_current_scene);
    }

    public static void c(ViewGroup viewGroup, an anVar) {
        viewGroup.setTag(ym.transition_current_scene, anVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.a) != this || (runnable = this.b) == null) {
            return;
        }
        runnable.run();
    }
}
