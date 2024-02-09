.class public Lcom/upi/axispay/custom/RateAppDialog;
.super Landroid/app/DialogFragment;
.source "AxisPay"


# static fields
.field public static rateAppDialog:Lcom/upi/axispay/custom/RateAppDialog;


# instance fields
.field public button_later:Landroid/widget/Button;

.field public button_rate:Landroid/widget/Button;

.field public dialogLayout:Landroid/widget/LinearLayout;

.field public rateNow:Landroid/view/View$OnClickListener;

.field public remindLater:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    return-void
.end method

.method public static newInstance()Lcom/upi/axispay/custom/RateAppDialog;
    .locals 1

    .line 1
    new-instance v0, Lcom/upi/axispay/custom/RateAppDialog;

    invoke-direct {v0}, Lcom/upi/axispay/custom/RateAppDialog;-><init>()V

    return-object v0
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .line 1
    new-instance p1, Ly$a;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Ly$a;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0058

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/upi/axispay/custom/RateAppDialog;->dialogLayout:Landroid/widget/LinearLayout;

    const v1, 0x7f0a00e6

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/upi/axispay/custom/RateAppDialog;->button_later:Landroid/widget/Button;

    .line 4
    iget-object v0, p0, Lcom/upi/axispay/custom/RateAppDialog;->dialogLayout:Landroid/widget/LinearLayout;

    const v1, 0x7f0a00f1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/upi/axispay/custom/RateAppDialog;->button_rate:Landroid/widget/Button;

    .line 5
    iget-object v0, p0, Lcom/upi/axispay/custom/RateAppDialog;->dialogLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Ly$a;->k(Landroid/view/View;)Ly$a;

    .line 6
    iget-object v0, p0, Lcom/upi/axispay/custom/RateAppDialog;->button_rate:Landroid/widget/Button;

    iget-object v1, p0, Lcom/upi/axispay/custom/RateAppDialog;->rateNow:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    iget-object v0, p0, Lcom/upi/axispay/custom/RateAppDialog;->button_later:Landroid/widget/Button;

    iget-object v1, p0, Lcom/upi/axispay/custom/RateAppDialog;->remindLater:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Ly$a;->d(Z)Ly$a;

    .line 9
    invoke-virtual {p1}, Ly$a;->a()Ly;

    move-result-object p1

    return-object p1
.end method

.method public setRateNow(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/RateAppDialog;->rateNow:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public setRemindLater(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/RateAppDialog;->remindLater:Landroid/view/View$OnClickListener;

    return-void
.end method
