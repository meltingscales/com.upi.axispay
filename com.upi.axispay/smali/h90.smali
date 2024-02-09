.class public Lh90;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh90$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lh90$d;",
        ">;"
    }
.end annotation


# instance fields
.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;"
        }
    .end annotation
.end field

.field public e:Landroid/app/Activity;

.field public f:Lng0;

.field public g:I


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
    iput v0, p0, Lh90;->g:I

    .line 3
    iput-object p2, p0, Lh90;->d:Ljava/util/ArrayList;

    .line 4
    invoke-virtual {p0, p2}, Lh90;->z(Ljava/util/ArrayList;)V

    .line 5
    iput-object p1, p0, Lh90;->e:Landroid/app/Activity;

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
    iput-object p1, p0, Lh90;->d:Ljava/util/ArrayList;

    .line 2
    invoke-virtual {p0, p1}, Lh90;->z(Ljava/util/ArrayList;)V

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method

.method public B(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Lh90;->g:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lh90;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lh90;->d:Ljava/util/ArrayList;

    iget v1, p0, Lh90;->g:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/Account;

    .line 3
    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/Account;->setBalance(Ljava/lang/String;)V

    .line 4
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    const v1, 0x177c

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/Account;->setBalTime(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 5
    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/Account;->setCheckBalance(I)V

    .line 6
    iget-object p1, p0, Lh90;->d:Ljava/util/ArrayList;

    iget v1, p0, Lh90;->g:I

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
    iget-object v0, p0, Lh90;->d:Ljava/util/ArrayList;

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
    check-cast p1, Lh90$d;

    invoke-virtual {p0, p1, p2}, Lh90;->w(Lh90$d;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lh90;->x(Landroid/view/ViewGroup;I)Lh90$d;

    move-result-object p1

    return-object p1
.end method

.method public w(Lh90$d;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lh90;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/Account;

    .line 2
    iget-object v1, p1, Lh90$d;->v:Landroid/widget/TextView;

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

    const v2, 0x7f080070

    if-eqz v1, :cond_0

    .line 4
    iget-object v3, p1, Lh90$d;->E:Landroid/widget/ImageView;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Bank;->getLogo()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1, v2}, Ljg0;->K(Landroid/widget/ImageView;Ljava/lang/String;I)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p1, Lh90$d;->E:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 6
    :goto_0
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    .line 7
    iget-object v1, p1, Lh90$d;->w:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getMaskedAccnumber()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v1, p1, Lh90$d;->x:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getIfsc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v1, p1, Lh90$d;->C:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v1, p1, Lh90$d;->y:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v1, p1, Lh90$d;->A:Landroid/widget/TextView;

    new-instance v2, Lh90$b;

    invoke-direct {v2, p0, p2, v0}, Lh90$b;-><init>(Lh90;ILcom/olive/upi/transport/model/Account;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    iget-object p2, p1, Lh90$d;->B:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 13
    iget-object p2, p1, Lh90$d;->D:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    iget-object p2, p1, Lh90$d;->G:Landroid/widget/RelativeLayout;

    new-instance v2, Lh90$c;

    invoke-direct {v2, p0, v0}, Lh90$c;-><init>(Lh90;Lcom/olive/upi/transport/model/Account;)V

    invoke-virtual {p2, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const v2, 0x177d

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz p2, :cond_1

    .line 16
    iget-object p2, p1, Lh90$d;->B:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 17
    iget-object p2, p1, Lh90$d;->D:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 18
    iget-object p2, p1, Lh90$d;->A:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getStatus()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 20
    iget-object p2, p1, Lh90$d;->B:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 21
    iget-object p2, p1, Lh90$d;->D:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 22
    iget-object p2, p1, Lh90$d;->A:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 23
    :cond_2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_3

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getStatus()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 24
    iget-object p2, p1, Lh90$d;->A:Landroid/widget/TextView;

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 25
    iget-object p2, p1, Lh90$d;->B:Landroid/widget/TextView;

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 26
    iget-object p2, p1, Lh90$d;->D:Landroid/widget/TextView;

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 27
    iget-object p2, p1, Lh90$d;->B:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getBalance()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljg0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    iget-object p2, p1, Lh90$d;->D:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getBalTime()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getCheckBalance()I

    move-result p2

    const/4 v4, 0x1

    if-ne p2, v4, :cond_4

    .line 30
    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/Account;->setCheckBalance(I)V

    .line 31
    iget-object p2, p1, Lh90$d;->B:Landroid/widget/TextView;

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 32
    iget-object p2, p1, Lh90$d;->D:Landroid/widget/TextView;

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 33
    :cond_4
    iget-object p2, p1, Lh90$d;->B:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 34
    iget-object p2, p1, Lh90$d;->D:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 35
    :goto_2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getStatus()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_5

    .line 36
    iget-object p2, p1, Lh90$d;->z:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getdLength()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lh90;->e:Landroid/app/Activity;

    const v2, 0x7f120357

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    iget-object p2, p1, Lh90$d;->z:Landroid/widget/TextView;

    iget-object v0, p0, Lh90;->e:Landroid/app/Activity;

    const v1, 0x7f06015d

    invoke-static {v0, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 38
    iget-object p1, p1, Lh90$d;->F:Landroid/widget/ImageView;

    iget-object p2, p0, Lh90;->e:Landroid/app/Activity;

    const v0, 0x7f08023e

    invoke-static {p2, v0}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_3

    .line 39
    :cond_5
    iget-object p2, p1, Lh90$d;->z:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getdLength()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lh90;->e:Landroid/app/Activity;

    const v2, 0x7f120353

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    iget-object p2, p1, Lh90$d;->z:Landroid/widget/TextView;

    iget-object v0, p0, Lh90;->e:Landroid/app/Activity;

    const v1, 0x7f060148

    invoke-static {v0, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 41
    iget-object p1, p1, Lh90$d;->F:Landroid/widget/ImageView;

    iget-object p2, p0, Lh90;->e:Landroid/app/Activity;

    const v0, 0x7f080247

    invoke-static {p2, v0}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_3
    return-void
.end method

.method public x(Landroid/view/ViewGroup;I)Lh90$d;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0038

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lh90$d;

    invoke-direct {p2, p0, p1}, Lh90$d;-><init>(Lh90;Landroid/view/View;)V

    return-object p2
.end method

.method public y(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh90;->f:Lng0;

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
    new-instance v0, Lh90$a;

    invoke-direct {v0, p0}, Lh90$a;-><init>(Lh90;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_0
    return-void
.end method
