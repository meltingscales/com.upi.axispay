package defpackage;

import android.database.sqlite.SQLiteStatement;

/* compiled from: AxisPay */
/* renamed from: km  reason: default package */
/* loaded from: classes.dex */
public class km extends jm implements fm {
    public final SQLiteStatement c;

    public km(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.c = sQLiteStatement;
    }

    @Override // defpackage.fm
    public long L() {
        return this.c.executeInsert();
    }

    @Override // defpackage.fm
    public int l() {
        return this.c.executeUpdateDelete();
    }
}
