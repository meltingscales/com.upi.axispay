.class public Lzz;
.super La00;
.source "AxisPay"


# static fields
.field public static final q:Z


# instance fields
.field public final d:Landroid/text/TextWatcher;

.field public final e:Landroid/view/View$OnFocusChangeListener;

.field public final f:Lcom/google/android/material/textfield/TextInputLayout$e;

.field public final g:Lcom/google/android/material/textfield/TextInputLayout$f;

.field public final h:Lcom/google/android/material/textfield/TextInputLayout$g;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation
.end field

.field public i:Z

.field public j:Z

.field public k:J

.field public l:Landroid/graphics/drawable/StateListDrawable;

.field public m:Lhz;

.field public n:Landroid/view/accessibility/AccessibilityManager;

.field public o:Landroid/animation/ValueAnimator;

.field public p:Landroid/animation/ValueAnimator;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lzz;->q:Z

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, La00;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 2
    new-instance p1, Lzz$a;

    invoke-direct {p1, p0}, Lzz$a;-><init>(Lzz;)V

    iput-object p1, p0, Lzz;->d:Landroid/text/TextWatcher;

    .line 3
    new-instance p1, Lzz$c;

    invoke-direct {p1, p0}, Lzz$c;-><init>(Lzz;)V

    iput-object p1, p0, Lzz;->e:Landroid/view/View$OnFocusChangeListener;

    .line 4
    new-instance p1, Lzz$d;

    iget-object v0, p0, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-direct {p1, p0, v0}, Lzz$d;-><init>(Lzz;Lcom/google/android/material/textfield/TextInputLayout;)V

    iput-object p1, p0, Lzz;->f:Lcom/google/android/material/textfield/TextInputLayout$e;

    .line 5
    new-instance p1, Lzz$e;

    invoke-direct {p1, p0}, Lzz$e;-><init>(Lzz;)V

    iput-object p1, p0, Lzz;->g:Lcom/google/android/material/textfield/TextInputLayout$f;

    .line 6
    new-instance p1, Lzz$f;

    invoke-direct {p1, p0}, Lzz$f;-><init>(Lzz;)V

    iput-object p1, p0, Lzz;->h:Lcom/google/android/material/textfield/TextInputLayout$g;

    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lzz;->i:Z

    .line 8
    iput-boolean p1, p0, Lzz;->j:Z

    const-wide v0, 0x7fffffffffffffffL

    .line 9
    iput-wide v0, p0, Lzz;->k:J

    return-void
.end method

.method public static D(Landroid/widget/EditText;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->getKeyListener()Landroid/text/method/KeyListener;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic e(Landroid/widget/EditText;)Landroid/widget/AutoCompleteTextView;
    .locals 0

    .line 1
    invoke-static {p0}, Lzz;->y(Landroid/widget/EditText;)Landroid/widget/AutoCompleteTextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lzz;)Landroid/view/accessibility/AccessibilityManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lzz;->n:Landroid/view/accessibility/AccessibilityManager;

    return-object p0
.end method

.method public static synthetic g(Lzz;)Lcom/google/android/material/textfield/TextInputLayout$e;
    .locals 0

    .line 1
    iget-object p0, p0, Lzz;->f:Lcom/google/android/material/textfield/TextInputLayout$e;

    return-object p0
.end method

.method public static synthetic h(Lzz;)Landroid/view/View$OnFocusChangeListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lzz;->e:Landroid/view/View$OnFocusChangeListener;

    return-object p0
.end method

.method public static synthetic i()Z
    .locals 1

    .line 1
    sget-boolean v0, Lzz;->q:Z

    return v0
.end method

.method public static synthetic j(Lzz;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzz;->C()Z

    move-result p0

    return p0
.end method

.method public static synthetic k(Lzz;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lzz;->k:J

    return-wide p1
.end method

.method public static synthetic l(Lzz;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lzz;->j:Z

    return p0
.end method

.method public static synthetic m(Lzz;)Landroid/animation/ValueAnimator;
    .locals 0

    .line 1
    iget-object p0, p0, Lzz;->p:Landroid/animation/ValueAnimator;

    return-object p0
.end method

.method public static synthetic n(Landroid/widget/EditText;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lzz;->D(Landroid/widget/EditText;)Z

    move-result p0

    return p0
.end method

.method public static synthetic o(Lzz;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lzz;->E(Z)V

    return-void
.end method

.method public static synthetic p(Lzz;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lzz;->i:Z

    return p1
.end method

.method public static synthetic q(Lzz;Landroid/widget/AutoCompleteTextView;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lzz;->H(Landroid/widget/AutoCompleteTextView;)V

    return-void
.end method

.method public static synthetic r(Lzz;Landroid/widget/AutoCompleteTextView;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lzz;->F(Landroid/widget/AutoCompleteTextView;)V

    return-void
.end method

.method public static synthetic s(Lzz;Landroid/widget/AutoCompleteTextView;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lzz;->v(Landroid/widget/AutoCompleteTextView;)V

    return-void
.end method

.method public static synthetic t(Lzz;Landroid/widget/AutoCompleteTextView;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lzz;->G(Landroid/widget/AutoCompleteTextView;)V

    return-void
.end method

.method public static synthetic u(Lzz;)Landroid/text/TextWatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lzz;->d:Landroid/text/TextWatcher;

    return-object p0
.end method

.method public static y(Landroid/widget/EditText;)Landroid/widget/AutoCompleteTextView;
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/widget/AutoCompleteTextView;

    if-eqz v0, :cond_0

    .line 2
    check-cast p0, Landroid/widget/AutoCompleteTextView;

    return-object p0

    .line 3
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const v0, 0x252f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final A(FFFI)Lhz;
    .locals 1

    .line 1
    invoke-static {}, Llz;->a()Llz$b;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p1}, Llz$b;->A(F)Llz$b;

    .line 3
    invoke-virtual {v0, p1}, Llz$b;->E(F)Llz$b;

    .line 4
    invoke-virtual {v0, p2}, Llz$b;->s(F)Llz$b;

    .line 5
    invoke-virtual {v0, p2}, Llz$b;->w(F)Llz$b;

    .line 6
    invoke-virtual {v0}, Llz$b;->m()Llz;

    move-result-object p1

    .line 7
    iget-object p2, p0, La00;->b:Landroid/content/Context;

    .line 8
    invoke-static {p2, p3}, Lhz;->m(Landroid/content/Context;F)Lhz;

    move-result-object p2

    .line 9
    invoke-virtual {p2, p1}, Lhz;->setShapeAppearanceModel(Llz;)V

    const/4 p1, 0x0

    .line 10
    invoke-virtual {p2, p1, p4, p1, p4}, Lhz;->Z(IIII)V

    return-object p2
.end method

.method public final B()V
    .locals 3

    const/4 v0, 0x2

    new-array v1, v0, [F

    .line 1
    fill-array-data v1, :array_0

    const/16 v2, 0x43

    invoke-virtual {p0, v2, v1}, Lzz;->z(I[F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lzz;->p:Landroid/animation/ValueAnimator;

    new-array v0, v0, [F

    .line 2
    fill-array-data v0, :array_1

    const/16 v1, 0x32

    invoke-virtual {p0, v1, v0}, Lzz;->z(I[F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lzz;->o:Landroid/animation/ValueAnimator;

    .line 3
    new-instance v1, Lzz$j;

    invoke-direct {v1, p0}, Lzz$j;-><init>(Lzz;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final C()Z
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lzz;->k:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

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

.method public final E(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lzz;->j:Z

    if-eq v0, p1, :cond_0

    .line 2
    iput-boolean p1, p0, Lzz;->j:Z

    .line 3
    iget-object p1, p0, Lzz;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 4
    iget-object p1, p0, Lzz;->o:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    :cond_0
    return-void
.end method

.method public final F(Landroid/widget/AutoCompleteTextView;)V
    .locals 2

    .line 1
    sget-boolean v0, Lzz;->q:Z

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundMode()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lzz;->m:Lhz;

    invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 4
    iget-object v0, p0, Lzz;->l:Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final G(Landroid/widget/AutoCompleteTextView;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    new-instance v0, Lzz$h;

    invoke-direct {v0, p0, p1}, Lzz$h;-><init>(Lzz;Landroid/widget/AutoCompleteTextView;)V

    invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 2
    iget-object v0, p0, Lzz;->e:Landroid/view/View$OnFocusChangeListener;

    invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 3
    sget-boolean v0, Lzz;->q:Z

    if-eqz v0, :cond_0

    .line 4
    new-instance v0, Lzz$i;

    invoke-direct {v0, p0}, Lzz$i;-><init>(Lzz;)V

    invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setOnDismissListener(Landroid/widget/AutoCompleteTextView$OnDismissListener;)V

    :cond_0
    return-void
.end method

.method public final H(Landroid/widget/AutoCompleteTextView;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p0}, Lzz;->C()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    iput-boolean v1, p0, Lzz;->i:Z

    .line 3
    :cond_1
    iget-boolean v0, p0, Lzz;->i:Z

    if-nez v0, :cond_4

    .line 4
    sget-boolean v0, Lzz;->q:Z

    if-eqz v0, :cond_2

    .line 5
    iget-boolean v0, p0, Lzz;->j:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lzz;->E(Z)V

    goto :goto_0

    .line 6
    :cond_2
    iget-boolean v0, p0, Lzz;->j:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lzz;->j:Z

    .line 7
    iget-object v0, p0, La00;->c:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Lcom/google/android/material/internal/CheckableImageButton;->toggle()V

    .line 8
    :goto_0
    iget-boolean v0, p0, Lzz;->j:Z

    if-eqz v0, :cond_3

    .line 9
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->requestFocus()Z

    .line 10
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->showDropDown()V

    goto :goto_1

    .line 11
    :cond_3
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    goto :goto_1

    .line 12
    :cond_4
    iput-boolean v1, p0, Lzz;->i:Z

    :goto_1
    return-void
.end method

.method public a()V
    .locals 6

    .line 1
    iget-object v0, p0, La00;->b:Landroid/content/Context;

    .line 2
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lkv;->mtrl_shape_corner_size_small_component:I

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    int-to-float v0, v0

    .line 4
    iget-object v1, p0, La00;->b:Landroid/content/Context;

    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lkv;->mtrl_exposed_dropdown_menu_popup_elevation:I

    .line 6
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    int-to-float v1, v1

    .line 7
    iget-object v2, p0, La00;->b:Landroid/content/Context;

    .line 8
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lkv;->mtrl_exposed_dropdown_menu_popup_vertical_padding:I

    .line 9
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    .line 10
    invoke-virtual {p0, v0, v0, v1, v2}, Lzz;->A(FFFI)Lhz;

    move-result-object v3

    const/4 v4, 0x0

    .line 11
    invoke-virtual {p0, v4, v0, v1, v2}, Lzz;->A(FFFI)Lhz;

    move-result-object v0

    .line 12
    iput-object v3, p0, Lzz;->m:Lhz;

    .line 13
    new-instance v1, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    iput-object v1, p0, Lzz;->l:Landroid/graphics/drawable/StateListDrawable;

    const/4 v2, 0x1

    new-array v2, v2, [I

    const v4, 0x10100aa

    const/4 v5, 0x0

    aput v4, v2, v5

    .line 14
    invoke-virtual {v1, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 15
    iget-object v1, p0, Lzz;->l:Landroid/graphics/drawable/StateListDrawable;

    new-array v2, v5, [I

    invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 16
    sget-boolean v0, Lzz;->q:Z

    if-eqz v0, :cond_0

    sget v0, Llv;->mtrl_dropdown_arrow:I

    goto :goto_0

    :cond_0
    sget v0, Llv;->mtrl_ic_arrow_drop_down:I

    .line 17
    :goto_0
    iget-object v1, p0, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, p0, La00;->b:Landroid/content/Context;

    invoke-static {v2, v0}, Lk0;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 18
    iget-object v0, p0, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 19
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lqv;->exposed_dropdown_menu_content_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconContentDescription(Ljava/lang/CharSequence;)V

    .line 21
    iget-object v0, p0, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    new-instance v1, Lzz$g;

    invoke-direct {v1, p0}, Lzz$g;-><init>(Lzz;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    iget-object v0, p0, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lzz;->g:Lcom/google/android/material/textfield/TextInputLayout$f;

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->e(Lcom/google/android/material/textfield/TextInputLayout$f;)V

    .line 23
    iget-object v0, p0, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lzz;->h:Lcom/google/android/material/textfield/TextInputLayout$g;

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->f(Lcom/google/android/material/textfield/TextInputLayout$g;)V

    .line 24
    invoke-virtual {p0}, Lzz;->B()V

    .line 25
    iget-object v0, p0, La00;->b:Landroid/content/Context;

    const v1, 0x2530

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    iput-object v0, p0, Lzz;->n:Landroid/view/accessibility/AccessibilityManager;

    return-void
.end method

.method public b(I)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final v(Landroid/widget/AutoCompleteTextView;)V
    .locals 9

    .line 1
    invoke-static {p1}, Lzz;->D(Landroid/widget/EditText;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundMode()I

    move-result v0

    .line 3
    iget-object v1, p0, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackground()Lhz;

    move-result-object v1

    .line 4
    sget v2, Liv;->colorControlHighlight:I

    invoke-static {p1, v2}, Lww;->c(Landroid/view/View;I)I

    move-result v2

    const/4 v3, 0x2

    new-array v4, v3, [[I

    const/4 v5, 0x1

    new-array v6, v5, [I

    const v7, 0x10100a7

    const/4 v8, 0x0

    aput v7, v6, v8

    aput-object v6, v4, v8

    new-array v6, v8, [I

    aput-object v6, v4, v5

    if-ne v0, v3, :cond_1

    .line 5
    invoke-virtual {p0, p1, v2, v4, v1}, Lzz;->x(Landroid/widget/AutoCompleteTextView;I[[ILhz;)V

    goto :goto_0

    :cond_1
    if-ne v0, v5, :cond_2

    .line 6
    invoke-virtual {p0, p1, v2, v4, v1}, Lzz;->w(Landroid/widget/AutoCompleteTextView;I[[ILhz;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final w(Landroid/widget/AutoCompleteTextView;I[[ILhz;)V
    .locals 5

    .line 1
    iget-object v0, p0, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundColor()I

    move-result v0

    const v1, 0x3dcccccd    # 0.1f

    .line 2
    invoke-static {p2, v0, v1}, Lww;->f(IIF)I

    move-result p2

    const/4 v1, 0x2

    new-array v2, v1, [I

    const/4 v3, 0x0

    aput p2, v2, v3

    const/4 p2, 0x1

    aput v0, v2, p2

    .line 3
    sget-boolean v0, Lzz;->q:Z

    if-eqz v0, :cond_0

    .line 4
    new-instance p2, Landroid/content/res/ColorStateList;

    invoke-direct {p2, p3, v2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 5
    new-instance p3, Landroid/graphics/drawable/RippleDrawable;

    invoke-direct {p3, p2, p4, p4}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 6
    invoke-static {p1, p3}, Lac;->u0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Lhz;

    .line 8
    invoke-virtual {p4}, Lhz;->C()Llz;

    move-result-object v4

    invoke-direct {v0, v4}, Lhz;-><init>(Llz;)V

    .line 9
    new-instance v4, Landroid/content/res/ColorStateList;

    invoke-direct {v4, p3, v2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {v0, v4}, Lhz;->X(Landroid/content/res/ColorStateList;)V

    new-array p3, v1, [Landroid/graphics/drawable/Drawable;

    aput-object p4, p3, v3

    aput-object v0, p3, p2

    .line 10
    new-instance p2, Landroid/graphics/drawable/LayerDrawable;

    invoke-direct {p2, p3}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 11
    invoke-static {p1}, Lac;->I(Landroid/view/View;)I

    move-result p3

    .line 12
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getPaddingTop()I

    move-result p4

    .line 13
    invoke-static {p1}, Lac;->H(Landroid/view/View;)I

    move-result v0

    .line 14
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getPaddingBottom()I

    move-result v1

    .line 15
    invoke-static {p1, p2}, Lac;->u0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 16
    invoke-static {p1, p3, p4, v0, v1}, Lac;->E0(Landroid/view/View;IIII)V

    :goto_0
    return-void
.end method

.method public final x(Landroid/widget/AutoCompleteTextView;I[[ILhz;)V
    .locals 7

    .line 1
    sget v0, Liv;->colorSurface:I

    invoke-static {p1, v0}, Lww;->c(Landroid/view/View;I)I

    move-result v0

    .line 2
    new-instance v1, Lhz;

    .line 3
    invoke-virtual {p4}, Lhz;->C()Llz;

    move-result-object v2

    invoke-direct {v1, v2}, Lhz;-><init>(Llz;)V

    const v2, 0x3dcccccd    # 0.1f

    .line 4
    invoke-static {p2, v0, v2}, Lww;->f(IIF)I

    move-result p2

    const/4 v2, 0x2

    new-array v3, v2, [I

    const/4 v4, 0x0

    aput p2, v3, v4

    const/4 v5, 0x1

    aput v4, v3, v5

    .line 5
    new-instance v6, Landroid/content/res/ColorStateList;

    invoke-direct {v6, p3, v3}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {v1, v6}, Lhz;->X(Landroid/content/res/ColorStateList;)V

    .line 6
    sget-boolean v3, Lzz;->q:Z

    if-eqz v3, :cond_0

    .line 7
    invoke-virtual {v1, v0}, Lhz;->setTint(I)V

    new-array v3, v2, [I

    aput p2, v3, v4

    aput v0, v3, v5

    .line 8
    new-instance p2, Landroid/content/res/ColorStateList;

    invoke-direct {p2, p3, v3}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 9
    new-instance p3, Lhz;

    .line 10
    invoke-virtual {p4}, Lhz;->C()Llz;

    move-result-object v0

    invoke-direct {p3, v0}, Lhz;-><init>(Llz;)V

    const/4 v0, -0x1

    .line 11
    invoke-virtual {p3, v0}, Lhz;->setTint(I)V

    .line 12
    new-instance v0, Landroid/graphics/drawable/RippleDrawable;

    invoke-direct {v0, p2, v1, p3}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    new-array p2, v2, [Landroid/graphics/drawable/Drawable;

    aput-object v0, p2, v4

    aput-object p4, p2, v5

    .line 13
    new-instance p3, Landroid/graphics/drawable/LayerDrawable;

    invoke-direct {p3, p2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    new-array p2, v2, [Landroid/graphics/drawable/Drawable;

    aput-object v1, p2, v4

    aput-object p4, p2, v5

    .line 14
    new-instance p3, Landroid/graphics/drawable/LayerDrawable;

    invoke-direct {p3, p2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 15
    :goto_0
    invoke-static {p1, p3}, Lac;->u0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final varargs z(I[F)Landroid/animation/ValueAnimator;
    .locals 2

    .line 1
    invoke-static {p2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p2

    .line 2
    sget-object v0, Ltv;->a:Landroid/animation/TimeInterpolator;

    invoke-virtual {p2, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    int-to-long v0, p1

    .line 3
    invoke-virtual {p2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 4
    new-instance p1, Lzz$b;

    invoke-direct {p1, p0}, Lzz$b;-><init>(Lzz;)V

    invoke-virtual {p2, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-object p2
.end method
