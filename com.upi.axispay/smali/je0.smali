.class public Lje0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;
.implements Lua0$e;


# static fields
.field public static H:Lcom/olive/upi/transport/model/Account;

.field public static I:Lje0;


# instance fields
.field public A:Landroid/widget/Button;

.field public B:Landroid/widget/ImageView;

.field public C:Landroid/widget/ImageView;

.field public D:Lcom/olive/upi/transport/model/TransactionData;

.field public E:Ld90;

.field public F:Ljava/lang/String;

.field public G:Ljava/lang/String;

.field public l:Landroid/view/View;

.field public m:Landroid/app/Activity;

.field public n:Lcom/upi/axispay/custom/NonScrollListView;

.field public o:Landroid/widget/LinearLayout;

.field public p:Landroid/widget/ProgressBar;

.field public q:Landroid/widget/TextView;

.field public r:Landroid/widget/TextView;

.field public s:Landroid/widget/TextView;

.field public t:Landroid/widget/TextView;

.field public u:Landroid/widget/TextView;

.field public v:Landroid/widget/TextView;

.field public w:Landroid/widget/TextView;

.field public x:Landroid/widget/TextView;

.field public y:Landroid/widget/Button;

.field public z:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static x(Lcom/olive/upi/transport/model/Account;)Lje0;
    .locals 1

    .line 1
    sget-object v0, Lje0;->I:Lje0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lje0;

    invoke-direct {v0}, Lje0;-><init>()V

    sput-object v0, Lje0;->I:Lje0;

    .line 3
    :cond_0
    sput-object p0, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    .line 4
    sget-object p0, Lje0;->I:Lje0;

    return-object p0
.end method


# virtual methods
.method public a(ILjava/lang/Object;Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public e(IILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 3

    const/16 v0, 0x76

    const/16 v1, 0x13

    if-eq p1, v1, :cond_1

    const/16 v1, 0x1c

    if-eq p1, v1, :cond_0

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

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v2, v0, v1, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v2, v0, v1, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    const p3, 0x7f0d001d

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lje0;->l:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    iput-object p1, p0, Lje0;->m:Landroid/app/Activity;

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p1

    iput-object p1, p0, Lje0;->D:Lcom/olive/upi/transport/model/TransactionData;

    .line 4
    invoke-virtual {p0}, Lje0;->y()V

    .line 5
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 6
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    const/4 p3, 0x5

    const/16 v1, -0x1e

    .line 7
    invoke-virtual {p2, p3, v1}, Ljava/util/Calendar;->add(II)V

    .line 8
    invoke-virtual {p2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p2

    const p3, 0x3051

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const v1, 0x3052

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x3053

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lje0;->F:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-static {p1, p3}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lje0;->G:Ljava/lang/String;

    .line 10
    sget-object p1, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    if-eqz p1, :cond_6

    .line 11
    iget-object p2, p0, Lje0;->q:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p2, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getIin()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lqa0;->e(Ljava/lang/String;)Lcom/olive/upi/transport/model/Bank;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 13
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Bank;->getLogo()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const p3, 0x7f080070

    if-eqz p2, :cond_0

    .line 14
    iget-object p1, p0, Lje0;->C:Landroid/widget/ImageView;

    iget-object p2, p0, Lje0;->m:Landroid/app/Activity;

    invoke-static {p2, p3}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 15
    :cond_0
    iget-object p2, p0, Lje0;->C:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Bank;->getLogo()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1, p3}, Ljg0;->K(Landroid/widget/ImageView;Ljava/lang/String;I)V

    .line 16
    :cond_1
    :goto_0
    iget-object p1, p0, Lje0;->s:Landroid/widget/TextView;

    sget-object p2, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getMaskedAccnumber()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    iget-object p1, p0, Lje0;->u:Landroid/widget/TextView;

    sget-object p2, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getIfsc()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    iget-object p1, p0, Lje0;->v:Landroid/widget/TextView;

    sget-object p2, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getType()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    iget-object p1, p0, Lje0;->r:Landroid/widget/TextView;

    sget-object p2, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget-object p1, p0, Lje0;->y:Landroid/widget/Button;

    new-instance p2, Lje0$a;

    invoke-direct {p2, p0}, Lje0$a;-><init>(Lje0;)V

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    iget-object p1, p0, Lje0;->A:Landroid/widget/Button;

    new-instance p2, Lje0$b;

    invoke-direct {p2, p0}, Lje0$b;-><init>(Lje0;)V

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    sget-object p1, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const p2, 0x7f060148

    const p3, 0x7f120353

    const v1, 0x3054

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x8

    if-eqz p1, :cond_2

    .line 23
    iget-object p1, p0, Lje0;->y:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 24
    iget-object p1, p0, Lje0;->A:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 25
    iget-object p1, p0, Lje0;->o:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 26
    iget-object p1, p0, Lje0;->z:Landroid/widget/Button;

    const v3, 0x7f120436

    invoke-virtual {p1, v3}, Landroid/widget/Button;->setText(I)V

    .line 27
    iget-object p1, p0, Lje0;->z:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setVisibility(I)V

    .line 28
    iget-object p1, p0, Lje0;->z:Landroid/widget/Button;

    new-instance v3, Lje0$c;

    invoke-direct {v3, p0}, Lje0$c;-><init>(Lje0;)V

    invoke-virtual {p1, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_1

    .line 29
    :cond_2
    sget-object p1, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getStatus()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 30
    iget-object p1, p0, Lje0;->z:Landroid/widget/Button;

    const v3, 0x7f12043a

    invoke-virtual {p1, v3}, Landroid/widget/Button;->setText(I)V

    .line 31
    iget-object p1, p0, Lje0;->z:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setVisibility(I)V

    .line 32
    iget-object p1, p0, Lje0;->y:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 33
    iget-object p1, p0, Lje0;->A:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 34
    iget-object p1, p0, Lje0;->o:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 35
    iget-object p1, p0, Lje0;->z:Landroid/widget/Button;

    new-instance v3, Lje0$d;

    invoke-direct {v3, p0}, Lje0$d;-><init>(Lje0;)V

    invoke-virtual {p1, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 36
    :cond_3
    sget-object p1, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getStatus()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 37
    iget-object p1, p0, Lje0;->z:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 38
    iget-object p1, p0, Lje0;->w:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getdLength()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lje0;->m:Landroid/app/Activity;

    invoke-virtual {v4, p3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    iget-object p1, p0, Lje0;->w:Landroid/widget/TextView;

    iget-object v3, p0, Lje0;->m:Landroid/app/Activity;

    invoke-static {v3, p2}, Lt8;->d(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 40
    iget-object p1, p0, Lje0;->y:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setVisibility(I)V

    .line 41
    iget-object p1, p0, Lje0;->o:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 42
    iget-object p1, p0, Lje0;->A:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setVisibility(I)V

    .line 43
    :cond_4
    :goto_1
    sget-object p1, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getStatus()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 44
    iget-object p1, p0, Lje0;->w:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/Account;->getdLength()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lje0;->m:Landroid/app/Activity;

    invoke-virtual {v3, p3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    iget-object p1, p0, Lje0;->w:Landroid/widget/TextView;

    iget-object p3, p0, Lje0;->m:Landroid/app/Activity;

    invoke-static {p3, p2}, Lt8;->d(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 46
    iget-object p1, p0, Lje0;->B:Landroid/widget/ImageView;

    iget-object p2, p0, Lje0;->m:Landroid/app/Activity;

    const p3, 0x7f080247

    invoke-static {p2, p3}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 47
    :cond_5
    iget-object p1, p0, Lje0;->w:Landroid/widget/TextView;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object p3, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/Account;->getdLength()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lje0;->m:Landroid/app/Activity;

    const v1, 0x7f120357

    invoke-virtual {p3, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    iget-object p1, p0, Lje0;->w:Landroid/widget/TextView;

    iget-object p2, p0, Lje0;->m:Landroid/app/Activity;

    const p3, 0x7f06015d

    invoke-static {p2, p3}, Lt8;->d(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 49
    iget-object p1, p0, Lje0;->B:Landroid/widget/ImageView;

    iget-object p2, p0, Lje0;->m:Landroid/app/Activity;

    const p3, 0x7f08023e

    invoke-static {p2, p3}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 50
    :goto_2
    iget-object p1, p0, Lje0;->p:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 51
    iget-object p1, p0, Lje0;->x:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 52
    :cond_6
    iget-object p1, p0, Lje0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0x13

    if-eq p1, v0, :cond_2

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20e

    if-eq p1, v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_1

    .line 4
    :cond_0
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    iget-object v1, p0, Lje0;->F:Ljava/lang/String;

    iget-object v2, p0, Lje0;->G:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lua0;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    goto :goto_1

    .line 5
    :cond_1
    invoke-static {}, Leg0;->B()V

    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lje0;->z(Ljava/util/ArrayList;)V

    goto :goto_1

    :cond_2
    if-eqz p2, :cond_3

    .line 7
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_3
    const p1, 0x3055

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 8
    :goto_0
    invoke-static {}, Leg0;->B()V

    const v0, 0x3056

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 10
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f12005c

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f120499

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f12031e

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lje0$e;

    invoke-direct {v2, p0}, Lje0$e;-><init>(Lje0;)V

    invoke-static {p1, p2, v0, v1, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 11
    :cond_4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 12
    :cond_5
    :goto_1
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 7

    const v0, 0x7f12003c

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x76

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
    new-instance v0, Ld90;

    iget-object v1, p0, Lje0;->m:Landroid/app/Activity;

    invoke-direct {v0, v1}, Ld90;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lje0;->E:Ld90;

    .line 5
    iget-object v0, p0, Lje0;->n:Lcom/upi/axispay/custom/NonScrollListView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 6
    iget-object v0, p0, Lje0;->p:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lje0;->x:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    sget-object v0, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const v0, 0x3057

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v4, v0

    .line 9
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    iget-object v2, p0, Lje0;->F:Ljava/lang/String;

    iget-object v3, p0, Lje0;->G:Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Lua0;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 10
    iget-object v0, p0, Lje0;->n:Lcom/upi/axispay/custom/NonScrollListView;

    iget-object v1, p0, Lje0;->E:Ld90;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_4

    const/16 v1, 0x1c

    if-eq v0, v1, :cond_1

    const/16 v1, 0x20e

    if-eq v0, v1, :cond_0

    .line 2
    iget p2, p0, Lxc0;->g:I

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p2, p1, :cond_5

    .line 3
    invoke-static {}, Leg0;->B()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 6
    invoke-virtual {p0, p1}, Lje0;->z(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {}, Leg0;->B()V

    .line 8
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    const v0, 0x3058

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 9
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f1204cc

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    const v0, 0x3059

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 11
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x305a

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 12
    :cond_3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 13
    :cond_4
    invoke-static {}, Leg0;->B()V

    .line 14
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p2, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getMaskedAccnumber()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lqa0;->u(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lje0;->z(Ljava/util/ArrayList;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final y()V
    .locals 4

    .line 1
    iget-object v0, p0, Lje0;->l:Landroid/view/View;

    const v1, 0x7f0a03bf

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/NonScrollListView;

    iput-object v0, p0, Lje0;->n:Lcom/upi/axispay/custom/NonScrollListView;

    .line 2
    iget-object v0, p0, Lje0;->l:Landroid/view/View;

    const v1, 0x7f0a00a2

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lje0;->q:Landroid/widget/TextView;

    .line 3
    iget-object v0, p0, Lje0;->l:Landroid/view/View;

    const v1, 0x7f0a0055

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lje0;->r:Landroid/widget/TextView;

    .line 4
    iget-object v0, p0, Lje0;->l:Landroid/view/View;

    const v1, 0x7f0a004b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lje0;->s:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 6
    iget-object v0, p0, Lje0;->l:Landroid/view/View;

    const v3, 0x7f0a04d1

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lje0;->t:Landroid/widget/TextView;

    .line 7
    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 8
    iget-object v0, p0, Lje0;->l:Landroid/view/View;

    const v3, 0x7f0a04a9

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lje0;->u:Landroid/widget/TextView;

    .line 9
    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 10
    iget-object v0, p0, Lje0;->l:Landroid/view/View;

    const v3, 0x7f0a0052

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lje0;->v:Landroid/widget/TextView;

    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 12
    iget-object v0, p0, Lje0;->l:Landroid/view/View;

    const v1, 0x7f0a01d7

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lje0;->B:Landroid/widget/ImageView;

    .line 13
    iget-object v0, p0, Lje0;->l:Landroid/view/View;

    const v1, 0x7f0a04c7

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lje0;->w:Landroid/widget/TextView;

    .line 14
    iget-object v0, p0, Lje0;->l:Landroid/view/View;

    const v1, 0x7f0a039d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lje0;->p:Landroid/widget/ProgressBar;

    .line 15
    iget-object v0, p0, Lje0;->l:Landroid/view/View;

    const v1, 0x7f0a01bb

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lje0;->x:Landroid/widget/TextView;

    .line 16
    iget-object v0, p0, Lje0;->l:Landroid/view/View;

    const v1, 0x7f0a00d7

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lje0;->y:Landroid/widget/Button;

    .line 17
    iget-object v0, p0, Lje0;->l:Landroid/view/View;

    const v2, 0x7f0a00fa

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lje0;->z:Landroid/widget/Button;

    .line 18
    iget-object v0, p0, Lje0;->l:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lje0;->y:Landroid/widget/Button;

    .line 19
    iget-object v0, p0, Lje0;->l:Landroid/view/View;

    const v1, 0x7f0a00f5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lje0;->A:Landroid/widget/Button;

    .line 20
    iget-object v0, p0, Lje0;->l:Landroid/view/View;

    const v1, 0x7f0a022a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lje0;->C:Landroid/widget/ImageView;

    .line 21
    iget-object v0, p0, Lje0;->l:Landroid/view/View;

    const v1, 0x7f0a03c3

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lje0;->o:Landroid/widget/LinearLayout;

    return-void
.end method

.method public final z(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 2
    iget-object v2, p0, Lje0;->E:Ld90;

    if-nez v2, :cond_0

    .line 3
    new-instance v2, Ld90;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v3

    invoke-direct {v2, v3, p1}, Ld90;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    iput-object v2, p0, Lje0;->E:Ld90;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v2, p1}, Ld90;->A(Ljava/util/ArrayList;)V

    .line 5
    :goto_0
    iget-object p1, p0, Lje0;->n:Lcom/upi/axispay/custom/NonScrollListView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v3

    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 6
    iget-object p1, p0, Lje0;->E:Ld90;

    invoke-virtual {p1, p0}, Ld90;->z(Lng0;)V

    .line 7
    iget-object p1, p0, Lje0;->n:Lcom/upi/axispay/custom/NonScrollListView;

    iget-object v2, p0, Lje0;->E:Ld90;

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 8
    iget-object p1, p0, Lje0;->n:Lcom/upi/axispay/custom/NonScrollListView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 9
    iget-object p1, p0, Lje0;->x:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    iget-object p1, p0, Lje0;->p:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_1

    .line 11
    :cond_1
    iget-object p1, p0, Lje0;->n:Lcom/upi/axispay/custom/NonScrollListView;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 12
    iget-object p1, p0, Lje0;->x:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 13
    iget-object p1, p0, Lje0;->x:Landroid/widget/TextView;

    const v0, 0x7f12030a

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 14
    iget-object p1, p0, Lje0;->p:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :goto_1
    return-void
.end method
