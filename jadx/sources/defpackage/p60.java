package defpackage;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: p60  reason: default package */
/* loaded from: classes.dex */
public class p60<E> extends AbstractQueue<E> implements Object<E>, Serializable, Serializable {
    public transient d<E> b;
    public transient d<E> c;
    public transient int d;
    public final int e;
    public final ReentrantLock f;
    public final Condition g;
    public final Condition h;

    /* compiled from: AxisPay */
    /* renamed from: p60$b */
    /* loaded from: classes.dex */
    public abstract class b implements Iterator<E> {
        public d<E> b;
        public E c;
        public d<E> d;

        public b() {
            ReentrantLock reentrantLock = p60.this.f;
            reentrantLock.lock();
            try {
                d<E> b = b();
                this.b = b;
                this.c = b == null ? null : b.a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void a() {
            ReentrantLock reentrantLock = p60.this.f;
            reentrantLock.lock();
            try {
                d<E> d = d(this.b);
                this.b = d;
                this.c = d == null ? null : d.a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public abstract d<E> b();

        public abstract d<E> c(d<E> dVar);

        public final d<E> d(d<E> dVar) {
            while (true) {
                d<E> c = c(dVar);
                if (c == null) {
                    return null;
                }
                if (c.a != null) {
                    return c;
                }
                if (c == dVar) {
                    return b();
                }
                dVar = c;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b != null;
        }

        @Override // java.util.Iterator
        public E next() {
            d<E> dVar = this.b;
            if (dVar != null) {
                this.d = dVar;
                E e = this.c;
                a();
                return e;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            d<E> dVar = this.d;
            if (dVar != null) {
                this.d = null;
                ReentrantLock reentrantLock = p60.this.f;
                reentrantLock.lock();
                try {
                    if (dVar.a != null) {
                        p60.this.o(dVar);
                    }
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: p60$c */
    /* loaded from: classes.dex */
    public class c extends p60<E>.b {
        public c() {
            super();
        }

        @Override // defpackage.p60.b
        public d<E> b() {
            return p60.this.b;
        }

        @Override // defpackage.p60.b
        public d<E> c(d<E> dVar) {
            return dVar.c;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: p60$d */
    /* loaded from: classes.dex */
    public static final class d<E> {
        public E a;
        public d<E> b;
        public d<E> c;

        public d(E e) {
            this.a = e;
        }
    }

    public p60() {
        this(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public void a(E e) {
        if (!f(e)) {
            throw new IllegalStateException(C0059ao.a(12838));
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        a(e);
        return true;
    }

    public E b() {
        E h = h();
        if (h != null) {
            return h;
        }
        throw new NoSuchElementException();
    }

    public final boolean c(d<E> dVar) {
        int i = this.d;
        if (i >= this.e) {
            return false;
        }
        d<E> dVar2 = this.b;
        dVar.c = dVar2;
        this.b = dVar;
        if (this.c == null) {
            this.c = dVar;
        } else {
            dVar2.b = dVar;
        }
        this.d = i + 1;
        this.g.signal();
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            d<E> dVar = this.b;
            while (dVar != null) {
                dVar.a = null;
                d<E> dVar2 = dVar.c;
                dVar.b = null;
                dVar.c = null;
                dVar = dVar2;
            }
            this.c = null;
            this.b = null;
            this.d = 0;
            this.h.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            for (d<E> dVar = this.b; dVar != null; dVar = dVar.c) {
                if (obj.equals(dVar.a)) {
                    return true;
                }
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean d(d<E> dVar) {
        int i = this.d;
        if (i >= this.e) {
            return false;
        }
        d<E> dVar2 = this.c;
        dVar.b = dVar2;
        this.c = dVar;
        if (this.b == null) {
            this.b = dVar;
        } else {
            dVar2.c = dVar;
        }
        this.d = i + 1;
        this.g.signal();
        return true;
    }

    public int drainTo(Collection<? super E> collection) {
        return drainTo(collection, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public boolean e(E e) {
        Objects.requireNonNull(e);
        d<E> dVar = new d<>(e);
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            return c(dVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractQueue, java.util.Queue
    public E element() {
        return b();
    }

    public boolean f(E e) {
        Objects.requireNonNull(e);
        d<E> dVar = new d<>(e);
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            return d(dVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean g(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        boolean z;
        Objects.requireNonNull(e);
        d<E> dVar = new d<>(e);
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                if (d(dVar)) {
                    z = true;
                    break;
                } else if (nanos <= 0) {
                    z = false;
                    break;
                } else {
                    nanos = this.h.awaitNanos(nanos);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return z;
    }

    public E h() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            d<E> dVar = this.b;
            return dVar == null ? null : dVar.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E i() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            return p();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new c();
    }

    public E j(long j, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                E p = p();
                if (p != null) {
                    return p;
                }
                if (nanos <= 0) {
                    return null;
                }
                nanos = this.g.awaitNanos(nanos);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public void k(E e) throws InterruptedException {
        Objects.requireNonNull(e);
        d<E> dVar = new d<>(e);
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        while (!d(dVar)) {
            try {
                this.h.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public E l() {
        E i = i();
        if (i != null) {
            return i;
        }
        throw new NoSuchElementException();
    }

    public boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            for (d<E> dVar = this.b; dVar != null; dVar = dVar.c) {
                if (obj.equals(dVar.a)) {
                    o(dVar);
                    return true;
                }
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E n() throws InterruptedException {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        while (true) {
            try {
                E p = p();
                if (p != null) {
                    return p;
                }
                this.g.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public void o(d<E> dVar) {
        d<E> dVar2 = dVar.b;
        d<E> dVar3 = dVar.c;
        if (dVar2 == null) {
            p();
        } else if (dVar3 == null) {
            q();
        } else {
            dVar2.c = dVar3;
            dVar3.b = dVar2;
            dVar.a = null;
            this.d--;
            this.h.signal();
        }
    }

    public boolean offer(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return g(e, j, timeUnit);
    }

    public final E p() {
        d<E> dVar = this.b;
        if (dVar == null) {
            return null;
        }
        d<E> dVar2 = dVar.c;
        E e = dVar.a;
        dVar.a = null;
        dVar.c = dVar;
        this.b = dVar2;
        if (dVar2 == null) {
            this.c = null;
        } else {
            dVar2.b = null;
        }
        this.d--;
        this.h.signal();
        return e;
    }

    @Override // java.util.Queue
    public E peek() {
        return h();
    }

    @Override // java.util.Queue
    public E poll() {
        return i();
    }

    public void put(E e) throws InterruptedException {
        k(e);
    }

    public final E q() {
        d<E> dVar = this.c;
        if (dVar == null) {
            return null;
        }
        d<E> dVar2 = dVar.b;
        E e = dVar.a;
        dVar.a = null;
        dVar.b = dVar;
        this.c = dVar2;
        if (dVar2 == null) {
            this.b = null;
        } else {
            dVar2.c = null;
        }
        this.d--;
        this.h.signal();
        return e;
    }

    public int remainingCapacity() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            return this.e - this.d;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return m(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            return this.d;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E take() throws InterruptedException {
        return n();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            Object[] objArr = new Object[this.d];
            int i = 0;
            d<E> dVar = this.b;
            while (dVar != null) {
                int i2 = i + 1;
                objArr[i] = dVar.a;
                dVar = dVar.c;
                i = i2;
            }
            return objArr;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.lang.Object
    public String toString() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            d<E> dVar = this.b;
            if (dVar == null) {
                return C0059ao.a(12839);
            }
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            while (true) {
                Object obj = dVar.a;
                if (obj == this) {
                    obj = C0059ao.a(12840);
                }
                sb.append(obj);
                dVar = dVar.c;
                if (dVar == null) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(',');
                sb.append(' ');
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public p60(int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f = reentrantLock;
        this.g = reentrantLock.newCondition();
        this.h = reentrantLock.newCondition();
        if (i > 0) {
            this.e = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public int drainTo(Collection<? super E> collection, int i) {
        Objects.requireNonNull(collection);
        if (collection != this) {
            ReentrantLock reentrantLock = this.f;
            reentrantLock.lock();
            try {
                int min = Math.min(i, this.d);
                for (int i2 = 0; i2 < min; i2++) {
                    collection.add((E) this.b.a);
                    p();
                }
                return min;
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalArgumentException();
    }

    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        return j(j, timeUnit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            if (tArr.length < this.d) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.d));
            }
            int i = 0;
            d<E> dVar = this.b;
            while (dVar != null) {
                tArr[i] = dVar.a;
                dVar = dVar.c;
                i++;
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        } finally {
            reentrantLock.unlock();
        }
    }
}
