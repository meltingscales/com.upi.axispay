package myunmn;

/* loaded from: classes.dex */
public class A implements Runnable {
    public final /* synthetic */ C0071b a;

    public A(C0071b c0071b) {
        this.a = c0071b;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.q = Boolean.TRUE;
        C0071b c0071b = this.a;
        Boolean bool = Boolean.FALSE;
        c0071b.p = bool;
        this.a.d = bool;
        this.a.h();
    }
}
