.class public Lcom/upi/axispay/custom/LoginPopupFragment$3;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/custom/LoginPopupFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
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
    iput-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment$3;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment$3;->this$0:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->dismiss()V

    return-void
.end method
