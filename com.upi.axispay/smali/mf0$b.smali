.class public Lmf0$b;
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
    iput-object p1, p0, Lmf0$b;->b:Lmf0;

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

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lmf0$b;->b:Lmf0;

    iget-object p1, p1, Lmf0;->l:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/PinFieldLayout;->setLayoutbgCorrect()V

    .line 3
    iget-object p1, p0, Lmf0$b;->b:Lmf0;

    iget-object p1, p1, Lmf0;->l:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/PinFieldLayout;->showIndicator()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lmf0$b;->b:Lmf0;

    iget-object p1, p1, Lmf0;->l:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/PinFieldLayout;->setLayoutbg()V

    .line 5
    iget-object p1, p0, Lmf0$b;->b:Lmf0;

    iget-object p1, p1, Lmf0;->l:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/PinFieldLayout;->hideIndicatorErrorText()V

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
