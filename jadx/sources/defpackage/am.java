package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;

/* compiled from: AxisPay */
/* renamed from: am  reason: default package */
/* loaded from: classes.dex */
public final class am {
    public static List<Uri> a(Cursor cursor) {
        return cursor.getNotificationUris();
    }

    public static void b(Cursor cursor, ContentResolver contentResolver, List<Uri> list) {
        cursor.setNotificationUris(contentResolver, list);
    }
}
