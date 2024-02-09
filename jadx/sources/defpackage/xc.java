package defpackage;

import android.widget.ListView;

/* compiled from: AxisPay */
/* renamed from: xc  reason: default package */
/* loaded from: classes.dex */
public class xc extends sc {
    public final ListView t;

    public xc(ListView listView) {
        super(listView);
        this.t = listView;
    }

    @Override // defpackage.sc
    public boolean a(int i) {
        return false;
    }

    @Override // defpackage.sc
    public boolean b(int i) {
        ListView listView = this.t;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.sc
    public void j(int i, int i2) {
        yc.b(this.t, i2);
    }
}
