.class public Ltf0$f;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltf0;->F(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Ltf0;


# direct methods
.method public constructor <init>(Ltf0;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltf0$f;->c:Ltf0;

    iput-object p2, p0, Ltf0$f;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    const/16 p1, 0x8

    if-nez p3, :cond_0

    .line 1
    iget-object p2, p0, Ltf0$f;->c:Ltf0;

    iget-object p2, p2, Ltf0;->F:Landroid/widget/RelativeLayout;

    invoke-virtual {p2, p1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2
    iget-object p2, p0, Ltf0$f;->c:Ltf0;

    iget-object p2, p2, Ltf0;->o:Landroid/widget/Button;

    invoke-virtual {p2, p1}, Landroid/widget/Button;->setVisibility(I)V

    return-void

    .line 3
    :cond_0
    iget-object p2, p0, Ltf0$f;->b:Ljava/util/ArrayList;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/olive/upi/transport/model/Account;

    .line 4
    iget-object p4, p0, Ltf0$f;->c:Ltf0;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iput-object p3, p4, Ltf0;->G:Ljava/lang/Integer;

    if-eqz p2, :cond_2

    .line 5
    iget-object p1, p0, Ltf0$f;->c:Ltf0;

    iput-object p2, p1, Ltf0;->Z:Lcom/olive/upi/transport/model/Account;

    .line 6
    iget-object p1, p1, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 7
    iget-object p1, p0, Ltf0$f;->c:Ltf0;

    iget-object p1, p1, Ltf0;->v:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getType()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object p1, p0, Ltf0$f;->c:Ltf0;

    iget-object p1, p1, Ltf0;->w:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getMaskedAccnumber()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object p1, p0, Ltf0$f;->c:Ltf0;

    iget-object p1, p1, Ltf0;->D:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getIfsc()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object p1, p0, Ltf0$f;->c:Ltf0;

    iget-object p1, p1, Ltf0;->x:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object p1, p0, Ltf0$f;->c:Ltf0;

    iget-object p1, p1, Ltf0;->E:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getIin()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lqa0;->e(Ljava/lang/String;)Lcom/olive/upi/transport/model/Bank;

    move-result-object p1

    const p3, 0x7f080070

    if-eqz p1, :cond_1

    .line 13
    iget-object p4, p0, Ltf0$f;->c:Ltf0;

    iget-object p4, p4, Ltf0;->r:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Bank;->getLogo()Ljava/lang/String;

    move-result-object p1

    invoke-static {p4, p1, p3}, Ljg0;->K(Landroid/widget/ImageView;Ljava/lang/String;I)V

    goto :goto_0

    .line 14
    :cond_1
    iget-object p1, p0, Ltf0$f;->c:Ltf0;

    iget-object p1, p1, Ltf0;->r:Landroid/widget/ImageView;

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 15
    :goto_0
    iget-object p1, p0, Ltf0$f;->c:Ltf0;

    iget-object p1, p1, Ltf0;->o:Landroid/widget/Button;

    new-instance p3, Ltf0$f$a;

    invoke-direct {p3, p0, p2}, Ltf0$f$a;-><init>(Ltf0$f;Lcom/olive/upi/transport/model/Account;)V

    invoke-virtual {p1, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    iget-object p1, p0, Ltf0$f;->c:Ltf0;

    iget-object p1, p1, Ltf0;->z:Landroid/widget/TextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 17
    iget-object p1, p0, Ltf0$f;->c:Ltf0;

    iget-object p1, p1, Ltf0;->F:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 18
    iget-object p1, p0, Ltf0$f;->c:Ltf0;

    iget-object p1, p1, Ltf0;->o:Landroid/widget/Button;

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setVisibility(I)V

    .line 19
    iget-object p1, p0, Ltf0$f;->c:Ltf0;

    iget-object p1, p1, Ltf0;->A:Landroid/widget/TextView;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 20
    iget-object p1, p0, Ltf0$f;->c:Ltf0;

    iget-object p1, p1, Ltf0;->y:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 21
    :cond_2
    iget-object p2, p0, Ltf0$f;->c:Ltf0;

    invoke-static {p2}, Ltf0;->y(Ltf0;)V

    .line 22
    iget-object p2, p0, Ltf0$f;->c:Ltf0;

    iget-object p2, p2, Ltf0;->z:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 23
    iget-object p2, p0, Ltf0$f;->c:Ltf0;

    iget-object p2, p2, Ltf0;->F:Landroid/widget/RelativeLayout;

    invoke-virtual {p2, p1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 24
    iget-object p2, p0, Ltf0$f;->c:Ltf0;

    iget-object p2, p2, Ltf0;->o:Landroid/widget/Button;

    invoke-virtual {p2, p1}, Landroid/widget/Button;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
