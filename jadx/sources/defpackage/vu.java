package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: vu  reason: default package */
/* loaded from: classes.dex */
public final class vu extends SQLiteOpenHelper {
    public static final String d = C0059ao.a(5243) + System.currentTimeMillis() + C0059ao.a(5244);
    public static int e = 5;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final List<a> k;
    public final int b;
    public boolean c;

    /* compiled from: AxisPay */
    /* renamed from: vu$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        eu euVar = new a() { // from class: eu
            @Override // defpackage.vu.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                vu.j(sQLiteDatabase);
            }
        };
        f = euVar;
        bu buVar = new a() { // from class: bu
            @Override // defpackage.vu.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                vu.k(sQLiteDatabase);
            }
        };
        g = buVar;
        cu cuVar = new a() { // from class: cu
            @Override // defpackage.vu.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL(C0059ao.a(5253));
            }
        };
        h = cuVar;
        du duVar = new a() { // from class: du
            @Override // defpackage.vu.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                vu.r(sQLiteDatabase);
            }
        };
        i = duVar;
        fu fuVar = new a() { // from class: fu
            @Override // defpackage.vu.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                vu.w(sQLiteDatabase);
            }
        };
        j = fuVar;
        k = Arrays.asList(euVar, buVar, cuVar, duVar, fuVar);
    }

    public vu(Context context, String str, int i2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
        this.c = false;
        this.b = i2;
    }

    public static /* synthetic */ void j(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(C0059ao.a(5245));
        sQLiteDatabase.execSQL(C0059ao.a(5246));
        sQLiteDatabase.execSQL(C0059ao.a(5247));
        sQLiteDatabase.execSQL(C0059ao.a(5248));
        sQLiteDatabase.execSQL(C0059ao.a(5249));
    }

    public static /* synthetic */ void k(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(C0059ao.a(5250));
        sQLiteDatabase.execSQL(C0059ao.a(5251));
        sQLiteDatabase.execSQL(C0059ao.a(5252));
    }

    public static /* synthetic */ void r(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(C0059ao.a(5254));
        sQLiteDatabase.execSQL(C0059ao.a(5255));
        sQLiteDatabase.execSQL(C0059ao.a(5256));
    }

    public static /* synthetic */ void w(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(C0059ao.a(5257));
        sQLiteDatabase.execSQL(C0059ao.a(5258));
        sQLiteDatabase.execSQL(C0059ao.a(5259));
        sQLiteDatabase.execSQL(d);
    }

    public final void J(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        List<a> list = k;
        if (i3 <= list.size()) {
            while (i2 < i3) {
                k.get(i2).a(sQLiteDatabase);
                i2++;
            }
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(5260) + i2 + C0059ao.a(5261) + i3 + C0059ao.a(5262) + list.size() + C0059ao.a(5263));
    }

    public final void b(SQLiteDatabase sQLiteDatabase) {
        if (this.c) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.c = true;
        sQLiteDatabase.rawQuery(C0059ao.a(5264), new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        z(sQLiteDatabase, this.b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL(C0059ao.a(5265));
        sQLiteDatabase.execSQL(C0059ao.a(5266));
        sQLiteDatabase.execSQL(C0059ao.a(5267));
        sQLiteDatabase.execSQL(C0059ao.a(5268));
        sQLiteDatabase.execSQL(C0059ao.a(5269));
        sQLiteDatabase.execSQL(C0059ao.a(5270));
        z(sQLiteDatabase, i3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        b(sQLiteDatabase);
        J(sQLiteDatabase, i2, i3);
    }

    public final void z(SQLiteDatabase sQLiteDatabase, int i2) {
        b(sQLiteDatabase);
        J(sQLiteDatabase, 0, i2);
    }
}
