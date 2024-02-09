package defpackage;

import java.util.Locale;

/* compiled from: AxisPay */
/* renamed from: ua  reason: default package */
/* loaded from: classes.dex */
public final class ua {
    public static final ta a = new e(null, false);
    public static final ta b = new e(null, true);
    public static final ta c;
    public static final ta d;

    /* compiled from: AxisPay */
    /* renamed from: ua$a */
    /* loaded from: classes.dex */
    public static class a implements c {
        public static final a b = new a(true);
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // defpackage.ua.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = ua.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                        z = z;
                    } else if (!this.a) {
                        return 1;
                    }
                } else if (this.a) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ua$b */
    /* loaded from: classes.dex */
    public static class b implements c {
        public static final b a = new b();

        @Override // defpackage.ua.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = ua.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ua$c */
    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    /* compiled from: AxisPay */
    /* renamed from: ua$d */
    /* loaded from: classes.dex */
    public static abstract class d implements ta {
        public final c a;

        public d(c cVar) {
            this.a = cVar;
        }

        @Override // defpackage.ta
        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                if (this.a == null) {
                    return b();
                }
                return c(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }

        public abstract boolean b();

        public final boolean c(CharSequence charSequence, int i, int i2) {
            int a = this.a.a(charSequence, i, i2);
            if (a != 0) {
                if (a != 1) {
                    return b();
                }
                return false;
            }
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ua$e */
    /* loaded from: classes.dex */
    public static class e extends d {
        public final boolean b;

        public e(c cVar, boolean z) {
            super(cVar);
            this.b = z;
        }

        @Override // defpackage.ua.d
        public boolean b() {
            return this.b;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ua$f */
    /* loaded from: classes.dex */
    public static class f extends d {
        public static final f b = new f();

        public f() {
            super(null);
        }

        @Override // defpackage.ua.d
        public boolean b() {
            return va.b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.a;
        c = new e(bVar, false);
        d = new e(bVar, true);
        a aVar = a.b;
        f fVar = f.b;
    }

    public static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
