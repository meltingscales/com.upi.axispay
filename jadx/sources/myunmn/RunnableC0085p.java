package myunmn;

/* renamed from: myunmn.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC0085p implements Runnable {
    public final /* synthetic */ C0071b a;

    public RunnableC0085p(C0071b c0071b) {
        this.a = c0071b;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        if (this.a.getWindowToken() != null) {
            this.a.m();
            this.a.f();
            this.a.k = false;
            return;
        }
        z = this.a.k;
        if (z) {
            return;
        }
        this.a.k = true;
        new C0044a(this).start();
    }
}
