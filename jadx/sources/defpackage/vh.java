package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: vh  reason: default package */
/* loaded from: classes.dex */
public final class vh {
    public final List<sh> a;
    public final boolean b;

    /* compiled from: AxisPay */
    /* renamed from: vh$a */
    /* loaded from: classes.dex */
    public static final class a {
        public List<sh> a;
        public boolean b = false;

        public a a(sh shVar) {
            if (shVar != null) {
                List<sh> list = this.a;
                if (list == null) {
                    this.a = new ArrayList();
                } else if (list.contains(shVar)) {
                    throw new IllegalArgumentException(C0059ao.a(13881));
                }
                this.a.add(shVar);
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(13882));
        }

        public a b(Collection<sh> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (sh shVar : collection) {
                        a(shVar);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(13883));
        }

        public vh c() {
            return new vh(this.a, this.b);
        }

        public a d(boolean z) {
            this.b = z;
            return this;
        }
    }

    public vh(List<sh> list, boolean z) {
        this.a = list == null ? Collections.emptyList() : list;
        this.b = z;
    }

    public static vh a(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C0059ao.a(4753));
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add(sh.d((Bundle) parcelableArrayList.get(i)));
            }
            arrayList = arrayList2;
        }
        return new vh(arrayList, bundle.getBoolean(C0059ao.a(4754), false));
    }

    public List<sh> b() {
        return this.a;
    }

    public boolean c() {
        int size = b().size();
        for (int i = 0; i < size; i++) {
            sh shVar = this.a.get(i);
            if (shVar == null || !shVar.x()) {
                return false;
            }
        }
        return true;
    }

    public boolean d() {
        return this.b;
    }

    public String toString() {
        return C0059ao.a(4755) + C0059ao.a(4756) + Arrays.toString(b().toArray()) + C0059ao.a(4757) + c() + C0059ao.a(4758);
    }
}
