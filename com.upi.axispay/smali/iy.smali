.class public final Liy;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Liy$a;
    }
.end annotation


# static fields
.field public static final n:I

.field public static o:Z

.field public static p:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "Landroid/text/StaticLayout;",
            ">;"
        }
    .end annotation
.end field

.field public static q:Ljava/lang/Object;


# instance fields
.field public a:Ljava/lang/CharSequence;

.field public final b:Landroid/text/TextPaint;

.field public final c:I

.field public d:I

.field public e:I

.field public f:Landroid/text/Layout$Alignment;

.field public g:I

.field public h:F

.field public i:F

.field public j:I

.field public k:Z

.field public l:Z

.field public m:Landroid/text/TextUtils$TruncateAt;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput v0, Liy;->n:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Liy;->a:Ljava/lang/CharSequence;

    .line 3
    iput-object p2, p0, Liy;->b:Landroid/text/TextPaint;

    .line 4
    iput p3, p0, Liy;->c:I

    const/4 p2, 0x0

    .line 5
    iput p2, p0, Liy;->d:I

    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    iput p1, p0, Liy;->e:I

    .line 7
    sget-object p1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    iput-object p1, p0, Liy;->f:Landroid/text/Layout$Alignment;

    const p1, 0x7fffffff

    .line 8
    iput p1, p0, Liy;->g:I

    const/4 p1, 0x0

    .line 9
    iput p1, p0, Liy;->h:F

    const/high16 p1, 0x3f800000    # 1.0f

    .line 10
    iput p1, p0, Liy;->i:F

    .line 11
    sget p1, Liy;->n:I

    iput p1, p0, Liy;->j:I

    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Liy;->k:Z

    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Liy;->m:Landroid/text/TextUtils$TruncateAt;

    return-void
.end method

.method public static c(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)Liy;
    .locals 1

    .line 1
    new-instance v0, Liy;

    invoke-direct {v0, p0, p1, p2}, Liy;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/text/StaticLayout;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Liy$a;
        }
    .end annotation

    .line 1
    iget-object v1, p0, Liy;->a:Ljava/lang/CharSequence;

    if-nez v1, :cond_0

    const v0, 0x2539

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    iput-object v1, p0, Liy;->a:Ljava/lang/CharSequence;

    .line 3
    :cond_0
    iget v1, p0, Liy;->c:I

    const/4 v2, 0x0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 4
    iget-object v3, p0, Liy;->a:Ljava/lang/CharSequence;

    .line 5
    iget v4, p0, Liy;->g:I

    const/4 v5, 0x1

    if-ne v4, v5, :cond_1

    .line 6
    iget-object v4, p0, Liy;->b:Landroid/text/TextPaint;

    int-to-float v6, v1

    iget-object v7, p0, Liy;->m:Landroid/text/TextUtils$TruncateAt;

    invoke-static {v3, v4, v6, v7}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    move-result-object v3

    .line 7
    :cond_1
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    iget v6, p0, Liy;->e:I

    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    move-result v4

    iput v4, p0, Liy;->e:I

    .line 8
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x17

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    if-lt v6, v7, :cond_8

    .line 9
    iget-boolean v2, p0, Liy;->l:Z

    if-eqz v2, :cond_2

    iget v2, p0, Liy;->g:I

    if-ne v2, v5, :cond_2

    .line 10
    sget-object v2, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    iput-object v2, p0, Liy;->f:Landroid/text/Layout$Alignment;

    .line 11
    :cond_2
    iget v2, p0, Liy;->d:I

    iget-object v6, p0, Liy;->b:Landroid/text/TextPaint;

    .line 12
    invoke-static {v3, v2, v4, v6, v1}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object v1

    .line 13
    iget-object v2, p0, Liy;->f:Landroid/text/Layout$Alignment;

    invoke-virtual {v1, v2}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    .line 14
    iget-boolean v2, p0, Liy;->k:Z

    invoke-virtual {v1, v2}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    .line 15
    iget-boolean v2, p0, Liy;->l:Z

    if-eqz v2, :cond_3

    sget-object v2, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    goto :goto_0

    :cond_3
    sget-object v2, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    .line 16
    :goto_0
    invoke-virtual {v1, v2}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    .line 17
    iget-object v2, p0, Liy;->m:Landroid/text/TextUtils$TruncateAt;

    if-eqz v2, :cond_4

    .line 18
    invoke-virtual {v1, v2}, Landroid/text/StaticLayout$Builder;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)Landroid/text/StaticLayout$Builder;

    .line 19
    :cond_4
    iget v2, p0, Liy;->g:I

    invoke-virtual {v1, v2}, Landroid/text/StaticLayout$Builder;->setMaxLines(I)Landroid/text/StaticLayout$Builder;

    .line 20
    iget v2, p0, Liy;->h:F

    cmpl-float v3, v2, v9

    if-nez v3, :cond_5

    iget v3, p0, Liy;->i:F

    cmpl-float v3, v3, v8

    if-eqz v3, :cond_6

    .line 21
    :cond_5
    iget v3, p0, Liy;->i:F

    invoke-virtual {v1, v2, v3}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    .line 22
    :cond_6
    iget v2, p0, Liy;->g:I

    if-le v2, v5, :cond_7

    .line 23
    iget v2, p0, Liy;->j:I

    invoke-virtual {v1, v2}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    .line 24
    :cond_7
    invoke-virtual {v1}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    move-result-object v1

    return-object v1

    .line 25
    :cond_8
    invoke-virtual {p0}, Liy;->b()V

    .line 26
    :try_start_0
    sget-object v4, Liy;->p:Ljava/lang/reflect/Constructor;

    invoke-static {v4}, Ldb;->e(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v4, Ljava/lang/reflect/Constructor;

    const/16 v6, 0xd

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v3, v6, v2

    iget v2, p0, Liy;->d:I

    .line 27
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v6, v5

    const/4 v2, 0x2

    iget v3, p0, Liy;->e:I

    .line 28
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v6, v2

    const/4 v2, 0x3

    iget-object v3, p0, Liy;->b:Landroid/text/TextPaint;

    aput-object v3, v6, v2

    const/4 v2, 0x4

    .line 29
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v6, v2

    const/4 v2, 0x5

    iget-object v3, p0, Liy;->f:Landroid/text/Layout$Alignment;

    aput-object v3, v6, v2

    const/4 v2, 0x6

    sget-object v3, Liy;->q:Ljava/lang/Object;

    .line 30
    invoke-static {v3}, Ldb;->e(Ljava/lang/Object;)Ljava/lang/Object;

    aput-object v3, v6, v2

    const/4 v2, 0x7

    .line 31
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    aput-object v3, v6, v2

    const/16 v2, 0x8

    .line 32
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    aput-object v3, v6, v2

    const/16 v2, 0x9

    iget-boolean v3, p0, Liy;->k:Z

    .line 33
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v6, v2

    const/16 v2, 0xa

    const/4 v3, 0x0

    aput-object v3, v6, v2

    const/16 v2, 0xb

    .line 34
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v6, v2

    const/16 v1, 0xc

    iget v2, p0, Liy;->g:I

    .line 35
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v6, v1

    .line 36
    invoke-virtual {v4, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/text/StaticLayout;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    .line 37
    new-instance v2, Liy$a;

    invoke-direct {v2, v1}, Liy$a;-><init>(Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final b()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Liy$a;
        }
    .end annotation

    .line 1
    sget-boolean v1, Liy;->o:Z

    if-eqz v1, :cond_0

    return-void

    .line 2
    :cond_0
    :try_start_0
    iget-boolean v1, p0, Liy;->l:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-lt v1, v4, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    move v1, v2

    .line 3
    :goto_0
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x12

    if-lt v4, v5, :cond_3

    .line 4
    const-class v4, Landroid/text/TextDirectionHeuristic;

    if-eqz v1, :cond_2

    .line 5
    sget-object v1, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    goto :goto_1

    :cond_2
    sget-object v1, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    :goto_1
    sput-object v1, Liy;->q:Ljava/lang/Object;

    goto :goto_3

    .line 6
    :cond_3
    const-class v1, Liy;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    .line 7
    iget-boolean v4, p0, Liy;->l:Z

    if-eqz v4, :cond_4

    const v0, 0x253a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_4
    const v0, 0x253b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    :goto_2
    const v0, 0x253c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 8
    invoke-virtual {v1, v5}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const v0, 0x253d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 9
    invoke-virtual {v1, v6}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 10
    invoke-virtual {v1, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sput-object v1, Liy;->q:Ljava/lang/Object;

    move-object v4, v5

    :goto_3
    const/16 v1, 0xd

    new-array v1, v1, [Ljava/lang/Class;

    .line 11
    const-class v5, Ljava/lang/CharSequence;

    aput-object v5, v1, v2

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, v3

    const/4 v5, 0x2

    aput-object v2, v1, v5

    const/4 v5, 0x3

    const-class v6, Landroid/text/TextPaint;

    aput-object v6, v1, v5

    const/4 v5, 0x4

    aput-object v2, v1, v5

    const/4 v5, 0x5

    const-class v6, Landroid/text/Layout$Alignment;

    aput-object v6, v1, v5

    const/4 v5, 0x6

    aput-object v4, v1, v5

    const/4 v4, 0x7

    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v5, v1, v4

    const/16 v4, 0x8

    aput-object v5, v1, v4

    const/16 v4, 0x9

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v5, v1, v4

    const/16 v4, 0xa

    const-class v5, Landroid/text/TextUtils$TruncateAt;

    aput-object v5, v1, v4

    const/16 v4, 0xb

    aput-object v2, v1, v4

    const/16 v4, 0xc

    aput-object v2, v1, v4

    .line 12
    const-class v2, Landroid/text/StaticLayout;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    sput-object v1, Liy;->p:Ljava/lang/reflect/Constructor;

    .line 13
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 14
    sput-boolean v3, Liy;->o:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    .line 15
    new-instance v2, Liy$a;

    invoke-direct {v2, v1}, Liy$a;-><init>(Ljava/lang/Throwable;)V

    throw v2
.end method

.method public d(Landroid/text/Layout$Alignment;)Liy;
    .locals 0

    .line 1
    iput-object p1, p0, Liy;->f:Landroid/text/Layout$Alignment;

    return-object p0
.end method

.method public e(Landroid/text/TextUtils$TruncateAt;)Liy;
    .locals 0

    .line 1
    iput-object p1, p0, Liy;->m:Landroid/text/TextUtils$TruncateAt;

    return-object p0
.end method

.method public f(I)Liy;
    .locals 0

    .line 1
    iput p1, p0, Liy;->j:I

    return-object p0
.end method

.method public g(Z)Liy;
    .locals 0

    .line 1
    iput-boolean p1, p0, Liy;->k:Z

    return-object p0
.end method

.method public h(Z)Liy;
    .locals 0

    .line 1
    iput-boolean p1, p0, Liy;->l:Z

    return-object p0
.end method

.method public i(FF)Liy;
    .locals 0

    .line 1
    iput p1, p0, Liy;->h:F

    .line 2
    iput p2, p0, Liy;->i:F

    return-object p0
.end method

.method public j(I)Liy;
    .locals 0

    .line 1
    iput p1, p0, Liy;->g:I

    return-object p0
.end method
