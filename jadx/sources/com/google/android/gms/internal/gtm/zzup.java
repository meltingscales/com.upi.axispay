package com.google.android.gms.internal.gtm;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zza uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzup {
    public static final zzup zzA;
    public static final zzup zzB;
    public static final zzup zzC;
    public static final zzup zzD;
    public static final zzup zzE;
    public static final zzup zzF;
    public static final zzup zzG;
    public static final zzup zzH;
    public static final zzup zzI;
    public static final zzup zzJ;
    public static final zzup zzK;
    public static final zzup zzL;
    public static final zzup zzM;
    public static final zzup zzN;
    public static final zzup zzO;
    public static final zzup zzP;
    public static final zzup zzQ;
    public static final zzup zzR;
    public static final zzup zzS;
    public static final zzup zzT;
    public static final zzup zzU;
    public static final zzup zzV;
    public static final zzup zzW;
    public static final zzup zzX;
    public static final zzup zzY;
    private static final zzup[] zzZ;
    public static final zzup zza;
    private static final /* synthetic */ zzup[] zzaa;
    public static final zzup zzb;
    public static final zzup zzc;
    public static final zzup zzd;
    public static final zzup zze;
    public static final zzup zzf;
    public static final zzup zzg;
    public static final zzup zzh;
    public static final zzup zzi;
    public static final zzup zzj;
    public static final zzup zzk;
    public static final zzup zzl;
    public static final zzup zzm;
    public static final zzup zzn;
    public static final zzup zzo;
    public static final zzup zzp;
    public static final zzup zzq;
    public static final zzup zzr;
    public static final zzup zzs;
    public static final zzup zzt;
    public static final zzup zzu;
    public static final zzup zzv;
    public static final zzup zzw;
    public static final zzup zzx;
    public static final zzup zzy;
    public static final zzup zzz;
    private final zzvl zzab;
    private final int zzac;
    private final Class<?> zzad;

    static {
        zzvl zzvlVar = zzvl.zze;
        zza = new zzup("DOUBLE", 0, 0, 1, zzvlVar);
        zzvl zzvlVar2 = zzvl.zzd;
        zzb = new zzup("FLOAT", 1, 1, 1, zzvlVar2);
        zzvl zzvlVar3 = zzvl.zzc;
        zzc = new zzup("INT64", 2, 2, 1, zzvlVar3);
        zzd = new zzup("UINT64", 3, 3, 1, zzvlVar3);
        zzvl zzvlVar4 = zzvl.zzb;
        zze = new zzup("INT32", 4, 4, 1, zzvlVar4);
        zzf = new zzup("FIXED64", 5, 5, 1, zzvlVar3);
        zzg = new zzup("FIXED32", 6, 6, 1, zzvlVar4);
        zzvl zzvlVar5 = zzvl.zzf;
        zzh = new zzup("BOOL", 7, 7, 1, zzvlVar5);
        zzvl zzvlVar6 = zzvl.zzg;
        zzi = new zzup("STRING", 8, 8, 1, zzvlVar6);
        zzvl zzvlVar7 = zzvl.zzj;
        zzj = new zzup("MESSAGE", 9, 9, 1, zzvlVar7);
        zzvl zzvlVar8 = zzvl.zzh;
        zzk = new zzup("BYTES", 10, 10, 1, zzvlVar8);
        zzl = new zzup("UINT32", 11, 11, 1, zzvlVar4);
        zzvl zzvlVar9 = zzvl.zzi;
        zzm = new zzup("ENUM", 12, 12, 1, zzvlVar9);
        zzn = new zzup("SFIXED32", 13, 13, 1, zzvlVar4);
        zzo = new zzup("SFIXED64", 14, 14, 1, zzvlVar3);
        zzp = new zzup("SINT32", 15, 15, 1, zzvlVar4);
        zzq = new zzup("SINT64", 16, 16, 1, zzvlVar3);
        zzr = new zzup("GROUP", 17, 17, 1, zzvlVar7);
        zzs = new zzup("DOUBLE_LIST", 18, 18, 2, zzvlVar);
        zzt = new zzup("FLOAT_LIST", 19, 19, 2, zzvlVar2);
        zzu = new zzup("INT64_LIST", 20, 20, 2, zzvlVar3);
        zzv = new zzup("UINT64_LIST", 21, 21, 2, zzvlVar3);
        zzw = new zzup("INT32_LIST", 22, 22, 2, zzvlVar4);
        zzx = new zzup("FIXED64_LIST", 23, 23, 2, zzvlVar3);
        zzy = new zzup("FIXED32_LIST", 24, 24, 2, zzvlVar4);
        zzz = new zzup("BOOL_LIST", 25, 25, 2, zzvlVar5);
        zzA = new zzup("STRING_LIST", 26, 26, 2, zzvlVar6);
        zzB = new zzup("MESSAGE_LIST", 27, 27, 2, zzvlVar7);
        zzC = new zzup("BYTES_LIST", 28, 28, 2, zzvlVar8);
        zzD = new zzup("UINT32_LIST", 29, 29, 2, zzvlVar4);
        zzE = new zzup("ENUM_LIST", 30, 30, 2, zzvlVar9);
        zzF = new zzup("SFIXED32_LIST", 31, 31, 2, zzvlVar4);
        zzG = new zzup("SFIXED64_LIST", 32, 32, 2, zzvlVar3);
        zzH = new zzup("SINT32_LIST", 33, 33, 2, zzvlVar4);
        zzI = new zzup("SINT64_LIST", 34, 34, 2, zzvlVar3);
        zzJ = new zzup("DOUBLE_LIST_PACKED", 35, 35, 3, zzvlVar);
        zzK = new zzup("FLOAT_LIST_PACKED", 36, 36, 3, zzvlVar2);
        zzL = new zzup("INT64_LIST_PACKED", 37, 37, 3, zzvlVar3);
        zzM = new zzup("UINT64_LIST_PACKED", 38, 38, 3, zzvlVar3);
        zzN = new zzup("INT32_LIST_PACKED", 39, 39, 3, zzvlVar4);
        zzO = new zzup("FIXED64_LIST_PACKED", 40, 40, 3, zzvlVar3);
        zzP = new zzup("FIXED32_LIST_PACKED", 41, 41, 3, zzvlVar4);
        zzQ = new zzup("BOOL_LIST_PACKED", 42, 42, 3, zzvlVar5);
        zzR = new zzup("UINT32_LIST_PACKED", 43, 43, 3, zzvlVar4);
        zzS = new zzup("ENUM_LIST_PACKED", 44, 44, 3, zzvlVar9);
        zzT = new zzup("SFIXED32_LIST_PACKED", 45, 45, 3, zzvlVar4);
        zzvl zzvlVar10 = zzvl.zzc;
        zzU = new zzup("SFIXED64_LIST_PACKED", 46, 46, 3, zzvlVar10);
        zzV = new zzup("SINT32_LIST_PACKED", 47, 47, 3, zzvlVar4);
        zzW = new zzup("SINT64_LIST_PACKED", 48, 48, 3, zzvlVar10);
        zzX = new zzup("GROUP_LIST", 49, 49, 2, zzvlVar7);
        zzY = new zzup("MAP", 50, 50, 4, zzvl.zza);
        zzaa = new zzup[]{zza, zzb, zzc, zzd, zze, zzf, zzg, zzh, zzi, zzj, zzk, zzl, zzm, zzn, zzo, zzp, zzq, zzr, zzs, zzt, zzu, zzv, zzw, zzx, zzy, zzz, zzA, zzB, zzC, zzD, zzE, zzF, zzG, zzH, zzI, zzJ, zzK, zzL, zzM, zzN, zzO, zzP, zzQ, zzR, zzS, zzT, zzU, zzV, zzW, zzX, zzY};
        zzup[] values = values();
        zzZ = new zzup[values.length];
        for (zzup zzupVar : values) {
            zzZ[zzupVar.zzac] = zzupVar;
        }
    }

    private zzup(String str, int i, int i2, int i3, zzvl zzvlVar) {
        this.zzac = i2;
        this.zzab = zzvlVar;
        zzvl zzvlVar2 = zzvl.zza;
        int i4 = i3 - 1;
        if (i4 == 1) {
            this.zzad = zzvlVar.zza();
        } else if (i4 != 3) {
            this.zzad = null;
        } else {
            this.zzad = zzvlVar.zza();
        }
        if (i3 == 1) {
            zzvlVar.ordinal();
        }
    }

    public static zzup[] values() {
        return (zzup[]) zzaa.clone();
    }

    public final int zza() {
        return this.zzac;
    }
}
