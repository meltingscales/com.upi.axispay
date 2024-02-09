package defpackage;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: AxisPay */
/* renamed from: cc  reason: default package */
/* loaded from: classes.dex */
public final class cc {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(b8.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && ac.M(viewGroup) == null) ? false : true;
    }
}
