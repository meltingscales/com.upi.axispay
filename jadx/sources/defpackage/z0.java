package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.android.gms.vision.barcode.Barcode;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import myunmn.C0059ao;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AxisPay */
/* renamed from: z0  reason: default package */
/* loaded from: classes.dex */
public class z0 extends MenuInflater {
    public static final Class<?>[] e;
    public static final Class<?>[] f;
    public final Object[] a;
    public final Object[] b;
    public Context c;
    public Object d;

    /* compiled from: AxisPay */
    /* renamed from: z0$a */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] c = {MenuItem.class};
        public Object a;
        public Method b;

        public a(Object obj, String str) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException(C0059ao.a(12534) + str + C0059ao.a(12535) + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.b.invoke(this.a, menuItem)).booleanValue();
                }
                this.b.invoke(this.a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: z0$b */
    /* loaded from: classes.dex */
    public class b {
        public fb A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;
        public Menu a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;

        public b(Menu menu) {
            this.a = menu;
            h();
        }

        public void a() {
            this.h = true;
            i(this.a.add(this.b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.h = true;
            SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.h;
        }

        public final <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, z0.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w(C0059ao.a(12524), C0059ao.a(12523) + str, e);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = z0.this.c.obtainStyledAttributes(attributeSet, u.MenuGroup);
            this.b = obtainStyledAttributes.getResourceId(u.MenuGroup_android_id, 0);
            this.c = obtainStyledAttributes.getInt(u.MenuGroup_android_menuCategory, 0);
            this.d = obtainStyledAttributes.getInt(u.MenuGroup_android_orderInCategory, 0);
            this.e = obtainStyledAttributes.getInt(u.MenuGroup_android_checkableBehavior, 0);
            this.f = obtainStyledAttributes.getBoolean(u.MenuGroup_android_visible, true);
            this.g = obtainStyledAttributes.getBoolean(u.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            o3 u = o3.u(z0.this.c, attributeSet, u.MenuItem);
            this.i = u.n(u.MenuItem_android_id, 0);
            this.j = (u.k(u.MenuItem_android_menuCategory, this.c) & (-65536)) | (u.k(u.MenuItem_android_orderInCategory, this.d) & 65535);
            this.k = u.p(u.MenuItem_android_title);
            this.l = u.p(u.MenuItem_android_titleCondensed);
            this.m = u.n(u.MenuItem_android_icon, 0);
            this.n = c(u.o(u.MenuItem_android_alphabeticShortcut));
            this.o = u.k(u.MenuItem_alphabeticModifiers, Barcode.AZTEC);
            this.p = c(u.o(u.MenuItem_android_numericShortcut));
            this.q = u.k(u.MenuItem_numericModifiers, Barcode.AZTEC);
            int i = u.MenuItem_android_checkable;
            if (u.s(i)) {
                this.r = u.a(i, false) ? 1 : 0;
            } else {
                this.r = this.e;
            }
            this.s = u.a(u.MenuItem_android_checked, false);
            this.t = u.a(u.MenuItem_android_visible, this.f);
            this.u = u.a(u.MenuItem_android_enabled, this.g);
            this.v = u.k(u.MenuItem_showAsAction, -1);
            this.z = u.o(u.MenuItem_android_onClick);
            this.w = u.n(u.MenuItem_actionLayout, 0);
            this.x = u.o(u.MenuItem_actionViewClass);
            String o = u.o(u.MenuItem_actionProviderClass);
            this.y = o;
            boolean z = o != null;
            if (z && this.w == 0 && this.x == null) {
                this.A = (fb) e(o, z0.f, z0.this.b);
            } else {
                if (z) {
                    Log.w(C0059ao.a(12525), C0059ao.a(12526));
                }
                this.A = null;
            }
            this.B = u.p(u.MenuItem_contentDescription);
            this.C = u.p(u.MenuItem_tooltipText);
            int i2 = u.MenuItem_iconTintMode;
            if (u.s(i2)) {
                this.E = v2.e(u.k(i2, -1), this.E);
            } else {
                this.E = null;
            }
            int i3 = u.MenuItem_iconTint;
            if (u.s(i3)) {
                this.D = u.c(i3);
            } else {
                this.D = null;
            }
            u.w();
            this.h = false;
        }

        public void h() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.z != null) {
                if (!z0.this.c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(z0.this.b(), this.z));
                } else {
                    throw new IllegalStateException(C0059ao.a(12527));
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof k1) {
                    ((k1) menuItem).t(true);
                } else if (menuItem instanceof l1) {
                    ((l1) menuItem).h(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, z0.e, z0.this.a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w(C0059ao.a(12528), C0059ao.a(12529));
                }
            }
            fb fbVar = this.A;
            if (fbVar != null) {
                mb.a(menuItem, fbVar);
            }
            mb.c(menuItem, this.B);
            mb.g(menuItem, this.C);
            mb.b(menuItem, this.n, this.o);
            mb.f(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                mb.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                mb.d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public z0(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.d == null) {
            this.d = a(this.c);
        }
        return this.d;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        String a2;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            a2 = C0059ao.a(6710);
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals(a2)) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(C0059ao.a(6711) + name);
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                String a3 = C0059ao.a(6712);
                String a4 = C0059ao.a(6713);
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals(a4)) {
                            bVar.h();
                        } else if (name2.equals(a3)) {
                            if (!bVar.d()) {
                                fb fbVar = bVar.A;
                                if (fbVar != null && fbVar.b()) {
                                    bVar.b();
                                } else {
                                    bVar.a();
                                }
                            }
                        } else if (name2.equals(a2)) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals(a4)) {
                        bVar.f(attributeSet);
                    } else if (name3.equals(a3)) {
                        bVar.g(attributeSet);
                    } else if (name3.equals(a2)) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException(C0059ao.a(6714));
            }
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        String a2 = C0059ao.a(6715);
        if (!(menu instanceof v9)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = this.c.getResources().getLayout(i);
                c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            } catch (IOException e2) {
                throw new InflateException(a2, e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException(a2, e3);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
