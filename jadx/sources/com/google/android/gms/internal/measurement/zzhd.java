package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzhd<K, V> implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzakh;
    private final /* synthetic */ zzhb zzaki;

    private zzhd(zzhb zzhbVar) {
        List list;
        this.zzaki = zzhbVar;
        list = zzhbVar.zzakc;
        this.pos = list.size();
    }

    private final Iterator<Map.Entry<K, V>> zzon() {
        Map map;
        if (this.zzakh == null) {
            map = this.zzaki.zzakf;
            this.zzakh = map.entrySet().iterator();
        }
        return this.zzakh;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.pos;
        if (i > 0) {
            list = this.zzaki.zzakc;
            if (i <= list.size()) {
                return true;
            }
        }
        return zzon().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (!zzon().hasNext()) {
            list = this.zzaki.zzakc;
            int i = this.pos - 1;
            this.pos = i;
            return (Map.Entry) list.get(i);
        }
        return zzon().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ zzhd(zzhb zzhbVar, zzhc zzhcVar) {
        this(zzhbVar);
    }
}
