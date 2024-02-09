.class public final Lzp;
.super Lkq;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzp$b;
    }
.end annotation


# instance fields
.field public final a:Llq;

.field public final b:Ljava/lang/String;

.field public final c:Lwo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwo<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:Lyo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyo<",
            "*[B>;"
        }
    .end annotation
.end field

.field public final e:Lvo;


# direct methods
.method public constructor <init>(Llq;Ljava/lang/String;Lwo;Lyo;Lvo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llq;",
            "Ljava/lang/String;",
            "Lwo<",
            "*>;",
            "Lyo<",
            "*[B>;",
            "Lvo;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Lkq;-><init>()V

    .line 3
    iput-object p1, p0, Lzp;->a:Llq;

    .line 4
    iput-object p2, p0, Lzp;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lzp;->c:Lwo;

    .line 6
    iput-object p4, p0, Lzp;->d:Lyo;

    .line 7
    iput-object p5, p0, Lzp;->e:Lvo;

    return-void
.end method

.method public synthetic constructor <init>(Llq;Ljava/lang/String;Lwo;Lyo;Lvo;Lzp$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lzp;-><init>(Llq;Ljava/lang/String;Lwo;Lyo;Lvo;)V

    return-void
.end method


# virtual methods
.method public b()Lvo;
    .locals 1

    .line 1
    iget-object v0, p0, Lzp;->e:Lvo;

    return-object v0
.end method

.method public c()Lwo;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwo<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lzp;->c:Lwo;

    return-object v0
.end method

.method public e()Lyo;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lyo<",
            "*[B>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lzp;->d:Lyo;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lkq;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 2
    check-cast p1, Lkq;

    .line 3
    iget-object v1, p0, Lzp;->a:Llq;

    invoke-virtual {p1}, Lkq;->f()Llq;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lzp;->b:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Lkq;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lzp;->c:Lwo;

    .line 5
    invoke-virtual {p1}, Lkq;->c()Lwo;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lzp;->d:Lyo;

    .line 6
    invoke-virtual {p1}, Lkq;->e()Lyo;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lzp;->e:Lvo;

    .line 7
    invoke-virtual {p1}, Lkq;->b()Lvo;

    move-result-object p1

    invoke-virtual {v1, p1}, Lvo;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public f()Llq;
    .locals 1

    .line 1
    iget-object v0, p0, Lzp;->a:Llq;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lzp;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lzp;->a:Llq;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    .line 2
    iget-object v2, p0, Lzp;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 3
    iget-object v2, p0, Lzp;->c:Lwo;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 4
    iget-object v2, p0, Lzp;->d:Lyo;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 5
    iget-object v1, p0, Lzp;->e:Lvo;

    invoke-virtual {v1}, Lvo;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x2386

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzp;->a:Llq;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v1, 0x2387

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzp;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x2388

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzp;->c:Lwo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v1, 0x2389

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzp;->d:Lyo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v1, 0x238a

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzp;->e:Lvo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v1, 0x238b

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
