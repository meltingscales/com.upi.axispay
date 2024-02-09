.class public final Ls1;
.super Lm1;
.source "AxisPay"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lo1;
.implements Landroid/view/View$OnKeyListener;


# static fields
.field public static final w:I


# instance fields
.field public final c:Landroid/content/Context;

.field public final d:Li1;

.field public final e:Lh1;

.field public final f:Z

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:Lc3;

.field public final k:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field public final l:Landroid/view/View$OnAttachStateChangeListener;

.field public m:Landroid/widget/PopupWindow$OnDismissListener;

.field public n:Landroid/view/View;

.field public o:Landroid/view/View;

.field public p:Lo1$a;

.field public q:Landroid/view/ViewTreeObserver;

.field public r:Z

.field public s:Z

.field public t:I

.field public u:I

.field public v:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Lr;->abc_popup_menu_item_layout:I

    sput v0, Ls1;->w:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Li1;Landroid/view/View;IIZ)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lm1;-><init>()V

    .line 2
    new-instance v0, Ls1$a;

    invoke-direct {v0, p0}, Ls1$a;-><init>(Ls1;)V

    iput-object v0, p0, Ls1;->k:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 3
    new-instance v0, Ls1$b;

    invoke-direct {v0, p0}, Ls1$b;-><init>(Ls1;)V

    iput-object v0, p0, Ls1;->l:Landroid/view/View$OnAttachStateChangeListener;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Ls1;->u:I

    .line 5
    iput-object p1, p0, Ls1;->c:Landroid/content/Context;

    .line 6
    iput-object p2, p0, Ls1;->d:Li1;

    .line 7
    iput-boolean p6, p0, Ls1;->f:Z

    .line 8
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 9
    new-instance v1, Lh1;

    sget v2, Ls1;->w:I

    invoke-direct {v1, p2, v0, p6, v2}, Lh1;-><init>(Li1;Landroid/view/LayoutInflater;ZI)V

    iput-object v1, p0, Ls1;->e:Lh1;

    .line 10
    iput p4, p0, Ls1;->h:I

    .line 11
    iput p5, p0, Ls1;->i:I

    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p6

    .line 13
    invoke-virtual {p6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v0, v0, 0x2

    sget v1, Lo;->abc_config_prefDialogWidth:I

    .line 14
    invoke-virtual {p6, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p6

    .line 15
    invoke-static {v0, p6}, Ljava/lang/Math;->max(II)I

    move-result p6

    iput p6, p0, Ls1;->g:I

    .line 16
    iput-object p3, p0, Ls1;->n:Landroid/view/View;

    .line 17
    new-instance p3, Lc3;

    const/4 p6, 0x0

    invoke-direct {p3, p1, p6, p4, p5}, Lc3;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object p3, p0, Ls1;->j:Lc3;

    .line 18
    invoke-virtual {p2, p0, p1}, Li1;->c(Lo1;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final B()Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Ls1;->c()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-boolean v0, p0, Ls1;->r:Z

    const/4 v2, 0x0

    if-nez v0, :cond_7

    iget-object v0, p0, Ls1;->n:Landroid/view/View;

    if-nez v0, :cond_1

    goto/16 :goto_1

    .line 3
    :cond_1
    iput-object v0, p0, Ls1;->o:Landroid/view/View;

    .line 4
    iget-object v0, p0, Ls1;->j:Lc3;

    invoke-virtual {v0, p0}, La3;->K(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 5
    iget-object v0, p0, Ls1;->j:Lc3;

    invoke-virtual {v0, p0}, La3;->L(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 6
    iget-object v0, p0, Ls1;->j:Lc3;

    invoke-virtual {v0, v1}, La3;->J(Z)V

    .line 7
    iget-object v0, p0, Ls1;->o:Landroid/view/View;

    .line 8
    iget-object v3, p0, Ls1;->q:Landroid/view/ViewTreeObserver;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_0

    :cond_2
    move v3, v2

    .line 9
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v4

    iput-object v4, p0, Ls1;->q:Landroid/view/ViewTreeObserver;

    if-eqz v3, :cond_3

    .line 10
    iget-object v3, p0, Ls1;->k:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v4, v3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 11
    :cond_3
    iget-object v3, p0, Ls1;->l:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 12
    iget-object v3, p0, Ls1;->j:Lc3;

    invoke-virtual {v3, v0}, La3;->D(Landroid/view/View;)V

    .line 13
    iget-object v0, p0, Ls1;->j:Lc3;

    iget v3, p0, Ls1;->u:I

    invoke-virtual {v0, v3}, La3;->G(I)V

    .line 14
    iget-boolean v0, p0, Ls1;->s:Z

    const/4 v3, 0x0

    if-nez v0, :cond_4

    .line 15
    iget-object v0, p0, Ls1;->e:Lh1;

    iget-object v4, p0, Ls1;->c:Landroid/content/Context;

    iget v5, p0, Ls1;->g:I

    invoke-static {v0, v3, v4, v5}, Lm1;->q(Landroid/widget/ListAdapter;Landroid/view/ViewGroup;Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Ls1;->t:I

    .line 16
    iput-boolean v1, p0, Ls1;->s:Z

    .line 17
    :cond_4
    iget-object v0, p0, Ls1;->j:Lc3;

    iget v4, p0, Ls1;->t:I

    invoke-virtual {v0, v4}, La3;->F(I)V

    .line 18
    iget-object v0, p0, Ls1;->j:Lc3;

    const/4 v4, 0x2

    invoke-virtual {v0, v4}, La3;->I(I)V

    .line 19
    iget-object v0, p0, Ls1;->j:Lc3;

    invoke-virtual {p0}, Lm1;->p()Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {v0, v4}, La3;->H(Landroid/graphics/Rect;)V

    .line 20
    iget-object v0, p0, Ls1;->j:Lc3;

    invoke-virtual {v0}, La3;->a()V

    .line 21
    iget-object v0, p0, Ls1;->j:Lc3;

    invoke-virtual {v0}, La3;->h()Landroid/widget/ListView;

    move-result-object v0

    .line 22
    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 23
    iget-boolean v4, p0, Ls1;->v:Z

    if-eqz v4, :cond_6

    iget-object v4, p0, Ls1;->d:Li1;

    invoke-virtual {v4}, Li1;->z()Ljava/lang/CharSequence;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 24
    iget-object v4, p0, Ls1;->c:Landroid/content/Context;

    .line 25
    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    sget v5, Lr;->abc_popup_menu_header_item_layout:I

    invoke-virtual {v4, v5, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/FrameLayout;

    const v5, 0x1020016

    .line 26
    invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_5

    .line 27
    iget-object v6, p0, Ls1;->d:Li1;

    invoke-virtual {v6}, Li1;->z()Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    :cond_5
    invoke-virtual {v4, v2}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    .line 29
    invoke-virtual {v0, v4, v3, v2}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 30
    :cond_6
    iget-object v0, p0, Ls1;->j:Lc3;

    iget-object v2, p0, Ls1;->e:Lh1;

    invoke-virtual {v0, v2}, La3;->p(Landroid/widget/ListAdapter;)V

    .line 31
    iget-object v0, p0, Ls1;->j:Lc3;

    invoke-virtual {v0}, La3;->a()V

    return v1

    :cond_7
    :goto_1
    return v2
.end method

.method public a()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ls1;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const v1, 0x1ba

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Li1;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls1;->d:Li1;

    if-eq p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Ls1;->dismiss()V

    .line 3
    iget-object v0, p0, Ls1;->p:Lo1$a;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0, p1, p2}, Lo1$a;->b(Li1;Z)V

    :cond_1
    return-void
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ls1;->r:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ls1;->j:Lc3;

    invoke-virtual {v0}, La3;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public dismiss()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls1;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Ls1;->j:Lc3;

    invoke-virtual {v0}, La3;->dismiss()V

    :cond_0
    return-void
.end method

.method public e(Landroid/os/Parcelable;)V
    .locals 0

    return-void
.end method

.method public f(Lt1;)Z
    .locals 9

    .line 1
    invoke-virtual {p1}, Li1;->hasVisibleItems()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 2
    new-instance v0, Ln1;

    iget-object v3, p0, Ls1;->c:Landroid/content/Context;

    iget-object v5, p0, Ls1;->o:Landroid/view/View;

    iget-boolean v6, p0, Ls1;->f:Z

    iget v7, p0, Ls1;->h:I

    iget v8, p0, Ls1;->i:I

    move-object v2, v0

    move-object v4, p1

    invoke-direct/range {v2 .. v8}, Ln1;-><init>(Landroid/content/Context;Li1;Landroid/view/View;ZII)V

    .line 3
    iget-object v2, p0, Ls1;->p:Lo1$a;

    invoke-virtual {v0, v2}, Ln1;->j(Lo1$a;)V

    .line 4
    invoke-static {p1}, Lm1;->z(Li1;)Z

    move-result v2

    invoke-virtual {v0, v2}, Ln1;->g(Z)V

    .line 5
    iget-object v2, p0, Ls1;->m:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-virtual {v0, v2}, Ln1;->i(Landroid/widget/PopupWindow$OnDismissListener;)V

    const/4 v2, 0x0

    .line 6
    iput-object v2, p0, Ls1;->m:Landroid/widget/PopupWindow$OnDismissListener;

    .line 7
    iget-object v2, p0, Ls1;->d:Li1;

    invoke-virtual {v2, v1}, Li1;->e(Z)V

    .line 8
    iget-object v2, p0, Ls1;->j:Lc3;

    invoke-virtual {v2}, La3;->d()I

    move-result v2

    .line 9
    iget-object v3, p0, Ls1;->j:Lc3;

    invoke-virtual {v3}, La3;->n()I

    move-result v3

    .line 10
    iget v4, p0, Ls1;->u:I

    iget-object v5, p0, Ls1;->n:Landroid/view/View;

    .line 11
    invoke-static {v5}, Lac;->C(Landroid/view/View;)I

    move-result v5

    .line 12
    invoke-static {v4, v5}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v4

    and-int/lit8 v4, v4, 0x7

    const/4 v5, 0x5

    if-ne v4, v5, :cond_0

    .line 13
    iget-object v4, p0, Ls1;->n:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    add-int/2addr v2, v4

    .line 14
    :cond_0
    invoke-virtual {v0, v2, v3}, Ln1;->n(II)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 15
    iget-object v0, p0, Ls1;->p:Lo1$a;

    if-eqz v0, :cond_1

    .line 16
    invoke-interface {v0, p1}, Lo1$a;->c(Li1;)Z

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public g(Z)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, Ls1;->s:Z

    .line 2
    iget-object p1, p0, Ls1;->e:Lh1;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lh1;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public h()Landroid/widget/ListView;
    .locals 1

    .line 1
    iget-object v0, p0, Ls1;->j:Lc3;

    invoke-virtual {v0}, La3;->h()Landroid/widget/ListView;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j()Landroid/os/Parcelable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public m(Lo1$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls1;->p:Lo1$a;

    return-void
.end method

.method public n(Li1;)V
    .locals 0

    return-void
.end method

.method public onDismiss()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Ls1;->r:Z

    .line 2
    iget-object v0, p0, Ls1;->d:Li1;

    invoke-virtual {v0}, Li1;->close()V

    .line 3
    iget-object v0, p0, Ls1;->q:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ls1;->o:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Ls1;->q:Landroid/view/ViewTreeObserver;

    .line 5
    :cond_0
    iget-object v0, p0, Ls1;->q:Landroid/view/ViewTreeObserver;

    iget-object v1, p0, Ls1;->k:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Ls1;->q:Landroid/view/ViewTreeObserver;

    .line 7
    :cond_1
    iget-object v0, p0, Ls1;->o:Landroid/view/View;

    iget-object v1, p0, Ls1;->l:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 8
    iget-object v0, p0, Ls1;->m:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_2

    .line 9
    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    :cond_2
    return-void
.end method

.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    const/16 p1, 0x52

    if-ne p2, p1, :cond_0

    .line 2
    invoke-virtual {p0}, Ls1;->dismiss()V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public r(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls1;->n:Landroid/view/View;

    return-void
.end method

.method public t(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls1;->e:Lh1;

    invoke-virtual {v0, p1}, Lh1;->d(Z)V

    return-void
.end method

.method public u(I)V
    .locals 0

    .line 1
    iput p1, p0, Ls1;->u:I

    return-void
.end method

.method public v(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls1;->j:Lc3;

    invoke-virtual {v0, p1}, La3;->l(I)V

    return-void
.end method

.method public w(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls1;->m:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public x(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ls1;->v:Z

    return-void
.end method

.method public y(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls1;->j:Lc3;

    invoke-virtual {v0, p1}, La3;->j(I)V

    return-void
.end method
