.class public final Lgr;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lwh0;
.implements Lfr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lwh0<",
        "TT;>;",
        "Lfr<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final c:Ljava/lang/Object;


# instance fields
.field public volatile a:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public volatile b:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lgr;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwh0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lgr;->c:Ljava/lang/Object;

    iput-object v0, p0, Lgr;->b:Ljava/lang/Object;

    .line 3
    iput-object p1, p0, Lgr;->a:Lwh0;

    return-void
.end method

.method public static a(Lwh0;)Lfr;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P::",
            "Lwh0<",
            "TT;>;T:",
            "Ljava/lang/Object;",
            ">(TP;)",
            "Lfr<",
            "TT;>;"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Lfr;

    if-eqz v0, :cond_0

    .line 2
    check-cast p0, Lfr;

    return-object p0

    .line 3
    :cond_0
    new-instance v0, Lgr;

    invoke-static {p0}, Ljr;->b(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Lwh0;

    invoke-direct {v0, p0}, Lgr;-><init>(Lwh0;)V

    return-object v0
.end method

.method public static b(Lwh0;)Lwh0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P::",
            "Lwh0<",
            "TT;>;T:",
            "Ljava/lang/Object;",
            ">(TP;)",
            "Lwh0<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Ljr;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    instance-of v0, p0, Lgr;

    if-eqz v0, :cond_0

    return-object p0

    .line 3
    :cond_0
    new-instance v0, Lgr;

    invoke-direct {v0, p0}, Lgr;-><init>(Lwh0;)V

    return-object v0
.end method

.method public static c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lgr;->c:Ljava/lang/Object;

    if-eq p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    if-ne p0, p1, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x1a80

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const p0, 0x1a81

    invoke-static {p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const p0, 0x1a82

    invoke-static {p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    return-object p1
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lgr;->b:Ljava/lang/Object;

    .line 2
    sget-object v1, Lgr;->c:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, p0, Lgr;->b:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    .line 5
    iget-object v0, p0, Lgr;->a:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lgr;->b:Ljava/lang/Object;

    invoke-static {v1, v0}, Lgr;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Lgr;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lgr;->a:Lwh0;

    .line 8
    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method
