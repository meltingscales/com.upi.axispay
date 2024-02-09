package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzalt uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class zzif {
    public static final zzif zzalr;
    public static final zzif zzals;
    public static final zzif zzalt;
    public static final zzif zzalu;
    public static final zzif zzalv;
    public static final zzif zzalw;
    public static final zzif zzalx;
    public static final zzif zzaly;
    public static final zzif zzalz;
    public static final zzif zzama;
    public static final zzif zzamb;
    public static final zzif zzamc;
    public static final zzif zzamd;
    public static final zzif zzame;
    public static final zzif zzamf;
    public static final zzif zzamg;
    public static final zzif zzamh;
    public static final zzif zzami;
    private static final /* synthetic */ zzif[] zzaml;
    private final zzik zzamj;
    private final int zzamk;

    static {
        zzif zzifVar = new zzif("DOUBLE", 0, zzik.DOUBLE, 1);
        zzalr = zzifVar;
        zzif zzifVar2 = new zzif("FLOAT", 1, zzik.FLOAT, 5);
        zzals = zzifVar2;
        zzik zzikVar = zzik.LONG;
        zzif zzifVar3 = new zzif("INT64", 2, zzikVar, 0);
        zzalt = zzifVar3;
        zzif zzifVar4 = new zzif("UINT64", 3, zzikVar, 0);
        zzalu = zzifVar4;
        zzik zzikVar2 = zzik.INT;
        zzif zzifVar5 = new zzif("INT32", 4, zzikVar2, 0);
        zzalv = zzifVar5;
        zzif zzifVar6 = new zzif("FIXED64", 5, zzikVar, 1);
        zzalw = zzifVar6;
        zzif zzifVar7 = new zzif("FIXED32", 6, zzikVar2, 5);
        zzalx = zzifVar7;
        zzif zzifVar8 = new zzif("BOOL", 7, zzik.BOOLEAN, 0);
        zzaly = zzifVar8;
        final zzik zzikVar3 = zzik.STRING;
        zzif zzifVar9 = new zzif("STRING", 8, zzikVar3, 2) { // from class: com.google.android.gms.internal.measurement.zzig
        };
        zzalz = zzifVar9;
        final zzik zzikVar4 = zzik.MESSAGE;
        zzif zzifVar10 = new zzif("GROUP", 9, zzikVar4, 3) { // from class: com.google.android.gms.internal.measurement.zzih
        };
        zzama = zzifVar10;
        zzif zzifVar11 = new zzif("MESSAGE", 10, zzikVar4, 2) { // from class: com.google.android.gms.internal.measurement.zzii
        };
        zzamb = zzifVar11;
        final zzik zzikVar5 = zzik.BYTE_STRING;
        zzif zzifVar12 = new zzif("BYTES", 11, zzikVar5, 2) { // from class: com.google.android.gms.internal.measurement.zzij
        };
        zzamc = zzifVar12;
        zzif zzifVar13 = new zzif("UINT32", 12, zzikVar2, 0);
        zzamd = zzifVar13;
        zzif zzifVar14 = new zzif("ENUM", 13, zzik.ENUM, 0);
        zzame = zzifVar14;
        zzif zzifVar15 = new zzif("SFIXED32", 14, zzikVar2, 5);
        zzamf = zzifVar15;
        zzif zzifVar16 = new zzif("SFIXED64", 15, zzikVar, 1);
        zzamg = zzifVar16;
        zzif zzifVar17 = new zzif("SINT32", 16, zzikVar2, 0);
        zzamh = zzifVar17;
        zzif zzifVar18 = new zzif("SINT64", 17, zzikVar, 0);
        zzami = zzifVar18;
        zzaml = new zzif[]{zzifVar, zzifVar2, zzifVar3, zzifVar4, zzifVar5, zzifVar6, zzifVar7, zzifVar8, zzifVar9, zzifVar10, zzifVar11, zzifVar12, zzifVar13, zzifVar14, zzifVar15, zzifVar16, zzifVar17, zzifVar18};
    }

    private zzif(String str, int i, zzik zzikVar, int i2) {
        this.zzamj = zzikVar;
        this.zzamk = i2;
    }

    public static zzif[] values() {
        return (zzif[]) zzaml.clone();
    }

    public final zzik zzpb() {
        return this.zzamj;
    }

    public final int zzpc() {
        return this.zzamk;
    }

    public /* synthetic */ zzif(String str, int i, zzik zzikVar, int i2, zzie zzieVar) {
        this(str, i, zzikVar, i2);
    }
}
