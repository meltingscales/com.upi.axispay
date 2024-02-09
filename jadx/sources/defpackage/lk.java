package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import defpackage.bl;
import defpackage.cm;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: lk  reason: default package */
/* loaded from: classes.dex */
public class lk {
    public final cm.c a;
    public final Context b;
    public final String c;
    public final bl.d d;
    public final List<bl.b> e;
    public final bl.e f;
    public final List<Object> g;
    public final List<jl> h;
    public final boolean i;
    public final bl.c j;
    public final Executor k;
    public final Executor l;
    public final boolean m;
    public final Intent n;
    public final boolean o;
    public final boolean p;
    public final Set<Integer> q;

    static {
        C0095z.a();
    }

    @SuppressLint({"LambdaLast"})
    public lk(Context context, String str, cm.c cVar, bl.d dVar, List<bl.b> list, boolean z, bl.c cVar2, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set<Integer> set, String str2, File file, Callable<InputStream> callable, bl.e eVar, List<Object> list2, List<jl> list3) {
        this.a = cVar;
        this.b = context;
        this.c = str;
        this.d = dVar;
        this.e = list;
        this.i = z;
        this.j = cVar2;
        this.k = executor;
        this.l = executor2;
        this.n = intent;
        this.m = intent != null;
        this.o = z2;
        this.p = z3;
        this.q = set;
        this.g = list2 == null ? Collections.emptyList() : list2;
        this.h = list3 == null ? Collections.emptyList() : list3;
    }

    public boolean a(int i, int i2) {
        Set<Integer> set;
        if ((i > i2) && this.p) {
            return false;
        }
        return this.o && ((set = this.q) == null || !set.contains(Integer.valueOf(i)));
    }
}
