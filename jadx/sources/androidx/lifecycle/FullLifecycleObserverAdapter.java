package androidx.lifecycle;

import defpackage.bf;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements cf {
    public final ze a;
    public final cf b;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[bf.b.values().length];
            a = iArr;
            try {
                iArr[bf.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[bf.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[bf.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[bf.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[bf.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[bf.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[bf.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(ze zeVar, cf cfVar) {
        this.a = zeVar;
        this.b = cfVar;
    }

    @Override // defpackage.cf
    public void d(ef efVar, bf.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                this.a.c(efVar);
                break;
            case 2:
                this.a.f(efVar);
                break;
            case 3:
                this.a.a(efVar);
                break;
            case 4:
                this.a.e(efVar);
                break;
            case 5:
                this.a.g(efVar);
                break;
            case 6:
                this.a.b(efVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        cf cfVar = this.b;
        if (cfVar != null) {
            cfVar.d(efVar, bVar);
        }
    }
}
