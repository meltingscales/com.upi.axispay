package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzadv uses external variables
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
public final class zzet {
    private static final zzet zzadv;
    private static final zzet zzadw;
    private static final zzet zzadx;
    private static final zzet zzady;
    private static final zzet zzadz;
    private static final zzet zzaea;
    private static final zzet zzaeb;
    private static final zzet zzaec;
    private static final zzet zzaed;
    private static final zzet zzaee;
    private static final zzet zzaef;
    private static final zzet zzaeg;
    private static final zzet zzaeh;
    private static final zzet zzaei;
    private static final zzet zzaej;
    private static final zzet zzaek;
    private static final zzet zzael;
    private static final zzet zzaem;
    private static final zzet zzaen;
    private static final zzet zzaeo;
    private static final zzet zzaep;
    private static final zzet zzaeq;
    private static final zzet zzaer;
    private static final zzet zzaes;
    private static final zzet zzaet;
    private static final zzet zzaeu;
    private static final zzet zzaev;
    private static final zzet zzaew;
    private static final zzet zzaex;
    private static final zzet zzaey;
    private static final zzet zzaez;
    private static final zzet zzafa;
    private static final zzet zzafb;
    private static final zzet zzafc;
    private static final zzet zzafd;
    public static final zzet zzafe;
    private static final zzet zzaff;
    private static final zzet zzafg;
    private static final zzet zzafh;
    private static final zzet zzafi;
    private static final zzet zzafj;
    private static final zzet zzafk;
    private static final zzet zzafl;
    private static final zzet zzafm;
    private static final zzet zzafn;
    private static final zzet zzafo;
    private static final zzet zzafp;
    private static final zzet zzafq;
    public static final zzet zzafr;
    private static final zzet zzafs;
    private static final zzet zzaft;
    private static final zzet[] zzafy;
    private static final Type[] zzafz;
    private static final /* synthetic */ zzet[] zzaga;
    private final int id;
    private final zzfj zzafu;
    private final zzev zzafv;
    private final Class<?> zzafw;
    private final boolean zzafx;

    static {
        zzev zzevVar = zzev.SCALAR;
        zzfj zzfjVar = zzfj.zzahs;
        zzadv = new zzet("DOUBLE", 0, 0, zzevVar, zzfjVar);
        zzfj zzfjVar2 = zzfj.zzahr;
        zzadw = new zzet("FLOAT", 1, 1, zzevVar, zzfjVar2);
        zzfj zzfjVar3 = zzfj.zzahq;
        zzadx = new zzet("INT64", 2, 2, zzevVar, zzfjVar3);
        zzady = new zzet("UINT64", 3, 3, zzevVar, zzfjVar3);
        zzfj zzfjVar4 = zzfj.zzahp;
        zzadz = new zzet("INT32", 4, 4, zzevVar, zzfjVar4);
        zzaea = new zzet("FIXED64", 5, 5, zzevVar, zzfjVar3);
        zzaeb = new zzet("FIXED32", 6, 6, zzevVar, zzfjVar4);
        zzfj zzfjVar5 = zzfj.zzaht;
        zzaec = new zzet("BOOL", 7, 7, zzevVar, zzfjVar5);
        zzfj zzfjVar6 = zzfj.zzahu;
        zzaed = new zzet("STRING", 8, 8, zzevVar, zzfjVar6);
        zzfj zzfjVar7 = zzfj.zzahx;
        zzaee = new zzet("MESSAGE", 9, 9, zzevVar, zzfjVar7);
        zzfj zzfjVar8 = zzfj.zzahv;
        zzaef = new zzet("BYTES", 10, 10, zzevVar, zzfjVar8);
        zzaeg = new zzet("UINT32", 11, 11, zzevVar, zzfjVar4);
        zzfj zzfjVar9 = zzfj.zzahw;
        zzaeh = new zzet("ENUM", 12, 12, zzevVar, zzfjVar9);
        zzaei = new zzet("SFIXED32", 13, 13, zzevVar, zzfjVar4);
        zzaej = new zzet("SFIXED64", 14, 14, zzevVar, zzfjVar3);
        zzaek = new zzet("SINT32", 15, 15, zzevVar, zzfjVar4);
        zzael = new zzet("SINT64", 16, 16, zzevVar, zzfjVar3);
        zzaem = new zzet("GROUP", 17, 17, zzevVar, zzfjVar7);
        zzev zzevVar2 = zzev.VECTOR;
        zzaen = new zzet("DOUBLE_LIST", 18, 18, zzevVar2, zzfjVar);
        zzaeo = new zzet("FLOAT_LIST", 19, 19, zzevVar2, zzfjVar2);
        zzaep = new zzet("INT64_LIST", 20, 20, zzevVar2, zzfjVar3);
        zzaeq = new zzet("UINT64_LIST", 21, 21, zzevVar2, zzfjVar3);
        zzaer = new zzet("INT32_LIST", 22, 22, zzevVar2, zzfjVar4);
        zzaes = new zzet("FIXED64_LIST", 23, 23, zzevVar2, zzfjVar3);
        zzaet = new zzet("FIXED32_LIST", 24, 24, zzevVar2, zzfjVar4);
        zzaeu = new zzet("BOOL_LIST", 25, 25, zzevVar2, zzfjVar5);
        zzaev = new zzet("STRING_LIST", 26, 26, zzevVar2, zzfjVar6);
        zzaew = new zzet("MESSAGE_LIST", 27, 27, zzevVar2, zzfjVar7);
        zzaex = new zzet("BYTES_LIST", 28, 28, zzevVar2, zzfjVar8);
        zzaey = new zzet("UINT32_LIST", 29, 29, zzevVar2, zzfjVar4);
        zzaez = new zzet("ENUM_LIST", 30, 30, zzevVar2, zzfjVar9);
        zzafa = new zzet("SFIXED32_LIST", 31, 31, zzevVar2, zzfjVar4);
        zzafb = new zzet("SFIXED64_LIST", 32, 32, zzevVar2, zzfjVar3);
        zzafc = new zzet("SINT32_LIST", 33, 33, zzevVar2, zzfjVar4);
        zzafd = new zzet("SINT64_LIST", 34, 34, zzevVar2, zzfjVar3);
        zzev zzevVar3 = zzev.PACKED_VECTOR;
        zzafe = new zzet("DOUBLE_LIST_PACKED", 35, 35, zzevVar3, zzfjVar);
        zzaff = new zzet("FLOAT_LIST_PACKED", 36, 36, zzevVar3, zzfjVar2);
        zzafg = new zzet("INT64_LIST_PACKED", 37, 37, zzevVar3, zzfjVar3);
        zzafh = new zzet("UINT64_LIST_PACKED", 38, 38, zzevVar3, zzfjVar3);
        zzafi = new zzet("INT32_LIST_PACKED", 39, 39, zzevVar3, zzfjVar4);
        zzafj = new zzet("FIXED64_LIST_PACKED", 40, 40, zzevVar3, zzfjVar3);
        zzafk = new zzet("FIXED32_LIST_PACKED", 41, 41, zzevVar3, zzfjVar4);
        zzafl = new zzet("BOOL_LIST_PACKED", 42, 42, zzevVar3, zzfjVar5);
        zzafm = new zzet("UINT32_LIST_PACKED", 43, 43, zzevVar3, zzfjVar4);
        zzafn = new zzet("ENUM_LIST_PACKED", 44, 44, zzevVar3, zzfjVar9);
        zzafo = new zzet("SFIXED32_LIST_PACKED", 45, 45, zzevVar3, zzfjVar4);
        zzfj zzfjVar10 = zzfj.zzahq;
        zzafp = new zzet("SFIXED64_LIST_PACKED", 46, 46, zzevVar3, zzfjVar10);
        zzafq = new zzet("SINT32_LIST_PACKED", 47, 47, zzevVar3, zzfj.zzahp);
        zzafr = new zzet("SINT64_LIST_PACKED", 48, 48, zzevVar3, zzfjVar10);
        zzafs = new zzet("GROUP_LIST", 49, 49, zzevVar2, zzfjVar7);
        zzaft = new zzet("MAP", 50, 50, zzev.MAP, zzfj.zzaho);
        zzaga = new zzet[]{zzadv, zzadw, zzadx, zzady, zzadz, zzaea, zzaeb, zzaec, zzaed, zzaee, zzaef, zzaeg, zzaeh, zzaei, zzaej, zzaek, zzael, zzaem, zzaen, zzaeo, zzaep, zzaeq, zzaer, zzaes, zzaet, zzaeu, zzaev, zzaew, zzaex, zzaey, zzaez, zzafa, zzafb, zzafc, zzafd, zzafe, zzaff, zzafg, zzafh, zzafi, zzafj, zzafk, zzafl, zzafm, zzafn, zzafo, zzafp, zzafq, zzafr, zzafs, zzaft};
        zzafz = new Type[0];
        zzet[] values = values();
        zzafy = new zzet[values.length];
        for (zzet zzetVar : values) {
            zzafy[zzetVar.id] = zzetVar;
        }
    }

    private zzet(String str, int i, int i2, zzev zzevVar, zzfj zzfjVar) {
        int i3;
        this.id = i2;
        this.zzafv = zzevVar;
        this.zzafu = zzfjVar;
        int i4 = zzeu.zzagb[zzevVar.ordinal()];
        boolean z = true;
        if (i4 == 1) {
            this.zzafw = zzfjVar.zznd();
        } else if (i4 != 2) {
            this.zzafw = null;
        } else {
            this.zzafw = zzfjVar.zznd();
        }
        this.zzafx = (zzevVar != zzev.SCALAR || (i3 = zzeu.zzagc[zzfjVar.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : z;
    }

    public static zzet[] values() {
        return (zzet[]) zzaga.clone();
    }

    public final int id() {
        return this.id;
    }
}
