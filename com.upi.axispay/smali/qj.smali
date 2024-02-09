.class public final synthetic Lqj;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lb4;


# instance fields
.field public final synthetic a:Ljk$b;

.field public final synthetic b:Lb4;


# direct methods
.method public synthetic constructor <init>(Ljk$b;Lb4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqj;->a:Ljk$b;

    iput-object p2, p0, Lqj;->b:Lb4;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqj;->a:Ljk$b;

    iget-object v1, p0, Lqj;->b:Lb4;

    check-cast p1, Lbm;

    invoke-virtual {v0, v1, p1}, Ljk$b;->m(Lb4;Lbm;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
