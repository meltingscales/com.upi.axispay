package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: pc  reason: default package */
/* loaded from: classes.dex */
public final class pc {
    public static final String[] a = new String[0];

    /* compiled from: AxisPay */
    /* renamed from: pc$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    public static String[] a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return a;
        }
        String[] stringArray = bundle.getStringArray(C0059ao.a(15228));
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray(C0059ao.a(15229));
        }
        return stringArray != null ? stringArray : a;
    }

    public static boolean b(CharSequence charSequence, int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            return Character.isHighSurrogate(charSequence.charAt(i));
        }
        return Character.isLowSurrogate(charSequence.charAt(i));
    }

    public static boolean c(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    public static void d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray(C0059ao.a(15230), strArr);
        editorInfo.extras.putStringArray(C0059ao.a(15231), strArr);
    }

    public static void e(EditorInfo editorInfo, CharSequence charSequence, int i) {
        db.e(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(editorInfo, charSequence, i);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 - i : i2 - i;
        int i5 = i2 > i3 ? i2 - i : i3 - i;
        int length = charSequence.length();
        if (i >= 0 && i4 >= 0 && i5 <= length) {
            if (c(editorInfo.inputType)) {
                g(editorInfo, null, 0, 0);
                return;
            } else if (length <= 2048) {
                g(editorInfo, charSequence, i4, i5);
                return;
            } else {
                h(editorInfo, charSequence, i4, i5);
                return;
            }
        }
        g(editorInfo, null, 0, 0);
    }

    public static void f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(editorInfo, charSequence, 0);
        } else {
            e(editorInfo, charSequence, 0);
        }
    }

    public static void g(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence(C0059ao.a(15232), charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt(C0059ao.a(15233), i);
        editorInfo.extras.putInt(C0059ao.a(15234), i2);
    }

    public static void h(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        CharSequence subSequence;
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int i5 = 2048 - i4;
        int min = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (i5 * 0.8d)));
        int min2 = Math.min(i, i5 - min);
        int i6 = i - min2;
        if (b(charSequence, i6, 0)) {
            i6++;
            min2--;
        }
        if (b(charSequence, (i2 + min) - 1, 1)) {
            min--;
        }
        int i7 = min2 + i4 + min;
        if (i4 != i3) {
            subSequence = TextUtils.concat(charSequence.subSequence(i6, i6 + min2), charSequence.subSequence(i2, min + i2));
        } else {
            subSequence = charSequence.subSequence(i6, i7 + i6);
        }
        int i8 = min2 + 0;
        g(editorInfo, subSequence, i8, i4 + i8);
    }
}
