package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import defpackage.fq;
import defpackage.kr;
import defpackage.lq;
import defpackage.lr;
import defpackage.mr;
import defpackage.nr;
import defpackage.or;
import defpackage.pr;
import defpackage.yu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: tu  reason: default package */
/* loaded from: classes.dex */
public class tu implements lu, yu, ku {
    public static final vo g = vo.b(C0059ao.a(3413));
    public final vu b;
    public final zu c;
    public final zu d;
    public final mu e;
    public final fr<String> f;

    /* compiled from: AxisPay */
    /* renamed from: tu$b */
    /* loaded from: classes.dex */
    public interface b<T, U> {
        U apply(T t);
    }

    /* compiled from: AxisPay */
    /* renamed from: tu$c */
    /* loaded from: classes.dex */
    public static class c {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: tu$d */
    /* loaded from: classes.dex */
    public interface d<T> {
        T a();
    }

    public tu(zu zuVar, zu zuVar2, mu muVar, vu vuVar, fr<String> frVar) {
        this.b = vuVar;
        this.c = zuVar;
        this.d = zuVar2;
        this.e = muVar;
        this.f = frVar;
    }

    public static /* synthetic */ Object C0(String str, mr.b bVar, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) O0(sQLiteDatabase.rawQuery(C0059ao.a(3414), new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: au
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                Boolean valueOf;
                Cursor cursor = (Cursor) obj;
                valueOf = Boolean.valueOf(r0.getCount() > 0);
                return valueOf;
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(C0059ao.a(3415), str);
            contentValues.put(C0059ao.a(3416), Integer.valueOf(bVar.getNumber()));
            contentValues.put(C0059ao.a(3417), Long.valueOf(j));
            sQLiteDatabase.insert(C0059ao.a(3418), null, contentValues);
        } else {
            sQLiteDatabase.execSQL(C0059ao.a(3419) + j + C0059ao.a(3420), new String[]{str, Integer.toString(bVar.getNumber())});
        }
        return null;
    }

    public static /* synthetic */ Object D0(long j, lq lqVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0059ao.a(3421), Long.valueOf(j));
        String[] strArr = {lqVar.b(), String.valueOf(fv.a(lqVar.d()))};
        String a2 = C0059ao.a(3422);
        if (sQLiteDatabase.update(a2, contentValues, C0059ao.a(3423), strArr) < 1) {
            contentValues.put(C0059ao.a(3424), lqVar.b());
            contentValues.put(C0059ao.a(3425), Integer.valueOf(fv.a(lqVar.d())));
            sQLiteDatabase.insert(a2, null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public /* synthetic */ Object F0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(C0059ao.a(3426)).execute();
        sQLiteDatabase.compileStatement(C0059ao.a(3427) + this.c.a()).execute();
        return null;
    }

    public static byte[] I0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static vo M0(String str) {
        if (str == null) {
            return g;
        }
        return vo.b(str);
    }

    public static String N0(Iterable<su> iterable) {
        StringBuilder sb = new StringBuilder(C0059ao.a(3428));
        Iterator<su> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T O0(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ Object X(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            k(i, mr.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ Integer Z(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        O0(sQLiteDatabase.rawQuery(C0059ao.a(3429), strArr), new b() { // from class: lt
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.this.X((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete(C0059ao.a(3430), C0059ao.a(3431), strArr));
    }

    public static /* synthetic */ Object a0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Object b0(Throwable th) {
        throw new xu(C0059ao.a(3432), th);
    }

    public static /* synthetic */ SQLiteDatabase c0(Throwable th) {
        throw new xu(C0059ao.a(3433), th);
    }

    public static /* synthetic */ Long d0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ pr e0(long j, Cursor cursor) {
        cursor.moveToNext();
        long j2 = cursor.getLong(0);
        pr.a c2 = pr.c();
        c2.c(j2);
        c2.b(j);
        return c2.a();
    }

    public static /* synthetic */ pr f0(final long j, SQLiteDatabase sQLiteDatabase) {
        return (pr) O0(sQLiteDatabase.rawQuery(C0059ao.a(3434), new String[0]), new b() { // from class: et
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.e0(j, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long g0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ Boolean i0(lq lqVar, SQLiteDatabase sQLiteDatabase) {
        Long S = S(sQLiteDatabase, lqVar);
        if (S == null) {
            return Boolean.FALSE;
        }
        return (Boolean) O0(M().rawQuery(C0059ao.a(3435), new String[]{S.toString()}), new b() { // from class: gu
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ List j0(SQLiteDatabase sQLiteDatabase) {
        return (List) O0(sQLiteDatabase.rawQuery(C0059ao.a(3436), new String[0]), new b() { // from class: jt
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.k0((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ List k0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            lq.a a2 = lq.a();
            a2.b(cursor.getString(1));
            a2.d(fv.b(cursor.getInt(2)));
            a2.c(I0(cursor.getString(3)));
            arrayList.add(a2.a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public /* synthetic */ List m0(lq lqVar, SQLiteDatabase sQLiteDatabase) {
        List<su> G0 = G0(sQLiteDatabase, lqVar);
        V(G0, H0(sQLiteDatabase, G0));
        return G0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public /* synthetic */ kr o0(Map map, kr.a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            mr.b r = r(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            mr.a c2 = mr.c();
            c2.c(r);
            c2.b(j);
            ((List) map.get(string)).add(c2.a());
        }
        J0(aVar, map);
        aVar.e(R());
        aVar.d(O());
        aVar.c(this.f.get());
        return aVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public /* synthetic */ kr q0(String str, final Map map, final kr.a aVar, SQLiteDatabase sQLiteDatabase) {
        return (kr) O0(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: wt
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.this.o0(map, aVar, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public /* synthetic */ Object s0(List list, lq lqVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            fq.a a2 = fq.a();
            a2.j(cursor.getString(1));
            a2.i(cursor.getLong(2));
            a2.k(cursor.getLong(3));
            if (z) {
                a2.h(new eq(M0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                a2.h(new eq(M0(cursor.getString(4)), K0(j)));
            }
            if (!cursor.isNull(6)) {
                a2.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(su.a(j, lqVar, a2.d()));
        }
        return null;
    }

    public static /* synthetic */ Object t0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public /* synthetic */ Long v0(fq fqVar, lq lqVar, SQLiteDatabase sQLiteDatabase) {
        if (U()) {
            k(1L, mr.b.CACHE_FULL, fqVar.j());
            return -1L;
        }
        long z = z(sQLiteDatabase, lqVar);
        int e = this.e.e();
        byte[] a2 = fqVar.e().a();
        boolean z2 = a2.length <= e;
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0059ao.a(3437), Long.valueOf(z));
        contentValues.put(C0059ao.a(3438), fqVar.j());
        contentValues.put(C0059ao.a(3439), Long.valueOf(fqVar.f()));
        contentValues.put(C0059ao.a(3440), Long.valueOf(fqVar.k()));
        contentValues.put(C0059ao.a(3441), fqVar.e().b().a());
        contentValues.put(C0059ao.a(3442), fqVar.d());
        contentValues.put(C0059ao.a(3443), (Integer) 0);
        contentValues.put(C0059ao.a(3444), Boolean.valueOf(z2));
        contentValues.put(C0059ao.a(3445), z2 ? a2 : new byte[0]);
        long insert = sQLiteDatabase.insert(C0059ao.a(3446), null, contentValues);
        String a3 = C0059ao.a(3447);
        if (!z2) {
            int ceil = (int) Math.ceil(a2.length / e);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a2, (i - 1) * e, Math.min(i * e, a2.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(a3, Long.valueOf(insert));
                contentValues2.put(C0059ao.a(3448), Integer.valueOf(i));
                contentValues2.put(C0059ao.a(3449), copyOfRange);
                sQLiteDatabase.insert(C0059ao.a(3450), null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : fqVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put(a3, Long.valueOf(insert));
            contentValues3.put(C0059ao.a(3451), entry.getKey());
            contentValues3.put(C0059ao.a(3452), entry.getValue());
            sQLiteDatabase.insert(C0059ao.a(3453), null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    public static /* synthetic */ byte[] w0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public /* synthetic */ Object y0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            k(i, mr.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public /* synthetic */ Object A0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        O0(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: xt
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.this.y0((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement(C0059ao.a(3454)).execute();
        return null;
    }

    @Override // defpackage.lu
    public long A(lq lqVar) {
        return ((Long) O0(M().rawQuery(C0059ao.a(3455), new String[]{lqVar.b(), String.valueOf(fv.a(lqVar.d()))}), new b() { // from class: ot
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.d0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // defpackage.lu
    public boolean E(final lq lqVar) {
        return ((Boolean) T(new b() { // from class: mt
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.this.i0(lqVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    public final List<su> G0(SQLiteDatabase sQLiteDatabase, final lq lqVar) {
        final ArrayList arrayList = new ArrayList();
        Long S = S(sQLiteDatabase, lqVar);
        if (S == null) {
            return arrayList;
        }
        O0(sQLiteDatabase.query(C0059ao.a(3464), new String[]{C0059ao.a(3456), C0059ao.a(3457), C0059ao.a(3458), C0059ao.a(3459), C0059ao.a(3460), C0059ao.a(3461), C0059ao.a(3462), C0059ao.a(3463)}, C0059ao.a(3465), new String[]{S.toString()}, null, null, null, String.valueOf(this.e.d())), new b() { // from class: qt
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.this.s0(arrayList, lqVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public final Map<Long, Set<c>> H0(SQLiteDatabase sQLiteDatabase, List<su> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder(C0059ao.a(3466));
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        O0(sQLiteDatabase.query(C0059ao.a(3470), new String[]{C0059ao.a(3467), C0059ao.a(3468), C0059ao.a(3469)}, sb2, null, null, null, null), new b() { // from class: vt
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.t0(hashMap, (Cursor) obj);
            }
        });
        return hashMap;
    }

    @Override // defpackage.lu
    public void I(Iterable<su> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = C0059ao.a(3471) + N0(iterable);
            final String a2 = C0059ao.a(3472);
            T(new b() { // from class: tt
                @Override // defpackage.tu.b
                public final Object apply(Object obj) {
                    return tu.this.A0(str, a2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    public long J() {
        return P() * Q();
    }

    public final void J0(kr.a aVar, Map<String, List<mr>> map) {
        for (Map.Entry<String, List<mr>> entry : map.entrySet()) {
            nr.a c2 = nr.c();
            c2.c(entry.getKey());
            c2.b(entry.getValue());
            aVar.a(c2.a());
        }
    }

    public final byte[] K0(long j) {
        return (byte[]) O0(M().query(C0059ao.a(3474), new String[]{C0059ao.a(3473)}, C0059ao.a(3475), new String[]{String.valueOf(j)}, null, null, C0059ao.a(3476)), new b() { // from class: it
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.w0((Cursor) obj);
            }
        });
    }

    public final <T> T L0(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.d.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.d.a() >= this.e.b() + a2) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public SQLiteDatabase M() {
        final vu vuVar = this.b;
        Objects.requireNonNull(vuVar);
        return (SQLiteDatabase) L0(new d() { // from class: hu
            @Override // defpackage.tu.d
            public final Object a() {
                return vu.this.getWritableDatabase();
            }
        }, new b() { // from class: ct
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                tu.c0((Throwable) obj);
                throw null;
            }
        });
    }

    public final lr O() {
        lr.a b2 = lr.b();
        or.a c2 = or.c();
        c2.b(J());
        c2.c(mu.a.f());
        b2.b(c2.a());
        return b2.a();
    }

    public final long P() {
        return M().compileStatement(C0059ao.a(3477)).simpleQueryForLong();
    }

    public final long Q() {
        return M().compileStatement(C0059ao.a(3478)).simpleQueryForLong();
    }

    public final pr R() {
        final long a2 = this.c.a();
        return (pr) T(new b() { // from class: nt
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.f0(a2, (SQLiteDatabase) obj);
            }
        });
    }

    public final Long S(SQLiteDatabase sQLiteDatabase, lq lqVar) {
        StringBuilder sb = new StringBuilder(C0059ao.a(3479));
        ArrayList arrayList = new ArrayList(Arrays.asList(lqVar.b(), String.valueOf(fv.a(lqVar.d()))));
        if (lqVar.c() != null) {
            sb.append(C0059ao.a(3480));
            arrayList.add(Base64.encodeToString(lqVar.c(), 0));
        } else {
            sb.append(C0059ao.a(3481));
        }
        return (Long) O0(sQLiteDatabase.query(C0059ao.a(3483), new String[]{C0059ao.a(3482)}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: st
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.g0((Cursor) obj);
            }
        });
    }

    public <T> T T(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase M = M();
        M.beginTransaction();
        try {
            T apply = bVar.apply(M);
            M.setTransactionSuccessful();
            return apply;
        } finally {
            M.endTransaction();
        }
    }

    public final boolean U() {
        return P() * Q() >= this.e.f();
    }

    public final List<su> V(List<su> list, Map<Long, Set<c>> map) {
        ListIterator<su> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            su next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                fq.a l = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l.c(cVar.a, cVar.b);
                }
                listIterator.set(su.a(next.c(), next.d(), l.d()));
            }
        }
        return list;
    }

    @Override // defpackage.yu
    public <T> T b(yu.a<T> aVar) {
        SQLiteDatabase M = M();
        w(M);
        try {
            T execute = aVar.execute();
            M.setTransactionSuccessful();
            return execute;
        } finally {
            M.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // defpackage.lu
    public int e() {
        final long a2 = this.c.a() - this.e.c();
        return ((Integer) T(new b() { // from class: yt
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.this.Z(a2, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // defpackage.lu
    public void f(Iterable<su> iterable) {
        if (iterable.iterator().hasNext()) {
            M().compileStatement(C0059ao.a(3484) + N0(iterable)).execute();
        }
    }

    @Override // defpackage.ku
    public kr j() {
        final kr.a e = kr.e();
        final HashMap hashMap = new HashMap();
        final String a2 = C0059ao.a(3485);
        return (kr) T(new b() { // from class: pt
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.this.q0(a2, hashMap, e, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // defpackage.ku
    public void k(final long j, final mr.b bVar, final String str) {
        T(new b() { // from class: kt
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.C0(str, bVar, j, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // defpackage.ku
    public void m() {
        T(new b() { // from class: rt
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.this.F0((SQLiteDatabase) obj);
            }
        });
    }

    @Override // defpackage.lu
    public Iterable<su> o(final lq lqVar) {
        return (Iterable) T(new b() { // from class: ft
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.this.m0(lqVar, (SQLiteDatabase) obj);
            }
        });
    }

    public final mr.b r(int i) {
        mr.b bVar = mr.b.REASON_UNKNOWN;
        if (i == bVar.getNumber()) {
            return bVar;
        }
        mr.b bVar2 = mr.b.MESSAGE_TOO_OLD;
        if (i == bVar2.getNumber()) {
            return bVar2;
        }
        mr.b bVar3 = mr.b.CACHE_FULL;
        if (i == bVar3.getNumber()) {
            return bVar3;
        }
        mr.b bVar4 = mr.b.PAYLOAD_TOO_BIG;
        if (i == bVar4.getNumber()) {
            return bVar4;
        }
        mr.b bVar5 = mr.b.MAX_RETRIES_REACHED;
        if (i == bVar5.getNumber()) {
            return bVar5;
        }
        mr.b bVar6 = mr.b.INVALID_PAYLOD;
        if (i == bVar6.getNumber()) {
            return bVar6;
        }
        mr.b bVar7 = mr.b.SERVER_ERROR;
        if (i == bVar7.getNumber()) {
            return bVar7;
        }
        qr.a(C0059ao.a(3486), C0059ao.a(3487), Integer.valueOf(i));
        return bVar;
    }

    @Override // defpackage.lu
    public void t(final lq lqVar, final long j) {
        T(new b() { // from class: ht
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.D0(j, lqVar, (SQLiteDatabase) obj);
            }
        });
    }

    public final void w(final SQLiteDatabase sQLiteDatabase) {
        L0(new d() { // from class: gt
            @Override // defpackage.tu.d
            public final Object a() {
                return tu.a0(sQLiteDatabase);
            }
        }, new b() { // from class: dt
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                tu.b0((Throwable) obj);
                throw null;
            }
        });
    }

    @Override // defpackage.lu
    public su x(final lq lqVar, final fq fqVar) {
        qr.b(C0059ao.a(3488), C0059ao.a(3489), lqVar.d(), fqVar.j(), lqVar.b());
        long longValue = ((Long) T(new b() { // from class: ut
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.this.v0(fqVar, lqVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return su.a(longValue, lqVar, fqVar);
    }

    @Override // defpackage.lu
    public Iterable<lq> y() {
        return (Iterable) T(new b() { // from class: zt
            @Override // defpackage.tu.b
            public final Object apply(Object obj) {
                return tu.j0((SQLiteDatabase) obj);
            }
        });
    }

    public final long z(SQLiteDatabase sQLiteDatabase, lq lqVar) {
        Long S = S(sQLiteDatabase, lqVar);
        if (S != null) {
            return S.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0059ao.a(3490), lqVar.b());
        contentValues.put(C0059ao.a(3491), Integer.valueOf(fv.a(lqVar.d())));
        contentValues.put(C0059ao.a(3492), (Integer) 0);
        if (lqVar.c() != null) {
            contentValues.put(C0059ao.a(3493), Base64.encodeToString(lqVar.c(), 0));
        }
        return sQLiteDatabase.insert(C0059ao.a(3494), null, contentValues);
    }
}
