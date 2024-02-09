.class public Lqo$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lqo$d;
.implements Lqo$e;
.implements Lqo$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Landroid/graphics/Typeface;

.field public g:Landroid/graphics/drawable/shapes/RectShape;

.field public h:I

.field public i:I

.field public j:Z

.field public k:Z

.field public l:F


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x3d9a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    iput-object v0, p0, Lqo$b;->a:Ljava/lang/String;

    const v0, -0x777778

    .line 4
    iput v0, p0, Lqo$b;->b:I

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lqo$b;->h:I

    const/4 v1, 0x0

    .line 6
    iput v1, p0, Lqo$b;->c:I

    .line 7
    iput v0, p0, Lqo$b;->d:I

    .line 8
    iput v0, p0, Lqo$b;->e:I

    .line 9
    new-instance v2, Landroid/graphics/drawable/shapes/RectShape;

    invoke-direct {v2}, Landroid/graphics/drawable/shapes/RectShape;-><init>()V

    iput-object v2, p0, Lqo$b;->g:Landroid/graphics/drawable/shapes/RectShape;

    const v2, 0x3d9b

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 10
    invoke-static {v2, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v2

    iput-object v2, p0, Lqo$b;->f:Landroid/graphics/Typeface;

    .line 11
    iput v0, p0, Lqo$b;->i:I

    .line 12
    iput-boolean v1, p0, Lqo$b;->j:Z

    .line 13
    iput-boolean v1, p0, Lqo$b;->k:Z

    return-void
.end method

.method public synthetic constructor <init>(Lqo$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lqo$b;-><init>()V

    return-void
.end method

.method public static synthetic j(Lqo$b;)Landroid/graphics/drawable/shapes/RectShape;
    .locals 0

    .line 1
    iget-object p0, p0, Lqo$b;->g:Landroid/graphics/drawable/shapes/RectShape;

    return-object p0
.end method

.method public static synthetic k(Lqo$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lqo$b;->e:I

    return p0
.end method

.method public static synthetic l(Lqo$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lqo$b;->d:I

    return p0
.end method

.method public static synthetic m(Lqo$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lqo$b;->k:Z

    return p0
.end method

.method public static synthetic n(Lqo$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lqo$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic o(Lqo$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lqo$b;->b:I

    return p0
.end method

.method public static synthetic p(Lqo$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lqo$b;->i:I

    return p0
.end method

.method public static synthetic q(Lqo$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lqo$b;->j:Z

    return p0
.end method

.method public static synthetic r(Lqo$b;)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    iget-object p0, p0, Lqo$b;->f:Landroid/graphics/Typeface;

    return-object p0
.end method

.method public static synthetic s(Lqo$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lqo$b;->c:I

    return p0
.end method


# virtual methods
.method public a()Lqo$e;
    .locals 0

    return-object p0
.end method

.method public b(Ljava/lang/String;I)Lqo;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lqo$b;->u()Lqo$c;

    .line 2
    invoke-virtual {p0, p1, p2}, Lqo$b;->t(Ljava/lang/String;I)Lqo;

    move-result-object p1

    return-object p1
.end method

.method public c(I)Lqo$d;
    .locals 0

    .line 1
    iput p1, p0, Lqo$b;->d:I

    return-object p0
.end method

.method public d()Lqo$d;
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lqo$b;->k:Z

    return-object p0
.end method

.method public e()Lqo$d;
    .locals 0

    return-object p0
.end method

.method public f(I)Lqo$d;
    .locals 0

    .line 1
    iput p1, p0, Lqo$b;->i:I

    return-object p0
.end method

.method public g(I)Lqo$d;
    .locals 0

    .line 1
    iput p1, p0, Lqo$b;->e:I

    return-object p0
.end method

.method public h(I)Lqo$d;
    .locals 0

    .line 1
    iput p1, p0, Lqo$b;->h:I

    return-object p0
.end method

.method public i(Landroid/graphics/Typeface;)Lqo$d;
    .locals 0

    .line 1
    iput-object p1, p0, Lqo$b;->f:Landroid/graphics/Typeface;

    return-object p0
.end method

.method public t(Ljava/lang/String;I)Lqo;
    .locals 0

    .line 1
    iput p2, p0, Lqo$b;->b:I

    .line 2
    iput-object p1, p0, Lqo$b;->a:Ljava/lang/String;

    .line 3
    new-instance p1, Lqo;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lqo;-><init>(Lqo$b;Lqo$a;)V

    return-object p1
.end method

.method public u()Lqo$c;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/drawable/shapes/OvalShape;

    invoke-direct {v0}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    iput-object v0, p0, Lqo$b;->g:Landroid/graphics/drawable/shapes/RectShape;

    return-object p0
.end method
