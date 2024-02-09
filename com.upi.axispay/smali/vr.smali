.class public final synthetic Lvr;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lyu$a;


# instance fields
.field public final synthetic a:Lwr;

.field public final synthetic b:Llq;

.field public final synthetic c:Lfq;


# direct methods
.method public synthetic constructor <init>(Lwr;Llq;Lfq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvr;->a:Lwr;

    iput-object p2, p0, Lvr;->b:Llq;

    iput-object p3, p0, Lvr;->c:Lfq;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lvr;->a:Lwr;

    iget-object v1, p0, Lvr;->b:Llq;

    iget-object v2, p0, Lvr;->c:Lfq;

    invoke-virtual {v0, v1, v2}, Lwr;->c(Llq;Lfq;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
