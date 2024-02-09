package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: nl  reason: default package */
/* loaded from: classes.dex */
public class nl {
    public static void a(bm bmVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor N = bmVar.N(C0059ao.a(13884));
        while (N.moveToNext()) {
            try {
                arrayList.add(N.getString(0));
            } catch (Throwable th) {
                N.close();
                throw th;
            }
        }
        N.close();
        for (String str : arrayList) {
            if (str.startsWith(C0059ao.a(13885))) {
                bmVar.i(C0059ao.a(13886) + str);
            }
        }
    }

    public static Cursor b(bl blVar, em emVar, boolean z, CancellationSignal cancellationSignal) {
        Cursor z2 = blVar.z(emVar, cancellationSignal);
        if (z && (z2 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) z2;
            int count = abstractWindowedCursor.getCount();
            return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? ml.a(abstractWindowedCursor) : z2;
        }
        return z2;
    }

    public static int c(File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i = allocate.getInt();
                if (channel != null) {
                    channel.close();
                }
                return i;
            }
            throw new IOException(C0059ao.a(13887));
        } catch (Throwable th) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th;
        }
    }
}
