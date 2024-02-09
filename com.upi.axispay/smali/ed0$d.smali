.class public Led0$d;
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
    iput-object p1, p0, Led0$d;->b:Led0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    const v0, 0x7f060047

    const/4 v1, 0x0

    const/4 v2, 0x6

    if-ne p1, v2, :cond_2

    .line 2
    iget-object p1, p0, Led0$d;->b:Led0;

    iget-object p1, p1, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljg0;->J(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Led0$d;->b:Led0;

    iget-object p1, p1, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v2, 0x7f1204f7

    invoke-virtual {p1, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    .line 4
    iget-object p1, p0, Led0$d;->b:Led0;

    iget-object p1, p1, Led0;->o:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 5
    iget-object p1, p0, Led0$d;->b:Led0;

    iget-object v1, p1, Led0;->o:Landroid/widget/Button;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1, v0}, Lt8;->d(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setBackgroundColor(I)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Led0$d;->b:Led0;

    iget-object p1, p1, Led0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Led0$d;->b:Led0;

    iget-object v2, v2, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 7
    iget-object p1, p0, Led0$d;->b:Led0;

    iget-object p1, p1, Led0;->o:Landroid/widget/Button;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 8
    iget-object p1, p0, Led0$d;->b:Led0;

    iget-object v0, p1, Led0;->o:Landroid/widget/Button;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    const v1, 0x7f060048

    invoke-static {p1, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setBackgroundColor(I)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object p1, p0, Led0$d;->b:Led0;

    iget-object p1, p1, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v2, 0x7f12031f

    invoke-virtual {p1, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    .line 10
    iget-object p1, p0, Led0$d;->b:Led0;

    iget-object p1, p1, Led0;->o:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 11
    iget-object p1, p0, Led0$d;->b:Led0;

    iget-object v1, p1, Led0;->o:Landroid/widget/Button;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1, v0}, Lt8;->d(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setBackgroundColor(I)V

    goto :goto_0

    .line 12
    :cond_2
    iget-object p1, p0, Led0$d;->b:Led0;

    iget-object p1, p1, Led0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    .line 13
    iget-object p1, p0, Led0$d;->b:Led0;

    iget-object p1, p1, Led0;->o:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 14
    iget-object p1, p0, Led0$d;->b:Led0;

    iget-object v1, p1, Led0;->o:Landroid/widget/Button;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1, v0}, Lt8;->d(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setBackgroundColor(I)V

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
