.class public Lhe0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lua0$e;
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static U:I


# instance fields
.field public A:Ljava/lang/String;

.field public B:Ljava/lang/String;

.field public C:Z

.field public D:Landroid/widget/Button;

.field public E:Landroid/widget/TextView;

.field public F:Landroid/widget/ImageView;

.field public G:Z

.field public H:Landroid/app/AlertDialog;

.field public I:Ljava/lang/Boolean;

.field public J:I

.field public K:I

.field public L:Ljava/lang/String;

.field public M:Ljava/lang/String;

.field public N:Landroid/content/BroadcastReceiver;

.field public O:Landroid/content/BroadcastReceiver;

.field public P:Landroid/content/BroadcastReceiver;

.field public Q:Landroid/app/Activity;

.field public R:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public S:I

.field public T:I

.field public l:Landroid/widget/LinearLayout;

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:Landroid/os/CountDownTimer;

.field public u:Z

.field public v:Landroid/widget/RadioGroup;

.field public w:Landroid/widget/RadioButton;

.field public x:Landroid/widget/ImageView;

.field public y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/telephony/SubscriptionInfo;",
            ">;"
        }
    .end annotation
.end field

.field public z:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const/16 v0, 0x65

    .line 2
    iput v0, p0, Lhe0;->m:I

    const/16 v0, 0x66

    .line 3
    iput v0, p0, Lhe0;->n:I

    const/16 v0, 0x67

    .line 4
    iput v0, p0, Lhe0;->o:I

    const/16 v0, 0x68

    .line 5
    iput v0, p0, Lhe0;->p:I

    const/16 v0, 0x69

    .line 6
    iput v0, p0, Lhe0;->q:I

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lhe0;->r:I

    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lhe0;->A:Ljava/lang/String;

    .line 9
    iput-object v1, p0, Lhe0;->B:Ljava/lang/String;

    .line 10
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, p0, Lhe0;->I:Ljava/lang/Boolean;

    const/4 v1, 0x1

    .line 11
    iput v1, p0, Lhe0;->J:I

    const/4 v1, 0x2

    .line 12
    iput v1, p0, Lhe0;->K:I

    const v1, 0x4d3

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 13
    iput-object v1, p0, Lhe0;->L:Ljava/lang/String;

    const v1, 0x4d4

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 14
    iput-object v1, p0, Lhe0;->M:Ljava/lang/String;

    .line 15
    new-instance v1, Lhe0$b;

    invoke-direct {v1, p0}, Lhe0$b;-><init>(Lhe0;)V

    iput-object v1, p0, Lhe0;->N:Landroid/content/BroadcastReceiver;

    .line 16
    new-instance v1, Lhe0$c;

    invoke-direct {v1, p0}, Lhe0$c;-><init>(Lhe0;)V

    iput-object v1, p0, Lhe0;->O:Landroid/content/BroadcastReceiver;

    .line 17
    new-instance v1, Lhe0$d;

    invoke-direct {v1, p0}, Lhe0$d;-><init>(Lhe0;)V

    iput-object v1, p0, Lhe0;->P:Landroid/content/BroadcastReceiver;

    .line 18
    iput v0, p0, Lhe0;->S:I

    return-void
.end method

.method public static synthetic A(Lhe0;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lhe0;->N()I

    move-result p0

    return p0
.end method

.method public static synthetic B(Lhe0;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lhe0;->B:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic C(Lhe0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lhe0;->P()V

    return-void
.end method

.method public static synthetic D(Lhe0;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lhe0;->A:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic E(Lhe0;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lhe0;->z:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic F(Lhe0;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lhe0;->W(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic G(Lhe0;)Landroid/os/CountDownTimer;
    .locals 0

    .line 1
    iget-object p0, p0, Lhe0;->t:Landroid/os/CountDownTimer;

    return-object p0
.end method

.method public static synthetic H(Lhe0;Landroid/os/CountDownTimer;)Landroid/os/CountDownTimer;
    .locals 0

    .line 1
    iput-object p1, p0, Lhe0;->t:Landroid/os/CountDownTimer;

    return-object p1
.end method

.method public static synthetic I(Lhe0;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lhe0;->X(I)V

    return-void
.end method

.method public static synthetic J(Lhe0;)I
    .locals 0

    .line 1
    iget p0, p0, Lhe0;->r:I

    return p0
.end method

.method public static synthetic K(Lhe0;I)I
    .locals 0

    .line 1
    iput p1, p0, Lhe0;->r:I

    return p1
.end method

.method public static synthetic L(Lhe0;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lhe0;->y:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic M(Lhe0;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lhe0;->u:Z

    return p1
.end method

.method public static S(I)Lhe0;
    .locals 0

    .line 1
    sput p0, Lhe0;->U:I

    .line 2
    new-instance p0, Lhe0;

    invoke-direct {p0}, Lhe0;-><init>()V

    return-object p0
.end method

.method public static synthetic x(Lhe0;)I
    .locals 0

    .line 1
    iget p0, p0, Lhe0;->s:I

    return p0
.end method

.method public static synthetic y(Lhe0;I)I
    .locals 0

    .line 1
    iput p1, p0, Lhe0;->s:I

    return p1
.end method

.method public static synthetic z(Lhe0;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lhe0;->B:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final N()I
    .locals 3

    .line 1
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 2
    iget-object v1, p0, Lhe0;->R:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 3
    iget-object v1, p0, Lhe0;->R:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    return v0

    .line 4
    :cond_0
    iget-object v1, p0, Lhe0;->R:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    return v0
.end method

.method public final O()V
    .locals 1

    .line 1
    iget-object v0, p0, Lhe0;->H:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhe0;->H:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method public final P()V
    .locals 5

    .line 1
    iget-object v0, p0, Lhe0;->A:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhe0;->B:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lc70;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 3
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x4d5

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x4d6

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lc70;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lhe0;->z:Ljava/lang/String;

    .line 5
    sput-object v0, Lcom/olive/upi/transport/TransportConstants;->regRandom:Ljava/lang/String;

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 7
    invoke-virtual {p0}, Lhe0;->U()V

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 9
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x16

    const/16 v3, 0x28

    const v4, 0x4d7

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public Q()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lhe0;->R()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    const/16 v2, 0x8

    const/4 v3, 0x1

    if-lt v0, v1, :cond_6

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/telephony/SubscriptionManager;->from(Landroid/content/Context;)Landroid/telephony/SubscriptionManager;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoCount()I

    move-result v1

    if-lt v1, v3, :cond_6

    .line 5
    invoke-virtual {v0}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lhe0;->y:Ljava/util/List;

    if-eqz v0, :cond_5

    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [Ljava/lang/String;

    .line 7
    iget-object v4, p0, Lhe0;->y:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/telephony/SubscriptionInfo;

    add-int/lit8 v8, v6, 0x1

    .line 8
    invoke-virtual {v7}, Landroid/telephony/SubscriptionInfo;->getCarrierName()Ljava/lang/CharSequence;

    move-result-object v9

    if-eqz v9, :cond_1

    invoke-virtual {v7}, Landroid/telephony/SubscriptionInfo;->getCarrierName()Ljava/lang/CharSequence;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_1
    const v7, 0x4d8

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    :goto_1
    aput-object v7, v1, v6

    move v6, v8

    goto :goto_0

    .line 9
    :cond_2
    iget-object v4, p0, Lhe0;->v:Landroid/widget/RadioGroup;

    invoke-virtual {v4}, Landroid/widget/RadioGroup;->removeAllViews()V

    :goto_2
    if-ge v5, v0, :cond_5

    .line 10
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v4

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    const v6, 0x7f0d0127

    const/4 v7, 0x0

    invoke-virtual {v4, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RadioButton;

    iput-object v4, p0, Lhe0;->w:Landroid/widget/RadioButton;

    .line 11
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v7, v1, v5

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v7, 0x4d9

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v7, v5, 0x1

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v8, 0x4da

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v4, p0, Lhe0;->w:Landroid/widget/RadioButton;

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v6

    invoke-virtual {v4, v6}, Landroid/widget/RadioButton;->setId(I)V

    .line 13
    iget-object v4, p0, Lhe0;->v:Landroid/widget/RadioGroup;

    iget-object v6, p0, Lhe0;->w:Landroid/widget/RadioButton;

    invoke-virtual {v4, v6}, Landroid/widget/RadioGroup;->addView(Landroid/view/View;)V

    .line 14
    iget v4, p0, Lhe0;->r:I

    if-ne v5, v4, :cond_3

    .line 15
    iget-object v4, p0, Lhe0;->w:Landroid/widget/RadioButton;

    invoke-virtual {v4, v3}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 16
    iget-object v4, p0, Lhe0;->v:Landroid/widget/RadioGroup;

    iget-object v5, p0, Lhe0;->w:Landroid/widget/RadioButton;

    invoke-virtual {v4, v5}, Landroid/widget/RadioGroup;->indexOfChild(Landroid/view/View;)I

    move-result v4

    iput v4, p0, Lhe0;->r:I

    .line 17
    :cond_3
    iget-object v4, p0, Lhe0;->y:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ne v4, v3, :cond_4

    .line 18
    iget-object v4, p0, Lhe0;->v:Landroid/widget/RadioGroup;

    invoke-virtual {v4, v2}, Landroid/widget/RadioGroup;->setVisibility(I)V

    :cond_4
    move v5, v7

    goto :goto_2

    .line 19
    :cond_5
    iget-object v0, p0, Lhe0;->v:Landroid/widget/RadioGroup;

    new-instance v1, Lhe0$f;

    invoke-direct {v1, p0}, Lhe0$f;-><init>(Lhe0;)V

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 20
    :cond_6
    iget-object v0, p0, Lhe0;->D:Landroid/widget/Button;

    iget v1, p0, Lhe0;->J:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 21
    iget-object v0, p0, Lhe0;->D:Landroid/widget/Button;

    const v1, 0x7f12036b

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 22
    iget-object v0, p0, Lhe0;->D:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V

    .line 23
    iget-object v0, p0, Lhe0;->D:Landroid/widget/Button;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    const v3, 0x7f060048

    invoke-static {v1, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundColor(I)V

    .line 24
    iget-object v0, p0, Lhe0;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method public final R()Z
    .locals 4

    .line 1
    iget v0, p0, Lhe0;->m:I

    const v1, 0x4db

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lxc0;->j(Ljava/lang/String;I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget v0, p0, Lhe0;->o:I

    const v2, 0x4dc

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v0}, Lxc0;->j(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 3
    :cond_1
    iget v0, p0, Lhe0;->o:I

    const v3, 0x4dd

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3, v0}, Lxc0;->j(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    .line 4
    :cond_2
    iget v0, p0, Lhe0;->p:I

    const v3, 0x4de

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3, v0}, Lxc0;->j(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    .line 5
    :cond_3
    iget v0, p0, Lhe0;->q:I

    const v3, 0x4df

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3, v0}, Lxc0;->j(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    .line 6
    :cond_4
    iget v0, p0, Lhe0;->q:I

    const v3, 0x4e0

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3, v0}, Lxc0;->j(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_5

    return v1

    .line 7
    :cond_5
    iget v0, p0, Lhe0;->n:I

    invoke-virtual {p0, v2, v0}, Lxc0;->j(Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method public final T()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    iget-object v1, p0, Lhe0;->N:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    iget-object v3, p0, Lhe0;->L:Ljava/lang/String;

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    iget-object v1, p0, Lhe0;->P:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    iget-object v3, p0, Lhe0;->M:Ljava/lang/String;

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    iget-object v1, p0, Lhe0;->O:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const v3, 0x4e1

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public final U()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lc70;->m(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f120428

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Leg0;->C(Landroid/app/Activity;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lhe0;->B:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lhe0;->A:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v2, 0x4e2

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lhe0;->z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lhe0;->V(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const v0, 0x7f120175

    .line 4
    invoke-virtual {p0, v0}, Lhe0;->X(I)V

    :goto_0
    return-void
.end method

.method public final V(Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lhe0;->I:Ljava/lang/Boolean;

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    const/high16 v1, 0x4000000

    goto :goto_0

    :cond_0
    const/high16 v1, 0x40000000    # 2.0f

    .line 3
    :goto_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    new-instance v3, Landroid/content/Intent;

    iget-object v4, p0, Lhe0;->L:Ljava/lang/String;

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {v2, v4, v3, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v9

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    new-instance v3, Landroid/content/Intent;

    iget-object v5, p0, Lhe0;->M:Ljava/lang/String;

    invoke-direct {v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v4, v3, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v10

    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Lhe0;->y:Ljava/util/List;

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget v3, p0, Lhe0;->r:I

    if-le v2, v3, :cond_2

    const/16 v2, 0x16

    if-lt v0, v2, :cond_1

    .line 6
    iget-object v0, p0, Lhe0;->y:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/SubscriptionInfo;

    invoke-virtual {v0}, Landroid/telephony/SubscriptionInfo;->getSubscriptionId()I

    move-result v0

    invoke-static {v0}, Landroid/telephony/SmsManager;->getSmsManagerForSubscriptionId(I)Landroid/telephony/SmsManager;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v5, v1

    goto :goto_2

    .line 7
    :cond_2
    invoke-static {}, Landroid/telephony/SmsManager;->getDefault()Landroid/telephony/SmsManager;

    move-result-object v0

    :goto_1
    move-object v5, v0

    :goto_2
    if-eqz v5, :cond_3

    const/4 v7, 0x0

    move-object v6, p1

    move-object v8, p2

    .line 8
    invoke-virtual/range {v5 .. v10}, Landroid/telephony/SmsManager;->sendTextMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V

    .line 9
    invoke-virtual {p0}, Lhe0;->Y()V

    goto :goto_3

    :cond_3
    const p1, 0x7f1203c8

    .line 10
    invoke-virtual {p0, p1}, Lhe0;->X(I)V

    :goto_3
    return-void
.end method

.method public final W(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 11

    const v0, 0x4e3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 2
    iget-object v0, p0, Lhe0;->Q:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const v0, 0x4e4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v7, 0x4e5

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v3, 0x4e6

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v8, 0x4e7

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    filled-new-array {v0, v7, v3, v8}, [Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 3
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v2

    const/4 v3, 0x5

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 4
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_3

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_3

    .line 5
    invoke-interface {v0, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-interface {v0, v8}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 7
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    const/16 v9, 0xa

    if-le v6, v9, :cond_0

    .line 8
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v6, v9

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v10

    invoke-virtual {v4, v6, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_0
    move-object v4, p1

    .line 9
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    if-le v6, v9, :cond_1

    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v6, v9

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v9

    invoke-virtual {p1, v6, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 11
    :cond_1
    invoke-virtual {v4, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 12
    invoke-virtual {v5, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 13
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    const/4 v1, 0x1

    goto :goto_2

    .line 14
    :cond_2
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 15
    :cond_3
    :goto_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_4
    return v1
.end method

.method public final X(I)V
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lhe0;->I:Ljava/lang/Boolean;

    .line 2
    invoke-static {}, Leg0;->B()V

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isDetached()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lhe0;->O()V

    .line 5
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 6
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    const p1, 0x7f1200c0

    .line 7
    new-instance v1, Lhe0$j;

    invoke-direct {v1, p0}, Lhe0$j;-><init>(Lhe0;)V

    invoke-virtual {v0, p1, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const p1, 0x7f1203d2

    .line 8
    new-instance v1, Lhe0$a;

    invoke-direct {v1, p0}, Lhe0$a;-><init>(Lhe0;)V

    invoke-virtual {v0, p1, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 9
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    :cond_1
    :goto_0
    return-void
.end method

.method public Y()V
    .locals 7

    .line 1
    new-instance v6, Lhe0$g;

    const-wide/16 v2, 0x7530

    const-wide/16 v4, 0x3e8

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lhe0$g;-><init>(Lhe0;JJ)V

    iput-object v6, p0, Lhe0;->t:Landroid/os/CountDownTimer;

    .line 2
    invoke-virtual {v6}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    return-void
.end method

.method public l(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lxc0;->l(I)V

    .line 2
    iget-object p1, p0, Lhe0;->l:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object p1, p0, Lhe0;->D:Landroid/widget/Button;

    iget v0, p0, Lhe0;->K:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 4
    iget-object p1, p0, Lhe0;->D:Landroid/widget/Button;

    const v0, 0x7f120430

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setText(I)V

    .line 5
    iget-object p1, p0, Lhe0;->D:Landroid/widget/Button;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 6
    iget-object p1, p0, Lhe0;->D:Landroid/widget/Button;

    iget-object v0, p0, Lhe0;->Q:Landroid/app/Activity;

    const v1, 0x7f060048

    invoke-static {v0, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setBackgroundColor(I)V

    return-void
.end method

.method public m(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lxc0;->m(I)V

    .line 2
    iget-object p1, p0, Lhe0;->l:Landroid/widget/LinearLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    invoke-virtual {p0}, Lhe0;->Q()V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 2
    iget v0, p0, Lhe0;->K:I

    if-ne p1, v0, :cond_0

    .line 3
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const v0, 0x4e8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x4e9

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0, v1}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 6
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 7
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 8
    :cond_0
    iget v0, p0, Lhe0;->J:I

    if-ne p1, v0, :cond_1

    .line 9
    invoke-virtual {p0}, Lhe0;->P()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d00de

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p2

    iput-object p2, p0, Lhe0;->Q:Landroid/app/Activity;

    const p2, 0x7f0a0336

    .line 3
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/RadioGroup;

    iput-object p2, p0, Lhe0;->v:Landroid/widget/RadioGroup;

    const p2, 0x7f0a0099

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lhe0;->F:Landroid/widget/ImageView;

    const p2, 0x7f0a0385

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p0, Lhe0;->l:Landroid/widget/LinearLayout;

    const p2, 0x7f0a00ef

    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p0, Lhe0;->D:Landroid/widget/Button;

    .line 7
    invoke-virtual {p2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0a031c

    .line 8
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lhe0;->E:Landroid/widget/TextView;

    const p2, 0x7f0a024a

    .line 9
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    .line 10
    iget-object p2, p0, Lhe0;->D:Landroid/widget/Button;

    invoke-virtual {p2, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 11
    iget-object p2, p0, Lhe0;->D:Landroid/widget/Button;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p3

    const v0, 0x7f060047

    invoke-static {p3, v0}, Lt8;->d(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setBackgroundColor(I)V

    const p2, 0x7f0a0226

    .line 12
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lhe0;->x:Landroid/widget/ImageView;

    .line 13
    iget-object p2, p0, Lhe0;->F:Landroid/widget/ImageView;

    new-instance p3, Lhe0$e;

    invoke-direct {p3, p0}, Lhe0$e;-><init>(Lhe0;)V

    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    invoke-virtual {p0}, Lhe0;->Q()V

    return-object p1
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lhe0;->t:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 2
    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    return-void
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120008

    if-nez v0, :cond_0

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v0

    .line 2
    :goto_0
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v2

    const/16 v3, 0x28

    if-ne v2, v3, :cond_2

    .line 4
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    const p2, 0x4ea

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Ljg0;->W(Landroid/app/Activity;)V

    goto :goto_2

    .line 6
    :cond_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_2

    .line 7
    :cond_2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/4 v2, 0x5

    const/16 v3, 0x19

    if-eq v0, v2, :cond_4

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    if-ne v0, v3, :cond_3

    goto :goto_1

    .line 8
    :cond_3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p2, v0}, Leg0;->h(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 9
    :cond_4
    :goto_1
    invoke-static {}, Leg0;->B()V

    .line 10
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    if-ne p1, v3, :cond_7

    .line 11
    iget-object p1, p0, Lhe0;->I:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    return-void

    .line 12
    :cond_5
    iget-object p1, p2, Lcom/olive/upi/transport/api/Result;->code:Ljava/lang/String;

    const v0, 0x4eb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 13
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f120126

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f1201b3

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lhe0$i;

    invoke-direct {v1, p0}, Lhe0$i;-><init>(Lhe0;)V

    const v2, 0x4ec

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2, p2, v0, v1}, Leg0;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_2

    .line 14
    :cond_6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    const p1, 0x7f1203c9

    .line 15
    invoke-virtual {p0, p1}, Lhe0;->X(I)V

    .line 16
    :cond_7
    :goto_2
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Lxc0;->onPause()V

    .line 2
    iget-object v0, p0, Lhe0;->t:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 4
    iget-object v0, p0, Lhe0;->t:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->onFinish()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lhe0;->t:Landroid/os/CountDownTimer;

    :cond_0
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

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lua0;->v(Ljava/lang/String;)V

    .line 4
    sget v0, Lhe0;->U:I

    const/16 v1, 0xd

    if-ne v0, v1, :cond_0

    .line 5
    iget-object v0, p0, Lhe0;->E:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lhe0;->E:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    :goto_0
    invoke-virtual {p0}, Lhe0;->T()V

    const/16 v0, 0x16

    const v1, 0x7f120286

    .line 8
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lxc0;->v(ILjava/lang/String;)V

    .line 9
    iget-object v0, p0, Lhe0;->I:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10
    iget v0, p0, Lhe0;->s:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const v0, 0x7f1203c8

    .line 11
    invoke-virtual {p0, v0}, Lhe0;->X(I)V

    goto :goto_1

    .line 12
    :cond_1
    iget-boolean v0, p0, Lhe0;->G:Z

    if-eqz v0, :cond_2

    .line 13
    invoke-virtual {p0}, Lhe0;->Q()V

    :cond_2
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lhe0;->G:Z

    :cond_3
    :goto_1
    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_b

    const/4 v2, 0x5

    const v3, 0x4ed

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-eq v1, v2, :cond_9

    const/16 v2, 0x19

    if-eq v1, v2, :cond_2

    const/16 v2, 0x28

    if-eq v1, v2, :cond_0

    const/16 v2, 0x59

    if-eq v1, v2, :cond_2

    .line 3
    iget p2, p0, Lxc0;->g:I

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p2, p1, :cond_c

    .line 4
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_3

    .line 5
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 6
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_c

    .line 7
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/HealthCheck;

    .line 8
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/HealthCheck;->getKeyword_msg()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lhe0;->A:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/HealthCheck;->getAggregators()Ljava/lang/String;

    move-result-object p2

    .line 10
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const p1, 0x4ee

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-virtual {p2, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lhe0;->R:Ljava/util/List;

    .line 12
    invoke-virtual {p0}, Lhe0;->N()I

    move-result p1

    iput p1, p0, Lhe0;->S:I

    .line 13
    iput p1, p0, Lhe0;->T:I

    .line 14
    iget-object p2, p0, Lhe0;->R:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lhe0;->B:Ljava/lang/String;

    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/HealthCheck;->getService_provider_num()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lhe0;->B:Ljava/lang/String;

    .line 16
    :goto_0
    invoke-virtual {p0}, Lhe0;->P()V

    goto/16 :goto_3

    .line 17
    :cond_2
    iget-object p1, p0, Lhe0;->I:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_3

    return-void

    .line 18
    :cond_3
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 19
    invoke-static {}, Leg0;->B()V

    .line 20
    iget-object p1, p0, Lhe0;->x:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f080277

    invoke-static {v0, v1}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 21
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x4ef

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x4f0

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x4f1

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x4f2

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/olive/upi/transport/model/Registration;

    .line 24
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Registration;->getType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Registration;->getType()Ljava/lang/String;

    move-result-object v0

    const v1, 0x4f3

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 25
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v0

    const/4 v1, 0x1

    const v2, 0x4f4

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ln70;->A(Ljava/lang/String;Z)V

    .line 26
    :cond_4
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Registration;->getNotification()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Registration;->getType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Registration;->getType()Ljava/lang/String;

    move-result-object v0

    const v1, 0x4f5

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 27
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Registration;->getNotification()Ljava/lang/String;

    move-result-object v0

    const v1, 0x4f6

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    :cond_5
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Registration;->getCustomerBankAccountsenc()Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 30
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/OliveUpiManager;->getDecryptedData(Ljava/lang/String;)[B

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    .line 31
    new-instance p1, Lcom/google/gson/Gson;

    invoke-direct {p1}, Lcom/google/gson/Gson;-><init>()V

    .line 32
    new-instance v1, Lhe0$h;

    invoke-direct {v1, p0}, Lhe0$h;-><init>(Lhe0;)V

    .line 33
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 34
    invoke-virtual {p1, v0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 35
    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/Registration;->setCustomerBankAccountses(Ljava/util/ArrayList;)V

    .line 36
    :cond_6
    sget p1, Lhe0;->U:I

    const/16 v0, 0xd

    if-ne p1, v0, :cond_7

    .line 37
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Registration;->getCustomerBankAccountses()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lqa0;->m0(Ljava/util/ArrayList;Landroid/content/Context;)V

    .line 38
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x48

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_1

    .line 39
    :cond_7
    invoke-static {}, Lpa0;->a()Lpa0;

    move-result-object p1

    invoke-virtual {p1, p2}, Lpa0;->f(Lcom/olive/upi/transport/model/Registration;)V

    .line 40
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x4a

    const/16 v0, 0x16

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lmg0;->t(ILjava/lang/Object;)V

    .line 41
    :cond_8
    :goto_1
    invoke-static {}, Leg0;->B()V

    goto :goto_3

    .line 42
    :cond_9
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_2

    .line 43
    :cond_a
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    .line 44
    :goto_2
    invoke-static {}, Leg0;->B()V

    goto :goto_3

    .line 45
    :cond_b
    invoke-static {}, Leg0;->B()V

    .line 46
    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const-class v0, Lcom/upi/axispay/activity/MainActivity;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 47
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    .line 48
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_c
    :goto_3
    return-void
.end method
