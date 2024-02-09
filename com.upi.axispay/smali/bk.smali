.class public final synthetic Lbk;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lzk;


# direct methods
.method public synthetic constructor <init>(Lzk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbk;->b:Lzk;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lbk;->b:Lzk;

    invoke-virtual {v0}, Lzk;->m()V

    return-void
.end method
