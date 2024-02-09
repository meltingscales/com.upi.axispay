package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import defpackage.o1;
import defpackage.p1;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: g1  reason: default package */
/* loaded from: classes.dex */
public class g1 implements o1, AdapterView.OnItemClickListener {
    public Context b;
    public LayoutInflater c;
    public i1 d;
    public ExpandedMenuView e;
    public int f;
    public int g;
    public int h;
    public o1.a i;
    public a j;
    public int k;

    /* compiled from: AxisPay */
    /* renamed from: g1$a */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {
        public int b = -1;

        public a() {
            a();
        }

        public void a() {
            k1 x = g1.this.d.x();
            if (x != null) {
                ArrayList<k1> B = g1.this.d.B();
                int size = B.size();
                for (int i = 0; i < size; i++) {
                    if (B.get(i) == x) {
                        this.b = i;
                        return;
                    }
                }
            }
            this.b = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public k1 getItem(int i) {
            ArrayList<k1> B = g1.this.d.B();
            int i2 = i + g1.this.f;
            int i3 = this.b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return B.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = g1.this.d.B().size() - g1.this.f;
            return this.b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                g1 g1Var = g1.this;
                view = g1Var.c.inflate(g1Var.h, viewGroup, false);
            }
            ((p1.a) view).e(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public g1(Context context, int i) {
        this(i, 0);
        this.b = context;
        this.c = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.j == null) {
            this.j = new a();
        }
        return this.j;
    }

    @Override // defpackage.o1
    public void b(i1 i1Var, boolean z) {
        o1.a aVar = this.i;
        if (aVar != null) {
            aVar.b(i1Var, z);
        }
    }

    public p1 c(ViewGroup viewGroup) {
        if (this.e == null) {
            this.e = (ExpandedMenuView) this.c.inflate(r.abc_expanded_menu_layout, viewGroup, false);
            if (this.j == null) {
                this.j = new a();
            }
            this.e.setAdapter((ListAdapter) this.j);
            this.e.setOnItemClickListener(this);
        }
        return this.e;
    }

    @Override // defpackage.o1
    public void d(Context context, i1 i1Var) {
        if (this.g != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.g);
            this.b = contextThemeWrapper;
            this.c = LayoutInflater.from(contextThemeWrapper);
        } else if (this.b != null) {
            this.b = context;
            if (this.c == null) {
                this.c = LayoutInflater.from(context);
            }
        }
        this.d = i1Var;
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.o1
    public void e(Parcelable parcelable) {
        h((Bundle) parcelable);
    }

    @Override // defpackage.o1
    public boolean f(t1 t1Var) {
        if (t1Var.hasVisibleItems()) {
            new j1(t1Var).d(null);
            o1.a aVar = this.i;
            if (aVar != null) {
                aVar.c(t1Var);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.o1
    public void g(boolean z) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.o1
    public int getId() {
        return this.k;
    }

    public void h(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(C0059ao.a(5137));
        if (sparseParcelableArray != null) {
            this.e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // defpackage.o1
    public boolean i() {
        return false;
    }

    @Override // defpackage.o1
    public Parcelable j() {
        if (this.e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        n(bundle);
        return bundle;
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
        this.i = aVar;
    }

    public void n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(C0059ao.a(5138), sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.d.O(this.j.getItem(i), this, 0);
    }

    public g1(int i, int i2) {
        this.h = i;
        this.g = i2;
    }
}
