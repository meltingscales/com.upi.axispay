.class public Lqd$l;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "l"
.end annotation


# instance fields
.field public final a:Lpe$e;

.field public final b:Laa;


# direct methods
.method public constructor <init>(Lpe$e;Laa;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lqd$l;->a:Lpe$e;

    .line 3
    iput-object p2, p0, Lqd$l;->b:Laa;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lqd$l;->a:Lpe$e;

    iget-object v1, p0, Lqd$l;->b:Laa;

    invoke-virtual {v0, v1}, Lpe$e;->d(Laa;)V

    return-void
.end method

.method public b()Lpe$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd$l;->a:Lpe$e;

    return-object v0
.end method

.method public c()Laa;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd$l;->b:Laa;

    return-object v0
.end method

.method public d()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lqd$l;->a:Lpe$e;

    .line 2
    invoke-virtual {v0}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 3
    invoke-static {v0}, Lpe$e$c;->c(Landroid/view/View;)Lpe$e$c;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lqd$l;->a:Lpe$e;

    invoke-virtual {v1}, Lpe$e;->e()Lpe$e$c;

    move-result-object v1

    if-eq v0, v1, :cond_1

    .line 5
    sget-object v2, Lpe$e$c;->c:Lpe$e$c;

    if-eq v0, v2, :cond_0

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
