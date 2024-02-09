package defpackage;

import android.animation.LayoutTransition;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: nn  reason: default package */
/* loaded from: classes.dex */
public class nn {
    public static LayoutTransition a;
    public static Field b;
    public static boolean c;
    public static Method d;
    public static boolean e;

    /* compiled from: AxisPay */
    /* renamed from: nn$a */
    /* loaded from: classes.dex */
    public static class a extends LayoutTransition {
        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    public static void a(LayoutTransition layoutTransition) {
        boolean z = e;
        String a2 = C0059ao.a(13985);
        String a3 = C0059ao.a(13986);
        if (!z) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod(C0059ao.a(13987), new Class[0]);
                d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i(a3, a2);
            }
            e = true;
        }
        Method method = d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i(a3, a2);
            } catch (InvocationTargetException unused3) {
                Log.i(a3, C0059ao.a(13988));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.view.ViewGroup r6, boolean r7) {
        /*
            android.animation.LayoutTransition r1 = defpackage.nn.a
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L28
            nn$a r1 = new nn$a
            r1.<init>()
            defpackage.nn.a = r1
            r5 = 2
            r1.setAnimator(r5, r4)
            android.animation.LayoutTransition r1 = defpackage.nn.a
            r1.setAnimator(r3, r4)
            android.animation.LayoutTransition r1 = defpackage.nn.a
            r1.setAnimator(r2, r4)
            android.animation.LayoutTransition r1 = defpackage.nn.a
            r5 = 3
            r1.setAnimator(r5, r4)
            android.animation.LayoutTransition r1 = defpackage.nn.a
            r5 = 4
            r1.setAnimator(r5, r4)
        L28:
            if (r7 == 0) goto L48
            android.animation.LayoutTransition r7 = r6.getLayoutTransition()
            if (r7 == 0) goto L42
            boolean r1 = r7.isRunning()
            if (r1 == 0) goto L39
            a(r7)
        L39:
            android.animation.LayoutTransition r1 = defpackage.nn.a
            if (r7 == r1) goto L42
            int r1 = defpackage.ym.transition_layout_save
            r6.setTag(r1, r7)
        L42:
            android.animation.LayoutTransition r7 = defpackage.nn.a
            r6.setLayoutTransition(r7)
            goto La8
        L48:
            r6.setLayoutTransition(r4)
            boolean r7 = defpackage.nn.c
            r0 = 13989(0x36a5, float:1.9603E-41)
            java.lang.String r1 = myunmn.C0059ao.a(r0)
            if (r7 != 0) goto L75
            java.lang.Class<android.view.ViewGroup> r7 = android.view.ViewGroup.class
            r0 = 13990(0x36a6, float:1.9604E-41)
            java.lang.String r5 = myunmn.C0059ao.a(r0)     // Catch: java.lang.NoSuchFieldException -> L69
            java.lang.reflect.Field r7 = r7.getDeclaredField(r5)     // Catch: java.lang.NoSuchFieldException -> L69
            defpackage.nn.b = r7     // Catch: java.lang.NoSuchFieldException -> L69
            r7.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L69
            goto L73
        L69:
            r0 = 13991(0x36a7, float:1.9606E-41)
            java.lang.String r7 = myunmn.C0059ao.a(r0)
            android.util.Log.i(r1, r7)
        L73:
            defpackage.nn.c = r2
        L75:
            java.lang.reflect.Field r7 = defpackage.nn.b
            if (r7 == 0) goto L93
            boolean r7 = r7.getBoolean(r6)     // Catch: java.lang.IllegalAccessException -> L89
            if (r7 == 0) goto L87
            java.lang.reflect.Field r2 = defpackage.nn.b     // Catch: java.lang.IllegalAccessException -> L85
            r2.setBoolean(r6, r3)     // Catch: java.lang.IllegalAccessException -> L85
            goto L87
        L85:
            r3 = r7
            goto L89
        L87:
            r3 = r7
            goto L93
        L89:
            r0 = 13992(0x36a8, float:1.9607E-41)
            java.lang.String r7 = myunmn.C0059ao.a(r0)
            android.util.Log.i(r1, r7)
        L93:
            if (r3 == 0) goto L98
            r6.requestLayout()
        L98:
            int r7 = defpackage.ym.transition_layout_save
            java.lang.Object r1 = r6.getTag(r7)
            android.animation.LayoutTransition r1 = (android.animation.LayoutTransition) r1
            if (r1 == 0) goto La8
            r6.setTag(r7, r4)
            r6.setLayoutTransition(r1)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn.b(android.view.ViewGroup, boolean):void");
    }
}
