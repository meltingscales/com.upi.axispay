.class public final Lys;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lhr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhr<",
        "Lxs;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lwq;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Llu;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lbt;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lyu;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lzu;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lzu;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lku;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Landroid/content/Context;",
            ">;",
            "Lwh0<",
            "Lwq;",
            ">;",
            "Lwh0<",
            "Llu;",
            ">;",
            "Lwh0<",
            "Lbt;",
            ">;",
            "Lwh0<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lwh0<",
            "Lyu;",
            ">;",
            "Lwh0<",
            "Lzu;",
            ">;",
            "Lwh0<",
            "Lzu;",
            ">;",
            "Lwh0<",
            "Lku;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lys;->a:Lwh0;

    .line 3
    iput-object p2, p0, Lys;->b:Lwh0;

    .line 4
    iput-object p3, p0, Lys;->c:Lwh0;

    .line 5
    iput-object p4, p0, Lys;->d:Lwh0;

    .line 6
    iput-object p5, p0, Lys;->e:Lwh0;

    .line 7
    iput-object p6, p0, Lys;->f:Lwh0;

    .line 8
    iput-object p7, p0, Lys;->g:Lwh0;

    .line 9
    iput-object p8, p0, Lys;->h:Lwh0;

    .line 10
    iput-object p9, p0, Lys;->i:Lwh0;

    return-void
.end method

.method public static a(Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;)Lys;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Landroid/content/Context;",
            ">;",
            "Lwh0<",
            "Lwq;",
            ">;",
            "Lwh0<",
            "Llu;",
            ">;",
            "Lwh0<",
            "Lbt;",
            ">;",
            "Lwh0<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lwh0<",
            "Lyu;",
            ">;",
            "Lwh0<",
            "Lzu;",
            ">;",
            "Lwh0<",
            "Lzu;",
            ">;",
            "Lwh0<",
            "Lku;",
            ">;)",
            "Lys;"
        }
    .end annotation

    .line 1
    new-instance v10, Lys;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lys;-><init>(Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;)V

    return-object v10
.end method

.method public static c(Landroid/content/Context;Lwq;Llu;Lbt;Ljava/util/concurrent/Executor;Lyu;Lzu;Lzu;Lku;)Lxs;
    .locals 11

    .line 1
    new-instance v10, Lxs;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lxs;-><init>(Landroid/content/Context;Lwq;Llu;Lbt;Ljava/util/concurrent/Executor;Lyu;Lzu;Lzu;Lku;)V

    return-object v10
.end method


# virtual methods
.method public b()Lxs;
    .locals 10

    .line 1
    iget-object v0, p0, Lys;->a:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Lys;->b:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lwq;

    iget-object v0, p0, Lys;->c:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Llu;

    iget-object v0, p0, Lys;->d:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lbt;

    iget-object v0, p0, Lys;->e:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lys;->f:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lyu;

    iget-object v0, p0, Lys;->g:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lzu;

    iget-object v0, p0, Lys;->h:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lzu;

    iget-object v0, p0, Lys;->i:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lku;

    invoke-static/range {v1 .. v9}, Lys;->c(Landroid/content/Context;Lwq;Llu;Lbt;Ljava/util/concurrent/Executor;Lyu;Lzu;Lzu;Lku;)Lxs;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lys;->b()Lxs;

    move-result-object v0

    return-object v0
.end method
