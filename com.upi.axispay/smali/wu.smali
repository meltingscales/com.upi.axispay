.class public final Lwu;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lhr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhr<",
        "Lvu;",
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
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Ljava/lang/Integer;",
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
            "Ljava/lang/String;",
            ">;",
            "Lwh0<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwu;->a:Lwh0;

    .line 3
    iput-object p2, p0, Lwu;->b:Lwh0;

    .line 4
    iput-object p3, p0, Lwu;->c:Lwh0;

    return-void
.end method

.method public static a(Lwh0;Lwh0;Lwh0;)Lwu;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Landroid/content/Context;",
            ">;",
            "Lwh0<",
            "Ljava/lang/String;",
            ">;",
            "Lwh0<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lwu;"
        }
    .end annotation

    .line 1
    new-instance v0, Lwu;

    invoke-direct {v0, p0, p1, p2}, Lwu;-><init>(Lwh0;Lwh0;Lwh0;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;I)Lvu;
    .locals 1

    .line 1
    new-instance v0, Lvu;

    invoke-direct {v0, p0, p1, p2}, Lvu;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public b()Lvu;
    .locals 3

    .line 1
    iget-object v0, p0, Lwu;->a:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lwu;->b:Lwh0;

    invoke-interface {v1}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lwu;->c:Lwh0;

    invoke-interface {v2}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v0, v1, v2}, Lwu;->c(Landroid/content/Context;Ljava/lang/String;I)Lvu;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwu;->b()Lvu;

    move-result-object v0

    return-object v0
.end method
