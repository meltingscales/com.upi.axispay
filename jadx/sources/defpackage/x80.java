package defpackage;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import myunmn.C0059ao;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: AxisPay */
/* renamed from: x80  reason: default package */
/* loaded from: classes.dex */
public final class x80 {
    public static final StringBuilder a = new StringBuilder();
    public static final ByteString b = ByteString.encodeUtf8(C0059ao.a(6520));
    public static final ByteString c = ByteString.encodeUtf8(C0059ao.a(6521));

    /* compiled from: AxisPay */
    /* renamed from: x80$a */
    /* loaded from: classes.dex */
    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: x80$b */
    /* loaded from: classes.dex */
    public static class b extends Thread {
        public b(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: x80$c */
    /* loaded from: classes.dex */
    public static class c implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new b(runnable);
        }
    }

    @TargetApi(18)
    public static long a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            int i = Build.VERSION.SDK_INT;
            j = ((i < 18 ? statFs.getBlockCount() : statFs.getBlockCountLong()) * (i < 18 ? statFs.getBlockSize() : statFs.getBlockSizeLong())) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800L), 5242880L);
    }

    public static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) n(context, C0059ao.a(6522));
        return (int) ((((context.getApplicationInfo().flags & CommonUtils.BYTES_IN_A_MEGABYTE) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) / 7);
    }

    public static void c() {
        if (!q()) {
            throw new IllegalStateException(C0059ao.a(6523));
        }
    }

    public static <T> T d(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static File e(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), C0059ao.a(6524));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String f(q80 q80Var) {
        StringBuilder sb = a;
        String g = g(q80Var, sb);
        sb.setLength(0);
        return g;
    }

    public static String g(q80 q80Var, StringBuilder sb) {
        String str = q80Var.f;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(q80Var.f);
        } else {
            Uri uri = q80Var.d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb.ensureCapacity(uri2.length() + 50);
                sb.append(uri2);
            } else {
                sb.ensureCapacity(50);
                sb.append(q80Var.e);
            }
        }
        sb.append('\n');
        if (q80Var.n != 0.0f) {
            sb.append(C0059ao.a(6525));
            sb.append(q80Var.n);
            if (q80Var.q) {
                sb.append('@');
                sb.append(q80Var.o);
                sb.append('x');
                sb.append(q80Var.p);
            }
            sb.append('\n');
        }
        if (q80Var.c()) {
            sb.append(C0059ao.a(6526));
            sb.append(q80Var.h);
            sb.append('x');
            sb.append(q80Var.i);
            sb.append('\n');
        }
        if (q80Var.j) {
            sb.append(C0059ao.a(6527));
            sb.append(q80Var.k);
            sb.append('\n');
        } else if (q80Var.l) {
            sb.append(C0059ao.a(6528));
            sb.append('\n');
        }
        List<w80> list = q80Var.g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(q80Var.g.get(i).b());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public static void h(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    public static int i(Bitmap bitmap) {
        int allocationByteCount = Build.VERSION.SDK_INT >= 19 ? bitmap.getAllocationByteCount() : bitmap.getByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException(C0059ao.a(6529) + bitmap);
    }

    public static String j(w70 w70Var) {
        return k(w70Var, C0059ao.a(6530));
    }

    public static String k(w70 w70Var, String str) {
        StringBuilder sb = new StringBuilder(str);
        u70 h = w70Var.h();
        if (h != null) {
            sb.append(h.b.d());
        }
        List<u70> i = w70Var.i();
        if (i != null) {
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0 || h != null) {
                    sb.append(C0059ao.a(6531));
                }
                sb.append(i.get(i2).b.d());
            }
        }
        return sb.toString();
    }

    public static int l(Resources resources, q80 q80Var) throws FileNotFoundException {
        Uri uri;
        int i = q80Var.e;
        if (i != 0 || (uri = q80Var.d) == null) {
            return i;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            List<String> pathSegments = q80Var.d.getPathSegments();
            if (pathSegments != null && !pathSegments.isEmpty()) {
                if (pathSegments.size() == 1) {
                    try {
                        return Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                        throw new FileNotFoundException(C0059ao.a(6532) + q80Var.d);
                    }
                } else if (pathSegments.size() == 2) {
                    return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                } else {
                    throw new FileNotFoundException(C0059ao.a(6533) + q80Var.d);
                }
            }
            throw new FileNotFoundException(C0059ao.a(6534) + q80Var.d);
        }
        throw new FileNotFoundException(C0059ao.a(6535) + q80Var.d);
    }

    public static Resources m(Context context, q80 q80Var) throws FileNotFoundException {
        Uri uri;
        if (q80Var.e == 0 && (uri = q80Var.d) != null) {
            String authority = uri.getAuthority();
            if (authority != null) {
                try {
                    return context.getPackageManager().getResourcesForApplication(authority);
                } catch (PackageManager.NameNotFoundException unused) {
                    throw new FileNotFoundException(C0059ao.a(6536) + q80Var.d);
                }
            }
            throw new FileNotFoundException(C0059ao.a(6537) + q80Var.d);
        }
        return context.getResources();
    }

    public static <T> T n(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    public static boolean o(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean p(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int i = Build.VERSION.SDK_INT;
            String a2 = C0059ao.a(6538);
            return i < 17 ? Settings.System.getInt(contentResolver, a2, 0) != 0 : Settings.Global.getInt(contentResolver, a2, 0) != 0;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    public static boolean q() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean r(BufferedSource bufferedSource) throws IOException {
        return bufferedSource.rangeEquals(0L, b) && bufferedSource.rangeEquals(8L, c);
    }

    public static void s(String str, String str2, String str3) {
        t(str, str2, str3, C0059ao.a(6539));
    }

    public static void t(String str, String str2, String str3, String str4) {
        String.format(C0059ao.a(6540), str, str2, str3, str4);
    }
}
