.class public final Lat;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lhr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhr<",
        "Lzs;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Llu;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lbt;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lyu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwh0;Lwh0;Lwh0;Lwh0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lwh0<",
            "Llu;",
            ">;",
            "Lwh0<",
            "Lbt;",
            ">;",
            "Lwh0<",
            "Lyu;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lat;->a:Lwh0;

    .line 3
    iput-object p2, p0, Lat;->b:Lwh0;

    .line 4
    iput-object p3, p0, Lat;->c:Lwh0;

    .line 5
    iput-object p4, p0, Lat;->d:Lwh0;

    return-void
.end method

.method public static a(Lwh0;Lwh0;Lwh0;Lwh0;)Lat;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lwh0<",
            "Llu;",
            ">;",
            "Lwh0<",
            "Lbt;",
            ">;",
            "Lwh0<",
            "Lyu;",
            ">;)",
            "Lat;"
        }
    .end annotation

    .line 1
    new-instance v0, Lat;

    invoke-direct {v0, p0, p1, p2, p3}, Lat;-><init>(Lwh0;Lwh0;Lwh0;Lwh0;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;Llu;Lbt;Lyu;)Lzs;
    .locals 1

    .line 1
    new-instance v0, Lzs;

    invoke-direct {v0, p0, p1, p2, p3}, Lzs;-><init>(Ljava/util/concurrent/Executor;Llu;Lbt;Lyu;)V

    return-object v0
.end method


# virtual methods
.method public b()Lzs;
    .locals 4

    .line 1
    iget-object v0, p0, Lat;->a:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lat;->b:Lwh0;

    invoke-interface {v1}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llu;

    iget-object v2, p0, Lat;->c:Lwh0;

    invoke-interface {v2}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbt;

    iget-object v3, p0, Lat;->d:Lwh0;

    invoke-interface {v3}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lyu;

    invoke-static {v0, v1, v2, v3}, Lat;->c(Ljava/util/concurrent/Executor;Llu;Lbt;Lyu;)Lzs;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lat;->b()Lzs;

    move-result-object v0

    return-object v0
.end method
