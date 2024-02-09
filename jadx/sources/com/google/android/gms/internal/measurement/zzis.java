package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzis implements Cloneable {
    private Object value;
    private zziq<?, ?> zzanj;
    private List<zzix> zzank = new ArrayList();

    private final byte[] toByteArray() throws IOException {
        byte[] bArr = new byte[zzja()];
        zza(zzin.zzl(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzpf */
    public final zzis clone() {
        zzis zzisVar = new zzis();
        try {
            zzisVar.zzanj = this.zzanj;
            List<zzix> list = this.zzank;
            if (list == null) {
                zzisVar.zzank = null;
            } else {
                zzisVar.zzank.addAll(list);
            }
            Object obj = this.value;
            if (obj != null) {
                if (obj instanceof zziv) {
                    zzisVar.value = (zziv) ((zziv) obj).clone();
                } else if (obj instanceof byte[]) {
                    zzisVar.value = ((byte[]) obj).clone();
                } else {
                    int i = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length];
                        zzisVar.value = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (obj instanceof boolean[]) {
                        zzisVar.value = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        zzisVar.value = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        zzisVar.value = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        zzisVar.value = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        zzisVar.value = ((double[]) obj).clone();
                    } else if (obj instanceof zziv[]) {
                        zziv[] zzivVarArr = (zziv[]) obj;
                        zziv[] zzivVarArr2 = new zziv[zzivVarArr.length];
                        zzisVar.value = zzivVarArr2;
                        while (i < zzivVarArr.length) {
                            zzivVarArr2[i] = (zziv) zzivVarArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return zzisVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        List<zzix> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzis) {
            zzis zzisVar = (zzis) obj;
            if (this.value != null && zzisVar.value != null) {
                zziq<?, ?> zziqVar = this.zzanj;
                if (zziqVar != zzisVar.zzanj) {
                    return false;
                }
                if (!zziqVar.zzane.isArray()) {
                    return this.value.equals(zzisVar.value);
                }
                Object obj2 = this.value;
                if (obj2 instanceof byte[]) {
                    return Arrays.equals((byte[]) obj2, (byte[]) zzisVar.value);
                }
                if (obj2 instanceof int[]) {
                    return Arrays.equals((int[]) obj2, (int[]) zzisVar.value);
                }
                if (obj2 instanceof long[]) {
                    return Arrays.equals((long[]) obj2, (long[]) zzisVar.value);
                }
                if (obj2 instanceof float[]) {
                    return Arrays.equals((float[]) obj2, (float[]) zzisVar.value);
                }
                if (obj2 instanceof double[]) {
                    return Arrays.equals((double[]) obj2, (double[]) zzisVar.value);
                }
                if (obj2 instanceof boolean[]) {
                    return Arrays.equals((boolean[]) obj2, (boolean[]) zzisVar.value);
                }
                return Arrays.deepEquals((Object[]) obj2, (Object[]) zzisVar.value);
            }
            List<zzix> list2 = this.zzank;
            if (list2 != null && (list = zzisVar.zzank) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(toByteArray(), zzisVar.toByteArray());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        return false;
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zza(zzix zzixVar) throws IOException {
        List<zzix> list = this.zzank;
        if (list != null) {
            list.add(zzixVar);
            return;
        }
        Object obj = this.value;
        if (obj instanceof zziv) {
            byte[] bArr = zzixVar.zzacg;
            zzim zzj = zzim.zzj(bArr, 0, bArr.length);
            int zzlb = zzj.zzlb();
            if (zzlb == bArr.length - zzin.zzak(zzlb)) {
                zziv zza = ((zziv) this.value).zza(zzj);
                this.zzanj = this.zzanj;
                this.value = zza;
                this.zzank = null;
                return;
            }
            throw zziu.zzpg();
        } else if (!(obj instanceof zziv[])) {
            if (!(obj instanceof zzgh)) {
                if (obj instanceof zzgh[]) {
                    Collections.singletonList(zzixVar);
                    throw new NoSuchMethodError();
                } else {
                    Collections.singletonList(zzixVar);
                    throw new NoSuchMethodError();
                }
            }
            Collections.singletonList(zzixVar);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(zzixVar);
            throw new NoSuchMethodError();
        }
    }

    public final int zzja() {
        if (this.value == null) {
            int i = 0;
            for (zzix zzixVar : this.zzank) {
                i += zzin.zzar(zzixVar.tag) + 0 + zzixVar.zzacg.length;
            }
            return i;
        }
        throw new NoSuchMethodError();
    }

    public final void zza(zzin zzinVar) throws IOException {
        if (this.value == null) {
            for (zzix zzixVar : this.zzank) {
                zzinVar.zzbl(zzixVar.tag);
                zzinVar.zzm(zzixVar.zzacg);
            }
            return;
        }
        throw new NoSuchMethodError();
    }
}
