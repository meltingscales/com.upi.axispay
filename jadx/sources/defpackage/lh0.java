package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: lh0  reason: default package */
/* loaded from: classes.dex */
public final class lh0 {
    public final String a;
    public final Context b;
    public final AttributeSet c;
    public final View d;
    public final kh0 e;

    public lh0(String str, Context context, AttributeSet attributeSet, View view, kh0 kh0Var) {
        yl0.f(str, C0059ao.a(6384));
        yl0.f(context, C0059ao.a(6385));
        yl0.f(kh0Var, C0059ao.a(6386));
        this.a = str;
        this.b = context;
        this.c = attributeSet;
        this.d = view;
        this.e = kh0Var;
    }

    public final AttributeSet a() {
        return this.c;
    }

    public final Context b() {
        return this.b;
    }

    public final kh0 c() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    public final View e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lh0) {
                lh0 lh0Var = (lh0) obj;
                return yl0.a(this.a, lh0Var.a) && yl0.a(this.b, lh0Var.b) && yl0.a(this.c, lh0Var.c) && yl0.a(this.d, lh0Var.d) && yl0.a(this.e, lh0Var.e);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Context context = this.b;
        int hashCode2 = (hashCode + (context != null ? context.hashCode() : 0)) * 31;
        AttributeSet attributeSet = this.c;
        int hashCode3 = (hashCode2 + (attributeSet != null ? attributeSet.hashCode() : 0)) * 31;
        View view = this.d;
        int hashCode4 = (hashCode3 + (view != null ? view.hashCode() : 0)) * 31;
        kh0 kh0Var = this.e;
        return hashCode4 + (kh0Var != null ? kh0Var.hashCode() : 0);
    }

    public String toString() {
        return C0059ao.a(6387) + this.a + C0059ao.a(6388) + this.b + C0059ao.a(6389) + this.c + C0059ao.a(6390) + this.d + C0059ao.a(6391) + this.e + C0059ao.a(6392);
    }

    public /* synthetic */ lh0(String str, Context context, AttributeSet attributeSet, View view, kh0 kh0Var, int i, vl0 vl0Var) {
        this(str, context, (i & 4) != 0 ? null : attributeSet, (i & 8) != 0 ? null : view, kh0Var);
    }
}
