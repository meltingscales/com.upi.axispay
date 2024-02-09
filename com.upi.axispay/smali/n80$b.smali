.class public Ln80$b;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln80;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Ld80;

.field public c:Ljava/util/concurrent/ExecutorService;

.field public d:Lx70;

.field public e:Ln80$d;

.field public f:Ln80$g;

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls80;",
            ">;"
        }
    .end annotation
.end field

.field public h:Landroid/graphics/Bitmap$Config;

.field public i:Z

.field public j:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ln80$b;->a:Landroid/content/Context;

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x6a4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Ln80;
    .locals 14

    .line 1
    iget-object v7, p0, Ln80$b;->a:Landroid/content/Context;

    .line 2
    iget-object v0, p0, Ln80$b;->b:Ld80;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lm80;

    invoke-direct {v0, v7}, Lm80;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ln80$b;->b:Ld80;

    .line 4
    :cond_0
    iget-object v0, p0, Ln80$b;->d:Lx70;

    if-nez v0, :cond_1

    .line 5
    new-instance v0, Lg80;

    invoke-direct {v0, v7}, Lg80;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ln80$b;->d:Lx70;

    .line 6
    :cond_1
    iget-object v0, p0, Ln80$b;->c:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_2

    .line 7
    new-instance v0, Lp80;

    invoke-direct {v0}, Lp80;-><init>()V

    iput-object v0, p0, Ln80$b;->c:Ljava/util/concurrent/ExecutorService;

    .line 8
    :cond_2
    iget-object v0, p0, Ln80$b;->f:Ln80$g;

    if-nez v0, :cond_3

    .line 9
    sget-object v0, Ln80$g;->a:Ln80$g;

    iput-object v0, p0, Ln80$b;->f:Ln80$g;

    .line 10
    :cond_3
    new-instance v8, Lu80;

    iget-object v0, p0, Ln80$b;->d:Lx70;

    invoke-direct {v8, v0}, Lu80;-><init>(Lx70;)V

    .line 11
    new-instance v9, Lc80;

    iget-object v2, p0, Ln80$b;->c:Ljava/util/concurrent/ExecutorService;

    sget-object v3, Ln80;->p:Landroid/os/Handler;

    iget-object v4, p0, Ln80$b;->b:Ld80;

    iget-object v5, p0, Ln80$b;->d:Lx70;

    move-object v0, v9

    move-object v1, v7

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Lc80;-><init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;Landroid/os/Handler;Ld80;Lx70;Lu80;)V

    .line 12
    new-instance v11, Ln80;

    iget-object v3, p0, Ln80$b;->d:Lx70;

    iget-object v4, p0, Ln80$b;->e:Ln80$d;

    iget-object v5, p0, Ln80$b;->f:Ln80$g;

    iget-object v6, p0, Ln80$b;->g:Ljava/util/List;

    iget-object v10, p0, Ln80$b;->h:Landroid/graphics/Bitmap$Config;

    iget-boolean v12, p0, Ln80$b;->i:Z

    iget-boolean v13, p0, Ln80$b;->j:Z

    move-object v0, v11

    move-object v2, v9

    move-object v7, v8

    move-object v8, v10

    move v9, v12

    move v10, v13

    invoke-direct/range {v0 .. v10}, Ln80;-><init>(Landroid/content/Context;Lc80;Lx70;Ln80$d;Ln80$g;Ljava/util/List;Lu80;Landroid/graphics/Bitmap$Config;ZZ)V

    return-object v11
.end method
