.class public Lee0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lua0$e;


# instance fields
.field public A:Landroid/widget/TextView;

.field public B:Landroid/widget/TextView;

.field public C:Lcom/olive/upi/transport/model/MandateTransactionData;

.field public D:Landroid/widget/ImageView;

.field public E:Landroid/widget/ImageView;

.field public F:Landroid/widget/LinearLayout;

.field public G:Landroid/graphics/Bitmap;

.field public H:Landroid/graphics/Bitmap;

.field public l:Landroid/view/View;

.field public m:Landroid/view/LayoutInflater;

.field public n:Landroid/view/ViewGroup;

.field public o:Landroid/widget/Button;

.field public p:Landroid/widget/TextView;

.field public q:Landroid/widget/TextView;

.field public r:Landroid/widget/TextView;

.field public s:Landroid/widget/TextView;

.field public t:Landroid/widget/TextView;

.field public u:Landroid/widget/TextView;

.field public v:Landroid/widget/TextView;

.field public w:Landroid/widget/TextView;

.field public x:Landroid/widget/TextView;

.field public y:Landroid/widget/TextView;

.field public z:Landroid/widget/TextView;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static synthetic x(Lee0;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lee0;->A(I)V

    return-void
.end method

.method public static y()Lee0;
    .locals 1

    .line 1
    new-instance v0, Lee0;

    invoke-direct {v0}, Lee0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final A(I)V
    .locals 6

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object v1

    invoke-static {v1}, Lig0;->a(Lcom/olive/upi/transport/model/MandateTransactionData;)Ljava/lang/String;

    move-result-object v1

    :try_start_0
    const v0, 0x1fd3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    .line 3
    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    .line 4
    new-instance v2, Lcom/olive/upi/transport/model/IntentData;

    invoke-direct {v2}, Lcom/olive/upi/transport/model/IntentData;-><init>()V

    .line 5
    sget-object v3, Ln70;->f:Ln70$a;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v4

    const v0, 0x1fd4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/olive/upi/transport/model/IntentData;->setAppId(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v0, 0x1fd5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/IntentData;->setCustomerId(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/IntentData;->setData(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/IntentData;->setIntentData(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v1

    invoke-static {v1}, Leg0;->i(Landroid/app/Activity;)V

    .line 10
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, 0x6e

    invoke-direct {v3, v4, p1, v2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, v3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    .line 1
    iput-object p1, p0, Lee0;->m:Landroid/view/LayoutInflater;

    .line 2
    iput-object p2, p0, Lee0;->n:Landroid/view/ViewGroup;

    const p3, 0x7f0d00cb

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lee0;->l:Landroid/view/View;

    const p1, 0x7f120466

    .line 4
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/16 p2, 0x6e

    invoke-virtual {p0, p2, p1}, Lxc0;->v(ILjava/lang/String;)V

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p1

    iput-object p1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 6
    invoke-static {}, Ljg0;->v()Ljava/lang/String;

    move-result-object p1

    .line 7
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const p1, 0x1fd6

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 8
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    const p2, 0x7f0a00db

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lee0;->o:Landroid/widget/Button;

    const p2, 0x7f080096

    .line 9
    invoke-virtual {p1, p2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 10
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    const p2, 0x7f0a01fc

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lee0;->r:Landroid/widget/TextView;

    .line 11
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    const p2, 0x7f0a015c

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lee0;->p:Landroid/widget/TextView;

    .line 12
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    const p2, 0x7f0a015b

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lee0;->q:Landroid/widget/TextView;

    .line 13
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    const p2, 0x7f0a0506

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lee0;->s:Landroid/widget/TextView;

    .line 14
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    const p2, 0x7f0a007b

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lee0;->t:Landroid/widget/TextView;

    .line 15
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    const p2, 0x7f0a037b

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lee0;->w:Landroid/widget/TextView;

    .line 16
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    const p2, 0x7f0a0539

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lee0;->u:Landroid/widget/TextView;

    .line 17
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    const p2, 0x7f0a037a

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lee0;->v:Landroid/widget/TextView;

    .line 18
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    const p2, 0x7f0a051b

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    .line 19
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    const p2, 0x7f0a0167

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lee0;->x:Landroid/widget/TextView;

    .line 20
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    const p2, 0x7f0a051a

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lee0;->z:Landroid/widget/TextView;

    .line 21
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    const p2, 0x7f0a0237

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lee0;->D:Landroid/widget/ImageView;

    .line 22
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    const p2, 0x7f0a0407

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lee0;->E:Landroid/widget/ImageView;

    .line 23
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    const p2, 0x7f0a017f

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lee0;->F:Landroid/widget/LinearLayout;

    .line 24
    iget-object p1, p0, Lee0;->D:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 25
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    const/4 p2, 0x0

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 26
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    const p2, 0x7f0a053c

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lee0;->A:Landroid/widget/TextView;

    .line 27
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    const p2, 0x7f0a037d

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lee0;->B:Landroid/widget/TextView;

    .line 28
    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const v1, 0x1fd7

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    if-eqz p2, :cond_0

    move-object p2, v1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    iget-object p1, p0, Lee0;->A:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p1

    iput-object p1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 31
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p1

    .line 32
    iget-object p2, p0, Lee0;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getRecurrence()Ljava/lang/String;

    move-result-object v1

    const v2, 0x1fd8

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_2

    iget-object v1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getRecurrence()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v2

    :goto_2
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    iget-object p2, p0, Lee0;->p:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getTransactionOn()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v3, 0x1fd9

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    iget-object p2, p0, Lee0;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getDebitAccountNo()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result p2

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_REVOKE_MANDATE:I

    const v3, 0x7f060032

    const v4, 0x1fda

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f080296

    const v6, 0x7f08027e

    const v7, 0x7f120464

    const/16 v8, 0xa

    if-ne p2, v1, :cond_4

    .line 36
    iget-object p1, p0, Lee0;->t:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    iget-object p1, p0, Lee0;->r:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    iget-object p1, p0, Lee0;->s:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    iget-object p1, p0, Lee0;->u:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getRecurrence()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    iget-object p1, p0, Lee0;->w:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getPayeeName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    iget-object p1, p0, Lee0;->v:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getPayeeVpa()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    iget-object p1, p0, Lee0;->x:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    iget-object p1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getQueryStatus()Ljava/lang/String;

    .line 44
    iget-object p1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result p1

    if-eq p1, v8, :cond_3

    .line 45
    iget-object p1, p0, Lee0;->D:Landroid/widget/ImageView;

    invoke-virtual {p1, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 46
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    iget-object p1, p0, Lee0;->z:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_4

    .line 49
    :cond_3
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    iget-object p1, p0, Lee0;->z:Landroid/widget/TextView;

    const p2, 0x7f12024d

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    iget-object p1, p0, Lee0;->D:Landroid/widget/ImageView;

    invoke-virtual {p1, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_4

    .line 52
    :cond_4
    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result p2

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_MANDATE_EXECUTE:I

    if-ne p2, v1, :cond_7

    .line 53
    iget-object p1, p0, Lee0;->t:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    iget-object p1, p0, Lee0;->r:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    iget-object p1, p0, Lee0;->s:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    iget-object p1, p0, Lee0;->u:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getRecurrence()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_5

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getRecurrence()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_5

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getRecurrence()Ljava/lang/String;

    move-result-object v2

    :cond_5
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    iget-object p1, p0, Lee0;->v:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getPayeeVpa()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    iget-object p1, p0, Lee0;->w:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getPayeeName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    iget-object p1, p0, Lee0;->x:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    iget-object p1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getQueryStatus()Ljava/lang/String;

    .line 61
    iget-object p1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result p1

    if-eq p1, v8, :cond_6

    .line 62
    iget-object p1, p0, Lee0;->D:Landroid/widget/ImageView;

    invoke-virtual {p1, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 63
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    iget-object p1, p0, Lee0;->z:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_4

    .line 66
    :cond_6
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    iget-object p1, p0, Lee0;->z:Landroid/widget/TextView;

    const p2, 0x7f1201b2

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    iget-object p1, p0, Lee0;->D:Landroid/widget/ImageView;

    invoke-virtual {p1, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_4

    .line 69
    :cond_7
    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result p2

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_MANDATE_DECLINE:I

    if-ne p2, v1, :cond_a

    .line 70
    iget-object p1, p0, Lee0;->t:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    iget-object p1, p0, Lee0;->r:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    iget-object p1, p0, Lee0;->s:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    iget-object p1, p0, Lee0;->w:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getPayeeName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    iget-object p1, p0, Lee0;->u:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getRecurrence()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_8

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getRecurrence()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_8

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getRecurrence()Ljava/lang/String;

    move-result-object v2

    :cond_8
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    iget-object p1, p0, Lee0;->v:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getPayeeVpa()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    iget-object p1, p0, Lee0;->x:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    iget-object p1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getQueryStatus()Ljava/lang/String;

    .line 78
    iget-object p1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result p1

    if-eq p1, v8, :cond_9

    .line 79
    iget-object p1, p0, Lee0;->D:Landroid/widget/ImageView;

    invoke-virtual {p1, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 80
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    iget-object p1, p0, Lee0;->z:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_4

    .line 83
    :cond_9
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    iget-object p1, p0, Lee0;->z:Landroid/widget/TextView;

    const p2, 0x7f12013d

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    iget-object p1, p0, Lee0;->D:Landroid/widget/ImageView;

    invoke-virtual {p1, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_4

    .line 86
    :cond_a
    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result p2

    if-eq p2, p3, :cond_f

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result p2

    const/4 p3, 0x4

    if-ne p2, p3, :cond_b

    goto/16 :goto_3

    .line 87
    :cond_b
    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result p2

    const/4 p3, 0x3

    if-ne p2, p3, :cond_d

    .line 88
    iget-object p2, p0, Lee0;->t:Landroid/widget/TextView;

    iget-object p3, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljg0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    iget-object p2, p0, Lee0;->r:Landroid/widget/TextView;

    iget-object p3, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    iget-object p2, p0, Lee0;->s:Landroid/widget/TextView;

    iget-object p3, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    iget-object p2, p0, Lee0;->w:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    iget-object p1, p0, Lee0;->u:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getRecurrence()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    iget-object p1, p0, Lee0;->v:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getPayeeVpa()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    iget-object p1, p0, Lee0;->x:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    iget-object p1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getQueryStatus()Ljava/lang/String;

    .line 96
    iget-object p1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result p1

    if-eq p1, v8, :cond_c

    .line 97
    iget-object p1, p0, Lee0;->D:Landroid/widget/ImageView;

    invoke-virtual {p1, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 98
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    iget-object p1, p0, Lee0;->z:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_4

    .line 101
    :cond_c
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    iget-object p1, p0, Lee0;->z:Landroid/widget/TextView;

    const p2, 0x7f120463

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    iget-object p1, p0, Lee0;->D:Landroid/widget/ImageView;

    invoke-virtual {p1, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 104
    iget-object p1, p0, Lee0;->E:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 105
    iget-object p1, p0, Lee0;->F:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_4

    .line 106
    :cond_d
    iget-object p1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result p1

    sget p2, Lcom/olive/upi/transport/model/TransactionData;->MODE_APPROVE_MANDATE:I

    if-ne p1, p2, :cond_11

    .line 107
    iget-object p1, p0, Lee0;->t:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 108
    iget-object p1, p0, Lee0;->r:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    iget-object p1, p0, Lee0;->s:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    iget-object p1, p0, Lee0;->w:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getPayeeName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    iget-object p1, p0, Lee0;->u:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getRecurrence()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    iget-object p1, p0, Lee0;->v:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getPayeeVpa()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    iget-object p1, p0, Lee0;->x:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    iget-object p1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result p1

    if-eq p1, v8, :cond_e

    .line 115
    iget-object p1, p0, Lee0;->D:Landroid/widget/ImageView;

    invoke-virtual {p1, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 116
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    iget-object p1, p0, Lee0;->z:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_4

    .line 119
    :cond_e
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    iget-object p1, p0, Lee0;->z:Landroid/widget/TextView;

    const p2, 0x7f120502

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    iget-object p1, p0, Lee0;->D:Landroid/widget/ImageView;

    invoke-virtual {p1, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_4

    .line 122
    :cond_f
    :goto_3
    iget-object p2, p0, Lee0;->t:Landroid/widget/TextView;

    iget-object p3, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljg0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    iget-object p2, p0, Lee0;->r:Landroid/widget/TextView;

    iget-object p3, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    iget-object p2, p0, Lee0;->s:Landroid/widget/TextView;

    iget-object p3, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    iget-object p2, p0, Lee0;->w:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    iget-object p2, p0, Lee0;->u:Landroid/widget/TextView;

    iget-object p3, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getOccurence()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    iget-object p2, p0, Lee0;->v:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    iget-object p1, p0, Lee0;->x:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    iget-object p1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getQueryStatus()Ljava/lang/String;

    .line 130
    iget-object p1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionStatus()I

    move-result p1

    if-eq p1, v8, :cond_10

    .line 131
    iget-object p1, p0, Lee0;->D:Landroid/widget/ImageView;

    invoke-virtual {p1, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 132
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    iget-object p1, p0, Lee0;->z:Landroid/widget/TextView;

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_4

    .line 135
    :cond_10
    iget-object p1, p0, Lee0;->y:Landroid/widget/TextView;

    invoke-virtual {p0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 136
    iget-object p1, p0, Lee0;->z:Landroid/widget/TextView;

    const p2, 0x7f120462

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    iget-object p1, p0, Lee0;->D:Landroid/widget/ImageView;

    invoke-virtual {p1, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 138
    iget-object p1, p0, Lee0;->E:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 139
    iget-object p1, p0, Lee0;->F:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 140
    :cond_11
    :goto_4
    iget-object p1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->setStartMandate(Ljava/lang/String;)V

    .line 141
    iget-object p1, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->setEndmandate(Ljava/lang/String;)V

    .line 142
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lee0;->C:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 143
    iget-object p1, p0, Lee0;->E:Landroid/widget/ImageView;

    new-instance p2, Lee0$a;

    invoke-direct {p2, p0}, Lee0$a;-><init>(Lee0;)V

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    iget-object p1, p0, Lee0;->o:Landroid/widget/Button;

    new-instance p2, Lee0$b;

    invoke-direct {p2, p0}, Lee0$b;-><init>(Lee0;)V

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 145
    iget-object p1, p0, Lee0;->F:Landroid/widget/LinearLayout;

    new-instance p2, Lee0$c;

    invoke-direct {p2, p0}, Lee0$c;-><init>(Lee0;)V

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 146
    iget-object p1, p0, Lee0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 0

    .line 1
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    const v0, 0x7f120466

    .line 3
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x6e

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v1

    const/16 v2, 0x53

    if-eq v1, v2, :cond_0

    const/16 v3, 0x247

    if-eq v1, v3, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 3
    :try_start_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x2

    .line 4
    invoke-static {p2, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p2

    .line 5
    new-instance v1, Ljava/lang/String;

    const v0, 0x1fdb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p2, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const/16 v3, 0xfa

    invoke-static {v1, p2, v3}, Ljg0;->e(Ljava/lang/String;Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object p2

    iput-object p2, p0, Lee0;->G:Landroid/graphics/Bitmap;

    .line 7
    iget-object p2, p0, Lee0;->m:Landroid/view/LayoutInflater;

    iget-object v1, p0, Lee0;->n:Landroid/view/ViewGroup;

    invoke-virtual {p0, p2, v1}, Lee0;->z(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    .line 8
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    if-ne p1, v2, :cond_1

    .line 9
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    iget-object p2, p0, Lee0;->H:Landroid/graphics/Bitmap;

    invoke-static {p1, p2}, Lyg0;->c(Landroid/content/Context;Landroid/graphics/Bitmap;)Ljava/lang/String;

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    iget-object p2, p0, Lee0;->H:Landroid/graphics/Bitmap;

    invoke-static {p1, p2}, Lyg0;->b(Landroid/app/Activity;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public final z(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
    .locals 4

    const v0, 0x7f0d00bf

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0a035f

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    const p2, 0x7f0a023b

    .line 3
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    .line 4
    iget-object v0, p0, Lee0;->G:Landroid/graphics/Bitmap;

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    const/4 p2, 0x1

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 6
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 8
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/view/View;->measure(II)V

    .line 9
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {p1, v1, v1, v2, v0}, Landroid/view/View;->layout(IIII)V

    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->buildDrawingCache(Z)V

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p2

    iput-object p2, p0, Lee0;->H:Landroid/graphics/Bitmap;

    .line 12
    invoke-virtual {p1, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    return-void
.end method
