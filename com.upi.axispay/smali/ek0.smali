.class public abstract Lek0;
.super Lck0;
.source "AxisPay"


# instance fields
.field private final _context:Lyj0;

.field private transient intercepted:Lwj0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwj0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwj0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwj0<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, Lwj0;->getContext()Lyj0;

    move-result-object v0

    :goto_0
    invoke-direct {p0, p1, v0}, Lek0;-><init>(Lwj0;Lyj0;)V

    return-void
.end method

.method public constructor <init>(Lwj0;Lyj0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwj0<",
            "Ljava/lang/Object;",
            ">;",
            "Lyj0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lck0;-><init>(Lwj0;)V

    .line 2
    iput-object p2, p0, Lek0;->_context:Lyj0;

    return-void
.end method


# virtual methods
.method public getContext()Lyj0;
    .locals 1

    .line 1
    iget-object v0, p0, Lek0;->_context:Lyj0;

    invoke-static {v0}, Lyl0;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final intercepted()Lwj0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwj0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lek0;->intercepted:Lwj0;

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p0}, Lek0;->getContext()Lyj0;

    move-result-object v0

    sget-object v1, Lxj0;->a:Lxj0$a;

    invoke-interface {v0, v1}, Lyj0;->c(Lyj0$b;)Lyj0$a;

    move-result-object v0

    check-cast v0, Lxj0;

    if-nez v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p0}, Lxj0;->b(Lwj0;)Lwj0;

    move-result-object v0

    .line 3
    :goto_0
    iput-object v0, p0, Lek0;->intercepted:Lwj0;

    :cond_1
    return-object v0
.end method

.method public releaseIntercepted()V
    .locals 3

    .line 1
    iget-object v0, p0, Lek0;->intercepted:Lwj0;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    .line 2
    invoke-virtual {p0}, Lek0;->getContext()Lyj0;

    move-result-object v1

    sget-object v2, Lxj0;->a:Lxj0$a;

    invoke-interface {v1, v2}, Lyj0;->c(Lyj0$b;)Lyj0$a;

    move-result-object v1

    invoke-static {v1}, Lyl0;->c(Ljava/lang/Object;)V

    check-cast v1, Lxj0;

    invoke-interface {v1, v0}, Lxj0;->a(Lwj0;)V

    .line 3
    :cond_0
    sget-object v0, Ldk0;->b:Ldk0;

    iput-object v0, p0, Lek0;->intercepted:Lwj0;

    return-void
.end method
