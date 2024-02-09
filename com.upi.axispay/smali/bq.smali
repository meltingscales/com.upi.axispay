.class public final Lbq;
.super Lqq;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbq$b;
    }
.end annotation


# instance fields
.field public b:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lwh0;

.field public e:Lwh0;

.field public f:Lwh0;

.field public g:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Ltu;",
            ">;"
        }
    .end annotation
.end field

.field public i:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lws;",
            ">;"
        }
    .end annotation
.end field

.field public j:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lbt;",
            ">;"
        }
    .end annotation
.end field

.field public k:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lwr;",
            ">;"
        }
    .end annotation
.end field

.field public l:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lxs;",
            ">;"
        }
    .end annotation
.end field

.field public m:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lzs;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lpq;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lqq;-><init>()V

    .line 3
    invoke-virtual {p0, p1}, Lbq;->m(Landroid/content/Context;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lbq$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbq;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static k()Lqq$a;
    .locals 2

    .line 1
    new-instance v0, Lbq$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbq$b;-><init>(Lbq$a;)V

    return-object v0
.end method


# virtual methods
.method public b()Llu;
    .locals 1

    .line 1
    iget-object v0, p0, Lbq;->h:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llu;

    return-object v0
.end method

.method public j()Lpq;
    .locals 1

    .line 1
    iget-object v0, p0, Lbq;->n:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpq;

    return-object v0
.end method

.method public final m(Landroid/content/Context;)V
    .locals 9

    .line 1
    invoke-static {}, Lhq;->a()Lhq;

    move-result-object v0

    invoke-static {v0}, Lgr;->b(Lwh0;)Lwh0;

    move-result-object v0

    iput-object v0, p0, Lbq;->b:Lwh0;

    .line 2
    invoke-static {p1}, Lir;->a(Ljava/lang/Object;)Lhr;

    move-result-object p1

    iput-object p1, p0, Lbq;->c:Lwh0;

    .line 3
    invoke-static {}, Lbv;->a()Lbv;

    move-result-object v0

    invoke-static {}, Lcv;->a()Lcv;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lbr;->a(Lwh0;Lwh0;Lwh0;)Lbr;

    move-result-object p1

    iput-object p1, p0, Lbq;->d:Lwh0;

    .line 4
    iget-object v0, p0, Lbq;->c:Lwh0;

    invoke-static {v0, p1}, Ldr;->a(Lwh0;Lwh0;)Ldr;

    move-result-object p1

    invoke-static {p1}, Lgr;->b(Lwh0;)Lwh0;

    move-result-object p1

    iput-object p1, p0, Lbq;->e:Lwh0;

    .line 5
    iget-object p1, p0, Lbq;->c:Lwh0;

    invoke-static {}, Lou;->a()Lou;

    move-result-object v0

    invoke-static {}, Lqu;->a()Lqu;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lwu;->a(Lwh0;Lwh0;Lwh0;)Lwu;

    move-result-object p1

    iput-object p1, p0, Lbq;->f:Lwh0;

    .line 6
    iget-object p1, p0, Lbq;->c:Lwh0;

    invoke-static {p1}, Lpu;->a(Lwh0;)Lpu;

    move-result-object p1

    iput-object p1, p0, Lbq;->g:Lwh0;

    .line 7
    invoke-static {}, Lbv;->a()Lbv;

    move-result-object p1

    invoke-static {}, Lcv;->a()Lcv;

    move-result-object v0

    invoke-static {}, Lru;->a()Lru;

    move-result-object v1

    iget-object v2, p0, Lbq;->f:Lwh0;

    iget-object v3, p0, Lbq;->g:Lwh0;

    invoke-static {p1, v0, v1, v2, v3}, Luu;->a(Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;)Luu;

    move-result-object p1

    invoke-static {p1}, Lgr;->b(Lwh0;)Lwh0;

    move-result-object p1

    iput-object p1, p0, Lbq;->h:Lwh0;

    .line 8
    invoke-static {}, Lbv;->a()Lbv;

    move-result-object p1

    invoke-static {p1}, Las;->b(Lwh0;)Las;

    move-result-object p1

    iput-object p1, p0, Lbq;->i:Lwh0;

    .line 9
    iget-object v0, p0, Lbq;->c:Lwh0;

    iget-object v1, p0, Lbq;->h:Lwh0;

    invoke-static {}, Lcv;->a()Lcv;

    move-result-object v2

    invoke-static {v0, v1, p1, v2}, Lcs;->a(Lwh0;Lwh0;Lwh0;Lwh0;)Lcs;

    move-result-object p1

    iput-object p1, p0, Lbq;->j:Lwh0;

    .line 10
    iget-object v0, p0, Lbq;->b:Lwh0;

    iget-object v1, p0, Lbq;->e:Lwh0;

    iget-object v2, p0, Lbq;->h:Lwh0;

    invoke-static {v0, v1, p1, v2, v2}, Lxr;->a(Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;)Lxr;

    move-result-object p1

    iput-object p1, p0, Lbq;->k:Lwh0;

    .line 11
    iget-object v0, p0, Lbq;->c:Lwh0;

    iget-object v1, p0, Lbq;->e:Lwh0;

    iget-object v5, p0, Lbq;->h:Lwh0;

    iget-object v3, p0, Lbq;->j:Lwh0;

    iget-object v4, p0, Lbq;->b:Lwh0;

    invoke-static {}, Lbv;->a()Lbv;

    move-result-object v6

    invoke-static {}, Lcv;->a()Lcv;

    move-result-object v7

    iget-object v8, p0, Lbq;->h:Lwh0;

    move-object v2, v5

    invoke-static/range {v0 .. v8}, Lys;->a(Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;)Lys;

    move-result-object p1

    iput-object p1, p0, Lbq;->l:Lwh0;

    .line 12
    iget-object p1, p0, Lbq;->b:Lwh0;

    iget-object v0, p0, Lbq;->h:Lwh0;

    iget-object v1, p0, Lbq;->j:Lwh0;

    invoke-static {p1, v0, v1, v0}, Lat;->a(Lwh0;Lwh0;Lwh0;Lwh0;)Lat;

    move-result-object p1

    iput-object p1, p0, Lbq;->m:Lwh0;

    .line 13
    invoke-static {}, Lbv;->a()Lbv;

    move-result-object p1

    invoke-static {}, Lcv;->a()Lcv;

    move-result-object v0

    iget-object v1, p0, Lbq;->k:Lwh0;

    iget-object v2, p0, Lbq;->l:Lwh0;

    iget-object v3, p0, Lbq;->m:Lwh0;

    invoke-static {p1, v0, v1, v2, v3}, Lrq;->a(Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;)Lrq;

    move-result-object p1

    invoke-static {p1}, Lgr;->b(Lwh0;)Lwh0;

    move-result-object p1

    iput-object p1, p0, Lbq;->n:Lwh0;

    return-void
.end method
