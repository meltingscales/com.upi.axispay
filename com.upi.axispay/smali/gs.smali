.class public final synthetic Lgs;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lxs;

.field public final synthetic c:Llq;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lxs;Llq;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgs;->b:Lxs;

    iput-object p2, p0, Lgs;->c:Llq;

    iput p3, p0, Lgs;->d:I

    iput-object p4, p0, Lgs;->e:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lgs;->b:Lxs;

    iget-object v1, p0, Lgs;->c:Llq;

    iget v2, p0, Lgs;->d:I

    iget-object v3, p0, Lgs;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, v2, v3}, Lxs;->t(Llq;ILjava/lang/Runnable;)V

    return-void
.end method
