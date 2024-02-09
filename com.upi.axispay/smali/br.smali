.class public final Lbr;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lhr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhr<",
        "Lar;",
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
            "Lzu;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lzu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwh0;Lwh0;Lwh0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Landroid/content/Context;",
            ">;",
            "Lwh0<",
            "Lzu;",
            ">;",
            "Lwh0<",
            "Lzu;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lbr;->a:Lwh0;

    .line 3
    iput-object p2, p0, Lbr;->b:Lwh0;

    .line 4
    iput-object p3, p0, Lbr;->c:Lwh0;

    return-void
.end method

.method public static a(Lwh0;Lwh0;Lwh0;)Lbr;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Landroid/content/Context;",
            ">;",
            "Lwh0<",
            "Lzu;",
            ">;",
            "Lwh0<",
            "Lzu;",
            ">;)",
            "Lbr;"
        }
    .end annotation

    .line 1
    new-instance v0, Lbr;

    invoke-direct {v0, p0, p1, p2}, Lbr;-><init>(Lwh0;Lwh0;Lwh0;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lzu;Lzu;)Lar;
    .locals 1

    .line 1
    new-instance v0, Lar;

    invoke-direct {v0, p0, p1, p2}, Lar;-><init>(Landroid/content/Context;Lzu;Lzu;)V

    return-object v0
.end method


# virtual methods
.method public b()Lar;
    .locals 3

    .line 1
    iget-object v0, p0, Lbr;->a:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lbr;->b:Lwh0;

    invoke-interface {v1}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzu;

    iget-object v2, p0, Lbr;->c:Lwh0;

    invoke-interface {v2}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzu;

    invoke-static {v0, v1, v2}, Lbr;->c(Landroid/content/Context;Lzu;Lzu;)Lar;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbr;->b()Lar;

    move-result-object v0

    return-object v0
.end method
