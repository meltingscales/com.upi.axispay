.class public final Lc2;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final b:Landroid/graphics/PorterDuff$Mode;

.field public static c:Lc2;


# instance fields
.field public a:Le3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    sput-object v0, Lc2;->b:Landroid/graphics/PorterDuff$Mode;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    sget-object v0, Lc2;->b:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public static declared-synchronized b()Lc2;
    .locals 2

    const-class v0, Lc2;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lc2;->c:Lc2;

    if-nez v1, :cond_0

    .line 2
    invoke-static {}, Lc2;->h()V

    .line 3
    :cond_0
    sget-object v1, Lc2;->c:Lc2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized e(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 1

    const-class v0, Lc2;

    monitor-enter v0

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Le3;->l(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized h()V
    .locals 3

    const-class v0, Lc2;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lc2;->c:Lc2;

    if-nez v1, :cond_0

    .line 2
    new-instance v1, Lc2;

    invoke-direct {v1}, Lc2;-><init>()V

    sput-object v1, Lc2;->c:Lc2;

    .line 3
    invoke-static {}, Le3;->h()Le3;

    move-result-object v2

    iput-object v2, v1, Lc2;->a:Le3;

    .line 4
    sget-object v1, Lc2;->c:Lc2;

    iget-object v1, v1, Lc2;->a:Le3;

    new-instance v2, Lc2$a;

    invoke-direct {v2}, Lc2$a;-><init>()V

    invoke-virtual {v1, v2}, Le3;->u(Le3$f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static i(Landroid/graphics/drawable/Drawable;Lm3;[I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Le3;->w(Landroid/graphics/drawable/Drawable;Lm3;[I)V

    return-void
.end method


# virtual methods
.method public declared-synchronized c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lc2;->a:Le3;

    invoke-virtual {v0, p1, p2}, Le3;->j(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized d(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lc2;->a:Le3;

    invoke-virtual {v0, p1, p2, p3}, Le3;->k(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lc2;->a:Le3;

    invoke-virtual {v0, p1, p2}, Le3;->m(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized g(Landroid/content/Context;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lc2;->a:Le3;

    invoke-virtual {v0, p1}, Le3;->s(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
