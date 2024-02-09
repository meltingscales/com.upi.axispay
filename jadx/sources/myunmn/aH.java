package myunmn;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class aH extends aQ {
    public aH() {
        super(EnumC0050af.j);
        this.a.put(1281, new ArrayList());
    }

    private void a(String str, String str2, String str3, String str4, String str5) {
        aZ aZVar = new aZ();
        aZVar.d = str;
        aZVar.c = str2;
        aZVar.e = str3;
        aZVar.b = str4;
        aZVar.a = str5;
        h().add(aZVar);
    }

    private List h() {
        return (List) this.a.get(1281);
    }

    public int a() {
        return h().size();
    }

    public String a(int i) {
        return (i < 0 || i >= h().size()) ? new String(new char[0]).intern() : ((aZ) h().get(i)).b;
    }

    public String b(int i) {
        return (i < 0 || i >= h().size()) ? new String(new char[0]).intern() : ((aZ) h().get(i)).c;
    }

    public String c() {
        return g() ? a(0) : new String(new char[0]).intern();
    }

    public String d() {
        return g() ? f(0) : new String(new char[0]).intern();
    }

    public String d(int i) {
        return (i < 0 || i >= h().size()) ? new String(new char[0]).intern() : ((aZ) h().get(i)).a;
    }

    public String e() {
        return g() ? d(0) : new String(new char[0]).intern();
    }

    public String e(int i) {
        return (i < 0 || i >= h().size()) ? new String(new char[0]).intern() : ((aZ) h().get(i)).e;
    }

    public String f() {
        return g() ? e(0) : new String(new char[0]).intern();
    }

    public String f(int i) {
        return (i < 0 || i >= h().size()) ? new String(new char[0]).intern() : ((aZ) h().get(i)).d;
    }

    public boolean g() {
        return !h().isEmpty();
    }

    public String i() {
        return g() ? b(0) : new String(new char[0]).intern();
    }
}
