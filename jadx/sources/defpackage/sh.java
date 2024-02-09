package defpackage;

import android.annotation.SuppressLint;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: sh  reason: default package */
/* loaded from: classes.dex */
public final class sh {
    public final Bundle a;
    public List<String> b;
    public List<IntentFilter> c;

    public sh(Bundle bundle) {
        this.a = bundle;
    }

    public static sh d(Bundle bundle) {
        if (bundle != null) {
            return new sh(bundle);
        }
        return null;
    }

    public boolean a() {
        return this.a.getBoolean(C0059ao.a(1915), false);
    }

    public void b() {
        if (this.c == null) {
            ArrayList parcelableArrayList = this.a.getParcelableArrayList(C0059ao.a(1916));
            this.c = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.c = Collections.emptyList();
            }
        }
    }

    public void c() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList(C0059ao.a(1917));
            this.b = stringArrayList;
            if (stringArrayList == null) {
                this.b = Collections.emptyList();
            }
        }
    }

    public int e() {
        return this.a.getInt(C0059ao.a(1918), 0);
    }

    public List<IntentFilter> f() {
        b();
        return this.c;
    }

    public String g() {
        return this.a.getString(C0059ao.a(1919));
    }

    public int h() {
        return this.a.getInt(C0059ao.a(1920));
    }

    public Bundle i() {
        return this.a.getBundle(C0059ao.a(1921));
    }

    public List<String> j() {
        c();
        return this.b;
    }

    public Uri k() {
        String string = this.a.getString(C0059ao.a(1922));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public String l() {
        return this.a.getString(C0059ao.a(1923));
    }

    public int m() {
        return this.a.getInt(C0059ao.a(1924), Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public int n() {
        return this.a.getInt(C0059ao.a(1925), 1);
    }

    public String o() {
        return this.a.getString(C0059ao.a(1926));
    }

    public int p() {
        return this.a.getInt(C0059ao.a(1927), -1);
    }

    public int q() {
        return this.a.getInt(C0059ao.a(1928), 1);
    }

    public int r() {
        return this.a.getInt(C0059ao.a(1929), -1);
    }

    public IntentSender s() {
        return (IntentSender) this.a.getParcelable(C0059ao.a(1930));
    }

    public int t() {
        return this.a.getInt(C0059ao.a(1931));
    }

    public String toString() {
        return C0059ao.a(1932) + C0059ao.a(1933) + l() + C0059ao.a(1934) + j() + C0059ao.a(1935) + o() + C0059ao.a(1936) + g() + C0059ao.a(1937) + k() + C0059ao.a(1938) + w() + C0059ao.a(1939) + e() + C0059ao.a(1940) + Arrays.toString(f().toArray()) + C0059ao.a(1941) + q() + C0059ao.a(1942) + p() + C0059ao.a(1943) + h() + C0059ao.a(1944) + t() + C0059ao.a(1945) + v() + C0059ao.a(1946) + u() + C0059ao.a(1947) + r() + C0059ao.a(1948) + i() + C0059ao.a(1949) + x() + C0059ao.a(1950) + n() + C0059ao.a(1951) + m() + C0059ao.a(1952);
    }

    public int u() {
        return this.a.getInt(C0059ao.a(1953), 0);
    }

    public int v() {
        return this.a.getInt(C0059ao.a(1954));
    }

    public boolean w() {
        return this.a.getBoolean(C0059ao.a(1955), true);
    }

    public boolean x() {
        b();
        return (TextUtils.isEmpty(l()) || TextUtils.isEmpty(o()) || this.c.contains(null)) ? false : true;
    }

    /* compiled from: AxisPay */
    /* renamed from: sh$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final Bundle a;
        public ArrayList<String> b;
        public ArrayList<IntentFilter> c;

        public a(String str, String str2) {
            this.a = new Bundle();
            m(str);
            n(str2);
        }

        public a a(IntentFilter intentFilter) {
            if (intentFilter != null) {
                if (this.c == null) {
                    this.c = new ArrayList<>();
                }
                if (!this.c.contains(intentFilter)) {
                    this.c.add(intentFilter);
                }
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(15780));
        }

        public a b(Collection<IntentFilter> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (IntentFilter intentFilter : collection) {
                        a(intentFilter);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(15781));
        }

        public a c(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                if (!this.b.contains(str)) {
                    this.b.add(str);
                }
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(15782));
        }

        public a d(Collection<String> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (String str : collection) {
                        c(str);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(15783));
        }

        @SuppressLint({"UnknownNullness"})
        public sh e() {
            ArrayList<IntentFilter> arrayList = this.c;
            if (arrayList != null) {
                this.a.putParcelableArrayList(C0059ao.a(15784), arrayList);
            }
            ArrayList<String> arrayList2 = this.b;
            if (arrayList2 != null) {
                this.a.putStringArrayList(C0059ao.a(15785), arrayList2);
            }
            return new sh(this.a);
        }

        public a f(boolean z) {
            this.a.putBoolean(C0059ao.a(15786), z);
            return this;
        }

        public a g(int i) {
            this.a.putInt(C0059ao.a(15787), i);
            return this;
        }

        public a h(String str) {
            this.a.putString(C0059ao.a(15788), str);
            return this;
        }

        public a i(int i) {
            this.a.putInt(C0059ao.a(15789), i);
            return this;
        }

        public a j(boolean z) {
            this.a.putBoolean(C0059ao.a(15790), z);
            return this;
        }

        public a k(Bundle bundle) {
            this.a.putBundle(C0059ao.a(15791), bundle);
            return this;
        }

        public a l(Uri uri) {
            if (uri != null) {
                this.a.putString(C0059ao.a(15792), uri.toString());
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(15793));
        }

        public a m(String str) {
            this.a.putString(C0059ao.a(15794), str);
            return this;
        }

        public a n(String str) {
            this.a.putString(C0059ao.a(15795), str);
            return this;
        }

        public a o(int i) {
            this.a.putInt(C0059ao.a(15796), i);
            return this;
        }

        public a p(int i) {
            this.a.putInt(C0059ao.a(15797), i);
            return this;
        }

        public a q(int i) {
            this.a.putInt(C0059ao.a(15798), i);
            return this;
        }

        public a r(int i) {
            this.a.putInt(C0059ao.a(15799), i);
            return this;
        }

        public a s(int i) {
            this.a.putInt(C0059ao.a(15800), i);
            return this;
        }

        public a t(int i) {
            this.a.putInt(C0059ao.a(15801), i);
            return this;
        }

        public a(sh shVar) {
            if (shVar != null) {
                this.a = new Bundle(shVar.a);
                if (!shVar.j().isEmpty()) {
                    this.b = new ArrayList<>(shVar.j());
                }
                if (shVar.f().isEmpty()) {
                    return;
                }
                this.c = new ArrayList<>(shVar.c);
                return;
            }
            throw new IllegalArgumentException(C0059ao.a(15779));
        }
    }
}
