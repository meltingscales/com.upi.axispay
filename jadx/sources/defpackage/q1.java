package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: q1  reason: default package */
/* loaded from: classes.dex */
public class q1 extends e1 implements Menu {
    public final v9 d;

    public q1(Context context, v9 v9Var) {
        super(context);
        if (v9Var != null) {
            this.d = v9Var;
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(14818));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return c(this.d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = c(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        e();
        this.d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return c(this.d.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return c(this.d.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        f(i);
        this.d.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        g(i);
        this.d.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.d.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.d.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.d.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return c(this.d.add(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return d(this.d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return c(this.d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return d(this.d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return c(this.d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return d(this.d.addSubMenu(i, i2, i3, i4));
    }
}
