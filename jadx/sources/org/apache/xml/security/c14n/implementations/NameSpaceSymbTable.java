package org.apache.xml.security.c14n.implementations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import myunmn.C0059ao;
import org.w3c.dom.Attr;
import org.w3c.dom.Node;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class NameSpaceSymbTable {
    public static final SymbMap e;
    public int b = 0;
    public boolean d = true;
    public List c = new ArrayList(10);
    public SymbMap a = (SymbMap) e.clone();

    static {
        SymbMap symbMap = new SymbMap();
        e = symbMap;
        String a = C0059ao.a(1193);
        String a2 = C0059ao.a(1194);
        NameSpaceSymbEntry nameSpaceSymbEntry = new NameSpaceSymbEntry(a, null, true, a2);
        nameSpaceSymbEntry.d = a;
        symbMap.a(a2, nameSpaceSymbEntry);
    }

    public Attr a(String str) {
        NameSpaceSymbEntry a = this.a.a(str);
        if (a == null || a.e) {
            return null;
        }
        NameSpaceSymbEntry nameSpaceSymbEntry = (NameSpaceSymbEntry) a.clone();
        e();
        this.a.a(str, nameSpaceSymbEntry);
        nameSpaceSymbEntry.e = true;
        nameSpaceSymbEntry.a = this.b;
        nameSpaceSymbEntry.d = nameSpaceSymbEntry.c;
        return nameSpaceSymbEntry.f;
    }

    public void a() {
        this.b++;
        c();
    }

    public void a(Collection collection) {
        for (NameSpaceSymbEntry nameSpaceSymbEntry : this.a.a()) {
            if (!nameSpaceSymbEntry.e && nameSpaceSymbEntry.f != null) {
                NameSpaceSymbEntry nameSpaceSymbEntry2 = (NameSpaceSymbEntry) nameSpaceSymbEntry.clone();
                e();
                this.a.a(nameSpaceSymbEntry2.b, nameSpaceSymbEntry2);
                nameSpaceSymbEntry2.d = nameSpaceSymbEntry2.c;
                nameSpaceSymbEntry2.e = true;
                collection.add(nameSpaceSymbEntry2.f);
            }
        }
    }

    public boolean a(String str, String str2, Attr attr) {
        NameSpaceSymbEntry a = this.a.a(str);
        if (a == null || !str2.equals(a.c)) {
            NameSpaceSymbEntry nameSpaceSymbEntry = new NameSpaceSymbEntry(str2, attr, false, str);
            e();
            this.a.a(str, nameSpaceSymbEntry);
            if (a != null) {
                nameSpaceSymbEntry.d = a.d;
                String str3 = a.d;
                if (str3 != null && str3.equals(str2)) {
                    nameSpaceSymbEntry.e = true;
                }
            }
            return true;
        }
        return false;
    }

    public Attr b(String str) {
        NameSpaceSymbEntry a = this.a.a(str);
        if (a == null || a.e) {
            return null;
        }
        return a.f;
    }

    public Node b(String str, String str2, Attr attr) {
        String str3;
        NameSpaceSymbEntry a = this.a.a(str);
        if (a != null && str2.equals(a.c)) {
            if (a.e) {
                return null;
            }
            NameSpaceSymbEntry nameSpaceSymbEntry = (NameSpaceSymbEntry) a.clone();
            e();
            this.a.a(str, nameSpaceSymbEntry);
            nameSpaceSymbEntry.d = str2;
            nameSpaceSymbEntry.e = true;
            return nameSpaceSymbEntry.f;
        }
        NameSpaceSymbEntry nameSpaceSymbEntry2 = new NameSpaceSymbEntry(str2, attr, true, str);
        nameSpaceSymbEntry2.d = str2;
        e();
        this.a.a(str, nameSpaceSymbEntry2);
        if (a == null || (str3 = a.d) == null || !str3.equals(str2)) {
            return nameSpaceSymbEntry2.f;
        }
        nameSpaceSymbEntry2.e = true;
        return null;
    }

    public void b() {
        this.b--;
        d();
    }

    public void c() {
        this.c.add(null);
        this.d = false;
    }

    public void c(String str) {
        if (this.a.a(str) != null) {
            e();
            this.a.a(str, null);
        }
    }

    public void d() {
        int size = this.c.size() - 1;
        Object remove = this.c.remove(size);
        if (remove != null) {
            this.a = (SymbMap) remove;
            if (size != 0) {
                this.d = this.c.get(size - 1) != this.a;
                return;
            }
        }
        this.d = false;
    }

    public void d(String str) {
        NameSpaceSymbEntry a = this.a.a(str);
        if (a == null || a.e) {
            return;
        }
        e();
        this.a.a(str, null);
    }

    public final void e() {
        if (this.d) {
            return;
        }
        List list = this.c;
        list.set(list.size() - 1, this.a);
        this.a = (SymbMap) this.a.clone();
        this.d = true;
    }

    public boolean e(String str) {
        NameSpaceSymbEntry a = this.a.a(str);
        if (a == null || !a.e) {
            return false;
        }
        e();
        this.a.a(str, null);
        return false;
    }

    public int f() {
        return this.c.size();
    }
}
