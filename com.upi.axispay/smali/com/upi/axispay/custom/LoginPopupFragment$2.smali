.class public Lcom/upi/axispay/custom/LoginPopupFragment$2;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/upi/axispay/custom/LoginPopupFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/upi/axispay/custom/LoginPopupFragment;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/custom/LoginPopupFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment$2;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment$2;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {v0}, Landroid/app/DialogFragment;->dismiss()V

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment$2;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {v0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {p1, v0}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 3
    sget p1, Lcom/upi/axispay/custom/LoginPopupFragment;->sourceID:I

    const/16 v0, 0x43

    if-ne p1, v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment$2;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lua0;->v(Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->c()V

    .line 6
    new-instance p1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment$2;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {v0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-class v1, Lcom/upi/axispay/activity/LoginActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x4000000

    .line 7
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 8
    iget-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment$2;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {v0, p1}, Landroid/app/DialogFragment;->startActivity(Landroid/content/Intent;)V

    .line 9
    iget-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment$2;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method
