.class public final synthetic Lis;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lyu$a;


# instance fields
.field public final synthetic a:Lxs;

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lxs;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lis;->a:Lxs;

    iput-object p2, p0, Lis;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lis;->a:Lxs;

    iget-object v1, p0, Lis;->b:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lxs;->n(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
