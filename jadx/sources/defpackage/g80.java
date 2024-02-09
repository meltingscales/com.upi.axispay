package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: g80  reason: default package */
/* loaded from: classes.dex */
public final class g80 implements x70 {
    public final LruCache<String, b> a;

    /* compiled from: AxisPay */
    /* renamed from: g80$a */
    /* loaded from: classes.dex */
    public class a extends LruCache<String, b> {
        public a(g80 g80Var, int i) {
            super(i);
        }

        @Override // android.util.LruCache
        /* renamed from: a */
        public int sizeOf(String str, b bVar) {
            return bVar.b;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: g80$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final Bitmap a;
        public final int b;

        public b(Bitmap bitmap, int i) {
            this.a = bitmap;
            this.b = i;
        }
    }

    public g80(Context context) {
        this(x80.b(context));
    }

    @Override // defpackage.x70
    public Bitmap a(String str) {
        b bVar = this.a.get(str);
        if (bVar != null) {
            return bVar.a;
        }
        return null;
    }

    @Override // defpackage.x70
    public int b() {
        return this.a.maxSize();
    }

    @Override // defpackage.x70
    public void c(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            int i = x80.i(bitmap);
            if (i > b()) {
                this.a.remove(str);
                return;
            } else {
                this.a.put(str, new b(bitmap, i));
                return;
            }
        }
        throw new NullPointerException(C0059ao.a(8141));
    }

    @Override // defpackage.x70
    public int size() {
        return this.a.size();
    }

    public g80(int i) {
        this.a = new a(this, i);
    }
}
