.class public Lorg/npci/upi/security/services/CLRemoteResultReceiver$1;
.super Lorg/npci/upi/security/services/CLResultReceiver$Stub;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/npci/upi/security/services/CLRemoteResultReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lorg/npci/upi/security/services/CLRemoteResultReceiver;


# direct methods
.method public constructor <init>(Lorg/npci/upi/security/services/CLRemoteResultReceiver;)V
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/services/CLRemoteResultReceiver$1;->a:Lorg/npci/upi/security/services/CLRemoteResultReceiver;

    invoke-direct {p0}, Lorg/npci/upi/security/services/CLResultReceiver$Stub;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lorg/npci/upi/security/services/CLRemoteResultReceiver$1;->a:Lorg/npci/upi/security/services/CLRemoteResultReceiver;

    invoke-static {v0}, Lorg/npci/upi/security/services/CLRemoteResultReceiver;->a(Lorg/npci/upi/security/services/CLRemoteResultReceiver;)Landroid/os/ResultReceiver;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    return-void
.end method
