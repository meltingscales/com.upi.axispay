.class public Lkj$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static d:Lab;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lab<",
            "Lkj$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:I

.field public b:Landroidx/recyclerview/widget/RecyclerView$m$c;

.field public c:Landroidx/recyclerview/widget/RecyclerView$m$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lbb;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lbb;-><init>(I)V

    sput-object v0, Lkj$a;->d:Lab;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 1

    .line 1
    :goto_0
    sget-object v0, Lkj$a;->d:Lab;

    invoke-interface {v0}, Lab;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static b()Lkj$a;
    .locals 1

    .line 1
    sget-object v0, Lkj$a;->d:Lab;

    invoke-interface {v0}, Lab;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkj$a;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lkj$a;

    invoke-direct {v0}, Lkj$a;-><init>()V

    :cond_0
    return-object v0
.end method

.method public static c(Lkj$a;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lkj$a;->a:I

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lkj$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 3
    iput-object v0, p0, Lkj$a;->c:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 4
    sget-object v0, Lkj$a;->d:Lab;

    invoke-interface {v0, p0}, Lab;->a(Ljava/lang/Object;)Z

    return-void
.end method
