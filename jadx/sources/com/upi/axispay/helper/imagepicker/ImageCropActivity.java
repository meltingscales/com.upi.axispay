package com.upi.axispay.helper.imagepicker;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.FileProvider;
import com.upi.axispay.R;
import io.togoto.imagezoomcrop.cropoverlay.CropOverlayView;
import io.togoto.imagezoomcrop.cropoverlay.edge.Edge;
import io.togoto.imagezoomcrop.photoview.IGetImageBounds;
import io.togoto.imagezoomcrop.photoview.PhotoView;
import io.togoto.imagezoomcrop.photoview.RotationSeekBar;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ImageCropActivity extends z {
    public String B;
    public File E;
    public PhotoView q;
    public CropOverlayView r;
    public Button s;
    public Button t;
    public Button u;
    public Button v;
    public View w;
    public RotationSeekBar x;
    public Button y;
    public ContentResolver z;
    public final Bitmap.CompressFormat A = Bitmap.CompressFormat.JPEG;
    public Uri C = null;
    public Uri D = null;
    public View.OnClickListener F = new c();
    public View.OnClickListener G = new d();
    public View.OnClickListener H = new e();
    public View.OnClickListener I = new f();
    public View.OnClickListener J = new g();

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements IGetImageBounds {
        public a() {
        }

        @Override // io.togoto.imagezoomcrop.photoview.IGetImageBounds
        public Rect getImageBounds() {
            return ImageCropActivity.this.r.getImageBounds();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b extends RotationSeekBar.OnRotationSeekBarChangeListener {
        public float a;

        public b(RotationSeekBar rotationSeekBar) {
            super(rotationSeekBar);
        }

        @Override // io.togoto.imagezoomcrop.photoview.RotationSeekBar.OnRotationSeekBarChangeListener
        public void onRotationProgressChanged(RotationSeekBar rotationSeekBar, float f, float f2, boolean z) {
            this.a = f;
            if (z) {
                ImageCropActivity.this.q.setRotationBy(f2, false);
            }
        }

        @Override // io.togoto.imagezoomcrop.photoview.RotationSeekBar.OnRotationSeekBarChangeListener, android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            super.onStopTrackingTouch(seekBar);
            if (Math.abs(this.a) < 10.0f) {
                ImageCropActivity.this.x.reset();
                ImageCropActivity.this.q.setRotationBy(0.0f, true);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageCropActivity.this.k0();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageCropActivity.this.x.reset();
            ImageCropActivity.this.q.reset();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ImageCropActivity.this.E == null) {
                ImageCropActivity.this.e0();
            }
            ImageCropActivity.this.l0();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageCropActivity.this.q.setRotationBy(0.0f, true);
            ImageCropActivity.this.x.reset();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ImageCropActivity.this.E == null) {
                ImageCropActivity.this.e0();
            }
            ImageCropActivity.this.h0();
        }
    }

    private void E() {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), g0(this.D));
        float minimumScaleToFit = this.q.setMinimumScaleToFit(bitmapDrawable);
        this.q.setMaximumScale(3.0f * minimumScaleToFit);
        this.q.setMediumScale(2.0f * minimumScaleToFit);
        this.q.setScale(minimumScaleToFit);
        this.q.setImageDrawable(bitmapDrawable);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.w.getLayoutParams();
        layoutParams.setMargins(0, Math.round(Edge.BOTTOM.getCoordinate()) + 20, 0, 0);
        this.w.setLayoutParams(layoutParams);
    }

    public static void d0(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public void c0(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable unused) {
        }
    }

    public final void e0() {
        this.E = new File(new ContextWrapper(getApplicationContext()).getExternalFilesDir(Environment.DIRECTORY_PICTURES), C0059ao.a(15012));
    }

    public void f0(String str) {
        Intent intent = new Intent();
        intent.putExtra(C0059ao.a(15013), true);
        if (str != null) {
            intent.putExtra(C0059ao.a(15014), str);
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[Catch: FileNotFoundException | IOException -> 0x0096, TRY_LEAVE, TryCatch #0 {FileNotFoundException | IOException -> 0x0096, blocks: (B:3:0x0001, B:5:0x001b, B:10:0x0044, B:17:0x0077, B:18:0x0081, B:19:0x008b, B:9:0x0022), top: B:23:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap g0(android.net.Uri r10) {
        /*
            r9 = this;
            r1 = 0
            android.content.ContentResolver r2 = r9.z     // Catch: java.lang.Throwable -> L96
            java.io.InputStream r2 = r2.openInputStream(r10)     // Catch: java.lang.Throwable -> L96
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L96
            r3.<init>()     // Catch: java.lang.Throwable -> L96
            r4 = 1
            r3.inJustDecodeBounds = r4     // Catch: java.lang.Throwable -> L96
            android.graphics.BitmapFactory.decodeStream(r2, r1, r3)     // Catch: java.lang.Throwable -> L96
            r2.close()     // Catch: java.lang.Throwable -> L96
            int r2 = r3.outHeight     // Catch: java.lang.Throwable -> L96
            r5 = 1024(0x400, float:1.435E-42)
            if (r2 > r5) goto L22
            int r6 = r3.outWidth     // Catch: java.lang.Throwable -> L96
            if (r6 <= r5) goto L20
            goto L22
        L20:
            r2 = r4
            goto L44
        L22:
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 4652218415073722368(0x4090000000000000, double:1024.0)
            int r3 = r3.outWidth     // Catch: java.lang.Throwable -> L96
            int r2 = java.lang.Math.max(r2, r3)     // Catch: java.lang.Throwable -> L96
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L96
            double r7 = r7 / r2
            double r2 = java.lang.Math.log(r7)     // Catch: java.lang.Throwable -> L96
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r7 = java.lang.Math.log(r7)     // Catch: java.lang.Throwable -> L96
            double r2 = r2 / r7
            long r2 = java.lang.Math.round(r2)     // Catch: java.lang.Throwable -> L96
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L96
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L96
            double r2 = java.lang.Math.pow(r5, r2)     // Catch: java.lang.Throwable -> L96
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L96
        L44:
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L96
            r3.<init>()     // Catch: java.lang.Throwable -> L96
            r3.inSampleSize = r2     // Catch: java.lang.Throwable -> L96
            android.content.ContentResolver r2 = r9.z     // Catch: java.lang.Throwable -> L96
            java.io.InputStream r2 = r2.openInputStream(r10)     // Catch: java.lang.Throwable -> L96
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r2, r1, r3)     // Catch: java.lang.Throwable -> L96
            r2.close()     // Catch: java.lang.Throwable -> L96
            android.media.ExifInterface r2 = new android.media.ExifInterface     // Catch: java.lang.Throwable -> L96
            java.lang.String r10 = r10.getPath()     // Catch: java.lang.Throwable -> L96
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L96
            r0 = 15015(0x3aa7, float:2.104E-41)
            java.lang.String r10 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L96
            int r10 = r2.getAttributeInt(r10, r4)     // Catch: java.lang.Throwable -> L96
            r2 = 3
            if (r10 == r2) goto L8b
            r2 = 6
            if (r10 == r2) goto L81
            r2 = 8
            if (r10 == r2) goto L77
            goto L95
        L77:
            r10 = 1132920832(0x43870000, float:270.0)
            android.graphics.Bitmap r10 = r9.i0(r3, r10)     // Catch: java.lang.Throwable -> L96
            r3.recycle()     // Catch: java.lang.Throwable -> L96
            goto L94
        L81:
            r10 = 1119092736(0x42b40000, float:90.0)
            android.graphics.Bitmap r10 = r9.i0(r3, r10)     // Catch: java.lang.Throwable -> L96
            r3.recycle()     // Catch: java.lang.Throwable -> L96
            goto L94
        L8b:
            r10 = 1127481344(0x43340000, float:180.0)
            android.graphics.Bitmap r10 = r9.i0(r3, r10)     // Catch: java.lang.Throwable -> L96
            r3.recycle()     // Catch: java.lang.Throwable -> L96
        L94:
            r3 = r10
        L95:
            return r3
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upi.axispay.helper.imagepicker.ImageCropActivity.g0(android.net.Uri):android.graphics.Bitmap");
    }

    public final void h0() {
        try {
            startActivityForResult(new Intent(C0059ao.a(15016)).setType(C0059ao.a(15017)), 1);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, C0059ao.a(15018), 0).show();
        }
    }

    public final Bitmap i0(Bitmap bitmap, float f2) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public final boolean j0() {
        Bitmap croppedImage = this.q.getCroppedImage();
        Uri uri = this.C;
        if (uri != null) {
            OutputStream outputStream = null;
            try {
                outputStream = this.z.openOutputStream(uri);
                if (outputStream != null) {
                    croppedImage.compress(this.A, 90, outputStream);
                }
                c0(outputStream);
                croppedImage.recycle();
                return true;
            } catch (IOException unused) {
                c0(outputStream);
            } catch (Throwable th) {
                c0(outputStream);
                throw th;
            }
        }
        return false;
    }

    public final void k0() {
        if (j0()) {
            Intent intent = new Intent();
            String str = C0059ao.a(15019) + this.B;
            intent.putExtra(C0059ao.a(15020), this.B);
            setResult(-1, intent);
            finish();
            return;
        }
        Toast.makeText(this, C0059ao.a(15021), 1).show();
    }

    public final void l0() {
        Intent intent = new Intent(C0059ao.a(15022));
        intent.putExtra(C0059ao.a(15025), FileProvider.e(this, C0059ao.a(15024), new File(getExternalFilesDir(Environment.DIRECTORY_PICTURES), C0059ao.a(15023))));
        startActivityForResult(intent, 2);
    }

    public void m0() {
        setResult(0, new Intent());
        finish();
    }

    @Override // defpackage.sd, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        String str = C0059ao.a(15026) + i2;
        e0();
        String a2 = C0059ao.a(15027);
        if (i == 2) {
            if (i2 != -1) {
                if (i2 == 0) {
                    m0();
                    return;
                } else {
                    f0(a2);
                    return;
                }
            }
            String path = this.E.getPath();
            this.B = path;
            this.C = jg0.q(path);
            this.D = jg0.q(this.B);
            E();
        } else if (i == 1) {
            if (i2 == 0) {
                m0();
            } else if (i2 == -1) {
                try {
                    InputStream openInputStream = getContentResolver().openInputStream(intent.getData());
                    FileOutputStream fileOutputStream = new FileOutputStream(this.E);
                    d0(openInputStream, fileOutputStream);
                    fileOutputStream.close();
                    openInputStream.close();
                    String path2 = this.E.getPath();
                    this.B = path2;
                    this.C = jg0.q(path2);
                    this.D = jg0.q(this.B);
                    E();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    f0(a2);
                }
            } else {
                f0(a2);
            }
        }
    }

    @Override // defpackage.sd, androidx.activity.ComponentActivity, defpackage.j8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_image_crop);
        U((Toolbar) findViewById(R.id.toolbar));
        setTitle(C0059ao.a(15028));
        this.z = getContentResolver();
        this.q = (PhotoView) findViewById(R.id.iv_photo);
        this.r = (CropOverlayView) findViewById(R.id.crop_overlay);
        this.s = (Button) findViewById(R.id.btnRetakePic);
        this.t = (Button) findViewById(R.id.btnFromGallery);
        this.u = (Button) findViewById(R.id.btn_done);
        this.v = (Button) findViewById(R.id.btn_reset);
        this.w = findViewById(R.id.tv_move_resize_txt);
        this.x = (RotationSeekBar) findViewById(R.id.bar_rotation);
        this.y = (Button) findViewById(R.id.btn_undo);
        this.s.setOnClickListener(this.H);
        this.t.setOnClickListener(this.J);
        this.u.setOnClickListener(this.F);
        this.v.setOnClickListener(this.G);
        this.y.setOnClickListener(this.I);
        this.q.setImageBoundsListener(new a());
        RotationSeekBar rotationSeekBar = this.x;
        rotationSeekBar.setOnSeekBarChangeListener(new b(rotationSeekBar));
        e0();
        if (bundle == null || !bundle.getBoolean(C0059ao.a(15029))) {
            Intent intent = getIntent();
            String a2 = C0059ao.a(15030);
            String stringExtra = intent.getStringExtra(a2);
            if (stringExtra != null) {
                stringExtra.hashCode();
                if (stringExtra.equals(C0059ao.a(15031))) {
                    getIntent().removeExtra(a2);
                    l0();
                    return;
                } else if (stringExtra.equals(C0059ao.a(15032))) {
                    getIntent().removeExtra(a2);
                    h0();
                    return;
                }
            }
        }
        String path = this.E.getPath();
        this.B = path;
        this.C = jg0.q(path);
        this.D = jg0.q(this.B);
        E();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        m0();
        return true;
    }

    @Override // androidx.activity.ComponentActivity, defpackage.j8, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(C0059ao.a(15033), true);
    }
}
