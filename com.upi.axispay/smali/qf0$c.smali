.class public Lqf0$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqf0;->C(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Lqf0;


# direct methods
.method public constructor <init>(Lqf0;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqf0$c;->c:Lqf0;

    iput-object p2, p0, Lqf0$c;->b:Ljava/util/ArrayList;

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

    if-nez p3, :cond_0

    .line 1
    iget-object p1, p0, Lqf0$c;->c:Lqf0;

    iget-object p1, p1, Lqf0;->t:Landroid/widget/TextView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    iget-object p1, p0, Lqf0$c;->c:Lqf0;

    iget-object p1, p1, Lqf0;->y:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    iget-object p1, p0, Lqf0$c;->c:Lqf0;

    iget-object p1, p1, Lqf0;->p:Landroid/widget/Button;

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setVisibility(I)V

    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lqf0$c;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/Account;

    .line 5
    iget-object p2, p0, Lqf0$c;->c:Lqf0;

    iput p3, p2, Lqf0;->A:I

    if-eqz p1, :cond_3

    .line 6
    iput-object p1, p2, Lqf0;->B:Lcom/olive/upi/transport/model/Account;

    .line 7
    iget-object p2, p2, Lqf0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 8
    iget-object p2, p0, Lqf0$c;->c:Lqf0;

    iget-object p2, p2, Lqf0;->D:Lcom/olive/upi/transport/model/TransactionData;

    sget p3, Lcom/olive/upi/transport/model/TransactionData;->MODE_SEND_VIA_IFSC:I

    invoke-virtual {p2, p3}, Lcom/olive/upi/transport/model/TransactionData;->setDirection(I)V

    .line 9
    iget-object p2, p0, Lqf0$c;->c:Lqf0;

    iget-object p2, p2, Lqf0;->q:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getMaskedAccnumber()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object p2, p0, Lqf0$c;->c:Lqf0;

    iget-object p2, p2, Lqf0;->r:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object p2, p0, Lqf0$c;->c:Lqf0;

    iget-object p2, p2, Lqf0;->v:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getIfsc()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object p2, p0, Lqf0$c;->c:Lqf0;

    iget-object p2, p2, Lqf0;->x:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object p2, p0, Lqf0$c;->c:Lqf0;

    iget-object p2, p2, Lqf0;->w:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getType()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getIin()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lqa0;->e(Ljava/lang/String;)Lcom/olive/upi/transport/model/Bank;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 15
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Bank;->getLogo()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    const p4, 0x7f080070

    if-eqz p3, :cond_1

    .line 16
    iget-object p2, p0, Lqf0$c;->c:Lqf0;

    iget-object p3, p2, Lqf0;->z:Landroid/widget/ImageView;

    iget-object p2, p2, Lqf0;->l:Landroid/content/Context;

    invoke-static {p2, p4}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 17
    :cond_1
    iget-object p3, p0, Lqf0$c;->c:Lqf0;

    iget-object p3, p3, Lqf0;->z:Landroid/widget/ImageView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Bank;->getLogo()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2, p4}, Ljg0;->K(Landroid/widget/ImageView;Ljava/lang/String;I)V

    .line 18
    :cond_2
    :goto_0
    iget-object p2, p0, Lqf0$c;->c:Lqf0;

    iget-object p2, p2, Lqf0;->p:Landroid/widget/Button;

    new-instance p3, Lqf0$c$a;

    invoke-direct {p3, p0, p1}, Lqf0$c$a;-><init>(Lqf0$c;Lcom/olive/upi/transport/model/Account;)V

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    :cond_3
    iget-object p1, p0, Lqf0$c;->c:Lqf0;

    iget-object p1, p1, Lqf0;->t:Landroid/widget/TextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 20
    iget-object p1, p0, Lqf0$c;->c:Lqf0;

    iget-object p1, p1, Lqf0;->y:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 21
    iget-object p1, p0, Lqf0$c;->c:Lqf0;

    iget-object p1, p1, Lqf0;->p:Landroid/widget/Button;

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setVisibility(I)V

    .line 22
    iget-object p1, p0, Lqf0$c;->c:Lqf0;

    iget-object p1, p1, Lqf0;->u:Landroid/widget/TextView;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 23
    iget-object p1, p0, Lqf0$c;->c:Lqf0;

    iget-object p1, p1, Lqf0;->s:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 24
    iget-object p1, p0, Lqf0$c;->c:Lqf0;

    iget-object p1, p1, Lqf0;->D:Lcom/olive/upi/transport/model/TransactionData;

    sget p2, Lcom/olive/upi/transport/model/TransactionData;->MODE_SEND_VIA_IFSC:I

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 25
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lqf0$c;->c:Lqf0;

    iget-object p2, p2, Lqf0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

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
