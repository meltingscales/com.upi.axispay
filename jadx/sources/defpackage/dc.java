package defpackage;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: dc  reason: default package */
/* loaded from: classes.dex */
public final class dc {
    public static boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e(C0059ao.a(3820), C0059ao.a(3818) + viewParent + C0059ao.a(3819), e);
                return false;
            }
        } else if (viewParent instanceof sb) {
            return ((sb) viewParent).onNestedFling(view, f, f2, z);
        } else {
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                Log.e(C0059ao.a(3823), C0059ao.a(3821) + viewParent + C0059ao.a(3822), e);
                return false;
            }
        } else if (viewParent instanceof sb) {
            return ((sb) viewParent).onNestedPreFling(view, f, f2);
        } else {
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof qb) {
            ((qb) viewParent).j(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError e) {
                    Log.e(C0059ao.a(3826), C0059ao.a(3824) + viewParent + C0059ao.a(3825), e);
                }
            } else if (viewParent instanceof sb) {
                ((sb) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof rb) {
            ((rb) viewParent).m(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof qb) {
            ((qb) viewParent).n(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    Log.e(C0059ao.a(3829), C0059ao.a(3827) + viewParent + C0059ao.a(3828), e);
                }
            } else if (viewParent instanceof sb) {
                ((sb) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof qb) {
            ((qb) viewParent).h(view, view2, i, i2);
        } else if (i2 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError e) {
                    Log.e(C0059ao.a(3832), C0059ao.a(3830) + viewParent + C0059ao.a(3831), e);
                }
            } else if (viewParent instanceof sb) {
                ((sb) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof qb) {
            return ((qb) viewParent).o(view, view2, i, i2);
        }
        if (i2 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    return viewParent.onStartNestedScroll(view, view2, i);
                } catch (AbstractMethodError e) {
                    Log.e(C0059ao.a(3835), C0059ao.a(3833) + viewParent + C0059ao.a(3834), e);
                    return false;
                }
            } else if (viewParent instanceof sb) {
                return ((sb) viewParent).onStartNestedScroll(view, view2, i);
            } else {
                return false;
            }
        }
        return false;
    }

    public static void g(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof qb) {
            ((qb) viewParent).i(view, i);
        } else if (i == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    Log.e(C0059ao.a(3838), C0059ao.a(3836) + viewParent + C0059ao.a(3837), e);
                }
            } else if (viewParent instanceof sb) {
                ((sb) viewParent).onStopNestedScroll(view);
            }
        }
    }

    @Deprecated
    public static boolean h(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
