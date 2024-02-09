package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import defpackage.n80;
import java.io.IOException;
import myunmn.C0059ao;
import okio.Source;

/* compiled from: AxisPay */
/* renamed from: s80  reason: default package */
/* loaded from: classes.dex */
public abstract class s80 {

    /* compiled from: AxisPay */
    /* renamed from: s80$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final n80.e a;
        public final Bitmap b;
        public final Source c;
        public final int d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Bitmap bitmap, n80.e eVar) {
            this(bitmap, null, eVar, 0);
            x80.d(bitmap, C0059ao.a(4779));
        }

        public Bitmap a() {
            return this.b;
        }

        public int b() {
            return this.d;
        }

        public n80.e c() {
            return this.a;
        }

        public Source d() {
            return this.c;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Source source, n80.e eVar) {
            this(null, source, eVar, 0);
            x80.d(source, C0059ao.a(4781));
        }

        public a(Bitmap bitmap, Source source, n80.e eVar, int i) {
            if ((bitmap != null) != (source != null)) {
                this.b = bitmap;
                this.c = source;
                x80.d(eVar, C0059ao.a(4780));
                this.a = eVar;
                this.d = i;
                return;
            }
            throw new AssertionError();
        }
    }

    public static void a(int i, int i2, int i3, int i4, BitmapFactory.Options options, q80 q80Var) {
        int min;
        double floor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                floor = Math.floor(i3 / i);
            } else if (i == 0) {
                floor = Math.floor(i4 / i2);
            } else {
                int floor2 = (int) Math.floor(i4 / i2);
                int floor3 = (int) Math.floor(i3 / i);
                if (q80Var.l) {
                    min = Math.max(floor2, floor3);
                } else {
                    min = Math.min(floor2, floor3);
                }
            }
            min = (int) floor;
        } else {
            min = 1;
        }
        options.inSampleSize = min;
        options.inJustDecodeBounds = false;
    }

    public static void b(int i, int i2, BitmapFactory.Options options, q80 q80Var) {
        a(i, i2, options.outWidth, options.outHeight, options, q80Var);
    }

    public static BitmapFactory.Options d(q80 q80Var) {
        boolean c = q80Var.c();
        boolean z = q80Var.s != null;
        BitmapFactory.Options options = null;
        if (c || z || q80Var.r) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = c;
            boolean z2 = q80Var.r;
            options.inInputShareable = z2;
            options.inPurgeable = z2;
            if (z) {
                options.inPreferredConfig = q80Var.s;
            }
        }
        return options;
    }

    public static boolean g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean c(q80 q80Var);

    public int e() {
        return 0;
    }

    public abstract a f(q80 q80Var, int i) throws IOException;

    public boolean h(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    public boolean i() {
        return false;
    }
}
