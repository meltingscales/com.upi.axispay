.class public Lorg/npci/upi/security/services/CLServices$1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/npci/upi/security/services/CLServices;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lorg/npci/upi/security/services/CLServices;


# direct methods
.method public constructor <init>(Lorg/npci/upi/security/services/CLServices;)V
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/services/CLServices$1;->a:Lorg/npci/upi/security/services/CLServices;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    iget-object p1, p0, Lorg/npci/upi/security/services/CLServices$1;->a:Lorg/npci/upi/security/services/CLServices;

    invoke-static {p2}, Lorg/npci/upi/security/services/CLRemoteService$Stub;->j(Landroid/os/IBinder;)Lorg/npci/upi/security/services/CLRemoteService;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/npci/upi/security/services/CLServices;->a(Lorg/npci/upi/security/services/CLServices;Lorg/npci/upi/security/services/CLRemoteService;)Lorg/npci/upi/security/services/CLRemoteService;

    iget-object p1, p0, Lorg/npci/upi/security/services/CLServices$1;->a:Lorg/npci/upi/security/services/CLServices;

    invoke-static {p1}, Lorg/npci/upi/security/services/CLServices;->c(Lorg/npci/upi/security/services/CLServices;)Lorg/npci/upi/security/services/ServiceConnectionStatusNotifier;

    move-result-object p1

    invoke-static {}, Lorg/npci/upi/security/services/CLServices;->b()Lorg/npci/upi/security/services/CLServices;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/npci/upi/security/services/ServiceConnectionStatusNotifier;->serviceConnected(Lorg/npci/upi/security/services/CLServices;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    iget-object p1, p0, Lorg/npci/upi/security/services/CLServices$1;->a:Lorg/npci/upi/security/services/CLServices;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lorg/npci/upi/security/services/CLServices;->a(Lorg/npci/upi/security/services/CLServices;Lorg/npci/upi/security/services/CLRemoteService;)Lorg/npci/upi/security/services/CLRemoteService;

    iget-object p1, p0, Lorg/npci/upi/security/services/CLServices$1;->a:Lorg/npci/upi/security/services/CLServices;

    invoke-static {p1}, Lorg/npci/upi/security/services/CLServices;->c(Lorg/npci/upi/security/services/CLServices;)Lorg/npci/upi/security/services/ServiceConnectionStatusNotifier;

    move-result-object p1

    invoke-interface {p1}, Lorg/npci/upi/security/services/ServiceConnectionStatusNotifier;->serviceDisconnected()V

    return-void
.end method
