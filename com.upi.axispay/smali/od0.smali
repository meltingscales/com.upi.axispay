.class public Lod0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lng0;
.implements Lua0$e;


# static fields
.field public static K:Z


# instance fields
.field public A:Landroidx/recyclerview/widget/RecyclerView;

.field public B:Lo90;

.field public C:Lwc0;

.field public D:Ln90;

.field public E:Landroidx/viewpager/widget/ViewPager;

.field public F:Landroid/widget/ProgressBar;

.field public G:Lcom/olive/upi/transport/model/TransactionData;

.field public H:I

.field public I:I

.field public J:Landroid/app/Dialog;

.field public l:Landroid/view/View;

.field public m:Landroid/widget/TextView;

.field public n:Landroid/widget/TextView;

.field public o:Landroid/widget/TextView;

.field public p:Landroid/widget/LinearLayout;

.field public q:Landroid/widget/RelativeLayout;

.field public r:Landroid/content/Context;

.field public s:Lkg0;

.field public t:Z

.field public u:Landroid/widget/LinearLayout;

.field public v:Landroid/widget/LinearLayout;

.field public w:Landroid/widget/LinearLayout;

.field public x:Landroid/widget/LinearLayout;

.field public y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;"
        }
    .end annotation
.end field

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lod0;->z:I

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lod0;->H:I

    .line 4
    iput v0, p0, Lod0;->I:I

    return-void
.end method

.method private synthetic B(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lua0;->v(Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->c()V

    .line 3
    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const-class v1, Lcom/upi/axispay/activity/LoginActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x4000000

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private synthetic D(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lua0;->v(Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->c()V

    .line 3
    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v0

    const-class v1, Lcom/upi/axispay/activity/LoginActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x4000000

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private synthetic F(Landroid/view/View;)V
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

.method private synthetic H(Landroid/view/View;)V
    .locals 6

    const v0, 0x2911

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 1
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v0, 0x2912

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Ln70;->v(Ljava/lang/String;I)V

    .line 2
    iget-object v1, p0, Lod0;->r:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 3
    :try_start_0
    iget-object v2, p0, Lod0;->r:Landroid/content/Context;

    new-instance v3, Landroid/content/Intent;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x2913

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-direct {v3, p1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v2, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 4
    :catch_0
    iget-object v2, p0, Lod0;->r:Landroid/content/Context;

    new-instance v3, Landroid/content/Intent;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x2914

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v3, p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v2, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 5
    :goto_0
    :try_start_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const v0, 0x2915

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f120388

    .line 6
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x2916

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f120386

    .line 7
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    const v0, 0x2917

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 9
    :catch_1
    invoke-static {}, Leg0;->e()V

    return-void
.end method

.method private synthetic J(Landroid/view/View;)V
    .locals 5

    .line 1
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v0, 0x2918

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v1, v2, v3}, Ln70;->v(Ljava/lang/String;I)V

    .line 2
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const v0, 0x2919

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Ln70;->A(Ljava/lang/String;Z)V

    .line 3
    :try_start_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const v0, 0x291a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v3, 0x7f120388

    .line 4
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x291b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v3, 0x7f12026b

    .line 5
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    const v0, 0x291c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    :catch_0
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1, v2}, Lqa0;->p0(Z)V

    .line 8
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v0, 0x291d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->j(Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_0

    .line 9
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v3

    invoke-virtual {v3, v2}, Ln70;->j(Ljava/lang/String;)I

    move-result v3

    .line 10
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const v0, 0x291e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ln70;->j(Ljava/lang/String;)I

    move-result p1

    rem-int/2addr v3, p1

    .line 11
    invoke-virtual {v1, v2, v3}, Ln70;->v(Ljava/lang/String;I)V

    .line 12
    :cond_0
    invoke-static {}, Leg0;->e()V

    return-void
.end method

.method private synthetic L(Lcom/olive/upi/transport/model/Account;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p2, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x3d

    invoke-interface {p2, v0, p1}, Lmg0;->t(ILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic N(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {}, Leg0;->c()V

    return-void
.end method

.method public static Q(Z)Lod0;
    .locals 0

    .line 1
    sput-boolean p0, Lod0;->K:Z

    .line 2
    new-instance p0, Lod0;

    invoke-direct {p0}, Lod0;-><init>()V

    return-object p0
.end method


# virtual methods
.method public final A()V
    .locals 3

    .line 1
    iget-object v0, p0, Lod0;->l:Landroid/view/View;

    const v1, 0x7f0a0381

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lod0;->p:Landroid/widget/LinearLayout;

    .line 2
    iget-object v0, p0, Lod0;->l:Landroid/view/View;

    const v1, 0x7f0a04c5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lod0;->n:Landroid/widget/TextView;

    .line 3
    iget-object v0, p0, Lod0;->l:Landroid/view/View;

    const v1, 0x7f0a04c3

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lod0;->o:Landroid/widget/TextView;

    .line 4
    iget-object v0, p0, Lod0;->l:Landroid/view/View;

    const v1, 0x7f0a0264

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lod0;->u:Landroid/widget/LinearLayout;

    .line 5
    iget-object v0, p0, Lod0;->l:Landroid/view/View;

    const v1, 0x7f0a01bb

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lod0;->q:Landroid/widget/RelativeLayout;

    .line 6
    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    iget-object v0, p0, Lod0;->l:Landroid/view/View;

    const v1, 0x7f0a0493

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lod0;->m:Landroid/widget/TextView;

    .line 8
    iget-object v0, p0, Lod0;->l:Landroid/view/View;

    const v1, 0x7f0a0292

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lod0;->v:Landroid/widget/LinearLayout;

    .line 9
    iget-object v0, p0, Lod0;->l:Landroid/view/View;

    const v1, 0x7f0a0289

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lod0;->w:Landroid/widget/LinearLayout;

    .line 10
    iget-object v0, p0, Lod0;->l:Landroid/view/View;

    const v1, 0x7f0a0267

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lod0;->x:Landroid/widget/LinearLayout;

    .line 11
    iget-object v0, p0, Lod0;->l:Landroid/view/View;

    const v1, 0x7f0a0049

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lod0;->F:Landroid/widget/ProgressBar;

    .line 12
    iget-object v0, p0, Lod0;->l:Landroid/view/View;

    const v1, 0x7f0a0365

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lod0;->E:Landroidx/viewpager/widget/ViewPager;

    .line 13
    iget-object v0, p0, Lod0;->l:Landroid/view/View;

    const v1, 0x7f0a00b4

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lod0;->A:Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 15
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 16
    iget-object v1, p0, Lod0;->A:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    return-void
.end method

.method public synthetic C(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lod0;->B(Landroid/view/View;)V

    return-void
.end method

.method public synthetic E(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lod0;->D(Landroid/view/View;)V

    return-void
.end method

.method public synthetic G(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lod0;->F(Landroid/view/View;)V

    return-void
.end method

.method public synthetic I(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lod0;->H(Landroid/view/View;)V

    return-void
.end method

.method public synthetic K(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lod0;->J(Landroid/view/View;)V

    return-void
.end method

.method public synthetic M(Lcom/olive/upi/transport/model/Account;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lod0;->L(Lcom/olive/upi/transport/model/Account;Landroid/view/View;)V

    return-void
.end method

.method public final O()V
    .locals 5

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/GetMandate;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/GetMandate;-><init>()V

    .line 2
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x291f

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/GetMandate;->setCustomerid(Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lc70;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/GetMandate;->setUmn(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/GetMandate;->setTxnid(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x2920

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/GetMandate;->setAppid(Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/4 v3, 0x5

    const/16 v4, 0x4b

    invoke-direct {v2, v3, v4, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public final P()V
    .locals 8

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->H()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x2921

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_0

    .line 3
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/PendingReqVo;

    const v3, 0x7f120347

    .line 4
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/PendingReqVo;->getPayeeVpa()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 5
    iget-object v4, p0, Lod0;->n:Landroid/widget/TextView;

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v3, p0, Lod0;->o:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const v5, 0x2922

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/PendingReqVo;->getAmount()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v0, p0, Lod0;->m:Landroid/widget/TextView;

    sget-object v3, Ln70;->f:Ln70$a;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v3

    invoke-virtual {v3, v1}, Ln70;->j(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v0, p0, Lod0;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 9
    invoke-virtual {p0}, Lod0;->V()V

    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v3

    invoke-virtual {v3, v1}, Ln70;->j(Ljava/lang/String;)I

    move-result v3

    if-lez v3, :cond_1

    .line 11
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v3

    new-instance v4, Lcom/olive/upi/transport/OliveRequest;

    const/4 v5, 0x5

    const/16 v6, 0x1b

    const/4 v7, 0x0

    invoke-direct {v4, v5, v6, v7}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 12
    :cond_1
    iget-object v3, p0, Lod0;->m:Landroid/widget/TextView;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v1}, Ln70;->j(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object v0, p0, Lod0;->n:Landroid/widget/TextView;

    const v1, 0x7f120304

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 14
    iget-object v0, p0, Lod0;->o:Landroid/widget/TextView;

    const v1, 0x2923

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object v0, p0, Lod0;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 16
    invoke-virtual {p0}, Lod0;->V()V

    :goto_0
    return-void
.end method

.method public final R()V
    .locals 1

    .line 1
    iget-object v0, p0, Lod0;->n:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    iget-object v0, p0, Lod0;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    iget-object v0, p0, Lod0;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    iget-object v0, p0, Lod0;->w:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object v0, p0, Lod0;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    iget-object v0, p0, Lod0;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public S()V
    .locals 4

    .line 1
    new-instance v0, Landroid/app/Dialog;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v1

    const v2, 0x7f130246

    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lod0;->J:Landroid/app/Dialog;

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z

    .line 3
    iget-object v0, p0, Lod0;->J:Landroid/app/Dialog;

    const v2, 0x7f0d0030

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setContentView(I)V

    .line 4
    iget-object v0, p0, Lod0;->J:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-virtual {v0, v2, v3}, Landroid/view/Window;->setLayout(II)V

    .line 5
    iget-object v0, p0, Lod0;->J:Landroid/app/Dialog;

    const v2, 0x7f0a016f

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 6
    iget-object v2, p0, Lod0;->J:Landroid/app/Dialog;

    const v3, 0x7f0a0102

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 7
    iget-object v3, p0, Lod0;->J:Landroid/app/Dialog;

    invoke-virtual {v3, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 8
    iget-object v1, p0, Lod0;->J:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 9
    new-instance v1, Lod0$a;

    invoke-direct {v1, p0}, Lod0$a;-><init>(Lod0;)V

    invoke-virtual {v2, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    new-instance v1, Lod0$b;

    invoke-direct {v1, p0}, Lod0$b;-><init>(Lod0;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public T()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    new-instance v1, Lsb0;

    invoke-direct {v1, p0}, Lsb0;-><init>(Lod0;)V

    new-instance v2, Lxb0;

    invoke-direct {v2, p0}, Lxb0;-><init>(Lod0;)V

    invoke-static {v0, v1, v2}, Leg0;->w(Landroid/app/Activity;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final U(Lcom/olive/upi/transport/model/Account;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    iget-object v1, p0, Lod0;->r:Landroid/content/Context;

    const v2, 0x7f12043a

    .line 2
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lod0;->r:Landroid/content/Context;

    const v3, 0x7f1204ce

    .line 3
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lod0;->r:Landroid/content/Context;

    const v4, 0x7f1204fd

    .line 4
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lub0;

    invoke-direct {v4, p0, p1}, Lub0;-><init>(Lod0;Lcom/olive/upi/transport/model/Account;)V

    iget-object p1, p0, Lod0;->r:Landroid/content/Context;

    const v5, 0x7f1202ec

    .line 5
    invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lwb0;->b:Lwb0;

    .line 6
    invoke-static/range {v0 .. v6}, Leg0;->r(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public V()V
    .locals 2

    .line 1
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x2924

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->j(Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/activity/MainActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/upi/axispay/activity/MainActivity;->O0(Z)V

    :cond_0
    return-void
.end method

.method public a(ILjava/lang/Object;Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public e(IILjava/lang/Object;)V
    .locals 2

    const v0, 0x7f0a04d3

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    check-cast p3, Lcom/olive/upi/transport/model/Account;

    .line 2
    iput p2, p0, Lod0;->z:I

    .line 3
    invoke-virtual {p3}, Lcom/olive/upi/transport/model/Account;->getStatus()Ljava/lang/String;

    move-result-object p1

    const v0, 0x2925

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    const/4 v0, 0x5

    const/16 v1, 0x207

    invoke-direct {p1, v0, v1, p3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/OliveRequest;->setTag(Ljava/lang/Object;)V

    .line 6
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 7
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const p2, 0x7f1201f1

    .line 8
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x2926

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    invoke-virtual {p3}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const p3, 0x2927

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const p3, 0x2928

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {p0, p3}, Lod0;->U(Lcom/olive/upi/transport/model/Account;)V

    :goto_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lod0;->t:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lod0;->s:Lkg0;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2, p3}, Lkg0;->d(IILandroid/content/Intent;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const/4 v0, 0x5

    const/16 v1, 0x3a

    const/16 v2, 0x47

    const/4 v3, 0x0

    const v4, 0x7f120366

    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 2
    :sswitch_0
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->H()Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lod0;->y:Ljava/util/ArrayList;

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_1

    .line 4
    iget-object p1, p0, Lxc0;->b:Lmg0;

    iget-object v0, p0, Lod0;->y:Ljava/util/ArrayList;

    invoke-interface {p1, v2, v0}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 5
    :sswitch_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1204e5

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lah0;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x2c

    invoke-interface {p1, v0, v3}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 7
    :sswitch_2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object v1, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {p1, v1}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 8
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_0

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f1203db

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2}, Lah0;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x36

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f1202ef

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 12
    :sswitch_3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object v1, Lqa0$e;->b:Lqa0$e;

    invoke-virtual {p1, v1}, Lqa0;->v0(Lqa0$e;)V

    .line 13
    new-instance p1, Lma0;

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_NONE:I

    invoke-direct {p1, v0, v1}, Lma0;-><init>(II)V

    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f120249

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lah0;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x11

    invoke-interface {v0, v1, p1}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 16
    :sswitch_4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f12004f

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v2}, Lah0;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v1, v3}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 18
    :sswitch_5
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v1, v3}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 19
    :sswitch_6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f12030c

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lah0;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    iget-object p1, p0, Lxc0;->b:Lmg0;

    iget-object v0, p0, Lod0;->y:Ljava/util/ArrayList;

    invoke-interface {p1, v2, v0}, Lmg0;->t(ILjava/lang/Object;)V

    :cond_1
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0a006c -> :sswitch_6
        0x7f0a01bb -> :sswitch_5
        0x7f0a0264 -> :sswitch_4
        0x7f0a0267 -> :sswitch_3
        0x7f0a0289 -> :sswitch_2
        0x7f0a0292 -> :sswitch_1
        0x7f0a0381 -> :sswitch_0
        0x7f0a04c5 -> :sswitch_0
    .end sparse-switch
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 4

    const/16 v0, 0x13

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object p1, p0, Lod0;->D:Ln90;

    iget v1, p0, Lod0;->z:I

    const v2, 0x2929

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v3, v1}, Ln90;->w(Ljava/lang/String;II)V

    .line 2
    iget-object p1, p0, Lod0;->E:Landroidx/viewpager/widget/ViewPager;

    iget-object v1, p0, Lod0;->D:Ln90;

    invoke-virtual {p1, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lno;)V

    .line 3
    iget-object p1, p0, Lod0;->E:Landroidx/viewpager/widget/ViewPager;

    iget v1, p0, Lod0;->z:I

    invoke-virtual {p1, v1, v3}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 4
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    const/4 v1, 0x5

    invoke-direct {p1, v1, v0, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    .line 5
    iget p2, p0, Lod0;->z:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/OliveRequest;->setTag(Ljava/lang/Object;)V

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lxc0;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const p3, 0x7f0d0077

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lod0;->l:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    iput-object p1, p0, Lod0;->r:Landroid/content/Context;

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f130011

    invoke-virtual {p1, p2}, Landroid/content/Context;->setTheme(I)V

    .line 4
    invoke-virtual {p0}, Lod0;->A()V

    .line 5
    invoke-virtual {p0}, Lod0;->R()V

    .line 6
    invoke-static {}, Lwc0;->C()Lwc0;

    move-result-object p1

    iput-object p1, p0, Lod0;->C:Lwc0;

    const p2, 0x7f1201f1

    .line 7
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lxc0;->w(Ljava/lang/String;)V

    .line 8
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const p2, 0x292a

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x5

    .line 9
    invoke-virtual {p1, p2, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 10
    iget-object p2, p0, Lod0;->C:Lwc0;

    invoke-virtual {p2, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->n()Lje;

    move-result-object p1

    .line 12
    iget-object p2, p0, Lod0;->C:Lwc0;

    const p3, 0x7f0a01f7

    invoke-virtual {p1, p3, p2}, Lje;->r(ILandroidx/fragment/app/Fragment;)Lje;

    .line 13
    iget-object p2, p0, Lod0;->C:Lwc0;

    invoke-virtual {p0, p2}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 14
    invoke-virtual {p1}, Lje;->j()I

    .line 15
    iget-object p1, p0, Lod0;->p:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 16
    iget-object p1, p0, Lod0;->q:Landroid/widget/RelativeLayout;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 17
    new-instance p1, Lo90;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Lo90;-><init>(Landroid/content/Context;Lng0;)V

    iput-object p1, p0, Lod0;->B:Lo90;

    .line 18
    iget-object p2, p0, Lod0;->A:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 19
    iget-object p1, p0, Lod0;->A:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Lcom/upi/axispay/custom/SimpleDividerItemDecoration;

    iget-object p3, p0, Lod0;->r:Landroid/content/Context;

    const v1, 0x7f0801d9

    invoke-static {p3, v1}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-direct {p2, p3}, Lcom/upi/axispay/custom/SimpleDividerItemDecoration;-><init>(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 20
    iget-object p1, p0, Lod0;->B:Lo90;

    invoke-virtual {p1, p0}, Lo90;->z(Lng0;)V

    .line 21
    iget-object p1, p0, Lod0;->B:Lo90;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    .line 22
    sget-boolean p1, Lvg0;->b:Z

    if-eqz p1, :cond_0

    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const p2, 0x292b

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln70;->e(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 23
    invoke-virtual {p0}, Lod0;->S()V

    .line 24
    sput-boolean v0, Lvg0;->b:Z

    .line 25
    :cond_0
    iget-object p1, p0, Lod0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    return-void
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 15

    move-object v0, p0

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    if-eqz v1, :cond_f

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isDetached()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    if-eqz p2, :cond_e

    .line 2
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    const v2, 0x292c

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_1

    move-object v1, v2

    goto :goto_0

    :cond_1
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const v3, 0x292d

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 3
    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v1

    const v2, 0x7f1204b7

    invoke-static {v1, v2}, Leg0;->x(Landroid/view/View;I)V

    .line 5
    invoke-static {}, Lc70;->q()V

    goto/16 :goto_2

    :cond_2
    const v3, 0x292e

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x5

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v3, :cond_4

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v1

    const v2, 0x7f1202fd

    invoke-static {v1, v2}, Leg0;->x(Landroid/view/View;I)V

    .line 8
    iget v1, v0, Lod0;->H:I

    if-le v1, v8, :cond_3

    .line 9
    invoke-static {}, Leg0;->B()V

    .line 10
    iget-object v1, v0, Lod0;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 11
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    sget-object v2, Lqa0$c;->d:Lqa0$c;

    invoke-virtual {v1, v2}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p0, v1}, Lod0;->x(Ljava/util/ArrayList;)V

    goto/16 :goto_2

    :cond_3
    add-int/2addr v1, v8

    .line 12
    iput v1, v0, Lod0;->H:I

    .line 13
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v2, v5, v6, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, v8, v2}, Lua0;->b(ZLcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_2

    :cond_4
    const v3, 0x292f

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 14
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 15
    invoke-static {}, Leg0;->B()V

    .line 16
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v9

    const v1, 0x7f12042c

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    const v1, 0x7f12042b

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v11

    const v1, 0x7f120233

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v12

    new-instance v13, Lrb0;

    invoke-direct {v13, p0}, Lrb0;-><init>(Lod0;)V

    new-instance v14, Ltb0;

    invoke-direct {v14, p0}, Ltb0;-><init>(Lod0;)V

    invoke-static/range {v9 .. v14}, Leg0;->p(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    goto/16 :goto_2

    :cond_5
    const v3, 0x2930

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 17
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 18
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_2

    .line 19
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v3

    if-eq v3, v6, :cond_c

    const/16 v4, 0x13

    if-eq v3, v4, :cond_9

    const/16 v4, 0x3f

    if-eq v3, v4, :cond_8

    const/16 v4, 0x62

    if-eq v3, v4, :cond_7

    const/16 v4, 0x207

    if-eq v3, v4, :cond_9

    goto/16 :goto_2

    .line 20
    :cond_7
    iget-object v1, v0, Lxc0;->c:Lz;

    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    goto/16 :goto_2

    .line 21
    :cond_8
    invoke-static {}, Leg0;->B()V

    .line 22
    iget-object v1, v0, Lod0;->B:Lo90;

    invoke-virtual {v1}, Lo90;->A()V

    goto/16 :goto_2

    :cond_9
    const v3, 0x2931

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 23
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 24
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    const v2, 0x7f12005c

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f120499

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f12031e

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lvb0;

    invoke-direct {v5, p0}, Lvb0;-><init>(Lod0;)V

    invoke-static {v1, v2, v3, v4, v5}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    .line 25
    :cond_a
    invoke-virtual/range {p1 .. p1}, Lcom/olive/upi/transport/OliveRequest;->getTag()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_b

    .line 26
    invoke-virtual/range {p1 .. p1}, Lcom/olive/upi/transport/OliveRequest;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_1

    :cond_b
    move v1, v7

    .line 27
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Leg0;->y(Landroid/view/View;Ljava/lang/String;)V

    .line 28
    iget-object v3, v0, Lod0;->E:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v3, v1, v8}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 29
    iget-object v3, v0, Lod0;->D:Ln90;

    invoke-virtual {v3, v2, v7, v1}, Ln90;->w(Ljava/lang/String;II)V

    goto :goto_2

    .line 30
    :cond_c
    iget v1, v0, Lod0;->H:I

    if-le v1, v8, :cond_d

    .line 31
    invoke-static {}, Leg0;->B()V

    .line 32
    iget-object v1, v0, Lod0;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 33
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    sget-object v2, Lqa0$c;->d:Lqa0$c;

    invoke-virtual {v1, v2}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p0, v1}, Lod0;->x(Ljava/util/ArrayList;)V

    goto :goto_2

    :cond_d
    add-int/2addr v1, v8

    .line 34
    iput v1, v0, Lod0;->H:I

    .line 35
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v2, v5, v6, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, v8, v2}, Lua0;->b(ZLcom/olive/upi/transport/OliveRequest;)V

    .line 36
    :goto_2
    invoke-virtual {p0}, Lod0;->V()V

    .line 37
    invoke-static {}, Leg0;->B()V

    :cond_e
    return-void

    .line 38
    :cond_f
    :goto_3
    invoke-virtual {p0}, Lxc0;->r()V

    return-void
.end method

.method public onResume()V
    .locals 9

    const v0, 0x7f1201f1

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

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
    iget-boolean v0, p0, Lxc0;->h:Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->E()Ljava/util/ArrayList;

    move-result-object v0

    .line 6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v4

    invoke-virtual {v4}, Lqa0;->j()Ljava/util/ArrayList;

    move-result-object v4

    if-eqz v0, :cond_0

    if-nez v4, :cond_1

    .line 7
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 8
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v4, Lcom/olive/upi/transport/OliveRequest;

    const/16 v5, 0x15

    invoke-direct {v4, v1, v5, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v2, v4}, Lua0;->h(ZLcom/olive/upi/transport/OliveRequest;)V

    .line 9
    :cond_1
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v4, Lcom/olive/upi/transport/OliveRequest;

    const/16 v5, 0x1b

    invoke-direct {v4, v1, v5, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v4}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 10
    :cond_2
    iget-object v0, p0, Lod0;->B:Lo90;

    invoke-virtual {v0, v3}, Lo90;->B(Ljava/util/ArrayList;)V

    .line 11
    invoke-virtual {p0}, Lod0;->P()V

    .line 12
    invoke-virtual {p0}, Lod0;->O()V

    .line 13
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    sget-object v4, Lqa0$c;->d:Lqa0$c;

    invoke-virtual {v0, v4}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v0

    .line 14
    iget-boolean v5, p0, Lxc0;->h:Z

    const/4 v6, 0x1

    if-nez v5, :cond_4

    if-nez v0, :cond_3

    .line 15
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 16
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v5, 0xf

    invoke-direct {v2, v1, v5, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v6, v2}, Lua0;->b(ZLcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 17
    :cond_3
    iget-object v5, p0, Lod0;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v5, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 18
    invoke-virtual {p0, v0}, Lod0;->x(Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_4
    if-eqz v0, :cond_5

    .line 19
    iget-object v5, p0, Lod0;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v5, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 20
    invoke-virtual {p0, v0}, Lod0;->x(Ljava/util/ArrayList;)V

    .line 21
    :cond_5
    :goto_0
    sget-boolean v0, Lod0;->K:Z

    if-eqz v0, :cond_7

    .line 22
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 23
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v0

    sget v2, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    if-ne v0, v2, :cond_6

    goto :goto_1

    .line 24
    :cond_6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, v3}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 25
    :cond_7
    :goto_1
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x2932

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->j(Ljava/lang/String;)I

    move-result v2

    .line 26
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v5, 0x2933

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ln70;->j(Ljava/lang/String;)I

    move-result v3

    if-nez v2, :cond_8

    .line 27
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v5

    const v7, 0x2934

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ln70;->j(Ljava/lang/String;)I

    move-result v5

    if-eq v3, v5, :cond_b

    :cond_8
    const v5, 0x2935

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    if-le v3, v1, :cond_9

    if-ne v2, v6, :cond_9

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v6

    invoke-virtual {v6, v5}, Ln70;->j(Ljava/lang/String;)I

    move-result v6

    rem-int v6, v3, v6

    if-eqz v6, :cond_b

    :cond_9
    const/4 v6, 0x2

    if-ne v2, v6, :cond_a

    .line 28
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v7

    const v8, 0x2936

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ln70;->j(Ljava/lang/String;)I

    move-result v7

    if-eq v3, v7, :cond_b

    :cond_a
    if-le v3, v1, :cond_c

    if-ne v2, v6, :cond_c

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v5}, Ln70;->j(Ljava/lang/String;)I

    move-result v1

    rem-int/2addr v3, v1

    if-nez v3, :cond_c

    .line 29
    :cond_b
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x2937

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->e(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 30
    invoke-virtual {p0}, Lod0;->T()V

    .line 31
    :cond_c
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1, v4}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_d

    .line 32
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_d

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x2938

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 33
    invoke-virtual {p0}, Lod0;->y()V

    :cond_d
    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0x12

    const/16 v2, 0xf

    const/4 v3, 0x0

    const/4 v4, 0x5

    const/4 v5, 0x0

    if-eq v0, v2, :cond_d

    const/16 v6, 0x15

    const/4 v7, 0x1

    if-eq v0, v6, :cond_c

    const/16 v2, 0x1b

    const/16 v6, 0x56

    const v8, 0x2939

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    if-eq v0, v2, :cond_a

    const/16 v2, 0x2e

    if-eq v0, v2, :cond_9

    const/16 v2, 0x3f

    if-eq v0, v2, :cond_8

    const/16 v2, 0x4b

    if-eq v0, v2, :cond_7

    if-eq v0, v6, :cond_6

    const/16 v2, 0x62

    if-eq v0, v2, :cond_4

    if-eq v0, v1, :cond_3

    const/16 v1, 0x13

    if-eq v0, v1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    .line 3
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_2

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 5
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 7
    :cond_1
    iget-object p1, p0, Lod0;->D:Ln90;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v7, v5}, Ln90;->w(Ljava/lang/String;II)V

    .line 8
    iget-object p1, p0, Lod0;->E:Landroidx/viewpager/widget/ViewPager;

    iget-object p2, p0, Lod0;->D:Ln90;

    invoke-virtual {p1, p2}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lno;)V

    .line 9
    iget-object p1, p0, Lod0;->E:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, v5, v7}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 10
    :cond_2
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_2

    .line 11
    :cond_3
    invoke-static {}, Leg0;->B()V

    .line 12
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v0, 0xc

    invoke-direct {p2, v4, v0, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_2

    .line 13
    :cond_4
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p1

    const v0, 0x293a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 14
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p1

    iput-object p1, p0, Lod0;->G:Lcom/olive/upi/transport/model/TransactionData;

    .line 15
    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v0, 0x1fe

    invoke-direct {p2, v4, v0, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/4 p1, 0x6

    .line 16
    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 17
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    invoke-virtual {p1, p2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 18
    :cond_5
    iget-object p1, p0, Lxc0;->c:Lz;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 19
    :goto_0
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_2

    .line 20
    :cond_6
    invoke-static {}, Leg0;->B()V

    .line 21
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 22
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lqa0;->w0(Ljava/util/ArrayList;)V

    goto/16 :goto_2

    .line 23
    :cond_7
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 24
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iput p1, p0, Lod0;->I:I

    .line 25
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p2

    invoke-virtual {p2, v8}, Ln70;->j(Ljava/lang/String;)I

    move-result p2

    iget v0, p0, Lod0;->I:I

    add-int/2addr p2, v0

    .line 26
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    invoke-virtual {p1, v8, p2}, Ln70;->v(Ljava/lang/String;I)V

    goto/16 :goto_2

    .line 27
    :cond_8
    iget-object p1, p0, Lod0;->B:Lo90;

    invoke-static {}, Loa0;->f()Loa0;

    move-result-object p2

    invoke-virtual {p2}, Loa0;->a()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Lo90;->B(Ljava/util/ArrayList;)V

    goto/16 :goto_2

    .line 28
    :cond_9
    iget-object p1, p0, Lod0;->C:Lwc0;

    if-eqz p1, :cond_11

    .line 29
    invoke-virtual {p1}, Lwc0;->H()V

    goto/16 :goto_2

    .line 30
    :cond_a
    invoke-static {}, Leg0;->B()V

    .line 31
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    iput-object p1, p0, Lod0;->y:Ljava/util/ArrayList;

    if-eqz p1, :cond_b

    .line 32
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_b

    .line 33
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    iget-object p2, p0, Lod0;->y:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-virtual {p1, v8, p2}, Ln70;->v(Ljava/lang/String;I)V

    .line 34
    iget-object p1, p0, Lod0;->y:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 35
    invoke-virtual {p0}, Lod0;->P()V

    goto :goto_1

    .line 36
    :cond_b
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    invoke-virtual {p1, v8, v5}, Ln70;->v(Ljava/lang/String;I)V

    .line 37
    invoke-virtual {p0}, Lod0;->V()V

    .line 38
    :goto_1
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {p2, v4, v6, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_2

    .line 39
    :cond_c
    invoke-static {}, Leg0;->B()V

    .line 40
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {p2, v4, v2, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v7, p2}, Lua0;->b(ZLcom/olive/upi/transport/OliveRequest;)V

    goto :goto_2

    .line 41
    :cond_d
    invoke-static {}, Leg0;->B()V

    .line 42
    iput v5, p0, Lod0;->H:I

    .line 43
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_f

    .line 44
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_e

    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const p2, 0x293b

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln70;->e(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_e

    .line 45
    invoke-virtual {p0}, Lod0;->y()V

    .line 46
    :cond_e
    invoke-virtual {p0}, Lod0;->z()V

    .line 47
    :cond_f
    invoke-virtual {p0}, Lod0;->z()V

    .line 48
    iget-object p1, p0, Lod0;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 49
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p2, Lqa0$c;->d:Lqa0$c;

    invoke-virtual {p1, p2}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lod0;->x(Ljava/util/ArrayList;)V

    .line 50
    sget-boolean p1, Lvg0;->a:Z

    if-eqz p1, :cond_10

    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const p2, 0x293c

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln70;->e(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_10

    .line 51
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lzg0;->b(Landroid/content/Context;)V

    .line 52
    :cond_10
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {p2, v4, v1, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v5, p2}, Lua0;->j(ZLcom/olive/upi/transport/OliveRequest;)V

    :cond_11
    :goto_2
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 4

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lqa0;->U(Ldg0;)V

    const v0, 0x7f1201f1

    const v2, 0x293d

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x293e

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 2
    :sswitch_0
    check-cast p2, Lcom/olive/upi/transport/model/Account;

    .line 3
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getStatus()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    const/4 v1, 0x5

    const/16 v3, 0x207

    invoke-direct {p1, v1, v3, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    .line 5
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    invoke-virtual {v1, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 6
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 7
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljg0;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const v0, 0x293f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const v0, 0x2940

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    goto/16 :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, p2}, Lod0;->U(Lcom/olive/upi/transport/model/Account;)V

    goto/16 :goto_0

    .line 11
    :sswitch_1
    check-cast p2, Lcom/olive/upi/transport/model/Account;

    .line 12
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x76

    invoke-interface {p1, v0, p2}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 13
    :sswitch_2
    check-cast p2, Lcom/olive/upi/transport/model/Banner;

    if-eqz p2, :cond_3

    .line 14
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Banner;->getClickUrl()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 15
    new-instance p1, Lna0;

    invoke-direct {p1}, Lna0;-><init>()V

    .line 16
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Banner;->getClickUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lna0;->e(Ljava/lang/String;)V

    .line 17
    iget-object v1, p0, Lxc0;->b:Lmg0;

    const/16 v3, 0x45

    invoke-interface {v1, v3, p1}, Lmg0;->t(ILjava/lang/Object;)V

    .line 18
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 19
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Banner;->getClickUrl()Ljava/lang/String;

    move-result-object p2

    const v0, 0x2941

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    const v0, 0x2942

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    goto/16 :goto_0

    .line 22
    :sswitch_3
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lod0;->z:I

    goto/16 :goto_0

    .line 23
    :sswitch_4
    check-cast p2, Lcom/olive/upi/transport/model/Account;

    .line 24
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1, v1}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 25
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getStatus()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 26
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p1

    .line 27
    sget v0, Lcom/olive/upi/transport/model/TransactionData;->MODE_SEND:I

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 28
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 29
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object v0, Lqa0$e;->c:Lqa0$e;

    invoke-virtual {p1, v0}, Lqa0;->v0(Lqa0$e;)V

    .line 30
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x54

    invoke-interface {p1, v0, p2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p0, p2}, Lod0;->U(Lcom/olive/upi/transport/model/Account;)V

    return-void

    .line 32
    :sswitch_5
    check-cast p2, Lcom/olive/upi/transport/model/Account;

    .line 33
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1, v1}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 34
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p1

    .line 35
    sget v0, Lcom/olive/upi/transport/model/TransactionData;->MODE_RECEIVE:I

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 36
    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 37
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object v0, Lqa0$e;->c:Lqa0$e;

    invoke-virtual {p1, v0}, Lqa0;->v0(Lqa0$e;)V

    .line 38
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x3e

    invoke-interface {p1, v0, p2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 39
    :sswitch_6
    check-cast p2, Lcom/olive/upi/transport/model/BillerCategory;

    .line 40
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BillerCategory;->getCODE_VAL()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 41
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1, v1}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 42
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x79

    invoke-interface {p1, v0, p2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 43
    :cond_2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1, v1}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 44
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BillerCategory;->getFixedCategory()I

    move-result v0

    invoke-interface {p1, v0, p2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 45
    :sswitch_7
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x3a

    invoke-interface {p1, p2, v1}, Lmg0;->t(ILjava/lang/Object;)V

    :cond_3
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f0a0071 -> :sswitch_7
        0x7f0a00b2 -> :sswitch_6
        0x7f0a00f3 -> :sswitch_5
        0x7f0a00f7 -> :sswitch_4
        0x7f0a021f -> :sswitch_3
        0x7f0a0226 -> :sswitch_2
        0x7f0a0261 -> :sswitch_1
        0x7f0a04d3 -> :sswitch_0
    .end sparse-switch
.end method

.method public final x(Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lod0;->q:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lod0;->E:Landroidx/viewpager/widget/ViewPager;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 3
    iget-object v0, p0, Lod0;->E:Landroidx/viewpager/widget/ViewPager;

    const/16 v3, 0x5a

    const/16 v4, 0x1c

    const/16 v5, 0x78

    invoke-virtual {v0, v3, v4, v5, v4}, Landroid/view/ViewGroup;->setPadding(IIII)V

    .line 4
    iget-object v0, p0, Lod0;->E:Landroidx/viewpager/widget/ViewPager;

    const/16 v3, 0x28

    invoke-virtual {v0, v3}, Landroidx/viewpager/widget/ViewPager;->setPageMargin(I)V

    .line 5
    new-instance v0, Ln90;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v3

    invoke-direct {v0, v3, p1}, Ln90;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lod0;->D:Ln90;

    .line 6
    iget-object v3, p0, Lod0;->E:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v3, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lno;)V

    .line 7
    iget-object v0, p0, Lod0;->D:Ln90;

    invoke-virtual {v0, p0}, Ln90;->u(Lng0;)V

    if-nez p1, :cond_0

    move p1, v2

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    :goto_0
    if-nez p1, :cond_1

    .line 9
    iget-object p1, p0, Lod0;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 10
    iget-object p1, p0, Lod0;->E:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_1

    .line 11
    :cond_1
    iget-object p1, p0, Lod0;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 12
    iget-object p1, p0, Lod0;->E:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 13
    :goto_1
    iget-object p1, p0, Lod0;->F:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method public final y()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lnd0;->l()Lnd0;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-virtual {v1}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->n()Lje;

    move-result-object v1

    const v2, 0x2943

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {v1, v0, v2}, Lje;->f(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Lje;

    .line 5
    invoke-virtual {v1}, Lje;->k()I

    .line 6
    :cond_0
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const/4 v1, 0x1

    const v2, 0x2944

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ln70;->A(Ljava/lang/String;Z)V

    return-void
.end method

.method public final z()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 2
    new-instance v1, Landroid/content/ComponentName;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v2

    const-class v3, Lcom/upi/axispay/activity/IntentRegistrationActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    return-void
.end method
