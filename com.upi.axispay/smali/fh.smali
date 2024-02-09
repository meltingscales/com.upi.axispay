.class public final synthetic Lfh;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lrh$c;


# direct methods
.method public synthetic constructor <init>(Lrh$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfh;->b:Lrh$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lfh;->b:Lrh$c;

    invoke-virtual {v0}, Lrh$c;->s()V

    return-void
.end method
