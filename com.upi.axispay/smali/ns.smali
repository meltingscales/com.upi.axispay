.class public final synthetic Lns;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lyu$a;


# instance fields
.field public final synthetic a:Lxs;

.field public final synthetic b:Llq;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lxs;Llq;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lns;->a:Lxs;

    iput-object p2, p0, Lns;->b:Llq;

    iput p3, p0, Lns;->c:I

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lns;->a:Lxs;

    iget-object v1, p0, Lns;->b:Llq;

    iget v2, p0, Lns;->c:I

    invoke-virtual {v0, v1, v2}, Lxs;->r(Llq;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
