package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: AxisPay */
/* renamed from: a1  reason: default package */
/* loaded from: classes.dex */
public class a1 {
    public Interpolator c;
    public fc d;
    public boolean e;
    public long b = -1;
    public final gc f = new a();
    public final ArrayList<ec> a = new ArrayList<>();

    /* compiled from: AxisPay */
    /* renamed from: a1$a */
    /* loaded from: classes.dex */
    public class a extends gc {
        public boolean a = false;
        public int b = 0;

        public a() {
        }

        @Override // defpackage.gc, defpackage.fc
        public void b(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == a1.this.a.size()) {
                fc fcVar = a1.this.d;
                if (fcVar != null) {
                    fcVar.b(null);
                }
                d();
            }
        }

        @Override // defpackage.gc, defpackage.fc
        public void c(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            fc fcVar = a1.this.d;
            if (fcVar != null) {
                fcVar.c(null);
            }
        }

        public void d() {
            this.b = 0;
            this.a = false;
            a1.this.b();
        }
    }

    public void a() {
        if (this.e) {
            Iterator<ec> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.e = false;
        }
    }

    public void b() {
        this.e = false;
    }

    public a1 c(ec ecVar) {
        if (!this.e) {
            this.a.add(ecVar);
        }
        return this;
    }

    public a1 d(ec ecVar, ec ecVar2) {
        this.a.add(ecVar);
        ecVar2.j(ecVar.c());
        this.a.add(ecVar2);
        return this;
    }

    public a1 e(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public a1 f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public a1 g(fc fcVar) {
        if (!this.e) {
            this.d = fcVar;
        }
        return this;
    }

    public void h() {
        if (this.e) {
            return;
        }
        Iterator<ec> it = this.a.iterator();
        while (it.hasNext()) {
            ec next = it.next();
            long j = this.b;
            if (j >= 0) {
                next.f(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                next.g(interpolator);
            }
            if (this.d != null) {
                next.h(this.f);
            }
            next.l();
        }
        this.e = true;
    }
}
