package com.olive.upi.database;

import defpackage.bl;
import defpackage.cm;
import defpackage.dl;
import defpackage.ql;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    public volatile k70 o;
    public volatile p70 p;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a extends dl.a {
        public a(int i) {
            super(i);
        }

        @Override // defpackage.dl.a
        public void a(bm bmVar) {
            bmVar.i(C0059ao.a(2077));
            bmVar.i(C0059ao.a(2078));
            bmVar.i(C0059ao.a(2079));
            bmVar.i(C0059ao.a(2080));
        }

        @Override // defpackage.dl.a
        public void b(bm bmVar) {
            bmVar.i(C0059ao.a(2081));
            bmVar.i(C0059ao.a(2082));
            if (AppDatabase_Impl.this.f != null) {
                int size = AppDatabase_Impl.this.f.size();
                for (int i = 0; i < size; i++) {
                    ((bl.b) AppDatabase_Impl.this.f.get(i)).b(bmVar);
                }
            }
        }

        @Override // defpackage.dl.a
        public void c(bm bmVar) {
            if (AppDatabase_Impl.this.f != null) {
                int size = AppDatabase_Impl.this.f.size();
                for (int i = 0; i < size; i++) {
                    ((bl.b) AppDatabase_Impl.this.f.get(i)).a(bmVar);
                }
            }
        }

        @Override // defpackage.dl.a
        public void d(bm bmVar) {
            AppDatabase_Impl.this.a = bmVar;
            AppDatabase_Impl.this.r(bmVar);
            if (AppDatabase_Impl.this.f != null) {
                int size = AppDatabase_Impl.this.f.size();
                for (int i = 0; i < size; i++) {
                    ((bl.b) AppDatabase_Impl.this.f.get(i)).c(bmVar);
                }
            }
        }

        @Override // defpackage.dl.a
        public void e(bm bmVar) {
        }

        @Override // defpackage.dl.a
        public void f(bm bmVar) {
            nl.a(bmVar);
        }

        @Override // defpackage.dl.a
        public dl.b g(bm bmVar) {
            HashMap hashMap = new HashMap(3);
            hashMap.put(C0059ao.a(2085), new ql.a(C0059ao.a(2083), C0059ao.a(2084), true, 1, null, 1));
            hashMap.put(C0059ao.a(2088), new ql.a(C0059ao.a(2086), C0059ao.a(2087), true, 0, null, 1));
            hashMap.put(C0059ao.a(2091), new ql.a(C0059ao.a(2089), C0059ao.a(2090), true, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(0);
            String a = C0059ao.a(2092);
            ql qlVar = new ql(a, hashMap, hashSet, hashSet2);
            ql a2 = ql.a(bmVar, a);
            boolean equals = qlVar.equals(a2);
            String a3 = C0059ao.a(2093);
            if (!equals) {
                return new dl.b(false, C0059ao.a(2094) + qlVar + a3 + a2);
            }
            HashMap hashMap2 = new HashMap(3);
            hashMap2.put(C0059ao.a(2097), new ql.a(C0059ao.a(2095), C0059ao.a(2096), true, 1, null, 1));
            hashMap2.put(C0059ao.a(2100), new ql.a(C0059ao.a(2098), C0059ao.a(2099), false, 0, null, 1));
            hashMap2.put(C0059ao.a(2103), new ql.a(C0059ao.a(2101), C0059ao.a(2102), true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(0);
            String a4 = C0059ao.a(2104);
            ql qlVar2 = new ql(a4, hashMap2, hashSet3, hashSet4);
            ql a5 = ql.a(bmVar, a4);
            if (!qlVar2.equals(a5)) {
                return new dl.b(false, C0059ao.a(2105) + qlVar2 + a3 + a5);
            }
            return new dl.b(true, null);
        }
    }

    @Override // com.olive.upi.database.AppDatabase
    public k70 F() {
        k70 k70Var;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new l70(this);
            }
            k70Var = this.o;
        }
        return k70Var;
    }

    @Override // com.olive.upi.database.AppDatabase
    public p70 G() {
        p70 p70Var;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new q70(this);
            }
            p70Var = this.p;
        }
        return p70Var;
    }

    @Override // defpackage.bl
    public tk e() {
        return new tk(this, new HashMap(0), new HashMap(0), C0059ao.a(8991), C0059ao.a(8992));
    }

    @Override // defpackage.bl
    public cm f(lk lkVar) {
        dl dlVar = new dl(lkVar, new a(2), C0059ao.a(8993), C0059ao.a(8994));
        cm.b.a a2 = cm.b.a(lkVar.b);
        a2.c(lkVar.c);
        a2.b(dlVar);
        return lkVar.a.a(a2.a());
    }

    @Override // defpackage.bl
    public List<kl> h(Map<Class<? extends jl>, jl> map) {
        return Arrays.asList(new kl[0]);
    }

    @Override // defpackage.bl
    public Set<Class<? extends jl>> l() {
        return new HashSet();
    }

    @Override // defpackage.bl
    public Map<Class<?>, List<Class<?>>> m() {
        HashMap hashMap = new HashMap();
        hashMap.put(k70.class, l70.e());
        hashMap.put(p70.class, q70.d());
        return hashMap;
    }
}
