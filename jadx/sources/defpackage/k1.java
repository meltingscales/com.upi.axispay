package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import defpackage.fb;
import defpackage.p1;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: k1  reason: default package */
/* loaded from: classes.dex */
public final class k1 implements w9 {
    public View A;
    public fb B;
    public MenuItem.OnActionExpandListener C;
    public ContextMenu.ContextMenuInfo E;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public char j;
    public Drawable l;
    public i1 n;
    public t1 o;
    public Runnable p;
    public MenuItem.OnMenuItemClickListener q;
    public CharSequence r;
    public CharSequence s;
    public int z;
    public int i = Barcode.AZTEC;
    public int k = Barcode.AZTEC;
    public int m = 0;
    public ColorStateList t = null;
    public PorterDuff.Mode u = null;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public int y = 16;
    public boolean D = false;

    /* compiled from: AxisPay */
    /* renamed from: k1$a */
    /* loaded from: classes.dex */
    public class a implements fb.b {
        public a() {
        }

        @Override // defpackage.fb.b
        public void onActionProviderVisibilityChanged(boolean z) {
            k1 k1Var = k1.this;
            k1Var.n.L(k1Var);
        }
    }

    public k1(i1 i1Var, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.z = 0;
        this.n = i1Var;
        this.a = i2;
        this.b = i;
        this.c = i3;
        this.d = i4;
        this.e = charSequence;
        this.z = i5;
    }

    public static void d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public boolean A() {
        return this.n.J() && g() != 0;
    }

    public boolean B() {
        return (this.z & 4) == 4;
    }

    @Override // defpackage.w9
    public w9 a(fb fbVar) {
        fb fbVar2 = this.B;
        if (fbVar2 != null) {
            fbVar2.j();
        }
        this.A = null;
        this.B = fbVar;
        this.n.M(true);
        fb fbVar3 = this.B;
        if (fbVar3 != null) {
            fbVar3.l(new a());
        }
        return this;
    }

    @Override // defpackage.w9
    public fb b() {
        return this.B;
    }

    public void c() {
        this.n.K(this);
    }

    @Override // defpackage.w9, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.f(this);
        }
        return false;
    }

    public final Drawable e(Drawable drawable) {
        if (drawable != null && this.x && (this.v || this.w)) {
            drawable = o9.r(drawable).mutate();
            if (this.v) {
                o9.o(drawable, this.t);
            }
            if (this.w) {
                o9.p(drawable, this.u);
            }
            this.x = false;
        }
        return drawable;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public boolean expandActionView() {
        if (j()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.C;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.n.m(this);
            }
            return false;
        }
        return false;
    }

    public int f() {
        return this.d;
    }

    public char g() {
        return this.n.I() ? this.j : this.h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException(C0059ao.a(9136));
    }

    @Override // defpackage.w9, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        fb fbVar = this.B;
        if (fbVar != null) {
            View e = fbVar.e(this);
            this.A = e;
            return e;
        }
        return null;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.m != 0) {
            Drawable d = k0.d(this.n.w(), this.m);
            this.m = 0;
            this.l = d;
            return e(d);
        }
        return null;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence == null) {
            charSequence = this.e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // defpackage.w9, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.s;
    }

    public String h() {
        char g = g();
        if (g == 0) {
            return C0059ao.a(9137);
        }
        Resources resources = this.n.w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.n.w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(s.abc_prepend_shortcut_label));
        }
        int i = this.n.I() ? this.k : this.i;
        d(sb, i, LogFileManager.MAX_LOG_SIZE, resources.getString(s.abc_menu_meta_shortcut_label));
        d(sb, i, Barcode.AZTEC, resources.getString(s.abc_menu_ctrl_shortcut_label));
        d(sb, i, 2, resources.getString(s.abc_menu_alt_shortcut_label));
        d(sb, i, 1, resources.getString(s.abc_menu_shift_shortcut_label));
        d(sb, i, 4, resources.getString(s.abc_menu_sym_shortcut_label));
        d(sb, i, 8, resources.getString(s.abc_menu_function_shortcut_label));
        if (g == '\b') {
            sb.append(resources.getString(s.abc_menu_delete_shortcut_label));
        } else if (g == '\n') {
            sb.append(resources.getString(s.abc_menu_enter_shortcut_label));
        } else if (g != ' ') {
            sb.append(g);
        } else {
            sb.append(resources.getString(s.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.o != null;
    }

    public CharSequence i(p1.a aVar) {
        if (aVar != null && aVar.d()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // defpackage.w9, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        fb fbVar = this.B;
        return (fbVar == null || !fbVar.h()) ? (this.y & 8) == 0 : (this.y & 8) == 0 && this.B.c();
    }

    public boolean j() {
        fb fbVar;
        if ((this.z & 8) != 0) {
            if (this.A == null && (fbVar = this.B) != null) {
                this.A = fbVar.e(this);
            }
            return this.A != null;
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.q;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            i1 i1Var = this.n;
            if (i1Var.h(i1Var, this)) {
                return true;
            }
            Runnable runnable = this.p;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.g != null) {
                try {
                    this.n.w().startActivity(this.g);
                    return true;
                } catch (ActivityNotFoundException e) {
                    Log.e(C0059ao.a(9138), C0059ao.a(9139), e);
                }
            }
            fb fbVar = this.B;
            return fbVar != null && fbVar.f();
        }
        return true;
    }

    public boolean l() {
        return (this.y & 32) == 32;
    }

    public boolean m() {
        return (this.y & 4) != 0;
    }

    public boolean n() {
        return (this.z & 1) == 1;
    }

    public boolean o() {
        return (this.z & 2) == 2;
    }

    public w9 p(int i) {
        Context w = this.n.w();
        q(LayoutInflater.from(w).inflate(i, (ViewGroup) new LinearLayout(w), false));
        return this;
    }

    public w9 q(View view) {
        int i;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i = this.a) > 0) {
            view.setId(i);
        }
        this.n.K(this);
        return this;
    }

    public void r(boolean z) {
        this.D = z;
        this.n.M(false);
    }

    public void s(boolean z) {
        int i = this.y;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.y = i2;
        if (i != i2) {
            this.n.M(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException(C0059ao.a(9140));
    }

    @Override // defpackage.w9, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        p(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.j == c) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.y;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.y = i2;
        if (i != i2) {
            this.n.M(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.y & 4) != 0) {
            this.n.X(this);
        } else {
            s(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.y |= 16;
        } else {
            this.y &= -17;
        }
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.x = true;
        this.n.M(false);
        return this;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.n.M(false);
        return this;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.h == c) {
            return this;
        }
        this.h = c;
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.h = c;
        this.j = Character.toLowerCase(c2);
        this.n.M(false);
        return this;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException(C0059ao.a(9141));
        }
        this.z = i;
        this.n.K(this);
    }

    @Override // defpackage.w9, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        w(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.M(false);
        t1 t1Var = this.o;
        if (t1Var != null) {
            t1Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (y(z)) {
            this.n.L(this);
        }
        return this;
    }

    public void t(boolean z) {
        this.y = (z ? 4 : 0) | (this.y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z) {
        if (z) {
            this.y |= 32;
        } else {
            this.y &= -33;
        }
    }

    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    public w9 w(int i) {
        setShowAsAction(i);
        return this;
    }

    public void x(t1 t1Var) {
        this.o = t1Var;
        t1Var.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z) {
        int i = this.y;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.y = i2;
        return i != i2;
    }

    public boolean z() {
        return this.n.C();
    }

    @Override // defpackage.w9, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        q(view);
        return this;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public w9 setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.n.M(false);
        return this;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public w9 setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.n.M(false);
        return this;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.j == c && this.k == i) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.k = KeyEvent.normalizeMetaState(i);
        this.n.M(false);
        return this;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.h == c && this.i == i) {
            return this;
        }
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.n.M(false);
        return this;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.l = null;
        this.m = i;
        this.x = true;
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        setTitle(this.n.w().getString(i));
        return this;
    }
}
