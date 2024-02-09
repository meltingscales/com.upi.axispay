package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import java.nio.CharBuffer;
import myunmn.C0059ao;

/* compiled from: AxisPay */
@SuppressLint({"LogConditional"})
/* renamed from: u6  reason: default package */
/* loaded from: classes.dex */
public class u6 {
    public static String a(Context context, int i) {
        try {
            return i != -1 ? context.getResources().getResourceEntryName(i) : C0059ao.a(2473);
        } catch (Exception unused) {
            return C0059ao.a(2474) + i;
        }
    }

    public static String b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return C0059ao.a(2475);
        }
    }

    public static String c(d7 d7Var, int i) {
        return d(d7Var, i, -1);
    }

    public static String d(d7 d7Var, int i, int i2) {
        int length;
        if (i == -1) {
            return C0059ao.a(2476);
        }
        String resourceEntryName = d7Var.getContext().getResources().getResourceEntryName(i);
        if (i2 != -1) {
            if (resourceEntryName.length() > i2) {
                resourceEntryName = resourceEntryName.replaceAll(C0059ao.a(2477), C0059ao.a(2478));
            }
            if (resourceEntryName.length() <= i2 || (length = resourceEntryName.replaceAll(C0059ao.a(2479), C0059ao.a(2480)).length()) <= 0) {
                return resourceEntryName;
            }
            int length2 = (resourceEntryName.length() - i2) / length;
            StringBuilder sb = new StringBuilder();
            sb.append(CharBuffer.allocate(length2).toString().replace((char) 0, '.'));
            String a = C0059ao.a(2481);
            sb.append(a);
            return resourceEntryName.replaceAll(sb.toString(), a);
        }
        return resourceEntryName;
    }
}
