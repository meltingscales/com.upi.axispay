package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.upi.axispay.R;
import com.upi.axispay.custom.NonScrollListView;

/* compiled from: AxisPay */
/* renamed from: ae0  reason: default package */
/* loaded from: classes.dex */
public class ae0 extends xc0 implements ng0 {
    public static ae0 x() {
        return new ae0();
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        NonScrollListView nonScrollListView = (NonScrollListView) layoutInflater.inflate(R.layout.fragment_mandate_request_received, viewGroup, false);
        ja0 ja0Var = new ja0(k());
        nonScrollListView.setLayoutManager(new LinearLayoutManager(k()));
        nonScrollListView.setAdapter(ja0Var);
        return nonScrollListView;
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
    }
}
