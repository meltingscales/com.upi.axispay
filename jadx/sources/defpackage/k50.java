package defpackage;

/* compiled from: AxisPay */
/* renamed from: k50  reason: default package */
/* loaded from: classes.dex */
public enum k50 {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    
    public final int[] b;
    public final int c;

    k50(int[] iArr, int i) {
        this.b = iArr;
        this.c = i;
    }

    public int a() {
        return this.c;
    }

    public int b(l50 l50Var) {
        int f = l50Var.f();
        return this.b[f <= 9 ? (char) 0 : f <= 26 ? (char) 1 : (char) 2];
    }
}
