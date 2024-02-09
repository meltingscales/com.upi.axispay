.class public Ltf0$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltf0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ltf0;


# direct methods
.method public constructor <init>(Ltf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltf0$b;->b:Ltf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object v0, p0, Ltf0$b;->b:Ltf0;

    iget-object v0, v0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v0}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 2
    iget-object p1, p0, Ltf0$b;->b:Ltf0;

    iget-object p1, p1, Ltf0;->n:Landroid/widget/Button;

    invoke-virtual {p1}, Landroid/widget/Button;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ltf0$b;->b:Ltf0;

    iget-object p1, p1, Ltf0;->n:Landroid/widget/Button;

    invoke-virtual {p1}, Landroid/widget/Button;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 3
    :goto_0
    iget-object v0, p0, Ltf0$b;->b:Ltf0;

    iget v1, v0, Ltf0;->d0:I

    if-ne p1, v1, :cond_2

    .line 4
    invoke-static {v0}, Ltf0;->x(Ltf0;)Landroid/widget/Spinner;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result p1

    if-nez p1, :cond_1

    .line 5
    iget-object p1, p0, Ltf0$b;->b:Ltf0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    iget-object v0, p0, Ltf0$b;->b:Ltf0;

    const v1, 0x7f1203f6

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_1

    .line 6
    :cond_1
    iget-object p1, p0, Ltf0$b;->b:Ltf0;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ltf0;->C(Z)V

    goto :goto_1

    .line 7
    :cond_2
    iget-object p1, v0, Lxc0;->b:Lmg0;

    const/16 v1, 0x3a

    iget-object v0, v0, Ltf0;->Z:Lcom/olive/upi/transport/model/Account;

    invoke-interface {p1, v1, v0}, Lmg0;->t(ILjava/lang/Object;)V

    :goto_1
    return-void
.end method
