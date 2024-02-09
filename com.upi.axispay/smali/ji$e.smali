.class public Lji$e;
.super Lji;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lji;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lji$e$b;,
        Lji$e$a;
    }
.end annotation


# static fields
.field public static final l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/content/IntentFilter;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final i:Landroid/media/AudioManager;

.field public final j:Lji$e$b;

.field public k:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const v1, 0x1e02

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    const v1, 0x1e03

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sput-object v1, Lji$e;->l:Ljava/util/ArrayList;

    .line 5
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lji;-><init>(Landroid/content/Context;)V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lji$e;->k:I

    const v0, 0x1e04

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lji$e;->i:Landroid/media/AudioManager;

    .line 4
    new-instance v0, Lji$e$b;

    invoke-direct {v0, p0}, Lji$e$b;-><init>(Lji$e;)V

    iput-object v0, p0, Lji$e;->j:Lji$e$b;

    .line 5
    new-instance v1, Landroid/content/IntentFilter;

    const v2, 0x1e05

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 6
    invoke-virtual {p0}, Lji$e;->F()V

    return-void
.end method


# virtual methods
.method public F()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Luh;->n()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lji$e;->i:Landroid/media/AudioManager;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v1

    .line 3
    iget-object v3, p0, Lji$e;->i:Landroid/media/AudioManager;

    invoke-virtual {v3, v2}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v3

    iput v3, p0, Lji$e;->k:I

    .line 4
    new-instance v3, Lsh$a;

    sget v4, Lrg;->mr_system_route_name:I

    .line 5
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v4, 0x1e06

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v0}, Lsh$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lji$e;->l:Ljava/util/ArrayList;

    .line 6
    invoke-virtual {v3, v0}, Lsh$a;->b(Ljava/util/Collection;)Lsh$a;

    .line 7
    invoke-virtual {v3, v2}, Lsh$a;->o(I)Lsh$a;

    const/4 v0, 0x0

    .line 8
    invoke-virtual {v3, v0}, Lsh$a;->p(I)Lsh$a;

    const/4 v0, 0x1

    .line 9
    invoke-virtual {v3, v0}, Lsh$a;->s(I)Lsh$a;

    .line 10
    invoke-virtual {v3, v1}, Lsh$a;->t(I)Lsh$a;

    iget v0, p0, Lji$e;->k:I

    .line 11
    invoke-virtual {v3, v0}, Lsh$a;->r(I)Lsh$a;

    .line 12
    invoke-virtual {v3}, Lsh$a;->e()Lsh;

    move-result-object v0

    .line 13
    new-instance v1, Lvh$a;

    invoke-direct {v1}, Lvh$a;-><init>()V

    .line 14
    invoke-virtual {v1, v0}, Lvh$a;->a(Lsh;)Lvh$a;

    .line 15
    invoke-virtual {v1}, Lvh$a;->c()Lvh;

    move-result-object v0

    .line 16
    invoke-virtual {p0, v0}, Luh;->x(Lvh;)V

    return-void
.end method

.method public t(Ljava/lang/String;)Luh$e;
    .locals 1

    const v0, 0x1e07

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    new-instance p1, Lji$e$a;

    invoke-direct {p1, p0}, Lji$e$a;-><init>(Lji$e;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
