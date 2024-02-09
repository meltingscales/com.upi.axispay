package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: uw  reason: default package */
/* loaded from: classes.dex */
public interface uw {

    /* compiled from: AxisPay */
    /* renamed from: uw$b */
    /* loaded from: classes.dex */
    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> b = new b();
        public final e a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public e evaluate(float f, e eVar, e eVar2) {
            this.a.a(py.c(eVar.a, eVar2.a, f), py.c(eVar.b, eVar2.b, f), py.c(eVar.c, eVar2.c, f));
            return this.a;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: uw$c */
    /* loaded from: classes.dex */
    public static class c extends Property<uw, e> {
        public static final Property<uw, e> a = new c(C0059ao.a(12837));

        public c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public e get(uw uwVar) {
            return uwVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(uw uwVar, e eVar) {
            uwVar.setRevealInfo(eVar);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: uw$d */
    /* loaded from: classes.dex */
    public static class d extends Property<uw, Integer> {
        public static final Property<uw, Integer> a = new d(C0059ao.a(12756));

        public d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(uw uwVar) {
            return Integer.valueOf(uwVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(uw uwVar, Integer num) {
            uwVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: uw$e */
    /* loaded from: classes.dex */
    public static class e {
        public float a;
        public float b;
        public float c;

        public void a(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public e() {
        }

        public e(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
