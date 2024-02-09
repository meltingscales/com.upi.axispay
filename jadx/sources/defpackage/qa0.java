package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.Bank;
import com.olive.upi.transport.model.Banner;
import com.olive.upi.transport.model.BannerOffersVo;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.BillPayDataMaxAmount;
import com.olive.upi.transport.model.BillerChargeReq;
import com.olive.upi.transport.model.Collectbeneblock;
import com.olive.upi.transport.model.CustomerBankAccounts;
import com.olive.upi.transport.model.DTHOperator;
import com.olive.upi.transport.model.GCMMessage;
import com.olive.upi.transport.model.Inbox;
import com.olive.upi.transport.model.Mandate;
import com.olive.upi.transport.model.MandateTransactionData;
import com.olive.upi.transport.model.MandatesVo;
import com.olive.upi.transport.model.MasterUpdate;
import com.olive.upi.transport.model.OperatorsLogos;
import com.olive.upi.transport.model.PendingReqVo;
import com.olive.upi.transport.model.RecentBPTHistory;
import com.olive.upi.transport.model.TranHistory;
import com.olive.upi.transport.model.TransactionData;
import com.olive.upi.transport.model.UrlConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: qa0  reason: default package */
/* loaded from: classes.dex */
public class qa0 {
    public static qa0 C;
    public Bank A;
    public MandateTransactionData B;
    public ArrayList<CustomerBankAccounts> a;
    public ArrayList<BeneVpa> b;
    public ArrayList<MandatesVo> c;
    public ArrayList<Banner> d;
    public TransactionData e;
    public dg0 g;
    public ArrayList<OperatorsLogos> h;
    public ArrayList<DTHOperator> i;
    public ArrayList<Collectbeneblock> j;
    public ArrayList<Bank> m;
    public ArrayList<TranHistory> n;
    public ArrayList<TranHistory> o;
    public ArrayList<PendingReqVo> p;
    public GCMMessage q;
    public int r;
    public MasterUpdate s;
    public BillPayDataMaxAmount t;
    public Mandate u;
    public sg0 v;
    public ArrayList<RecentBPTHistory> w;
    public ArrayList<RecentBPTHistory> x;
    public BillerChargeReq y;
    public ArrayList<TranHistory> z;
    public boolean f = false;
    public ArrayList<GCMMessage> k = new ArrayList<>();
    public e l = e.VPA;

    /* compiled from: AxisPay */
    /* renamed from: qa0$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<BeneVpa> {
        public a(qa0 qa0Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(BeneVpa beneVpa, BeneVpa beneVpa2) {
            return beneVpa.getName().compareTo(beneVpa2.getName());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qa0$b */
    /* loaded from: classes.dex */
    public class b implements Comparator<PendingReqVo> {
        public b(qa0 qa0Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(PendingReqVo pendingReqVo, PendingReqVo pendingReqVo2) {
            String expdate = pendingReqVo.getExpdate();
            String a = C0059ao.a(14510);
            Date h = jg0.h(expdate, a);
            Date h2 = jg0.h(pendingReqVo2.getExpdate(), a);
            if (h == null || h2 == null) {
                return 0;
            }
            if (h.getTime() > h2.getTime()) {
                return 1;
            }
            return h.getTime() == h2.getTime() ? 0 : -1;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qa0$c */
    /* loaded from: classes.dex */
    public enum c {
        ALL,
        ACTIVE,
        WITH_VPA,
        ACTIVE_VPA
    }

    /* compiled from: AxisPay */
    /* renamed from: qa0$d */
    /* loaded from: classes.dex */
    public enum d {
        ACTIVE,
        CANCELLED,
        FAILED,
        P,
        COMPLETED,
        PENDING
    }

    /* compiled from: AxisPay */
    /* renamed from: qa0$e */
    /* loaded from: classes.dex */
    public enum e {
        ALL,
        VPA,
        IFSC,
        AADHAAR
    }

    public static void d0(qa0 qa0Var) {
        C = qa0Var;
    }

    public static qa0 v() {
        if (C == null) {
            C = new qa0();
        }
        return C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x018f, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0195, code lost:
        if (r3.equalsIgnoreCase(r4) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0197, code lost:
        r14.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01e1, code lost:
        if (r3.equalsIgnoreCase(r6) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01e7, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01ed, code lost:
        if (r3.equalsIgnoreCase(r5) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01f3, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01f9, code lost:
        if (r3.equalsIgnoreCase(r4) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01fb, code lost:
        r14.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0115, code lost:
        if (r3.equalsIgnoreCase(r7) != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011b, code lost:
        if (r3.equalsIgnoreCase(r6) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0125, code lost:
        if (android.text.TextUtils.isEmpty(r1.getShareToPayee()) != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012f, code lost:
        if (r1.getShareToPayee().equalsIgnoreCase(r5) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0131, code lost:
        if (r9 == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0133, code lost:
        if (r4 == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0135, code lost:
        r14.add(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<com.olive.upi.transport.model.MandatesVo> A(defpackage.qa0.d r13, android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa0.A(qa0$d, android.content.Context):java.util.ArrayList");
    }

    public MasterUpdate B() {
        return this.s;
    }

    public ArrayList<RecentBPTHistory> C() {
        return this.w;
    }

    public ArrayList<OperatorsLogos> D() {
        return this.h;
    }

    public ArrayList<CustomerBankAccounts> E() {
        return this.a;
    }

    public ArrayList<BeneVpa> F() {
        return this.b;
    }

    public ArrayList<TranHistory> G() {
        return this.z;
    }

    public ArrayList<PendingReqVo> H() {
        return this.p;
    }

    public int I() {
        return this.r;
    }

    public Bank J() {
        return this.A;
    }

    public ArrayList<TranHistory> K() {
        return this.n;
    }

    public TransactionData L() {
        if (this.e == null) {
            this.e = new TransactionData();
        }
        return this.e;
    }

    public e M() {
        return this.l;
    }

    public ArrayList<BeneVpa> N(e eVar) {
        if (this.b == null) {
            return null;
        }
        ArrayList<BeneVpa> arrayList = new ArrayList<>();
        Collections.sort(this.b, new a(this));
        Iterator<BeneVpa> it = this.b.iterator();
        while (it.hasNext()) {
            BeneVpa next = it.next();
            String vpa = next.getVpa();
            e eVar2 = e.IFSC;
            String a2 = C0059ao.a(3351);
            if (eVar == eVar2) {
                if (vpa.endsWith(a2)) {
                    arrayList.add(next);
                }
            } else {
                e eVar3 = e.AADHAAR;
                String a3 = C0059ao.a(3352);
                if (eVar == eVar3) {
                    if (vpa.endsWith(a3)) {
                        arrayList.add(next);
                    }
                } else if (eVar == e.VPA) {
                    if (!vpa.endsWith(a2) && !vpa.endsWith(a3)) {
                        arrayList.add(next);
                    }
                } else {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<BeneVpa> O() {
        return N(this.l);
    }

    public boolean P(String str) {
        ArrayList<Collectbeneblock> q = v().q();
        if (!TextUtils.isEmpty(str) && q != null && q.size() > 0) {
            for (int i = 0; i < q.size(); i++) {
                if (q.get(i).getVpa().equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean Q() {
        return this.f;
    }

    public void R(ArrayList<Bank> arrayList) {
        this.m = arrayList;
    }

    public void S(ArrayList<BannerOffersVo> arrayList) {
    }

    public void T(ArrayList<Banner> arrayList) {
        this.d = arrayList;
    }

    public void U(dg0 dg0Var) {
        this.g = dg0Var;
    }

    public void V(BillPayDataMaxAmount billPayDataMaxAmount) {
        this.t = billPayDataMaxAmount;
    }

    public void W(BillerChargeReq billerChargeReq) {
        this.y = billerChargeReq;
    }

    public void X(ArrayList<Collectbeneblock> arrayList) {
        this.j = arrayList;
    }

    public void Y(GCMMessage gCMMessage) {
        this.q = gCMMessage;
    }

    public void Z(ArrayList<RecentBPTHistory> arrayList) {
        this.x = arrayList;
    }

    public void a(GCMMessage gCMMessage) {
        if (this.k == null) {
            this.k = new ArrayList<>();
        }
        this.k.add(gCMMessage);
    }

    public void a0(ArrayList<DTHOperator> arrayList) {
        this.i = arrayList;
    }

    public void b(BeneVpa beneVpa) {
        if (beneVpa != null) {
            if (this.b == null) {
                this.b = new ArrayList<>();
            }
            if (g(beneVpa.getVpa()) == null) {
                this.b.add(beneVpa);
            }
        }
    }

    public void b0(boolean z) {
        this.f = z;
    }

    public void c() {
        this.a = null;
        this.b = null;
        this.m = null;
        this.n = null;
        this.p = null;
        this.e = null;
        this.f = false;
        this.g = null;
        this.d = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.q = null;
        this.s = null;
        this.t = null;
        this.v = null;
    }

    public void c0(ArrayList<Inbox> arrayList) {
    }

    public Account d(String str) {
        ArrayList<Account> h = h(c.WITH_VPA);
        if (h == null || str == null) {
            return null;
        }
        Iterator<Account> it = h.iterator();
        while (it.hasNext()) {
            Account next = it.next();
            if (next.getVpa().equals(str.toLowerCase())) {
                return next;
            }
        }
        return null;
    }

    public Bank e(String str) {
        ArrayList<Bank> arrayList = this.m;
        if (arrayList == null) {
            return null;
        }
        Iterator<Bank> it = arrayList.iterator();
        while (it.hasNext()) {
            Bank next = it.next();
            if (next.getIin() != null && next.getIin().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public void e0(Mandate mandate) {
        this.u = mandate;
    }

    public BeneVpa f(String str) {
        ArrayList<BeneVpa> arrayList = this.b;
        if (arrayList == null) {
            return null;
        }
        Iterator<BeneVpa> it = arrayList.iterator();
        while (it.hasNext()) {
            BeneVpa next = it.next();
            if (next.getVpa().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public void f0(sg0 sg0Var) {
        this.v = sg0Var;
    }

    public BeneVpa g(String str) {
        ArrayList<BeneVpa> arrayList = this.b;
        if (arrayList == null) {
            return null;
        }
        Iterator<BeneVpa> it = arrayList.iterator();
        while (it.hasNext()) {
            BeneVpa next = it.next();
            if (next.getVpa().equalsIgnoreCase(str)) {
                return next;
            }
        }
        return null;
    }

    public void g0(ArrayList<MandatesVo> arrayList) {
        this.c = arrayList;
    }

    public ArrayList<Account> h(c cVar) {
        if (this.a == null) {
            return null;
        }
        ArrayList<Account> arrayList = new ArrayList<>();
        Iterator<CustomerBankAccounts> it = this.a.iterator();
        while (it.hasNext()) {
            CustomerBankAccounts next = it.next();
            Iterator<Account> it2 = next.getAccounts().iterator();
            while (it2.hasNext()) {
                Account next2 = it2.next();
                next2.setBankName(next.getBankName());
                next2.setIin(next.getBankCode());
                c cVar2 = c.ACTIVE_VPA;
                String a2 = C0059ao.a(3353);
                if (cVar == cVar2) {
                    if (next2.getStatus().equalsIgnoreCase(a2) && !TextUtils.isEmpty(next2.getVpa())) {
                        arrayList.add(next2);
                    }
                } else if (cVar == c.ACTIVE) {
                    if (next2.getStatus().equalsIgnoreCase(a2)) {
                        arrayList.add(next2);
                    }
                } else if (cVar == c.WITH_VPA) {
                    if (!TextUtils.isEmpty(next2.getVpa())) {
                        arrayList.add(next2);
                    }
                } else {
                    arrayList.add(next2);
                }
            }
        }
        return arrayList;
    }

    public void h0(MandateTransactionData mandateTransactionData) {
        this.B = mandateTransactionData;
        if (mandateTransactionData == null) {
            b0(false);
        }
    }

    public String i() {
        ArrayList<Account> h = h(c.ALL);
        if (h == null) {
            return null;
        }
        Iterator<Account> it = h.iterator();
        while (it.hasNext()) {
            Account next = it.next();
            String bankName = next.getBankName();
            if (!TextUtils.isEmpty(bankName) && bankName.toLowerCase().startsWith(C0059ao.a(3354))) {
                return next.getAccRefNumber();
            }
        }
        return null;
    }

    public void i0(MasterUpdate masterUpdate) {
        this.s = masterUpdate;
    }

    public ArrayList<Bank> j() {
        return this.m;
    }

    public void j0(BillPayDataMaxAmount billPayDataMaxAmount) {
        this.t = billPayDataMaxAmount;
    }

    public ArrayList<Banner> k() {
        return this.d;
    }

    public void k0(ArrayList<RecentBPTHistory> arrayList) {
        this.w = arrayList;
    }

    public String l(String str) {
        BeneVpa f = f(str);
        return f != null ? f.getName() : C0059ao.a(3355);
    }

    public void l0(ArrayList<OperatorsLogos> arrayList) {
        this.h = arrayList;
    }

    public dg0 m() {
        return this.g;
    }

    public void m0(ArrayList<CustomerBankAccounts> arrayList, Context context) {
        this.a = arrayList;
        jg0.S(context, arrayList);
    }

    public BillPayDataMaxAmount n() {
        return this.t;
    }

    public void n0(ArrayList<BeneVpa> arrayList) {
        this.b = arrayList;
    }

    public BillerChargeReq o() {
        return this.y;
    }

    public void o0(ArrayList<TranHistory> arrayList) {
        this.z = arrayList;
    }

    public GCMMessage p(String str) {
        if (this.k == null) {
            return null;
        }
        for (int i = 0; i < this.k.size(); i++) {
            if (this.k.get(i).getTxnid().equalsIgnoreCase(str)) {
                GCMMessage gCMMessage = this.k.get(i);
                v().Y(gCMMessage);
                this.k.remove(i);
                return gCMMessage;
            }
        }
        return null;
    }

    public void p0(boolean z) {
    }

    public ArrayList<Collectbeneblock> q() {
        return this.j;
    }

    public void q0(ArrayList<PendingReqVo> arrayList, Context context) {
        this.p = arrayList;
        String a2 = C0059ao.a(3356);
        if (arrayList != null) {
            n70.f.a().v(a2, this.p.size());
            Collections.sort(this.p, new b(this));
            return;
        }
        n70.f.a().v(a2, 0);
    }

    public GCMMessage r() {
        return this.q;
    }

    public void r0(int i) {
        this.r = i;
    }

    public ArrayList<RecentBPTHistory> s() {
        return this.x;
    }

    public void s0(Bank bank) {
        this.A = bank;
    }

    public ArrayList<DTHOperator> t() {
        return this.i;
    }

    public void t0(ArrayList<TranHistory> arrayList) {
        this.n = arrayList;
    }

    public ArrayList<TranHistory> u(String str) {
        ArrayList<TranHistory> arrayList = this.n;
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        ArrayList<TranHistory> arrayList2 = this.o;
        if (arrayList2 == null) {
            this.o = new ArrayList<>();
        } else {
            arrayList2.clear();
        }
        Iterator<TranHistory> it = this.n.iterator();
        while (it.hasNext()) {
            TranHistory next = it.next();
            if ((next.getCreditAccount() != null && next.getCreditAccount().equals(str)) || (next.getDebitAccount() != null && next.getDebitAccount().equals(str))) {
                this.o.add(next);
            }
        }
        return this.o;
    }

    public void u0(TransactionData transactionData) {
        this.e = transactionData;
        if (transactionData == null) {
            b0(false);
        }
    }

    public void v0(e eVar) {
        this.l = eVar;
    }

    public Mandate w() {
        return this.u;
    }

    public void w0(ArrayList<UrlConfig> arrayList) {
    }

    public sg0 x() {
        return this.v;
    }

    public void x0(Account account) {
        ArrayList<CustomerBankAccounts> arrayList = this.a;
        if (arrayList == null) {
            return;
        }
        Iterator<CustomerBankAccounts> it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList<Account> accounts = it.next().getAccounts();
            for (int i = 0; i < accounts.size(); i++) {
                Account account2 = accounts.get(i);
                if (account2.getAccRefNumber().equals(account.getAccRefNumber())) {
                    account.setBankName(account2.getBankName());
                    account.setIin(account2.getIin());
                    accounts.set(i, account);
                }
            }
        }
    }

    public ArrayList<MandatesVo> y() {
        return this.c;
    }

    public void y0(ArrayList<Account> arrayList, Context context) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        CustomerBankAccounts customerBankAccounts = null;
        if (this.a == null) {
            this.a = new ArrayList<>();
        }
        Iterator<CustomerBankAccounts> it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CustomerBankAccounts next = it.next();
            ArrayList<Account> accounts = next.getAccounts();
            if (next.getBankCode().equals(arrayList.get(0).getIin())) {
                if (accounts == null) {
                    accounts = arrayList;
                } else {
                    accounts.addAll(arrayList);
                }
                next.setAccounts(accounts);
                customerBankAccounts = next;
            }
        }
        if (customerBankAccounts == null) {
            CustomerBankAccounts customerBankAccounts2 = new CustomerBankAccounts();
            customerBankAccounts2.setBankCode(arrayList.get(0).getIin());
            customerBankAccounts2.setBankName(arrayList.get(0).getBankName());
            customerBankAccounts2.setAccounts(arrayList);
            this.a.add(customerBankAccounts2);
        }
        m0(this.a, context);
    }

    public MandateTransactionData z() {
        if (this.B == null) {
            this.B = new MandateTransactionData();
        }
        return this.B;
    }

    public void z0(ArrayList<BeneVpa> arrayList) {
        this.b = arrayList;
    }
}
