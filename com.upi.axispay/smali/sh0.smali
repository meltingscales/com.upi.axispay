.class public final Lsh0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lnh0$a;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnh0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:I

.field public final c:Llh0;


# direct methods
.method public constructor <init>(Ljava/util/List;ILlh0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnh0;",
            ">;I",
            "Llh0;",
            ")V"
        }
    .end annotation

    const v0, 0x819

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x81a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsh0;->a:Ljava/util/List;

    iput p2, p0, Lsh0;->b:I

    iput-object p3, p0, Lsh0;->c:Llh0;

    return-void
.end method


# virtual methods
.method public a(Llh0;)Lmh0;
    .locals 3

    const v0, 0x81b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget v0, p0, Lsh0;->b:I

    iget-object v1, p0, Lsh0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2
    new-instance v0, Lsh0;

    iget-object v1, p0, Lsh0;->a:Ljava/util/List;

    iget v2, p0, Lsh0;->b:I

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v0, v1, v2, p1}, Lsh0;-><init>(Ljava/util/List;ILlh0;)V

    .line 3
    iget-object p1, p0, Lsh0;->a:Ljava/util/List;

    iget v1, p0, Lsh0;->b:I

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnh0;

    .line 4
    invoke-interface {p1, v0}, Lnh0;->intercept(Lnh0$a;)Lmh0;

    move-result-object p1

    return-object p1

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const v0, 0x81c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public request()Llh0;
    .locals 1

    .line 1
    iget-object v0, p0, Lsh0;->c:Llh0;

    return-object v0
.end method
