.class public Lu90;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu90$h;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lu90$h;",
        ">;"
    }
.end annotation


# instance fields
.field public d:Lng0;

.field public e:I

.field public f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;"
        }
    .end annotation
.end field

.field public g:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lu90;->e:I

    .line 3
    iput-object p2, p0, Lu90;->f:Ljava/util/ArrayList;

    .line 4
    invoke-virtual {p0, p2}, Lu90;->z(Ljava/util/ArrayList;)V

    .line 5
    iput-object p1, p0, Lu90;->g:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public A(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lu90;->f:Ljava/util/ArrayList;

    .line 2
    invoke-virtual {p0, p1}, Lu90;->z(Ljava/util/ArrayList;)V

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method

.method public B(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Lu90;->e:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lu90;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lu90;->f:Ljava/util/ArrayList;

    iget v1, p0, Lu90;->e:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/Account;

    .line 3
    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/Account;->setBalance(Ljava/lang/String;)V

    .line 4
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    const v1, 0x144

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/Account;->setBalTime(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 5
    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/Account;->setCheckBalance(I)V

    .line 6
    iget-object p1, p0, Lu90;->f:Ljava/util/ArrayList;

    iget v1, p0, Lu90;->e:I

    invoke-virtual {p1, v1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lqa0;->x0(Lcom/olive/upi/transport/model/Account;)V

    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    :cond_0
    return-void
.end method

.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lu90;->f:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public bridge synthetic l(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    .line 1
    check-cast p1, Lu90$h;

    invoke-virtual {p0, p1, p2}, Lu90;->w(Lu90$h;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lu90;->x(Landroid/view/ViewGroup;I)Lu90$h;

    move-result-object p1

    return-object p1
.end method

.method public w(Lu90$h;I)V
    .locals 9

    .line 1
    iget-object v0, p0, Lu90;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/Account;

    .line 2
    iget-object v1, p1, Lu90$h;->v:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getIin()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lqa0;->e(Ljava/lang/String;)Lcom/olive/upi/transport/model/Bank;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Bank;->getLogo()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const v3, 0x7f080070

    if-eqz v2, :cond_0

    .line 5
    iget-object v1, p1, Lu90$h;->H:Landroid/widget/ImageView;

    iget-object v2, p0, Lu90;->g:Landroid/app/Activity;

    invoke-static {v2, v3}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v2, p1, Lu90$h;->H:Landroid/widget/ImageView;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Bank;->getLogo()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1, v3}, Ljg0;->K(Landroid/widget/ImageView;Ljava/lang/String;I)V

    .line 7
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    .line 8
    iget-object v1, p1, Lu90$h;->w:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getMaskedAccnumber()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v1, p1, Lu90$h;->x:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getIfsc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v1, p1, Lu90$h;->C:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v1, p1, Lu90$h;->y:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v1, p1, Lu90$h;->y:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object v1, p1, Lu90$h;->I:Landroid/widget/ImageView;

    new-instance v2, Lu90$b;

    invoke-direct {v2, p0, v0}, Lu90$b;-><init>(Lu90;Lcom/olive/upi/transport/model/Account;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    iget-object v1, p1, Lu90$h;->A:Landroid/widget/TextView;

    new-instance v2, Lu90$c;

    invoke-direct {v2, p0, p2, v0}, Lu90$c;-><init>(Lu90;ILcom/olive/upi/transport/model/Account;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    iget-object p2, p1, Lu90$h;->F:Landroid/widget/Button;

    new-instance v1, Lu90$d;

    invoke-direct {v1, p0, v0}, Lu90$d;-><init>(Lu90;Lcom/olive/upi/transport/model/Account;)V

    invoke-virtual {p2, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    iget-object p2, p1, Lu90$h;->G:Landroid/widget/Button;

    new-instance v1, Lu90$e;

    invoke-direct {v1, p0, v0}, Lu90$e;-><init>(Lu90;Lcom/olive/upi/transport/model/Account;)V

    invoke-virtual {p2, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    iget-object p2, p1, Lu90$h;->B:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 18
    iget-object p2, p1, Lu90$h;->D:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 19
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const v1, 0x7f060148

    const v2, 0x7f120353

    const v3, 0x145

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    if-eqz p2, :cond_2

    .line 20
    iget-object p2, p1, Lu90$h;->B:Landroid/widget/TextView;

    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 21
    iget-object p2, p1, Lu90$h;->D:Landroid/widget/TextView;

    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 22
    iget-object p2, p1, Lu90$h;->A:Landroid/widget/TextView;

    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 23
    iget-object p2, p1, Lu90$h;->F:Landroid/widget/Button;

    invoke-virtual {p2, v5}, Landroid/widget/Button;->setVisibility(I)V

    .line 24
    iget-object p2, p1, Lu90$h;->G:Landroid/widget/Button;

    invoke-virtual {p2, v5}, Landroid/widget/Button;->setVisibility(I)V

    .line 25
    iget-object p2, p1, Lu90$h;->K:Landroid/widget/LinearLayout;

    invoke-virtual {p2, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 26
    iget-object p2, p1, Lu90$h;->E:Landroid/widget/Button;

    const v6, 0x7f120436

    invoke-virtual {p2, v6}, Landroid/widget/Button;->setText(I)V

    .line 27
    iget-object p2, p1, Lu90$h;->E:Landroid/widget/Button;

    invoke-virtual {p2, v4}, Landroid/widget/Button;->setVisibility(I)V

    .line 28
    iget-object p2, p1, Lu90$h;->E:Landroid/widget/Button;

    new-instance v6, Lu90$f;

    invoke-direct {v6, p0, v0}, Lu90$f;-><init>(Lu90;Lcom/olive/upi/transport/model/Account;)V

    invoke-virtual {p2, v6}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_1

    .line 29
    :cond_2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getStatus()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 30
    iget-object p2, p1, Lu90$h;->B:Landroid/widget/TextView;

    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 31
    iget-object p2, p1, Lu90$h;->D:Landroid/widget/TextView;

    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 32
    iget-object p2, p1, Lu90$h;->A:Landroid/widget/TextView;

    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 33
    iget-object p2, p1, Lu90$h;->E:Landroid/widget/Button;

    const v6, 0x7f12043a

    invoke-virtual {p2, v6}, Landroid/widget/Button;->setText(I)V

    .line 34
    iget-object p2, p1, Lu90$h;->E:Landroid/widget/Button;

    invoke-virtual {p2, v4}, Landroid/widget/Button;->setVisibility(I)V

    .line 35
    iget-object p2, p1, Lu90$h;->F:Landroid/widget/Button;

    invoke-virtual {p2, v5}, Landroid/widget/Button;->setVisibility(I)V

    .line 36
    iget-object p2, p1, Lu90$h;->G:Landroid/widget/Button;

    invoke-virtual {p2, v5}, Landroid/widget/Button;->setVisibility(I)V

    .line 37
    iget-object p2, p1, Lu90$h;->K:Landroid/widget/LinearLayout;

    invoke-virtual {p2, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 38
    iget-object p2, p1, Lu90$h;->E:Landroid/widget/Button;

    new-instance v6, Lu90$g;

    invoke-direct {v6, p0, v0}, Lu90$g;-><init>(Lu90;Lcom/olive/upi/transport/model/Account;)V

    invoke-virtual {p2, v6}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_1

    .line 39
    :cond_3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getStatus()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 40
    iget-object p2, p1, Lu90$h;->E:Landroid/widget/Button;

    invoke-virtual {p2, v5}, Landroid/widget/Button;->setVisibility(I)V

    .line 41
    iget-object p2, p1, Lu90$h;->A:Landroid/widget/TextView;

    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 42
    iget-object p2, p1, Lu90$h;->z:Landroid/widget/TextView;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getdLength()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lu90;->g:Landroid/app/Activity;

    invoke-virtual {v7, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    iget-object p2, p1, Lu90$h;->z:Landroid/widget/TextView;

    iget-object v6, p0, Lu90;->g:Landroid/app/Activity;

    invoke-static {v6, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {p2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 44
    iget-object p2, p1, Lu90$h;->B:Landroid/widget/TextView;

    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 45
    iget-object p2, p1, Lu90$h;->F:Landroid/widget/Button;

    invoke-virtual {p2, v4}, Landroid/widget/Button;->setVisibility(I)V

    .line 46
    iget-object p2, p1, Lu90$h;->K:Landroid/widget/LinearLayout;

    invoke-virtual {p2, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 47
    iget-object p2, p1, Lu90$h;->G:Landroid/widget/Button;

    invoke-virtual {p2, v4}, Landroid/widget/Button;->setVisibility(I)V

    .line 48
    iget-object p2, p1, Lu90$h;->D:Landroid/widget/TextView;

    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 49
    iget-object p2, p1, Lu90$h;->B:Landroid/widget/TextView;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lu90;->g:Landroid/app/Activity;

    const v8, 0x7f12009b

    invoke-virtual {v7, v8}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getBalance()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljg0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    iget-object p2, p1, Lu90$h;->D:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getBalTime()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    :cond_4
    :goto_1
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getCheckBalance()I

    move-result p2

    const/4 v6, 0x1

    if-ne p2, v6, :cond_5

    .line 52
    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/Account;->setCheckBalance(I)V

    .line 53
    iget-object p2, p1, Lu90$h;->B:Landroid/widget/TextView;

    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 54
    iget-object p2, p1, Lu90$h;->D:Landroid/widget/TextView;

    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 55
    :cond_5
    iget-object p2, p1, Lu90$h;->B:Landroid/widget/TextView;

    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 56
    iget-object p2, p1, Lu90$h;->D:Landroid/widget/TextView;

    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 57
    :goto_2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getStatus()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 58
    iget-object p2, p1, Lu90$h;->z:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getdLength()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lu90;->g:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    iget-object p2, p1, Lu90$h;->z:Landroid/widget/TextView;

    iget-object v0, p0, Lu90;->g:Landroid/app/Activity;

    invoke-static {v0, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 60
    iget-object p1, p1, Lu90$h;->J:Landroid/widget/ImageView;

    iget-object p2, p0, Lu90;->g:Landroid/app/Activity;

    const v0, 0x7f080247

    invoke-static {p2, v0}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_3

    .line 61
    :cond_6
    iget-object p2, p1, Lu90$h;->z:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getdLength()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lu90;->g:Landroid/app/Activity;

    const v2, 0x7f120357

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    iget-object p2, p1, Lu90$h;->z:Landroid/widget/TextView;

    iget-object v0, p0, Lu90;->g:Landroid/app/Activity;

    const v1, 0x7f06015d

    invoke-static {v0, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 63
    iget-object p1, p1, Lu90$h;->J:Landroid/widget/ImageView;

    iget-object p2, p0, Lu90;->g:Landroid/app/Activity;

    const v0, 0x7f08023e

    invoke-static {p2, v0}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_3
    return-void
.end method

.method public x(Landroid/view/ViewGroup;I)Lu90$h;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d010e

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lu90$h;

    invoke-direct {p2, p0, p1}, Lu90$h;-><init>(Lu90;Landroid/view/View;)V

    return-object p2
.end method

.method public y(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu90;->d:Lng0;

    return-void
.end method

.method public z(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    new-instance v0, Lu90$a;

    invoke-direct {v0, p0}, Lu90$a;-><init>(Lu90;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_0
    return-void
.end method
