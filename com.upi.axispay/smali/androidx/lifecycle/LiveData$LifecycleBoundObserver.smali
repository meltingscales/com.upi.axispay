.class public Landroidx/lifecycle/LiveData$LifecycleBoundObserver;
.super Landroidx/lifecycle/LiveData$b;
.source "AxisPay"

# interfaces
.implements Lcf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/LiveData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LifecycleBoundObserver"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/lifecycle/LiveData<",
        "TT;>.b;",
        "Lcf;"
    }
.end annotation


# instance fields
.field public final e:Lef;

.field public final synthetic f:Landroidx/lifecycle/LiveData;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/LiveData;Lef;Lkf;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lef;",
            "Lkf<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->f:Landroidx/lifecycle/LiveData;

    .line 2
    invoke-direct {p0, p1, p3}, Landroidx/lifecycle/LiveData$b;-><init>(Landroidx/lifecycle/LiveData;Lkf;)V

    .line 3
    iput-object p2, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->e:Lef;

    return-void
.end method


# virtual methods
.method public d(Lef;Lbf$b;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->e:Lef;

    invoke-interface {p1}, Lef;->getLifecycle()Lbf;

    move-result-object p1

    invoke-virtual {p1}, Lbf;->b()Lbf$c;

    move-result-object p1

    .line 2
    sget-object p2, Lbf$c;->b:Lbf$c;

    if-ne p1, p2, :cond_0

    .line 3
    iget-object p1, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->f:Landroidx/lifecycle/LiveData;

    iget-object p2, p0, Landroidx/lifecycle/LiveData$b;->a:Lkf;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/LiveData;->i(Lkf;)V

    return-void

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eq p2, p1, :cond_1

    .line 4
    invoke-virtual {p0}, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->k()Z

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/lifecycle/LiveData$b;->h(Z)V

    .line 5
    iget-object p2, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->e:Lef;

    invoke-interface {p2}, Lef;->getLifecycle()Lbf;

    move-result-object p2

    invoke-virtual {p2}, Lbf;->b()Lbf$c;

    move-result-object p2

    move-object v0, p2

    move-object p2, p1

    move-object p1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public i()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->e:Lef;

    invoke-interface {v0}, Lef;->getLifecycle()Lbf;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbf;->c(Ldf;)V

    return-void
.end method

.method public j(Lef;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->e:Lef;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public k()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->e:Lef;

    invoke-interface {v0}, Lef;->getLifecycle()Lbf;

    move-result-object v0

    invoke-virtual {v0}, Lbf;->b()Lbf$c;

    move-result-object v0

    sget-object v1, Lbf$c;->e:Lbf$c;

    invoke-virtual {v0, v1}, Lbf$c;->a(Lbf$c;)Z

    move-result v0

    return v0
.end method
