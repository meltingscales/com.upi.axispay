.class public final Lmq;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lap;


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lvo;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Llq;

.field public final c:Loq;


# direct methods
.method public constructor <init>(Ljava/util/Set;Llq;Loq;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lvo;",
            ">;",
            "Llq;",
            "Loq;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmq;->a:Ljava/util/Set;

    .line 3
    iput-object p2, p0, Lmq;->b:Llq;

    .line 4
    iput-object p3, p0, Lmq;->c:Loq;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Class;Lvo;Lyo;)Lzo;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lvo;",
            "Lyo<",
            "TT;[B>;)",
            "Lzo<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lmq;->a:Ljava/util/Set;

    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2
    new-instance p2, Lnq;

    iget-object v1, p0, Lmq;->b:Llq;

    iget-object v5, p0, Lmq;->c:Loq;

    move-object v0, p2

    move-object v2, p1

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lnq;-><init>(Llq;Ljava/lang/String;Lvo;Lyo;Loq;)V

    return-object p2

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Object;

    const/4 p4, 0x0

    aput-object p3, p2, p4

    const/4 p3, 0x1

    iget-object p4, p0, Lmq;->a:Ljava/util/Set;

    aput-object p4, p2, p3

    const p3, 0x3322

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    .line 4
    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
