package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: aj  reason: default package */
/* loaded from: classes.dex */
public class aj {
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean h;
    public boolean i;
    public boolean a = true;
    public int f = 0;
    public int g = 0;

    public boolean a(RecyclerView.a0 a0Var) {
        int i = this.c;
        return i >= 0 && i < a0Var.b();
    }

    public View b(RecyclerView.w wVar) {
        View o = wVar.o(this.c);
        this.c += this.d;
        return o;
    }

    public String toString() {
        return C0059ao.a(1062) + this.b + C0059ao.a(1063) + this.c + C0059ao.a(1064) + this.d + C0059ao.a(1065) + this.e + C0059ao.a(1066) + this.f + C0059ao.a(1067) + this.g + '}';
    }
}
