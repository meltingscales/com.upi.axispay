.class public Lqe0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqe0$h;
    }
.end annotation


# instance fields
.field public l:Lx90;

.field public m:Landroid/widget/Spinner;

.field public n:Landroid/widget/Button;

.field public o:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public p:Lcom/upi/axispay/custom/FloatingInputLayout;

.field public q:Lo70;

.field public r:Landroid/widget/ScrollView;

.field public s:Landroid/widget/TextView;

.field public t:Landroid/widget/LinearLayout;

.field public u:Landroid/widget/ImageView;

.field public v:I

.field public w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo70;",
            ">;"
        }
    .end annotation
.end field

.field public x:Landroid/widget/LinearLayout;

.field public y:Lcom/upi/axispay/custom/LoginPopupFragment;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static synthetic x(Lqe0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lqe0;->A()V

    return-void
.end method

.method public static z()Lqe0;
    .locals 1

    .line 1
    new-instance v0, Lqe0;

    invoke-direct {v0}, Lqe0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final A()V
    .locals 6

    .line 1
    new-instance v0, Lhg0;

    invoke-direct {v0}, Lhg0;-><init>()V

    .line 2
    :try_start_0
    iget-object v1, p0, Lqe0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide/high16 v1, -0x4010000000000000L    # -1.0

    .line 3
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    .line 4
    :goto_0
    iget-object v2, p0, Lqe0;->w:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_4

    .line 5
    iget-object v2, p0, Lqe0;->q:Lo70;

    invoke-virtual {v2}, Lo70;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lhg0;->j(Ljava/lang/String;)V

    .line 6
    iget-object v2, p0, Lqe0;->q:Lo70;

    invoke-virtual {v2}, Lo70;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lhg0;->g(Ljava/lang/String;)V

    .line 7
    iget-object v2, p0, Lqe0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 8
    iget-object v2, p0, Lqe0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lhg0;->f(Ljava/lang/String;)V

    .line 9
    :cond_0
    iget-object v2, p0, Lqe0;->p:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 10
    iget-object v2, p0, Lqe0;->p:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lhg0;->h(Ljava/lang/String;)V

    .line 11
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    const-wide v4, 0x40f86a0000000000L    # 100000.0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_2

    .line 12
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f12006a

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    .line 13
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-ltz v2, :cond_3

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    cmpg-double v1, v1, v3

    if-gez v1, :cond_3

    .line 14
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f120085

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    .line 15
    :cond_3
    iget v1, p0, Lqe0;->v:I

    invoke-virtual {v0, v1}, Lhg0;->i(I)V

    .line 16
    iget-object v1, p0, Lxc0;->b:Lmg0;

    const/16 v2, 0x37

    invoke-interface {v1, v2, v0}, Lmg0;->t(ILjava/lang/Object;)V

    :cond_4
    return-void
.end method

.method public final B()V
    .locals 9

    .line 1
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0}, Ln70;->o()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lqe0;->w:Ljava/util/ArrayList;

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-lez v0, :cond_0

    .line 3
    iget-object v0, p0, Lqe0;->s:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lqe0;->r:Landroid/widget/ScrollView;

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lqe0;->w:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Lqe0;->E(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lqe0;->r:Landroid/widget/ScrollView;

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lqe0;->s:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    const v0, 0x7f120102

    .line 9
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v0, 0x7f120376

    .line 10
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v0, 0x7f12031e

    .line 11
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lqe0$f;

    invoke-direct {v6, p0}, Lqe0$f;-><init>(Lqe0;)V

    const v0, 0x7f1200bf

    .line 12
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lqe0$g;

    invoke-direct {v8, p0}, Lqe0$g;-><init>(Lqe0;)V

    .line 13
    invoke-static/range {v2 .. v8}, Leg0;->r(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public C(I)V
    .locals 0

    .line 1
    iput p1, p0, Lqe0;->v:I

    return-void
.end method

.method public final D()V
    .locals 3

    .line 1
    iget-object v0, p0, Lqe0;->y:Lcom/upi/axispay/custom/LoginPopupFragment;

    if-nez v0, :cond_0

    const/16 v0, 0x41

    .line 2
    invoke-static {v0}, Lcom/upi/axispay/custom/LoginPopupFragment;->newInstance(I)Lcom/upi/axispay/custom/LoginPopupFragment;

    move-result-object v0

    iput-object v0, p0, Lqe0;->y:Lcom/upi/axispay/custom/LoginPopupFragment;

    const v1, 0x7f120361

    .line 3
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/LoginPopupFragment;->setMessage(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lqe0;->y:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    iget-object v2, p0, Lqe0;->y:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lqe0;->y:Lcom/upi/axispay/custom/LoginPopupFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/DialogFragment;->setCancelable(Z)V

    .line 6
    iget-object v0, p0, Lqe0;->y:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {v0, p0}, Lcom/upi/axispay/custom/LoginPopupFragment;->setLoginCompletionListener(Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;)V

    .line 7
    iget-object v0, p0, Lqe0;->y:Lcom/upi/axispay/custom/LoginPopupFragment;

    new-instance v1, Lqe0$e;

    invoke-direct {v1, p0}, Lqe0$e;-><init>(Lqe0;)V

    invoke-virtual {v0, v1}, Lcom/upi/axispay/custom/LoginPopupFragment;->setCancelListner(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method public final E(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lo70;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    iget-object v0, p0, Lqe0;->l:Lx90;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lx90;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lx90;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lqe0;->l:Lx90;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0, p1}, Lx90;->b(Ljava/util/ArrayList;)V

    .line 5
    :goto_0
    iget-object p1, p0, Lqe0;->m:Landroid/widget/Spinner;

    iget-object v0, p0, Lqe0;->l:Lx90;

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    goto :goto_1

    .line 6
    :cond_1
    iget-object p1, p0, Lqe0;->r:Landroid/widget/ScrollView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ScrollView;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lqe0;->s:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    const p3, 0x7f0d0092

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0a0429

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Spinner;

    iput-object p2, p0, Lqe0;->m:Landroid/widget/Spinner;

    const p2, 0x7f0a00c7

    .line 3
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p0, Lqe0;->n:Landroid/widget/Button;

    const p2, 0x7f0a03a4

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object p2, p0, Lqe0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v1, 0x7f0b002e

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v2

    invoke-virtual {p2, p3, v2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setLeftImageSize(II)V

    .line 6
    iget-object p2, p0, Lqe0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 p3, 0x6

    invoke-virtual {p2, p3}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 7
    iget-object p2, p0, Lqe0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p2

    const/high16 p3, 0x41b00000    # 22.0f

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->setTextSize(F)V

    .line 8
    iget-object p2, p0, Lqe0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p2

    const/4 p3, 0x5

    invoke-virtual {p2, v0, p3, v0, v0}, Landroid/widget/EditText;->setPadding(IIII)V

    const p2, 0x7f0a03a9

    .line 9
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object p2, p0, Lqe0;->p:Lcom/upi/axispay/custom/FloatingInputLayout;

    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    invoke-virtual {p2, v2, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setLeftImageSize(II)V

    .line 11
    iget-object p2, p0, Lqe0;->p:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/16 v1, 0x14

    invoke-virtual {p2, v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->setMaxLength(I)V

    .line 12
    iget-object p2, p0, Lqe0;->p:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p2

    invoke-virtual {p2, v0, p3, v0, v0}, Landroid/widget/EditText;->setPadding(IIII)V

    const p2, 0x7f0a03e2

    .line 13
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ScrollView;

    iput-object p2, p0, Lqe0;->r:Landroid/widget/ScrollView;

    const p2, 0x7f0a034a

    .line 14
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lqe0;->s:Landroid/widget/TextView;

    const p2, 0x7f0a035f

    .line 15
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p0, Lqe0;->t:Landroid/widget/LinearLayout;

    const p2, 0x7f0a0099

    .line 16
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lqe0;->u:Landroid/widget/ImageView;

    const p2, 0x7f0a0560

    .line 17
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p0, Lqe0;->x:Landroid/widget/LinearLayout;

    .line 18
    iget p2, p0, Lqe0;->v:I

    const/4 v1, 0x4

    if-ne p2, v1, :cond_0

    .line 19
    invoke-virtual {p0}, Lqe0;->D()V

    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Lqe0;->B()V

    .line 21
    :goto_0
    iget p2, p0, Lqe0;->v:I

    if-ne p2, p3, :cond_1

    .line 22
    iget-object p2, p0, Lqe0;->t:Landroid/widget/LinearLayout;

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 23
    :cond_1
    iget-object p2, p0, Lqe0;->t:Landroid/widget/LinearLayout;

    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 24
    :goto_1
    iget-object p2, p0, Lqe0;->m:Landroid/widget/Spinner;

    new-instance p3, Lqe0$a;

    invoke-direct {p3, p0}, Lqe0$a;-><init>(Lqe0;)V

    invoke-virtual {p2, p3}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 25
    iget-object p2, p0, Lqe0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p2

    new-instance p3, Lbg0;

    iget-object v1, p0, Lqe0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {p3, v1, v2}, Lbg0;-><init>(Landroid/widget/EditText;I)V

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 26
    iget-object p2, p0, Lqe0;->p:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->getInputField()Landroid/widget/EditText;

    move-result-object p2

    const/4 p3, 0x2

    new-array p3, p3, [Landroid/text/InputFilter;

    new-instance v1, Lqe0$h;

    invoke-direct {v1, p0}, Lqe0$h;-><init>(Lqe0;)V

    aput-object v1, p3, v0

    new-instance v0, Landroid/text/InputFilter$LengthFilter;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f0b001c

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v0, p3, v2

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 27
    iget-object p2, p0, Lqe0;->n:Landroid/widget/Button;

    new-instance p3, Lqe0$b;

    invoke-direct {p3, p0}, Lqe0$b;-><init>(Lqe0;)V

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    iget-object p2, p0, Lqe0;->u:Landroid/widget/ImageView;

    new-instance p3, Lqe0$c;

    invoke-direct {p3, p0}, Lqe0$c;-><init>(Lqe0;)V

    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    iget-object p2, p0, Lqe0;->x:Landroid/widget/LinearLayout;

    new-instance p3, Lqe0$d;

    invoke-direct {p3, p0}, Lqe0$d;-><init>(Lqe0;)V

    invoke-virtual {p2, p3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p1
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    return-void
.end method

.method public onLoginComplete(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lqe0;->B()V

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lqe0;->B()V

    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 10

    const v0, 0x7f1201d9

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x41

    invoke-virtual {p0, v2, v1}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    .line 3
    iget v1, p0, Lqe0;->v:I

    const/4 v2, 0x5

    if-ne v1, v2, :cond_0

    .line 4
    iget-object v1, p0, Lxc0;->b:Lmg0;

    const/16 v2, 0x5a

    new-instance v9, Ltg0;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {v1, v2, v9}, Lmg0;->o(ILjava/lang/Object;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lqe0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->getTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v0

    const v1, 0x7f120181

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 6
    invoke-virtual {p0}, Lqe0;->y()V

    return-void
.end method

.method public final y()V
    .locals 1

    .line 1
    iget-object v0, p0, Lqe0;->y:Lcom/upi/axispay/custom/LoginPopupFragment;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/DialogFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lqe0;->y:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {v0}, Landroid/app/DialogFragment;->dismiss()V

    :cond_0
    return-void
.end method
