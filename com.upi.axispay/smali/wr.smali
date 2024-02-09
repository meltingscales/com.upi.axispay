.class public Lwr;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lyr;


# static fields
.field public static final f:Ljava/util/logging/Logger;


# instance fields
.field public final a:Lbt;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lwq;

.field public final d:Llu;

.field public final e:Lyu;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lpq;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lwr;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lwq;Lbt;Llu;Lyu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwr;->b:Ljava/util/concurrent/Executor;

    .line 3
    iput-object p2, p0, Lwr;->c:Lwq;

    .line 4
    iput-object p3, p0, Lwr;->a:Lbt;

    .line 5
    iput-object p4, p0, Lwr;->d:Llu;

    .line 6
    iput-object p5, p0, Lwr;->e:Lyu;

    return-void
.end method

.method private synthetic b(Llq;Lfq;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lwr;->d:Llu;

    invoke-interface {v0, p1, p2}, Llu;->x(Llq;Lfq;)Lsu;

    .line 2
    iget-object p2, p0, Lwr;->a:Lbt;

    const/4 v0, 0x1

    invoke-interface {p2, p1, v0}, Lbt;->a(Llq;I)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic d(Llq;Lbp;Lfq;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v1, p0, Lwr;->c:Lwq;

    .line 2
    invoke-virtual {p1}, Llq;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lwq;->a(Ljava/lang/String;)Ler;

    move-result-object v1

    if-nez v1, :cond_0

    const v0, 0x17bf

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 3
    invoke-virtual {p1}, Llq;->b()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    .line 4
    invoke-static {p3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 5
    sget-object p3, Lwr;->f:Ljava/util/logging/Logger;

    invoke-virtual {p3, p1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 6
    new-instance p3, Ljava/lang/IllegalArgumentException;

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p3}, Lbp;->a(Ljava/lang/Exception;)V

    return-void

    .line 7
    :cond_0
    invoke-interface {v1, p3}, Ler;->a(Lfq;)Lfq;

    move-result-object p3

    .line 8
    iget-object v1, p0, Lwr;->e:Lyu;

    new-instance v2, Lvr;

    invoke-direct {v2, p0, p1, p3}, Lvr;-><init>(Lwr;Llq;Lfq;)V

    invoke-interface {v1, v2}, Lyu;->b(Lyu$a;)Ljava/lang/Object;

    const/4 p1, 0x0

    .line 9
    invoke-interface {p2, p1}, Lbp;->a(Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 10
    sget-object p3, Lwr;->f:Ljava/util/logging/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x17c0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 11
    invoke-interface {p2, p1}, Lbp;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Llq;Lfq;Lbp;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lwr;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lur;

    invoke-direct {v1, p0, p1, p3, p2}, Lur;-><init>(Lwr;Llq;Lbp;Lfq;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public synthetic c(Llq;Lfq;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lwr;->b(Llq;Lfq;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic e(Llq;Lbp;Lfq;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lwr;->d(Llq;Lbp;Lfq;)V

    return-void
.end method
