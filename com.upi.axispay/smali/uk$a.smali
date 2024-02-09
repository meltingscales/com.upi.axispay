.class public Luk$a;
.super Lpk$a;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Luk;


# direct methods
.method public constructor <init>(Luk;)V
    .locals 0

    .line 1
    iput-object p1, p0, Luk$a;->a:Luk;

    invoke-direct {p0}, Lpk$a;-><init>()V

    return-void
.end method


# virtual methods
.method public b([Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Luk$a;->a:Luk;

    iget-object v0, v0, Luk;->g:Ljava/util/concurrent/Executor;

    new-instance v1, Luk$a$a;

    invoke-direct {v1, p0, p1}, Luk$a$a;-><init>(Luk$a;[Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
