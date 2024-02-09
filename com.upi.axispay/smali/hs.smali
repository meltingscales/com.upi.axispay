.class public final synthetic Lhs;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lyu$a;


# instance fields
.field public final synthetic a:Lxs;

.field public final synthetic b:Llq;


# direct methods
.method public synthetic constructor <init>(Lxs;Llq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs;->a:Lxs;

    iput-object p2, p0, Lhs;->b:Llq;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhs;->a:Lxs;

    iget-object v1, p0, Lhs;->b:Llq;

    invoke-virtual {v0, v1}, Lxs;->d(Llq;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
