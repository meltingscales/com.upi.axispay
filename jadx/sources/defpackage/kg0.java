package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.upi.axispay.helper.imagepicker.ImageCropActivity;
import defpackage.lg0;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: kg0  reason: default package */
/* loaded from: classes.dex */
public class kg0 implements lg0.b {
    public ImageView a;
    public Fragment b;
    public Activity c;
    public int d;
    public int e;

    @Override // defpackage.lg0.b
    public void a(String str) {
        String f = d70.e(this.c).f();
        boolean isEmpty = TextUtils.isEmpty(f);
        String a = C0059ao.a(8951);
        String a2 = C0059ao.a(8952);
        if (isEmpty || f.equals(C0059ao.a(8953)) ? !str.equalsIgnoreCase(C0059ao.a(8955)) : !str.equalsIgnoreCase(C0059ao.a(8954))) {
            a = a2;
        }
        b(a);
    }

    public final void b(String str) {
        Intent intent = new Intent(this.c, ImageCropActivity.class);
        intent.putExtra(C0059ao.a(8956), str);
        this.c.startActivityForResult(intent, 1);
    }

    @SuppressLint({"InlinedApi"})
    public void c() {
        int i;
        Activity activity = this.c;
        String a = C0059ao.a(8957);
        if (t8.a(activity, a) != 0) {
            int i2 = this.e;
            if (i2 == 0 && (i = this.d) == 0) {
                this.e = i2 + 1;
                this.d = i + 1;
                Fragment fragment = this.b;
                if (fragment == null) {
                    d8.o(this.c, new String[]{a}, 100);
                } else {
                    fragment.requestPermissions(new String[]{a}, 100);
                }
            }
        } else if (t8.a(this.c, a) != 0) {
            int i3 = this.e;
            if (i3 == 0) {
                this.e = i3 + 1;
                Fragment fragment2 = this.b;
                if (fragment2 == null) {
                    d8.o(this.c, new String[]{a}, 100);
                } else {
                    fragment2.requestPermissions(new String[]{a}, 100);
                }
            }
        } else {
            f();
        }
    }

    public void d(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i == 1234) {
                f();
            }
        } else if (i2 == -1) {
            String stringExtra = intent.getStringExtra(C0059ao.a(8958));
            g(stringExtra);
            n70.f.a().y(C0059ao.a(8959), stringExtra);
        } else if (i2 == 0) {
        } else {
            Toast.makeText(this.c, intent.getStringExtra(C0059ao.a(8960)), 1).show();
        }
    }

    public void e() {
        this.e = 0;
        this.d = 0;
    }

    public final void f() {
        lg0 lg0Var = new lg0();
        lg0Var.d(this);
        lg0Var.show(this.c.getFragmentManager(), C0059ao.a(8961));
    }

    public final void g(String str) {
        if (str != null) {
            this.a.setImageBitmap(BitmapFactory.decodeFile(str));
        }
    }

    public void h(Activity activity, ImageView imageView) {
        this.c = activity;
        this.a = imageView;
        c();
    }
}
