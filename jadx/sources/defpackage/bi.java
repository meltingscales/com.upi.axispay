package defpackage;

import android.content.Context;
import android.media.MediaRouter;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: bi  reason: default package */
/* loaded from: classes.dex */
public final class bi {

    /* compiled from: AxisPay */
    /* renamed from: bi$a */
    /* loaded from: classes.dex */
    public interface a {
        void b(Object obj, Object obj2);

        void c(Object obj);

        void d(int i, Object obj);

        void f(Object obj, Object obj2, int i);

        void g(Object obj);

        void h(Object obj);

        void j(Object obj);

        void k(int i, Object obj);
    }

    /* compiled from: AxisPay */
    /* renamed from: bi$b */
    /* loaded from: classes.dex */
    public static class b<T extends a> extends MediaRouter.Callback {
        public final T a;

        public b(T t) {
            this.a = t;
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.a.h(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.a.c(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
            this.a.f(routeInfo, routeGroup, i);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.a.g(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
            this.a.k(i, routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
            this.a.b(routeInfo, routeGroup);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
            this.a.d(i, routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.a.j(routeInfo);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bi$c */
    /* loaded from: classes.dex */
    public static final class c {
        public Method a;

        public c() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 16 && i <= 17) {
                try {
                    this.a = MediaRouter.class.getMethod(C0059ao.a(6617), new Class[0]);
                    return;
                } catch (NoSuchMethodException unused) {
                    return;
                }
            }
            throw new UnsupportedOperationException();
        }

        public Object a(Object obj) {
            MediaRouter mediaRouter = (MediaRouter) obj;
            Method method = this.a;
            if (method != null) {
                try {
                    return method.invoke(mediaRouter, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return mediaRouter.getRouteAt(0);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bi$d */
    /* loaded from: classes.dex */
    public static final class d {
        public static CharSequence a(Object obj, Context context) {
            return ((MediaRouter.RouteInfo) obj).getName(context);
        }

        public static int b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getPlaybackStream();
        }

        public static int c(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getPlaybackType();
        }

        public static int d(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getSupportedTypes();
        }

        public static Object e(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getTag();
        }

        public static int f(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolume();
        }

        public static int g(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolumeHandling();
        }

        public static int h(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolumeMax();
        }

        public static void i(Object obj, int i) {
            ((MediaRouter.RouteInfo) obj).requestSetVolume(i);
        }

        public static void j(Object obj, int i) {
            ((MediaRouter.RouteInfo) obj).requestUpdateVolume(i);
        }

        public static void k(Object obj, Object obj2) {
            ((MediaRouter.RouteInfo) obj).setTag(obj2);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bi$e */
    /* loaded from: classes.dex */
    public static final class e {
        public Method a;

        public e() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 16 && i <= 17) {
                try {
                    this.a = MediaRouter.class.getMethod(C0059ao.a(6360), Integer.TYPE, MediaRouter.RouteInfo.class);
                    return;
                } catch (NoSuchMethodException unused) {
                    return;
                }
            }
            throw new UnsupportedOperationException();
        }

        public void a(Object obj, int i, Object obj2) {
            String a = C0059ao.a(6361);
            MediaRouter mediaRouter = (MediaRouter) obj;
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) obj2;
            if ((routeInfo.getSupportedTypes() & 8388608) == 0) {
                Method method = this.a;
                String a2 = C0059ao.a(6362);
                if (method != null) {
                    try {
                        method.invoke(mediaRouter, Integer.valueOf(i), routeInfo);
                        return;
                    } catch (IllegalAccessException e) {
                        Log.w(a2, a, e);
                    } catch (InvocationTargetException e2) {
                        Log.w(a2, a, e2);
                    }
                } else {
                    Log.w(a2, C0059ao.a(6363));
                }
            }
            mediaRouter.selectRoute(i, routeInfo);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bi$f */
    /* loaded from: classes.dex */
    public static final class f {
        public static void a(Object obj, CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setName(charSequence);
        }

        public static void b(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setPlaybackStream(i);
        }

        public static void c(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setPlaybackType(i);
        }

        public static void d(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolume(i);
        }

        public static void e(Object obj, Object obj2) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeCallback((MediaRouter.VolumeCallback) obj2);
        }

        public static void f(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeHandling(i);
        }

        public static void g(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeMax(i);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bi$g */
    /* loaded from: classes.dex */
    public interface g {
        void e(Object obj, int i);

        void i(Object obj, int i);
    }

    /* compiled from: AxisPay */
    /* renamed from: bi$h */
    /* loaded from: classes.dex */
    public static class h<T extends g> extends MediaRouter.VolumeCallback {
        public final T a;

        public h(T t) {
            this.a = t;
        }

        @Override // android.media.MediaRouter.VolumeCallback
        public void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
            this.a.i(routeInfo, i);
        }

        @Override // android.media.MediaRouter.VolumeCallback
        public void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
            this.a.e(routeInfo, i);
        }
    }

    public static void a(Object obj, int i, Object obj2) {
        ((MediaRouter) obj).addCallback(i, (MediaRouter.Callback) obj2);
    }

    public static void b(Object obj, Object obj2) {
        ((MediaRouter) obj).addUserRoute((MediaRouter.UserRouteInfo) obj2);
    }

    public static Object c(a aVar) {
        return new b(aVar);
    }

    public static Object d(Object obj, String str, boolean z) {
        return ((MediaRouter) obj).createRouteCategory(str, z);
    }

    public static Object e(Object obj, Object obj2) {
        return ((MediaRouter) obj).createUserRoute((MediaRouter.RouteCategory) obj2);
    }

    public static Object f(g gVar) {
        return new h(gVar);
    }

    public static Object g(Context context) {
        return context.getSystemService(C0059ao.a(2161));
    }

    public static List h(Object obj) {
        MediaRouter mediaRouter = (MediaRouter) obj;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        return arrayList;
    }

    public static Object i(Object obj, int i) {
        return ((MediaRouter) obj).getSelectedRoute(i);
    }

    public static void j(Object obj, Object obj2) {
        ((MediaRouter) obj).removeCallback((MediaRouter.Callback) obj2);
    }

    public static void k(Object obj, Object obj2) {
        ((MediaRouter) obj).removeUserRoute((MediaRouter.UserRouteInfo) obj2);
    }

    public static void l(Object obj, int i, Object obj2) {
        ((MediaRouter) obj).selectRoute(i, (MediaRouter.RouteInfo) obj2);
    }
}
