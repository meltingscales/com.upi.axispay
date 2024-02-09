package myunmn;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.provider.Settings;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;

/* renamed from: myunmn.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0071b extends EditText {
    public static List e = new ArrayList();
    public String a;
    public Boolean b;
    public ViewGroup c;
    public Boolean d;
    public boolean f;
    public List g;
    public boolean h;
    public String i;
    public int j;
    public boolean k;
    public Activity l;
    public AbstractC0072c m;
    public boolean n;
    public Boolean o;
    public Boolean p;
    public Boolean q;
    public Q r;

    public C0071b(Context context) {
        super(context);
        this.m = null;
        String intern = new String(new char[0]).intern();
        this.a = intern;
        Boolean bool = Boolean.FALSE;
        this.o = bool;
        this.d = Boolean.TRUE;
        this.q = bool;
        this.p = bool;
        this.f = false;
        this.k = false;
        this.n = false;
        this.h = false;
        this.g = new ArrayList();
        this.i = intern;
        this.l = null;
        this.j = 0;
        this.c = null;
        this.b = bool;
        this.r = new Q(this);
        a();
    }

    public C0071b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = null;
        String intern = new String(new char[0]).intern();
        this.a = intern;
        Boolean bool = Boolean.FALSE;
        this.o = bool;
        this.d = Boolean.TRUE;
        this.q = bool;
        this.p = bool;
        this.f = false;
        this.k = false;
        this.n = false;
        this.h = false;
        this.g = new ArrayList();
        this.i = intern;
        this.l = null;
        this.j = 0;
        this.c = null;
        this.b = bool;
        this.r = new Q(this);
        a(context, attributeSet);
        a();
    }

    public C0071b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = null;
        String intern = new String(new char[0]).intern();
        this.a = intern;
        Boolean bool = Boolean.FALSE;
        this.o = bool;
        this.d = Boolean.TRUE;
        this.q = bool;
        this.p = bool;
        this.f = false;
        this.k = false;
        this.n = false;
        this.h = false;
        this.g = new ArrayList();
        this.i = intern;
        this.l = null;
        this.j = 0;
        this.c = null;
        this.b = bool;
        this.r = new Q(this);
        a(context, attributeSet);
        a();
    }

    public static void a(Context context) {
        d(context);
        for (C0071b c0071b : e) {
            c0071b.j();
        }
    }

    private char[] a(int i) {
        char[] cArr = {(char) (cArr[16] ^ 2), (char) (cArr[39] ^ ')'), (char) (cArr[16] ^ 7), (char) (cArr[18] ^ 27), (char) (cArr[32] ^ ' '), (char) (cArr[2] ^ '\r'), (char) (cArr[14] ^ 'J'), (char) (cArr[14] ^ 0), (char) (cArr[0] ^ '\b'), (char) (cArr[28] ^ '#'), (char) (cArr[15] ^ 21), (char) (cArr[19] ^ '\n'), (char) (cArr[1] ^ 0), (char) (cArr[11] ^ 17), (char) (cArr[28] ^ 'c'), (char) (cArr[37] ^ ' '), (char) (cArr[31] ^ '+'), (char) (cArr[35] ^ '7'), (char) (cArr[28] ^ '$'), (char) (cArr[25] ^ ':'), (char) (cArr[15] ^ 15), (char) (cArr[37] ^ 'o'), (char) (cArr[30] ^ 29), (char) (cArr[16] ^ '-'), (char) (cArr[25] ^ 5), (char) (cArr[31] ^ 29), (char) (cArr[5] ^ '='), (char) (cArr[25] ^ '\n'), (char) (cArr[25] ^ 24), (char) (cArr[31] ^ '\r'), (char) (cArr[36] ^ 28), (char) (27468 ^ i), (char) (cArr[28] ^ 2), (char) (cArr[39] ^ 3), (char) (cArr[29] ^ 26), (char) (cArr[31] ^ 11), (char) (cArr[7] ^ 'f'), (char) (cArr[25] ^ 20), (char) (cArr[17] ^ ':'), (char) (cArr[25] ^ 18), (char) (cArr[28] ^ '\b'), (char) (cArr[19] ^ '+')};
        return cArr;
    }

    private static native boolean b(Context context);

    private static native String c(Context context);

    private String d() {
        ContentResolver contentResolver = getContext().getContentResolver();
        char[] cArr = {(char) (cArr[6] ^ 16), (char) (cArr[7] ^ ':'), (char) (cArr[1] ^ 3), (char) (cArr[1] ^ 4), (char) (cArr[18] ^ 26), (char) (cArr[11] ^ 25), (char) (5327 ^ 5307), (char) (cArr[6] ^ '+'), (char) (cArr[16] ^ 29), (char) (cArr[16] ^ 26), (char) (cArr[3] ^ 17), (char) (cArr[6] ^ 1), (char) (cArr[11] ^ 1), (char) (cArr[1] ^ ':'), (char) (cArr[7] ^ '2'), (char) (cArr[10] ^ 21), (char) (cArr[6] ^ 0), (char) (cArr[7] ^ '7'), (char) (cArr[7] ^ '0'), (char) (cArr[7] ^ ';')};
        return Settings.Secure.getString(contentResolver, new String(cArr).intern());
    }

    private static native void d(Context context);

    private Activity g() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private static String r() {
        return Resources.getSystem().getConfiguration().locale.getLanguage();
    }

    public final View a(InputMethodManager inputMethodManager) {
        View currentFocus;
        if (inputMethodManager.isActive(this)) {
            return this;
        }
        if (g() == null || (currentFocus = g().getCurrentFocus()) == null || !inputMethodManager.isActive(currentFocus)) {
            return null;
        }
        return currentFocus;
    }

    public final void a() {
        Boolean valueOf;
        if (this.l == null) {
            this.l = g();
        }
        if (this.l == null) {
            return;
        }
        if (this.q.booleanValue()) {
            valueOf = Boolean.FALSE;
        } else if (!this.p.booleanValue()) {
            if (this.d.booleanValue()) {
                valueOf = Boolean.valueOf(b(this.l));
            }
            this.a = d();
            addTextChangedListener(new D(this));
            setOnTouchListener(new View$OnTouchListenerC0067aw(this));
            a(true);
        } else {
            valueOf = Boolean.TRUE;
        }
        this.o = valueOf;
        this.a = d();
        addTextChangedListener(new D(this));
        setOnTouchListener(new View$OnTouchListenerC0067aw(this));
        a(true);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        char[] cArr = {(char) (cArr[20] ^ 15), (char) (cArr[2] ^ 28), (char) (cArr[4] ^ 22), (char) (cArr[2] ^ 27), (char) (cArr[13] ^ 14), (char) (cArr[0] ^ '\n'), (char) (cArr[3] ^ 16), (char) (7492 ^ 7456), (char) (cArr[12] ^ '+'), (char) (cArr[13] ^ 2), (char) (cArr[4] ^ 0), (char) (cArr[7] ^ '\n'), (char) (cArr[7] ^ 16), (char) (cArr[7] ^ 5), (char) (cArr[4] ^ 6), (char) (cArr[8] ^ '1'), (char) (cArr[0] ^ 14), (char) (cArr[11] ^ 28), (char) (cArr[3] ^ '='), (char) (cArr[13] ^ '\b'), (char) (cArr[13] ^ 5)};
        String attributeValue = attributeSet.getAttributeValue(null, new String(cArr).intern());
        if (attributeValue == null) {
            return;
        }
        char[] cArr2 = {(char) (8064 ^ 8158), (char) (cArr2[2] ^ 28), (char) (cArr2[0] ^ 2), (char) (cArr2[0] ^ 'u')};
        String intern = new String(cArr2).intern();
        String intern2 = new String(new char[0]).intern();
        String replaceAll = attributeValue.replaceAll(intern, intern2);
        char[] cArr3 = {(char) ((-14419) ^ (-14349)), (char) (cArr3[0] ^ 30)};
        String replaceAll2 = replaceAll.replaceAll(new String(cArr3).intern(), intern2);
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        char[] cArr4 = {(char) (cArr4[1] ^ '\r'), (char) (22216 ^ 22188)};
        this.j = resources.getIdentifier(replaceAll2, new String(cArr4).intern(), packageName);
    }

    public void a(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    public void a(InterfaceC0049ae interfaceC0049ae) {
        this.g.remove(interfaceC0049ae);
    }

    public final void a(boolean z) {
        if (this.l == null) {
            this.l = g();
        }
        this.m = e() ? new aA(this.l, null, this) : new C0084o(this.l, null, r(), this);
    }

    public String b() {
        if (this.o.booleanValue()) {
            char[] cArr = {(char) (cArr[4] ^ 25), (char) (cArr[5] ^ 30), (char) (cArr[1] ^ 'C'), (char) (cArr[2] ^ 'L'), (char) (cArr[1] ^ 30), (char) ((-16893) ^ (-16781))};
            return new String(cArr).intern();
        }
        ContentResolver contentResolver = getContext().getContentResolver();
        char[] cArr2 = {(char) (cArr2[8] ^ '\r'), (char) (cArr2[6] ^ 17), (char) (cArr2[4] ^ 19), (char) (cArr2[17] ^ '\t'), (char) (cArr2[13] ^ '*'), (char) (cArr2[2] ^ '\n'), (char) (cArr2[10] ^ 4), (char) (cArr2[13] ^ 0), (char) (26767 ^ 26854), (char) (cArr2[8] ^ 7), (char) (cArr2[13] ^ '/'), (char) (cArr2[2] ^ 19), (char) (cArr2[9] ^ 26), (char) (cArr2[19] ^ ';'), (char) (cArr2[2] ^ 11), (char) (cArr2[10] ^ 21), (char) (cArr2[19] ^ 16), (char) (cArr2[15] ^ '\r'), (char) (cArr2[10] ^ 31), (char) (cArr2[8] ^ '\r')};
        String string = Settings.Secure.getString(contentResolver, new String(cArr2).intern());
        Context context = getContext();
        char[] cArr3 = {(char) ((-11288) ^ (-11391)), (char) (cArr3[0] ^ 7), (char) (cArr3[7] ^ 21), (char) (cArr3[5] ^ '*'), (char) (cArr3[7] ^ 17), (char) (cArr3[7] ^ ':'), (char) (cArr3[9] ^ 5), (char) (cArr3[0] ^ '\f'), (char) (cArr3[11] ^ 16), (char) (cArr3[4] ^ 28), (char) (cArr3[7] ^ '\n'), (char) (cArr3[0] ^ '\r')};
        for (InputMethodInfo inputMethodInfo : ((InputMethodManager) context.getSystemService(new String(cArr3).intern())).getEnabledInputMethodList()) {
            if (inputMethodInfo.getId().equals(string)) {
                return inputMethodInfo.getPackageName();
            }
        }
        return new String(new char[0]).intern();
    }

    public void b(InterfaceC0049ae interfaceC0049ae) {
        if (this.g.contains(interfaceC0049ae)) {
            return;
        }
        this.g.add(interfaceC0049ae);
    }

    public void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final ViewGroup c() {
        View rootView;
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (this.j == 0 || (rootView = getRootView()) == null) {
            return null;
        }
        View findViewById = rootView.findViewById(this.j);
        if (findViewById instanceof ViewGroup) {
            return (ViewGroup) findViewById;
        }
        return null;
    }

    public final void c(boolean z) {
        String d = d();
        if (this.b.booleanValue() && !d.equals(this.a) && b(this.l)) {
            t();
        }
        if (!z || !d.equals(this.a)) {
            boolean b = b(this.l);
            if (!b || this.o.booleanValue()) {
                if (!b && this.o.booleanValue() && this.d.booleanValue()) {
                    h();
                }
            } else if (this.d.booleanValue()) {
                p();
            }
        }
        this.a = d;
    }

    public final boolean e() {
        int inputType = getInputType() & 15;
        return inputType == 2 || inputType == 3 || inputType == 4;
    }

    public final void f() {
        this.l.getWindow().setSoftInputMode((this.l.getWindow().getAttributes().softInputMode & (-16)) | 3);
        Activity activity = this.l;
        char[] cArr = {(char) (cArr[11] ^ '\r'), (char) (cArr[10] ^ 1), (char) (cArr[0] ^ 25), (char) (cArr[8] ^ 1), (char) ((-13840) ^ (-13948)), (char) (cArr[4] ^ '+'), (char) (cArr[5] ^ '2'), (char) (cArr[11] ^ 1), (char) (cArr[0] ^ 29), (char) (cArr[4] ^ 28), (char) (cArr[4] ^ 27), (char) (cArr[1] ^ '\n')};
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(new String(cArr).intern());
        View a = a(inputMethodManager);
        if (a != null) {
            inputMethodManager.hideSoftInputFromWindow(a.getWindowToken(), 0);
        }
        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        this.n = false;
    }

    public final void h() {
        boolean v = v();
        this.o = Boolean.FALSE;
        m();
        if (v) {
            o();
        }
    }

    public void i() {
        Activity activity = this.l;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new B(this));
    }

    public final void j() {
        c(false);
    }

    public void k() {
        Activity activity = this.l;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new RunnableC0093x(this));
    }

    public List l() {
        return this.g;
    }

    public final void m() {
        ViewGroup c;
        if (this.l == null || this.m == null || !s() || (c = c()) == null) {
            return;
        }
        c.removeAllViews();
        this.h = false;
    }

    public void n() {
        Activity activity = this.l;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new RunnableC0094y(this));
    }

    public final void o() {
        this.l.getWindow().setSoftInputMode((this.l.getWindow().getAttributes().softInputMode & (-16)) | 5);
        Activity activity = this.l;
        char[] cArr = {(char) (cArr[11] ^ '\r'), (char) (cArr[3] ^ 27), (char) (cArr[8] ^ 4), (char) ((-21114) ^ (-21005)), (char) (cArr[1] ^ 26), (char) (cArr[3] ^ '*'), (char) (cArr[3] ^ 24), (char) (cArr[0] ^ '\f'), (char) (cArr[3] ^ 1), (char) (cArr[3] ^ 29), (char) (cArr[1] ^ 1), (char) (cArr[1] ^ '\n')};
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(new String(cArr).intern());
        View a = a(inputMethodManager);
        if (a != null) {
            inputMethodManager.showSoftInput(a, 0);
        }
        inputMethodManager.showSoftInput(this, 0);
        this.n = true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Activity activity = this.l;
        if (activity == null) {
            return;
        }
        String c = c(activity);
        char[] cArr = {(char) (18028 ^ 17931), (char) (cArr[2] ^ 3), (char) (cArr[0] ^ '\b'), (char) (cArr[0] ^ 5), (char) (cArr[0] ^ 6), (char) (cArr[0] ^ 11)};
        if (c.equals(new String(cArr).intern())) {
            q();
        }
        char[] cArr2 = {(char) (cArr2[4] ^ 25), (char) (cArr2[4] ^ 30), (char) (cArr2[5] ^ ']'), (char) (cArr2[4] ^ 17), (char) (cArr2[5] ^ 0), (char) ((-26259) ^ (-26339))};
        if (c.equals(new String(cArr2).intern())) {
            i();
        }
        Selection.setSelection(getText(), length());
        this.l.registerReceiver(this.r, new IntentFilter(new String(a((983963185 - 400861974) - 23)).intern()));
        e.add(this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.l == null) {
            return;
        }
        w();
        this.l.unregisterReceiver(this.r);
        e.remove(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        AbstractC0072c abstractC0072c;
        super.onFocusChanged(z, i, rect);
        if (this.l == null || (abstractC0072c = this.m) == null) {
            return;
        }
        abstractC0072c.b(r());
        if (z) {
            Selection.setSelection(getText(), length());
        }
        c(false);
        if (this.o.booleanValue()) {
            p();
        }
        if (!z) {
            w();
        } else if (i != 2) {
            n();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4 && this.o.booleanValue()) {
            boolean z = this.h;
            if (z) {
                w();
            }
            return z;
        }
        return false;
    }

    public final void p() {
        boolean v = v();
        this.o = Boolean.TRUE;
        f();
        if (v) {
            u();
        }
    }

    public void q() {
        Activity activity = this.l;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new A(this));
    }

    public final boolean s() {
        return (this.c == null && this.j == 0) ? false : true;
    }

    public final void t() {
        AlertDialog create = new AlertDialog.Builder(this.l).create();
        char[] cArr = {(char) (cArr[16] ^ '\''), (char) (cArr[0] ^ ';'), (char) (cArr[0] ^ '!'), (char) (cArr[14] ^ 29), (char) (cArr[17] ^ 17), (char) (cArr[2] ^ 7), (char) (cArr[1] ^ 26), (char) (cArr[6] ^ 17), (char) (cArr[15] ^ 5), (char) (cArr[12] ^ 'Y'), (char) (cArr[5] ^ 24), (char) (cArr[5] ^ 22), (char) (cArr[15] ^ 24), (char) (cArr[16] ^ 16), (char) (cArr[5] ^ 28), (char) (cArr[16] ^ 19), (char) ((-10615) ^ (-10501)), (char) (cArr[15] ^ 5)};
        create.setTitle(new String(cArr).intern());
        char[] cArr2 = {(char) (cArr2[48] ^ 't'), (char) (cArr2[61] ^ '\r'), (char) (cArr2[82] ^ 22), (char) (cArr2[9] ^ 'A'), (char) (cArr2[52] ^ 1), (char) (cArr2[6] ^ '\t'), (char) (cArr2[95] ^ 18), (char) (cArr2[101] ^ 17), (char) (cArr2[3] ^ 'W'), (char) (cArr2[101] ^ 4), (char) (cArr2[23] ^ 29), (char) (cArr2[40] ^ 16), (char) (cArr2[47] ^ 'S'), (char) (cArr2[79] ^ 4), (char) (cArr2[106] ^ 23), (char) (cArr2[9] ^ 24), (char) (cArr2[7] ^ 22), (char) (cArr2[67] ^ 2), (char) (cArr2[40] ^ 20), (char) (cArr2[6] ^ 20), (char) (cArr2[36] ^ 16), (char) (cArr2[7] ^ 'T'), (char) (cArr2[36] ^ '\r'), (char) (cArr2[9] ^ 14), (char) (cArr2[32] ^ 7), (char) (cArr2[85] ^ 'T'), (char) (cArr2[7] ^ 21), (char) (cArr2[3] ^ 'R'), (char) (cArr2[104] ^ '\n'), (char) (cArr2[78] ^ 'Y'), (char) (cArr2[45] ^ 'C'), (char) (cArr2[42] ^ 28), (char) (cArr2[63] ^ 0), (char) (cArr2[53] ^ 7), (char) (cArr2[19] ^ 23), (char) (cArr2[23] ^ 1), (char) (cArr2[9] ^ 21), (char) (cArr2[67] ^ 1), (char) (cArr2[6] ^ 31), (char) (cArr2[31] ^ 'U'), (char) (cArr2[55] ^ 1), (char) (cArr2[75] ^ 18), (char) (cArr2[14] ^ '\f'), (char) (cArr2[67] ^ 3), (char) (cArr2[108] ^ 'I'), (char) (cArr2[15] ^ 'Y'), (char) (cArr2[104] ^ 6), (char) (cArr2[8] ^ 4), (char) (cArr2[95] ^ 'T'), (char) (cArr2[15] ^ '\f'), (char) (cArr2[101] ^ 11), (char) (cArr2[95] ^ 0), (char) (cArr2[40] ^ 7), (char) (cArr2[15] ^ '\f'), (char) (cArr2[85] ^ 7), (char) (cArr2[50] ^ 26), (char) (cArr2[95] ^ 17), (char) (cArr2[32] ^ 22), (char) (cArr2[33] ^ '\\'), (char) (cArr2[79] ^ 'O'), (char) (cArr2[93] ^ '9'), (char) (cArr2[67] ^ '\b'), (char) (cArr2[78] ^ 'Y'), (char) (cArr2[85] ^ 6), (char) (cArr2[17] ^ '\n'), (char) (cArr2[40] ^ 22), (char) (cArr2[23] ^ 0), (char) (cArr2[75] ^ '\f'), (char) (cArr2[79] ^ 2), (char) (cArr2[71] ^ 1), (char) (cArr2[0] ^ ':'), (char) (cArr2[92] ^ 5), (char) (cArr2[101] ^ 'E'), (char) (cArr2[97] ^ 17), (char) (18704 ^ 18808), (char) (cArr2[36] ^ 21), (char) (cArr2[50] ^ 26), (char) (cArr2[68] ^ 'M'), (char) (cArr2[50] ^ 23), (char) (cArr2[36] ^ 27), (char) (cArr2[72] ^ 'U'), (char) (cArr2[7] ^ 'T'), (char) (cArr2[26] ^ 18), (char) (cArr2[74] ^ 31), (char) (cArr2[59] ^ 'I'), (char) (cArr2[38] ^ '\r'), (char) (cArr2[73] ^ 23), (char) (cArr2[58] ^ 'F'), (char) (cArr2[9] ^ 'A'), (char) (cArr2[2] ^ 17), (char) (cArr2[9] ^ 14), (char) (cArr2[36] ^ 'T'), (char) (cArr2[93] ^ 15), (char) (cArr2[36] ^ 26), (char) (cArr2[25] ^ 'O'), (char) (cArr2[7] ^ 0), (char) (cArr2[15] ^ 17), (char) (cArr2[23] ^ '\n'), (char) (cArr2[70] ^ 28), (char) (cArr2[51] ^ 'T'), (char) (cArr2[49] ^ 30), (char) (cArr2[74] ^ '\r'), (char) (cArr2[58] ^ 'W'), (char) (cArr2[22] ^ 27), (char) (cArr2[44] ^ '\b'), (char) (cArr2[2] ^ 4), (char) (cArr2[72] ^ 'R'), (char) (cArr2[108] ^ 'J'), (char) (cArr2[59] ^ 14)};
        create.setMessage(new String(cArr2).intern());
        DialogInterface$OnClickListenerC0090u dialogInterface$OnClickListenerC0090u = new DialogInterface$OnClickListenerC0090u(this);
        char[] cArr3 = {(char) (14566 ^ 14505), (char) (cArr3[0] ^ 4)};
        create.setButton(-1, new String(cArr3).intern(), dialogInterface$OnClickListenerC0090u);
        create.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
        if (r4.m.getParent() == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u() {
        /*
            r4 = this;
            android.app.Activity r0 = r4.l
            if (r0 == 0) goto L76
            myunmn.c r0 = r4.m
            if (r0 == 0) goto L76
            boolean r0 = r4.s()
            if (r0 == 0) goto L76
            boolean r0 = r4.isFocused()
            if (r0 != 0) goto L15
            goto L76
        L15:
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.keyboard
            r1 = 1
            if (r0 == r1) goto L23
            return
        L23:
            android.view.ViewGroup r0 = r4.c()
            if (r0 == 0) goto L76
            myunmn.c r2 = r4.m
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != r0) goto L34
            r4.h = r1
            return
        L34:
            if (r2 == 0) goto L41
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L41
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            myunmn.c r3 = r4.m
            r2.removeView(r3)
        L41:
            r2 = 0
            android.view.View r2 = r0.getChildAt(r2)
            if (r2 != 0) goto L60
            myunmn.c r2 = r4.m
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != 0) goto L74
        L50:
            myunmn.c r2 = r4.m
            r0.addView(r2)
            myunmn.c r0 = r4.m
            r0.g()
            myunmn.c r0 = r4.m
            r0.d()
            goto L74
        L60:
            myunmn.c r3 = r4.m
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L74
            myunmn.c r2 = r4.m
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != 0) goto L74
            r0.removeAllViews()
            goto L50
        L74:
            r4.h = r1
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: myunmn.C0071b.u():void");
    }

    public boolean v() {
        return this.n || this.h;
    }

    public void w() {
        Activity activity = this.l;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new RunnableC0085p(this));
    }
}
