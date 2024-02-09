.class public final Lqh0$b;
.super Lzl0;
.source "AxisPay"

# interfaces
.implements Lsk0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqh0;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lzl0;",
        "Lsk0<",
        "Lvh0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lqh0;


# direct methods
.method public constructor <init>(Lqh0;)V
    .locals 0

    iput-object p1, p0, Lqh0$b;->b:Lqh0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lzl0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lvh0;
    .locals 4

    .line 1
    new-instance v0, Lvh0;

    .line 2
    iget-object v1, p0, Lqh0$b;->b:Lqh0;

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x1a2e

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lyl0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lqh0$b;->b:Lqh0;

    const/4 v3, 0x0

    .line 3
    invoke-direct {v0, v1, v2, v3}, Lvh0;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Z)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqh0$b;->b()Lvh0;

    move-result-object v0

    return-object v0
.end method
