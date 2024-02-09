package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.android.gms.vision.barcode.Barcode;
import defpackage.n80;
import defpackage.s80;
import java.io.IOException;
import myunmn.C0059ao;
import okio.Okio;

/* compiled from: AxisPay */
/* renamed from: i80  reason: default package */
/* loaded from: classes.dex */
public class i80 extends a80 {
    public static final String[] b = {C0059ao.a(2447)};

    /* compiled from: AxisPay */
    /* renamed from: i80$a */
    /* loaded from: classes.dex */
    public enum a {
        MICRO(3, 96, 96),
        MINI(1, Barcode.UPC_A, 384),
        FULL(2, -1, -1);
        
        public final int b;
        public final int c;
        public final int d;

        a(int i, int i2, int i3) {
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public i80(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int k(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String[] r4 = defpackage.i80.b     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L2d
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L2d
            if (r1 == 0) goto L20
            boolean r8 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L2d
            if (r8 != 0) goto L16
            goto L20
        L16:
            int r8 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L2d
            if (r1 == 0) goto L1f
            r1.close()
        L1f:
            return r8
        L20:
            if (r1 == 0) goto L25
            r1.close()
        L25:
            return r0
        L26:
            r8 = move-exception
            if (r1 == 0) goto L2c
            r1.close()
        L2c:
            throw r8
        L2d:
            if (r1 == 0) goto L32
            r1.close()
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i80.k(android.content.ContentResolver, android.net.Uri):int");
    }

    public static a l(int i, int i2) {
        a aVar = a.MICRO;
        if (i > aVar.c || i2 > aVar.d) {
            a aVar2 = a.MINI;
            return (i > aVar2.c || i2 > aVar2.d) ? a.FULL : aVar2;
        }
        return aVar;
    }

    @Override // defpackage.a80, defpackage.s80
    public boolean c(q80 q80Var) {
        Uri uri = q80Var.d;
        if (C0059ao.a(2448).equals(uri.getScheme())) {
            if (C0059ao.a(2449).equals(uri.getAuthority())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.a80, defpackage.s80
    public s80.a f(q80 q80Var, int i) throws IOException {
        Bitmap thumbnail;
        ContentResolver contentResolver = this.a.getContentResolver();
        int k = k(contentResolver, q80Var.d);
        String type = contentResolver.getType(q80Var.d);
        boolean z = type != null && type.startsWith(C0059ao.a(2450));
        if (q80Var.c()) {
            a l = l(q80Var.h, q80Var.i);
            if (!z && l == a.FULL) {
                return new s80.a(null, Okio.source(j(q80Var)), n80.e.DISK, k);
            }
            long parseId = ContentUris.parseId(q80Var.d);
            BitmapFactory.Options d = s80.d(q80Var);
            d.inJustDecodeBounds = true;
            s80.a(q80Var.h, q80Var.i, l.c, l.d, d, q80Var);
            if (z) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, l == a.FULL ? 1 : l.b, d);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, l.b, d);
            }
            if (thumbnail != null) {
                return new s80.a(thumbnail, null, n80.e.DISK, k);
            }
        }
        return new s80.a(null, Okio.source(j(q80Var)), n80.e.DISK, k);
    }
}
