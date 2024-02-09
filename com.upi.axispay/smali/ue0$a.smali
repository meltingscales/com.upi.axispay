.class public Lue0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lue0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lue0;


# direct methods
.method public constructor <init>(Lue0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lue0$a;->b:Lue0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lue0$a;->b:Lue0;

    invoke-virtual {v0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Lue0$a;->b:Lue0;

    iget-object v1, v1, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getId()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 3
    iget-object v0, p0, Lue0$a;->b:Lue0;

    iget-object v0, v0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    .line 4
    iget-object v0, p0, Lue0$a;->b:Lue0;

    iget-object v0, v0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x2c0

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lqa0;->U(Ldg0;)V

    .line 6
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x4

    if-ge v0, v3, :cond_0

    .line 7
    iget-object p1, p0, Lue0$a;->b:Lue0;

    iput-boolean v2, p1, Lue0;->s:Z

    .line 8
    iget-object p1, p1, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    .line 9
    iget-object p1, p0, Lue0$a;->b:Lue0;

    iget-object p1, p1, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lue0$a;->b:Lue0;

    iget-object p1, p1, Lue0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Lue0$a;->b:Lue0;

    iget-object p1, p1, Lue0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    if-ne v0, v3, :cond_1

    .line 13
    iget-object v0, p0, Lue0$a;->b:Lue0;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lue0;->A(Ljava/lang/String;)V

    .line 14
    iget-object p1, p0, Lue0$a;->b:Lue0;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lue0;->t:Z

    .line 15
    iput-boolean v2, p1, Lue0;->s:Z

    goto :goto_0

    .line 16
    :cond_1
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    if-le v0, v3, :cond_2

    iget-object v0, p0, Lue0$a;->b:Lue0;

    iget-boolean v1, v0, Lue0;->t:Z

    if-nez v1, :cond_2

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x5

    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lue0;->A(Ljava/lang/String;)V

    :cond_2
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
