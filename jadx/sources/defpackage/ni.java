package defpackage;

import android.graphics.Color;
import com.google.android.gms.common.api.Api;
import defpackage.oi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ni  reason: default package */
/* loaded from: classes.dex */
public final class ni {
    public static final Comparator<b> f = new a();
    public final int[] a;
    public final int[] b;
    public final List<oi.d> c;
    public final oi.c[] d;
    public final float[] e = new float[3];

    /* compiled from: AxisPay */
    /* renamed from: ni$a */
    /* loaded from: classes.dex */
    public static class a implements Comparator<b> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return bVar2.g() - bVar.g();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ni$b */
    /* loaded from: classes.dex */
    public class b {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
            c();
        }

        public final boolean a() {
            return e() > 1;
        }

        public final int b() {
            int f = f();
            ni niVar = ni.this;
            int[] iArr = niVar.a;
            int[] iArr2 = niVar.b;
            ni.e(iArr, f, this.a, this.b);
            Arrays.sort(iArr, this.a, this.b + 1);
            ni.e(iArr, f, this.a, this.b);
            int i = this.c / 2;
            int i2 = this.a;
            int i3 = 0;
            while (true) {
                int i4 = this.b;
                if (i2 <= i4) {
                    i3 += iArr2[iArr[i2]];
                    if (i3 >= i) {
                        return Math.min(i4 - 1, i2);
                    }
                    i2++;
                } else {
                    return this.a;
                }
            }
        }

        public final void c() {
            ni niVar = ni.this;
            int[] iArr = niVar.a;
            int[] iArr2 = niVar.b;
            int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = 0;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = this.a; i8 <= this.b; i8++) {
                int i9 = iArr[i8];
                i5 += iArr2[i9];
                int k = ni.k(i9);
                int j = ni.j(i9);
                int i10 = ni.i(i9);
                if (k > i2) {
                    i2 = k;
                }
                if (k < i) {
                    i = k;
                }
                if (j > i3) {
                    i3 = j;
                }
                if (j < i6) {
                    i6 = j;
                }
                if (i10 > i4) {
                    i4 = i10;
                }
                if (i10 < i7) {
                    i7 = i10;
                }
            }
            this.d = i;
            this.e = i2;
            this.f = i6;
            this.g = i3;
            this.h = i7;
            this.i = i4;
            this.c = i5;
        }

        public final oi.d d() {
            ni niVar = ni.this;
            int[] iArr = niVar.a;
            int[] iArr2 = niVar.b;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.a; i5 <= this.b; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i2 += i7;
                i += ni.k(i6) * i7;
                i3 += ni.j(i6) * i7;
                i4 += i7 * ni.i(i6);
            }
            float f = i2;
            return new oi.d(ni.b(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
        }

        public final int e() {
            return (this.b + 1) - this.a;
        }

        public final int f() {
            int i = this.e - this.d;
            int i2 = this.g - this.f;
            int i3 = this.i - this.h;
            if (i < i2 || i < i3) {
                return (i2 < i || i2 < i3) ? -1 : -2;
            }
            return -3;
        }

        public final int g() {
            return ((this.e - this.d) + 1) * ((this.g - this.f) + 1) * ((this.i - this.h) + 1);
        }

        public final b h() {
            if (a()) {
                int b = b();
                b bVar = new b(b + 1, this.b);
                this.b = b;
                c();
                return bVar;
            }
            throw new IllegalStateException(C0059ao.a(12843));
        }
    }

    public ni(int[] iArr, int i, oi.c[] cVarArr) {
        this.d = cVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int g = g(iArr[i2]);
            iArr[i2] = g;
            iArr2[g] = iArr2[g] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && l(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 <= i) {
            this.c = new ArrayList();
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = iArr3[i7];
                this.c.add(new oi.d(a(i8), iArr2[i8]));
            }
            return;
        }
        this.c = h(i);
    }

    public static int a(int i) {
        return b(k(i), j(i), i(i));
    }

    public static int b(int i, int i2, int i3) {
        return Color.rgb(f(i, 5, 8), f(i2, 5, 8), f(i3, 5, 8));
    }

    public static void e(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = i(i4) | (j(i4) << 10) | (k(i4) << 5);
                i2++;
            }
        } else if (i != -1) {
        } else {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = k(i5) | (i(i5) << 10) | (j(i5) << 5);
                i2++;
            }
        }
    }

    public static int f(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public static int g(int i) {
        return f(Color.blue(i), 8, 5) | (f(Color.red(i), 8, 5) << 10) | (f(Color.green(i), 8, 5) << 5);
    }

    public static int i(int i) {
        return i & 31;
    }

    public static int j(int i) {
        return (i >> 5) & 31;
    }

    public static int k(int i) {
        return (i >> 10) & 31;
    }

    public final List<oi.d> c(Collection<b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (b bVar : collection) {
            oi.d d = bVar.d();
            if (!n(d)) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    public List<oi.d> d() {
        return this.c;
    }

    public final List<oi.d> h(int i) {
        PriorityQueue<b> priorityQueue = new PriorityQueue<>(i, f);
        priorityQueue.offer(new b(0, this.a.length - 1));
        o(priorityQueue, i);
        return c(priorityQueue);
    }

    public final boolean l(int i) {
        int a2 = a(i);
        d9.f(a2, this.e);
        return m(a2, this.e);
    }

    public final boolean m(int i, float[] fArr) {
        oi.c[] cVarArr = this.d;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.d[i2].a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean n(oi.d dVar) {
        return m(dVar.e(), dVar.c());
    }

    public final void o(PriorityQueue<b> priorityQueue, int i) {
        b poll;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.a()) {
            priorityQueue.offer(poll.h());
            priorityQueue.offer(poll);
        }
    }
}
