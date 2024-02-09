package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: oi  reason: default package */
/* loaded from: classes.dex */
public final class oi {
    public static final c f = new a();
    public final List<d> a;
    public final List<pi> b;
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final Map<pi, d> c = new o4();
    public final d e = a();

    /* compiled from: AxisPay */
    /* renamed from: oi$a */
    /* loaded from: classes.dex */
    public static class a implements c {
        @Override // defpackage.oi.c
        public boolean a(int i, float[] fArr) {
            return (d(fArr) || b(fArr) || c(fArr)) ? false : true;
        }

        public final boolean b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        public final boolean c(float[] fArr) {
            return fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
        }

        public final boolean d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: oi$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final List<d> a;
        public final Bitmap b;
        public final List<pi> c;
        public int d;
        public int e;
        public int f;
        public final List<c> g;
        public Rect h;

        public b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            this.d = 16;
            this.e = 12544;
            this.f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.g = arrayList2;
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList2.add(oi.f);
                this.b = bitmap;
                this.a = null;
                arrayList.add(pi.e);
                arrayList.add(pi.f);
                arrayList.add(pi.g);
                arrayList.add(pi.h);
                arrayList.add(pi.i);
                arrayList.add(pi.j);
                return;
            }
            throw new IllegalArgumentException(C0059ao.a(2364));
        }

        public oi a() {
            List<d> list;
            c[] cVarArr;
            Bitmap bitmap = this.b;
            if (bitmap != null) {
                Bitmap d = d(bitmap);
                Rect rect = this.h;
                if (d != this.b && rect != null) {
                    double width = d.getWidth() / this.b.getWidth();
                    rect.left = (int) Math.floor(rect.left * width);
                    rect.top = (int) Math.floor(rect.top * width);
                    rect.right = Math.min((int) Math.ceil(rect.right * width), d.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(rect.bottom * width), d.getHeight());
                }
                int[] b = b(d);
                int i = this.d;
                if (this.g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<c> list2 = this.g;
                    cVarArr = (c[]) list2.toArray(new c[list2.size()]);
                }
                ni niVar = new ni(b, i, cVarArr);
                if (d != this.b) {
                    d.recycle();
                }
                list = niVar.d();
            } else {
                list = this.a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            oi oiVar = new oi(list, this.c);
            oiVar.b();
            return oiVar;
        }

        public final int[] b(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.h.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        public b c(int i) {
            this.d = i;
            return this;
        }

        public final Bitmap d(Bitmap bitmap) {
            int max;
            int i;
            double d = -1.0d;
            if (this.e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.e;
                if (width > i2) {
                    d = Math.sqrt(i2 / width);
                }
            } else if (this.f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f)) {
                d = i / max;
            }
            return d <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: oi$c */
    /* loaded from: classes.dex */
    public interface c {
        boolean a(int i, float[] fArr);
    }

    /* compiled from: AxisPay */
    /* renamed from: oi$d */
    /* loaded from: classes.dex */
    public static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public boolean f;
        public int g;
        public int h;
        public float[] i;

        public d(int i, int i2) {
            this.a = Color.red(i);
            this.b = Color.green(i);
            this.c = Color.blue(i);
            this.d = i;
            this.e = i2;
        }

        public final void a() {
            int m;
            int m2;
            if (this.f) {
                return;
            }
            int e = d9.e(-1, this.d, 4.5f);
            int e2 = d9.e(-1, this.d, 3.0f);
            if (e != -1 && e2 != -1) {
                this.h = d9.m(-1, e);
                this.g = d9.m(-1, e2);
                this.f = true;
                return;
            }
            int e3 = d9.e(-16777216, this.d, 4.5f);
            int e4 = d9.e(-16777216, this.d, 3.0f);
            if (e3 != -1 && e4 != -1) {
                this.h = d9.m(-16777216, e3);
                this.g = d9.m(-16777216, e4);
                this.f = true;
                return;
            }
            if (e != -1) {
                m = d9.m(-1, e);
            } else {
                m = d9.m(-16777216, e3);
            }
            this.h = m;
            if (e2 != -1) {
                m2 = d9.m(-1, e2);
            } else {
                m2 = d9.m(-16777216, e4);
            }
            this.g = m2;
            this.f = true;
        }

        public int b() {
            a();
            return this.h;
        }

        public float[] c() {
            if (this.i == null) {
                this.i = new float[3];
            }
            d9.a(this.a, this.b, this.c, this.i);
            return this.i;
        }

        public int d() {
            return this.e;
        }

        public int e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.e == dVar.e && this.d == dVar.d;
        }

        public int f() {
            a();
            return this.g;
        }

        public int hashCode() {
            return (this.d * 31) + this.e;
        }

        public String toString() {
            return d.class.getSimpleName() + C0059ao.a(2274) + Integer.toHexString(e()) + ']' + C0059ao.a(2275) + Arrays.toString(c()) + ']' + C0059ao.a(2276) + this.e + ']' + C0059ao.a(2277) + Integer.toHexString(f()) + ']' + C0059ao.a(2278) + Integer.toHexString(b()) + ']';
        }
    }

    public oi(List<d> list, List<pi> list2) {
        this.a = list;
        this.b = list2;
    }

    public final d a() {
        int size = this.a.size();
        int i = RecyclerView.UNDEFINED_DURATION;
        d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar2 = this.a.get(i2);
            if (dVar2.d() > i) {
                i = dVar2.d();
                dVar = dVar2;
            }
        }
        return dVar;
    }

    public void b() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            pi piVar = this.b.get(i);
            piVar.k();
            this.c.put(piVar, d(piVar));
        }
        this.d.clear();
    }

    public final float c(d dVar, pi piVar) {
        float[] c2 = dVar.c();
        d dVar2 = this.e;
        int d2 = dVar2 != null ? dVar2.d() : 1;
        return (piVar.g() > 0.0f ? piVar.g() * (1.0f - Math.abs(c2[1] - piVar.i())) : 0.0f) + (piVar.a() > 0.0f ? piVar.a() * (1.0f - Math.abs(c2[2] - piVar.h())) : 0.0f) + (piVar.f() > 0.0f ? piVar.f() * (dVar.d() / d2) : 0.0f);
    }

    public final d d(pi piVar) {
        d e = e(piVar);
        if (e != null && piVar.j()) {
            this.d.append(e.e(), true);
        }
        return e;
    }

    public final d e(pi piVar) {
        int size = this.a.size();
        float f2 = 0.0f;
        d dVar = null;
        for (int i = 0; i < size; i++) {
            d dVar2 = this.a.get(i);
            if (g(dVar2, piVar)) {
                float c2 = c(dVar2, piVar);
                if (dVar == null || c2 > f2) {
                    dVar = dVar2;
                    f2 = c2;
                }
            }
        }
        return dVar;
    }

    public List<d> f() {
        return Collections.unmodifiableList(this.a);
    }

    public final boolean g(d dVar, pi piVar) {
        float[] c2 = dVar.c();
        return c2[1] >= piVar.e() && c2[1] <= piVar.c() && c2[2] >= piVar.d() && c2[2] <= piVar.b() && !this.d.get(dVar.e());
    }
}
