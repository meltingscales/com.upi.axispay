.class public Lt80;
.super Ls80;
.source "AxisPay"


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls80;-><init>()V

    .line 2
    iput-object p1, p0, Lt80;->a:Landroid/content/Context;

    return-void
.end method

.method public static j(Landroid/content/res/Resources;ILq80;)Landroid/graphics/Bitmap;
    .locals 3

    .line 1
    invoke-static {p2}, Ls80;->d(Lq80;)Landroid/graphics/BitmapFactory$Options;

    move-result-object v0

    .line 2
    invoke-static {v0}, Ls80;->g(Landroid/graphics/BitmapFactory$Options;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {p0, p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 4
    iget v1, p2, Lq80;->h:I

    iget v2, p2, Lq80;->i:I

    invoke-static {v1, v2, v0, p2}, Ls80;->b(IILandroid/graphics/BitmapFactory$Options;Lq80;)V

    .line 5
    :cond_0
    invoke-static {p0, p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c(Lq80;)Z
    .locals 1

    .line 1
    iget v0, p1, Lq80;->e:I

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 2
    :cond_0
    iget-object p1, p1, Lq80;->d:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    const v0, 0x9a8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(Lq80;I)Ls80$a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lt80;->a:Landroid/content/Context;

    invoke-static {p2, p1}, Lx80;->m(Landroid/content/Context;Lq80;)Landroid/content/res/Resources;

    move-result-object p2

    .line 2
    invoke-static {p2, p1}, Lx80;->l(Landroid/content/res/Resources;Lq80;)I

    move-result v0

    .line 3
    new-instance v1, Ls80$a;

    invoke-static {p2, v0, p1}, Lt80;->j(Landroid/content/res/Resources;ILq80;)Landroid/graphics/Bitmap;

    move-result-object p1

    sget-object p2, Ln80$e;->d:Ln80$e;

    invoke-direct {v1, p1, p2}, Ls80$a;-><init>(Landroid/graphics/Bitmap;Ln80$e;)V

    return-object v1
.end method
