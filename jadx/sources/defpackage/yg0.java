package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.Toast;
import com.upi.axispay.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: yg0  reason: default package */
/* loaded from: classes.dex */
public final class yg0 {
    public static final yg0 a = new yg0();

    public static final void b(Activity activity, Bitmap bitmap) {
        yl0.e(activity, C0059ao.a(1614));
        yl0.e(bitmap, C0059ao.a(1615));
        a.a(activity, bitmap);
    }

    public static final String c(Context context, Bitmap bitmap) {
        yl0.e(context, C0059ao.a(1616));
        yl0.e(bitmap, C0059ao.a(1617));
        Intent type = new Intent(C0059ao.a(1618)).setType(C0059ao.a(1619));
        yl0.d(type, C0059ao.a(1620));
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, new ByteArrayOutputStream());
        String insertImage = MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, yl0.l(C0059ao.a(1621), Calendar.getInstance().getTime()), C0059ao.a(1622));
        if (insertImage != null) {
            type.putExtra(C0059ao.a(1623), Uri.parse(insertImage));
            context.startActivity(type);
        }
        return insertImage;
    }

    public final void a(Activity activity, Bitmap bitmap) {
        FileOutputStream fileOutputStream;
        String str = System.currentTimeMillis() + C0059ao.a(1624);
        if (Build.VERSION.SDK_INT >= 29) {
            ContentResolver contentResolver = activity.getContentResolver();
            if (contentResolver == null) {
                fileOutputStream = null;
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C0059ao.a(1625), str);
                contentValues.put(C0059ao.a(1626), C0059ao.a(1627));
                contentValues.put(C0059ao.a(1628), Environment.DIRECTORY_PICTURES);
                Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                fileOutputStream = insert == null ? null : contentResolver.openOutputStream(insert);
                Toast.makeText(activity, activity.getString(R.string.download1) + ' ' + ((Object) Environment.DIRECTORY_PICTURES) + ' ' + str, 1).show();
            }
        } else {
            fileOutputStream = new FileOutputStream(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), str));
        }
        if (fileOutputStream == null) {
            return;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            pk0.a(fileOutputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                pk0.a(fileOutputStream, th);
                throw th2;
            }
        }
    }
}
