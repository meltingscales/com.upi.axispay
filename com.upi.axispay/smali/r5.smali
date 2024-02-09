.class public Lr5;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr5$b;
    }
.end annotation


# static fields
.field public static u0:F


# instance fields
.field public A:I

.field public B:F

.field public C:I

.field public D:F

.field public E:[I

.field public F:F

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:I

.field public K:I

.field public L:Lq5;

.field public M:Lq5;

.field public N:Lq5;

.field public O:Lq5;

.field public P:Lq5;

.field public Q:Lq5;

.field public R:Lq5;

.field public S:Lq5;

.field public T:[Lq5;

.field public U:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lq5;",
            ">;"
        }
    .end annotation
.end field

.field public V:[Z

.field public W:[Lr5$b;

.field public X:Lr5;

.field public Y:I

.field public Z:I

.field public a:Z

.field public a0:F

.field public b:Lb6;

.field public b0:I

.field public c:Lb6;

.field public c0:I

.field public d:Lk6;

.field public d0:I

.field public e:Lm6;

.field public e0:I

.field public f:[Z

.field public f0:I

.field public g:Z

.field public g0:I

.field public h:Z

.field public h0:F

.field public i:Z

.field public i0:F

.field public j:I

.field public j0:Ljava/lang/Object;

.field public k:I

.field public k0:I

.field public l:Ljava/lang/String;

.field public l0:Ljava/lang/String;

.field public m:Z

.field public m0:Ljava/lang/String;

.field public n:Z

.field public n0:I

.field public o:Z

.field public o0:I

.field public p:Z

.field public p0:[F

.field public q:I

.field public q0:[Lr5;

.field public r:I

.field public r0:[Lr5;

.field public s:I

.field public s0:I

.field public t:I

.field public t0:I

.field public u:I

.field public v:[I

.field public w:I

.field public x:I

.field public y:F

.field public z:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lr5;

    const v1, 0x17e

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lr5;->a:Z

    const/4 v1, 0x0

    .line 3
    iput-object v1, p0, Lr5;->d:Lk6;

    .line 4
    iput-object v1, p0, Lr5;->e:Lm6;

    const/4 v2, 0x2

    new-array v3, v2, [Z

    .line 5
    fill-array-data v3, :array_0

    iput-object v3, p0, Lr5;->f:[Z

    const/4 v3, 0x1

    .line 6
    iput-boolean v3, p0, Lr5;->g:Z

    .line 7
    iput-boolean v0, p0, Lr5;->h:Z

    .line 8
    iput-boolean v3, p0, Lr5;->i:Z

    const/4 v4, -0x1

    .line 9
    iput v4, p0, Lr5;->j:I

    .line 10
    iput v4, p0, Lr5;->k:I

    .line 11
    new-instance v5, Lm5;

    invoke-direct {v5, p0}, Lm5;-><init>(Lr5;)V

    .line 12
    iput-boolean v0, p0, Lr5;->m:Z

    .line 13
    iput-boolean v0, p0, Lr5;->n:Z

    .line 14
    iput-boolean v0, p0, Lr5;->o:Z

    .line 15
    iput-boolean v0, p0, Lr5;->p:Z

    .line 16
    iput v4, p0, Lr5;->q:I

    .line 17
    iput v4, p0, Lr5;->r:I

    .line 18
    iput v0, p0, Lr5;->s:I

    .line 19
    iput v0, p0, Lr5;->t:I

    .line 20
    iput v0, p0, Lr5;->u:I

    new-array v5, v2, [I

    .line 21
    iput-object v5, p0, Lr5;->v:[I

    .line 22
    iput v0, p0, Lr5;->w:I

    .line 23
    iput v0, p0, Lr5;->x:I

    const/high16 v5, 0x3f800000    # 1.0f

    .line 24
    iput v5, p0, Lr5;->y:F

    .line 25
    iput v0, p0, Lr5;->z:I

    .line 26
    iput v0, p0, Lr5;->A:I

    .line 27
    iput v5, p0, Lr5;->B:F

    .line 28
    iput v4, p0, Lr5;->C:I

    .line 29
    iput v5, p0, Lr5;->D:F

    new-array v5, v2, [I

    .line 30
    fill-array-data v5, :array_1

    iput-object v5, p0, Lr5;->E:[I

    const/4 v5, 0x0

    .line 31
    iput v5, p0, Lr5;->F:F

    .line 32
    iput-boolean v0, p0, Lr5;->G:Z

    .line 33
    iput-boolean v0, p0, Lr5;->I:Z

    .line 34
    iput v0, p0, Lr5;->J:I

    .line 35
    iput v0, p0, Lr5;->K:I

    .line 36
    new-instance v6, Lq5;

    sget-object v7, Lq5$b;->c:Lq5$b;

    invoke-direct {v6, p0, v7}, Lq5;-><init>(Lr5;Lq5$b;)V

    iput-object v6, p0, Lr5;->L:Lq5;

    .line 37
    new-instance v7, Lq5;

    sget-object v8, Lq5$b;->d:Lq5$b;

    invoke-direct {v7, p0, v8}, Lq5;-><init>(Lr5;Lq5$b;)V

    iput-object v7, p0, Lr5;->M:Lq5;

    .line 38
    new-instance v8, Lq5;

    sget-object v9, Lq5$b;->e:Lq5$b;

    invoke-direct {v8, p0, v9}, Lq5;-><init>(Lr5;Lq5$b;)V

    iput-object v8, p0, Lr5;->N:Lq5;

    .line 39
    new-instance v9, Lq5;

    sget-object v10, Lq5$b;->f:Lq5$b;

    invoke-direct {v9, p0, v10}, Lq5;-><init>(Lr5;Lq5$b;)V

    iput-object v9, p0, Lr5;->O:Lq5;

    .line 40
    new-instance v10, Lq5;

    sget-object v11, Lq5$b;->g:Lq5$b;

    invoke-direct {v10, p0, v11}, Lq5;-><init>(Lr5;Lq5$b;)V

    iput-object v10, p0, Lr5;->P:Lq5;

    .line 41
    new-instance v11, Lq5;

    sget-object v12, Lq5$b;->i:Lq5$b;

    invoke-direct {v11, p0, v12}, Lq5;-><init>(Lr5;Lq5$b;)V

    iput-object v11, p0, Lr5;->Q:Lq5;

    .line 42
    new-instance v11, Lq5;

    sget-object v12, Lq5$b;->j:Lq5$b;

    invoke-direct {v11, p0, v12}, Lq5;-><init>(Lr5;Lq5$b;)V

    iput-object v11, p0, Lr5;->R:Lq5;

    .line 43
    new-instance v11, Lq5;

    sget-object v12, Lq5$b;->h:Lq5$b;

    invoke-direct {v11, p0, v12}, Lq5;-><init>(Lr5;Lq5$b;)V

    iput-object v11, p0, Lr5;->S:Lq5;

    const/4 v12, 0x6

    new-array v12, v12, [Lq5;

    aput-object v6, v12, v0

    aput-object v8, v12, v3

    aput-object v7, v12, v2

    const/4 v6, 0x3

    aput-object v9, v12, v6

    const/4 v6, 0x4

    aput-object v10, v12, v6

    const/4 v6, 0x5

    aput-object v11, v12, v6

    .line 44
    iput-object v12, p0, Lr5;->T:[Lq5;

    .line 45
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lr5;->U:Ljava/util/ArrayList;

    new-array v6, v2, [Z

    .line 46
    iput-object v6, p0, Lr5;->V:[Z

    new-array v6, v2, [Lr5$b;

    .line 47
    sget-object v7, Lr5$b;->b:Lr5$b;

    aput-object v7, v6, v0

    aput-object v7, v6, v3

    iput-object v6, p0, Lr5;->W:[Lr5$b;

    .line 48
    iput-object v1, p0, Lr5;->X:Lr5;

    .line 49
    iput v0, p0, Lr5;->Y:I

    .line 50
    iput v0, p0, Lr5;->Z:I

    .line 51
    iput v5, p0, Lr5;->a0:F

    .line 52
    iput v4, p0, Lr5;->b0:I

    .line 53
    iput v0, p0, Lr5;->c0:I

    .line 54
    iput v0, p0, Lr5;->d0:I

    .line 55
    iput v0, p0, Lr5;->e0:I

    .line 56
    sget v5, Lr5;->u0:F

    iput v5, p0, Lr5;->h0:F

    .line 57
    iput v5, p0, Lr5;->i0:F

    .line 58
    iput v0, p0, Lr5;->k0:I

    .line 59
    iput-object v1, p0, Lr5;->l0:Ljava/lang/String;

    .line 60
    iput-object v1, p0, Lr5;->m0:Ljava/lang/String;

    .line 61
    iput v0, p0, Lr5;->n0:I

    .line 62
    iput v0, p0, Lr5;->o0:I

    new-array v5, v2, [F

    .line 63
    fill-array-data v5, :array_2

    iput-object v5, p0, Lr5;->p0:[F

    new-array v5, v2, [Lr5;

    aput-object v1, v5, v0

    aput-object v1, v5, v3

    .line 64
    iput-object v5, p0, Lr5;->q0:[Lr5;

    new-array v2, v2, [Lr5;

    aput-object v1, v2, v0

    aput-object v1, v2, v3

    .line 65
    iput-object v2, p0, Lr5;->r0:[Lr5;

    .line 66
    iput v4, p0, Lr5;->s0:I

    .line 67
    iput v4, p0, Lr5;->t0:I

    .line 68
    invoke-virtual {p0}, Lr5;->d()V

    return-void

    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    nop

    :array_1
    .array-data 4
        0x7fffffff
        0x7fffffff
    .end array-data

    :array_2
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method


# virtual methods
.method public A()I
    .locals 1

    .line 1
    iget v0, p0, Lr5;->J:I

    return v0
.end method

.method public A0(Ljava/lang/String;)V
    .locals 9

    const/4 v1, 0x0

    if-eqz p1, :cond_8

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_2

    :cond_0
    const/4 v2, -0x1

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x2c

    .line 3
    invoke-virtual {p1, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-lez v4, :cond_3

    add-int/lit8 v7, v3, -0x1

    if-ge v4, v7, :cond_3

    .line 4
    invoke-virtual {p1, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    const v0, 0x3cf7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 5
    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    move v2, v5

    goto :goto_0

    :cond_1
    const v0, 0x3cf8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 6
    invoke-virtual {v7, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v2, v6

    :cond_2
    :goto_0
    add-int/lit8 v5, v4, 0x1

    :cond_3
    const/16 v4, 0x3a

    .line 7
    invoke-virtual {p1, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ltz v4, :cond_5

    sub-int/2addr v3, v6

    if-ge v4, v3, :cond_5

    .line 8
    invoke-virtual {p1, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    add-int/2addr v4, v6

    .line 9
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 10
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_6

    .line 11
    :try_start_0
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    .line 12
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    cmpl-float v4, v3, v1

    if-lez v4, :cond_6

    cmpl-float v4, p1, v1

    if-lez v4, :cond_6

    if-ne v2, v6, :cond_4

    div-float/2addr p1, v3

    .line 13
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    goto :goto_1

    :cond_4
    div-float/2addr v3, p1

    .line 14
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 15
    :cond_5
    invoke-virtual {p1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_6

    .line 17
    :try_start_1
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    :cond_6
    move p1, v1

    :goto_1
    cmpl-float v1, p1, v1

    if-lez v1, :cond_7

    .line 18
    iput p1, p0, Lr5;->a0:F

    .line 19
    iput v2, p0, Lr5;->b0:I

    :cond_7
    return-void

    .line 20
    :cond_8
    :goto_2
    iput v1, p0, Lr5;->a0:F

    return-void
.end method

.method public B()I
    .locals 1

    .line 1
    iget v0, p0, Lr5;->K:I

    return v0
.end method

.method public B0(I)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lr5;->G:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, p0, Lr5;->e0:I

    sub-int v0, p1, v0

    .line 3
    iget v1, p0, Lr5;->Z:I

    add-int/2addr v1, v0

    .line 4
    iput v0, p0, Lr5;->d0:I

    .line 5
    iget-object v2, p0, Lr5;->M:Lq5;

    invoke-virtual {v2, v0}, Lq5;->s(I)V

    .line 6
    iget-object v0, p0, Lr5;->O:Lq5;

    invoke-virtual {v0, v1}, Lq5;->s(I)V

    .line 7
    iget-object v0, p0, Lr5;->P:Lq5;

    invoke-virtual {v0, p1}, Lq5;->s(I)V

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lr5;->n:Z

    return-void
.end method

.method public C(I)I
    .locals 1

    if-nez p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lr5;->U()I

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 2
    invoke-virtual {p0}, Lr5;->v()I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public C0(II)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5;->m:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lr5;->L:Lq5;

    invoke-virtual {v0, p1}, Lq5;->s(I)V

    .line 3
    iget-object v0, p0, Lr5;->N:Lq5;

    invoke-virtual {v0, p2}, Lq5;->s(I)V

    .line 4
    iput p1, p0, Lr5;->c0:I

    sub-int/2addr p2, p1

    .line 5
    iput p2, p0, Lr5;->Y:I

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lr5;->m:Z

    return-void
.end method

.method public D()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr5;->E:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public D0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr5;->L:Lq5;

    invoke-virtual {v0, p1}, Lq5;->s(I)V

    .line 2
    iput p1, p0, Lr5;->c0:I

    return-void
.end method

.method public E()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr5;->E:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public E0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr5;->M:Lq5;

    invoke-virtual {v0, p1}, Lq5;->s(I)V

    .line 2
    iput p1, p0, Lr5;->d0:I

    return-void
.end method

.method public F()I
    .locals 1

    .line 1
    iget v0, p0, Lr5;->g0:I

    return v0
.end method

.method public F0(II)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5;->n:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lr5;->M:Lq5;

    invoke-virtual {v0, p1}, Lq5;->s(I)V

    .line 3
    iget-object v0, p0, Lr5;->O:Lq5;

    invoke-virtual {v0, p2}, Lq5;->s(I)V

    .line 4
    iput p1, p0, Lr5;->d0:I

    sub-int/2addr p2, p1

    .line 5
    iput p2, p0, Lr5;->Z:I

    .line 6
    iget-boolean p2, p0, Lr5;->G:Z

    if-eqz p2, :cond_1

    .line 7
    iget-object p2, p0, Lr5;->P:Lq5;

    iget v0, p0, Lr5;->e0:I

    add-int/2addr p1, v0

    invoke-virtual {p2, p1}, Lq5;->s(I)V

    :cond_1
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lr5;->n:Z

    return-void
.end method

.method public G()I
    .locals 1

    .line 1
    iget v0, p0, Lr5;->f0:I

    return v0
.end method

.method public G0(IIII)V
    .locals 3

    sub-int/2addr p3, p1

    sub-int/2addr p4, p2

    .line 1
    iput p1, p0, Lr5;->c0:I

    .line 2
    iput p2, p0, Lr5;->d0:I

    .line 3
    iget p1, p0, Lr5;->k0:I

    const/4 p2, 0x0

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    .line 4
    iput p2, p0, Lr5;->Y:I

    .line 5
    iput p2, p0, Lr5;->Z:I

    return-void

    .line 6
    :cond_0
    iget-object p1, p0, Lr5;->W:[Lr5$b;

    aget-object v0, p1, p2

    sget-object v1, Lr5$b;->b:Lr5$b;

    if-ne v0, v1, :cond_1

    iget v0, p0, Lr5;->Y:I

    if-ge p3, v0, :cond_1

    move p3, v0

    :cond_1
    const/4 v0, 0x1

    .line 7
    aget-object v2, p1, v0

    if-ne v2, v1, :cond_2

    iget v1, p0, Lr5;->Z:I

    if-ge p4, v1, :cond_2

    move p4, v1

    .line 8
    :cond_2
    iput p3, p0, Lr5;->Y:I

    .line 9
    iput p4, p0, Lr5;->Z:I

    .line 10
    iget v1, p0, Lr5;->g0:I

    if-ge p4, v1, :cond_3

    .line 11
    iput v1, p0, Lr5;->Z:I

    .line 12
    :cond_3
    iget v1, p0, Lr5;->f0:I

    if-ge p3, v1, :cond_4

    .line 13
    iput v1, p0, Lr5;->Y:I

    .line 14
    :cond_4
    iget v1, p0, Lr5;->x:I

    if-lez v1, :cond_5

    aget-object p1, p1, p2

    sget-object p2, Lr5$b;->d:Lr5$b;

    if-ne p1, p2, :cond_5

    .line 15
    iget p1, p0, Lr5;->Y:I

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lr5;->Y:I

    .line 16
    :cond_5
    iget p1, p0, Lr5;->A:I

    if-lez p1, :cond_6

    iget-object p2, p0, Lr5;->W:[Lr5$b;

    aget-object p2, p2, v0

    sget-object v0, Lr5$b;->d:Lr5$b;

    if-ne p2, v0, :cond_6

    .line 17
    iget p2, p0, Lr5;->Z:I

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lr5;->Z:I

    .line 18
    :cond_6
    iget p1, p0, Lr5;->Y:I

    if-eq p3, p1, :cond_7

    .line 19
    iput p1, p0, Lr5;->j:I

    .line 20
    :cond_7
    iget p1, p0, Lr5;->Z:I

    if-eq p4, p1, :cond_8

    .line 21
    iput p1, p0, Lr5;->k:I

    :cond_8
    return-void
.end method

.method public H(I)Lr5;
    .locals 2

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lr5;->N:Lq5;

    iget-object v0, p1, Lq5;->f:Lq5;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lq5;->f:Lq5;

    if-ne v1, p1, :cond_1

    .line 2
    iget-object p1, v0, Lq5;->d:Lr5;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 3
    iget-object p1, p0, Lr5;->O:Lq5;

    iget-object v0, p1, Lq5;->f:Lq5;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lq5;->f:Lq5;

    if-ne v1, p1, :cond_1

    .line 4
    iget-object p1, v0, Lq5;->d:Lr5;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public H0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr5;->G:Z

    return-void
.end method

.method public I()Lr5;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5;->X:Lr5;

    return-object v0
.end method

.method public I0(I)V
    .locals 1

    .line 1
    iput p1, p0, Lr5;->Z:I

    .line 2
    iget v0, p0, Lr5;->g0:I

    if-ge p1, v0, :cond_0

    .line 3
    iput v0, p0, Lr5;->Z:I

    :cond_0
    return-void
.end method

.method public J(I)Lr5;
    .locals 2

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lr5;->L:Lq5;

    iget-object v0, p1, Lq5;->f:Lq5;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lq5;->f:Lq5;

    if-ne v1, p1, :cond_1

    .line 2
    iget-object p1, v0, Lq5;->d:Lr5;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 3
    iget-object p1, p0, Lr5;->M:Lq5;

    iget-object v0, p1, Lq5;->f:Lq5;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lq5;->f:Lq5;

    if-ne v1, p1, :cond_1

    .line 4
    iget-object p1, v0, Lq5;->d:Lr5;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public J0(F)V
    .locals 0

    .line 1
    iput p1, p0, Lr5;->h0:F

    return-void
.end method

.method public K()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lr5;->V()I

    move-result v0

    iget v1, p0, Lr5;->Y:I

    add-int/2addr v0, v1

    return v0
.end method

.method public K0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr5;->n0:I

    return-void
.end method

.method public L(I)Lo6;
    .locals 1

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lr5;->d:Lk6;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 2
    iget-object p1, p0, Lr5;->e:Lm6;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public L0(II)V
    .locals 0

    .line 1
    iput p1, p0, Lr5;->c0:I

    sub-int/2addr p2, p1

    .line 2
    iput p2, p0, Lr5;->Y:I

    .line 3
    iget p1, p0, Lr5;->f0:I

    if-ge p2, p1, :cond_0

    .line 4
    iput p1, p0, Lr5;->Y:I

    :cond_0
    return-void
.end method

.method public M(Ljava/lang/StringBuilder;)V
    .locals 12

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x3cf9

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr5;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x3cfa

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x3cfb

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lr5;->Y:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x3cfc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x3cfd

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lr5;->Z:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x3cfe

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lr5;->c0:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x3cff

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lr5;->d0:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    iget-object v0, p0, Lr5;->L:Lq5;

    const v1, 0x3d00

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0}, Lr5;->O(Ljava/lang/StringBuilder;Ljava/lang/String;Lq5;)V

    .line 11
    iget-object v0, p0, Lr5;->M:Lq5;

    const v1, 0x3d01

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0}, Lr5;->O(Ljava/lang/StringBuilder;Ljava/lang/String;Lq5;)V

    .line 12
    iget-object v0, p0, Lr5;->N:Lq5;

    const v1, 0x3d02

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0}, Lr5;->O(Ljava/lang/StringBuilder;Ljava/lang/String;Lq5;)V

    .line 13
    iget-object v0, p0, Lr5;->O:Lq5;

    const v1, 0x3d03

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0}, Lr5;->O(Ljava/lang/StringBuilder;Ljava/lang/String;Lq5;)V

    .line 14
    iget-object v0, p0, Lr5;->P:Lq5;

    const v1, 0x3d04

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0}, Lr5;->O(Ljava/lang/StringBuilder;Ljava/lang/String;Lq5;)V

    .line 15
    iget-object v0, p0, Lr5;->Q:Lq5;

    const v1, 0x3d05

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0}, Lr5;->O(Ljava/lang/StringBuilder;Ljava/lang/String;Lq5;)V

    .line 16
    iget-object v0, p0, Lr5;->R:Lq5;

    const v1, 0x3d06

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0}, Lr5;->O(Ljava/lang/StringBuilder;Ljava/lang/String;Lq5;)V

    .line 17
    iget v3, p0, Lr5;->Y:I

    iget v4, p0, Lr5;->f0:I

    iget-object v0, p0, Lr5;->E:[I

    const/4 v11, 0x0

    aget v5, v0, v11

    iget v6, p0, Lr5;->j:I

    iget v7, p0, Lr5;->w:I

    iget v8, p0, Lr5;->t:I

    iget v9, p0, Lr5;->y:F

    iget-object v0, p0, Lr5;->p0:[F

    aget v10, v0, v11

    const v2, 0x3d07

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v10}, Lr5;->N(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIIFF)V

    .line 18
    iget v3, p0, Lr5;->Z:I

    iget v4, p0, Lr5;->g0:I

    iget-object v0, p0, Lr5;->E:[I

    const/4 v1, 0x1

    aget v5, v0, v1

    iget v6, p0, Lr5;->k:I

    iget v7, p0, Lr5;->z:I

    iget v8, p0, Lr5;->u:I

    iget v9, p0, Lr5;->B:F

    iget-object v0, p0, Lr5;->p0:[F

    aget v10, v0, v1

    const v2, 0x3d08

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v10}, Lr5;->N(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIIFF)V

    .line 19
    iget v0, p0, Lr5;->a0:F

    iget v1, p0, Lr5;->b0:I

    const v2, 0x3d09

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1, v2, v0, v1}, Lr5;->w0(Ljava/lang/StringBuilder;Ljava/lang/String;FI)V

    .line 20
    iget v0, p0, Lr5;->h0:F

    sget v1, Lr5;->u0:F

    const v2, 0x3d0a

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1, v2, v0, v1}, Lr5;->u0(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    .line 21
    iget v0, p0, Lr5;->i0:F

    sget v1, Lr5;->u0:F

    const v2, 0x3d0b

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1, v2, v0, v1}, Lr5;->u0(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    .line 22
    iget v0, p0, Lr5;->n0:I

    const v1, 0x3d0c

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0, v11}, Lr5;->v0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    .line 23
    iget v0, p0, Lr5;->o0:I

    const v1, 0x3d0d

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0, v11}, Lr5;->v0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const v0, 0x3d0e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public M0(Lr5$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr5;->W:[Lr5$b;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return-void
.end method

.method public final N(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIIFF)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const p2, 0x3d0f

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const p2, 0x3d10

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    const/4 p6, 0x0

    .line 3
    invoke-virtual {p0, p1, p2, p3, p6}, Lr5;->v0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const p2, 0x3d11

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p0, p1, p2, p4, p6}, Lr5;->v0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const p2, 0x3d12

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    const p3, 0x7fffffff

    .line 5
    invoke-virtual {p0, p1, p2, p5, p3}, Lr5;->v0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const p2, 0x3d13

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 6
    invoke-virtual {p0, p1, p2, p7, p6}, Lr5;->v0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const p2, 0x3d14

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 7
    invoke-virtual {p0, p1, p2, p8, p6}, Lr5;->v0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const p2, 0x3d15

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    const/high16 p3, 0x3f800000    # 1.0f

    .line 8
    invoke-virtual {p0, p1, p2, p9, p3}, Lr5;->u0(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    const p2, 0x3d16

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 9
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public N0(IIIF)V
    .locals 0

    .line 1
    iput p1, p0, Lr5;->t:I

    .line 2
    iput p2, p0, Lr5;->w:I

    const p2, 0x7fffffff

    if-ne p3, p2, :cond_0

    const/4 p3, 0x0

    .line 3
    :cond_0
    iput p3, p0, Lr5;->x:I

    .line 4
    iput p4, p0, Lr5;->y:F

    const/4 p2, 0x0

    cmpl-float p2, p4, p2

    if-lez p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p2, p4, p2

    if-gez p2, :cond_1

    if-nez p1, :cond_1

    const/4 p1, 0x2

    .line 5
    iput p1, p0, Lr5;->t:I

    :cond_1
    return-void
.end method

.method public final O(Ljava/lang/StringBuilder;Ljava/lang/String;Lq5;)V
    .locals 2

    .line 1
    iget-object v0, p3, Lq5;->f:Lq5;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const v0, 0x3d17

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const p2, 0x3d18

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    iget-object p2, p3, Lq5;->f:Lq5;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const p2, 0x3d19

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 6
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    iget p2, p3, Lq5;->h:I

    const/high16 v0, -0x80000000

    if-ne p2, v0, :cond_1

    iget p2, p3, Lq5;->g:I

    if-eqz p2, :cond_2

    :cond_1
    const p2, 0x3d1a

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 8
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    iget v1, p3, Lq5;->g:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 10
    iget v1, p3, Lq5;->h:I

    if-eq v1, v0, :cond_2

    .line 11
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    iget p3, p3, Lq5;->h:I

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const p2, 0x3d1b

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 14
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public O0(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr5;->p0:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    return-void
.end method

.method public P()F
    .locals 1

    .line 1
    iget v0, p0, Lr5;->i0:F

    return v0
.end method

.method public P0(IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr5;->V:[Z

    aput-boolean p2, v0, p1

    return-void
.end method

.method public Q()I
    .locals 1

    .line 1
    iget v0, p0, Lr5;->o0:I

    return v0
.end method

.method public Q0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr5;->H:Z

    return-void
.end method

.method public R()Lr5$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lr5;->W:[Lr5$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public R0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr5;->I:Z

    return-void
.end method

.method public S()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr5;->L:Lq5;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lr5;->M:Lq5;

    iget v0, v0, Lq5;->g:I

    add-int/2addr v1, v0

    .line 3
    :cond_0
    iget-object v0, p0, Lr5;->N:Lq5;

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lr5;->O:Lq5;

    iget v0, v0, Lq5;->g:I

    add-int/2addr v1, v0

    :cond_1
    return v1
.end method

.method public S0(II)V
    .locals 0

    .line 1
    iput p1, p0, Lr5;->J:I

    .line 2
    iput p2, p0, Lr5;->K:I

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Lr5;->V0(Z)V

    return-void
.end method

.method public T()I
    .locals 1

    .line 1
    iget v0, p0, Lr5;->k0:I

    return v0
.end method

.method public T0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr5;->E:[I

    const/4 v1, 0x1

    aput p1, v0, v1

    return-void
.end method

.method public U()I
    .locals 2

    .line 1
    iget v0, p0, Lr5;->k0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget v0, p0, Lr5;->Y:I

    return v0
.end method

.method public U0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr5;->E:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    return-void
.end method

.method public V()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr5;->X:Lr5;

    if-eqz v0, :cond_0

    instance-of v1, v0, Ls5;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Ls5;

    iget v0, v0, Ls5;->D0:I

    iget v1, p0, Lr5;->c0:I

    add-int/2addr v0, v1

    return v0

    .line 3
    :cond_0
    iget v0, p0, Lr5;->c0:I

    return v0
.end method

.method public V0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr5;->g:Z

    return-void
.end method

.method public W()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr5;->X:Lr5;

    if-eqz v0, :cond_0

    instance-of v1, v0, Ls5;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Ls5;

    iget v0, v0, Ls5;->E0:I

    iget v1, p0, Lr5;->d0:I

    add-int/2addr v0, v1

    return v0

    .line 3
    :cond_0
    iget v0, p0, Lr5;->d0:I

    return v0
.end method

.method public W0(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    .line 1
    iput p1, p0, Lr5;->g0:I

    goto :goto_0

    .line 2
    :cond_0
    iput p1, p0, Lr5;->g0:I

    :goto_0
    return-void
.end method

.method public X()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5;->G:Z

    return v0
.end method

.method public X0(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    .line 1
    iput p1, p0, Lr5;->f0:I

    goto :goto_0

    .line 2
    :cond_0
    iput p1, p0, Lr5;->f0:I

    :goto_0
    return-void
.end method

.method public Y(I)Z
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_3

    .line 1
    iget-object p1, p0, Lr5;->L:Lq5;

    iget-object p1, p1, Lq5;->f:Lq5;

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    iget-object v3, p0, Lr5;->N:Lq5;

    iget-object v3, v3, Lq5;->f:Lq5;

    if-eqz v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    add-int/2addr p1, v3

    if-ge p1, v0, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    return v1

    .line 2
    :cond_3
    iget-object p1, p0, Lr5;->M:Lq5;

    iget-object p1, p1, Lq5;->f:Lq5;

    if-eqz p1, :cond_4

    move p1, v1

    goto :goto_3

    :cond_4
    move p1, v2

    :goto_3
    iget-object v3, p0, Lr5;->O:Lq5;

    iget-object v3, v3, Lq5;->f:Lq5;

    if-eqz v3, :cond_5

    move v3, v1

    goto :goto_4

    :cond_5
    move v3, v2

    :goto_4
    add-int/2addr p1, v3

    iget-object v3, p0, Lr5;->P:Lq5;

    iget-object v3, v3, Lq5;->f:Lq5;

    if-eqz v3, :cond_6

    move v3, v1

    goto :goto_5

    :cond_6
    move v3, v2

    :goto_5
    add-int/2addr p1, v3

    if-ge p1, v0, :cond_7

    goto :goto_6

    :cond_7
    move v1, v2

    :goto_6
    return v1
.end method

.method public Y0(II)V
    .locals 0

    .line 1
    iput p1, p0, Lr5;->c0:I

    .line 2
    iput p2, p0, Lr5;->d0:I

    return-void
.end method

.method public Z()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lr5;->U:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    .line 2
    iget-object v3, p0, Lr5;->U:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq5;

    .line 3
    invoke-virtual {v3}, Lq5;->l()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public Z0(Lr5;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr5;->X:Lr5;

    return-void
.end method

.method public a0()Z
    .locals 2

    .line 1
    iget v0, p0, Lr5;->j:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lr5;->k:I

    if-eq v0, v1, :cond_0

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

.method public a1(F)V
    .locals 0

    .line 1
    iput p1, p0, Lr5;->i0:F

    return-void
.end method

.method public b0(II)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    .line 1
    iget-object p1, p0, Lr5;->L:Lq5;

    iget-object p1, p1, Lq5;->f:Lq5;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lq5;->m()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lr5;->N:Lq5;

    iget-object p1, p1, Lq5;->f:Lq5;

    if-eqz p1, :cond_3

    .line 2
    invoke-virtual {p1}, Lq5;->m()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 3
    iget-object p1, p0, Lr5;->N:Lq5;

    iget-object p1, p1, Lq5;->f:Lq5;

    invoke-virtual {p1}, Lq5;->d()I

    move-result p1

    iget-object v2, p0, Lr5;->N:Lq5;

    invoke-virtual {v2}, Lq5;->e()I

    move-result v2

    sub-int/2addr p1, v2

    iget-object v2, p0, Lr5;->L:Lq5;

    iget-object v2, v2, Lq5;->f:Lq5;

    .line 4
    invoke-virtual {v2}, Lq5;->d()I

    move-result v2

    iget-object v3, p0, Lr5;->L:Lq5;

    invoke-virtual {v3}, Lq5;->e()I

    move-result v3

    add-int/2addr v2, v3

    sub-int/2addr p1, v2

    if-lt p1, p2, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    return v0

    .line 5
    :cond_1
    iget-object p1, p0, Lr5;->M:Lq5;

    iget-object p1, p1, Lq5;->f:Lq5;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lq5;->m()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lr5;->O:Lq5;

    iget-object p1, p1, Lq5;->f:Lq5;

    if-eqz p1, :cond_3

    .line 6
    invoke-virtual {p1}, Lq5;->m()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 7
    iget-object p1, p0, Lr5;->O:Lq5;

    iget-object p1, p1, Lq5;->f:Lq5;

    invoke-virtual {p1}, Lq5;->d()I

    move-result p1

    iget-object v2, p0, Lr5;->O:Lq5;

    invoke-virtual {v2}, Lq5;->e()I

    move-result v2

    sub-int/2addr p1, v2

    iget-object v2, p0, Lr5;->M:Lq5;

    iget-object v2, v2, Lq5;->f:Lq5;

    .line 8
    invoke-virtual {v2}, Lq5;->d()I

    move-result v2

    iget-object v3, p0, Lr5;->M:Lq5;

    invoke-virtual {v3}, Lq5;->e()I

    move-result v3

    add-int/2addr v2, v3

    sub-int/2addr p1, v2

    if-lt p1, p2, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    return v0

    :cond_3
    return v1
.end method

.method public b1(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr5;->o0:I

    return-void
.end method

.method public c0(Lq5$b;Lr5;Lq5$b;II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lr5;->m(Lq5$b;)Lq5;

    move-result-object p1

    .line 2
    invoke-virtual {p2, p3}, Lr5;->m(Lq5$b;)Lq5;

    move-result-object p2

    const/4 p3, 0x1

    .line 3
    invoke-virtual {p1, p2, p4, p5, p3}, Lq5;->a(Lq5;IIZ)Z

    return-void
.end method

.method public c1(II)V
    .locals 0

    .line 1
    iput p1, p0, Lr5;->d0:I

    sub-int/2addr p2, p1

    .line 2
    iput p2, p0, Lr5;->Z:I

    .line 3
    iget p1, p0, Lr5;->g0:I

    if-ge p2, p1, :cond_0

    .line 4
    iput p1, p0, Lr5;->Z:I

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr5;->U:Ljava/util/ArrayList;

    iget-object v1, p0, Lr5;->L:Lq5;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2
    iget-object v0, p0, Lr5;->U:Ljava/util/ArrayList;

    iget-object v1, p0, Lr5;->M:Lq5;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object v0, p0, Lr5;->U:Ljava/util/ArrayList;

    iget-object v1, p0, Lr5;->N:Lq5;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Lr5;->U:Ljava/util/ArrayList;

    iget-object v1, p0, Lr5;->O:Lq5;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object v0, p0, Lr5;->U:Ljava/util/ArrayList;

    iget-object v1, p0, Lr5;->Q:Lq5;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object v0, p0, Lr5;->U:Ljava/util/ArrayList;

    iget-object v1, p0, Lr5;->R:Lq5;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    iget-object v0, p0, Lr5;->U:Ljava/util/ArrayList;

    iget-object v1, p0, Lr5;->S:Lq5;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object v0, p0, Lr5;->U:Ljava/util/ArrayList;

    iget-object v1, p0, Lr5;->P:Lq5;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final d0(I)Z
    .locals 4

    mul-int/lit8 p1, p1, 0x2

    .line 1
    iget-object v0, p0, Lr5;->T:[Lq5;

    aget-object v1, v0, p1

    iget-object v1, v1, Lq5;->f:Lq5;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    aget-object v1, v0, p1

    iget-object v1, v1, Lq5;->f:Lq5;

    iget-object v1, v1, Lq5;->f:Lq5;

    aget-object v3, v0, p1

    if-eq v1, v3, :cond_0

    add-int/2addr p1, v2

    aget-object v1, v0, p1

    iget-object v1, v1, Lq5;->f:Lq5;

    if-eqz v1, :cond_0

    aget-object v1, v0, p1

    iget-object v1, v1, Lq5;->f:Lq5;

    iget-object v1, v1, Lq5;->f:Lq5;

    aget-object p1, v0, p1

    if-ne v1, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public d1(Lr5$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr5;->W:[Lr5$b;

    const/4 v1, 0x1

    aput-object p1, v0, v1

    return-void
.end method

.method public e(Ls5;Lz4;Ljava/util/HashSet;IZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls5;",
            "Lz4;",
            "Ljava/util/HashSet<",
            "Lr5;",
            ">;IZ)V"
        }
    .end annotation

    if-eqz p5, :cond_1

    .line 1
    invoke-virtual {p3, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p5

    if-nez p5, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {p1, p2, p0}, Lw5;->a(Ls5;Lz4;Lr5;)V

    .line 3
    invoke-virtual {p3, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    const/16 p5, 0x40

    .line 4
    invoke-virtual {p1, p5}, Ls5;->P1(I)Z

    move-result p5

    invoke-virtual {p0, p2, p5}, Lr5;->g(Lz4;Z)V

    :cond_1
    if-nez p4, :cond_3

    .line 5
    iget-object p5, p0, Lr5;->L:Lq5;

    invoke-virtual {p5}, Lq5;->c()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_2

    .line 6
    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_0
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq5;

    .line 7
    iget-object v1, v0, Lq5;->d:Lr5;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Lr5;->e(Ls5;Lz4;Ljava/util/HashSet;IZ)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object p5, p0, Lr5;->N:Lq5;

    invoke-virtual {p5}, Lq5;->c()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_6

    .line 9
    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_1
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq5;

    .line 10
    iget-object v1, v0, Lq5;->d:Lr5;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Lr5;->e(Ls5;Lz4;Ljava/util/HashSet;IZ)V

    goto :goto_1

    .line 11
    :cond_3
    iget-object p5, p0, Lr5;->M:Lq5;

    invoke-virtual {p5}, Lq5;->c()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_4

    .line 12
    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_2
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq5;

    .line 13
    iget-object v1, v0, Lq5;->d:Lr5;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Lr5;->e(Ls5;Lz4;Ljava/util/HashSet;IZ)V

    goto :goto_2

    .line 14
    :cond_4
    iget-object p5, p0, Lr5;->O:Lq5;

    invoke-virtual {p5}, Lq5;->c()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_5

    .line 15
    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_3
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq5;

    .line 16
    iget-object v1, v0, Lq5;->d:Lr5;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Lr5;->e(Ls5;Lz4;Ljava/util/HashSet;IZ)V

    goto :goto_3

    .line 17
    :cond_5
    iget-object p5, p0, Lr5;->P:Lq5;

    invoke-virtual {p5}, Lq5;->c()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_6

    .line 18
    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_4
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq5;

    .line 19
    iget-object v1, v0, Lq5;->d:Lr5;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Lr5;->e(Ls5;Lz4;Ljava/util/HashSet;IZ)V

    goto :goto_4

    :cond_6
    return-void
.end method

.method public e0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5;->o:Z

    return v0
.end method

.method public e1(IIIF)V
    .locals 0

    .line 1
    iput p1, p0, Lr5;->u:I

    .line 2
    iput p2, p0, Lr5;->z:I

    const p2, 0x7fffffff

    if-ne p3, p2, :cond_0

    const/4 p3, 0x0

    .line 3
    :cond_0
    iput p3, p0, Lr5;->A:I

    .line 4
    iput p4, p0, Lr5;->B:F

    const/4 p2, 0x0

    cmpl-float p2, p4, p2

    if-lez p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p2, p4, p2

    if-gez p2, :cond_1

    if-nez p1, :cond_1

    const/4 p1, 0x2

    .line 5
    iput p1, p0, Lr5;->u:I

    :cond_1
    return-void
.end method

.method public f()Z
    .locals 1

    .line 1
    instance-of v0, p0, Lx5;

    if-nez v0, :cond_1

    instance-of v0, p0, Lt5;

    if-eqz v0, :cond_0

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

.method public f0(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lr5;->V:[Z

    aget-boolean p1, v0, p1

    return p1
.end method

.method public f1(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr5;->p0:[F

    const/4 v1, 0x1

    aput p1, v0, v1

    return-void
.end method

.method public g(Lz4;Z)V
    .locals 53

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    .line 1
    iget-object v0, v15, Lr5;->L:Lq5;

    invoke-virtual {v14, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v13

    .line 2
    iget-object v0, v15, Lr5;->N:Lq5;

    invoke-virtual {v14, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v12

    .line 3
    iget-object v0, v15, Lr5;->M:Lq5;

    invoke-virtual {v14, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v11

    .line 4
    iget-object v0, v15, Lr5;->O:Lq5;

    invoke-virtual {v14, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v10

    .line 5
    iget-object v0, v15, Lr5;->P:Lq5;

    invoke-virtual {v14, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v9

    .line 6
    iget-object v0, v15, Lr5;->X:Lr5;

    const/4 v8, 0x2

    const/4 v1, 0x3

    const/4 v7, 0x1

    const/4 v6, 0x0

    if-eqz v0, :cond_4

    if-eqz v0, :cond_0

    .line 7
    iget-object v2, v0, Lr5;->W:[Lr5$b;

    aget-object v2, v2, v6

    sget-object v3, Lr5$b;->c:Lr5$b;

    if-ne v2, v3, :cond_0

    move v2, v7

    goto :goto_0

    :cond_0
    move v2, v6

    :goto_0
    if-eqz v0, :cond_1

    .line 8
    iget-object v0, v0, Lr5;->W:[Lr5$b;

    aget-object v0, v0, v7

    sget-object v3, Lr5$b;->c:Lr5$b;

    if-ne v0, v3, :cond_1

    move v0, v7

    goto :goto_1

    :cond_1
    move v0, v6

    .line 9
    :goto_1
    iget v3, v15, Lr5;->s:I

    if-eq v3, v7, :cond_3

    if-eq v3, v8, :cond_2

    if-eq v3, v1, :cond_4

    move v5, v0

    move v4, v2

    goto :goto_2

    :cond_2
    move v5, v0

    move v4, v6

    goto :goto_2

    :cond_3
    move v4, v2

    move v5, v6

    goto :goto_2

    :cond_4
    move v4, v6

    move v5, v4

    .line 10
    :goto_2
    iget v0, v15, Lr5;->k0:I

    const/16 v3, 0x8

    if-ne v0, v3, :cond_5

    invoke-virtual/range {p0 .. p0}, Lr5;->Z()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, v15, Lr5;->V:[Z

    aget-boolean v2, v0, v6

    if-nez v2, :cond_5

    aget-boolean v0, v0, v7

    if-nez v0, :cond_5

    return-void

    .line 11
    :cond_5
    iget-boolean v0, v15, Lr5;->m:Z

    const/4 v2, 0x5

    if-nez v0, :cond_6

    iget-boolean v8, v15, Lr5;->n:Z

    if-eqz v8, :cond_c

    :cond_6
    if-eqz v0, :cond_8

    .line 12
    iget v0, v15, Lr5;->c0:I

    invoke-virtual {v14, v13, v0}, Lz4;->f(Le5;I)V

    .line 13
    iget v0, v15, Lr5;->c0:I

    iget v8, v15, Lr5;->Y:I

    add-int/2addr v0, v8

    invoke-virtual {v14, v12, v0}, Lz4;->f(Le5;I)V

    if-eqz v4, :cond_8

    .line 14
    iget-object v0, v15, Lr5;->X:Lr5;

    if-eqz v0, :cond_8

    .line 15
    iget-boolean v8, v15, Lr5;->i:Z

    if-eqz v8, :cond_7

    .line 16
    check-cast v0, Ls5;

    .line 17
    iget-object v8, v15, Lr5;->L:Lq5;

    invoke-virtual {v0, v8}, Ls5;->w1(Lq5;)V

    .line 18
    iget-object v8, v15, Lr5;->N:Lq5;

    invoke-virtual {v0, v8}, Ls5;->v1(Lq5;)V

    goto :goto_3

    .line 19
    :cond_7
    iget-object v0, v0, Lr5;->N:Lq5;

    invoke-virtual {v14, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    invoke-virtual {v14, v0, v12, v6, v2}, Lz4;->h(Le5;Le5;II)V

    .line 20
    :cond_8
    :goto_3
    iget-boolean v0, v15, Lr5;->n:Z

    if-eqz v0, :cond_b

    .line 21
    iget v0, v15, Lr5;->d0:I

    invoke-virtual {v14, v11, v0}, Lz4;->f(Le5;I)V

    .line 22
    iget v0, v15, Lr5;->d0:I

    iget v8, v15, Lr5;->Z:I

    add-int/2addr v0, v8

    invoke-virtual {v14, v10, v0}, Lz4;->f(Le5;I)V

    .line 23
    iget-object v0, v15, Lr5;->P:Lq5;

    invoke-virtual {v0}, Lq5;->l()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 24
    iget v0, v15, Lr5;->d0:I

    iget v8, v15, Lr5;->e0:I

    add-int/2addr v0, v8

    invoke-virtual {v14, v9, v0}, Lz4;->f(Le5;I)V

    :cond_9
    if-eqz v5, :cond_b

    .line 25
    iget-object v0, v15, Lr5;->X:Lr5;

    if-eqz v0, :cond_b

    .line 26
    iget-boolean v8, v15, Lr5;->i:Z

    if-eqz v8, :cond_a

    .line 27
    check-cast v0, Ls5;

    .line 28
    iget-object v8, v15, Lr5;->M:Lq5;

    invoke-virtual {v0, v8}, Ls5;->B1(Lq5;)V

    .line 29
    iget-object v8, v15, Lr5;->O:Lq5;

    invoke-virtual {v0, v8}, Ls5;->A1(Lq5;)V

    goto :goto_4

    .line 30
    :cond_a
    iget-object v0, v0, Lr5;->O:Lq5;

    invoke-virtual {v14, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    invoke-virtual {v14, v0, v10, v6, v2}, Lz4;->h(Le5;Le5;II)V

    .line 31
    :cond_b
    :goto_4
    iget-boolean v0, v15, Lr5;->m:Z

    if-eqz v0, :cond_c

    iget-boolean v0, v15, Lr5;->n:Z

    if-eqz v0, :cond_c

    .line 32
    iput-boolean v6, v15, Lr5;->m:Z

    .line 33
    iput-boolean v6, v15, Lr5;->n:Z

    return-void

    .line 34
    :cond_c
    sget-object v0, Lz4;->x:La5;

    const-wide/16 v17, 0x1

    if-eqz v0, :cond_d

    .line 35
    iget-wide v1, v0, La5;->y:J

    add-long v1, v1, v17

    iput-wide v1, v0, La5;->y:J

    :cond_d
    if-eqz p2, :cond_11

    .line 36
    iget-object v1, v15, Lr5;->d:Lk6;

    if-eqz v1, :cond_11

    iget-object v2, v15, Lr5;->e:Lm6;

    if-eqz v2, :cond_11

    iget-object v8, v1, Lo6;->h:Le6;

    iget-boolean v7, v8, Le6;->j:Z

    if-eqz v7, :cond_11

    iget-object v1, v1, Lo6;->i:Le6;

    iget-boolean v1, v1, Le6;->j:Z

    if-eqz v1, :cond_11

    iget-object v1, v2, Lo6;->h:Le6;

    iget-boolean v1, v1, Le6;->j:Z

    if-eqz v1, :cond_11

    iget-object v1, v2, Lo6;->i:Le6;

    iget-boolean v1, v1, Le6;->j:Z

    if-eqz v1, :cond_11

    if-eqz v0, :cond_e

    .line 37
    iget-wide v1, v0, La5;->r:J

    add-long v1, v1, v17

    iput-wide v1, v0, La5;->r:J

    .line 38
    :cond_e
    iget v0, v8, Le6;->g:I

    invoke-virtual {v14, v13, v0}, Lz4;->f(Le5;I)V

    .line 39
    iget-object v0, v15, Lr5;->d:Lk6;

    iget-object v0, v0, Lo6;->i:Le6;

    iget v0, v0, Le6;->g:I

    invoke-virtual {v14, v12, v0}, Lz4;->f(Le5;I)V

    .line 40
    iget-object v0, v15, Lr5;->e:Lm6;

    iget-object v0, v0, Lo6;->h:Le6;

    iget v0, v0, Le6;->g:I

    invoke-virtual {v14, v11, v0}, Lz4;->f(Le5;I)V

    .line 41
    iget-object v0, v15, Lr5;->e:Lm6;

    iget-object v0, v0, Lo6;->i:Le6;

    iget v0, v0, Le6;->g:I

    invoke-virtual {v14, v10, v0}, Lz4;->f(Le5;I)V

    .line 42
    iget-object v0, v15, Lr5;->e:Lm6;

    iget-object v0, v0, Lm6;->k:Le6;

    iget v0, v0, Le6;->g:I

    invoke-virtual {v14, v9, v0}, Lz4;->f(Le5;I)V

    .line 43
    iget-object v0, v15, Lr5;->X:Lr5;

    if-eqz v0, :cond_10

    if-eqz v4, :cond_f

    .line 44
    iget-object v0, v15, Lr5;->f:[Z

    aget-boolean v0, v0, v6

    if-eqz v0, :cond_f

    invoke-virtual/range {p0 .. p0}, Lr5;->g0()Z

    move-result v0

    if-nez v0, :cond_f

    .line 45
    iget-object v0, v15, Lr5;->X:Lr5;

    iget-object v0, v0, Lr5;->N:Lq5;

    invoke-virtual {v14, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    .line 46
    invoke-virtual {v14, v0, v12, v6, v3}, Lz4;->h(Le5;Le5;II)V

    :cond_f
    if-eqz v5, :cond_10

    .line 47
    iget-object v0, v15, Lr5;->f:[Z

    const/4 v1, 0x1

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_10

    invoke-virtual/range {p0 .. p0}, Lr5;->i0()Z

    move-result v0

    if-nez v0, :cond_10

    .line 48
    iget-object v0, v15, Lr5;->X:Lr5;

    iget-object v0, v0, Lr5;->O:Lq5;

    invoke-virtual {v14, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    .line 49
    invoke-virtual {v14, v0, v10, v6, v3}, Lz4;->h(Le5;Le5;II)V

    .line 50
    :cond_10
    iput-boolean v6, v15, Lr5;->m:Z

    .line 51
    iput-boolean v6, v15, Lr5;->n:Z

    return-void

    :cond_11
    if-eqz v0, :cond_12

    .line 52
    iget-wide v1, v0, La5;->s:J

    add-long v1, v1, v17

    iput-wide v1, v0, La5;->s:J

    .line 53
    :cond_12
    iget-object v0, v15, Lr5;->X:Lr5;

    if-eqz v0, :cond_17

    .line 54
    invoke-virtual {v15, v6}, Lr5;->d0(I)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 55
    iget-object v0, v15, Lr5;->X:Lr5;

    check-cast v0, Ls5;

    invoke-virtual {v0, v15, v6}, Ls5;->s1(Lr5;I)V

    const/4 v0, 0x1

    goto :goto_5

    .line 56
    :cond_13
    invoke-virtual/range {p0 .. p0}, Lr5;->g0()Z

    move-result v0

    :goto_5
    const/4 v1, 0x1

    .line 57
    invoke-virtual {v15, v1}, Lr5;->d0(I)Z

    move-result v2

    if-eqz v2, :cond_14

    .line 58
    iget-object v2, v15, Lr5;->X:Lr5;

    check-cast v2, Ls5;

    invoke-virtual {v2, v15, v1}, Ls5;->s1(Lr5;I)V

    const/4 v1, 0x1

    goto :goto_6

    .line 59
    :cond_14
    invoke-virtual/range {p0 .. p0}, Lr5;->i0()Z

    move-result v1

    :goto_6
    if-nez v0, :cond_15

    if-eqz v4, :cond_15

    .line 60
    iget v2, v15, Lr5;->k0:I

    if-eq v2, v3, :cond_15

    iget-object v2, v15, Lr5;->L:Lq5;

    iget-object v2, v2, Lq5;->f:Lq5;

    if-nez v2, :cond_15

    iget-object v2, v15, Lr5;->N:Lq5;

    iget-object v2, v2, Lq5;->f:Lq5;

    if-nez v2, :cond_15

    .line 61
    iget-object v2, v15, Lr5;->X:Lr5;

    iget-object v2, v2, Lr5;->N:Lq5;

    invoke-virtual {v14, v2}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v2

    const/4 v7, 0x1

    .line 62
    invoke-virtual {v14, v2, v12, v6, v7}, Lz4;->h(Le5;Le5;II)V

    :cond_15
    if-nez v1, :cond_16

    if-eqz v5, :cond_16

    .line 63
    iget v2, v15, Lr5;->k0:I

    if-eq v2, v3, :cond_16

    iget-object v2, v15, Lr5;->M:Lq5;

    iget-object v2, v2, Lq5;->f:Lq5;

    if-nez v2, :cond_16

    iget-object v2, v15, Lr5;->O:Lq5;

    iget-object v2, v2, Lq5;->f:Lq5;

    if-nez v2, :cond_16

    iget-object v2, v15, Lr5;->P:Lq5;

    if-nez v2, :cond_16

    .line 64
    iget-object v2, v15, Lr5;->X:Lr5;

    iget-object v2, v2, Lr5;->O:Lq5;

    invoke-virtual {v14, v2}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v2

    const/4 v7, 0x1

    .line 65
    invoke-virtual {v14, v2, v10, v6, v7}, Lz4;->h(Le5;Le5;II)V

    :cond_16
    move/from16 v29, v0

    move/from16 v28, v1

    goto :goto_7

    :cond_17
    move/from16 v28, v6

    move/from16 v29, v28

    .line 66
    :goto_7
    iget v0, v15, Lr5;->Y:I

    .line 67
    iget v1, v15, Lr5;->f0:I

    if-ge v0, v1, :cond_18

    goto :goto_8

    :cond_18
    move v1, v0

    .line 68
    :goto_8
    iget v2, v15, Lr5;->Z:I

    .line 69
    iget v7, v15, Lr5;->g0:I

    if-ge v2, v7, :cond_19

    goto :goto_9

    :cond_19
    move v7, v2

    .line 70
    :goto_9
    iget-object v8, v15, Lr5;->W:[Lr5$b;

    aget-object v3, v8, v6

    sget-object v6, Lr5$b;->d:Lr5$b;

    move/from16 v22, v1

    if-eq v3, v6, :cond_1a

    const/4 v3, 0x1

    goto :goto_a

    :cond_1a
    const/4 v3, 0x0

    :goto_a
    const/16 v21, 0x1

    .line 71
    aget-object v1, v8, v21

    move/from16 v23, v7

    if-eq v1, v6, :cond_1b

    const/4 v1, 0x1

    goto :goto_b

    :cond_1b
    const/4 v1, 0x0

    .line 72
    :goto_b
    iget v7, v15, Lr5;->b0:I

    iput v7, v15, Lr5;->C:I

    move-object/from16 v27, v9

    .line 73
    iget v9, v15, Lr5;->a0:F

    iput v9, v15, Lr5;->D:F

    move-object/from16 v30, v10

    .line 74
    iget v10, v15, Lr5;->t:I

    move-object/from16 v31, v11

    .line 75
    iget v11, v15, Lr5;->u:I

    const/16 v24, 0x0

    cmpl-float v24, v9, v24

    const/16 v25, 0x4

    move-object/from16 v32, v12

    if-lez v24, :cond_25

    .line 76
    iget v12, v15, Lr5;->k0:I

    move-object/from16 v33, v13

    const/16 v13, 0x8

    if-eq v12, v13, :cond_26

    const/4 v12, 0x0

    .line 77
    aget-object v13, v8, v12

    if-ne v13, v6, :cond_1c

    if-nez v10, :cond_1c

    const/4 v10, 0x3

    :cond_1c
    const/4 v12, 0x1

    .line 78
    aget-object v13, v8, v12

    if-ne v13, v6, :cond_1d

    if-nez v11, :cond_1d

    const/4 v11, 0x3

    :cond_1d
    const/4 v13, 0x0

    .line 79
    aget-object v14, v8, v13

    if-ne v14, v6, :cond_1e

    aget-object v13, v8, v12

    if-ne v13, v6, :cond_1e

    const/4 v12, 0x3

    if-ne v10, v12, :cond_1f

    if-ne v11, v12, :cond_1f

    .line 80
    invoke-virtual {v15, v4, v5, v3, v1}, Lr5;->l1(ZZZZ)V

    goto :goto_c

    :cond_1e
    const/4 v12, 0x3

    :cond_1f
    const/4 v1, 0x0

    .line 81
    aget-object v3, v8, v1

    if-ne v3, v6, :cond_21

    if-ne v10, v12, :cond_21

    move-object v3, v8

    .line 82
    iput v1, v15, Lr5;->C:I

    int-to-float v0, v2

    mul-float/2addr v9, v0

    float-to-int v1, v9

    const/4 v2, 0x1

    .line 83
    aget-object v0, v3, v2

    if-eq v0, v6, :cond_20

    move/from16 v36, v11

    move/from16 v35, v23

    move/from16 v37, v25

    const/4 v0, 0x0

    const/16 v34, 0x0

    goto :goto_e

    :cond_20
    move/from16 v34, v2

    move/from16 v37, v10

    move/from16 v36, v11

    move/from16 v35, v23

    const/4 v0, 0x0

    goto :goto_e

    :cond_21
    move-object v3, v8

    const/4 v2, 0x1

    .line 84
    aget-object v1, v3, v2

    if-ne v1, v6, :cond_24

    const/4 v1, 0x3

    if-ne v11, v1, :cond_24

    .line 85
    iput v2, v15, Lr5;->C:I

    const/4 v1, -0x1

    if-ne v7, v1, :cond_22

    const/high16 v1, 0x3f800000    # 1.0f

    div-float/2addr v1, v9

    .line 86
    iput v1, v15, Lr5;->D:F

    .line 87
    :cond_22
    iget v1, v15, Lr5;->D:F

    int-to-float v0, v0

    mul-float/2addr v1, v0

    float-to-int v7, v1

    const/4 v0, 0x0

    .line 88
    aget-object v1, v3, v0

    if-eq v1, v6, :cond_23

    move/from16 v34, v0

    move/from16 v35, v7

    move/from16 v37, v10

    move/from16 v1, v22

    move/from16 v36, v25

    goto :goto_e

    :cond_23
    move/from16 v35, v7

    move/from16 v37, v10

    move/from16 v36, v11

    move/from16 v1, v22

    goto :goto_d

    :cond_24
    :goto_c
    const/4 v0, 0x0

    move/from16 v37, v10

    move/from16 v36, v11

    move/from16 v1, v22

    move/from16 v35, v23

    :goto_d
    const/16 v34, 0x1

    goto :goto_e

    :cond_25
    move-object/from16 v33, v13

    :cond_26
    const/4 v0, 0x0

    move/from16 v34, v0

    move/from16 v37, v10

    move/from16 v36, v11

    move/from16 v1, v22

    move/from16 v35, v23

    .line 89
    :goto_e
    iget-object v2, v15, Lr5;->v:[I

    aput v37, v2, v0

    const/4 v0, 0x1

    .line 90
    aput v36, v2, v0

    if-eqz v34, :cond_28

    .line 91
    iget v0, v15, Lr5;->C:I

    const/4 v2, -0x1

    if-eqz v0, :cond_27

    if-ne v0, v2, :cond_29

    :cond_27
    const/16 v20, 0x1

    goto :goto_f

    :cond_28
    const/4 v2, -0x1

    :cond_29
    const/16 v20, 0x0

    :goto_f
    if-eqz v34, :cond_2b

    .line 92
    iget v0, v15, Lr5;->C:I

    const/4 v3, 0x1

    if-eq v0, v3, :cond_2a

    if-ne v0, v2, :cond_2b

    :cond_2a
    const/16 v38, 0x1

    goto :goto_10

    :cond_2b
    const/16 v38, 0x0

    .line 93
    :goto_10
    iget-object v0, v15, Lr5;->W:[Lr5$b;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    sget-object v14, Lr5$b;->c:Lr5$b;

    if-ne v0, v14, :cond_2c

    instance-of v0, v15, Ls5;

    if-eqz v0, :cond_2c

    const/4 v9, 0x1

    goto :goto_11

    :cond_2c
    const/4 v9, 0x0

    :goto_11
    if-eqz v9, :cond_2d

    const/4 v13, 0x0

    goto :goto_12

    :cond_2d
    move v13, v1

    .line 94
    :goto_12
    iget-object v0, v15, Lr5;->S:Lq5;

    invoke-virtual {v0}, Lq5;->n()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/lit8 v39, v0, 0x1

    .line 95
    iget-object v0, v15, Lr5;->V:[Z

    const/4 v2, 0x0

    aget-boolean v22, v0, v2

    .line 96
    aget-boolean v40, v0, v1

    .line 97
    iget v0, v15, Lr5;->q:I

    const/16 v41, 0x0

    const/4 v8, 0x2

    if-eq v0, v8, :cond_35

    iget-boolean v0, v15, Lr5;->m:Z

    if-nez v0, :cond_35

    if-eqz p2, :cond_31

    .line 98
    iget-object v0, v15, Lr5;->d:Lk6;

    if-eqz v0, :cond_31

    iget-object v1, v0, Lo6;->h:Le6;

    iget-boolean v2, v1, Le6;->j:Z

    if-eqz v2, :cond_31

    iget-object v0, v0, Lo6;->i:Le6;

    iget-boolean v0, v0, Le6;->j:Z

    if-nez v0, :cond_2e

    goto :goto_13

    :cond_2e
    if-eqz p2, :cond_30

    .line 99
    iget v0, v1, Le6;->g:I

    move-object/from16 v12, p1

    move-object/from16 v11, v33

    invoke-virtual {v12, v11, v0}, Lz4;->f(Le5;I)V

    .line 100
    iget-object v0, v15, Lr5;->d:Lk6;

    iget-object v0, v0, Lo6;->i:Le6;

    iget v0, v0, Le6;->g:I

    move-object/from16 v10, v32

    invoke-virtual {v12, v10, v0}, Lz4;->f(Le5;I)V

    .line 101
    iget-object v0, v15, Lr5;->X:Lr5;

    if-eqz v0, :cond_2f

    if-eqz v4, :cond_2f

    .line 102
    iget-object v0, v15, Lr5;->f:[Z

    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_2f

    invoke-virtual/range {p0 .. p0}, Lr5;->g0()Z

    move-result v0

    if-nez v0, :cond_2f

    .line 103
    iget-object v0, v15, Lr5;->X:Lr5;

    iget-object v0, v0, Lr5;->N:Lq5;

    invoke-virtual {v12, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    const/16 v3, 0x8

    .line 104
    invoke-virtual {v12, v0, v10, v1, v3}, Lz4;->h(Le5;Le5;II)V

    :cond_2f
    move/from16 v43, v4

    move/from16 v47, v5

    move-object/from16 v48, v6

    move-object/from16 v52, v14

    move-object/from16 v49, v27

    move-object/from16 v50, v30

    move-object/from16 v51, v31

    move-object/from16 v30, v10

    move-object/from16 v31, v11

    goto/16 :goto_18

    :cond_30
    move-object/from16 v12, p1

    goto/16 :goto_17

    :cond_31
    :goto_13
    move-object/from16 v12, p1

    move-object/from16 v10, v32

    move-object/from16 v11, v33

    const/16 v3, 0x8

    .line 105
    iget-object v0, v15, Lr5;->X:Lr5;

    if-eqz v0, :cond_32

    iget-object v0, v0, Lr5;->N:Lq5;

    invoke-virtual {v12, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    move-object v7, v0

    goto :goto_14

    :cond_32
    move-object/from16 v7, v41

    .line 106
    :goto_14
    iget-object v0, v15, Lr5;->X:Lr5;

    if-eqz v0, :cond_33

    iget-object v0, v0, Lr5;->L:Lq5;

    invoke-virtual {v12, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    move-object/from16 v16, v0

    goto :goto_15

    :cond_33
    move-object/from16 v16, v41

    .line 107
    :goto_15
    iget-object v0, v15, Lr5;->f:[Z

    const/16 v17, 0x0

    aget-boolean v18, v0, v17

    iget-object v0, v15, Lr5;->W:[Lr5$b;

    aget-object v23, v0, v17

    iget-object v1, v15, Lr5;->L:Lq5;

    iget-object v2, v15, Lr5;->N:Lq5;

    move-object/from16 v33, v2

    iget v2, v15, Lr5;->c0:I

    move/from16 v42, v2

    iget v2, v15, Lr5;->f0:I

    iget-object v3, v15, Lr5;->E:[I

    aget v44, v3, v17

    iget v3, v15, Lr5;->h0:F

    const/16 v21, 0x1

    aget-object v0, v0, v21

    if-ne v0, v6, :cond_34

    move/from16 v45, v21

    goto :goto_16

    :cond_34
    move/from16 v45, v17

    :goto_16
    iget v0, v15, Lr5;->w:I

    move/from16 v24, v0

    iget v0, v15, Lr5;->x:I

    move/from16 v25, v0

    iget v0, v15, Lr5;->y:F

    move/from16 v26, v0

    move-object/from16 v0, p0

    move-object/from16 v46, v1

    move-object/from16 v1, p1

    move-object/from16 v19, v33

    move/from16 v32, v42

    move/from16 v33, v2

    const/4 v2, 0x1

    move/from16 v42, v3

    move v3, v4

    move/from16 v43, v4

    move v4, v5

    move/from16 v47, v5

    move/from16 v5, v18

    move-object/from16 v48, v6

    move-object/from16 v6, v16

    move-object/from16 v8, v23

    move-object/from16 v49, v27

    move-object/from16 v16, v10

    move-object/from16 v50, v30

    move-object/from16 v10, v46

    move-object/from16 v17, v11

    move-object/from16 v51, v31

    move-object/from16 v11, v19

    move-object/from16 v30, v16

    move/from16 v12, v32

    move-object/from16 v31, v17

    move-object/from16 v52, v14

    move/from16 v14, v33

    move/from16 v15, v44

    move/from16 v16, v42

    move/from16 v17, v20

    move/from16 v18, v45

    move/from16 v19, v29

    move/from16 v20, v28

    move/from16 v21, v22

    move/from16 v22, v37

    move/from16 v23, v36

    move/from16 v27, v39

    invoke-virtual/range {v0 .. v27}, Lr5;->i(Lz4;ZZZZLe5;Le5;Lr5$b;ZLq5;Lq5;IIIIFZZZZZIIIIFZ)V

    goto :goto_18

    :cond_35
    :goto_17
    move/from16 v43, v4

    move/from16 v47, v5

    move-object/from16 v48, v6

    move-object/from16 v52, v14

    move-object/from16 v49, v27

    move-object/from16 v50, v30

    move-object/from16 v51, v31

    move-object/from16 v30, v32

    move-object/from16 v31, v33

    :goto_18
    if-eqz p2, :cond_39

    move-object/from16 v15, p0

    .line 108
    iget-object v0, v15, Lr5;->e:Lm6;

    if-eqz v0, :cond_38

    iget-object v1, v0, Lo6;->h:Le6;

    iget-boolean v2, v1, Le6;->j:Z

    if-eqz v2, :cond_38

    iget-object v0, v0, Lo6;->i:Le6;

    iget-boolean v0, v0, Le6;->j:Z

    if-eqz v0, :cond_38

    .line 109
    iget v0, v1, Le6;->g:I

    move-object/from16 v14, p1

    move-object/from16 v13, v51

    invoke-virtual {v14, v13, v0}, Lz4;->f(Le5;I)V

    .line 110
    iget-object v0, v15, Lr5;->e:Lm6;

    iget-object v0, v0, Lo6;->i:Le6;

    iget v0, v0, Le6;->g:I

    move-object/from16 v12, v50

    invoke-virtual {v14, v12, v0}, Lz4;->f(Le5;I)V

    .line 111
    iget-object v0, v15, Lr5;->e:Lm6;

    iget-object v0, v0, Lm6;->k:Le6;

    iget v0, v0, Le6;->g:I

    move-object/from16 v1, v49

    invoke-virtual {v14, v1, v0}, Lz4;->f(Le5;I)V

    .line 112
    iget-object v0, v15, Lr5;->X:Lr5;

    if-eqz v0, :cond_37

    if-nez v28, :cond_37

    if-eqz v47, :cond_37

    .line 113
    iget-object v2, v15, Lr5;->f:[Z

    const/4 v11, 0x1

    aget-boolean v2, v2, v11

    if-eqz v2, :cond_36

    .line 114
    iget-object v0, v0, Lr5;->O:Lq5;

    invoke-virtual {v14, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    const/16 v2, 0x8

    const/4 v10, 0x0

    .line 115
    invoke-virtual {v14, v0, v12, v10, v2}, Lz4;->h(Le5;Le5;II)V

    goto :goto_19

    :cond_36
    const/16 v2, 0x8

    const/4 v10, 0x0

    goto :goto_19

    :cond_37
    const/16 v2, 0x8

    const/4 v10, 0x0

    const/4 v11, 0x1

    :goto_19
    move v7, v10

    goto :goto_1b

    :cond_38
    move-object/from16 v14, p1

    move-object/from16 v1, v49

    move-object/from16 v12, v50

    move-object/from16 v13, v51

    const/16 v2, 0x8

    const/4 v10, 0x0

    const/4 v11, 0x1

    goto :goto_1a

    :cond_39
    const/16 v2, 0x8

    const/4 v10, 0x0

    const/4 v11, 0x1

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v1, v49

    move-object/from16 v12, v50

    move-object/from16 v13, v51

    :goto_1a
    move v7, v11

    .line 116
    :goto_1b
    iget v0, v15, Lr5;->r:I

    const/4 v3, 0x2

    if-ne v0, v3, :cond_3a

    move v6, v10

    goto :goto_1c

    :cond_3a
    move v6, v7

    :goto_1c
    if-eqz v6, :cond_45

    .line 117
    iget-boolean v0, v15, Lr5;->n:Z

    if-nez v0, :cond_45

    .line 118
    iget-object v0, v15, Lr5;->W:[Lr5$b;

    aget-object v0, v0, v11

    move-object/from16 v3, v52

    if-ne v0, v3, :cond_3b

    instance-of v0, v15, Ls5;

    if-eqz v0, :cond_3b

    move v9, v11

    goto :goto_1d

    :cond_3b
    move v9, v10

    :goto_1d
    if-eqz v9, :cond_3c

    move/from16 v35, v10

    .line 119
    :cond_3c
    iget-object v0, v15, Lr5;->X:Lr5;

    if-eqz v0, :cond_3d

    iget-object v0, v0, Lr5;->O:Lq5;

    invoke-virtual {v14, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    move-object v7, v0

    goto :goto_1e

    :cond_3d
    move-object/from16 v7, v41

    .line 120
    :goto_1e
    iget-object v0, v15, Lr5;->X:Lr5;

    if-eqz v0, :cond_3e

    iget-object v0, v0, Lr5;->M:Lq5;

    invoke-virtual {v14, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    move-object v6, v0

    goto :goto_1f

    :cond_3e
    move-object/from16 v6, v41

    .line 121
    :goto_1f
    iget v0, v15, Lr5;->e0:I

    if-gtz v0, :cond_3f

    iget v0, v15, Lr5;->k0:I

    if-ne v0, v2, :cond_43

    .line 122
    :cond_3f
    iget-object v0, v15, Lr5;->P:Lq5;

    iget-object v3, v0, Lq5;->f:Lq5;

    if-eqz v3, :cond_41

    .line 123
    invoke-virtual/range {p0 .. p0}, Lr5;->n()I

    move-result v0

    invoke-virtual {v14, v1, v13, v0, v2}, Lz4;->e(Le5;Le5;II)Lx4;

    .line 124
    iget-object v0, v15, Lr5;->P:Lq5;

    iget-object v0, v0, Lq5;->f:Lq5;

    invoke-virtual {v14, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    .line 125
    iget-object v3, v15, Lr5;->P:Lq5;

    invoke-virtual {v3}, Lq5;->e()I

    move-result v3

    .line 126
    invoke-virtual {v14, v1, v0, v3, v2}, Lz4;->e(Le5;Le5;II)Lx4;

    if-eqz v47, :cond_40

    .line 127
    iget-object v0, v15, Lr5;->O:Lq5;

    invoke-virtual {v14, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v0

    const/4 v1, 0x5

    .line 128
    invoke-virtual {v14, v7, v0, v10, v1}, Lz4;->h(Le5;Le5;II)V

    :cond_40
    move/from16 v27, v10

    goto :goto_21

    .line 129
    :cond_41
    iget v3, v15, Lr5;->k0:I

    if-ne v3, v2, :cond_42

    .line 130
    invoke-virtual {v0}, Lq5;->e()I

    move-result v0

    invoke-virtual {v14, v1, v13, v0, v2}, Lz4;->e(Le5;Le5;II)Lx4;

    goto :goto_20

    .line 131
    :cond_42
    invoke-virtual/range {p0 .. p0}, Lr5;->n()I

    move-result v0

    invoke-virtual {v14, v1, v13, v0, v2}, Lz4;->e(Le5;Le5;II)Lx4;

    :cond_43
    :goto_20
    move/from16 v27, v39

    .line 132
    :goto_21
    iget-object v0, v15, Lr5;->f:[Z

    aget-boolean v5, v0, v11

    iget-object v0, v15, Lr5;->W:[Lr5$b;

    aget-object v8, v0, v11

    iget-object v4, v15, Lr5;->M:Lq5;

    iget-object v3, v15, Lr5;->O:Lq5;

    iget v1, v15, Lr5;->d0:I

    iget v2, v15, Lr5;->g0:I

    iget-object v10, v15, Lr5;->E:[I

    aget v16, v10, v11

    iget v10, v15, Lr5;->i0:F

    const/16 v17, 0x0

    aget-object v0, v0, v17

    move-object/from16 v11, v48

    if-ne v0, v11, :cond_44

    const/16 v18, 0x1

    goto :goto_22

    :cond_44
    move/from16 v18, v17

    :goto_22
    iget v0, v15, Lr5;->z:I

    move/from16 v24, v0

    iget v0, v15, Lr5;->A:I

    move/from16 v25, v0

    iget v0, v15, Lr5;->B:F

    move/from16 v26, v0

    move-object/from16 v0, p0

    move/from16 v19, v1

    move-object/from16 v1, p1

    move/from16 v20, v2

    const/4 v2, 0x0

    move-object v11, v3

    move/from16 v3, v47

    move-object/from16 v21, v4

    move/from16 v4, v43

    move/from16 v17, v10

    move-object/from16 v10, v21

    move-object/from16 v32, v12

    move/from16 v12, v19

    move-object/from16 v33, v13

    move/from16 v13, v35

    move/from16 v14, v20

    move/from16 v15, v16

    move/from16 v16, v17

    move/from16 v17, v38

    move/from16 v19, v28

    move/from16 v20, v29

    move/from16 v21, v40

    move/from16 v22, v36

    move/from16 v23, v37

    invoke-virtual/range {v0 .. v27}, Lr5;->i(Lz4;ZZZZLe5;Le5;Lr5$b;ZLq5;Lq5;IIIIFZZZZZIIIIFZ)V

    goto :goto_23

    :cond_45
    move-object/from16 v32, v12

    move-object/from16 v33, v13

    :goto_23
    if-eqz v34, :cond_47

    const/16 v6, 0x8

    move-object/from16 v7, p0

    .line 133
    iget v0, v7, Lr5;->C:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_46

    .line 134
    iget v5, v7, Lr5;->D:F

    move-object/from16 v0, p1

    move-object/from16 v1, v32

    move-object/from16 v2, v33

    move-object/from16 v3, v30

    move-object/from16 v4, v31

    invoke-virtual/range {v0 .. v6}, Lz4;->k(Le5;Le5;Le5;Le5;FI)V

    goto :goto_24

    .line 135
    :cond_46
    iget v5, v7, Lr5;->D:F

    const/16 v6, 0x8

    move-object/from16 v0, p1

    move-object/from16 v1, v30

    move-object/from16 v2, v31

    move-object/from16 v3, v32

    move-object/from16 v4, v33

    invoke-virtual/range {v0 .. v6}, Lz4;->k(Le5;Le5;Le5;Le5;FI)V

    goto :goto_24

    :cond_47
    move-object/from16 v7, p0

    .line 136
    :goto_24
    iget-object v0, v7, Lr5;->S:Lq5;

    invoke-virtual {v0}, Lq5;->n()Z

    move-result v0

    if-eqz v0, :cond_48

    .line 137
    iget-object v0, v7, Lr5;->S:Lq5;

    invoke-virtual {v0}, Lq5;->i()Lq5;

    move-result-object v0

    invoke-virtual {v0}, Lq5;->g()Lr5;

    move-result-object v0

    iget v1, v7, Lr5;->F:F

    const/high16 v2, 0x42b40000    # 90.0f

    add-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    double-to-float v1, v1

    iget-object v2, v7, Lr5;->S:Lq5;

    invoke-virtual {v2}, Lq5;->e()I

    move-result v2

    move-object/from16 v3, p1

    invoke-virtual {v3, v7, v0, v1, v2}, Lz4;->b(Lr5;Lr5;FI)V

    :cond_48
    const/4 v0, 0x0

    .line 138
    iput-boolean v0, v7, Lr5;->m:Z

    .line 139
    iput-boolean v0, v7, Lr5;->n:Z

    return-void
.end method

.method public g0()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lr5;->L:Lq5;

    iget-object v1, v0, Lq5;->f:Lq5;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lq5;->f:Lq5;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Lr5;->N:Lq5;

    iget-object v1, v0, Lq5;->f:Lq5;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lq5;->f:Lq5;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public g1(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr5;->k0:I

    return-void
.end method

.method public h()Z
    .locals 2

    .line 1
    iget v0, p0, Lr5;->k0:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public h0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5;->H:Z

    return v0
.end method

.method public h1(I)V
    .locals 1

    .line 1
    iput p1, p0, Lr5;->Y:I

    .line 2
    iget v0, p0, Lr5;->f0:I

    if-ge p1, v0, :cond_0

    .line 3
    iput v0, p0, Lr5;->Y:I

    :cond_0
    return-void
.end method

.method public final i(Lz4;ZZZZLe5;Le5;Lr5$b;ZLq5;Lq5;IIIIFZZZZZIIIIFZ)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move/from16 v15, p14

    move/from16 v1, p15

    move/from16 v2, p23

    move/from16 v3, p24

    move/from16 v4, p25

    .line 1
    invoke-virtual {v10, v13}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v9

    .line 2
    invoke-virtual {v10, v14}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v8

    .line 3
    invoke-virtual/range {p10 .. p10}, Lq5;->i()Lq5;

    move-result-object v5

    invoke-virtual {v10, v5}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v7

    .line 4
    invoke-virtual/range {p11 .. p11}, Lq5;->i()Lq5;

    move-result-object v5

    invoke-virtual {v10, v5}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v6

    .line 5
    invoke-static {}, Lz4;->w()La5;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 6
    invoke-static {}, Lz4;->w()La5;

    move-result-object v5

    iget-wide v11, v5, La5;->w:J

    const-wide/16 v16, 0x1

    add-long v11, v11, v16

    iput-wide v11, v5, La5;->w:J

    .line 7
    :cond_0
    invoke-virtual/range {p10 .. p10}, Lq5;->n()Z

    move-result v11

    .line 8
    invoke-virtual/range {p11 .. p11}, Lq5;->n()Z

    move-result v12

    .line 9
    iget-object v5, v0, Lr5;->S:Lq5;

    invoke-virtual {v5}, Lq5;->n()Z

    move-result v16

    if-eqz v12, :cond_1

    add-int/lit8 v5, v11, 0x1

    goto :goto_0

    :cond_1
    move v5, v11

    :goto_0
    if-eqz v16, :cond_2

    add-int/lit8 v5, v5, 0x1

    :cond_2
    if-eqz p17, :cond_3

    const/16 v18, 0x3

    goto :goto_1

    :cond_3
    move/from16 v18, p22

    .line 10
    :goto_1
    sget-object v17, Lr5$a;->b:[I

    invoke-virtual/range {p8 .. p8}, Ljava/lang/Enum;->ordinal()I

    move-result v19

    aget v2, v17, v19

    const/4 v14, 0x1

    if-eq v2, v14, :cond_4

    const/4 v14, 0x2

    if-eq v2, v14, :cond_4

    const/4 v14, 0x3

    if-eq v2, v14, :cond_4

    const/4 v14, 0x4

    if-eq v2, v14, :cond_6

    :cond_4
    move/from16 v2, v18

    :cond_5
    const/16 v18, 0x0

    goto :goto_2

    :cond_6
    move/from16 v2, v18

    if-eq v2, v14, :cond_5

    const/16 v18, 0x1

    .line 11
    :goto_2
    iget v14, v0, Lr5;->j:I

    const/4 v13, -0x1

    if-eq v14, v13, :cond_7

    if-eqz p2, :cond_7

    .line 12
    iput v13, v0, Lr5;->j:I

    move-object/from16 v21, v6

    const/16 v18, 0x0

    goto :goto_3

    :cond_7
    move/from16 v14, p13

    move-object/from16 v21, v6

    .line 13
    :goto_3
    iget v6, v0, Lr5;->k:I

    if-eq v6, v13, :cond_8

    if-nez p2, :cond_8

    .line 14
    iput v13, v0, Lr5;->k:I

    move v14, v6

    const/16 v18, 0x0

    .line 15
    :cond_8
    iget v6, v0, Lr5;->k0:I

    const/16 v13, 0x8

    if-ne v6, v13, :cond_9

    const/4 v14, 0x0

    const/16 v18, 0x0

    :cond_9
    if-eqz p27, :cond_b

    if-nez v11, :cond_a

    if-nez v12, :cond_a

    if-nez v16, :cond_a

    move/from16 v6, p12

    .line 16
    invoke-virtual {v10, v9, v6}, Lz4;->f(Le5;I)V

    goto :goto_4

    :cond_a
    if-eqz v11, :cond_b

    if-nez v12, :cond_b

    .line 17
    invoke-virtual/range {p10 .. p10}, Lq5;->e()I

    move-result v6

    invoke-virtual {v10, v9, v7, v6, v13}, Lz4;->e(Le5;Le5;II)Lx4;

    :cond_b
    :goto_4
    if-nez v18, :cond_f

    if-eqz p9, :cond_d

    const/4 v6, 0x3

    const/4 v13, 0x0

    .line 18
    invoke-virtual {v10, v8, v9, v13, v6}, Lz4;->e(Le5;Le5;II)Lx4;

    const/16 v6, 0x8

    if-lez v15, :cond_c

    .line 19
    invoke-virtual {v10, v8, v9, v15, v6}, Lz4;->h(Le5;Le5;II)V

    :cond_c
    const v14, 0x7fffffff

    if-ge v1, v14, :cond_e

    .line 20
    invoke-virtual {v10, v8, v9, v1, v6}, Lz4;->j(Le5;Le5;II)V

    goto :goto_5

    :cond_d
    move v6, v13

    const/4 v13, 0x0

    .line 21
    invoke-virtual {v10, v8, v9, v14, v6}, Lz4;->e(Le5;Le5;II)Lx4;

    :cond_e
    :goto_5
    move/from16 v14, p5

    move/from16 v23, v5

    move-object v13, v7

    move-object v1, v8

    move-object/from16 v15, v21

    move/from16 v21, v3

    goto/16 :goto_e

    :cond_f
    const/4 v1, 0x2

    const/4 v13, 0x0

    if-eq v5, v1, :cond_12

    if-nez p17, :cond_12

    const/4 v1, 0x1

    if-eq v2, v1, :cond_10

    if-nez v2, :cond_12

    .line 22
    :cond_10
    invoke-static {v3, v14}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-lez v4, :cond_11

    .line 23
    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_11
    const/16 v6, 0x8

    .line 24
    invoke-virtual {v10, v8, v9, v1, v6}, Lz4;->e(Le5;Le5;II)Lx4;

    move/from16 v14, p5

    move/from16 v23, v5

    move-object v1, v8

    move/from16 v18, v13

    move-object/from16 v15, v21

    move/from16 v21, v3

    move-object v13, v7

    goto/16 :goto_e

    :cond_12
    const/4 v1, -0x2

    if-ne v3, v1, :cond_13

    move v6, v14

    goto :goto_6

    :cond_13
    move v6, v3

    :goto_6
    if-ne v4, v1, :cond_14

    move v1, v14

    goto :goto_7

    :cond_14
    move v1, v4

    :goto_7
    if-lez v14, :cond_15

    const/4 v3, 0x1

    if-eq v2, v3, :cond_15

    move v14, v13

    :cond_15
    if-lez v6, :cond_16

    const/16 v3, 0x8

    .line 25
    invoke-virtual {v10, v8, v9, v6, v3}, Lz4;->h(Le5;Le5;II)V

    .line 26
    invoke-static {v14, v6}, Ljava/lang/Math;->max(II)I

    move-result v14

    :cond_16
    if-lez v1, :cond_19

    if-eqz p3, :cond_17

    const/4 v3, 0x1

    if-ne v2, v3, :cond_17

    move v3, v13

    goto :goto_8

    :cond_17
    const/4 v3, 0x1

    :goto_8
    if-eqz v3, :cond_18

    const/16 v3, 0x8

    .line 27
    invoke-virtual {v10, v8, v9, v1, v3}, Lz4;->j(Le5;Le5;II)V

    goto :goto_9

    :cond_18
    const/16 v3, 0x8

    .line 28
    :goto_9
    invoke-static {v14, v1}, Ljava/lang/Math;->min(II)I

    move-result v14

    goto :goto_a

    :cond_19
    const/16 v3, 0x8

    :goto_a
    const/4 v4, 0x1

    if-ne v2, v4, :cond_1c

    if-eqz p3, :cond_1a

    .line 29
    invoke-virtual {v10, v8, v9, v14, v3}, Lz4;->e(Le5;Le5;II)Lx4;

    const/4 v4, 0x5

    goto :goto_b

    :cond_1a
    if-eqz p19, :cond_1b

    const/4 v4, 0x5

    .line 30
    invoke-virtual {v10, v8, v9, v14, v4}, Lz4;->e(Le5;Le5;II)Lx4;

    .line 31
    invoke-virtual {v10, v8, v9, v14, v3}, Lz4;->j(Le5;Le5;II)V

    goto :goto_b

    :cond_1b
    const/4 v4, 0x5

    .line 32
    invoke-virtual {v10, v8, v9, v14, v4}, Lz4;->e(Le5;Le5;II)Lx4;

    .line 33
    invoke-virtual {v10, v8, v9, v14, v3}, Lz4;->j(Le5;Le5;II)V

    :goto_b
    move/from16 v14, p5

    move v4, v1

    move/from16 v23, v5

    move-object v13, v7

    move-object v1, v8

    move-object/from16 v15, v21

    move/from16 v21, v6

    goto/16 :goto_e

    :cond_1c
    const/4 v4, 0x5

    const/4 v14, 0x2

    if-ne v2, v14, :cond_20

    .line 34
    invoke-virtual/range {p10 .. p10}, Lq5;->j()Lq5$b;

    move-result-object v3

    sget-object v4, Lq5$b;->d:Lq5$b;

    if-eq v3, v4, :cond_1e

    invoke-virtual/range {p10 .. p10}, Lq5;->j()Lq5$b;

    move-result-object v3

    sget-object v13, Lq5$b;->f:Lq5$b;

    if-ne v3, v13, :cond_1d

    goto :goto_c

    .line 35
    :cond_1d
    iget-object v3, v0, Lr5;->X:Lr5;

    sget-object v4, Lq5$b;->c:Lq5$b;

    invoke-virtual {v3, v4}, Lr5;->m(Lq5$b;)Lq5;

    move-result-object v3

    invoke-virtual {v10, v3}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v3

    .line 36
    iget-object v4, v0, Lr5;->X:Lr5;

    sget-object v13, Lq5$b;->e:Lq5$b;

    invoke-virtual {v4, v13}, Lr5;->m(Lq5$b;)Lq5;

    move-result-object v4

    invoke-virtual {v10, v4}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v4

    goto :goto_d

    .line 37
    :cond_1e
    :goto_c
    iget-object v3, v0, Lr5;->X:Lr5;

    invoke-virtual {v3, v4}, Lr5;->m(Lq5$b;)Lq5;

    move-result-object v3

    invoke-virtual {v10, v3}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v3

    .line 38
    iget-object v4, v0, Lr5;->X:Lr5;

    sget-object v13, Lq5$b;->f:Lq5$b;

    invoke-virtual {v4, v13}, Lr5;->m(Lq5$b;)Lq5;

    move-result-object v4

    invoke-virtual {v10, v4}, Lz4;->q(Ljava/lang/Object;)Le5;

    move-result-object v4

    :goto_d
    move-object/from16 v23, v3

    move-object v13, v4

    .line 39
    invoke-virtual/range {p1 .. p1}, Lz4;->r()Lx4;

    move-result-object v4

    move-object v3, v4

    move-object v14, v4

    const/16 v24, 0x5

    move-object v4, v8

    move/from16 p9, v1

    move v1, v5

    move-object v5, v9

    move-object/from16 v15, v21

    move/from16 v21, v6

    move-object v6, v13

    move-object v13, v7

    move-object/from16 v7, v23

    move/from16 v23, v1

    move-object v1, v8

    move/from16 v8, p26

    invoke-virtual/range {v3 .. v8}, Lx4;->k(Le5;Le5;Le5;Le5;F)Lx4;

    invoke-virtual {v10, v14}, Lz4;->d(Lx4;)V

    if-eqz p3, :cond_1f

    const/16 v18, 0x0

    :cond_1f
    move/from16 v14, p5

    move/from16 v4, p9

    goto :goto_e

    :cond_20
    move/from16 p9, v1

    move/from16 v23, v5

    move-object v13, v7

    move-object v1, v8

    move-object/from16 v15, v21

    move/from16 v21, v6

    move/from16 v4, p9

    const/4 v14, 0x1

    :goto_e
    if-eqz p27, :cond_60

    if-eqz p19, :cond_21

    move-object/from16 v3, p7

    move-object v2, v1

    move/from16 p15, v14

    move/from16 v5, v23

    const/4 v4, 0x0

    const/4 v6, 0x2

    move-object/from16 v1, p6

    move-object v14, v9

    goto/16 :goto_31

    :cond_21
    if-nez v11, :cond_22

    if-nez v12, :cond_22

    if-nez v16, :cond_22

    move-object v2, v1

    move/from16 p15, v14

    const/4 v1, 0x5

    const/4 v4, 0x0

    goto/16 :goto_2c

    :cond_22
    if-eqz v11, :cond_24

    if-nez v12, :cond_24

    move-object/from16 v7, p10

    const/4 v8, 0x0

    .line 40
    iget-object v2, v7, Lq5;->f:Lq5;

    iget-object v2, v2, Lq5;->d:Lr5;

    if-eqz p3, :cond_23

    .line 41
    instance-of v2, v2, Ln5;

    if-eqz v2, :cond_23

    const/16 v13, 0x8

    goto :goto_f

    :cond_23
    const/4 v13, 0x5

    :goto_f
    move/from16 v23, p3

    move-object v2, v1

    move v4, v8

    move v6, v13

    move/from16 p15, v14

    goto/16 :goto_2e

    :cond_24
    move-object/from16 v7, p10

    const/4 v8, 0x0

    if-nez v11, :cond_27

    if-eqz v12, :cond_27

    .line 42
    invoke-virtual/range {p11 .. p11}, Lq5;->e()I

    move-result v2

    neg-int v2, v2

    const/16 v3, 0x8

    invoke-virtual {v10, v1, v15, v2, v3}, Lz4;->e(Le5;Le5;II)Lx4;

    if-eqz p3, :cond_5b

    .line 43
    iget-boolean v2, v0, Lr5;->h:Z

    if-eqz v2, :cond_26

    iget-boolean v2, v9, Le5;->h:Z

    if-eqz v2, :cond_26

    iget-object v2, v0, Lr5;->X:Lr5;

    if-eqz v2, :cond_26

    .line 44
    check-cast v2, Ls5;

    if-eqz p2, :cond_25

    .line 45
    invoke-virtual {v2, v7}, Ls5;->w1(Lq5;)V

    goto/16 :goto_2b

    .line 46
    :cond_25
    invoke-virtual {v2, v7}, Ls5;->B1(Lq5;)V

    goto/16 :goto_2b

    :cond_26
    move-object/from16 v6, p6

    const/4 v2, 0x5

    .line 47
    invoke-virtual {v10, v9, v6, v8, v2}, Lz4;->h(Le5;Le5;II)V

    move v4, v8

    move/from16 p15, v14

    move/from16 v30, v2

    move-object v2, v1

    move/from16 v1, v30

    goto/16 :goto_2c

    :cond_27
    move-object/from16 v6, p6

    if-eqz v11, :cond_5b

    if-eqz v12, :cond_5b

    .line 48
    iget-object v3, v7, Lq5;->f:Lq5;

    iget-object v11, v3, Lq5;->d:Lr5;

    move-object/from16 v12, p11

    const/4 v3, 0x2

    .line 49
    iget-object v5, v12, Lq5;->f:Lq5;

    iget-object v5, v5, Lq5;->d:Lr5;

    .line 50
    invoke-virtual/range {p0 .. p0}, Lr5;->I()Lr5;

    move-result-object v3

    const/16 v16, 0x6

    if-eqz v18, :cond_3d

    if-nez v2, :cond_2c

    if-nez v4, :cond_29

    if-nez v21, :cond_29

    .line 51
    iget-boolean v4, v13, Le5;->h:Z

    if-eqz v4, :cond_28

    iget-boolean v4, v15, Le5;->h:Z

    if-eqz v4, :cond_28

    .line 52
    invoke-virtual/range {p10 .. p10}, Lq5;->e()I

    move-result v2

    const/16 v3, 0x8

    invoke-virtual {v10, v9, v13, v2, v3}, Lz4;->e(Le5;Le5;II)Lx4;

    .line 53
    invoke-virtual/range {p11 .. p11}, Lq5;->e()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {v10, v1, v15, v2, v3}, Lz4;->e(Le5;Le5;II)Lx4;

    return-void

    :cond_28
    move/from16 v22, v8

    move/from16 v24, v22

    const/16 v4, 0x8

    const/16 v19, 0x8

    const/16 v23, 0x1

    goto :goto_10

    :cond_29
    move/from16 v23, v8

    const/4 v4, 0x5

    const/16 v19, 0x5

    const/16 v22, 0x1

    const/16 v24, 0x1

    .line 54
    :goto_10
    instance-of v8, v11, Ln5;

    if-nez v8, :cond_2b

    instance-of v8, v5, Ln5;

    if-eqz v8, :cond_2a

    goto :goto_12

    :cond_2a
    move-object/from16 v8, p7

    move/from16 v25, v23

    move/from16 v23, v22

    move/from16 v22, v19

    move/from16 v19, v2

    :goto_11
    move/from16 v2, v16

    goto/16 :goto_21

    :cond_2b
    :goto_12
    move-object/from16 v8, p7

    move/from16 v19, v2

    move/from16 v2, v16

    move/from16 v25, v23

    move/from16 v23, v22

    const/16 v22, 0x4

    goto/16 :goto_21

    :cond_2c
    const/4 v8, 0x2

    if-ne v2, v8, :cond_2f

    .line 55
    instance-of v4, v11, Ln5;

    if-nez v4, :cond_2e

    instance-of v4, v5, Ln5;

    if-eqz v4, :cond_2d

    goto :goto_13

    :cond_2d
    move-object/from16 v8, p7

    move/from16 v19, v2

    move/from16 v2, v16

    const/4 v4, 0x5

    const/16 v22, 0x5

    goto/16 :goto_1f

    :cond_2e
    :goto_13
    move-object/from16 v8, p7

    move/from16 v19, v2

    goto/16 :goto_1d

    :cond_2f
    const/4 v8, 0x1

    if-ne v2, v8, :cond_30

    move-object/from16 v8, p7

    move/from16 v19, v2

    move/from16 v2, v16

    const/16 v4, 0x8

    goto/16 :goto_1e

    :cond_30
    const/4 v8, 0x3

    if-ne v2, v8, :cond_3c

    .line 56
    iget v8, v0, Lr5;->C:I

    move/from16 v19, v2

    const/4 v2, -0x1

    if-ne v8, v2, :cond_33

    if-eqz p20, :cond_32

    move-object/from16 v8, p7

    if-eqz p3, :cond_31

    const/4 v2, 0x5

    goto :goto_14

    :cond_31
    const/4 v2, 0x4

    goto :goto_14

    :cond_32
    move-object/from16 v8, p7

    const/16 v2, 0x8

    :goto_14
    const/16 v4, 0x8

    :goto_15
    const/16 v22, 0x5

    :goto_16
    const/16 v23, 0x1

    const/16 v24, 0x1

    const/16 v25, 0x1

    goto/16 :goto_21

    :cond_33
    if-eqz p17, :cond_37

    move/from16 v2, p23

    const/4 v8, 0x2

    if-eq v2, v8, :cond_35

    const/4 v4, 0x1

    if-ne v2, v4, :cond_34

    goto :goto_17

    :cond_34
    const/4 v2, 0x0

    goto :goto_18

    :cond_35
    :goto_17
    const/4 v2, 0x1

    :goto_18
    if-nez v2, :cond_36

    const/16 v2, 0x8

    const/4 v4, 0x5

    goto :goto_19

    :cond_36
    const/4 v2, 0x5

    const/4 v4, 0x4

    :goto_19
    move-object/from16 v8, p7

    move/from16 v22, v4

    const/16 v23, 0x1

    const/16 v24, 0x1

    const/16 v25, 0x1

    move v4, v2

    goto/16 :goto_11

    :cond_37
    if-lez v4, :cond_38

    move-object/from16 v8, p7

    move/from16 v2, v16

    const/4 v4, 0x5

    goto :goto_15

    :cond_38
    if-nez v4, :cond_3b

    if-nez v21, :cond_3b

    if-nez p20, :cond_39

    move-object/from16 v8, p7

    move/from16 v2, v16

    const/4 v4, 0x5

    const/16 v22, 0x8

    goto :goto_16

    :cond_39
    if-eq v11, v3, :cond_3a

    if-eq v5, v3, :cond_3a

    const/4 v2, 0x4

    goto :goto_1a

    :cond_3a
    const/4 v2, 0x5

    :goto_1a
    move-object/from16 v8, p7

    move v4, v2

    move/from16 v2, v16

    goto :goto_1b

    :cond_3b
    move-object/from16 v8, p7

    move/from16 v2, v16

    const/4 v4, 0x5

    :goto_1b
    const/16 v22, 0x4

    goto :goto_16

    :cond_3c
    move/from16 v19, v2

    move-object/from16 v8, p7

    move/from16 v2, v16

    const/4 v4, 0x5

    const/16 v22, 0x4

    const/16 v23, 0x0

    const/16 v24, 0x0

    goto :goto_20

    :cond_3d
    move/from16 v19, v2

    .line 57
    iget-boolean v2, v13, Le5;->h:Z

    if-eqz v2, :cond_40

    iget-boolean v2, v15, Le5;->h:Z

    if-eqz v2, :cond_40

    .line 58
    invoke-virtual/range {p10 .. p10}, Lq5;->e()I

    move-result v2

    .line 59
    invoke-virtual/range {p11 .. p11}, Lq5;->e()I

    move-result v3

    const/16 v4, 0x8

    move-object/from16 p17, p1

    move-object/from16 p18, v9

    move-object/from16 p19, v13

    move/from16 p20, v2

    move/from16 p21, p16

    move-object/from16 p22, v15

    move-object/from16 p23, v1

    move/from16 p24, v3

    move/from16 p25, v4

    .line 60
    invoke-virtual/range {p17 .. p25}, Lz4;->c(Le5;Le5;IFLe5;Le5;II)V

    if-eqz p3, :cond_3f

    if-eqz v14, :cond_3f

    .line 61
    iget-object v2, v12, Lq5;->f:Lq5;

    if-eqz v2, :cond_3e

    .line 62
    invoke-virtual/range {p11 .. p11}, Lq5;->e()I

    move-result v13

    move-object/from16 v8, p7

    goto :goto_1c

    :cond_3e
    move-object/from16 v8, p7

    const/4 v13, 0x0

    :goto_1c
    if-eq v15, v8, :cond_3f

    const/4 v2, 0x5

    .line 63
    invoke-virtual {v10, v8, v1, v13, v2}, Lz4;->h(Le5;Le5;II)V

    :cond_3f
    return-void

    :cond_40
    move-object/from16 v8, p7

    :goto_1d
    move/from16 v2, v16

    const/4 v4, 0x5

    :goto_1e
    const/16 v22, 0x4

    :goto_1f
    const/16 v23, 0x1

    const/16 v24, 0x1

    :goto_20
    const/16 v25, 0x0

    :goto_21
    if-eqz v24, :cond_41

    if-ne v13, v15, :cond_41

    if-eq v11, v3, :cond_41

    const/16 v24, 0x0

    const/16 v26, 0x0

    goto :goto_22

    :cond_41
    const/16 v26, 0x1

    :goto_22
    if-eqz v23, :cond_43

    if-nez v18, :cond_42

    if-nez p18, :cond_42

    if-nez p20, :cond_42

    if-ne v13, v6, :cond_42

    if-ne v15, v8, :cond_42

    const/16 v23, 0x0

    const/16 v26, 0x8

    const/16 v27, 0x8

    const/16 v28, 0x0

    goto :goto_23

    :cond_42
    move/from16 v23, p3

    move/from16 v27, v2

    move/from16 v28, v26

    move/from16 v26, v4

    .line 64
    :goto_23
    invoke-virtual/range {p10 .. p10}, Lq5;->e()I

    move-result v4

    .line 65
    invoke-virtual/range {p11 .. p11}, Lq5;->e()I

    move-result v29

    move-object v2, v1

    move-object/from16 v1, p1

    move-object/from16 p9, v2

    move/from16 v12, v19

    move-object v2, v9

    move/from16 p15, v14

    move-object v14, v3

    move-object v3, v13

    move-object v12, v5

    move/from16 v5, p16

    move-object v6, v15

    move-object/from16 v7, p9

    move/from16 v8, v29

    move-object/from16 v20, v14

    move-object v14, v9

    move/from16 v9, v27

    .line 66
    invoke-virtual/range {v1 .. v9}, Lz4;->c(Le5;Le5;IFLe5;Le5;II)V

    move/from16 v4, v26

    move/from16 v26, v28

    goto :goto_24

    :cond_43
    move-object/from16 p9, v1

    move-object/from16 v20, v3

    move-object v12, v5

    move/from16 p15, v14

    move-object v14, v9

    move/from16 v23, p3

    .line 67
    :goto_24
    iget v1, v0, Lr5;->k0:I

    const/16 v2, 0x8

    if-ne v1, v2, :cond_44

    invoke-virtual/range {p11 .. p11}, Lq5;->l()Z

    move-result v1

    if-nez v1, :cond_44

    return-void

    :cond_44
    if-eqz v24, :cond_47

    if-eqz v23, :cond_46

    if-eq v13, v15, :cond_46

    if-nez v18, :cond_46

    .line 68
    instance-of v1, v11, Ln5;

    if-nez v1, :cond_45

    instance-of v1, v12, Ln5;

    if-eqz v1, :cond_46

    :cond_45
    move/from16 v4, v16

    .line 69
    :cond_46
    invoke-virtual/range {p10 .. p10}, Lq5;->e()I

    move-result v1

    invoke-virtual {v10, v14, v13, v1, v4}, Lz4;->h(Le5;Le5;II)V

    .line 70
    invoke-virtual/range {p11 .. p11}, Lq5;->e()I

    move-result v1

    neg-int v1, v1

    move-object/from16 v2, p9

    invoke-virtual {v10, v2, v15, v1, v4}, Lz4;->j(Le5;Le5;II)V

    goto :goto_25

    :cond_47
    move-object/from16 v2, p9

    :goto_25
    if-eqz v23, :cond_48

    if-eqz p21, :cond_48

    .line 71
    instance-of v1, v11, Ln5;

    if-nez v1, :cond_48

    instance-of v1, v12, Ln5;

    if-nez v1, :cond_48

    move-object/from16 v1, v20

    if-eq v12, v1, :cond_49

    move/from16 v3, v16

    move v4, v3

    const/16 v26, 0x1

    goto :goto_26

    :cond_48
    move-object/from16 v1, v20

    :cond_49
    move/from16 v3, v22

    :goto_26
    if-eqz v26, :cond_55

    if-eqz v25, :cond_52

    if-eqz p20, :cond_4a

    if-eqz p4, :cond_52

    :cond_4a
    if-eq v11, v1, :cond_4c

    if-ne v12, v1, :cond_4b

    goto :goto_27

    :cond_4b
    move v6, v3

    goto :goto_28

    :cond_4c
    :goto_27
    move/from16 v6, v16

    .line 72
    :goto_28
    instance-of v5, v11, Lt5;

    if-nez v5, :cond_4d

    instance-of v5, v12, Lt5;

    if-eqz v5, :cond_4e

    :cond_4d
    const/4 v6, 0x5

    .line 73
    :cond_4e
    instance-of v5, v11, Ln5;

    if-nez v5, :cond_4f

    instance-of v5, v12, Ln5;

    if-eqz v5, :cond_50

    :cond_4f
    const/4 v6, 0x5

    :cond_50
    if-eqz p20, :cond_51

    const/4 v6, 0x5

    .line 74
    :cond_51
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    :cond_52
    if-eqz v23, :cond_54

    .line 75
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-eqz p17, :cond_54

    if-nez p20, :cond_54

    if-eq v11, v1, :cond_53

    if-ne v12, v1, :cond_54

    :cond_53
    const/4 v3, 0x4

    .line 76
    :cond_54
    invoke-virtual/range {p10 .. p10}, Lq5;->e()I

    move-result v1

    invoke-virtual {v10, v14, v13, v1, v3}, Lz4;->e(Le5;Le5;II)Lx4;

    .line 77
    invoke-virtual/range {p11 .. p11}, Lq5;->e()I

    move-result v1

    neg-int v1, v1

    invoke-virtual {v10, v2, v15, v1, v3}, Lz4;->e(Le5;Le5;II)Lx4;

    :cond_55
    if-eqz v23, :cond_57

    move-object/from16 v1, p6

    if-ne v1, v13, :cond_56

    .line 78
    invoke-virtual/range {p10 .. p10}, Lq5;->e()I

    move-result v3

    goto :goto_29

    :cond_56
    const/4 v3, 0x0

    :goto_29
    if-eq v13, v1, :cond_57

    const/4 v4, 0x5

    .line 79
    invoke-virtual {v10, v14, v1, v3, v4}, Lz4;->h(Le5;Le5;II)V

    goto :goto_2a

    :cond_57
    const/4 v4, 0x5

    :goto_2a
    if-eqz v23, :cond_59

    if-eqz v18, :cond_59

    move v1, v4

    if-nez p14, :cond_5a

    if-nez v21, :cond_5a

    if-eqz v18, :cond_58

    move/from16 v3, v19

    const/4 v4, 0x3

    if-ne v3, v4, :cond_58

    const/16 v3, 0x8

    const/4 v4, 0x0

    .line 80
    invoke-virtual {v10, v2, v14, v4, v3}, Lz4;->h(Le5;Le5;II)V

    goto :goto_2d

    :cond_58
    const/4 v4, 0x0

    .line 81
    invoke-virtual {v10, v2, v14, v4, v1}, Lz4;->h(Le5;Le5;II)V

    goto :goto_2d

    :cond_59
    move v1, v4

    :cond_5a
    const/4 v4, 0x0

    goto :goto_2d

    :cond_5b
    :goto_2b
    move-object v2, v1

    move v4, v8

    move/from16 p15, v14

    const/4 v1, 0x5

    :goto_2c
    move/from16 v23, p3

    :goto_2d
    move v6, v1

    :goto_2e
    if-eqz v23, :cond_5f

    if-eqz p15, :cond_5f

    move-object/from16 v1, p11

    .line 82
    iget-object v3, v1, Lq5;->f:Lq5;

    if-eqz v3, :cond_5c

    .line 83
    invoke-virtual/range {p11 .. p11}, Lq5;->e()I

    move-result v13

    move-object/from16 v3, p7

    goto :goto_2f

    :cond_5c
    move-object/from16 v3, p7

    move v13, v4

    :goto_2f
    if-eq v15, v3, :cond_5f

    .line 84
    iget-boolean v4, v0, Lr5;->h:Z

    if-eqz v4, :cond_5e

    iget-boolean v4, v2, Le5;->h:Z

    if-eqz v4, :cond_5e

    iget-object v4, v0, Lr5;->X:Lr5;

    if-eqz v4, :cond_5e

    .line 85
    check-cast v4, Ls5;

    if-eqz p2, :cond_5d

    .line 86
    invoke-virtual {v4, v1}, Ls5;->v1(Lq5;)V

    goto :goto_30

    .line 87
    :cond_5d
    invoke-virtual {v4, v1}, Ls5;->A1(Lq5;)V

    :goto_30
    return-void

    .line 88
    :cond_5e
    invoke-virtual {v10, v3, v2, v13, v6}, Lz4;->h(Le5;Le5;II)V

    :cond_5f
    return-void

    :cond_60
    move-object/from16 v3, p7

    move-object v2, v1

    move/from16 p15, v14

    const/4 v4, 0x0

    move-object/from16 v1, p6

    move-object v14, v9

    move/from16 v5, v23

    const/4 v6, 0x2

    :goto_31
    if-ge v5, v6, :cond_65

    if-eqz p3, :cond_65

    if-eqz p15, :cond_65

    const/16 v5, 0x8

    .line 89
    invoke-virtual {v10, v14, v1, v4, v5}, Lz4;->h(Le5;Le5;II)V

    if-nez p2, :cond_62

    .line 90
    iget-object v1, v0, Lr5;->P:Lq5;

    iget-object v1, v1, Lq5;->f:Lq5;

    if-nez v1, :cond_61

    goto :goto_32

    :cond_61
    move v13, v4

    goto :goto_33

    :cond_62
    :goto_32
    const/4 v13, 0x1

    :goto_33
    if-nez p2, :cond_64

    .line 91
    iget-object v1, v0, Lr5;->P:Lq5;

    iget-object v1, v1, Lq5;->f:Lq5;

    if-eqz v1, :cond_64

    .line 92
    iget-object v1, v1, Lq5;->d:Lr5;

    .line 93
    iget v5, v1, Lr5;->a0:F

    const/4 v6, 0x0

    cmpl-float v5, v5, v6

    if-eqz v5, :cond_63

    iget-object v1, v1, Lr5;->W:[Lr5$b;

    aget-object v5, v1, v4

    sget-object v6, Lr5$b;->d:Lr5$b;

    if-ne v5, v6, :cond_63

    const/4 v5, 0x1

    aget-object v1, v1, v5

    if-ne v1, v6, :cond_63

    move v14, v5

    goto :goto_34

    :cond_63
    move v14, v4

    goto :goto_34

    :cond_64
    move v14, v13

    :goto_34
    if-eqz v14, :cond_65

    const/16 v1, 0x8

    .line 94
    invoke-virtual {v10, v3, v2, v4, v1}, Lz4;->h(Le5;Le5;II)V

    :cond_65
    return-void
.end method

.method public i0()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lr5;->M:Lq5;

    iget-object v1, v0, Lq5;->f:Lq5;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lq5;->f:Lq5;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Lr5;->O:Lq5;

    iget-object v1, v0, Lq5;->f:Lq5;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lq5;->f:Lq5;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public i1(I)V
    .locals 1

    if-ltz p1, :cond_0

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    .line 1
    iput p1, p0, Lr5;->s:I

    :cond_0
    return-void
.end method

.method public j(Lr5;FI)V
    .locals 6

    .line 1
    sget-object v3, Lq5$b;->h:Lq5$b;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, v3

    move-object v2, p1

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Lr5;->c0(Lq5$b;Lr5;Lq5$b;II)V

    .line 2
    iput p2, p0, Lr5;->F:F

    return-void
.end method

.method public j0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5;->I:Z

    return v0
.end method

.method public j1(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr5;->c0:I

    return-void
.end method

.method public k(Lz4;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr5;->L:Lq5;

    invoke-virtual {p1, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    .line 2
    iget-object v0, p0, Lr5;->M:Lq5;

    invoke-virtual {p1, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    .line 3
    iget-object v0, p0, Lr5;->N:Lq5;

    invoke-virtual {p1, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    .line 4
    iget-object v0, p0, Lr5;->O:Lq5;

    invoke-virtual {p1, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    .line 5
    iget v0, p0, Lr5;->e0:I

    if-lez v0, :cond_0

    .line 6
    iget-object v0, p0, Lr5;->P:Lq5;

    invoke-virtual {p1, v0}, Lz4;->q(Ljava/lang/Object;)Le5;

    :cond_0
    return-void
.end method

.method public k0()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lr5;->g:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lr5;->k0:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k1(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr5;->d0:I

    return-void
.end method

.method public l()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr5;->d:Lk6;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lk6;

    invoke-direct {v0, p0}, Lk6;-><init>(Lr5;)V

    iput-object v0, p0, Lr5;->d:Lk6;

    .line 3
    :cond_0
    iget-object v0, p0, Lr5;->e:Lm6;

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Lm6;

    invoke-direct {v0, p0}, Lm6;-><init>(Lr5;)V

    iput-object v0, p0, Lr5;->e:Lm6;

    :cond_1
    return-void
.end method

.method public l0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5;->m:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lr5;->L:Lq5;

    invoke-virtual {v0}, Lq5;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr5;->N:Lq5;

    invoke-virtual {v0}, Lq5;->m()Z

    move-result v0

    if-eqz v0, :cond_0

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

.method public l1(ZZZZ)V
    .locals 3

    .line 1
    iget p1, p0, Lr5;->C:I

    const/high16 p2, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-ne p1, v1, :cond_1

    if-eqz p3, :cond_0

    if-nez p4, :cond_0

    .line 2
    iput v0, p0, Lr5;->C:I

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    if-eqz p4, :cond_1

    .line 3
    iput v2, p0, Lr5;->C:I

    .line 4
    iget p1, p0, Lr5;->b0:I

    if-ne p1, v1, :cond_1

    .line 5
    iget p1, p0, Lr5;->D:F

    div-float p1, p2, p1

    iput p1, p0, Lr5;->D:F

    .line 6
    :cond_1
    :goto_0
    iget p1, p0, Lr5;->C:I

    if-nez p1, :cond_3

    iget-object p1, p0, Lr5;->M:Lq5;

    invoke-virtual {p1}, Lq5;->n()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lr5;->O:Lq5;

    invoke-virtual {p1}, Lq5;->n()Z

    move-result p1

    if-nez p1, :cond_3

    .line 7
    :cond_2
    iput v2, p0, Lr5;->C:I

    goto :goto_1

    .line 8
    :cond_3
    iget p1, p0, Lr5;->C:I

    if-ne p1, v2, :cond_5

    iget-object p1, p0, Lr5;->L:Lq5;

    invoke-virtual {p1}, Lq5;->n()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lr5;->N:Lq5;

    invoke-virtual {p1}, Lq5;->n()Z

    move-result p1

    if-nez p1, :cond_5

    .line 9
    :cond_4
    iput v0, p0, Lr5;->C:I

    .line 10
    :cond_5
    :goto_1
    iget p1, p0, Lr5;->C:I

    if-ne p1, v1, :cond_8

    .line 11
    iget-object p1, p0, Lr5;->M:Lq5;

    invoke-virtual {p1}, Lq5;->n()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lr5;->O:Lq5;

    invoke-virtual {p1}, Lq5;->n()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lr5;->L:Lq5;

    .line 12
    invoke-virtual {p1}, Lq5;->n()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lr5;->N:Lq5;

    invoke-virtual {p1}, Lq5;->n()Z

    move-result p1

    if-nez p1, :cond_8

    .line 13
    :cond_6
    iget-object p1, p0, Lr5;->M:Lq5;

    invoke-virtual {p1}, Lq5;->n()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lr5;->O:Lq5;

    invoke-virtual {p1}, Lq5;->n()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 14
    iput v0, p0, Lr5;->C:I

    goto :goto_2

    .line 15
    :cond_7
    iget-object p1, p0, Lr5;->L:Lq5;

    invoke-virtual {p1}, Lq5;->n()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lr5;->N:Lq5;

    invoke-virtual {p1}, Lq5;->n()Z

    move-result p1

    if-eqz p1, :cond_8

    .line 16
    iget p1, p0, Lr5;->D:F

    div-float p1, p2, p1

    iput p1, p0, Lr5;->D:F

    .line 17
    iput v2, p0, Lr5;->C:I

    .line 18
    :cond_8
    :goto_2
    iget p1, p0, Lr5;->C:I

    if-ne p1, v1, :cond_a

    .line 19
    iget p1, p0, Lr5;->w:I

    if-lez p1, :cond_9

    iget p3, p0, Lr5;->z:I

    if-nez p3, :cond_9

    .line 20
    iput v0, p0, Lr5;->C:I

    goto :goto_3

    :cond_9
    if-nez p1, :cond_a

    .line 21
    iget p1, p0, Lr5;->z:I

    if-lez p1, :cond_a

    .line 22
    iget p1, p0, Lr5;->D:F

    div-float/2addr p2, p1

    iput p2, p0, Lr5;->D:F

    .line 23
    iput v2, p0, Lr5;->C:I

    :cond_a
    :goto_3
    return-void
.end method

.method public m(Lq5$b;)Lq5;
    .locals 2

    .line 1
    sget-object v0, Lr5$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 2
    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    .line 3
    :pswitch_1
    iget-object p1, p0, Lr5;->R:Lq5;

    return-object p1

    .line 4
    :pswitch_2
    iget-object p1, p0, Lr5;->Q:Lq5;

    return-object p1

    .line 5
    :pswitch_3
    iget-object p1, p0, Lr5;->S:Lq5;

    return-object p1

    .line 6
    :pswitch_4
    iget-object p1, p0, Lr5;->P:Lq5;

    return-object p1

    .line 7
    :pswitch_5
    iget-object p1, p0, Lr5;->O:Lq5;

    return-object p1

    .line 8
    :pswitch_6
    iget-object p1, p0, Lr5;->N:Lq5;

    return-object p1

    .line 9
    :pswitch_7
    iget-object p1, p0, Lr5;->M:Lq5;

    return-object p1

    .line 10
    :pswitch_8
    iget-object p1, p0, Lr5;->L:Lq5;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public m0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5;->n:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lr5;->M:Lq5;

    invoke-virtual {v0}, Lq5;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr5;->O:Lq5;

    invoke-virtual {v0}, Lq5;->m()Z

    move-result v0

    if-eqz v0, :cond_0

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

.method public m1(ZZ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lr5;->d:Lk6;

    invoke-virtual {v0}, Lo6;->k()Z

    move-result v0

    and-int/2addr p1, v0

    .line 2
    iget-object v0, p0, Lr5;->e:Lm6;

    invoke-virtual {v0}, Lo6;->k()Z

    move-result v0

    and-int/2addr p2, v0

    .line 3
    iget-object v0, p0, Lr5;->d:Lk6;

    iget-object v1, v0, Lo6;->h:Le6;

    iget v1, v1, Le6;->g:I

    .line 4
    iget-object v2, p0, Lr5;->e:Lm6;

    iget-object v3, v2, Lo6;->h:Le6;

    iget v3, v3, Le6;->g:I

    .line 5
    iget-object v0, v0, Lo6;->i:Le6;

    iget v0, v0, Le6;->g:I

    .line 6
    iget-object v2, v2, Lo6;->i:Le6;

    iget v2, v2, Le6;->g:I

    sub-int v4, v0, v1

    sub-int v5, v2, v3

    const/4 v6, 0x0

    if-ltz v4, :cond_0

    if-ltz v5, :cond_0

    const/high16 v4, -0x80000000

    if-eq v1, v4, :cond_0

    const v5, 0x7fffffff

    if-eq v1, v5, :cond_0

    if-eq v3, v4, :cond_0

    if-eq v3, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v2, v4, :cond_0

    if-ne v2, v5, :cond_1

    :cond_0
    move v0, v6

    move v1, v0

    move v2, v1

    move v3, v2

    :cond_1
    sub-int/2addr v0, v1

    sub-int/2addr v2, v3

    if-eqz p1, :cond_2

    .line 7
    iput v1, p0, Lr5;->c0:I

    :cond_2
    if-eqz p2, :cond_3

    .line 8
    iput v3, p0, Lr5;->d0:I

    .line 9
    :cond_3
    iget v1, p0, Lr5;->k0:I

    const/16 v3, 0x8

    if-ne v1, v3, :cond_4

    .line 10
    iput v6, p0, Lr5;->Y:I

    .line 11
    iput v6, p0, Lr5;->Z:I

    return-void

    :cond_4
    if-eqz p1, :cond_6

    .line 12
    iget-object p1, p0, Lr5;->W:[Lr5$b;

    aget-object p1, p1, v6

    sget-object v1, Lr5$b;->b:Lr5$b;

    if-ne p1, v1, :cond_5

    iget p1, p0, Lr5;->Y:I

    if-ge v0, p1, :cond_5

    move v0, p1

    .line 13
    :cond_5
    iput v0, p0, Lr5;->Y:I

    .line 14
    iget p1, p0, Lr5;->f0:I

    if-ge v0, p1, :cond_6

    .line 15
    iput p1, p0, Lr5;->Y:I

    :cond_6
    if-eqz p2, :cond_8

    .line 16
    iget-object p1, p0, Lr5;->W:[Lr5$b;

    const/4 p2, 0x1

    aget-object p1, p1, p2

    sget-object p2, Lr5$b;->b:Lr5$b;

    if-ne p1, p2, :cond_7

    iget p1, p0, Lr5;->Z:I

    if-ge v2, p1, :cond_7

    move v2, p1

    .line 17
    :cond_7
    iput v2, p0, Lr5;->Z:I

    .line 18
    iget p1, p0, Lr5;->g0:I

    if-ge v2, p1, :cond_8

    .line 19
    iput p1, p0, Lr5;->Z:I

    :cond_8
    return-void
.end method

.method public n()I
    .locals 1

    .line 1
    iget v0, p0, Lr5;->e0:I

    return v0
.end method

.method public n0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5;->p:Z

    return v0
.end method

.method public n1(Lz4;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr5;->L:Lq5;

    invoke-virtual {p1, v0}, Lz4;->x(Ljava/lang/Object;)I

    move-result v0

    .line 2
    iget-object v1, p0, Lr5;->M:Lq5;

    invoke-virtual {p1, v1}, Lz4;->x(Ljava/lang/Object;)I

    move-result v1

    .line 3
    iget-object v2, p0, Lr5;->N:Lq5;

    invoke-virtual {p1, v2}, Lz4;->x(Ljava/lang/Object;)I

    move-result v2

    .line 4
    iget-object v3, p0, Lr5;->O:Lq5;

    invoke-virtual {p1, v3}, Lz4;->x(Ljava/lang/Object;)I

    move-result p1

    if-eqz p2, :cond_0

    .line 5
    iget-object v3, p0, Lr5;->d:Lk6;

    if-eqz v3, :cond_0

    iget-object v4, v3, Lo6;->h:Le6;

    iget-boolean v5, v4, Le6;->j:Z

    if-eqz v5, :cond_0

    iget-object v3, v3, Lo6;->i:Le6;

    iget-boolean v5, v3, Le6;->j:Z

    if-eqz v5, :cond_0

    .line 6
    iget v0, v4, Le6;->g:I

    .line 7
    iget v2, v3, Le6;->g:I

    :cond_0
    if-eqz p2, :cond_1

    .line 8
    iget-object p2, p0, Lr5;->e:Lm6;

    if-eqz p2, :cond_1

    iget-object v3, p2, Lo6;->h:Le6;

    iget-boolean v4, v3, Le6;->j:Z

    if-eqz v4, :cond_1

    iget-object p2, p2, Lo6;->i:Le6;

    iget-boolean v4, p2, Le6;->j:Z

    if-eqz v4, :cond_1

    .line 9
    iget v1, v3, Le6;->g:I

    .line 10
    iget p1, p2, Le6;->g:I

    :cond_1
    sub-int p2, v2, v0

    sub-int v3, p1, v1

    const/4 v4, 0x0

    if-ltz p2, :cond_2

    if-ltz v3, :cond_2

    const/high16 p2, -0x80000000

    if-eq v0, p2, :cond_2

    const v3, 0x7fffffff

    if-eq v0, v3, :cond_2

    if-eq v1, p2, :cond_2

    if-eq v1, v3, :cond_2

    if-eq v2, p2, :cond_2

    if-eq v2, v3, :cond_2

    if-eq p1, p2, :cond_2

    if-ne p1, v3, :cond_3

    :cond_2
    move p1, v4

    move v0, p1

    move v1, v0

    move v2, v1

    .line 11
    :cond_3
    invoke-virtual {p0, v0, v1, v2, p1}, Lr5;->G0(IIII)V

    return-void
.end method

.method public o(I)F
    .locals 1

    if-nez p1, :cond_0

    .line 1
    iget p1, p0, Lr5;->h0:F

    return p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 2
    iget p1, p0, Lr5;->i0:F

    return p1

    :cond_1
    const/high16 p1, -0x40800000    # -1.0f

    return p1
.end method

.method public o0()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lr5;->o:Z

    return-void
.end method

.method public p()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lr5;->W()I

    move-result v0

    iget v1, p0, Lr5;->Z:I

    add-int/2addr v0, v1

    return v0
.end method

.method public p0()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lr5;->p:Z

    return-void
.end method

.method public q()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5;->j0:Ljava/lang/Object;

    return-object v0
.end method

.method public q0()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lr5;->W:[Lr5$b;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    sget-object v3, Lr5$b;->d:Lr5$b;

    const/4 v4, 0x1

    if-ne v2, v3, :cond_0

    aget-object v0, v0, v4

    if-ne v0, v3, :cond_0

    move v1, v4

    :cond_0
    return v1
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5;->l0:Ljava/lang/String;

    return-object v0
.end method

.method public r0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lr5;->L:Lq5;

    invoke-virtual {v0}, Lq5;->p()V

    .line 2
    iget-object v0, p0, Lr5;->M:Lq5;

    invoke-virtual {v0}, Lq5;->p()V

    .line 3
    iget-object v0, p0, Lr5;->N:Lq5;

    invoke-virtual {v0}, Lq5;->p()V

    .line 4
    iget-object v0, p0, Lr5;->O:Lq5;

    invoke-virtual {v0}, Lq5;->p()V

    .line 5
    iget-object v0, p0, Lr5;->P:Lq5;

    invoke-virtual {v0}, Lq5;->p()V

    .line 6
    iget-object v0, p0, Lr5;->Q:Lq5;

    invoke-virtual {v0}, Lq5;->p()V

    .line 7
    iget-object v0, p0, Lr5;->R:Lq5;

    invoke-virtual {v0}, Lq5;->p()V

    .line 8
    iget-object v0, p0, Lr5;->S:Lq5;

    invoke-virtual {v0}, Lq5;->p()V

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lr5;->X:Lr5;

    const/4 v1, 0x0

    .line 10
    iput v1, p0, Lr5;->F:F

    const/4 v2, 0x0

    .line 11
    iput v2, p0, Lr5;->Y:I

    .line 12
    iput v2, p0, Lr5;->Z:I

    .line 13
    iput v1, p0, Lr5;->a0:F

    const/4 v1, -0x1

    .line 14
    iput v1, p0, Lr5;->b0:I

    .line 15
    iput v2, p0, Lr5;->c0:I

    .line 16
    iput v2, p0, Lr5;->d0:I

    .line 17
    iput v2, p0, Lr5;->e0:I

    .line 18
    iput v2, p0, Lr5;->f0:I

    .line 19
    iput v2, p0, Lr5;->g0:I

    .line 20
    sget v3, Lr5;->u0:F

    iput v3, p0, Lr5;->h0:F

    .line 21
    iput v3, p0, Lr5;->i0:F

    .line 22
    iget-object v3, p0, Lr5;->W:[Lr5$b;

    sget-object v4, Lr5$b;->b:Lr5$b;

    aput-object v4, v3, v2

    const/4 v5, 0x1

    .line 23
    aput-object v4, v3, v5

    .line 24
    iput-object v0, p0, Lr5;->j0:Ljava/lang/Object;

    .line 25
    iput v2, p0, Lr5;->k0:I

    .line 26
    iput-object v0, p0, Lr5;->m0:Ljava/lang/String;

    .line 27
    iput v2, p0, Lr5;->n0:I

    .line 28
    iput v2, p0, Lr5;->o0:I

    .line 29
    iget-object v0, p0, Lr5;->p0:[F

    const/high16 v3, -0x40800000    # -1.0f

    aput v3, v0, v2

    .line 30
    aput v3, v0, v5

    .line 31
    iput v1, p0, Lr5;->q:I

    .line 32
    iput v1, p0, Lr5;->r:I

    .line 33
    iget-object v0, p0, Lr5;->E:[I

    const v3, 0x7fffffff

    aput v3, v0, v2

    .line 34
    aput v3, v0, v5

    .line 35
    iput v2, p0, Lr5;->t:I

    .line 36
    iput v2, p0, Lr5;->u:I

    const/high16 v0, 0x3f800000    # 1.0f

    .line 37
    iput v0, p0, Lr5;->y:F

    .line 38
    iput v0, p0, Lr5;->B:F

    .line 39
    iput v3, p0, Lr5;->x:I

    .line 40
    iput v3, p0, Lr5;->A:I

    .line 41
    iput v2, p0, Lr5;->w:I

    .line 42
    iput v2, p0, Lr5;->z:I

    .line 43
    iput v1, p0, Lr5;->C:I

    .line 44
    iput v0, p0, Lr5;->D:F

    .line 45
    iget-object v0, p0, Lr5;->f:[Z

    aput-boolean v5, v0, v2

    .line 46
    aput-boolean v5, v0, v5

    .line 47
    iput-boolean v2, p0, Lr5;->I:Z

    .line 48
    iget-object v0, p0, Lr5;->V:[Z

    aput-boolean v2, v0, v2

    .line 49
    aput-boolean v2, v0, v5

    .line 50
    iput-boolean v5, p0, Lr5;->g:Z

    .line 51
    iget-object v0, p0, Lr5;->v:[I

    aput v2, v0, v2

    .line 52
    aput v2, v0, v5

    .line 53
    iput v1, p0, Lr5;->j:I

    .line 54
    iput v1, p0, Lr5;->k:I

    return-void
.end method

.method public s(I)Lr5$b;
    .locals 1

    if-nez p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lr5;->y()Lr5$b;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 2
    invoke-virtual {p0}, Lr5;->R()Lr5$b;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public s0()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lr5;->m:Z

    .line 2
    iput-boolean v0, p0, Lr5;->n:Z

    .line 3
    iput-boolean v0, p0, Lr5;->o:Z

    .line 4
    iput-boolean v0, p0, Lr5;->p:Z

    .line 5
    iget-object v1, p0, Lr5;->U:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 6
    iget-object v2, p0, Lr5;->U:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq5;

    .line 7
    invoke-virtual {v2}, Lq5;->q()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t()F
    .locals 1

    .line 1
    iget v0, p0, Lr5;->a0:F

    return v0
.end method

.method public t0(Ly4;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr5;->L:Lq5;

    invoke-virtual {v0, p1}, Lq5;->r(Ly4;)V

    .line 2
    iget-object v0, p0, Lr5;->M:Lq5;

    invoke-virtual {v0, p1}, Lq5;->r(Ly4;)V

    .line 3
    iget-object v0, p0, Lr5;->N:Lq5;

    invoke-virtual {v0, p1}, Lq5;->r(Ly4;)V

    .line 4
    iget-object v0, p0, Lr5;->O:Lq5;

    invoke-virtual {v0, p1}, Lq5;->r(Ly4;)V

    .line 5
    iget-object v0, p0, Lr5;->P:Lq5;

    invoke-virtual {v0, p1}, Lq5;->r(Ly4;)V

    .line 6
    iget-object v0, p0, Lr5;->S:Lq5;

    invoke-virtual {v0, p1}, Lq5;->r(Ly4;)V

    .line 7
    iget-object v0, p0, Lr5;->Q:Lq5;

    invoke-virtual {v0, p1}, Lq5;->r(Ly4;)V

    .line 8
    iget-object v0, p0, Lr5;->R:Lq5;

    invoke-virtual {v0, p1}, Lq5;->r(Ly4;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lr5;->m0:Ljava/lang/String;

    const v2, 0x3d1c

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x3d1d

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x3d1e

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lr5;->m0:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr5;->l0:Ljava/lang/String;

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0x3d1f

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lr5;->l0:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x3d20

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lr5;->c0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v1, 0x3d21

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lr5;->d0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v1, 0x3d22

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lr5;->Y:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v1, 0x3d23

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lr5;->Z:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v1, 0x3d24

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()I
    .locals 1

    .line 1
    iget v0, p0, Lr5;->b0:I

    return v0
.end method

.method public final u0(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V
    .locals 0

    cmpl-float p4, p3, p4

    if-nez p4, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const p2, 0x3d25

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const p2, 0x3d26

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public v()I
    .locals 2

    .line 1
    iget v0, p0, Lr5;->k0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget v0, p0, Lr5;->Z:I

    return v0
.end method

.method public final v0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V
    .locals 0

    if-ne p3, p4, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const p2, 0x3d27

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const p2, 0x3d28

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public w()F
    .locals 1

    .line 1
    iget v0, p0, Lr5;->h0:F

    return v0
.end method

.method public final w0(Ljava/lang/StringBuilder;Ljava/lang/String;FI)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-nez v0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const p2, 0x3d29

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const p2, 0x3d2a

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const p2, 0x3d2b

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 6
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const p2, 0x3d2c

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 7
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public x()I
    .locals 1

    .line 1
    iget v0, p0, Lr5;->n0:I

    return v0
.end method

.method public x0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr5;->e0:I

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    :goto_0
    iput-boolean p1, p0, Lr5;->G:Z

    return-void
.end method

.method public y()Lr5$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lr5;->W:[Lr5$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public y0(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr5;->j0:Ljava/lang/Object;

    return-void
.end method

.method public z()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr5;->L:Lq5;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget v0, v0, Lq5;->g:I

    add-int/2addr v1, v0

    .line 3
    :cond_0
    iget-object v0, p0, Lr5;->N:Lq5;

    if-eqz v0, :cond_1

    .line 4
    iget v0, v0, Lq5;->g:I

    add-int/2addr v1, v0

    :cond_1
    return v1
.end method

.method public z0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr5;->l0:Ljava/lang/String;

    return-void
.end method
