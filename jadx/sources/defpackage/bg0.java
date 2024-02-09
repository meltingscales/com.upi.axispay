package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.text.DecimalFormat;
import java.text.ParseException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: bg0  reason: default package */
/* loaded from: classes.dex */
public class bg0 implements TextWatcher {
    public DecimalFormat b;
    public DecimalFormat c;
    public boolean d;
    public int e;
    public int f;
    public EditText g;
    public String h = C0059ao.a(2706);
    public int i = 2;
    public double j = 1.0d;
    public double k = 100000.0d;
    public double l = 100000.0d;

    public bg0(EditText editText, int i) {
        DecimalFormat decimalFormat = new DecimalFormat(C0059ao.a(2707));
        this.b = decimalFormat;
        decimalFormat.setDecimalSeparatorAlwaysShown(true);
        this.c = new DecimalFormat(C0059ao.a(2708));
        this.g = editText;
        this.f = i;
        this.d = false;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        String a = C0059ao.a(2709);
        this.g.removeTextChangedListener(this);
        try {
            int length = this.g.getText().length();
            String replace = editable.toString().replace(String.valueOf(this.b.getDecimalFormatSymbols().getGroupingSeparator()), a);
            Number parse = this.b.parse(replace);
            int selectionStart = this.g.getSelectionStart();
            if (parse.doubleValue() < this.j) {
                this.g.setText(a);
            } else if (this.f == 2 && parse.doubleValue() > this.l) {
                Number parse2 = this.b.parse(this.h);
                if (this.d) {
                    this.g.setText(this.b.format(parse2));
                } else {
                    this.g.setText(this.c.format(parse2));
                }
            } else if (this.f == 1 && parse.doubleValue() > this.k) {
                Number parse3 = this.b.parse(this.h);
                if (this.d) {
                    this.g.setText(this.b.format(parse3));
                } else {
                    this.g.setText(this.c.format(parse3));
                }
            } else {
                this.h = replace;
                if (this.d) {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        int i = this.e;
                        this.e = i - 1;
                        if (i <= 0) {
                            break;
                        }
                        sb.append('0');
                    }
                    EditText editText = this.g;
                    editText.setText(this.b.format(parse) + sb.toString());
                } else {
                    this.g.setText(this.c.format(parse));
                }
            }
            int length2 = selectionStart + (this.g.getText().length() - length);
            if (length2 > 0 && length2 <= this.g.getText().length()) {
                this.g.setSelection(length2);
            } else if (this.g.getText().length() > 0) {
                EditText editText2 = this.g;
                editText2.setSelection(editText2.getText().length() - 1);
            } else {
                this.g.setSelection(0);
            }
        } catch (NumberFormatException unused) {
        } catch (ParseException unused2) {
            this.g.setText(a);
        }
        this.g.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int indexOf = charSequence.toString().indexOf(String.valueOf(this.b.getDecimalFormatSymbols().getDecimalSeparator()));
        this.e = 0;
        int length = (charSequence.length() - indexOf) - 1;
        if (indexOf > -1) {
            for (int i4 = indexOf + 1; i4 < charSequence.length(); i4++) {
                if (charSequence.charAt(i4) == '0' && length <= this.i) {
                    this.e++;
                } else {
                    this.e = 0;
                }
            }
            this.d = true;
            return;
        }
        this.d = false;
    }
}
