package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.upi.axispay.R;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: zf0  reason: default package */
/* loaded from: classes.dex */
public class zf0 extends Fragment {
    public static int d;
    public mg0 b;
    public Activity c;

    public static int j(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public static zf0 l(int i, int i2) {
        zf0 zf0Var = new zf0();
        d = i2;
        Bundle bundle = new Bundle();
        bundle.putInt(C0059ao.a(12813), i);
        zf0Var.setArguments(bundle);
        return zf0Var;
    }

    public Bitmap k(int i, int i2, int i3) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), i, options);
        options.inSampleSize = j(options, i2, i3);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(getResources(), i, options);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.new_tutorial, viewGroup, false);
        this.c = getActivity();
        int i = getArguments() != null ? getArguments().getInt(C0059ao.a(12814)) : 0;
        inflate.setTag(Integer.valueOf(i));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.c.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels;
        int i3 = displayMetrics.widthPixels;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.section_image);
        ((TextView) inflate.findViewById(R.id.version)).setText(C0059ao.a(12815));
        if (i != 1) {
            if (i == 2) {
                if (d == 106) {
                    imageView.setImageBitmap(k(R.drawable.t2, i2 / 2, i3 / 2));
                } else {
                    imageView.setImageBitmap(k(R.drawable.tut_next, i2 / 2, i3 / 2));
                }
            }
        } else if (d == 106) {
            imageView.setImageBitmap(k(R.drawable.t1, i2 / 2, i3 / 2));
        } else {
            imageView.setImageBitmap(k(R.drawable.tut_first, i2 / 2, i3 / 2));
        }
        return inflate;
    }
}
