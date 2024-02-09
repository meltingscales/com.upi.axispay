package defpackage;

import android.app.AlertDialog;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.kofigyan.stateprogressbar.StateProgressBar;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.CustomerBankAccounts;
import com.olive.upi.transport.model.SaveAccount;
import com.olive.upi.transport.model.SetProfile;
import com.upi.axispay.R;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.HashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: wf0  reason: default package */
/* loaded from: classes.dex */
public class wf0 extends xc0 implements View.OnClickListener, ua0.e {
    public static Account G;
    public String[] A;
    public ImageView B;
    public EditText l;
    public Button m;
    public Button n;
    public TextView o;
    public TextView p;
    public TextView q;
    public TextView r;
    public RadioGroup s;
    public RadioButton t;
    public String v;
    public LinearLayout y;
    public int u = 0;
    public boolean w = true;
    public boolean x = false;
    public ArrayList<String> z = new ArrayList<>();
    public int C = 1;
    public int D = 2;
    public int E = 3;
    public boolean F = false;

    /* compiled from: AxisPay */
    /* renamed from: wf0$a */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            wf0 wf0Var = wf0.this;
            wf0Var.L(wf0Var.E);
            if (editable.toString().length() == 0) {
                wf0.this.l.setHint(wf0.this.getString(R.string.enter_id));
            } else if (editable.toString().length() <= 30) {
                wf0.this.l.setHint(C0059ao.a(3573));
            } else {
                eg0.A(wf0.this.k(), wf0.this.getString(R.string.only_30_characters_allowed));
            }
            if (editable.toString().length() < 4) {
                wf0.this.H(1);
            } else if (wf0.this.v == null || !editable.toString().equals(wf0.this.v)) {
                boolean z = false;
                if (wf0.this.z != null && wf0.this.z.size() > 0) {
                    int i = 0;
                    while (true) {
                        if (i >= wf0.this.z.size()) {
                            break;
                        } else if (editable.toString().equals(((String) wf0.this.z.get(i)).split(C0059ao.a(3574))[0])) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (z) {
                    wf0.this.H(2);
                    wf0.this.o.setVisibility(4);
                    return;
                }
                wf0.this.H(1);
            } else {
                wf0.this.H(2);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: wf0$b */
    /* loaded from: classes.dex */
    public class b implements RadioGroup.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            View findViewById = radioGroup.findViewById(i);
            wf0.this.u = radioGroup.indexOfChild(findViewById);
            wf0.this.l.setText(((String) wf0.this.z.get(wf0.this.u)).split(C0059ao.a(3578))[0]);
            wf0 wf0Var = wf0.this;
            wf0Var.L(wf0Var.C);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: wf0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ AlertDialog b;

        public c(AlertDialog alertDialog) {
            this.b = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                this.b.dismiss();
                wf0.this.b.o(11, null);
            } catch (Exception unused) {
                this.b.dismiss();
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: wf0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            wf0.this.b.t(61, wf0.G);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: wf0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            wf0.this.b.o(11, null);
            eg0.c();
            if (n70.f.a().e(C0059ao.a(2113))) {
                return;
            }
            zg0.b(wf0.this.k());
        }
    }

    public static wf0 I() {
        return new wf0();
    }

    public final void H(int i) {
        if (i == 1) {
            this.n.setVisibility(0);
            this.m.setVisibility(8);
            this.x = false;
            this.w = true;
        } else if (i != 2) {
        } else {
            this.w = false;
            this.x = true;
            this.n.setVisibility(8);
            this.m.setVisibility(0);
        }
    }

    public final void J(View view) {
        EditText editText = (EditText) view.findViewById(R.id.vpaId);
        this.l = editText;
        editText.setMaxLines(1);
        this.l.setFilters(new InputFilter[]{new InputFilter.LengthFilter(31)});
        this.l.setHintTextColor(t8.d(k(), R.color.colorTextPrimary));
        this.A = getResources().getStringArray(R.array.state_list);
        Button button = (Button) view.findViewById(R.id.button_check_availability);
        this.n = button;
        button.setOnClickListener(this);
        this.o = (TextView) view.findViewById(R.id.text_result);
        this.p = (TextView) view.findViewById(R.id.upiid_not_avail);
        this.q = (TextView) view.findViewById(R.id.upiid_can_be);
        this.r = (TextView) view.findViewById(R.id.err_view);
        ImageView imageView = (ImageView) view.findViewById(R.id.edit_view);
        this.B = imageView;
        imageView.setOnClickListener(this);
        ((StateProgressBar) view.findViewById(R.id.stepper_indicator)).setStateDescriptionData(this.A);
        this.s = (RadioGroup) view.findViewById(R.id.myRadioGroup);
        this.y = (LinearLayout) view.findViewById(R.id.suggestLayout);
        Button button2 = (Button) view.findViewById(R.id.button_proceed);
        this.m = button2;
        button2.setOnClickListener(this);
        Account account = G;
        this.v = account == null ? null : account.getVpa();
        TextView textView = this.r;
        String a2 = C0059ao.a(4557);
        textView.setText(a2);
        if (!TextUtils.isEmpty(this.v)) {
            if (this.v.endsWith(a2)) {
                String str = this.v;
                this.v = str.substring(0, str.length() - 9);
            }
            this.l.setText(this.v);
            H(2);
            this.F = true;
        } else {
            String trim = n70.f.a().m(C0059ao.a(4558)).trim();
            if ((trim.length() == 12) && trim.startsWith(C0059ao.a(4559))) {
                trim = trim.substring(2, trim.length());
            } else {
                if (((trim.length() == 13) & trim.startsWith(C0059ao.a(4560))) || trim.startsWith(C0059ao.a(4561))) {
                    trim = trim.substring(3, trim.length());
                }
            }
            this.l.setText(trim);
            eg0.i(k());
            ua0.d().q(new OliveRequest(60, 30, new SetProfile(trim + a2, G.getAccRefNumber())));
        }
        this.l.addTextChangedListener(new a());
        this.s.setOnCheckedChangeListener(new b());
    }

    public void K(Account account) {
        G = account;
    }

    public void L(int i) {
        if (i == this.C) {
            this.o.setVisibility(0);
            this.o.setText(R.string.available_upi_id);
            this.o.setTextColor(t8.d(k(), R.color.transaction_success));
            this.q.setVisibility(8);
            this.p.setVisibility(8);
            this.p.setText(R.string.upi_id_not_available);
            this.p.setTextColor(t8.d(k(), R.color.red));
        } else if (i == this.D) {
            this.o.setVisibility(0);
            this.q.setVisibility(8);
            this.o.setText(R.string.available_upi_id);
            this.o.setTextColor(t8.d(k(), R.color.transaction_success));
            this.p.setVisibility(0);
            this.p.setTextColor(t8.d(k(), R.color.red));
        } else {
            this.q.setVisibility(0);
            this.o.setVisibility(8);
            this.o.setText(R.string.upiid_not_available_choose_below);
            this.o.setTextColor(t8.d(k(), R.color.red));
            this.p.setVisibility(8);
            this.p.setText(R.string.available_upi_id);
            this.p.setTextColor(t8.d(k(), R.color.red));
        }
    }

    public final void M(Account account) {
        AlertDialog.Builder builder = new AlertDialog.Builder(k());
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(k()).inflate(R.layout.dialog_set_vpa_success, (ViewGroup) null);
        ((TextView) linearLayout.findViewById(R.id.text_vpa)).setText(account.getVpa());
        builder.setView(linearLayout);
        AlertDialog create = builder.create();
        ((Button) linearLayout.findViewById(R.id.button_done)).setOnClickListener(new c(create));
        create.setCancelable(false);
        create.show();
    }

    public final void N(Account account) {
        eg0.r(k(), getString(R.string.confirmation), String.format(getString(R.string.pin_exist_for_account), Integer.valueOf(account.getdLength())), getString(R.string.reset_upi_pin_small), new d(), getString(R.string.continue_str), new e());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        String a2 = C0059ao.a(4562);
        if (id != R.id.button_check_availability) {
            if (id != R.id.button_proceed) {
                if (id != R.id.edit_view) {
                    return;
                }
                this.l.setFocusableInTouchMode(true);
                this.l.requestFocus();
                ((InputMethodManager) k().getSystemService(C0059ao.a(4563))).showSoftInput(this.l, 1);
                return;
            } else if (!this.x || this.w) {
                return;
            } else {
                eg0.i(k());
                SaveAccount saveAccount = new SaveAccount();
                saveAccount.setAccount(G);
                saveAccount.setVpa(((Object) this.l.getText()) + a2);
                ua0.d().q(new OliveRequest(60, 9, saveAccount));
                return;
            }
        }
        jg0.C(getView(), getContext());
        if (this.l.getText().toString().trim().length() < 4) {
            eg0.A(k(), getString(R.string.enter_id));
        } else if (this.l.getText().toString().length() > 30) {
            eg0.A(k(), getString(R.string.only_30_characters_allowed));
        } else {
            boolean z = this.w;
            if (!z) {
                if (!z) {
                    H(2);
                    L(this.C);
                    this.o.setVisibility(4);
                    return;
                }
                eg0.m(k(), getString(R.string.invalid_vpa));
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(C0059ao.a(4564), getString(R.string.set_upi_id));
            ah0.c(k(), C0059ao.a(4565), hashMap);
            eg0.i(k());
            ua0.d().q(new OliveRequest(60, 30, new SetProfile(((Object) this.l.getText()) + a2, G.getAccRefNumber())));
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_set_vpa, viewGroup, false);
        J(inflate);
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            if (oliveRequest.getRequestType() != 30) {
                eg0.B();
            } else {
                this.s.removeAllViews();
                ArrayList<String> arrayList = (ArrayList) result.getData();
                this.z = arrayList;
                if (arrayList != null && arrayList.size() > 0) {
                    if (!this.F) {
                        this.y.setVisibility(8);
                        this.l.setText(this.z.get(0).split(C0059ao.a(4566))[0]);
                        L(this.C);
                        H(2);
                        this.F = true;
                    } else {
                        L(this.D);
                        this.p.setText(result.getResult());
                        this.y.setVisibility(0);
                        H(1);
                    }
                    for (int i = 0; i < this.z.size(); i++) {
                        RadioButton radioButton = (RadioButton) LayoutInflater.from(k()).inflate(R.layout.radio_btn, (ViewGroup) null);
                        this.t = radioButton;
                        radioButton.setText(this.z.get(i));
                        if (Build.VERSION.SDK_INT > 16) {
                            this.t.setId(View.generateViewId());
                        }
                        this.s.addView(this.t);
                    }
                }
                eg0.B();
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(60, getString(R.string.set_upi_id));
        super.onResume();
        ua0.e(k()).u(this);
        this.y.setVisibility(8);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        String code = result.getCode();
        int requestType = oliveRequest.getRequestType();
        String a2 = C0059ao.a(4567);
        if (requestType != 9) {
            if (requestType == 15) {
                eg0.B();
                M(G);
            } else if (requestType != 30) {
                if (this.g == oliveRequest.getInitiator()) {
                    eg0.B();
                }
            } else {
                eg0.B();
                if (!this.F) {
                    this.F = true;
                }
                this.y.setVisibility(8);
                this.s.removeAllViews();
                if (code.equals(a2)) {
                    H(2);
                    return;
                }
                this.l.setText(C0059ao.a(4568));
                H(1);
            }
        } else if (code.equals(a2)) {
            MediaPlayer.create(getActivity(), (int) R.raw.upi_id_success_mogo_3_sec).start();
            Account account = G;
            account.setVpa(((Object) this.l.getText()) + C0059ao.a(4569));
            eg0.B();
            ArrayList<CustomerBankAccounts> arrayList = (ArrayList) result.getData();
            if (arrayList != null) {
                qa0.v().m0(arrayList, k());
            }
            if (account.getStatus().equalsIgnoreCase(C0059ao.a(4570))) {
                qa0.v().r0(60);
                N(account);
                return;
            }
            qa0.v().r0(60);
            this.b.t(61, G);
        } else {
            eg0.m(k(), result.getResult());
        }
    }
}
