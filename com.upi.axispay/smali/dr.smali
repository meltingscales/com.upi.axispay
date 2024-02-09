.class public final Ldr;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lhr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhr<",
        "Lcr;",
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
            "Lar;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwh0;Lwh0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Landroid/content/Context;",
            ">;",
            "Lwh0<",
            "Lar;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldr;->a:Lwh0;

    .line 3
    iput-object p2, p0, Ldr;->b:Lwh0;

    return-void
.end method

.method public static a(Lwh0;Lwh0;)Ldr;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Landroid/content/Context;",
            ">;",
            "Lwh0<",
            "Lar;",
            ">;)",
            "Ldr;"
        }
    .end annotation

    .line 1
    new-instance v0, Ldr;

    invoke-direct {v0, p0, p1}, Ldr;-><init>(Lwh0;Lwh0;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/Object;)Lcr;
    .locals 1

    .line 1
    new-instance v0, Lcr;

    check-cast p1, Lar;

    invoke-direct {v0, p0, p1}, Lcr;-><init>(Landroid/content/Context;Lar;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcr;
    .locals 2

    .line 1
    iget-object v0, p0, Ldr;->a:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Ldr;->b:Lwh0;

    invoke-interface {v1}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ldr;->c(Landroid/content/Context;Ljava/lang/Object;)Lcr;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldr;->b()Lcr;

    move-result-object v0

    return-object v0
.end method
