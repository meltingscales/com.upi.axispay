package okhttp3.internal.cache;

import java.io.IOException;
import myunmn.C0059ao;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class FaultHidingSink extends ForwardingSink {
    private boolean hasErrors;
    private final dl0<IOException, pi0> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(Sink sink, dl0<? super IOException, pi0> dl0Var) {
        super(sink);
        yl0.e(sink, C0059ao.a(9054));
        yl0.e(dl0Var, C0059ao.a(9055));
        this.onException = dl0Var;
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    public final dl0<IOException, pi0> getOnException() {
        return this.onException;
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(Buffer buffer, long j) {
        yl0.e(buffer, C0059ao.a(9056));
        if (this.hasErrors) {
            buffer.skip(j);
            return;
        }
        try {
            super.write(buffer, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
