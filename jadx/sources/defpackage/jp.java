package defpackage;

import defpackage.hp;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: jp  reason: default package */
/* loaded from: classes.dex */
public final class jp extends hp {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    /* compiled from: AxisPay */
    /* renamed from: jp$b */
    /* loaded from: classes.dex */
    public static final class b extends hp.a {
        public Integer a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;

        @Override // defpackage.hp.a
        public hp a() {
            return new jp(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }

        @Override // defpackage.hp.a
        public hp.a b(String str) {
            this.l = str;
            return this;
        }

        @Override // defpackage.hp.a
        public hp.a c(String str) {
            this.j = str;
            return this;
        }

        @Override // defpackage.hp.a
        public hp.a d(String str) {
            this.d = str;
            return this;
        }

        @Override // defpackage.hp.a
        public hp.a e(String str) {
            this.h = str;
            return this;
        }

        @Override // defpackage.hp.a
        public hp.a f(String str) {
            this.c = str;
            return this;
        }

        @Override // defpackage.hp.a
        public hp.a g(String str) {
            this.i = str;
            return this;
        }

        @Override // defpackage.hp.a
        public hp.a h(String str) {
            this.g = str;
            return this;
        }

        @Override // defpackage.hp.a
        public hp.a i(String str) {
            this.k = str;
            return this;
        }

        @Override // defpackage.hp.a
        public hp.a j(String str) {
            this.b = str;
            return this;
        }

        @Override // defpackage.hp.a
        public hp.a k(String str) {
            this.f = str;
            return this;
        }

        @Override // defpackage.hp.a
        public hp.a l(String str) {
            this.e = str;
            return this;
        }

        @Override // defpackage.hp.a
        public hp.a m(Integer num) {
            this.a = num;
            return this;
        }
    }

    @Override // defpackage.hp
    public String b() {
        return this.l;
    }

    @Override // defpackage.hp
    public String c() {
        return this.j;
    }

    @Override // defpackage.hp
    public String d() {
        return this.d;
    }

    @Override // defpackage.hp
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hp) {
            hp hpVar = (hp) obj;
            Integer num = this.a;
            if (num != null ? num.equals(hpVar.m()) : hpVar.m() == null) {
                String str = this.b;
                if (str != null ? str.equals(hpVar.j()) : hpVar.j() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(hpVar.f()) : hpVar.f() == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(hpVar.d()) : hpVar.d() == null) {
                            String str4 = this.e;
                            if (str4 != null ? str4.equals(hpVar.l()) : hpVar.l() == null) {
                                String str5 = this.f;
                                if (str5 != null ? str5.equals(hpVar.k()) : hpVar.k() == null) {
                                    String str6 = this.g;
                                    if (str6 != null ? str6.equals(hpVar.h()) : hpVar.h() == null) {
                                        String str7 = this.h;
                                        if (str7 != null ? str7.equals(hpVar.e()) : hpVar.e() == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(hpVar.g()) : hpVar.g() == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(hpVar.c()) : hpVar.c() == null) {
                                                    String str10 = this.k;
                                                    if (str10 != null ? str10.equals(hpVar.i()) : hpVar.i() == null) {
                                                        String str11 = this.l;
                                                        if (str11 == null) {
                                                            if (hpVar.b() == null) {
                                                                return true;
                                                            }
                                                        } else if (str11.equals(hpVar.b())) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.hp
    public String f() {
        return this.c;
    }

    @Override // defpackage.hp
    public String g() {
        return this.i;
    }

    @Override // defpackage.hp
    public String h() {
        return this.g;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.l;
        return hashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // defpackage.hp
    public String i() {
        return this.k;
    }

    @Override // defpackage.hp
    public String j() {
        return this.b;
    }

    @Override // defpackage.hp
    public String k() {
        return this.f;
    }

    @Override // defpackage.hp
    public String l() {
        return this.e;
    }

    @Override // defpackage.hp
    public Integer m() {
        return this.a;
    }

    public String toString() {
        return C0059ao.a(9988) + this.a + C0059ao.a(9989) + this.b + C0059ao.a(9990) + this.c + C0059ao.a(9991) + this.d + C0059ao.a(9992) + this.e + C0059ao.a(9993) + this.f + C0059ao.a(9994) + this.g + C0059ao.a(9995) + this.h + C0059ao.a(9996) + this.i + C0059ao.a(9997) + this.j + C0059ao.a(9998) + this.k + C0059ao.a(9999) + this.l + C0059ao.a(10000);
    }

    public jp(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }
}
