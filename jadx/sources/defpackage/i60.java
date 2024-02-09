package defpackage;

import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: i60  reason: default package */
/* loaded from: classes.dex */
public final class i60 {
    public final Object a;

    /* compiled from: AxisPay */
    /* renamed from: i60$b */
    /* loaded from: classes.dex */
    public static class b {
        public int a = 0;
        public int b = 0;
        public int c = 0;
        public Drawable d = null;
        public Drawable e = null;
        public Drawable f = null;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public m60 j = m60.IN_SAMPLE_POWER_OF_2;
        public BitmapFactory.Options k = new BitmapFactory.Options();
        public int l = 0;
        public boolean m = false;
        public Object n = null;
        public x60 o = null;
        public x60 p = null;
        public s60 q = h60.a();
        public Handler r = null;
        public boolean s = false;

        public i60 t() {
            return new i60(this);
        }

        public b u(boolean z) {
            this.h = z;
            return this;
        }

        public b v(boolean z) {
            this.i = z;
            return this;
        }

        public b w(s60 s60Var) {
            if (s60Var != null) {
                this.q = s60Var;
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(8097));
        }

        public b x(m60 m60Var) {
            this.j = m60Var;
            return this;
        }
    }

    public static i60 a() {
        return new b().t();
    }

    public i60(b bVar) {
        int unused = bVar.a;
        int unused2 = bVar.b;
        int unused3 = bVar.c;
        Drawable unused4 = bVar.d;
        Drawable unused5 = bVar.e;
        Drawable unused6 = bVar.f;
        boolean unused7 = bVar.g;
        boolean unused8 = bVar.h;
        boolean unused9 = bVar.i;
        m60 unused10 = bVar.j;
        BitmapFactory.Options unused11 = bVar.k;
        int unused12 = bVar.l;
        boolean unused13 = bVar.m;
        this.a = bVar.n;
        x60 unused14 = bVar.o;
        x60 unused15 = bVar.p;
        s60 unused16 = bVar.q;
        Handler unused17 = bVar.r;
        boolean unused18 = bVar.s;
    }
}
