.class public Led0$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Led0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Led0;


# direct methods
.method public constructor <init>(Led0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Led0$c;->b:Led0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljg0;->J(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Led0$c;->b:Led0;

    iget-object p1, p1, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v0, 0x7f1204f7

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    .line 4
    iget-object p1, p0, Led0$c;->b:Led0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    iget-object v0, p0, Led0$c;->b:Led0;

    const v1, 0x7f1204f8

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Led0$c;->b:Led0;

    iget-object p1, p1, Led0;->o:Landroid/widget/Button;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 6
    iget-object p1, p0, Led0$c;->b:Led0;

    iget-object v0, p1, Led0;->o:Landroid/widget/Button;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    const v1, 0x7f060047

    invoke-static {p1, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setBackgroundColor(I)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Led0$c;->b:Led0;

    iget-object p1, p1, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    goto :goto_0

    .line 8
    :cond_1
    iget-object p1, p0, Led0$c;->b:Led0;

    iget-object p1, p1, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    :goto_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
