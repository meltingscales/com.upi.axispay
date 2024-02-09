.class public Lqw;
.super Lhz;
.source "AxisPay"

# interfaces
.implements Lp9;
.implements Landroid/graphics/drawable/Drawable$Callback;
.implements Ljy$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqw$a;
    }
.end annotation


# static fields
.field public static final J0:[I

.field public static final K0:Landroid/graphics/drawable/ShapeDrawable;


# instance fields
.field public A:Landroid/content/res/ColorStateList;

.field public A0:Landroid/graphics/PorterDuff$Mode;

.field public B:F

.field public B0:[I

.field public C:F

.field public C0:Z

.field public D:Landroid/content/res/ColorStateList;

.field public D0:Landroid/content/res/ColorStateList;

.field public E:F

.field public E0:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lqw$a;",
            ">;"
        }
    .end annotation
.end field

.field public F:Landroid/content/res/ColorStateList;

.field public F0:Landroid/text/TextUtils$TruncateAt;

.field public G:Ljava/lang/CharSequence;

.field public G0:Z

.field public H:Z

.field public H0:I

.field public I:Landroid/graphics/drawable/Drawable;

.field public I0:Z

.field public J:Landroid/content/res/ColorStateList;

.field public K:F

.field public L:Z

.field public M:Z

.field public N:Landroid/graphics/drawable/Drawable;

.field public O:Landroid/graphics/drawable/Drawable;

.field public P:Landroid/content/res/ColorStateList;

.field public Q:F

.field public R:Ljava/lang/CharSequence;

.field public S:Z

.field public T:Z

.field public U:Landroid/graphics/drawable/Drawable;

.field public V:Landroid/content/res/ColorStateList;

.field public W:Law;

.field public X:Law;

.field public Y:F

.field public Z:F

.field public a0:F

.field public b0:F

.field public c0:F

.field public d0:F

.field public e0:F

.field public f0:F

.field public final g0:Landroid/content/Context;

.field public final h0:Landroid/graphics/Paint;

.field public final i0:Landroid/graphics/Paint;

.field public final j0:Landroid/graphics/Paint$FontMetrics;

.field public final k0:Landroid/graphics/RectF;

.field public final l0:Landroid/graphics/PointF;

.field public final m0:Landroid/graphics/Path;

.field public final n0:Ljy;

.field public o0:I

.field public p0:I

.field public q0:I

.field public r0:I

.field public s0:I

.field public t0:I

.field public u0:Z

.field public v0:I

.field public w0:I

.field public x0:Landroid/graphics/ColorFilter;

.field public y0:Landroid/graphics/PorterDuffColorFilter;

.field public z:Landroid/content/res/ColorStateList;

.field public z0:Landroid/content/res/ColorStateList;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x101009e

    aput v2, v0, v1

    .line 1
    sput-object v0, Lqw;->J0:[I

    .line 2
    new-instance v0, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v1, Landroid/graphics/drawable/shapes/OvalShape;

    invoke-direct {v1}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    sput-object v0, Lqw;->K0:Landroid/graphics/drawable/ShapeDrawable;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lhz;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/high16 p2, -0x40800000    # -1.0f

    .line 2
    iput p2, p0, Lqw;->C:F

    .line 3
    new-instance p2, Landroid/graphics/Paint;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p2, p0, Lqw;->h0:Landroid/graphics/Paint;

    .line 4
    new-instance p2, Landroid/graphics/Paint$FontMetrics;

    invoke-direct {p2}, Landroid/graphics/Paint$FontMetrics;-><init>()V

    iput-object p2, p0, Lqw;->j0:Landroid/graphics/Paint$FontMetrics;

    .line 5
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Lqw;->k0:Landroid/graphics/RectF;

    .line 6
    new-instance p2, Landroid/graphics/PointF;

    invoke-direct {p2}, Landroid/graphics/PointF;-><init>()V

    iput-object p2, p0, Lqw;->l0:Landroid/graphics/PointF;

    .line 7
    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, Lqw;->m0:Landroid/graphics/Path;

    const/16 p2, 0xff

    .line 8
    iput p2, p0, Lqw;->w0:I

    .line 9
    sget-object p2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object p2, p0, Lqw;->A0:Landroid/graphics/PorterDuff$Mode;

    .line 10
    new-instance p2, Ljava/lang/ref/WeakReference;

    const/4 p4, 0x0

    invoke-direct {p2, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lqw;->E0:Ljava/lang/ref/WeakReference;

    .line 11
    invoke-virtual {p0, p1}, Lhz;->M(Landroid/content/Context;)V

    .line 12
    iput-object p1, p0, Lqw;->g0:Landroid/content/Context;

    .line 13
    new-instance p2, Ljy;

    invoke-direct {p2, p0}, Ljy;-><init>(Ljy$b;)V

    iput-object p2, p0, Lqw;->n0:Ljy;

    const v0, 0x2a9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 14
    iput-object v0, p0, Lqw;->G:Ljava/lang/CharSequence;

    .line 15
    invoke-virtual {p2}, Ljy;->e()Landroid/text/TextPaint;

    move-result-object p2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    iput p1, p2, Landroid/text/TextPaint;->density:F

    .line 16
    iput-object p4, p0, Lqw;->i0:Landroid/graphics/Paint;

    .line 17
    sget-object p1, Lqw;->J0:[I

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 18
    invoke-virtual {p0, p1}, Lqw;->l2([I)Z

    .line 19
    iput-boolean p3, p0, Lqw;->G0:Z

    .line 20
    sget-boolean p1, Lyy;->a:Z

    if-eqz p1, :cond_0

    .line 21
    sget-object p1, Lqw;->K0:Landroid/graphics/drawable/ShapeDrawable;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/ShapeDrawable;->setTint(I)V

    :cond_0
    return-void
.end method

.method public static n1([II)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 1
    :cond_0
    array-length v1, p0

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_2

    aget v3, p0, v2

    if-ne v3, p1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public static r1(Landroid/content/res/ColorStateList;)Z
    .locals 0

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static s1(Landroid/graphics/drawable/Drawable;)Z
    .locals 0

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static t1(Luy;)Z
    .locals 0

    if-eqz p0, :cond_0

    .line 1
    iget-object p0, p0, Luy;->a:Landroid/content/res/ColorStateList;

    if-eqz p0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static v0(Landroid/content/Context;Landroid/util/AttributeSet;II)Lqw;
    .locals 1

    .line 1
    new-instance v0, Lqw;

    invoke-direct {v0, p0, p1, p2, p3}, Lqw;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 2
    invoke-virtual {v0, p1, p2, p3}, Lqw;->u1(Landroid/util/AttributeSet;II)V

    return-object v0
.end method


# virtual methods
.method public final A0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lqw;->I0:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lqw;->h0:Landroid/graphics/Paint;

    iget v1, p0, Lqw;->o0:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    iget-object v0, p0, Lqw;->h0:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    iget-object v0, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {v0, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 5
    iget-object p2, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {p0}, Lqw;->I0()F

    move-result v0

    invoke-virtual {p0}, Lqw;->I0()F

    move-result v1

    iget-object v2, p0, Lqw;->h0:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public A1(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-static {v0, p1}, Lk0;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->z1(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public A2(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lqw;->G0:Z

    return-void
.end method

.method public final B0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lqw;->O2()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {p0, p2, v0}, Lqw;->o0(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    .line 3
    iget-object p2, p0, Lqw;->k0:Landroid/graphics/RectF;

    iget v0, p2, Landroid/graphics/RectF;->left:F

    .line 4
    iget p2, p2, Landroid/graphics/RectF;->top:F

    .line 5
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 6
    iget-object v1, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    float-to-int v2, v2

    iget-object v3, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    float-to-int v3, v3

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 7
    sget-boolean v1, Lyy;->a:Z

    if-eqz v1, :cond_0

    .line 8
    iget-object v1, p0, Lqw;->O:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 9
    iget-object v1, p0, Lqw;->O:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    .line 10
    iget-object v1, p0, Lqw;->O:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :goto_0
    neg-float v0, v0

    neg-float p2, p2

    .line 12
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_1
    return-void
.end method

.method public B1(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->V:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_1

    .line 2
    iput-object p1, p0, Lqw;->V:Landroid/content/res/ColorStateList;

    .line 3
    invoke-virtual {p0}, Lqw;->u0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1}, Lo9;->o(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->onStateChange([I)Z

    :cond_1
    return-void
.end method

.method public B2(Law;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqw;->W:Law;

    return-void
.end method

.method public final C0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lqw;->h0:Landroid/graphics/Paint;

    iget v1, p0, Lqw;->s0:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    iget-object v0, p0, Lqw;->h0:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 3
    iget-object v0, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {v0, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 4
    iget-boolean v0, p0, Lqw;->I0:Z

    if-nez v0, :cond_0

    .line 5
    iget-object p2, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {p0}, Lqw;->I0()F

    move-result v0

    invoke-virtual {p0}, Lqw;->I0()F

    move-result v1

    iget-object v2, p0, Lqw;->h0:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, p2}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    iget-object p2, p0, Lqw;->m0:Landroid/graphics/Path;

    invoke-virtual {p0, v0, p2}, Lhz;->h(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    .line 7
    iget-object p2, p0, Lqw;->h0:Landroid/graphics/Paint;

    iget-object v0, p0, Lqw;->m0:Landroid/graphics/Path;

    invoke-virtual {p0}, Lhz;->u()Landroid/graphics/RectF;

    move-result-object v1

    invoke-super {p0, p1, p2, v0, v1}, Lhz;->p(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Landroid/graphics/RectF;)V

    :goto_0
    return-void
.end method

.method public C1(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-static {v0, p1}, Lk0;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->B1(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public C2(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-static {v0, p1}, Law;->c(Landroid/content/Context;I)Law;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->B2(Law;)V

    return-void
.end method

.method public final D0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lqw;->i0:Landroid/graphics/Paint;

    if-eqz v0, :cond_4

    const/high16 v1, -0x1000000

    const/16 v2, 0x7f

    .line 2
    invoke-static {v1, v2}, Ld9;->m(II)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    iget-object v0, p0, Lqw;->i0:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 4
    invoke-virtual {p0}, Lqw;->N2()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lqw;->M2()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    :cond_0
    iget-object v0, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {p0, p2, v0}, Lqw;->l0(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    .line 6
    iget-object v0, p0, Lqw;->k0:Landroid/graphics/RectF;

    iget-object v1, p0, Lqw;->i0:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 7
    :cond_1
    iget-object v0, p0, Lqw;->G:Ljava/lang/CharSequence;

    if-eqz v0, :cond_2

    .line 8
    iget v0, p2, Landroid/graphics/Rect;->left:I

    int-to-float v4, v0

    .line 9
    invoke-virtual {p2}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v5

    iget v0, p2, Landroid/graphics/Rect;->right:I

    int-to-float v6, v0

    invoke-virtual {p2}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v7

    iget-object v8, p0, Lqw;->i0:Landroid/graphics/Paint;

    move-object v3, p1

    .line 10
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 11
    :cond_2
    invoke-virtual {p0}, Lqw;->O2()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 12
    iget-object v0, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {p0, p2, v0}, Lqw;->o0(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    .line 13
    iget-object v0, p0, Lqw;->k0:Landroid/graphics/RectF;

    iget-object v1, p0, Lqw;->i0:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 14
    :cond_3
    iget-object v0, p0, Lqw;->i0:Landroid/graphics/Paint;

    const/high16 v1, -0x10000

    invoke-static {v1, v2}, Ld9;->m(II)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 15
    iget-object v0, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {p0, p2, v0}, Lqw;->n0(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    .line 16
    iget-object v0, p0, Lqw;->k0:Landroid/graphics/RectF;

    iget-object v1, p0, Lqw;->i0:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 17
    iget-object v0, p0, Lqw;->i0:Landroid/graphics/Paint;

    const v1, -0xff0100

    invoke-static {v1, v2}, Ld9;->m(II)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 18
    iget-object v0, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {p0, p2, v0}, Lqw;->p0(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    .line 19
    iget-object p2, p0, Lqw;->k0:Landroid/graphics/RectF;

    iget-object v0, p0, Lqw;->i0:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_4
    return-void
.end method

.method public D1(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->E1(Z)V

    return-void
.end method

.method public D2(Ljava/lang/CharSequence;)V
    .locals 1

    if-nez p1, :cond_0

    const p1, 0x2aa

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 1
    :cond_0
    iget-object v0, p0, Lqw;->G:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iput-object p1, p0, Lqw;->G:Ljava/lang/CharSequence;

    .line 3
    iget-object p1, p0, Lqw;->n0:Ljy;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljy;->i(Z)V

    .line 4
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    .line 5
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_1
    return-void
.end method

.method public final E0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lqw;->G:Ljava/lang/CharSequence;

    if-eqz v0, :cond_4

    .line 2
    iget-object v0, p0, Lqw;->l0:Landroid/graphics/PointF;

    invoke-virtual {p0, p2, v0}, Lqw;->t0(Landroid/graphics/Rect;Landroid/graphics/PointF;)Landroid/graphics/Paint$Align;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {p0, p2, v1}, Lqw;->r0(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    .line 4
    iget-object p2, p0, Lqw;->n0:Ljy;

    invoke-virtual {p2}, Ljy;->d()Luy;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 5
    iget-object p2, p0, Lqw;->n0:Ljy;

    invoke-virtual {p2}, Ljy;->e()Landroid/text/TextPaint;

    move-result-object p2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v1

    iput-object v1, p2, Landroid/text/TextPaint;->drawableState:[I

    .line 6
    iget-object p2, p0, Lqw;->n0:Ljy;

    iget-object v1, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {p2, v1}, Ljy;->j(Landroid/content/Context;)V

    .line 7
    :cond_0
    iget-object p2, p0, Lqw;->n0:Ljy;

    invoke-virtual {p2}, Ljy;->e()Landroid/text/TextPaint;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/text/TextPaint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 8
    iget-object p2, p0, Lqw;->n0:Ljy;

    .line 9
    invoke-virtual {p0}, Lqw;->h1()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljy;->f(Ljava/lang/String;)F

    move-result p2

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    iget-object v0, p0, Lqw;->k0:Landroid/graphics/RectF;

    .line 10
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    const/4 v1, 0x0

    if-le p2, v0, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    move p2, v1

    :goto_0
    if-eqz p2, :cond_2

    .line 11
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    .line 12
    iget-object v0, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 13
    :cond_2
    iget-object v0, p0, Lqw;->G:Ljava/lang/CharSequence;

    if-eqz p2, :cond_3

    .line 14
    iget-object v2, p0, Lqw;->F0:Landroid/text/TextUtils$TruncateAt;

    if-eqz v2, :cond_3

    .line 15
    iget-object v2, p0, Lqw;->n0:Ljy;

    .line 16
    invoke-virtual {v2}, Ljy;->e()Landroid/text/TextPaint;

    move-result-object v2

    iget-object v3, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    iget-object v4, p0, Lqw;->F0:Landroid/text/TextUtils$TruncateAt;

    invoke-static {v0, v2, v3, v4}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    move-result-object v0

    :cond_3
    move-object v3, v0

    const/4 v4, 0x0

    .line 17
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v5

    iget-object v0, p0, Lqw;->l0:Landroid/graphics/PointF;

    iget v6, v0, Landroid/graphics/PointF;->x:F

    iget v7, v0, Landroid/graphics/PointF;->y:F

    iget-object v0, p0, Lqw;->n0:Ljy;

    invoke-virtual {v0}, Ljy;->e()Landroid/text/TextPaint;

    move-result-object v8

    move-object v2, p1

    .line 18
    invoke-virtual/range {v2 .. v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    if-eqz p2, :cond_4

    .line 19
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_4
    return-void
.end method

.method public E1(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqw;->T:Z

    if-eq v0, p1, :cond_2

    .line 2
    invoke-virtual {p0}, Lqw;->M2()Z

    move-result v0

    .line 3
    iput-boolean p1, p0, Lqw;->T:Z

    .line 4
    invoke-virtual {p0}, Lqw;->M2()Z

    move-result p1

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Lqw;->k0(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 6
    :cond_1
    iget-object p1, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Lqw;->P2(Landroid/graphics/drawable/Drawable;)V

    .line 7
    :goto_1
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    .line 8
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_2
    return-void
.end method

.method public E2(Luy;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lqw;->n0:Ljy;

    iget-object v1, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {v0, p1, v1}, Ljy;->h(Luy;Landroid/content/Context;)V

    return-void
.end method

.method public F0()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public F1(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->A:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    .line 2
    iput-object p1, p0, Lqw;->A:Landroid/content/res/ColorStateList;

    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->onStateChange([I)Z

    :cond_0
    return-void
.end method

.method public F2(I)V
    .locals 2

    .line 1
    new-instance v0, Luy;

    iget-object v1, p0, Lqw;->g0:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Luy;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0, v0}, Lqw;->E2(Luy;)V

    return-void
.end method

.method public G0()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->V:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public G1(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-static {v0, p1}, Lk0;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->F1(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public G2(F)V
    .locals 1

    .line 1
    iget v0, p0, Lqw;->c0:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lqw;->c0:F

    .line 3
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    .line 4
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_0
    return-void
.end method

.method public H0()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->A:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public H1(F)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget v0, p0, Lqw;->C:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lqw;->C:F

    .line 3
    invoke-virtual {p0}, Lhz;->C()Llz;

    move-result-object v0

    invoke-virtual {v0, p1}, Llz;->w(F)Llz;

    move-result-object p1

    invoke-virtual {p0, p1}, Lhz;->setShapeAppearanceModel(Llz;)V

    :cond_0
    return-void
.end method

.method public H2(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->G2(F)V

    return-void
.end method

.method public I0()F
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqw;->I0:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lhz;->F()F

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lqw;->C:F

    :goto_0
    return v0
.end method

.method public I1(I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->H1(F)V

    return-void
.end method

.method public I2(F)V
    .locals 1

    .line 1
    iget v0, p0, Lqw;->b0:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lqw;->b0:F

    .line 3
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    .line 4
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_0
    return-void
.end method

.method public J0()F
    .locals 1

    .line 1
    iget v0, p0, Lqw;->f0:F

    return v0
.end method

.method public J1(F)V
    .locals 1

    .line 1
    iget v0, p0, Lqw;->f0:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lqw;->f0:F

    .line 3
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    .line 4
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_0
    return-void
.end method

.method public J2(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->I2(F)V

    return-void
.end method

.method public K0()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lo9;->q(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public K1(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->J1(F)V

    return-void
.end method

.method public K2(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqw;->C0:Z

    if-eq v0, p1, :cond_0

    .line 2
    iput-boolean p1, p0, Lqw;->C0:Z

    .line 3
    invoke-virtual {p0}, Lqw;->Q2()V

    .line 4
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->onStateChange([I)Z

    :cond_0
    return-void
.end method

.method public L0()F
    .locals 1

    .line 1
    iget v0, p0, Lqw;->K:F

    return v0
.end method

.method public L1(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lqw;->K0()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eq v0, p1, :cond_2

    .line 2
    invoke-virtual {p0}, Lqw;->m0()F

    move-result v1

    if-eqz p1, :cond_0

    .line 3
    invoke-static {p1}, Lo9;->r(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    .line 4
    invoke-virtual {p0}, Lqw;->m0()F

    move-result p1

    .line 5
    invoke-virtual {p0, v0}, Lqw;->P2(Landroid/graphics/drawable/Drawable;)V

    .line 6
    invoke-virtual {p0}, Lqw;->N2()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lqw;->k0(Landroid/graphics/drawable/Drawable;)V

    .line 8
    :cond_1
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    cmpl-float p1, v1, p1

    if-eqz p1, :cond_2

    .line 9
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_2
    return-void
.end method

.method public L2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqw;->G0:Z

    return v0
.end method

.method public M0()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->J:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public M1(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-static {v0, p1}, Lk0;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->L1(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final M2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqw;->T:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lqw;->u0:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public N0()F
    .locals 1

    .line 1
    iget v0, p0, Lqw;->B:F

    return v0
.end method

.method public N1(F)V
    .locals 1

    .line 1
    iget v0, p0, Lqw;->K:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lqw;->m0()F

    move-result v0

    .line 3
    iput p1, p0, Lqw;->K:F

    .line 4
    invoke-virtual {p0}, Lqw;->m0()F

    move-result p1

    .line 5
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    cmpl-float p1, v0, p1

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_0
    return-void
.end method

.method public final N2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqw;->H:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public O0()F
    .locals 1

    .line 1
    iget v0, p0, Lqw;->Y:F

    return v0
.end method

.method public O1(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->N1(F)V

    return-void
.end method

.method public final O2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqw;->M:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public P0()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->D:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public P1(Landroid/content/res/ColorStateList;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lqw;->L:Z

    .line 2
    iget-object v0, p0, Lqw;->J:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_1

    .line 3
    iput-object p1, p0, Lqw;->J:Landroid/content/res/ColorStateList;

    .line 4
    invoke-virtual {p0}, Lqw;->N2()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1}, Lo9;->o(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->onStateChange([I)Z

    :cond_1
    return-void
.end method

.method public final P2(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_0
    return-void
.end method

.method public Q0()F
    .locals 1

    .line 1
    iget v0, p0, Lqw;->E:F

    return v0
.end method

.method public Q1(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-static {v0, p1}, Lk0;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->P1(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final Q2()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqw;->C0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqw;->F:Landroid/content/res/ColorStateList;

    .line 2
    invoke-static {v0}, Lyy;->d(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lqw;->D0:Landroid/content/res/ColorStateList;

    return-void
.end method

.method public R0()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lo9;->q(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public R1(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->S1(Z)V

    return-void
.end method

.method public final R2()V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 1
    new-instance v0, Landroid/graphics/drawable/RippleDrawable;

    .line 2
    invoke-virtual {p0}, Lqw;->f1()Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-static {v1}, Lyy;->d(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object v1

    iget-object v2, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    sget-object v3, Lqw;->K0:Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {v0, v1, v2, v3}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, Lqw;->O:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public S0()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->R:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public S1(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqw;->H:Z

    if-eq v0, p1, :cond_2

    .line 2
    invoke-virtual {p0}, Lqw;->N2()Z

    move-result v0

    .line 3
    iput-boolean p1, p0, Lqw;->H:Z

    .line 4
    invoke-virtual {p0}, Lqw;->N2()Z

    move-result p1

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Lqw;->k0(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 6
    :cond_1
    iget-object p1, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Lqw;->P2(Landroid/graphics/drawable/Drawable;)V

    .line 7
    :goto_1
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    .line 8
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_2
    return-void
.end method

.method public T0()F
    .locals 1

    .line 1
    iget v0, p0, Lqw;->e0:F

    return v0
.end method

.method public T1(F)V
    .locals 1

    .line 1
    iget v0, p0, Lqw;->B:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lqw;->B:F

    .line 3
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    .line 4
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_0
    return-void
.end method

.method public U0()F
    .locals 1

    .line 1
    iget v0, p0, Lqw;->Q:F

    return v0
.end method

.method public U1(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->T1(F)V

    return-void
.end method

.method public V0()F
    .locals 1

    .line 1
    iget v0, p0, Lqw;->d0:F

    return v0
.end method

.method public V1(F)V
    .locals 1

    .line 1
    iget v0, p0, Lqw;->Y:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lqw;->Y:F

    .line 3
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    .line 4
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_0
    return-void
.end method

.method public W0()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->B0:[I

    return-object v0
.end method

.method public W1(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->V1(F)V

    return-void
.end method

.method public X0()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->P:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public X1(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->D:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_1

    .line 2
    iput-object p1, p0, Lqw;->D:Landroid/content/res/ColorStateList;

    .line 3
    iget-boolean v0, p0, Lqw;->I0:Z

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0, p1}, Lhz;->f0(Landroid/content/res/ColorStateList;)V

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->onStateChange([I)Z

    :cond_1
    return-void
.end method

.method public Y0(Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lqw;->p0(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    return-void
.end method

.method public Y1(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-static {v0, p1}, Lk0;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->X1(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final Z0()F
    .locals 3

    .line 1
    iget-boolean v0, p0, Lqw;->u0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    .line 2
    :goto_0
    iget v1, p0, Lqw;->K:F

    const/4 v2, 0x0

    cmpg-float v2, v1, v2

    if-gtz v2, :cond_1

    if-eqz v0, :cond_1

    .line 3
    iget-object v1, p0, Lqw;->g0:Landroid/content/Context;

    const/16 v2, 0x18

    invoke-static {v1, v2}, Lny;->b(Landroid/content/Context;I)F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-float v1, v1

    .line 4
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v2, v2, v1

    if-gtz v2, :cond_1

    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    return v0

    :cond_1
    return v1
.end method

.method public Z1(F)V
    .locals 1

    .line 1
    iget v0, p0, Lqw;->E:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_1

    .line 2
    iput p1, p0, Lqw;->E:F

    .line 3
    iget-object v0, p0, Lqw;->h0:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 4
    iget-boolean v0, p0, Lqw;->I0:Z

    if-eqz v0, :cond_0

    .line 5
    invoke-super {p0, p1}, Lhz;->g0(F)V

    .line 6
    :cond_0
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lqw;->v1()V

    .line 2
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    return-void
.end method

.method public final a1()F
    .locals 3

    .line 1
    iget-boolean v0, p0, Lqw;->u0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    .line 2
    :goto_0
    iget v1, p0, Lqw;->K:F

    const/4 v2, 0x0

    cmpg-float v2, v1, v2

    if-gtz v2, :cond_1

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    return v0

    :cond_1
    return v1
.end method

.method public a2(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->Z1(F)V

    return-void
.end method

.method public b1()Landroid/text/TextUtils$TruncateAt;
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->F0:Landroid/text/TextUtils$TruncateAt;

    return-object v0
.end method

.method public final b2(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->z:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    .line 2
    iput-object p1, p0, Lqw;->z:Landroid/content/res/ColorStateList;

    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->onStateChange([I)Z

    :cond_0
    return-void
.end method

.method public c1()Law;
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->X:Law;

    return-object v0
.end method

.method public c2(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lqw;->R0()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eq v0, p1, :cond_3

    .line 2
    invoke-virtual {p0}, Lqw;->q0()F

    move-result v1

    if-eqz p1, :cond_0

    .line 3
    invoke-static {p1}, Lo9;->r(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    .line 4
    sget-boolean p1, Lyy;->a:Z

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p0}, Lqw;->R2()V

    .line 6
    :cond_1
    invoke-virtual {p0}, Lqw;->q0()F

    move-result p1

    .line 7
    invoke-virtual {p0, v0}, Lqw;->P2(Landroid/graphics/drawable/Drawable;)V

    .line 8
    invoke-virtual {p0}, Lqw;->O2()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9
    iget-object v0, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lqw;->k0(Landroid/graphics/drawable/Drawable;)V

    .line 10
    :cond_2
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    cmpl-float p1, v1, p1

    if-eqz p1, :cond_3

    .line 11
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_3
    return-void
.end method

.method public d1()F
    .locals 1

    .line 1
    iget v0, p0, Lqw;->a0:F

    return v0
.end method

.method public d2(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->R:Ljava/lang/CharSequence;

    if-eq v0, p1, :cond_0

    .line 2
    invoke-static {}, Lqa;->c()Lqa;

    move-result-object v0

    invoke-virtual {v0, p1}, Lqa;->h(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lqw;->R:Ljava/lang/CharSequence;

    .line 3
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p0}, Lqw;->getAlpha()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 3
    iget v7, p0, Lqw;->w0:I

    const/16 v8, 0xff

    if-ge v7, v8, :cond_1

    .line 4
    iget v1, v0, Landroid/graphics/Rect;->left:I

    int-to-float v3, v1

    iget v1, v0, Landroid/graphics/Rect;->top:I

    int-to-float v4, v1

    iget v1, v0, Landroid/graphics/Rect;->right:I

    int-to-float v5, v1

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    int-to-float v6, v1

    move-object v2, p1

    .line 5
    invoke-static/range {v2 .. v7}, Lmw;->a(Landroid/graphics/Canvas;FFFFI)I

    move-result v1

    .line 6
    :cond_1
    invoke-virtual {p0, p1, v0}, Lqw;->A0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    .line 7
    invoke-virtual {p0, p1, v0}, Lqw;->x0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    .line 8
    iget-boolean v2, p0, Lqw;->I0:Z

    if-eqz v2, :cond_2

    .line 9
    invoke-super {p0, p1}, Lhz;->draw(Landroid/graphics/Canvas;)V

    .line 10
    :cond_2
    invoke-virtual {p0, p1, v0}, Lqw;->z0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    .line 11
    invoke-virtual {p0, p1, v0}, Lqw;->C0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    .line 12
    invoke-virtual {p0, p1, v0}, Lqw;->y0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    .line 13
    invoke-virtual {p0, p1, v0}, Lqw;->w0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    .line 14
    iget-boolean v2, p0, Lqw;->G0:Z

    if-eqz v2, :cond_3

    .line 15
    invoke-virtual {p0, p1, v0}, Lqw;->E0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    .line 16
    :cond_3
    invoke-virtual {p0, p1, v0}, Lqw;->B0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    .line 17
    invoke-virtual {p0, p1, v0}, Lqw;->D0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    .line 18
    iget v0, p0, Lqw;->w0:I

    if-ge v0, v8, :cond_4

    .line 19
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_4
    :goto_0
    return-void
.end method

.method public e1()F
    .locals 1

    .line 1
    iget v0, p0, Lqw;->Z:F

    return v0
.end method

.method public e2(F)V
    .locals 1

    .line 1
    iget v0, p0, Lqw;->e0:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lqw;->e0:F

    .line 3
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    .line 4
    invoke-virtual {p0}, Lqw;->O2()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_0
    return-void
.end method

.method public f1()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->F:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public f2(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->e2(F)V

    return-void
.end method

.method public g1()Law;
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->W:Law;

    return-object v0
.end method

.method public g2(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-static {v0, p1}, Lk0;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->c2(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public getAlpha()I
    .locals 1

    .line 1
    iget v0, p0, Lqw;->w0:I

    return v0
.end method

.method public getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->x0:Landroid/graphics/ColorFilter;

    return-object v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lqw;->B:F

    float-to-int v0, v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 3

    .line 1
    iget v0, p0, Lqw;->Y:F

    .line 2
    invoke-virtual {p0}, Lqw;->m0()F

    move-result v1

    add-float/2addr v0, v1

    iget v1, p0, Lqw;->b0:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lqw;->n0:Ljy;

    .line 3
    invoke-virtual {p0}, Lqw;->h1()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljy;->f(Ljava/lang/String;)F

    move-result v1

    add-float/2addr v0, v1

    iget v1, p0, Lqw;->c0:F

    add-float/2addr v0, v1

    .line 4
    invoke-virtual {p0}, Lqw;->q0()F

    move-result v1

    add-float/2addr v0, v1

    iget v1, p0, Lqw;->f0:F

    add-float/2addr v0, v1

    .line 5
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 6
    iget v1, p0, Lqw;->H0:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 8
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 1
    iget-boolean v0, p0, Lqw;->I0:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Lhz;->getOutline(Landroid/graphics/Outline;)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 5
    iget v1, p0, Lqw;->C:F

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 6
    invoke-virtual {p0}, Lqw;->getIntrinsicWidth()I

    move-result v5

    invoke-virtual {p0}, Lqw;->getIntrinsicHeight()I

    move-result v6

    iget v7, p0, Lqw;->C:F

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 7
    :goto_0
    invoke-virtual {p0}, Lqw;->getAlpha()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/Outline;->setAlpha(F)V

    return-void
.end method

.method public h1()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->G:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public h2(F)V
    .locals 1

    .line 1
    iget v0, p0, Lqw;->Q:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lqw;->Q:F

    .line 3
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    .line 4
    invoke-virtual {p0}, Lqw;->O2()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_0
    return-void
.end method

.method public i1()Luy;
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->n0:Ljy;

    invoke-virtual {v0}, Ljy;->d()Luy;

    move-result-object v0

    return-object v0
.end method

.method public i2(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->h2(F)V

    return-void
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public isStateful()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->z:Landroid/content/res/ColorStateList;

    invoke-static {v0}, Lqw;->r1(Landroid/content/res/ColorStateList;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lqw;->A:Landroid/content/res/ColorStateList;

    .line 2
    invoke-static {v0}, Lqw;->r1(Landroid/content/res/ColorStateList;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lqw;->D:Landroid/content/res/ColorStateList;

    .line 3
    invoke-static {v0}, Lqw;->r1(Landroid/content/res/ColorStateList;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lqw;->C0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqw;->D0:Landroid/content/res/ColorStateList;

    .line 4
    invoke-static {v0}, Lqw;->r1(Landroid/content/res/ColorStateList;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Lqw;->n0:Ljy;

    .line 5
    invoke-virtual {v0}, Ljy;->d()Luy;

    move-result-object v0

    invoke-static {v0}, Lqw;->t1(Luy;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 6
    invoke-virtual {p0}, Lqw;->u0()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    .line 7
    invoke-static {v0}, Lqw;->s1(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    .line 8
    invoke-static {v0}, Lqw;->s1(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lqw;->z0:Landroid/content/res/ColorStateList;

    .line 9
    invoke-static {v0}, Lqw;->r1(Landroid/content/res/ColorStateList;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public j1()F
    .locals 1

    .line 1
    iget v0, p0, Lqw;->c0:F

    return v0
.end method

.method public j2(F)V
    .locals 1

    .line 1
    iget v0, p0, Lqw;->d0:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lqw;->d0:F

    .line 3
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    .line 4
    invoke-virtual {p0}, Lqw;->O2()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_0
    return-void
.end method

.method public final k0(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 2
    invoke-static {p0}, Lo9;->f(Landroid/graphics/drawable/Drawable;)I

    move-result v0

    invoke-static {p1, v0}, Lo9;->m(Landroid/graphics/drawable/Drawable;I)Z

    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    .line 4
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 5
    iget-object v0, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_2

    .line 6
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {p0}, Lqw;->W0()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 8
    :cond_1
    iget-object v0, p0, Lqw;->P:Landroid/content/res/ColorStateList;

    invoke-static {p1, v0}, Lo9;->o(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    return-void

    .line 9
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 11
    :cond_3
    iget-object v0, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_4

    iget-boolean p1, p0, Lqw;->L:Z

    if-eqz p1, :cond_4

    .line 12
    iget-object p1, p0, Lqw;->J:Landroid/content/res/ColorStateList;

    invoke-static {v0, p1}, Lo9;->o(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_4
    return-void
.end method

.method public k1()F
    .locals 1

    .line 1
    iget v0, p0, Lqw;->b0:F

    return v0
.end method

.method public k2(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->j2(F)V

    return-void
.end method

.method public final l0(Landroid/graphics/Rect;Landroid/graphics/RectF;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/graphics/RectF;->setEmpty()V

    .line 2
    invoke-virtual {p0}, Lqw;->N2()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lqw;->M2()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    :cond_0
    iget v0, p0, Lqw;->Y:F

    iget v1, p0, Lqw;->Z:F

    add-float/2addr v0, v1

    .line 4
    invoke-virtual {p0}, Lqw;->a1()F

    move-result v1

    .line 5
    invoke-static {p0}, Lo9;->f(Landroid/graphics/drawable/Drawable;)I

    move-result v2

    if-nez v2, :cond_1

    .line 6
    iget v2, p1, Landroid/graphics/Rect;->left:I

    int-to-float v2, v2

    add-float/2addr v2, v0

    iput v2, p2, Landroid/graphics/RectF;->left:F

    add-float/2addr v2, v1

    .line 7
    iput v2, p2, Landroid/graphics/RectF;->right:F

    goto :goto_0

    .line 8
    :cond_1
    iget v2, p1, Landroid/graphics/Rect;->right:I

    int-to-float v2, v2

    sub-float/2addr v2, v0

    iput v2, p2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v2, v1

    .line 9
    iput v2, p2, Landroid/graphics/RectF;->left:F

    .line 10
    :goto_0
    invoke-virtual {p0}, Lqw;->Z0()F

    move-result v0

    .line 11
    invoke-virtual {p1}, Landroid/graphics/Rect;->exactCenterY()F

    move-result p1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v0, v1

    sub-float/2addr p1, v1

    iput p1, p2, Landroid/graphics/RectF;->top:F

    add-float/2addr p1, v0

    .line 12
    iput p1, p2, Landroid/graphics/RectF;->bottom:F

    :cond_2
    return-void
.end method

.method public final l1()Landroid/graphics/ColorFilter;
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->x0:Landroid/graphics/ColorFilter;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqw;->y0:Landroid/graphics/PorterDuffColorFilter;

    :goto_0
    return-object v0
.end method

.method public l2([I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->B0:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iput-object p1, p0, Lqw;->B0:[I

    .line 3
    invoke-virtual {p0}, Lqw;->O2()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lqw;->w1([I[I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public m0()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lqw;->N2()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lqw;->M2()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 2
    :cond_1
    :goto_0
    iget v0, p0, Lqw;->Z:F

    invoke-virtual {p0}, Lqw;->a1()F

    move-result v1

    add-float/2addr v0, v1

    iget v1, p0, Lqw;->a0:F

    add-float/2addr v0, v1

    return v0
.end method

.method public m1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqw;->C0:Z

    return v0
.end method

.method public m2(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->P:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_1

    .line 2
    iput-object p1, p0, Lqw;->P:Landroid/content/res/ColorStateList;

    .line 3
    invoke-virtual {p0}, Lqw;->O2()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1}, Lo9;->o(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->onStateChange([I)Z

    :cond_1
    return-void
.end method

.method public final n0(Landroid/graphics/Rect;Landroid/graphics/RectF;)V
    .locals 2

    .line 1
    invoke-virtual {p2, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 2
    invoke-virtual {p0}, Lqw;->O2()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget v0, p0, Lqw;->f0:F

    iget v1, p0, Lqw;->e0:F

    add-float/2addr v0, v1

    iget v1, p0, Lqw;->Q:F

    add-float/2addr v0, v1

    iget v1, p0, Lqw;->d0:F

    add-float/2addr v0, v1

    iget v1, p0, Lqw;->c0:F

    add-float/2addr v0, v1

    .line 4
    invoke-static {p0}, Lo9;->f(Landroid/graphics/drawable/Drawable;)I

    move-result v1

    if-nez v1, :cond_0

    .line 5
    iget p1, p1, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    sub-float/2addr p1, v0

    iput p1, p2, Landroid/graphics/RectF;->right:F

    goto :goto_0

    .line 6
    :cond_0
    iget p1, p1, Landroid/graphics/Rect;->left:I

    int-to-float p1, p1

    add-float/2addr p1, v0

    iput p1, p2, Landroid/graphics/RectF;->left:F

    :cond_1
    :goto_0
    return-void
.end method

.method public n2(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-static {v0, p1}, Lk0;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->m2(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final o0(Landroid/graphics/Rect;Landroid/graphics/RectF;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/graphics/RectF;->setEmpty()V

    .line 2
    invoke-virtual {p0}, Lqw;->O2()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget v0, p0, Lqw;->f0:F

    iget v1, p0, Lqw;->e0:F

    add-float/2addr v0, v1

    .line 4
    invoke-static {p0}, Lo9;->f(Landroid/graphics/drawable/Drawable;)I

    move-result v1

    if-nez v1, :cond_0

    .line 5
    iget v1, p1, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    sub-float/2addr v1, v0

    iput v1, p2, Landroid/graphics/RectF;->right:F

    .line 6
    iget v0, p0, Lqw;->Q:F

    sub-float/2addr v1, v0

    iput v1, p2, Landroid/graphics/RectF;->left:F

    goto :goto_0

    .line 7
    :cond_0
    iget v1, p1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    add-float/2addr v1, v0

    iput v1, p2, Landroid/graphics/RectF;->left:F

    .line 8
    iget v0, p0, Lqw;->Q:F

    add-float/2addr v1, v0

    iput v1, p2, Landroid/graphics/RectF;->right:F

    .line 9
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/Rect;->exactCenterY()F

    move-result p1

    iget v0, p0, Lqw;->Q:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v0, v1

    sub-float/2addr p1, v1

    iput p1, p2, Landroid/graphics/RectF;->top:F

    add-float/2addr p1, v0

    .line 10
    iput p1, p2, Landroid/graphics/RectF;->bottom:F

    :cond_1
    return-void
.end method

.method public o1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqw;->S:Z

    return v0
.end method

.method public o2(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqw;->M:Z

    if-eq v0, p1, :cond_2

    .line 2
    invoke-virtual {p0}, Lqw;->O2()Z

    move-result v0

    .line 3
    iput-boolean p1, p0, Lqw;->M:Z

    .line 4
    invoke-virtual {p0}, Lqw;->O2()Z

    move-result p1

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Lqw;->k0(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 6
    :cond_1
    iget-object p1, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Lqw;->P2(Landroid/graphics/drawable/Drawable;)V

    .line 7
    :goto_1
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    .line 8
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_2
    return-void
.end method

.method public onLayoutDirectionChanged(I)Z
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onLayoutDirectionChanged(I)Z

    move-result v0

    .line 2
    invoke-virtual {p0}, Lqw;->N2()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, p1}, Lo9;->m(Landroid/graphics/drawable/Drawable;I)Z

    move-result v1

    or-int/2addr v0, v1

    .line 4
    :cond_0
    invoke-virtual {p0}, Lqw;->M2()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    iget-object v1, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, p1}, Lo9;->m(Landroid/graphics/drawable/Drawable;I)Z

    move-result v1

    or-int/2addr v0, v1

    .line 6
    :cond_1
    invoke-virtual {p0}, Lqw;->O2()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    iget-object v1, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, p1}, Lo9;->m(Landroid/graphics/drawable/Drawable;I)Z

    move-result p1

    or-int/2addr v0, p1

    :cond_2
    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public onLevelChange(I)Z
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onLevelChange(I)Z

    move-result v0

    .line 2
    invoke-virtual {p0}, Lqw;->N2()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result v1

    or-int/2addr v0, v1

    .line 4
    :cond_0
    invoke-virtual {p0}, Lqw;->M2()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    iget-object v1, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result v1

    or-int/2addr v0, v1

    .line 6
    :cond_1
    invoke-virtual {p0}, Lqw;->O2()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    iget-object v1, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    or-int/2addr v0, p1

    :cond_2
    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    :cond_3
    return v0
.end method

.method public onStateChange([I)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqw;->I0:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Lhz;->onStateChange([I)Z

    .line 3
    :cond_0
    invoke-virtual {p0}, Lqw;->W0()[I

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lqw;->w1([I[I)Z

    move-result p1

    return p1
.end method

.method public final p0(Landroid/graphics/Rect;Landroid/graphics/RectF;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/graphics/RectF;->setEmpty()V

    .line 2
    invoke-virtual {p0}, Lqw;->O2()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget v0, p0, Lqw;->f0:F

    iget v1, p0, Lqw;->e0:F

    add-float/2addr v0, v1

    iget v1, p0, Lqw;->Q:F

    add-float/2addr v0, v1

    iget v1, p0, Lqw;->d0:F

    add-float/2addr v0, v1

    iget v1, p0, Lqw;->c0:F

    add-float/2addr v0, v1

    .line 4
    invoke-static {p0}, Lo9;->f(Landroid/graphics/drawable/Drawable;)I

    move-result v1

    if-nez v1, :cond_0

    .line 5
    iget v1, p1, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    iput v1, p2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v1, v0

    .line 6
    iput v1, p2, Landroid/graphics/RectF;->left:F

    goto :goto_0

    .line 7
    :cond_0
    iget v1, p1, Landroid/graphics/Rect;->left:I

    int-to-float v2, v1

    iput v2, p2, Landroid/graphics/RectF;->left:F

    int-to-float v1, v1

    add-float/2addr v1, v0

    .line 8
    iput v1, p2, Landroid/graphics/RectF;->right:F

    .line 9
    :goto_0
    iget v0, p1, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    iput v0, p2, Landroid/graphics/RectF;->top:F

    .line 10
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    iput p1, p2, Landroid/graphics/RectF;->bottom:F

    :cond_1
    return-void
.end method

.method public p1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Lqw;->s1(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    return v0
.end method

.method public p2(Lqw$a;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lqw;->E0:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public q0()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lqw;->O2()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Lqw;->d0:F

    iget v1, p0, Lqw;->Q:F

    add-float/2addr v0, v1

    iget v1, p0, Lqw;->e0:F

    add-float/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public q1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqw;->M:Z

    return v0
.end method

.method public q2(Landroid/text/TextUtils$TruncateAt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqw;->F0:Landroid/text/TextUtils$TruncateAt;

    return-void
.end method

.method public final r0(Landroid/graphics/Rect;Landroid/graphics/RectF;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/graphics/RectF;->setEmpty()V

    .line 2
    iget-object v0, p0, Lqw;->G:Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    .line 3
    iget v0, p0, Lqw;->Y:F

    invoke-virtual {p0}, Lqw;->m0()F

    move-result v1

    add-float/2addr v0, v1

    iget v1, p0, Lqw;->b0:F

    add-float/2addr v0, v1

    .line 4
    iget v1, p0, Lqw;->f0:F

    invoke-virtual {p0}, Lqw;->q0()F

    move-result v2

    add-float/2addr v1, v2

    iget v2, p0, Lqw;->c0:F

    add-float/2addr v1, v2

    .line 5
    invoke-static {p0}, Lo9;->f(Landroid/graphics/drawable/Drawable;)I

    move-result v2

    if-nez v2, :cond_0

    .line 6
    iget v2, p1, Landroid/graphics/Rect;->left:I

    int-to-float v2, v2

    add-float/2addr v2, v0

    iput v2, p2, Landroid/graphics/RectF;->left:F

    .line 7
    iget v0, p1, Landroid/graphics/Rect;->right:I

    int-to-float v0, v0

    sub-float/2addr v0, v1

    iput v0, p2, Landroid/graphics/RectF;->right:F

    goto :goto_0

    .line 8
    :cond_0
    iget v2, p1, Landroid/graphics/Rect;->left:I

    int-to-float v2, v2

    add-float/2addr v2, v1

    iput v2, p2, Landroid/graphics/RectF;->left:F

    .line 9
    iget v1, p1, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    sub-float/2addr v1, v0

    iput v1, p2, Landroid/graphics/RectF;->right:F

    .line 10
    :goto_0
    iget v0, p1, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    iput v0, p2, Landroid/graphics/RectF;->top:F

    .line 11
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    iput p1, p2, Landroid/graphics/RectF;->bottom:F

    :cond_1
    return-void
.end method

.method public r2(Law;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqw;->X:Law;

    return-void
.end method

.method public final s0()F
    .locals 2

    .line 1
    iget-object v0, p0, Lqw;->n0:Ljy;

    invoke-virtual {v0}, Ljy;->e()Landroid/text/TextPaint;

    move-result-object v0

    iget-object v1, p0, Lqw;->j0:Landroid/graphics/Paint$FontMetrics;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->getFontMetrics(Landroid/graphics/Paint$FontMetrics;)F

    .line 2
    iget-object v0, p0, Lqw;->j0:Landroid/graphics/Paint$FontMetrics;

    iget v1, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    add-float/2addr v1, v0

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr v1, v0

    return v1
.end method

.method public s2(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-static {v0, p1}, Law;->c(Landroid/content/Context;I)Law;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->r2(Law;)V

    return-void
.end method

.method public scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1, p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable$Callback;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method

.method public setAlpha(I)V
    .locals 1

    .line 1
    iget v0, p0, Lqw;->w0:I

    if-eq v0, p1, :cond_0

    .line 2
    iput p1, p0, Lqw;->w0:I

    .line 3
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->x0:Landroid/graphics/ColorFilter;

    if-eq v0, p1, :cond_0

    .line 2
    iput-object p1, p0, Lqw;->x0:Landroid/graphics/ColorFilter;

    .line 3
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->z0:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    .line 2
    iput-object p1, p0, Lqw;->z0:Landroid/content/res/ColorStateList;

    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->onStateChange([I)Z

    :cond_0
    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->A0:Landroid/graphics/PorterDuff$Mode;

    if-eq v0, p1, :cond_0

    .line 2
    iput-object p1, p0, Lqw;->A0:Landroid/graphics/PorterDuff$Mode;

    .line 3
    iget-object v0, p0, Lqw;->z0:Landroid/content/res/ColorStateList;

    invoke-static {p0, v0, p1}, Lpx;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    iput-object p1, p0, Lqw;->y0:Landroid/graphics/PorterDuffColorFilter;

    .line 4
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public setVisible(ZZ)Z
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result v0

    .line 2
    invoke-virtual {p0}, Lqw;->N2()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result v1

    or-int/2addr v0, v1

    .line 4
    :cond_0
    invoke-virtual {p0}, Lqw;->M2()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    iget-object v1, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result v1

    or-int/2addr v0, v1

    .line 6
    :cond_1
    invoke-virtual {p0}, Lqw;->O2()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    iget-object v1, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    or-int/2addr v0, p1

    :cond_2
    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    :cond_3
    return v0
.end method

.method public t0(Landroid/graphics/Rect;Landroid/graphics/PointF;)Landroid/graphics/Paint$Align;
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p2, v0, v0}, Landroid/graphics/PointF;->set(FF)V

    .line 2
    sget-object v0, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    .line 3
    iget-object v1, p0, Lqw;->G:Ljava/lang/CharSequence;

    if-eqz v1, :cond_1

    .line 4
    iget v0, p0, Lqw;->Y:F

    invoke-virtual {p0}, Lqw;->m0()F

    move-result v1

    add-float/2addr v0, v1

    iget v1, p0, Lqw;->b0:F

    add-float/2addr v0, v1

    .line 5
    invoke-static {p0}, Lo9;->f(Landroid/graphics/drawable/Drawable;)I

    move-result v1

    if-nez v1, :cond_0

    .line 6
    iget v1, p1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    add-float/2addr v1, v0

    iput v1, p2, Landroid/graphics/PointF;->x:F

    .line 7
    sget-object v0, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    goto :goto_0

    .line 8
    :cond_0
    iget v1, p1, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    sub-float/2addr v1, v0

    iput v1, p2, Landroid/graphics/PointF;->x:F

    .line 9
    sget-object v0, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    .line 10
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerY()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Lqw;->s0()F

    move-result v1

    sub-float/2addr p1, v1

    iput p1, p2, Landroid/graphics/PointF;->y:F

    :cond_1
    return-object v0
.end method

.method public t2(F)V
    .locals 1

    .line 1
    iget v0, p0, Lqw;->a0:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lqw;->m0()F

    move-result v0

    .line 3
    iput p1, p0, Lqw;->a0:F

    .line 4
    invoke-virtual {p0}, Lqw;->m0()F

    move-result p1

    .line 5
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    cmpl-float p1, v0, p1

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_0
    return-void
.end method

.method public final u0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqw;->T:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lqw;->S:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final u1(Landroid/util/AttributeSet;II)V
    .locals 7

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    sget-object v2, Lsv;->Chip:[I

    const/4 v6, 0x0

    new-array v5, v6, [I

    move-object v1, p1

    move v3, p2

    move v4, p3

    .line 2
    invoke-static/range {v0 .. v5}, Lly;->h(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 3
    sget p3, Lsv;->Chip_shapeAppearance:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p3

    iput-boolean p3, p0, Lqw;->I0:Z

    .line 4
    iget-object p3, p0, Lqw;->g0:Landroid/content/Context;

    sget v0, Lsv;->Chip_chipSurfaceColor:I

    .line 5
    invoke-static {p3, p2, v0}, Lty;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object p3

    .line 6
    invoke-virtual {p0, p3}, Lqw;->b2(Landroid/content/res/ColorStateList;)V

    .line 7
    iget-object p3, p0, Lqw;->g0:Landroid/content/Context;

    sget v0, Lsv;->Chip_chipBackgroundColor:I

    .line 8
    invoke-static {p3, p2, v0}, Lty;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object p3

    .line 9
    invoke-virtual {p0, p3}, Lqw;->F1(Landroid/content/res/ColorStateList;)V

    .line 10
    sget p3, Lsv;->Chip_chipMinHeight:I

    const/4 v0, 0x0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    invoke-virtual {p0, p3}, Lqw;->T1(F)V

    .line 11
    sget p3, Lsv;->Chip_chipCornerRadius:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 12
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    invoke-virtual {p0, p3}, Lqw;->H1(F)V

    .line 13
    :cond_0
    iget-object p3, p0, Lqw;->g0:Landroid/content/Context;

    sget v1, Lsv;->Chip_chipStrokeColor:I

    .line 14
    invoke-static {p3, p2, v1}, Lty;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object p3

    .line 15
    invoke-virtual {p0, p3}, Lqw;->X1(Landroid/content/res/ColorStateList;)V

    .line 16
    sget p3, Lsv;->Chip_chipStrokeWidth:I

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    invoke-virtual {p0, p3}, Lqw;->Z1(F)V

    .line 17
    iget-object p3, p0, Lqw;->g0:Landroid/content/Context;

    sget v1, Lsv;->Chip_rippleColor:I

    invoke-static {p3, p2, v1}, Lty;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object p3

    invoke-virtual {p0, p3}, Lqw;->y2(Landroid/content/res/ColorStateList;)V

    .line 18
    sget p3, Lsv;->Chip_android_text:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object p3

    invoke-virtual {p0, p3}, Lqw;->D2(Ljava/lang/CharSequence;)V

    .line 19
    iget-object p3, p0, Lqw;->g0:Landroid/content/Context;

    sget v1, Lsv;->Chip_android_textAppearance:I

    .line 20
    invoke-static {p3, p2, v1}, Lty;->f(Landroid/content/Context;Landroid/content/res/TypedArray;I)Luy;

    move-result-object p3

    .line 21
    sget v1, Lsv;->Chip_android_textSize:I

    iget v2, p3, Luy;->k:F

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    .line 22
    iput v1, p3, Luy;->k:F

    .line 23
    invoke-virtual {p0, p3}, Lqw;->E2(Luy;)V

    .line 24
    sget p3, Lsv;->Chip_android_ellipsize:I

    invoke-virtual {p2, p3, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    const/4 v1, 0x1

    if-eq p3, v1, :cond_3

    const/4 v1, 0x2

    if-eq p3, v1, :cond_2

    const/4 v1, 0x3

    if-eq p3, v1, :cond_1

    goto :goto_0

    .line 25
    :cond_1
    sget-object p3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p0, p3}, Lqw;->q2(Landroid/text/TextUtils$TruncateAt;)V

    goto :goto_0

    .line 26
    :cond_2
    sget-object p3, Landroid/text/TextUtils$TruncateAt;->MIDDLE:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p0, p3}, Lqw;->q2(Landroid/text/TextUtils$TruncateAt;)V

    goto :goto_0

    .line 27
    :cond_3
    sget-object p3, Landroid/text/TextUtils$TruncateAt;->START:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p0, p3}, Lqw;->q2(Landroid/text/TextUtils$TruncateAt;)V

    .line 28
    :goto_0
    sget p3, Lsv;->Chip_chipIconVisible:I

    invoke-virtual {p2, p3, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    invoke-virtual {p0, p3}, Lqw;->S1(Z)V

    const p3, 0x2ab

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    if-eqz p1, :cond_4

    const v1, 0x2ac

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 29
    invoke-interface {p1, p3, v1}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    const v1, 0x2ad

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 30
    invoke-interface {p1, p3, v1}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    .line 31
    sget v1, Lsv;->Chip_chipIconEnabled:I

    invoke-virtual {p2, v1, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {p0, v1}, Lqw;->S1(Z)V

    .line 32
    :cond_4
    iget-object v1, p0, Lqw;->g0:Landroid/content/Context;

    sget v2, Lsv;->Chip_chipIcon:I

    invoke-static {v1, p2, v2}, Lty;->d(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v1}, Lqw;->L1(Landroid/graphics/drawable/Drawable;)V

    .line 33
    sget v1, Lsv;->Chip_chipIconTint:I

    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 34
    iget-object v2, p0, Lqw;->g0:Landroid/content/Context;

    .line 35
    invoke-static {v2, p2, v1}, Lty;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    .line 36
    invoke-virtual {p0, v1}, Lqw;->P1(Landroid/content/res/ColorStateList;)V

    .line 37
    :cond_5
    sget v1, Lsv;->Chip_chipIconSize:I

    const/high16 v2, -0x40800000    # -1.0f

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    invoke-virtual {p0, v1}, Lqw;->N1(F)V

    .line 38
    sget v1, Lsv;->Chip_closeIconVisible:I

    invoke-virtual {p2, v1, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {p0, v1}, Lqw;->o2(Z)V

    if-eqz p1, :cond_6

    const v1, 0x2ae

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 39
    invoke-interface {p1, p3, v1}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    const v1, 0x2af

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 40
    invoke-interface {p1, p3, v1}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    .line 41
    sget v1, Lsv;->Chip_closeIconEnabled:I

    invoke-virtual {p2, v1, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {p0, v1}, Lqw;->o2(Z)V

    .line 42
    :cond_6
    iget-object v1, p0, Lqw;->g0:Landroid/content/Context;

    sget v2, Lsv;->Chip_closeIcon:I

    invoke-static {v1, p2, v2}, Lty;->d(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v1}, Lqw;->c2(Landroid/graphics/drawable/Drawable;)V

    .line 43
    iget-object v1, p0, Lqw;->g0:Landroid/content/Context;

    sget v2, Lsv;->Chip_closeIconTint:I

    .line 44
    invoke-static {v1, p2, v2}, Lty;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    .line 45
    invoke-virtual {p0, v1}, Lqw;->m2(Landroid/content/res/ColorStateList;)V

    .line 46
    sget v1, Lsv;->Chip_closeIconSize:I

    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    invoke-virtual {p0, v1}, Lqw;->h2(F)V

    .line 47
    sget v1, Lsv;->Chip_android_checkable:I

    invoke-virtual {p2, v1, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {p0, v1}, Lqw;->x1(Z)V

    .line 48
    sget v1, Lsv;->Chip_checkedIconVisible:I

    invoke-virtual {p2, v1, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {p0, v1}, Lqw;->E1(Z)V

    if-eqz p1, :cond_7

    const v1, 0x2b0

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 49
    invoke-interface {p1, p3, v1}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    const v1, 0x2b1

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 50
    invoke-interface {p1, p3, v1}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_7

    .line 51
    sget p1, Lsv;->Chip_checkedIconEnabled:I

    invoke-virtual {p2, p1, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->E1(Z)V

    .line 52
    :cond_7
    iget-object p1, p0, Lqw;->g0:Landroid/content/Context;

    sget p3, Lsv;->Chip_checkedIcon:I

    invoke-static {p1, p2, p3}, Lty;->d(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->z1(Landroid/graphics/drawable/Drawable;)V

    .line 53
    sget p1, Lsv;->Chip_checkedIconTint:I

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p3

    if-eqz p3, :cond_8

    .line 54
    iget-object p3, p0, Lqw;->g0:Landroid/content/Context;

    .line 55
    invoke-static {p3, p2, p1}, Lty;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    .line 56
    invoke-virtual {p0, p1}, Lqw;->B1(Landroid/content/res/ColorStateList;)V

    .line 57
    :cond_8
    iget-object p1, p0, Lqw;->g0:Landroid/content/Context;

    sget p3, Lsv;->Chip_showMotionSpec:I

    invoke-static {p1, p2, p3}, Law;->b(Landroid/content/Context;Landroid/content/res/TypedArray;I)Law;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->B2(Law;)V

    .line 58
    iget-object p1, p0, Lqw;->g0:Landroid/content/Context;

    sget p3, Lsv;->Chip_hideMotionSpec:I

    invoke-static {p1, p2, p3}, Law;->b(Landroid/content/Context;Landroid/content/res/TypedArray;I)Law;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->r2(Law;)V

    .line 59
    sget p1, Lsv;->Chip_chipStartPadding:I

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->V1(F)V

    .line 60
    sget p1, Lsv;->Chip_iconStartPadding:I

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->v2(F)V

    .line 61
    sget p1, Lsv;->Chip_iconEndPadding:I

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->t2(F)V

    .line 62
    sget p1, Lsv;->Chip_textStartPadding:I

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->I2(F)V

    .line 63
    sget p1, Lsv;->Chip_textEndPadding:I

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->G2(F)V

    .line 64
    sget p1, Lsv;->Chip_closeIconStartPadding:I

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->j2(F)V

    .line 65
    sget p1, Lsv;->Chip_closeIconEndPadding:I

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->e2(F)V

    .line 66
    sget p1, Lsv;->Chip_chipEndPadding:I

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->J1(F)V

    .line 67
    sget p1, Lsv;->Chip_android_maxWidth:I

    const p3, 0x7fffffff

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->x2(I)V

    .line 68
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public u2(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->t2(F)V

    return-void
.end method

.method public unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1, p0, p2}, Landroid/graphics/drawable/Drawable$Callback;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public v1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->E0:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqw$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lqw$a;->a()V

    :cond_0
    return-void
.end method

.method public v2(F)V
    .locals 1

    .line 1
    iget v0, p0, Lqw;->Z:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lqw;->m0()F

    move-result v0

    .line 3
    iput p1, p0, Lqw;->Z:F

    .line 4
    invoke-virtual {p0}, Lqw;->m0()F

    move-result p1

    .line 5
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    cmpl-float p1, v0, p1

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_0
    return-void
.end method

.method public final w0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lqw;->M2()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {p0, p2, v0}, Lqw;->l0(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    .line 3
    iget-object p2, p0, Lqw;->k0:Landroid/graphics/RectF;

    iget v0, p2, Landroid/graphics/RectF;->left:F

    .line 4
    iget p2, p2, Landroid/graphics/RectF;->top:F

    .line 5
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 6
    iget-object v1, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    float-to-int v2, v2

    iget-object v3, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    float-to-int v3, v3

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 7
    iget-object v1, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    neg-float v0, v0

    neg-float p2, p2

    .line 8
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_0
    return-void
.end method

.method public final w1([I[I)Z
    .locals 6

    .line 1
    invoke-super {p0, p1}, Lhz;->onStateChange([I)Z

    move-result v0

    .line 2
    iget-object v1, p0, Lqw;->z:Landroid/content/res/ColorStateList;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget v3, p0, Lqw;->o0:I

    .line 3
    invoke-virtual {v1, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    .line 4
    :goto_0
    invoke-virtual {p0, v1}, Lhz;->l(I)I

    move-result v1

    .line 5
    iget v3, p0, Lqw;->o0:I

    const/4 v4, 0x1

    if-eq v3, v1, :cond_1

    .line 6
    iput v1, p0, Lqw;->o0:I

    move v0, v4

    .line 7
    :cond_1
    iget-object v3, p0, Lqw;->A:Landroid/content/res/ColorStateList;

    if-eqz v3, :cond_2

    iget v5, p0, Lqw;->p0:I

    .line 8
    invoke-virtual {v3, p1, v5}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v3

    goto :goto_1

    :cond_2
    move v3, v2

    .line 9
    :goto_1
    invoke-virtual {p0, v3}, Lhz;->l(I)I

    move-result v3

    .line 10
    iget v5, p0, Lqw;->p0:I

    if-eq v5, v3, :cond_3

    .line 11
    iput v3, p0, Lqw;->p0:I

    move v0, v4

    .line 12
    :cond_3
    invoke-static {v1, v3}, Lww;->e(II)I

    move-result v1

    .line 13
    iget v3, p0, Lqw;->q0:I

    if-eq v3, v1, :cond_4

    move v3, v4

    goto :goto_2

    :cond_4
    move v3, v2

    .line 14
    :goto_2
    invoke-virtual {p0}, Lhz;->x()Landroid/content/res/ColorStateList;

    move-result-object v5

    if-nez v5, :cond_5

    move v5, v4

    goto :goto_3

    :cond_5
    move v5, v2

    :goto_3
    or-int/2addr v3, v5

    if-eqz v3, :cond_6

    .line 15
    iput v1, p0, Lqw;->q0:I

    .line 16
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lhz;->X(Landroid/content/res/ColorStateList;)V

    move v0, v4

    .line 17
    :cond_6
    iget-object v1, p0, Lqw;->D:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_7

    iget v3, p0, Lqw;->r0:I

    .line 18
    invoke-virtual {v1, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    goto :goto_4

    :cond_7
    move v1, v2

    .line 19
    :goto_4
    iget v3, p0, Lqw;->r0:I

    if-eq v3, v1, :cond_8

    .line 20
    iput v1, p0, Lqw;->r0:I

    move v0, v4

    .line 21
    :cond_8
    iget-object v1, p0, Lqw;->D0:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_9

    .line 22
    invoke-static {p1}, Lyy;->e([I)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, p0, Lqw;->D0:Landroid/content/res/ColorStateList;

    iget v3, p0, Lqw;->s0:I

    .line 23
    invoke-virtual {v1, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    goto :goto_5

    :cond_9
    move v1, v2

    .line 24
    :goto_5
    iget v3, p0, Lqw;->s0:I

    if-eq v3, v1, :cond_a

    .line 25
    iput v1, p0, Lqw;->s0:I

    .line 26
    iget-boolean v1, p0, Lqw;->C0:Z

    if-eqz v1, :cond_a

    move v0, v4

    .line 27
    :cond_a
    iget-object v1, p0, Lqw;->n0:Ljy;

    .line 28
    invoke-virtual {v1}, Ljy;->d()Luy;

    move-result-object v1

    if-eqz v1, :cond_b

    iget-object v1, p0, Lqw;->n0:Ljy;

    .line 29
    invoke-virtual {v1}, Ljy;->d()Luy;

    move-result-object v1

    iget-object v1, v1, Luy;->a:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_b

    iget-object v1, p0, Lqw;->n0:Ljy;

    .line 30
    invoke-virtual {v1}, Ljy;->d()Luy;

    move-result-object v1

    iget-object v1, v1, Luy;->a:Landroid/content/res/ColorStateList;

    iget v3, p0, Lqw;->t0:I

    .line 31
    invoke-virtual {v1, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    goto :goto_6

    :cond_b
    move v1, v2

    .line 32
    :goto_6
    iget v3, p0, Lqw;->t0:I

    if-eq v3, v1, :cond_c

    .line 33
    iput v1, p0, Lqw;->t0:I

    move v0, v4

    .line 34
    :cond_c
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v1

    const v3, 0x10100a0

    invoke-static {v1, v3}, Lqw;->n1([II)Z

    move-result v1

    if-eqz v1, :cond_d

    iget-boolean v1, p0, Lqw;->S:Z

    if-eqz v1, :cond_d

    move v1, v4

    goto :goto_7

    :cond_d
    move v1, v2

    .line 35
    :goto_7
    iget-boolean v3, p0, Lqw;->u0:Z

    if-eq v3, v1, :cond_f

    iget-object v3, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_f

    .line 36
    invoke-virtual {p0}, Lqw;->m0()F

    move-result v0

    .line 37
    iput-boolean v1, p0, Lqw;->u0:Z

    .line 38
    invoke-virtual {p0}, Lqw;->m0()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_e

    move v0, v4

    move v1, v0

    goto :goto_8

    :cond_e
    move v1, v2

    move v0, v4

    goto :goto_8

    :cond_f
    move v1, v2

    .line 39
    :goto_8
    iget-object v3, p0, Lqw;->z0:Landroid/content/res/ColorStateList;

    if-eqz v3, :cond_10

    iget v5, p0, Lqw;->v0:I

    invoke-virtual {v3, p1, v5}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v3

    goto :goto_9

    :cond_10
    move v3, v2

    .line 40
    :goto_9
    iget v5, p0, Lqw;->v0:I

    if-eq v5, v3, :cond_11

    .line 41
    iput v3, p0, Lqw;->v0:I

    .line 42
    iget-object v0, p0, Lqw;->z0:Landroid/content/res/ColorStateList;

    iget-object v3, p0, Lqw;->A0:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p0, v0, v3}, Lpx;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v0

    iput-object v0, p0, Lqw;->y0:Landroid/graphics/PorterDuffColorFilter;

    goto :goto_a

    :cond_11
    move v4, v0

    .line 43
    :goto_a
    iget-object v0, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Lqw;->s1(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 44
    iget-object v0, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    or-int/2addr v4, v0

    .line 45
    :cond_12
    iget-object v0, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Lqw;->s1(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 46
    iget-object v0, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    or-int/2addr v4, v0

    .line 47
    :cond_13
    iget-object v0, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Lqw;->s1(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 48
    array-length v0, p1

    array-length v3, p2

    add-int/2addr v0, v3

    new-array v0, v0, [I

    .line 49
    array-length v3, p1

    invoke-static {p1, v2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 50
    array-length p1, p1

    array-length v3, p2

    invoke-static {p2, v2, v0, p1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    iget-object p1, p0, Lqw;->N:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    or-int/2addr v4, p1

    .line 52
    :cond_14
    sget-boolean p1, Lyy;->a:Z

    if-eqz p1, :cond_15

    iget-object p1, p0, Lqw;->O:Landroid/graphics/drawable/Drawable;

    invoke-static {p1}, Lqw;->s1(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-eqz p1, :cond_15

    .line 53
    iget-object p1, p0, Lqw;->O:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    or-int/2addr v4, p1

    :cond_15
    if-eqz v4, :cond_16

    .line 54
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    :cond_16
    if-eqz v1, :cond_17

    .line 55
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_17
    return v4
.end method

.method public w2(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->v2(F)V

    return-void
.end method

.method public final x0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lqw;->I0:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lqw;->h0:Landroid/graphics/Paint;

    iget v1, p0, Lqw;->p0:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    iget-object v0, p0, Lqw;->h0:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    iget-object v0, p0, Lqw;->h0:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lqw;->l1()Landroid/graphics/ColorFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 5
    iget-object v0, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {v0, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 6
    iget-object p2, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {p0}, Lqw;->I0()F

    move-result v0

    invoke-virtual {p0}, Lqw;->I0()F

    move-result v1

    iget-object v2, p0, Lqw;->h0:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public x1(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqw;->S:Z

    if-eq v0, p1, :cond_1

    .line 2
    iput-boolean p1, p0, Lqw;->S:Z

    .line 3
    invoke-virtual {p0}, Lqw;->m0()F

    move-result v0

    if-nez p1, :cond_0

    .line 4
    iget-boolean p1, p0, Lqw;->u0:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lqw;->u0:Z

    .line 6
    :cond_0
    invoke-virtual {p0}, Lqw;->m0()F

    move-result p1

    .line 7
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    cmpl-float p1, v0, p1

    if-eqz p1, :cond_1

    .line 8
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_1
    return-void
.end method

.method public x2(I)V
    .locals 0

    .line 1
    iput p1, p0, Lqw;->H0:I

    return-void
.end method

.method public final y0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lqw;->N2()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {p0, p2, v0}, Lqw;->l0(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    .line 3
    iget-object p2, p0, Lqw;->k0:Landroid/graphics/RectF;

    iget v0, p2, Landroid/graphics/RectF;->left:F

    .line 4
    iget p2, p2, Landroid/graphics/RectF;->top:F

    .line 5
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 6
    iget-object v1, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    float-to-int v2, v2

    iget-object v3, p0, Lqw;->k0:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    float-to-int v3, v3

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 7
    iget-object v1, p0, Lqw;->I:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    neg-float v0, v0

    neg-float p2, p2

    .line 8
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_0
    return-void
.end method

.method public y1(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result p1

    invoke-virtual {p0, p1}, Lqw;->x1(Z)V

    return-void
.end method

.method public y2(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->F:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    .line 2
    iput-object p1, p0, Lqw;->F:Landroid/content/res/ColorStateList;

    .line 3
    invoke-virtual {p0}, Lqw;->Q2()V

    .line 4
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->onStateChange([I)Z

    :cond_0
    return-void
.end method

.method public final z0(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 7

    .line 1
    iget v0, p0, Lqw;->E:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    iget-boolean v0, p0, Lqw;->I0:Z

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lqw;->h0:Landroid/graphics/Paint;

    iget v1, p0, Lqw;->r0:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    iget-object v0, p0, Lqw;->h0:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    iget-boolean v0, p0, Lqw;->I0:Z

    if-nez v0, :cond_0

    .line 5
    iget-object v0, p0, Lqw;->h0:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lqw;->l1()Landroid/graphics/ColorFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 6
    :cond_0
    iget-object v0, p0, Lqw;->k0:Landroid/graphics/RectF;

    iget v1, p2, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget v2, p0, Lqw;->E:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float v4, v2, v3

    add-float/2addr v1, v4

    iget v4, p2, Landroid/graphics/Rect;->top:I

    int-to-float v4, v4

    div-float v5, v2, v3

    add-float/2addr v4, v5

    iget v5, p2, Landroid/graphics/Rect;->right:I

    int-to-float v5, v5

    div-float v6, v2, v3

    sub-float/2addr v5, v6

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    int-to-float p2, p2

    div-float/2addr v2, v3

    sub-float/2addr p2, v2

    invoke-virtual {v0, v1, v4, v5, p2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 7
    iget p2, p0, Lqw;->C:F

    iget v0, p0, Lqw;->E:F

    div-float/2addr v0, v3

    sub-float/2addr p2, v0

    .line 8
    iget-object v0, p0, Lqw;->k0:Landroid/graphics/RectF;

    iget-object v1, p0, Lqw;->h0:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p2, p2, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_1
    return-void
.end method

.method public z1(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lqw;->m0()F

    move-result v0

    .line 3
    iput-object p1, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    .line 4
    invoke-virtual {p0}, Lqw;->m0()F

    move-result p1

    .line 5
    iget-object v1, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v1}, Lqw;->P2(Landroid/graphics/drawable/Drawable;)V

    .line 6
    iget-object v1, p0, Lqw;->U:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v1}, Lqw;->k0(Landroid/graphics/drawable/Drawable;)V

    .line 7
    invoke-virtual {p0}, Lhz;->invalidateSelf()V

    cmpl-float p1, v0, p1

    if-eqz p1, :cond_0

    .line 8
    invoke-virtual {p0}, Lqw;->v1()V

    :cond_0
    return-void
.end method

.method public z2(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqw;->g0:Landroid/content/Context;

    invoke-static {v0, p1}, Lk0;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqw;->y2(Landroid/content/res/ColorStateList;)V

    return-void
.end method
