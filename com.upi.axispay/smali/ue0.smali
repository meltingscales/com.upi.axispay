.class public Lue0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lng0;
.implements Landroid/view/View$OnClickListener;
.implements Lua0$e;


# static fields
.field public static I:Lcom/olive/upi/transport/model/Account;


# instance fields
.field public A:Lha0;

.field public B:Lcom/olive/upi/transport/model/PrefixMobile;

.field public C:Ldg0;

.field public D:Lcom/olive/upi/transport/model/TransactionData;

.field public E:I

.field public F:Landroidx/viewpager/widget/ViewPager;

.field public G:Lcom/olive/upi/transport/model/BillerCategory;

.field public H:Lgf0;

.field public l:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public m:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public n:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public o:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public p:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public q:Landroidx/viewpager/widget/ViewPager;

.field public r:Lcom/olive/upi/transport/model/BillPayDataMaxAmount;

.field public s:Z

.field public t:Z

.field public u:Landroid/widget/Button;

.field public v:Lcom/google/android/material/tabs/TabLayout;

.field public w:Landroid/view/View;

.field public x:Lwc0;

.field public y:Lcom/upi/axispay/custom/NonScrollListView;

.field public z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lue0;->s:Z

    .line 3
    iput-boolean v0, p0, Lue0;->t:Z

    const/16 v0, 0x6c

    .line 4
    iput v0, p0, Lue0;->E:I

    return-void
.end method

.method public static C()Lue0;
    .locals 1

    .line 1
    new-instance v0, Lue0;

    invoke-direct {v0}, Lue0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public A(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x51

    const/16 v3, 0x2f

    invoke-direct {v1, v2, v3, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public B()V
    .locals 6

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->n()Lcom/olive/upi/transport/model/BillPayDataMaxAmount;

    move-result-object v0

    iput-object v0, p0, Lue0;->r:Lcom/olive/upi/transport/model/BillPayDataMaxAmount;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x51

    const/16 v3, 0x32

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;Z)V

    invoke-virtual {v0, v1}, Lua0;->n(Lcom/olive/upi/transport/OliveRequest;)V

    :cond_0
    return-void
.end method

.method public final D()V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    const v1, 0x2f88

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const v2, 0x2f89

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const v1, 0x2f8a

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public final E()V
    .locals 2

    .line 1
    new-instance v0, Ldg0;

    invoke-direct {v0}, Ldg0;-><init>()V

    iput-object v0, p0, Lue0;->C:Ldg0;

    .line 2
    iget-object v1, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldg0;->i(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lue0;->C:Ldg0;

    iget-object v1, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldg0;->j(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lue0;->C:Ldg0;

    iget-object v1, p0, Lue0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldg0;->h(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lue0;->C:Ldg0;

    iget-object v1, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldg0;->g(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lue0;->C:Ldg0;

    iget-object v1, p0, Lue0;->p:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldg0;->k(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lue0;->C:Ldg0;

    const v1, 0x2f8b

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldg0;->l(Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    iget-object v1, p0, Lue0;->C:Ldg0;

    invoke-virtual {v0, v1}, Lqa0;->U(Ldg0;)V

    return-void
.end method

.method public final F()V
    .locals 3

    .line 1
    iget-object v0, p0, Lue0;->w:Landroid/view/View;

    const v1, 0x7f0a0366

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lue0;->q:Landroidx/viewpager/widget/ViewPager;

    .line 2
    iget-object v0, p0, Lue0;->w:Landroid/view/View;

    const v1, 0x7f0a0368

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    iput-object v0, p0, Lue0;->v:Lcom/google/android/material/tabs/TabLayout;

    .line 3
    iget-object v0, p0, Lue0;->w:Landroid/view/View;

    const v1, 0x7f0a00ef

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lue0;->u:Landroid/widget/Button;

    .line 4
    iget-object v0, p0, Lue0;->w:Landroid/view/View;

    const v1, 0x7f0a02db

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 5
    iget-object v0, p0, Lue0;->w:Landroid/view/View;

    const v1, 0x7f0a007f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 6
    iget-object v0, p0, Lue0;->w:Landroid/view/View;

    const v1, 0x7f0a02de

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 7
    iget-object v0, p0, Lue0;->w:Landroid/view/View;

    const v1, 0x7f0a0127

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Lue0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 8
    iget-object v0, p0, Lue0;->w:Landroid/view/View;

    const v1, 0x7f0a03a3

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Lue0;->p:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 9
    iget-object v0, p0, Lue0;->w:Landroid/view/View;

    const v1, 0x7f0a03bf

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/NonScrollListView;

    iput-object v0, p0, Lue0;->y:Lcom/upi/axispay/custom/NonScrollListView;

    .line 10
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 11
    iget-object v0, p0, Lue0;->w:Landroid/view/View;

    const v1, 0x7f0a01bb

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lue0;->z:Landroid/widget/TextView;

    return-void
.end method

.method public final G()V
    .locals 1

    .line 1
    iget-object v0, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getRightIcon()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    iget-object v0, p0, Lue0;->u:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    iget-object v0, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, p0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    iget-object v0, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object v0, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getRightText()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    iget-object v0, p0, Lue0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, p0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    iget-object v0, p0, Lue0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    iget-object v0, p0, Lue0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getRightText()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    iget-object v0, p0, Lue0;->p:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getRightText()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public H(Lcom/olive/upi/transport/model/BillerCategory;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lue0;->G:Lcom/olive/upi/transport/model/BillerCategory;

    return-void
.end method

.method public I(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/RecentBPTHistory;",
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
    iget-object v2, p0, Lue0;->A:Lha0;

    if-nez v2, :cond_0

    .line 3
    new-instance v2, Lha0;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v3

    invoke-direct {v2, v3, p1}, Lha0;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v2, p0, Lue0;->A:Lha0;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v2, p1}, Lha0;->z(Ljava/util/ArrayList;)V

    .line 5
    :goto_0
    iget-object p1, p0, Lue0;->A:Lha0;

    invoke-virtual {p1, p0}, Lha0;->y(Lng0;)V

    .line 6
    iget-object p1, p0, Lue0;->y:Lcom/upi/axispay/custom/NonScrollListView;

    iget-object v2, p0, Lue0;->A:Lha0;

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 7
    iget-object p1, p0, Lue0;->A:Lha0;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    .line 8
    iget-object p1, p0, Lue0;->z:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    iget-object p1, p0, Lue0;->y:Lcom/upi/axispay/custom/NonScrollListView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_1

    .line 10
    :cond_1
    iget-object p1, p0, Lue0;->y:Lcom/upi/axispay/custom/NonScrollListView;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 11
    iget-object p1, p0, Lue0;->z:Landroid/widget/TextView;

    const v1, 0x7f12030a

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    .line 12
    iget-object p1, p0, Lue0;->z:Landroid/widget/TextView;

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

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 7

    const/4 v0, 0x1

    if-ne p1, v0, :cond_6

    const/4 p1, -0x1

    if-ne p2, p1, :cond_6

    .line 1
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    const p1, 0x2f8c

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 2
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v3

    if-nez v2, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p2

    const/4 p3, 0x0

    if-eqz p2, :cond_1

    .line 4
    invoke-interface {p2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 5
    invoke-interface {p2, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    .line 6
    invoke-interface {p2, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-interface {p2}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :cond_1
    move-object p1, p3

    :goto_0
    if-nez p1, :cond_2

    return-void

    :cond_2
    const p2, 0x2f8d

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    const v1, 0x2f8e

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {p1, p2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 9
    iput-boolean v0, p0, Lue0;->s:Z

    .line 10
    iput-object p3, p0, Lue0;->C:Ldg0;

    .line 11
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2, p3}, Lqa0;->U(Ldg0;)V

    .line 12
    iget-object p2, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const/16 p3, 0xc

    if-ne p2, p3, :cond_3

    const p2, 0x2f8f

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 14
    iget-object p2, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 p3, 0x2

    invoke-virtual {p1, p3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    const/4 p2, 0x6

    .line 15
    invoke-virtual {p1, p3, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lue0;->A(Ljava/lang/String;)V

    goto :goto_1

    .line 16
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const/16 p3, 0xa

    const/4 v1, 0x0

    if-ne p2, p3, :cond_4

    .line 17
    iget-object p2, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2, p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    const/4 p2, 0x4

    .line 18
    invoke-virtual {p1, v1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lue0;->A(Ljava/lang/String;)V

    goto :goto_1

    .line 19
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const/16 p3, 0xb

    if-ne p2, p3, :cond_5

    const p2, 0x2f90

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 20
    iget-object p2, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    const/4 p2, 0x5

    .line 21
    invoke-virtual {p1, v0, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lue0;->A(Ljava/lang/String;)V

    goto :goto_1

    .line 22
    :cond_5
    iput-boolean v1, p0, Lue0;->s:Z

    .line 23
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f120363

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const/16 v0, 0x64

    const/4 v1, 0x0

    const/16 v2, 0x51

    const v3, 0x7f120287

    const/16 v4, 0xa

    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 2
    :sswitch_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x38

    iget-object v3, p0, Lue0;->p:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v3}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v1, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 4
    :sswitch_1
    iget-object p1, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-ge p1, v4, :cond_0

    .line 5
    iget-object p1, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lue0;->E()V

    .line 7
    iget-object p1, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    .line 8
    iget-object p1, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 9
    iget-object p1, p0, Lxc0;->b:Lmg0;

    iget-object v1, p0, Lue0;->G:Lcom/olive/upi/transport/model/BillerCategory;

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 10
    :sswitch_2
    iget-object p1, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    .line 11
    invoke-virtual {p0}, Lue0;->y()V

    goto/16 :goto_0

    .line 12
    :sswitch_3
    iget-object p1, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-ge p1, v4, :cond_1

    .line 13
    iget-object p1, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 14
    :cond_1
    invoke-virtual {p0}, Lue0;->E()V

    .line 15
    iget-object p1, p0, Lue0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    .line 16
    iget-object p1, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 17
    iget-object p1, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 18
    iget-object p1, p0, Lxc0;->b:Lmg0;

    iget-object v1, p0, Lue0;->G:Lcom/olive/upi/transport/model/BillerCategory;

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 19
    :cond_2
    new-instance p1, Lcom/olive/upi/transport/model/Billers;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/Billers;-><init>()V

    .line 20
    iget-object v0, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/Billers;->setName(Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x65

    invoke-interface {v0, v1, p1}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 22
    :sswitch_4
    new-instance p1, Lcom/olive/upi/transport/model/LimitCheckReq;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/LimitCheckReq;-><init>()V

    .line 23
    sget-object v0, Lue0;->I:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/LimitCheckReq;->setAc(Lcom/olive/upi/transport/model/Account;)V

    .line 24
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/LimitCheckReq;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 25
    new-instance v0, Lcom/olive/upi/transport/model/Payee;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/Payee;-><init>()V

    .line 26
    new-instance v1, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 27
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Payee;->setBeneVpa(Ljava/lang/String;)V

    .line 28
    iget-object v1, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljg0;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Payee;->setBamount(Ljava/lang/String;)V

    .line 29
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/LimitCheckReq;->setPayees(Ljava/util/List;)V

    .line 32
    iget-object v0, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/LimitCheckReq;->setAmount(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x62

    invoke-direct {v1, v2, v3, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/OliveUpiManager;->verifyLimit(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 34
    :sswitch_5
    invoke-virtual {p0}, Lue0;->E()V

    .line 35
    iget-object p1, p0, Lue0;->C:Ldg0;

    invoke-virtual {p1}, Ldg0;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-ge p1, v4, :cond_3

    .line 36
    iget-object p1, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    goto :goto_0

    .line 37
    :cond_3
    iget-object p1, p0, Lue0;->C:Ldg0;

    invoke-virtual {p1}, Ldg0;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 38
    iget-object p1, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v0, 0x7f120403

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    goto :goto_0

    .line 39
    :cond_4
    iget-object p1, p0, Lue0;->C:Ldg0;

    invoke-virtual {p1}, Ldg0;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 40
    iget-object p1, p0, Lue0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v0, 0x7f1203fd

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    goto :goto_0

    .line 41
    :cond_5
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x53

    iget-object v1, p0, Lue0;->C:Ldg0;

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f0a00bd -> :sswitch_5
        0x7f0a00ef -> :sswitch_4
        0x7f0a0125 -> :sswitch_3
        0x7f0a0127 -> :sswitch_3
        0x7f0a013d -> :sswitch_2
        0x7f0a035c -> :sswitch_1
        0x7f0a035d -> :sswitch_1
        0x7f0a0549 -> :sswitch_0
    .end sparse-switch
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 3

    const/16 v0, 0x2d

    if-ne p1, v0, :cond_0

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x51

    invoke-direct {v1, v2, v0, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d0096

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lue0;->w:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Lue0;->F()V

    .line 3
    invoke-virtual {p0}, Lue0;->G()V

    .line 4
    invoke-static {}, Lwc0;->C()Lwc0;

    move-result-object p1

    iput-object p1, p0, Lue0;->x:Lwc0;

    const p2, 0x7f12028c

    .line 5
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lxc0;->w(Ljava/lang/String;)V

    .line 6
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const p2, 0x2f91

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    const/16 p3, 0x51

    .line 7
    invoke-virtual {p1, p2, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 8
    iget-object p2, p0, Lue0;->x:Lwc0;

    invoke-virtual {p2, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->n()Lje;

    move-result-object p1

    .line 10
    iget-object p2, p0, Lue0;->x:Lwc0;

    const p3, 0x7f0a01f7

    invoke-virtual {p1, p3, p2}, Lje;->r(ILandroidx/fragment/app/Fragment;)Lje;

    .line 11
    iget-object p2, p0, Lue0;->x:Lwc0;

    invoke-virtual {p0, p2}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 12
    invoke-virtual {p1}, Lje;->j()I

    .line 13
    new-instance p1, Lia0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    invoke-direct {p1, p2}, Lia0;-><init>(Landroidx/fragment/app/FragmentManager;)V

    .line 14
    iget-object p2, p0, Lue0;->q:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p2, p1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lno;)V

    .line 15
    iget-object p1, p0, Lue0;->v:Lcom/google/android/material/tabs/TabLayout;

    iget-object p2, p0, Lue0;->q:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, p2}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 16
    iget-object p1, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 17
    iget-object p1, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/16 p3, 0xa

    invoke-virtual {p1, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setMaxLength(I)V

    .line 18
    iget-object p1, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->setActive(Z)V

    .line 19
    iget-object p1, p0, Lue0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->setActive(Z)V

    .line 20
    iget-object p1, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 p3, 0x6

    invoke-virtual {p1, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 21
    iget-object p1, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    new-instance p3, Lbg0;

    iget-object v0, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object v0

    invoke-direct {p3, v0, p2}, Lbg0;-><init>(Landroid/widget/EditText;I)V

    invoke-virtual {p1, p3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 22
    iget-object p1, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f0b002e

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setLeftImageSize(II)V

    .line 23
    iget-object p1, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    const/high16 p2, 0x41b00000    # 22.0f

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setTextSize(F)V

    .line 24
    iget-object p1, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getRightText()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    iget-object p1, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    new-instance p2, Lue0$a;

    invoke-direct {p2, p0}, Lue0$a;-><init>(Lue0;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 26
    iget-object p1, p0, Lue0;->w:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 11

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_9

    const v0, 0x2f92

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v2, 0x2d

    if-eq p1, v2, :cond_3

    const/16 v1, 0x2f

    const/4 v2, 0x0

    if-eq p1, v1, :cond_2

    const/16 v0, 0x62

    if-eq p1, v0, :cond_1

    .line 4
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_2

    .line 5
    :cond_1
    iget-object p1, p0, Lxc0;->c:Lz;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto/16 :goto_2

    .line 6
    :cond_2
    iput-boolean v2, p0, Lue0;->t:Z

    .line 7
    iget-object p1, p0, Lue0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 9
    iget-boolean p1, p0, Lue0;->s:Z

    if-eqz p1, :cond_9

    .line 10
    iget-object p1, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x5

    invoke-virtual {p1, v2, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lue0;->A(Ljava/lang/String;)V

    .line 11
    iput-boolean v2, p0, Lue0;->s:Z

    return-void

    .line 12
    :cond_3
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x12d

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2}, Lmg0;->o(ILjava/lang/Object;)V

    .line 13
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1, v2}, Lqa0;->k0(Ljava/util/ArrayList;)V

    .line 14
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object p1

    .line 15
    iget-object v0, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 16
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 17
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 18
    iget-object v0, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setApprovalRefNo(Ljava/lang/String;)V

    goto :goto_1

    .line 20
    :cond_4
    iget-object v0, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 21
    :goto_1
    iget-object p1, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setDescription(Ljava/lang/String;)V

    .line 22
    iget-object p1, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setResponseCode(Ljava/lang/String;)V

    .line 23
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 24
    iget-object p2, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    const v0, 0x2f93

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 25
    iget-object p1, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 26
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 27
    iget-object p1, p0, Lxc0;->b:Lmg0;

    if-nez p1, :cond_5

    .line 28
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    check-cast p1, Lcom/upi/axispay/activity/MainActivity;

    iput-object p1, p0, Lxc0;->b:Lmg0;

    .line 29
    :cond_5
    invoke-static {}, Leg0;->B()V

    const p1, 0x2f94

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const p2, 0x7f120497

    if-eqz p1, :cond_6

    .line 31
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v3

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const p1, 0x7f1201be

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    const p1, 0x7f1203cd

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lue0$b;

    invoke-direct {v7, p0}, Lue0$b;-><init>(Lue0;)V

    const p1, 0x7f1203d2

    .line 32
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lue0$c;

    invoke-direct {v9, p0}, Lue0$c;-><init>(Lue0;)V

    const/4 v10, 0x1

    .line 33
    invoke-static/range {v3 .. v10}, Leg0;->s(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    return-void

    :cond_6
    const p1, 0x2f95

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 34
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 35
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

    new-instance v2, Lue0$d;

    invoke-direct {v2, p0}, Lue0$d;-><init>(Lue0;)V

    invoke-static {p1, p2, v0, v1, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    :cond_7
    const p1, 0x2f96

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 37
    invoke-static {}, Leg0;->B()V

    .line 38
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v3

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const p1, 0x7f120206

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    const p1, 0x7f1200d3

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lue0$e;

    invoke-direct {v7, p0}, Lue0$e;-><init>(Lue0;)V

    const p1, 0x7f12031d

    .line 39
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lue0$f;

    invoke-direct {v9, p0}, Lue0$f;-><init>(Lue0;)V

    const/4 v10, 0x1

    .line 40
    invoke-static/range {v3 .. v10}, Leg0;->s(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    return-void

    .line 41
    :cond_8
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x18

    invoke-interface {p1, p2, v2}, Lmg0;->t(ILjava/lang/Object;)V

    .line 42
    :cond_9
    :goto_2
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 6

    const v0, 0x7f12042e

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x51

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
    iget-object v0, p0, Lue0;->F:Landroidx/viewpager/widget/ViewPager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lno;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lue0;->F:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lno;

    move-result-object v0

    invoke-virtual {v0}, Lno;->j()V

    .line 6
    :cond_0
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->C()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->C()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 7
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->C()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lue0;->I(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x3c

    const/4 v4, 0x1

    const v5, 0x2f97

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v1, v3, v5, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;Z)V

    invoke-virtual {v0, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 9
    :goto_0
    invoke-virtual {p0}, Lue0;->B()V

    .line 10
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->D()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 12
    :cond_2
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x3d

    const/4 v4, 0x0

    invoke-direct {v2, v1, v3, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Lua0;->p(Lcom/olive/upi/transport/OliveRequest;)V

    .line 13
    :cond_3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->m()Ldg0;

    move-result-object v0

    iput-object v0, p0, Lue0;->C:Ldg0;

    if-nez v0, :cond_4

    return-void

    .line 14
    :cond_4
    invoke-virtual {v0}, Ldg0;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 15
    iget-object v0, p0, Lue0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    iget-object v1, p0, Lue0;->C:Ldg0;

    invoke-virtual {v1}, Ldg0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 16
    :cond_5
    iget-object v0, p0, Lue0;->C:Ldg0;

    invoke-virtual {v0}, Ldg0;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 17
    iget-object v0, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    iget-object v1, p0, Lue0;->C:Ldg0;

    invoke-virtual {v1}, Ldg0;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 18
    :cond_6
    iget-object v0, p0, Lue0;->C:Ldg0;

    invoke-virtual {v0}, Ldg0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 19
    iget-object v0, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    iget-object v1, p0, Lue0;->C:Ldg0;

    invoke-virtual {v1}, Ldg0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    :cond_7
    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0x32

    if-eq v0, v1, :cond_8

    const/16 v1, 0x38

    if-eq v0, v1, :cond_7

    const/16 v1, 0x62

    if-eq v0, v1, :cond_6

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_5

    const/16 v2, 0x3d

    if-eq v0, v2, :cond_4

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    iget p2, p0, Lxc0;->g:I

    if-ne p1, p2, :cond_9

    .line 3
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_1

    .line 4
    :pswitch_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/PrefixMobile;

    iput-object p1, p0, Lue0;->B:Lcom/olive/upi/transport/model/PrefixMobile;

    if-eqz p1, :cond_2

    .line 5
    iput-boolean v2, p0, Lue0;->t:Z

    .line 6
    iput-boolean v3, p0, Lue0;->s:Z

    .line 7
    iget-object p1, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->length()I

    move-result p1

    const/4 p2, 0x3

    if-le p1, p2, :cond_1

    .line 8
    iget-object p1, p0, Lue0;->B:Lcom/olive/upi/transport/model/PrefixMobile;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PrefixMobile;->getCircle()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lue0;->B:Lcom/olive/upi/transport/model/PrefixMobile;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PrefixMobile;->getCircle()Ljava/lang/String;

    move-result-object p1

    const p2, 0x2f98

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length p1, p1

    if-lez p1, :cond_0

    .line 9
    iget-object p1, p0, Lue0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    iget-object v0, p0, Lue0;->B:Lcom/olive/upi/transport/model/PrefixMobile;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/PrefixMobile;->getCircle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    aget-object p2, p2, v2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 10
    :cond_0
    iget-object p1, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    iget-object p2, p0, Lue0;->B:Lcom/olive/upi/transport/model/PrefixMobile;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PrefixMobile;->getOperator()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 11
    :cond_1
    iget-object p1, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    goto/16 :goto_1

    .line 12
    :cond_2
    iput-boolean v3, p0, Lue0;->t:Z

    .line 13
    iget-object p1, p0, Lue0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const p2, 0x2f99

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 14
    iget-object p1, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 15
    iget-object p1, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    .line 16
    iget-boolean p1, p0, Lue0;->s:Z

    if-eqz p1, :cond_9

    .line 17
    iget-object p1, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x5

    invoke-virtual {p1, v3, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lue0;->A(Ljava/lang/String;)V

    .line 18
    iput-boolean v3, p0, Lue0;->s:Z

    return-void

    .line 19
    :pswitch_1
    invoke-static {}, Leg0;->B()V

    .line 20
    iget-object p1, p0, Lue0;->x:Lwc0;

    if-eqz p1, :cond_9

    .line 21
    invoke-virtual {p1}, Lwc0;->H()V

    goto/16 :goto_1

    .line 22
    :pswitch_2
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x12d

    const/4 v4, 0x0

    invoke-interface {p1, v0, v4}, Lmg0;->o(ILjava/lang/Object;)V

    .line 23
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v5, 0x51

    const v6, 0x2f9a

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v5, v1, v6, v2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;Z)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 24
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object p1

    .line 25
    iget-object v0, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setApprovalRefNo(Ljava/lang/String;)V

    .line 26
    iget-object v0, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setResponseCode(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 28
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 29
    iget-object v1, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 30
    iget-object p1, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    goto :goto_0

    .line 31
    :cond_3
    iget-object v0, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 32
    :goto_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 33
    iget-object v0, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    const v1, 0x2f9b

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 34
    iget-object p1, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 35
    iget-object p1, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setDescription(Ljava/lang/String;)V

    .line 36
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 37
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p2

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x2f9c

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->j(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v0, v2

    invoke-virtual {p2, v1, v0}, Ln70;->v(Ljava/lang/String;I)V

    .line 38
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p2

    iget-object v0, p0, Lue0;->C:Ldg0;

    invoke-virtual {v0}, Ldg0;->c()Ljava/lang/String;

    move-result-object v0

    const v1, 0x2f9d

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1, v0}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p2

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const v2, 0x2f9e

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2, v0, v1}, Ln70;->x(Ljava/lang/String;J)V

    .line 40
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const p2, 0x2f9f

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v3}, Ln70;->A(Ljava/lang/String;Z)V

    .line 41
    invoke-static {}, Leg0;->B()V

    .line 42
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x18

    invoke-interface {p1, p2, v4}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_1

    .line 43
    :cond_4
    iget-object p1, p0, Lue0;->H:Lgf0;

    if-eqz p1, :cond_9

    .line 44
    invoke-virtual {p1}, Lgf0;->x()V

    goto :goto_1

    .line 45
    :cond_5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->C()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lue0;->I(Ljava/util/ArrayList;)V

    goto :goto_1

    .line 46
    :cond_6
    invoke-virtual {p0}, Lue0;->z()Z

    goto :goto_1

    .line 47
    :cond_7
    invoke-static {}, Leg0;->B()V

    goto :goto_1

    .line 48
    :cond_8
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->n()Lcom/olive/upi/transport/model/BillPayDataMaxAmount;

    move-result-object p1

    iput-object p1, p0, Lue0;->r:Lcom/olive/upi/transport/model/BillPayDataMaxAmount;

    :cond_9
    :goto_1
    :pswitch_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2d
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public s(ILjava/lang/Object;)V
    .locals 2

    const v0, 0x7f0a0226

    if-eq p1, v0, :cond_1

    const v0, 0x7f0a03bc

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lue0;->s:Z

    .line 2
    check-cast p2, Lcom/olive/upi/transport/model/RecentBPTHistory;

    .line 3
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/RecentBPTHistory;->getMobn_subid()Ljava/lang/String;

    move-result-object p1

    .line 4
    iget-object v0, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0, p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/RecentBPTHistory;->getAmount()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const/4 v0, 0x4

    if-le p2, v0, :cond_2

    const/4 p2, 0x0

    .line 7
    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lue0;->A(Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_1
    check-cast p2, Lcom/olive/upi/transport/model/Banner;

    .line 9
    new-instance p1, Lna0;

    invoke-direct {p1}, Lna0;-><init>()V

    .line 10
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Banner;->getClickUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lna0;->e(Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x45

    invoke-interface {v0, v1, p1}, Lmg0;->t(ILjava/lang/Object;)V

    .line 12
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const v0, 0x7f12028c

    .line 13
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x2fa0

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Banner;->getClickUrl()Ljava/lang/String;

    move-result-object p2

    const v0, 0x2fa1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const v0, 0x2fa2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final x(Lcom/olive/upi/transport/model/Account;)V
    .locals 3

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->m()Ldg0;

    move-result-object v0

    iput-object v0, p0, Lue0;->C:Ldg0;

    .line 2
    new-instance v0, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 3
    sget-object v1, Lcom/olive/upi/transport/TransportConstants;->BILLPAY_UPIID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    const v1, 0x2fa3

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    const v1, 0x2fa4

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/BeneVpa;->setNickname(Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 7
    iget-object p1, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_SEND:I

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 8
    iget-object p1, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setDirection(I)V

    .line 9
    iget-object p1, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 10
    iget-object p1, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    const v0, 0x2fa5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRefUrl(Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setMcc(Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setOrderId(Ljava/lang/String;)V

    .line 13
    iget-object p1, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    iget-object v0, p0, Lue0;->C:Ldg0;

    invoke-virtual {v0}, Ldg0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 14
    iget-object p1, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x2fa6

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lue0;->C:Ldg0;

    invoke-virtual {v1}, Ldg0;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x2fa7

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lue0;->C:Ldg0;

    invoke-virtual {v2}, Ldg0;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lue0;->C:Ldg0;

    invoke-virtual {v2}, Ldg0;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lue0;->C:Ldg0;

    invoke-virtual {v1}, Ldg0;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 15
    new-instance p1, Ljava/util/Hashtable;

    invoke-direct {p1}, Ljava/util/Hashtable;-><init>()V

    .line 16
    iget-object v0, p0, Lue0;->C:Ldg0;

    invoke-virtual {v0}, Ldg0;->c()Ljava/lang/String;

    move-result-object v0

    const v1, 0x2fa8

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    iget-object v0, p0, Lue0;->C:Ldg0;

    invoke-virtual {v0}, Ldg0;->d()Ljava/lang/String;

    move-result-object v0

    const v1, 0x2fa9

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    iget-object v0, p0, Lue0;->C:Ldg0;

    invoke-virtual {v0}, Ldg0;->b()Ljava/lang/String;

    move-result-object v0

    const v1, 0x2faa

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    iget-object v0, p0, Lue0;->C:Ldg0;

    invoke-virtual {v0}, Ldg0;->a()Ljava/lang/String;

    move-result-object v0

    const v1, 0x2fab

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    iget-object v0, p0, Lue0;->C:Ldg0;

    invoke-virtual {v0}, Ldg0;->e()Ljava/lang/String;

    move-result-object v0

    const v1, 0x2fac

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    invoke-static {p1}, Ljg0;->f(Ljava/util/Hashtable;)Ljava/lang/String;

    move-result-object p1

    .line 22
    iget-object v0, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setBillInfoString(Ljava/lang/String;)V

    .line 23
    iget-object p1, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    const v0, 0x2fad

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setBillpayKey(Ljava/lang/String;)V

    .line 24
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 25
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    iget-object v0, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    const/16 v1, 0x51

    const/16 v2, 0x1fe

    invoke-direct {p1, v1, v2, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/4 v0, 0x7

    .line 26
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 27
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public y()V
    .locals 3

    .line 1
    iget v0, p0, Lue0;->E:I

    const v1, 0x2fae

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lxc0;->j(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget v0, p0, Lxc0;->f:I

    const/4 v2, 0x2

    if-ge v0, v2, :cond_1

    .line 3
    invoke-virtual {p0, v1}, Lxc0;->q(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lue0;->D()V

    :cond_1
    :goto_0
    return-void
.end method

.method public z()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0xa

    if-ge v0, v2, :cond_0

    .line 2
    iget-object v0, p0, Lue0;->l:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v2, 0x7f120287

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    return v1

    .line 3
    :cond_0
    iget-object v0, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lue0;->m:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v2, 0x7f120403

    invoke-virtual {v0, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    return v1

    .line 5
    :cond_1
    iget-object v0, p0, Lue0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lue0;->n:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v2, 0x7f1203fd

    invoke-virtual {v0, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    return v1

    .line 7
    :cond_2
    iget-object v0, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v2, v4

    if-gez v0, :cond_3

    goto/16 :goto_1

    .line 8
    :cond_3
    iget-object v0, p0, Lue0;->r:Lcom/olive/upi/transport/model/BillPayDataMaxAmount;

    if-nez v0, :cond_4

    return v1

    .line 9
    :cond_4
    iget-object v0, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    iget-object v0, p0, Lue0;->r:Lcom/olive/upi/transport/model/BillPayDataMaxAmount;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BillPayDataMaxAmount;->getMobilePrepaidMaxAmount()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    cmpl-double v0, v2, v4

    if-lez v0, :cond_5

    .line 10
    iget-object v0, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0x7f120284

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v3, 0x2faf

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lue0;->r:Lcom/olive/upi/transport/model/BillPayDataMaxAmount;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/BillPayDataMaxAmount;->getMobilePrepaidMaxAmount()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(Ljava/lang/String;)V

    return v1

    .line 11
    :cond_5
    invoke-virtual {p0}, Lue0;->E()V

    .line 12
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    sget-object v2, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {v0, v2}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v0

    .line 13
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sget-object v4, Ln70;->f:Ln70$a;

    invoke-virtual {v4}, Ln70$a;->a()Ln70;

    move-result-object v5

    const v6, 0x2fb0

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ln70;->k(Ljava/lang/String;)J

    move-result-wide v7

    sub-long/2addr v2, v7

    const-wide/16 v7, 0x3e8

    div-long/2addr v2, v7

    const-wide/16 v7, 0xe10

    rem-long/2addr v2, v7

    long-to-int v2, v2

    div-int/lit8 v2, v2, 0x3c

    .line 14
    invoke-virtual {v4}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v5, 0x2fb1

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 15
    invoke-virtual {v4}, Ln70$a;->a()Ln70;

    move-result-object v3

    invoke-virtual {v3, v6}, Ln70;->k(Ljava/lang/String;)J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v3, v6, v8

    if-eqz v3, :cond_6

    .line 16
    invoke-virtual {v4}, Ln70$a;->a()Ln70;

    move-result-object v3

    invoke-virtual {v3, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lue0;->C:Ldg0;

    invoke-virtual {v4}, Ldg0;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, 0x5

    if-gt v2, v3, :cond_6

    .line 17
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v2, 0x7f120480

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return v1

    .line 18
    :cond_6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v2

    invoke-virtual {v2}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v2

    iput-object v2, p0, Lue0;->D:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v2, 0x1

    if-eqz v0, :cond_8

    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-le v3, v2, :cond_7

    .line 20
    iget-object v0, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x50

    const v3, 0x2fb2

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 21
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v3, v2, :cond_9

    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p0, v0}, Lue0;->x(Lcom/olive/upi/transport/model/Account;)V

    goto :goto_0

    .line 23
    :cond_8
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f1202ef

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_9
    :goto_0
    return v2

    .line 24
    :cond_a
    :goto_1
    iget-object v0, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v2, 0x7f12017f

    invoke-virtual {v0, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->showError(I)V

    .line 25
    iget-object v0, p0, Lue0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->requestFocus()Z

    return v1
.end method
