.class public Lux;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lux$f;,
        Lux$h;,
        Lux$g;,
        Lux$k;,
        Lux$l;,
        Lux$j;,
        Lux$i;
    }
.end annotation


# static fields
.field public static final F:Landroid/animation/TimeInterpolator;

.field public static final G:[I

.field public static final H:[I

.field public static final I:[I

.field public static final J:[I

.field public static final K:[I

.field public static final L:[I


# instance fields
.field public final A:Landroid/graphics/Rect;

.field public final B:Landroid/graphics/RectF;

.field public final C:Landroid/graphics/RectF;

.field public final D:Landroid/graphics/Matrix;

.field public E:Landroid/view/ViewTreeObserver$OnPreDrawListener;

.field public a:Llz;

.field public b:Lhz;

.field public c:Landroid/graphics/drawable/Drawable;

.field public d:Ltx;

.field public e:Landroid/graphics/drawable/Drawable;

.field public f:Z

.field public g:Z

.field public h:F

.field public i:F

.field public j:F

.field public k:I

.field public final l:Lhy;

.field public m:Law;

.field public n:Law;

.field public o:Landroid/animation/Animator;

.field public p:Law;

.field public q:Law;

.field public r:F

.field public s:F

.field public t:I

.field public u:I

.field public v:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/animation/Animator$AnimatorListener;",
            ">;"
        }
    .end annotation
.end field

.field public w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/animation/Animator$AnimatorListener;",
            ">;"
        }
    .end annotation
.end field

.field public x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lux$i;",
            ">;"
        }
    .end annotation
.end field

.field public final y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

.field public final z:Laz;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ltv;->c:Landroid/animation/TimeInterpolator;

    sput-object v0, Lux;->F:Landroid/animation/TimeInterpolator;

    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 2
    fill-array-data v1, :array_0

    sput-object v1, Lux;->G:[I

    const/4 v1, 0x3

    new-array v1, v1, [I

    .line 3
    fill-array-data v1, :array_1

    sput-object v1, Lux;->H:[I

    new-array v1, v0, [I

    .line 4
    fill-array-data v1, :array_2

    sput-object v1, Lux;->I:[I

    new-array v0, v0, [I

    .line 5
    fill-array-data v0, :array_3

    sput-object v0, Lux;->J:[I

    const/4 v0, 0x1

    new-array v0, v0, [I

    const v1, 0x101009e

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 6
    sput-object v0, Lux;->K:[I

    new-array v0, v2, [I

    .line 7
    sput-object v0, Lux;->L:[I

    return-void

    :array_0
    .array-data 4
        0x10100a7
        0x101009e
    .end array-data

    :array_1
    .array-data 4
        0x1010367
        0x101009c
        0x101009e
    .end array-data

    :array_2
    .array-data 4
        0x101009c
        0x101009e
    .end array-data

    :array_3
    .array-data 4
        0x1010367
        0x101009e
    .end array-data
.end method

.method public constructor <init>(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Laz;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lux;->g:Z

    const/high16 v0, 0x3f800000    # 1.0f

    .line 3
    iput v0, p0, Lux;->s:F

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lux;->u:I

    .line 5
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lux;->A:Landroid/graphics/Rect;

    .line 6
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lux;->B:Landroid/graphics/RectF;

    .line 7
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lux;->C:Landroid/graphics/RectF;

    .line 8
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lux;->D:Landroid/graphics/Matrix;

    .line 9
    iput-object p1, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 10
    iput-object p2, p0, Lux;->z:Laz;

    .line 11
    new-instance p2, Lhy;

    invoke-direct {p2}, Lhy;-><init>()V

    iput-object p2, p0, Lux;->l:Lhy;

    .line 12
    sget-object v0, Lux;->G:[I

    new-instance v1, Lux$h;

    invoke-direct {v1, p0}, Lux$h;-><init>(Lux;)V

    .line 13
    invoke-virtual {p0, v1}, Lux;->i(Lux$l;)Landroid/animation/ValueAnimator;

    move-result-object v1

    .line 14
    invoke-virtual {p2, v0, v1}, Lhy;->a([ILandroid/animation/ValueAnimator;)V

    .line 15
    sget-object v0, Lux;->H:[I

    new-instance v1, Lux$g;

    invoke-direct {v1, p0}, Lux$g;-><init>(Lux;)V

    .line 16
    invoke-virtual {p0, v1}, Lux;->i(Lux$l;)Landroid/animation/ValueAnimator;

    move-result-object v1

    .line 17
    invoke-virtual {p2, v0, v1}, Lhy;->a([ILandroid/animation/ValueAnimator;)V

    .line 18
    sget-object v0, Lux;->I:[I

    new-instance v1, Lux$g;

    invoke-direct {v1, p0}, Lux$g;-><init>(Lux;)V

    .line 19
    invoke-virtual {p0, v1}, Lux;->i(Lux$l;)Landroid/animation/ValueAnimator;

    move-result-object v1

    .line 20
    invoke-virtual {p2, v0, v1}, Lhy;->a([ILandroid/animation/ValueAnimator;)V

    .line 21
    sget-object v0, Lux;->J:[I

    new-instance v1, Lux$g;

    invoke-direct {v1, p0}, Lux$g;-><init>(Lux;)V

    .line 22
    invoke-virtual {p0, v1}, Lux;->i(Lux$l;)Landroid/animation/ValueAnimator;

    move-result-object v1

    .line 23
    invoke-virtual {p2, v0, v1}, Lhy;->a([ILandroid/animation/ValueAnimator;)V

    .line 24
    sget-object v0, Lux;->K:[I

    new-instance v1, Lux$k;

    invoke-direct {v1, p0}, Lux$k;-><init>(Lux;)V

    .line 25
    invoke-virtual {p0, v1}, Lux;->i(Lux$l;)Landroid/animation/ValueAnimator;

    move-result-object v1

    .line 26
    invoke-virtual {p2, v0, v1}, Lhy;->a([ILandroid/animation/ValueAnimator;)V

    .line 27
    sget-object v0, Lux;->L:[I

    new-instance v1, Lux$f;

    invoke-direct {v1, p0}, Lux$f;-><init>(Lux;)V

    .line 28
    invoke-virtual {p0, v1}, Lux;->i(Lux$l;)Landroid/animation/ValueAnimator;

    move-result-object v1

    .line 29
    invoke-virtual {p2, v0, v1}, Lhy;->a([ILandroid/animation/ValueAnimator;)V

    .line 30
    invoke-virtual {p1}, Landroid/widget/ImageButton;->getRotation()F

    move-result p1

    iput p1, p0, Lux;->r:F

    return-void
.end method

.method public static synthetic a(Lux;I)I
    .locals 0

    .line 1
    iput p1, p0, Lux;->u:I

    return p1
.end method

.method public static synthetic b(Lux;Landroid/animation/Animator;)Landroid/animation/Animator;
    .locals 0

    .line 1
    iput-object p1, p0, Lux;->o:Landroid/animation/Animator;

    return-object p1
.end method

.method public static synthetic c(Lux;F)F
    .locals 0

    .line 1
    iput p1, p0, Lux;->s:F

    return p1
.end method


# virtual methods
.method public A()V
    .locals 1

    .line 1
    iget-object v0, p0, Lux;->l:Lhy;

    invoke-virtual {v0}, Lhy;->c()V

    return-void
.end method

.method public B()V
    .locals 2

    .line 1
    iget-object v0, p0, Lux;->b:Lhz;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-static {v1, v0}, Liz;->f(Landroid/view/View;Lhz;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lux;->K()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {p0}, Lux;->r()Landroid/view/ViewTreeObserver$OnPreDrawListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_1
    return-void
.end method

.method public C()V
    .locals 0

    return-void
.end method

.method public D()V
    .locals 2

    .line 1
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lux;->E:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lux;->E:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    :cond_0
    return-void
.end method

.method public E([I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lux;->l:Lhy;

    invoke-virtual {v0, p1}, Lhy;->d([I)V

    return-void
.end method

.method public F(FFF)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lux;->f0()V

    .line 2
    invoke-virtual {p0, p1}, Lux;->g0(F)V

    return-void
.end method

.method public G(Landroid/graphics/Rect;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lux;->e:Landroid/graphics/drawable/Drawable;

    const v1, 0x10cc

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ldb;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-virtual {p0}, Lux;->Z()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Landroid/graphics/drawable/InsetDrawable;

    iget-object v2, p0, Lux;->e:Landroid/graphics/drawable/Drawable;

    iget v3, p1, Landroid/graphics/Rect;->left:I

    iget v4, p1, Landroid/graphics/Rect;->top:I

    iget v5, p1, Landroid/graphics/Rect;->right:I

    iget v6, p1, Landroid/graphics/Rect;->bottom:I

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 4
    iget-object p1, p0, Lux;->z:Laz;

    invoke-interface {p1, v0}, Laz;->b(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lux;->z:Laz;

    iget-object v0, p0, Lux;->e:Landroid/graphics/drawable/Drawable;

    invoke-interface {p1, v0}, Laz;->b(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void
.end method

.method public H()V
    .locals 2

    .line 1
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getRotation()F

    move-result v0

    .line 2
    iget v1, p0, Lux;->r:F

    cmpl-float v1, v1, v0

    if-eqz v1, :cond_0

    .line 3
    iput v0, p0, Lux;->r:F

    .line 4
    invoke-virtual {p0}, Lux;->d0()V

    :cond_0
    return-void
.end method

.method public I()V
    .locals 2

    .line 1
    iget-object v0, p0, Lux;->x:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lux$i;

    .line 3
    invoke-interface {v1}, Lux$i;->b()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public J()V
    .locals 2

    .line 1
    iget-object v0, p0, Lux;->x:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lux$i;

    .line 3
    invoke-interface {v1}, Lux$i;->a()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public K()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public L(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lux;->b:Lhz;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lhz;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lux;->d:Ltx;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, p1}, Ltx;->c(Landroid/content/res/ColorStateList;)V

    :cond_1
    return-void
.end method

.method public M(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lux;->b:Lhz;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lhz;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public final N(F)V
    .locals 2

    .line 1
    iget v0, p0, Lux;->h:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lux;->h:F

    .line 3
    iget v0, p0, Lux;->i:F

    iget v1, p0, Lux;->j:F

    invoke-virtual {p0, p1, v0, v1}, Lux;->F(FFF)V

    :cond_0
    return-void
.end method

.method public O(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lux;->f:Z

    return-void
.end method

.method public final P(Law;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lux;->q:Law;

    return-void
.end method

.method public final Q(F)V
    .locals 2

    .line 1
    iget v0, p0, Lux;->i:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lux;->i:F

    .line 3
    iget v0, p0, Lux;->h:F

    iget v1, p0, Lux;->j:F

    invoke-virtual {p0, v0, p1, v1}, Lux;->F(FFF)V

    :cond_0
    return-void
.end method

.method public final R(F)V
    .locals 1

    .line 1
    iput p1, p0, Lux;->s:F

    .line 2
    iget-object v0, p0, Lux;->D:Landroid/graphics/Matrix;

    .line 3
    invoke-virtual {p0, p1, v0}, Lux;->g(FLandroid/graphics/Matrix;)V

    .line 4
    iget-object p1, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setImageMatrix(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public final S(I)V
    .locals 1

    .line 1
    iget v0, p0, Lux;->t:I

    if-eq v0, p1, :cond_0

    .line 2
    iput p1, p0, Lux;->t:I

    .line 3
    invoke-virtual {p0}, Lux;->e0()V

    :cond_0
    return-void
.end method

.method public T(I)V
    .locals 0

    .line 1
    iput p1, p0, Lux;->k:I

    return-void
.end method

.method public final U(F)V
    .locals 2

    .line 1
    iget v0, p0, Lux;->j:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lux;->j:F

    .line 3
    iget v0, p0, Lux;->h:F

    iget v1, p0, Lux;->i:F

    invoke-virtual {p0, v0, v1, p1}, Lux;->F(FFF)V

    :cond_0
    return-void
.end method

.method public V(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lux;->c:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p1}, Lyy;->d(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object p1

    .line 3
    invoke-static {v0, p1}, Lo9;->o(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public W(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lux;->g:Z

    .line 2
    invoke-virtual {p0}, Lux;->f0()V

    return-void
.end method

.method public final X(Llz;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lux;->a:Llz;

    .line 2
    iget-object v0, p0, Lux;->b:Lhz;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Lhz;->setShapeAppearanceModel(Llz;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lux;->c:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Loz;

    if-eqz v1, :cond_1

    .line 5
    check-cast v0, Loz;

    invoke-interface {v0, p1}, Loz;->setShapeAppearanceModel(Llz;)V

    .line 6
    :cond_1
    iget-object v0, p0, Lux;->d:Ltx;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0, p1}, Ltx;->f(Llz;)V

    :cond_2
    return-void
.end method

.method public final Y(Law;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lux;->p:Law;

    return-void
.end method

.method public Z()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final a0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-static {v0}, Lac;->V(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b0()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lux;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getSizeDimension()I

    move-result v0

    iget v1, p0, Lux;->k:I

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public c0(Lux$j;Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lux;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lux;->o:Landroid/animation/Animator;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 4
    :cond_1
    invoke-virtual {p0}, Lux;->a0()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_5

    .line 5
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setAlpha(F)V

    .line 7
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0, v2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setScaleY(F)V

    .line 8
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0, v2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setScaleX(F)V

    .line 9
    invoke-virtual {p0, v2}, Lux;->R(F)V

    .line 10
    :cond_2
    iget-object v0, p0, Lux;->p:Law;

    if-eqz v0, :cond_3

    goto :goto_0

    .line 11
    :cond_3
    invoke-virtual {p0}, Lux;->m()Law;

    move-result-object v0

    .line 12
    :goto_0
    invoke-virtual {p0, v0, v1, v1, v1}, Lux;->h(Law;FFF)Landroid/animation/AnimatorSet;

    move-result-object v0

    .line 13
    new-instance v1, Lux$b;

    invoke-direct {v1, p0, p2, p1}, Lux$b;-><init>(Lux;ZLux$j;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 14
    iget-object p1, p0, Lux;->v:Ljava/util/ArrayList;

    if-eqz p1, :cond_4

    .line 15
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/animation/Animator$AnimatorListener;

    .line 16
    invoke-virtual {v0, p2}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_1

    .line 17
    :cond_4
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    goto :goto_2

    .line 18
    :cond_5
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, p2}, Loy;->b(IZ)V

    .line 19
    iget-object p2, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p2, v1}, Landroid/widget/ImageButton;->setAlpha(F)V

    .line 20
    iget-object p2, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p2, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setScaleY(F)V

    .line 21
    iget-object p2, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p2, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setScaleX(F)V

    .line 22
    invoke-virtual {p0, v1}, Lux;->R(F)V

    if-eqz p1, :cond_6

    .line 23
    invoke-interface {p1}, Lux$j;->a()V

    :cond_6
    :goto_2
    return-void
.end method

.method public d(Landroid/animation/Animator$AnimatorListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lux;->w:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lux;->w:Ljava/util/ArrayList;

    .line 3
    :cond_0
    iget-object v0, p0, Lux;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public d0()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-ne v0, v1, :cond_1

    .line 2
    iget v0, p0, Lux;->r:F

    const/high16 v1, 0x42b40000    # 90.0f

    rem-float/2addr v0, v1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getLayerType()I

    move-result v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    .line 4
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0, v2, v1}, Landroid/widget/ImageButton;->setLayerType(ILandroid/graphics/Paint;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getLayerType()I

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/ImageButton;->setLayerType(ILandroid/graphics/Paint;)V

    .line 7
    :cond_1
    :goto_0
    iget-object v0, p0, Lux;->b:Lhz;

    if-eqz v0, :cond_2

    .line 8
    iget v1, p0, Lux;->r:F

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Lhz;->c0(I)V

    :cond_2
    return-void
.end method

.method public e(Landroid/animation/Animator$AnimatorListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lux;->v:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lux;->v:Ljava/util/ArrayList;

    .line 3
    :cond_0
    iget-object v0, p0, Lux;->v:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    iget v0, p0, Lux;->s:F

    invoke-virtual {p0, v0}, Lux;->R(F)V

    return-void
.end method

.method public f(Lux$i;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lux;->x:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lux;->x:Ljava/util/ArrayList;

    .line 3
    :cond_0
    iget-object v0, p0, Lux;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final f0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lux;->A:Landroid/graphics/Rect;

    .line 2
    invoke-virtual {p0, v0}, Lux;->s(Landroid/graphics/Rect;)V

    .line 3
    invoke-virtual {p0, v0}, Lux;->G(Landroid/graphics/Rect;)V

    .line 4
    iget-object v1, p0, Lux;->z:Laz;

    iget v2, v0, Landroid/graphics/Rect;->left:I

    iget v3, v0, Landroid/graphics/Rect;->top:I

    iget v4, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-interface {v1, v2, v3, v4, v0}, Laz;->a(IIII)V

    return-void
.end method

.method public final g(FLandroid/graphics/Matrix;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Landroid/graphics/Matrix;->reset()V

    .line 2
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget v1, p0, Lux;->t:I

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Lux;->B:Landroid/graphics/RectF;

    .line 5
    iget-object v2, p0, Lux;->C:Landroid/graphics/RectF;

    .line 6
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v4, v3, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 7
    iget v0, p0, Lux;->t:I

    int-to-float v3, v0

    int-to-float v0, v0

    invoke-virtual {v2, v4, v4, v3, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 8
    sget-object v0, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {p2, v1, v2, v0}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 9
    iget v0, p0, Lux;->t:I

    int-to-float v1, v0

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    int-to-float v0, v0

    div-float/2addr v0, v2

    invoke-virtual {p2, p1, p1, v1, v0}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    :cond_0
    return-void
.end method

.method public g0(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lux;->b:Lhz;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lhz;->W(F)V

    :cond_0
    return-void
.end method

.method public final h(Law;FFF)Landroid/animation/AnimatorSet;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    iget-object v1, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    sget-object v2, Landroid/view/View;->ALPHA:Landroid/util/Property;

    const/4 v3, 0x1

    new-array v4, v3, [F

    const/4 v5, 0x0

    aput p2, v4, v5

    invoke-static {v1, v2, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    const v1, 0x10cd

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {p1, v1}, Law;->e(Ljava/lang/String;)Lbw;

    move-result-object v1

    invoke-virtual {v1, p2}, Lbw;->a(Landroid/animation/Animator;)V

    .line 4
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object p2, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    sget-object v1, Landroid/view/View;->SCALE_X:Landroid/util/Property;

    new-array v2, v3, [F

    aput p3, v2, v5

    invoke-static {p2, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    const v1, 0x10ce

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {p1, v1}, Law;->e(Ljava/lang/String;)Lbw;

    move-result-object v2

    invoke-virtual {v2, p2}, Lbw;->a(Landroid/animation/Animator;)V

    .line 7
    invoke-virtual {p0, p2}, Lux;->h0(Landroid/animation/ObjectAnimator;)V

    .line 8
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    iget-object p2, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    sget-object v2, Landroid/view/View;->SCALE_Y:Landroid/util/Property;

    new-array v4, v3, [F

    aput p3, v4, v5

    invoke-static {p2, v2, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    .line 10
    invoke-virtual {p1, v1}, Law;->e(Ljava/lang/String;)Lbw;

    move-result-object p3

    invoke-virtual {p3, p2}, Lbw;->a(Landroid/animation/Animator;)V

    .line 11
    invoke-virtual {p0, p2}, Lux;->h0(Landroid/animation/ObjectAnimator;)V

    .line 12
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    iget-object p2, p0, Lux;->D:Landroid/graphics/Matrix;

    invoke-virtual {p0, p4, p2}, Lux;->g(FLandroid/graphics/Matrix;)V

    .line 14
    iget-object p2, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    new-instance p3, Lyv;

    invoke-direct {p3}, Lyv;-><init>()V

    new-instance p4, Lux$c;

    invoke-direct {p4, p0}, Lux$c;-><init>(Lux;)V

    new-array v1, v3, [Landroid/graphics/Matrix;

    new-instance v2, Landroid/graphics/Matrix;

    iget-object v3, p0, Lux;->D:Landroid/graphics/Matrix;

    invoke-direct {v2, v3}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    aput-object v2, v1, v5

    .line 15
    invoke-static {p2, p3, p4, v1}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object p2

    const p3, 0x10cf

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    .line 16
    invoke-virtual {p1, p3}, Law;->e(Ljava/lang/String;)Lbw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lbw;->a(Landroid/animation/Animator;)V

    .line 17
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 19
    invoke-static {p1, v0}, Luv;->a(Landroid/animation/AnimatorSet;Ljava/util/List;)V

    return-object p1
.end method

.method public final h0(Landroid/animation/ObjectAnimator;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lux$d;

    invoke-direct {v0, p0}, Lux$d;-><init>(Lux;)V

    invoke-virtual {p1, v0}, Landroid/animation/ObjectAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    return-void
.end method

.method public final i(Lux$l;)Landroid/animation/ValueAnimator;
    .locals 3

    .line 1
    new-instance v0, Landroid/animation/ValueAnimator;

    invoke-direct {v0}, Landroid/animation/ValueAnimator;-><init>()V

    .line 2
    sget-object v1, Lux;->F:Landroid/animation/TimeInterpolator;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v1, 0x64

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 4
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 5
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const/4 p1, 0x2

    new-array p1, p1, [F

    .line 6
    fill-array-data p1, :array_0

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    return-object v0

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public j()Lhz;
    .locals 2

    .line 1
    iget-object v0, p0, Lux;->a:Llz;

    invoke-static {v0}, Ldb;->e(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Llz;

    .line 2
    new-instance v1, Lhz;

    invoke-direct {v1, v0}, Lhz;-><init>(Llz;)V

    return-object v1
.end method

.method public final k()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lux;->e:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final l()Law;
    .locals 2

    .line 1
    iget-object v0, p0, Lux;->n:Law;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 3
    invoke-virtual {v0}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lhv;->design_fab_hide_motion_spec:I

    invoke-static {v0, v1}, Law;->c(Landroid/content/Context;I)Law;

    move-result-object v0

    iput-object v0, p0, Lux;->n:Law;

    .line 4
    :cond_0
    iget-object v0, p0, Lux;->n:Law;

    invoke-static {v0}, Ldb;->e(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Law;

    return-object v0
.end method

.method public final m()Law;
    .locals 2

    .line 1
    iget-object v0, p0, Lux;->m:Law;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 3
    invoke-virtual {v0}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lhv;->design_fab_show_motion_spec:I

    invoke-static {v0, v1}, Law;->c(Landroid/content/Context;I)Law;

    move-result-object v0

    iput-object v0, p0, Lux;->m:Law;

    .line 4
    :cond_0
    iget-object v0, p0, Lux;->m:Law;

    invoke-static {v0}, Ldb;->e(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Law;

    return-object v0
.end method

.method public n()F
    .locals 1

    .line 1
    iget v0, p0, Lux;->h:F

    return v0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lux;->f:Z

    return v0
.end method

.method public final p()Law;
    .locals 1

    .line 1
    iget-object v0, p0, Lux;->q:Law;

    return-object v0
.end method

.method public q()F
    .locals 1

    .line 1
    iget v0, p0, Lux;->i:F

    return v0
.end method

.method public final r()Landroid/view/ViewTreeObserver$OnPreDrawListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lux;->E:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lux$e;

    invoke-direct {v0, p0}, Lux$e;-><init>(Lux;)V

    iput-object v0, p0, Lux;->E:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 3
    :cond_0
    iget-object v0, p0, Lux;->E:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    return-object v0
.end method

.method public s(Landroid/graphics/Rect;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lux;->f:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lux;->k:I

    iget-object v1, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 2
    invoke-virtual {v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getSizeDimension()I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    iget-boolean v1, p0, Lux;->g:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lux;->n()F

    move-result v1

    iget v2, p0, Lux;->j:F

    add-float/2addr v1, v2

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    float-to-double v2, v1

    .line 4
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/high16 v3, 0x3fc00000    # 1.5f

    mul-float/2addr v1, v3

    float-to-double v3, v1

    .line 5
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v1, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 6
    invoke-virtual {p1, v2, v0, v2, v0}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public t()F
    .locals 1

    .line 1
    iget v0, p0, Lux;->j:F

    return v0
.end method

.method public final u()Llz;
    .locals 1

    .line 1
    iget-object v0, p0, Lux;->a:Llz;

    return-object v0
.end method

.method public final v()Law;
    .locals 1

    .line 1
    iget-object v0, p0, Lux;->p:Law;

    return-object v0
.end method

.method public w(Lux$j;Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lux;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lux;->o:Landroid/animation/Animator;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 4
    :cond_1
    invoke-virtual {p0}, Lux;->a0()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 5
    iget-object v0, p0, Lux;->q:Law;

    if-eqz v0, :cond_2

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {p0}, Lux;->l()Law;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, v0, v1, v1, v1}, Lux;->h(Law;FFF)Landroid/animation/AnimatorSet;

    move-result-object v0

    .line 8
    new-instance v1, Lux$a;

    invoke-direct {v1, p0, p2, p1}, Lux$a;-><init>(Lux;ZLux$j;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 9
    iget-object p1, p0, Lux;->w:Ljava/util/ArrayList;

    if-eqz p1, :cond_3

    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/animation/Animator$AnimatorListener;

    .line 11
    invoke-virtual {v0, p2}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_1

    .line 12
    :cond_3
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    goto :goto_3

    .line 13
    :cond_4
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    if-eqz p2, :cond_5

    const/16 v1, 0x8

    goto :goto_2

    :cond_5
    const/4 v1, 0x4

    :goto_2
    invoke-virtual {v0, v1, p2}, Loy;->b(IZ)V

    if-eqz p1, :cond_6

    .line 14
    invoke-interface {p1}, Lux$j;->b()V

    :cond_6
    :goto_3
    return-void
.end method

.method public x(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Landroid/content/res/ColorStateList;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lux;->j()Lhz;

    move-result-object p4

    iput-object p4, p0, Lux;->b:Lhz;

    .line 2
    invoke-virtual {p4, p1}, Lhz;->setTintList(Landroid/content/res/ColorStateList;)V

    if-eqz p2, :cond_0

    .line 3
    iget-object p1, p0, Lux;->b:Lhz;

    invoke-virtual {p1, p2}, Lhz;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 4
    :cond_0
    iget-object p1, p0, Lux;->b:Lhz;

    const p2, -0xbbbbbc

    invoke-virtual {p1, p2}, Lhz;->b0(I)V

    .line 5
    iget-object p1, p0, Lux;->b:Lhz;

    iget-object p2, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p2}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1, p2}, Lhz;->M(Landroid/content/Context;)V

    .line 6
    new-instance p1, Lxy;

    iget-object p2, p0, Lux;->b:Lhz;

    .line 7
    invoke-virtual {p2}, Lhz;->C()Llz;

    move-result-object p2

    invoke-direct {p1, p2}, Lxy;-><init>(Llz;)V

    .line 8
    invoke-static {p3}, Lyy;->d(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p1, p2}, Lxy;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 9
    iput-object p1, p0, Lux;->c:Landroid/graphics/drawable/Drawable;

    const/4 p2, 0x2

    new-array p2, p2, [Landroid/graphics/drawable/Drawable;

    const/4 p3, 0x0

    .line 10
    iget-object p4, p0, Lux;->b:Lhz;

    .line 11
    invoke-static {p4}, Ldb;->e(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p4, Landroid/graphics/drawable/Drawable;

    aput-object p4, p2, p3

    const/4 p3, 0x1

    aput-object p1, p2, p3

    .line 12
    new-instance p1, Landroid/graphics/drawable/LayerDrawable;

    invoke-direct {p1, p2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object p1, p0, Lux;->e:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public y()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    .line 2
    iget v0, p0, Lux;->u:I

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    return v1

    .line 3
    :cond_1
    iget v0, p0, Lux;->u:I

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    move v1, v2

    :cond_2
    return v1
.end method

.method public z()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 2
    iget v0, p0, Lux;->u:I

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    move v1, v2

    :cond_0
    return v1

    .line 3
    :cond_1
    iget v0, p0, Lux;->u:I

    if-eq v0, v2, :cond_2

    move v1, v2

    :cond_2
    return v1
.end method
