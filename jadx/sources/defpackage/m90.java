package defpackage;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.upi.axispay.R;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: AxisPay */
/* renamed from: m90  reason: default package */
/* loaded from: classes.dex */
public class m90 extends RecyclerView.h<a> {
    public ArrayList<String> d;
    public SparseBooleanArray e = new SparseBooleanArray();

    /* compiled from: AxisPay */
    /* renamed from: m90$a */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.d0 implements View.OnClickListener {
        public CheckedTextView v;

        public a(View view) {
            super(view);
            CheckedTextView checkedTextView = (CheckedTextView) view.findViewById(R.id.file_name);
            this.v = checkedTextView;
            checkedTextView.setOnClickListener(this);
        }

        public void O(int i) {
            if (!m90.this.e.get(i, false)) {
                this.v.setChecked(false);
            } else {
                this.v.setChecked(true);
            }
            this.v.setText(m90.this.d.get(i));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int k = k();
            if (!m90.this.e.get(k, false)) {
                this.v.setChecked(true);
                m90.this.e.put(k, true);
                return;
            }
            this.v.setChecked(false);
            m90.this.e.put(k, false);
        }
    }

    public m90(Context context, ArrayList<String> arrayList) {
        Collections.sort(arrayList);
        this.d = arrayList;
        LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<String> arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long f(int i) {
        return 0L;
    }

    public ArrayList<String> w() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < this.e.size(); i++) {
            int keyAt = this.e.keyAt(i);
            if (this.e.get(keyAt)) {
                arrayList.add(this.d.get(keyAt));
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public void l(a aVar, int i) {
        aVar.O(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: y */
    public a n(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.file_item, viewGroup, false));
    }
}
