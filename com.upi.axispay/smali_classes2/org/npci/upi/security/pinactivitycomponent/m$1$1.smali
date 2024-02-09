.class public Lorg/npci/upi/security/pinactivitycomponent/m$1$1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/npci/upi/security/pinactivitycomponent/m$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lorg/npci/upi/security/pinactivitycomponent/n;

.field public final synthetic c:Lorg/npci/upi/security/pinactivitycomponent/m$1;


# direct methods
.method public constructor <init>(Lorg/npci/upi/security/pinactivitycomponent/m$1;Lorg/npci/upi/security/pinactivitycomponent/n;)V
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/m$1$1;->c:Lorg/npci/upi/security/pinactivitycomponent/m$1;

    iput-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/m$1$1;->b:Lorg/npci/upi/security/pinactivitycomponent/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m$1$1;->c:Lorg/npci/upi/security/pinactivitycomponent/m$1;

    iget-object v0, v0, Lorg/npci/upi/security/pinactivitycomponent/m$1;->e:Lorg/npci/upi/security/pinactivitycomponent/m;

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m$1$1;->b:Lorg/npci/upi/security/pinactivitycomponent/n;

    invoke-virtual {v0, v1}, Lorg/npci/upi/security/pinactivitycomponent/m;->q(Lorg/npci/upi/security/pinactivitycomponent/n;)V

    return-void
.end method
