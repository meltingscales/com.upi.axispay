package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class SocketAsyncTimeout extends AsyncTimeout {
    private final Socket socket;

    public SocketAsyncTimeout(Socket socket) {
        yl0.e(socket, C0059ao.a(4490));
        this.socket = socket;
    }

    @Override // okio.AsyncTimeout
    public IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(C0059ao.a(4491));
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.AsyncTimeout
    public void timedOut() {
        Logger logger;
        Logger logger2;
        String a = C0059ao.a(4492);
        try {
            this.socket.close();
        } catch (AssertionError e) {
            if (Okio.isAndroidGetsocknameError(e)) {
                logger2 = Okio__JvmOkioKt.logger;
                Level level = Level.WARNING;
                logger2.log(level, a + this.socket, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            logger = Okio__JvmOkioKt.logger;
            Level level2 = Level.WARNING;
            logger.log(level2, a + this.socket, (Throwable) e2);
        }
    }
}
