.class public final Lp80$a;
.super Ljava/util/concurrent/FutureTask;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp80;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/FutureTask<",
        "Lw70;",
        ">;",
        "Ljava/lang/Comparable<",
        "Lp80$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lw70;


# direct methods
.method public constructor <init>(Lw70;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 2
    iput-object p1, p0, Lp80$a;->b:Lw70;

    return-void
.end method


# virtual methods
.method public b(Lp80$a;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lp80$a;->b:Lw70;

    invoke-virtual {v0}, Lw70;->r()Ln80$f;

    move-result-object v0

    .line 2
    iget-object v1, p1, Lp80$a;->b:Lw70;

    invoke-virtual {v1}, Lw70;->r()Ln80$f;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lp80$a;->b:Lw70;

    iget v0, v0, Lw70;->b:I

    iget-object p1, p1, Lp80$a;->b:Lw70;

    iget p1, p1, Lw70;->b:I

    sub-int/2addr v0, p1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sub-int v0, p1, v0

    :goto_0
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lp80$a;

    invoke-virtual {p0, p1}, Lp80$a;->b(Lp80$a;)I

    move-result p1

    return p1
.end method
