package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import defpackage.gd;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: fd  reason: default package */
/* loaded from: classes.dex */
public abstract class fd extends BaseAdapter implements Filterable, gd.a {
    public boolean b;
    public boolean c;
    public Cursor d;
    public Context e;
    public int f;
    public a g;
    public DataSetObserver h;
    public gd i;

    /* compiled from: AxisPay */
    /* renamed from: fd$a */
    /* loaded from: classes.dex */
    public class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            fd.this.i();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: fd$b */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            fd fdVar = fd.this;
            fdVar.b = true;
            fdVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            fd fdVar = fd.this;
            fdVar.b = false;
            fdVar.notifyDataSetInvalidated();
        }
    }

    public fd(Context context, Cursor cursor, boolean z) {
        f(context, cursor, z ? 1 : 2);
    }

    @Override // defpackage.gd.a
    public void a(Cursor cursor) {
        Cursor j = j(cursor);
        if (j != null) {
            j.close();
        }
    }

    @Override // defpackage.gd.a
    public Cursor b() {
        return this.d;
    }

    @Override // defpackage.gd.a
    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    public void f(Context context, Cursor cursor, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.c = true;
        } else {
            this.c = false;
        }
        boolean z = cursor != null;
        this.d = cursor;
        this.b = z;
        this.e = context;
        this.f = z ? cursor.getColumnIndexOrThrow(C0059ao.a(5717)) : -1;
        if ((i & 2) == 2) {
            this.g = new a();
            this.h = new b();
        } else {
            this.g = null;
            this.h = null;
        }
        if (z) {
            a aVar = this.g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.b || (cursor = this.d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.b) {
            this.d.moveToPosition(i);
            if (view == null) {
                view = g(this.e, this.d, viewGroup);
            }
            e(view, this.e, this.d);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.i == null) {
            this.i = new gd(this);
        }
        return this.i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.b || (cursor = this.d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.b && (cursor = this.d) != null && cursor.moveToPosition(i)) {
            return this.d.getLong(this.f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.b) {
            if (this.d.moveToPosition(i)) {
                if (view == null) {
                    view = h(this.e, this.d, viewGroup);
                }
                e(view, this.e, this.d);
                return view;
            }
            throw new IllegalStateException(C0059ao.a(5718) + i);
        }
        throw new IllegalStateException(C0059ao.a(5719));
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    public void i() {
        Cursor cursor;
        if (!this.c || (cursor = this.d) == null || cursor.isClosed()) {
            return;
        }
        this.b = this.d.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.g;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.d = cursor;
        if (cursor != null) {
            a aVar2 = this.g;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f = cursor.getColumnIndexOrThrow(C0059ao.a(5720));
            this.b = true;
            notifyDataSetChanged();
        } else {
            this.f = -1;
            this.b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
