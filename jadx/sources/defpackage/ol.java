package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.vision.barcode.Barcode;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* compiled from: AxisPay */
/* renamed from: ol  reason: default package */
/* loaded from: classes.dex */
public class ol {
    @SuppressLint({"LambdaLast"})
    public static void a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) throws IOException {
        try {
            if (Build.VERSION.SDK_INT > 23) {
                fileChannel.transferFrom(readableByteChannel, 0L, RecyclerView.FOREVER_NS);
            } else {
                InputStream newInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream newOutputStream = Channels.newOutputStream(fileChannel);
                byte[] bArr = new byte[Barcode.AZTEC];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    newOutputStream.write(bArr, 0, read);
                }
            }
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
