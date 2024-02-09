package defpackage;

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.regex.Pattern;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: fg0  reason: default package */
/* loaded from: classes.dex */
public class fg0 {

    /* compiled from: AxisPay */
    /* renamed from: fg0$a */
    /* loaded from: classes.dex */
    public class a implements InputFilter {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            StringBuilder sb = new StringBuilder(i2 - i);
            boolean z = true;
            for (int i5 = i; i5 < i2; i5++) {
                char charAt = charSequence.charAt(i5);
                if (fg0.d(charAt, fg0.c(this.a))) {
                    sb.append(charAt);
                } else {
                    z = false;
                }
            }
            if (z) {
                return null;
            }
            if (charSequence instanceof Spanned) {
                SpannableString spannableString = new SpannableString(sb);
                TextUtils.copySpansFrom((Spanned) charSequence, i, sb.length(), null, spannableString, 0);
                return spannableString;
            }
            return sb;
        }
    }

    public static InputFilter b(int i) {
        return new a(i);
    }

    public static String c(int i) {
        return i != 2 ? i != 3 ? i != 5 ? i != 7 ? C0059ao.a(9233) : C0059ao.a(9234) : C0059ao.a(9235) : C0059ao.a(9236) : C0059ao.a(9237);
    }

    public static boolean d(char c, String str) {
        return Pattern.compile(str).matcher(String.valueOf(c)).matches();
    }
}
