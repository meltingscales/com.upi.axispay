package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import defpackage.oa;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: na  reason: default package */
/* loaded from: classes.dex */
public class na {
    public static final s4<String, Typeface> a = new s4<>(16);
    public static final ExecutorService b = pa.a(C0059ao.a(13646), 10, 10000);
    public static final Object c = new Object();
    public static final u4<String, ArrayList<wa<e>>> d = new u4<>();

    /* compiled from: AxisPay */
    /* renamed from: na$a */
    /* loaded from: classes.dex */
    public class a implements Callable<e> {
        public final /* synthetic */ String b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ ma d;
        public final /* synthetic */ int e;

        public a(String str, Context context, ma maVar, int i) {
            this.b = str;
            this.c = context;
            this.d = maVar;
            this.e = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            return na.c(this.b, this.c, this.d, this.e);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: na$b */
    /* loaded from: classes.dex */
    public class b implements wa<e> {
        public final /* synthetic */ ja a;

        public b(ja jaVar) {
            this.a = jaVar;
        }

        @Override // defpackage.wa
        /* renamed from: b */
        public void a(e eVar) {
            this.a.b(eVar);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: na$c */
    /* loaded from: classes.dex */
    public class c implements Callable<e> {
        public final /* synthetic */ String b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ ma d;
        public final /* synthetic */ int e;

        public c(String str, Context context, ma maVar, int i) {
            this.b = str;
            this.c = context;
            this.d = maVar;
            this.e = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            return na.c(this.b, this.c, this.d, this.e);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: na$d */
    /* loaded from: classes.dex */
    public class d implements wa<e> {
        public final /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        @Override // defpackage.wa
        /* renamed from: b */
        public void a(e eVar) {
            synchronized (na.c) {
                u4<String, ArrayList<wa<e>>> u4Var = na.d;
                ArrayList<wa<e>> arrayList = u4Var.get(this.a);
                if (arrayList == null) {
                    return;
                }
                u4Var.remove(this.a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).a(eVar);
                }
            }
        }
    }

    public static String a(ma maVar, int i) {
        return maVar.d() + C0059ao.a(13647) + i;
    }

    @SuppressLint({"WrongConstant"})
    public static int b(oa.a aVar) {
        int i = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        oa.b[] b2 = aVar.b();
        if (b2 != null && b2.length != 0) {
            i = 0;
            for (oa.b bVar : b2) {
                int b3 = bVar.b();
                if (b3 != 0) {
                    if (b3 < 0) {
                        return -3;
                    }
                    return b3;
                }
            }
        }
        return i;
    }

    public static e c(String str, Context context, ma maVar, int i) {
        s4<String, Typeface> s4Var = a;
        Typeface typeface = s4Var.get(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            oa.a d2 = la.d(context, maVar, null);
            int b2 = b(d2);
            if (b2 != 0) {
                return new e(b2);
            }
            Typeface b3 = g9.b(context, null, d2.b(), i);
            if (b3 != null) {
                s4Var.put(str, b3);
                return new e(b3);
            }
            return new e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    public static Typeface d(Context context, ma maVar, int i, Executor executor, ja jaVar) {
        String a2 = a(maVar, i);
        Typeface typeface = a.get(a2);
        if (typeface != null) {
            jaVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(jaVar);
        synchronized (c) {
            u4<String, ArrayList<wa<e>>> u4Var = d;
            ArrayList<wa<e>> arrayList = u4Var.get(a2);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<wa<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            u4Var.put(a2, arrayList2);
            c cVar = new c(a2, context, maVar, i);
            if (executor == null) {
                executor = b;
            }
            pa.b(executor, cVar, new d(a2));
            return null;
        }
    }

    public static Typeface e(Context context, ma maVar, ja jaVar, int i, int i2) {
        String a2 = a(maVar, i);
        Typeface typeface = a.get(a2);
        if (typeface != null) {
            jaVar.b(new e(typeface));
            return typeface;
        } else if (i2 == -1) {
            e c2 = c(a2, context, maVar, i);
            jaVar.b(c2);
            return c2.a;
        } else {
            try {
                e eVar = (e) pa.c(b, new a(a2, context, maVar, i), i2);
                jaVar.b(eVar);
                return eVar.a;
            } catch (InterruptedException unused) {
                jaVar.b(new e(-3));
                return null;
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: na$e */
    /* loaded from: classes.dex */
    public static final class e {
        public final Typeface a;
        public final int b;

        public e(int i) {
            this.a = null;
            this.b = i;
        }

        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.b == 0;
        }

        @SuppressLint({"WrongConstant"})
        public e(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }
}
