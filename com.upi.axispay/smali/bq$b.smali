.class public final Lbq$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lqq$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lbq$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lbq$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lqq;
    .locals 3

    .line 1
    iget-object v0, p0, Lbq$b;->a:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Ljr;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 2
    new-instance v0, Lbq;

    iget-object v1, p0, Lbq$b;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbq;-><init>(Landroid/content/Context;Lbq$a;)V

    return-object v0
.end method

.method public bridge synthetic b(Landroid/content/Context;)Lqq$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lbq$b;->c(Landroid/content/Context;)Lbq$b;

    return-object p0
.end method

.method public c(Landroid/content/Context;)Lbq$b;
    .locals 0

    .line 1
    invoke-static {p1}, Ljr;->b(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lbq$b;->a:Landroid/content/Context;

    return-object p0
.end method
