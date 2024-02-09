.class public final synthetic Lur;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lwr;

.field public final synthetic c:Llq;

.field public final synthetic d:Lbp;

.field public final synthetic e:Lfq;


# direct methods
.method public synthetic constructor <init>(Lwr;Llq;Lbp;Lfq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lur;->b:Lwr;

    iput-object p2, p0, Lur;->c:Llq;

    iput-object p3, p0, Lur;->d:Lbp;

    iput-object p4, p0, Lur;->e:Lfq;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lur;->b:Lwr;

    iget-object v1, p0, Lur;->c:Llq;

    iget-object v2, p0, Lur;->d:Lbp;

    iget-object v3, p0, Lur;->e:Lfq;

    invoke-virtual {v0, v1, v2, v3}, Lwr;->e(Llq;Lbp;Lfq;)V

    return-void
.end method
