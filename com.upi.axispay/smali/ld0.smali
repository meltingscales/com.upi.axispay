.class public Lld0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;
.implements Landroid/view/View$OnClickListener;
.implements Lua0$e;


# instance fields
.field public l:Landroid/view/View;

.field public m:Landroidx/viewpager/widget/ViewPager;

.field public n:Lcom/google/android/material/tabs/TabLayout;

.field public o:Lcom/olive/upi/transport/model/TransactionData;

.field public p:Landroid/widget/Button;

.field public q:Landroid/widget/LinearLayout;

.field public r:Lcom/olive/upi/transport/model/Billers;

.field public s:Lia0;

.field public t:Lcom/upi/axispay/custom/NonScrollListView;

.field public u:Landroid/widget/TextView;

.field public v:Lwc0;

.field public w:Landroidx/viewpager/widget/ViewPager;

.field public x:Lcom/olive/upi/transport/model/BillerCategory;

.field public y:Lcom/olive/upi/transport/model/BillerCircle;

.field public z:Lga0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static A()Lld0;
    .locals 1

    .line 1
    new-instance v0, Lld0;

    invoke-direct {v0}, Lld0;-><init>()V

    return-object v0
.end method

.method private synthetic x(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->o(ILjava/lang/Object;)V

    .line 3
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x15

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic z(Landroid/view/View;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final B()V
    .locals 2

    .line 1
    iget-object v0, p0, Lld0;->l:Landroid/view/View;

    const v1, 0x7f0a0366

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lld0;->m:Landroidx/viewpager/widget/ViewPager;

    .line 2
    iget-object v0, p0, Lld0;->l:Landroid/view/View;

    const v1, 0x7f0a0368

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    iput-object v0, p0, Lld0;->n:Lcom/google/android/material/tabs/TabLayout;

    .line 3
    iget-object v0, p0, Lld0;->l:Landroid/view/View;

    const v1, 0x7f0a00ef

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lld0;->p:Landroid/widget/Button;

    .line 4
    iget-object v0, p0, Lld0;->l:Landroid/view/View;

    const v1, 0x7f0a03bf

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/NonScrollListView;

    iput-object v0, p0, Lld0;->t:Lcom/upi/axispay/custom/NonScrollListView;

    .line 5
    iget-object v0, p0, Lld0;->l:Landroid/view/View;

    const v1, 0x7f0a01bb

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lld0;->u:Landroid/widget/TextView;

    return-void
.end method

.method public final C()V
    .locals 1

    .line 1
    iget-object v0, p0, Lld0;->p:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final D()V
    .locals 7

    .line 1
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v0

    invoke-virtual {v0}, Loa0;->b()Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lld0;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/BillerField;

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0d005f

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 5
    invoke-virtual {v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v3

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BillerField;->getFIELD_DESC()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 6
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BillerField;->getFieldType()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v3, v5, :cond_1

    const v1, 0x7f1200c7

    .line 7
    invoke-virtual {v2, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setRightText(I)V

    .line 8
    invoke-virtual {v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getRightText()Landroid/widget/TextView;

    move-result-object v1

    new-instance v3, Lld0$a;

    invoke-direct {v3, p0}, Lld0$a;-><init>(Lld0;)V

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    invoke-virtual {v2, v4}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    .line 10
    invoke-virtual {v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->showRightText()V

    goto :goto_1

    .line 11
    :cond_1
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BillerField;->getFieldType()I

    move-result v3

    const/4 v6, 0x5

    if-ne v3, v6, :cond_2

    const v1, 0x7f1204da

    .line 12
    invoke-virtual {v2, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setRightText(I)V

    .line 13
    invoke-virtual {v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getRightText()Landroid/widget/TextView;

    move-result-object v1

    sget-object v3, Lpb0;->b:Lpb0;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    invoke-virtual {v2, v4}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    .line 15
    invoke-virtual {v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->showRightText()V

    goto :goto_1

    .line 16
    :cond_2
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BillerField;->getFieldFormat()I

    move-result v3

    const/4 v4, 0x3

    if-ne v3, v4, :cond_3

    .line 17
    invoke-virtual {v2, v6}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    goto :goto_1

    .line 18
    :cond_3
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BillerField;->getFieldFormat()I

    move-result v3

    if-ne v3, v5, :cond_4

    goto :goto_1

    .line 19
    :cond_4
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BillerField;->getFieldFormat()I

    move-result v1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_5

    .line 20
    invoke-virtual {v2, v5}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 21
    :cond_5
    :goto_1
    iget-object v1, p0, Lld0;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method public final E(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BbpsHistory;",
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
    iget-object v2, p0, Lld0;->z:Lga0;

    if-nez v2, :cond_0

    .line 3
    new-instance v2, Lga0;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v3

    invoke-direct {v2, v3, p1}, Lga0;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v2, p0, Lld0;->z:Lga0;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v2, p1}, Lga0;->z(Ljava/util/ArrayList;)V

    .line 5
    :goto_0
    iget-object p1, p0, Lld0;->z:Lga0;

    invoke-virtual {p1, p0}, Lga0;->y(Lng0;)V

    .line 6
    iget-object p1, p0, Lld0;->t:Lcom/upi/axispay/custom/NonScrollListView;

    iget-object v2, p0, Lld0;->z:Lga0;

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 7
    iget-object p1, p0, Lld0;->z:Lga0;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    .line 8
    iget-object p1, p0, Lld0;->u:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    iget-object p1, p0, Lld0;->t:Lcom/upi/axispay/custom/NonScrollListView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_1

    .line 10
    :cond_1
    iget-object p1, p0, Lld0;->t:Lcom/upi/axispay/custom/NonScrollListView;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 11
    iget-object p1, p0, Lld0;->u:Landroid/widget/TextView;

    const v1, 0x7f12030a

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    .line 12
    iget-object p1, p0, Lld0;->u:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_1
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
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a00ef

    if-eq p1, v0, :cond_0

    goto/16 :goto_1

    .line 2
    :cond_0
    new-instance p1, Lcom/olive/upi/transport/model/RegisterBiller;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/RegisterBiller;-><init>()V

    .line 3
    iget-object v0, p0, Lld0;->r:Lcom/olive/upi/transport/model/Billers;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Billers;->getCORP_CODE()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/RegisterBiller;->setBILLER_CODE(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lld0;->r:Lcom/olive/upi/transport/model/Billers;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Billers;->getCIF_ID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/RegisterBiller;->setCIF_ID(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lld0;->r:Lcom/olive/upi/transport/model/Billers;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Billers;->getMASTR_TYPE()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/RegisterBiller;->setMASTR_TYPE(Ljava/lang/String;)V

    .line 6
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0xaf8

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/RegisterBiller;->setEMAIL(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0xaf9

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/RegisterBiller;->setMOB_NUM(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0xafa

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/RegisterBiller;->setIMEI(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 9
    invoke-static {v0}, Ljg0;->p(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/RegisterBiller;->setIP(Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lld0;->y:Lcom/olive/upi/transport/model/BillerCircle;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillerCircle;->getCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/RegisterBiller;->setLVL_CODE_ACTL(Ljava/lang/String;)V

    .line 11
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v0

    invoke-virtual {v0}, Loa0;->b()Ljava/util/ArrayList;

    move-result-object v0

    .line 12
    invoke-static {}, Lcom/olive/upi/transport/model/BillerField;->getFieldMapping()Ljava/util/Hashtable;

    move-result-object v1

    .line 13
    invoke-static {}, Lcom/olive/upi/transport/model/BillerField;->getFieldMapping()Ljava/util/Hashtable;

    move-result-object v2

    if-eqz v0, :cond_4

    const/4 v3, 0x0

    .line 14
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_3

    .line 15
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/olive/upi/transport/model/BillerField;

    .line 16
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/BillerField;->getFieldIdentifier()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 17
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/BillerField;->getFieldIdentifier()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 18
    iget-object v6, p0, Lld0;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v6, v3}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v6}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v6

    .line 19
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/BillerField;->isMandatory()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 20
    iget-object p1, p0, Lld0;->q:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v3}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/upi/axispay/custom/FloatingInputLayout;

    const v0, 0xafb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    return-void

    .line 21
    :cond_1
    invoke-virtual {p1, v5, v6}, Lcom/olive/upi/transport/model/RegisterBiller;->setField(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    invoke-virtual {v2, v5, v6}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const v0, 0xafc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 23
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/RegisterBiller;->setCUST_CIF(Ljava/lang/String;)V

    .line 24
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/RegisterBiller;->setMOB_NUM(Ljava/lang/String;)V

    const v0, 0xafd

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/RegisterBiller;->setIMEI(Ljava/lang/String;)V

    .line 26
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v0

    invoke-virtual {v0, v2}, Loa0;->q(Ljava/util/Hashtable;)V

    .line 27
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 28
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x67

    const/16 v3, 0x43

    invoke-direct {v1, v2, v3, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lxc0;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object p1

    invoke-virtual {p1}, Loa0;->h()Lcom/olive/upi/transport/model/Billers;

    move-result-object p1

    iput-object p1, p0, Lld0;->r:Lcom/olive/upi/transport/model/Billers;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d006b

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lld0;->l:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    .line 3
    iget-object p1, p0, Lld0;->l:Landroid/view/View;

    const p2, 0x7f0a00b3

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lld0;->q:Landroid/widget/LinearLayout;

    .line 4
    invoke-virtual {p0}, Lld0;->B()V

    .line 5
    invoke-virtual {p0}, Lld0;->C()V

    .line 6
    invoke-static {}, Lwc0;->C()Lwc0;

    move-result-object p1

    iput-object p1, p0, Lld0;->v:Lwc0;

    const p2, 0x7f1200ad

    .line 7
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lxc0;->w(Ljava/lang/String;)V

    .line 8
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const p2, 0xafe

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    const/16 p3, 0x67

    .line 9
    invoke-virtual {p1, p2, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 10
    iget-object p2, p0, Lld0;->v:Lwc0;

    invoke-virtual {p2, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->n()Lje;

    move-result-object p1

    .line 12
    iget-object p2, p0, Lld0;->v:Lwc0;

    const p3, 0x7f0a01f7

    invoke-virtual {p1, p3, p2}, Lje;->r(ILandroidx/fragment/app/Fragment;)Lje;

    .line 13
    iget-object p2, p0, Lld0;->v:Lwc0;

    invoke-virtual {p0, p2}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 14
    invoke-virtual {p1}, Lje;->j()I

    .line 15
    new-instance p1, Lia0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    invoke-direct {p1, p2}, Lia0;-><init>(Landroidx/fragment/app/FragmentManager;)V

    iput-object p1, p0, Lld0;->s:Lia0;

    .line 16
    iget-object p2, p0, Lld0;->m:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p2, p1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lno;)V

    .line 17
    iget-object p1, p0, Lld0;->n:Lcom/google/android/material/tabs/TabLayout;

    iget-object p2, p0, Lld0;->m:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, p2}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 18
    iget-object p1, p0, Lld0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_7

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const v0, 0xaff

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v1, 0x2d

    if-eq p1, v1, :cond_2

    const/16 v0, 0x43

    if-eq p1, v0, :cond_1

    .line 4
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_2

    .line 5
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_2
    const p1, 0xb00

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f12049a

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    :cond_3
    const p1, 0xb01

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 9
    invoke-static {}, Leg0;->B()V

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

    new-instance v2, Lob0;

    invoke-direct {v2, p0}, Lob0;-><init>(Lld0;)V

    invoke-static {p1, p2, v0, v1, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    .line 11
    :cond_4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object p1

    .line 12
    iget-object v1, p0, Lld0;->o:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 13
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 14
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    .line 15
    iget-object v1, p0, Lld0;->o:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 16
    iget-object v1, p0, Lld0;->o:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setApprovalRefNo(Ljava/lang/String;)V

    goto :goto_1

    .line 17
    :cond_5
    iget-object p2, p0, Lld0;->o:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 18
    iget-object p2, p0, Lld0;->o:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setApprovalRefNo(Ljava/lang/String;)V

    .line 19
    :goto_1
    iget-object p2, p0, Lld0;->o:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 20
    iget-object p1, p0, Lld0;->o:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setResponseCode(Ljava/lang/String;)V

    .line 21
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 22
    iget-object p2, p0, Lld0;->o:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    const v0, 0xb02

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 23
    iget-object p1, p0, Lld0;->o:Lcom/olive/upi/transport/model/TransactionData;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 24
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lld0;->o:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 25
    iget-object p1, p0, Lxc0;->b:Lmg0;

    if-nez p1, :cond_6

    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    check-cast p1, Lcom/upi/axispay/activity/MainActivity;

    iput-object p1, p0, Lxc0;->b:Lmg0;

    .line 27
    :cond_6
    invoke-static {}, Leg0;->B()V

    .line 28
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x18

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lmg0;->t(ILjava/lang/Object;)V

    .line 29
    :cond_7
    :goto_2
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 8

    .line 1
    iget-object v0, p0, Lld0;->r:Lcom/olive/upi/transport/model/Billers;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Billers;->getNAME()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x67

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
    iget-object v0, p0, Lld0;->w:Landroidx/viewpager/widget/ViewPager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lno;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lld0;->w:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lno;

    move-result-object v0

    invoke-virtual {v0}, Lno;->j()V

    .line 6
    :cond_0
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v0

    invoke-virtual {v0}, Loa0;->i()Lcom/olive/upi/transport/model/BillerCategory;

    move-result-object v0

    iput-object v0, p0, Lld0;->x:Lcom/olive/upi/transport/model/BillerCategory;

    .line 7
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object v0

    invoke-virtual {v0}, Loa0;->j()Lcom/olive/upi/transport/model/BillerCircle;

    move-result-object v0

    iput-object v0, p0, Lld0;->y:Lcom/olive/upi/transport/model/BillerCircle;

    .line 8
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x42

    new-instance v4, Lcom/olive/upi/transport/model/BillerForm;

    iget-object v5, p0, Lld0;->x:Lcom/olive/upi/transport/model/BillerCategory;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/BillerCategory;->getCODE_VAL()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lld0;->r:Lcom/olive/upi/transport/model/Billers;

    iget-object v7, p0, Lld0;->y:Lcom/olive/upi/transport/model/BillerCircle;

    invoke-virtual {v7}, Lcom/olive/upi/transport/model/BillerCircle;->getCode()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/olive/upi/transport/model/BillerForm;-><init>(Ljava/lang/String;Lcom/olive/upi/transport/model/Billers;Ljava/lang/String;)V

    invoke-direct {v2, v1, v3, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 9
    iget-boolean v0, p0, Lxc0;->h:Z

    if-eqz v0, :cond_1

    .line 10
    new-instance v0, Lcom/olive/upi/transport/model/BillPaymentEnqRequst;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/BillPaymentEnqRequst;-><init>()V

    .line 11
    iget-object v2, p0, Lld0;->r:Lcom/olive/upi/transport/model/Billers;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Billers;->getCIF_ID()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/olive/upi/transport/model/BillPaymentEnqRequst;->CUST_CIF:Ljava/lang/String;

    .line 12
    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0xb03

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/olive/upi/transport/model/BillPaymentEnqRequst;->MOB_NO:Ljava/lang/String;

    .line 13
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-static {v2}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v2

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, 0x46

    invoke-direct {v3, v1, v4, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :cond_1
    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0x2e

    if-eq v0, v1, :cond_5

    const/16 v1, 0x46

    if-eq v0, v1, :cond_4

    const/16 v1, 0x32

    if-eq v0, v1, :cond_3

    const/16 v1, 0x33

    if-eq v0, v1, :cond_2

    const/16 v1, 0x42

    if-eq v0, v1, :cond_1

    const/16 v1, 0x43

    if-eq v0, v1, :cond_0

    .line 2
    iget p2, p0, Lxc0;->g:I

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p2, p1, :cond_6

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

    if-eqz p1, :cond_6

    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_6

    .line 7
    iget-object p2, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x7c

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-static {}, Leg0;->B()V

    .line 9
    invoke-virtual {p0}, Lld0;->D()V

    goto :goto_0

    .line 10
    :cond_2
    invoke-static {}, Leg0;->B()V

    goto :goto_0

    .line 11
    :cond_3
    invoke-static {}, Leg0;->B()V

    goto :goto_0

    .line 12
    :cond_4
    invoke-static {}, Leg0;->B()V

    .line 13
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 14
    invoke-virtual {p0, p1}, Lld0;->E(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 15
    :cond_5
    invoke-static {}, Leg0;->B()V

    .line 16
    iget-object p1, p0, Lld0;->v:Lwc0;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lwc0;->H()V

    :cond_6
    :goto_0
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public synthetic y(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lld0;->x(Landroid/view/View;)V

    return-void
.end method
