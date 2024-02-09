package defpackage;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import java.util.Arrays;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ml  reason: default package */
/* loaded from: classes.dex */
public class ml {
    public static Cursor a(Cursor cursor) {
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                for (int i = 0; i < cursor.getColumnCount(); i++) {
                    int type = cursor.getType(i);
                    if (type == 0) {
                        objArr[i] = null;
                    } else if (type == 1) {
                        objArr[i] = Long.valueOf(cursor.getLong(i));
                    } else if (type == 2) {
                        objArr[i] = Double.valueOf(cursor.getDouble(i));
                    } else if (type == 3) {
                        objArr[i] = cursor.getString(i);
                    } else if (type == 4) {
                        objArr[i] = cursor.getBlob(i);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                matrixCursor.addRow(objArr);
            }
            return matrixCursor;
        } finally {
            cursor.close();
        }
    }

    public static int b(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            return c(cursor.getColumnNames(), str);
        }
        return -1;
    }

    public static int c(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        String a = C0059ao.a(12984);
        sb.append(a);
        sb.append(str);
        String sb2 = sb.toString();
        String str2 = a + str + C0059ao.a(12985);
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (str3.length() >= str.length() + 2) {
                if (str3.endsWith(sb2)) {
                    return i;
                }
                if (str3.charAt(0) == '`' && str3.endsWith(str2)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int d(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        StringBuilder sb = new StringBuilder();
        String a = C0059ao.a(12986);
        sb.append(a);
        sb.append(str);
        sb.append(a);
        int columnIndex2 = cursor.getColumnIndex(sb.toString());
        return columnIndex2 >= 0 ? columnIndex2 : b(cursor, str);
    }

    public static int e(Cursor cursor, String str) {
        String a;
        int d = d(cursor, str);
        if (d >= 0) {
            return d;
        }
        try {
            a = Arrays.toString(cursor.getColumnNames());
        } catch (Exception unused) {
            a = C0059ao.a(12987);
        }
        throw new IllegalArgumentException(C0059ao.a(12988) + str + C0059ao.a(12989) + a);
    }
}
