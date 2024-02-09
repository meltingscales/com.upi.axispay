package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.olive.upi.transport.service.CryptLibOne;
import com.upi.axispay.R;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ch0  reason: default package */
/* loaded from: classes.dex */
public final class ch0 {
    public static final a e = new a(null);
    public static ch0 f;
    public Context a;
    public Account b;
    public String c;
    public String d;

    /* compiled from: AxisPay */
    /* renamed from: ch0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(vl0 vl0Var) {
            this();
        }

        public final ch0 a() {
            if (ch0.f == null) {
                ch0.f = new ch0();
            }
            ch0 ch0Var = ch0.f;
            Objects.requireNonNull(ch0Var, C0059ao.a(11425));
            return ch0Var;
        }

        public final ch0 b(Context context) {
            yl0.e(context, C0059ao.a(11426));
            if (ch0.f == null) {
                ch0.f = new ch0(context);
            }
            ch0 ch0Var = ch0.f;
            Objects.requireNonNull(ch0Var, C0059ao.a(11427));
            return ch0Var;
        }
    }

    public ch0() {
        String a2 = C0059ao.a(657);
        this.c = a2;
        this.d = a2;
        f = this;
    }

    public final Account c() {
        Context context = this.a;
        String a2 = C0059ao.a(660);
        if (context == null) {
            yl0.t(a2);
            throw null;
        }
        Object systemService = context.getSystemService(C0059ao.a(661));
        Objects.requireNonNull(systemService, C0059ao.a(662));
        AccountManager accountManager = (AccountManager) systemService;
        Context context2 = this.a;
        if (context2 == null) {
            yl0.t(a2);
            throw null;
        }
        String string = context2.getString(R.string.app_name);
        Context context3 = this.a;
        if (context3 != null) {
            Account account = new Account(string, context3.getPackageName());
            if (Build.VERSION.SDK_INT >= 23 && accountManager.addAccountExplicitly(account, null, null)) {
                n70.f.a().w(C0059ao.a(663), 1, false);
            }
            return account;
        }
        yl0.t(a2);
        throw null;
    }

    public final boolean d() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        Context context = this.a;
        String a2 = C0059ao.a(664);
        if (context != null) {
            Object systemService = context.getSystemService(C0059ao.a(665));
            Objects.requireNonNull(systemService, C0059ao.a(666));
            AccountManager accountManager = (AccountManager) systemService;
            Context context2 = this.a;
            if (context2 == null) {
                yl0.t(a2);
                throw null;
            }
            String packageName = context2.getPackageName();
            Context context3 = this.a;
            if (context3 != null) {
                Account[] accountsByTypeForPackage = accountManager.getAccountsByTypeForPackage(packageName, context3.getString(R.string.app_name));
                yl0.d(accountsByTypeForPackage, C0059ao.a(667));
                if (accountsByTypeForPackage.length <= 0) {
                    Account[] accounts = accountManager.getAccounts();
                    yl0.d(accounts, C0059ao.a(668));
                    int length = accounts.length;
                    int i = 0;
                    while (i < length) {
                        Account account = accounts[i];
                        i++;
                        String str = account.name;
                        Context context4 = this.a;
                        if (context4 == null) {
                            yl0.t(a2);
                            throw null;
                        } else if (str.equals(context4.getString(R.string.app_name))) {
                            String str2 = account.type;
                            Context context5 = this.a;
                            if (context5 == null) {
                                yl0.t(a2);
                                throw null;
                            } else if (str2.equals(context5.getPackageName())) {
                            }
                        }
                    }
                    return false;
                }
                return true;
            }
            yl0.t(a2);
            throw null;
        }
        yl0.t(a2);
        throw null;
    }

    public final AccountManager e() {
        Context context;
        Context context2 = this.a;
        String a2 = C0059ao.a(669);
        if (context2 != null) {
            Object systemService = context2.getSystemService(C0059ao.a(670));
            Objects.requireNonNull(systemService, C0059ao.a(671));
            AccountManager accountManager = (AccountManager) systemService;
            try {
                context = this.a;
            } catch (Exception unused) {
            }
            if (context == null) {
                yl0.t(a2);
                throw null;
            }
            String packageName = context.getPackageName();
            Context context3 = this.a;
            if (context3 != null) {
                Account[] accountsByTypeForPackage = accountManager.getAccountsByTypeForPackage(packageName, context3.getString(R.string.app_name));
                yl0.d(accountsByTypeForPackage, C0059ao.a(672));
                if (accountsByTypeForPackage.length > 0) {
                    this.b = accountsByTypeForPackage[0];
                    n70.f.a().w(C0059ao.a(673), 1, false);
                } else {
                    this.b = c();
                }
                return accountManager;
            }
            yl0.t(a2);
            throw null;
        }
        yl0.t(a2);
        throw null;
    }

    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.d;
    }

    public final boolean h(String str, String str2, boolean z) {
        yl0.e(str, C0059ao.a(674));
        yl0.e(str2, C0059ao.a(675));
        AccountManager e2 = e();
        Account account = this.b;
        boolean z2 = false;
        if (account == null) {
            return false;
        }
        String userData = e2.getUserData(account, str);
        if (TextUtils.isEmpty(userData) || z) {
            e2.setUserData(this.b, str, str2);
            z2 = true;
        } else {
            str2 = userData;
        }
        boolean equals = str.equals(C0059ao.a(676));
        String a2 = C0059ao.a(677);
        if (equals) {
            yl0.d(str2, a2);
            this.c = str2;
        } else if (str.equals(C0059ao.a(678))) {
            yl0.d(str2, a2);
            this.d = str2;
        }
        return z2;
    }

    public final void i() {
        AccountManager e2 = e();
        Account account = this.b;
        if (account != null) {
            String a2 = C0059ao.a(679);
            String userData = e2.getUserData(account, a2);
            if (TextUtils.isEmpty(userData)) {
                userData = CryptLibOne.createAesKey();
                e2.setUserData(this.b, a2, userData);
            }
            yl0.d(userData, C0059ao.a(680));
            this.d = userData;
        }
    }

    public ch0(Context context) {
        yl0.e(context, C0059ao.a(658));
        String a2 = C0059ao.a(659);
        this.c = a2;
        this.d = a2;
        this.a = context;
        f = this;
    }
}
