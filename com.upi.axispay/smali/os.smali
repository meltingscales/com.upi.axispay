.class public final synthetic Los;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lyu$a;


# instance fields
.field public final synthetic a:Lxs;


# direct methods
.method public synthetic constructor <init>(Lxs;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Los;->a:Lxs;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Los;->a:Lxs;

    invoke-virtual {v0}, Lxs;->l()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
