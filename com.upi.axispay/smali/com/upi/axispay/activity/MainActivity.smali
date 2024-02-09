.class public Lcom/upi/axispay/activity/MainActivity;
.super Lc90;
.source "AxisPay"

# interfaces
.implements Lmg0;
.implements Lcom/google/android/material/navigation/NavigationView$c;
.implements Landroid/view/View$OnClickListener;
.implements Lng0;


# instance fields
.field public D:Landroidx/appcompat/widget/Toolbar;

.field public E:Landroid/widget/ImageView;

.field public F:Landroid/widget/ImageView;

.field public G:Landroid/widget/ImageView;

.field public H:Landroid/widget/TextView;

.field public I:Landroid/widget/TextView;

.field public J:Landroid/widget/ImageView;

.field public K:Landroid/widget/LinearLayout;

.field public L:Landroid/widget/LinearLayout;

.field public M:Landroid/widget/TextView;

.field public N:Landroid/content/Context;

.field public O:Landroid/widget/RelativeLayout;

.field public P:Lcom/google/android/material/navigation/NavigationView;

.field public Q:Landroidx/drawerlayout/widget/DrawerLayout;

.field public R:Lw;

.field public S:Landroidx/recyclerview/widget/RecyclerView;

.field public T:I

.field public U:Landroid/widget/Spinner;

.field public V:I

.field public W:Landroid/widget/LinearLayout;

.field public X:Landroid/widget/LinearLayout;

.field public Y:Ll90;

.field public final Z:[Ljava/lang/String;

.field public a0:Landroid/widget/TextView;

.field public b0:Landroid/widget/TextView;

.field public c0:Lkg0;

.field public d0:Z

.field public e0:Landroidx/fragment/app/Fragment;

.field public f0:Landroidx/fragment/app/Fragment;

.field public g0:Z

.field public h0:Ljava/lang/String;

.field public i0:Landroid/net/wifi/WifiManager;

.field public j0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public k0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/net/wifi/ScanResult;",
            ">;"
        }
    .end annotation
.end field

.field public final l0:Landroid/content/BroadcastReceiver;

.field public final m0:Landroid/os/Handler;

.field public final n0:Ljava/lang/Runnable;

.field public o0:Lcom/pkmmte/view/CircularImageView;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lc90;-><init>()V

    const v0, 0x34eb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x34ec

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x34ed

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 2
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->Z:[Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->e0:Landroidx/fragment/app/Fragment;

    .line 4
    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->f0:Landroidx/fragment/app/Fragment;

    const/4 v1, 0x1

    .line 5
    iput-boolean v1, p0, Lcom/upi/axispay/activity/MainActivity;->g0:Z

    .line 6
    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->h0:Ljava/lang/String;

    .line 7
    new-instance v0, Lcom/upi/axispay/activity/MainActivity$a;

    invoke-direct {v0, p0}, Lcom/upi/axispay/activity/MainActivity$a;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->l0:Landroid/content/BroadcastReceiver;

    .line 8
    new-instance v0, Lcom/upi/axispay/activity/MainActivity$k;

    invoke-direct {v0, p0}, Lcom/upi/axispay/activity/MainActivity$k;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->m0:Landroid/os/Handler;

    .line 9
    new-instance v0, Lcom/upi/axispay/activity/MainActivity$l;

    invoke-direct {v0, p0}, Lcom/upi/axispay/activity/MainActivity$l;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->n0:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic d0(Lcom/upi/axispay/activity/MainActivity;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->t0()Z

    move-result p0

    return p0
.end method

.method public static synthetic e0(Lcom/upi/axispay/activity/MainActivity;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/upi/axispay/activity/MainActivity;->k0:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic f0(Lcom/upi/axispay/activity/MainActivity;)Landroid/net/wifi/WifiManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/upi/axispay/activity/MainActivity;->i0:Landroid/net/wifi/WifiManager;

    return-object p0
.end method

.method public static synthetic g0(Lcom/upi/axispay/activity/MainActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->N0()V

    return-void
.end method

.method public static synthetic h0(Lcom/upi/axispay/activity/MainActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->k0()V

    return-void
.end method

.method private synthetic w0(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/upi/axispay/activity/MainActivity;->g0:Z

    .line 2
    invoke-static {}, Leg0;->b()V

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->c()V

    const/4 p1, 0x0

    .line 4
    invoke-static {p1}, Lqa0;->d0(Lqa0;)V

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private synthetic y0(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, Lcom/upi/axispay/activity/MainActivity;->g0:Z

    .line 2
    invoke-static {}, Leg0;->b()V

    return-void
.end method


# virtual methods
.method public final A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lcom/upi/axispay/activity/MainActivity;->B0(Ljava/lang/String;Landroidx/fragment/app/Fragment;Z)V

    return-void
.end method

.method public final B0(Ljava/lang/String;Landroidx/fragment/app/Fragment;Z)V
    .locals 2

    .line 1
    iput-object p2, p0, Lcom/upi/axispay/activity/MainActivity;->f0:Landroidx/fragment/app/Fragment;

    .line 2
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    .line 3
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->e0:Landroidx/fragment/app/Fragment;

    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->f0:Landroidx/fragment/app/Fragment;

    invoke-virtual {p0, v0, v1}, Lc90;->a0(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)V

    .line 4
    invoke-virtual {p2}, Landroidx/fragment/app/FragmentManager;->n()Lje;

    move-result-object p2

    if-eqz p3, :cond_0

    .line 5
    invoke-virtual {p2, p1}, Lje;->h(Ljava/lang/String;)Lje;

    :cond_0
    const p3, 0x7f0a01f5

    .line 6
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->f0:Landroidx/fragment/app/Fragment;

    invoke-virtual {p2, p3, v0, p1}, Lje;->s(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Lje;

    invoke-virtual {p2}, Lje;->k()I

    .line 7
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->f0:Landroidx/fragment/app/Fragment;

    iput-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->e0:Landroidx/fragment/app/Fragment;

    return-void
.end method

.method public C0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->m0:Landroid/os/Handler;

    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->n0:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->m0:Landroid/os/Handler;

    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->n0:Ljava/lang/Runnable;

    const-wide/32 v2, 0x1d4c0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lc90;->z:J

    return-void
.end method

.method public D0(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lxg0;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Context;

    .line 2
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x34ee

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final E0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->i0:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->startScan()Z

    .line 2
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->r0()V

    return-void
.end method

.method public F0()Z
    .locals 4

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v2

    sget v3, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    if-ne v2, v3, :cond_0

    .line 3
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 4
    invoke-static {v0}, Ljg0;->r(Lcom/olive/upi/transport/model/TransactionData;)Ljava/lang/String;

    move-result-object v0

    const v3, 0x34ef

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v0, -0x1

    .line 5
    invoke-virtual {p0, v0, v2}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 6
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v2, 0x34f0

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ln70;->v(Ljava/lang/String;I)V

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public final G0()V
    .locals 3

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v0

    .line 2
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 3
    invoke-static {v0}, Ljg0;->r(Lcom/olive/upi/transport/model/TransactionData;)Ljava/lang/String;

    move-result-object v0

    const v2, 0x34f1

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v0, -0x1

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 5
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x34f2

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ln70;->v(Ljava/lang/String;I)V

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final H0()V
    .locals 20

    move-object/from16 v6, p0

    const v0, 0x7f0a050b

    .line 1
    invoke-virtual {v6, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v6, Lcom/upi/axispay/activity/MainActivity;->E:Landroid/widget/ImageView;

    .line 2
    iget-object v0, v6, Lcom/upi/axispay/activity/MainActivity;->D:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v6, v0}, Lz;->U(Landroidx/appcompat/widget/Toolbar;)V

    .line 3
    invoke-virtual/range {p0 .. p0}, Lz;->M()Lv;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual/range {p0 .. p0}, Lz;->M()Lv;

    move-result-object v0

    invoke-virtual {v0, v1}, Lv;->t(Z)V

    :cond_0
    const v0, 0x7f0a033a

    .line 5
    invoke-virtual {v6, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/navigation/NavigationView;

    iput-object v0, v6, Lcom/upi/axispay/activity/MainActivity;->P:Lcom/google/android/material/navigation/NavigationView;

    const v0, 0x7f0a02d3

    .line 6
    invoke-virtual {v6, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, v6, Lcom/upi/axispay/activity/MainActivity;->S:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 8
    iget-object v2, v6, Lcom/upi/axispay/activity/MainActivity;->S:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 9
    iget-object v2, v6, Lcom/upi/axispay/activity/MainActivity;->S:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 10
    iget-object v0, v6, Lcom/upi/axispay/activity/MainActivity;->S:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Lxi;

    invoke-direct {v2}, Lxi;-><init>()V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    new-instance v2, Lpg0;

    const/16 v8, 0x15

    const v3, 0x7f1202d0

    invoke-virtual {v6, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x7f080225

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Lpg0;-><init>(ILjava/lang/String;IZZ)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    new-instance v2, Lpg0;

    const/16 v14, 0x2c

    const v3, 0x7f120277

    invoke-virtual {v6, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v15

    const v16, 0x7f080228

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v13, v2

    invoke-direct/range {v13 .. v18}, Lpg0;-><init>(ILjava/lang/String;IZZ)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    new-instance v2, Lpg0;

    const/16 v8, 0x66

    const v3, 0x7f12027a

    invoke-virtual {v6, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x7f08026d

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Lpg0;-><init>(ILjava/lang/String;IZZ)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    new-instance v2, Lpg0;

    const/16 v14, 0x11

    const v3, 0x7f1202d4

    invoke-virtual {v6, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v15

    const v16, 0x7f080060

    move-object v13, v2

    invoke-direct/range {v13 .. v18}, Lpg0;-><init>(ILjava/lang/String;IZZ)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    new-instance v2, Lpg0;

    const/16 v8, 0x21

    const v3, 0x7f1202dd

    invoke-virtual {v6, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x7f080227

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Lpg0;-><init>(ILjava/lang/String;IZZ)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    new-instance v2, Lpg0;

    const/16 v14, 0x41

    const v3, 0x7f120373

    invoke-virtual {v6, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v15

    const v16, 0x7f0800f0

    move-object v13, v2

    invoke-direct/range {v13 .. v18}, Lpg0;-><init>(ILjava/lang/String;IZZ)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    new-instance v2, Lpg0;

    const/16 v3, 0x2a

    const v4, 0x7f12026f

    invoke-virtual {v6, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f08009b

    invoke-direct {v2, v3, v4, v5, v1}, Lpg0;-><init>(ILjava/lang/String;IZ)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    new-instance v2, Lpg0;

    const/16 v8, 0x7d

    const v3, 0x7f120204

    invoke-virtual {v6, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x7f0800be

    const/4 v12, 0x1

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Lpg0;-><init>(ILjava/lang/String;IZZ)V

    .line 20
    new-instance v3, Lpg0;

    const/16 v4, 0x7f

    const v5, 0x7f12026c

    invoke-virtual {v6, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lpg0;-><init>(ILjava/lang/String;)V

    .line 21
    new-instance v4, Lpg0;

    const/16 v5, 0x7e

    const v7, 0x7f12027b

    invoke-virtual {v6, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v5, v7}, Lpg0;-><init>(ILjava/lang/String;)V

    .line 22
    invoke-virtual {v2, v3}, Lpg0;->a(Lpg0;)V

    .line 23
    invoke-virtual {v2, v4}, Lpg0;->a(Lpg0;)V

    .line 24
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    new-instance v2, Lpg0;

    const/16 v9, 0x7b

    const v3, 0x7f1203a2

    invoke-virtual {v6, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v10

    const v11, 0x7f080251

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v8, v2

    invoke-direct/range {v8 .. v13}, Lpg0;-><init>(ILjava/lang/String;IZZ)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    new-instance v2, Lpg0;

    const/16 v15, 0x45

    const v3, 0x7f12026d

    invoke-virtual {v6, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v16

    const v17, 0x7f080242

    const/16 v19, 0x0

    move-object v14, v2

    invoke-direct/range {v14 .. v19}, Lpg0;-><init>(ILjava/lang/String;IZZ)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    new-instance v2, Lpg0;

    const/16 v8, 0x82

    const v3, 0x7f120273

    invoke-virtual {v6, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x7f0801cb

    const/4 v11, 0x0

    const/4 v12, 0x1

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Lpg0;-><init>(ILjava/lang/String;IZZ)V

    .line 28
    new-instance v3, Lpg0;

    const/16 v4, 0x86

    const v5, 0x7f120350

    invoke-virtual {v6, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lpg0;-><init>(ILjava/lang/String;)V

    .line 29
    invoke-virtual {v2, v3}, Lpg0;->a(Lpg0;)V

    .line 30
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    new-instance v2, Lpg0;

    const/16 v8, 0x6a

    const v3, 0x7f12024c

    invoke-virtual {v6, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x7f0801cc

    const/4 v11, 0x1

    const/4 v12, 0x0

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Lpg0;-><init>(ILjava/lang/String;IZZ)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    new-instance v2, Lpg0;

    const/16 v3, 0x69

    const v4, 0x7f120477

    invoke-virtual {v6, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f08022f

    invoke-direct {v2, v3, v4, v5, v1}, Lpg0;-><init>(ILjava/lang/String;IZ)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    new-instance v2, Lpg0;

    const/16 v8, 0x9b

    const v3, 0x7f120279

    invoke-virtual {v6, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x7f08022f

    const/4 v11, 0x0

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Lpg0;-><init>(ILjava/lang/String;IZZ)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    new-instance v2, Lpg0;

    const/16 v14, 0x1e

    const v3, 0x7f120148

    invoke-virtual {v6, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v15

    const v16, 0x7f0800cb

    const/16 v17, 0x0

    move-object v13, v2

    invoke-direct/range {v13 .. v18}, Lpg0;-><init>(ILjava/lang/String;IZZ)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    new-instance v2, Lpg0;

    const/16 v3, 0x9a

    const v4, 0x7f1200db

    invoke-virtual {v6, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f080251

    invoke-direct {v2, v3, v4, v5, v1}, Lpg0;-><init>(ILjava/lang/String;IZ)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    new-instance v1, Ll90;

    invoke-direct {v1, v6, v0}, Ll90;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    iput-object v1, v6, Lcom/upi/axispay/activity/MainActivity;->Y:Ll90;

    .line 37
    invoke-virtual {v1, v6}, Ll90;->A(Lng0;)V

    .line 38
    iget-object v0, v6, Lcom/upi/axispay/activity/MainActivity;->S:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v6, Lcom/upi/axispay/activity/MainActivity;->Y:Ll90;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 39
    iget-object v0, v6, Lcom/upi/axispay/activity/MainActivity;->Y:Ll90;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    .line 40
    iget-object v0, v6, Lcom/upi/axispay/activity/MainActivity;->P:Lcom/google/android/material/navigation/NavigationView;

    invoke-virtual {v0, v6}, Lcom/google/android/material/navigation/NavigationView;->setNavigationItemSelectedListener(Lcom/google/android/material/navigation/NavigationView$c;)V

    .line 41
    iget-object v0, v6, Lcom/upi/axispay/activity/MainActivity;->P:Lcom/google/android/material/navigation/NavigationView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/material/navigation/NavigationView;->setItemIconTintList(Landroid/content/res/ColorStateList;)V

    const v0, 0x7f0a018a

    .line 42
    invoke-virtual {v6, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/drawerlayout/widget/DrawerLayout;

    iput-object v2, v6, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 43
    iget-object v3, v6, Lcom/upi/axispay/activity/MainActivity;->D:Landroidx/appcompat/widget/Toolbar;

    if-eqz v3, :cond_2

    .line 44
    new-instance v7, Lw;

    const v4, 0x7f1202e5

    const v5, 0x7f1202e4

    move-object v0, v7

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lw;-><init>(Landroid/app/Activity;Landroidx/drawerlayout/widget/DrawerLayout;Landroidx/appcompat/widget/Toolbar;II)V

    iput-object v7, v6, Lcom/upi/axispay/activity/MainActivity;->R:Lw;

    .line 45
    invoke-virtual {v7}, Lw;->j()V

    .line 46
    iget-object v0, v6, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    iget-object v1, v6, Lcom/upi/axispay/activity/MainActivity;->R:Lw;

    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->a(Landroidx/drawerlayout/widget/DrawerLayout$d;)V

    .line 47
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x34f3

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->e(Ljava/lang/String;)Z

    move-result v0

    .line 48
    iget-object v1, v6, Lcom/upi/axispay/activity/MainActivity;->D:Landroidx/appcompat/widget/Toolbar;

    if-eqz v0, :cond_1

    const v0, 0x7f080291

    goto :goto_0

    :cond_1
    const v0, 0x7f080292

    :goto_0
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(I)V

    .line 49
    invoke-virtual/range {p0 .. p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    new-instance v1, Lcom/upi/axispay/activity/MainActivity$b;

    invoke-direct {v1, v6}, Lcom/upi/axispay/activity/MainActivity$b;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->i(Landroidx/fragment/app/FragmentManager$n;)V

    :cond_2
    return-void
.end method

.method public final I0()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v2, 0x0

    .line 5
    invoke-virtual {v0, v2}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 6
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->N:Landroid/content/Context;

    invoke-static {v0, v1}, Lyg0;->c(Landroid/content/Context;Landroid/graphics/Bitmap;)Ljava/lang/String;

    return-void
.end method

.method public J0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->I0()V

    return-void
.end method

.method public K0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const v0, 0x7f120233

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/upi/axispay/activity/MainActivity$i;

    invoke-direct {v5, p0}, Lcom/upi/axispay/activity/MainActivity$i;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    new-instance v6, Lcom/upi/axispay/activity/MainActivity$j;

    invoke-direct {v6, p0}, Lcom/upi/axispay/activity/MainActivity$j;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Leg0;->p(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public L0()V
    .locals 8

    .line 1
    new-instance v0, Lch0;

    invoke-direct {v0, p0}, Lch0;-><init>(Landroid/content/Context;)V

    const v1, 0x34f4

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-static {p0, v1}, Lc70;->g(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x34f5

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lch0;->h(Ljava/lang/String;Ljava/lang/String;Z)Z

    const v0, 0x7f120102

    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v0, 0x7f120238

    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v0, 0x7f12031e

    .line 5
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/upi/axispay/activity/MainActivity$g;

    invoke-direct {v5, p0}, Lcom/upi/axispay/activity/MainActivity$g;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    const v0, 0x7f1200bf

    .line 6
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/upi/axispay/activity/MainActivity$h;

    invoke-direct {v7, p0}, Lcom/upi/axispay/activity/MainActivity$h;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    move-object v1, p0

    .line 7
    invoke-static/range {v1 .. v7}, Leg0;->r(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public M0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->D:Landroidx/appcompat/widget/Toolbar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public final N0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->o0()I

    move-result v0

    const/4 v1, 0x1

    if-lez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lz;->M()Lv;

    move-result-object v0

    invoke-virtual {v0, v1}, Lv;->s(Z)V

    .line 3
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->D:Landroidx/appcompat/widget/Toolbar;

    new-instance v1, Lcom/upi/axispay/activity/MainActivity$c;

    invoke-direct {v1, p0}, Lcom/upi/axispay/activity/MainActivity$c;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 4
    :cond_0
    iget v0, p0, Lcom/upi/axispay/activity/MainActivity;->T:I

    const/16 v2, 0x38

    if-ne v0, v2, :cond_1

    .line 5
    invoke-virtual {p0}, Lz;->M()Lv;

    move-result-object v0

    invoke-virtual {v0, v1}, Lv;->s(Z)V

    goto :goto_1

    :cond_1
    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/16 v1, 0x43

    if-eq v0, v1, :cond_3

    const/16 v1, 0x44

    if-eq v0, v1, :cond_3

    .line 6
    invoke-virtual {p0}, Lz;->M()Lv;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lv;->s(Z)V

    .line 7
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->R:Lw;

    invoke-virtual {v0, v1}, Lw;->h(Z)V

    .line 8
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x34f6

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->e(Ljava/lang/String;)Z

    move-result v0

    .line 9
    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->D:Landroidx/appcompat/widget/Toolbar;

    if-eqz v0, :cond_2

    const v0, 0x7f080291

    goto :goto_0

    :cond_2
    const v0, 0x7f080292

    :goto_0
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(I)V

    .line 10
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->R:Lw;

    invoke-virtual {v0}, Lw;->j()V

    .line 11
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->D:Landroidx/appcompat/widget/Toolbar;

    new-instance v1, Lcom/upi/axispay/activity/MainActivity$d;

    invoke-direct {v1, p0}, Lcom/upi/axispay/activity/MainActivity$d;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public O0(Z)V
    .locals 3

    .line 1
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const v0, 0x34f7    # 1.9E-41f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ln70;->j(Ljava/lang/String;)I

    move-result p1

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->I:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x34f8

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public final P0()V
    .locals 14

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroidx/fragment/app/FragmentManager;->b1(Ljava/lang/String;I)V

    .line 3
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->q0()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const v5, 0x34f9

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x4

    if-nez v4, :cond_1

    .line 5
    new-instance v0, Lig0;

    invoke-direct {v0}, Lig0;-><init>()V

    sget v4, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    invoke-virtual {v0, v1, v4}, Lig0;->d(Ljava/lang/String;I)Lqg0;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Lqg0;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v5, v1}, Ln70;->v(Ljava/lang/String;I)V

    .line 8
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Landroidx/fragment/app/FragmentManager;->b1(Ljava/lang/String;I)V

    const/16 v0, 0x38

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v6, v0}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    const v1, 0x34fa

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v4, 0x34fb

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    const/4 v8, 0x5

    if-eqz v0, :cond_f

    const v9, 0x34fc

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    .line 10
    invoke-virtual {v0, v9}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v9

    const/16 v10, 0x36

    const/4 v11, 0x6

    if-ne v9, v10, :cond_2

    .line 11
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v8, v0}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    .line 12
    invoke-virtual {p0, v11, v2}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    return-void

    :cond_2
    const/16 v10, 0x84

    if-eq v9, v10, :cond_e

    const/16 v10, 0x83

    if-ne v9, v10, :cond_3

    goto/16 :goto_3

    :cond_3
    const/16 v10, 0x3a

    if-ne v9, v10, :cond_4

    .line 13
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v8, v0}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    .line 14
    invoke-virtual {p0, v10, v2}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    return-void

    :cond_4
    const/16 v10, 0x47

    const v12, 0x34fd

    invoke-static {v12}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v12

    const/16 v13, 0x1f

    if-ne v9, v10, :cond_6

    .line 15
    invoke-static {p0}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getToken()Ljava/lang/String;

    move-result-object v0

    .line 16
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v12}, Ln70;->e(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 17
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Landroidx/fragment/app/FragmentManager;->b1(Ljava/lang/String;I)V

    .line 18
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v8, v0}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    .line 19
    new-instance v0, Lcom/olive/upi/transport/model/TransactionData;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/TransactionData;-><init>()V

    .line 20
    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/TransactionData;->isThroughNotificationCrossSell(Z)V

    .line 21
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 22
    invoke-virtual {p0, v13, v2}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 23
    :cond_5
    new-instance v0, Lcom/olive/upi/transport/model/TransactionData;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/TransactionData;-><init>()V

    .line 24
    invoke-virtual {v0, v3}, Lcom/olive/upi/transport/model/TransactionData;->isThroughNotificationCrossSell(Z)V

    .line 25
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 26
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v6, v0}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    .line 27
    :goto_0
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, v2}, Lqa0;->Y(Lcom/olive/upi/transport/model/GCMMessage;)V

    return-void

    :cond_6
    if-ne v9, v13, :cond_a

    const v1, 0x34fe

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa0;->p(Ljava/lang/String;)Lcom/olive/upi/transport/model/GCMMessage;

    .line 30
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->r()Lcom/olive/upi/transport/model/GCMMessage;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 31
    new-instance v1, Lcom/olive/upi/transport/model/TransactionData;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/TransactionData;-><init>()V

    .line 32
    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/TransactionData;->setIsThroughNotification(Z)V

    .line 33
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/GCMMessage;->getRemarks()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    .line 34
    new-instance v4, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 35
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/GCMMessage;->getBenevpa()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 36
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/GCMMessage;->getBene_name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    .line 37
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/GCMMessage;->getBene_name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/olive/upi/transport/model/BeneVpa;->setNickname(Ljava/lang/String;)V

    .line 38
    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 39
    sget v4, Lcom/olive/upi/transport/model/TransactionData;->MODE_COLLECT_NOTIFICATION:I

    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 40
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/GCMMessage;->getAmount()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 41
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/GCMMessage;->getRemittervpa()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/TransactionData;->setRemitterVpa(Ljava/lang/String;)V

    .line 42
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/GCMMessage;->getTxnid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 43
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/GCMMessage;->getExpiry()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/TransactionData;->setExpiry(Ljava/lang/String;)V

    .line 44
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/GCMMessage;->getRefid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 45
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 46
    invoke-static {p0}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getToken()Ljava/lang/String;

    move-result-object v0

    .line 47
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v12}, Ln70;->e(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 48
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Landroidx/fragment/app/FragmentManager;->b1(Ljava/lang/String;I)V

    .line 49
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v8, v0}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    .line 50
    invoke-virtual {p0, v13, v2}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto :goto_1

    .line 51
    :cond_7
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v6, v0}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto :goto_1

    .line 52
    :cond_8
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v12}, Ln70;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 53
    invoke-virtual {p0, v6, v2}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto :goto_1

    .line 54
    :cond_9
    invoke-virtual {p0, v8, v2}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    .line 55
    :goto_1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, v2}, Lqa0;->Y(Lcom/olive/upi/transport/model/GCMMessage;)V

    return-void

    :cond_a
    const/16 v10, 0x9

    if-ne v9, v10, :cond_b

    return-void

    :cond_b
    const/16 v10, 0x24

    if-ne v9, v10, :cond_d

    .line 56
    new-instance v1, Lcom/olive/upi/transport/model/TransactionData;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/TransactionData;-><init>()V

    .line 57
    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/TransactionData;->setIsThroughNotification(Z)V

    .line 58
    sget v4, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 59
    new-instance v4, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    const v5, 0x34ff

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 60
    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    const v7, 0x3500

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 61
    invoke-virtual {v0, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    .line 62
    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    const v4, 0x3501

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 63
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    const v4, 0x3502

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 64
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljg0;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 65
    invoke-static {v4}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 66
    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/TransactionData;->setRemitterVpa(Ljava/lang/String;)V

    const v4, 0x3503

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 67
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    const v4, 0x3504

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 68
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 69
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/olive/upi/transport/model/TransactionData;->setOrderId(Ljava/lang/String;)V

    const v4, 0x3505

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 70
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setMcc(Ljava/lang/String;)V

    .line 71
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 72
    invoke-static {p0}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getToken()Ljava/lang/String;

    move-result-object v0

    .line 73
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v12}, Ln70;->e(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 74
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Landroidx/fragment/app/FragmentManager;->b1(Ljava/lang/String;I)V

    .line 75
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v8, v0}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    .line 76
    sget v0, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v11, v0}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto :goto_2

    .line 77
    :cond_c
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v6, v0}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    :goto_2
    return-void

    .line 78
    :cond_d
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v3

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v4, v1}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 80
    :cond_e
    :goto_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v8, v0}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    .line 81
    invoke-virtual {p0, v9, v2}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    return-void

    .line 82
    :cond_f
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v3

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-virtual {v0, v4, v1}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    :goto_4
    invoke-virtual {p0, v8, v2}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    .line 85
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public Q0(Ltg0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->M:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->M:Landroid/widget/TextView;

    invoke-virtual {p1}, Ltg0;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    invoke-virtual {p1}, Ltg0;->e()Z

    move-result v0

    const/16 v2, 0x8

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->K:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->K:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :goto_0
    invoke-virtual {p1}, Ltg0;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->J:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->J:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 9
    :goto_1
    invoke-virtual {p1}, Ltg0;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 10
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->O:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 11
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->F:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->I:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 13
    :cond_2
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->O:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 14
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->F:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 15
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->I:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 16
    :goto_2
    invoke-virtual {p1}, Ltg0;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 17
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->M:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 18
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->E:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    .line 19
    :cond_3
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->E:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 20
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->M:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 21
    :goto_3
    invoke-virtual {p1}, Ltg0;->c()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 22
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->M:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 23
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->E:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 24
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->H:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 25
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->G:Landroid/widget/ImageView;

    const v0, 0x7f08007a

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_4

    .line 26
    :cond_4
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->E:Landroid/widget/ImageView;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 27
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->M:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 28
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->H:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 29
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->G:Landroid/widget/ImageView;

    const v0, 0x7f0802a0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_4
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

.method public f(Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public i0(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/upi/axispay/activity/MainActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final j0(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const v0, 0x3506

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x3507

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x3508

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x3509

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x350a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x350b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final k0()V
    .locals 3

    const v0, 0x350c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/KeyguardManager;

    const v1, 0x7f12008a

    .line 2
    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f1204be

    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/app/KeyguardManager;->createConfirmDeviceCredentialIntent(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v1, 0x66

    .line 3
    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method

.method public l0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x350d

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lt8;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x350e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {p0, v0}, Lt8;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3f9

    invoke-static {p0, v0, v1}, Ld8;->o(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->E0()V

    :goto_0
    return-void
.end method

.method public m(ILjava/lang/String;)V
    .locals 12

    .line 1
    iput p1, p0, Lcom/upi/axispay/activity/MainActivity;->T:I

    sparse-switch p1, :sswitch_data_0

    .line 2
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->M0()V

    .line 3
    new-instance p1, Ltg0;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-virtual {p0, p1}, Lcom/upi/axispay/activity/MainActivity;->Q0(Ltg0;)V

    goto/16 :goto_0

    .line 4
    :sswitch_0
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->M0()V

    .line 5
    new-instance p1, Ltg0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-virtual {p0, p1}, Lcom/upi/axispay/activity/MainActivity;->Q0(Ltg0;)V

    goto :goto_0

    .line 6
    :sswitch_1
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->M0()V

    .line 7
    new-instance p1, Ltg0;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v6 .. v11}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-virtual {p0, p1}, Lcom/upi/axispay/activity/MainActivity;->Q0(Ltg0;)V

    goto :goto_0

    .line 8
    :sswitch_2
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->M0()V

    .line 9
    new-instance p1, Ltg0;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-virtual {p0, p1}, Lcom/upi/axispay/activity/MainActivity;->Q0(Ltg0;)V

    goto :goto_0

    .line 10
    :sswitch_3
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->M0()V

    .line 11
    new-instance p1, Ltg0;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v6 .. v11}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-virtual {p0, p1}, Lcom/upi/axispay/activity/MainActivity;->Q0(Ltg0;)V

    goto :goto_0

    .line 12
    :sswitch_4
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->u0()V

    goto :goto_0

    .line 13
    :sswitch_5
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->M0()V

    .line 14
    new-instance p1, Ltg0;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-virtual {p0, p1}, Lcom/upi/axispay/activity/MainActivity;->Q0(Ltg0;)V

    goto :goto_0

    .line 15
    :sswitch_6
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->M0()V

    .line 16
    new-instance p1, Ltg0;

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object v6, p1

    invoke-direct/range {v6 .. v11}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-virtual {p0, p1}, Lcom/upi/axispay/activity/MainActivity;->Q0(Ltg0;)V

    :goto_0
    :sswitch_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_7
        0x4 -> :sswitch_7
        0x5 -> :sswitch_6
        0x6 -> :sswitch_5
        0x9 -> :sswitch_5
        0xb -> :sswitch_5
        0xc -> :sswitch_5
        0xd -> :sswitch_4
        0x11 -> :sswitch_5
        0x14 -> :sswitch_3
        0x15 -> :sswitch_5
        0x16 -> :sswitch_4
        0x18 -> :sswitch_3
        0x1d -> :sswitch_2
        0x1e -> :sswitch_7
        0x1f -> :sswitch_5
        0x21 -> :sswitch_5
        0x24 -> :sswitch_5
        0x25 -> :sswitch_4
        0x28 -> :sswitch_5
        0x2b -> :sswitch_5
        0x2c -> :sswitch_2
        0x2e -> :sswitch_7
        0x30 -> :sswitch_5
        0x31 -> :sswitch_5
        0x32 -> :sswitch_5
        0x36 -> :sswitch_5
        0x37 -> :sswitch_5
        0x38 -> :sswitch_7
        0x3a -> :sswitch_5
        0x3c -> :sswitch_5
        0x3d -> :sswitch_5
        0x3e -> :sswitch_5
        0x3f -> :sswitch_5
        0x40 -> :sswitch_5
        0x41 -> :sswitch_5
        0x42 -> :sswitch_5
        0x43 -> :sswitch_7
        0x44 -> :sswitch_7
        0x45 -> :sswitch_5
        0x46 -> :sswitch_5
        0x47 -> :sswitch_2
        0x50 -> :sswitch_5
        0x51 -> :sswitch_5
        0x52 -> :sswitch_5
        0x53 -> :sswitch_5
        0x54 -> :sswitch_5
        0x55 -> :sswitch_5
        0x5c -> :sswitch_5
        0x5d -> :sswitch_5
        0x64 -> :sswitch_5
        0x65 -> :sswitch_5
        0x66 -> :sswitch_5
        0x67 -> :sswitch_5
        0x68 -> :sswitch_5
        0x6a -> :sswitch_5
        0x6b -> :sswitch_5
        0x6c -> :sswitch_5
        0x6d -> :sswitch_5
        0x6e -> :sswitch_1
        0x6f -> :sswitch_5
        0x71 -> :sswitch_5
        0x72 -> :sswitch_5
        0x73 -> :sswitch_5
        0x74 -> :sswitch_5
        0x75 -> :sswitch_5
        0x76 -> :sswitch_5
        0x77 -> :sswitch_5
        0x7b -> :sswitch_5
        0x9a -> :sswitch_5
        0x9b -> :sswitch_0
    .end sparse-switch
.end method

.method public m0(Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->v0()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/fragment/app/FragmentManager;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getTag()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/FragmentManager;->b1(Ljava/lang/String;I)V

    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto :goto_1

    .line 5
    :cond_0
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->o0()I

    move-result v1

    sub-int/2addr v1, v2

    :goto_0
    if-lez v1, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->n0(I)Landroidx/fragment/app/FragmentManager$k;

    move-result-object v2

    invoke-interface {v2}, Landroidx/fragment/app/FragmentManager$k;->a()Ljava/lang/String;

    move-result-object v2

    .line 8
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    .line 9
    :cond_1
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->Z0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :catch_0
    :cond_2
    :goto_1
    return-void
.end method

.method public n0()V
    .locals 7

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->c()V

    .line 2
    invoke-static {}, Leg0;->B()V

    const v0, 0x7f12005c

    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v0, 0x7f12046a

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v0, 0x7f12031e

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/upi/axispay/activity/MainActivity$m;

    invoke-direct {v5, p0}, Lcom/upi/axispay/activity/MainActivity$m;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    new-instance v6, Lcom/upi/axispay/activity/MainActivity$n;

    invoke-direct {v6, p0}, Lcom/upi/axispay/activity/MainActivity$n;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Leg0;->p(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public o(ILjava/lang/Object;)V
    .locals 9

    const/16 v0, 0x5a

    if-eq p1, v0, :cond_7

    const/16 v0, 0x97

    if-eq p1, v0, :cond_6

    const/16 v0, 0xdd

    const/4 v1, 0x1

    if-eq p1, v0, :cond_4

    const/16 v0, 0x12d

    if-eq p1, v0, :cond_3

    const/16 v0, 0x12f

    if-eq p1, v0, :cond_2

    const/16 v0, 0x132

    if-eq p1, v0, :cond_1

    const/16 v0, 0x133

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1
    :pswitch_0
    check-cast p2, Ljava/lang/String;

    .line 2
    invoke-virtual {p0, p2}, Lcom/upi/axispay/activity/MainActivity;->m0(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 3
    :pswitch_1
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->s0()V

    goto/16 :goto_0

    .line 4
    :pswitch_2
    invoke-virtual {p0, v1}, Lcom/upi/axispay/activity/MainActivity;->O0(Z)V

    goto/16 :goto_0

    .line 5
    :cond_0
    new-instance p1, Lpg0;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {p1, p2}, Lpg0;-><init>(I)V

    const/16 p2, 0xca

    .line 6
    invoke-virtual {p0, p2, p1}, Lcom/upi/axispay/activity/MainActivity;->s(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 7
    :cond_1
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/upi/axispay/activity/MainActivity;->T:I

    goto/16 :goto_0

    .line 8
    :cond_2
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->M:Landroid/widget/TextView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->E:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 10
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->J:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 11
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->F:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->I:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_0

    .line 13
    :cond_3
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 14
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    const/4 v0, 0x5

    const/16 v1, -0x1e

    .line 15
    invoke-virtual {p2, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 16
    invoke-virtual {p2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p2

    const v0, 0x350f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const v1, 0x3510

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x3511

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    .line 17
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-static {p1, v0}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 18
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-virtual/range {v3 .. v8}, Lua0;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    goto :goto_0

    .line 19
    :cond_4
    check-cast p2, Lcom/pkmmte/view/CircularImageView;

    iput-object p2, p0, Lcom/upi/axispay/activity/MainActivity;->o0:Lcom/pkmmte/view/CircularImageView;

    .line 20
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->c0:Lkg0;

    if-nez p1, :cond_5

    .line 21
    new-instance p1, Lkg0;

    invoke-direct {p1}, Lkg0;-><init>()V

    iput-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->c0:Lkg0;

    .line 22
    :cond_5
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->c0:Lkg0;

    invoke-virtual {p1}, Lkg0;->e()V

    .line 23
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->c0:Lkg0;

    iget-object p2, p0, Lcom/upi/axispay/activity/MainActivity;->o0:Lcom/pkmmte/view/CircularImageView;

    invoke-virtual {p1, p0, p2}, Lkg0;->h(Landroid/app/Activity;Landroid/widget/ImageView;)V

    .line 24
    iput-boolean v1, p0, Lcom/upi/axispay/activity/MainActivity;->d0:Z

    goto :goto_0

    .line 25
    :cond_6
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    .line 26
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    check-cast p1, Lxf0;

    if-eqz p1, :cond_8

    .line 27
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 28
    invoke-virtual {p1, p2}, Lxf0;->p(Ljava/lang/Object;)V

    goto :goto_0

    .line 29
    :cond_7
    check-cast p2, Ltg0;

    .line 30
    invoke-virtual {p0, p2}, Lcom/upi/axispay/activity/MainActivity;->Q0(Ltg0;)V

    :cond_8
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public o0()V
    .locals 8

    const v0, 0x7f12014a

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v0, 0x7f120149

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v0, 0x7f12031e

    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/upi/axispay/activity/MainActivity$e;

    invoke-direct {v5, p0}, Lcom/upi/axispay/activity/MainActivity$e;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    const v0, 0x7f1200bf

    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/upi/axispay/activity/MainActivity$f;

    invoke-direct {v7, p0}, Lcom/upi/axispay/activity/MainActivity$f;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    move-object v1, p0

    .line 5
    invoke-static/range {v1 .. v7}, Leg0;->r(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/upi/axispay/activity/MainActivity;->d0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->c0:Lkg0;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2, p3}, Lkg0;->d(IILandroid/content/Intent;)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x64

    const/16 v1, 0x65

    const/4 v2, -0x1

    if-ne p1, v0, :cond_1

    if-ne p2, v2, :cond_4

    .line 3
    new-instance p1, Landroid/content/Intent;

    const p2, 0x3512

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0, p1, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    :cond_1
    if-ne p1, v1, :cond_2

    if-ne p2, v2, :cond_4

    .line 5
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    sget p2, Lvg0;->e:I

    const p3, 0x3513

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3, p2}, Ln70;->v(Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    const/16 v0, 0x66

    if-ne p1, v0, :cond_3

    if-ne p2, v2, :cond_4

    .line 6
    invoke-static {p0}, Leg0;->i(Landroid/app/Activity;)V

    .line 7
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const p2, 0x7f120148

    .line 8
    invoke-virtual {p0, p2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    const p3, 0x3514

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const p2, 0x3515

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 9
    invoke-static {p0, p2, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 10
    invoke-static {p0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    invoke-virtual {p1}, Lua0;->w()V

    goto :goto_0

    .line 11
    :cond_3
    invoke-super {p0, p1, p2, p3}, Lsd;->onActivityResult(IILandroid/content/Intent;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 4

    const v0, 0x7f0a018a

    .line 1
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v1

    invoke-static {v1, p0}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    const v1, 0x800003

    .line 3
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->C(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->d(I)V

    goto/16 :goto_3

    .line 5
    :cond_0
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->o0()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    .line 6
    iget v2, p0, Lcom/upi/axispay/activity/MainActivity;->T:I

    const/4 v3, 0x4

    if-eq v2, v3, :cond_1

    const/16 v3, 0x44

    if-eq v2, v3, :cond_1

    const/16 v3, 0x43

    if-eq v2, v3, :cond_1

    .line 7
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->L0()V

    goto/16 :goto_3

    :cond_1
    const/4 v2, 0x2

    const/16 v3, 0x18

    if-ne v0, v2, :cond_2

    .line 8
    iget v0, p0, Lcom/upi/axispay/activity/MainActivity;->T:I

    if-ne v0, v3, :cond_2

    .line 9
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    goto/16 :goto_3

    .line 10
    :cond_2
    iget v0, p0, Lcom/upi/axispay/activity/MainActivity;->T:I

    const/16 v2, 0x14

    if-eq v0, v2, :cond_b

    if-eq v0, v3, :cond_b

    const/16 v2, 0x1f

    if-eq v0, v2, :cond_b

    if-eq v0, v1, :cond_b

    const/16 v2, 0x6e

    if-ne v0, v2, :cond_3

    goto :goto_2

    :cond_3
    const/16 v2, 0x9

    if-eq v0, v2, :cond_9

    const/16 v2, 0x32

    if-ne v0, v2, :cond_4

    goto :goto_1

    :cond_4
    const/16 v2, 0x6b

    if-eq v0, v2, :cond_8

    const/16 v2, 0x6a

    if-ne v0, v2, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x6

    if-ne v0, v2, :cond_7

    .line 11
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v0

    .line 12
    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 13
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v0

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    if-ne v0, v1, :cond_6

    .line 14
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->G0()V

    goto :goto_3

    .line 15
    :cond_6
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    goto :goto_3

    .line 16
    :cond_7
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    goto :goto_3

    .line 17
    :cond_8
    :goto_0
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    goto :goto_3

    .line 18
    :cond_9
    :goto_1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v0

    .line 20
    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_COLLECT_NOTIFICATION:I

    if-eq v0, v1, :cond_a

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_QR_PAY:I

    if-eq v0, v1, :cond_a

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_BHARAT_QR_PAY:I

    if-eq v0, v1, :cond_a

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    if-eq v0, v1, :cond_a

    .line 21
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 22
    :cond_a
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    goto :goto_3

    .line 23
    :cond_b
    :goto_2
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->s0()V

    .line 24
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v0

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    if-ne v0, v1, :cond_c

    .line 26
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->G0()V

    :cond_c
    :goto_3
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x800003

    const/4 v1, 0x0

    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/16 p1, 0x31

    .line 2
    invoke-virtual {p0, p1, v1}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    .line 3
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->C(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->d(I)V

    goto :goto_0

    .line 5
    :sswitch_1
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->L0()V

    goto :goto_0

    :sswitch_2
    const/16 p1, 0x30

    .line 6
    invoke-virtual {p0, p1, v1}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    .line 7
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->d(I)V

    goto :goto_0

    :sswitch_3
    const/16 p1, 0x47

    .line 8
    invoke-virtual {p0, p1, v1}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f0a006c -> :sswitch_3
        0x7f0a0276 -> :sswitch_2
        0x7f0a027a -> :sswitch_1
        0x7f0a0339 -> :sswitch_0
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    const v0, 0x3516

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    invoke-super {p0, p1}, Lc90;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p1

    check-cast p1, Lcom/upi/axispay/AxisPayApplication;

    .line 3
    invoke-virtual {p1, p0}, Lcom/upi/axispay/AxisPayApplication;->a(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Landroid/app/Activity;->requestWindowFeature(I)Z

    const v2, 0x7f0d0027

    .line 5
    :try_start_0
    invoke-virtual {p0, v2}, Lz;->setContentView(I)V

    .line 6
    new-instance v2, Landroid/os/StrictMode$VmPolicy$Builder;

    invoke-direct {v2}, Landroid/os/StrictMode$VmPolicy$Builder;-><init>()V

    .line 7
    invoke-virtual {v2}, Landroid/os/StrictMode$VmPolicy$Builder;->build()Landroid/os/StrictMode$VmPolicy;

    move-result-object v2

    invoke-static {v2}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    const v2, 0x7f0a050a

    .line 8
    invoke-virtual {p0, v2}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/Toolbar;

    iput-object v2, p0, Lcom/upi/axispay/activity/MainActivity;->D:Landroidx/appcompat/widget/Toolbar;

    .line 9
    iput-object p0, p0, Lcom/upi/axispay/activity/MainActivity;->N:Landroid/content/Context;

    .line 10
    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v0, 0x3517

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 11
    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    .line 12
    const-class v4, Lcom/olive/upi/transport/model/MasterUpdate;

    invoke-virtual {v3, v2, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/MasterUpdate;

    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/net/wifi/WifiManager;

    iput-object v3, p0, Lcom/upi/axispay/activity/MainActivity;->i0:Landroid/net/wifi/WifiManager;

    .line 14
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v3

    invoke-virtual {v3, v2}, Lqa0;->i0(Lcom/olive/upi/transport/model/MasterUpdate;)V

    .line 15
    invoke-static {p0}, Lcom/olive/upi/transport/OliveUpiManager;->init(Landroid/app/Activity;)V

    .line 16
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->H0()V

    .line 17
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->v0()V

    .line 18
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->P0()V

    .line 19
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/wifi/WifiManager;

    iput-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->i0:Landroid/net/wifi/WifiManager;

    .line 20
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->j0:Ljava/util/ArrayList;

    .line 21
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->k0:Ljava/util/ArrayList;

    .line 22
    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->j0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 23
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->l0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x4

    const/4 v2, 0x0

    .line 24
    invoke-virtual {p0, v1, v2}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    .line 25
    :goto_0
    invoke-static {p0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v1

    invoke-virtual {v1}, Lua0;->k()Z

    move-result v1

    if-nez v1, :cond_0

    .line 26
    invoke-static {p0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    const/16 v3, 0x56

    const/16 v4, 0x50

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v2, v3, v4, v5, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;Z)V

    invoke-virtual {v1, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :cond_0
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lsd;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3

    const/16 v0, 0x64

    if-eq p1, v0, :cond_2

    const/16 v0, 0x6d

    const/4 v1, 0x0

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3f9

    if-eq p1, v0, :cond_0

    .line 1
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->v0()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_4

    .line 3
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    goto :goto_0

    .line 4
    :cond_0
    array-length p1, p3

    if-lez p1, :cond_4

    aget p1, p3, v1

    if-nez p1, :cond_4

    .line 5
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->E0()V

    goto :goto_0

    .line 6
    :cond_1
    array-length p1, p3

    if-lez p1, :cond_4

    aget p1, p3, v1

    if-nez p1, :cond_4

    .line 7
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->I0()V

    goto :goto_0

    .line 8
    :cond_2
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->c0:Lkg0;

    if-nez p1, :cond_3

    .line 9
    new-instance p1, Lkg0;

    invoke-direct {p1}, Lkg0;-><init>()V

    iput-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->c0:Lkg0;

    .line 10
    :cond_3
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->c0:Lkg0;

    iget-object p2, p0, Lcom/upi/axispay/activity/MainActivity;->o0:Lcom/pkmmte/view/CircularImageView;

    invoke-virtual {p1, p0, p2}, Lkg0;->h(Landroid/app/Activity;Landroid/widget/ImageView;)V

    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lcom/upi/axispay/activity/MainActivity;->d0:Z

    :cond_4
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 6

    .line 1
    invoke-super {p0}, Lc90;->onResume()V

    .line 2
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x3518

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->j(Ljava/lang/String;)I

    move-result v1

    .line 3
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x3519

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->j(Ljava/lang/String;)I

    move-result v2

    .line 4
    new-instance v3, Lch0;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v4

    invoke-direct {v3, v4}, Lch0;-><init>(Landroid/content/Context;)V

    if-eqz v2, :cond_0

    .line 5
    invoke-virtual {v3}, Lch0;->d()Z

    move-result v2

    if-nez v2, :cond_0

    .line 6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1}, Lqa0;->c()V

    .line 7
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x351a

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->c(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1}, Ln70;->d()V

    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 10
    :cond_0
    sget v2, Lvg0;->e:I

    if-ne v1, v2, :cond_1

    iget v1, p0, Lcom/upi/axispay/activity/MainActivity;->T:I

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    .line 11
    invoke-virtual {p0}, Lc90;->X()V

    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 12
    invoke-virtual {p0, v1}, Lcom/upi/axispay/activity/MainActivity;->O0(Z)V

    .line 13
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 14
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v4, 0x351b

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v4, 0x351c

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 16
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v4, 0x351d

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 17
    iget-object v3, p0, Lcom/upi/axispay/activity/MainActivity;->l0:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v3, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 18
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Ld70;->e(Landroid/content/Context;)Ld70;

    move-result-object v2

    invoke-virtual {v2}, Ld70;->f()Ljava/lang/String;

    move-result-object v2

    .line 19
    iget-object v3, p0, Lcom/upi/axispay/activity/MainActivity;->U:Landroid/widget/Spinner;

    const/4 v4, 0x2

    if-eqz v2, :cond_3

    const v5, 0x351e

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    move v1, v4

    :cond_3
    :goto_1
    invoke-virtual {v3, v1}, Landroid/widget/Spinner;->setSelection(I)V

    .line 20
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0x351f

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->j(Ljava/lang/String;)I

    move-result v1

    .line 21
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->q0()Ljava/lang/String;

    move-result-object v3

    .line 22
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    if-le v1, v4, :cond_6

    .line 23
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->F0()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 24
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_2

    .line 25
    :cond_5
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x3520

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x3521

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_2

    .line 28
    :cond_6
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->t0()Z

    .line 29
    :goto_2
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x3522

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lt8;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_7

    const v0, 0x3523

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 30
    invoke-static {p0, v0}, Lt8;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_7

    .line 31
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->E0()V

    :cond_7
    return-void
.end method

.method public onUserInteraction()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->t0()Z

    .line 2
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->C0()V

    return-void
.end method

.method public p0()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x3524

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x3525

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 5
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 7
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->h0:Ljava/lang/String;

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->h0:Ljava/lang/String;

    return-object v0
.end method

.method public q0()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v2

    invoke-virtual {v2}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v2

    .line 4
    invoke-static {v0}, Lig0;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 5
    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/TransactionData;->setIntentData(Ljava/lang/String;)V

    const v0, 0x3526

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const v0, 0x3527

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const v0, 0x3528

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    :goto_0
    return-object v3

    .line 9
    :cond_3
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x3529

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final r0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->k0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->k0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->k0:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->i0:Landroid/net/wifi/WifiManager;

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 4
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->i0:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->p0()Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-void

    :cond_1
    const v2, 0x352a

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x352b

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getHiddenSSID()Z

    .line 9
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->k0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 10
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->k0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/wifi/ScanResult;

    .line 11
    iget-object v3, v2, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 12
    iget-object v2, v2, Landroid/net/wifi/ScanResult;->capabilities:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/upi/axispay/activity/MainActivity;->j0(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 13
    iget-boolean v2, p0, Lcom/upi/axispay/activity/MainActivity;->g0:Z

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    .line 14
    iput-boolean v2, p0, Lcom/upi/axispay/activity/MainActivity;->g0:Z

    .line 15
    invoke-static {}, Leg0;->a()V

    const v2, 0x7f1201b3

    .line 16
    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lb90;

    invoke-direct {v3, p0}, Lb90;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    const v4, 0x7f120111

    .line 17
    invoke-virtual {p0, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, La90;

    invoke-direct {v5, p0}, La90;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    .line 18
    invoke-static {p0, v2, v3, v4, v5}, Leg0;->k(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 11

    const/16 v0, 0xca

    if-ne p1, v0, :cond_7

    .line 1
    check-cast p2, Lpg0;

    .line 2
    invoke-virtual {p2}, Lpg0;->d()I

    move-result p1

    const p2, 0x7f12027b

    const v0, 0x7f120204

    const v1, 0x7f120205

    const v2, 0x7f12005c

    const v3, 0x352c

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x352d

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x352e

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x352f

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x3530

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    const/4 v9, 0x5

    const/4 v10, 0x0

    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 3
    :sswitch_0
    new-instance p1, Lna0;

    invoke-direct {p1}, Lna0;-><init>()V

    const p2, 0x3531

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p2}, Lna0;->e(Ljava/lang/String;)V

    const/16 p2, 0x9b

    .line 5
    invoke-virtual {p0, p2, p1}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    :sswitch_1
    const/16 p1, 0x9a

    .line 6
    invoke-virtual {p0, p1, v10}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    :sswitch_2
    const/16 p1, 0x89

    .line 7
    invoke-virtual {p0, p1, v10}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 8
    :sswitch_3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->i()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    .line 9
    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Leg0;->h(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 10
    :cond_0
    new-instance p1, Lna0;

    invoke-direct {p1}, Lna0;-><init>()V

    .line 11
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v7, v0}, Lna0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x86

    .line 12
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v6, v1}, Lna0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    .line 14
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const v0, 0x7f120350

    .line 15
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    invoke-virtual {p0, p2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    invoke-static {p0, v3, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    goto/16 :goto_0

    :sswitch_4
    const/16 p1, 0x81

    .line 18
    invoke-virtual {p0, p1, v10}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 19
    :sswitch_5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->i()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    .line 20
    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Leg0;->h(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 21
    :cond_1
    new-instance p2, Lna0;

    invoke-direct {p2}, Lna0;-><init>()V

    .line 22
    invoke-virtual {p2, v7, p1}, Lna0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x7f

    .line 23
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v6, v1}, Lna0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    invoke-virtual {p0, p1, p2}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    .line 25
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 26
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v5, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const p2, 0x7f12026c

    .line 27
    invoke-virtual {p0, p2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    invoke-static {p0, v3, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    goto/16 :goto_0

    .line 29
    :sswitch_6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->i()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    .line 30
    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Leg0;->h(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 31
    :cond_2
    new-instance v1, Lna0;

    invoke-direct {v1}, Lna0;-><init>()V

    .line 32
    invoke-virtual {v1, v7, p1}, Lna0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x7e

    .line 33
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Lna0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    invoke-virtual {p0, p1, v1}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    .line 35
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 36
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    invoke-virtual {p0, p2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    invoke-static {p0, v3, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    goto/16 :goto_0

    :sswitch_7
    const/16 p1, 0x7b

    .line 39
    invoke-virtual {p0, p1, v10}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    :sswitch_8
    const/16 p1, 0x72

    .line 40
    invoke-virtual {p0, p1, v10}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    :sswitch_9
    const/16 p1, 0x71

    .line 41
    invoke-virtual {p0, p1, v10}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 42
    :sswitch_a
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p2

    const v0, 0x3532

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ln70;->e(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 43
    new-instance p2, Landroid/content/Intent;

    const-class v1, Lcom/upi/axispay/activity/TutorialActivity;

    invoke-direct {p2, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v1, 0x6a

    const v2, 0x3533

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 44
    invoke-virtual {p2, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 45
    invoke-virtual {p0, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 46
    :cond_3
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    invoke-virtual {p1, v0, v8}, Ln70;->A(Ljava/lang/String;Z)V

    const/16 p1, 0x77

    .line 47
    invoke-virtual {p0, p1, v10}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 48
    :sswitch_b
    new-instance p1, Landroid/content/Intent;

    const-class p2, Lcom/upi/axispay/activity/TnCActivity;

    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 49
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 50
    :sswitch_c
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p2, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {p1, p2}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object p1

    .line 51
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2, v10}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 52
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2, v10}, Lqa0;->U(Ldg0;)V

    const p2, 0x7f1202ef

    if-eqz p1, :cond_6

    .line 53
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v8, :cond_4

    const/16 p1, 0x66

    .line 54
    invoke-virtual {p0, p1, v10}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 55
    :cond_4
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v0, v8, :cond_5

    .line 56
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p2

    const/4 v0, 0x0

    .line 57
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 58
    sget p1, Lcom/olive/upi/transport/model/TransactionData;->MODE_SEND_VIA_IFSC:I

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 59
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    const/16 p1, 0x54

    .line 60
    invoke-virtual {p0, p1, v10}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 61
    :cond_5
    invoke-virtual {p0, p2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 62
    :cond_6
    invoke-virtual {p0, p2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 63
    :sswitch_d
    new-instance p1, Lna0;

    invoke-direct {p1}, Lna0;-><init>()V

    .line 64
    sget-object p2, Ln70;->f:Ln70$a;

    invoke-virtual {p2}, Ln70$a;->a()Ln70;

    move-result-object p2

    const v0, 0x3534

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lna0;->e(Ljava/lang/String;)V

    const/16 p2, 0x45

    .line 65
    invoke-virtual {p0, p2, p1}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto :goto_0

    :sswitch_e
    const/16 p1, 0x41

    .line 66
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto :goto_0

    :sswitch_f
    const/16 p1, 0x2c

    .line 67
    invoke-virtual {p0, p1, v10}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto :goto_0

    :sswitch_10
    const/16 p1, 0x2b

    .line 68
    invoke-virtual {p0, p1, v10}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto :goto_0

    :sswitch_11
    const/16 p1, 0x4a

    .line 69
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto :goto_0

    :sswitch_12
    const/16 p1, 0x21

    .line 70
    invoke-virtual {p0, p1, v10}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 71
    :sswitch_13
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->o0()V

    goto :goto_0

    :sswitch_14
    const/16 p1, 0x15

    .line 72
    invoke-virtual {p0, p1, v10}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 73
    :sswitch_15
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p2, Lqa0$e;->b:Lqa0$e;

    invoke-virtual {p1, p2}, Lqa0;->v0(Lqa0$e;)V

    .line 74
    new-instance p1, Lma0;

    sget p2, Lcom/olive/upi/transport/model/TransactionData;->MODE_NONE:I

    invoke-direct {p1, v9, p2}, Lma0;-><init>(II)V

    const/16 p2, 0x11

    .line 75
    invoke-virtual {p0, p2, p1}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    :goto_0
    const p1, 0x7f0a018a

    .line 76
    invoke-virtual {p0, p1}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/drawerlayout/widget/DrawerLayout;

    iput-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    const p2, 0x800003

    .line 77
    invoke-virtual {p1, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->d(I)V

    :cond_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0x11 -> :sswitch_15
        0x15 -> :sswitch_14
        0x1e -> :sswitch_13
        0x21 -> :sswitch_12
        0x2a -> :sswitch_11
        0x2b -> :sswitch_10
        0x2c -> :sswitch_f
        0x41 -> :sswitch_e
        0x45 -> :sswitch_d
        0x66 -> :sswitch_c
        0x69 -> :sswitch_b
        0x6a -> :sswitch_a
        0x71 -> :sswitch_9
        0x72 -> :sswitch_8
        0x7b -> :sswitch_7
        0x7e -> :sswitch_6
        0x7f -> :sswitch_5
        0x81 -> :sswitch_4
        0x86 -> :sswitch_3
        0x89 -> :sswitch_2
        0x9a -> :sswitch_1
        0x9b -> :sswitch_0
    .end sparse-switch
.end method

.method public s0()V
    .locals 7

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->F0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ltg0;

    const v1, 0x7f120099

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-virtual {p0, v0}, Lcom/upi/axispay/activity/MainActivity;->Q0(Ltg0;)V

    .line 4
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lqa0;->U(Ldg0;)V

    .line 6
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentManager;->b1(Ljava/lang/String;I)V

    const/4 v0, 0x5

    .line 7
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0, v1}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public t(ILjava/lang/Object;)V
    .locals 6

    const/16 v0, 0x56

    if-ne p1, v0, :cond_0

    return-void

    .line 1
    :cond_0
    iget v0, p0, Lcom/upi/axispay/activity/MainActivity;->T:I

    if-ne v0, p1, :cond_1

    return-void

    .line 2
    :cond_1
    iput p1, p0, Lcom/upi/axispay/activity/MainActivity;->T:I

    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->M0()V

    .line 5
    iget v1, p0, Lcom/upi/axispay/activity/MainActivity;->T:I

    const/4 v2, 0x5

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-ne v1, v2, :cond_2

    .line 6
    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->J:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7
    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->M:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->E:Landroid/widget/ImageView;

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 9
    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->D:Landroidx/appcompat/widget/Toolbar;

    iget-object v2, p0, Lcom/upi/axispay/activity/MainActivity;->N:Landroid/content/Context;

    const v5, 0x7f060048

    invoke-static {v2, v5}, Lt8;->d(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    goto :goto_0

    .line 10
    :cond_2
    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->J:Landroid/widget/ImageView;

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 11
    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->E:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->M:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 13
    :goto_0
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v1

    sget v2, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    const/4 v5, 0x1

    if-ne v1, v2, :cond_3

    .line 15
    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->J:Landroid/widget/ImageView;

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 16
    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->F:Landroid/widget/ImageView;

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setEnabled(Z)V

    goto :goto_1

    .line 17
    :cond_3
    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->J:Landroid/widget/ImageView;

    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 18
    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->F:Landroid/widget/ImageView;

    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 19
    :goto_1
    iput v4, p0, Lc90;->r:I

    .line 20
    invoke-static {}, Leg0;->c()V

    const v1, 0x3535

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_8

    .line 21
    :pswitch_1
    invoke-static {}, Lfd0;->B()Lfd0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 22
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    invoke-static {v5}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v1, p2}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_8

    .line 23
    :pswitch_2
    new-instance p1, Lxf0;

    invoke-direct {p1}, Lxf0;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 24
    :pswitch_3
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->F:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 25
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->I:Landroid/widget/TextView;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 26
    invoke-static {}, Lxe0;->A()Lxe0;

    move-result-object p1

    const/4 p2, 0x2

    .line 27
    invoke-virtual {p1, p2}, Lxe0;->C(I)V

    .line 28
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 29
    :pswitch_4
    invoke-static {}, Lce0;->G()Lce0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 30
    :pswitch_5
    invoke-static {}, Lde0;->y()Lde0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 31
    :pswitch_6
    invoke-static {}, Lze0;->D()Lze0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 32
    :pswitch_7
    invoke-static {}, Lee0;->y()Lee0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 33
    :pswitch_8
    check-cast p2, Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    .line 34
    new-instance p1, Lzc0;

    invoke-direct {p1}, Lzc0;-><init>()V

    .line 35
    invoke-virtual {p1, p2}, Lzc0;->x(Lcom/olive/upi/transport/model/BillerRegEnqResponse;)V

    .line 36
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 37
    :pswitch_9
    invoke-static {}, Lif0;->x()Lif0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 38
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    invoke-static {v5}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v1, p2}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_8

    .line 39
    :pswitch_a
    check-cast p2, Lcom/olive/upi/transport/model/Billers;

    .line 40
    invoke-static {}, Lcd0;->z()Lcd0;

    move-result-object p1

    .line 41
    invoke-virtual {p1, p2}, Lcd0;->A(Lcom/olive/upi/transport/model/Billers;)V

    .line 42
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 43
    :pswitch_b
    invoke-static {}, Lud0;->y()Lud0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 44
    :pswitch_c
    check-cast p2, Lcom/olive/upi/transport/model/Account;

    invoke-static {p2}, Lje0;->x(Lcom/olive/upi/transport/model/Account;)Lje0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 45
    :pswitch_d
    invoke-static {}, Lxd0;->x()Lxd0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 46
    :pswitch_e
    invoke-static {}, Lzd0;->x()Lzd0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 47
    :pswitch_f
    invoke-static {}, Lyd0;->x()Lyd0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 48
    :pswitch_10
    invoke-static {}, Lbe0;->y()Lbe0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 49
    :pswitch_11
    invoke-static {}, Lne0;->A()Lne0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 50
    :pswitch_12
    invoke-static {}, Lae0;->x()Lae0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 51
    :pswitch_13
    invoke-static {}, Lee0;->y()Lee0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 52
    :pswitch_14
    invoke-static {}, Lwd0;->x()Lwd0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 53
    :pswitch_15
    invoke-static {}, Lvd0;->x()Lvd0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 54
    :pswitch_16
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Ltd0;->A(I)Ltd0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 55
    :pswitch_17
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 56
    invoke-static {p1}, Lsd0;->z(I)Lsd0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 57
    :pswitch_18
    check-cast p2, Lcom/olive/upi/transport/model/BillerChargeRes;

    .line 58
    new-instance p1, Lad0;

    invoke-direct {p1}, Lad0;-><init>()V

    .line 59
    invoke-virtual {p1, p2}, Lad0;->A(Lcom/olive/upi/transport/model/BillerChargeRes;)V

    .line 60
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 61
    :pswitch_19
    invoke-static {}, Lpd0;->B()Lpd0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 62
    :pswitch_1a
    invoke-static {}, Lld0;->A()Lld0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 63
    :pswitch_1b
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v5}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 64
    invoke-static {}, Lqf0;->z()Lqf0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 65
    :pswitch_1c
    check-cast p2, Lcom/olive/upi/transport/model/Billers;

    .line 66
    invoke-static {}, Lge0;->A()Lge0;

    move-result-object p1

    .line 67
    invoke-virtual {p1, p2}, Lge0;->B(Lcom/olive/upi/transport/model/Billers;)V

    .line 68
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 69
    :pswitch_1d
    check-cast p2, Lcom/olive/upi/transport/model/BillerCategory;

    .line 70
    invoke-static {}, Lie0;->A()Lie0;

    move-result-object p1

    .line 71
    invoke-virtual {p1, p2}, Lie0;->B(Lcom/olive/upi/transport/model/BillerCategory;)V

    .line 72
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 73
    :pswitch_1e
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v5}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 74
    invoke-static {}, Lkd0;->y()Lkd0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 75
    :pswitch_1f
    check-cast p2, Lcom/olive/upi/transport/model/Account;

    invoke-static {p2}, Lvf0;->y(Lcom/olive/upi/transport/model/Account;)Lvf0;

    move-result-object p1

    .line 76
    invoke-virtual {p1, v5}, Lvf0;->B(Z)V

    .line 77
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 78
    :pswitch_20
    check-cast p2, Lcom/olive/upi/transport/model/BillerCategory;

    .line 79
    invoke-static {}, Lte0;->B()Lte0;

    move-result-object p1

    .line 80
    invoke-virtual {p1, p2}, Lte0;->F(Lcom/olive/upi/transport/model/BillerCategory;)V

    .line 81
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 82
    :pswitch_21
    invoke-static {}, Lpf0;->z()Lpf0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 83
    :pswitch_22
    check-cast p2, Ldg0;

    .line 84
    invoke-static {p2}, Lhf0;->z(Ldg0;)Lhf0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 85
    :pswitch_23
    invoke-static {}, Ldd0;->z()Ldd0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 86
    :pswitch_24
    check-cast p2, Lcom/olive/upi/transport/model/BillerCategory;

    .line 87
    invoke-static {}, Lue0;->C()Lue0;

    move-result-object p1

    .line 88
    invoke-virtual {p1, p2}, Lue0;->H(Lcom/olive/upi/transport/model/BillerCategory;)V

    .line 89
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 90
    :pswitch_25
    check-cast p2, Ljava/lang/String;

    .line 91
    invoke-static {p2}, Lbd0;->C(Ljava/lang/String;)Lbd0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 92
    :pswitch_26
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Luf0;->B(I)Luf0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 93
    :pswitch_27
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lnf0;->A(I)Lnf0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 94
    :pswitch_28
    new-instance p1, Lff0;

    invoke-direct {p1}, Lff0;-><init>()V

    .line 95
    check-cast p2, Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lff0;->x(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 96
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 97
    :pswitch_29
    invoke-static {}, Lag0;->y()Lag0;

    move-result-object p1

    .line 98
    check-cast p2, Lna0;

    invoke-virtual {p1, p2}, Lag0;->z(Lna0;)V

    .line 99
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 100
    :pswitch_2a
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->J:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 101
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->M:Landroid/widget/TextView;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 102
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->E:Landroid/widget/ImageView;

    invoke-virtual {p1, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 103
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->J:Landroid/widget/ImageView;

    invoke-virtual {p1, v5}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 104
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->F:Landroid/widget/ImageView;

    invoke-virtual {p1, v5}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 105
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v5}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    if-nez p2, :cond_4

    goto :goto_2

    .line 106
    :cond_4
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :goto_2
    const p1, 0x7f120361

    .line 107
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 108
    invoke-static {p0, v4, p1}, Leg0;->v(Landroid/app/Activity;ILjava/lang/String;)V

    goto/16 :goto_8

    .line 109
    :pswitch_2b
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v5}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 110
    check-cast p2, Ljava/util/ArrayList;

    invoke-static {p2}, Lse0;->x(Ljava/util/ArrayList;)Lse0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 111
    :pswitch_2c
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v5}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    if-nez p2, :cond_5

    goto :goto_3

    .line 112
    :cond_5
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 113
    :goto_3
    invoke-static {}, Lqe0;->z()Lqe0;

    move-result-object p1

    .line 114
    invoke-virtual {p1, v4}, Lqe0;->C(I)V

    .line 115
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 116
    :pswitch_2d
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v5}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 117
    invoke-static {}, Lrf0;->D()Lrf0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 118
    :pswitch_2e
    invoke-static {}, Lve0;->y()Lve0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 119
    :pswitch_2f
    check-cast p2, Lcom/olive/upi/transport/model/Account;

    invoke-static {p2}, Llf0;->y(Lcom/olive/upi/transport/model/Account;)Llf0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 120
    :pswitch_30
    check-cast p2, Lcom/olive/upi/transport/model/Account;

    invoke-static {p2}, Lvf0;->y(Lcom/olive/upi/transport/model/Account;)Lvf0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 121
    :pswitch_31
    invoke-static {}, Lwf0;->I()Lwf0;

    move-result-object p1

    .line 122
    check-cast p2, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p1, p2}, Lwf0;->K(Lcom/olive/upi/transport/model/Account;)V

    .line 123
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 124
    :pswitch_32
    invoke-static {}, Lvc0;->B()Lvc0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 125
    :pswitch_33
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v5}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 126
    invoke-static {}, Lfe0;->x()Lfe0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 127
    :pswitch_34
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v5}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 128
    check-cast p2, Lhg0;

    invoke-static {p2}, Ldf0;->C(Lhg0;)Ldf0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 129
    :pswitch_35
    invoke-static {}, Lcf0;->G()Lcf0;

    move-result-object p1

    .line 130
    invoke-virtual {p1, p2}, Lcf0;->M(Ljava/lang/Object;)V

    .line 131
    iget-object p2, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p2, v5}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 132
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 133
    :pswitch_36
    new-instance p1, Lqc0;

    invoke-direct {p1}, Lqc0;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 134
    :pswitch_37
    check-cast p2, Lcom/olive/upi/transport/model/Account;

    invoke-static {p2}, Lkf0;->z(Lcom/olive/upi/transport/model/Account;)Lkf0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 135
    :pswitch_38
    new-instance p1, Lpe0;

    invoke-direct {p1}, Lpe0;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 136
    :pswitch_39
    new-instance p1, Lmd0;

    invoke-direct {p1}, Lmd0;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 137
    :pswitch_3a
    new-instance p1, Lhd0;

    invoke-direct {p1}, Lhd0;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 138
    :pswitch_3b
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->F:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 139
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->I:Landroid/widget/TextView;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 140
    check-cast p2, Ljava/util/ArrayList;

    invoke-static {p2}, Laf0;->B(Ljava/util/ArrayList;)Laf0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 141
    :pswitch_3c
    invoke-static {}, Lre0;->F()Lre0;

    move-result-object p1

    .line 142
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 143
    :pswitch_3d
    invoke-static {}, Led0;->B()Led0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 144
    :pswitch_3e
    new-instance p1, Lsf0;

    invoke-direct {p1}, Lsf0;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 145
    :pswitch_3f
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v5}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 146
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->u0()V

    .line 147
    new-instance p1, Ljf0;

    invoke-direct {p1}, Ljf0;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 148
    :pswitch_40
    new-instance p1, Lcom/olive/upi/transport/model/Account;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/Account;-><init>()V

    invoke-static {p1}, Lof0;->G(Lcom/olive/upi/transport/model/Account;)Lof0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 149
    :pswitch_41
    new-instance p1, Lef0;

    invoke-direct {p1}, Lef0;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 150
    :pswitch_42
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->F:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 151
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->I:Landroid/widget/TextView;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 152
    invoke-static {}, Lxe0;->A()Lxe0;

    move-result-object p1

    .line 153
    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Lxe0;->B(Ljava/util/ArrayList;)V

    .line 154
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 155
    :pswitch_43
    new-instance p1, Lwe0;

    invoke-direct {p1}, Lwe0;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 156
    :pswitch_44
    new-instance p1, Lyf0;

    invoke-direct {p1}, Lyf0;-><init>()V

    .line 157
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    :pswitch_45
    const/16 p1, 0x16

    .line 158
    iput p1, p0, Lc90;->r:I

    .line 159
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v5}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 160
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->u0()V

    if-nez p2, :cond_6

    goto :goto_4

    .line 161
    :cond_6
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 162
    :goto_4
    invoke-static {v4}, Lhe0;->S(I)Lhe0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 163
    :pswitch_46
    invoke-static {}, Lpc0;->F()Lpc0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 164
    :pswitch_47
    new-instance p1, Lyf0;

    invoke-direct {p1}, Lyf0;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 165
    :pswitch_48
    check-cast p2, Lma0;

    invoke-static {p2}, Lyc0;->B(Lma0;)Lyc0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 166
    :pswitch_49
    new-instance p1, Lid0;

    invoke-direct {p1}, Lid0;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 167
    :pswitch_4a
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v5}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 168
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->u0()V

    .line 169
    new-instance p1, Lmf0;

    invoke-direct {p1}, Lmf0;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto/16 :goto_8

    .line 170
    :pswitch_4b
    new-instance p1, Lrc0;

    invoke-direct {p1}, Lrc0;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto :goto_8

    .line 171
    :pswitch_4c
    new-instance p1, Lsc0;

    invoke-direct {p1}, Lsc0;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto :goto_8

    .line 172
    :pswitch_4d
    check-cast p2, Lcom/olive/upi/transport/model/Account;

    invoke-static {p2}, Lof0;->G(Lcom/olive/upi/transport/model/Account;)Lof0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto :goto_8

    .line 173
    :pswitch_4e
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v5}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    if-nez p2, :cond_7

    goto :goto_5

    .line 174
    :cond_7
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 175
    :goto_5
    sget p1, Lcom/olive/upi/transport/model/TransactionData;->MODE_COLLECT_NOTIFICATION:I

    if-ne v4, p1, :cond_8

    const/16 p1, 0x1f

    const/4 p2, 0x0

    .line 176
    invoke-virtual {p0, p1, p2}, Lcom/upi/axispay/activity/MainActivity;->t(ILjava/lang/Object;)V

    goto :goto_8

    .line 177
    :cond_8
    invoke-static {}, Ltf0;->A()Ltf0;

    move-result-object p1

    .line 178
    invoke-virtual {p1, v4}, Ltf0;->E(I)V

    .line 179
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    goto :goto_8

    :pswitch_4f
    if-nez p2, :cond_9

    goto :goto_6

    :cond_9
    move v5, v4

    .line 180
    :goto_6
    invoke-static {v5}, Lod0;->Q(Z)Lod0;

    move-result-object p1

    invoke-virtual {p0, v0, p1, v4}, Lcom/upi/axispay/activity/MainActivity;->B0(Ljava/lang/String;Landroidx/fragment/app/Fragment;Z)V

    goto :goto_8

    .line 181
    :pswitch_50
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity;->Q:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v5}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    if-nez p2, :cond_a

    goto :goto_7

    .line 182
    :cond_a
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 183
    :goto_7
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->u0()V

    .line 184
    invoke-static {}, Lrd0;->H()Lrd0;

    move-result-object p1

    .line 185
    invoke-virtual {p1, v4}, Lrd0;->L(I)V

    .line 186
    invoke-virtual {p0, v0, p1}, Lcom/upi/axispay/activity/MainActivity;->A0(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 187
    :goto_8
    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p0}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 188
    invoke-virtual {p0}, Lcom/upi/axispay/activity/MainActivity;->C0()V

    .line 189
    invoke-static {}, Leg0;->B()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_0
        :pswitch_0
        :pswitch_4d
        :pswitch_0
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_0
        :pswitch_49
        :pswitch_0
        :pswitch_48
        :pswitch_0
        :pswitch_0
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_0
        :pswitch_44
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_43
        :pswitch_0
        :pswitch_42
        :pswitch_0
        :pswitch_41
        :pswitch_0
        :pswitch_0
        :pswitch_40
        :pswitch_3f
        :pswitch_0
        :pswitch_0
        :pswitch_3e
        :pswitch_0
        :pswitch_0
        :pswitch_3d
        :pswitch_3c
        :pswitch_0
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_0
        :pswitch_36
        :pswitch_0
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_0
        :pswitch_32
        :pswitch_0
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_42
        :pswitch_0
        :pswitch_0
        :pswitch_27
        :pswitch_26
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1f
        :pswitch_1e
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_1d
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_29
        :pswitch_29
        :pswitch_29
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_29
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_29
    .end packed-switch
.end method

.method public final t0()Z
    .locals 6

    .line 1
    sget-wide v0, Lc90;->z:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-wide v4, Lc90;->z:J

    sub-long/2addr v2, v4

    const-wide/32 v4, 0x1d4c0

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    iget v0, p0, Lcom/upi/axispay/activity/MainActivity;->T:I

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    .line 3
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    const v3, 0x3536

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lqa0;->R(Ljava/util/ArrayList;)V

    .line 5
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lqa0;->n0(Ljava/util/ArrayList;)V

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sput-wide v3, Lc90;->z:J

    .line 7
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 8
    invoke-static {}, Leg0;->e()V

    .line 9
    iget v0, p0, Lcom/upi/axispay/activity/MainActivity;->T:I

    if-eq v0, v2, :cond_0

    const v0, 0x7f12042c

    .line 10
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f12042b

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/upi/axispay/activity/MainActivity;->K0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public u0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->D:Landroidx/appcompat/widget/Toolbar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public final v0()V
    .locals 5

    const v0, 0x7f0a006c

    .line 1
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->F:Landroid/widget/ImageView;

    const v0, 0x7f0a0340

    .line 2
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->G:Landroid/widget/ImageView;

    const v0, 0x7f0a039a

    .line 3
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->H:Landroid/widget/TextView;

    .line 4
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->F:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0493

    .line 5
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->I:Landroid/widget/TextView;

    const v0, 0x7f0a050c

    .line 6
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->M:Landroid/widget/TextView;

    const v0, 0x7f0a028e

    .line 7
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->K:Landroid/widget/LinearLayout;

    .line 8
    new-instance v1, Lcom/upi/axispay/activity/MainActivity$o;

    invoke-direct {v1, p0}, Lcom/upi/axispay/activity/MainActivity$o;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0218

    .line 9
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->J:Landroid/widget/ImageView;

    const/16 v1, 0x8

    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 11
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->J:Landroid/widget/ImageView;

    new-instance v1, Lcom/upi/axispay/activity/MainActivity$p;

    invoke-direct {v1, p0}, Lcom/upi/axispay/activity/MainActivity$p;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a00ac

    .line 12
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->O:Landroid/widget/RelativeLayout;

    const v0, 0x7f0a0276

    .line 13
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->X:Landroid/widget/LinearLayout;

    .line 14
    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0339

    .line 15
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->L:Landroid/widget/LinearLayout;

    .line 16
    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a027a

    .line 17
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->W:Landroid/widget/LinearLayout;

    .line 18
    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0428

    .line 19
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->U:Landroid/widget/Spinner;

    const v0, 0x7f0a018c

    .line 20
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->a0:Landroid/widget/TextView;

    const v0, 0x7f0a018b

    .line 21
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->b0:Landroid/widget/TextView;

    const v0, 0x7f0a054b

    .line 22
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const v3, 0x3537

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const v2, 0x7f1204de

    .line 23
    invoke-virtual {p0, v2, v1}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a028d

    .line 24
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 25
    new-instance v1, Lcom/upi/axispay/activity/MainActivity$q;

    invoke-direct {v1, p0}, Lcom/upi/axispay/activity/MainActivity$q;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    new-instance v0, Landroid/widget/ArrayAdapter;

    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->Z:[Ljava/lang/String;

    const v2, 0x1090008

    invoke-direct {v0, p0, v2, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    const v1, 0x1090009

    .line 27
    invoke-virtual {v0, v1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 28
    iget-object v1, p0, Lcom/upi/axispay/activity/MainActivity;->U:Landroid/widget/Spinner;

    invoke-virtual {v1, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 29
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->U:Landroid/widget/Spinner;

    new-instance v1, Lcom/upi/axispay/activity/MainActivity$r;

    invoke-direct {v1, p0}, Lcom/upi/axispay/activity/MainActivity$r;-><init>(Lcom/upi/axispay/activity/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 30
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->a0:Landroid/widget/TextView;

    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x3538

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity;->b0:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0x3539

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v3, 0x353a

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x2

    const/16 v4, 0xc

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public synthetic x0(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/upi/axispay/activity/MainActivity;->w0(Landroid/view/View;)V

    return-void
.end method

.method public synthetic z0(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/upi/axispay/activity/MainActivity;->y0(Landroid/view/View;)V

    return-void
.end method
