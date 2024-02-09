.class public Lkf0$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkf0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lkf0;


# direct methods
.method public constructor <init>(Lkf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkf0$c;->b:Lkf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget-object p1, p0, Lkf0$c;->b:Lkf0;

    iget-object p1, p1, Lkf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    const/4 p2, 0x1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lkf0$c;->b:Lkf0;

    iget-object p1, p1, Lkf0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p1, p3, p2}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 3
    iget-object p1, p0, Lkf0$c;->b:Lkf0;

    iget-object p1, p1, Lkf0;->l:Landroid/widget/Button;

    const p2, 0x7f080069

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 4
    iget-object p1, p0, Lkf0$c;->b:Lkf0;

    iget-object p1, p1, Lkf0;->l:Landroid/widget/Button;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setClickable(Z)V

    .line 5
    iget-object p1, p0, Lkf0$c;->b:Lkf0;

    iget-object p1, p1, Lkf0;->l:Landroid/widget/Button;

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setEnabled(Z)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lkf0$c;->b:Lkf0;

    iget-object p1, p1, Lkf0;->l:Landroid/widget/Button;

    const p3, 0x7f080067

    invoke-virtual {p1, p3}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 7
    iget-object p1, p0, Lkf0$c;->b:Lkf0;

    iget-object p1, p1, Lkf0;->l:Landroid/widget/Button;

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setClickable(Z)V

    .line 8
    iget-object p1, p0, Lkf0$c;->b:Lkf0;

    iget-object p1, p1, Lkf0;->l:Landroid/widget/Button;

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setEnabled(Z)V

    :goto_0
    return-void
.end method
