package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.cj;
import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: vi  reason: default package */
/* loaded from: classes.dex */
public final class vi implements cj.a {
    public ab<b> a;
    public final ArrayList<b> b;
    public final ArrayList<b> c;
    public final a d;
    public Runnable e;
    public final boolean f;
    public final cj g;
    public int h;

    /* compiled from: AxisPay */
    /* renamed from: vi$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i, int i2);

        void b(b bVar);

        RecyclerView.d0 c(int i);

        void d(int i, int i2);

        void e(int i, int i2);

        void f(int i, int i2);

        void g(b bVar);

        void h(int i, int i2, Object obj);
    }

    /* compiled from: AxisPay */
    /* renamed from: vi$b */
    /* loaded from: classes.dex */
    public static final class b {
        public int a;
        public int b;
        public Object c;
        public int d;

        public b(int i, int i2, int i3, Object obj) {
            this.a = i;
            this.b = i2;
            this.d = i3;
            this.c = obj;
        }

        public String a() {
            int i = this.a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? C0059ao.a(14805) : C0059ao.a(14806) : C0059ao.a(14807) : C0059ao.a(14808) : C0059ao.a(14809);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i = this.a;
                if (i != bVar.a) {
                    return false;
                }
                if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == bVar.b && this.b == bVar.d) {
                    return true;
                }
                if (this.d == bVar.d && this.b == bVar.b) {
                    Object obj2 = this.c;
                    if (obj2 != null) {
                        if (!obj2.equals(bVar.c)) {
                            return false;
                        }
                    } else if (bVar.c != null) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + C0059ao.a(14810) + a() + C0059ao.a(14811) + this.b + C0059ao.a(14812) + this.d + C0059ao.a(14813) + this.c + C0059ao.a(14814);
        }
    }

    public vi(a aVar) {
        this(aVar, false);
    }

    @Override // defpackage.cj.a
    public void a(b bVar) {
        if (this.f) {
            return;
        }
        bVar.c = null;
        this.a.a(bVar);
    }

    @Override // defpackage.cj.a
    public b b(int i, int i2, int i3, Object obj) {
        b b2 = this.a.b();
        if (b2 == null) {
            return new b(i, i2, i3, obj);
        }
        b2.a = i;
        b2.b = i2;
        b2.d = i3;
        b2.c = obj;
        return b2;
    }

    public final void c(b bVar) {
        r(bVar);
    }

    public final void d(b bVar) {
        r(bVar);
    }

    public int e(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.b.get(i2);
            int i3 = bVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.b;
                    if (i4 <= i) {
                        int i5 = bVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.b;
                    if (i6 == i) {
                        i = bVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.b <= i) {
                i += bVar.d;
            }
        }
        return i;
    }

    public final void f(b bVar) {
        boolean z;
        char c;
        int i = bVar.b;
        int i2 = bVar.d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.d.c(i3) != null || h(i3)) {
                if (c2 == 0) {
                    k(b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    r(b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.d) {
            a(bVar);
            bVar = b(2, i, i4, null);
        }
        if (c2 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    public final void g(b bVar) {
        int i = bVar.b;
        int i2 = bVar.d + i;
        int i3 = 0;
        boolean z = true;
        int i4 = i;
        while (i < i2) {
            if (this.d.c(i) != null || h(i)) {
                if (!z) {
                    k(b(4, i4, i3, bVar.c));
                    i4 = i;
                    i3 = 0;
                }
                z = true;
            } else {
                if (z) {
                    r(b(4, i4, i3, bVar.c));
                    i4 = i;
                    i3 = 0;
                }
                z = false;
            }
            i3++;
            i++;
        }
        if (i3 != bVar.d) {
            Object obj = bVar.c;
            a(bVar);
            bVar = b(4, i4, i3, obj);
        }
        if (!z) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    public final boolean h(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                if (n(bVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.b;
                int i5 = bVar.d + i4;
                while (i4 < i5) {
                    if (n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void i() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.d.b(this.c.get(i));
        }
        t(this.c);
        this.h = 0;
    }

    public void j() {
        i();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.b.get(i);
            int i2 = bVar.a;
            if (i2 == 1) {
                this.d.b(bVar);
                this.d.e(bVar.b, bVar.d);
            } else if (i2 == 2) {
                this.d.b(bVar);
                this.d.f(bVar.b, bVar.d);
            } else if (i2 == 4) {
                this.d.b(bVar);
                this.d.h(bVar.b, bVar.d, bVar.c);
            } else if (i2 == 8) {
                this.d.b(bVar);
                this.d.a(bVar.b, bVar.d);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        t(this.b);
        this.h = 0;
    }

    public final void k(b bVar) {
        int i;
        int i2 = bVar.a;
        if (i2 != 1 && i2 != 8) {
            int v = v(bVar.b, i2);
            int i3 = bVar.b;
            int i4 = bVar.a;
            if (i4 == 2) {
                i = 0;
            } else if (i4 != 4) {
                throw new IllegalArgumentException(C0059ao.a(4782) + bVar);
            } else {
                i = 1;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < bVar.d; i6++) {
                int v2 = v(bVar.b + (i * i6), bVar.a);
                int i7 = bVar.a;
                if (i7 == 2 ? v2 == v : i7 == 4 && v2 == v + 1) {
                    i5++;
                } else {
                    b b2 = b(i7, v, i5, bVar.c);
                    l(b2, i3);
                    a(b2);
                    if (bVar.a == 4) {
                        i3 += i5;
                    }
                    i5 = 1;
                    v = v2;
                }
            }
            Object obj = bVar.c;
            a(bVar);
            if (i5 > 0) {
                b b3 = b(bVar.a, v, i5, obj);
                l(b3, i3);
                a(b3);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(4783));
    }

    public void l(b bVar, int i) {
        this.d.g(bVar);
        int i2 = bVar.a;
        if (i2 == 2) {
            this.d.f(i, bVar.d);
        } else if (i2 == 4) {
            this.d.h(i, bVar.d, bVar.c);
        } else {
            throw new IllegalArgumentException(C0059ao.a(4784));
        }
    }

    public int m(int i) {
        return n(i, 0);
    }

    public int n(int i, int i2) {
        int size = this.c.size();
        while (i2 < size) {
            b bVar = this.c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                int i4 = bVar.b;
                if (i4 == i) {
                    i = bVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean o(int i) {
        return (i & this.h) != 0;
    }

    public boolean p() {
        return this.b.size() > 0;
    }

    public boolean q() {
        return (this.c.isEmpty() || this.b.isEmpty()) ? false : true;
    }

    public final void r(b bVar) {
        this.c.add(bVar);
        int i = bVar.a;
        if (i == 1) {
            this.d.e(bVar.b, bVar.d);
        } else if (i == 2) {
            this.d.d(bVar.b, bVar.d);
        } else if (i == 4) {
            this.d.h(bVar.b, bVar.d, bVar.c);
        } else if (i == 8) {
            this.d.a(bVar.b, bVar.d);
        } else {
            throw new IllegalArgumentException(C0059ao.a(4785) + bVar);
        }
    }

    public void s() {
        this.g.b(this.b);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.b.get(i);
            int i2 = bVar.a;
            if (i2 == 1) {
                c(bVar);
            } else if (i2 == 2) {
                f(bVar);
            } else if (i2 == 4) {
                g(bVar);
            } else if (i2 == 8) {
                d(bVar);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.b.clear();
    }

    public void t(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(list.get(i));
        }
        list.clear();
    }

    public void u() {
        t(this.b);
        t(this.c);
        this.h = 0;
    }

    public final int v(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            b bVar = this.c.get(size);
            int i5 = bVar.a;
            if (i5 == 8) {
                int i6 = bVar.b;
                int i7 = bVar.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.b = i6 + 1;
                            bVar.d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.b = i6 - 1;
                            bVar.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.d;
                    } else if (i5 == 2) {
                        i += bVar.d;
                    }
                } else if (i2 == 1) {
                    bVar.b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.b = i8 - 1;
                }
            }
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.c.get(size2);
            if (bVar2.a == 8) {
                int i9 = bVar2.d;
                if (i9 == bVar2.b || i9 < 0) {
                    this.c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.d <= 0) {
                this.c.remove(size2);
                a(bVar2);
            }
        }
        return i;
    }

    public vi(a aVar, boolean z) {
        this.a = new bb(30);
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.h = 0;
        this.d = aVar;
        this.f = z;
        this.g = new cj(this);
    }
}
