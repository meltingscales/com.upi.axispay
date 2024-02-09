package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: cm  reason: default package */
/* loaded from: classes.dex */
public interface cm extends Closeable {

    /* compiled from: AxisPay */
    /* renamed from: cm$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final void a(String str) {
            if (str.equalsIgnoreCase(C0059ao.a(616)) || str.trim().length() == 0) {
                return;
            }
            String a = C0059ao.a(618);
            Log.w(a, C0059ao.a(617) + str);
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    wl.a(new File(str));
                } else {
                    try {
                        if (!new File(str).delete()) {
                            Log.e(a, C0059ao.a(619) + str);
                        }
                    } catch (Exception e) {
                        Log.e(a, C0059ao.a(620), e);
                    }
                }
            } catch (Exception e2) {
                Log.w(a, C0059ao.a(621), e2);
            }
        }

        public void b(bm bmVar) {
        }

        public void c(bm bmVar) {
            Log.e(C0059ao.a(623), C0059ao.a(622) + bmVar.getPath());
            if (!bmVar.isOpen()) {
                a(bmVar.getPath());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = bmVar.g();
                } finally {
                    if (list != null) {
                        for (Pair<String, String> next : list) {
                            a((String) next.second);
                        }
                    } else {
                        a(bmVar.getPath());
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                bmVar.close();
            } catch (IOException unused2) {
            }
        }

        public abstract void d(bm bmVar);

        public void e(bm bmVar, int i, int i2) {
            throw new SQLiteException(C0059ao.a(624) + i + C0059ao.a(625) + i2);
        }

        public void f(bm bmVar) {
        }

        public abstract void g(bm bmVar, int i, int i2);
    }

    /* compiled from: AxisPay */
    /* renamed from: cm$b */
    /* loaded from: classes.dex */
    public static class b {
        public final Context a;
        public final String b;
        public final a c;
        public final boolean d;

        /* compiled from: AxisPay */
        /* renamed from: cm$b$a */
        /* loaded from: classes.dex */
        public static class a {
            public Context a;
            public String b;
            public a c;
            public boolean d;

            public a(Context context) {
                this.a = context;
            }

            public b a() {
                if (this.c != null) {
                    if (this.a != null) {
                        if (this.d && TextUtils.isEmpty(this.b)) {
                            throw new IllegalArgumentException(C0059ao.a(11458));
                        }
                        return new b(this.a, this.b, this.c, this.d);
                    }
                    throw new IllegalArgumentException(C0059ao.a(11459));
                }
                throw new IllegalArgumentException(C0059ao.a(11460));
            }

            public a b(a aVar) {
                this.c = aVar;
                return this;
            }

            public a c(String str) {
                this.b = str;
                return this;
            }
        }

        public b(Context context, String str, a aVar, boolean z) {
            this.a = context;
            this.b = str;
            this.c = aVar;
            this.d = z;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: cm$c */
    /* loaded from: classes.dex */
    public interface c {
        cm a(b bVar);
    }

    bm G();

    bm K();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
