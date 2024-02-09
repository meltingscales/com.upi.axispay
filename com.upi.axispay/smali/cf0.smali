.class public Lcf0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lua0$e;
.implements Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;


# instance fields
.field public A:Landroid/hardware/Camera;

.field public B:Z

.field public l:Landroid/widget/RelativeLayout;

.field public m:Landroid/widget/TextView;

.field public n:Landroid/widget/ImageView;

.field public o:Landroid/widget/ImageView;

.field public p:Landroid/widget/ImageView;

.field public q:Landroid/widget/LinearLayout;

.field public r:I

.field public s:Lcom/upi/axispay/barcode/ScannerOverlay;

.field public t:Lcom/google/android/gms/vision/barcode/BarcodeDetector;

.field public u:Lcom/google/android/gms/vision/CameraSource;

.field public v:Ljava/lang/String;

.field public w:I

.field public x:Landroid/view/View;

.field public y:Ljava/lang/String;

.field public z:Lcom/upi/axispay/custom/LoginPopupFragment;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcf0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const/16 v0, 0x6c

    .line 2
    iput v0, p0, Lcf0;->w:I

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcf0;->A:Landroid/hardware/Camera;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcf0;->B:Z

    return-void
.end method

.method public static synthetic A(Lcf0;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcf0;->v:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic B(Lcf0;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcf0;->v:Ljava/lang/String;

    return-object p1
.end method

.method public static F(Lcom/google/android/gms/vision/CameraSource;)Landroid/hardware/Camera;
    .locals 7

    .line 1
    const-class v0, Lcom/google/android/gms/vision/CameraSource;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    .line 2
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v1, :cond_2

    aget-object v4, v0, v2

    .line 3
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    const-class v6, Landroid/hardware/Camera;

    if-ne v5, v6, :cond_1

    const/4 v0, 0x1

    .line 4
    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 5
    :try_start_0
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/hardware/Camera;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    return-object v3

    :catch_0
    move-exception p0

    .line 6
    invoke-virtual {p0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-object v3
.end method

.method public static G()Lcf0;
    .locals 1

    .line 1
    new-instance v0, Lcf0;

    invoke-direct {v0}, Lcf0;-><init>()V

    return-object v0
.end method

.method public static synthetic y(Lcf0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcf0;->L()V

    return-void
.end method

.method public static synthetic z(Lcf0;)Lcom/google/android/gms/vision/CameraSource;
    .locals 0

    .line 1
    iget-object p0, p0, Lcf0;->u:Lcom/google/android/gms/vision/CameraSource;

    return-object p0
.end method


# virtual methods
.method public C()V
    .locals 5

    .line 1
    iget v0, p0, Lcf0;->w:I

    const v1, 0x3a49

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lxc0;->j(Ljava/lang/String;I)Z

    move-result v0

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-nez v0, :cond_1

    .line 2
    iget v0, p0, Lxc0;->f:I

    const/4 v4, 0x2

    if-ge v0, v4, :cond_0

    .line 3
    invoke-virtual {p0, v1}, Lxc0;->q(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcf0;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcf0;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcf0;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcf0;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 8
    invoke-virtual {p0}, Lcf0;->H()V

    :goto_0
    return-void
.end method

.method public D()V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const v1, 0x3a4a

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const v1, 0x3a4b

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const v1, 0x7f120400

    .line 4
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public final E()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcf0;->z:Lcom/upi/axispay/custom/LoginPopupFragment;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/DialogFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcf0;->z:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {v0}, Landroid/app/DialogFragment;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcf0;->z:Lcom/upi/axispay/custom/LoginPopupFragment;

    return-void
.end method

.method public final H()V
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;->setBarcodeFormats(I)Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;->build()Lcom/google/android/gms/vision/barcode/BarcodeDetector;

    move-result-object v0

    iput-object v0, p0, Lcf0;->t:Lcom/google/android/gms/vision/barcode/BarcodeDetector;

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/vision/barcode/BarcodeDetector;->isOperational()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v0

    const v2, 0x3a4c

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    .line 6
    :cond_0
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 8
    new-instance v2, Lcom/google/android/gms/vision/CameraSource$Builder;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcf0;->t:Lcom/google/android/gms/vision/barcode/BarcodeDetector;

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/vision/CameraSource$Builder;-><init>(Landroid/content/Context;Lcom/google/android/gms/vision/Detector;)V

    .line 9
    invoke-virtual {v2, v1}, Lcom/google/android/gms/vision/CameraSource$Builder;->setFacing(I)Lcom/google/android/gms/vision/CameraSource$Builder;

    move-result-object v1

    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 10
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/vision/CameraSource$Builder;->setRequestedPreviewSize(II)Lcom/google/android/gms/vision/CameraSource$Builder;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 11
    invoke-virtual {v0, v1}, Lcom/google/android/gms/vision/CameraSource$Builder;->setRequestedFps(F)Lcom/google/android/gms/vision/CameraSource$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Lcom/google/android/gms/vision/CameraSource$Builder;->setAutoFocusEnabled(Z)Lcom/google/android/gms/vision/CameraSource$Builder;

    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/vision/CameraSource$Builder;->build()Lcom/google/android/gms/vision/CameraSource;

    move-result-object v0

    iput-object v0, p0, Lcf0;->u:Lcom/google/android/gms/vision/CameraSource;

    .line 14
    iget-object v0, p0, Lcf0;->s:Lcom/upi/axispay/barcode/ScannerOverlay;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    new-instance v1, Lcf0$c;

    invoke-direct {v1, p0}, Lcf0$c;-><init>(Lcf0;)V

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 15
    iget-object v0, p0, Lcf0;->t:Lcom/google/android/gms/vision/barcode/BarcodeDetector;

    new-instance v1, Lcf0$d;

    invoke-direct {v1, p0}, Lcf0$d;-><init>(Lcf0;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/vision/Detector;->setProcessor(Lcom/google/android/gms/vision/Detector$Processor;)V

    return-void
.end method

.method public I(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 8

    .line 1
    new-instance p2, Lig0;

    invoke-direct {p2}, Lig0;-><init>()V

    sget p3, Lcom/olive/upi/transport/model/TransactionData;->MODE_QR_PAY:I

    invoke-virtual {p2, p1, p3}, Lig0;->d(Ljava/lang/String;I)Lqg0;

    move-result-object p2

    .line 2
    invoke-virtual {p2}, Lqg0;->d()Z

    move-result p3

    if-nez p3, :cond_0

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lqg0;->b()I

    move-result p2

    invoke-static {p1, p2}, Leg0;->z(Landroid/content/Context;I)V

    .line 4
    invoke-virtual {p0}, Lcf0;->L()V

    return-void

    .line 5
    :cond_0
    invoke-virtual {p2}, Lqg0;->c()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcf0;->y:Ljava/lang/String;

    const v0, 0x3a4d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-virtual {p3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p3

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/16 v2, 0x54

    const/16 v3, 0x36

    const v4, 0x3a4e

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x3a4f

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    if-eqz p3, :cond_4

    .line 7
    iget p3, p0, Lcf0;->r:I

    if-ne p3, v1, :cond_1

    .line 8
    invoke-virtual {p0}, Lcf0;->N()V

    goto/16 :goto_0

    :cond_1
    const/16 v1, 0x85

    if-ne p3, v1, :cond_2

    .line 9
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-virtual {p2}, Lqg0;->a()I

    move-result p2

    invoke-interface {p1, p2, v0}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 10
    :cond_2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p2

    .line 11
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getSign()Ljava/lang/String;

    move-result-object p3

    .line 12
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_3

    .line 13
    new-instance p2, Lcom/olive/upi/transport/model/IntentData;

    invoke-direct {p2}, Lcom/olive/upi/transport/model/IntentData;-><init>()V

    .line 14
    sget-object p3, Ln70;->f:Ln70$a;

    invoke-virtual {p3}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/olive/upi/transport/model/IntentData;->setAppId(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p3}, Ln70$a;->a()Ln70;

    move-result-object p3

    invoke-virtual {p3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/olive/upi/transport/model/IntentData;->setCustomerId(Ljava/lang/String;)V

    .line 16
    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/IntentData;->setData(Ljava/lang/String;)V

    .line 17
    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/IntentData;->setIntentData(Ljava/lang/String;)V

    .line 18
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x3a50

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 20
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p3, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {p3, v3, v2, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 21
    :cond_3
    iget-object p1, p0, Lcf0;->y:Ljava/lang/String;

    invoke-virtual {p0, p2, p1}, Lcf0;->J(Lcom/olive/upi/transport/model/TransactionData;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 22
    :cond_4
    iget-object p3, p0, Lcf0;->y:Ljava/lang/String;

    const v6, 0x3a51

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p3, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p3

    const/4 v7, 0x6

    if-eqz p3, :cond_8

    .line 23
    iget p2, p0, Lcf0;->r:I

    if-ne p2, v1, :cond_5

    .line 24
    invoke-virtual {p0}, Lcf0;->N()V

    goto/16 :goto_0

    .line 25
    :cond_5
    iget-object p2, p0, Lcf0;->y:Ljava/lang/String;

    invoke-virtual {p2, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 26
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p2

    .line 27
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getSign()Ljava/lang/String;

    move-result-object p3

    .line 28
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_6

    .line 29
    new-instance p2, Lcom/olive/upi/transport/model/IntentData;

    invoke-direct {p2}, Lcom/olive/upi/transport/model/IntentData;-><init>()V

    .line 30
    sget-object p3, Ln70;->f:Ln70$a;

    invoke-virtual {p3}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/olive/upi/transport/model/IntentData;->setAppId(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p3}, Ln70$a;->a()Ln70;

    move-result-object p3

    invoke-virtual {p3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/olive/upi/transport/model/IntentData;->setCustomerId(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/IntentData;->setData(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/IntentData;->setIntentData(Ljava/lang/String;)V

    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 35
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p3, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {p3, v3, v2, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 36
    :cond_6
    iget-object p1, p0, Lcf0;->y:Ljava/lang/String;

    invoke-virtual {p0, p2, p1}, Lcf0;->J(Lcom/olive/upi/transport/model/TransactionData;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 37
    :cond_7
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v7, v0}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 38
    :cond_8
    iget-object p3, p0, Lcf0;->y:Ljava/lang/String;

    const v6, 0x3a52

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p3, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_a

    .line 39
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p2

    .line 40
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getSign()Ljava/lang/String;

    move-result-object p3

    .line 41
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_9

    .line 42
    new-instance p2, Lcom/olive/upi/transport/model/IntentData;

    invoke-direct {p2}, Lcom/olive/upi/transport/model/IntentData;-><init>()V

    .line 43
    sget-object p3, Ln70;->f:Ln70$a;

    invoke-virtual {p3}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/olive/upi/transport/model/IntentData;->setAppId(Ljava/lang/String;)V

    .line 44
    invoke-virtual {p3}, Ln70$a;->a()Ln70;

    move-result-object p3

    invoke-virtual {p3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/olive/upi/transport/model/IntentData;->setCustomerId(Ljava/lang/String;)V

    .line 45
    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/IntentData;->setData(Ljava/lang/String;)V

    .line 46
    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/IntentData;->setIntentData(Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 48
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p3, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {p3, v3, v2, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 49
    :cond_9
    iget-object p1, p0, Lcf0;->y:Ljava/lang/String;

    invoke-virtual {p0, p2, p1}, Lcf0;->J(Lcom/olive/upi/transport/model/TransactionData;Ljava/lang/String;)V

    goto :goto_0

    .line 50
    :cond_a
    iget p3, p0, Lcf0;->r:I

    if-ne p3, v1, :cond_b

    .line 51
    invoke-virtual {p0}, Lcf0;->N()V

    goto :goto_0

    .line 52
    :cond_b
    invoke-virtual {p2}, Lqg0;->c()Ljava/lang/String;

    move-result-object p2

    const p3, 0x3a53

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_d

    .line 53
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p2

    .line 54
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getSign()Ljava/lang/String;

    move-result-object p3

    .line 55
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_c

    .line 56
    new-instance p2, Lcom/olive/upi/transport/model/IntentData;

    invoke-direct {p2}, Lcom/olive/upi/transport/model/IntentData;-><init>()V

    .line 57
    sget-object p3, Ln70;->f:Ln70$a;

    invoke-virtual {p3}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/olive/upi/transport/model/IntentData;->setAppId(Ljava/lang/String;)V

    .line 58
    invoke-virtual {p3}, Ln70$a;->a()Ln70;

    move-result-object p3

    invoke-virtual {p3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/olive/upi/transport/model/IntentData;->setCustomerId(Ljava/lang/String;)V

    .line 59
    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/IntentData;->setData(Ljava/lang/String;)V

    .line 60
    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/IntentData;->setIntentData(Ljava/lang/String;)V

    .line 61
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 62
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p3, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {p3, v3, v2, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 63
    :cond_c
    iget-object p1, p0, Lcf0;->y:Ljava/lang/String;

    invoke-virtual {p0, p2, p1}, Lcf0;->J(Lcom/olive/upi/transport/model/TransactionData;Ljava/lang/String;)V

    goto :goto_0

    .line 64
    :cond_d
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v7, v0}, Lmg0;->t(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final J(Lcom/olive/upi/transport/model/TransactionData;Ljava/lang/String;)V
    .locals 6

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x3a54

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    const v0, 0x3a55

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {p2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x6

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setUpiTransactionMode(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v2, v3}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    const v0, 0x3a56

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {p2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setUpiTransactionMode(Ljava/lang/String;)V

    .line 7
    sget p2, Lcom/olive/upi/transport/model/TransactionData;->MODE_CREATE_MANDATE:I

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 8
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x6a

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, p2, v1}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_2

    .line 9
    :cond_1
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setUpiTransactionMode(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getQRexpire()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 12
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v2, v3}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_2

    .line 13
    :cond_2
    new-instance p2, Ljava/text/SimpleDateFormat;

    const v0, 0x3a57

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    const/16 v5, 0x13

    .line 14
    :try_start_0
    invoke-virtual {p1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 15
    invoke-virtual {p1}, Ljava/text/ParseException;->printStackTrace()V

    move-object p1, v3

    .line 16
    :goto_0
    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    .line 17
    invoke-static {}, Ljava/time/LocalDateTime;->now()Ljava/time/LocalDateTime;

    move-result-object v4

    .line 18
    invoke-virtual {v1, v4}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object v1

    .line 19
    :try_start_1
    invoke-virtual {p2, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p2
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p2

    .line 20
    invoke-virtual {p2}, Ljava/text/ParseException;->printStackTrace()V

    move-object p2, v3

    .line 21
    :goto_1
    invoke-virtual {p2, p1}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result p1

    if-gez p1, :cond_3

    .line 22
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v2, v3}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_2

    .line 23
    :cond_3
    invoke-virtual {p0}, Lcf0;->x()V

    :goto_2
    return-void
.end method

.method public K(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    new-instance v1, Lcf0$e;

    invoke-direct {v1, p0, p1, p2, p3}, Lcf0$e;-><init>(Lcf0;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final L()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcf0;->u:Lcom/google/android/gms/vision/CameraSource;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcf0;->s:Lcom/upi/axispay/barcode/ScannerOverlay;

    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/vision/CameraSource;->start(Landroid/view/SurfaceHolder;)Lcom/google/android/gms/vision/CameraSource;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public M(Ljava/lang/Object;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcf0;->r:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcf0;->r:I

    :goto_0
    return-void
.end method

.method public final N()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcf0;->z:Lcom/upi/axispay/custom/LoginPopupFragment;

    if-nez v0, :cond_0

    const/16 v0, 0x36

    .line 2
    invoke-static {v0}, Lcom/upi/axispay/custom/LoginPopupFragment;->newInstance(I)Lcom/upi/axispay/custom/LoginPopupFragment;

    move-result-object v0

    iput-object v0, p0, Lcf0;->z:Lcom/upi/axispay/custom/LoginPopupFragment;

    const v1, 0x7f120361

    .line 3
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/LoginPopupFragment;->setMessage(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcf0;->z:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {v0, p0}, Lcom/upi/axispay/custom/LoginPopupFragment;->setLoginCompletionListener(Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;)V

    .line 5
    iget-object v0, p0, Lcf0;->z:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    iget-object v2, p0, Lcf0;->z:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcf0;->z:Lcom/upi/axispay/custom/LoginPopupFragment;

    new-instance v1, Lcf0$a;

    invoke-direct {v1, p0}, Lcf0$a;-><init>(Lcf0;)V

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/LoginPopupFragment;->setCancelListner(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method public final O()V
    .locals 3

    .line 1
    iget-object v1, p0, Lcf0;->u:Lcom/google/android/gms/vision/CameraSource;

    invoke-static {v1}, Lcf0;->F(Lcom/google/android/gms/vision/CameraSource;)Landroid/hardware/Camera;

    move-result-object v1

    iput-object v1, p0, Lcf0;->A:Landroid/hardware/Camera;

    if-eqz v1, :cond_3

    .line 2
    :try_start_0
    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    .line 3
    iget-boolean v2, p0, Lcf0;->B:Z

    if-nez v2, :cond_0

    const v0, 0x3a58

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const v0, 0x3a59

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    .line 4
    iget-object v2, p0, Lcf0;->A:Landroid/hardware/Camera;

    invoke-virtual {v2, v1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 5
    iget-boolean v1, p0, Lcf0;->B:Z

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iput-boolean v1, p0, Lcf0;->B:Z

    if-eqz v1, :cond_2

    .line 6
    iget-object v1, p0, Lcf0;->o:Landroid/widget/ImageView;

    const v2, 0x7f0800ea

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 7
    :cond_2
    iget-object v1, p0, Lcf0;->o:Landroid/widget/ImageView;

    const v2, 0x7f0800e9

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    .line 8
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_2
    return-void
.end method

.method public m(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lxc0;->m(I)V

    .line 2
    iget v0, p0, Lcf0;->w:I

    if-ne p1, v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcf0;->L()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcf0;->D()V

    :goto_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    const/4 p1, -0x1

    if-ne p2, p1, :cond_1

    .line 1
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    .line 2
    :try_start_0
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1c

    if-ge p2, p3, :cond_0

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p2

    invoke-static {p2, p1}, Landroid/provider/MediaStore$Images$Media;->getBitmap(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object p1

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p2

    invoke-static {p2, p1}, Landroid/graphics/ImageDecoder;->createSource(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p1

    .line 5
    new-instance p2, Lcf0$b;

    invoke-direct {p2, p0}, Lcf0$b;-><init>(Lcf0;)V

    invoke-static {p1, p2}, Landroid/graphics/ImageDecoder;->decodeBitmap(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 6
    :goto_0
    new-instance p2, Lcom/google/android/gms/vision/Frame$Builder;

    invoke-direct {p2}, Lcom/google/android/gms/vision/Frame$Builder;-><init>()V

    invoke-virtual {p2, p1}, Lcom/google/android/gms/vision/Frame$Builder;->setBitmap(Landroid/graphics/Bitmap;)Lcom/google/android/gms/vision/Frame$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame$Builder;->build()Lcom/google/android/gms/vision/Frame;

    move-result-object p1

    .line 7
    new-instance p2, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p3

    invoke-direct {p2, p3}, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;-><init>(Landroid/content/Context;)V

    .line 8
    invoke-virtual {p2}, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;->build()Lcom/google/android/gms/vision/barcode/BarcodeDetector;

    move-result-object p2

    .line 9
    invoke-virtual {p2}, Lcom/google/android/gms/vision/barcode/BarcodeDetector;->isOperational()Z

    move-result p3

    .line 10
    invoke-virtual {p2, p1}, Lcom/google/android/gms/vision/barcode/BarcodeDetector;->detect(Lcom/google/android/gms/vision/Frame;)Landroid/util/SparseArray;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 11
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p2

    if-lez p2, :cond_1

    const/4 p2, 0x0

    .line 12
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/vision/barcode/Barcode;

    iget-object p1, p1, Lcom/google/android/gms/vision/barcode/Barcode;->displayValue:Ljava/lang/String;

    const v0, 0x3a5a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2, v1}, Lcf0;->K(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0a0200

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcf0;->D()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0a01e6

    if-ne v0, v1, :cond_1

    .line 4
    invoke-virtual {p0}, Lcf0;->O()V

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a0099

    if-ne p1, v0, :cond_2

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    :cond_2
    :goto_0
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p3

    invoke-static {p3}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p3

    invoke-virtual {p3, p0}, Lua0;->u(Lua0$e;)V

    .line 2
    iget-object p3, p0, Lcf0;->x:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0d00a2

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcf0;->x:Landroid/view/View;

    const p2, 0x7f0a0349

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcf0;->m:Landroid/widget/TextView;

    .line 5
    iget-object p1, p0, Lcf0;->x:Landroid/view/View;

    const p2, 0x7f0a056f

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcf0;->l:Landroid/widget/RelativeLayout;

    .line 6
    iget-object p1, p0, Lcf0;->x:Landroid/view/View;

    const p2, 0x7f0a0099

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcf0;->n:Landroid/widget/ImageView;

    .line 7
    iget-object p1, p0, Lcf0;->x:Landroid/view/View;

    const p2, 0x7f0a01e6

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcf0;->o:Landroid/widget/ImageView;

    .line 8
    iget-object p1, p0, Lcf0;->x:Landroid/view/View;

    const p2, 0x7f0a0200

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcf0;->p:Landroid/widget/ImageView;

    .line 9
    iget-object p1, p0, Lcf0;->x:Landroid/view/View;

    const p2, 0x7f0a0509

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcf0;->q:Landroid/widget/LinearLayout;

    .line 10
    iget-object p1, p0, Lcf0;->x:Landroid/view/View;

    const p2, 0x7f0a020a

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/upi/axispay/barcode/ScannerOverlay;

    iput-object p1, p0, Lcf0;->s:Lcom/upi/axispay/barcode/ScannerOverlay;

    .line 11
    iget-object p1, p0, Lcf0;->n:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    iget-object p1, p0, Lcf0;->o:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    iget-object p1, p0, Lcf0;->p:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    :cond_0
    iget-object p1, p0, Lcf0;->x:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 0

    .line 1
    invoke-super {p0}, Lxc0;->onDestroyView()V

    return-void
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result p2

    const/4 v0, 0x0

    const/16 v1, 0x54

    if-nez p2, :cond_1

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 4
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p1

    .line 5
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setSignVerified(Z)V

    .line 6
    iget-object p2, p0, Lcf0;->y:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcf0;->J(Lcom/olive/upi/transport/model/TransactionData;Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    if-ne p1, v1, :cond_2

    .line 8
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p1

    .line 9
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setSignVerified(Z)V

    .line 10
    iget-object p2, p0, Lcf0;->y:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcf0;->J(Lcom/olive/upi/transport/model/TransactionData;Ljava/lang/String;)V

    goto :goto_0

    .line 11
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    const p2, 0x7f120008

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onLoginComplete(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcf0;->E()V

    return-void
.end method

.method public onPause()V
    .locals 0

    .line 1
    invoke-super {p0}, Lxc0;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 3

    const v0, 0x7f1203dc

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x36

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    .line 3
    invoke-virtual {p0}, Lcf0;->C()V

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    .line 5
    iget v0, p0, Lcf0;->r:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    .line 6
    iget-object v0, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x12f

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lmg0;->o(ILjava/lang/Object;)V

    .line 7
    iget-object v0, p0, Lcf0;->q:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcf0;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStop()V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 p2, 0x54

    if-eq p1, p2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p1

    const/4 p2, 0x1

    .line 4
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setSignVerified(Z)V

    .line 5
    iget-object p2, p0, Lcf0;->y:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcf0;->J(Lcom/olive/upi/transport/model/TransactionData;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public x()V
    .locals 5

    .line 1
    new-instance v0, Ly$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ly$a;-><init>(Landroid/content/Context;)V

    .line 2
    iget-object v1, p0, Lcf0;->x:Landroid/view/View;

    const v2, 0x1020002

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0d0056

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a0150

    .line 4
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 5
    invoke-virtual {v0, v1}, Ly$a;->k(Landroid/view/View;)Ly$a;

    .line 6
    invoke-virtual {v0}, Ly$a;->a()Ly;

    move-result-object v0

    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 8
    new-instance v1, Lcf0$f;

    invoke-direct {v1, p0, v0}, Lcf0$f;-><init>(Lcf0;Ly;)V

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method
