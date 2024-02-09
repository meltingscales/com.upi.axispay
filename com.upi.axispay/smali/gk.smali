.class public final synthetic Lgk;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ltk;


# direct methods
.method public synthetic constructor <init>(Ltk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgk;->b:Ltk;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lgk;->b:Ltk;

    invoke-virtual {v0}, Ltk;->g()V

    return-void
.end method
