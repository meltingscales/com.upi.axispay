.class public final Lyh$e$f;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyh$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "f"
.end annotation


# instance fields
.field public final a:Lii;

.field public final synthetic b:Lyh$e;


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyh$e$f;->a:Lii;

    iget-object v1, p0, Lyh$e$f;->b:Lyh$e;

    iget-object v1, v1, Lyh$e;->i:Lii$a;

    invoke-virtual {v0, v1}, Lii;->a(Lii$a;)V

    return-void
.end method
