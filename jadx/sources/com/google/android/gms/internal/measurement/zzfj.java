package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzahp uses external variables
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
public final class zzfj {
    public static final zzfj zzaho;
    public static final zzfj zzahp;
    public static final zzfj zzahq;
    public static final zzfj zzahr;
    public static final zzfj zzahs;
    public static final zzfj zzaht;
    public static final zzfj zzahu;
    public static final zzfj zzahv;
    public static final zzfj zzahw;
    public static final zzfj zzahx;
    private static final /* synthetic */ zzfj[] zzaib;
    private final Class<?> zzahy;
    private final Class<?> zzahz;
    private final Object zzaia;

    static {
        zzfj zzfjVar = new zzfj("VOID", 0, Void.class, Void.class, null);
        zzaho = zzfjVar;
        Class cls = Integer.TYPE;
        zzfj zzfjVar2 = new zzfj("INT", 1, cls, Integer.class, 0);
        zzahp = zzfjVar2;
        zzfj zzfjVar3 = new zzfj("LONG", 2, Long.TYPE, Long.class, 0L);
        zzahq = zzfjVar3;
        zzfj zzfjVar4 = new zzfj("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzahr = zzfjVar4;
        zzfj zzfjVar5 = new zzfj("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zzahs = zzfjVar5;
        zzfj zzfjVar6 = new zzfj("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzaht = zzfjVar6;
        zzfj zzfjVar7 = new zzfj("STRING", 6, String.class, String.class, "");
        zzahu = zzfjVar7;
        zzfj zzfjVar8 = new zzfj("BYTE_STRING", 7, zzdp.class, zzdp.class, zzdp.zzaby);
        zzahv = zzfjVar8;
        zzfj zzfjVar9 = new zzfj("ENUM", 8, cls, Integer.class, null);
        zzahw = zzfjVar9;
        zzfj zzfjVar10 = new zzfj("MESSAGE", 9, Object.class, Object.class, null);
        zzahx = zzfjVar10;
        zzaib = new zzfj[]{zzfjVar, zzfjVar2, zzfjVar3, zzfjVar4, zzfjVar5, zzfjVar6, zzfjVar7, zzfjVar8, zzfjVar9, zzfjVar10};
    }

    private zzfj(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzahy = cls;
        this.zzahz = cls2;
        this.zzaia = obj;
    }

    public static zzfj[] values() {
        return (zzfj[]) zzaib.clone();
    }

    public final Class<?> zznd() {
        return this.zzahz;
    }
}
