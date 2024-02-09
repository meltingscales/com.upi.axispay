package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import defpackage.n80;
import defpackage.s80;
import java.io.IOException;
import java.io.InputStream;
import myunmn.C0059ao;
import okio.Okio;

/* compiled from: AxisPay */
/* renamed from: z70  reason: default package */
/* loaded from: classes.dex */
public class z70 extends s80 {
    public static final UriMatcher b;
    public final Context a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        b = uriMatcher;
        String a = C0059ao.a(111);
        uriMatcher.addURI(a, C0059ao.a(112), 1);
        uriMatcher.addURI(a, C0059ao.a(113), 1);
        uriMatcher.addURI(a, C0059ao.a(114), 2);
        uriMatcher.addURI(a, C0059ao.a(115), 3);
        uriMatcher.addURI(a, C0059ao.a(116), 4);
    }

    public z70(Context context) {
        this.a = context;
    }

    @Override // defpackage.s80
    public boolean c(q80 q80Var) {
        Uri uri = q80Var.d;
        return C0059ao.a(117).equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && b.match(q80Var.d) != -1;
    }

    @Override // defpackage.s80
    public s80.a f(q80 q80Var, int i) throws IOException {
        InputStream j = j(q80Var);
        if (j == null) {
            return null;
        }
        return new s80.a(Okio.source(j), n80.e.DISK);
    }

    public final InputStream j(q80 q80Var) throws IOException {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri uri = q80Var.d;
        int match = b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException(C0059ao.a(118) + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
