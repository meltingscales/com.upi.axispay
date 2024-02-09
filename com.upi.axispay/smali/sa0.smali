.class public final synthetic Lsa0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/upi/axispay/custom/LoginPopupFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/upi/axispay/custom/LoginPopupFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsa0;->b:Lcom/upi/axispay/custom/LoginPopupFragment;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object v0, p0, Lsa0;->b:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {v0, p1, p2}, Lcom/upi/axispay/custom/LoginPopupFragment;->d(Landroid/content/DialogInterface;I)V

    return-void
.end method
