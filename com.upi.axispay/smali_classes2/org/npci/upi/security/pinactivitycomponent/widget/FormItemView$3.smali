.class public Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$3;
.super Lgc;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->g(Landroid/view/View;Z)Lec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Z


# direct methods
.method public constructor <init>(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;Z)V
    .locals 0

    iput-boolean p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$3;->a:Z

    invoke-direct {p0}, Lgc;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    invoke-super {p0, p1}, Lgc;->b(Landroid/view/View;)V

    iget-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$3;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
