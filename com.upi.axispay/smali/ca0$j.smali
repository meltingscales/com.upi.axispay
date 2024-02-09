.class public Lca0$j;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lca0;->w(Lca0$k;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/PendingMandateReqVo;

.field public final synthetic c:Lca0$k;


# direct methods
.method public constructor <init>(Lca0;Lcom/olive/upi/transport/model/PendingMandateReqVo;Lca0$k;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lca0$j;->b:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    iput-object p3, p0, Lca0$j;->c:Lca0$k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lca0$j;->b:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getPurposecode()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x8

    if-eqz p1, :cond_0

    iget-object p1, p0, Lca0$j;->b:Lcom/olive/upi/transport/model/PendingMandateReqVo;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingMandateReqVo;->getPurposecode()Ljava/lang/String;

    move-result-object p1

    const v1, 0x6cc

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lca0$j;->c:Lca0$k;

    iget-object p1, p1, Lca0$k;->I:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_3

    .line 3
    :cond_0
    iget-object p1, p0, Lca0$j;->c:Lca0$k;

    iget-object p1, p1, Lca0$k;->T:Landroid/widget/RelativeLayout;

    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    move v1, v0

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lca0$j;->c:Lca0$k;

    iget-object p1, p1, Lca0$k;->H:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v1

    if-nez v1, :cond_2

    move v1, v0

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    iget-object p1, p0, Lca0$j;->c:Lca0$k;

    iget-object p1, p1, Lca0$k;->I:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    move v0, v2

    :goto_2
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_3
    return-void
.end method
