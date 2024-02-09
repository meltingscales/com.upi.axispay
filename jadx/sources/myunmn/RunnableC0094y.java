package myunmn;

/* renamed from: myunmn.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC0094y implements Runnable {
    public final /* synthetic */ C0071b a;

    public RunnableC0094y(C0071b c0071b) {
        this.a = c0071b;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        Boolean bool;
        if (this.a.getWindowToken() != null) {
            bool = this.a.o;
            if (bool.booleanValue()) {
                this.a.u();
            } else {
                this.a.o();
            }
            this.a.f = false;
            return;
        }
        z = this.a.f;
        if (z) {
            return;
        }
        this.a.f = true;
        new aC(this).start();
    }
}
