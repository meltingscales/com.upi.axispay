package defpackage;

import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: pg0  reason: default package */
/* loaded from: classes.dex */
public class pg0 {
    public String a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public ArrayList<pg0> f;

    public pg0(int i) {
        this.e = i;
    }

    public void a(pg0 pg0Var) {
        if (this.f == null) {
            this.f = new ArrayList<>();
        }
        this.f.add(pg0Var);
    }

    public ArrayList<pg0> b() {
        return this.f;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.e;
    }

    public String e() {
        return this.a;
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.c;
    }

    public pg0(int i, String str, int i2, boolean z) {
        this.e = i;
        this.a = str;
        this.b = i2;
        this.c = z;
        this.d = false;
    }

    public pg0(int i, String str) {
        this.e = i;
        this.a = str;
    }

    public pg0(int i, String str, int i2, boolean z, boolean z2) {
        this.e = i;
        this.a = str;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }
}
