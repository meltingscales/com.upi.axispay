package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdg;
import com.google.android.gms.internal.measurement.zzdh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzdg<MessageType extends zzdg<MessageType, BuilderType>, BuilderType extends zzdh<MessageType, BuilderType>> implements zzgh {
    private static boolean zzabn;
    public int zzabm = 0;

    public static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzfb.checkNotNull(iterable);
        if (iterable instanceof zzfq) {
            List<?> zzng = ((zzfq) iterable).zzng();
            zzfq zzfqVar = (zzfq) list;
            int size = list.size();
            for (Object obj : zzng) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(zzfqVar.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = zzfqVar.size() - 1; size2 >= size; size2--) {
                        zzfqVar.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof zzdp) {
                    zzfqVar.zzc((zzdp) obj);
                } else {
                    zzfqVar.add((String) obj);
                }
            }
        } else if (iterable instanceof zzgt) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(t);
            }
        }
    }

    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[zzly()];
            zzeg zzh = zzeg.zzh(bArr);
            zzb(zzh);
            zzh.zzlk();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgh
    public final zzdp zzjv() {
        try {
            zzdx zzt = zzdp.zzt(zzly());
            zzb(zzt.zzki());
            return zzt.zzkh();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public int zzjw() {
        throw new UnsupportedOperationException();
    }

    public void zzn(int i) {
        throw new UnsupportedOperationException();
    }
}
