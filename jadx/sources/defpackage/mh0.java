package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: mh0  reason: default package */
/* loaded from: classes.dex */
public final class mh0 {
    public final View a;
    public final String b;
    public final Context c;
    public final AttributeSet d;

    /* compiled from: AxisPay */
    /* renamed from: mh0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public View a;
        public String b;
        public Context c;
        public AttributeSet d;

        public a(mh0 mh0Var) {
            yl0.f(mh0Var, C0059ao.a(12723));
            this.a = mh0Var.e();
            this.b = mh0Var.c();
            this.c = mh0Var.b();
            this.d = mh0Var.a();
        }

        public final mh0 a() {
            String str = this.b;
            if (str != null) {
                View view = this.a;
                if (view == null) {
                    view = null;
                } else if (!yl0.a(str, view.getClass().getName())) {
                    throw new IllegalStateException((C0059ao.a(12724) + str + C0059ao.a(12725) + view.getClass().getName() + ')').toString());
                }
                Context context = this.c;
                if (context != null) {
                    return new mh0(view, str, context, this.d);
                }
                throw new IllegalStateException(C0059ao.a(12726));
            }
            throw new IllegalStateException(C0059ao.a(12727).toString());
        }

        public final a b(View view) {
            this.a = view;
            return this;
        }
    }

    public mh0(View view, String str, Context context, AttributeSet attributeSet) {
        yl0.f(str, C0059ao.a(5710));
        yl0.f(context, C0059ao.a(5711));
        this.a = view;
        this.b = str;
        this.c = context;
        this.d = attributeSet;
    }

    public final AttributeSet a() {
        return this.d;
    }

    public final Context b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final a d() {
        return new a(this);
    }

    public final View e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mh0) {
                mh0 mh0Var = (mh0) obj;
                return yl0.a(this.a, mh0Var.a) && yl0.a(this.b, mh0Var.b) && yl0.a(this.c, mh0Var.c) && yl0.a(this.d, mh0Var.d);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        View view = this.a;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Context context = this.c;
        int hashCode3 = (hashCode2 + (context != null ? context.hashCode() : 0)) * 31;
        AttributeSet attributeSet = this.d;
        return hashCode3 + (attributeSet != null ? attributeSet.hashCode() : 0);
    }

    public String toString() {
        return C0059ao.a(5712) + this.a + C0059ao.a(5713) + this.b + C0059ao.a(5714) + this.c + C0059ao.a(5715) + this.d + C0059ao.a(5716);
    }
}
