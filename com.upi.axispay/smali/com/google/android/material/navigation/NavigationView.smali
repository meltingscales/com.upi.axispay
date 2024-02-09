.class public Lcom/google/android/material/navigation/NavigationView;
.super Lgy;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/navigation/NavigationView$SavedState;,
        Lcom/google/android/material/navigation/NavigationView$c;
    }
.end annotation


# static fields
.field public static final n:[I

.field public static final o:[I

.field public static final p:I


# instance fields
.field public final g:Ldy;

.field public final h:Ley;

.field public i:Lcom/google/android/material/navigation/NavigationView$c;

.field public final j:I

.field public final k:[I

.field public l:Landroid/view/MenuInflater;

.field public m:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [I

    const v2, 0x10100a0

    const/4 v3, 0x0

    aput v2, v1, v3

    .line 1
    sput-object v1, Lcom/google/android/material/navigation/NavigationView;->n:[I

    new-array v0, v0, [I

    const v1, -0x101009e

    aput v1, v0, v3

    .line 2
    sput-object v0, Lcom/google/android/material/navigation/NavigationView;->o:[I

    .line 3
    sget v0, Lrv;->Widget_Design_NavigationView:I

    sput v0, Lcom/google/android/material/navigation/NavigationView;->p:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget v0, Liv;->navigationViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/navigation/NavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    .line 2
    sget v6, Lcom/google/android/material/navigation/NavigationView;->p:I

    invoke-static {p1, p2, p3, v6}, Lf00;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Lgy;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance p1, Ley;

    invoke-direct {p1}, Ley;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 4
    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->k:[I

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v7

    .line 6
    new-instance v8, Ldy;

    invoke-direct {v8, v7}, Ldy;-><init>(Landroid/content/Context;)V

    iput-object v8, p0, Lcom/google/android/material/navigation/NavigationView;->g:Ldy;

    .line 7
    sget-object v2, Lsv;->NavigationView:[I

    const/4 v9, 0x0

    new-array v5, v9, [I

    move-object v0, v7

    move-object v1, p2

    move v3, p3

    move v4, v6

    .line 8
    invoke-static/range {v0 .. v5}, Lly;->i(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Lo3;

    move-result-object v0

    .line 9
    sget v1, Lsv;->NavigationView_android_background:I

    invoke-virtual {v0, v1}, Lo3;->s(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 10
    invoke-virtual {v0, v1}, Lo3;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {p0, v1}, Lac;->u0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    instance-of v1, v1, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v1, :cond_3

    .line 12
    :cond_1
    invoke-static {v7, p2, p3, v6}, Llz;->e(Landroid/content/Context;Landroid/util/AttributeSet;II)Llz$b;

    move-result-object p2

    invoke-virtual {p2}, Llz$b;->m()Llz;

    move-result-object p2

    .line 13
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    .line 14
    new-instance v1, Lhz;

    invoke-direct {v1, p2}, Lhz;-><init>(Llz;)V

    .line 15
    instance-of p2, p3, Landroid/graphics/drawable/ColorDrawable;

    if-eqz p2, :cond_2

    .line 16
    check-cast p3, Landroid/graphics/drawable/ColorDrawable;

    .line 17
    invoke-virtual {p3}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result p2

    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    .line 18
    invoke-virtual {v1, p2}, Lhz;->X(Landroid/content/res/ColorStateList;)V

    .line 19
    :cond_2
    invoke-virtual {v1, v7}, Lhz;->M(Landroid/content/Context;)V

    .line 20
    invoke-static {p0, v1}, Lac;->u0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 21
    :cond_3
    sget p2, Lsv;->NavigationView_elevation:I

    invoke-virtual {v0, p2}, Lo3;->s(I)Z

    move-result p3

    if-eqz p3, :cond_4

    .line 22
    invoke-virtual {v0, p2, v9}, Lo3;->f(II)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p0, p2}, Lcom/google/android/material/navigation/NavigationView;->setElevation(F)V

    .line 23
    :cond_4
    sget p2, Lsv;->NavigationView_android_fitsSystemWindows:I

    invoke-virtual {v0, p2, v9}, Lo3;->a(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->setFitsSystemWindows(Z)V

    .line 24
    sget p2, Lsv;->NavigationView_android_maxWidth:I

    invoke-virtual {v0, p2, v9}, Lo3;->f(II)I

    move-result p2

    iput p2, p0, Lcom/google/android/material/navigation/NavigationView;->j:I

    .line 25
    sget p2, Lsv;->NavigationView_itemIconTint:I

    invoke-virtual {v0, p2}, Lo3;->s(I)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 26
    invoke-virtual {v0, p2}, Lo3;->c(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    goto :goto_0

    :cond_5
    const p2, 0x1010038

    .line 27
    invoke-virtual {p0, p2}, Lcom/google/android/material/navigation/NavigationView;->d(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    .line 28
    :goto_0
    sget p3, Lsv;->NavigationView_itemTextAppearance:I

    invoke-virtual {v0, p3}, Lo3;->s(I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_6

    .line 29
    invoke-virtual {v0, p3, v9}, Lo3;->n(II)I

    move-result p3

    move v1, v2

    goto :goto_1

    :cond_6
    move p3, v9

    move v1, p3

    .line 30
    :goto_1
    sget v3, Lsv;->NavigationView_itemIconSize:I

    invoke-virtual {v0, v3}, Lo3;->s(I)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 31
    invoke-virtual {v0, v3, v9}, Lo3;->f(II)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/google/android/material/navigation/NavigationView;->setItemIconSize(I)V

    :cond_7
    const/4 v3, 0x0

    .line 32
    sget v4, Lsv;->NavigationView_itemTextColor:I

    invoke-virtual {v0, v4}, Lo3;->s(I)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 33
    invoke-virtual {v0, v4}, Lo3;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    :cond_8
    if-nez v1, :cond_9

    if-nez v3, :cond_9

    const v3, 0x1010036

    .line 34
    invoke-virtual {p0, v3}, Lcom/google/android/material/navigation/NavigationView;->d(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    .line 35
    :cond_9
    sget v4, Lsv;->NavigationView_itemBackground:I

    invoke-virtual {v0, v4}, Lo3;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-nez v4, :cond_a

    .line 36
    invoke-virtual {p0, v0}, Lcom/google/android/material/navigation/NavigationView;->f(Lo3;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 37
    invoke-virtual {p0, v0}, Lcom/google/android/material/navigation/NavigationView;->e(Lo3;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 38
    :cond_a
    sget v5, Lsv;->NavigationView_itemHorizontalPadding:I

    invoke-virtual {v0, v5}, Lo3;->s(I)Z

    move-result v6

    if-eqz v6, :cond_b

    .line 39
    invoke-virtual {v0, v5, v9}, Lo3;->f(II)I

    move-result v5

    .line 40
    invoke-virtual {p1, v5}, Ley;->B(I)V

    .line 41
    :cond_b
    sget v5, Lsv;->NavigationView_itemIconPadding:I

    .line 42
    invoke-virtual {v0, v5, v9}, Lo3;->f(II)I

    move-result v5

    .line 43
    sget v6, Lsv;->NavigationView_itemMaxLines:I

    invoke-virtual {v0, v6, v2}, Lo3;->k(II)I

    move-result v6

    invoke-virtual {p0, v6}, Lcom/google/android/material/navigation/NavigationView;->setItemMaxLines(I)V

    .line 44
    new-instance v6, Lcom/google/android/material/navigation/NavigationView$a;

    invoke-direct {v6, p0}, Lcom/google/android/material/navigation/NavigationView$a;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    invoke-virtual {v8, v6}, Li1;->V(Li1$a;)V

    .line 45
    invoke-virtual {p1, v2}, Ley;->z(I)V

    .line 46
    invoke-virtual {p1, v7, v8}, Ley;->d(Landroid/content/Context;Li1;)V

    .line 47
    invoke-virtual {p1, p2}, Ley;->E(Landroid/content/res/ColorStateList;)V

    .line 48
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getOverScrollMode()I

    move-result p2

    invoke-virtual {p1, p2}, Ley;->I(I)V

    if-eqz v1, :cond_c

    .line 49
    invoke-virtual {p1, p3}, Ley;->G(I)V

    .line 50
    :cond_c
    invoke-virtual {p1, v3}, Ley;->H(Landroid/content/res/ColorStateList;)V

    .line 51
    invoke-virtual {p1, v4}, Ley;->A(Landroid/graphics/drawable/Drawable;)V

    .line 52
    invoke-virtual {p1, v5}, Ley;->C(I)V

    .line 53
    invoke-virtual {v8, p1}, Li1;->b(Lo1;)V

    .line 54
    invoke-virtual {p1, p0}, Ley;->v(Landroid/view/ViewGroup;)Lp1;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 55
    sget p1, Lsv;->NavigationView_menu:I

    invoke-virtual {v0, p1}, Lo3;->s(I)Z

    move-result p2

    if-eqz p2, :cond_d

    .line 56
    invoke-virtual {v0, p1, v9}, Lo3;->n(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationView;->h(I)V

    .line 57
    :cond_d
    sget p1, Lsv;->NavigationView_headerLayout:I

    invoke-virtual {v0, p1}, Lo3;->s(I)Z

    move-result p2

    if-eqz p2, :cond_e

    .line 58
    invoke-virtual {v0, p1, v9}, Lo3;->n(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationView;->g(I)Landroid/view/View;

    .line 59
    :cond_e
    invoke-virtual {v0}, Lo3;->w()V

    .line 60
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationView;->i()V

    return-void
.end method

.method public static synthetic b(Lcom/google/android/material/navigation/NavigationView;)[I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->k:[I

    return-object p0
.end method

.method public static synthetic c(Lcom/google/android/material/navigation/NavigationView;)Ley;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    return-object p0
.end method

.method private getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->l:Landroid/view/MenuInflater;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lz0;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lz0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->l:Landroid/view/MenuInflater;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->l:Landroid/view/MenuInflater;

    return-object v0
.end method


# virtual methods
.method public a(Lic;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0, p1}, Ley;->h(Lic;)V

    return-void
.end method

.method public final d(I)Landroid/content/res/ColorStateList;
    .locals 10

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    return-object v1

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    iget v3, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-static {p1, v3}, Lk0;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    .line 4
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 5
    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    sget v4, Ll;->colorPrimary:I

    .line 6
    invoke-virtual {v3, v4, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v3

    if-nez v3, :cond_1

    return-object v1

    .line 7
    :cond_1
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 8
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    .line 9
    new-instance v3, Landroid/content/res/ColorStateList;

    const/4 v4, 0x3

    new-array v5, v4, [[I

    sget-object v6, Lcom/google/android/material/navigation/NavigationView;->o:[I

    const/4 v7, 0x0

    aput-object v6, v5, v7

    sget-object v8, Lcom/google/android/material/navigation/NavigationView;->n:[I

    aput-object v8, v5, v2

    sget-object v8, Landroid/widget/FrameLayout;->EMPTY_STATE_SET:[I

    const/4 v9, 0x2

    aput-object v8, v5, v9

    new-array v4, v4, [I

    .line 10
    invoke-virtual {p1, v6, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    aput p1, v4, v7

    aput v0, v4, v2

    aput v1, v4, v9

    invoke-direct {v3, v5, v4}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object v3
.end method

.method public final e(Lo3;)Landroid/graphics/drawable/Drawable;
    .locals 9

    .line 1
    sget v0, Lsv;->NavigationView_itemShapeAppearance:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lo3;->n(II)I

    move-result v0

    .line 2
    sget v2, Lsv;->NavigationView_itemShapeAppearanceOverlay:I

    .line 3
    invoke-virtual {p1, v2, v1}, Lo3;->n(II)I

    move-result v2

    .line 4
    new-instance v4, Lhz;

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 6
    invoke-static {v3, v0, v2}, Llz;->b(Landroid/content/Context;II)Llz$b;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Llz$b;->m()Llz;

    move-result-object v0

    invoke-direct {v4, v0}, Lhz;-><init>(Llz;)V

    .line 8
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lsv;->NavigationView_itemShapeFillColor:I

    .line 9
    invoke-static {v0, p1, v2}, Lty;->b(Landroid/content/Context;Lo3;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 10
    invoke-virtual {v4, v0}, Lhz;->X(Landroid/content/res/ColorStateList;)V

    .line 11
    sget v0, Lsv;->NavigationView_itemShapeInsetStart:I

    invoke-virtual {p1, v0, v1}, Lo3;->f(II)I

    move-result v5

    .line 12
    sget v0, Lsv;->NavigationView_itemShapeInsetTop:I

    invoke-virtual {p1, v0, v1}, Lo3;->f(II)I

    move-result v6

    .line 13
    sget v0, Lsv;->NavigationView_itemShapeInsetEnd:I

    invoke-virtual {p1, v0, v1}, Lo3;->f(II)I

    move-result v7

    .line 14
    sget v0, Lsv;->NavigationView_itemShapeInsetBottom:I

    invoke-virtual {p1, v0, v1}, Lo3;->f(II)I

    move-result v8

    .line 15
    new-instance p1, Landroid/graphics/drawable/InsetDrawable;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    return-object p1
.end method

.method public final f(Lo3;)Z
    .locals 1

    .line 1
    sget v0, Lsv;->NavigationView_itemShapeAppearance:I

    invoke-virtual {p1, v0}, Lo3;->s(I)Z

    move-result v0

    if-nez v0, :cond_1

    sget v0, Lsv;->NavigationView_itemShapeAppearanceOverlay:I

    .line 2
    invoke-virtual {p1, v0}, Lo3;->s(I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public g(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0, p1}, Ley;->w(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getCheckedItem()Landroid/view/MenuItem;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0}, Ley;->n()Lk1;

    move-result-object v0

    return-object v0
.end method

.method public getHeaderCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0}, Ley;->o()I

    move-result v0

    return v0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0}, Ley;->p()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getItemHorizontalPadding()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0}, Ley;->q()I

    move-result v0

    return v0
.end method

.method public getItemIconPadding()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0}, Ley;->r()I

    move-result v0

    return v0
.end method

.method public getItemIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0}, Ley;->u()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getItemMaxLines()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0}, Ley;->s()I

    move-result v0

    return v0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0}, Ley;->t()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->g:Ldy;

    return-object v0
.end method

.method public h(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ley;->J(Z)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationView;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->g:Ldy;

    invoke-virtual {v0, p1, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 3
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ley;->J(Z)V

    .line 4
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {p1, v0}, Ley;->g(Z)V

    return-void
.end method

.method public final i()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/material/navigation/NavigationView$b;

    invoke-direct {v0, p0}, Lcom/google/android/material/navigation/NavigationView$b;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->m:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->m:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Lgy;->onAttachedToWindow()V

    .line 2
    invoke-static {p0}, Liz;->e(Landroid/view/View;)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Lgy;->onDetachedFromWindow()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->m:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->m:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :goto_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, -0x80000000

    const/high16 v2, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget p1, p0, Lcom/google/android/material/navigation/NavigationView;->j:I

    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_0

    .line 3
    :cond_1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iget v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 4
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 5
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 3
    :cond_0
    check-cast p1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    .line 4
    invoke-virtual {p1}, Landroidx/customview/view/AbsSavedState;->a()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 5
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->g:Ldy;

    iget-object p1, p1, Lcom/google/android/material/navigation/NavigationView$SavedState;->d:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Li1;->S(Landroid/os/Bundle;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    invoke-direct {v1, v0}, Lcom/google/android/material/navigation/NavigationView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 3
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, v1, Lcom/google/android/material/navigation/NavigationView$SavedState;->d:Landroid/os/Bundle;

    .line 4
    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationView;->g:Ldy;

    invoke-virtual {v2, v0}, Li1;->U(Landroid/os/Bundle;)V

    return-object v1
.end method

.method public setCheckedItem(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->g:Ldy;

    invoke-virtual {v0, p1}, Li1;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    check-cast p1, Lk1;

    invoke-virtual {v0, p1}, Ley;->y(Lk1;)V

    :cond_0
    return-void
.end method

.method public setCheckedItem(Landroid/view/MenuItem;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->g:Ldy;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    invoke-virtual {v0, p1}, Li1;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    check-cast p1, Lk1;

    invoke-virtual {v0, p1}, Ley;->y(Lk1;)V

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Called setCheckedItem(MenuItem) with an item that is not in the current menu."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setElevation(F)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setElevation(F)V

    .line 3
    :cond_0
    invoke-static {p0, p1}, Liz;->d(Landroid/view/View;F)V

    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0, p1}, Ley;->A(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setItemBackgroundResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationView;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setItemHorizontalPadding(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0, p1}, Ley;->B(I)V

    return-void
.end method

.method public setItemHorizontalPaddingResource(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ley;->B(I)V

    return-void
.end method

.method public setItemIconPadding(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0, p1}, Ley;->C(I)V

    return-void
.end method

.method public setItemIconPaddingResource(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ley;->C(I)V

    return-void
.end method

.method public setItemIconSize(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0, p1}, Ley;->D(I)V

    return-void
.end method

.method public setItemIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0, p1}, Ley;->E(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setItemMaxLines(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0, p1}, Ley;->F(I)V

    return-void
.end method

.method public setItemTextAppearance(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0, p1}, Ley;->G(I)V

    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    invoke-virtual {v0, p1}, Ley;->H(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setNavigationItemSelectedListener(Lcom/google/android/material/navigation/NavigationView$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/navigation/NavigationView$c;

    return-void
.end method

.method public setOverScrollMode(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setOverScrollMode(I)V

    .line 2
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Ley;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Ley;->I(I)V

    :cond_0
    return-void
.end method
