.class public Lcom/upi/axispay/custom/LoginPopupFragment$4;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/custom/LoginPopupFragment;->onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
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
    iput-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment$4;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const v0, 0x1ebf

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ln70;->c(Ljava/lang/String;)V

    .line 2
    invoke-static {}, Leg0;->c()V

    .line 3
    iget-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment$4;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    iget-object p1, p1, Lcom/upi/axispay/custom/LoginPopupFragment;->activity:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
