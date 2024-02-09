package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.o1;
import defpackage.p1;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: d1  reason: default package */
/* loaded from: classes.dex */
public abstract class d1 implements o1 {
    public Context b;
    public Context c;
    public i1 d;
    public LayoutInflater e;
    public o1.a f;
    public int g;
    public int h;
    public p1 i;
    public int j;

    public d1(Context context, int i, int i2) {
        this.b = context;
        this.e = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    public void a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i);
    }

    @Override // defpackage.o1
    public void b(i1 i1Var, boolean z) {
        o1.a aVar = this.f;
        if (aVar != null) {
            aVar.b(i1Var, z);
        }
    }

    public abstract void c(k1 k1Var, p1.a aVar);

    @Override // defpackage.o1
    public void d(Context context, i1 i1Var) {
        this.c = context;
        LayoutInflater.from(context);
        this.d = i1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [i1] */
    @Override // defpackage.o1
    public boolean f(t1 t1Var) {
        o1.a aVar = this.f;
        t1 t1Var2 = t1Var;
        if (aVar != null) {
            if (t1Var == null) {
                t1Var2 = this.d;
            }
            return aVar.c(t1Var2);
        }
        return false;
    }

    @Override // defpackage.o1
    public void g(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return;
        }
        i1 i1Var = this.d;
        int i = 0;
        if (i1Var != null) {
            i1Var.t();
            ArrayList<k1> G = this.d.G();
            int size = G.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                k1 k1Var = G.get(i3);
                if (s(i2, k1Var)) {
                    View childAt = viewGroup.getChildAt(i2);
                    k1 itemData = childAt instanceof p1.a ? ((p1.a) childAt).getItemData() : null;
                    View p = p(k1Var, childAt, viewGroup);
                    if (k1Var != itemData) {
                        p.setPressed(false);
                        p.jumpDrawablesToCurrentState();
                    }
                    if (p != childAt) {
                        a(p, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!n(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // defpackage.o1
    public int getId() {
        return this.j;
    }

    public p1.a h(ViewGroup viewGroup) {
        return (p1.a) this.e.inflate(this.h, viewGroup, false);
    }

    @Override // defpackage.o1
    public boolean k(i1 i1Var, k1 k1Var) {
        return false;
    }

    @Override // defpackage.o1
    public boolean l(i1 i1Var, k1 k1Var) {
        return false;
    }

    @Override // defpackage.o1
    public void m(o1.a aVar) {
        this.f = aVar;
    }

    public boolean n(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public o1.a o() {
        return this.f;
    }

    public View p(k1 k1Var, View view, ViewGroup viewGroup) {
        p1.a h;
        if (view instanceof p1.a) {
            h = (p1.a) view;
        } else {
            h = h(viewGroup);
        }
        c(k1Var, h);
        return (View) h;
    }

    public p1 q(ViewGroup viewGroup) {
        if (this.i == null) {
            p1 p1Var = (p1) this.e.inflate(this.g, viewGroup, false);
            this.i = p1Var;
            p1Var.b(this.d);
            g(true);
        }
        return this.i;
    }

    public void r(int i) {
        this.j = i;
    }

    public abstract boolean s(int i, k1 k1Var);
}
