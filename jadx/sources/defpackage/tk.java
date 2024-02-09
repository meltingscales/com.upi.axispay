package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: tk  reason: default package */
/* loaded from: classes.dex */
public class tk {
    public static final String[] m = {C0059ao.a(3077), C0059ao.a(3078), C0059ao.a(3079)};
    public final String[] b;
    public Map<String, Set<String>> c;
    public final bl e;
    public volatile fm h;
    public final b i;
    public ik d = null;
    public AtomicBoolean f = new AtomicBoolean(false);
    public volatile boolean g = false;
    @SuppressLint({"RestrictedApi"})
    public final a4<c, d> j = new a4<>();
    public final Object k = new Object();
    public Runnable l = new a();
    public final HashMap<String, Integer> a = new HashMap<>();

    /* compiled from: AxisPay */
    /* renamed from: tk$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        public final Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor y = tk.this.e.y(new vl(C0059ao.a(9151)));
            while (y.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(y.getInt(0)));
                } catch (Throwable th) {
                    y.close();
                    throw th;
                }
            }
            y.close();
            if (!hashSet.isEmpty()) {
                tk.this.h.l();
            }
            return hashSet;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
            if (r1 != null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
            r1.b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
            if (r1 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
            if (r2 == null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
            if (r2.isEmpty() != false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
            r1 = r6.b.j;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
            monitor-enter(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
            r3 = r6.b.j.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
            if (r3.hasNext() == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
            r3.next().getValue().a(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00c7, code lost:
            monitor-exit(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00cc, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r6 = this;
                tk r1 = defpackage.tk.this
                bl r1 = r1.e
                java.util.concurrent.locks.Lock r1 = r1.i()
                r1.lock()
                r2 = 0
                tk r3 = defpackage.tk.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                boolean r3 = r3.d()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r3 != 0) goto L21
                r1.unlock()
                tk r1 = defpackage.tk.this
                ik r1 = r1.d
                if (r1 == 0) goto L20
                r1.b()
            L20:
                return
            L21:
                tk r3 = defpackage.tk.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                java.util.concurrent.atomic.AtomicBoolean r3 = r3.f     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r4 = 1
                r5 = 0
                boolean r3 = r3.compareAndSet(r4, r5)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r3 != 0) goto L3a
                r1.unlock()
                tk r1 = defpackage.tk.this
                ik r1 = r1.d
                if (r1 == 0) goto L39
                r1.b()
            L39:
                return
            L3a:
                tk r3 = defpackage.tk.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                bl r3 = r3.e     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                boolean r3 = r3.n()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r3 == 0) goto L51
                r1.unlock()
                tk r1 = defpackage.tk.this
                ik r1 = r1.d
                if (r1 == 0) goto L50
                r1.b()
            L50:
                return
            L51:
                tk r3 = defpackage.tk.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                bl r3 = r3.e     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                cm r3 = r3.j()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                bm r3 = r3.K()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r3.F()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                java.util.Set r2 = r6.a()     // Catch: java.lang.Throwable -> L77
                r3.D()     // Catch: java.lang.Throwable -> L77
                r3.c()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r1.unlock()
                tk r1 = defpackage.tk.this
                ik r1 = r1.d
                if (r1 == 0) goto L9c
            L73:
                r1.b()
                goto L9c
            L77:
                r4 = move-exception
                r3.c()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                throw r4     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
            L7c:
                r2 = move-exception
                goto Lcd
            L7e:
                r3 = move-exception
                goto L81
            L80:
                r3 = move-exception
            L81:
                r0 = 9152(0x23c0, float:1.2825E-41)
                java.lang.String r4 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L7c
                r0 = 9153(0x23c1, float:1.2826E-41)
                java.lang.String r5 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L7c
                android.util.Log.e(r4, r5, r3)     // Catch: java.lang.Throwable -> L7c
                r1.unlock()
                tk r1 = defpackage.tk.this
                ik r1 = r1.d
                if (r1 == 0) goto L9c
                goto L73
            L9c:
                if (r2 == 0) goto Lcc
                boolean r1 = r2.isEmpty()
                if (r1 != 0) goto Lcc
                tk r1 = defpackage.tk.this
                a4<tk$c, tk$d> r1 = r1.j
                monitor-enter(r1)
                tk r3 = defpackage.tk.this     // Catch: java.lang.Throwable -> Lc9
                a4<tk$c, tk$d> r3 = r3.j     // Catch: java.lang.Throwable -> Lc9
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lc9
            Lb1:
                boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lc9
                if (r4 == 0) goto Lc7
                java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lc9
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> Lc9
                java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> Lc9
                tk$d r4 = (defpackage.tk.d) r4     // Catch: java.lang.Throwable -> Lc9
                r4.a(r2)     // Catch: java.lang.Throwable -> Lc9
                goto Lb1
            Lc7:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc9
                goto Lcc
            Lc9:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc9
                throw r2
            Lcc:
                return
            Lcd:
                r1.unlock()
                tk r1 = defpackage.tk.this
                ik r1 = r1.d
                if (r1 == 0) goto Ld9
                r1.b()
            Ld9:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tk.a.run():void");
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: tk$b */
    /* loaded from: classes.dex */
    public static class b {
        public final long[] a;
        public final boolean[] b;
        public final int[] c;
        public boolean d;

        public b(int i) {
            long[] jArr = new long[i];
            this.a = jArr;
            boolean[] zArr = new boolean[i];
            this.b = zArr;
            this.c = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public int[] a() {
            synchronized (this) {
                if (this.d) {
                    int length = this.a.length;
                    for (int i = 0; i < length; i++) {
                        int i2 = 1;
                        boolean z = this.a[i] > 0;
                        boolean[] zArr = this.b;
                        if (z != zArr[i]) {
                            int[] iArr = this.c;
                            if (!z) {
                                i2 = 2;
                            }
                            iArr[i] = i2;
                        } else {
                            this.c[i] = 0;
                        }
                        zArr[i] = z;
                    }
                    this.d = false;
                    return (int[]) this.c.clone();
                }
                return null;
            }
        }

        public boolean b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.a;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        this.d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        public boolean c(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        this.d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        public void d() {
            synchronized (this) {
                Arrays.fill(this.b, false);
                this.d = true;
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: tk$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        public final String[] a;

        public c(String[] strArr) {
            this.a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    /* compiled from: AxisPay */
    /* renamed from: tk$d */
    /* loaded from: classes.dex */
    public static class d {
        public final int[] a;
        public final String[] b;
        public final c c;
        public final Set<String> d;

        public d(c cVar, int[] iArr, String[] strArr) {
            this.c = cVar;
            this.a = iArr;
            this.b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.d = null;
        }

        public void a(Set<Integer> set) {
            int length = this.a.length;
            Set<String> set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.a[i]))) {
                    if (length == 1) {
                        set2 = this.d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.c.b(set2);
            }
        }

        public void b(String[] strArr) {
            Set<String> set = null;
            if (this.b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.b[0])) {
                        set = this.d;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.b;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            String str2 = strArr2[i2];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i2++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.c.b(set);
            }
        }
    }

    public tk(bl blVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.e = blVar;
        this.i = new b(strArr.length);
        this.c = map2;
        new sk(blVar);
        int length = strArr.length;
        this.b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.a.put(lowerCase, Integer.valueOf(i));
            String str2 = map.get(strArr[i]);
            if (str2 != null) {
                this.b[i] = str2.toLowerCase(locale);
            } else {
                this.b[i] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    public static void b(StringBuilder sb, String str, String str2) {
        String a2 = C0059ao.a(3080);
        sb.append(a2);
        sb.append(C0059ao.a(3081));
        sb.append(str);
        sb.append(C0059ao.a(3082));
        sb.append(str2);
        sb.append(a2);
    }

    public static void c(bm bmVar) {
        if (Build.VERSION.SDK_INT >= 16 && bmVar.B()) {
            bmVar.F();
        } else {
            bmVar.d();
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
        d g;
        String[] j = j(cVar.a);
        int[] iArr = new int[j.length];
        int length = j.length;
        for (int i = 0; i < length; i++) {
            Integer num = this.a.get(j[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
            } else {
                throw new IllegalArgumentException(C0059ao.a(3083) + j[i]);
            }
        }
        d dVar = new d(cVar, iArr, j);
        synchronized (this.j) {
            g = this.j.g(cVar, dVar);
        }
        if (g == null && this.i.b(iArr)) {
            o();
        }
    }

    public boolean d() {
        if (this.e.t()) {
            if (!this.g) {
                this.e.j().K();
            }
            if (this.g) {
                return true;
            }
            Log.e(C0059ao.a(3084), C0059ao.a(3085));
            return false;
        }
        return false;
    }

    public void e(bm bmVar) {
        synchronized (this) {
            if (this.g) {
                Log.e(C0059ao.a(3086), C0059ao.a(3087));
                return;
            }
            bmVar.i(C0059ao.a(3088));
            bmVar.i(C0059ao.a(3089));
            bmVar.i(C0059ao.a(3090));
            p(bmVar);
            this.h = bmVar.n(C0059ao.a(3091));
            this.g = true;
        }
    }

    public void f(String... strArr) {
        synchronized (this.j) {
            Iterator<Map.Entry<c, d>> it = this.j.iterator();
            while (it.hasNext()) {
                Map.Entry<c, d> next = it.next();
                if (!next.getKey().a()) {
                    next.getValue().b(strArr);
                }
            }
        }
    }

    public void g() {
        synchronized (this) {
            this.g = false;
            this.i.d();
        }
    }

    public void h() {
        if (this.f.compareAndSet(false, true)) {
            ik ikVar = this.d;
            if (ikVar != null) {
                ikVar.e();
            }
            this.e.k().execute(this.l);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void i(c cVar) {
        d h;
        synchronized (this.j) {
            h = this.j.h(cVar);
        }
        if (h == null || !this.i.c(h.a)) {
            return;
        }
        o();
    }

    public final String[] j(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.c.containsKey(lowerCase)) {
                hashSet.addAll(this.c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public void k(ik ikVar) {
        this.d = ikVar;
        ikVar.h(new Runnable() { // from class: gk
            @Override // java.lang.Runnable
            public final void run() {
                tk.this.g();
            }
        });
    }

    public void l(Context context, String str, Intent intent) {
        new uk(context, str, intent, this, this.e.k());
    }

    public final void m(bm bmVar, int i) {
        String[] strArr;
        bmVar.i(C0059ao.a(3092) + i + C0059ao.a(3093));
        String str = this.b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : m) {
            sb.setLength(0);
            sb.append(C0059ao.a(3094));
            b(sb, str, str2);
            sb.append(C0059ao.a(3095));
            sb.append(str2);
            sb.append(C0059ao.a(3096));
            sb.append(str);
            sb.append(C0059ao.a(3097));
            sb.append(C0059ao.a(3098));
            sb.append(C0059ao.a(3099));
            String a2 = C0059ao.a(3100);
            sb.append(a2);
            sb.append(C0059ao.a(3101));
            sb.append(C0059ao.a(3102));
            sb.append(C0059ao.a(3103));
            sb.append(C0059ao.a(3104));
            sb.append(i);
            sb.append(C0059ao.a(3105));
            sb.append(a2);
            sb.append(C0059ao.a(3106));
            sb.append(C0059ao.a(3107));
            bmVar.i(sb.toString());
        }
    }

    public final void n(bm bmVar, int i) {
        String[] strArr;
        String str = this.b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : m) {
            sb.setLength(0);
            sb.append(C0059ao.a(3108));
            b(sb, str, str2);
            bmVar.i(sb.toString());
        }
    }

    public void o() {
        if (this.e.t()) {
            p(this.e.j().K());
        }
    }

    public void p(bm bmVar) {
        if (bmVar.v()) {
            return;
        }
        try {
            Lock i = this.e.i();
            i.lock();
            try {
                synchronized (this.k) {
                    int[] a2 = this.i.a();
                    if (a2 == null) {
                        return;
                    }
                    int length = a2.length;
                    c(bmVar);
                    for (int i2 = 0; i2 < length; i2++) {
                        int i3 = a2[i2];
                        if (i3 == 1) {
                            m(bmVar, i2);
                        } else if (i3 == 2) {
                            n(bmVar, i2);
                        }
                    }
                    bmVar.D();
                    bmVar.c();
                }
            } finally {
                i.unlock();
            }
        } catch (SQLiteException | IllegalStateException e) {
            Log.e(C0059ao.a(3109), C0059ao.a(3110), e);
        }
    }
}
