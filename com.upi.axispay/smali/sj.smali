.class public final synthetic Lsj;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lvk;


# direct methods
.method public synthetic constructor <init>(Lvk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsj;->b:Lvk;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lsj;->b:Lvk;

    invoke-virtual {v0}, Lvk;->w()V

    return-void
.end method
