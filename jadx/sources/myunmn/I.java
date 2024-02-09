package myunmn;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class I extends aQ {
    public I() {
        super(EnumC0050af.c);
        this.a.put(16640, new ArrayList());
    }

    private void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C0062ar c0062ar = new C0062ar();
        c0062ar.a = str;
        c0062ar.f = str2;
        c0062ar.h = str3;
        c0062ar.c = str4;
        c0062ar.e = str5;
        c0062ar.g = str6;
        c0062ar.d = str7;
        c0062ar.b = str8;
        d().add(c0062ar);
    }

    private List d() {
        return (List) this.a.get(16640);
    }

    public String a(int i) {
        return ((C0062ar) d().get(i)).e;
    }

    public boolean a() {
        return !d().isEmpty();
    }

    public String b(int i) {
        return ((C0062ar) d().get(i)).d;
    }

    public int c() {
        return d().size();
    }

    public String d(int i) {
        return ((C0062ar) d().get(i)).h;
    }

    public String e(int i) {
        return ((C0062ar) d().get(i)).b;
    }

    public String f(int i) {
        return ((C0062ar) d().get(i)).a;
    }

    public String i(int i) {
        return ((C0062ar) d().get(i)).c;
    }

    public String j(int i) {
        return ((C0062ar) d().get(i)).f;
    }

    public String k(int i) {
        return ((C0062ar) d().get(i)).g;
    }
}
