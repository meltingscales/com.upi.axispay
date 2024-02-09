package myunmn;

/* loaded from: classes.dex */
public class V implements Runnable {
    public final /* synthetic */ Q a;

    public V(Q q) {
        this.a = q;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.a.c(true);
    }
}
