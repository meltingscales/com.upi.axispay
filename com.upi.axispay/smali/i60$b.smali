.class public Li60$b;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li60;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Landroid/graphics/drawable/Drawable;

.field public e:Landroid/graphics/drawable/Drawable;

.field public f:Landroid/graphics/drawable/Drawable;

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Lm60;

.field public k:Landroid/graphics/BitmapFactory$Options;

.field public l:I

.field public m:Z

.field public n:Ljava/lang/Object;

.field public o:Lx60;

.field public p:Lx60;

.field public q:Ls60;

.field public r:Landroid/os/Handler;

.field public s:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Li60$b;->a:I

    .line 3
    iput v0, p0, Li60$b;->b:I

    .line 4
    iput v0, p0, Li60$b;->c:I

    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Li60$b;->d:Landroid/graphics/drawable/Drawable;

    .line 6
    iput-object v1, p0, Li60$b;->e:Landroid/graphics/drawable/Drawable;

    .line 7
    iput-object v1, p0, Li60$b;->f:Landroid/graphics/drawable/Drawable;

    .line 8
    iput-boolean v0, p0, Li60$b;->g:Z

    .line 9
    iput-boolean v0, p0, Li60$b;->h:Z

    .line 10
    iput-boolean v0, p0, Li60$b;->i:Z

    .line 11
    sget-object v2, Lm60;->d:Lm60;

    iput-object v2, p0, Li60$b;->j:Lm60;

    .line 12
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-object v2, p0, Li60$b;->k:Landroid/graphics/BitmapFactory$Options;

    .line 13
    iput v0, p0, Li60$b;->l:I

    .line 14
    iput-boolean v0, p0, Li60$b;->m:Z

    .line 15
    iput-object v1, p0, Li60$b;->n:Ljava/lang/Object;

    .line 16
    iput-object v1, p0, Li60$b;->o:Lx60;

    .line 17
    iput-object v1, p0, Li60$b;->p:Lx60;

    .line 18
    invoke-static {}, Lh60;->a()Ls60;

    move-result-object v2

    iput-object v2, p0, Li60$b;->q:Ls60;

    .line 19
    iput-object v1, p0, Li60$b;->r:Landroid/os/Handler;

    .line 20
    iput-boolean v0, p0, Li60$b;->s:Z

    return-void
.end method

.method public static synthetic a(Li60$b;)I
    .locals 0

    .line 1
    iget p0, p0, Li60$b;->a:I

    return p0
.end method

.method public static synthetic b(Li60$b;)I
    .locals 0

    .line 1
    iget p0, p0, Li60$b;->b:I

    return p0
.end method

.method public static synthetic c(Li60$b;)Landroid/graphics/BitmapFactory$Options;
    .locals 0

    .line 1
    iget-object p0, p0, Li60$b;->k:Landroid/graphics/BitmapFactory$Options;

    return-object p0
.end method

.method public static synthetic d(Li60$b;)I
    .locals 0

    .line 1
    iget p0, p0, Li60$b;->l:I

    return p0
.end method

.method public static synthetic e(Li60$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Li60$b;->m:Z

    return p0
.end method

.method public static synthetic f(Li60$b;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Li60$b;->n:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic g(Li60$b;)Lx60;
    .locals 0

    .line 1
    iget-object p0, p0, Li60$b;->o:Lx60;

    return-object p0
.end method

.method public static synthetic h(Li60$b;)Lx60;
    .locals 0

    .line 1
    iget-object p0, p0, Li60$b;->p:Lx60;

    return-object p0
.end method

.method public static synthetic i(Li60$b;)Ls60;
    .locals 0

    .line 1
    iget-object p0, p0, Li60$b;->q:Ls60;

    return-object p0
.end method

.method public static synthetic j(Li60$b;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Li60$b;->r:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic k(Li60$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Li60$b;->s:Z

    return p0
.end method

.method public static synthetic l(Li60$b;)I
    .locals 0

    .line 1
    iget p0, p0, Li60$b;->c:I

    return p0
.end method

.method public static synthetic m(Li60$b;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Li60$b;->d:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public static synthetic n(Li60$b;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Li60$b;->e:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public static synthetic o(Li60$b;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Li60$b;->f:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public static synthetic p(Li60$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Li60$b;->g:Z

    return p0
.end method

.method public static synthetic q(Li60$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Li60$b;->h:Z

    return p0
.end method

.method public static synthetic r(Li60$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Li60$b;->i:Z

    return p0
.end method

.method public static synthetic s(Li60$b;)Lm60;
    .locals 0

    .line 1
    iget-object p0, p0, Li60$b;->j:Lm60;

    return-object p0
.end method


# virtual methods
.method public t()Li60;
    .locals 2

    .line 1
    new-instance v0, Li60;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li60;-><init>(Li60$b;Li60$a;)V

    return-object v0
.end method

.method public u(Z)Li60$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Li60$b;->h:Z

    return-object p0
.end method

.method public v(Z)Li60$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Li60$b;->i:Z

    return-object p0
.end method

.method public w(Ls60;)Li60$b;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Li60$b;->q:Ls60;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x1fa1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public x(Lm60;)Li60$b;
    .locals 0

    .line 1
    iput-object p1, p0, Li60$b;->j:Lm60;

    return-object p0
.end method
