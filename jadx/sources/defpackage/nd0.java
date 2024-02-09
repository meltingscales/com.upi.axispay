package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.upi.axispay.R;
import defpackage.n70;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: nd0  reason: default package */
/* loaded from: classes.dex */
public class nd0 extends rd {

    /* compiled from: AxisPay */
    /* renamed from: nd0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a(nd0 nd0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void k(View view) {
        dismiss();
        n70.a aVar = n70.f;
        String m = aVar.a().m(C0059ao.a(15206));
        if (!TextUtils.isEmpty(m)) {
            eg0.o(getActivity(), getString(R.string.alert), m, getString(R.string.okay), new a(this));
        }
        aVar.a().A(C0059ao.a(15207), true);
    }

    public static nd0 l() {
        return new nd0();
    }

    @Override // defpackage.rd, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 2131952086);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_home_coach_mark_dialog, viewGroup, false);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(t8.d(getContext(), R.color.fadedBackgroundColor)));
        inflate.setOnClickListener(new View.OnClickListener() { // from class: qb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nd0.this.k(view);
            }
        });
        return inflate;
    }
}
