.class public final Lrn0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/util/Iterator;
.implements Lom0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrn0;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lrm0;",
        ">;",
        "Lom0;"
    }
.end annotation


# instance fields
.field public b:I

.field public c:I

.field public d:I

.field public e:Lrm0;

.field public f:I

.field public final synthetic g:Lrn0;


# direct methods
.method public constructor <init>(Lrn0;)V
    .locals 2

    iput-object p1, p0, Lrn0$a;->g:Lrn0;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lrn0$a;->b:I

    .line 3
    invoke-static {p1}, Lrn0;->e(Lrn0;)I

    move-result v0

    invoke-static {p1}, Lrn0;->c(Lrn0;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Ltm0;->e(III)I

    move-result p1

    iput p1, p0, Lrn0$a;->c:I

    .line 4
    iput p1, p0, Lrn0$a;->d:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget v0, p0, Lrn0$a;->d:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    .line 2
    iput v1, p0, Lrn0$a;->b:I

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lrn0$a;->e:Lrm0;

    goto/16 :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lrn0$a;->g:Lrn0;

    invoke-static {v0}, Lrn0;->d(Lrn0;)I

    move-result v0

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-lez v0, :cond_1

    iget v0, p0, Lrn0$a;->f:I

    add-int/2addr v0, v3

    iput v0, p0, Lrn0$a;->f:I

    iget-object v4, p0, Lrn0$a;->g:Lrn0;

    invoke-static {v4}, Lrn0;->d(Lrn0;)I

    move-result v4

    if-ge v0, v4, :cond_2

    :cond_1
    iget v0, p0, Lrn0$a;->d:I

    iget-object v4, p0, Lrn0$a;->g:Lrn0;

    invoke-static {v4}, Lrn0;->c(Lrn0;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-le v0, v4, :cond_3

    .line 5
    :cond_2
    new-instance v0, Lrm0;

    iget v1, p0, Lrn0$a;->c:I

    iget-object v4, p0, Lrn0$a;->g:Lrn0;

    invoke-static {v4}, Lrn0;->c(Lrn0;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Lco0;->G(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-direct {v0, v1, v4}, Lrm0;-><init>(II)V

    iput-object v0, p0, Lrn0$a;->e:Lrm0;

    .line 6
    iput v2, p0, Lrn0$a;->d:I

    goto :goto_0

    .line 7
    :cond_3
    iget-object v0, p0, Lrn0$a;->g:Lrn0;

    invoke-static {v0}, Lrn0;->b(Lrn0;)Lhl0;

    move-result-object v0

    iget-object v4, p0, Lrn0$a;->g:Lrn0;

    invoke-static {v4}, Lrn0;->c(Lrn0;)Ljava/lang/CharSequence;

    move-result-object v4

    iget v5, p0, Lrn0$a;->d:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Lhl0;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgi0;

    if-nez v0, :cond_4

    .line 8
    new-instance v0, Lrm0;

    iget v1, p0, Lrn0$a;->c:I

    iget-object v4, p0, Lrn0$a;->g:Lrn0;

    invoke-static {v4}, Lrn0;->c(Lrn0;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Lco0;->G(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-direct {v0, v1, v4}, Lrm0;-><init>(II)V

    iput-object v0, p0, Lrn0$a;->e:Lrm0;

    .line 9
    iput v2, p0, Lrn0$a;->d:I

    goto :goto_0

    .line 10
    :cond_4
    invoke-virtual {v0}, Lgi0;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0}, Lgi0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 11
    iget v4, p0, Lrn0$a;->c:I

    invoke-static {v4, v2}, Ltm0;->h(II)Lrm0;

    move-result-object v4

    iput-object v4, p0, Lrn0$a;->e:Lrm0;

    add-int/2addr v2, v0

    .line 12
    iput v2, p0, Lrn0$a;->c:I

    if-nez v0, :cond_5

    move v1, v3

    :cond_5
    add-int/2addr v2, v1

    .line 13
    iput v2, p0, Lrn0$a;->d:I

    .line 14
    :goto_0
    iput v3, p0, Lrn0$a;->b:I

    :goto_1
    return-void
.end method

.method public b()Lrm0;
    .locals 3

    .line 1
    iget v0, p0, Lrn0$a;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lrn0$a;->a()V

    .line 3
    :cond_0
    iget v0, p0, Lrn0$a;->b:I

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lrn0$a;->e:Lrm0;

    const v2, 0x3240

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v2, 0x0

    .line 5
    iput-object v2, p0, Lrn0$a;->e:Lrm0;

    .line 6
    iput v1, p0, Lrn0$a;->b:I

    return-object v0

    .line 7
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lrn0$a;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lrn0$a;->a()V

    .line 3
    :cond_0
    iget v0, p0, Lrn0$a;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrn0$a;->b()Lrm0;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const v1, 0x3241

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
