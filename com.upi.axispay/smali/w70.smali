.class public Lw70;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final u:Ljava/lang/Object;

.field public static final v:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/StringBuilder;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final x:Ls80;


# instance fields
.field public final b:I

.field public final c:Ln80;

.field public final d:Lc80;

.field public final e:Lx70;

.field public final f:Lu80;

.field public final g:Ljava/lang/String;

.field public final h:Lq80;

.field public final i:I

.field public j:I

.field public final k:Ls80;

.field public l:Lu70;

.field public m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lu70;",
            ">;"
        }
    .end annotation
.end field

.field public n:Landroid/graphics/Bitmap;

.field public o:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field public p:Ln80$e;

.field public q:Ljava/lang/Exception;

.field public r:I

.field public s:I

.field public t:Ln80$f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lw70;->u:Ljava/lang/Object;

    .line 2
    new-instance v0, Lw70$a;

    invoke-direct {v0}, Lw70$a;-><init>()V

    sput-object v0, Lw70;->v:Ljava/lang/ThreadLocal;

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lw70;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    new-instance v0, Lw70$b;

    invoke-direct {v0}, Lw70$b;-><init>()V

    sput-object v0, Lw70;->x:Ls80;

    return-void
.end method

.method public constructor <init>(Ln80;Lc80;Lx70;Lu80;Lu70;Ls80;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lw70;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    iput v0, p0, Lw70;->b:I

    .line 3
    iput-object p1, p0, Lw70;->c:Ln80;

    .line 4
    iput-object p2, p0, Lw70;->d:Lc80;

    .line 5
    iput-object p3, p0, Lw70;->e:Lx70;

    .line 6
    iput-object p4, p0, Lw70;->f:Lu80;

    .line 7
    iput-object p5, p0, Lw70;->l:Lu70;

    .line 8
    invoke-virtual {p5}, Lu70;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lw70;->g:Ljava/lang/String;

    .line 9
    invoke-virtual {p5}, Lu70;->i()Lq80;

    move-result-object p1

    iput-object p1, p0, Lw70;->h:Lq80;

    .line 10
    invoke-virtual {p5}, Lu70;->h()Ln80$f;

    move-result-object p1

    iput-object p1, p0, Lw70;->t:Ln80$f;

    .line 11
    invoke-virtual {p5}, Lu70;->e()I

    move-result p1

    iput p1, p0, Lw70;->i:I

    .line 12
    invoke-virtual {p5}, Lu70;->f()I

    move-result p1

    iput p1, p0, Lw70;->j:I

    .line 13
    iput-object p6, p0, Lw70;->k:Ls80;

    .line 14
    invoke-virtual {p6}, Ls80;->e()I

    move-result p1

    iput p1, p0, Lw70;->s:I

    return-void
.end method

.method public static a(Ljava/util/List;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw80;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    .line 2
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw80;

    const/4 v4, 0x0

    .line 3
    :try_start_0
    invoke-interface {v3, p1}, Lw80;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v5, :cond_1

    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x22b3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-interface {v3}, Lw80;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x22b4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v0, 0x22b5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 9
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw80;

    .line 11
    invoke-interface {v1}, Lw80;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 12
    :cond_0
    sget-object p0, Ln80;->p:Landroid/os/Handler;

    new-instance v1, Lw70$d;

    invoke-direct {v1, p1}, Lw70$d;-><init>(Ljava/lang/StringBuilder;)V

    invoke-virtual {p0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v4

    :cond_1
    if-ne v5, p1, :cond_2

    .line 13
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 14
    sget-object p0, Ln80;->p:Landroid/os/Handler;

    new-instance p1, Lw70$e;

    invoke-direct {p1, v3}, Lw70$e;-><init>(Lw80;)V

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v4

    :cond_2
    if-eq v5, p1, :cond_3

    .line 15
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result p1

    if-nez p1, :cond_3

    .line 16
    sget-object p0, Ln80;->p:Landroid/os/Handler;

    new-instance p1, Lw70$f;

    invoke-direct {p1, v3}, Lw70$f;-><init>(Lw80;)V

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v4

    :cond_3
    add-int/lit8 v2, v2, 0x1

    move-object p1, v5

    goto/16 :goto_0

    :catch_0
    move-exception p0

    .line 17
    sget-object p1, Ln80;->p:Landroid/os/Handler;

    new-instance v1, Lw70$c;

    invoke-direct {v1, v3, p0}, Lw70$c;-><init>(Lw80;Ljava/lang/RuntimeException;)V

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v4

    :cond_4
    return-object p1
.end method

.method public static e(Lokio/Source;Lq80;)Landroid/graphics/Bitmap;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object p0

    .line 2
    invoke-static {p0}, Lx80;->r(Lokio/BufferedSource;)Z

    move-result v0

    .line 3
    iget-boolean v1, p1, Lq80;->r:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-ge v1, v4, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    .line 4
    :goto_0
    invoke-static {p1}, Ls80;->d(Lq80;)Landroid/graphics/BitmapFactory$Options;

    move-result-object v4

    .line 5
    invoke-static {v4}, Ls80;->g(Landroid/graphics/BitmapFactory$Options;)Z

    move-result v5

    if-nez v0, :cond_4

    if-eqz v1, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    invoke-interface {p0}, Lokio/BufferedSource;->inputStream()Ljava/io/InputStream;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz v5, :cond_2

    .line 7
    new-instance v1, Lh80;

    invoke-direct {v1, p0}, Lh80;-><init>(Ljava/io/InputStream;)V

    .line 8
    invoke-virtual {v1, v3}, Lh80;->b(Z)V

    const/16 p0, 0x400

    .line 9
    invoke-virtual {v1, p0}, Lh80;->k(I)J

    move-result-wide v5

    .line 10
    invoke-static {v1, v0, v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 11
    iget p0, p1, Lq80;->h:I

    iget v3, p1, Lq80;->i:I

    invoke-static {p0, v3, v4, p1}, Ls80;->b(IILandroid/graphics/BitmapFactory$Options;Lq80;)V

    .line 12
    invoke-virtual {v1, v5, v6}, Lh80;->j(J)V

    .line 13
    invoke-virtual {v1, v2}, Lh80;->b(Z)V

    move-object p0, v1

    .line 14
    :cond_2
    invoke-static {p0, v0, v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p0

    if-eqz p0, :cond_3

    return-object p0

    .line 15
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const p1, 0x22b6

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 16
    :cond_4
    :goto_1
    invoke-interface {p0}, Lokio/BufferedSource;->readByteArray()[B

    move-result-object p0

    if-eqz v5, :cond_5

    .line 17
    array-length v0, p0

    invoke-static {p0, v3, v0, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 18
    iget v0, p1, Lq80;->h:I

    iget v1, p1, Lq80;->i:I

    invoke-static {v0, v1, v4, p1}, Ls80;->b(IILandroid/graphics/BitmapFactory$Options;Lq80;)V

    .line 19
    :cond_5
    array-length p1, p0

    invoke-static {p0, v3, p1, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ln80;Lc80;Lx70;Lu80;Lu70;)Lw70;
    .locals 12

    .line 1
    invoke-virtual/range {p4 .. p4}, Lu70;->i()Lq80;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Ln80;->h()Ljava/util/List;

    move-result-object v1

    .line 3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 4
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Ls80;

    .line 5
    invoke-virtual {v11, v0}, Ls80;->c(Lq80;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 6
    new-instance v0, Lw70;

    move-object v5, v0

    move-object v6, p0

    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    invoke-direct/range {v5 .. v11}, Lw70;-><init>(Ln80;Lc80;Lx70;Lu80;Lu70;Ls80;)V

    return-object v0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 7
    :cond_1
    new-instance v0, Lw70;

    sget-object v10, Lw70;->x:Ls80;

    move-object v4, v0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    move-object/from16 v9, p4

    invoke-direct/range {v4 .. v10}, Lw70;-><init>(Ln80;Lc80;Lx70;Lu80;Lu70;Ls80;)V

    return-object v0
.end method

.method public static l(I)I
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    goto :goto_0

    :pswitch_0
    const/16 p0, 0x10e

    goto :goto_0

    :pswitch_1
    const/16 p0, 0x5a

    goto :goto_0

    :pswitch_2
    const/16 p0, 0xb4

    :goto_0
    return p0

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static m(I)I
    .locals 1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 v0, 0x7

    if-eq p0, v0, :cond_0

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, -0x1

    :goto_0
    return p0
.end method

.method public static v(ZIIII)Z
    .locals 0

    if-eqz p0, :cond_2

    if-eqz p3, :cond_0

    if-gt p1, p3, :cond_2

    :cond_0
    if-eqz p4, :cond_1

    if-le p2, p4, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static y(Lq80;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 26

    move-object/from16 v0, p0

    .line 1
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    .line 2
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    .line 3
    iget-boolean v3, v0, Lq80;->m:Z

    .line 4
    new-instance v9, Landroid/graphics/Matrix;

    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    .line 5
    invoke-virtual/range {p0 .. p0}, Lq80;->e()Z

    move-result v4

    if-nez v4, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    move v3, v1

    move v5, v2

    move-object v0, v9

    goto/16 :goto_c

    .line 6
    :cond_1
    :goto_0
    iget v4, v0, Lq80;->h:I

    .line 7
    iget v6, v0, Lq80;->i:I

    .line 8
    iget v7, v0, Lq80;->n:F

    const/4 v8, 0x0

    cmpl-float v8, v7, v8

    if-eqz v8, :cond_3

    float-to-double v10, v7

    .line 9
    invoke-static {v10, v11}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    move-result-wide v12

    .line 10
    invoke-static {v10, v11}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    .line 11
    iget-boolean v4, v0, Lq80;->q:Z

    if-eqz v4, :cond_2

    .line 12
    iget v4, v0, Lq80;->o:F

    iget v6, v0, Lq80;->p:F

    invoke-virtual {v9, v7, v4, v6}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 13
    iget v4, v0, Lq80;->o:F

    float-to-double v6, v4

    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v14, v12

    mul-double/2addr v6, v14

    iget v8, v0, Lq80;->p:F

    move/from16 v16, v2

    move/from16 v17, v3

    float-to-double v2, v8

    mul-double/2addr v2, v10

    add-double/2addr v6, v2

    float-to-double v2, v8

    mul-double/2addr v2, v14

    float-to-double v14, v4

    mul-double/2addr v14, v10

    sub-double/2addr v2, v14

    .line 14
    iget v4, v0, Lq80;->h:I

    int-to-double v14, v4

    mul-double/2addr v14, v12

    add-double/2addr v14, v6

    move-wide/from16 v18, v6

    int-to-double v5, v4

    mul-double/2addr v5, v10

    add-double/2addr v5, v2

    move-object/from16 v20, v9

    int-to-double v8, v4

    mul-double/2addr v8, v12

    add-double v7, v18, v8

    .line 15
    iget v9, v0, Lq80;->i:I

    move/from16 v22, v1

    int-to-double v0, v9

    mul-double/2addr v0, v10

    sub-double/2addr v7, v0

    int-to-double v0, v4

    mul-double/2addr v0, v10

    add-double/2addr v0, v2

    move-wide/from16 v23, v5

    int-to-double v4, v9

    mul-double/2addr v4, v12

    add-double/2addr v0, v4

    int-to-double v4, v9

    mul-double/2addr v4, v10

    sub-double v4, v18, v4

    int-to-double v9, v9

    mul-double/2addr v9, v12

    add-double/2addr v9, v2

    move-wide/from16 v11, v18

    move-wide/from16 v18, v9

    .line 16
    invoke-static {v11, v12, v14, v15}, Ljava/lang/Math;->max(DD)D

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(DD)D

    move-result-wide v9

    invoke-static {v4, v5, v9, v10}, Ljava/lang/Math;->max(DD)D

    move-result-wide v9

    .line 17
    invoke-static {v11, v12, v14, v15}, Ljava/lang/Math;->min(DD)D

    move-result-wide v11

    invoke-static {v7, v8, v11, v12}, Ljava/lang/Math;->min(DD)D

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(DD)D

    move-result-wide v4

    move-wide/from16 v6, v23

    .line 18
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(DD)D

    move-result-wide v11

    invoke-static {v0, v1, v11, v12}, Ljava/lang/Math;->max(DD)D

    move-result-wide v11

    move-wide/from16 v13, v18

    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->max(DD)D

    move-result-wide v11

    .line 19
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    invoke-static {v13, v14, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    sub-double/2addr v9, v4

    .line 20
    invoke-static {v9, v10}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v4, v2

    sub-double/2addr v11, v0

    .line 21
    invoke-static {v11, v12}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v6, v0

    move-object/from16 v0, v20

    goto/16 :goto_1

    :cond_2
    move/from16 v22, v1

    move/from16 v16, v2

    move/from16 v17, v3

    move-object v0, v9

    .line 22
    invoke-virtual {v0, v7}, Landroid/graphics/Matrix;->setRotate(F)V

    move-object/from16 v1, p0

    .line 23
    iget v2, v1, Lq80;->h:I

    int-to-double v3, v2

    mul-double/2addr v3, v12

    int-to-double v5, v2

    mul-double/2addr v5, v10

    int-to-double v7, v2

    mul-double/2addr v7, v12

    .line 24
    iget v9, v1, Lq80;->i:I

    int-to-double v14, v9

    mul-double/2addr v14, v10

    sub-double/2addr v7, v14

    int-to-double v14, v2

    mul-double/2addr v14, v10

    int-to-double v1, v9

    mul-double/2addr v1, v12

    add-double/2addr v14, v1

    int-to-double v1, v9

    mul-double/2addr v1, v10

    neg-double v1, v1

    int-to-double v9, v9

    mul-double/2addr v9, v12

    const-wide/16 v11, 0x0

    move-wide/from16 v18, v9

    .line 25
    invoke-static {v11, v12, v3, v4}, Ljava/lang/Math;->max(DD)D

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(DD)D

    move-result-wide v9

    invoke-static {v1, v2, v9, v10}, Ljava/lang/Math;->max(DD)D

    move-result-wide v9

    .line 26
    invoke-static {v11, v12, v3, v4}, Ljava/lang/Math;->min(DD)D

    move-result-wide v3

    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->min(DD)D

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(DD)D

    move-result-wide v1

    .line 27
    invoke-static {v11, v12, v5, v6}, Ljava/lang/Math;->max(DD)D

    move-result-wide v3

    invoke-static {v14, v15, v3, v4}, Ljava/lang/Math;->max(DD)D

    move-result-wide v3

    move-wide/from16 v7, v18

    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->max(DD)D

    move-result-wide v3

    .line 28
    invoke-static {v11, v12, v5, v6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v5

    invoke-static {v14, v15, v5, v6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v5

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v5

    sub-double/2addr v9, v1

    .line 29
    invoke-static {v9, v10}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    sub-double/2addr v3, v5

    .line 30
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v6, v2

    move v4, v1

    goto :goto_1

    :cond_3
    move/from16 v22, v1

    move/from16 v16, v2

    move/from16 v17, v3

    move-object v0, v9

    :goto_1
    if-eqz p2, :cond_6

    .line 31
    invoke-static/range {p2 .. p2}, Lw70;->l(I)I

    move-result v1

    .line 32
    invoke-static/range {p2 .. p2}, Lw70;->m(I)I

    move-result v2

    if-eqz v1, :cond_5

    int-to-float v3, v1

    .line 33
    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->preRotate(F)Z

    const/16 v3, 0x5a

    if-eq v1, v3, :cond_4

    const/16 v3, 0x10e

    if-ne v1, v3, :cond_5

    :cond_4
    move/from16 v25, v6

    move v6, v4

    move/from16 v4, v25

    :cond_5
    const/4 v1, 0x1

    if-eq v2, v1, :cond_6

    int-to-float v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    .line 34
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    :cond_6
    move-object/from16 v1, p0

    .line 35
    iget-boolean v2, v1, Lq80;->j:Z

    if-eqz v2, :cond_10

    if-eqz v4, :cond_7

    int-to-float v2, v4

    move/from16 v3, v22

    int-to-float v5, v3

    div-float/2addr v2, v5

    move/from16 v5, v16

    goto :goto_2

    :cond_7
    move/from16 v3, v22

    int-to-float v2, v6

    move/from16 v5, v16

    int-to-float v7, v5

    div-float/2addr v2, v7

    :goto_2
    if-eqz v6, :cond_8

    int-to-float v7, v6

    int-to-float v8, v5

    goto :goto_3

    :cond_8
    int-to-float v7, v4

    int-to-float v8, v3

    :goto_3
    div-float/2addr v7, v8

    cmpl-float v8, v2, v7

    if-lez v8, :cond_b

    int-to-float v8, v5

    div-float/2addr v7, v2

    mul-float/2addr v8, v7

    float-to-double v7, v8

    .line 36
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v7

    double-to-int v7, v7

    .line 37
    iget v1, v1, Lq80;->k:I

    and-int/lit8 v8, v1, 0x30

    const/16 v9, 0x30

    if-ne v8, v9, :cond_9

    const/4 v1, 0x0

    goto :goto_4

    :cond_9
    const/16 v8, 0x50

    and-int/2addr v1, v8

    if-ne v1, v8, :cond_a

    sub-int v1, v5, v7

    goto :goto_4

    :cond_a
    sub-int v1, v5, v7

    .line 38
    div-int/lit8 v1, v1, 0x2

    :goto_4
    int-to-float v8, v6

    int-to-float v9, v7

    div-float/2addr v8, v9

    move v9, v7

    move/from16 v10, v17

    const/16 v21, 0x0

    move v7, v1

    move v1, v3

    goto :goto_6

    :cond_b
    cmpg-float v8, v2, v7

    if-gez v8, :cond_e

    int-to-float v8, v3

    div-float/2addr v2, v7

    mul-float/2addr v8, v2

    float-to-double v8, v8

    .line 39
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-int v2, v8

    .line 40
    iget v1, v1, Lq80;->k:I

    and-int/lit8 v8, v1, 0x3

    const/4 v9, 0x3

    if-ne v8, v9, :cond_c

    const/4 v1, 0x0

    goto :goto_5

    :cond_c
    const/4 v8, 0x5

    and-int/2addr v1, v8

    if-ne v1, v8, :cond_d

    sub-int v1, v3, v2

    goto :goto_5

    :cond_d
    sub-int v1, v3, v2

    .line 41
    div-int/lit8 v1, v1, 0x2

    :goto_5
    int-to-float v8, v4

    int-to-float v9, v2

    div-float/2addr v8, v9

    move/from16 v21, v1

    move v1, v2

    move v9, v5

    move v2, v8

    move/from16 v10, v17

    move v8, v7

    const/4 v7, 0x0

    goto :goto_6

    :cond_e
    move v1, v3

    move v9, v5

    move v2, v7

    move v8, v2

    move/from16 v10, v17

    const/4 v7, 0x0

    const/16 v21, 0x0

    .line 42
    :goto_6
    invoke-static {v10, v3, v5, v4, v6}, Lw70;->v(ZIIII)Z

    move-result v3

    if-eqz v3, :cond_f

    .line 43
    invoke-virtual {v0, v2, v8}, Landroid/graphics/Matrix;->preScale(FF)Z

    :cond_f
    move v6, v7

    move v8, v9

    move/from16 v5, v21

    move v7, v1

    goto :goto_d

    :cond_10
    move/from16 v5, v16

    move/from16 v10, v17

    move/from16 v3, v22

    .line 44
    iget-boolean v1, v1, Lq80;->l:Z

    if-eqz v1, :cond_14

    if-eqz v4, :cond_11

    int-to-float v1, v4

    int-to-float v2, v3

    goto :goto_7

    :cond_11
    int-to-float v1, v6

    int-to-float v2, v5

    :goto_7
    div-float/2addr v1, v2

    if-eqz v6, :cond_12

    int-to-float v2, v6

    int-to-float v7, v5

    goto :goto_8

    :cond_12
    int-to-float v2, v4

    int-to-float v7, v3

    :goto_8
    div-float/2addr v2, v7

    cmpg-float v7, v1, v2

    if-gez v7, :cond_13

    goto :goto_9

    :cond_13
    move v1, v2

    .line 45
    :goto_9
    invoke-static {v10, v3, v5, v4, v6}, Lw70;->v(ZIIII)Z

    move-result v2

    if-eqz v2, :cond_19

    .line 46
    invoke-virtual {v0, v1, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    goto :goto_c

    :cond_14
    if-nez v4, :cond_15

    if-eqz v6, :cond_19

    :cond_15
    if-ne v4, v3, :cond_16

    if-eq v6, v5, :cond_19

    :cond_16
    if-eqz v4, :cond_17

    int-to-float v1, v4

    int-to-float v2, v3

    goto :goto_a

    :cond_17
    int-to-float v1, v6

    int-to-float v2, v5

    :goto_a
    div-float/2addr v1, v2

    if-eqz v6, :cond_18

    int-to-float v2, v6

    int-to-float v7, v5

    goto :goto_b

    :cond_18
    int-to-float v2, v4

    int-to-float v7, v3

    :goto_b
    div-float/2addr v2, v7

    .line 47
    invoke-static {v10, v3, v5, v4, v6}, Lw70;->v(ZIIII)Z

    move-result v4

    if-eqz v4, :cond_19

    .line 48
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    :cond_19
    :goto_c
    move v7, v3

    move v8, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_d
    const/4 v10, 0x1

    move-object/from16 v4, p1

    move-object v9, v0

    .line 49
    invoke-static/range {v4 .. v10}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_1a

    .line 50
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_e

    :cond_1a
    move-object v0, v1

    :goto_e
    return-object v0
.end method

.method public static z(Lq80;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lq80;->a()Ljava/lang/String;

    move-result-object p0

    .line 2
    sget-object v0, Lw70;->v:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x8

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->ensureCapacity(I)V

    .line 4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    invoke-virtual {v0, v2, v1, p0}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(Lu70;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lw70;->c:Ln80;

    iget-boolean v0, v0, Ln80;->n:Z

    .line 2
    iget-object v1, p1, Lu70;->b:Lq80;

    .line 3
    iget-object v2, p0, Lw70;->l:Lu70;

    const v3, 0x22b7

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x22b8

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x22b9

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    if-nez v2, :cond_3

    .line 4
    iput-object p1, p0, Lw70;->l:Lu70;

    if-eqz v0, :cond_2

    .line 5
    iget-object p1, p0, Lw70;->m:Ljava/util/List;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v1}, Lq80;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v3}, Lx80;->k(Lw70;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v4, p1, v0}, Lx80;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 7
    :cond_1
    :goto_0
    invoke-virtual {v1}, Lq80;->d()Ljava/lang/String;

    move-result-object p1

    const v0, 0x22ba

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v4, p1, v0}, Lx80;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void

    .line 8
    :cond_3
    iget-object v2, p0, Lw70;->m:Ljava/util/List;

    if-nez v2, :cond_4

    .line 9
    new-instance v2, Ljava/util/ArrayList;

    const/4 v6, 0x3

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p0, Lw70;->m:Ljava/util/List;

    .line 10
    :cond_4
    iget-object v2, p0, Lw70;->m:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_5

    .line 11
    invoke-virtual {v1}, Lq80;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v3}, Lx80;->k(Lw70;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v4, v0, v1}, Lx80;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    :cond_5
    invoke-virtual {p1}, Lu70;->h()Ln80$f;

    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, Lw70;->t:Ln80$f;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-le v0, v1, :cond_6

    .line 14
    iput-object p1, p0, Lw70;->t:Ln80$f;

    :cond_6
    return-void
.end method

.method public c()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lw70;->l:Lu70;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lw70;->m:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lw70;->o:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_1

    .line 3
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final d()Ln80$f;
    .locals 6

    .line 1
    sget-object v0, Ln80$f;->b:Ln80$f;

    .line 2
    iget-object v1, p0, Lw70;->m:Ljava/util/List;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    .line 3
    :goto_0
    iget-object v4, p0, Lw70;->l:Lu70;

    if-nez v4, :cond_2

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :cond_2
    :goto_1
    if-nez v2, :cond_3

    return-object v0

    :cond_3
    if-eqz v4, :cond_4

    .line 4
    invoke-virtual {v4}, Lu70;->h()Ln80$f;

    move-result-object v0

    :cond_4
    if-eqz v1, :cond_6

    .line 5
    iget-object v1, p0, Lw70;->m:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_2
    if-ge v3, v1, :cond_6

    .line 6
    iget-object v2, p0, Lw70;->m:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu70;

    invoke-virtual {v2}, Lu70;->h()Ln80$f;

    move-result-object v2

    .line 7
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-le v4, v5, :cond_5

    move-object v0, v2

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    return-object v0
.end method

.method public f(Lu70;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lw70;->l:Lu70;

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lw70;->l:Lu70;

    const/4 v0, 0x1

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lw70;->m:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {p1}, Lu70;->h()Ln80$f;

    move-result-object v0

    iget-object v1, p0, Lw70;->t:Ln80$f;

    if-ne v0, v1, :cond_2

    .line 6
    invoke-virtual {p0}, Lw70;->d()Ln80$f;

    move-result-object v0

    iput-object v0, p0, Lw70;->t:Ln80$f;

    .line 7
    :cond_2
    iget-object v0, p0, Lw70;->c:Ln80;

    iget-boolean v0, v0, Ln80;->n:Z

    if-eqz v0, :cond_3

    .line 8
    iget-object p1, p1, Lu70;->b:Lq80;

    invoke-virtual {p1}, Lq80;->d()Ljava/lang/String;

    move-result-object p1

    const v0, 0x22bb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lx80;->k(Lw70;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x22bc

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x22bd

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, p1, v0}, Lx80;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public h()Lu70;
    .locals 1

    .line 1
    iget-object v0, p0, Lw70;->l:Lu70;

    return-object v0
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lu70;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lw70;->m:Ljava/util/List;

    return-object v0
.end method

.method public j()Lq80;
    .locals 1

    .line 1
    iget-object v0, p0, Lw70;->h:Lq80;

    return-object v0
.end method

.method public k()Ljava/lang/Exception;
    .locals 1

    .line 1
    iget-object v0, p0, Lw70;->q:Ljava/lang/Exception;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lw70;->g:Ljava/lang/String;

    return-object v0
.end method

.method public o()Ln80$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lw70;->p:Ln80$e;

    return-object v0
.end method

.method public p()I
    .locals 1

    .line 1
    iget v0, p0, Lw70;->i:I

    return v0
.end method

.method public q()Ln80;
    .locals 1

    .line 1
    iget-object v0, p0, Lw70;->c:Ln80;

    return-object v0
.end method

.method public r()Ln80$f;
    .locals 1

    .line 1
    iget-object v0, p0, Lw70;->t:Ln80$f;

    return-object v0
.end method

.method public run()V
    .locals 6

    const v0, 0x22be

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    :try_start_0
    iget-object v2, p0, Lw70;->h:Lq80;

    invoke-static {v2}, Lw70;->z(Lq80;)V

    .line 2
    iget-object v2, p0, Lw70;->c:Ln80;

    iget-boolean v2, v2, Ln80;->n:Z

    if-eqz v2, :cond_0

    const v0, 0x22bf

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v0, 0x22c0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 3
    invoke-static {p0}, Lx80;->j(Lw70;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lx80;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    :cond_0
    invoke-virtual {p0}, Lw70;->t()Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Lw70;->n:Landroid/graphics/Bitmap;

    if-nez v2, :cond_1

    .line 5
    iget-object v2, p0, Lw70;->d:Lc80;

    invoke-virtual {v2, p0}, Lc80;->e(Lw70;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v2, p0, Lw70;->d:Lc80;

    invoke-virtual {v2, p0}, Lc80;->d(Lw70;)V
    :try_end_0
    .catch Ll80$b; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    goto :goto_2

    :catch_0
    move-exception v2

    .line 7
    :try_start_1
    iput-object v2, p0, Lw70;->q:Ljava/lang/Exception;

    .line 8
    iget-object v2, p0, Lw70;->d:Lc80;

    invoke-virtual {v2, p0}, Lc80;->e(Lw70;)V

    goto :goto_0

    :catch_1
    move-exception v2

    .line 9
    new-instance v3, Ljava/io/StringWriter;

    invoke-direct {v3}, Ljava/io/StringWriter;-><init>()V

    .line 10
    iget-object v4, p0, Lw70;->f:Lu80;

    invoke-virtual {v4}, Lu80;->a()Lv80;

    move-result-object v4

    new-instance v5, Ljava/io/PrintWriter;

    invoke-direct {v5, v3}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {v4, v5}, Lv80;->a(Ljava/io/PrintWriter;)V

    .line 11
    new-instance v4, Ljava/lang/RuntimeException;

    invoke-virtual {v3}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object v4, p0, Lw70;->q:Ljava/lang/Exception;

    .line 12
    iget-object v2, p0, Lw70;->d:Lc80;

    invoke-virtual {v2, p0}, Lc80;->e(Lw70;)V

    goto :goto_0

    :catch_2
    move-exception v2

    .line 13
    iput-object v2, p0, Lw70;->q:Ljava/lang/Exception;

    .line 14
    iget-object v2, p0, Lw70;->d:Lc80;

    invoke-virtual {v2, p0}, Lc80;->g(Lw70;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :goto_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    goto :goto_1

    :catch_3
    move-exception v2

    .line 16
    :try_start_2
    iget v3, v2, Ll80$b;->c:I

    invoke-static {v3}, Lk80;->a(I)Z

    move-result v3

    if-eqz v3, :cond_2

    iget v3, v2, Ll80$b;->b:I

    const/16 v4, 0x1f8

    if-eq v3, v4, :cond_3

    .line 17
    :cond_2
    iput-object v2, p0, Lw70;->q:Ljava/lang/Exception;

    .line 18
    :cond_3
    iget-object v2, p0, Lw70;->d:Lc80;

    invoke-virtual {v2, p0}, Lc80;->e(Lw70;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    .line 19
    :goto_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    throw v2
.end method

.method public s()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lw70;->n:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public t()Landroid/graphics/Bitmap;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v1, p0, Lw70;->i:I

    invoke-static {v1}, Lj80;->a(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2
    iget-object v1, p0, Lw70;->e:Lx70;

    iget-object v2, p0, Lw70;->g:Ljava/lang/String;

    invoke-interface {v1, v2}, Lx70;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 3
    iget-object v2, p0, Lw70;->f:Lu80;

    invoke-virtual {v2}, Lu80;->d()V

    .line 4
    sget-object v2, Ln80$e;->c:Ln80$e;

    iput-object v2, p0, Lw70;->p:Ln80$e;

    .line 5
    iget-object v2, p0, Lw70;->c:Ln80;

    iget-boolean v2, v2, Ln80;->n:Z

    if-eqz v2, :cond_0

    const v0, 0x22c1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v0, 0x22c2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 6
    iget-object v4, p0, Lw70;->h:Lq80;

    invoke-virtual {v4}, Lq80;->d()Ljava/lang/String;

    move-result-object v4

    const v0, 0x22c3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v3, v4, v5}, Lx80;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v1

    :cond_1
    const/4 v1, 0x0

    .line 7
    :cond_2
    iget v2, p0, Lw70;->s:I

    if-nez v2, :cond_3

    sget-object v2, Lk80;->e:Lk80;

    iget v2, v2, Lk80;->b:I

    goto :goto_0

    :cond_3
    iget v2, p0, Lw70;->j:I

    :goto_0
    iput v2, p0, Lw70;->j:I

    .line 8
    iget-object v3, p0, Lw70;->k:Ls80;

    iget-object v4, p0, Lw70;->h:Lq80;

    invoke-virtual {v3, v4, v2}, Ls80;->f(Lq80;I)Ls80$a;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 9
    invoke-virtual {v2}, Ls80$a;->c()Ln80$e;

    move-result-object v1

    iput-object v1, p0, Lw70;->p:Ln80$e;

    .line 10
    invoke-virtual {v2}, Ls80$a;->b()I

    move-result v1

    iput v1, p0, Lw70;->r:I

    .line 11
    invoke-virtual {v2}, Ls80$a;->a()Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_4

    .line 12
    invoke-virtual {v2}, Ls80$a;->d()Lokio/Source;

    move-result-object v1

    .line 13
    :try_start_0
    iget-object v2, p0, Lw70;->h:Lq80;

    invoke-static {v1, v2}, Lw70;->e(Lokio/Source;Lq80;)Landroid/graphics/Bitmap;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    :try_start_1
    invoke-interface {v1}, Lokio/Source;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-object v1, v2

    goto :goto_1

    :catchall_0
    move-exception v2

    :try_start_2
    invoke-interface {v1}, Lokio/Source;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 15
    :catch_1
    throw v2

    :cond_4
    :goto_1
    if-eqz v1, :cond_a

    .line 16
    iget-object v2, p0, Lw70;->c:Ln80;

    iget-boolean v2, v2, Ln80;->n:Z

    if-eqz v2, :cond_5

    const v0, 0x22c4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v0, 0x22c5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 17
    iget-object v4, p0, Lw70;->h:Lq80;

    invoke-virtual {v4}, Lq80;->d()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lx80;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    :cond_5
    iget-object v2, p0, Lw70;->f:Lu80;

    invoke-virtual {v2, v1}, Lu80;->b(Landroid/graphics/Bitmap;)V

    .line 19
    iget-object v2, p0, Lw70;->h:Lq80;

    invoke-virtual {v2}, Lq80;->f()Z

    move-result v2

    if-nez v2, :cond_6

    iget v2, p0, Lw70;->r:I

    if-eqz v2, :cond_a

    .line 20
    :cond_6
    sget-object v2, Lw70;->u:Ljava/lang/Object;

    monitor-enter v2

    .line 21
    :try_start_3
    iget-object v3, p0, Lw70;->h:Lq80;

    invoke-virtual {v3}, Lq80;->e()Z

    move-result v3

    if-nez v3, :cond_7

    iget v3, p0, Lw70;->r:I

    if-eqz v3, :cond_8

    .line 22
    :cond_7
    iget-object v3, p0, Lw70;->h:Lq80;

    iget v4, p0, Lw70;->r:I

    invoke-static {v3, v1, v4}, Lw70;->y(Lq80;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 23
    iget-object v3, p0, Lw70;->c:Ln80;

    iget-boolean v3, v3, Ln80;->n:Z

    if-eqz v3, :cond_8

    const v0, 0x22c6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v0, 0x22c7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 24
    iget-object v5, p0, Lw70;->h:Lq80;

    invoke-virtual {v5}, Lq80;->d()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lx80;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    :cond_8
    iget-object v3, p0, Lw70;->h:Lq80;

    invoke-virtual {v3}, Lq80;->b()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 26
    iget-object v3, p0, Lw70;->h:Lq80;

    iget-object v3, v3, Lq80;->g:Ljava/util/List;

    invoke-static {v3, v1}, Lw70;->a(Ljava/util/List;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 27
    iget-object v3, p0, Lw70;->c:Ln80;

    iget-boolean v3, v3, Ln80;->n:Z

    if-eqz v3, :cond_9

    const v0, 0x22c8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v0, 0x22c9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 28
    iget-object v5, p0, Lw70;->h:Lq80;

    invoke-virtual {v5}, Lq80;->d()Ljava/lang/String;

    move-result-object v5

    const v0, 0x22ca

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v4, v5, v6}, Lx80;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    :cond_9
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v1, :cond_a

    .line 30
    iget-object v2, p0, Lw70;->f:Lu80;

    invoke-virtual {v2, v1}, Lu80;->c(Landroid/graphics/Bitmap;)V

    goto :goto_2

    :catchall_1
    move-exception v1

    .line 31
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1

    :cond_a
    :goto_2
    return-object v1
.end method

.method public u()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw70;->o:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public w(ZLandroid/net/NetworkInfo;)Z
    .locals 4

    .line 1
    iget v0, p0, Lw70;->s:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    if-nez v3, :cond_1

    return v2

    :cond_1
    sub-int/2addr v0, v1

    .line 2
    iput v0, p0, Lw70;->s:I

    .line 3
    iget-object v0, p0, Lw70;->k:Ls80;

    invoke-virtual {v0, p1, p2}, Ls80;->h(ZLandroid/net/NetworkInfo;)Z

    move-result p1

    return p1
.end method

.method public x()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw70;->k:Ls80;

    invoke-virtual {v0}, Ls80;->i()Z

    move-result v0

    return v0
.end method
