package myunmn;

/* renamed from: myunmn.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0044a extends Thread {
    public final /* synthetic */ RunnableC0085p a;

    public C0044a(RunnableC0085p runnableC0085p) {
        this.a = runnableC0085p;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean z;
        while (true) {
            z = this.a.a.k;
            if (!z) {
                break;
            } else if (this.a.a.getWindowToken() != null) {
                this.a.a.w();
                break;
            } else {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
            }
        }
        this.a.a.k = false;
    }
}
