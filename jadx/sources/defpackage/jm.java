package defpackage;

import android.database.sqlite.SQLiteProgram;

/* compiled from: AxisPay */
/* renamed from: jm  reason: default package */
/* loaded from: classes.dex */
public class jm implements dm {
    public final SQLiteProgram b;

    public jm(SQLiteProgram sQLiteProgram) {
        this.b = sQLiteProgram;
    }

    @Override // defpackage.dm
    public void C(int i, long j) {
        this.b.bindLong(i, j);
    }

    @Override // defpackage.dm
    public void H(int i, byte[] bArr) {
        this.b.bindBlob(i, bArr);
    }

    @Override // defpackage.dm
    public void a(int i, String str) {
        this.b.bindString(i, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // defpackage.dm
    public void q(int i) {
        this.b.bindNull(i);
    }

    @Override // defpackage.dm
    public void s(int i, double d) {
        this.b.bindDouble(i, d);
    }
}
