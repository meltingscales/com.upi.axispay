package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class ab extends ContentFetcher<String> {
    public ab(Context context) {
        super(context, C0059ao.a(13714), 500L, C0059ao.a(13713));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.ContentFetcher
    /* renamed from: ι  reason: contains not printable characters */
    public String query() {
        Cursor cursor;
        Throwable th;
        try {
            String a = C0059ao.a(13715);
            ContentResolver contentResolver = this.context.getContentResolver();
            StringBuilder sb = new StringBuilder(C0059ao.a(13716));
            sb.append(this.authority);
            cursor = contentResolver.query(Uri.parse(sb.toString()), new String[]{a}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndex(a));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
        }
    }

    @Override // com.appsflyer.internal.ContentFetcher
    public final /* synthetic */ String get() {
        start();
        return (String) super.get();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m141() {
        start();
        return (String) super.get();
    }
}
