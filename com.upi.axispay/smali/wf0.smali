.class public Lwf0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lua0$e;


# static fields
.field public static G:Lcom/olive/upi/transport/model/Account;


# instance fields
.field public A:[Ljava/lang/String;

.field public B:Landroid/widget/ImageView;

.field public C:I

.field public D:I

.field public E:I

.field public F:Z

.field public l:Landroid/widget/EditText;

.field public m:Landroid/widget/Button;

.field public n:Landroid/widget/Button;

.field public o:Landroid/widget/TextView;

.field public p:Landroid/widget/TextView;

.field public q:Landroid/widget/TextView;

.field public r:Landroid/widget/TextView;

.field public s:Landroid/widget/RadioGroup;

.field public t:Landroid/widget/RadioButton;

.field public u:I

.field public v:Ljava/lang/String;

.field public w:Z

.field public x:Z

.field public y:Landroid/widget/LinearLayout;

.field public z:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwf0;->u:I

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, p0, Lwf0;->w:Z

    .line 4
    iput-boolean v0, p0, Lwf0;->x:Z

    .line 5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lwf0;->z:Ljava/util/ArrayList;

    .line 6
    iput v1, p0, Lwf0;->C:I

    const/4 v1, 0x2

    .line 7
    iput v1, p0, Lwf0;->D:I

    const/4 v1, 0x3

    .line 8
    iput v1, p0, Lwf0;->E:I

    .line 9
    iput-boolean v0, p0, Lwf0;->F:Z

    return-void
.end method

.method public static synthetic A(Lwf0;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lwf0;->v:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic B(Lwf0;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lwf0;->z:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic C(Lwf0;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lwf0;->o:Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic D(Lwf0;)I
    .locals 0

    .line 1
    iget p0, p0, Lwf0;->u:I

    return p0
.end method

.method public static synthetic E(Lwf0;I)I
    .locals 0

    .line 1
    iput p1, p0, Lwf0;->u:I

    return p1
.end method

.method public static synthetic F(Lwf0;)I
    .locals 0

    .line 1
    iget p0, p0, Lwf0;->C:I

    return p0
.end method

.method public static synthetic G()Lcom/olive/upi/transport/model/Account;
    .locals 1

    .line 1
    sget-object v0, Lwf0;->G:Lcom/olive/upi/transport/model/Account;

    return-object v0
.end method

.method public static I()Lwf0;
    .locals 1

    .line 1
    new-instance v0, Lwf0;

    invoke-direct {v0}, Lwf0;-><init>()V

    return-object v0
.end method

.method public static synthetic x(Lwf0;)I
    .locals 0

    .line 1
    iget p0, p0, Lwf0;->E:I

    return p0
.end method

.method public static synthetic y(Lwf0;)Landroid/widget/EditText;
    .locals 0

    .line 1
    iget-object p0, p0, Lwf0;->l:Landroid/widget/EditText;

    return-object p0
.end method

.method public static synthetic z(Lwf0;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lwf0;->H(I)V

    return-void
.end method


# virtual methods
.method public final H(I)V
    .locals 4

    const/16 v0, 0x8

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v1, :cond_1

    const/4 v3, 0x2

    if-eq p1, v3, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iput-boolean v2, p0, Lwf0;->w:Z

    .line 2
    iput-boolean v1, p0, Lwf0;->x:Z

    .line 3
    iget-object p1, p0, Lwf0;->n:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lwf0;->m:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_1
    iget-object p1, p0, Lwf0;->n:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lwf0;->m:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setVisibility(I)V

    .line 7
    iput-boolean v2, p0, Lwf0;->x:Z

    .line 8
    iput-boolean v1, p0, Lwf0;->w:Z

    :goto_0
    return-void
.end method

.method public final J(Landroid/view/View;)V
    .locals 6

    const v0, 0x7f0a055e

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lwf0;->l:Landroid/widget/EditText;

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setMaxLines(I)V

    .line 3
    iget-object v0, p0, Lwf0;->l:Landroid/widget/EditText;

    new-array v2, v1, [Landroid/text/InputFilter;

    new-instance v3, Landroid/text/InputFilter$LengthFilter;

    const/16 v4, 0x1f

    invoke-direct {v3, v4}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 4
    iget-object v0, p0, Lwf0;->l:Landroid/widget/EditText;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    const v3, 0x7f06004a

    invoke-static {v2, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setHintTextColor(I)V

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f030009

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lwf0;->A:[Ljava/lang/String;

    const v0, 0x7f0a00d8

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lwf0;->n:Landroid/widget/Button;

    .line 7
    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a04da

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lwf0;->o:Landroid/widget/TextView;

    const v0, 0x7f0a0546

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lwf0;->p:Landroid/widget/TextView;

    const v0, 0x7f0a0545

    .line 10
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lwf0;->q:Landroid/widget/TextView;

    const v0, 0x7f0a01ca

    .line 11
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lwf0;->r:Landroid/widget/TextView;

    const v0, 0x7f0a01b4

    .line 12
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lwf0;->B:Landroid/widget/ImageView;

    .line 13
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0444

    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kofigyan/stateprogressbar/StateProgressBar;

    .line 15
    iget-object v2, p0, Lwf0;->A:[Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setStateDescriptionData([Ljava/lang/String;)V

    const v0, 0x7f0a0336

    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lwf0;->s:Landroid/widget/RadioGroup;

    const v0, 0x7f0a044b

    .line 17
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lwf0;->y:Landroid/widget/LinearLayout;

    const v0, 0x7f0a00ef

    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lwf0;->m:Landroid/widget/Button;

    .line 19
    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    sget-object p1, Lwf0;->G:Lcom/olive/upi/transport/model/Account;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lwf0;->v:Ljava/lang/String;

    .line 21
    iget-object p1, p0, Lwf0;->r:Landroid/widget/TextView;

    const v0, 0x11cd

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    iget-object p1, p0, Lwf0;->v:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v2, 0x2

    if-nez p1, :cond_2

    .line 23
    iget-object p1, p0, Lwf0;->v:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 24
    iget-object p1, p0, Lwf0;->v:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x9

    invoke-virtual {p1, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lwf0;->v:Ljava/lang/String;

    .line 25
    :cond_1
    iget-object p1, p0, Lwf0;->l:Landroid/widget/EditText;

    iget-object v0, p0, Lwf0;->v:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 26
    invoke-virtual {p0, v2}, Lwf0;->H(I)V

    .line 27
    iput-boolean v1, p0, Lwf0;->F:Z

    goto/16 :goto_4

    .line 28
    :cond_2
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const v3, 0x11ce

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v5, 0xc

    if-ne v3, v5, :cond_3

    move v3, v1

    goto :goto_1

    :cond_3
    move v3, v4

    :goto_1
    const v5, 0x11cf

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    and-int/2addr v3, v5

    if-eqz v3, :cond_4

    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    .line 31
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0xd

    if-ne v2, v3, :cond_5

    goto :goto_2

    :cond_5
    move v1, v4

    :goto_2
    const v2, 0x11d0

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    and-int/2addr v1, v2

    if-nez v1, :cond_6

    const v1, 0x11d1

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_6
    const/4 v1, 0x3

    .line 32
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 33
    :cond_7
    :goto_3
    iget-object v1, p0, Lwf0;->l:Landroid/widget/EditText;

    invoke-virtual {v1, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 34
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1}, Leg0;->i(Landroid/app/Activity;)V

    .line 35
    new-instance v1, Lcom/olive/upi/transport/model/SetProfile;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lwf0;->G:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Lcom/olive/upi/transport/model/SetProfile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x3c

    const/16 v3, 0x1e

    invoke-direct {v0, v2, v3, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 37
    :goto_4
    iget-object p1, p0, Lwf0;->l:Landroid/widget/EditText;

    new-instance v0, Lwf0$a;

    invoke-direct {v0, p0}, Lwf0$a;-><init>(Lwf0;)V

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 38
    iget-object p1, p0, Lwf0;->s:Landroid/widget/RadioGroup;

    new-instance v0, Lwf0$b;

    invoke-direct {v0, p0}, Lwf0$b;-><init>(Lwf0;)V

    invoke-virtual {p1, v0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    return-void
.end method

.method public K(Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    sput-object p1, Lwf0;->G:Lcom/olive/upi/transport/model/Account;

    return-void
.end method

.method public L(I)V
    .locals 6

    .line 1
    iget v0, p0, Lwf0;->C:I

    const v1, 0x7f06018a

    const v2, 0x7f120093

    const v3, 0x7f060162

    const/4 v4, 0x0

    const/16 v5, 0x8

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lwf0;->o:Landroid/widget/TextView;

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    iget-object p1, p0, Lwf0;->o:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 4
    iget-object p1, p0, Lwf0;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 5
    iget-object p1, p0, Lwf0;->q:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lwf0;->p:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lwf0;->p:Landroid/widget/TextView;

    const v0, 0x7f1204c7

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 8
    iget-object p1, p0, Lwf0;->p:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 9
    :cond_0
    iget v0, p0, Lwf0;->D:I

    if-ne p1, v0, :cond_1

    .line 10
    iget-object p1, p0, Lwf0;->o:Landroid/widget/TextView;

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 11
    iget-object p1, p0, Lwf0;->q:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    iget-object p1, p0, Lwf0;->o:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 13
    iget-object p1, p0, Lwf0;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 14
    iget-object p1, p0, Lwf0;->p:Landroid/widget/TextView;

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 15
    iget-object p1, p0, Lwf0;->p:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 16
    :cond_1
    iget-object p1, p0, Lwf0;->q:Landroid/widget/TextView;

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 17
    iget-object p1, p0, Lwf0;->o:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 18
    iget-object p1, p0, Lwf0;->o:Landroid/widget/TextView;

    const v0, 0x7f1204d0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 19
    iget-object p1, p0, Lwf0;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 20
    iget-object p1, p0, Lwf0;->p:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 21
    iget-object p1, p0, Lwf0;->p:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 22
    iget-object p1, p0, Lwf0;->p:Landroid/widget/TextView;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_0
    return-void
.end method

.method public final M(Lcom/olive/upi/transport/model/Account;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0d005a

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    const v2, 0x7f0a04f6

    .line 3
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0a00e0

    .line 4
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 5
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 7
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    .line 8
    new-instance v0, Lwf0$c;

    invoke-direct {v0, p0, p1}, Lwf0$c;-><init>(Lwf0;Landroid/app/AlertDialog;)V

    invoke-virtual {v3, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v0, 0x0

    .line 9
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog;->setCancelable(Z)V

    .line 10
    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method public final N(Lcom/olive/upi/transport/model/Account;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f120102

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f120352

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getdLength()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const p1, 0x7f1203cf

    .line 2
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lwf0$d;

    invoke-direct {v4, p0}, Lwf0$d;-><init>(Lwf0;)V

    const p1, 0x7f120111

    .line 3
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lwf0$e;

    invoke-direct {v6, p0}, Lwf0$e;-><init>(Lwf0;)V

    .line 4
    invoke-static/range {v0 .. v6}, Leg0;->r(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a00d8

    const/16 v1, 0x3c

    const v2, 0x11d2

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    if-eq p1, v0, :cond_2

    const v0, 0x7f0a00ef

    if-eq p1, v0, :cond_1

    const v0, 0x7f0a01b4

    if-eq p1, v0, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lwf0;->l:Landroid/widget/EditText;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 3
    iget-object p1, p0, Lwf0;->l:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v1, 0x11d3

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 5
    iget-object v1, p0, Lwf0;->l:Landroid/widget/EditText;

    invoke-virtual {p1, v1, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    goto/16 :goto_0

    .line 6
    :cond_1
    iget-boolean p1, p0, Lwf0;->x:Z

    if-eqz p1, :cond_7

    .line 7
    iget-boolean p1, p0, Lwf0;->w:Z

    if-nez p1, :cond_7

    .line 8
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 9
    new-instance p1, Lcom/olive/upi/transport/model/SaveAccount;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/SaveAccount;-><init>()V

    .line 10
    sget-object v0, Lwf0;->G:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/SaveAccount;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lwf0;->l:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/SaveAccount;->setVpa(Ljava/lang/String;)V

    .line 12
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x9

    invoke-direct {v2, v1, v3, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 13
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 14
    iget-object p1, p0, Lwf0;->l:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v0, 0x4

    if-ge p1, v0, :cond_3

    .line 15
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f120187

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    .line 16
    :cond_3
    iget-object p1, p0, Lwf0;->l:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v3, 0x1e

    if-le p1, v3, :cond_4

    .line 17
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f120321

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 18
    :cond_4
    iget-boolean p1, p0, Lwf0;->w:Z

    if-eqz p1, :cond_5

    .line 19
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const v0, 0x7f120436

    .line 20
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v4, 0x11d4

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v4, 0x11d5

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 22
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 23
    new-instance p1, Lcom/olive/upi/transport/model/SetProfile;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lwf0;->l:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lwf0;->G:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v0, v2}, Lcom/olive/upi/transport/model/SetProfile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v2, v1, v3, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    :cond_5
    if-nez p1, :cond_6

    const/4 p1, 0x2

    .line 25
    invoke-virtual {p0, p1}, Lwf0;->H(I)V

    .line 26
    iget p1, p0, Lwf0;->C:I

    invoke-virtual {p0, p1}, Lwf0;->L(I)V

    .line 27
    iget-object p1, p0, Lwf0;->o:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 28
    :cond_6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f120214

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_7
    :goto_0
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

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d00b2

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1}, Lwf0;->J(Landroid/view/View;)V

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0x1e

    if-eq p1, v0, :cond_0

    .line 3
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_1

    .line 4
    :cond_0
    iget-object p1, p0, Lwf0;->s:Landroid/widget/RadioGroup;

    invoke-virtual {p1}, Landroid/widget/RadioGroup;->removeAllViews()V

    .line 5
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    iput-object p1, p0, Lwf0;->z:Ljava/util/ArrayList;

    if-eqz p1, :cond_3

    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_3

    .line 7
    iget-boolean p1, p0, Lwf0;->F:Z

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    .line 8
    iget-object p1, p0, Lwf0;->y:Landroid/widget/LinearLayout;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 9
    iget-object p1, p0, Lwf0;->l:Landroid/widget/EditText;

    iget-object p2, p0, Lwf0;->z:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const v2, 0x11d6

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    aget-object p2, p2, v1

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget p1, p0, Lwf0;->C:I

    invoke-virtual {p0, p1}, Lwf0;->L(I)V

    const/4 p1, 0x2

    .line 11
    invoke-virtual {p0, p1}, Lwf0;->H(I)V

    .line 12
    iput-boolean v0, p0, Lwf0;->F:Z

    goto :goto_0

    .line 13
    :cond_1
    iget p1, p0, Lwf0;->D:I

    invoke-virtual {p0, p1}, Lwf0;->L(I)V

    .line 14
    iget-object p1, p0, Lwf0;->p:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object p1, p0, Lwf0;->y:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 16
    invoke-virtual {p0, v0}, Lwf0;->H(I)V

    .line 17
    :goto_0
    iget-object p1, p0, Lwf0;->z:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v1, p1, :cond_3

    .line 18
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const p2, 0x7f0d0127

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RadioButton;

    iput-object p1, p0, Lwf0;->t:Landroid/widget/RadioButton;

    .line 19
    iget-object p2, p0, Lwf0;->z:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 20
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x10

    if-le p1, p2, :cond_2

    .line 21
    iget-object p1, p0, Lwf0;->t:Landroid/widget/RadioButton;

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/RadioButton;->setId(I)V

    .line 22
    :cond_2
    iget-object p1, p0, Lwf0;->s:Landroid/widget/RadioGroup;

    iget-object p2, p0, Lwf0;->t:Landroid/widget/RadioButton;

    invoke-virtual {p1, p2}, Landroid/widget/RadioGroup;->addView(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 23
    :cond_3
    invoke-static {}, Leg0;->B()V

    .line 24
    :cond_4
    :goto_1
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 2

    const v0, 0x7f120436

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3c

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
    iget-object v0, p0, Lwf0;->y:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

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

    const/16 v2, 0x9

    const v3, 0x11d7

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-eq v1, v2, :cond_4

    const/16 p2, 0xf

    if-eq v1, p2, :cond_3

    const/16 p2, 0x1e

    if-eq v1, p2, :cond_0

    .line 3
    iget p2, p0, Lxc0;->g:I

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p2, p1, :cond_8

    .line 4
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_0

    .line 5
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 6
    iget-boolean p1, p0, Lwf0;->F:Z

    const/4 p2, 0x1

    if-nez p1, :cond_1

    .line 7
    iput-boolean p2, p0, Lwf0;->F:Z

    .line 8
    :cond_1
    iget-object p1, p0, Lwf0;->y:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 9
    iget-object p1, p0, Lwf0;->s:Landroid/widget/RadioGroup;

    invoke-virtual {p1}, Landroid/widget/RadioGroup;->removeAllViews()V

    .line 10
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x2

    .line 11
    invoke-virtual {p0, p1}, Lwf0;->H(I)V

    goto/16 :goto_0

    .line 12
    :cond_2
    iget-object p1, p0, Lwf0;->l:Landroid/widget/EditText;

    const v0, 0x11d8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 13
    invoke-virtual {p0, p2}, Lwf0;->H(I)V

    goto/16 :goto_0

    .line 14
    :cond_3
    invoke-static {}, Leg0;->B()V

    .line 15
    sget-object p1, Lwf0;->G:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p0, p1}, Lwf0;->M(Lcom/olive/upi/transport/model/Account;)V

    goto/16 :goto_0

    .line 16
    :cond_4
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    const v0, 0x7f110001

    invoke-static {p1, v0}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object p1

    .line 18
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    .line 19
    sget-object p1, Lwf0;->G:Lcom/olive/upi/transport/model/Account;

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lwf0;->l:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v1, 0x11d9

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/Account;->setVpa(Ljava/lang/String;)V

    .line 21
    invoke-static {}, Leg0;->B()V

    .line 22
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    if-eqz p2, :cond_5

    .line 23
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Lqa0;->m0(Ljava/util/ArrayList;Landroid/content/Context;)V

    .line 24
    :cond_5
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getStatus()Ljava/lang/String;

    move-result-object p2

    const v0, 0x11da

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    const/16 v0, 0x3c

    if-eqz p2, :cond_6

    .line 25
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2, v0}, Lqa0;->r0(I)V

    .line 26
    invoke-virtual {p0, p1}, Lwf0;->N(Lcom/olive/upi/transport/model/Account;)V

    goto :goto_0

    .line 27
    :cond_6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lqa0;->r0(I)V

    .line 28
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x3d

    sget-object v0, Lwf0;->G:Lcom/olive/upi/transport/model/Account;

    invoke-interface {p1, p2, v0}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 29
    :cond_7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_8
    :goto_0
    return-void
.end method
