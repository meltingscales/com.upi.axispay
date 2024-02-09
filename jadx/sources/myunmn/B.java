package myunmn;

/* loaded from: classes.dex */
public class B implements Runnable {
    public final /* synthetic */ C0071b a;

    public B(C0071b c0071b) {
        this.a = c0071b;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0071b c0071b = this.a;
        Boolean bool = Boolean.FALSE;
        c0071b.q = bool;
        this.a.p = Boolean.TRUE;
        this.a.d = bool;
        this.a.p();
    }
}
