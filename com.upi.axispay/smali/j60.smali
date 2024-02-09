.class public Lj60;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final b:Ljava/lang/String;

.field public static volatile c:Lj60;


# instance fields
.field public a:Lk60;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lj60;

    const v1, 0xff

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lj60;
    .locals 2

    .line 1
    sget-object v0, Lj60;->c:Lj60;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lj60;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lj60;->c:Lj60;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lj60;

    invoke-direct {v1}, Lj60;-><init>()V

    sput-object v1, Lj60;->c:Lj60;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lj60;->c:Lj60;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized b(Lk60;)V
    .locals 3

    monitor-enter p0

    if-eqz p1, :cond_1

    .line 1
    :try_start_0
    iget-object v1, p0, Lj60;->a:Lk60;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const v0, 0x3c29

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    .line 2
    invoke-static {v1, v2}, Ly60;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    new-instance v1, Ll60;

    invoke-direct {v1, p1}, Ll60;-><init>(Lk60;)V

    .line 4
    iput-object p1, p0, Lj60;->a:Lk60;

    goto :goto_0

    :cond_0
    const v0, 0x3c2a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    new-array v1, v2, [Ljava/lang/Object;

    .line 5
    invoke-static {p1, v1}, Ly60;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 7
    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x3c2b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit p0

    throw p1
.end method
