.class public Lqf0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lua0$e;


# instance fields
.field public A:I

.field public B:Lcom/olive/upi/transport/model/Account;

.field public C:Lla0;

.field public D:Lcom/olive/upi/transport/model/TransactionData;

.field public l:Landroid/content/Context;

.field public m:Landroid/view/View;

.field public n:Landroid/widget/Spinner;

.field public o:Landroid/widget/Button;

.field public p:Landroid/widget/Button;

.field public q:Landroid/widget/TextView;

.field public r:Landroid/widget/TextView;

.field public s:Landroid/widget/TextView;

.field public t:Landroid/widget/TextView;

.field public u:Landroid/widget/TextView;

.field public v:Landroid/widget/TextView;

.field public w:Landroid/widget/TextView;

.field public x:Landroid/widget/TextView;

.field public y:Landroid/widget/RelativeLayout;

.field public z:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    .line 2
    new-instance v0, Lcom/olive/upi/transport/model/Account;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/Account;-><init>()V

    iput-object v0, p0, Lqf0;->B:Lcom/olive/upi/transport/model/Account;

    return-void
.end method

.method public static synthetic x(Lqf0;)Landroid/widget/Spinner;
    .locals 0

    .line 1
    iget-object p0, p0, Lqf0;->n:Landroid/widget/Spinner;

    return-object p0
.end method

.method public static synthetic y(Lqf0;Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf0;->B(Lcom/olive/upi/transport/model/Account;)V

    return-void
.end method

.method public static z()Lqf0;
    .locals 1

    .line 1
    new-instance v0, Lqf0;

    invoke-direct {v0}, Lqf0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final A()V
    .locals 4

    .line 1
    iget-object v0, p0, Lqf0;->u:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v2

    const v3, 0x182b

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x7f120224

    invoke-virtual {p0, v2, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lqf0;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lqf0;->s:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public final B(Lcom/olive/upi/transport/model/Account;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    iget-object v1, p0, Lqf0;->l:Landroid/content/Context;

    const v2, 0x7f12043a

    .line 2
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lqf0;->l:Landroid/content/Context;

    const v3, 0x7f1204ce

    .line 3
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lqf0;->l:Landroid/content/Context;

    const v4, 0x7f1204fd

    .line 4
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lqf0$d;

    invoke-direct {v4, p0, p1}, Lqf0$d;-><init>(Lqf0;Lcom/olive/upi/transport/model/Account;)V

    iget-object p1, p0, Lqf0;->l:Landroid/content/Context;

    const v5, 0x7f1202ec

    .line 5
    invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lqf0$e;

    invoke-direct {v6, p0}, Lqf0$e;-><init>(Lqf0;)V

    .line 6
    invoke-static/range {v0 .. v6}, Leg0;->r(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final C(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqf0;->C:Lla0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lla0;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lla0;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lqf0;->C:Lla0;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Lla0;->c(Ljava/util/ArrayList;)V

    .line 4
    :goto_0
    iget-object v0, p0, Lqf0;->n:Landroid/widget/Spinner;

    iget-object v1, p0, Lqf0;->C:Lla0;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 5
    iget-object v0, p0, Lqf0;->B:Lcom/olive/upi/transport/model/Account;

    if-eqz v0, :cond_1

    .line 6
    iget-object v1, p0, Lqf0;->n:Landroid/widget/Spinner;

    iget-object v2, p0, Lqf0;->C:Lla0;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lla0;->b(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/Spinner;->setSelection(I)V

    goto :goto_1

    .line 7
    :cond_1
    iget v0, p0, Lqf0;->A:I

    iget-object v1, p0, Lqf0;->C:Lla0;

    invoke-virtual {v1}, Lla0;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 8
    iget-object v0, p0, Lqf0;->n:Landroid/widget/Spinner;

    iget v1, p0, Lqf0;->A:I

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    goto :goto_1

    .line 9
    :cond_2
    iget-object v0, p0, Lqf0;->n:Landroid/widget/Spinner;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    .line 10
    :goto_1
    iget-object v0, p0, Lqf0;->n:Landroid/widget/Spinner;

    new-instance v1, Lqf0$c;

    invoke-direct {v1, p0, p1}, Lqf0$c;-><init>(Lqf0;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 3

    const/16 v0, 0x13

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

    const/16 v2, 0x66

    invoke-direct {v1, v2, v0, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d00ae

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lqf0;->m:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    iput-object p1, p0, Lqf0;->l:Landroid/content/Context;

    .line 3
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    const p2, 0x7f0a0424

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Spinner;

    iput-object p1, p0, Lqf0;->n:Landroid/widget/Spinner;

    .line 4
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    const p2, 0x7f0a0364

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lqf0;->y:Landroid/widget/RelativeLayout;

    const/16 p2, 0x8

    .line 5
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    const p3, 0x7f0a04a9

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lqf0;->v:Landroid/widget/TextView;

    .line 7
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    const p3, 0x7f0a0052

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lqf0;->w:Landroid/widget/TextView;

    .line 8
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    const p3, 0x7f0a01b5

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/upi/axispay/custom/VpaFieldLayout;

    .line 9
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    const p3, 0x7f0a0422

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 10
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    const p3, 0x7f0a048d

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lqf0;->s:Landroid/widget/TextView;

    .line 11
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    const p3, 0x7f0a04ba

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 12
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    const p3, 0x7f0a0487

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lqf0;->q:Landroid/widget/TextView;

    .line 13
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    const p3, 0x7f0a048e

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lqf0;->r:Landroid/widget/TextView;

    .line 14
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    const p3, 0x7f0a04e6

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lqf0;->u:Landroid/widget/TextView;

    .line 15
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    const p3, 0x7f0a022a

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lqf0;->z:Landroid/widget/ImageView;

    .line 16
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    const p3, 0x7f0a00ef

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lqf0;->o:Landroid/widget/Button;

    .line 17
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    const p3, 0x7f0a0055

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lqf0;->x:Landroid/widget/TextView;

    .line 18
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    const p3, 0x7f0a00f8

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lqf0;->p:Landroid/widget/Button;

    .line 19
    invoke-virtual {p1, p2}, Landroid/widget/Button;->setVisibility(I)V

    .line 20
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    const p3, 0x7f0a04b5

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lqf0;->t:Landroid/widget/TextView;

    .line 21
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 22
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    const p2, 0x7f0a028a

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    .line 23
    new-instance p2, Lqf0$a;

    invoke-direct {p2, p0}, Lqf0$a;-><init>(Lqf0;)V

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    iget-object p1, p0, Lqf0;->o:Landroid/widget/Button;

    new-instance p2, Lqf0$b;

    invoke-direct {p2, p0}, Lqf0$b;-><init>(Lqf0;)V

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    iget-object p1, p0, Lqf0;->m:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 3
    :cond_0
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 5

    const v0, 0x7f12041e

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x66

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    sget-object v2, Lqa0$e;->d:Lqa0$e;

    invoke-virtual {v0, v2}, Lqa0;->v0(Lqa0$e;)V

    .line 4
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v0

    iput-object v0, p0, Lqf0;->D:Lcom/olive/upi/transport/model/TransactionData;

    .line 5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    .line 6
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0xf

    const/4 v4, 0x0

    invoke-direct {v2, v1, v3, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lua0;->b(ZLcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0xf

    if-eq v0, v1, :cond_1

    const/16 v1, 0x13

    if-eq v0, v1, :cond_0

    .line 2
    iget p2, p0, Lxc0;->g:I

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p2, p1, :cond_2

    .line 3
    invoke-static {}, Leg0;->B()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    iget-object p1, p0, Lqf0;->s:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x182c

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    invoke-virtual {p0}, Lqf0;->A()V

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p2, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {p1, p2}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqf0;->C(Ljava/util/ArrayList;)V

    :cond_2
    :goto_0
    return-void
.end method
