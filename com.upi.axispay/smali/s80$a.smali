.class public final Ls80$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls80;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ln80$e;

.field public final b:Landroid/graphics/Bitmap;

.field public final c:Lokio/Source;

.field public final d:I


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Ln80$e;)V
    .locals 2

    const v0, 0x12ab

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-static {p1, v0}, Lx80;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Landroid/graphics/Bitmap;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, p2, v1}, Ls80$a;-><init>(Landroid/graphics/Bitmap;Lokio/Source;Ln80$e;I)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;Lokio/Source;Ln80$e;I)V
    .locals 3

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-eq v2, v0, :cond_2

    .line 4
    iput-object p1, p0, Ls80$a;->b:Landroid/graphics/Bitmap;

    .line 5
    iput-object p2, p0, Ls80$a;->c:Lokio/Source;

    const p1, 0x12ac

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-static {p3, p1}, Lx80;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p3, Ln80$e;

    iput-object p3, p0, Ls80$a;->a:Ln80$e;

    .line 7
    iput p4, p0, Ls80$a;->d:I

    return-void

    .line 8
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public constructor <init>(Lokio/Source;Ln80$e;)V
    .locals 2

    const v0, 0x12ad

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {p1, v0}, Lx80;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lokio/Source;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Ls80$a;-><init>(Landroid/graphics/Bitmap;Lokio/Source;Ln80$e;I)V

    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Ls80$a;->b:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Ls80$a;->d:I

    return v0
.end method

.method public c()Ln80$e;
    .locals 1

    .line 1
    iget-object v0, p0, Ls80$a;->a:Ln80$e;

    return-object v0
.end method

.method public d()Lokio/Source;
    .locals 1

    .line 1
    iget-object v0, p0, Ls80$a;->c:Lokio/Source;

    return-object v0
.end method
