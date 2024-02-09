.class public Lorg/npci/upi/security/pinactivitycomponent/m$1;
.super Ljava/util/TimerTask;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/npci/upi/security/pinactivitycomponent/m;->m(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public b:J

.field public final synthetic c:Lorg/npci/upi/security/pinactivitycomponent/o;

.field public final synthetic d:I

.field public final synthetic e:Lorg/npci/upi/security/pinactivitycomponent/m;


# direct methods
.method public constructor <init>(Lorg/npci/upi/security/pinactivitycomponent/m;Lorg/npci/upi/security/pinactivitycomponent/o;I)V
    .locals 2

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/m$1;->e:Lorg/npci/upi/security/pinactivitycomponent/m;

    iput-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/m$1;->c:Lorg/npci/upi/security/pinactivitycomponent/o;

    iput p3, p0, Lorg/npci/upi/security/pinactivitycomponent/m$1;->d:I

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    const-wide/32 v0, 0xafc8

    sub-long/2addr p1, v0

    iput-wide p1, p0, Lorg/npci/upi/security/pinactivitycomponent/m$1;->b:J

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m$1;->c:Lorg/npci/upi/security/pinactivitycomponent/o;

    iget v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m$1;->d:I

    iget-wide v2, p0, Lorg/npci/upi/security/pinactivitycomponent/m$1;->b:J

    const-wide/16 v4, 0x7d0

    sub-long/2addr v2, v4

    invoke-virtual {v0, v1, v2, v3}, Lorg/npci/upi/security/pinactivitycomponent/o;->c(IJ)Lorg/npci/upi/security/pinactivitycomponent/n;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lorg/npci/upi/security/pinactivitycomponent/m$1$1;

    invoke-direct {v2, p0, v0}, Lorg/npci/upi/security/pinactivitycomponent/m$1$1;-><init>(Lorg/npci/upi/security/pinactivitycomponent/m$1;Lorg/npci/upi/security/pinactivitycomponent/n;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m$1;->b:J

    return-void
.end method
