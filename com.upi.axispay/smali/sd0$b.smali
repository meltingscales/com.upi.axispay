.class public Lsd0$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsd0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lsd0;


# direct methods
.method public constructor <init>(Lsd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsd0$b;->b:Lsd0;

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
    iget-object p1, p0, Lsd0$b;->b:Lsd0;

    invoke-static {p1}, Lsd0;->x(Lsd0;)Landroid/widget/Button;

    move-result-object p1

    const p2, 0x7f080069

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 3
    iget-object p1, p0, Lsd0$b;->b:Lsd0;

    invoke-static {p1}, Lsd0;->x(Lsd0;)Landroid/widget/Button;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setClickable(Z)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lsd0$b;->b:Lsd0;

    invoke-static {p1}, Lsd0;->x(Lsd0;)Landroid/widget/Button;

    move-result-object p1

    const p2, 0x7f080067

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 5
    iget-object p1, p0, Lsd0$b;->b:Lsd0;

    invoke-static {p1}, Lsd0;->x(Lsd0;)Landroid/widget/Button;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setClickable(Z)V

    .line 6
    :goto_0
    iget-object p1, p0, Lsd0$b;->b:Lsd0;

    iget-object p1, p1, Lsd0;->v:Landroid/widget/TextView;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method
