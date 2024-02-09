.class public Llz;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llz$c;,
        Llz$b;
    }
.end annotation


# static fields
.field public static final m:Ldz;


# instance fields
.field public a:Lez;

.field public b:Lez;

.field public c:Lez;

.field public d:Lez;

.field public e:Ldz;

.field public f:Ldz;

.field public g:Ldz;

.field public h:Ldz;

.field public i:Lgz;

.field public j:Lgz;

.field public k:Lgz;

.field public l:Lgz;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljz;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-direct {v0, v1}, Ljz;-><init>(F)V

    sput-object v0, Llz;->m:Ldz;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    invoke-static {}, Liz;->b()Lez;

    move-result-object v0

    iput-object v0, p0, Llz;->a:Lez;

    .line 17
    invoke-static {}, Liz;->b()Lez;

    move-result-object v0

    iput-object v0, p0, Llz;->b:Lez;

    .line 18
    invoke-static {}, Liz;->b()Lez;

    move-result-object v0

    iput-object v0, p0, Llz;->c:Lez;

    .line 19
    invoke-static {}, Liz;->b()Lez;

    move-result-object v0

    iput-object v0, p0, Llz;->d:Lez;

    .line 20
    new-instance v0, Lbz;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbz;-><init>(F)V

    iput-object v0, p0, Llz;->e:Ldz;

    .line 21
    new-instance v0, Lbz;

    invoke-direct {v0, v1}, Lbz;-><init>(F)V

    iput-object v0, p0, Llz;->f:Ldz;

    .line 22
    new-instance v0, Lbz;

    invoke-direct {v0, v1}, Lbz;-><init>(F)V

    iput-object v0, p0, Llz;->g:Ldz;

    .line 23
    new-instance v0, Lbz;

    invoke-direct {v0, v1}, Lbz;-><init>(F)V

    iput-object v0, p0, Llz;->h:Ldz;

    .line 24
    invoke-static {}, Liz;->c()Lgz;

    move-result-object v0

    iput-object v0, p0, Llz;->i:Lgz;

    .line 25
    invoke-static {}, Liz;->c()Lgz;

    move-result-object v0

    iput-object v0, p0, Llz;->j:Lgz;

    .line 26
    invoke-static {}, Liz;->c()Lgz;

    move-result-object v0

    iput-object v0, p0, Llz;->k:Lgz;

    .line 27
    invoke-static {}, Liz;->c()Lgz;

    move-result-object v0

    iput-object v0, p0, Llz;->l:Lgz;

    return-void
.end method

.method public constructor <init>(Llz$b;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Llz$b;->a(Llz$b;)Lez;

    move-result-object v0

    iput-object v0, p0, Llz;->a:Lez;

    .line 4
    invoke-static {p1}, Llz$b;->e(Llz$b;)Lez;

    move-result-object v0

    iput-object v0, p0, Llz;->b:Lez;

    .line 5
    invoke-static {p1}, Llz$b;->f(Llz$b;)Lez;

    move-result-object v0

    iput-object v0, p0, Llz;->c:Lez;

    .line 6
    invoke-static {p1}, Llz$b;->g(Llz$b;)Lez;

    move-result-object v0

    iput-object v0, p0, Llz;->d:Lez;

    .line 7
    invoke-static {p1}, Llz$b;->h(Llz$b;)Ldz;

    move-result-object v0

    iput-object v0, p0, Llz;->e:Ldz;

    .line 8
    invoke-static {p1}, Llz$b;->i(Llz$b;)Ldz;

    move-result-object v0

    iput-object v0, p0, Llz;->f:Ldz;

    .line 9
    invoke-static {p1}, Llz$b;->j(Llz$b;)Ldz;

    move-result-object v0

    iput-object v0, p0, Llz;->g:Ldz;

    .line 10
    invoke-static {p1}, Llz$b;->k(Llz$b;)Ldz;

    move-result-object v0

    iput-object v0, p0, Llz;->h:Ldz;

    .line 11
    invoke-static {p1}, Llz$b;->l(Llz$b;)Lgz;

    move-result-object v0

    iput-object v0, p0, Llz;->i:Lgz;

    .line 12
    invoke-static {p1}, Llz$b;->b(Llz$b;)Lgz;

    move-result-object v0

    iput-object v0, p0, Llz;->j:Lgz;

    .line 13
    invoke-static {p1}, Llz$b;->c(Llz$b;)Lgz;

    move-result-object v0

    iput-object v0, p0, Llz;->k:Lgz;

    .line 14
    invoke-static {p1}, Llz$b;->d(Llz$b;)Lgz;

    move-result-object p1

    iput-object p1, p0, Llz;->l:Lgz;

    return-void
.end method

.method public synthetic constructor <init>(Llz$b;Llz$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llz;-><init>(Llz$b;)V

    return-void
.end method

.method public static a()Llz$b;
    .locals 1

    .line 1
    new-instance v0, Llz$b;

    invoke-direct {v0}, Llz$b;-><init>()V

    return-object v0
.end method

.method public static b(Landroid/content/Context;II)Llz$b;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, p2, v0}, Llz;->c(Landroid/content/Context;III)Llz$b;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;III)Llz$b;
    .locals 1

    .line 1
    new-instance v0, Lbz;

    int-to-float p3, p3

    invoke-direct {v0, p3}, Lbz;-><init>(F)V

    invoke-static {p0, p1, p2, v0}, Llz;->d(Landroid/content/Context;IILdz;)Llz$b;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/content/Context;IILdz;)Llz$b;
    .locals 6

    if-eqz p2, :cond_0

    .line 1
    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-direct {v0, p0, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    move p1, p2

    move-object p0, v0

    .line 2
    :cond_0
    sget-object p2, Lsv;->ShapeAppearance:[I

    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p0

    .line 4
    :try_start_0
    sget p1, Lsv;->ShapeAppearance_cornerFamily:I

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    .line 5
    sget p2, Lsv;->ShapeAppearance_cornerFamilyTopLeft:I

    .line 6
    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    .line 7
    sget v0, Lsv;->ShapeAppearance_cornerFamilyTopRight:I

    .line 8
    invoke-virtual {p0, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 9
    sget v1, Lsv;->ShapeAppearance_cornerFamilyBottomRight:I

    .line 10
    invoke-virtual {p0, v1, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    .line 11
    sget v2, Lsv;->ShapeAppearance_cornerFamilyBottomLeft:I

    .line 12
    invoke-virtual {p0, v2, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    .line 13
    sget v2, Lsv;->ShapeAppearance_cornerSize:I

    .line 14
    invoke-static {p0, v2, p3}, Llz;->m(Landroid/content/res/TypedArray;ILdz;)Ldz;

    move-result-object p3

    .line 15
    sget v2, Lsv;->ShapeAppearance_cornerSizeTopLeft:I

    .line 16
    invoke-static {p0, v2, p3}, Llz;->m(Landroid/content/res/TypedArray;ILdz;)Ldz;

    move-result-object v2

    .line 17
    sget v3, Lsv;->ShapeAppearance_cornerSizeTopRight:I

    .line 18
    invoke-static {p0, v3, p3}, Llz;->m(Landroid/content/res/TypedArray;ILdz;)Ldz;

    move-result-object v3

    .line 19
    sget v4, Lsv;->ShapeAppearance_cornerSizeBottomRight:I

    .line 20
    invoke-static {p0, v4, p3}, Llz;->m(Landroid/content/res/TypedArray;ILdz;)Ldz;

    move-result-object v4

    .line 21
    sget v5, Lsv;->ShapeAppearance_cornerSizeBottomLeft:I

    .line 22
    invoke-static {p0, v5, p3}, Llz;->m(Landroid/content/res/TypedArray;ILdz;)Ldz;

    move-result-object p3

    .line 23
    new-instance v5, Llz$b;

    invoke-direct {v5}, Llz$b;-><init>()V

    .line 24
    invoke-virtual {v5, p2, v2}, Llz$b;->y(ILdz;)Llz$b;

    .line 25
    invoke-virtual {v5, v0, v3}, Llz$b;->C(ILdz;)Llz$b;

    .line 26
    invoke-virtual {v5, v1, v4}, Llz$b;->u(ILdz;)Llz$b;

    .line 27
    invoke-virtual {v5, p1, p3}, Llz$b;->q(ILdz;)Llz$b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v5

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 29
    throw p1
.end method

.method public static e(Landroid/content/Context;Landroid/util/AttributeSet;II)Llz$b;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, p2, p3, v0}, Llz;->f(Landroid/content/Context;Landroid/util/AttributeSet;III)Llz$b;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;Landroid/util/AttributeSet;III)Llz$b;
    .locals 1

    .line 1
    new-instance v0, Lbz;

    int-to-float p4, p4

    invoke-direct {v0, p4}, Lbz;-><init>(F)V

    invoke-static {p0, p1, p2, p3, v0}, Llz;->g(Landroid/content/Context;Landroid/util/AttributeSet;IILdz;)Llz$b;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/content/Context;Landroid/util/AttributeSet;IILdz;)Llz$b;
    .locals 1

    .line 1
    sget-object v0, Lsv;->MaterialShape:[I

    .line 2
    invoke-virtual {p0, p1, v0, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 3
    sget p2, Lsv;->MaterialShape_shapeAppearance:I

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 4
    sget v0, Lsv;->MaterialShape_shapeAppearanceOverlay:I

    .line 5
    invoke-virtual {p1, v0, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    .line 6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 7
    invoke-static {p0, p2, p3, p4}, Llz;->d(Landroid/content/Context;IILdz;)Llz$b;

    move-result-object p0

    return-object p0
.end method

.method public static m(Landroid/content/res/TypedArray;ILdz;)Ldz;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p2

    .line 2
    :cond_0
    iget v0, p1, Landroid/util/TypedValue;->type:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 3
    new-instance p2, Lbz;

    iget p1, p1, Landroid/util/TypedValue;->data:I

    .line 4
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result p0

    int-to-float p0, p0

    invoke-direct {p2, p0}, Lbz;-><init>(F)V

    return-object p2

    :cond_1
    const/4 p0, 0x6

    if-ne v0, p0, :cond_2

    .line 5
    new-instance p0, Ljz;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2, p2}, Landroid/util/TypedValue;->getFraction(FF)F

    move-result p1

    invoke-direct {p0, p1}, Ljz;-><init>(F)V

    return-object p0

    :cond_2
    return-object p2
.end method


# virtual methods
.method public h()Lgz;
    .locals 1

    .line 1
    iget-object v0, p0, Llz;->k:Lgz;

    return-object v0
.end method

.method public i()Lez;
    .locals 1

    .line 1
    iget-object v0, p0, Llz;->d:Lez;

    return-object v0
.end method

.method public j()Ldz;
    .locals 1

    .line 1
    iget-object v0, p0, Llz;->h:Ldz;

    return-object v0
.end method

.method public k()Lez;
    .locals 1

    .line 1
    iget-object v0, p0, Llz;->c:Lez;

    return-object v0
.end method

.method public l()Ldz;
    .locals 1

    .line 1
    iget-object v0, p0, Llz;->g:Ldz;

    return-object v0
.end method

.method public n()Lgz;
    .locals 1

    .line 1
    iget-object v0, p0, Llz;->l:Lgz;

    return-object v0
.end method

.method public o()Lgz;
    .locals 1

    .line 1
    iget-object v0, p0, Llz;->j:Lgz;

    return-object v0
.end method

.method public p()Lgz;
    .locals 1

    .line 1
    iget-object v0, p0, Llz;->i:Lgz;

    return-object v0
.end method

.method public q()Lez;
    .locals 1

    .line 1
    iget-object v0, p0, Llz;->a:Lez;

    return-object v0
.end method

.method public r()Ldz;
    .locals 1

    .line 1
    iget-object v0, p0, Llz;->e:Ldz;

    return-object v0
.end method

.method public s()Lez;
    .locals 1

    .line 1
    iget-object v0, p0, Llz;->b:Lez;

    return-object v0
.end method

.method public t()Ldz;
    .locals 1

    .line 1
    iget-object v0, p0, Llz;->f:Ldz;

    return-object v0
.end method

.method public u(Landroid/graphics/RectF;)Z
    .locals 5

    .line 1
    const-class v0, Lgz;

    iget-object v1, p0, Llz;->l:Lgz;

    .line 2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Llz;->j:Lgz;

    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Llz;->i:Lgz;

    .line 4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Llz;->k:Lgz;

    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    .line 6
    :goto_0
    iget-object v1, p0, Llz;->e:Ldz;

    invoke-interface {v1, p1}, Ldz;->a(Landroid/graphics/RectF;)F

    move-result v1

    .line 7
    iget-object v4, p0, Llz;->f:Ldz;

    .line 8
    invoke-interface {v4, p1}, Ldz;->a(Landroid/graphics/RectF;)F

    move-result v4

    cmpl-float v4, v4, v1

    if-nez v4, :cond_1

    iget-object v4, p0, Llz;->h:Ldz;

    .line 9
    invoke-interface {v4, p1}, Ldz;->a(Landroid/graphics/RectF;)F

    move-result v4

    cmpl-float v4, v4, v1

    if-nez v4, :cond_1

    iget-object v4, p0, Llz;->g:Ldz;

    .line 10
    invoke-interface {v4, p1}, Ldz;->a(Landroid/graphics/RectF;)F

    move-result p1

    cmpl-float p1, p1, v1

    if-nez p1, :cond_1

    move p1, v2

    goto :goto_1

    :cond_1
    move p1, v3

    .line 11
    :goto_1
    iget-object v1, p0, Llz;->b:Lez;

    instance-of v1, v1, Lkz;

    if-eqz v1, :cond_2

    iget-object v1, p0, Llz;->a:Lez;

    instance-of v1, v1, Lkz;

    if-eqz v1, :cond_2

    iget-object v1, p0, Llz;->c:Lez;

    instance-of v1, v1, Lkz;

    if-eqz v1, :cond_2

    iget-object v1, p0, Llz;->d:Lez;

    instance-of v1, v1, Lkz;

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    move v1, v3

    :goto_2
    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    move v2, v3

    :goto_3
    return v2
.end method

.method public v()Llz$b;
    .locals 1

    .line 1
    new-instance v0, Llz$b;

    invoke-direct {v0, p0}, Llz$b;-><init>(Llz;)V

    return-object v0
.end method

.method public w(F)Llz;
    .locals 1

    .line 1
    invoke-virtual {p0}, Llz;->v()Llz$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Llz$b;->o(F)Llz$b;

    invoke-virtual {v0}, Llz$b;->m()Llz;

    move-result-object p1

    return-object p1
.end method

.method public x(Ldz;)Llz;
    .locals 1

    .line 1
    invoke-virtual {p0}, Llz;->v()Llz$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Llz$b;->p(Ldz;)Llz$b;

    invoke-virtual {v0}, Llz$b;->m()Llz;

    move-result-object p1

    return-object p1
.end method

.method public y(Llz$c;)Llz;
    .locals 2

    .line 1
    invoke-virtual {p0}, Llz;->v()Llz$b;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Llz;->r()Ldz;

    move-result-object v1

    invoke-interface {p1, v1}, Llz$c;->a(Ldz;)Ldz;

    move-result-object v1

    invoke-virtual {v0, v1}, Llz$b;->B(Ldz;)Llz$b;

    .line 3
    invoke-virtual {p0}, Llz;->t()Ldz;

    move-result-object v1

    invoke-interface {p1, v1}, Llz$c;->a(Ldz;)Ldz;

    move-result-object v1

    invoke-virtual {v0, v1}, Llz$b;->F(Ldz;)Llz$b;

    .line 4
    invoke-virtual {p0}, Llz;->j()Ldz;

    move-result-object v1

    invoke-interface {p1, v1}, Llz$c;->a(Ldz;)Ldz;

    move-result-object v1

    invoke-virtual {v0, v1}, Llz$b;->t(Ldz;)Llz$b;

    .line 5
    invoke-virtual {p0}, Llz;->l()Ldz;

    move-result-object v1

    invoke-interface {p1, v1}, Llz$c;->a(Ldz;)Ldz;

    move-result-object p1

    invoke-virtual {v0, p1}, Llz$b;->x(Ldz;)Llz$b;

    .line 6
    invoke-virtual {v0}, Llz$b;->m()Llz;

    move-result-object p1

    return-object p1
.end method
