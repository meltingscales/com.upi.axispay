.class public final Lrq;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lhr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhr<",
        "Lpq;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lzu;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lzu;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lyr;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lxs;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lzs;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Lzu;",
            ">;",
            "Lwh0<",
            "Lzu;",
            ">;",
            "Lwh0<",
            "Lyr;",
            ">;",
            "Lwh0<",
            "Lxs;",
            ">;",
            "Lwh0<",
            "Lzs;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lrq;->a:Lwh0;

    .line 3
    iput-object p2, p0, Lrq;->b:Lwh0;

    .line 4
    iput-object p3, p0, Lrq;->c:Lwh0;

    .line 5
    iput-object p4, p0, Lrq;->d:Lwh0;

    .line 6
    iput-object p5, p0, Lrq;->e:Lwh0;

    return-void
.end method

.method public static a(Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;)Lrq;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Lzu;",
            ">;",
            "Lwh0<",
            "Lzu;",
            ">;",
            "Lwh0<",
            "Lyr;",
            ">;",
            "Lwh0<",
            "Lxs;",
            ">;",
            "Lwh0<",
            "Lzs;",
            ">;)",
            "Lrq;"
        }
    .end annotation

    .line 1
    new-instance v6, Lrq;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lrq;-><init>(Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;)V

    return-object v6
.end method

.method public static c(Lzu;Lzu;Lyr;Lxs;Lzs;)Lpq;
    .locals 7

    .line 1
    new-instance v6, Lpq;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lpq;-><init>(Lzu;Lzu;Lyr;Lxs;Lzs;)V

    return-object v6
.end method


# virtual methods
.method public b()Lpq;
    .locals 5

    .line 1
    iget-object v0, p0, Lrq;->a:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzu;

    iget-object v1, p0, Lrq;->b:Lwh0;

    invoke-interface {v1}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzu;

    iget-object v2, p0, Lrq;->c:Lwh0;

    invoke-interface {v2}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyr;

    iget-object v3, p0, Lrq;->d:Lwh0;

    invoke-interface {v3}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxs;

    iget-object v4, p0, Lrq;->e:Lwh0;

    invoke-interface {v4}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lzs;

    invoke-static {v0, v1, v2, v3, v4}, Lrq;->c(Lzu;Lzu;Lyr;Lxs;Lzs;)Lpq;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrq;->b()Lpq;

    move-result-object v0

    return-object v0
.end method
