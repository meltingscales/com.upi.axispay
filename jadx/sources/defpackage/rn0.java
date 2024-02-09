package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: rn0  reason: default package */
/* loaded from: classes.dex */
public final class rn0 implements hn0<rm0> {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final hl0<CharSequence, Integer, gi0<Integer, Integer>> d;

    /* compiled from: AxisPay */
    /* renamed from: rn0$a */
    /* loaded from: classes.dex */
    public static final class a implements Iterator<rm0>, om0 {
        public int b = -1;
        public int c;
        public int d;
        public rm0 e;
        public int f;

        public a() {
            int e = tm0.e(rn0.this.b, 0, rn0.this.a.length());
            this.c = e;
            this.d = e;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < r6.g.c) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r6 = this;
                int r0 = r6.d
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.b = r1
                r0 = 0
                r6.e = r0
                goto L9e
            Lc:
                rn0 r0 = defpackage.rn0.this
                int r0 = defpackage.rn0.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f
                int r0 = r0 + r3
                r6.f = r0
                rn0 r4 = defpackage.rn0.this
                int r4 = defpackage.rn0.d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.d
                rn0 r4 = defpackage.rn0.this
                java.lang.CharSequence r4 = defpackage.rn0.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                rm0 r0 = new rm0
                int r1 = r6.c
                rn0 r4 = defpackage.rn0.this
                java.lang.CharSequence r4 = defpackage.rn0.c(r4)
                int r4 = defpackage.co0.G(r4)
                r0.<init>(r1, r4)
                r6.e = r0
                r6.d = r2
                goto L9c
            L47:
                rn0 r0 = defpackage.rn0.this
                hl0 r0 = defpackage.rn0.b(r0)
                rn0 r4 = defpackage.rn0.this
                java.lang.CharSequence r4 = defpackage.rn0.c(r4)
                int r5 = r6.d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.a(r4, r5)
                gi0 r0 = (defpackage.gi0) r0
                if (r0 != 0) goto L77
                rm0 r0 = new rm0
                int r1 = r6.c
                rn0 r4 = defpackage.rn0.this
                java.lang.CharSequence r4 = defpackage.rn0.c(r4)
                int r4 = defpackage.co0.G(r4)
                r0.<init>(r1, r4)
                r6.e = r0
                r6.d = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.c
                rm0 r4 = defpackage.tm0.h(r4, r2)
                r6.e = r4
                int r2 = r2 + r0
                r6.c = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.d = r2
            L9c:
                r6.b = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rn0.a.a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public rm0 next() {
            if (this.b == -1) {
                a();
            }
            if (this.b != 0) {
                rm0 rm0Var = this.e;
                Objects.requireNonNull(rm0Var, C0059ao.a(12864));
                this.e = null;
                this.b = -1;
                return rm0Var;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b == -1) {
                a();
            }
            return this.b == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(C0059ao.a(12865));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rn0(CharSequence charSequence, int i, int i2, hl0<? super CharSequence, ? super Integer, gi0<Integer, Integer>> hl0Var) {
        yl0.e(charSequence, C0059ao.a(11324));
        yl0.e(hl0Var, C0059ao.a(11325));
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = hl0Var;
    }

    @Override // defpackage.hn0
    public Iterator<rm0> iterator() {
        return new a();
    }
}
