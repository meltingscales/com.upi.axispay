package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: AxisPay */
/* renamed from: el  reason: default package */
/* loaded from: classes.dex */
public class el implements em, dm {
    public static final TreeMap<Integer, el> j = new TreeMap<>();
    public volatile String b;
    public final long[] c;
    public final double[] d;
    public final String[] e;
    public final byte[][] f;
    public final int[] g;
    public final int h;
    public int i;

    public el(int i) {
        this.h = i;
        int i2 = i + 1;
        this.g = new int[i2];
        this.c = new long[i2];
        this.d = new double[i2];
        this.e = new String[i2];
        this.f = new byte[i2];
    }

    public static el k(String str, int i) {
        TreeMap<Integer, el> treeMap = j;
        synchronized (treeMap) {
            Map.Entry<Integer, el> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                el value = ceilingEntry.getValue();
                value.m(str, i);
                return value;
            }
            el elVar = new el(i);
            elVar.m(str, i);
            return elVar;
        }
    }

    public static void r() {
        TreeMap<Integer, el> treeMap = j;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i;
        }
    }

    @Override // defpackage.dm
    public void C(int i, long j2) {
        this.g[i] = 2;
        this.c[i] = j2;
    }

    @Override // defpackage.dm
    public void H(int i, byte[] bArr) {
        this.g[i] = 5;
        this.f[i] = bArr;
    }

    @Override // defpackage.dm
    public void a(int i, String str) {
        this.g[i] = 4;
        this.e[i] = str;
    }

    @Override // defpackage.em
    public String b() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // defpackage.em
    public void j(dm dmVar) {
        for (int i = 1; i <= this.i; i++) {
            int i2 = this.g[i];
            if (i2 == 1) {
                dmVar.q(i);
            } else if (i2 == 2) {
                dmVar.C(i, this.c[i]);
            } else if (i2 == 3) {
                dmVar.s(i, this.d[i]);
            } else if (i2 == 4) {
                dmVar.a(i, this.e[i]);
            } else if (i2 == 5) {
                dmVar.H(i, this.f[i]);
            }
        }
    }

    public void m(String str, int i) {
        this.b = str;
        this.i = i;
    }

    @Override // defpackage.dm
    public void q(int i) {
        this.g[i] = 1;
    }

    public void release() {
        TreeMap<Integer, el> treeMap = j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.h), this);
            r();
        }
    }

    @Override // defpackage.dm
    public void s(int i, double d) {
        this.g[i] = 3;
        this.d[i] = d;
    }
}
