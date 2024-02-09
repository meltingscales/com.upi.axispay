.class public Lmf0$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmf0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lmf0;


# direct methods
.method public constructor <init>(Lmf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmf0$c;->b:Lmf0;

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

    if-ne p1, v2, :cond_1

    .line 2
    iget-object p1, p0, Lmf0$c;->b:Lmf0;

    iget-object p1, p1, Lmf0;->l:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/PinFieldLayout;->getPinText()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lmf0$c;->b:Lmf0;

    iget-object v2, v2, Lmf0;->m:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {v2}, Lcom/upi/axispay/custom/PinFieldLayout;->getPinText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lmf0$c;->b:Lmf0;

    iget-object p1, p1, Lmf0;->m:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/PinFieldLayout;->setLayoutbgCorrect()V

    .line 4
    iget-object p1, p0, Lmf0$c;->b:Lmf0;

    iget-object p1, p1, Lmf0;->m:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/PinFieldLayout;->showIndicator()V

    .line 5
    iget-object p1, p0, Lmf0$c;->b:Lmf0;

    iget-object p1, p1, Lmf0;->n:Landroid/widget/Button;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setClickable(Z)V

    .line 6
    iget-object p1, p0, Lmf0$c;->b:Lmf0;

    iget-object p1, p1, Lmf0;->n:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 7
    iget-object p1, p0, Lmf0$c;->b:Lmf0;

    iget-object v0, p1, Lmf0;->n:Landroid/widget/Button;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    const v1, 0x7f060044

    invoke-static {p1, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setBackgroundColor(I)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object p1, p0, Lmf0$c;->b:Lmf0;

    iget-object p1, p1, Lmf0;->m:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/PinFieldLayout;->setLayoutbgError()V

    .line 9
    iget-object p1, p0, Lmf0$c;->b:Lmf0;

    iget-object p1, p1, Lmf0;->m:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/PinFieldLayout;->hideIndicator()V

    .line 10
    iget-object p1, p0, Lmf0$c;->b:Lmf0;

    iget-object p1, p1, Lmf0;->m:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/PinFieldLayout;->seterrorText()V

    .line 11
    iget-object p1, p0, Lmf0$c;->b:Lmf0;

    iget-object p1, p1, Lmf0;->n:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setClickable(Z)V

    .line 12
    iget-object p1, p0, Lmf0$c;->b:Lmf0;

    iget-object v1, p1, Lmf0;->n:Landroid/widget/Button;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1, v0}, Lt8;->d(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setBackgroundColor(I)V

    goto :goto_0

    .line 13
    :cond_1
    iget-object p1, p0, Lmf0$c;->b:Lmf0;

    iget-object p1, p1, Lmf0;->m:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/PinFieldLayout;->hideIndicatorErrorText()V

    .line 14
    iget-object p1, p0, Lmf0$c;->b:Lmf0;

    iget-object p1, p1, Lmf0;->m:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/PinFieldLayout;->setLayoutbg()V

    .line 15
    iget-object p1, p0, Lmf0$c;->b:Lmf0;

    iget-object p1, p1, Lmf0;->n:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setClickable(Z)V

    .line 16
    iget-object p1, p0, Lmf0$c;->b:Lmf0;

    iget-object p1, p1, Lmf0;->n:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 17
    iget-object p1, p0, Lmf0$c;->b:Lmf0;

    iget-object v1, p1, Lmf0;->n:Landroid/widget/Button;

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
