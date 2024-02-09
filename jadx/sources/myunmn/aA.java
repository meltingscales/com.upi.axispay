package myunmn;

import android.app.Activity;
import android.inputmethodservice.Keyboard;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class aA extends AbstractC0072c {
    public aA(Activity activity, AttributeSet attributeSet, C0071b c0071b) {
        super(activity, attributeSet);
        a(c0071b);
        f();
    }

    @Override // myunmn.AbstractC0072c
    public void f() {
        Activity activity = this.d;
        char[] cArr = {(char) (cArr[2] ^ 3), (char) (cArr[4] ^ 16), (char) (cArr[4] ^ '\b'), (char) (cArr[5] ^ 16), (char) (cArr[6] ^ 22), (char) (cArr[2] ^ 31), (char) ((-268) ^ (-377))};
        setKeyboard(new Keyboard(activity, a(new String(cArr).intern())));
        c();
    }
}
