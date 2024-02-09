package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.upi.axispay.R;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: x90  reason: default package */
/* loaded from: classes.dex */
public class x90 extends BaseAdapter {
    public ArrayList<o70> b;
    public LayoutInflater c;

    /* compiled from: AxisPay */
    /* renamed from: x90$a */
    /* loaded from: classes.dex */
    public static class a {
        public ImageView a;
        public TextView b;

        public a(View view) {
            this.a = (ImageView) view.findViewById(R.id.bank_pop_image);
            this.b = (TextView) view.findViewById(R.id.bank_pop_name);
            this.a.setVisibility(8);
        }
    }

    public x90(Context context, ArrayList<o70> arrayList) {
        this.b = arrayList;
        this.c = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public o70 getItem(int i) {
        ArrayList<o70> arrayList = this.b;
        if (arrayList == null) {
            return null;
        }
        return arrayList.get(i);
    }

    public void b(ArrayList<o70> arrayList) {
        this.b = arrayList;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<o70> arrayList = this.b;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = this.c.inflate(R.layout.bank_pop_up_single_row, (ViewGroup) null);
            aVar = new a(view);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.b.setText(this.b.get(i).c());
        return view;
    }
}
