package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import defpackage.lc;
import defpackage.o1;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ey  reason: default package */
/* loaded from: classes.dex */
public class ey implements o1 {
    public NavigationMenuView b;
    public LinearLayout c;
    public o1.a d;
    public i1 e;
    public int f;
    public c g;
    public LayoutInflater h;
    public int i;
    public boolean j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public int s;
    public int t;
    public int u;
    public boolean r = true;
    public int v = -1;
    public final View.OnClickListener w = new a();

    /* compiled from: AxisPay */
    /* renamed from: ey$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            ey.this.J(true);
            k1 itemData = ((NavigationMenuItemView) view).getItemData();
            ey eyVar = ey.this;
            boolean O = eyVar.e.O(itemData, eyVar, 0);
            if (itemData != null && itemData.isCheckable() && O) {
                ey.this.g.F(itemData);
            } else {
                z = false;
            }
            ey.this.J(false);
            if (z) {
                ey.this.g(false);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ey$b */
    /* loaded from: classes.dex */
    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ey$c */
    /* loaded from: classes.dex */
    public class c extends RecyclerView.h<l> {
        public final ArrayList<e> d = new ArrayList<>();
        public k1 e;
        public boolean f;

        public c() {
            D();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: A */
        public void l(l lVar, int i) {
            int g = g(i);
            if (g != 0) {
                if (g == 1) {
                    ((TextView) lVar.b).setText(((g) this.d.get(i)).a().getTitle());
                    return;
                } else if (g != 2) {
                    return;
                } else {
                    f fVar = (f) this.d.get(i);
                    lVar.b.setPadding(0, fVar.b(), 0, fVar.a());
                    return;
                }
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.b;
            navigationMenuItemView.setIconTintList(ey.this.l);
            ey eyVar = ey.this;
            if (eyVar.j) {
                navigationMenuItemView.setTextAppearance(eyVar.i);
            }
            ColorStateList colorStateList = ey.this.k;
            if (colorStateList != null) {
                navigationMenuItemView.setTextColor(colorStateList);
            }
            Drawable drawable = ey.this.m;
            ac.u0(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            g gVar = (g) this.d.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.b);
            navigationMenuItemView.setHorizontalPadding(ey.this.n);
            navigationMenuItemView.setIconPadding(ey.this.o);
            ey eyVar2 = ey.this;
            if (eyVar2.q) {
                navigationMenuItemView.setIconSize(eyVar2.p);
            }
            navigationMenuItemView.setMaxLines(ey.this.s);
            navigationMenuItemView.e(gVar.a(), 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: B */
        public l n(ViewGroup viewGroup, int i) {
            if (i == 0) {
                ey eyVar = ey.this;
                return new i(eyVar.h, viewGroup, eyVar.w);
            } else if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return new b(ey.this.c);
                }
                return new j(ey.this.h, viewGroup);
            } else {
                return new k(ey.this.h, viewGroup);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: C */
        public void s(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.b).D();
            }
        }

        public final void D() {
            if (this.f) {
                return;
            }
            boolean z = true;
            this.f = true;
            this.d.clear();
            this.d.add(new d());
            int i = -1;
            int size = ey.this.e.G().size();
            int i2 = 0;
            boolean z2 = false;
            int i3 = 0;
            while (i2 < size) {
                k1 k1Var = ey.this.e.G().get(i2);
                if (k1Var.isChecked()) {
                    F(k1Var);
                }
                if (k1Var.isCheckable()) {
                    k1Var.t(false);
                }
                if (k1Var.hasSubMenu()) {
                    SubMenu subMenu = k1Var.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i2 != 0) {
                            this.d.add(new f(ey.this.u, 0));
                        }
                        this.d.add(new g(k1Var));
                        int size2 = this.d.size();
                        int size3 = subMenu.size();
                        int i4 = 0;
                        boolean z3 = false;
                        while (i4 < size3) {
                            k1 k1Var2 = (k1) subMenu.getItem(i4);
                            if (k1Var2.isVisible()) {
                                if (!z3 && k1Var2.getIcon() != null) {
                                    z3 = z;
                                }
                                if (k1Var2.isCheckable()) {
                                    k1Var2.t(false);
                                }
                                if (k1Var.isChecked()) {
                                    F(k1Var);
                                }
                                this.d.add(new g(k1Var2));
                            }
                            i4++;
                            z = true;
                        }
                        if (z3) {
                            w(size2, this.d.size());
                        }
                    }
                } else {
                    int groupId = k1Var.getGroupId();
                    if (groupId != i) {
                        i3 = this.d.size();
                        z2 = k1Var.getIcon() != null;
                        if (i2 != 0) {
                            i3++;
                            ArrayList<e> arrayList = this.d;
                            int i5 = ey.this.u;
                            arrayList.add(new f(i5, i5));
                        }
                    } else if (!z2 && k1Var.getIcon() != null) {
                        w(i3, this.d.size());
                        z2 = true;
                    }
                    g gVar = new g(k1Var);
                    gVar.b = z2;
                    this.d.add(gVar);
                    i = groupId;
                }
                i2++;
                z = true;
            }
            this.f = false;
        }

        public void E(Bundle bundle) {
            k1 a;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            k1 a2;
            int i = bundle.getInt(C0059ao.a(12070), 0);
            if (i != 0) {
                this.f = true;
                int size = this.d.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    e eVar = this.d.get(i2);
                    if ((eVar instanceof g) && (a2 = ((g) eVar).a()) != null && a2.getItemId() == i) {
                        F(a2);
                        break;
                    }
                    i2++;
                }
                this.f = false;
                D();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(C0059ao.a(12071));
            if (sparseParcelableArray != null) {
                int size2 = this.d.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    e eVar2 = this.d.get(i3);
                    if ((eVar2 instanceof g) && (a = ((g) eVar2).a()) != null && (actionView = a.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void F(k1 k1Var) {
            if (this.e == k1Var || !k1Var.isCheckable()) {
                return;
            }
            k1 k1Var2 = this.e;
            if (k1Var2 != null) {
                k1Var2.setChecked(false);
            }
            this.e = k1Var;
            k1Var.setChecked(true);
        }

        public void G(boolean z) {
            this.f = z;
        }

        public void H() {
            D();
            j();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int e() {
            return this.d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long f(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int g(int i) {
            e eVar = this.d.get(i);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException(C0059ao.a(12072));
        }

        public final void w(int i, int i2) {
            while (i < i2) {
                ((g) this.d.get(i)).b = true;
                i++;
            }
        }

        public Bundle x() {
            Bundle bundle = new Bundle();
            k1 k1Var = this.e;
            if (k1Var != null) {
                bundle.putInt(C0059ao.a(12073), k1Var.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.d.get(i);
                if (eVar instanceof g) {
                    k1 a = ((g) eVar).a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(C0059ao.a(12074), sparseArray);
            return bundle;
        }

        public k1 y() {
            return this.e;
        }

        public int z() {
            int i = ey.this.c.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < ey.this.g.e(); i2++) {
                if (ey.this.g.g(i2) == 0) {
                    i++;
                }
            }
            return i;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ey$d */
    /* loaded from: classes.dex */
    public static class d implements e {
    }

    /* compiled from: AxisPay */
    /* renamed from: ey$e */
    /* loaded from: classes.dex */
    public interface e {
    }

    /* compiled from: AxisPay */
    /* renamed from: ey$f */
    /* loaded from: classes.dex */
    public static class f implements e {
        public final int a;
        public final int b;

        public f(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ey$g */
    /* loaded from: classes.dex */
    public static class g implements e {
        public final k1 a;
        public boolean b;

        public g(k1 k1Var) {
            this.a = k1Var;
        }

        public k1 a() {
            return this.a;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ey$h */
    /* loaded from: classes.dex */
    public class h extends fj {
        public h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // defpackage.fj, defpackage.eb
        public void g(View view, lc lcVar) {
            super.g(view, lcVar);
            lcVar.c0(lc.b.a(ey.this.g.z(), 0, false));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ey$i */
    /* loaded from: classes.dex */
    public static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(ov.design_navigation_item, viewGroup, false));
            this.b.setOnClickListener(onClickListener);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ey$j */
    /* loaded from: classes.dex */
    public static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(ov.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ey$k */
    /* loaded from: classes.dex */
    public static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(ov.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ey$l */
    /* loaded from: classes.dex */
    public static abstract class l extends RecyclerView.d0 {
        public l(View view) {
            super(view);
        }
    }

    public void A(Drawable drawable) {
        this.m = drawable;
        g(false);
    }

    public void B(int i2) {
        this.n = i2;
        g(false);
    }

    public void C(int i2) {
        this.o = i2;
        g(false);
    }

    public void D(int i2) {
        if (this.p != i2) {
            this.p = i2;
            this.q = true;
            g(false);
        }
    }

    public void E(ColorStateList colorStateList) {
        this.l = colorStateList;
        g(false);
    }

    public void F(int i2) {
        this.s = i2;
        g(false);
    }

    public void G(int i2) {
        this.i = i2;
        this.j = true;
        g(false);
    }

    public void H(ColorStateList colorStateList) {
        this.k = colorStateList;
        g(false);
    }

    public void I(int i2) {
        this.v = i2;
        NavigationMenuView navigationMenuView = this.b;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i2);
        }
    }

    public void J(boolean z) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.G(z);
        }
    }

    public final void K() {
        int i2 = (this.c.getChildCount() == 0 && this.r) ? this.t : 0;
        NavigationMenuView navigationMenuView = this.b;
        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // defpackage.o1
    public void b(i1 i1Var, boolean z) {
        o1.a aVar = this.d;
        if (aVar != null) {
            aVar.b(i1Var, z);
        }
    }

    public void c(View view) {
        this.c.addView(view);
        NavigationMenuView navigationMenuView = this.b;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // defpackage.o1
    public void d(Context context, i1 i1Var) {
        this.h = LayoutInflater.from(context);
        this.e = i1Var;
        this.u = context.getResources().getDimensionPixelOffset(kv.design_navigation_separator_vertical_padding);
    }

    @Override // defpackage.o1
    public void e(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(C0059ao.a(5346));
            if (sparseParcelableArray != null) {
                this.b.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(C0059ao.a(5347));
            if (bundle2 != null) {
                this.g.E(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray(C0059ao.a(5348));
            if (sparseParcelableArray2 != null) {
                this.c.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // defpackage.o1
    public boolean f(t1 t1Var) {
        return false;
    }

    @Override // defpackage.o1
    public void g(boolean z) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.H();
        }
    }

    @Override // defpackage.o1
    public int getId() {
        return this.f;
    }

    public void h(ic icVar) {
        int l2 = icVar.l();
        if (this.t != l2) {
            this.t = l2;
            K();
        }
        NavigationMenuView navigationMenuView = this.b;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, icVar.i());
        ac.h(this.c, icVar);
    }

    @Override // defpackage.o1
    public boolean i() {
        return false;
    }

    @Override // defpackage.o1
    public Parcelable j() {
        Bundle bundle = new Bundle();
        if (this.b != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.b.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(C0059ao.a(5349), sparseArray);
        }
        c cVar = this.g;
        if (cVar != null) {
            bundle.putBundle(C0059ao.a(5350), cVar.x());
        }
        if (this.c != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.c.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(C0059ao.a(5351), sparseArray2);
        }
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

    public k1 n() {
        return this.g.y();
    }

    public int o() {
        return this.c.getChildCount();
    }

    public Drawable p() {
        return this.m;
    }

    public int q() {
        return this.n;
    }

    public int r() {
        return this.o;
    }

    public int s() {
        return this.s;
    }

    public ColorStateList t() {
        return this.k;
    }

    public ColorStateList u() {
        return this.l;
    }

    public p1 v(ViewGroup viewGroup) {
        if (this.b == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.h.inflate(ov.design_navigation_menu, viewGroup, false);
            this.b = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.b));
            if (this.g == null) {
                this.g = new c();
            }
            int i2 = this.v;
            if (i2 != -1) {
                this.b.setOverScrollMode(i2);
            }
            this.c = (LinearLayout) this.h.inflate(ov.design_navigation_item_header, (ViewGroup) this.b, false);
            this.b.setAdapter(this.g);
        }
        return this.b;
    }

    public View w(int i2) {
        View inflate = this.h.inflate(i2, (ViewGroup) this.c, false);
        c(inflate);
        return inflate;
    }

    public void x(boolean z) {
        if (this.r != z) {
            this.r = z;
            K();
        }
    }

    public void y(k1 k1Var) {
        this.g.F(k1Var);
    }

    public void z(int i2) {
        this.f = i2;
    }
}
