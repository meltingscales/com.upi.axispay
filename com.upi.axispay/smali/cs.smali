.class public final Lcs;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lhr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhr<",
        "Lbt;",
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
            "Llu;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lws;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lzu;",
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
            "Landroid/content/Context;",
            ">;",
            "Lwh0<",
            "Llu;",
            ">;",
            "Lwh0<",
            "Lws;",
            ">;",
            "Lwh0<",
            "Lzu;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcs;->a:Lwh0;

    .line 3
    iput-object p2, p0, Lcs;->b:Lwh0;

    .line 4
    iput-object p3, p0, Lcs;->c:Lwh0;

    .line 5
    iput-object p4, p0, Lcs;->d:Lwh0;

    return-void
.end method

.method public static a(Lwh0;Lwh0;Lwh0;Lwh0;)Lcs;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Landroid/content/Context;",
            ">;",
            "Lwh0<",
            "Llu;",
            ">;",
            "Lwh0<",
            "Lws;",
            ">;",
            "Lwh0<",
            "Lzu;",
            ">;)",
            "Lcs;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcs;

    invoke-direct {v0, p0, p1, p2, p3}, Lcs;-><init>(Lwh0;Lwh0;Lwh0;Lwh0;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Llu;Lws;Lzu;)Lbt;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lbs;->a(Landroid/content/Context;Llu;Lws;Lzu;)Lbt;

    move-result-object p0

    const p1, 0xcf8

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Ljr;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, Lbt;

    return-object p0
.end method


# virtual methods
.method public b()Lbt;
    .locals 4

    .line 1
    iget-object v0, p0, Lcs;->a:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcs;->b:Lwh0;

    invoke-interface {v1}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llu;

    iget-object v2, p0, Lcs;->c:Lwh0;

    invoke-interface {v2}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lws;

    iget-object v3, p0, Lcs;->d:Lwh0;

    invoke-interface {v3}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzu;

    invoke-static {v0, v1, v2, v3}, Lcs;->c(Landroid/content/Context;Llu;Lws;Lzu;)Lbt;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcs;->b()Lbt;

    move-result-object v0

    return-object v0
.end method
