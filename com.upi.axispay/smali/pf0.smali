.class public Lpf0;
.super Lxc0;
.source "AxisPay"


# instance fields
.field public l:Landroid/widget/RadioButton;

.field public m:Landroid/widget/RadioButton;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static synthetic x(Lpf0;)Landroid/widget/RadioButton;
    .locals 0

    .line 1
    iget-object p0, p0, Lpf0;->m:Landroid/widget/RadioButton;

    return-object p0
.end method

.method public static synthetic y(Lpf0;)Landroid/widget/RadioButton;
    .locals 0

    .line 1
    iget-object p0, p0, Lpf0;->l:Landroid/widget/RadioButton;

    return-object p0
.end method

.method public static z()Lpf0;
    .locals 1

    .line 1
    new-instance v0, Lpf0;

    invoke-direct {v0}, Lpf0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    const p3, 0x7f0d00ab

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p2

    const p3, 0x7f12041b

    invoke-virtual {p0, p3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f120414

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, p3, v0}, Lah0;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    const p2, 0x7f0a0101

    .line 3
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/RadioButton;

    iput-object p3, p0, Lpf0;->l:Landroid/widget/RadioButton;

    const p3, 0x7f0a00e5

    .line 4
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lpf0;->m:Landroid/widget/RadioButton;

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 6
    iget-object v0, p0, Lpf0;->l:Landroid/widget/RadioButton;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->n()Lje;

    move-result-object v0

    const v1, 0x7f0a03b1

    .line 8
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RadioGroup;

    .line 9
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v2

    invoke-virtual {v2}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v2

    .line 10
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v2

    sget v3, Lcom/olive/upi/transport/model/TransactionData;->MODE_SEND:I

    const v4, 0x7f0a01f7

    if-ne v2, v3, :cond_0

    .line 11
    iget-object p3, p0, Lpf0;->m:Landroid/widget/RadioButton;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060030

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {p3, v2}, Landroid/widget/RadioButton;->setTextColor(I)V

    .line 12
    invoke-static {}, Lsf0;->y()Lsf0;

    move-result-object p3

    .line 13
    invoke-virtual {v0, v4, p3}, Lje;->r(ILandroidx/fragment/app/Fragment;)Lje;

    .line 14
    invoke-virtual {p0, p3}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 15
    invoke-virtual {v0}, Lje;->k()I

    .line 16
    invoke-virtual {v1, p2}, Landroid/widget/RadioGroup;->check(I)V

    goto :goto_0

    .line 17
    :cond_0
    invoke-static {}, Lve0;->y()Lve0;

    move-result-object p2

    .line 18
    iget-object v0, p0, Lpf0;->l:Landroid/widget/RadioButton;

    const v2, 0x7f08006b

    invoke-virtual {v0, v2}, Landroid/widget/RadioButton;->setBackgroundResource(I)V

    .line 19
    iget-object v0, p0, Lpf0;->m:Landroid/widget/RadioButton;

    const v2, 0x7f080092

    invoke-virtual {v0, v2}, Landroid/widget/RadioButton;->setBackgroundResource(I)V

    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->n()Lje;

    move-result-object v0

    .line 21
    invoke-virtual {p0, p2}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 22
    invoke-virtual {v0, v4, p2}, Lje;->r(ILandroidx/fragment/app/Fragment;)Lje;

    .line 23
    invoke-virtual {v0}, Lje;->k()I

    .line 24
    invoke-virtual {v1, p3}, Landroid/widget/RadioGroup;->check(I)V

    .line 25
    :goto_0
    new-instance p2, Lpf0$a;

    invoke-direct {p2, p0}, Lpf0$a;-><init>(Lpf0;)V

    invoke-virtual {v1, p2}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    return-object p1
.end method

.method public onResume()V
    .locals 9

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    iget-object v0, p0, Lxc0;->b:Lmg0;

    new-instance v7, Ltg0;

    const v8, 0x7f12040d

    invoke-virtual {p0, v8}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    const/16 v1, 0x5a

    invoke-interface {v0, v1, v7}, Lmg0;->o(ILjava/lang/Object;)V

    .line 3
    invoke-virtual {p0, v8}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lxc0;->w(Ljava/lang/String;)V

    return-void
.end method
