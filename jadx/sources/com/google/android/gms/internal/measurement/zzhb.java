package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class zzhb<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzadr;
    private final int zzakb;
    private List<zzhi> zzakc;
    private Map<K, V> zzakd;
    private volatile zzhk zzake;
    private Map<K, V> zzakf;
    private volatile zzhe zzakg;

    private zzhb(int i) {
        this.zzakb = i;
        this.zzakc = Collections.emptyList();
        this.zzakd = Collections.emptyMap();
        this.zzakf = Collections.emptyMap();
    }

    public static <FieldDescriptorType extends zzes<FieldDescriptorType>> zzhb<FieldDescriptorType, Object> zzbe(int i) {
        return new zzhc(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzbg(int i) {
        zzol();
        V v = (V) this.zzakc.remove(i).getValue();
        if (!this.zzakd.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzom().entrySet().iterator();
            this.zzakc.add(new zzhi(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzol() {
        if (this.zzadr) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzom() {
        zzol();
        if (this.zzakd.isEmpty() && !(this.zzakd instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzakd = treeMap;
            this.zzakf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzakd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzol();
        if (!this.zzakc.isEmpty()) {
            this.zzakc.clear();
        }
        if (this.zzakd.isEmpty()) {
            return;
        }
        this.zzakd.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzhb<K, V>) comparable) >= 0 || this.zzakd.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzake == null) {
            this.zzake = new zzhk(this, null);
        }
        return this.zzake;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhb)) {
            return super.equals(obj);
        }
        zzhb zzhbVar = (zzhb) obj;
        int size = size();
        if (size != zzhbVar.size()) {
            return false;
        }
        int zzoi = zzoi();
        if (zzoi != zzhbVar.zzoi()) {
            return entrySet().equals(zzhbVar.entrySet());
        }
        for (int i = 0; i < zzoi; i++) {
            if (!zzbf(i).equals(zzhbVar.zzbf(i))) {
                return false;
            }
        }
        if (zzoi != size) {
            return this.zzakd.equals(zzhbVar.zzakd);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzhb<K, V>) comparable);
        if (zza >= 0) {
            return (V) this.zzakc.get(zza).getValue();
        }
        return this.zzakd.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int zzoi = zzoi();
        int i = 0;
        for (int i2 = 0; i2 < zzoi; i2++) {
            i += this.zzakc.get(i2).hashCode();
        }
        return this.zzakd.size() > 0 ? i + this.zzakd.hashCode() : i;
    }

    public final boolean isImmutable() {
        return this.zzadr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzhb<K, V>) ((Comparable) obj), (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzol();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzhb<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzbg(zza);
        }
        if (this.zzakd.isEmpty()) {
            return null;
        }
        return this.zzakd.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzakc.size() + this.zzakd.size();
    }

    public final V zza(K k, V v) {
        zzol();
        int zza = zza((zzhb<K, V>) k);
        if (zza >= 0) {
            return (V) this.zzakc.get(zza).setValue(v);
        }
        zzol();
        if (this.zzakc.isEmpty() && !(this.zzakc instanceof ArrayList)) {
            this.zzakc = new ArrayList(this.zzakb);
        }
        int i = -(zza + 1);
        if (i >= this.zzakb) {
            return zzom().put(k, v);
        }
        int size = this.zzakc.size();
        int i2 = this.zzakb;
        if (size == i2) {
            zzhi remove = this.zzakc.remove(i2 - 1);
            zzom().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.zzakc.add(i, new zzhi(this, k, v));
        return null;
    }

    public final Map.Entry<K, V> zzbf(int i) {
        return this.zzakc.get(i);
    }

    public void zzjz() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.zzadr) {
            return;
        }
        if (this.zzakd.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.zzakd);
        }
        this.zzakd = unmodifiableMap;
        if (this.zzakf.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.zzakf);
        }
        this.zzakf = unmodifiableMap2;
        this.zzadr = true;
    }

    public final int zzoi() {
        return this.zzakc.size();
    }

    public final Iterable<Map.Entry<K, V>> zzoj() {
        if (this.zzakd.isEmpty()) {
            return zzhf.zzoo();
        }
        return this.zzakd.entrySet();
    }

    public final Set<Map.Entry<K, V>> zzok() {
        if (this.zzakg == null) {
            this.zzakg = new zzhe(this, null);
        }
        return this.zzakg;
    }

    public /* synthetic */ zzhb(int i, zzhc zzhcVar) {
        this(i);
    }

    private final int zza(K k) {
        int size = this.zzakc.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzakc.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.zzakc.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }
}
