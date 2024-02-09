package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: i1  reason: default package */
/* loaded from: classes.dex */
public class i1 implements v9 {
    public static final int[] A = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public boolean d;
    public a e;
    public ContextMenu.ContextMenuInfo m;
    public CharSequence n;
    public Drawable o;
    public View p;
    public k1 x;
    public boolean z;
    public int l = 0;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;
    public ArrayList<k1> v = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<o1>> w = new CopyOnWriteArrayList<>();
    public boolean y = false;
    public ArrayList<k1> f = new ArrayList<>();
    public ArrayList<k1> g = new ArrayList<>();
    public boolean h = true;
    public ArrayList<k1> i = new ArrayList<>();
    public ArrayList<k1> j = new ArrayList<>();
    public boolean k = true;

    /* compiled from: AxisPay */
    /* renamed from: i1$a */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(i1 i1Var, MenuItem menuItem);

        void b(i1 i1Var);
    }

    /* compiled from: AxisPay */
    /* renamed from: i1$b */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(k1 k1Var);
    }

    public i1(Context context) {
        this.a = context;
        this.b = context.getResources();
        f0(true);
    }

    public static int D(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException(C0059ao.a(6759));
    }

    public static int p(ArrayList<k1> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public View A() {
        return this.p;
    }

    public ArrayList<k1> B() {
        t();
        return this.j;
    }

    public boolean C() {
        return this.t;
    }

    public Resources E() {
        return this.b;
    }

    public i1 F() {
        return this;
    }

    public ArrayList<k1> G() {
        if (this.h) {
            this.g.clear();
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                k1 k1Var = this.f.get(i);
                if (k1Var.isVisible()) {
                    this.g.add(k1Var);
                }
            }
            this.h = false;
            this.k = true;
            return this.g;
        }
        return this.g;
    }

    public boolean H() {
        return this.y;
    }

    public boolean I() {
        return this.c;
    }

    public boolean J() {
        return this.d;
    }

    public void K(k1 k1Var) {
        this.k = true;
        M(true);
    }

    public void L(k1 k1Var) {
        this.h = true;
        M(true);
    }

    public void M(boolean z) {
        if (!this.q) {
            if (z) {
                this.h = true;
                this.k = true;
            }
            i(z);
            return;
        }
        this.r = true;
        if (z) {
            this.s = true;
        }
    }

    public boolean N(MenuItem menuItem, int i) {
        return O(menuItem, null, i);
    }

    public boolean O(MenuItem menuItem, o1 o1Var, int i) {
        k1 k1Var = (k1) menuItem;
        if (k1Var == null || !k1Var.isEnabled()) {
            return false;
        }
        boolean k = k1Var.k();
        fb b2 = k1Var.b();
        boolean z = b2 != null && b2.b();
        if (k1Var.j()) {
            k |= k1Var.expandActionView();
            if (k) {
                e(true);
            }
        } else if (k1Var.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                e(false);
            }
            if (!k1Var.hasSubMenu()) {
                k1Var.x(new t1(w(), this, k1Var));
            }
            t1 t1Var = (t1) k1Var.getSubMenu();
            if (z) {
                b2.g(t1Var);
            }
            k |= l(t1Var, o1Var);
            if (!k) {
                e(true);
            }
        } else if ((i & 1) == 0) {
            e(true);
        }
        return k;
    }

    public final void P(int i, boolean z) {
        if (i < 0 || i >= this.f.size()) {
            return;
        }
        this.f.remove(i);
        if (z) {
            M(true);
        }
    }

    public void Q(o1 o1Var) {
        Iterator<WeakReference<o1>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<o1> next = it.next();
            o1 o1Var2 = next.get();
            if (o1Var2 == null || o1Var2 == o1Var) {
                this.w.remove(next);
            }
        }
    }

    public void R(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(v());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((t1) item.getSubMenu()).R(bundle);
            }
        }
        int i2 = bundle.getInt(C0059ao.a(6760));
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void S(Bundle bundle) {
        j(bundle);
    }

    public void T(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(C0059ao.a(6761), item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((t1) item.getSubMenu()).T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(v(), sparseArray);
        }
    }

    public void U(Bundle bundle) {
        k(bundle);
    }

    public void V(a aVar) {
        this.e = aVar;
    }

    public i1 W(int i) {
        this.l = i;
        return this;
    }

    public void X(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f.size();
        h0();
        for (int i = 0; i < size; i++) {
            k1 k1Var = this.f.get(i);
            if (k1Var.getGroupId() == groupId && k1Var.m() && k1Var.isCheckable()) {
                k1Var.s(k1Var == menuItem);
            }
        }
        g0();
    }

    public i1 Y(int i) {
        a0(0, null, i, null, null);
        return this;
    }

    public i1 Z(Drawable drawable) {
        a0(0, null, 0, drawable, null);
        return this;
    }

    public MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int D = D(i3);
        k1 g = g(i, i2, i3, D, charSequence, this.l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.m;
        if (contextMenuInfo != null) {
            g.v(contextMenuInfo);
        }
        ArrayList<k1> arrayList = this.f;
        arrayList.add(p(arrayList, D), g);
        M(true);
        return g;
    }

    public final void a0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources E = E();
        if (view != null) {
            this.p = view;
            this.n = null;
            this.o = null;
        } else {
            if (i > 0) {
                this.n = E.getText(i);
            } else if (charSequence != null) {
                this.n = charSequence;
            }
            if (i2 > 0) {
                this.o = t8.f(w(), i2);
            } else if (drawable != null) {
                this.o = drawable;
            }
            this.p = null;
        }
        M(false);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(o1 o1Var) {
        c(o1Var, this.a);
    }

    public i1 b0(int i) {
        a0(i, null, 0, null, null);
        return this;
    }

    public void c(o1 o1Var, Context context) {
        this.w.add(new WeakReference<>(o1Var));
        o1Var.d(context, this);
        this.k = true;
    }

    public i1 c0(CharSequence charSequence) {
        a0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        k1 k1Var = this.x;
        if (k1Var != null) {
            f(k1Var);
        }
        this.f.clear();
        M(true);
    }

    public void clearHeader() {
        this.o = null;
        this.n = null;
        this.p = null;
        M(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public i1 d0(View view) {
        a0(0, null, 0, null, view);
        return this;
    }

    public final void e(boolean z) {
        if (this.u) {
            return;
        }
        this.u = true;
        Iterator<WeakReference<o1>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<o1> next = it.next();
            o1 o1Var = next.get();
            if (o1Var == null) {
                this.w.remove(next);
            } else {
                o1Var.b(this, z);
            }
        }
        this.u = false;
    }

    public void e0(boolean z) {
        this.z = z;
    }

    public boolean f(k1 k1Var) {
        boolean z = false;
        if (!this.w.isEmpty() && this.x == k1Var) {
            h0();
            Iterator<WeakReference<o1>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<o1> next = it.next();
                o1 o1Var = next.get();
                if (o1Var == null) {
                    this.w.remove(next);
                } else {
                    z = o1Var.k(this, k1Var);
                    if (z) {
                        break;
                    }
                }
            }
            g0();
            if (z) {
                this.x = null;
            }
        }
        return z;
    }

    public final void f0(boolean z) {
        boolean z2 = true;
        this.d = (z && this.b.getConfiguration().keyboard != 1 && bc.f(ViewConfiguration.get(this.a), this.a)) ? false : false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            k1 k1Var = this.f.get(i2);
            if (k1Var.getItemId() == i) {
                return k1Var;
            }
            if (k1Var.hasSubMenu() && (findItem = k1Var.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final k1 g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new k1(this, i, i2, i3, i4, charSequence, i5);
    }

    public void g0() {
        this.q = false;
        if (this.r) {
            this.r = false;
            M(this.s);
        }
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f.get(i);
    }

    public boolean h(i1 i1Var, MenuItem menuItem) {
        a aVar = this.e;
        return aVar != null && aVar.a(i1Var, menuItem);
    }

    public void h0() {
        if (this.q) {
            return;
        }
        this.q = true;
        this.r = false;
        this.s = false;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z) {
        if (this.w.isEmpty()) {
            return;
        }
        h0();
        Iterator<WeakReference<o1>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<o1> next = it.next();
            o1 o1Var = next.get();
            if (o1Var == null) {
                this.w.remove(next);
            } else {
                o1Var.g(z);
            }
        }
        g0();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return r(i, keyEvent) != null;
    }

    public final void j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(C0059ao.a(6762));
        if (sparseParcelableArray == null || this.w.isEmpty()) {
            return;
        }
        Iterator<WeakReference<o1>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<o1> next = it.next();
            o1 o1Var = next.get();
            if (o1Var == null) {
                this.w.remove(next);
            } else {
                int id = o1Var.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    o1Var.e(parcelable);
                }
            }
        }
    }

    public final void k(Bundle bundle) {
        Parcelable j;
        if (this.w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<o1>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<o1> next = it.next();
            o1 o1Var = next.get();
            if (o1Var == null) {
                this.w.remove(next);
            } else {
                int id = o1Var.getId();
                if (id > 0 && (j = o1Var.j()) != null) {
                    sparseArray.put(id, j);
                }
            }
        }
        bundle.putSparseParcelableArray(C0059ao.a(6763), sparseArray);
    }

    public final boolean l(t1 t1Var, o1 o1Var) {
        if (this.w.isEmpty()) {
            return false;
        }
        boolean f = o1Var != null ? o1Var.f(t1Var) : false;
        Iterator<WeakReference<o1>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<o1> next = it.next();
            o1 o1Var2 = next.get();
            if (o1Var2 == null) {
                this.w.remove(next);
            } else if (!f) {
                f = o1Var2.f(t1Var);
            }
        }
        return f;
    }

    public boolean m(k1 k1Var) {
        boolean z = false;
        if (this.w.isEmpty()) {
            return false;
        }
        h0();
        Iterator<WeakReference<o1>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<o1> next = it.next();
            o1 o1Var = next.get();
            if (o1Var == null) {
                this.w.remove(next);
            } else {
                z = o1Var.l(this, k1Var);
                if (z) {
                    break;
                }
            }
        }
        g0();
        if (z) {
            this.x = k1Var;
        }
        return z;
    }

    public int n(int i) {
        return o(i, 0);
    }

    public int o(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return N(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        k1 r = r(i, keyEvent);
        boolean N = r != null ? N(r, i2) : false;
        if ((i2 & 2) != 0) {
            e(true);
        }
        return N;
    }

    public int q(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public k1 r(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<k1> arrayList = this.v;
        arrayList.clear();
        s(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean I = I();
        for (int i2 = 0; i2 < size; i2++) {
            k1 k1Var = arrayList.get(i2);
            if (I) {
                numericShortcut = k1Var.getAlphabeticShortcut();
            } else {
                numericShortcut = k1Var.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (I && numericShortcut == '\b' && i == 67))) {
                return k1Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int n = n(i);
        if (n >= 0) {
            int size = this.f.size() - n;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f.get(n).getGroupId() != i) {
                    break;
                }
                P(n, false);
                i2 = i3;
            }
            M(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        P(q(i), true);
    }

    public void s(List<k1> list, int i, KeyEvent keyEvent) {
        boolean I = I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                k1 k1Var = this.f.get(i2);
                if (k1Var.hasSubMenu()) {
                    ((i1) k1Var.getSubMenu()).s(list, i, keyEvent);
                }
                char alphabeticShortcut = I ? k1Var.getAlphabeticShortcut() : k1Var.getNumericShortcut();
                if (((modifiers & 69647) == ((I ? k1Var.getAlphabeticModifiers() : k1Var.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (I && alphabeticShortcut == '\b' && i == 67)) && k1Var.isEnabled()) {
                        list.add(k1Var);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            k1 k1Var = this.f.get(i2);
            if (k1Var.getGroupId() == i) {
                k1Var.t(z2);
                k1Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            k1 k1Var = this.f.get(i2);
            if (k1Var.getGroupId() == i) {
                k1Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            k1 k1Var = this.f.get(i2);
            if (k1Var.getGroupId() == i && k1Var.y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            M(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        M(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f.size();
    }

    public void t() {
        ArrayList<k1> G = G();
        if (this.k) {
            Iterator<WeakReference<o1>> it = this.w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<o1> next = it.next();
                o1 o1Var = next.get();
                if (o1Var == null) {
                    this.w.remove(next);
                } else {
                    z |= o1Var.i();
                }
            }
            if (z) {
                this.i.clear();
                this.j.clear();
                int size = G.size();
                for (int i = 0; i < size; i++) {
                    k1 k1Var = G.get(i);
                    if (k1Var.l()) {
                        this.i.add(k1Var);
                    } else {
                        this.j.add(k1Var);
                    }
                }
            } else {
                this.i.clear();
                this.j.clear();
                this.j.addAll(G());
            }
            this.k = false;
        }
    }

    public ArrayList<k1> u() {
        t();
        return this.i;
    }

    public String v() {
        return C0059ao.a(6764);
    }

    public Context w() {
        return this.a;
    }

    public k1 x() {
        return this.x;
    }

    public Drawable y() {
        return this.o;
    }

    public CharSequence z() {
        return this.n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        k1 k1Var = (k1) a(i, i2, i3, charSequence);
        t1 t1Var = new t1(this.a, this, k1Var);
        k1Var.x(t1Var);
        return t1Var;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }
}
