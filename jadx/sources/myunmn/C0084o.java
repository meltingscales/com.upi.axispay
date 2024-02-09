package myunmn;

import android.app.Activity;
import android.inputmethodservice.Keyboard;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: myunmn.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0084o extends AbstractC0072c {
    public static HashMap e;
    public static Integer h;
    public Keyboard a;
    public int b;
    public Keyboard c;
    public Keyboard f;
    public String g;
    public String i;

    public C0084o(Activity activity, AttributeSet attributeSet, String str, C0071b c0071b) {
        super(activity, attributeSet);
        this.g = Locale.getDefault().getISO3Language();
        this.b = 0;
        this.i = str;
        this.c = c(str);
        char[] cArr = {(char) (cArr[2] ^ 30), (char) (cArr[4] ^ 22), (char) (cArr[4] ^ 2), (char) (cArr[6] ^ 17), (char) ((-31064) ^ (-31033)), (char) (cArr[3] ^ 14), (char) (cArr[2] ^ 30)};
        this.f = new Keyboard(activity, a(new String(cArr).intern()));
        char[] cArr2 = {(char) (cArr2[6] ^ 0), (char) (cArr2[0] ^ '\n'), (char) (cArr2[6] ^ 30), (char) (cArr2[6] ^ 17), (char) (cArr2[9] ^ 3), (char) (cArr2[10] ^ 24), (char) ((-12328) ^ (-12373)), (char) (cArr2[9] ^ '3'), (char) (cArr2[5] ^ '\r'), (char) (cArr2[2] ^ 1), (char) (cArr2[6] ^ 7)};
        this.a = new Keyboard(activity, a(new String(cArr2).intern()));
        a(c0071b);
        a(0);
        setShifted(false);
    }

    public final void a() {
        HashMap hashMap = new HashMap();
        e = hashMap;
        char[] cArr = {(char) (cArr[1] ^ '\t'), (char) (cArr[9] ^ '\n'), (char) (cArr[9] ^ 27), (char) (cArr[0] ^ 24), (char) (cArr[8] ^ 11), (char) (cArr[8] ^ 28), (char) (cArr[2] ^ 7), (char) (cArr[8] ^ '1'), (char) (cArr[9] ^ 1), (char) ((-11003) ^ (-10902))};
        String intern = new String(cArr).intern();
        Integer valueOf = Integer.valueOf(a(intern));
        char[] cArr2 = {(char) (cArr2[1] ^ 1), (char) ((-24150) ^ (-24123))};
        hashMap.put(new String(cArr2).intern(), valueOf);
        HashMap hashMap2 = e;
        Integer valueOf2 = Integer.valueOf(a(intern));
        char[] cArr3 = {(char) ((-7966) ^ (-8052)), (char) (cArr3[0] ^ '\f')};
        hashMap2.put(new String(cArr3).intern(), valueOf2);
        HashMap hashMap3 = e;
        Integer valueOf3 = Integer.valueOf(a(intern));
        char[] cArr4 = {(char) (16525 ^ 16611), (char) (cArr4[0] ^ 0)};
        hashMap3.put(new String(cArr4).intern(), valueOf3);
        HashMap hashMap4 = e;
        char[] cArr5 = {(char) (cArr5[3] ^ 24), (char) (cArr5[2] ^ 17), (char) (cArr5[4] ^ 17), (char) (26956 ^ 26936), (char) (cArr5[3] ^ 17), (char) (cArr5[3] ^ 6), (char) (cArr5[0] ^ 31), (char) (cArr5[0] ^ '3'), (char) (cArr5[4] ^ 22), (char) (cArr5[4] ^ 0)};
        Integer valueOf4 = Integer.valueOf(a(new String(cArr5).intern()));
        char[] cArr6 = {(char) (15447 ^ 15396), (char) (cArr6[0] ^ 5)};
        hashMap4.put(new String(cArr6).intern(), valueOf4);
        HashMap hashMap5 = e;
        char[] cArr7 = {(char) (cArr7[6] ^ 31), (char) (cArr7[6] ^ 22), (char) (cArr7[4] ^ 17), (char) (cArr7[0] ^ 24), (char) (cArr7[6] ^ 22), (char) (cArr7[1] ^ 23), (char) ((-20958) ^ (-20911)), (char) (cArr7[8] ^ ';'), (char) (cArr7[6] ^ 23), (char) (cArr7[4] ^ 14)};
        Integer valueOf5 = Integer.valueOf(a(new String(cArr7).intern()));
        char[] cArr8 = {(char) ((-978) ^ (-950)), (char) (cArr8[0] ^ 5)};
        hashMap5.put(new String(cArr8).intern(), valueOf5);
        HashMap hashMap6 = e;
        char[] cArr9 = {(char) (cArr9[1] ^ '\t'), (char) (cArr9[3] ^ 17), (char) (cArr9[5] ^ 6), (char) ((-11980) ^ (-11968)), (char) (cArr9[3] ^ 17), (char) (cArr9[3] ^ 6), (char) (cArr9[1] ^ 22), (char) (cArr9[1] ^ ':'), (char) (cArr9[3] ^ 16), (char) (cArr9[6] ^ 22)};
        Integer valueOf6 = Integer.valueOf(a(new String(cArr9).intern()));
        char[] cArr10 = {(char) (cArr10[1] ^ 1), (char) ((-8485) ^ (-8514))};
        hashMap6.put(new String(cArr10).intern(), valueOf6);
        char[] cArr11 = {(char) (cArr11[5] ^ 30), (char) (cArr11[7] ^ ':'), (char) (cArr11[9] ^ 7), (char) (cArr11[8] ^ 1), (char) (cArr11[6] ^ 22), (char) (cArr11[6] ^ 1), (char) (cArr11[8] ^ 6), (char) (cArr11[2] ^ '+'), (char) (6781 ^ 6664), (char) (cArr11[8] ^ 6)};
        h = Integer.valueOf(a(new String(cArr11).intern()));
    }

    public final void a(int i) {
        setKeyboard(i != 1 ? i != 2 ? this.c : this.a : this.f);
        c();
        a(getKeyboard());
        this.b = i;
    }

    @Override // myunmn.AbstractC0072c
    public void b() {
        if (this.b == 0) {
            setShifted(!isShifted());
        }
    }

    @Override // myunmn.AbstractC0072c
    public void b(String str) {
        if (this.g.equals(str)) {
            return;
        }
        Keyboard keyboard = this.c;
        Keyboard c = c(str);
        this.c = c;
        if (keyboard != null) {
            c.setShifted(keyboard.isShifted());
        }
        a(this.b);
    }

    public final Keyboard c(String str) {
        if (e == null) {
            a();
        }
        Integer num = (Integer) e.get(str);
        if (num == null) {
            num = h;
        }
        return new Keyboard(this.d, num.intValue());
    }

    @Override // myunmn.AbstractC0072c
    public void d() {
        this.b = 0;
        this.c.setShifted(false);
        a(this.b);
    }

    @Override // myunmn.AbstractC0072c
    public void f() {
        Keyboard keyboard = this.c;
        boolean isShifted = keyboard != null ? keyboard.isShifted() : false;
        Keyboard c = c(this.i);
        this.c = c;
        c.setShifted(isShifted);
        Activity activity = this.d;
        char[] cArr = {(char) (cArr[4] ^ 28), (char) (cArr[4] ^ 22), (char) (cArr[6] ^ 30), (char) (cArr[4] ^ '\r'), (char) (9720 ^ 9623), (char) (cArr[4] ^ 3), (char) (cArr[4] ^ 28)};
        this.f = new Keyboard(activity, a(new String(cArr).intern()));
        Activity activity2 = this.d;
        char[] cArr2 = {(char) (cArr2[3] ^ 17), (char) (cArr2[8] ^ 24), (char) (cArr2[5] ^ 1), (char) (cArr2[5] ^ 14), (char) (cArr2[3] ^ '\r'), (char) (cArr2[7] ^ '3'), (char) (cArr2[2] ^ 30), (char) (12245 ^ 12170), (char) (cArr2[5] ^ '\r'), (char) (cArr2[2] ^ 1), (char) (cArr2[9] ^ 24)};
        this.a = new Keyboard(activity2, a(new String(cArr2).intern()));
        a(this.b);
    }

    @Override // myunmn.AbstractC0072c
    public void i() {
        a(this.b == 0 ? 1 : 0);
        this.c.setShifted(false);
    }

    @Override // myunmn.AbstractC0072c
    public void j() {
        a(this.b == 1 ? 2 : 1);
    }

    @Override // myunmn.AbstractC0072c
    public void k() {
        a(0);
        this.c.setShifted(false);
    }
}
