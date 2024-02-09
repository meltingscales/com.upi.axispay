package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ij0 */
/* loaded from: classes.dex */
public class ij0 extends hj0 {

    /* compiled from: AxisPay */
    /* renamed from: ij0$a */
    /* loaded from: classes.dex */
    public static final class a<T> implements hn0<T> {
        public final /* synthetic */ Iterable a;

        public a(Iterable iterable) {
            this.a = iterable;
        }

        @Override // defpackage.hn0
        public Iterator<T> iterator() {
            return this.a.iterator();
        }
    }

    public static /* synthetic */ String A(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, dl0 dl0Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = C0059ao.a(3164);
        }
        int i3 = i2 & 2;
        CharSequence a2 = C0059ao.a(3165);
        CharSequence charSequence5 = i3 != 0 ? a2 : charSequence2;
        if ((i2 & 4) == 0) {
            a2 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i4 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = C0059ao.a(3166);
        }
        CharSequence charSequence6 = charSequence4;
        if ((i2 & 32) != 0) {
            dl0Var = null;
        }
        return z(iterable, charSequence, charSequence5, a2, i4, charSequence6, dl0Var);
    }

    public static final <T> T B(List<? extends T> list) {
        yl0.e(list, C0059ao.a(3167));
        if (!list.isEmpty()) {
            return list.get(aj0.g(list));
        }
        throw new NoSuchElementException(C0059ao.a(3168));
    }

    public static final <T> List<T> C(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        yl0.e(collection, C0059ao.a(3169));
        yl0.e(iterable, C0059ao.a(3170));
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        fj0.q(arrayList2, iterable);
        return arrayList2;
    }

    public static final <T> List<T> D(Collection<? extends T> collection, T t) {
        yl0.e(collection, C0059ao.a(3171));
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static final <T> T E(Iterable<? extends T> iterable) {
        yl0.e(iterable, C0059ao.a(3172));
        if (iterable instanceof List) {
            return (T) F((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                throw new IllegalArgumentException(C0059ao.a(3173));
            }
            return next;
        }
        throw new NoSuchElementException(C0059ao.a(3174));
    }

    public static final <T> T F(List<? extends T> list) {
        yl0.e(list, C0059ao.a(3175));
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException(C0059ao.a(3176));
        }
        throw new NoSuchElementException(C0059ao.a(3177));
    }

    public static final <T> List<T> G(Iterable<? extends T> iterable, int i) {
        yl0.e(iterable, C0059ao.a(3178));
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException((C0059ao.a(3179) + i + C0059ao.a(3180)).toString());
        } else if (i == 0) {
            return aj0.f();
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return I(iterable);
                }
                if (i == 1) {
                    return zi0.b(u(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (T t : iterable) {
                arrayList.add(t);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return aj0.k(arrayList);
        }
    }

    public static final <T, C extends Collection<? super T>> C H(Iterable<? extends T> iterable, C c) {
        yl0.e(iterable, C0059ao.a(3181));
        yl0.e(c, C0059ao.a(3182));
        for (T t : iterable) {
            c.add(t);
        }
        return c;
    }

    public static final <T> List<T> I(Iterable<? extends T> iterable) {
        yl0.e(iterable, C0059ao.a(3183));
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return K(collection);
                }
                return zi0.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            return aj0.f();
        }
        return aj0.k(J(iterable));
    }

    public static final <T> List<T> J(Iterable<? extends T> iterable) {
        yl0.e(iterable, C0059ao.a(3184));
        if (iterable instanceof Collection) {
            return K((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        H(iterable, arrayList);
        return arrayList;
    }

    public static final <T> List<T> K(Collection<? extends T> collection) {
        yl0.e(collection, C0059ao.a(3185));
        return new ArrayList(collection);
    }

    public static final <T> Set<T> L(Iterable<? extends T> iterable) {
        yl0.e(iterable, C0059ao.a(3186));
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return rj0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(pj0.a(collection.size()));
                H(iterable, linkedHashSet);
                return linkedHashSet;
            }
            return sj0.b();
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        H(iterable, linkedHashSet2);
        return sj0.c(linkedHashSet2);
    }

    public static final <T> hn0<T> s(Iterable<? extends T> iterable) {
        yl0.e(iterable, C0059ao.a(3187));
        return new a(iterable);
    }

    public static final <T> List<T> t(List<? extends T> list, int i) {
        yl0.e(list, C0059ao.a(3188));
        if (i >= 0) {
            return G(list, tm0.b(list.size() - i, 0));
        }
        throw new IllegalArgumentException((C0059ao.a(3189) + i + C0059ao.a(3190)).toString());
    }

    public static final <T> T u(Iterable<? extends T> iterable) {
        yl0.e(iterable, C0059ao.a(3191));
        if (iterable instanceof List) {
            return (T) v((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException(C0059ao.a(3192));
    }

    public static final <T> T v(List<? extends T> list) {
        yl0.e(list, C0059ao.a(3193));
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException(C0059ao.a(3194));
    }

    public static final <T> T w(List<? extends T> list) {
        yl0.e(list, C0059ao.a(3195));
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T, A extends Appendable> A x(Iterable<? extends T> iterable, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, dl0<? super T, ? extends CharSequence> dl0Var) {
        yl0.e(iterable, C0059ao.a(3196));
        yl0.e(a2, C0059ao.a(3197));
        yl0.e(charSequence, C0059ao.a(3198));
        yl0.e(charSequence2, C0059ao.a(3199));
        yl0.e(charSequence3, C0059ao.a(3200));
        yl0.e(charSequence4, C0059ao.a(3201));
        a2.append(charSequence2);
        int i2 = 0;
        for (T t : iterable) {
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

    public static /* synthetic */ Appendable y(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, dl0 dl0Var, int i2, Object obj) {
        CharSequence a2 = (i2 & 2) != 0 ? C0059ao.a(3202) : charSequence;
        int i3 = i2 & 4;
        CharSequence a3 = C0059ao.a(3203);
        CharSequence charSequence5 = i3 != 0 ? a3 : charSequence2;
        if ((i2 & 8) == 0) {
            a3 = charSequence3;
        }
        x(iterable, appendable, a2, charSequence5, a3, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? C0059ao.a(3204) : charSequence4, (i2 & 64) != 0 ? null : dl0Var);
        return appendable;
    }

    public static final <T> String z(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, dl0<? super T, ? extends CharSequence> dl0Var) {
        yl0.e(iterable, C0059ao.a(3205));
        yl0.e(charSequence, C0059ao.a(3206));
        yl0.e(charSequence2, C0059ao.a(3207));
        yl0.e(charSequence3, C0059ao.a(3208));
        yl0.e(charSequence4, C0059ao.a(3209));
        StringBuilder sb = new StringBuilder();
        x(iterable, sb, charSequence, charSequence2, charSequence3, i, charSequence4, dl0Var);
        String sb2 = sb.toString();
        yl0.d(sb2, C0059ao.a(3210));
        return sb2;
    }
}
