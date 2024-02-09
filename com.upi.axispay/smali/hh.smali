.class public final synthetic Lhh;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lyh$g;


# direct methods
.method public synthetic constructor <init>(Lyh$g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhh;->b:Lyh$g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lhh;->b:Lyh$g;

    invoke-virtual {v0}, Lyh$g;->d()V

    return-void
.end method
