package org.npci.upi.security.pinactivitycomponent;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class e extends SQLiteOpenHelper {
    public e(Context context) {
        super(context, C0059ao.a(2407), (SQLiteDatabase.CursorFactory) null, 1);
    }

    public String b(String str, String str2, String str3) {
        List<s> j = j();
        if (j == null || j.isEmpty()) {
            return null;
        }
        return j.get(0).a();
    }

    public List<s> j() {
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = getWritableDatabase().rawQuery(C0059ao.a(2408), null);
        if (rawQuery.moveToFirst()) {
            do {
                s sVar = new s();
                sVar.b(rawQuery.getString(1));
                sVar.d(rawQuery.getString(2));
                sVar.f(rawQuery.getString(3));
                arrayList.add(sVar);
            } while (rawQuery.moveToNext());
            return arrayList;
        }
        return arrayList;
    }

    public void k(s sVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        SQLiteStatement compileStatement = writableDatabase.compileStatement(C0059ao.a(2409));
        compileStatement.bindString(1, sVar.a());
        compileStatement.bindString(2, sVar.c());
        compileStatement.bindString(3, sVar.e());
        compileStatement.executeInsert();
        writableDatabase.close();
    }

    public int m(s sVar) {
        SQLiteStatement compileStatement = getWritableDatabase().compileStatement(C0059ao.a(2410));
        compileStatement.bindString(1, sVar.a());
        compileStatement.bindString(2, sVar.c());
        compileStatement.bindString(3, sVar.e());
        return compileStatement.executeUpdateDelete();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(C0059ao.a(2411)).execute();
        Log.e(C0059ao.a(2412), C0059ao.a(2413));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL(C0059ao.a(2414));
        onCreate(sQLiteDatabase);
    }

    public String r() {
        List<s> j = j();
        return (j == null || j.isEmpty()) ? C0059ao.a(2415) : j.get(0).c();
    }

    public void w() {
        l.c(C0059ao.a(2416), C0059ao.a(2417));
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.execSQL(C0059ao.a(2418));
        writableDatabase.close();
    }
}
