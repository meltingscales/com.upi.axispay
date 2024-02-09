package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaRouter;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import defpackage.bi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ci  reason: default package */
/* loaded from: classes.dex */
public final class ci {

    /* compiled from: AxisPay */
    /* renamed from: ci$a */
    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        public final DisplayManager b;
        public final Handler c;
        public Method d;
        public boolean e;

        public a(Context context, Handler handler) {
            if (Build.VERSION.SDK_INT == 17) {
                this.b = (DisplayManager) context.getSystemService(C0059ao.a(13091));
                this.c = handler;
                try {
                    this.d = DisplayManager.class.getMethod(C0059ao.a(13092), new Class[0]);
                    return;
                } catch (NoSuchMethodException unused) {
                    return;
                }
            }
            throw new UnsupportedOperationException();
        }

        public void a(int i) {
            if ((i & 2) != 0) {
                if (this.e) {
                    return;
                }
                if (this.d != null) {
                    this.e = true;
                    this.c.post(this);
                    return;
                }
                Log.w(C0059ao.a(13093), C0059ao.a(13094));
            } else if (this.e) {
                this.e = false;
                this.c.removeCallbacks(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            String a = C0059ao.a(13095);
            String a2 = C0059ao.a(13096);
            if (this.e) {
                try {
                    this.d.invoke(this.b, new Object[0]);
                } catch (IllegalAccessException e) {
                    Log.w(a2, a, e);
                } catch (InvocationTargetException e2) {
                    Log.w(a2, a, e2);
                }
                this.c.postDelayed(this, 15000L);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ci$b */
    /* loaded from: classes.dex */
    public interface b extends bi.a {
        void a(Object obj);
    }

    /* compiled from: AxisPay */
    /* renamed from: ci$c */
    /* loaded from: classes.dex */
    public static class c<T extends b> extends bi.b<T> {
        public c(T t) {
            super(t);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            ((b) this.a).a(routeInfo);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ci$d */
    /* loaded from: classes.dex */
    public static final class d {
        public Method a;
        public int b;

        public d() {
            if (Build.VERSION.SDK_INT == 17) {
                try {
                    this.b = MediaRouter.RouteInfo.class.getField(C0059ao.a(13154)).getInt(null);
                    this.a = MediaRouter.RouteInfo.class.getMethod(C0059ao.a(13155), new Class[0]);
                    return;
                } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException unused) {
                    return;
                }
            }
            throw new UnsupportedOperationException();
        }

        public boolean a(Object obj) {
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) obj;
            Method method = this.a;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(routeInfo, new Object[0])).intValue() == this.b;
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    return false;
                }
            }
            return false;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ci$e */
    /* loaded from: classes.dex */
    public static final class e {
        public static Display a(Object obj) {
            try {
                return ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
            } catch (NoSuchMethodError e) {
                Log.w(C0059ao.a(13174), C0059ao.a(13175), e);
                return null;
            }
        }

        public static boolean b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isEnabled();
        }
    }

    public static Object a(b bVar) {
        return new c(bVar);
    }
}
