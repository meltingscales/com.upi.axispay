package defpackage;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: w50  reason: default package */
/* loaded from: classes.dex */
public final class w50 implements Closeable {
    public static final Pattern r = Pattern.compile(C0059ao.a(6443));
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final int f;
    public long g;
    public int h;
    public final int i;
    public Writer l;
    public int n;
    public long j = 0;
    public int k = 0;
    public final LinkedHashMap<String, d> m = new LinkedHashMap<>(0, 0.75f, true);
    public long o = 0;
    public final ThreadPoolExecutor p = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final Callable<Void> q = new a();

    /* compiled from: AxisPay */
    /* renamed from: w50$a */
    /* loaded from: classes.dex */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (w50.this) {
                if (w50.this.l == null) {
                    return null;
                }
                w50.this.b0();
                w50.this.a0();
                if (w50.this.S()) {
                    w50.this.X();
                    w50.this.n = 0;
                }
                return null;
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: w50$b */
    /* loaded from: classes.dex */
    public static class b extends OutputStream {
        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: w50$c */
    /* loaded from: classes.dex */
    public final class c {
        public final d a;
        public final boolean[] b;

        public /* synthetic */ c(w50 w50Var, d dVar, a aVar) {
            this(dVar);
        }

        public void a() throws IOException {
            w50.this.P(this, false);
        }

        public c(d dVar) {
            this.a = dVar;
            this.b = dVar.c ? null : new boolean[w50.this.i];
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: w50$d */
    /* loaded from: classes.dex */
    public final class d {
        public final String a;
        public final long[] b;
        public boolean c;
        public c d;
        public long e;

        public /* synthetic */ d(w50 w50Var, String str, a aVar) {
            this(str);
        }

        public File i(int i) {
            File file = w50.this.b;
            return new File(file, this.a + C0059ao.a(3527) + i);
        }

        public File j(int i) {
            File file = w50.this.b;
            return new File(file, this.a + C0059ao.a(3528) + i + C0059ao.a(3529));
        }

        public String k() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public final IOException l(String[] strArr) throws IOException {
            throw new IOException(C0059ao.a(3530) + Arrays.toString(strArr));
        }

        public final void m(String[] strArr) throws IOException {
            if (strArr.length == w50.this.i) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        l(strArr);
                        throw null;
                    }
                }
                return;
            }
            l(strArr);
            throw null;
        }

        public d(String str) {
            this.a = str;
            this.b = new long[w50.this.i];
        }
    }

    static {
        new b();
    }

    public w50(File file, int i, int i2, long j, int i3) {
        this.b = file;
        this.f = i;
        this.c = new File(file, C0059ao.a(6444));
        this.d = new File(file, C0059ao.a(6445));
        this.e = new File(file, C0059ao.a(6446));
        this.i = i2;
        this.g = j;
        this.h = i3;
    }

    public static void R(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static w50 T(File file, int i, int i2, long j, int i3) throws IOException {
        if (j > 0) {
            if (i3 > 0) {
                if (i2 > 0) {
                    File file2 = new File(file, C0059ao.a(6447));
                    if (file2.exists()) {
                        File file3 = new File(file, C0059ao.a(6448));
                        if (file3.exists()) {
                            file2.delete();
                        } else {
                            Z(file2, file3, false);
                        }
                    }
                    w50 w50Var = new w50(file, i, i2, j, i3);
                    if (w50Var.c.exists()) {
                        try {
                            w50Var.V();
                            w50Var.U();
                            w50Var.l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(w50Var.c, true), z50.a));
                            return w50Var;
                        } catch (IOException e) {
                            PrintStream printStream = System.out;
                            printStream.println(C0059ao.a(6449) + file + C0059ao.a(6450) + e.getMessage() + C0059ao.a(6451));
                            w50Var.Q();
                        }
                    }
                    file.mkdirs();
                    w50 w50Var2 = new w50(file, i, i2, j, i3);
                    w50Var2.X();
                    return w50Var2;
                }
                throw new IllegalArgumentException(C0059ao.a(6452));
            }
            throw new IllegalArgumentException(C0059ao.a(6453));
        }
        throw new IllegalArgumentException(C0059ao.a(6454));
    }

    public static void Z(File file, File file2, boolean z) throws IOException {
        if (z) {
            R(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final void O() {
        if (this.l == null) {
            throw new IllegalStateException(C0059ao.a(6455));
        }
    }

    public final synchronized void P(c cVar, boolean z) throws IOException {
        d dVar = cVar.a;
        if (dVar.d == cVar) {
            if (z && !dVar.c) {
                for (int i = 0; i < this.i; i++) {
                    if (cVar.b[i]) {
                        if (!dVar.j(i).exists()) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException(C0059ao.a(6456) + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.i; i2++) {
                File j = dVar.j(i2);
                if (z) {
                    if (j.exists()) {
                        File i3 = dVar.i(i2);
                        j.renameTo(i3);
                        long j2 = dVar.b[i2];
                        long length = i3.length();
                        dVar.b[i2] = length;
                        this.j = (this.j - j2) + length;
                        this.k++;
                    }
                } else {
                    R(j);
                }
            }
            this.n++;
            dVar.d = null;
            if (dVar.c | z) {
                dVar.c = true;
                this.l.write(C0059ao.a(6457) + dVar.a + dVar.k() + '\n');
                if (z) {
                    long j3 = this.o;
                    this.o = 1 + j3;
                    dVar.e = j3;
                }
            } else {
                this.m.remove(dVar.a);
                this.l.write(C0059ao.a(6458) + dVar.a + '\n');
            }
            this.l.flush();
            if (this.j > this.g || this.k > this.h || S()) {
                this.p.submit(this.q);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public void Q() throws IOException {
        close();
        z50.b(this.b);
    }

    public final boolean S() {
        int i = this.n;
        return i >= 2000 && i >= this.m.size();
    }

    public final void U() throws IOException {
        R(this.d);
        Iterator<d> it = this.m.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.d != null) {
                next.d = null;
                while (i < this.i) {
                    R(next.i(i));
                    R(next.j(i));
                    i++;
                }
                it.remove();
            } else {
                while (i < this.i) {
                    this.j += next.b[i];
                    this.k++;
                    i++;
                }
            }
        }
    }

    public final void V() throws IOException {
        String a2 = C0059ao.a(6459);
        y50 y50Var = new y50(new FileInputStream(this.c), z50.a);
        try {
            String k = y50Var.k();
            String k2 = y50Var.k();
            String k3 = y50Var.k();
            String k4 = y50Var.k();
            String k5 = y50Var.k();
            if (!C0059ao.a(6460).equals(k) || !C0059ao.a(6461).equals(k2) || !Integer.toString(this.f).equals(k3) || !Integer.toString(this.i).equals(k4) || !C0059ao.a(6462).equals(k5)) {
                throw new IOException(C0059ao.a(6463) + k + a2 + k2 + a2 + k4 + a2 + k5 + C0059ao.a(6464));
            }
            int i = 0;
            while (true) {
                try {
                    W(y50Var.k());
                    i++;
                } catch (EOFException unused) {
                    this.n = i - this.m.size();
                    z50.a(y50Var);
                    return;
                }
            }
        } catch (Throwable th) {
            z50.a(y50Var);
            throw th;
        }
    }

    public final void W(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        String a2 = C0059ao.a(6465);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith(C0059ao.a(6466))) {
                    this.m.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            d dVar = this.m.get(substring);
            if (dVar == null) {
                dVar = new d(this, substring, null);
                this.m.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(C0059ao.a(6467))) {
                String[] split = str.substring(indexOf2 + 1).split(C0059ao.a(6468));
                dVar.c = true;
                dVar.d = null;
                dVar.m(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(C0059ao.a(6469))) {
                dVar.d = new c(this, dVar, null);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith(C0059ao.a(6470))) {
                return;
            } else {
                throw new IOException(a2 + str);
            }
        }
        throw new IOException(a2 + str);
    }

    public final synchronized void X() throws IOException {
        Writer writer = this.l;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d), z50.a));
        bufferedWriter.write(C0059ao.a(6471));
        bufferedWriter.write(C0059ao.a(6472));
        bufferedWriter.write(C0059ao.a(6473));
        bufferedWriter.write(C0059ao.a(6474));
        bufferedWriter.write(Integer.toString(this.f));
        bufferedWriter.write(C0059ao.a(6475));
        bufferedWriter.write(Integer.toString(this.i));
        bufferedWriter.write(C0059ao.a(6476));
        bufferedWriter.write(C0059ao.a(6477));
        for (d dVar : this.m.values()) {
            if (dVar.d != null) {
                bufferedWriter.write(C0059ao.a(6478) + dVar.a + '\n');
            } else {
                bufferedWriter.write(C0059ao.a(6479) + dVar.a + dVar.k() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.c.exists()) {
            Z(this.c, this.e, true);
        }
        Z(this.d, this.c, false);
        this.e.delete();
        this.l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c, true), z50.a));
    }

    public synchronized boolean Y(String str) throws IOException {
        O();
        c0(str);
        d dVar = this.m.get(str);
        if (dVar != null && dVar.d == null) {
            for (int i = 0; i < this.i; i++) {
                File i2 = dVar.i(i);
                if (i2.exists() && !i2.delete()) {
                    throw new IOException(C0059ao.a(6480) + i2);
                }
                this.j -= dVar.b[i];
                this.k--;
                dVar.b[i] = 0;
            }
            this.n++;
            this.l.append((CharSequence) (C0059ao.a(6481) + str + '\n'));
            this.m.remove(str);
            if (S()) {
                this.p.submit(this.q);
            }
            return true;
        }
        return false;
    }

    public final void a0() throws IOException {
        while (this.k > this.h) {
            Y(this.m.entrySet().iterator().next().getKey());
        }
    }

    public final void b0() throws IOException {
        while (this.j > this.g) {
            Y(this.m.entrySet().iterator().next().getKey());
        }
    }

    public final void c0(String str) {
        if (r.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(6482) + str + C0059ao.a(6483));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.l == null) {
            return;
        }
        Iterator it = new ArrayList(this.m.values()).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.d != null) {
                dVar.d.a();
            }
        }
        b0();
        a0();
        this.l.close();
        this.l = null;
    }
}
