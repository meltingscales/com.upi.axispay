package defpackage;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: nf  reason: default package */
/* loaded from: classes.dex */
public final class nf {
    public static final Class[] e;
    public final Map<String, Object> a;
    public final Map<String, SavedStateRegistry.b> b;
    public final Map<String, Object<?>> c;
    public final SavedStateRegistry.b d;

    /* compiled from: AxisPay */
    /* renamed from: nf$a */
    /* loaded from: classes.dex */
    public class a implements SavedStateRegistry.b {
        public a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            for (Map.Entry entry : new HashMap(nf.this.b).entrySet()) {
                nf.this.c((String) entry.getKey(), ((SavedStateRegistry.b) entry.getValue()).a());
            }
            Set<String> keySet = nf.this.a.keySet();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            for (String str : keySet) {
                arrayList.add(str);
                arrayList2.add(nf.this.a.get(str));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList(C0059ao.a(7658), arrayList);
            bundle.putParcelableArrayList(C0059ao.a(7659), arrayList2);
            return bundle;
        }
    }

    static {
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        Class<SizeF> cls = Integer.TYPE;
        clsArr[4] = cls;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        int i = Build.VERSION.SDK_INT;
        clsArr[27] = i >= 21 ? Size.class : cls;
        if (i >= 21) {
            cls = SizeF.class;
        }
        clsArr[28] = cls;
        e = clsArr;
    }

    public nf(Map<String, Object> map) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new a();
        this.a = new HashMap(map);
    }

    public static nf a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new nf();
        }
        HashMap hashMap = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new nf(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C0059ao.a(13677));
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(C0059ao.a(13678));
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                hashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
            }
            return new nf(hashMap);
        }
        throw new IllegalStateException(C0059ao.a(13679));
    }

    public static void d(Object obj) {
        if (obj == null) {
            return;
        }
        for (Class cls : e) {
            if (cls.isInstance(obj)) {
                return;
            }
        }
        throw new IllegalArgumentException(C0059ao.a(13680) + obj.getClass() + C0059ao.a(13681));
    }

    public SavedStateRegistry.b b() {
        return this.d;
    }

    public <T> void c(String str, T t) {
        d(t);
        jf jfVar = (jf) this.c.get(str);
        if (jfVar != null) {
            jfVar.j(t);
        } else {
            this.a.put(str, t);
        }
    }

    public nf() {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new a();
        this.a = new HashMap();
    }
}
