.class public Lte0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lte0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lte0;


# direct methods
.method public constructor <init>(Lte0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lte0$a;->b:Lte0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lte0$a;->b:Lte0;

    iget-object v0, v0, Lte0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    .line 2
    iget-object v0, p0, Lte0$a;->b:Lte0;

    iget-object v0, v0, Lte0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x14ad

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 3
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 4
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lqa0;->U(Ldg0;)V

    .line 5
    iget-object p1, p0, Lte0$a;->b:Lte0;

    iget-object p1, p1, Lte0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 7
    iget-object v0, p0, Lte0$a;->b:Lte0;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lte0;->z(Ljava/lang/String;)V

    :cond_1
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
