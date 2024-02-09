package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import defpackage.oa;
import defpackage.y8;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: m9  reason: default package */
/* loaded from: classes.dex */
public class m9 {
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, y8.b> a = new ConcurrentHashMap<>();

    /* compiled from: AxisPay */
    /* renamed from: m9$a */
    /* loaded from: classes.dex */
    public class a implements c<oa.b> {
        public a(m9 m9Var) {
        }

        @Override // defpackage.m9.c
        /* renamed from: c */
        public int a(oa.b bVar) {
            return bVar.e();
        }

        @Override // defpackage.m9.c
        /* renamed from: d */
        public boolean b(oa.b bVar) {
            return bVar.f();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: m9$b */
    /* loaded from: classes.dex */
    public class b implements c<y8.c> {
        public b(m9 m9Var) {
        }

        @Override // defpackage.m9.c
        /* renamed from: c */
        public int a(y8.c cVar) {
            return cVar.e();
        }

        @Override // defpackage.m9.c
        /* renamed from: d */
        public boolean b(y8.c cVar) {
            return cVar.f();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: m9$c */
    /* loaded from: classes.dex */
    public interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    public static <T> T g(T[] tArr, int i, c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.a(t2) - i2) * 2) + (cVar.b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    public static long j(Typeface typeface) {
        String a2 = C0059ao.a(11391);
        String a3 = C0059ao.a(11392);
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField(C0059ao.a(11393));
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e(a3, a2, e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e(a3, a2, e2);
            return 0L;
        }
    }

    public final void a(Typeface typeface, y8.b bVar) {
        long j = j(typeface);
        if (j != 0) {
            this.a.put(Long.valueOf(j), bVar);
        }
    }

    public Typeface b(Context context, y8.b bVar, Resources resources, int i) {
        y8.c f = f(bVar, i);
        if (f == null) {
            return null;
        }
        Typeface d = g9.d(context, resources, f.b(), f.a(), i);
        a(d, bVar);
        return d;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, oa.b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(h(bVarArr, i).d());
            try {
                Typeface d = d(context, inputStream);
                n9.a(inputStream);
                return d;
            } catch (IOException unused) {
                n9.a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                n9.a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface d(Context context, InputStream inputStream) {
        File e = n9.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (n9.d(e, inputStream)) {
                return Typeface.createFromFile(e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        File e = n9.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (n9.c(e, resources, i)) {
                return Typeface.createFromFile(e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    public final y8.c f(y8.b bVar, int i) {
        return (y8.c) g(bVar.a(), i, new b(this));
    }

    public oa.b h(oa.b[] bVarArr, int i) {
        return (oa.b) g(bVarArr, i, new a(this));
    }

    public y8.b i(Typeface typeface) {
        long j = j(typeface);
        if (j == 0) {
            return null;
        }
        return this.a.get(Long.valueOf(j));
    }
}
