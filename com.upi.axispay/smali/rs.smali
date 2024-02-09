.class public final synthetic Lrs;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lyu$a;


# instance fields
.field public final synthetic a:Lku;


# direct methods
.method public synthetic constructor <init>(Lku;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrs;->a:Lku;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrs;->a:Lku;

    invoke-interface {v0}, Lku;->j()Lkr;

    move-result-object v0

    return-object v0
.end method
