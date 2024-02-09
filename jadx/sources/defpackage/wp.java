package defpackage;

import android.util.SparseArray;

/* compiled from: AxisPay */
/* renamed from: wp  reason: default package */
/* loaded from: classes.dex */
public enum wp {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    
    public static final SparseArray<wp> h;

    static {
        wp wpVar = DEFAULT;
        wp wpVar2 = UNMETERED_ONLY;
        wp wpVar3 = UNMETERED_OR_DAILY;
        wp wpVar4 = FAST_IF_RADIO_AWAKE;
        wp wpVar5 = NEVER;
        wp wpVar6 = UNRECOGNIZED;
        SparseArray<wp> sparseArray = new SparseArray<>();
        h = sparseArray;
        sparseArray.put(0, wpVar);
        sparseArray.put(1, wpVar2);
        sparseArray.put(2, wpVar3);
        sparseArray.put(3, wpVar4);
        sparseArray.put(4, wpVar5);
        sparseArray.put(-1, wpVar6);
    }

    wp(int i2) {
    }
}
