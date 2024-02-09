package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: AxisPay */
/* renamed from: m1  reason: default package */
/* loaded from: classes.dex */
public abstract class m1 implements r1, o1, AdapterView.OnItemClickListener {
    public Rect b;

    public static h1 A(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (h1) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (h1) listAdapter;
    }

    public static int q(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean z(i1 i1Var) {
        int size = i1Var.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = i1Var.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.o1
    public void d(Context context, i1 i1Var) {
    }

    @Override // defpackage.o1
    public int getId() {
        return 0;
    }

    @Override // defpackage.o1
    public boolean k(i1 i1Var, k1 k1Var) {
        return false;
    }

    @Override // defpackage.o1
    public boolean l(i1 i1Var, k1 k1Var) {
        return false;
    }

    public abstract void n(i1 i1Var);

    public boolean o() {
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        A(listAdapter).b.O((MenuItem) listAdapter.getItem(i), this, o() ? 0 : 4);
    }

    public Rect p() {
        return this.b;
    }

    public abstract void r(View view);

    public void s(Rect rect) {
        this.b = rect;
    }

    public abstract void t(boolean z);

    public abstract void u(int i);

    public abstract void v(int i);

    public abstract void w(PopupWindow.OnDismissListener onDismissListener);

    public abstract void x(boolean z);

    public abstract void y(int i);
}
