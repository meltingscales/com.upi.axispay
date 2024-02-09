.class public Lk60$b;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk60;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final y:Ln60;


# instance fields
.field public a:Landroid/content/Context;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Lx60;

.field public g:Ljava/util/concurrent/Executor;

.field public h:Ljava/util/concurrent/Executor;

.field public i:Z

.field public j:Z

.field public k:I

.field public l:I

.field public m:Z

.field public n:Ln60;

.field public o:I

.field public p:J

.field public q:I

.field public r:Ld60;

.field public s:Lt50;

.field public t:La60;

.field public u:Lw60;

.field public v:Lr60;

.field public w:Li60;

.field public x:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ln60;->b:Ln60;

    sput-object v0, Lk60$b;->y:Ln60;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lk60$b;->b:I

    .line 3
    iput v0, p0, Lk60$b;->c:I

    .line 4
    iput v0, p0, Lk60$b;->d:I

    .line 5
    iput v0, p0, Lk60$b;->e:I

    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lk60$b;->f:Lx60;

    .line 7
    iput-object v1, p0, Lk60$b;->g:Ljava/util/concurrent/Executor;

    .line 8
    iput-object v1, p0, Lk60$b;->h:Ljava/util/concurrent/Executor;

    .line 9
    iput-boolean v0, p0, Lk60$b;->i:Z

    .line 10
    iput-boolean v0, p0, Lk60$b;->j:Z

    const/4 v2, 0x3

    .line 11
    iput v2, p0, Lk60$b;->k:I

    .line 12
    iput v2, p0, Lk60$b;->l:I

    .line 13
    iput-boolean v0, p0, Lk60$b;->m:Z

    .line 14
    sget-object v2, Lk60$b;->y:Ln60;

    iput-object v2, p0, Lk60$b;->n:Ln60;

    .line 15
    iput v0, p0, Lk60$b;->o:I

    const-wide/16 v2, 0x0

    .line 16
    iput-wide v2, p0, Lk60$b;->p:J

    .line 17
    iput v0, p0, Lk60$b;->q:I

    .line 18
    iput-object v1, p0, Lk60$b;->r:Ld60;

    .line 19
    iput-object v1, p0, Lk60$b;->s:Lt50;

    .line 20
    iput-object v1, p0, Lk60$b;->t:La60;

    .line 21
    iput-object v1, p0, Lk60$b;->u:Lw60;

    .line 22
    iput-object v1, p0, Lk60$b;->w:Li60;

    .line 23
    iput-boolean v0, p0, Lk60$b;->x:Z

    .line 24
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lk60$b;->a:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(Lk60$b;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lk60$b;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic b(Lk60$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lk60$b;->b:I

    return p0
.end method

.method public static synthetic c(Lk60$b;)Ln60;
    .locals 0

    .line 1
    iget-object p0, p0, Lk60$b;->n:Ln60;

    return-object p0
.end method

.method public static synthetic d(Lk60$b;)Lt50;
    .locals 0

    .line 1
    iget-object p0, p0, Lk60$b;->s:Lt50;

    return-object p0
.end method

.method public static synthetic e(Lk60$b;)Ld60;
    .locals 0

    .line 1
    iget-object p0, p0, Lk60$b;->r:Ld60;

    return-object p0
.end method

.method public static synthetic f(Lk60$b;)Li60;
    .locals 0

    .line 1
    iget-object p0, p0, Lk60$b;->w:Li60;

    return-object p0
.end method

.method public static synthetic g(Lk60$b;)Lw60;
    .locals 0

    .line 1
    iget-object p0, p0, Lk60$b;->u:Lw60;

    return-object p0
.end method

.method public static synthetic h(Lk60$b;)Lr60;
    .locals 0

    .line 1
    iget-object p0, p0, Lk60$b;->v:Lr60;

    return-object p0
.end method

.method public static synthetic i(Lk60$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lk60$b;->i:Z

    return p0
.end method

.method public static synthetic j(Lk60$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lk60$b;->j:Z

    return p0
.end method

.method public static synthetic k(Lk60$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lk60$b;->x:Z

    return p0
.end method

.method public static synthetic l(Lk60$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lk60$b;->c:I

    return p0
.end method

.method public static synthetic m(Lk60$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lk60$b;->d:I

    return p0
.end method

.method public static synthetic n(Lk60$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lk60$b;->e:I

    return p0
.end method

.method public static synthetic o(Lk60$b;)Lx60;
    .locals 0

    .line 1
    iget-object p0, p0, Lk60$b;->f:Lx60;

    return-object p0
.end method

.method public static synthetic p(Lk60$b;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, Lk60$b;->g:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static synthetic q(Lk60$b;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, Lk60$b;->h:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static synthetic r(Lk60$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lk60$b;->k:I

    return p0
.end method

.method public static synthetic s(Lk60$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lk60$b;->l:I

    return p0
.end method


# virtual methods
.method public t()Lk60;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk60$b;->w()V

    .line 2
    new-instance v0, Lk60;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lk60;-><init>(Lk60$b;Lk60$a;)V

    return-object v0
.end method

.method public u(Li60;)Lk60$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lk60$b;->w:Li60;

    return-object p0
.end method

.method public v(I)Lk60$b;
    .locals 2

    if-lez p1, :cond_1

    .line 1
    iget-object v0, p0, Lk60$b;->s:Lt50;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const v1, 0x10c7

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-static {v1, v0}, Ly60;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    int-to-long v0, p1

    .line 3
    iput-wide v0, p0, Lk60$b;->p:J

    return-object p0

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x10c8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final w()V
    .locals 5

    .line 1
    iget-object v0, p0, Lk60$b;->g:Ljava/util/concurrent/Executor;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 2
    iget v0, p0, Lk60$b;->k:I

    iget v2, p0, Lk60$b;->l:I

    iget-object v3, p0, Lk60$b;->n:Ln60;

    invoke-static {v0, v2, v3}, Lh60;->c(IILn60;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lk60$b;->g:Ljava/util/concurrent/Executor;

    goto :goto_0

    .line 3
    :cond_0
    iput-boolean v1, p0, Lk60$b;->i:Z

    .line 4
    :goto_0
    iget-object v0, p0, Lk60$b;->h:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_1

    .line 5
    iget v0, p0, Lk60$b;->k:I

    iget v1, p0, Lk60$b;->l:I

    iget-object v2, p0, Lk60$b;->n:Ln60;

    invoke-static {v0, v1, v2}, Lh60;->c(IILn60;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lk60$b;->h:Ljava/util/concurrent/Executor;

    goto :goto_1

    .line 6
    :cond_1
    iput-boolean v1, p0, Lk60$b;->j:Z

    .line 7
    :goto_1
    iget-object v0, p0, Lk60$b;->s:Lt50;

    if-nez v0, :cond_3

    .line 8
    iget-object v0, p0, Lk60$b;->t:La60;

    if-nez v0, :cond_2

    .line 9
    invoke-static {}, Lh60;->d()La60;

    move-result-object v0

    iput-object v0, p0, Lk60$b;->t:La60;

    .line 10
    :cond_2
    iget-object v0, p0, Lk60$b;->a:Landroid/content/Context;

    iget-object v1, p0, Lk60$b;->t:La60;

    iget-wide v2, p0, Lk60$b;->p:J

    iget v4, p0, Lk60$b;->q:I

    invoke-static {v0, v1, v2, v3, v4}, Lh60;->b(Landroid/content/Context;La60;JI)Lt50;

    move-result-object v0

    iput-object v0, p0, Lk60$b;->s:Lt50;

    .line 11
    :cond_3
    iget-object v0, p0, Lk60$b;->r:Ld60;

    if-nez v0, :cond_4

    .line 12
    iget-object v0, p0, Lk60$b;->a:Landroid/content/Context;

    iget v1, p0, Lk60$b;->o:I

    invoke-static {v0, v1}, Lh60;->g(Landroid/content/Context;I)Ld60;

    move-result-object v0

    iput-object v0, p0, Lk60$b;->r:Ld60;

    .line 13
    :cond_4
    iget-boolean v0, p0, Lk60$b;->m:Z

    if-eqz v0, :cond_5

    .line 14
    new-instance v0, Le60;

    iget-object v1, p0, Lk60$b;->r:Ld60;

    invoke-static {}, Lz60;->a()Ljava/util/Comparator;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Le60;-><init>(Ld60;Ljava/util/Comparator;)V

    iput-object v0, p0, Lk60$b;->r:Ld60;

    .line 15
    :cond_5
    iget-object v0, p0, Lk60$b;->u:Lw60;

    if-nez v0, :cond_6

    .line 16
    iget-object v0, p0, Lk60$b;->a:Landroid/content/Context;

    invoke-static {v0}, Lh60;->f(Landroid/content/Context;)Lw60;

    move-result-object v0

    iput-object v0, p0, Lk60$b;->u:Lw60;

    .line 17
    :cond_6
    iget-object v0, p0, Lk60$b;->v:Lr60;

    if-nez v0, :cond_7

    .line 18
    iget-boolean v0, p0, Lk60$b;->x:Z

    invoke-static {v0}, Lh60;->e(Z)Lr60;

    move-result-object v0

    iput-object v0, p0, Lk60$b;->v:Lr60;

    .line 19
    :cond_7
    iget-object v0, p0, Lk60$b;->w:Li60;

    if-nez v0, :cond_8

    .line 20
    invoke-static {}, Li60;->a()Li60;

    move-result-object v0

    iput-object v0, p0, Lk60$b;->w:Li60;

    :cond_8
    return-void
.end method

.method public x(Ld60;)Lk60$b;
    .locals 2

    .line 1
    iget v0, p0, Lk60$b;->o:I

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const v1, 0x10c9

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-static {v1, v0}, Ly60;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    :cond_0
    iput-object p1, p0, Lk60$b;->r:Ld60;

    return-object p0
.end method
