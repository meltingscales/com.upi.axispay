.class public final synthetic Lks;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lyu$a;


# instance fields
.field public final synthetic a:Lxs;

.field public final synthetic b:Ljava/lang/Iterable;

.field public final synthetic c:Llq;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lxs;Ljava/lang/Iterable;Llq;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lks;->a:Lxs;

    iput-object p2, p0, Lks;->b:Ljava/lang/Iterable;

    iput-object p3, p0, Lks;->c:Llq;

    iput-wide p4, p0, Lks;->d:J

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lks;->a:Lxs;

    iget-object v1, p0, Lks;->b:Ljava/lang/Iterable;

    iget-object v2, p0, Lks;->c:Llq;

    iget-wide v3, p0, Lks;->d:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lxs;->h(Ljava/lang/Iterable;Llq;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
