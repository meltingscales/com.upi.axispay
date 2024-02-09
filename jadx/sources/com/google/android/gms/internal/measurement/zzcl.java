package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcl implements zzcp {
    public static final Map<Uri, zzcl> zzzi = new o4();
    private static final String[] zzzn = {"key", "value"};
    private final Uri uri;
    private final ContentResolver zzzj;
    private volatile Map<String, String> zzzl;
    private final Object zzzk = new Object();
    private final List<zzco> zzzm = new ArrayList();

    private zzcl(ContentResolver contentResolver, Uri uri) {
        this.zzzj = contentResolver;
        this.uri = uri;
        contentResolver.registerContentObserver(uri, false, new zzcn(this, null));
    }

    public static zzcl zza(ContentResolver contentResolver, Uri uri) {
        zzcl zzclVar;
        synchronized (zzcl.class) {
            Map<Uri, zzcl> map = zzzi;
            zzclVar = map.get(uri);
            if (zzclVar == null) {
                try {
                    zzcl zzclVar2 = new zzcl(contentResolver, uri);
                    try {
                        map.put(uri, zzclVar2);
                    } catch (SecurityException unused) {
                    }
                    zzclVar = zzclVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzclVar;
    }

    private final Map<String, String> zzjl() {
        try {
            return (Map) zzcq.zza(new zzcr(this) { // from class: com.google.android.gms.internal.measurement.zzcm
                private final zzcl zzzo;

                {
                    this.zzzo = this;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final Object zzjn() {
                    return this.zzzo.zzjm();
                }
            });
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final /* synthetic */ Object zzca(String str) {
        return zzjj().get(str);
    }

    public final Map<String, String> zzjj() {
        Map<String, String> map = this.zzzl;
        if (map == null) {
            synchronized (this.zzzk) {
                map = this.zzzl;
                if (map == null) {
                    map = zzjl();
                    this.zzzl = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    public final void zzjk() {
        synchronized (this.zzzk) {
            this.zzzl = null;
            zzcw.zzjp();
        }
        synchronized (this) {
            for (zzco zzcoVar : this.zzzm) {
                zzcoVar.zzjo();
            }
        }
    }

    public final /* synthetic */ Map zzjm() {
        Map hashMap;
        Cursor query = this.zzzj.query(this.uri, zzzn, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new o4(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }
}
