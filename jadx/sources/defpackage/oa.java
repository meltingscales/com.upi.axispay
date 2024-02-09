package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;

/* compiled from: AxisPay */
/* renamed from: oa  reason: default package */
/* loaded from: classes.dex */
public class oa {

    /* compiled from: AxisPay */
    /* renamed from: oa$a */
    /* loaded from: classes.dex */
    public static class a {
        public final int a;
        public final b[] b;

        @Deprecated
        public a(int i, b[] bVarArr) {
            this.a = i;
            this.b = bVarArr;
        }

        public static a a(int i, b[] bVarArr) {
            return new a(i, bVarArr);
        }

        public b[] b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: oa$b */
    /* loaded from: classes.dex */
    public static class b {
        public final Uri a;
        public final int b;
        public final int c;
        public final boolean d;
        public final int e;

        @Deprecated
        public b(Uri uri, int i, int i2, boolean z, int i3) {
            db.e(uri);
            this.a = uri;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }

        public static b a(Uri uri, int i, int i2, boolean z, int i3) {
            return new b(uri, i, i2, z, i3);
        }

        public int b() {
            return this.e;
        }

        public int c() {
            return this.b;
        }

        public Uri d() {
            return this.a;
        }

        public int e() {
            return this.c;
        }

        public boolean f() {
            return this.d;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: oa$c */
    /* loaded from: classes.dex */
    public static class c {
        public void a(int i) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, ma maVar, int i, boolean z, int i2, Handler handler, c cVar) {
        ja jaVar = new ja(cVar, handler);
        if (z) {
            return na.e(context, maVar, jaVar, i, i2);
        }
        return na.d(context, maVar, i, null, jaVar);
    }
}
