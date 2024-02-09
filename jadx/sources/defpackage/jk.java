package defpackage;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import defpackage.jk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: jk  reason: default package */
/* loaded from: classes.dex */
public final class jk implements cm, mk {
    public final cm b;
    public final a c;
    public final ik d;

    /* compiled from: AxisPay */
    /* renamed from: jk$a */
    /* loaded from: classes.dex */
    public static final class a implements bm {
        public final ik b;

        public a(ik ikVar) {
            this.b = ikVar;
        }

        public static /* synthetic */ Object b(String str, bm bmVar) {
            bmVar.i(str);
            return null;
        }

        public static /* synthetic */ Boolean j(bm bmVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                return Boolean.valueOf(bmVar.B());
            }
            return Boolean.FALSE;
        }

        public static /* synthetic */ Object k(bm bmVar) {
            return null;
        }

        public static /* synthetic */ Object m(int i, bm bmVar) {
            bmVar.h(i);
            return null;
        }

        @Override // defpackage.bm
        public boolean B() {
            return ((Boolean) this.b.c(new b4() { // from class: nj
                @Override // defpackage.b4
                public final Object apply(Object obj) {
                    return jk.a.j((bm) obj);
                }
            })).booleanValue();
        }

        @Override // defpackage.bm
        public void D() {
            bm d = this.b.d();
            if (d != null) {
                d.D();
                return;
            }
            throw new IllegalStateException(C0059ao.a(1377));
        }

        @Override // defpackage.bm
        public void F() {
            try {
                this.b.e().F();
            } catch (Throwable th) {
                this.b.b();
                throw th;
            }
        }

        @Override // defpackage.bm
        public Cursor N(String str) {
            try {
                return new c(this.b.e().N(str), this.b);
            } catch (Throwable th) {
                this.b.b();
                throw th;
            }
        }

        @Override // defpackage.bm
        public void c() {
            if (this.b.d() != null) {
                try {
                    this.b.d().c();
                    return;
                } finally {
                    this.b.b();
                }
            }
            throw new IllegalStateException(C0059ao.a(1378));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.b.a();
        }

        @Override // defpackage.bm
        public void d() {
            try {
                this.b.e().d();
            } catch (Throwable th) {
                this.b.b();
                throw th;
            }
        }

        @Override // defpackage.bm
        public List<Pair<String, String>> g() {
            return (List) this.b.c(new b4() { // from class: fk
                @Override // defpackage.b4
                public final Object apply(Object obj) {
                    return ((bm) obj).g();
                }
            });
        }

        @Override // defpackage.bm
        public String getPath() {
            return (String) this.b.c(new b4() { // from class: lj
                @Override // defpackage.b4
                public final Object apply(Object obj) {
                    return ((bm) obj).getPath();
                }
            });
        }

        @Override // defpackage.bm
        public void h(final int i) {
            this.b.c(new b4() { // from class: pj
                @Override // defpackage.b4
                public final Object apply(Object obj) {
                    return jk.a.m(i, (bm) obj);
                }
            });
        }

        @Override // defpackage.bm
        public void i(final String str) throws SQLException {
            this.b.c(new b4() { // from class: mj
                @Override // defpackage.b4
                public final Object apply(Object obj) {
                    return jk.a.b(str, (bm) obj);
                }
            });
        }

        @Override // defpackage.bm
        public boolean isOpen() {
            bm d = this.b.d();
            if (d == null) {
                return false;
            }
            return d.isOpen();
        }

        @Override // defpackage.bm
        public fm n(String str) {
            return new b(str, this.b);
        }

        @Override // defpackage.bm
        public Cursor p(em emVar) {
            try {
                return new c(this.b.e().p(emVar), this.b);
            } catch (Throwable th) {
                this.b.b();
                throw th;
            }
        }

        public void r() {
            this.b.c(new b4() { // from class: oj
                @Override // defpackage.b4
                public final Object apply(Object obj) {
                    return jk.a.k((bm) obj);
                }
            });
        }

        @Override // defpackage.bm
        public Cursor u(em emVar, CancellationSignal cancellationSignal) {
            try {
                return new c(this.b.e().u(emVar, cancellationSignal), this.b);
            } catch (Throwable th) {
                this.b.b();
                throw th;
            }
        }

        @Override // defpackage.bm
        public boolean v() {
            if (this.b.d() == null) {
                return false;
            }
            return ((Boolean) this.b.c(new b4() { // from class: rj
                @Override // defpackage.b4
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((bm) obj).v());
                }
            })).booleanValue();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: jk$b */
    /* loaded from: classes.dex */
    public static class b implements fm {
        public final String b;
        public final ArrayList<Object> c = new ArrayList<>();
        public final ik d;

        public b(String str, ik ikVar) {
            this.b = str;
            this.d = ikVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ Object m(b4 b4Var, bm bmVar) {
            fm n = bmVar.n(this.b);
            b(n);
            return b4Var.apply(n);
        }

        @Override // defpackage.dm
        public void C(int i, long j) {
            r(i, Long.valueOf(j));
        }

        @Override // defpackage.dm
        public void H(int i, byte[] bArr) {
            r(i, bArr);
        }

        @Override // defpackage.fm
        public long L() {
            return ((Long) j(new b4() { // from class: ek
                @Override // defpackage.b4
                public final Object apply(Object obj) {
                    return Long.valueOf(((fm) obj).L());
                }
            })).longValue();
        }

        @Override // defpackage.dm
        public void a(int i, String str) {
            r(i, str);
        }

        public final void b(fm fmVar) {
            int i = 0;
            while (i < this.c.size()) {
                int i2 = i + 1;
                Object obj = this.c.get(i);
                if (obj == null) {
                    fmVar.q(i2);
                } else if (obj instanceof Long) {
                    fmVar.C(i2, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    fmVar.s(i2, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    fmVar.a(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    fmVar.H(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final <T> T j(final b4<fm, T> b4Var) {
            return (T) this.d.c(new b4() { // from class: qj
                @Override // defpackage.b4
                public final Object apply(Object obj) {
                    return jk.b.this.m(b4Var, (bm) obj);
                }
            });
        }

        @Override // defpackage.fm
        public int l() {
            return ((Integer) j(new b4() { // from class: hk
                @Override // defpackage.b4
                public final Object apply(Object obj) {
                    return Integer.valueOf(((fm) obj).l());
                }
            })).intValue();
        }

        @Override // defpackage.dm
        public void q(int i) {
            r(i, null);
        }

        public final void r(int i, Object obj) {
            int i2 = i - 1;
            if (i2 >= this.c.size()) {
                for (int size = this.c.size(); size <= i2; size++) {
                    this.c.add(null);
                }
            }
            this.c.set(i2, obj);
        }

        @Override // defpackage.dm
        public void s(int i, double d) {
            r(i, Double.valueOf(d));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: jk$c */
    /* loaded from: classes.dex */
    public static final class c implements Cursor {
        public final Cursor b;
        public final ik c;

        public c(Cursor cursor, ik ikVar) {
            this.b = cursor;
            this.c = ikVar;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.b.close();
            this.c.b();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.b.copyStringToBuffer(i, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @Deprecated
        public void deactivate() {
            this.b.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i) {
            return this.b.getBlob(i);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.b.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.b.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
            return this.b.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i) {
            return this.b.getColumnName(i);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.b.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.b.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i) {
            return this.b.getDouble(i);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.b.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i) {
            return this.b.getFloat(i);
        }

        @Override // android.database.Cursor
        public int getInt(int i) {
            return this.b.getInt(i);
        }

        @Override // android.database.Cursor
        public long getLong(int i) {
            return this.b.getLong(i);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return xl.a(this.b);
        }

        @Override // android.database.Cursor
        public List<Uri> getNotificationUris() {
            return am.a(this.b);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.b.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i) {
            return this.b.getShort(i);
        }

        @Override // android.database.Cursor
        public String getString(int i) {
            return this.b.getString(i);
        }

        @Override // android.database.Cursor
        public int getType(int i) {
            return this.b.getType(i);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.b.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.b.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.b.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.b.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.b.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.b.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i) {
            return this.b.isNull(i);
        }

        @Override // android.database.Cursor
        public boolean move(int i) {
            return this.b.move(i);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.b.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.b.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.b.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i) {
            return this.b.moveToPosition(i);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.b.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.b.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.b.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @Deprecated
        public boolean requery() {
            return this.b.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.b.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
            zl.a(this.b, bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.b.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver contentResolver, List<Uri> list) {
            am.b(this.b, contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.b.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.b.unregisterDataSetObserver(dataSetObserver);
        }
    }

    static {
        C0095z.a();
    }

    public jk(cm cmVar, ik ikVar) {
        this.b = cmVar;
        this.d = ikVar;
        ikVar.f(cmVar);
        this.c = new a(ikVar);
    }

    @Override // defpackage.cm
    public bm G() {
        this.c.r();
        return this.c;
    }

    @Override // defpackage.cm
    public bm K() {
        this.c.r();
        return this.c;
    }

    public ik b() {
        return this.d;
    }

    @Override // defpackage.cm, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.c.close();
        } catch (IOException e) {
            pl.a(e);
            throw null;
        }
    }

    @Override // defpackage.cm
    public String getDatabaseName() {
        return this.b.getDatabaseName();
    }

    @Override // defpackage.mk
    public cm getDelegate() {
        return this.b;
    }

    @Override // defpackage.cm
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.b.setWriteAheadLoggingEnabled(z);
    }
}
