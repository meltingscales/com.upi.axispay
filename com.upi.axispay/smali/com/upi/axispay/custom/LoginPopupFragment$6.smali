.class public Lcom/upi/axispay/custom/LoginPopupFragment$6;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/custom/LoginPopupFragment;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
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
    iput-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment$6;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment$6;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->dismiss()V

    return-void
.end method
