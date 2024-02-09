package defpackage;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.upi.axispay.R;
import com.upi.axispay.custom.FloatingInputLayout;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: fd0  reason: default package */
/* loaded from: classes.dex */
public class fd0 extends xc0 {
    public LinearLayout l;
    public View m;
    public TextView n;
    public String o;
    public FloatingInputLayout p;
    public FloatingInputLayout q;
    public FloatingInputLayout r;

    /* compiled from: AxisPay */
    /* renamed from: fd0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            na0 na0Var = new na0();
            na0Var.e(fd0.this.o);
            fd0.this.b.t(69, na0Var);
        }
    }

    public static byte[] A(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    public static fd0 B() {
        return new fd0();
    }

    public static byte[] y(String str) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance(C0059ao.a(4249));
        messageDigest.update(str.getBytes(C0059ao.a(4250)));
        return messageDigest.digest();
    }

    public static byte[] z(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, C0059ao.a(4251));
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
        Cipher cipher = Cipher.getInstance(C0059ao.a(4252));
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr2);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_checksum, viewGroup, false);
        this.m = inflate;
        this.l = (LinearLayout) inflate.findViewById(R.id.checksum_data);
        this.o = n70.f.a().m(C0059ao.a(4253));
        this.n = (TextView) this.m.findViewById(R.id.checksum_link);
        this.p = (FloatingInputLayout) this.m.findViewById(R.id.checksum);
        this.q = (FloatingInputLayout) this.m.findViewById(R.id.platform);
        this.r = (FloatingInputLayout) this.m.findViewById(R.id.version);
        this.p.setMultiLine();
        FloatingInputLayout floatingInputLayout = this.p;
        String a2 = C0059ao.a(4254);
        floatingInputLayout.setText(x(a2));
        this.q.setText(getString(R.string.f366android));
        this.r.setText(a2);
        this.q.setEditableText(false);
        this.r.setEditableText(false);
        this.p.setEditableText(false);
        TextView textView = this.n;
        textView.setText(getString(R.string.please_validate_checksum_on_website) + C0059ao.a(4255) + this.o);
        this.l.setOnClickListener(new a());
        return this.m;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(154, getString(R.string.checksum));
        super.onResume();
    }

    public String x(String str) {
        String a2 = C0059ao.a(4256);
        String a3 = C0059ao.a(4257);
        try {
            a3 = Base64.encodeToString(z(A(C0059ao.a(4258)), y(str)), 2);
            Log.e(a2, a2 + a3);
            return a3;
        } catch (Exception e) {
            e.printStackTrace();
            return a3;
        }
    }
}
