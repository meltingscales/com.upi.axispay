.class public Lcom/upi/axispay/custom/FooterCloseDialog$1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/custom/FooterCloseDialog;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/upi/axispay/custom/FooterCloseDialog;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/custom/FooterCloseDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/FooterCloseDialog$1;->this$0:Lcom/upi/axispay/custom/FooterCloseDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/custom/FooterCloseDialog$1;->this$0:Lcom/upi/axispay/custom/FooterCloseDialog;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->dismiss()V

    return-void
.end method
