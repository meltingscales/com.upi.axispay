package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ll  reason: default package */
/* loaded from: classes.dex */
public class ll {
    public static final Map<String, Lock> e = new HashMap();
    public final File a;
    public final Lock b;
    public final boolean c;
    public FileChannel d;

    public ll(String str, File file, boolean z) {
        File file2 = new File(file, str + C0059ao.a(12404));
        this.a = file2;
        this.b = a(file2.getAbsolutePath());
        this.c = z;
    }

    public static Lock a(String str) {
        Lock lock;
        Map<String, Lock> map = e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    public void b() {
        this.b.lock();
        if (this.c) {
            try {
                FileChannel channel = new FileOutputStream(this.a).getChannel();
                this.d = channel;
                channel.lock();
            } catch (IOException e2) {
                throw new IllegalStateException(C0059ao.a(12405), e2);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.b.unlock();
    }
}
