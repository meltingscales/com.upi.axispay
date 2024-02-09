package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: tn0  reason: default package */
/* loaded from: classes.dex */
public class tn0 {
    public static final <T> void a(Appendable appendable, T t, dl0<? super T, ? extends CharSequence> dl0Var) {
        yl0.e(appendable, C0059ao.a(6717));
        if (dl0Var != null) {
            appendable.append(dl0Var.invoke(t));
            return;
        }
        if (t == null ? true : t instanceof CharSequence) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
