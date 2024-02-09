.class public Lorg/npci/upi/security/pinactivitycomponent/m$4;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/npci/upi/security/pinactivitycomponent/m;->o(Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lorg/npci/upi/security/pinactivitycomponent/m;


# direct methods
.method public constructor <init>(Lorg/npci/upi/security/pinactivitycomponent/m;)V
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/m$4;->b:Lorg/npci/upi/security/pinactivitycomponent/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m$4;->b:Lorg/npci/upi/security/pinactivitycomponent/m;

    iget v1, v0, Lorg/npci/upi/security/pinactivitycomponent/m;->g:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    iget-object v0, v0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m$4;->b:Lorg/npci/upi/security/pinactivitycomponent/m;

    iget-object v1, v0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    iget v0, v0, Lorg/npci/upi/security/pinactivitycomponent/m;->g:I

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->l(Z)V

    :cond_0
    return-void
.end method
