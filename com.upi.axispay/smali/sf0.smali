.class public Lsf0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lng0;
.implements Lua0$e;


# instance fields
.field public l:Landroid/widget/LinearLayout;

.field public m:Landroid/widget/TextView;

.field public n:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public o:Lk90;

.field public p:Lcom/olive/upi/transport/model/TransactionData;

.field public q:Lcom/olive/upi/transport/model/BeneVpa;

.field public r:Lcom/olive/upi/transport/model/Account;

.field public s:Landroid/view/View;

.field public t:Landroid/widget/Button;

.field public u:I

.field public v:Lcom/upi/axispay/custom/NonScrollListView;

.field public w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;"
        }
    .end annotation
.end field

.field public x:Lcom/olive/upi/transport/model/BeneVpa;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    .line 2
    new-instance v0, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    iput-object v0, p0, Lsf0;->q:Lcom/olive/upi/transport/model/BeneVpa;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lsf0;->w:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic x(Lsf0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lsf0;->D(Ljava/lang/String;)V

    return-void
.end method

.method public static y()Lsf0;
    .locals 1

    .line 1
    new-instance v0, Lsf0;

    invoke-direct {v0}, Lsf0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public A(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    iput-object v0, p0, Lsf0;->r:Lcom/olive/upi/transport/model/Account;

    .line 2
    iget-object v0, p0, Lsf0;->q:Lcom/olive/upi/transport/model/BeneVpa;

    iget-object v1, p0, Lsf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lsf0;->q:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lsf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setMcc(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lsf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    iget-object p2, p0, Lsf0;->q:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    const/4 p1, 0x0

    .line 6
    invoke-static {p1}, Lcom/olive/upi/transport/model/TransactionData;->setIsSelectedFromList(Z)V

    .line 7
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lsf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 8
    invoke-static {}, Leg0;->B()V

    .line 9
    iget-object p1, p0, Lxc0;->b:Lmg0;

    iget-object p2, p0, Lsf0;->r:Lcom/olive/upi/transport/model/Account;

    const/16 v0, 0x9

    invoke-interface {p1, v0, p2}, Lmg0;->t(ILjava/lang/Object;)V

    return-void
.end method

.method public final B(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lsf0;->o:Lk90;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lk90;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    iget v2, p0, Lsf0;->u:I

    invoke-direct {v0, v1, p1, v2}, Lk90;-><init>(Landroid/content/Context;Ljava/util/ArrayList;I)V

    iput-object v0, p0, Lsf0;->o:Lk90;

    goto :goto_0

    .line 3
    :cond_0
    iget v1, p0, Lsf0;->u:I

    invoke-virtual {v0, p1, v1}, Lk90;->z(Ljava/util/ArrayList;I)V

    .line 4
    :goto_0
    iget-object p1, p0, Lsf0;->o:Lk90;

    invoke-virtual {p1, p0}, Lk90;->y(Lng0;)V

    .line 5
    iget-object p1, p0, Lsf0;->v:Lcom/upi/axispay/custom/NonScrollListView;

    iget-object v0, p0, Lsf0;->o:Lk90;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    return-void
.end method

.method public C(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p1, :cond_3

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_3

    .line 2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lsf0;->w:Ljava/util/ArrayList;

    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/BeneVpa;

    .line 4
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v3

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lqa0;->P(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 5
    iget-object v3, p0, Lsf0;->w:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 6
    :cond_1
    iget-object p1, p0, Lsf0;->w:Ljava/util/ArrayList;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_2

    .line 7
    iget-object p1, p0, Lsf0;->w:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lsf0;->B(Ljava/util/ArrayList;)V

    .line 8
    iget-object p1, p0, Lsf0;->l:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 9
    iget-object p1, p0, Lsf0;->m:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 10
    :cond_2
    iget-object p1, p0, Lsf0;->l:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 11
    iget-object p1, p0, Lsf0;->m:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 12
    :cond_3
    iget-object p1, p0, Lsf0;->l:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 13
    iget-object p1, p0, Lsf0;->m:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    :goto_1
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public final D(Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lsf0;->w:Ljava/util/ArrayList;

    if-eqz v0, :cond_7

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object p1, p0, Lsf0;->w:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lsf0;->B(Ljava/util/ArrayList;)V

    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    iget-object v1, p0, Lsf0;->w:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/BeneVpa;

    .line 6
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 7
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x3

    const v3, 0x7f1204da

    const/4 v4, 0x0

    if-ge v1, v2, :cond_3

    .line 9
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    const v1, 0x7f080069

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 10
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1, v4}, Landroid/widget/Button;->setClickable(Z)V

    .line 11
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1, v4}, Landroid/widget/Button;->setEnabled(Z)V

    .line 12
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 13
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 14
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const v2, 0x7f080067

    const/4 v5, 0x1

    if-lez v1, :cond_6

    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v1, v5, :cond_4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 16
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/BeneVpa;

    iput-object p1, p0, Lsf0;->x:Lcom/olive/upi/transport/model/BeneVpa;

    .line 17
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 18
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f12036b

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 19
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 20
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1, v5}, Landroid/widget/Button;->setClickable(Z)V

    .line 21
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1, v5}, Landroid/widget/Button;->setEnabled(Z)V

    goto :goto_2

    .line 22
    :cond_4
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1, p1}, Lqa0;->f(Ljava/lang/String;)Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 23
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 24
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1, v5}, Landroid/widget/Button;->setClickable(Z)V

    .line 25
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1, v5}, Landroid/widget/Button;->setEnabled(Z)V

    goto :goto_1

    .line 26
    :cond_5
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 27
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1, v5}, Landroid/widget/Button;->setClickable(Z)V

    .line 28
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1, v5}, Landroid/widget/Button;->setEnabled(Z)V

    .line 29
    :goto_1
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 30
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 31
    :cond_6
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 32
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1, v5}, Landroid/widget/Button;->setClickable(Z)V

    .line 33
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1, v5}, Landroid/widget/Button;->setEnabled(Z)V

    .line 34
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 35
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 36
    :goto_2
    invoke-virtual {p0, v0}, Lsf0;->B(Ljava/util/ArrayList;)V

    :cond_7
    return-void
.end method

.method public final E()V
    .locals 5

    .line 1
    iget-object v0, p0, Lsf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v0, p0, Lsf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f12019f

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x3

    if-ge v1, v2, :cond_1

    .line 5
    iget-object v0, p0, Lsf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f1204cb

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 6
    :cond_1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa0;->P(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    iget-object v0, p0, Lsf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f120500

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 8
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc70;->o(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 9
    iget-object v0, p0, Lsf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f1201a1

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 10
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x1e

    if-le v1, v2, :cond_4

    .line 11
    iget-object v0, p0, Lsf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0x7f120321

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 12
    :cond_4
    iget-object v1, p0, Lsf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 13
    new-instance v1, Lcom/olive/upi/transport/model/VpaVerify;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/VpaVerify;-><init>()V

    .line 14
    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x10c

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/VpaVerify;->setCustomerid(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/VpaVerify;->setVpa(Ljava/lang/String;)V

    .line 16
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/VpaVerify;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 17
    new-instance v0, Lcom/olive/upi/transport/model/PayerInfo;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/PayerInfo;-><init>()V

    .line 18
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v2

    sget-object v3, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {v2, v3}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v2, :cond_5

    const/4 v3, 0x0

    .line 19
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/PayerInfo;->setPayervpa(Ljava/lang/String;)V

    .line 20
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/PayerInfo;->setAccountnumber(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayerInfo;->setName(Ljava/lang/String;)V

    const v2, 0x10d

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 22
    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayerInfo;->setMcc(Ljava/lang/String;)V

    .line 23
    :cond_5
    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/VpaVerify;->setPayerInfo(Lcom/olive/upi/transport/model/PayerInfo;)V

    .line 24
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 25
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x28

    const/16 v4, 0x4f

    invoke-direct {v2, v3, v4, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public a(ILjava/lang/Object;Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public e(IILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a00ff

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 3
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1}, Landroid/widget/Button;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 4
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p1

    .line 5
    iget-object v1, p0, Lsf0;->x:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 6
    invoke-static {v0}, Lcom/olive/upi/transport/model/TransactionData;->setIsSelectedFromList(Z)V

    .line 7
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->M()Lqa0$e;

    move-result-object p1

    .line 8
    sget-object v0, Lqa0$e;->b:Lqa0$e;

    if-eq p1, v0, :cond_2

    .line 9
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x9

    iget-object v1, p0, Lsf0;->r:Lcom/olive/upi/transport/model/Account;

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {p0}, Lsf0;->E()V

    :cond_2
    :goto_0
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 3

    const/16 v0, 0xa

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x28

    invoke-direct {v1, v2, v0, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d00ad

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lsf0;->s:Landroid/view/View;

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p1

    iput-object p1, p0, Lsf0;->p:Lcom/olive/upi/transport/model/TransactionData;

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    .line 4
    invoke-virtual {p0}, Lsf0;->z()V

    .line 5
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    const p2, 0x7f080069

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 6
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setClickable(Z)V

    .line 7
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 8
    iget-object p1, p0, Lsf0;->s:Landroid/view/View;

    const p2, 0x7f0a0279

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lsf0;->l:Landroid/widget/LinearLayout;

    .line 9
    iget-object p1, p0, Lsf0;->v:Lcom/upi/axispay/custom/NonScrollListView;

    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 10
    iget-object p1, p0, Lsf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 11
    iget-object p1, p0, Lsf0;->t:Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    iget-object p1, p0, Lsf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    new-instance p2, Lsf0$a;

    invoke-direct {p2, p0}, Lsf0$a;-><init>(Lsf0;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 13
    iget-object p1, p0, Lsf0;->s:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0x4f

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    .line 5
    :cond_1
    :goto_0
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 6

    const v0, 0x7f12040d

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x28

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    .line 4
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x35

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct {v2, v1, v3, v4, v5}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;Z)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Lua0;->a(ZLcom/olive/upi/transport/OliveRequest;)V

    .line 5
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v5, 0x12

    invoke-direct {v2, v1, v5, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v3, v2}, Lua0;->j(ZLcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0x12

    if-eq v0, v1, :cond_2

    const/16 v1, 0x35

    if-eq v0, v1, :cond_1

    const/16 v1, 0x4f

    if-eq v0, v1, :cond_0

    .line 2
    iget p2, p0, Lxc0;->g:I

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p2, p1, :cond_3

    .line 3
    invoke-static {}, Leg0;->B()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 6
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getMcccode()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lsf0;->A(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {}, Leg0;->B()V

    .line 8
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p2, Lqa0$e;->c:Lqa0$e;

    invoke-virtual {p1, p2}, Lqa0;->N(Lqa0$e;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lsf0;->C(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 9
    :cond_2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p2, Lqa0$e;->c:Lqa0$e;

    invoke-virtual {p1, p2}, Lqa0;->N(Lqa0$e;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lsf0;->C(Ljava/util/ArrayList;)V

    .line 10
    invoke-static {}, Leg0;->B()V

    :cond_3
    :goto_0
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 1

    const v0, 0x7f0a00ad

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget p1, p0, Lsf0;->u:I

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p1

    .line 3
    check-cast p2, Lcom/olive/upi/transport/model/BeneVpa;

    .line 4
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    const/4 p1, 0x1

    .line 5
    invoke-static {p1}, Lcom/olive/upi/transport/model/TransactionData;->setIsSelectedFromList(Z)V

    .line 6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->M()Lqa0$e;

    move-result-object p1

    .line 7
    sget-object v0, Lqa0$e;->b:Lqa0$e;

    if-eq p1, v0, :cond_1

    .line 8
    iget-object p1, p0, Lsf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p0}, Lsf0;->E()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final z()V
    .locals 2

    .line 1
    iget-object v0, p0, Lsf0;->s:Landroid/view/View;

    const v1, 0x7f0a01b5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Lsf0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 2
    iget-object v0, p0, Lsf0;->s:Landroid/view/View;

    const v1, 0x7f0a00ff

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lsf0;->t:Landroid/widget/Button;

    .line 3
    iget-object v0, p0, Lsf0;->s:Landroid/view/View;

    const v1, 0x7f0a04af

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lsf0;->m:Landroid/widget/TextView;

    .line 4
    iget-object v0, p0, Lsf0;->s:Landroid/view/View;

    const v1, 0x7f0a0561

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/NonScrollListView;

    iput-object v0, p0, Lsf0;->v:Lcom/upi/axispay/custom/NonScrollListView;

    .line 5
    iget-object v0, p0, Lsf0;->s:Landroid/view/View;

    const v1, 0x7f0a01bb

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-void
.end method
