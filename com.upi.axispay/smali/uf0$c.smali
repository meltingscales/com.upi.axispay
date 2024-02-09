.class public Luf0$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luf0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Luf0;


# direct methods
.method public constructor <init>(Luf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Luf0$c;->b:Luf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .line 1
    iget-object v0, p0, Luf0$c;->b:Luf0;

    iget-object v0, v0, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    .line 2
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    const v0, 0x7f060047

    const/4 v1, 0x0

    const/4 v2, 0x6

    if-ne p1, v2, :cond_3

    .line 3
    iget-object p1, p0, Luf0$c;->b:Luf0;

    iget-object p1, p1, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljg0;->J(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Luf0$c;->b:Luf0;

    iget-object p1, p1, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v2, 0x7f1204f7

    invoke-virtual {p1, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    .line 5
    iget-object p1, p0, Luf0$c;->b:Luf0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    iget-object v2, p0, Luf0$c;->b:Luf0;

    const v3, 0x7f1204f8

    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Luf0$c;->b:Luf0;

    iget-object p1, p1, Luf0;->o:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 7
    iget-object p1, p0, Luf0$c;->b:Luf0;

    iget-object v1, p1, Luf0;->o:Landroid/widget/Button;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lt8;->d(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setBackgroundColor(I)V

    goto/16 :goto_0

    .line 8
    :cond_0
    iget-object p1, p0, Luf0$c;->b:Luf0;

    iget-object p1, p1, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Luf0$c;->b:Luf0;

    iget-object v2, v2, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 9
    iget-object p1, p0, Luf0$c;->b:Luf0;

    iget-object p1, p1, Luf0;->o:Landroid/widget/Button;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 10
    iget-object p1, p0, Luf0$c;->b:Luf0;

    iget-object v0, p1, Luf0;->o:Landroid/widget/Button;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    const v1, 0x7f060049

    invoke-static {p1, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setBackgroundColor(I)V

    goto :goto_0

    .line 11
    :cond_1
    iget-object p1, p0, Luf0$c;->b:Luf0;

    iget-object p1, p1, Luf0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 12
    iget-object p1, p0, Luf0$c;->b:Luf0;

    iget-object p1, p1, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v2, 0x7f120190

    invoke-virtual {p1, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    .line 13
    iget-object p1, p0, Luf0$c;->b:Luf0;

    iget-object p1, p1, Luf0;->o:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 14
    iget-object p1, p0, Luf0$c;->b:Luf0;

    iget-object v1, p1, Luf0;->o:Landroid/widget/Button;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lt8;->d(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setBackgroundColor(I)V

    goto :goto_0

    .line 15
    :cond_2
    iget-object p1, p0, Luf0$c;->b:Luf0;

    iget-object p1, p1, Luf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v2, 0x7f120328

    invoke-virtual {p1, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    .line 16
    iget-object p1, p0, Luf0$c;->b:Luf0;

    iget-object p1, p1, Luf0;->o:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 17
    iget-object p1, p0, Luf0$c;->b:Luf0;

    iget-object v1, p1, Luf0;->o:Landroid/widget/Button;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lt8;->d(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setBackgroundColor(I)V

    goto :goto_0

    .line 18
    :cond_3
    iget-object p1, p0, Luf0$c;->b:Luf0;

    iget-object p1, p1, Luf0;->o:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 19
    iget-object p1, p0, Luf0$c;->b:Luf0;

    iget-object v1, p1, Luf0;->o:Landroid/widget/Button;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

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
