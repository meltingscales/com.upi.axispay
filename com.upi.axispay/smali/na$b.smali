.class public Lna$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lwa;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lna;->d(Landroid/content/Context;Lma;ILjava/util/concurrent/Executor;Lja;)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwa<",
        "Lna$e;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lja;


# direct methods
.method public constructor <init>(Lja;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lna$b;->a:Lja;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lna$e;

    invoke-virtual {p0, p1}, Lna$b;->b(Lna$e;)V

    return-void
.end method

.method public b(Lna$e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lna$b;->a:Lja;

    invoke-virtual {v0, p1}, Lja;->b(Lna$e;)V

    return-void
.end method
