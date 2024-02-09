package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* compiled from: AxisPay */
/* renamed from: bm  reason: default package */
/* loaded from: classes.dex */
public interface bm extends Closeable {
    boolean B();

    void D();

    void F();

    Cursor N(String str);

    void c();

    void d();

    List<Pair<String, String>> g();

    String getPath();

    void h(int i);

    void i(String str) throws SQLException;

    boolean isOpen();

    fm n(String str);

    Cursor p(em emVar);

    Cursor u(em emVar, CancellationSignal cancellationSignal);

    boolean v();
}
