package myunmn;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.List;

/* loaded from: classes.dex */
public class D implements TextWatcher {
    public final /* synthetic */ C0071b a;

    public D(C0071b c0071b) {
        this.a = c0071b;
    }

    public final char a(String str, String str2) {
        if (str2.length() - str.length() != 1) {
            return (char) 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                return str2.charAt(i);
            }
        }
        return str2.charAt(str2.length() - 1);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        List<InterfaceC0049ae> list;
        long nanoTime = System.nanoTime();
        String charSequence2 = charSequence.toString();
        if (i3 - i2 == 1) {
            str = this.a.i;
            char a = a(str, charSequence2);
            if (a != 0) {
                list = this.a.g;
                for (InterfaceC0049ae interfaceC0049ae : list) {
                    interfaceC0049ae.a(nanoTime, a);
                }
            }
        }
        this.a.i = charSequence2;
        this.a.c(true);
    }
}
