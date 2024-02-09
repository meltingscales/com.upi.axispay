package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: si0  reason: default package */
/* loaded from: classes.dex */
public abstract class si0<E> extends ri0<E> implements List<E>, om0 {
    public static final a Companion = new a(null);

    /* compiled from: AxisPay */
    /* renamed from: si0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(vl0 vl0Var) {
            this();
        }

        public final void a(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(C0059ao.a(4271) + i + C0059ao.a(4272) + i2);
            }
        }

        public final void b(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException(C0059ao.a(4273) + i + C0059ao.a(4274) + i2);
            }
        }

        public final void c(int i, int i2, int i3) {
            String a = C0059ao.a(4275);
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException(a + i + C0059ao.a(4277) + i2 + C0059ao.a(4278) + i3);
            } else if (i <= i2) {
            } else {
                throw new IllegalArgumentException(a + i + C0059ao.a(4276) + i2);
            }
        }

        public final boolean d(Collection<?> collection, Collection<?> collection2) {
            yl0.e(collection, C0059ao.a(4279));
            yl0.e(collection2, C0059ao.a(4280));
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!yl0.a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int e(Collection<?> collection) {
            yl0.e(collection, C0059ao.a(4281));
            Iterator<?> it = collection.iterator();
            int i = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i = (i * 31) + (next == null ? 0 : next.hashCode());
            }
            return i;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: si0$b */
    /* loaded from: classes.dex */
    public class b implements Iterator<E>, om0 {
        public int b;
        public final /* synthetic */ si0<E> c;

        public b(si0 si0Var) {
            yl0.e(si0Var, C0059ao.a(4263));
            this.c = si0Var;
        }

        public final int a() {
            return this.b;
        }

        public final void b(int i) {
            this.b = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b < this.c.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                si0<E> si0Var = this.c;
                int i = this.b;
                this.b = i + 1;
                return si0Var.get(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(C0059ao.a(4264));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: si0$c */
    /* loaded from: classes.dex */
    public class c extends si0<E>.b implements ListIterator<E>, om0 {
        public final /* synthetic */ si0<E> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(si0 si0Var, int i) {
            super(si0Var);
            yl0.e(si0Var, C0059ao.a(4237));
            this.d = si0Var;
            si0.Companion.b(i, si0Var.size());
            b(i);
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            throw new UnsupportedOperationException(C0059ao.a(4238));
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                si0<E> si0Var = this.d;
                b(a() - 1);
                return si0Var.get(a());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            throw new UnsupportedOperationException(C0059ao.a(4239));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: si0$d */
    /* loaded from: classes.dex */
    public static final class d<E> extends si0<E> implements RandomAccess {
        public final si0<E> b;
        public final int c;
        public int d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(si0<? extends E> si0Var, int i, int i2) {
            yl0.e(si0Var, C0059ao.a(4210));
            this.b = si0Var;
            this.c = i;
            si0.Companion.c(i, i2, si0Var.size());
            this.d = i2 - i;
        }

        @Override // defpackage.si0, java.util.List
        public E get(int i) {
            si0.Companion.a(i, this.d);
            return this.b.get(this.c + i);
        }

        @Override // defpackage.si0, defpackage.ri0
        public int getSize() {
            return this.d;
        }
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException(C0059ao.a(5143));
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException(C0059ao.a(5144));
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.d(this, (Collection) obj);
        }
        return false;
    }

    public abstract E get(int i);

    @Override // defpackage.ri0
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.e(this);
    }

    public int indexOf(E e) {
        int i = 0;
        for (E e2 : this) {
            if (yl0.a(e2, e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // defpackage.ri0, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new b(this);
    }

    public int lastIndexOf(E e) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (yl0.a(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new c(this, 0);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException(C0059ao.a(5145));
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException(C0059ao.a(5146));
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new d(this, i, i2);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new c(this, i);
    }
}
