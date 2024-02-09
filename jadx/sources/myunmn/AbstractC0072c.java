package myunmn;

import android.app.Activity;
import android.content.res.Resources;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: myunmn.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0072c extends KeyboardView implements KeyboardView.OnKeyboardActionListener {
    public Activity d;
    public C0071b j;

    public AbstractC0072c(Activity activity, AttributeSet attributeSet) {
        super(activity, attributeSet);
        this.j = null;
        this.d = activity;
        setOnKeyboardActionListener(this);
        setPreviewEnabled(false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public final int a(Keyboard.Key key) {
        CharSequence charSequence = key.popupCharacters;
        if (charSequence == null) {
            return 1;
        }
        try {
            return Integer.parseInt(charSequence.toString());
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public int a(String str) {
        Resources resources = getResources();
        String packageName = getContext().getPackageName();
        char[] cArr = {(char) ((-31765) ^ (-31853)), (char) (cArr[0] ^ 21), (char) (cArr[1] ^ 1)};
        return resources.getIdentifier(str, new String(cArr).intern(), packageName);
    }

    public void a(Keyboard keyboard) {
        ArrayList arrayList;
        int measuredWidth = getMeasuredWidth();
        int i = -1;
        if (measuredWidth == -1) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = null;
        int i2 = 0;
        for (Keyboard.Key key : keyboard.getKeys()) {
            if (arrayList4 == null) {
                arrayList = new ArrayList();
            } else if (key.y != i) {
                arrayList3.add(Integer.valueOf(i2));
                arrayList2.add(arrayList4);
                arrayList = new ArrayList();
            } else {
                i = key.y;
                i2 += a(key);
                arrayList4.add(key);
            }
            arrayList4 = arrayList;
            i2 = 0;
            i = key.y;
            i2 += a(key);
            arrayList4.add(key);
        }
        if (arrayList4 != null && arrayList4.size() > 0) {
            arrayList3.add(Integer.valueOf(i2));
            arrayList2.add(arrayList4);
        }
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            ArrayList arrayList5 = (ArrayList) arrayList2.get(i3);
            double intValue = measuredWidth / ((Integer) arrayList3.get(i3)).intValue();
            double d = 0.0d;
            Iterator it = arrayList5.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Keyboard.Key key2 = (Keyboard.Key) it.next();
                Iterator it2 = it;
                double a = a(key2) * intValue;
                ArrayList arrayList6 = arrayList2;
                ArrayList arrayList7 = arrayList3;
                double d2 = (int) a;
                double d3 = d + (a - d2);
                int i5 = (int) (d2 + d3);
                d = d3 - ((int) d3);
                if (key2.equals((Keyboard.Key) arrayList5.get(arrayList5.size() - 1))) {
                    i5 += measuredWidth - (i4 + i5);
                }
                key2.width = i5;
                key2.x = i4;
                key2.gap = 0;
                i4 += i5;
                int height = getHeight() / size;
                key2.height = height;
                key2.y = height * i3;
                it = it2;
                arrayList2 = arrayList6;
                arrayList3 = arrayList7;
            }
            i3++;
            arrayList3 = arrayList3;
        }
    }

    public void a(C0071b c0071b) {
        this.j = c0071b;
    }

    public void b() {
    }

    public void b(String str) {
    }

    public void c() {
        try {
            List<Keyboard.Key> keys = getKeyboard().getKeys();
            Keyboard.Key key = keys.get(keys.size() - 1);
            if ((e().getInputType() & 131072) != 131072) {
                key.icon = null;
                Resources resources = getResources();
                char[] cArr = {(char) (cArr[3] ^ 22), (char) (cArr[3] ^ '\r'), (char) (cArr[14] ^ '\r'), (char) (cArr[7] ^ 14), (char) (cArr[0] ^ 31), (char) (cArr[1] ^ '\f'), (char) (cArr[22] ^ 0), (char) (22466 ^ 22441), (char) (cArr[18] ^ 17), (char) (cArr[13] ^ 11), (char) (cArr[23] ^ '\f'), (char) (cArr[3] ^ '\n'), (char) (cArr[3] ^ 4), (char) (cArr[12] ^ 19), (char) (cArr[7] ^ 15), (char) (cArr[18] ^ '+'), (char) (cArr[3] ^ 7), (char) (cArr[7] ^ 30), (char) (cArr[3] ^ 17), (char) (cArr[0] ^ 7), (char) (cArr[0] ^ 28), (char) (cArr[16] ^ '\f'), (char) (cArr[18] ^ '+'), (char) (cArr[16] ^ '\f'), (char) (cArr[26] ^ 17), (char) (cArr[15] ^ '\''), (char) (cArr[16] ^ 22)};
                String intern = new String(cArr).intern();
                char[] cArr2 = {(char) (cArr2[2] ^ 1), (char) (cArr2[4] ^ 26), (char) (cArr2[3] ^ 27), (char) (cArr2[4] ^ 7), (char) (cArr2[5] ^ '\t'), (char) (7785 ^ 7694)};
                key.label = resources.getString(resources.getIdentifier(intern, new String(cArr2).intern(), getContext().getPackageName()));
            }
        } catch (NullPointerException unused) {
        }
    }

    public void d() {
    }

    public final C0071b e() {
        return this.j;
    }

    public abstract void f();

    public void g() {
        a(getKeyboard());
    }

    public int h() {
        Keyboard keyboard = getKeyboard();
        if (keyboard == null) {
            return 0;
        }
        return keyboard.getHeight();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onKey(int i, int[] iArr) {
        C0071b e = e();
        if (e == null) {
            return;
        }
        char c = (char) i;
        if (i == -2) {
            i();
        } else if (i == -1) {
            b();
        } else if (i == 10) {
            e.dispatchKeyEvent(new KeyEvent(0, 66));
            e.dispatchKeyEvent(new KeyEvent(1, 66));
        } else if (i == -6) {
            j();
        } else if (i == -5) {
            e.dispatchKeyEvent(new KeyEvent(0, 67));
            e.dispatchKeyEvent(new KeyEvent(1, 67));
        } else if (i == -4) {
            k();
            e.w();
        } else {
            if (isShifted()) {
                c = Character.toUpperCase(c);
            }
            e.append(String.valueOf(c));
            Selection.setSelection(e.getText(), e.length());
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.inputmethodservice.KeyboardView, android.view.View
    public void onMeasure(int i, int i2) {
        int h = h();
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE ? h > size : mode == 1073741824) {
            h = size;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), h);
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onPress(int i) {
        long nanoTime = System.nanoTime();
        C0071b e = e();
        if (e == null) {
            return;
        }
        for (InterfaceC0049ae interfaceC0049ae : e.l()) {
            interfaceC0049ae.a(nanoTime, 0, i);
        }
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onRelease(int i) {
        long nanoTime = System.nanoTime();
        C0071b e = e();
        if (e == null) {
            return;
        }
        for (InterfaceC0049ae interfaceC0049ae : e.l()) {
            interfaceC0049ae.a(nanoTime, 1, i);
        }
    }

    @Override // android.inputmethodservice.KeyboardView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        f();
        a(getKeyboard());
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onText(CharSequence charSequence) {
    }

    @Override // android.inputmethodservice.KeyboardView, android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeDown() {
    }

    @Override // android.inputmethodservice.KeyboardView, android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeLeft() {
    }

    @Override // android.inputmethodservice.KeyboardView, android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeRight() {
    }

    @Override // android.inputmethodservice.KeyboardView, android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeUp() {
    }
}
