.class public Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;
.super Landroid/app/Service;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl$a;
    }
.end annotation


# instance fields
.field public b:Lorg/npci/upi/security/services/CLRemoteService$Stub;

.field public c:Lorg/npci/upi/security/pinactivitycomponent/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;->b:Lorg/npci/upi/security/services/CLRemoteService$Stub;

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;->c:Lorg/npci/upi/security/pinactivitycomponent/c;

    return-void
.end method

.method public static synthetic b(Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/npci/upi/security/services/CLResultReceiver;)Landroid/os/Bundle;
    .locals 0

    invoke-virtual/range {p0 .. p9}, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/npci/upi/security/services/CLResultReceiver;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;)Lorg/npci/upi/security/pinactivitycomponent/c;
    .locals 0

    iget-object p0, p0, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;->c:Lorg/npci/upi/security/pinactivitycomponent/c;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/npci/upi/security/services/CLResultReceiver;)Landroid/os/Bundle;
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const v1, 0xb8e

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xb8f

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xb90

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xb91

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xb92

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xb93

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xb94

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0xb95

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lorg/npci/upi/security/pinactivitycomponent/CLServerResultReceiver;

    invoke-direct {p1, p9}, Lorg/npci/upi/security/pinactivitycomponent/CLServerResultReceiver;-><init>(Lorg/npci/upi/security/services/CLResultReceiver;)V

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/i;->d(Lorg/npci/upi/security/pinactivitycomponent/CLServerResultReceiver;)V

    return-object v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 3

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;->b:Lorg/npci/upi/security/services/CLRemoteService$Stub;

    if-nez p1, :cond_0

    new-instance p1, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl$a;

    invoke-virtual {p0}, Landroid/app/Service;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p1, p0, v1, v2}, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl$a;-><init>(Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;Landroid/content/Context;Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl$1;)V

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;->b:Lorg/npci/upi/security/services/CLRemoteService$Stub;

    :cond_0
    :try_start_0
    new-instance p1, Lorg/npci/upi/security/pinactivitycomponent/c;

    invoke-virtual {p0}, Landroid/app/Service;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p1, v1}, Lorg/npci/upi/security/pinactivitycomponent/c;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;->c:Lorg/npci/upi/security/pinactivitycomponent/c;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/CLRemoteServiceImpl;->b:Lorg/npci/upi/security/services/CLRemoteService$Stub;

    return-object p1

    :catch_0
    new-instance p1, Ljava/lang/RuntimeException;

    const v0, 0xb96

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
