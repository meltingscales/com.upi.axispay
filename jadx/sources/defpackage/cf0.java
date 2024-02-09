package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.IntentData;
import com.olive.upi.transport.model.MandateTransactionData;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.barcode.ScannerOverlay;
import com.upi.axispay.custom.LoginPopupFragment;
import defpackage.n70;
import defpackage.ua0;
import defpackage.y;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: cf0  reason: default package */
/* loaded from: classes.dex */
public class cf0 extends xc0 implements View.OnClickListener, ua0.e, LoginPopupFragment.OnLoginCompletionListener {
    public Camera A;
    public boolean B;
    public RelativeLayout l;
    public TextView m;
    public ImageView n;
    public ImageView o;
    public ImageView p;
    public LinearLayout q;
    public int r;
    public ScannerOverlay s;
    public BarcodeDetector t;
    public CameraSource u;
    public String v;
    public int w = 108;
    public View x;
    public String y;
    public LoginPopupFragment z;

    /* compiled from: AxisPay */
    /* renamed from: cf0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            cf0.this.z.dismiss();
            cf0 cf0Var = cf0.this;
            cf0Var.z = null;
            cf0Var.L();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: cf0$b */
    /* loaded from: classes.dex */
    public class b implements ImageDecoder.OnHeaderDecodedListener {
        public b(cf0 cf0Var) {
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            imageDecoder.setAllocator(1);
            imageDecoder.setMutableRequired(true);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: cf0$c */
    /* loaded from: classes.dex */
    public class c implements SurfaceHolder.Callback {
        public c() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            cf0.this.L();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (cf0.this.u != null) {
                cf0.this.u.stop();
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: cf0$d */
    /* loaded from: classes.dex */
    public class d implements Detector.Processor<Barcode> {
        public d() {
        }

        @Override // com.google.android.gms.vision.Detector.Processor
        public void receiveDetections(Detector.Detections<Barcode> detections) {
            SparseArray<Barcode> detectedItems = detections.getDetectedItems();
            if (detectedItems.size() != 0) {
                cf0.this.v = detectedItems.valueAt(0).displayValue;
                cf0 cf0Var = cf0.this;
                cf0Var.K(cf0Var.v, C0059ao.a(15312), false);
            }
        }

        @Override // com.google.android.gms.vision.Detector.Processor
        public void release() {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: cf0$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;

        public e(String str, String str2, boolean z) {
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            cf0.this.I(this.b.trim(), this.c, this.d);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: cf0$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public final /* synthetic */ y b;

        public f(cf0 cf0Var, y yVar) {
            this.b = yVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.hide();
        }
    }

    public cf0() {
        new Handler();
        this.A = null;
        this.B = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        r7.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        r4.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        r7 = (android.hardware.Camera) r4.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r7 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.hardware.Camera F(com.google.android.gms.vision.CameraSource r7) {
        /*
            java.lang.Class<com.google.android.gms.vision.CameraSource> r0 = com.google.android.gms.vision.CameraSource.class
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        L8:
            r3 = 0
            if (r2 >= r1) goto L2b
            r4 = r0[r2]
            java.lang.Class r5 = r4.getType()
            java.lang.Class<android.hardware.Camera> r6 = android.hardware.Camera.class
            if (r5 != r6) goto L28
            r0 = 1
            r4.setAccessible(r0)
            java.lang.Object r7 = r4.get(r7)     // Catch: java.lang.IllegalAccessException -> L23
            android.hardware.Camera r7 = (android.hardware.Camera) r7     // Catch: java.lang.IllegalAccessException -> L23
            if (r7 == 0) goto L22
            return r7
        L22:
            return r3
        L23:
            r7 = move-exception
            r7.printStackTrace()
            goto L2b
        L28:
            int r2 = r2 + 1
            goto L8
        L2b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cf0.F(com.google.android.gms.vision.CameraSource):android.hardware.Camera");
    }

    public static cf0 G() {
        return new cf0();
    }

    public void C() {
        int i = this.w;
        String a2 = C0059ao.a(14921);
        if (!j(a2, i)) {
            if (this.f < 2) {
                q(a2);
            }
            this.m.setVisibility(0);
            this.l.setVisibility(8);
            return;
        }
        this.m.setVisibility(8);
        this.l.setVisibility(0);
        H();
    }

    public void D() {
        Intent intent = new Intent();
        intent.setType(C0059ao.a(14922));
        intent.setAction(C0059ao.a(14923));
        startActivityForResult(Intent.createChooser(intent, getString(R.string.select_image)), 1);
    }

    public final void E() {
        LoginPopupFragment loginPopupFragment = this.z;
        if (loginPopupFragment != null && loginPopupFragment.isVisible()) {
            this.z.dismiss();
        }
        this.z = null;
    }

    public final void H() {
        BarcodeDetector build = new BarcodeDetector.Builder(getContext()).setBarcodeFormats(0).build();
        this.t = build;
        if (!build.isOperational()) {
            Toast.makeText(getActivity(), C0059ao.a(14924), 0).show();
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.u = new CameraSource.Builder(getContext(), this.t).setFacing(0).setRequestedPreviewSize(displayMetrics.heightPixels, displayMetrics.widthPixels).setRequestedFps(1.0f).setAutoFocusEnabled(true).build();
        this.s.getHolder().addCallback(new c());
        this.t.setProcessor(new d());
    }

    public void I(String str, String str2, boolean z) {
        qg0 d2 = new ig0().d(str, TransactionData.MODE_QR_PAY);
        if (!d2.d()) {
            eg0.z(k(), d2.b());
            L();
            return;
        }
        String c2 = d2.c();
        this.y = c2;
        boolean equalsIgnoreCase = c2.equalsIgnoreCase(C0059ao.a(14925));
        String a2 = C0059ao.a(14926);
        String a3 = C0059ao.a(14927);
        if (equalsIgnoreCase) {
            int i = this.r;
            if (i == 4) {
                N();
                return;
            } else if (i == 133) {
                this.b.t(d2.a(), null);
                return;
            } else {
                TransactionData L = qa0.v().L();
                if (!TextUtils.isEmpty(L.getSign())) {
                    IntentData intentData = new IntentData();
                    n70.a aVar = n70.f;
                    intentData.setAppId(aVar.a().m(a3));
                    intentData.setCustomerId(aVar.a().m(a2));
                    intentData.setData(str);
                    intentData.setIntentData(str);
                    String str3 = C0059ao.a(14928) + str;
                    eg0.i(getActivity());
                    ua0.d().q(new OliveRequest(54, 84, intentData));
                    return;
                }
                J(L, this.y);
                return;
            }
        }
        String str4 = this.y;
        String a4 = C0059ao.a(14929);
        if (str4.equalsIgnoreCase(a4)) {
            if (this.r == 4) {
                N();
            } else if (this.y.equalsIgnoreCase(a4)) {
                MandateTransactionData z2 = qa0.v().z();
                if (!TextUtils.isEmpty(z2.getSign())) {
                    IntentData intentData2 = new IntentData();
                    n70.a aVar2 = n70.f;
                    intentData2.setAppId(aVar2.a().m(a3));
                    intentData2.setCustomerId(aVar2.a().m(a2));
                    intentData2.setData(str);
                    intentData2.setIntentData(str);
                    eg0.i(getActivity());
                    ua0.d().q(new OliveRequest(54, 84, intentData2));
                    return;
                }
                J(z2, this.y);
            } else {
                this.b.t(6, null);
            }
        } else if (this.y.equalsIgnoreCase(C0059ao.a(14930))) {
            MandateTransactionData z3 = qa0.v().z();
            if (!TextUtils.isEmpty(z3.getSign())) {
                IntentData intentData3 = new IntentData();
                n70.a aVar3 = n70.f;
                intentData3.setAppId(aVar3.a().m(a3));
                intentData3.setCustomerId(aVar3.a().m(a2));
                intentData3.setData(str);
                intentData3.setIntentData(str);
                eg0.i(getActivity());
                ua0.d().q(new OliveRequest(54, 84, intentData3));
                return;
            }
            J(z3, this.y);
        } else if (this.r == 4) {
            N();
        } else if (d2.c().equalsIgnoreCase(C0059ao.a(14931))) {
            MandateTransactionData z4 = qa0.v().z();
            if (!TextUtils.isEmpty(z4.getSign())) {
                IntentData intentData4 = new IntentData();
                n70.a aVar4 = n70.f;
                intentData4.setAppId(aVar4.a().m(a3));
                intentData4.setCustomerId(aVar4.a().m(a2));
                intentData4.setData(str);
                intentData4.setIntentData(str);
                eg0.i(getActivity());
                ua0.d().q(new OliveRequest(54, 84, intentData4));
                return;
            }
            J(z4, this.y);
        } else {
            this.b.t(6, null);
        }
    }

    public final void J(TransactionData transactionData, String str) {
        Date date;
        Date date2;
        String str2 = C0059ao.a(14932) + transactionData.getBeneVpa();
        if (str.equalsIgnoreCase(C0059ao.a(14933))) {
            transactionData.setUpiTransactionMode(str);
            this.b.t(6, null);
        } else if (str.equalsIgnoreCase(C0059ao.a(14934))) {
            transactionData.setUpiTransactionMode(str);
            transactionData.setTransactionMode(TransactionData.MODE_CREATE_MANDATE);
            this.b.t(106, 4);
        } else {
            transactionData.setUpiTransactionMode(str);
            String qRexpire = transactionData.getQRexpire();
            if (TextUtils.isEmpty(qRexpire)) {
                this.b.t(6, null);
                return;
            }
            String a2 = C0059ao.a(14935);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(a2);
            try {
                date = simpleDateFormat.parse(qRexpire.substring(0, 19));
            } catch (ParseException e2) {
                e2.printStackTrace();
                date = null;
            }
            try {
                date2 = simpleDateFormat.parse(DateTimeFormatter.ofPattern(a2).format(LocalDateTime.now()));
            } catch (ParseException e3) {
                e3.printStackTrace();
                date2 = null;
            }
            if (date2.compareTo(date) < 0) {
                this.b.t(6, null);
            } else {
                x();
            }
        }
    }

    public void K(String str, String str2, boolean z) {
        k().runOnUiThread(new e(str, str2, z));
    }

    public final void L() {
        CameraSource cameraSource = this.u;
        if (cameraSource == null) {
            return;
        }
        try {
            cameraSource.start(this.s.getHolder());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void M(Object obj) {
        if (obj != null) {
            this.r = ((Integer) obj).intValue();
        } else {
            this.r = 0;
        }
    }

    public final void N() {
        if (this.z == null) {
            LoginPopupFragment newInstance = LoginPopupFragment.newInstance(54);
            this.z = newInstance;
            newInstance.setMessage(getString(R.string.please_login_continue));
            this.z.setLoginCompletionListener(this);
            this.z.show(k().getFragmentManager(), this.z.getClass().getName());
            this.z.setCancelListner(new a());
        }
    }

    public final void O() {
        Camera F = F(this.u);
        this.A = F;
        if (F != null) {
            try {
                Camera.Parameters parameters = F.getParameters();
                parameters.setFlashMode(!this.B ? C0059ao.a(14936) : C0059ao.a(14937));
                this.A.setParameters(parameters);
                boolean z = !this.B;
                this.B = z;
                if (z) {
                    this.o.setImageResource(R.drawable.flash_on);
                } else {
                    this.o.setImageResource(R.drawable.flash_off);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // defpackage.xc0
    public void m(int i) {
        super.m(i);
        if (i == this.w) {
            L();
        } else {
            D();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Bitmap decodeBitmap;
        if (i == 1 && i2 == -1) {
            Uri data = intent.getData();
            try {
                if (Build.VERSION.SDK_INT < 28) {
                    decodeBitmap = MediaStore.Images.Media.getBitmap(k().getContentResolver(), data);
                } else {
                    decodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(k().getContentResolver(), data), new b(this));
                }
                Frame build = new Frame.Builder().setBitmap(decodeBitmap).build();
                BarcodeDetector build2 = new BarcodeDetector.Builder(k()).build();
                build2.isOperational();
                SparseArray<Barcode> detect = build2.detect(build);
                if (detect == null || detect.size() <= 0) {
                    return;
                }
                K(detect.valueAt(0).displayValue, C0059ao.a(14938), true);
            } catch (IOException unused) {
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.galley) {
            D();
        } else if (view.getId() == R.id.flash) {
            O();
        } else if (view.getId() == R.id.back_arrow) {
            k().onBackPressed();
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ua0.e(k()).u(this);
        if (this.x == null) {
            View inflate = layoutInflater.inflate(R.layout.fragment_qr_code_scan, viewGroup, false);
            this.x = inflate;
            this.m = (TextView) inflate.findViewById(R.id.no_permission_warning);
            this.l = (RelativeLayout) this.x.findViewById(R.id.zbarScannerView);
            this.n = (ImageView) this.x.findViewById(R.id.back_arrow);
            this.o = (ImageView) this.x.findViewById(R.id.flash);
            this.p = (ImageView) this.x.findViewById(R.id.galley);
            this.q = (LinearLayout) this.x.findViewById(R.id.tool_bar_layout);
            this.s = (ScannerOverlay) this.x.findViewById(R.id.graphicOverlay);
            this.n.setOnClickListener(this);
            this.o.setOnClickListener(this);
            this.p.setOnClickListener(this);
        }
        return this.x;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            if (oliveRequest.getRequestType() != 84) {
                return;
            }
            eg0.B();
            TransactionData L = qa0.v().L();
            L.setSignVerified(false);
            J(L, this.y);
        } else if (oliveRequest.getRequestType() == 84) {
            TransactionData L2 = qa0.v().L();
            L2.setSignVerified(false);
            J(L2, this.y);
        } else {
            eg0.m(getActivity(), getString(R.string.Miscellaneous_App_Error));
        }
    }

    @Override // com.upi.axispay.custom.LoginPopupFragment.OnLoginCompletionListener
    public void onLoginComplete(boolean z) {
        E();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(54, getString(R.string.scan_pay));
        super.onResume();
        C();
        ua0.e(k()).u(this);
        if (this.r != 4) {
            this.b.o(303, null);
            this.q.setVisibility(8);
            return;
        }
        this.q.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (oliveRequest.getRequestType() != 84) {
            return;
        }
        eg0.B();
        TransactionData L = qa0.v().L();
        L.setSignVerified(true);
        J(L, this.y);
    }

    public void x() {
        y.a aVar = new y.a(requireContext());
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_qr_code_expire, (ViewGroup) this.x.findViewById(16908290), false);
        aVar.k(inflate);
        y a2 = aVar.a();
        a2.setCancelable(true);
        ((ImageView) inflate.findViewById(R.id.cross)).setOnClickListener(new f(this, a2));
        a2.show();
    }
}
