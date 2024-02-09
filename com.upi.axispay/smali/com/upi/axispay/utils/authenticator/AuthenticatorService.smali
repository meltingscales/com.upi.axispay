.class public final Lcom/upi/axispay/utils/authenticator/AuthenticatorService;
.super Landroid/app/Service;
.source "AxisPay"


# instance fields
.field public b:Lbh0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/utils/authenticator/AuthenticatorService;->b:Lbh0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/accounts/AbstractAccountAuthenticator;->getIBinder()Landroid/os/IBinder;

    move-result-object p1

    const v0, 0x156a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    const p1, 0x156b

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyl0;->t(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onCreate()V
    .locals 1

    .line 1
    new-instance v0, Lbh0;

    invoke-direct {v0, p0}, Lbh0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/upi/axispay/utils/authenticator/AuthenticatorService;->b:Lbh0;

    return-void
.end method
