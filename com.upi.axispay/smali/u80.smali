.class public Lu80;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu80$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/os/HandlerThread;

.field public final b:Lx70;

.field public final c:Landroid/os/Handler;

.field public d:J

.field public e:J

.field public f:J

.field public g:J

.field public h:J

.field public i:J

.field public j:J

.field public k:J

.field public l:I

.field public m:I

.field public n:I


# direct methods
.method public constructor <init>(Lx70;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lu80;->b:Lx70;

    .line 3
    new-instance p1, Landroid/os/HandlerThread;

    const v0, 0x44b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    invoke-direct {p1, v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object p1, p0, Lu80;->a:Landroid/os/HandlerThread;

    .line 4
    invoke-virtual {p1}, Landroid/os/HandlerThread;->start()V

    .line 5
    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lx80;->h(Landroid/os/Looper;)V

    .line 6
    new-instance v0, Lu80$a;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Lu80$a;-><init>(Landroid/os/Looper;Lu80;)V

    iput-object v0, p0, Lu80;->c:Landroid/os/Handler;

    return-void
.end method

.method public static g(IJ)J
    .locals 2

    int-to-long v0, p0

    .line 1
    div-long/2addr p1, v0

    return-wide p1
.end method


# virtual methods
.method public a()Lv80;
    .locals 28

    move-object/from16 v0, p0

    .line 1
    new-instance v25, Lv80;

    move-object/from16 v1, v25

    iget-object v2, v0, Lu80;->b:Lx70;

    invoke-interface {v2}, Lx70;->b()I

    move-result v2

    iget-object v3, v0, Lu80;->b:Lx70;

    invoke-interface {v3}, Lx70;->size()I

    move-result v3

    iget-wide v4, v0, Lu80;->d:J

    iget-wide v6, v0, Lu80;->e:J

    iget-wide v8, v0, Lu80;->f:J

    iget-wide v10, v0, Lu80;->g:J

    iget-wide v12, v0, Lu80;->h:J

    iget-wide v14, v0, Lu80;->i:J

    move-object/from16 v26, v1

    move/from16 v27, v2

    iget-wide v1, v0, Lu80;->j:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lu80;->k:J

    move-wide/from16 v18, v1

    iget v1, v0, Lu80;->l:I

    move/from16 v20, v1

    iget v1, v0, Lu80;->m:I

    move/from16 v21, v1

    iget v1, v0, Lu80;->n:I

    move/from16 v22, v1

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v23

    move-object/from16 v1, v26

    move/from16 v2, v27

    invoke-direct/range {v1 .. v24}, Lv80;-><init>(IIJJJJJJJJIIIJ)V

    return-object v25
.end method

.method public b(Landroid/graphics/Bitmap;)V
    .locals 1

    const/4 v0, 0x2

    .line 1
    invoke-virtual {p0, p1, v0}, Lu80;->m(Landroid/graphics/Bitmap;I)V

    return-void
.end method

.method public c(Landroid/graphics/Bitmap;)V
    .locals 1

    const/4 v0, 0x3

    .line 1
    invoke-virtual {p0, p1, v0}, Lu80;->m(Landroid/graphics/Bitmap;I)V

    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu80;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu80;->c:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public f(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu80;->c:Landroid/os/Handler;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x4

    invoke-virtual {v0, p2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public h(J)V
    .locals 3

    .line 1
    iget v0, p0, Lu80;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lu80;->m:I

    .line 2
    iget-wide v1, p0, Lu80;->g:J

    add-long/2addr v1, p1

    iput-wide v1, p0, Lu80;->g:J

    .line 3
    invoke-static {v0, v1, v2}, Lu80;->g(IJ)J

    move-result-wide p1

    iput-wide p1, p0, Lu80;->j:J

    return-void
.end method

.method public i(J)V
    .locals 2

    .line 1
    iget v0, p0, Lu80;->n:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lu80;->n:I

    .line 2
    iget-wide v0, p0, Lu80;->h:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lu80;->h:J

    .line 3
    iget p1, p0, Lu80;->m:I

    invoke-static {p1, v0, v1}, Lu80;->g(IJ)J

    move-result-wide p1

    iput-wide p1, p0, Lu80;->k:J

    return-void
.end method

.method public j()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lu80;->d:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lu80;->d:J

    return-void
.end method

.method public k()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lu80;->e:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lu80;->e:J

    return-void
.end method

.method public l(Ljava/lang/Long;)V
    .locals 4

    .line 1
    iget v0, p0, Lu80;->l:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lu80;->l:I

    .line 2
    iget-wide v0, p0, Lu80;->f:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lu80;->f:J

    .line 3
    iget p1, p0, Lu80;->l:I

    invoke-static {p1, v0, v1}, Lu80;->g(IJ)J

    move-result-wide v0

    iput-wide v0, p0, Lu80;->i:J

    return-void
.end method

.method public final m(Landroid/graphics/Bitmap;I)V
    .locals 2

    .line 1
    invoke-static {p1}, Lx80;->i(Landroid/graphics/Bitmap;)I

    move-result p1

    .line 2
    iget-object v0, p0, Lu80;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, p1, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
