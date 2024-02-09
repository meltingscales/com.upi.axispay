.class public final synthetic Lls;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lyu$a;


# instance fields
.field public final synthetic a:Lxs;

.field public final synthetic b:Llq;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lxs;Llq;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lls;->a:Lxs;

    iput-object p2, p0, Lls;->b:Llq;

    iput-wide p3, p0, Lls;->c:J

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lls;->a:Lxs;

    iget-object v1, p0, Lls;->b:Llq;

    iget-wide v2, p0, Lls;->c:J

    invoke-virtual {v0, v1, v2, v3}, Lxs;->p(Llq;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
