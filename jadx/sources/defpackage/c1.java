package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.android.gms.vision.barcode.Barcode;

/* compiled from: AxisPay */
/* renamed from: c1  reason: default package */
/* loaded from: classes.dex */
public class c1 implements w9 {
    public final int a;
    public final int b;
    public final int c;
    public CharSequence d;
    public CharSequence e;
    public Intent f;
    public char g;
    public char i;
    public Drawable k;
    public Context l;
    public CharSequence m;
    public CharSequence n;
    public int h = Barcode.AZTEC;
    public int j = Barcode.AZTEC;
    public ColorStateList o = null;
    public PorterDuff.Mode p = null;
    public boolean q = false;
    public boolean r = false;
    public int s = 16;

    public c1(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.l = context;
        this.a = i2;
        this.b = i;
        this.c = i4;
        this.d = charSequence;
    }

    @Override // defpackage.w9
    public w9 a(fb fbVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.w9
    public fb b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.k;
        if (drawable != null) {
            if (this.q || this.r) {
                Drawable r = o9.r(drawable);
                this.k = r;
                Drawable mutate = r.mutate();
                this.k = mutate;
                if (this.q) {
                    o9.o(mutate, this.o);
                }
                if (this.r) {
                    o9.p(this.k, this.p);
                }
            }
        }
    }

    @Override // defpackage.w9, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    public w9 d(int i) {
        throw new UnsupportedOperationException();
    }

    public w9 e(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.w9, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    public w9 f(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.w9, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.i;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.k;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.o;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.p;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public int getNumericModifiers() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.e;
        return charSequence != null ? charSequence : this.d;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.n;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.w9, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        d(i);
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.i = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.s = (z ? 1 : 0) | (this.s & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.s = (z ? 2 : 0) | (this.s & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.s = (z ? 16 : 0) | (this.s & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.k = drawable;
        c();
        return this;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.o = colorStateList;
        this.q = true;
        c();
        return this;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.p = mode;
        this.r = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.g = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.g = c;
        this.i = Character.toLowerCase(c2);
        return this;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // defpackage.w9, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        f(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.s = (this.s & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        e(view);
        throw null;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.i = Character.toLowerCase(c);
        this.j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public w9 setContentDescription(CharSequence charSequence) {
        this.m = charSequence;
        return this;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.g = c;
        this.h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.d = this.l.getResources().getString(i);
        return this;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public w9 setTooltipText(CharSequence charSequence) {
        this.n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.k = t8.f(this.l, i);
        c();
        return this;
    }

    @Override // defpackage.w9, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.g = c;
        this.h = KeyEvent.normalizeMetaState(i);
        this.i = Character.toLowerCase(c2);
        this.j = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
