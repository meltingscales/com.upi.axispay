package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzhj<K, V> implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzakh;
    private final /* synthetic */ zzhb zzaki;
    private boolean zzakm;

    private zzhj(zzhb zzhbVar) {
        this.zzaki = zzhbVar;
        this.pos = -1;
    }

    private final Iterator<Map.Entry<K, V>> zzon() {
        Map map;
        if (this.zzakh == null) {
            map = this.zzaki.zzakd;
            this.zzakh = map.entrySet().iterator();
        }
        return this.zzakh;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.pos + 1;
        list = this.zzaki.zzakc;
        if (i >= list.size()) {
            map = this.zzaki.zzakd;
            if (map.isEmpty() || !zzon().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzakm = true;
        int i = this.pos + 1;
        this.pos = i;
        list = this.zzaki.zzakc;
        if (i < list.size()) {
            list2 = this.zzaki.zzakc;
            return (Map.Entry) list2.get(this.pos);
        }
        return zzon().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.zzakm) {
            this.zzakm = false;
            this.zzaki.zzol();
            int i = this.pos;
            list = this.zzaki.zzakc;
            if (i < list.size()) {
                zzhb zzhbVar = this.zzaki;
                int i2 = this.pos;
                this.pos = i2 - 1;
                zzhbVar.zzbg(i2);
                return;
            }
            zzon().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    public /* synthetic */ zzhj(zzhb zzhbVar, zzhc zzhcVar) {
        this(zzhbVar);
    }
}
