.class public Le5;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le5$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Le5;",
        ">;"
    }
.end annotation


# static fields
.field public static r:I


# instance fields
.field public b:Z

.field public c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:I

.field public g:F

.field public h:Z

.field public i:[F

.field public j:[F

.field public k:Le5$a;

.field public l:[Lx4;

.field public m:I

.field public n:I

.field public o:Z

.field public p:I

.field public q:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Le5;

    const v1, 0x172

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>(Le5$a;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, -0x1

    .line 2
    iput p2, p0, Le5;->d:I

    .line 3
    iput p2, p0, Le5;->e:I

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Le5;->f:I

    .line 5
    iput-boolean v0, p0, Le5;->h:Z

    const/16 v1, 0x9

    new-array v2, v1, [F

    .line 6
    iput-object v2, p0, Le5;->i:[F

    new-array v1, v1, [F

    .line 7
    iput-object v1, p0, Le5;->j:[F

    const/16 v1, 0x10

    new-array v1, v1, [Lx4;

    .line 8
    iput-object v1, p0, Le5;->l:[Lx4;

    .line 9
    iput v0, p0, Le5;->m:I

    .line 10
    iput v0, p0, Le5;->n:I

    .line 11
    iput-boolean v0, p0, Le5;->o:Z

    .line 12
    iput p2, p0, Le5;->p:I

    const/4 p2, 0x0

    .line 13
    iput p2, p0, Le5;->q:F

    .line 14
    iput-object p1, p0, Le5;->k:Le5$a;

    return-void
.end method

.method public static c()V
    .locals 1

    .line 1
    sget v0, Le5;->r:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Le5;->r:I

    return-void
.end method


# virtual methods
.method public final a(Lx4;)V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget v1, p0, Le5;->m:I

    if-ge v0, v1, :cond_1

    .line 2
    iget-object v1, p0, Le5;->l:[Lx4;

    aget-object v1, v1, v0

    if-ne v1, p1, :cond_0

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3
    :cond_1
    iget-object v0, p0, Le5;->l:[Lx4;

    array-length v2, v0

    if-lt v1, v2, :cond_2

    .line 4
    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx4;

    iput-object v0, p0, Le5;->l:[Lx4;

    .line 5
    :cond_2
    iget-object v0, p0, Le5;->l:[Lx4;

    iget v1, p0, Le5;->m:I

    aput-object p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 6
    iput v1, p0, Le5;->m:I

    return-void
.end method

.method public b(Le5;)I
    .locals 1

    .line 1
    iget v0, p0, Le5;->d:I

    iget p1, p1, Le5;->d:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Le5;

    invoke-virtual {p0, p1}, Le5;->b(Le5;)I

    move-result p1

    return p1
.end method

.method public final d(Lx4;)V
    .locals 4

    .line 1
    iget v0, p0, Le5;->m:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 2
    iget-object v2, p0, Le5;->l:[Lx4;

    aget-object v2, v2, v1

    if-ne v2, p1, :cond_1

    :goto_1
    add-int/lit8 p1, v0, -0x1

    if-ge v1, p1, :cond_0

    .line 3
    iget-object p1, p0, Le5;->l:[Lx4;

    add-int/lit8 v2, v1, 0x1

    aget-object v3, p1, v2

    aput-object v3, p1, v1

    move v1, v2

    goto :goto_1

    .line 4
    :cond_0
    iget p1, p0, Le5;->m:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Le5;->m:I

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public e()V
    .locals 6

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Le5;->c:Ljava/lang/String;

    .line 2
    sget-object v1, Le5$a;->f:Le5$a;

    iput-object v1, p0, Le5;->k:Le5$a;

    const/4 v1, 0x0

    .line 3
    iput v1, p0, Le5;->f:I

    const/4 v2, -0x1

    .line 4
    iput v2, p0, Le5;->d:I

    .line 5
    iput v2, p0, Le5;->e:I

    const/4 v3, 0x0

    .line 6
    iput v3, p0, Le5;->g:F

    .line 7
    iput-boolean v1, p0, Le5;->h:Z

    .line 8
    iput-boolean v1, p0, Le5;->o:Z

    .line 9
    iput v2, p0, Le5;->p:I

    .line 10
    iput v3, p0, Le5;->q:F

    .line 11
    iget v2, p0, Le5;->m:I

    move v4, v1

    :goto_0
    if-ge v4, v2, :cond_0

    .line 12
    iget-object v5, p0, Le5;->l:[Lx4;

    aput-object v0, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 13
    :cond_0
    iput v1, p0, Le5;->m:I

    .line 14
    iput v1, p0, Le5;->n:I

    .line 15
    iput-boolean v1, p0, Le5;->b:Z

    .line 16
    iget-object v0, p0, Le5;->j:[F

    invoke-static {v0, v3}, Ljava/util/Arrays;->fill([FF)V

    return-void
.end method

.method public f(Lz4;F)V
    .locals 3

    .line 1
    iput p2, p0, Le5;->g:F

    const/4 p2, 0x1

    .line 2
    iput-boolean p2, p0, Le5;->h:Z

    const/4 p2, 0x0

    .line 3
    iput-boolean p2, p0, Le5;->o:Z

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Le5;->p:I

    const/4 v1, 0x0

    .line 5
    iput v1, p0, Le5;->q:F

    .line 6
    iget v1, p0, Le5;->m:I

    .line 7
    iput v0, p0, Le5;->e:I

    move v0, p2

    :goto_0
    if-ge v0, v1, :cond_0

    .line 8
    iget-object v2, p0, Le5;->l:[Lx4;

    aget-object v2, v2, v0

    invoke-virtual {v2, p1, p0, p2}, Lx4;->A(Lz4;Le5;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 9
    :cond_0
    iput p2, p0, Le5;->m:I

    return-void
.end method

.method public g(Le5$a;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le5;->k:Le5$a;

    return-void
.end method

.method public final h(Lz4;Lx4;)V
    .locals 4

    .line 1
    iget v0, p0, Le5;->m:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    .line 2
    iget-object v3, p0, Le5;->l:[Lx4;

    aget-object v3, v3, v2

    invoke-virtual {v3, p1, p2, v1}, Lx4;->B(Lz4;Lx4;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 3
    :cond_0
    iput v1, p0, Le5;->m:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Le5;->c:Ljava/lang/String;

    const v1, 0xcf7

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le5;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le5;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
