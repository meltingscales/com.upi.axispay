package defpackage;

import android.media.MediaRouter;

/* compiled from: AxisPay */
/* renamed from: di  reason: default package */
/* loaded from: classes.dex */
public final class di {

    /* compiled from: AxisPay */
    /* renamed from: di$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static CharSequence a(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getDescription();
        }

        public static boolean b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isConnecting();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: di$b */
    /* loaded from: classes.dex */
    public static final class b {
        public static void a(Object obj, CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setDescription(charSequence);
        }
    }

    public static void a(Object obj, int i, Object obj2, int i2) {
        ((MediaRouter) obj).addCallback(i, (MediaRouter.Callback) obj2, i2);
    }

    public static Object b(Object obj) {
        return ((MediaRouter) obj).getDefaultRoute();
    }
}
