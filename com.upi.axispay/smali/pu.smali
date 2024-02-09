.class public final Lpu;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lhr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhr<",
        "Ljava/lang/String;",
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


# direct methods
.method public constructor <init>(Lwh0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lpu;->a:Lwh0;

    return-void
.end method

.method public static a(Lwh0;)Lpu;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Landroid/content/Context;",
            ">;)",
            "Lpu;"
        }
    .end annotation

    .line 1
    new-instance v0, Lpu;

    invoke-direct {v0, p0}, Lpu;-><init>(Lwh0;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lnu;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    const v0, 0x3d71

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ljr;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lpu;->a:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lpu;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lpu;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
