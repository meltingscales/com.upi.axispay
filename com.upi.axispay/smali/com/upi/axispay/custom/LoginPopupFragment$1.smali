.class public Lcom/upi/axispay/custom/LoginPopupFragment$1;
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
    iput-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment$1;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment$1;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    iget-object p1, p1, Lcom/upi/axispay/custom/LoginPopupFragment;->pinFieldLayout:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v0, 0x6

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment$1;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    iget-object v0, p1, Lcom/upi/axispay/custom/LoginPopupFragment;->pinFieldLayout:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-static {v0, p1}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 3
    iget-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment$1;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 4
    iget-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment$1;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    iget-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment$1;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {p1, v0}, Lua0;->u(Lua0$e;)V

    .line 5
    new-instance p1, Lcom/olive/upi/transport/model/Authenticate;

    iget-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment$1;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    iget-object v0, v0, Lcom/upi/axispay/custom/LoginPopupFragment;->pinFieldLayout:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/olive/upi/transport/model/Authenticate;-><init>(Ljava/lang/String;)V

    const v0, 0x1ec3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/Authenticate;->setAppVersion(Ljava/lang/String;)V

    .line 7
    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/4 v1, 0x4

    const/16 v2, 0x17

    invoke-direct {v0, v1, v2, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    .line 8
    iget-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment$1;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 9
    iget-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment$1;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lua0;->v(Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment$1;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    iget-object v0, p1, Lcom/upi/axispay/custom/LoginPopupFragment;->pinFieldLayout:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f12035d

    invoke-virtual {p1, v1}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
