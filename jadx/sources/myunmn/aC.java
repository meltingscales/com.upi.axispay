package myunmn;

/* loaded from: classes.dex */
public class aC extends Thread {
    public final /* synthetic */ RunnableC0094y a;

    public aC(RunnableC0094y runnableC0094y) {
        this.a = runnableC0094y;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean z;
        while (true) {
            z = this.a.a.f;
            if (!z) {
                break;
            } else if (this.a.a.getWindowToken() != null) {
                this.a.a.n();
                break;
            } else {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
            }
        }
        this.a.a.f = false;
    }
}
