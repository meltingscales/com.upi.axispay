.class public Lr80;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final m:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final a:Ln80;

.field public final b:Lq80$b;

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:Landroid/graphics/drawable/Drawable;

.field public k:Landroid/graphics/drawable/Drawable;

.field public l:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lr80;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Ln80;Landroid/net/Uri;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lr80;->e:Z

    .line 3
    iget-boolean v0, p1, Ln80;->o:Z

    if-nez v0, :cond_0

    .line 4
    iput-object p1, p0, Lr80;->a:Ln80;

    .line 5
    new-instance v0, Lq80$b;

    iget-object p1, p1, Ln80;->l:Landroid/graphics/Bitmap$Config;

    invoke-direct {v0, p2, p3, p1}, Lq80$b;-><init>(Landroid/net/Uri;ILandroid/graphics/Bitmap$Config;)V

    iput-object v0, p0, Lr80;->b:Lq80$b;

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const p2, 0x1fdc

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Lr80;
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lr80;->l:Ljava/lang/Object;

    return-object p0
.end method

.method public final b(J)Lq80;
    .locals 7

    .line 1
    sget-object v0, Lr80;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    .line 2
    iget-object v1, p0, Lr80;->b:Lq80$b;

    invoke-virtual {v1}, Lq80$b;->a()Lq80;

    move-result-object v1

    .line 3
    iput v0, v1, Lq80;->a:I

    .line 4
    iput-wide p1, v1, Lq80;->b:J

    .line 5
    iget-object v2, p0, Lr80;->a:Ln80;

    iget-boolean v2, v2, Ln80;->n:Z

    const v3, 0x1fdd

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v2, :cond_0

    .line 6
    invoke-virtual {v1}, Lq80;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lq80;->toString()Ljava/lang/String;

    move-result-object v5

    const v6, 0x1fde

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6, v4, v5}, Lx80;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    :cond_0
    iget-object v4, p0, Lr80;->a:Ln80;

    invoke-virtual {v4, v1}, Ln80;->n(Lq80;)Lq80;

    if-eq v1, v1, :cond_1

    .line 8
    iput v0, v1, Lq80;->a:I

    .line 9
    iput-wide p1, v1, Lq80;->b:J

    if-eqz v2, :cond_1

    .line 10
    invoke-virtual {v1}, Lq80;->d()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x1fdf

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const v0, 0x1fe0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, p1, p2}, Lx80;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-object v1
.end method

.method public c(I)Lr80;
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    iget-object v0, p0, Lr80;->k:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 2
    iput p1, p0, Lr80;->g:I

    return-object p0

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const v0, 0x1fe1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x1fe2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d()Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    iget v0, p0, Lr80;->f:I

    if-eqz v0, :cond_2

    .line 2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_0

    .line 3
    iget-object v1, p0, Lr80;->a:Ln80;

    iget-object v1, v1, Ln80;->e:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_0
    const/16 v0, 0x10

    if-lt v1, v0, :cond_1

    .line 4
    iget-object v0, p0, Lr80;->a:Ln80;

    iget-object v0, v0, Ln80;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lr80;->f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    .line 5
    :cond_1
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 6
    iget-object v1, p0, Lr80;->a:Ln80;

    iget-object v1, v1, Ln80;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p0, Lr80;->f:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 7
    iget-object v1, p0, Lr80;->a:Ln80;

    iget-object v1, v1, Ln80;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    .line 8
    :cond_2
    iget-object v0, p0, Lr80;->j:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public e(Landroid/widget/ImageView;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lr80;->f(Landroid/widget/ImageView;Ly70;)V

    return-void
.end method

.method public f(Landroid/widget/ImageView;Ly70;)V
    .locals 15

    move-object v0, p0

    move-object/from16 v3, p1

    move-object/from16 v11, p2

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    .line 2
    invoke-static {}, Lx80;->c()V

    if-eqz v3, :cond_b

    .line 3
    iget-object v4, v0, Lr80;->b:Lq80$b;

    invoke-virtual {v4}, Lq80$b;->b()Z

    move-result v4

    if-nez v4, :cond_1

    .line 4
    iget-object v1, v0, Lr80;->a:Ln80;

    invoke-virtual {v1, v3}, Ln80;->b(Landroid/widget/ImageView;)V

    .line 5
    iget-boolean v1, v0, Lr80;->e:Z

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {p0}, Lr80;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v3, v1}, Lo80;->d(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void

    .line 7
    :cond_1
    iget-boolean v4, v0, Lr80;->d:Z

    if-eqz v4, :cond_6

    .line 8
    iget-object v4, v0, Lr80;->b:Lq80$b;

    invoke-virtual {v4}, Lq80$b;->c()Z

    move-result v4

    if-nez v4, :cond_5

    .line 9
    invoke-virtual/range {p1 .. p1}, Landroid/widget/ImageView;->getWidth()I

    move-result v4

    .line 10
    invoke-virtual/range {p1 .. p1}, Landroid/widget/ImageView;->getHeight()I

    move-result v5

    if-eqz v4, :cond_3

    if-nez v5, :cond_2

    goto :goto_0

    .line 11
    :cond_2
    iget-object v6, v0, Lr80;->b:Lq80$b;

    invoke-virtual {v6, v4, v5}, Lq80$b;->d(II)Lq80$b;

    goto :goto_1

    .line 12
    :cond_3
    :goto_0
    iget-boolean v1, v0, Lr80;->e:Z

    if-eqz v1, :cond_4

    .line 13
    invoke-virtual {p0}, Lr80;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v3, v1}, Lo80;->d(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 14
    :cond_4
    iget-object v1, v0, Lr80;->a:Ln80;

    new-instance v2, Lb80;

    invoke-direct {v2, p0, v3, v11}, Lb80;-><init>(Lr80;Landroid/widget/ImageView;Ly70;)V

    invoke-virtual {v1, v3, v2}, Ln80;->d(Landroid/widget/ImageView;Lb80;)V

    return-void

    .line 15
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const v2, 0x1fe3

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 16
    :cond_6
    :goto_1
    invoke-virtual {p0, v1, v2}, Lr80;->b(J)Lq80;

    move-result-object v7

    .line 17
    invoke-static {v7}, Lx80;->f(Lq80;)Ljava/lang/String;

    move-result-object v9

    .line 18
    iget v1, v0, Lr80;->h:I

    invoke-static {v1}, Lj80;->a(I)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 19
    iget-object v1, v0, Lr80;->a:Ln80;

    invoke-virtual {v1, v9}, Ln80;->k(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 20
    iget-object v1, v0, Lr80;->a:Ln80;

    invoke-virtual {v1, v3}, Ln80;->b(Landroid/widget/ImageView;)V

    .line 21
    iget-object v1, v0, Lr80;->a:Ln80;

    iget-object v2, v1, Ln80;->e:Landroid/content/Context;

    sget-object v8, Ln80$e;->c:Ln80$e;

    iget-boolean v5, v0, Lr80;->c:Z

    iget-boolean v6, v1, Ln80;->m:Z

    move-object/from16 v1, p1

    move-object v3, v4

    move-object v4, v8

    invoke-static/range {v1 .. v6}, Lo80;->c(Landroid/widget/ImageView;Landroid/content/Context;Landroid/graphics/Bitmap;Ln80$e;ZZ)V

    .line 22
    iget-object v1, v0, Lr80;->a:Ln80;

    iget-boolean v1, v1, Ln80;->n:Z

    if-eqz v1, :cond_7

    .line 23
    invoke-virtual {v7}, Lq80;->g()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0x1fe4

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const v3, 0x1fe5

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x1fe6

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v1, v2}, Lx80;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    if-eqz v11, :cond_8

    .line 24
    invoke-interface/range {p2 .. p2}, Ly70;->onSuccess()V

    :cond_8
    return-void

    .line 25
    :cond_9
    iget-boolean v1, v0, Lr80;->e:Z

    if-eqz v1, :cond_a

    .line 26
    invoke-virtual {p0}, Lr80;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v3, v1}, Lo80;->d(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 27
    :cond_a
    new-instance v13, Lf80;

    iget-object v2, v0, Lr80;->a:Ln80;

    iget v5, v0, Lr80;->h:I

    iget v6, v0, Lr80;->i:I

    iget v8, v0, Lr80;->g:I

    iget-object v10, v0, Lr80;->k:Landroid/graphics/drawable/Drawable;

    iget-object v12, v0, Lr80;->l:Ljava/lang/Object;

    iget-boolean v14, v0, Lr80;->c:Z

    move-object v1, v13

    move-object/from16 v3, p1

    move-object v4, v7

    move v7, v8

    move-object v8, v10

    move-object v10, v12

    move-object/from16 v11, p2

    move v12, v14

    invoke-direct/range {v1 .. v12}, Lf80;-><init>(Ln80;Landroid/widget/ImageView;Lq80;IIILandroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/Object;Ly70;Z)V

    .line 28
    iget-object v1, v0, Lr80;->a:Ln80;

    invoke-virtual {v1, v13}, Ln80;->f(Lu70;)V

    return-void

    .line 29
    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const v2, 0x1fe7

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public g(I)Lr80;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr80;->e:Z

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    .line 2
    iget-object v0, p0, Lr80;->j:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 3
    iput p1, p0, Lr80;->f:I

    return-object p0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const v0, 0x1fe8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x1fe9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 6
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const v0, 0x1fea

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(II)Lr80;
    .locals 1

    .line 1
    iget-object v0, p0, Lr80;->b:Lq80$b;

    invoke-virtual {v0, p1, p2}, Lq80$b;->d(II)Lq80$b;

    return-object p0
.end method

.method public i()Lr80;
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lr80;->d:Z

    return-object p0
.end method
