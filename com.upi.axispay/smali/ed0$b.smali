.class public Led0$b;
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
    iput-object p1, p0, Led0$b;->b:Led0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    .line 2
    iget-object p1, p0, Led0$b;->b:Led0;

    iget-object p1, p1, Led0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljg0;->J(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Led0$b;->b:Led0;

    iget-object p1, p1, Led0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v0, 0x7f1204f7

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    .line 4
    iget-object p1, p0, Led0$b;->b:Led0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f1204f8

    invoke-static {p1, v0}, Leg0;->z(Landroid/content/Context;I)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Led0$b;->b:Led0;

    iget-object p1, p1, Led0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    goto :goto_0

    .line 6
    :cond_1
    iget-object p1, p0, Led0$b;->b:Led0;

    iget-object p1, p1, Led0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

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
