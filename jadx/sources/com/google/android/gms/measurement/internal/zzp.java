package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzbl;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final /* synthetic */ class zzp {
    public static final /* synthetic */ int[] zzds;
    public static final /* synthetic */ int[] zzdt;

    static {
        int[] iArr = new int[zzbl.zza.zzb.values().length];
        zzdt = iArr;
        try {
            iArr[zzbl.zza.zzb.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzdt[zzbl.zza.zzb.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zzdt[zzbl.zza.zzb.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zzdt[zzbl.zza.zzb.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[zzbl.zzb.EnumC0014zzb.values().length];
        zzds = iArr2;
        try {
            iArr2[zzbl.zzb.EnumC0014zzb.REGEXP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zzds[zzbl.zzb.EnumC0014zzb.BEGINS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            zzds[zzbl.zzb.EnumC0014zzb.ENDS_WITH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            zzds[zzbl.zzb.EnumC0014zzb.PARTIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            zzds[zzbl.zzb.EnumC0014zzb.EXACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            zzds[zzbl.zzb.EnumC0014zzb.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
