package myunmn;

/* loaded from: classes.dex */
public class aV extends aQ {
    private aV(boolean z, boolean z2) {
        super(EnumC0050af.b);
        this.a.put(8450, Boolean.valueOf(z));
        this.a.put(8451, Boolean.valueOf(z2));
    }

    public boolean a() {
        return c(8450);
    }

    public boolean c() {
        return a() || d();
    }

    public boolean d() {
        return c(8451);
    }
}
