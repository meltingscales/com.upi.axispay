.class public Lxg$q$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxg$q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lxg$q;


# direct methods
.method public constructor <init>(Lxg$q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxg$q$a;->b:Lxg$q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lxg$q$a;->b:Lxg$q;

    iget-object v0, v0, Lxg$q;->b:Lxg;

    iget-object v1, v0, Lxg;->M:Lyh$i;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 2
    iput-object v1, v0, Lxg;->M:Lyh$i;

    .line 3
    iget-boolean v1, v0, Lxg;->c0:Z

    if-eqz v1, :cond_0

    .line 4
    iget-boolean v1, v0, Lxg;->d0:Z

    invoke-virtual {v0, v1}, Lxg;->H(Z)V

    :cond_0
    return-void
.end method
