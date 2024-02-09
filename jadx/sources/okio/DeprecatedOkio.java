package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: okio.-DeprecatedOkio  reason: invalid class name */
/* loaded from: classes2.dex */
public final class DeprecatedOkio {
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    public final Sink appendingSink(File file) {
        yl0.e(file, C0059ao.a(1818));
        return Okio.appendingSink(file);
    }

    public final Sink blackhole() {
        return Okio.blackhole();
    }

    public final BufferedSink buffer(Sink sink) {
        yl0.e(sink, C0059ao.a(1819));
        return Okio.buffer(sink);
    }

    public final Sink sink(File file) {
        yl0.e(file, C0059ao.a(1821));
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    public final Source source(File file) {
        yl0.e(file, C0059ao.a(1826));
        return Okio.source(file);
    }

    public final BufferedSource buffer(Source source) {
        yl0.e(source, C0059ao.a(1820));
        return Okio.buffer(source);
    }

    public final Sink sink(OutputStream outputStream) {
        yl0.e(outputStream, C0059ao.a(1822));
        return Okio.sink(outputStream);
    }

    public final Source source(InputStream inputStream) {
        yl0.e(inputStream, C0059ao.a(1827));
        return Okio.source(inputStream);
    }

    public final Sink sink(Path path, OpenOption... openOptionArr) {
        yl0.e(path, C0059ao.a(1824));
        yl0.e(openOptionArr, C0059ao.a(1825));
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    public final Source source(Path path, OpenOption... openOptionArr) {
        yl0.e(path, C0059ao.a(1829));
        yl0.e(openOptionArr, C0059ao.a(1830));
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    public final Sink sink(Socket socket) {
        yl0.e(socket, C0059ao.a(1823));
        return Okio.sink(socket);
    }

    public final Source source(Socket socket) {
        yl0.e(socket, C0059ao.a(1828));
        return Okio.source(socket);
    }
}
