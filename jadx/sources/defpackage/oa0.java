package defpackage;

import com.olive.upi.transport.model.BillerCategory;
import com.olive.upi.transport.model.BillerCircle;
import com.olive.upi.transport.model.BillerField;
import com.olive.upi.transport.model.BillerRegEnqResponse;
import com.olive.upi.transport.model.Billers;
import java.util.ArrayList;
import java.util.Hashtable;

/* compiled from: AxisPay */
/* renamed from: oa0  reason: default package */
/* loaded from: classes.dex */
public class oa0 {
    public static oa0 k;
    public ArrayList<BillerCategory> a;
    public ArrayList<Billers> b;
    public ArrayList<BillerCircle> c;
    public ArrayList<BillerField> d;
    public Hashtable<String, String> e;
    public int f;
    public int g;
    public int h;
    public BillerRegEnqResponse i;
    public Double j;

    public static oa0 f() {
        if (k == null) {
            k = new oa0();
        }
        return k;
    }

    public ArrayList<BillerCategory> a() {
        return this.a;
    }

    public ArrayList<BillerField> b() {
        return this.d;
    }

    public BillerRegEnqResponse c() {
        return this.i;
    }

    public ArrayList<Billers> d() {
        return this.b;
    }

    public Double e() {
        return this.j;
    }

    public Hashtable<String, String> g() {
        return this.e;
    }

    public Billers h() {
        int i = this.g;
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        return this.b.get(this.g);
    }

    public BillerCategory i() {
        int i = this.f;
        if (i < 0 || i >= this.a.size()) {
            return null;
        }
        return this.a.get(this.f);
    }

    public BillerCircle j() {
        return this.c.get(this.h);
    }

    public void k(ArrayList<BillerCategory> arrayList) {
        this.a = arrayList;
    }

    public void l(ArrayList<BillerField> arrayList) {
        this.d = arrayList;
    }

    public void m(ArrayList<BillerCircle> arrayList) {
        this.c = arrayList;
    }

    public void n(BillerRegEnqResponse billerRegEnqResponse) {
        this.i = billerRegEnqResponse;
    }

    public void o(ArrayList<Billers> arrayList) {
        this.b = arrayList;
    }

    public void p(Double d) {
        this.j = d;
    }

    public void q(Hashtable<String, String> hashtable) {
        this.e = hashtable;
    }

    public void r(int i) {
        this.g = i;
    }

    public void s(int i) {
        this.f = i;
    }

    public void t(int i) {
        this.h = i;
    }
}
