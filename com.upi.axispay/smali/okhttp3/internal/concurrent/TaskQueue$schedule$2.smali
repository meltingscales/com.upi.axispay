.class public final Lokhttp3/internal/concurrent/TaskQueue$schedule$2;
.super Lokhttp3/internal/concurrent/Task;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/concurrent/TaskQueue;->schedule(Ljava/lang/String;JLsk0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic $block:Lsk0;

.field public final synthetic $name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lsk0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lokhttp3/internal/concurrent/TaskQueue$schedule$2;->$block:Lsk0;

    iput-object p2, p0, Lokhttp3/internal/concurrent/TaskQueue$schedule$2;->$name:Ljava/lang/String;

    const/4 p1, 0x0

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-direct {p0, p3, p1, p2, v0}, Lokhttp3/internal/concurrent/Task;-><init>(Ljava/lang/String;ZILvl0;)V

    return-void
.end method


# virtual methods
.method public runOnce()J
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/internal/concurrent/TaskQueue$schedule$2;->$block:Lsk0;

    invoke-interface {v0}, Lsk0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method
