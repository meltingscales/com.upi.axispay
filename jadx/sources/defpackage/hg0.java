package defpackage;

import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.CheckSum;

/* compiled from: AxisPay */
/* renamed from: hg0  reason: default package */
/* loaded from: classes.dex */
public class hg0 implements CheckSum {
    public BeneVpa b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;

    public String a() {
        return this.c;
    }

    public String b() {
        return this.g;
    }

    public String c() {
        return this.d;
    }

    public int d() {
        return this.f;
    }

    public String e() {
        return this.e;
    }

    public void f(String str) {
        this.c = str;
    }

    public void g(String str) {
        this.g = str;
    }

    @Override // com.olive.upi.transport.model.CheckSum
    public String getInput() {
        return this.b.getName() + this.b.getVpa() + this.c + this.d;
    }

    public void h(String str) {
        this.d = str;
    }

    public void i(int i) {
        this.f = i;
    }

    public void j(String str) {
        this.e = str;
    }

    public String toString() {
        return this.b.getName() + this.b.getVpa() + this.c + this.d;
    }
}
