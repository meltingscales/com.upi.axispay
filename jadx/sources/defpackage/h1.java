package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import defpackage.p1;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: h1  reason: default package */
/* loaded from: classes.dex */
public class h1 extends BaseAdapter {
    public i1 b;
    public int c = -1;
    public boolean d;
    public final boolean e;
    public final LayoutInflater f;
    public final int g;

    public h1(i1 i1Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.e = z;
        this.f = layoutInflater;
        this.b = i1Var;
        this.g = i;
        a();
    }

    public void a() {
        k1 x = this.b.x();
        if (x != null) {
            ArrayList<k1> B = this.b.B();
            int size = B.size();
            for (int i = 0; i < size; i++) {
                if (B.get(i) == x) {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    public i1 b() {
        return this.b;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public k1 getItem(int i) {
        ArrayList<k1> B = this.e ? this.b.B() : this.b.G();
        int i2 = this.c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return B.get(i);
    }

    public void d(boolean z) {
        this.d = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<k1> B = this.e ? this.b.B() : this.b.G();
        if (this.c < 0) {
            return B.size();
        }
        return B.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f.inflate(this.g, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.b.H() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        p1.a aVar = (p1.a) view;
        if (this.d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
