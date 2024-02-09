.class public Lcom/upi/axispay/activity/MainActivity$e;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/activity/MainActivity;->o0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/upi/axispay/activity/MainActivity;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/activity/MainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/activity/MainActivity$e;->b:Lcom/upi/axispay/activity/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const v0, 0x38a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ln70;->j(Ljava/lang/String;)I

    move-result p1

    .line 3
    sget v0, Lvg0;->e:I

    if-ne p1, v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity$e;->b:Lcom/upi/axispay/activity/MainActivity;

    invoke-static {p1}, Lcom/upi/axispay/activity/MainActivity;->h0(Lcom/upi/axispay/activity/MainActivity;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity$e;->b:Lcom/upi/axispay/activity/MainActivity;

    const/16 v0, 0x1e

    const v1, 0x7f120362

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Leg0;->v(Landroid/app/Activity;ILjava/lang/String;)V

    :goto_0
    return-void
.end method
