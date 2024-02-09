package defpackage;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;

/* compiled from: AxisPay */
/* renamed from: q8  reason: default package */
/* loaded from: classes.dex */
public final class q8 {
    public static RemoteInput a(q8 q8Var) {
        Set<String> d;
        RemoteInput.Builder addExtras = new RemoteInput.Builder(q8Var.i()).setLabel(q8Var.h()).setChoices(q8Var.e()).setAllowFreeFormInput(q8Var.c()).addExtras(q8Var.g());
        if (Build.VERSION.SDK_INT >= 26 && (d = q8Var.d()) != null) {
            for (String str : d) {
                addExtras.setAllowDataType(str, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(q8Var.f());
        }
        return addExtras.build();
    }

    public static RemoteInput[] b(q8[] q8VarArr) {
        if (q8VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[q8VarArr.length];
        for (int i = 0; i < q8VarArr.length; i++) {
            remoteInputArr[i] = a(q8VarArr[i]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        throw null;
    }

    public Set<String> d() {
        throw null;
    }

    public CharSequence[] e() {
        throw null;
    }

    public int f() {
        throw null;
    }

    public Bundle g() {
        throw null;
    }

    public CharSequence h() {
        throw null;
    }

    public String i() {
        throw null;
    }
}
