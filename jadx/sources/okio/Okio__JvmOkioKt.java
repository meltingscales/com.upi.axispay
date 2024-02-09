package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import myunmn.C0059ao;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final /* synthetic */ class Okio__JvmOkioKt {
    private static final Logger logger = Logger.getLogger(C0059ao.a(3839));

    public static final Sink appendingSink(File file) throws FileNotFoundException {
        yl0.e(file, C0059ao.a(3840));
        return Okio.sink(new FileOutputStream(file, true));
    }

    public static final CipherSink cipherSink(Sink sink, Cipher cipher) {
        yl0.e(sink, C0059ao.a(3841));
        yl0.e(cipher, C0059ao.a(3842));
        return new CipherSink(Okio.buffer(sink), cipher);
    }

    public static final CipherSource cipherSource(Source source, Cipher cipher) {
        yl0.e(source, C0059ao.a(3843));
        yl0.e(cipher, C0059ao.a(3844));
        return new CipherSource(Okio.buffer(source), cipher);
    }

    public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
        yl0.e(assertionError, C0059ao.a(3845));
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            return message != null ? co0.B(message, C0059ao.a(3846), false, 2, null) : false;
        }
        return false;
    }

    public static final Sink sink(File file) throws FileNotFoundException {
        return sink$default(file, false, 1, null);
    }

    public static final Sink sink(OutputStream outputStream) {
        yl0.e(outputStream, C0059ao.a(3848));
        return new OutputStreamSink(outputStream, new Timeout());
    }

    public static /* synthetic */ Sink sink$default(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return Okio.sink(file, z);
    }

    public static final Source source(InputStream inputStream) {
        yl0.e(inputStream, C0059ao.a(3855));
        return new InputStreamSource(inputStream, new Timeout());
    }

    public static final Sink sink(Socket socket) throws IOException {
        yl0.e(socket, C0059ao.a(3849));
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        yl0.d(outputStream, C0059ao.a(3850));
        return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    public static final Source source(Socket socket) throws IOException {
        yl0.e(socket, C0059ao.a(3856));
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        yl0.d(inputStream, C0059ao.a(3857));
        return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
    }

    public static final Sink sink(File file, boolean z) throws FileNotFoundException {
        yl0.e(file, C0059ao.a(3847));
        return Okio.sink(new FileOutputStream(file, z));
    }

    public static final Source source(File file) throws FileNotFoundException {
        yl0.e(file, C0059ao.a(3854));
        return Okio.source(new FileInputStream(file));
    }

    @IgnoreJRERequirement
    public static final Sink sink(Path path, OpenOption... openOptionArr) throws IOException {
        yl0.e(path, C0059ao.a(3851));
        yl0.e(openOptionArr, C0059ao.a(3852));
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        yl0.d(newOutputStream, C0059ao.a(3853));
        return Okio.sink(newOutputStream);
    }

    @IgnoreJRERequirement
    public static final Source source(Path path, OpenOption... openOptionArr) throws IOException {
        yl0.e(path, C0059ao.a(3858));
        yl0.e(openOptionArr, C0059ao.a(3859));
        InputStream newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        yl0.d(newInputStream, C0059ao.a(3860));
        return Okio.source(newInputStream);
    }
}
