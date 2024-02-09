.class public Lsc0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsc0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lsc0;


# direct methods
.method public constructor <init>(Lsc0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsc0$a;->b:Lsc0;

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
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 p2, 0x3

    if-ge p1, p2, :cond_0

    .line 2
    iget-object p1, p0, Lsc0$a;->b:Lsc0;

    iget-object p1, p1, Lsc0;->p:Landroid/widget/Button;

    const p2, 0x7f080069

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 3
    iget-object p1, p0, Lsc0$a;->b:Lsc0;

    iget-object p1, p1, Lsc0;->p:Landroid/widget/Button;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setClickable(Z)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lsc0$a;->b:Lsc0;

    iget-object p1, p1, Lsc0;->p:Landroid/widget/Button;

    const p2, 0x7f080067

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 5
    iget-object p1, p0, Lsc0$a;->b:Lsc0;

    iget-object p1, p1, Lsc0;->p:Landroid/widget/Button;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setClickable(Z)V

    .line 6
    :goto_0
    iget-object p1, p0, Lsc0$a;->b:Lsc0;

    iget-object p1, p1, Lsc0;->r:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    return-void
.end method
