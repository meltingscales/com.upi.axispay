package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import defpackage.oa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: la  reason: default package */
/* loaded from: classes.dex */
public class la {
    public static final Comparator<byte[]> a = new a();

    /* compiled from: AxisPay */
    /* renamed from: la$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length != bArr2.length) {
                i = bArr.length;
                i2 = bArr2.length;
            } else {
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        i = bArr[i3];
                        i2 = bArr2[i3];
                    }
                }
                return 0;
            }
            return i - i2;
        }
    }

    public static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static List<List<byte[]>> c(ma maVar, Resources resources) {
        if (maVar.b() != null) {
            return maVar.b();
        }
        return y8.c(resources, maVar.c());
    }

    public static oa.a d(Context context, ma maVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo e = e(context.getPackageManager(), maVar, context.getResources());
        if (e == null) {
            return oa.a.a(1, null);
        }
        return oa.a.a(0, f(context, maVar, e.authority, cancellationSignal));
    }

    public static ProviderInfo e(PackageManager packageManager, ma maVar, Resources resources) throws PackageManager.NameNotFoundException {
        String e = maVar.e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(maVar.f())) {
                List<byte[]> a2 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(a2, a);
                List<List<byte[]>> c = c(maVar, resources);
                for (int i = 0; i < c.size(); i++) {
                    ArrayList arrayList = new ArrayList(c.get(i));
                    Collections.sort(arrayList, a);
                    if (b(a2, arrayList)) {
                        return resolveContentProvider;
                    }
                }
                return null;
            }
            throw new PackageManager.NameNotFoundException(C0059ao.a(11497) + e + C0059ao.a(11498) + maVar.f());
        }
        throw new PackageManager.NameNotFoundException(C0059ao.a(11499) + e);
    }

    public static oa.b[] f(Context context, ma maVar, String str, CancellationSignal cancellationSignal) {
        int i;
        Uri withAppendedId;
        boolean z;
        int i2;
        ArrayList arrayList = new ArrayList();
        Uri.Builder builder = new Uri.Builder();
        String a2 = C0059ao.a(11500);
        Uri build = builder.scheme(a2).authority(str).build();
        Uri build2 = new Uri.Builder().scheme(a2).authority(str).appendPath(C0059ao.a(11501)).build();
        Cursor cursor = null;
        try {
            String[] strArr = {C0059ao.a(11502), C0059ao.a(11503), C0059ao.a(11504), C0059ao.a(11505), C0059ao.a(11506), C0059ao.a(11507), C0059ao.a(11508)};
            int i3 = 0;
            if (Build.VERSION.SDK_INT > 16) {
                cursor = context.getContentResolver().query(build, strArr, C0059ao.a(11509), new String[]{maVar.g()}, null, cancellationSignal);
            } else {
                cursor = context.getContentResolver().query(build, strArr, C0059ao.a(11510), new String[]{maVar.g()}, null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex(C0059ao.a(11511));
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex(C0059ao.a(11512));
                int columnIndex3 = cursor.getColumnIndex(C0059ao.a(11513));
                int columnIndex4 = cursor.getColumnIndex(C0059ao.a(11514));
                int columnIndex5 = cursor.getColumnIndex(C0059ao.a(11515));
                int columnIndex6 = cursor.getColumnIndex(C0059ao.a(11516));
                while (cursor.moveToNext()) {
                    int i4 = columnIndex != -1 ? cursor.getInt(columnIndex) : i3;
                    int i5 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : i3;
                    if (columnIndex3 == -1) {
                        i = i4;
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i = i4;
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    int i6 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        z = false;
                        i2 = i;
                    } else {
                        i2 = i;
                        z = true;
                    }
                    arrayList2.add(oa.b.a(withAppendedId, i5, i6, z, i2));
                    i3 = 0;
                }
                arrayList = arrayList2;
            }
            return (oa.b[]) arrayList.toArray(new oa.b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
