package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: mn0  reason: default package */
/* loaded from: classes.dex */
public class mn0 extends ln0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AxisPay */
    /* renamed from: mn0$a */
    /* loaded from: classes.dex */
    public static final class a<T> implements Iterable<T>, om0 {
        public final /* synthetic */ hn0 b;

        public a(hn0 hn0Var) {
            this.b = hn0Var;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.b.iterator();
        }
    }

    public static final <T> Iterable<T> a(hn0<? extends T> hn0Var) {
        yl0.e(hn0Var, C0059ao.a(11826));
        return new a(hn0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> hn0<T> b(hn0<? extends T> hn0Var, int i) {
        yl0.e(hn0Var, C0059ao.a(11827));
        if (i >= 0) {
            return i == 0 ? hn0Var : hn0Var instanceof gn0 ? ((gn0) hn0Var).a(i) : new fn0(hn0Var, i);
        }
        throw new IllegalArgumentException((C0059ao.a(11828) + i + C0059ao.a(11829)).toString());
    }

    public static final <T, A extends Appendable> A c(hn0<? extends T> hn0Var, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, dl0<? super T, ? extends CharSequence> dl0Var) {
        yl0.e(hn0Var, C0059ao.a(11830));
        yl0.e(a2, C0059ao.a(11831));
        yl0.e(charSequence, C0059ao.a(11832));
        yl0.e(charSequence2, C0059ao.a(11833));
        yl0.e(charSequence3, C0059ao.a(11834));
        yl0.e(charSequence4, C0059ao.a(11835));
        a2.append(charSequence2);
        int i2 = 0;
        for (T t : hn0Var) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            tn0.a(a2, t, dl0Var);
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <T> String d(hn0<? extends T> hn0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, dl0<? super T, ? extends CharSequence> dl0Var) {
        yl0.e(hn0Var, C0059ao.a(11836));
        yl0.e(charSequence, C0059ao.a(11837));
        yl0.e(charSequence2, C0059ao.a(11838));
        yl0.e(charSequence3, C0059ao.a(11839));
        yl0.e(charSequence4, C0059ao.a(11840));
        StringBuilder sb = new StringBuilder();
        c(hn0Var, sb, charSequence, charSequence2, charSequence3, i, charSequence4, dl0Var);
        String sb2 = sb.toString();
        yl0.d(sb2, C0059ao.a(11841));
        return sb2;
    }

    public static /* synthetic */ String e(hn0 hn0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, dl0 dl0Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = C0059ao.a(11842);
        }
        int i3 = i2 & 2;
        CharSequence a2 = C0059ao.a(11843);
        CharSequence charSequence5 = i3 != 0 ? a2 : charSequence2;
        if ((i2 & 4) == 0) {
            a2 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i4 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = C0059ao.a(11844);
        }
        CharSequence charSequence6 = charSequence4;
        if ((i2 & 32) != 0) {
            dl0Var = null;
        }
        return d(hn0Var, charSequence, charSequence5, a2, i4, charSequence6, dl0Var);
    }

    public static final <T, R> hn0<R> f(hn0<? extends T> hn0Var, dl0<? super T, ? extends R> dl0Var) {
        yl0.e(hn0Var, C0059ao.a(11845));
        yl0.e(dl0Var, C0059ao.a(11846));
        return new nn0(hn0Var, dl0Var);
    }

    public static final <T, C extends Collection<? super T>> C g(hn0<? extends T> hn0Var, C c) {
        yl0.e(hn0Var, C0059ao.a(11847));
        yl0.e(c, C0059ao.a(11848));
        for (T t : hn0Var) {
            c.add(t);
        }
        return c;
    }

    public static final <T> List<T> h(hn0<? extends T> hn0Var) {
        yl0.e(hn0Var, C0059ao.a(11849));
        return aj0.k(i(hn0Var));
    }

    public static final <T> List<T> i(hn0<? extends T> hn0Var) {
        yl0.e(hn0Var, C0059ao.a(11850));
        ArrayList arrayList = new ArrayList();
        g(hn0Var, arrayList);
        return arrayList;
    }
}
