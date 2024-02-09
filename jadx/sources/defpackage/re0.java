package defpackage;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.material.tabs.TabLayout;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.OliveUpiManager;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.PendingReqVo;
import com.olive.upi.transport.model.TranHistory;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.activity.MainActivity;
import defpackage.n70;
import defpackage.qa0;
import defpackage.ua0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: re0  reason: default package */
/* loaded from: classes.dex */
public class re0 extends xc0 implements ua0.e, og0 {
    public String A;
    public String B;
    public String C;
    public int D;
    public TabLayout E;
    public ViewPager F;
    public ImageView G;
    public ImageView H;
    public Date I;
    public Calendar J;
    public Calendar K;
    public Calendar L;
    public t l;
    public uc0 n;
    public af0 o;
    public TransactionData p;
    public ArrayList<TranHistory> r;
    public TextView t;
    public TextView u;
    public String v;
    public String w;
    public String y;
    public String z;
    public HashSet<String> m = new HashSet<>();
    public ArrayList<PendingReqVo> q = new ArrayList<>();
    public ArrayList<TranHistory> s = new ArrayList<>();
    public int x = 0;

    /* compiled from: AxisPay */
    /* renamed from: re0$a */
    /* loaded from: classes.dex */
    public class a implements PopupMenu.OnMenuItemClickListener {
        public a(re0 re0Var) {
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            menuItem.getItemId();
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            re0.this.I(0);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            re0.this.I(1);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ Spinner b;

        public d(re0 re0Var, Spinner spinner) {
            this.b = spinner;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.performClick();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public final /* synthetic */ Spinner b;

        public e(re0 re0Var, Spinner spinner) {
            this.b = spinner;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.performClick();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public final /* synthetic */ Spinner b;

        public f(re0 re0Var, Spinner spinner) {
            this.b = spinner;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.performClick();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$g */
    /* loaded from: classes.dex */
    public class g implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ Spinner b;
        public final /* synthetic */ Spinner c;

        public g(Spinner spinner, Spinner spinner2) {
            this.b = spinner;
            this.c = spinner2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            qa0.e eVar = qa0.e.ALL;
            ArrayList arrayList2 = new ArrayList();
            if (i == 1) {
                qa0.e eVar2 = qa0.e.VPA;
                arrayList2.add(re0.this.getString(R.string.all));
                arrayList2.add(re0.this.getString(R.string.send_transaction));
                arrayList2.add(re0.this.getString(R.string.received_transaction));
                re0 re0Var = re0.this;
                arrayList.addAll(re0Var.C(eVar2, re0Var.m));
            } else if (i == 2) {
                qa0.e eVar3 = qa0.e.IFSC;
                arrayList2.add(re0.this.getString(R.string.send_transaction));
                re0 re0Var2 = re0.this;
                arrayList.addAll(re0Var2.C(eVar3, re0Var2.m));
            } else if (i != 3) {
                arrayList2.add(re0.this.getString(R.string.all));
                arrayList2.add(re0.this.getString(R.string.send_transaction));
                arrayList2.add(re0.this.getString(R.string.received_transaction));
                re0 re0Var3 = re0.this;
                arrayList.addAll(re0Var3.C(eVar, re0Var3.m));
            } else {
                qa0.e eVar4 = qa0.e.AADHAAR;
                arrayList2.add(re0.this.getString(R.string.send_transaction));
                re0 re0Var4 = re0.this;
                arrayList.addAll(re0Var4.C(eVar4, re0Var4.m));
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(re0.this.k(), 17367048, arrayList);
            arrayAdapter.setDropDownViewResource(17367049);
            this.b.setAdapter((SpinnerAdapter) arrayAdapter);
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(re0.this.k(), 17367048, arrayList2);
            arrayAdapter2.setDropDownViewResource(17367049);
            this.c.setAdapter((SpinnerAdapter) arrayAdapter2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$h */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public final /* synthetic */ Spinner b;

        public h(re0 re0Var, Spinner spinner) {
            this.b = spinner;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.performClick();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$i */
    /* loaded from: classes.dex */
    public class i implements View.OnClickListener {
        public final /* synthetic */ AlertDialog b;

        public i(AlertDialog alertDialog) {
            this.b = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            re0 re0Var = re0.this;
            re0Var.K(re0Var.r);
            this.b.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$j */
    /* loaded from: classes.dex */
    public class j implements DatePickerDialog.OnDateSetListener {
        public final /* synthetic */ TextView b;

        public j(re0 re0Var, TextView textView) {
            this.b = textView;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, i);
            calendar.set(2, i2);
            calendar.set(5, i3);
            this.b.setText(jg0.x(calendar.getTime(), C0059ao.a(1299)));
            this.b.clearFocus();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$k */
    /* loaded from: classes.dex */
    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            re0.this.J();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$l */
    /* loaded from: classes.dex */
    public class l implements TabLayout.d {
        public l() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
            jg0.T(re0.this.E, gVar.g(), 0);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
            jg0.T(re0.this.E, gVar.g(), 1);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$m */
    /* loaded from: classes.dex */
    public class m implements ViewPager.j {
        public m() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i) {
            re0 re0Var = re0.this;
            re0Var.x = i;
            re0Var.G(i);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$n */
    /* loaded from: classes.dex */
    public class n implements View.OnClickListener {
        public n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            re0.this.J();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$o */
    /* loaded from: classes.dex */
    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            re0.this.A(view);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$p */
    /* loaded from: classes.dex */
    public class p implements View.OnClickListener {
        public p(re0 re0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$q */
    /* loaded from: classes.dex */
    public class q implements View.OnClickListener {
        public q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            re0.this.b.o(11, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$r */
    /* loaded from: classes.dex */
    public class r implements View.OnClickListener {
        public r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            re0.this.b.o(11, null);
            re0 re0Var = re0.this;
            re0Var.b.t(118, re0Var.p.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$s */
    /* loaded from: classes.dex */
    public class s implements View.OnClickListener {
        public s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            re0.this.b.o(11, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: re0$t */
    /* loaded from: classes.dex */
    public class t extends he {
        public final List<Fragment> j;
        public final List<String> k;

        public t(re0 re0Var, FragmentManager fragmentManager) {
            super(fragmentManager);
            this.j = new ArrayList();
            this.k = new ArrayList();
        }

        @Override // defpackage.no
        public int d() {
            return this.j.size();
        }

        @Override // defpackage.no
        public int e(Object obj) {
            return -2;
        }

        @Override // defpackage.no
        public CharSequence f(int i) {
            return this.k.get(i);
        }

        @Override // defpackage.he
        public Fragment t(int i) {
            return this.j.get(i);
        }

        public void u(Fragment fragment, String str) {
            this.j.add(fragment);
            this.k.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void E(Spinner spinner, Spinner spinner2, Spinner spinner3, Spinner spinner4, AlertDialog alertDialog, View view) {
        String a2;
        String obj = spinner.getSelectedItem().toString();
        String obj2 = spinner2.getSelectedItem() != null ? spinner2.getSelectedItem().toString() : C0059ao.a(2365);
        int selectedItemPosition = spinner3.getSelectedItemPosition();
        String obj3 = spinner4.getSelectedItem().toString();
        if (obj3.equalsIgnoreCase(getString(R.string.transaction_success))) {
            a2 = C0059ao.a(2366);
        } else if (obj3.equalsIgnoreCase(getString(R.string.transaction_pendings))) {
            a2 = C0059ao.a(2367);
        } else if (obj3.equalsIgnoreCase(getString(R.string.transaction_failedd))) {
            a2 = C0059ao.a(2368);
        } else if (obj3.equalsIgnoreCase(getString(R.string.transaction_decline))) {
            a2 = C0059ao.a(2369);
        } else if (obj3.equalsIgnoreCase(getString(R.string.transaction_expire))) {
            a2 = C0059ao.a(2370);
        } else {
            a2 = obj3.equalsIgnoreCase(getString(R.string.transaction_block)) ? C0059ao.a(2371) : C0059ao.a(2372);
        }
        String str = a2;
        String charSequence = this.t.getText().toString();
        String a3 = C0059ao.a(2373);
        Date h2 = jg0.h(charSequence, a3);
        Date h3 = jg0.h(this.u.getText().toString(), a3);
        if (h2 == null || h3 == null) {
            return;
        }
        if ((h3.getTime() - h2.getTime()) / 86400000 > 30) {
            eg0.m(k(), getString(R.string.you_can_view_for_30days));
        } else if (h2.before(this.I)) {
            String x = jg0.x(h2, a3);
            String a4 = C0059ao.a(2374);
            String a5 = C0059ao.a(2375);
            String replace = x.replace(a4, a5);
            String replace2 = jg0.x(jg0.h(this.u.getText().toString(), a3), a3).replace(a4, a5);
            this.I = h2;
            this.y = this.t.getText().toString();
            this.z = this.u.getText().toString();
            this.A = obj;
            this.B = obj2;
            this.D = selectedItemPosition;
            this.C = str;
            eg0.i(k());
            ua0.d().c(replace, replace2, null, true, true);
            alertDialog.dismiss();
        } else {
            this.I = h2;
            B(this.t.getText().toString(), this.u.getText().toString(), obj, obj2, selectedItemPosition, str);
            alertDialog.dismiss();
        }
    }

    public static re0 F() {
        return new re0();
    }

    public void A(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            PopupMenu popupMenu = new PopupMenu(k(), view, 48);
            popupMenu.getMenuInflater().inflate(R.menu.menu_sort, popupMenu.getMenu());
            try {
                Field declaredField = d3.class.getDeclaredField(C0059ao.a(2376));
                declaredField.setAccessible(true);
                Object obj = declaredField.get(popupMenu);
                obj.getClass().getDeclaredMethod(C0059ao.a(2377), Boolean.TYPE).invoke(obj, Boolean.TRUE);
            } catch (Exception unused) {
            }
            popupMenu.show();
            popupMenu.setOnMenuItemClickListener(new a(this));
        }
    }

    public final void B(String str, String str2, String str3, String str4, int i2, String str5) {
        ArrayList<TranHistory> arrayList = new ArrayList<>();
        Iterator<TranHistory> it = this.r.iterator();
        while (it.hasNext()) {
            TranHistory next = it.next();
            String debitVpa = next.getDebitVpa();
            String creditVpa = next.getCreditVpa();
            String type = next.getType();
            String status = next.getStatus();
            String dateTime = next.getDateTime();
            String a2 = creditVpa.endsWith(C0059ao.a(2378)) ? C0059ao.a(2379) : C0059ao.a(2380);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(jg0.h(dateTime, C0059ao.a(2381)));
            calendar.set(10, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(9, 0);
            Calendar calendar2 = Calendar.getInstance();
            String a3 = C0059ao.a(2382);
            ArrayList<TranHistory> arrayList2 = arrayList;
            Iterator<TranHistory> it2 = it;
            calendar2.setTime(jg0.h(str, a3));
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTime(jg0.h(str2, a3));
            boolean z = true;
            boolean z2 = calendar.compareTo(calendar2) >= 0 && calendar.compareTo(calendar3) <= 0;
            boolean equals = str3.equalsIgnoreCase(getString(R.string.all)) ? true : a2.equals(str3);
            boolean z3 = str4.equalsIgnoreCase(getString(R.string.all)) || debitVpa.equals(str4) || creditVpa.equals(str4);
            type.equals(C0059ao.a(2383));
            boolean z4 = i2 == 0 || (i2 == 1 && qa0.v().d(debitVpa) != null) || (i2 == 2 && qa0.v().d(creditVpa) != null);
            if (!str5.equals(C0059ao.a(2384)) && !status.equalsIgnoreCase(str5)) {
                z = false;
            }
            if (z2 && equals && z3 && z4 && z) {
                arrayList = arrayList2;
                arrayList.add(next);
            } else {
                arrayList = arrayList2;
            }
            it = it2;
        }
        K(arrayList);
        this.y = null;
        this.z = null;
    }

    public ArrayList<String> C(qa0.e eVar, HashSet<String> hashSet) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (hashSet == null) {
            return null;
        }
        arrayList.clear();
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            String next = it.next();
            qa0.e eVar2 = qa0.e.IFSC;
            String a2 = C0059ao.a(2385);
            if (eVar == eVar2) {
                if (next.endsWith(a2)) {
                    arrayList.add(next);
                }
            } else {
                qa0.e eVar3 = qa0.e.AADHAAR;
                String a3 = C0059ao.a(2386);
                if (eVar == eVar3) {
                    if (next.endsWith(a3)) {
                        arrayList.add(next);
                    }
                } else if (eVar == qa0.e.VPA) {
                    if (!next.endsWith(a2) && !next.endsWith(a3)) {
                        arrayList.add(next);
                    }
                } else {
                    arrayList.add(next);
                }
            }
        }
        arrayList.add(0, getString(R.string.all));
        return arrayList;
    }

    public final void G(int i2) {
        if (i2 == 0) {
            this.b.o(90, new tg0(getString(R.string.my_transactions), false, true, false, false));
            this.G.setVisibility(8);
            this.H.setVisibility(0);
            this.H.setOnClickListener(new n());
            M(0);
        } else if (i2 != 1) {
        } else {
            this.H.setVisibility(8);
            this.G.setVisibility(8);
            this.G.setOnClickListener(new o());
            getString(R.string.pending_request);
            this.b.o(90, new tg0(getString(R.string.pending_requests), false, true, false, false));
            M(1);
        }
    }

    public final void H(ViewPager viewPager) {
        if (this.l == null) {
            this.l = new t(this, getChildFragmentManager());
        }
        this.G.setVisibility(8);
        this.H.setVisibility(0);
        this.H.setOnClickListener(new k());
        uc0 uc0Var = this.n;
        if (uc0Var == null) {
            uc0 x = uc0.x(this.s);
            this.n = x;
            t(x);
            this.l.u(this.n, getString(R.string.all_transactions));
        } else {
            uc0Var.A(this.s);
        }
        af0 af0Var = this.o;
        if (af0Var == null) {
            af0 B = af0.B(this.q);
            this.o = B;
            t(B);
            this.l.u(this.o, getString(R.string.pending_requests));
        } else {
            af0Var.H(this.q);
        }
        this.n.y(this);
        this.o.E(this);
        this.o.D(1);
        viewPager.setAdapter(this.l);
        this.E.K(viewPager, true);
        this.E.d(new l());
        viewPager.addOnPageChangeListener(new m());
        G(this.x);
    }

    public final void I(int i2) {
        TextView textView;
        if (i2 == 0) {
            textView = this.t;
            Calendar calendar = Calendar.getInstance();
            calendar.add(1, -1);
            this.J = calendar;
            Calendar calendar2 = Calendar.getInstance();
            this.K = calendar2;
            this.L = calendar2;
        } else {
            Date h2 = jg0.h(this.t.getText().toString(), C0059ao.a(2387));
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTime(h2);
            this.J = calendar3;
            Calendar calendar4 = Calendar.getInstance();
            calendar4.setTime(h2);
            calendar4.add(5, 30);
            Calendar calendar5 = Calendar.getInstance();
            this.L = calendar5;
            if (calendar4.compareTo(calendar5) > 0) {
                this.K = this.L;
            } else {
                this.K = calendar4;
            }
            textView = this.u;
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(k(), new j(this, textView), this.L.get(1), this.L.get(2), this.L.get(5));
        datePickerDialog.getDatePicker().setMinDate(this.J.getTime().getTime());
        datePickerDialog.getDatePicker().setMaxDate(this.K.getTime().getTime());
        datePickerDialog.show();
    }

    public void J() {
        AlertDialog.Builder builder = new AlertDialog.Builder(k());
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(k()).inflate(R.layout.dialog_filter_by, (ViewGroup) null);
        this.t = (TextView) linearLayout.findViewById(R.id.from_date);
        TextView textView = (TextView) linearLayout.findViewById(R.id.to_date);
        this.u = textView;
        Date time = this.K.getTime();
        String a2 = C0059ao.a(2388);
        textView.setText(jg0.x(time, a2));
        this.t.setText(jg0.x(this.I, a2));
        Iterator<TranHistory> it = this.r.iterator();
        while (it.hasNext()) {
            TranHistory next = it.next();
            this.m.add(next.getCreditVpa());
            this.m.add(next.getDebitVpa());
        }
        ((LinearLayout) linearLayout.findViewById(R.id.frompay_date_layout)).setOnClickListener(new b());
        ((LinearLayout) linearLayout.findViewById(R.id.topay_date_layout)).setOnClickListener(new c());
        final Spinner spinner = (Spinner) linearLayout.findViewById(R.id.spinner_payment_mode);
        ((LinearLayout) linearLayout.findViewById(R.id.vpa_layout)).setOnClickListener(new d(this, spinner));
        final Spinner spinner2 = (Spinner) linearLayout.findViewById(R.id.spinner_connection);
        ((LinearLayout) linearLayout.findViewById(R.id.layout_connection)).setOnClickListener(new e(this, spinner2));
        final Spinner spinner3 = (Spinner) linearLayout.findViewById(R.id.spinner_transaction_type);
        ((LinearLayout) linearLayout.findViewById(R.id.layout_txntype)).setOnClickListener(new f(this, spinner3));
        spinner.setOnItemSelectedListener(new g(spinner2, spinner3));
        final Spinner spinner4 = (Spinner) linearLayout.findViewById(R.id.spinner_transaction_status);
        ((LinearLayout) linearLayout.findViewById(R.id.layout_status)).setOnClickListener(new h(this, spinner4));
        builder.setView(linearLayout);
        final AlertDialog create = builder.create();
        ((Button) linearLayout.findViewById(R.id.button_apply)).setOnClickListener(new View.OnClickListener() { // from class: jc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                re0.this.E(spinner, spinner2, spinner3, spinner4, create, view);
            }
        });
        ((Button) linearLayout.findViewById(R.id.button_reset)).setOnClickListener(new i(create));
        create.setCancelable(false);
        create.show();
    }

    public void K(ArrayList<TranHistory> arrayList) {
        this.s = arrayList;
        this.n.A(arrayList);
    }

    public void L(ArrayList<PendingReqVo> arrayList) {
        this.q = arrayList;
        this.o.H(arrayList);
        qa0.v().q0(this.q, getContext());
        this.b.o(10, null);
    }

    public final void M(int i2) {
        if (i2 == 0) {
            this.H.setVisibility(0);
            this.n.z(true);
            ua0.d().c(this.v, this.w, null, false, false);
            return;
        }
        this.b.o(90, new tg0(getString(R.string.my_transactions), false, true, false, false));
        this.H.setVisibility(8);
        this.o.G(true);
        ua0.d().q(new OliveRequest(44, 27, null));
    }

    @Override // defpackage.og0
    public void i(int i2) {
        M(i2);
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i2, Object obj) {
        if (i2 != 24) {
            return;
        }
        eg0.i(k());
        ua0.e(k()).q(new OliveRequest(44, 24, obj));
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.r = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(5, -30);
        this.J = calendar2;
        this.I = calendar2.getTime();
        this.K = calendar;
        Date time = calendar2.getTime();
        String a2 = C0059ao.a(2389);
        String x = jg0.x(time, a2);
        String a3 = C0059ao.a(2390);
        String a4 = C0059ao.a(2391);
        this.v = x.replace(a3, a4);
        this.w = jg0.x(calendar.getTime(), a2).replace(a3, a4);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_my_transaction, viewGroup, false);
        this.F = (ViewPager) inflate.findViewById(R.id.viewpager);
        this.E = (TabLayout) inflate.findViewById(R.id.tabs);
        this.H = (ImageView) inflate.findViewById(R.id.image_tran_filter);
        this.G = (ImageView) inflate.findViewById(R.id.image_sort);
        this.H.setVisibility(0);
        this.G.setVisibility(8);
        ua0.e(k()).u(this);
        H(this.F);
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            String code = result != null ? result.getCode() : C0059ao.a(2392);
            int requestType = oliveRequest.getRequestType();
            if (requestType == 10 || requestType == 24) {
                this.b.o(301, null);
                this.p = qa0.v().L();
                eg0.B();
                if (!TextUtils.isEmpty(this.p.getRemitterVpa())) {
                    this.p.getAccount().setVpa(this.p.getRemitterVpa().toLowerCase());
                }
                if (code.equals(C0059ao.a(2393))) {
                    if (oliveRequest.getRequestType() == 10) {
                        eg0.o(k(), getString(R.string.alert), getString(R.string.transaction_failed_wrong_pin), getString(R.string.okay), new q());
                        return;
                    } else {
                        eg0.m(k(), getString(R.string.transaction_failed_wrong_pin));
                        return;
                    }
                } else if (code.equals(C0059ao.a(2394))) {
                    eg0.o(k(), getString(R.string.alert), getString(R.string.transaction_failed_max_retry), getString(R.string.okay), new r());
                    return;
                } else if (code.equals(C0059ao.a(2395))) {
                    if (oliveRequest.getRequestType() == 10) {
                        eg0.q(k(), getString(R.string.alert), result.getResult(), getString(R.string.okay), new s(), true);
                        return;
                    } else {
                        eg0.m(k(), result.getResult());
                        return;
                    }
                } else {
                    String lastTransactionId = OliveUpiManager.getInstance(k()).getLastTransactionId();
                    this.p.setTransactionId(lastTransactionId);
                    if (result.getData() != null) {
                        String obj = result.getData().toString();
                        this.p.setRefid(lastTransactionId);
                        this.p.setApprovalRefNo(obj);
                    } else {
                        this.p.setRefid(lastTransactionId);
                    }
                    this.p.setResponseCode(code);
                    this.p.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(2396)));
                    this.p.setTransactionStatus(1);
                    this.p.setDescription(result.getResult());
                    qa0.v().u0(this.p);
                    if (this.b == null) {
                        this.b = (MainActivity) getActivity();
                    }
                    this.b.t(24, this.p);
                }
            } else if (requestType == 52) {
                eg0.B();
                this.b.o(301, null);
            } else if (requestType == 26) {
                eg0.B();
                if (qa0.v().K() != null && qa0.v().K().size() > 0) {
                    K(qa0.v().K());
                }
            } else if (requestType != 27) {
                eg0.B();
            } else {
                eg0.B();
                this.o.F();
                this.o.G(false);
            }
        } else if (oliveRequest.getRequestType() == 27) {
            this.o.F();
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(44, getString(R.string.my_transactions));
        super.onResume();
        ua0.e(k()).u(this);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        NotificationManager notificationManager;
        int requestType = oliveRequest.getRequestType();
        if (requestType == -100) {
            eg0.B();
            if (TextUtils.isEmpty(((MainActivity) k()).q0())) {
                return;
            }
            n70.f.a().v(C0059ao.a(2406), 3);
            return;
        }
        String a2 = C0059ao.a(2397);
        if (requestType != 10 && requestType != 24) {
            if (requestType == 29) {
                eg0.B();
                this.b.o(301, null);
                eg0.A(k(), getString(R.string.notification_reject_success));
                L((ArrayList) result.getData());
                return;
            } else if (requestType == 626) {
                this.r = (ArrayList) result.getData();
                B(this.y, this.z, this.A, this.B, this.D, this.C);
                eg0.B();
                return;
            } else if (requestType == 26) {
                eg0.B();
                this.n.z(false);
                ArrayList<TranHistory> arrayList = (ArrayList) result.getData();
                this.r = arrayList;
                K(arrayList);
                return;
            } else if (requestType == 27) {
                eg0.B();
                this.o.G(false);
                L((ArrayList) result.getData());
                return;
            } else if (requestType != 52) {
                if (requestType != 53) {
                    if (this.g == oliveRequest.getInitiator()) {
                        eg0.B();
                        return;
                    }
                    return;
                }
                eg0.B();
                this.b.o(301, null);
                qa0.v().X((ArrayList) result.getData());
                return;
            } else {
                this.b.o(301, null);
                eg0.n(k(), getString(R.string.decline_and_block), new p(this));
                ua0.d().q(new OliveRequest(44, 27, null));
                ua0.d().a(true, new OliveRequest(44, 53, null, true));
                NotificationManager notificationManager2 = (NotificationManager) k().getSystemService(a2);
                if (notificationManager2 != null) {
                    notificationManager2.cancelAll();
                    return;
                }
                return;
            }
        }
        ua0.d().q(new OliveRequest(44, 27, null));
        this.p = qa0.v().L();
        String lastTransactionId = OliveUpiManager.getInstance(k()).getLastTransactionId();
        this.p.setApprovalRefNo(result.getCode());
        this.p.setResponseCode(result.getCode());
        String str = (String) result.getData();
        if (result.getData() != null && !TextUtils.isEmpty(str)) {
            this.p.setTransactionId(lastTransactionId);
            this.p.setRefid(str);
        } else {
            this.p.setTransactionId(lastTransactionId);
        }
        this.p.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(2398)));
        this.p.setTransactionStatus(10);
        this.p.setDescription(result.getResult());
        qa0.v().u0(this.p);
        n70.a aVar = n70.f;
        n70 a3 = aVar.a();
        StringBuilder sb = new StringBuilder();
        n70 a4 = aVar.a();
        String a5 = C0059ao.a(2399);
        sb.append(a4.m(a5));
        sb.append(1);
        a3.y(a5, sb.toString());
        aVar.a().A(C0059ao.a(2400), false);
        eg0.B();
        HashMap hashMap = new HashMap();
        hashMap.put(C0059ao.a(2401), getString(R.string.pending_request));
        hashMap.put(C0059ao.a(2403), this.p.getAmount() != null ? jg0.l(this.p.getAmount()) : C0059ao.a(2402));
        Account account = this.p.getAccount();
        if (account != null) {
            hashMap.put(C0059ao.a(2404), jg0.n(account.getBankName()));
        }
        z k2 = k();
        String a6 = C0059ao.a(2405);
        ah0.d(k2, a6, hashMap, true);
        Product product = new Product();
        product.setName(a6);
        product.setPrice(this.p.getAmount().doubleValue());
        product.setId(this.p.getRefid());
        if (account != null) {
            product.setBrand(account.getBankName());
        }
        this.b.o(301, null);
        ah0.e(k(), a6, product, hashMap);
        if (oliveRequest.getRequestType() == 24 && (notificationManager = (NotificationManager) k().getSystemService(a2)) != null) {
            notificationManager.cancelAll();
        }
        if (!TextUtils.isEmpty(this.p.getRemitterVpa())) {
            this.p.getAccount().setVpa(this.p.getRemitterVpa().toLowerCase());
        }
        this.b.t(24, this.p);
    }
}
