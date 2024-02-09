package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Patterns;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.CustomerBankAccounts;
import com.olive.upi.transport.model.DTHOperator;
import com.olive.upi.transport.model.OperatorsLogos;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import defpackage.n70;
import defpackage.qo;
import java.io.File;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.EnumMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.regex.Pattern;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: jg0  reason: default package */
/* loaded from: classes.dex */
public class jg0 {

    /* compiled from: AxisPay */
    /* renamed from: jg0$a */
    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ Activity b;

        public a(Activity activity) {
            this.b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.b.startActivity(new Intent(C0059ao.a(2926), Uri.parse(C0059ao.a(2925))));
            this.b.finish();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: jg0$b */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            eg0.c();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: jg0$c */
    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnClickListener {
        public final /* synthetic */ Activity b;

        public c(Activity activity) {
            this.b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.b.startActivity(new Intent(C0059ao.a(3240), Uri.parse(C0059ao.a(3239))));
            this.b.finish();
        }
    }

    public static String A(String str) {
        return TextUtils.isEmpty(str) ? C0059ao.a(13787) : str.endsWith(C0059ao.a(13788)) ? C0059ao.a(13789) : str.endsWith(C0059ao.a(13790)) ? C0059ao.a(13791) : C0059ao.a(13792);
    }

    public static String B(String str) {
        Float valueOf = Float.valueOf(Float.parseFloat(str));
        DecimalFormat decimalFormat = new DecimalFormat(C0059ao.a(13793));
        decimalFormat.setMaximumFractionDigits(2);
        return decimalFormat.format(valueOf);
    }

    public static void C(View view, Context context) {
        InputMethodManager inputMethodManager;
        if (view == null || context == null || (inputMethodManager = (InputMethodManager) context.getSystemService(C0059ao.a(13794))) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static boolean D() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean E(String str) {
        return Pattern.compile(C0059ao.a(13795)).matcher(str).matches();
    }

    public static boolean F(String str) {
        return Pattern.compile(C0059ao.a(13796)).matcher(str).matches();
    }

    public static boolean G(Context context, String str) {
        return (str == null ? 0 : str.length()) > 5;
    }

    public static boolean H(String str) {
        if (str == null) {
            return false;
        }
        return Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    public static boolean I(CharSequence charSequence) {
        return charSequence.toString().matches(C0059ao.a(13797));
    }

    public static boolean J(String str) {
        return Pattern.compile(C0059ao.a(13798)).matcher(str).matches();
    }

    public static void K(ImageView imageView, String str, int i) {
        L(imageView, str, i, -1, -1);
    }

    public static void L(ImageView imageView, String str, int i, int i2, int i3) {
        if (TextUtils.isEmpty(str)) {
            imageView.setImageResource(i);
            return;
        }
        r80 j = n80.g().j(str);
        j.g(i);
        j.c(i);
        j.e(imageView);
    }

    public static void M(ImageView imageView, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = u(str2);
        }
        L(imageView, str, R.drawable.def, -1, -1);
    }

    public static String N(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0059ao.a(13799));
        try {
            return new SimpleDateFormat(C0059ao.a(13800)).format(simpleDateFormat.parse(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String O(String str) {
        try {
            return new SimpleDateFormat(C0059ao.a(13801)).format(new SimpleDateFormat(C0059ao.a(13802)).parse(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void P(String str, String str2, mg0 mg0Var) {
        String str3 = C0059ao.a(13803) + str;
        if (!TextUtils.isEmpty(str)) {
            String str4 = C0059ao.a(13804) + str;
            str.hashCode();
            char c2 = 65535;
            switch (str.hashCode()) {
                case 1537:
                    if (str.equals(C0059ao.a(13809))) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1538:
                    if (str.equals(C0059ao.a(13808))) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 1539:
                    if (str.equals(C0059ao.a(13807))) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1540:
                    if (str.equals(C0059ao.a(13806))) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1541:
                    if (str.equals(C0059ao.a(13805))) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    mg0Var.o(307, 126);
                    return;
                case 1:
                    mg0Var.o(307, 127);
                    return;
                case 2:
                    mg0Var.o(307, 134);
                    return;
                case 3:
                    mg0Var.o(307, 137);
                    return;
                case 4:
                    mg0Var.o(307, 136);
                    return;
                default:
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    na0 na0Var = new na0();
                    na0Var.e(str2);
                    mg0Var.t(69, na0Var);
                    return;
            }
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            na0 na0Var2 = new na0();
            na0Var2.e(str2);
            mg0Var.t(69, na0Var2);
        }
    }

    public static String Q(String str) {
        return TextUtils.isEmpty(str) ? C0059ao.a(13810) : str.replaceAll(C0059ao.a(13811), C0059ao.a(13812));
    }

    public static String R(String str) {
        if (str != null) {
            String a2 = C0059ao.a(13813);
            String a3 = C0059ao.a(13814);
            return str.replace(a2, a3).replace(C0059ao.a(13815), a3);
        }
        return C0059ao.a(13816);
    }

    public static void S(Context context, ArrayList<CustomerBankAccounts> arrayList) {
        ArrayList<o70> arrayList2 = new ArrayList<>();
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                ArrayList<Account> accounts = arrayList.get(i).getAccounts();
                if (accounts != null) {
                    Iterator<Account> it = accounts.iterator();
                    while (it.hasNext()) {
                        Account next = it.next();
                        if (next.getVpa() != null && !next.getVpa().equals(C0059ao.a(13817))) {
                            arrayList2.add(new o70(next.getVpa(), null, next.getName()));
                        }
                    }
                }
            }
        }
        if (arrayList == null) {
            n70.f.a().d();
        }
        if (arrayList2.size() > 0) {
            n70.a aVar = n70.f;
            aVar.a().d();
            aVar.a().B(arrayList2);
        }
    }

    public static void T(TabLayout tabLayout, int i, int i2) {
        TextView textView = (TextView) ((LinearLayout) ((ViewGroup) tabLayout.getChildAt(0)).getChildAt(i)).getChildAt(1);
        textView.setTypeface(textView.getTypeface(), i2);
    }

    public static String U(String str) {
        if (str != null) {
            if (str.length() > 1) {
                return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
            }
            return str.toUpperCase();
        }
        return C0059ao.a(13818);
    }

    public static void V(Activity activity) {
        eg0.g(activity, null, activity.getString(R.string.force_update), activity.getString(R.string.skip), new b(), activity.getString(R.string.continue_str), new c(activity));
    }

    public static void W(Activity activity) {
        eg0.f(activity, null, activity.getString(R.string.force_update), activity.getString(R.string.ok_text), new a(activity));
    }

    public static String a(Double d) {
        return d != null ? b(d.toString()) : C0059ao.a(13819);
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return C0059ao.a(13820);
        }
        return C0059ao.a(13821) + str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x011c, code lost:
        if (r5 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e3, code lost:
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01e5, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ed, code lost:
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(android.content.Context r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg0.c(android.content.Context, boolean, boolean):java.lang.String");
    }

    public static int d(Context context, int i) {
        return Math.round(TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics()));
    }

    public static Bitmap e(String str, Context context, int i) throws d30 {
        try {
            EnumMap enumMap = new EnumMap(y20.class);
            enumMap.put((EnumMap) y20.CHARACTER_SET, (y20) C0059ao.a(13837));
            enumMap.put((EnumMap) y20.MARGIN, (y20) 2);
            n30 a2 = new a30().a(str, w20.QR_CODE, i, i, enumMap);
            int f = a2.f();
            int e = a2.e();
            int[] iArr = new int[f * e];
            for (int i2 = 0; i2 < e; i2++) {
                int i3 = i2 * f;
                for (int i4 = 0; i4 < f; i4++) {
                    iArr[i3 + i4] = t8.d(context, a2.d(i4, i2) ? R.color.black : R.color.white);
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(f, e, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, i, 0, 0, f, e);
            return createBitmap;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String f(Hashtable<String, String> hashtable) {
        return new Gson().toJson(hashtable);
    }

    public static String g(String str) {
        String[] split;
        boolean isEmpty = TextUtils.isEmpty(str);
        String a2 = C0059ao.a(13838);
        if (isEmpty) {
            return a2;
        }
        String a3 = C0059ao.a(13839);
        for (String str2 : str.split(a3)) {
            a2 = a2 + U(str2) + a3;
        }
        return a2;
    }

    public static Date h(String str, String str2) {
        try {
            return new SimpleDateFormat(str2).parse(str);
        } catch (ParseException e) {
            e.getMessage();
            return null;
        }
    }

    public static String i(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        try {
            return simpleDateFormat.format(simpleDateFormat.parse(str));
        } catch (ParseException e) {
            e.getMessage();
            return null;
        }
    }

    public static String j(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String a2 = C0059ao.a(13840);
        if (isEmpty) {
            return a2;
        }
        String a3 = C0059ao.a(13841);
        boolean endsWith = str.endsWith(a3);
        String a4 = C0059ao.a(13842);
        if (endsWith) {
            a2 = a3;
        } else if (str.endsWith(a4)) {
            a2 = a4;
        }
        return k(str, a2);
    }

    public static String k(String str, String str2) {
        String str3;
        String substring;
        int indexOf;
        if (str == null) {
            return C0059ao.a(13843);
        }
        int indexOf2 = str.indexOf(C0059ao.a(13844));
        if (indexOf2 != -1) {
            if (!str2.equals(C0059ao.a(13845))) {
                return str2.equals(C0059ao.a(13849)) ? str.substring(0, indexOf2) : str;
            }
            String substring2 = str.substring(0, indexOf2);
            if (substring2.length() > 4) {
                str3 = C0059ao.a(13846) + substring2.substring(substring2.length() - 4);
            } else {
                str3 = substring2;
            }
            if (str.substring(indexOf2 + 1).indexOf(C0059ao.a(13847)) != -1) {
                return str3 + C0059ao.a(13848) + substring.substring(0, indexOf);
            }
            return substring2;
        }
        return str;
    }

    public static String l(Double d) {
        return d.doubleValue() <= 1000.0d ? C0059ao.a(13850) : C0059ao.a(13851);
    }

    public static Double m(Double d) {
        if (d.doubleValue() <= 1000.0d) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(1.0d);
    }

    public static String n(String str) {
        return (str == null || !str.toUpperCase().startsWith(C0059ao.a(13852))) ? C0059ao.a(13854) : C0059ao.a(13853);
    }

    public static String o(String str) {
        return str != null ? Base64.encodeToString(str.getBytes(), 0) : str;
    }

    public static String p(boolean z) {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        boolean z2 = hostAddress.indexOf(58) < 0;
                        if (z) {
                            if (z2) {
                                return hostAddress;
                            }
                        } else if (!z2) {
                            int indexOf = hostAddress.indexOf(37);
                            return indexOf < 0 ? hostAddress.toUpperCase() : hostAddress.substring(0, indexOf).toUpperCase();
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return C0059ao.a(13855);
    }

    public static Uri q(String str) {
        return Uri.fromFile(new File(str));
    }

    public static String r(TransactionData transactionData) {
        String a2 = C0059ao.a(13856);
        if (transactionData == null) {
            return a2;
        }
        int transactionStatus = transactionData.getTransactionStatus();
        StringBuffer stringBuffer = new StringBuffer(a2);
        stringBuffer.append(C0059ao.a(13857));
        stringBuffer.append(transactionData.getTransactionId());
        String a3 = C0059ao.a(13858);
        stringBuffer.append(a3);
        stringBuffer.append(C0059ao.a(13859));
        stringBuffer.append(transactionData.getResponseCode());
        stringBuffer.append(a3);
        stringBuffer.append(C0059ao.a(13860));
        stringBuffer.append(transactionData.getApprovalRefNo());
        stringBuffer.append(a3);
        stringBuffer.append(C0059ao.a(13861));
        stringBuffer.append(transactionStatus == 10 ? C0059ao.a(13862) : C0059ao.a(13863));
        stringBuffer.append(a3);
        stringBuffer.append(C0059ao.a(13864));
        stringBuffer.append(transactionData.getRefUrl());
        stringBuffer.append(a3);
        stringBuffer.append(C0059ao.a(13865));
        stringBuffer.append(transactionData.getOrderId());
        return stringBuffer.toString();
    }

    public static String s(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return C0059ao.a(13868);
        }
        if (str.length() > 4) {
            return C0059ao.a(13866) + str.substring(str.length() - 4, str.length());
        }
        return C0059ao.a(13867);
    }

    public static String t(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer(C0059ao.a(13869));
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(C0059ao.a(13870));
            if (split != null && split.length >= 2) {
                for (int i = 0; i < 2; i++) {
                    String str3 = split[i];
                    if (!TextUtils.isEmpty(str3) && str3.length() > 1) {
                        stringBuffer.append(str3.charAt(0));
                    }
                }
            } else if (str.length() > 2) {
                stringBuffer.append(str.substring(0, 2));
            } else if (!TextUtils.isEmpty(str2) && str2.length() > 2) {
                stringBuffer.append(str2.substring(0, 2));
            }
        } else if (!TextUtils.isEmpty(str2) && str2.length() > 2) {
            stringBuffer.append(str2.substring(0, 2));
        }
        return stringBuffer.toString();
    }

    public static String u(String str) {
        ArrayList<OperatorsLogos> D = qa0.v().D();
        if (D != null) {
            Iterator<OperatorsLogos> it = D.iterator();
            while (it.hasNext()) {
                OperatorsLogos next = it.next();
                if (next.getName().equalsIgnoreCase(str)) {
                    return next.getLogo();
                }
            }
        }
        ArrayList<DTHOperator> t = qa0.v().t();
        if (t != null) {
            Iterator<DTHOperator> it2 = t.iterator();
            while (it2.hasNext()) {
                DTHOperator next2 = it2.next();
                if (next2.getDesc().equalsIgnoreCase(str)) {
                    return next2.getLogo();
                }
            }
            return null;
        }
        return null;
    }

    public static String v() {
        return Environment.getExternalStorageDirectory().toString();
    }

    public static int[] w(Context context, String str) {
        boolean equals = str.equals(C0059ao.a(13871));
        int i = R.string.pending;
        int i2 = -65536;
        if (equals) {
            i = R.string.success;
            i2 = t8.d(context, R.color.transaction_success);
        } else if (str.equals(C0059ao.a(13872))) {
            i2 = Color.argb(255, 255, 153, 51);
        } else if (str.equals(C0059ao.a(13873))) {
            i2 = Color.argb(255, 255, 153, 51);
        } else if (str.equals(C0059ao.a(13874))) {
            i = R.string.declined;
        } else if (str.equals(C0059ao.a(13875))) {
            i = R.string.expired;
        } else {
            i = str.equals(C0059ao.a(13876)) ? R.string.blocked : R.string.failed;
        }
        return new int[]{i, i2};
    }

    public static String x(Date date, String str) {
        return new SimpleDateFormat(str).format(date);
    }

    public static qo y(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            str = C0059ao.a(13877);
        }
        qo.d e = qo.a().e();
        e.c(80);
        e.g(80);
        e.h(-1);
        e.i(Typeface.DEFAULT);
        e.f(20);
        e.d();
        return e.a().b(str.substring(0, 1), i);
    }

    public static long z(Date date, Date date2) {
        if (date == null || date2 == null) {
            return 0L;
        }
        return (date2.getTime() - date.getTime()) / 60000;
    }
}
