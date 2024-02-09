package defpackage;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Bundle;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: bh0  reason: default package */
/* loaded from: classes.dex */
public final class bh0 extends AbstractAccountAuthenticator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh0(Context context) {
        super(context);
        yl0.e(context, C0059ao.a(5681));
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) throws NetworkErrorException {
        yl0.e(accountAuthenticatorResponse, C0059ao.a(5682));
        yl0.e(str, C0059ao.a(5683));
        yl0.e(str2, C0059ao.a(5684));
        yl0.e(strArr, C0059ao.a(5685));
        yl0.e(bundle, C0059ao.a(5686));
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) throws NetworkErrorException {
        yl0.e(accountAuthenticatorResponse, C0059ao.a(5687));
        yl0.e(account, C0059ao.a(5688));
        yl0.e(bundle, C0059ao.a(5689));
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        yl0.e(accountAuthenticatorResponse, C0059ao.a(5690));
        yl0.e(str, C0059ao.a(5691));
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) throws NetworkErrorException {
        yl0.e(accountAuthenticatorResponse, C0059ao.a(5692));
        yl0.e(account, C0059ao.a(5693));
        yl0.e(str, C0059ao.a(5694));
        yl0.e(bundle, C0059ao.a(5695));
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public String getAuthTokenLabel(String str) {
        yl0.e(str, C0059ao.a(5696));
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) throws NetworkErrorException {
        yl0.e(accountAuthenticatorResponse, C0059ao.a(5697));
        yl0.e(account, C0059ao.a(5698));
        yl0.e(strArr, C0059ao.a(5699));
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) throws NetworkErrorException {
        yl0.e(accountAuthenticatorResponse, C0059ao.a(5700));
        yl0.e(account, C0059ao.a(5701));
        yl0.e(str, C0059ao.a(5702));
        yl0.e(bundle, C0059ao.a(5703));
        throw new UnsupportedOperationException();
    }
}
